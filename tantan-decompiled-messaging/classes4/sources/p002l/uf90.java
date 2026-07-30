package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.tantanapp.common.utils.NullChecker;
import l.mcr;
import l.mqi0;
import l.qqi0;
import l.u0n;
import l.u59;
import l.vf90;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class uf90 extends ah90 {

    /* JADX INFO: renamed from: u */
    public VFrame f20607u;

    /* JADX INFO: renamed from: v */
    public int f20608v;

    public uf90(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    @Override // p002l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo3351O() {
        return m14465w();
    }

    /* JADX INFO: renamed from: R */
    public View m23439R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vf90.b(this, layoutInflater, viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: k */
    public boolean mo2919k() {
        return false;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        return u59.i() && NullChecker.a(u0n.l().j(2)) && !mo3351O().mo2827me().isFemale() && !mo3351O().mo2827me().isVIP() && NullChecker.a(mo3351O().mo1517K2()) && mo3351O().mo1517K2().isFemale() && qqi0.h(mqi0.o(), (long) mo3351O().mo2827me().createdTime, u59.j()) && mo3351O().mo2625I1();
    }

    @Override // p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return m23439R(mo3351O().act().inflater(), viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        if (mo3351O().act().hashCode() == this.f20608v || !mo3351O().mo2625I1()) {
            return;
        }
        u0n.l().j(2).j("profileUserId", mo3351O().userId()).h(mo3351O().act(), this.f20607u);
        this.f20608v = mo3351O().act().hashCode();
    }
}
