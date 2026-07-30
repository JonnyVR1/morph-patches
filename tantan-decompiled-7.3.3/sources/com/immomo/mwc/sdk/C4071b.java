package com.immomo.mwc.sdk;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.immomo.mwc.sdk.exception.MWCException;
import com.quickjs.JSContext;
import com.quickjs.QuickJS;
import com.quickjs.QuickJSException;
import java.io.Closeable;
import java.util.LinkedHashMap;
import org.json.JSONObject;
import p153l.d2j0;
import p153l.ef00;
import p153l.jrq;
import p153l.lmq;
import p153l.ro5;
import p153l.rre0;
import p153l.xx5;
import p153l.y84;
import p153l.z84;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: com.immomo.mwc.sdk.b */
/* JADX INFO: loaded from: classes7.dex */
public final class C4071b implements Closeable {

    /* JADX INFO: renamed from: g */
    private static int f14711g;

    /* JADX INFO: renamed from: c */
    private final HandlerThread f14714c;

    /* JADX INFO: renamed from: d */
    private final Handler f14715d;

    /* JADX INFO: renamed from: a */
    private QuickJS f14712a = null;

    /* JADX INFO: renamed from: b */
    private JSContext f14713b = null;

    /* JADX INFO: renamed from: e */
    private boolean f14716e = false;

    /* JADX INFO: renamed from: f */
    private final LinkedHashMap<EventType, Object> f14717f = new LinkedHashMap<>();

    /* JADX INFO: renamed from: com.immomo.mwc.sdk.b$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f14718a;

        static {
            int[] iArr = new int[EventType.values().length];
            f14718a = iArr;
            try {
                iArr[EventType.MK_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14718a[EventType.MK_DESTROY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private C4071b() {
        StringBuilder sb = new StringBuilder("mwc-runtime-");
        int i = f14711g;
        f14711g = i + 1;
        sb.append(i);
        HandlerThread handlerThread = new HandlerThread(sb.toString(), 10);
        this.f14714c = handlerThread;
        handlerThread.start();
        this.f14715d = new Handler(handlerThread.getLooper());
        if (Thread.currentThread() == handlerThread) {
            m20405F();
        } else {
            m20416v(new Runnable() { // from class: com.immomo.mwc.sdk.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14710a.m20405F();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public void m20405F() {
        QuickJS quickJSCreateRuntime = QuickJS.createRuntime();
        this.f14712a = quickJSCreateRuntime;
        this.f14713b = quickJSCreateRuntime.createContext();
        m20409B(new xx5(), new jrq(), new lmq());
    }

    /* JADX INFO: renamed from: k */
    public static C4071b m20407k() {
        return new C4071b();
    }

    /* JADX INFO: renamed from: t */
    public static C4072c m20408t(String str) {
        return rre0.m182760f(str);
    }

    /* JADX INFO: renamed from: B */
    public void m20409B(ef00... ef00VarArr) {
        for (ef00 ef00Var : ef00VarArr) {
            try {
                this.f14713b.addPlugin(ef00Var);
            } catch (Throwable th) {
                MWCEngine.m20362m("MWCRuntime", null, "register modules exception @error=%s", th);
            }
        }
        MWCEngine.m20359j("MWCRuntime", null, "register modules success");
    }

    /* JADX INFO: renamed from: H */
    public void m20410H(EventType eventType, String str, JSONObject jSONObject, @Nullable z84 z84Var) {
        y84 y84Var;
        if (rre0.m182760f(str) != null) {
            int i = a.f14718a[eventType.ordinal()];
            if (i == 1 || i == 2) {
                String str2 = String.format("global._workers.trigger(%s)", d2j0.m113703b(eventType.value, str, jSONObject));
                MWCEngine.m20360k("MWCRuntime", str, "trigger::start @eventName=%s", eventType);
                try {
                    m20412m(str2, str + ".js");
                } catch (QuickJSException e) {
                    MWCEngine.m20362m("MWCRuntime", str, "trigger::end @eventName=%s, @error=%s", eventType, e);
                }
                MWCEngine.m20360k("MWCRuntime", str, "trigger::end @eventName=%s", eventType);
                y84Var = null;
            } else {
                y84Var = new y84(1001, "unknown event name:" + eventType);
            }
        } else {
            y84Var = new y84(1002, eventType.value + ":unknown worker @workerId=" + str + ", @data=" + jSONObject.toString());
        }
        if (z84Var != null) {
            z84Var.mo99785a(y84Var, null);
        } else if (y84Var != null) {
            MWCEngine.m20362m("MWCRuntime", str, "trigger:error @error=%s", y84Var);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f14713b.close();
            this.f14712a.close();
            this.f14714c.quitSafely();
            this.f14716e = true;
            MWCEngine.m20359j("MWCRuntime", null, "destroyed context and runtime");
        } catch (Throwable th) {
            MWCEngine.m20362m("MWCRuntime", null, "could not destroyed context and runtime @error=%s", th);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m20411d(C4072c c4072c, ro5 ro5Var) {
        if (c4072c.m20418a(MWCEngine.CodeType.JS)) {
            rre0.m182756b(c4072c, ro5Var);
        } else {
            if (c4072c.m20418a(MWCEngine.CodeType.BINARY)) {
                rre0.m182757c(c4072c, ro5Var);
                return;
            }
            ro5Var.mo182358a(new MWCException(1004, "Not supported MWCEngine.CodeType:" + c4072c.m20419b()), null);
        }
    }

    /* JADX INFO: renamed from: m */
    public Object m20412m(String str, String str2) throws QuickJSException {
        if (TextUtils.isEmpty(str2)) {
            str2 = "anonymous";
        }
        return this.f14713b.executeScript(str, str2);
    }

    /* JADX INFO: renamed from: n */
    public Object m20413n(String str) throws QuickJSException {
        return this.f14713b.executeBinaryScript(str);
    }

    /* JADX INFO: renamed from: q */
    public HandlerThread m20414q() {
        return this.f14714c;
    }

    /* JADX INFO: renamed from: u */
    public boolean m20415u() {
        HandlerThread handlerThread = this.f14714c;
        if (handlerThread != null) {
            return handlerThread.isInterrupted();
        }
        return true;
    }

    /* JADX INFO: renamed from: v */
    public boolean m20416v(Runnable runnable) {
        return this.f14715d.post(runnable);
    }
}
