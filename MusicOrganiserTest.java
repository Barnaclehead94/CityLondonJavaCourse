import java.util.ArrayList;

public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    private int x;
    private int y;

    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<String>();
    }

    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }

    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }

    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            files.remove(index);
        }
    }

    public void multiplesOfFive() // display all multiples of 5 from 10 to 95
    {
        x = 10;
        y = 95;
        while(x <= y)
        {
            System.out.println(x);
            x += 5;
        }
    }

    public void findFirst(String searchString) // shows where song is in array
    {
        int index = 0;

        for(String file: files)
        {
            String filename = files.get(index);
            if(filename.contains(searchString))
            {
                System.out.println("The first matching file is at: " + index);

            }
            index ++;

        }
    }

    public void listAllMusic() // lists all songs by track no.
    {
        int index = 0;
        for(String file: files)
        {
            System.out.println(index + ": " + file);
            index ++;
        }

    }

}

    
