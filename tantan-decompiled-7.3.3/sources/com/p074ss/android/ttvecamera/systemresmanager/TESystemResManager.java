package com.p074ss.android.ttvecamera.systemresmanager;

import android.content.Context;
import p153l.q6m;

/* JADX INFO: loaded from: classes11.dex */
public class TESystemResManager {

    /* JADX INFO: renamed from: a */
    private boolean f56417a = false;

    /* JADX INFO: renamed from: b */
    public q6m f56418b;

    public enum ActionType {
        UNKNOWN,
        BOOST_CPU,
        RESTORE_CPU
    }

    /* JADX INFO: renamed from: a */
    public void m82008a(Context context) {
        if (this.f56417a) {
            return;
        }
        q6m q6mVar = this.f56418b;
        if (q6mVar != null) {
            q6mVar.init(context);
        }
        this.f56417a = true;
    }

    /* JADX INFO: renamed from: b */
    public void m82009b(q6m q6mVar) {
        this.f56417a = false;
        this.f56418b = q6mVar;
    }

    /* JADX INFO: renamed from: c */
    public void m82010c(C13505a c13505a) {
        q6m q6mVar;
        if (!this.f56417a || (q6mVar = this.f56418b) == null) {
            return;
        }
        ActionType actionType = c13505a.f56419a;
        if (actionType == ActionType.BOOST_CPU) {
            q6mVar.mo122358b(c13505a.f56420b);
        } else if (actionType == ActionType.RESTORE_CPU) {
            q6mVar.mo122357a();
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.systemresmanager.TESystemResManager$a */
    public static class C13505a {

        /* JADX INFO: renamed from: a */
        public ActionType f56419a;

        /* JADX INFO: renamed from: b */
        public int f56420b;

        public C13505a(ActionType actionType) {
            this.f56420b = 0;
            this.f56419a = actionType;
        }

        public C13505a(ActionType actionType, int i) {
            this.f56419a = actionType;
            this.f56420b = i;
        }
    }
}
