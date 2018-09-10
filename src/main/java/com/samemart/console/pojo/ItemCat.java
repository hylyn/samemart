package com.samemart.console.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 商品类目类
 * @author htan4
 *
 */
//添加JPA注解
@Table(name = "sm_item_cat")
public class ItemCat extends BasePojo {

	//设置主键
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //父类目ID=0时，代表的是一级的类目
    private Long parentId;

    //类目的名字
    private String name;
    
    //tree组件只有text, 没有name，可省略
    //private String text;
    
    //为了EasyUI的tree组件的显示，添加text属性
    public String getText() {
		//return text; 改成this.getName()方法
    	return this.getName();
	}

    //set方法可省略
//	public void setText(String text) {
//		this.text = text;
//	}
    
    //扩展getState()方法，tree组件永远显示文件夹还是文件, closed:文件夹，open:文件
    public String getState() {
    	return this.getIsParent()?"closed":"open";
    }
    

	//状态。可选值:1(正常),2(删除)
    private Integer status;

    //排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
    private Integer sortOrder;

    //该类目是否为父类目，1为true，0为false
    private Boolean isParent;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Boolean getIsParent() {
        return isParent;
    }

    public void setIsParent(Boolean isParent) {
        this.isParent = isParent;
    }

}
