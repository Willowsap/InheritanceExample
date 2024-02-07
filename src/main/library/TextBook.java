package library;

/**
 * A representation of a textbook.
 * 
 * @author Willow Sapphire
 * @version 02/05/2024
 */
public class TextBook extends Book
{
    /**
     * The textbook subject.
     */
    private String subject;

    /**
     * Constructs a new ComicBook object.
     * 
     * @param title the title of the comic book.
     * @param author the author of the comic book.
     * @param numPages the number of pages in the comic book.
     */
    public TextBook(String title, String author, String subject, int numPages)
    {
        super(title, author, numPages);
        this.subject = subject;
    }

    /**
     * Getter for the textbook's subject.
     * 
     * @return the subject of the textbook.
     */
    public String getSubject()
    {
        return subject;
    }

    /**
     * Setter for the textbook's subject.
     * 
     * @param subject the subject of the textbook.
     */
    public void setSubject(String subject)
    {
        this.subject = subject;
    }

    @Override
    public void read()
    {
        System.out.println("Reading book with dense text");
    }

    @Override
    public void skim()
    {
        System.out.println("Quickly reading over some convoluded text");
    }
}
