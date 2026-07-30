package org.fourthline.cling.support.messagebox.model;

import org.fourthline.cling.support.messagebox.parser.MessageElement;

/* JADX INFO: loaded from: classes3.dex */
public class MessageIncomingCall extends Message {
    private final DateTime callTime;
    private final NumberName callee;
    private final NumberName caller;

    public MessageIncomingCall(Message.DisplayType displayType, DateTime dateTime, NumberName numberName, NumberName numberName2) {
        super(Message.Category.INCOMING_CALL, displayType);
        this.callTime = dateTime;
        this.callee = numberName;
        this.caller = numberName2;
    }

    @Override // org.fourthline.cling.support.messagebox.model.ElementAppender
    public void appendMessageElements(MessageElement messageElement) {
        getCallTime().appendMessageElements(messageElement.createChild("CallTime"));
        getCallee().appendMessageElements(messageElement.createChild("Callee"));
        getCaller().appendMessageElements(messageElement.createChild("Caller"));
    }

    public DateTime getCallTime() {
        return this.callTime;
    }

    public NumberName getCallee() {
        return this.callee;
    }

    public NumberName getCaller() {
        return this.caller;
    }

    public MessageIncomingCall(DateTime dateTime, NumberName numberName, NumberName numberName2) {
        this(Message.DisplayType.MAXIMUM, dateTime, numberName, numberName2);
    }

    public MessageIncomingCall(NumberName numberName, NumberName numberName2) {
        this(new DateTime(), numberName, numberName2);
    }
}
