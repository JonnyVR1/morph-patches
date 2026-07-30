package org.seamless.util.mail;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class Email {
    protected String html;
    protected String plaintext;
    protected String recipient;
    protected String sender;
    protected String subject;

    public Email(String str, String str2, String str3, String str4, String str5) {
        this.sender = str;
        this.recipient = str2;
        this.subject = str3;
        this.plaintext = str4;
        this.html = str5;
    }

    public String getHtml() {
        return this.html;
    }

    public String getPlaintext() {
        return this.plaintext;
    }

    public String getRecipient() {
        return this.recipient;
    }

    public String getSender() {
        return this.sender;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setHtml(String str) {
        this.html = str;
    }

    public void setPlaintext(String str) {
        this.plaintext = str;
    }

    public void setRecipient(String str) {
        this.recipient = str;
    }

    public void setSender(String str) {
        this.sender = str;
    }

    public void setSubject(String str) {
        this.subject = str;
    }

    public Email(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, null);
    }
}
