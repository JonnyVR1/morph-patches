package com.p008ss.android.ttvecamera.systemresmanager;

import android.content.Context;
import p009l.a4m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class TESystemResManager {

    /* JADX INFO: renamed from: a */
    private boolean f9175a = false;

    /* JADX INFO: renamed from: b */
    public a4m f9176b;

    public enum ActionType {
        UNKNOWN,
        BOOST_CPU,
        RESTORE_CPU
    }

    /* JADX INFO: renamed from: a */
    public void m11176a(Context context) {
        if (this.f9175a) {
            return;
        }
        a4m a4mVar = this.f9176b;
        if (a4mVar != null) {
            a4mVar.init(context);
        }
        this.f9175a = true;
    }

    /* JADX INFO: renamed from: b */
    public void m11177b(a4m a4mVar) {
        this.f9175a = false;
        this.f9176b = a4mVar;
    }

    /* JADX INFO: renamed from: c */
    public void m11178c(C0744a c0744a) {
        a4m a4mVar;
        if (!this.f9175a || (a4mVar = this.f9176b) == null) {
            return;
        }
        ActionType actionType = c0744a.f9177a;
        if (actionType == ActionType.BOOST_CPU) {
            a4mVar.mo11190b(c0744a.f9178b);
        } else if (actionType == ActionType.RESTORE_CPU) {
            a4mVar.mo11189a();
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.systemresmanager.TESystemResManager$a */
    public static class C0744a {

        /* JADX INFO: renamed from: a */
        public ActionType f9177a;

        /* JADX INFO: renamed from: b */
        public int f9178b;

        public C0744a(ActionType actionType) {
            this.f9178b = 0;
            this.f9177a = actionType;
        }

        public C0744a(ActionType actionType, int i) {
            this.f9177a = actionType;
            this.f9178b = i;
        }
    }
}
