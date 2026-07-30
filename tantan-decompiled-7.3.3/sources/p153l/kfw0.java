package p153l;

import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzfog;
import com.google.android.gms.internal.ads.zzfok;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class kfw0 extends hfw0 {

    /* JADX INFO: renamed from: i */
    public static final Pattern f126513i = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: a */
    public final jfw0 f126514a;

    /* JADX INFO: renamed from: b */
    public final ifw0 f126515b;

    /* JADX INFO: renamed from: d */
    public nhw0 f126517d;

    /* JADX INFO: renamed from: e */
    public kgw0 f126518e;

    /* JADX INFO: renamed from: c */
    public final List f126516c = new ArrayList();

    /* JADX INFO: renamed from: f */
    public boolean f126519f = false;

    /* JADX INFO: renamed from: g */
    public boolean f126520g = false;

    /* JADX INFO: renamed from: h */
    public final String f126521h = UUID.randomUUID().toString();

    public kfw0(ifw0 ifw0Var, jfw0 jfw0Var) {
        this.f126515b = ifw0Var;
        this.f126514a = jfw0Var;
        m149631k(null);
        if (jfw0Var.m144733d() == zzfog.HTML || jfw0Var.m144733d() == zzfog.JAVASCRIPT) {
            this.f126518e = new lgw0(jfw0Var.m144732a());
        } else {
            this.f126518e = new ogw0(jfw0Var.m144738i(), null);
        }
        this.f126518e.mo149774k();
        tfw0.m190995a().m190998d(this);
        dgw0.m115758a().m115762d(this.f126518e.m149764a(), ifw0Var.m139753b());
    }

    @Override // p153l.hfw0
    /* JADX INFO: renamed from: b */
    public final void mo134883b(View view, zzfok zzfokVar, @Nullable String str) {
        wfw0 wfw0Var;
        if (this.f126520g) {
            return;
        }
        if (!f126513i.matcher("Ad overlay").matches()) {
            wg3.m206174a("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            return;
        }
        Iterator it = this.f126516c.iterator();
        do {
            if (!it.hasNext()) {
                wfw0Var = null;
                break;
            }
            wfw0Var = (wfw0) it.next();
        } while (wfw0Var.m206167b().get() != view);
        if (wfw0Var == null) {
            this.f126516c.add(new wfw0(view, zzfokVar, "Ad overlay"));
        }
    }

    @Override // p153l.hfw0
    /* JADX INFO: renamed from: c */
    public final void mo134884c() {
        if (this.f126520g) {
            return;
        }
        this.f126517d.clear();
        if (!this.f126520g) {
            this.f126516c.clear();
        }
        this.f126520g = true;
        dgw0.m115758a().m115761c(this.f126518e.m149764a());
        tfw0.m190995a().m190999e(this);
        this.f126518e.mo149766c();
        this.f126518e = null;
    }

    @Override // p153l.hfw0
    /* JADX INFO: renamed from: d */
    public final void mo134885d(View view) {
        if (this.f126520g || m149626f() == view) {
            return;
        }
        m149631k(view);
        this.f126518e.m149765b();
        Collection<kfw0> collectionM190997c = tfw0.m190995a().m190997c();
        if (collectionM190997c == null || collectionM190997c.isEmpty()) {
            return;
        }
        for (kfw0 kfw0Var : collectionM190997c) {
            if (kfw0Var != this && kfw0Var.m149626f() == view) {
                kfw0Var.f126517d.clear();
            }
        }
    }

    @Override // p153l.hfw0
    /* JADX INFO: renamed from: e */
    public final void mo134886e() {
        if (this.f126519f) {
            return;
        }
        this.f126519f = true;
        tfw0.m190995a().m191000f(this);
        this.f126518e.m149772i(egw0.m120810c().m120812b());
        this.f126518e.m149768e(rfw0.m181309b().m181310c());
        this.f126518e.mo149770g(this, this.f126514a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public final View m149626f() {
        return (View) this.f126517d.get();
    }

    /* JADX INFO: renamed from: g */
    public final kgw0 m149627g() {
        return this.f126518e;
    }

    /* JADX INFO: renamed from: h */
    public final String m149628h() {
        return this.f126521h;
    }

    /* JADX INFO: renamed from: i */
    public final List m149629i() {
        return this.f126516c;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m149630j() {
        return this.f126519f && !this.f126520g;
    }

    /* JADX INFO: renamed from: k */
    public final void m149631k(View view) {
        this.f126517d = new nhw0(view);
    }
}
