package org.fourthline.cling.support.messagebox.model;

import com.google.android.gms.common.api.Api;
import java.util.Random;
import org.fourthline.cling.support.messagebox.parser.MessageDOM;
import org.fourthline.cling.support.messagebox.parser.MessageDOMParser;
import org.fourthline.cling.support.messagebox.parser.MessageElement;
import org.seamless.xml.DOM;
import org.seamless.xml.ParserException;
import p149l.aag0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Message implements ElementAppender {
    private final Category category;
    private DisplayType displayType;

    /* JADX INFO: renamed from: id */
    private final int f205933id;
    protected final Random randomGenerator;

    public enum Category {
        SMS("SMS"),
        INCOMING_CALL("Incoming Call"),
        SCHEDULE_REMINDER("Schedule Reminder");

        public String text;

        Category(String str) {
            this.text = str;
        }
    }

    public enum DisplayType {
        MINIMUM("Minimum"),
        MAXIMUM("Maximum");

        public String text;

        DisplayType(String str) {
            this.text = str;
        }
    }

    public Message(int i, Category category, DisplayType displayType) {
        Random random = new Random();
        this.randomGenerator = random;
        this.f205933id = i == 0 ? random.nextInt(Api.BaseClientBuilder.API_PRIORITY_OTHER) : i;
        this.category = category;
        this.displayType = displayType;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f205933id == ((Message) obj).f205933id;
    }

    public Category getCategory() {
        return this.category;
    }

    public DisplayType getDisplayType() {
        return this.displayType;
    }

    public int getId() {
        return this.f205933id;
    }

    public int hashCode() {
        return this.f205933id;
    }

    public String toString() {
        try {
            MessageDOMParser messageDOMParser = new MessageDOMParser();
            MessageDOM messageDOM = (MessageDOM) messageDOMParser.createDocument();
            MessageElement messageElementCreateRoot = messageDOM.createRoot(messageDOMParser.createXPath(), "Message");
            messageElementCreateRoot.createChild("Category").setContent(getCategory().text);
            messageElementCreateRoot.createChild("DisplayType").setContent(getDisplayType().text);
            appendMessageElements(messageElementCreateRoot);
            return messageDOMParser.print((DOM) messageDOM, 0, false).replaceAll("<Message xmlns=\"urn:samsung-com:messagebox-1-0\">", "").replaceAll("</Message>", "");
        } catch (ParserException e) {
            aag0.m95543a(e);
            return null;
        }
    }

    public Message(Category category, DisplayType displayType) {
        this(0, category, displayType);
    }
}
