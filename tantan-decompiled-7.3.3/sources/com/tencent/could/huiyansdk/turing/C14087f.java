package com.tencent.could.huiyansdk.turing;

import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.could.huiyansdk.api.C14043j;
import com.tencent.could.huiyansdk.api.InterfaceC14035b;
import com.tencent.could.huiyansdk.callback.InterfaceC14048d;
import com.tencent.could.huiyansdk.common.C14050a;
import com.tencent.could.huiyansdk.entity.TuringResultCacheEntity;
import com.tencent.could.huiyansdk.enums.AuthState;
import com.tencent.could.huiyansdk.manager.C14065b;
import com.tencent.could.huiyansdk.manager.C14068e;
import com.tencent.could.huiyansdk.manager.C14069f;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.turing.f */
/* JADX INFO: loaded from: classes12.dex */
public class C14087f {

    /* JADX INFO: renamed from: f */
    public TuringResultCacheEntity f58335f;

    /* JADX INFO: renamed from: g */
    public volatile AbstractC14083b f58336g;

    /* JADX INFO: renamed from: h */
    public C14069f f58337h;

    /* JADX INFO: renamed from: i */
    public InterfaceC14048d f58338i;

    /* JADX INFO: renamed from: l */
    public HandlerThread f58341l;

    /* JADX INFO: renamed from: m */
    public volatile Handler f58342m;

    /* JADX INFO: renamed from: n */
    public long f58343n;

    /* JADX INFO: renamed from: a */
    public long f58330a = 3000;

    /* JADX INFO: renamed from: b */
    public volatile boolean f58331b = false;

    /* JADX INFO: renamed from: c */
    public volatile boolean f58332c = false;

    /* JADX INFO: renamed from: d */
    public boolean f58333d = false;

    /* JADX INFO: renamed from: e */
    public boolean f58334e = false;

    /* JADX INFO: renamed from: j */
    public boolean f58339j = false;

    /* JADX INFO: renamed from: k */
    public volatile boolean f58340k = false;

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.turing.f$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C14087f f58344a = new C14087f();
    }

    /* JADX INFO: renamed from: a */
    public static void m83563a(C14087f c14087f, boolean z) {
        c14087f.m83568d();
        long jCurrentTimeMillis = System.currentTimeMillis() - c14087f.f58343n;
        if (z) {
            String str = "" + jCurrentTimeMillis;
            InterfaceC14035b interfaceC14035b = C14043j.a.f58200a.f58196g;
            if (interfaceC14035b != null) {
                interfaceC14035b.onBuriedPointCallBack("AuthCheckStage", "GetTuringTokenTimeOut", str);
                return;
            }
            return;
        }
        String str2 = "" + jCurrentTimeMillis;
        InterfaceC14035b interfaceC14035b2 = C14043j.a.f58200a.f58196g;
        if (interfaceC14035b2 != null) {
            interfaceC14035b2.onBuriedPointCallBack("AuthCheckStage", "GetTuringTokenSuccess", str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m83566b() {
        if (this.f58342m == null) {
            return;
        }
        this.f58342m.removeMessages(3);
        this.f58342m.removeMessages(5);
        this.f58342m.removeMessages(3);
        this.f58342m.removeMessages(4);
        this.f58342m = null;
        HandlerThread handlerThread = this.f58341l;
        if (handlerThread == null || !handlerThread.isAlive()) {
            return;
        }
        this.f58341l.quitSafely();
    }

    /* JADX INFO: renamed from: c */
    public final void m83567c() {
        this.f58336g = (AbstractC14083b) EmptyTuringHelper.class.newInstance();
        this.f58339j = true;
        C14068e c14068e = C14068e.a.f58293a;
        StringBuilder sb = new StringBuilder("real init turing: ");
        sb.append(this.f58339j);
        sb.append(", ");
        sb.append(this.f58336g == null);
        sb.append(", [turing version]: ");
        sb.append(m83565a());
        c14068e.m83520a(1, "TuringSdkHelper", sb.toString());
    }

    /* JADX INFO: renamed from: d */
    public final void m83568d() {
        C14068e.a.f58293a.m83520a(2, "TuringSdkHelper", "get turing face result and remove time out event!");
        if (this.f58342m != null) {
            this.f58342m.removeMessages(5);
        }
    }

    /* JADX INFO: renamed from: a */
    public String m83565a() {
        if (this.f58339j && this.f58336g != null) {
            ((EmptyTuringHelper) this.f58336g).getClass();
            return "";
        }
        C14068e.a.f58293a.m83520a(2, "TuringSdkHelper", "get version, turing is not create!");
        return "";
    }

    /* JADX INFO: renamed from: a */
    public static void m83562a(C14087f c14087f) {
        c14087f.getClass();
        if (C14050a.a.f58212a.f58209d) {
            return;
        }
        C14065b.b.f58281a.m83511a(AuthState.START_GET_LIVE_TYPE, (Object) null);
    }
}
