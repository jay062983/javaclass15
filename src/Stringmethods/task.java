package Stringmethods;

public class task {
    /* create a method createEmail().Based on the values of username,lastname and email type
    * your method should return complete email address.
    * example: createEmail(John,snow,gmail)-->johnsnow@gmail.com
    * return type=> String
    * name=>createEmail
    * parameter=> String firstname String lastname String emailType
    * {
    * concat
    * }
     */

String createEmail(String firstname,String lastname,String emailtype){
    return firstname+lastname+"@"+emailtype+".com";

}
}
