package com.mj.books.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

/*Jackson
By the default Jackson needs the getters and setters for the data binding. Since we are using project lombok library we mention the getters and setters in
the annotation, otherwise we need's to explicitly provide the getters and setters in the code.
 */

@AllArgsConstructor
@Getter
public class Book {
    private String author;
    private String title;
    private String category;
}
