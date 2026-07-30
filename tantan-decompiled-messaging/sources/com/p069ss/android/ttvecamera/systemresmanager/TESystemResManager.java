package com.p069ss.android.ttvecamera.systemresmanager;

import android.content.Context;
import p149l.a4m;

/* JADX INFO: loaded from: classes11.dex */
public class TESystemResManager {

    /* JADX INFO: renamed from: a */
    private boolean f55569a = false;

    /* JADX INFO: renamed from: b */
    public a4m f55570b;

    public enum ActionType {
        UNKNOWN,
        BOOST_CPU,
        RESTORE_CPU
    }

    /* JADX INFO: renamed from: a */
    public void m80825a(Context context) {
        if (this.f55569a) {
            return;
        }
        a4m a4mVar = this.f55570b;
        if (a4mVar != null) {
            a4mVar.init(context);
        }
        this.f55569a = true;
    }

    /* JADX INFO: renamed from: b */
    public void m80826b(a4m a4mVar) {
        this.f55569a = false;
        this.f55570b = a4mVar;
    }

    /* JADX INFO: renamed from: c */
    public void m80827c(C13342a c13342a) {
        a4m a4mVar;
        if (!this.f55569a || (a4mVar = this.f55570b) == null) {
            return;
        }
        ActionType actionType = c13342a.f55571a;
        if (actionType == ActionType.BOOST_CPU) {
            a4mVar.mo94924b(c13342a.f55572b);
        } else if (actionType == ActionType.RESTORE_CPU) {
            a4mVar.mo94923a();
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.systemresmanager.TESystemResManager$a */
    public static class C13342a {

        /* JADX INFO: renamed from: a */
        public ActionType f55571a;

        /* JADX INFO: renamed from: b */
        public int f55572b;

        public C13342a(ActionType actionType) {
            this.f55572b = 0;
            this.f55571a = actionType;
        }

        public C13342a(ActionType actionType, int i) {
            this.f55571a = actionType;
            this.f55572b = i;
        }
    }
}
