package p149l;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import org.jetbrains.annotations.NotNull;
import p147v.VText_Tags;

/* JADX INFO: loaded from: classes4.dex */
public class dne extends cne {

    /* JADX INFO: renamed from: L */
    public kq90 f87056L;

    public dne(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f87056L = new kq90();
    }

    @Override // p149l.cne, p149l.wq90, p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        this.f87056L.f124228b.setTypeface(Typeface.DEFAULT_BOLD);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: k */
    public boolean mo52385k() {
        return false;
    }

    @Override // p149l.wq90, p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        View viewM146930a = this.f87056L.m146930a(mo52800O().mo94568H2(), viewGroup);
        kq90 kq90Var = this.f87056L;
        this.f187664u = kq90Var.f124227a;
        VText_Tags vText_Tags = kq90Var.f124230d;
        this.f187666w = vText_Tags;
        this.f187667x = kq90Var.f124233g;
        this.f187668y = kq90Var.f124236j;
        this.f187669z = kq90Var.f124239m;
        this.f187653A = kq90Var.f124242p;
        this.f187654B = kq90Var.f124245s;
        this.f187665v = kq90Var.f124228b;
        m96409E(vText_Tags, kq90Var.f124229c);
        m96409E(this.f187667x, this.f87056L.f124232f);
        m96409E(this.f187668y, this.f87056L.f124235i);
        m96409E(this.f187653A, this.f87056L.f124241o);
        m96409E(this.f187654B, this.f87056L.f124244r);
        m96409E(this.f187669z, this.f87056L.f124238l);
        m96408D(this.f187666w, this.f87056L.f124229c);
        m96408D(this.f187667x, this.f87056L.f124232f);
        m96408D(this.f187668y, this.f87056L.f124235i);
        m96408D(this.f187653A, this.f87056L.f124241o);
        m96408D(this.f187654B, this.f87056L.f124244r);
        m96408D(this.f187669z, this.f87056L.f124238l);
        return viewM146930a;
    }

    @Override // p149l.cne, p149l.wq90, p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        super.mo52731t();
        mra0.m156024c(this.f187666w, this.f87056L.f124231e);
        mra0.m156024c(this.f187667x, this.f87056L.f124234h);
        mra0.m156024c(this.f187668y, this.f87056L.f124237k);
        mra0.m156024c(this.f187669z, this.f87056L.f124240n);
        mra0.m156024c(this.f187653A, this.f87056L.f124243q);
        mra0.m156024c(this.f187654B, this.f87056L.f124246t);
    }
}
