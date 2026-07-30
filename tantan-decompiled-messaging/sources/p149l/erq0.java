package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import com.apm.lite.CrashType;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class erq0 {

    /* JADX INFO: renamed from: e */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile erq0 f92956e;

    /* JADX INFO: renamed from: a */
    private Context f92957a;

    /* JADX INFO: renamed from: b */
    private Map<CrashType, vmq0> f92958b = new HashMap();

    /* JADX INFO: renamed from: c */
    private ykq0 f92959c;

    /* JADX INFO: renamed from: d */
    private voq0 f92960d;

    /* JADX INFO: renamed from: l.erq0$a */
    public static /* synthetic */ class C16672a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f92961a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f92961a = iArr;
            try {
                iArr[CrashType.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f92961a[CrashType.LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f92961a[CrashType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f92961a[CrashType.ANR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f92961a[CrashType.DART.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f92961a[CrashType.ENSURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private erq0(Context context) {
        this.f92957a = context;
        try {
            this.f92959c = ykq0.m215154A();
            this.f92960d = new voq0(this.f92957a);
        } catch (Throwable th) {
            jnq0.m142383a();
            jnq0.m142384b("NPTH_CATCH", th);
        }
    }

    /* JADX INFO: renamed from: c */
    private vmq0 m117870c(CrashType crashType) {
        vmq0 ytq0Var = this.f92958b.get(crashType);
        if (ytq0Var != null) {
            return ytq0Var;
        }
        switch (C16672a.f92961a[crashType.ordinal()]) {
            case 1:
                ytq0Var = new ytq0(this.f92957a, this.f92959c, this.f92960d);
                break;
            case 2:
                ytq0Var = new muq0(this.f92957a, this.f92959c, this.f92960d);
                break;
            case 3:
                ytq0Var = new cvq0(this.f92957a, this.f92959c, this.f92960d);
                break;
            case 4:
                ytq0Var = new jiq0(this.f92957a, this.f92959c, this.f92960d);
                break;
            case 5:
                ytq0Var = new lsq0(this.f92957a, this.f92959c, this.f92960d);
                break;
            case 6:
                ytq0Var = new ntq0(this.f92957a, this.f92959c, this.f92960d);
                break;
        }
        if (ytq0Var != null) {
            this.f92958b.put(crashType, ytq0Var);
        }
        return ytq0Var;
    }

    /* JADX INFO: renamed from: d */
    public static erq0 m117871d() {
        if (f92956e == null) {
            Context contextM132700i = hrq0.m132700i();
            if (contextM132700i == null) {
                ig3.m135964a("NpthBus not init");
                return null;
            }
            f92956e = new erq0(contextM132700i);
        }
        return f92956e;
    }

    /* JADX INFO: renamed from: a */
    public bjq0 m117872a(CrashType crashType, bjq0 bjq0Var) {
        vmq0 vmq0VarM117870c;
        return (crashType == null || (vmq0VarM117870c = m117870c(crashType)) == null) ? bjq0Var : vmq0VarM117870c.m198974c(bjq0Var, null, false);
    }

    /* JADX INFO: renamed from: b */
    public bjq0 m117873b(CrashType crashType, bjq0 bjq0Var, vmq0.InterfaceC20665a interfaceC20665a, boolean z) {
        vmq0 vmq0VarM117870c;
        return (crashType == null || (vmq0VarM117870c = m117870c(crashType)) == null) ? bjq0Var : vmq0VarM117870c.m198974c(bjq0Var, interfaceC20665a, z);
    }
}
