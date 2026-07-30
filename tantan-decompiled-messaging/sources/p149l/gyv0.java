package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbpp;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class gyv0 {

    /* JADX INFO: renamed from: a */
    public zzl f105046a;

    /* JADX INFO: renamed from: b */
    public zzq f105047b;

    /* JADX INFO: renamed from: c */
    public String f105048c;

    /* JADX INFO: renamed from: d */
    public zzfk f105049d;

    /* JADX INFO: renamed from: e */
    public boolean f105050e;

    /* JADX INFO: renamed from: f */
    public ArrayList f105051f;

    /* JADX INFO: renamed from: g */
    public ArrayList f105052g;

    /* JADX INFO: renamed from: h */
    public zzbjb f105053h;

    /* JADX INFO: renamed from: i */
    public zzw f105054i;

    /* JADX INFO: renamed from: j */
    public AdManagerAdViewOptions f105055j;

    /* JADX INFO: renamed from: k */
    public PublisherAdViewOptions f105056k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public sys0 f105057l;

    /* JADX INFO: renamed from: n */
    public zzbpp f105059n;

    /* JADX INFO: renamed from: q */
    @Nullable
    public qcv0 f105062q;

    /* JADX INFO: renamed from: s */
    public t3t0 f105064s;

    /* JADX INFO: renamed from: m */
    public int f105058m = 1;

    /* JADX INFO: renamed from: o */
    public final pxv0 f105060o = new pxv0();

    /* JADX INFO: renamed from: p */
    public boolean f105061p = false;

    /* JADX INFO: renamed from: r */
    public boolean f105063r = false;

    /* JADX INFO: renamed from: F */
    public final pxv0 m128754F() {
        return this.f105060o;
    }

    /* JADX INFO: renamed from: G */
    public final gyv0 m128755G(iyv0 iyv0Var) {
        this.f105060o.m171957a(iyv0Var.f115505o.f161517a);
        this.f105046a = iyv0Var.f115494d;
        this.f105047b = iyv0Var.f115495e;
        this.f105064s = iyv0Var.f115508r;
        this.f105048c = iyv0Var.f115496f;
        this.f105049d = iyv0Var.f115491a;
        this.f105051f = iyv0Var.f115497g;
        this.f105052g = iyv0Var.f115498h;
        this.f105053h = iyv0Var.f115499i;
        this.f105054i = iyv0Var.f115500j;
        m128756H(iyv0Var.f115502l);
        m128769d(iyv0Var.f115503m);
        this.f105061p = iyv0Var.f115506p;
        this.f105062q = iyv0Var.f115493c;
        this.f105063r = iyv0Var.f115507q;
        return this;
    }

    /* JADX INFO: renamed from: H */
    public final gyv0 m128756H(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.f105055j = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.f105050e = adManagerAdViewOptions.m12229F();
        }
        return this;
    }

    /* JADX INFO: renamed from: I */
    public final gyv0 m128757I(zzq zzqVar) {
        this.f105047b = zzqVar;
        return this;
    }

    /* JADX INFO: renamed from: J */
    public final gyv0 m128758J(String str) {
        this.f105048c = str;
        return this;
    }

    /* JADX INFO: renamed from: K */
    public final gyv0 m128759K(zzw zzwVar) {
        this.f105054i = zzwVar;
        return this;
    }

    /* JADX INFO: renamed from: L */
    public final gyv0 m128760L(qcv0 qcv0Var) {
        this.f105062q = qcv0Var;
        return this;
    }

    /* JADX INFO: renamed from: M */
    public final gyv0 m128761M(zzbpp zzbppVar) {
        this.f105059n = zzbppVar;
        this.f105049d = new zzfk(false, true, false);
        return this;
    }

    /* JADX INFO: renamed from: N */
    public final gyv0 m128762N(boolean z) {
        this.f105061p = z;
        return this;
    }

    /* JADX INFO: renamed from: O */
    public final gyv0 m128763O(boolean z) {
        this.f105063r = true;
        return this;
    }

    /* JADX INFO: renamed from: P */
    public final gyv0 m128764P(boolean z) {
        this.f105050e = z;
        return this;
    }

    /* JADX INFO: renamed from: Q */
    public final gyv0 m128765Q(int i) {
        this.f105058m = i;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final gyv0 m128766a(zzbjb zzbjbVar) {
        this.f105053h = zzbjbVar;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final gyv0 m128767b(ArrayList arrayList) {
        this.f105051f = arrayList;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final gyv0 m128768c(ArrayList arrayList) {
        this.f105052g = arrayList;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final gyv0 m128769d(PublisherAdViewOptions publisherAdViewOptions) {
        this.f105056k = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.f105050e = publisherAdViewOptions.zzc();
            this.f105057l = publisherAdViewOptions.m12231F();
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final gyv0 m128770e(zzl zzlVar) {
        this.f105046a = zzlVar;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final gyv0 m128771f(zzfk zzfkVar) {
        this.f105049d = zzfkVar;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final iyv0 m128772g() {
        Preconditions.checkNotNull(this.f105048c, "ad unit must not be null");
        Preconditions.checkNotNull(this.f105047b, "ad size must not be null");
        Preconditions.checkNotNull(this.f105046a, "ad request must not be null");
        return new iyv0(this, null);
    }

    /* JADX INFO: renamed from: i */
    public final String m128773i() {
        return this.f105048c;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m128774o() {
        return this.f105061p;
    }

    /* JADX INFO: renamed from: q */
    public final gyv0 m128775q(t3t0 t3t0Var) {
        this.f105064s = t3t0Var;
        return this;
    }

    /* JADX INFO: renamed from: v */
    public final zzl m128776v() {
        return this.f105046a;
    }

    /* JADX INFO: renamed from: x */
    public final zzq m128777x() {
        return this.f105047b;
    }
}
