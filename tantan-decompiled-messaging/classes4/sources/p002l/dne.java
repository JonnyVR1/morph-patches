package p002l;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import l.mcr;
import org.jetbrains.annotations.NotNull;
import v.VText_Tags;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class dne extends cne {

    /* JADX INFO: renamed from: L */
    public kq90 f9363L;

    public dne(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f9363L = new kq90();
    }

    @Override // p002l.cne, p002l.wq90, p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        this.f9363L.f14458b.setTypeface(Typeface.DEFAULT_BOLD);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: k */
    public boolean mo2919k() {
        return false;
    }

    @Override // p002l.wq90, p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        View viewM16760a = this.f9363L.m16760a(mo3351O().mo9267H2(), viewGroup);
        kq90 kq90Var = this.f9363L;
        this.f21923u = kq90Var.f14457a;
        VText_Tags vText_Tags = kq90Var.f14460d;
        this.f21925w = vText_Tags;
        this.f21926x = kq90Var.f14463g;
        this.f21927y = kq90Var.f14466j;
        this.f21928z = kq90Var.f14469m;
        this.f21912A = kq90Var.f14472p;
        this.f21913B = kq90Var.f14475s;
        this.f21924v = kq90Var.f14458b;
        m9640E(vText_Tags, kq90Var.f14459c);
        m9640E(this.f21926x, this.f9363L.f14462f);
        m9640E(this.f21927y, this.f9363L.f14465i);
        m9640E(this.f21912A, this.f9363L.f14471o);
        m9640E(this.f21913B, this.f9363L.f14474r);
        m9640E(this.f21928z, this.f9363L.f14468l);
        m9639D(this.f21925w, this.f9363L.f14459c);
        m9639D(this.f21926x, this.f9363L.f14462f);
        m9639D(this.f21927y, this.f9363L.f14465i);
        m9639D(this.f21912A, this.f9363L.f14471o);
        m9639D(this.f21913B, this.f9363L.f14474r);
        m9639D(this.f21928z, this.f9363L.f14468l);
        return viewM16760a;
    }

    @Override // p002l.cne, p002l.wq90, p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        super.mo3282t();
        mra0.m18144c(this.f21925w, this.f9363L.f14461e);
        mra0.m18144c(this.f21926x, this.f9363L.f14464h);
        mra0.m18144c(this.f21927y, this.f9363L.f14467k);
        mra0.m18144c(this.f21928z, this.f9363L.f14470n);
        mra0.m18144c(this.f21912A, this.f9363L.f14473q);
        mra0.m18144c(this.f21913B, this.f9363L.f14476t);
    }
}
