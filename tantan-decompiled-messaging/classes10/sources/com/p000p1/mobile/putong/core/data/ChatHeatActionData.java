package com.p000p1.mobile.putong.core.data;

import l.j760;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ChatHeatActionData {
    ExclusiveAction action;
    j760<String, Object>[] params;
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

    public ChatHeatActionData(String str, ExclusiveAction exclusiveAction, boolean z, j760<String, Object>... j760VarArr) {
        this.userId = str;
        this.action = exclusiveAction;
        this.responseSuccess = z;
        this.params = j760VarArr;
    }

    public j760<String, Object>[] getParams() {
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
