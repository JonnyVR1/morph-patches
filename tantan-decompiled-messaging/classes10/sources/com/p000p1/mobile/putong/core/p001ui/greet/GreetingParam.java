package com.p000p1.mobile.putong.core.p001ui.greet;

import com.p000p1.mobile.putong.core.data.Greeting;
import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class GreetingParam implements Serializable {
    boolean finishForReport;
    String from;
    Greeting greetInfo;
    boolean hasCreatedGreeting = true;
    int hotLevel;
    boolean isStartHomeCard;
    String preSendMsg;
    String recommendReason;
    String stateId;

    public String getFrom() {
        return this.from;
    }

    public String getStateId() {
        return this.stateId;
    }
}
