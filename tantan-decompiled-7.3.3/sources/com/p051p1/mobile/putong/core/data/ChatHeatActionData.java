package com.p051p1.mobile.putong.core.data;

import p153l.pf60;

/* JADX INFO: loaded from: classes10.dex */
public class ChatHeatActionData {
    ExclusiveAction action;
    pf60<String, Object>[] params;
    boolean responseSuccess;
    Throwable throwable;
    public String userId;

    public enum ExclusiveAction {
        CHECK("check"),
        ENTER_CHECK("check"),
        INVITE("invite"),
        ACCEPT("accept"),
        CANCEL("cancel"),
        SPECIAL_REMIND("setSpecialRemind");

        String action;

        ExclusiveAction(String str) {
            this.action = str;
        }

        public String getAction() {
            return this.action;
        }
    }

    public ChatHeatActionData(String str, ExclusiveAction exclusiveAction, boolean z, pf60<String, Object>... pf60VarArr) {
        this.userId = str;
        this.action = exclusiveAction;
        this.responseSuccess = z;
        this.params = pf60VarArr;
    }

    public pf60<String, Object>[] getParams() {
        return this.params;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    public ExclusiveAction getType() {
        return this.action;
    }

    public boolean isSuccess() {
        return this.responseSuccess;
    }

    public void setThrowable(Throwable th) {
        this.throwable = th;
    }
}
