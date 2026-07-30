package org.fourthline.cling.model.message.control;

/* JADX INFO: loaded from: classes3.dex */
public interface ActionMessage {
    String getActionNamespace();

    String getBodyString();

    boolean isBodyNonEmptyString();

    void setBody(String str);
}
