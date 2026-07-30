package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import com.apm.lite.CrashType;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class k0r0 {

    /* JADX INFO: renamed from: e */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile k0r0 f123418e;

    /* JADX INFO: renamed from: a */
    private Context f123419a;

    /* JADX INFO: renamed from: b */
    private Map<CrashType, bwq0> f123420b = new HashMap();

    /* JADX INFO: renamed from: c */
    private euq0 f123421c;

    /* JADX INFO: renamed from: d */
    private byq0 f123422d;

    /* JADX INFO: renamed from: l.k0r0$a */
    public static /* synthetic */ class C18074a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f123423a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f123423a = iArr;
            try {
                iArr[CrashType.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f123423a[CrashType.LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f123423a[CrashType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f123423a[CrashType.ANR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f123423a[CrashType.DART.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f123423a[CrashType.ENSURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private k0r0(Context context) {
        this.f123419a = context;
        try {
            this.f123421c = euq0.m122681A();
            this.f123422d = new byq0(this.f123419a);
        } catch (Throwable th) {
            pwq0.m174074a();
            pwq0.m174075b("NPTH_CATCH", th);
        }
    }

    /* JADX INFO: renamed from: c */
    private bwq0 m147833c(CrashType crashType) {
        bwq0 e3r0Var = this.f123420b.get(crashType);
        if (e3r0Var != null) {
            return e3r0Var;
        }
        switch (C18074a.f123423a[crashType.ordinal()]) {
            case 1:
                e3r0Var = new e3r0(this.f123419a, this.f123421c, this.f123422d);
                break;
            case 2:
                e3r0Var = new s3r0(this.f123419a, this.f123421c, this.f123422d);
                break;
            case 3:
                e3r0Var = new i4r0(this.f123419a, this.f123421c, this.f123422d);
                break;
            case 4:
                e3r0Var = new orq0(this.f123419a, this.f123421c, this.f123422d);
                break;
            case 5:
                e3r0Var = new r1r0(this.f123419a, this.f123421c, this.f123422d);
                break;
            case 6:
                e3r0Var = new t2r0(this.f123419a, this.f123421c, this.f123422d);
                break;
        }
        if (e3r0Var != null) {
            this.f123420b.put(crashType, e3r0Var);
        }
        return e3r0Var;
    }

    /* JADX INFO: renamed from: d */
    public static k0r0 m147834d() {
        if (f123418e == null) {
            Context contextM161022i = n0r0.m161022i();
            if (contextM161022i == null) {
                wg3.m206174a("NpthBus not init");
                return null;
            }
            f123418e = new k0r0(contextM161022i);
        }
        return f123418e;
    }

    /* JADX INFO: renamed from: a */
    public gsq0 m147835a(CrashType crashType, gsq0 gsq0Var) {
        bwq0 bwq0VarM147833c;
        return (crashType == null || (bwq0VarM147833c = m147833c(crashType)) == null) ? gsq0Var : bwq0VarM147833c.m106743c(gsq0Var, null, false);
    }

    /* JADX INFO: renamed from: b */
    public gsq0 m147836b(CrashType crashType, gsq0 gsq0Var, bwq0.InterfaceC16123a interfaceC16123a, boolean z) {
        bwq0 bwq0VarM147833c;
        return (crashType == null || (bwq0VarM147833c = m147833c(crashType)) == null) ? gsq0Var : bwq0VarM147833c.m106743c(gsq0Var, interfaceC16123a, z);
    }
}
