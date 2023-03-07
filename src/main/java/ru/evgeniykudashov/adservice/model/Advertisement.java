package ru.evgeniykudashov.adservice.model;

import ru.evgeniykudashov.adservice.model.statuses.AdvertisementStatus;

public class Advertisement {

    private long advertisementId;
    private long userId;

    private String name;
    private String description;

    private Category category;

    private AdvertisementStatus advertisementStatus;
    private String address;

}
