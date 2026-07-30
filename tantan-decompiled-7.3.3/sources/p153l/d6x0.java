package p153l;

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
public final class d6x0 extends mzx0 {

    /* JADX INFO: renamed from: c */
    public char f85416c;

    /* JADX INFO: renamed from: d */
    public long f85417d;

    /* JADX INFO: renamed from: e */
    @GuardedBy("this")
    public String f85418e;

    /* JADX INFO: renamed from: f */
    public final l8x0 f85419f;

    /* JADX INFO: renamed from: g */
    public final l8x0 f85420g;

    /* JADX INFO: renamed from: h */
    public final l8x0 f85421h;

    /* JADX INFO: renamed from: i */
    public final l8x0 f85422i;

    /* JADX INFO: renamed from: j */
    public final l8x0 f85423j;

    /* JADX INFO: renamed from: k */
    public final l8x0 f85424k;

    /* JADX INFO: renamed from: l */
    public final l8x0 f85425l;

    /* JADX INFO: renamed from: m */
    public final l8x0 f85426m;

    /* JADX INFO: renamed from: n */
    public final l8x0 f85427n;

    public d6x0(atx0 atx0Var) {
        super(atx0Var);
        this.f85416c = (char) 0;
        this.f85417d = -1L;
        this.f85419f = new l8x0(this, 6, false, false);
        this.f85420g = new l8x0(this, 6, true, false);
        this.f85421h = new l8x0(this, 6, false, true);
        this.f85422i = new l8x0(this, 5, false, false);
        this.f85423j = new l8x0(this, 5, true, false);
        this.f85424k = new l8x0(this, 5, false, true);
        this.f85425l = new l8x0(this, 4, false, false);
        this.f85426m = new l8x0(this, 3, false, false);
        this.f85427n = new l8x0(this, 2, false, false);
    }

    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    @VisibleForTesting
    /* JADX INFO: renamed from: J */
    private final String m114549J() {
        String str;
        synchronized (this) {
            try {
                if (this.f85418e == null) {
                    this.f85418e = this.f202159a.m100289J() != null ? this.f202159a.m100289J() : "FA";
                }
                Preconditions.checkNotNull(this.f85418e);
                str = this.f85418e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: p */
    public static Object m114551p(String str) {
        if (str == null) {
            return null;
        }
        return new h7x0(str);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: q */
    public static String m114552q(boolean z, Object obj) {
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
            if (obj instanceof h7x0) {
                return ((h7x0) obj).f108178a;
            }
            return z ? "-" : String.valueOf(obj);
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String strM114557y = m114557y(atx0.class.getCanonicalName());
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && m114557y(className).equals(strM114557y)) {
                sb.append(": ");
                sb.append(stackTraceElement);
                break;
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: r */
    public static String m114553r(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String strM114552q = m114552q(z, obj);
        String strM114552q2 = m114552q(z, obj2);
        String strM114552q3 = m114552q(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strM114552q)) {
            sb.append(str2);
            sb.append(strM114552q);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strM114552q2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strM114552q2);
        }
        if (!TextUtils.isEmpty(strM114552q3)) {
            sb.append(str3);
            sb.append(strM114552q3);
        }
        return sb.toString();
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: y */
    public static String m114557y(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            return (jmy0.m146178a() && whs0.f189207H0.m220931a(null).booleanValue()) ? "" : str;
        }
        return str.substring(0, iLastIndexOf);
    }

    /* JADX INFO: renamed from: A */
    public final l8x0 m114558A() {
        return this.f85419f;
    }

    /* JADX INFO: renamed from: B */
    public final l8x0 m114559B() {
        return this.f85421h;
    }

    /* JADX INFO: renamed from: C */
    public final l8x0 m114560C() {
        return this.f85420g;
    }

    /* JADX INFO: renamed from: D */
    public final l8x0 m114561D() {
        return this.f85425l;
    }

    /* JADX INFO: renamed from: E */
    public final l8x0 m114562E() {
        return this.f85427n;
    }

    /* JADX INFO: renamed from: F */
    public final l8x0 m114563F() {
        return this.f85422i;
    }

    /* JADX INFO: renamed from: G */
    public final l8x0 m114564G() {
        return this.f85424k;
    }

    /* JADX INFO: renamed from: H */
    public final l8x0 m114565H() {
        return this.f85423j;
    }

    /* JADX INFO: renamed from: I */
    public final String m114566I() {
        Pair<String, Long> pairM216741a;
        if (mo15142d().f71899f == null || (pairM216741a = mo15142d().f71899f.m216741a()) == null || pairM216741a == ajx0.f71894B) {
            return null;
        }
        return String.valueOf(pairM216741a.second) + ":" + ((String) pairM216741a.first);
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ ajr0 mo15139a() {
        return super.mo15139a();
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ o7s0 mo15140b() {
        return super.mo15140b();
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ wxw0 mo15141c() {
        return super.mo15141c();
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ ajx0 mo15142d() {
        return super.mo15142d();
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ hny0 mo15143e() {
        return super.mo15143e();
    }

    @Override // p153l.yyx0
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ void mo15144f() {
        super.mo15144f();
    }

    @Override // p153l.yyx0
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ void mo15145g() {
        super.mo15145g();
    }

    @Override // p153l.yyx0
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ void mo15146h() {
        super.mo15146h();
    }

    @Override // p153l.mzx0
    /* JADX INFO: renamed from: n */
    public final boolean mo98519n() {
        return false;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: s */
    public final void m114567s(int i, String str) {
        Log.println(i, m114549J(), str);
    }

    /* JADX INFO: renamed from: t */
    public final void m114568t(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && m114569w(i)) {
            m114567s(i, m114553r(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        Preconditions.checkNotNull(str);
        qsx0 qsx0VarM100281B = this.f202159a.m100281B();
        if (qsx0VarM100281B == null) {
            m114567s(6, "Scheduler not set. Not logging error/warn");
            return;
        }
        if (!qsx0VarM100281B.m160933m()) {
            m114567s(6, "Scheduler not initialized. Not logging error/warn");
            return;
        }
        if (i < 0) {
            i = 0;
        }
        if (i >= 9) {
            i = 8;
        }
        qsx0VarM100281B.m177841w(new a5x0(this, i, str, obj, obj2, obj3));
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: w */
    public final boolean m114569w(int i) {
        return Log.isLoggable(m114549J(), i);
    }

    /* JADX INFO: renamed from: z */
    public final l8x0 m114570z() {
        return this.f85426m;
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ zbr0 zzd() {
        return super.zzd();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ d6x0 zzj() {
        return super.zzj();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ qsx0 zzl() {
        return super.zzl();
    }
}
