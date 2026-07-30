package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.data.User;
import l.mcr;
import l.pta0;
import l.xdl0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ota0 extends xf90 {

    /* JADX INFO: renamed from: v */
    public RelativeLayout f16778v;

    /* JADX INFO: renamed from: w */
    public VImage f16779w;

    /* JADX INFO: renamed from: x */
    public VImage f16780x;

    /* JADX INFO: renamed from: y */
    public VText f16781y;

    public ota0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    @Override // p002l.xf90
    /* JADX INFO: renamed from: S */
    public boolean mo10392S() {
        boolean zMo1523P1 = mo3351O().mo1523P1();
        if (mo3351O().mo1501D2() && zMo1523P1) {
            return false;
        }
        User userMo1517K2 = mo3351O().mo1517K2();
        mo3351O().mo2827me();
        if (zMo1523P1) {
            return false;
        }
        boolean z = userMo1517K2.profile.studies.verified;
        return false;
    }

    /* JADX INFO: renamed from: W */
    public View m19742W(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pta0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: X */
    public final void m19743X(User user) {
        boolean zMo1501D2 = mo3351O().mo1501D2();
        boolean zMo1523P1 = mo3351O().mo1523P1();
        mo3351O().mo2827me();
        if (zMo1501D2 && zMo1523P1) {
            xdl0.M(this.f16778v, false);
            return;
        }
        if (zMo1523P1) {
            xdl0.M(this.f16778v, false);
            return;
        }
        boolean z = user.profile.studies.verified;
        RelativeLayout relativeLayout = this.f16778v;
        if (z) {
            xdl0.M(relativeLayout, false);
        } else {
            xdl0.M(relativeLayout, false);
        }
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
    }

    @Override // p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return m19742W(mo3351O().mo9267H2(), viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        m19743X(mo3351O().mo1517K2());
    }
}
