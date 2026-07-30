package p006l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import l.ove;
import l.s7m;
import l.xdl0;
import v.VButton;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class nve implements s7m<mve> {

    /* JADX INFO: renamed from: a */
    public VButton f17889a;

    /* JADX INFO: renamed from: b */
    public Act f17890b;

    /* JADX INFO: renamed from: c */
    public mve f17891c;

    public nve(Act act) {
        this.f17890b = act;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m20224C0() {
        return this.f17890b;
    }

    /* JADX INFO: renamed from: a */
    public View m20225a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ove.b(this, layoutInflater, viewGroup);
    }

    @Nullable
    public Act act() {
        return this.f17890b;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m20227i1(mve mveVar) {
        this.f17891c = mveVar;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m20225a(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m20228r() {
        xdl0.E0(this.f17889a, this.f17891c.m19527i0());
    }

    public void destroy() {
    }
}
