package p153l;

import android.view.View;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.util.CertificationUtil;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class dk4 extends AbstractC17382h4 {
    public dk4(rql rqlVar, User user, CoreSuggested.UserInfo userInfo) {
        super(rqlVar, user, userInfo);
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: c */
    public boolean mo116206c() {
        if (this.f107715c.m182640A() == null) {
            return false;
        }
        bnl0.m105524M(this.f107715c.m182640A(), false);
        this.f107715c.m182640A().removeAllViews();
        return this.f107713a.isIdCardVerified() || this.f107713a.isPicVerificationVerified() || this.f107713a.isStudentVerified();
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: d */
    public String mo116207d() {
        return "verified";
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: g */
    public boolean mo116208g() {
        return true;
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: h */
    public boolean mo116209h() {
        View viewM59331g = CertificationUtil.m59331g((Act) this.f107715c.getCardView().getContext(), this.f107713a, CertificationUtil.CertificationIconStyle.CARD, gra.m131596L3());
        if (!NullChecker.m82486a(viewM59331g) || !NullChecker.m82486a(this.f107715c.m182640A())) {
            return false;
        }
        bnl0.m105509E0(viewM59331g, new View.OnClickListener() { // from class: l.ck4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82263a.m116210l(view);
            }
        });
        this.f107715c.m182640A().addView(viewM59331g);
        bnl0.m105524M(this.f107715c.m182640A(), true);
        m116211m();
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m116210l(View view) {
        if ((this.f107715c.mo37842O() && this.f107713a.isMe()) || gra.m131596L3()) {
            CertificationUtil.m59334j((Act) this.f107715c.getCardView().getContext(), this.f107713a);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m116211m() {
        String str;
        if (this.f107713a.isIdAndPicBothVerified()) {
            str = "both";
        } else if (this.f107713a.isPicVerificationVerified()) {
            str = "avatar";
        } else if (this.f107713a.isIdCardVerified()) {
            str = AuthenticationTokenClaims.JSON_KEY_NAME;
        } else {
            str = this.f107713a.isStudentVerified() ? "student" : null;
        }
        if (str == null) {
            return;
        }
        i4g0.m138492A("e_suggest_users_home_view_verification", m133526e(), jyb.m147494Y("verification", str));
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: a */
    public void mo116205a() {
    }
}
