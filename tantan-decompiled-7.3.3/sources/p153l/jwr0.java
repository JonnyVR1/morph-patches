package p153l;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.internal.ads.zzapi;
import com.google.android.gms.internal.ads.zzaqj;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class jwr0 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final rwr0 f122956a;

    /* JADX INFO: renamed from: b */
    public final int f122957b;

    /* JADX INFO: renamed from: c */
    public final String f122958c;

    /* JADX INFO: renamed from: d */
    public final int f122959d;

    /* JADX INFO: renamed from: e */
    public final Object f122960e;

    /* JADX INFO: renamed from: f */
    @Nullable
    @GuardedBy("mLock")
    public final nwr0 f122961f;

    /* JADX INFO: renamed from: g */
    public Integer f122962g;

    /* JADX INFO: renamed from: h */
    public mwr0 f122963h;

    /* JADX INFO: renamed from: i */
    @GuardedBy("mLock")
    public boolean f122964i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public kvr0 f122965j;

    /* JADX INFO: renamed from: k */
    @GuardedBy("mLock")
    public xvr0 f122966k;

    /* JADX INFO: renamed from: l */
    public final ovr0 f122967l;

    public jwr0(int i, String str, @Nullable nwr0 nwr0Var) {
        Uri uri;
        String host;
        this.f122956a = rwr0.f165232c ? new rwr0() : null;
        this.f122960e = new Object();
        int iHashCode = 0;
        this.f122964i = false;
        this.f122965j = null;
        this.f122957b = i;
        this.f122958c = str;
        this.f122961f = nwr0Var;
        this.f122967l = new ovr0();
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.f122959d = iHashCode;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m147191A() {
        synchronized (this.f122960e) {
        }
        return false;
    }

    /* JADX INFO: renamed from: B */
    public byte[] mo147192B() throws zzapi {
        return null;
    }

    /* JADX INFO: renamed from: C */
    public final ovr0 m147193C() {
        return this.f122967l;
    }

    /* JADX INFO: renamed from: a */
    public final int m147194a() {
        return this.f122967l.m169484b();
    }

    /* JADX INFO: renamed from: b */
    public final int m147195b() {
        return this.f122959d;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f122962g.intValue() - ((jwr0) obj).f122962g.intValue();
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final kvr0 m147196f() {
        return this.f122965j;
    }

    /* JADX INFO: renamed from: g */
    public final jwr0 m147197g(kvr0 kvr0Var) {
        this.f122965j = kvr0Var;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final jwr0 m147198h(mwr0 mwr0Var) {
        this.f122963h = mwr0Var;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public final jwr0 m147199i(int i) {
        this.f122962g = Integer.valueOf(i);
        return this;
    }

    /* JADX INFO: renamed from: j */
    public abstract pwr0 mo147200j(vvr0 vvr0Var);

    /* JADX INFO: renamed from: n */
    public final String m147201n() {
        int i = this.f122957b;
        String str = this.f122958c;
        if (i == 0) {
            return str;
        }
        return Integer.toString(1) + "-" + str;
    }

    /* JADX INFO: renamed from: o */
    public final String m147202o() {
        return this.f122958c;
    }

    /* JADX INFO: renamed from: p */
    public Map mo147203p() throws zzapi {
        return Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: q */
    public final void m147204q(String str) {
        if (rwr0.f165232c) {
            this.f122956a.m183459a(str, Thread.currentThread().getId());
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m147205r(zzaqj zzaqjVar) {
        nwr0 nwr0Var;
        synchronized (this.f122960e) {
            nwr0Var = this.f122961f;
        }
        nwr0Var.mo130599a(zzaqjVar);
    }

    /* JADX INFO: renamed from: s */
    public abstract void mo147206s(Object obj);

    /* JADX INFO: renamed from: t */
    public final void m147207t(String str) {
        mwr0 mwr0Var = this.f122963h;
        if (mwr0Var != null) {
            mwr0Var.m160592b(this);
        }
        if (rwr0.f165232c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new wvr0(this, str, id));
            } else {
                this.f122956a.m183459a(str, id);
                this.f122956a.m183460b(toString());
            }
        }
    }

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.f122959d));
        m147191A();
        return "[ ] " + this.f122958c + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + "0x".concat(strValueOf) + " NORMAL " + this.f122962g;
    }

    /* JADX INFO: renamed from: u */
    public final void m147208u() {
        synchronized (this.f122960e) {
            this.f122964i = true;
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m147209v() {
        xvr0 xvr0Var;
        synchronized (this.f122960e) {
            xvr0Var = this.f122966k;
        }
        if (xvr0Var != null) {
            xvr0Var.mo193366a(this);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m147210w(pwr0 pwr0Var) {
        xvr0 xvr0Var;
        synchronized (this.f122960e) {
            xvr0Var = this.f122966k;
        }
        if (xvr0Var != null) {
            xvr0Var.mo193367b(this, pwr0Var);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m147211x(int i) {
        mwr0 mwr0Var = this.f122963h;
        if (mwr0Var != null) {
            mwr0Var.m160593c(this, i);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m147212y(xvr0 xvr0Var) {
        synchronized (this.f122960e) {
            this.f122966k = xvr0Var;
        }
    }

    /* JADX INFO: renamed from: z */
    public final boolean m147213z() {
        boolean z;
        synchronized (this.f122960e) {
            z = this.f122964i;
        }
        return z;
    }

    public final int zza() {
        return this.f122957b;
    }
}
