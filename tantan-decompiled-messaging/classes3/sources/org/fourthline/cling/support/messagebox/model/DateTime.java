package org.fourthline.cling.support.messagebox.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.eclipse.jetty.http.HttpHeaders;
import org.fourthline.cling.support.messagebox.parser.MessageElement;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DateTime implements ElementAppender {
    private final String date;
    private final String time;

    public DateTime() {
        this(getCurrentDate(), getCurrentTime());
    }

    public static String getCurrentDate() {
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }

    public static String getCurrentTime() {
        return new SimpleDateFormat("HH:mm:ss").format(new Date());
    }

    @Override // org.fourthline.cling.support.messagebox.model.ElementAppender
    public void appendMessageElements(MessageElement messageElement) {
        messageElement.createChild(HttpHeaders.DATE).setContent(getDate());
        messageElement.createChild("Time").setContent(getTime());
    }

    public String getDate() {
        return this.date;
    }

    public String getTime() {
        return this.time;
    }

    public DateTime(String str, String str2) {
        this.date = str;
        this.time = str2;
    }
}
