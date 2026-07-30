package p009l;

import android.view.View;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.util.CertificationUtil;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.j760;
import l.upa;
import l.vwb;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ej4 extends AbstractC0925h4 {
    public ej4(gol golVar, User user, CoreSuggested.UserInfo userInfo) {
        super(golVar, user, userInfo);
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: c */
    public boolean mo13954c() {
        if (this.f13856c.m15115A() == null) {
            return false;
        }
        xdl0.M(this.f13856c.m15115A(), false);
        this.f13856c.m15115A().removeAllViews();
        return this.f13854a.isIdCardVerified() || this.f13854a.isPicVerificationVerified() || this.f13854a.isStudentVerified();
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: d */
    public String mo13955d() {
        return "verified";
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: g */
    public boolean mo13956g() {
        return true;
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: h */
    public boolean mo13957h() {
        View viewG = CertificationUtil.g(this.f13856c.getCardView().getContext(), this.f13854a, CertificationUtil.CertificationIconStyle.CARD, upa.L3());
        if (!NullChecker.a(viewG) || !NullChecker.a(this.f13856c.m15115A())) {
            return false;
        }
        xdl0.E0(viewG, new View.OnClickListener() { // from class: l.dj4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11856a.m13958l(view);
            }
        });
        this.f13856c.m15115A().addView(viewG);
        xdl0.M(this.f13856c.m15115A(), true);
        m13959m();
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m13958l(View view) {
        if ((this.f13856c.mo796O() && this.f13854a.isMe()) || upa.L3()) {
            CertificationUtil.j(this.f13856c.getCardView().getContext(), this.f13854a);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m13959m() {
        String str;
        if (this.f13854a.isIdAndPicBothVerified()) {
            str = "both";
        } else if (this.f13854a.isPicVerificationVerified()) {
            str = "avatar";
        } else if (this.f13854a.isIdCardVerified()) {
            str = "name";
        } else {
            str = this.f13854a.isStudentVerified() ? "student" : null;
        }
        if (str == null) {
            return;
        }
        zvf0.A("e_suggest_users_home_view_verification", m15390e(), new j760[]{vwb.Y("verification", str)});
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: a */
    public void mo13953a() {
    }
}
