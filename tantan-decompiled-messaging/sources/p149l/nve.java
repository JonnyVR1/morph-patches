package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import p147v.VButton;

/* JADX INFO: loaded from: classes9.dex */
public class nve implements s7m<mve> {

    /* JADX INFO: renamed from: a */
    public VButton f140708a;

    /* JADX INFO: renamed from: b */
    public Act f140709b;

    /* JADX INFO: renamed from: c */
    public mve f140710c;

    public nve(Act act) {
        this.f140709b = act;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo21062C0() {
        return this.f140709b;
    }

    /* JADX INFO: renamed from: a */
    public View m161593a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ove.m166171b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f140709b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(mve mveVar) {
        this.f140710c = mveVar;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m161593a(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m161595r() {
        xdl0.m208329E0(this.f140708a, this.f140710c.m156485i0());
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
