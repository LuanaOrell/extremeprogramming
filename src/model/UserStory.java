package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LuLu
 */
public class UserStory {
    private String titleStory;
    private String description;
    private String accepCriteria;
    private int priority;
    private int complexity;

    public UserStory(String titleStory) {
        this.titleStory = titleStory;
    }

    public UserStory(String titleStory, String description, int priority, int complexity) {
        this.titleStory = titleStory;
        this.description = description;
        this.priority = priority;
        this.complexity = complexity;
    }

    public UserStory(String titleStory, String description, String accepCriteria, int priority, int complexity) {
        this.titleStory = titleStory;
        this.description = description;
        this.accepCriteria = accepCriteria;
        this.priority = priority;
        this.complexity = complexity;
    }

    public String getTitleStory() {
        return titleStory;
    }

    public void setTitleStory(String titleStory) {
        this.titleStory = titleStory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAccepCriteria() {
        return accepCriteria;
    }

    public void setAccepCriteria(String accepCriteria) {
        this.accepCriteria = accepCriteria;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getComplexity() {
        return complexity;
    }

    public void setComplexity(int complexity) {
        this.complexity = complexity;
    }
    
    

}
