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
import p149l.a84;
import p149l.jpq;
import p149l.mje0;
import p149l.mkq;
import p149l.nn5;
import p149l.sw5;
import p149l.v600;
import p149l.z74;
import p149l.zsi0;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: com.immomo.mwc.sdk.b */
/* JADX INFO: loaded from: classes7.dex */
public final class C3928b implements Closeable {

    /* JADX INFO: renamed from: g */
    private static int f14017g;

    /* JADX INFO: renamed from: c */
    private final HandlerThread f14020c;

    /* JADX INFO: renamed from: d */
    private final Handler f14021d;

    /* JADX INFO: renamed from: a */
    private QuickJS f14018a = null;

    /* JADX INFO: renamed from: b */
    private JSContext f14019b = null;

    /* JADX INFO: renamed from: e */
    private boolean f14022e = false;

    /* JADX INFO: renamed from: f */
    private final LinkedHashMap<EventType, Object> f14023f = new LinkedHashMap<>();

    /* JADX INFO: renamed from: com.immomo.mwc.sdk.b$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f14024a;

        static {
            int[] iArr = new int[EventType.values().length];
            f14024a = iArr;
            try {
                iArr[EventType.MK_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14024a[EventType.MK_DESTROY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private C3928b() {
        StringBuilder sb = new StringBuilder("mwc-runtime-");
        int i = f14017g;
        f14017g = i + 1;
        sb.append(i);
        HandlerThread handlerThread = new HandlerThread(sb.toString(), 10);
        this.f14020c = handlerThread;
        handlerThread.start();
        this.f14021d = new Handler(handlerThread.getLooper());
        if (Thread.currentThread() == handlerThread) {
            m19425F();
        } else {
            m19436v(new Runnable() { // from class: com.immomo.mwc.sdk.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14016a.m19425F();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public void m19425F() {
        QuickJS quickJSCreateRuntime = QuickJS.createRuntime();
        this.f14018a = quickJSCreateRuntime;
        this.f14019b = quickJSCreateRuntime.createContext();
        m19429B(new sw5(), new jpq(), new mkq());
    }

    /* JADX INFO: renamed from: k */
    public static C3928b m19427k() {
        return new C3928b();
    }

    /* JADX INFO: renamed from: t */
    public static C3929c m19428t(String str) {
        return mje0.m154794f(str);
    }

    /* JADX INFO: renamed from: B */
    public void m19429B(v600... v600VarArr) {
        for (v600 v600Var : v600VarArr) {
            try {
                this.f14019b.addPlugin(v600Var);
            } catch (Throwable th) {
                MWCEngine.m19382m("MWCRuntime", null, "register modules exception @error=%s", th);
            }
        }
        MWCEngine.m19379j("MWCRuntime", null, "register modules success");
    }

    /* JADX INFO: renamed from: H */
    public void m19430H(EventType eventType, String str, JSONObject jSONObject, @Nullable a84 a84Var) {
        z74 z74Var;
        if (mje0.m154794f(str) != null) {
            int i = a.f14024a[eventType.ordinal()];
            if (i == 1 || i == 2) {
                String str2 = String.format("global._workers.trigger(%s)", zsi0.m220035b(eventType.value, str, jSONObject));
                MWCEngine.m19380k("MWCRuntime", str, "trigger::start @eventName=%s", eventType);
                try {
                    m19432m(str2, str + ".js");
                } catch (QuickJSException e) {
                    MWCEngine.m19382m("MWCRuntime", str, "trigger::end @eventName=%s, @error=%s", eventType, e);
                }
                MWCEngine.m19380k("MWCRuntime", str, "trigger::end @eventName=%s", eventType);
                z74Var = null;
            } else {
                z74Var = new z74(1001, "unknown event name:" + eventType);
            }
        } else {
            z74Var = new z74(1002, eventType.value + ":unknown worker @workerId=" + str + ", @data=" + jSONObject.toString());
        }
        if (a84Var != null) {
            a84Var.mo95332a(z74Var, null);
        } else if (z74Var != null) {
            MWCEngine.m19382m("MWCRuntime", str, "trigger:error @error=%s", z74Var);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f14019b.close();
            this.f14018a.close();
            this.f14020c.quitSafely();
            this.f14022e = true;
            MWCEngine.m19379j("MWCRuntime", null, "destroyed context and runtime");
        } catch (Throwable th) {
            MWCEngine.m19382m("MWCRuntime", null, "could not destroyed context and runtime @error=%s", th);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m19431d(C3929c c3929c, nn5 nn5Var) {
        if (c3929c.m19438a(MWCEngine.CodeType.JS)) {
            mje0.m154790b(c3929c, nn5Var);
        } else {
            if (c3929c.m19438a(MWCEngine.CodeType.BINARY)) {
                mje0.m154791c(c3929c, nn5Var);
                return;
            }
            nn5Var.mo97998a(new MWCException(1004, "Not supported MWCEngine.CodeType:" + c3929c.m19439b()), null);
        }
    }

    /* JADX INFO: renamed from: m */
    public Object m19432m(String str, String str2) throws QuickJSException {
        if (TextUtils.isEmpty(str2)) {
            str2 = "anonymous";
        }
        return this.f14019b.executeScript(str, str2);
    }

    /* JADX INFO: renamed from: n */
    public Object m19433n(String str) throws QuickJSException {
        return this.f14019b.executeBinaryScript(str);
    }

    /* JADX INFO: renamed from: q */
    public HandlerThread m19434q() {
        return this.f14020c;
    }

    /* JADX INFO: renamed from: u */
    public boolean m19435u() {
        HandlerThread handlerThread = this.f14020c;
        if (handlerThread != null) {
            return handlerThread.isInterrupted();
        }
        return true;
    }

    /* JADX INFO: renamed from: v */
    public boolean m19436v(Runnable runnable) {
        return this.f14021d.post(runnable);
    }
}
