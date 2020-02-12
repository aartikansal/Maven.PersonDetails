package com.zipcodewilmington;

//import org.w3c.dom.css.Counter;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String currentPerson = "";
        // create a `counter`
        int counter=0;

        // while `counter` is less than length of array

        while(counter<personArray.length) {

                currentPerson += personArray[counter];
                counter++;

            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable

        }     // end loop
        return currentPerson;
    }




    public String forLoop() {

            String result ="";
            // identify initial value
            // identify terminal condition
            // identify increment

            // use the above clauses to declare for-loop signature
            // begin loop
        {
           for( int counter=0; counter<personArray.length; counter++)
               result += personArray[counter];



            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            // end loop
        }
         return result;
    }




    public String forEachLoop() {
        String result = "";
        String currentPerson="";

        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
        for(int counter=0; counter<personArray.length; counter++) {
            result += personArray[counter];
        }
            // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
