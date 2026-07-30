package p153l;

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
public final class m7w0 {

    /* JADX INFO: renamed from: a */
    public zzl f135113a;

    /* JADX INFO: renamed from: b */
    public zzq f135114b;

    /* JADX INFO: renamed from: c */
    public String f135115c;

    /* JADX INFO: renamed from: d */
    public zzfk f135116d;

    /* JADX INFO: renamed from: e */
    public boolean f135117e;

    /* JADX INFO: renamed from: f */
    public ArrayList f135118f;

    /* JADX INFO: renamed from: g */
    public ArrayList f135119g;

    /* JADX INFO: renamed from: h */
    public zzbjb f135120h;

    /* JADX INFO: renamed from: i */
    public zzw f135121i;

    /* JADX INFO: renamed from: j */
    public AdManagerAdViewOptions f135122j;

    /* JADX INFO: renamed from: k */
    public PublisherAdViewOptions f135123k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public y7t0 f135124l;

    /* JADX INFO: renamed from: n */
    public zzbpp f135126n;

    /* JADX INFO: renamed from: q */
    @Nullable
    public wlv0 f135129q;

    /* JADX INFO: renamed from: s */
    public zct0 f135131s;

    /* JADX INFO: renamed from: m */
    public int f135125m = 1;

    /* JADX INFO: renamed from: o */
    public final v6w0 f135127o = new v6w0();

    /* JADX INFO: renamed from: p */
    public boolean f135128p = false;

    /* JADX INFO: renamed from: r */
    public boolean f135130r = false;

    /* JADX INFO: renamed from: F */
    public final v6w0 m157311F() {
        return this.f135127o;
    }

    /* JADX INFO: renamed from: G */
    public final m7w0 m157312G(o7w0 o7w0Var) {
        this.f135127o.m200154a(o7w0Var.f145329o.f192644a);
        this.f135113a = o7w0Var.f145318d;
        this.f135114b = o7w0Var.f145319e;
        this.f135131s = o7w0Var.f145332r;
        this.f135115c = o7w0Var.f145320f;
        this.f135116d = o7w0Var.f145315a;
        this.f135118f = o7w0Var.f145321g;
        this.f135119g = o7w0Var.f145322h;
        this.f135120h = o7w0Var.f145323i;
        this.f135121i = o7w0Var.f145324j;
        m157313H(o7w0Var.f145326l);
        m157326d(o7w0Var.f145327m);
        this.f135128p = o7w0Var.f145330p;
        this.f135129q = o7w0Var.f145317c;
        this.f135130r = o7w0Var.f145331q;
        return this;
    }

    /* JADX INFO: renamed from: H */
    public final m7w0 m157313H(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.f135122j = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.f135117e = adManagerAdViewOptions.m12283F();
        }
        return this;
    }

    /* JADX INFO: renamed from: I */
    public final m7w0 m157314I(zzq zzqVar) {
        this.f135114b = zzqVar;
        return this;
    }

    /* JADX INFO: renamed from: J */
    public final m7w0 m157315J(String str) {
        this.f135115c = str;
        return this;
    }

    /* JADX INFO: renamed from: K */
    public final m7w0 m157316K(zzw zzwVar) {
        this.f135121i = zzwVar;
        return this;
    }

    /* JADX INFO: renamed from: L */
    public final m7w0 m157317L(wlv0 wlv0Var) {
        this.f135129q = wlv0Var;
        return this;
    }

    /* JADX INFO: renamed from: M */
    public final m7w0 m157318M(zzbpp zzbppVar) {
        this.f135126n = zzbppVar;
        this.f135116d = new zzfk(false, true, false);
        return this;
    }

    /* JADX INFO: renamed from: N */
    public final m7w0 m157319N(boolean z) {
        this.f135128p = z;
        return this;
    }

    /* JADX INFO: renamed from: O */
    public final m7w0 m157320O(boolean z) {
        this.f135130r = true;
        return this;
    }

    /* JADX INFO: renamed from: P */
    public final m7w0 m157321P(boolean z) {
        this.f135117e = z;
        return this;
    }

    /* JADX INFO: renamed from: Q */
    public final m7w0 m157322Q(int i) {
        this.f135125m = i;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final m7w0 m157323a(zzbjb zzbjbVar) {
        this.f135120h = zzbjbVar;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final m7w0 m157324b(ArrayList arrayList) {
        this.f135118f = arrayList;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final m7w0 m157325c(ArrayList arrayList) {
        this.f135119g = arrayList;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final m7w0 m157326d(PublisherAdViewOptions publisherAdViewOptions) {
        this.f135123k = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.f135117e = publisherAdViewOptions.zzc();
            this.f135124l = publisherAdViewOptions.m12285F();
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final m7w0 m157327e(zzl zzlVar) {
        this.f135113a = zzlVar;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final m7w0 m157328f(zzfk zzfkVar) {
        this.f135116d = zzfkVar;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final o7w0 m157329g() {
        Preconditions.checkNotNull(this.f135115c, "ad unit must not be null");
        Preconditions.checkNotNull(this.f135114b, "ad size must not be null");
        Preconditions.checkNotNull(this.f135113a, "ad request must not be null");
        return new o7w0(this, null);
    }

    /* JADX INFO: renamed from: i */
    public final String m157330i() {
        return this.f135115c;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m157331o() {
        return this.f135128p;
    }

    /* JADX INFO: renamed from: q */
    public final m7w0 m157332q(zct0 zct0Var) {
        this.f135131s = zct0Var;
        return this;
    }

    /* JADX INFO: renamed from: v */
    public final zzl m157333v() {
        return this.f135113a;
    }

    /* JADX INFO: renamed from: x */
    public final zzq m157334x() {
        return this.f135114b;
    }
}
