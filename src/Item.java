import java.util.Objects;

/**
 * Created by lumia on 2017/3/23.
 */
public class Item implements Comparable<Item> {
    private String description;
    private int partNumber;

    /**
     * Constructs an item.
     *
     * @param aDescription the item's description
     * @param aPartNumber  the item's part number
     */
    public Item(String aDescription, int aPartNumber) {
        description = aDescription;
        partNumber = aPartNumber;

    }

    /**
     * Gets the description of this item.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    public String toString() {
        return "[description=" + description + ", part number=" + partNumber + "]";
    }

    public boolean equals(Object otherObjectr) {
        if (this == otherObjectr) return true;
        if (otherObjectr == null) return false;
        if (getClass() != otherObjectr.getClass()) return false;
        Item other = (Item) otherObjectr;
        return Objects.equals(description, other.description) && partNumber == other.partNumber;
    }

    public int hashCode() {
        return Objects.hash(description, partNumber);
    }

    public int compareTo(Item other) {
        int diff = Integer.compare(partNumber, other.partNumber);
        return diff != 0 ? diff : description.compareTo(other.description);
    }
}
