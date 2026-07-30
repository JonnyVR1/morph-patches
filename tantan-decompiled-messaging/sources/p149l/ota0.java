package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.data.User;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ota0 extends xf90 {

    /* JADX INFO: renamed from: v */
    public RelativeLayout f145555v;

    /* JADX INFO: renamed from: w */
    public VImage f145556w;

    /* JADX INFO: renamed from: x */
    public VImage f145557x;

    /* JADX INFO: renamed from: y */
    public VText f145558y;

    public ota0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    @Override // p149l.xf90
    /* JADX INFO: renamed from: S */
    public boolean mo102271S() {
        boolean zMo51075P1 = mo52800O().mo51075P1();
        if (mo52800O().mo51053D2() && zMo51075P1) {
            return false;
        }
        User userMo51069K2 = mo52800O().mo51069K2();
        mo52800O().mo52295me();
        if (zMo51075P1) {
            return false;
        }
        boolean z = userMo51069K2.profile.studies.verified;
        return false;
    }

    /* JADX INFO: renamed from: W */
    public View m165930W(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pta0.m171305b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: X */
    public final void m165931X(User user) {
        boolean zMo51053D2 = mo52800O().mo51053D2();
        boolean zMo51075P1 = mo52800O().mo51075P1();
        mo52800O().mo52295me();
        if (zMo51053D2 && zMo51075P1) {
            xdl0.m208344M(this.f145555v, false);
            return;
        }
        if (zMo51075P1) {
            xdl0.m208344M(this.f145555v, false);
            return;
        }
        boolean z = user.profile.studies.verified;
        RelativeLayout relativeLayout = this.f145555v;
        if (z) {
            xdl0.m208344M(relativeLayout, false);
        } else {
            xdl0.m208344M(relativeLayout, false);
        }
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
    }

    @Override // p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return m165930W(mo52800O().mo94568H2(), viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        m165931X(mo52800O().mo51069K2());
    }
}
