package com.paslasks.creditcard.creditcard.beans;

import lombok.AllArgsConstructor;

import lombok.extern.slf4j.Slf4j;



@Slf4j
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreditCard {
    private String creditCardNumber;
}
