package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes6.dex */
public final class xww0 extends gqx0 {

    /* JADX INFO: renamed from: c */
    public char f194774c;

    /* JADX INFO: renamed from: d */
    public long f194775d;

    /* JADX INFO: renamed from: e */
    @GuardedBy("this")
    public String f194776e;

    /* JADX INFO: renamed from: f */
    public final fzw0 f194777f;

    /* JADX INFO: renamed from: g */
    public final fzw0 f194778g;

    /* JADX INFO: renamed from: h */
    public final fzw0 f194779h;

    /* JADX INFO: renamed from: i */
    public final fzw0 f194780i;

    /* JADX INFO: renamed from: j */
    public final fzw0 f194781j;

    /* JADX INFO: renamed from: k */
    public final fzw0 f194782k;

    /* JADX INFO: renamed from: l */
    public final fzw0 f194783l;

    /* JADX INFO: renamed from: m */
    public final fzw0 f194784m;

    /* JADX INFO: renamed from: n */
    public final fzw0 f194785n;

    public xww0(ujx0 ujx0Var) {
        super(ujx0Var);
        this.f194774c = (char) 0;
        this.f194775d = -1L;
        this.f194777f = new fzw0(this, 6, false, false);
        this.f194778g = new fzw0(this, 6, true, false);
        this.f194779h = new fzw0(this, 6, false, true);
        this.f194780i = new fzw0(this, 5, false, false);
        this.f194781j = new fzw0(this, 5, true, false);
        this.f194782k = new fzw0(this, 5, false, true);
        this.f194783l = new fzw0(this, 4, false, false);
        this.f194784m = new fzw0(this, 3, false, false);
        this.f194785n = new fzw0(this, 2, false, false);
    }

    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    @VisibleForTesting
    /* JADX INFO: renamed from: J */
    private final String m211403J() {
        String str;
        synchronized (this) {
            try {
                if (this.f194776e == null) {
                    this.f194776e = this.f165891a.m194109J() != null ? this.f165891a.m194109J() : "FA";
                }
                Preconditions.checkNotNull(this.f194776e);
                str = this.f194776e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: p */
    public static Object m211405p(String str) {
        if (str == null) {
            return null;
        }
        return new byw0(str);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: q */
    public static String m211406q(boolean z, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l2 = (Long) obj;
            if (Math.abs(l2.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String strValueOf = String.valueOf(Math.abs(l2.longValue()));
            return str + Math.round(Math.pow(10.0d, strValueOf.length() - 1)) + "..." + str + Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof byw0) {
                return ((byw0) obj).f77990a;
            }
            return z ? "-" : String.valueOf(obj);
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String strM211411y = m211411y(ujx0.class.getCanonicalName());
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && m211411y(className).equals(strM211411y)) {
                sb.append(": ");
                sb.append(stackTraceElement);
                break;
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: r */
    public static String m211407r(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String strM211406q = m211406q(z, obj);
        String strM211406q2 = m211406q(z, obj2);
        String strM211406q3 = m211406q(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strM211406q)) {
            sb.append(str2);
            sb.append(strM211406q);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strM211406q2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strM211406q2);
        }
        if (!TextUtils.isEmpty(strM211406q3)) {
            sb.append(str3);
            sb.append(strM211406q3);
        }
        return sb.toString();
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: y */
    public static String m211411y(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            return (ddy0.m111087a() && q8s0.f153231H0.m188827a(null).booleanValue()) ? "" : str;
        }
        return str.substring(0, iLastIndexOf);
    }

    /* JADX INFO: renamed from: A */
    public final fzw0 m211412A() {
        return this.f194777f;
    }

    /* JADX INFO: renamed from: B */
    public final fzw0 m211413B() {
        return this.f194779h;
    }

    /* JADX INFO: renamed from: C */
    public final fzw0 m211414C() {
        return this.f194778g;
    }

    /* JADX INFO: renamed from: D */
    public final fzw0 m211415D() {
        return this.f194783l;
    }

    /* JADX INFO: renamed from: E */
    public final fzw0 m211416E() {
        return this.f194785n;
    }

    /* JADX INFO: renamed from: F */
    public final fzw0 m211417F() {
        return this.f194780i;
    }

    /* JADX INFO: renamed from: G */
    public final fzw0 m211418G() {
        return this.f194782k;
    }

    /* JADX INFO: renamed from: H */
    public final fzw0 m211419H() {
        return this.f194781j;
    }

    /* JADX INFO: renamed from: I */
    public final String m211420I() {
        Pair<String, Long> pairM183580a;
        if (mo15088d().f175518f == null || (pairM183580a = mo15088d().f175518f.m183580a()) == null || pairM183580a == u9x0.f175513B) {
            return null;
        }
        return String.valueOf(pairM183580a.second) + ":" + ((String) pairM183580a.first);
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ u9r0 mo15085a() {
        return super.mo15085a();
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ iyr0 mo15086b() {
        return super.mo15086b();
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ qow0 mo15087c() {
        return super.mo15087c();
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ u9x0 mo15088d() {
        return super.mo15088d();
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ bey0 mo15089e() {
        return super.mo15089e();
    }

    @Override // p149l.spx0
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ void mo15090f() {
        super.mo15090f();
    }

    @Override // p149l.spx0
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ void mo15091g() {
        super.mo15091g();
    }

    @Override // p149l.spx0
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ void mo15092h() {
        super.mo15092h();
    }

    @Override // p149l.gqx0
    /* JADX INFO: renamed from: n */
    public final boolean mo101492n() {
        return false;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: s */
    public final void m211421s(int i, String str) {
        Log.println(i, m211403J(), str);
    }

    /* JADX INFO: renamed from: t */
    public final void m211422t(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && m211423w(i)) {
            m211421s(i, m211407r(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        Preconditions.checkNotNull(str);
        kjx0 kjx0VarM194101B = this.f165891a.m194101B();
        if (kjx0VarM194101B == null) {
            m211421s(6, "Scheduler not set. Not logging error/warn");
            return;
        }
        if (!kjx0VarM194101B.m127635m()) {
            m211421s(6, "Scheduler not initialized. Not logging error/warn");
            return;
        }
        if (i < 0) {
            i = 0;
        }
        if (i >= 9) {
            i = 8;
        }
        kjx0VarM194101B.m146305w(new uvw0(this, i, str, obj, obj2, obj3));
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: w */
    public final boolean m211423w(int i) {
        return Log.isLoggable(m211403J(), i);
    }

    /* JADX INFO: renamed from: z */
    public final fzw0 m211424z() {
        return this.f194784m;
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ t2r0 zzd() {
        return super.zzd();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ xww0 zzj() {
        return super.zzj();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ kjx0 zzl() {
        return super.zzl();
    }
}
