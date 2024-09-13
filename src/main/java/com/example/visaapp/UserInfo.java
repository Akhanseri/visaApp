package com.example.visaapp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class UserInfo {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String familyName;
    private String homeAddress;
    private String postCode;
    private String organisationCity;
    private String groupName;
    private String groupType;
    private String groupId;
    private String organisation;
}
