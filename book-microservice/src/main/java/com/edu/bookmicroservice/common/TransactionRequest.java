package com.edu.bookmicroservice.common;

import com.edu.bookmicroservice.model.Book;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionRequest {
    private Book book;
    private Issuer issuer;
}
