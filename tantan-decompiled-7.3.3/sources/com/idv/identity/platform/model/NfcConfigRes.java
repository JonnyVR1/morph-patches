package com.idv.identity.platform.model;

/* JADX INFO: loaded from: classes7.dex */
public class NfcConfigRes {
    private String dateOfBirth;
    private String dateOfExpiry;
    private String documentNumber;
    private String nfcMode;

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public String getDateOfExpiry() {
        return this.dateOfExpiry;
    }

    public String getDocumentNumber() {
        return this.documentNumber;
    }

    public String getNfcMode() {
        return this.nfcMode;
    }

    public void setDateOfBirth(String str) {
        this.dateOfBirth = str;
    }

    public void setDateOfExpiry(String str) {
        this.dateOfExpiry = str;
    }

    public void setDocumentNumber(String str) {
        this.documentNumber = str;
    }

    public void setNfcMode(String str) {
        this.nfcMode = str;
    }

    public String toString() {
        return "NfcConfigRes{nfcMode='" + this.nfcMode + "', documentNumber='" + this.documentNumber + "', dateOfBirth='" + this.dateOfBirth + "', dateOfExpiry='" + this.dateOfExpiry + "'}";
    }
}
