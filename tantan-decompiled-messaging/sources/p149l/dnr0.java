package p149l;

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
public abstract class dnr0 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final lnr0 f87091a;

    /* JADX INFO: renamed from: b */
    public final int f87092b;

    /* JADX INFO: renamed from: c */
    public final String f87093c;

    /* JADX INFO: renamed from: d */
    public final int f87094d;

    /* JADX INFO: renamed from: e */
    public final Object f87095e;

    /* JADX INFO: renamed from: f */
    @Nullable
    @GuardedBy("mLock")
    public final hnr0 f87096f;

    /* JADX INFO: renamed from: g */
    public Integer f87097g;

    /* JADX INFO: renamed from: h */
    public gnr0 f87098h;

    /* JADX INFO: renamed from: i */
    @GuardedBy("mLock")
    public boolean f87099i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public emr0 f87100j;

    /* JADX INFO: renamed from: k */
    @GuardedBy("mLock")
    public rmr0 f87101k;

    /* JADX INFO: renamed from: l */
    public final imr0 f87102l;

    public dnr0(int i, String str, @Nullable hnr0 hnr0Var) {
        Uri uri;
        String host;
        this.f87091a = lnr0.f129020c ? new lnr0() : null;
        this.f87095e = new Object();
        int iHashCode = 0;
        this.f87099i = false;
        this.f87100j = null;
        this.f87092b = i;
        this.f87093c = str;
        this.f87096f = hnr0Var;
        this.f87102l = new imr0();
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.f87094d = iHashCode;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m112653A() {
        synchronized (this.f87095e) {
        }
        return false;
    }

    /* JADX INFO: renamed from: B */
    public byte[] mo112654B() throws zzapi {
        return null;
    }

    /* JADX INFO: renamed from: C */
    public final imr0 m112655C() {
        return this.f87102l;
    }

    /* JADX INFO: renamed from: a */
    public final int m112656a() {
        return this.f87102l.m137086b();
    }

    /* JADX INFO: renamed from: b */
    public final int m112657b() {
        return this.f87094d;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f87097g.intValue() - ((dnr0) obj).f87097g.intValue();
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final emr0 m112658f() {
        return this.f87100j;
    }

    /* JADX INFO: renamed from: g */
    public final dnr0 m112659g(emr0 emr0Var) {
        this.f87100j = emr0Var;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final dnr0 m112660h(gnr0 gnr0Var) {
        this.f87098h = gnr0Var;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public final dnr0 m112661i(int i) {
        this.f87097g = Integer.valueOf(i);
        return this;
    }

    /* JADX INFO: renamed from: j */
    public abstract jnr0 mo112662j(pmr0 pmr0Var);

    /* JADX INFO: renamed from: n */
    public final String m112663n() {
        int i = this.f87092b;
        String str = this.f87093c;
        if (i == 0) {
            return str;
        }
        return Integer.toString(1) + "-" + str;
    }

    /* JADX INFO: renamed from: o */
    public final String m112664o() {
        return this.f87093c;
    }

    /* JADX INFO: renamed from: p */
    public Map mo112665p() throws zzapi {
        return Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: q */
    public final void m112666q(String str) {
        if (lnr0.f129020c) {
            this.f87091a.m150710a(str, Thread.currentThread().getId());
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m112667r(zzaqj zzaqjVar) {
        hnr0 hnr0Var;
        synchronized (this.f87095e) {
            hnr0Var = this.f87096f;
        }
        hnr0Var.mo95697a(zzaqjVar);
    }

    /* JADX INFO: renamed from: s */
    public abstract void mo112668s(Object obj);

    /* JADX INFO: renamed from: t */
    public final void m112669t(String str) {
        gnr0 gnr0Var = this.f87098h;
        if (gnr0Var != null) {
            gnr0Var.m127182b(this);
        }
        if (lnr0.f129020c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new qmr0(this, str, id));
            } else {
                this.f87091a.m150710a(str, id);
                this.f87091a.m150711b(toString());
            }
        }
    }

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.f87094d));
        m112653A();
        return "[ ] " + this.f87093c + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + "0x".concat(strValueOf) + " NORMAL " + this.f87097g;
    }

    /* JADX INFO: renamed from: u */
    public final void m112670u() {
        synchronized (this.f87095e) {
            this.f87099i = true;
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m112671v() {
        rmr0 rmr0Var;
        synchronized (this.f87095e) {
            rmr0Var = this.f87101k;
        }
        if (rmr0Var != null) {
            rmr0Var.mo160365a(this);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m112672w(jnr0 jnr0Var) {
        rmr0 rmr0Var;
        synchronized (this.f87095e) {
            rmr0Var = this.f87101k;
        }
        if (rmr0Var != null) {
            rmr0Var.mo160366b(this, jnr0Var);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m112673x(int i) {
        gnr0 gnr0Var = this.f87098h;
        if (gnr0Var != null) {
            gnr0Var.m127183c(this, i);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m112674y(rmr0 rmr0Var) {
        synchronized (this.f87095e) {
            this.f87101k = rmr0Var;
        }
    }

    /* JADX INFO: renamed from: z */
    public final boolean m112675z() {
        boolean z;
        synchronized (this.f87095e) {
            z = this.f87099i;
        }
        return z;
    }

    public final int zza() {
        return this.f87092b;
    }
}
