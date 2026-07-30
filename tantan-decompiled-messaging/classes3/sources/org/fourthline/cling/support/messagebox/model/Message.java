package org.fourthline.cling.support.messagebox.model;

import java.util.Random;
import l.aag0;
import org.fourthline.cling.support.messagebox.parser.MessageDOM;
import org.fourthline.cling.support.messagebox.parser.MessageDOMParser;
import org.fourthline.cling.support.messagebox.parser.MessageElement;
import org.seamless.xml.DOM;
import org.seamless.xml.ParserException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class Message implements ElementAppender {
    private final Category category;
    private DisplayType displayType;

    /* JADX INFO: renamed from: id */
    private final int f9558id;
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
        this.f9558id = i == 0 ? random.nextInt(Integer.MAX_VALUE) : i;
        this.category = category;
        this.displayType = displayType;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f9558id == ((Message) obj).f9558id;
    }

    public Category getCategory() {
        return this.category;
    }

    public DisplayType getDisplayType() {
        return this.displayType;
    }

    public int getId() {
        return this.f9558id;
    }

    public int hashCode() {
        return this.f9558id;
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
            aag0.a(e);
            return null;
        }
    }

    public Message(Category category, DisplayType displayType) {
        this(0, category, displayType);
    }
}
