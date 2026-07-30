package p149l;

import android.view.View;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.util.CertificationUtil;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class ej4 extends AbstractC17222h4 {
    public ej4(gol golVar, User user, CoreSuggested.UserInfo userInfo) {
        super(golVar, user, userInfo);
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: c */
    public boolean mo116769c() {
        if (this.f105776c.m127248A() == null) {
            return false;
        }
        xdl0.m208344M(this.f105776c.m127248A(), false);
        this.f105776c.m127248A().removeAllViews();
        return this.f105774a.isIdCardVerified() || this.f105774a.isPicVerificationVerified() || this.f105774a.isStudentVerified();
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: d */
    public String mo116770d() {
        return "verified";
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: g */
    public boolean mo116771g() {
        return true;
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: h */
    public boolean mo116772h() {
        View viewM58148g = CertificationUtil.m58148g((Act) this.f105776c.getCardView().getContext(), this.f105774a, CertificationUtil.CertificationIconStyle.CARD, upa.m194665L3());
        if (!NullChecker.m81303a(viewM58148g) || !NullChecker.m81303a(this.f105776c.m127248A())) {
            return false;
        }
        xdl0.m208329E0(viewM58148g, new View.OnClickListener() { // from class: l.dj4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f86503a.m116773l(view);
            }
        });
        this.f105776c.m127248A().addView(viewM58148g);
        xdl0.m208344M(this.f105776c.m127248A(), true);
        m116774m();
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m116773l(View view) {
        if ((this.f105776c.mo36839O() && this.f105774a.isMe()) || upa.m194665L3()) {
            CertificationUtil.m58151j((Act) this.f105776c.getCardView().getContext(), this.f105774a);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m116774m() {
        String str;
        if (this.f105774a.isIdAndPicBothVerified()) {
            str = "both";
        } else if (this.f105774a.isPicVerificationVerified()) {
            str = "avatar";
        } else if (this.f105774a.isIdCardVerified()) {
            str = AuthenticationTokenClaims.JSON_KEY_NAME;
        } else {
            str = this.f105774a.isStudentVerified() ? "student" : null;
        }
        if (str == null) {
            return;
        }
        zvf0.m220368A("e_suggest_users_home_view_verification", m129197e(), vwb.m200311Y("verification", str));
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: a */
    public void mo116768a() {
    }
}
