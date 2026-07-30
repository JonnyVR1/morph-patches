package com.tencent.could.huiyansdk.turing;

import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.could.huiyansdk.api.C13880j;
import com.tencent.could.huiyansdk.api.InterfaceC13872b;
import com.tencent.could.huiyansdk.callback.InterfaceC13885d;
import com.tencent.could.huiyansdk.common.C13887a;
import com.tencent.could.huiyansdk.entity.TuringResultCacheEntity;
import com.tencent.could.huiyansdk.enums.AuthState;
import com.tencent.could.huiyansdk.manager.C13902b;
import com.tencent.could.huiyansdk.manager.C13905e;
import com.tencent.could.huiyansdk.manager.C13906f;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.turing.f */
/* JADX INFO: loaded from: classes2.dex */
public class C13924f {

    /* JADX INFO: renamed from: f */
    public TuringResultCacheEntity f57487f;

    /* JADX INFO: renamed from: g */
    public volatile AbstractC13920b f57488g;

    /* JADX INFO: renamed from: h */
    public C13906f f57489h;

    /* JADX INFO: renamed from: i */
    public InterfaceC13885d f57490i;

    /* JADX INFO: renamed from: l */
    public HandlerThread f57493l;

    /* JADX INFO: renamed from: m */
    public volatile Handler f57494m;

    /* JADX INFO: renamed from: n */
    public long f57495n;

    /* JADX INFO: renamed from: a */
    public long f57482a = 3000;

    /* JADX INFO: renamed from: b */
    public volatile boolean f57483b = false;

    /* JADX INFO: renamed from: c */
    public volatile boolean f57484c = false;

    /* JADX INFO: renamed from: d */
    public boolean f57485d = false;

    /* JADX INFO: renamed from: e */
    public boolean f57486e = false;

    /* JADX INFO: renamed from: j */
    public boolean f57491j = false;

    /* JADX INFO: renamed from: k */
    public volatile boolean f57492k = false;

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.turing.f$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C13924f f57496a = new C13924f();
    }

    /* JADX INFO: renamed from: a */
    public static void m82380a(C13924f c13924f, boolean z) {
        c13924f.m82385d();
        long jCurrentTimeMillis = System.currentTimeMillis() - c13924f.f57495n;
        if (z) {
            String str = "" + jCurrentTimeMillis;
            InterfaceC13872b interfaceC13872b = C13880j.a.f57352a.f57348g;
            if (interfaceC13872b != null) {
                interfaceC13872b.onBuriedPointCallBack("AuthCheckStage", "GetTuringTokenTimeOut", str);
                return;
            }
            return;
        }
        String str2 = "" + jCurrentTimeMillis;
        InterfaceC13872b interfaceC13872b2 = C13880j.a.f57352a.f57348g;
        if (interfaceC13872b2 != null) {
            interfaceC13872b2.onBuriedPointCallBack("AuthCheckStage", "GetTuringTokenSuccess", str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m82383b() {
        if (this.f57494m == null) {
            return;
        }
        this.f57494m.removeMessages(3);
        this.f57494m.removeMessages(5);
        this.f57494m.removeMessages(3);
        this.f57494m.removeMessages(4);
        this.f57494m = null;
        HandlerThread handlerThread = this.f57493l;
        if (handlerThread == null || !handlerThread.isAlive()) {
            return;
        }
        this.f57493l.quitSafely();
    }

    /* JADX INFO: renamed from: c */
    public final void m82384c() {
        this.f57488g = (AbstractC13920b) EmptyTuringHelper.class.newInstance();
        this.f57491j = true;
        C13905e c13905e = C13905e.a.f57445a;
        StringBuilder sb = new StringBuilder("real init turing: ");
        sb.append(this.f57491j);
        sb.append(", ");
        sb.append(this.f57488g == null);
        sb.append(", [turing version]: ");
        sb.append(m82382a());
        c13905e.m82337a(1, "TuringSdkHelper", sb.toString());
    }

    /* JADX INFO: renamed from: d */
    public final void m82385d() {
        C13905e.a.f57445a.m82337a(2, "TuringSdkHelper", "get turing face result and remove time out event!");
        if (this.f57494m != null) {
            this.f57494m.removeMessages(5);
        }
    }

    /* JADX INFO: renamed from: a */
    public String m82382a() {
        if (this.f57491j && this.f57488g != null) {
            ((EmptyTuringHelper) this.f57488g).getClass();
            return "";
        }
        C13905e.a.f57445a.m82337a(2, "TuringSdkHelper", "get version, turing is not create!");
        return "";
    }

    /* JADX INFO: renamed from: a */
    public static void m82379a(C13924f c13924f) {
        c13924f.getClass();
        if (C13887a.a.f57364a.f57361d) {
            return;
        }
        C13902b.b.f57433a.m82328a(AuthState.START_GET_LIVE_TYPE, (Object) null);
    }
}
