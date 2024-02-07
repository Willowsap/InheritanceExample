package library;

/**
 * A representation of a comic book.
 * 
 * @author Willow Sapphire
 * @version 02/05/2024
 */
public class ComicBook extends Book
{
    /**
     * Constructs a new ComicBook object.
     * 
     * @param title the title of the comic book.
     * @param author the author of the comic book.
     * @param numPages the number of pages in the comic book.
     */
    public ComicBook(String title, String author, int numPages)
    {
        super(title, author, numPages);
    }

    @Override
    public void read()
    {
        System.out.println("Reading book with images");
    }

    @Override
    public void skim()
    {
        System.out.println("Quickly reading some images");
    }
}
