package chap06;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

class Book {
    private String title;
    private double price;
    private Integer x;
    private Integer y;
    private Integer z;

    Book() {
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    Book(String title, double price, Integer x, Integer y, Integer z) {
        this.title = title;
        this.price = price;
        this.x = x;
        this.y = y;
        this.z = z;
    }
    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }
    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }
    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.title+" "+this.price+" "+this.x+" "+ this.y+" "+this.z;
    }
}

class FileImport {

    public static void main(final String[] args) {
        String row = "";
        String filePath = new File("").getAbsolutePath();
        //String filePath = new File("book_sample.csv").getAbsolutePath();
        try {
            BufferedReader csvReader;
            csvReader = new BufferedReader(new FileReader(filePath.concat("/book_sample.csv")));
            
            while ((row = csvReader.readLine()) != null) {
                String[] data = row.split(",");
                System.out.println(data[0].toString());
            }
            csvReader.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}