package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.data.User;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class s1b0 extends bo90 {

    /* JADX INFO: renamed from: v */
    public RelativeLayout f165765v;

    /* JADX INFO: renamed from: w */
    public VImage f165766w;

    /* JADX INFO: renamed from: x */
    public VImage f165767x;

    /* JADX INFO: renamed from: y */
    public VText f165768y;

    public s1b0(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    @Override // p153l.bo90
    /* JADX INFO: renamed from: S */
    public boolean mo105673S() {
        boolean zMo52258P1 = mo53983O().mo52258P1();
        if (mo53983O().mo52236D2() && zMo52258P1) {
            return false;
        }
        User userMo52252K2 = mo53983O().mo52252K2();
        mo53983O().mo53478me();
        if (zMo52258P1) {
            return false;
        }
        boolean z = userMo52252K2.profile.studies.verified;
        return false;
    }

    /* JADX INFO: renamed from: W */
    public View m184021W(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return t1b0.m188896b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: X */
    public final void m184022X(User user) {
        boolean zMo52236D2 = mo53983O().mo52236D2();
        boolean zMo52258P1 = mo53983O().mo52258P1();
        mo53983O().mo53478me();
        if (zMo52236D2 && zMo52258P1) {
            bnl0.m105524M(this.f165765v, false);
            return;
        }
        if (zMo52258P1) {
            bnl0.m105524M(this.f165765v, false);
            return;
        }
        boolean z = user.profile.studies.verified;
        RelativeLayout relativeLayout = this.f165765v;
        if (z) {
            bnl0.m105524M(relativeLayout, false);
        } else {
            bnl0.m105524M(relativeLayout, false);
        }
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
    }

    @Override // p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return m184021W(mo53983O().mo146493H2(), viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        m184022X(mo53983O().mo52252K2());
    }
}
