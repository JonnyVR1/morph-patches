package org.fourthline.cling.model.meta;

import java.net.URI;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ManufacturerDetails {
    private String manufacturer;
    private URI manufacturerURI;

    public ManufacturerDetails(String str, String str2) throws IllegalArgumentException {
        this.manufacturer = str;
        this.manufacturerURI = URI.create(str2);
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public URI getManufacturerURI() {
        return this.manufacturerURI;
    }

    public ManufacturerDetails(String str) {
        this.manufacturer = str;
    }

    public ManufacturerDetails(URI uri) {
        this.manufacturerURI = uri;
    }

    public ManufacturerDetails(String str, URI uri) {
        this.manufacturer = str;
        this.manufacturerURI = uri;
    }

    public ManufacturerDetails() {
    }
}
