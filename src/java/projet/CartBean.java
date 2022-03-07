/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.util.Hashtable;


/**
 *
 * @author xplo
 */
public class CartBean {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    private Hashtable<Article, Integer> articles = new Hashtable();
    
    private Integer itemNumber;
    

    /**
     * Get the value of itemNumber
     *
     * @return the value of itemNumber
     */
    public Integer getItemNumber() {
        return itemNumber;
    }

    /**
     * Set the value of itemNumber
     *
     * @param itemNumber new value of itemNumber
     */
    public void setItemNumber(Integer itemNumber) {
        this.itemNumber = itemNumber;
    }

    
    public Hashtable<Article, Integer> getArticles(){
        return (articles);
    }
    
    public void addArticle(Article a){
        
            if (!articles.containsKey(a))
                articles.put(a, 1);
            else
                articles.put(a, articles.get(a)+1);
    }

}
