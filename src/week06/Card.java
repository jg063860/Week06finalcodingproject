package week06;

public class Card {


private int value;
private String name;

public Card(int newValue, String suit) {

    value = newValue;

    switch(newValue) {
        case 2: suit = "Two";
            break;
        case 3: suit = "Three";
            break;
        case 4: suit = "Four";
            break;
        case 5: suit = "Five";
            break;
        case 6: suit = "Six";
            break;
        case 7: suit = "Seven";
            break;
        case 8: suit = "Eight";
            break;
        case 9: suit = "Nine";
            break;
        case 10: suit = "Ten";
            break;
        case 11: suit = "Jack";
            break;
        case 12: suit = "Queen";
            break;
        case 13: suit = "King";
            break;
        case 14: suit = "Ace";
            break;
    }

    name += " of " + suit;

}

public int getValue() {
    return value;
}

public void setValue(int value) {
    this.value = value;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
    
}


public void describe() {
    System.out.println(this.toString() + "\n");


}
}

