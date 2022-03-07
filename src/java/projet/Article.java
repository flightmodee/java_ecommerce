/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

/**
 *
 * @author xplo
 */
public class Article {
    
    private String name;
    
    private Integer price;

    /**
     * Get the value of price
     *
     * @return the value of price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * Set the value of price
     *
     * @param price new value of price
     */
    public void setPrice(Integer price) {
        this.price = price;
    }


    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Article)) {
            return false;
        } else {
            Article a = (Article)obj;
            return (this.name.equals(a.name) &&
                this.price == a.price);
        }   
    }
    
    @Override
    public int hashCode() {
        int hash = this.name.hashCode();
        hash = hash * 31 + this.price;
        return hash;
    }

}
