package com.idv.identity.platform.model;

/* JADX INFO: loaded from: classes7.dex */
public class IDCardOcrResult {
    public String BizCode;
    public String BizMessage;
    public OcrResult ocrResult;

    public static class OcrResult {
        public String address;
        public String birthDate;
        public String blood;
        public String city;
        public String countryCode;
        public String county;
        public String crn;
        public String currentIssueDate;
        public String district;
        public String englishName;
        public String ethnicity;
        public String expiryDate;
        public String firstIssueDate;
        public String givenname;
        public String givennameCN;
        public String idNumber;
        public String isPermanent;
        public String issueDate;
        public String job;
        public String marriage;
        public String middlename;
        public String name;
        public String nameCode;
        public String nationality;
        public String originOfIssue;
        public String passportNo;
        public String placeOfBirth;
        public String placeOfIssue;
        public String province;
        public String religion;
        public String sex;
        public String street;
        public String surname;
        public String surnameCN;
        public String symbols;
    }

    public String getBizCode() {
        return this.BizCode;
    }

    public String getBizMessage() {
        return this.BizMessage;
    }

    public OcrResult getOcrResult() {
        return this.ocrResult;
    }

    public boolean isOCRError() {
        if (isValid()) {
            return "CODE_OCR_FAILED".equalsIgnoreCase(this.BizCode);
        }
        return false;
    }

    public boolean isOCRPictureQualityNotGood() {
        if (isValid()) {
            return "CODE_OCR_FAILED_COMPLIANCE".equalsIgnoreCase(this.BizCode);
        }
        return false;
    }

    public boolean isOCRSuccess() {
        if (isValid()) {
            return "CODE_OCR_SUCCESS".equalsIgnoreCase(this.BizCode);
        }
        return false;
    }

    public boolean isOCRTypeError() {
        if (isValid()) {
            return "CODE_OCR_WRONG_CARD".equalsIgnoreCase(this.BizCode);
        }
        return false;
    }

    public boolean isValid() {
        return true;
    }
}
