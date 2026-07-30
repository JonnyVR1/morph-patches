package p149l;

import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.data.User;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class i4n extends AbstractC17222h4 {
    public i4n(gol golVar, User user, CoreSuggested.UserInfo userInfo) {
        super(golVar, user, userInfo);
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: c */
    public boolean mo116769c() {
        User user = this.f105774a;
        return (user == null || user.isMe()) ? false : true;
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: h */
    public boolean mo116772h() {
        String string;
        if (xdl0.m208349O0(this.f105776c.mo36909m0())) {
            return false;
        }
        CoreSuggested.UserInfo userInfo = this.f105775b;
        if (!userInfo.hasLikeMeSlideCardTop) {
            return false;
        }
        q8p.Companion companion = q8p.INSTANCE;
        if (!companion.m173439n(userInfo, this.f105774a) && !companion.m173438m(this.f105775b)) {
            if (this.f105776c.mo36912n0() != null) {
                xdl0.m208344M(this.f105776c.mo36912n0(), false);
            }
            xdl0.m208344M(this.f105776c.mo36933t0(), true);
            this.f105776c.mo36933t0().setTypeface(eqh0.m117752c(3), 1);
            VText vTextMo36933t0 = this.f105776c.mo36933t0();
            if (this.f105774a.isNonBinary()) {
                string = this.f105776c.getCardView().getContext().getString(R$string.f19124zf);
            } else {
                boolean zIsFemale = this.f105774a.isFemale();
                gol golVar = this.f105776c;
                string = zIsFemale ? golVar.getCardView().getContext().getString(R$string.f18149Tc) : golVar.getCardView().getContext().getString(R$string.f18119Sc);
            }
            vTextMo36933t0.setText(string);
        } else {
            if (this.f105776c.mo36912n0() == null) {
                return false;
            }
            xdl0.m208344M(this.f105776c.mo36912n0(), true);
            this.f105776c.mo36912n0().setTypeface(eqh0.m117752c(3), 1);
        }
        this.f105776c.mo36894i0();
        return true;
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: a */
    public void mo116768a() {
    }
}
