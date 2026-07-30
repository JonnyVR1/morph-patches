package p153l;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import org.jetbrains.annotations.NotNull;
import p151v.VText_Tags;

/* JADX INFO: loaded from: classes4.dex */
public class hoe extends goe {

    /* JADX INFO: renamed from: L */
    public oy90 f110897L;

    public hoe(@NonNull @NotNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
        this.f110897L = new oy90();
    }

    @Override // p153l.goe, p153l.az90, p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        this.f110897L.f149760b.setTypeface(Typeface.DEFAULT_BOLD);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: k */
    public boolean mo53568k() {
        return false;
    }

    @Override // p153l.az90, p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        View viewM169835a = this.f110897L.m169835a(mo53983O().mo146493H2(), viewGroup);
        oy90 oy90Var = this.f110897L;
        this.f74114u = oy90Var.f149759a;
        VText_Tags vText_Tags = oy90Var.f149762d;
        this.f74116w = vText_Tags;
        this.f74117x = oy90Var.f149765g;
        this.f74118y = oy90Var.f149768j;
        this.f74119z = oy90Var.f149771m;
        this.f74103A = oy90Var.f149774p;
        this.f74104B = oy90Var.f149777s;
        this.f74115v = oy90Var.f149760b;
        m121834E(vText_Tags, oy90Var.f149761c);
        m121834E(this.f74117x, this.f110897L.f149764f);
        m121834E(this.f74118y, this.f110897L.f149767i);
        m121834E(this.f74103A, this.f110897L.f149773o);
        m121834E(this.f74104B, this.f110897L.f149776r);
        m121834E(this.f74119z, this.f110897L.f149770l);
        m121833D(this.f74116w, this.f110897L.f149761c);
        m121833D(this.f74117x, this.f110897L.f149764f);
        m121833D(this.f74118y, this.f110897L.f149767i);
        m121833D(this.f74103A, this.f110897L.f149773o);
        m121833D(this.f74104B, this.f110897L.f149776r);
        m121833D(this.f74119z, this.f110897L.f149770l);
        return viewM169835a;
    }

    @Override // p153l.goe, p153l.az90, p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        super.mo53914t();
        qza0.m178767c(this.f74116w, this.f110897L.f149763e);
        qza0.m178767c(this.f74117x, this.f110897L.f149766h);
        qza0.m178767c(this.f74118y, this.f110897L.f149769k);
        qza0.m178767c(this.f74119z, this.f110897L.f149772n);
        qza0.m178767c(this.f74103A, this.f110897L.f149775q);
        qza0.m178767c(this.f74104B, this.f110897L.f149778t);
    }
}
