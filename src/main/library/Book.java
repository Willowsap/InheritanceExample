package library;

import java.util.ArrayList;

/**
 * A generic book class.
 * 
 * @author Willow Sapphire
 * @version 02/05/2024
 */
public abstract class Book implements Cloneable, Readable
{
    private ArrayList<String> owners;

    /**
     * The title of the book.
     */
    private String title;

    /**
     * The author of the book.
     */
    private String author;

    /**
     * The number of pages in the book.
     */
    private int numPages;

    /**
     * Constructs a new book object.
     * 
     * @param title the title of the book.
     * @param author the author of the book.
     * @param numPages the number of pages in the book.
     */
    public Book(String title, String author, int numPages)
    {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
        this.owners = new ArrayList<>();
    }

    /**
     * Getter for the book's number of pages.
     * 
     * @return the number of pages in the book.
     */
    public int getNumPages()
    {
        return numPages;
    }

    /**
     * Getter for the book's title.
     * 
     * @return the title of the book.
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Getter for the book's author.
     * 
     * @return the author of the book.
     */
    public String getAuthor()
    {
        return author;
    }

    /**
     * Setter for the book's number of pages.
     * 
     * @param numPages the number of pages in the book.
     */
    public void setNumPages(int numPages)
    {
        this.numPages = numPages;
    }

    /**
     * Setter for the book's title.
     * 
     * @param title the title of the book.
     */
    public void setTitle(String title)
    {
        this.title = title;
    }

    /**
     * Setter for the book's author.
     * 
     * @param author the author of the book.
     */
    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void addOwner(String owner)
    {
        this.owners.add(owner);
    }

    public void setOwner(String owner, int ownerIndex)
    {
        this.owners.set(ownerIndex, owner);
    }

    public String getOwner(int ownerIndex)
    {
        return this.owners.get(ownerIndex);
    }

    @Override
    public boolean equals(Object o)
    {
        if (o instanceof Book)
        {
            Book other = (Book) o;
            return this.title.equals(other.getTitle())
                && this.author.equals(other.getAuthor());
        }
        return false;
    }

    @Override
    public String toString()
    {
        return String.format("%s by %s", title, author);
    }

    @Override
    public Book clone()
    {
        Book copy;
        try
        {
            copy = (Book) super.clone();
            copy.owners = new ArrayList<>();
            for (int i = 0; i < owners.size(); i++)
            {
                copy.owners.add(this.owners.get(i));
            }
        }
        catch (CloneNotSupportedException e)
        {
            throw new RuntimeException("Class does not implement cloneable");
        }
        return copy;
    }
}