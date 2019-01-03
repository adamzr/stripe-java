package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SourceTypeMultibanco extends StripeObject {
  String entity;

  String reference;

  String refundAccountHolderAddressCity;

  String refundAccountHolderAddressCountry;

  String refundAccountHolderAddressLine1;

  String refundAccountHolderAddressLine2;

  String refundAccountHolderAddressPostalCode;

  String refundAccountHolderAddressState;

  String refundAccountHolderName;

  String refundIban;
}