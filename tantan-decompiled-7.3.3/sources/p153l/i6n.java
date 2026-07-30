package p153l;

import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.data.User;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class i6n extends AbstractC17382h4 {
    public i6n(rql rqlVar, User user, CoreSuggested.UserInfo userInfo) {
        super(rqlVar, user, userInfo);
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: c */
    public boolean mo116206c() {
        User user = this.f107713a;
        return (user == null || user.isMe()) ? false : true;
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: h */
    public boolean mo116209h() {
        String string;
        if (bnl0.m105529O0(this.f107715c.mo37912m0())) {
            return false;
        }
        CoreSuggested.UserInfo userInfo = this.f107714b;
        if (!userInfo.hasLikeMeSlideCardTop) {
            return false;
        }
        qap.Companion companion = qap.INSTANCE;
        if (!companion.m175976n(userInfo, this.f107713a) && !companion.m175975m(this.f107714b)) {
            if (this.f107715c.mo37915n0() != null) {
                bnl0.m105524M(this.f107715c.mo37915n0(), false);
            }
            bnl0.m105524M(this.f107715c.mo37936t0(), true);
            this.f107715c.mo37936t0().setTypeface(lyh0.m156283c(3), 1);
            VText vTextMo37936t0 = this.f107715c.mo37936t0();
            if (this.f107713a.isNonBinary()) {
                string = this.f107715c.getCardView().getContext().getString(R$string.f18822Rf);
            } else {
                boolean zIsFemale = this.f107713a.isFemale();
                rql rqlVar = this.f107715c;
                string = zIsFemale ? rqlVar.getCardView().getContext().getString(R$string.f19428ld) : rqlVar.getCardView().getContext().getString(R$string.f19397kd);
            }
            vTextMo37936t0.setText(string);
        } else {
            if (this.f107715c.mo37915n0() == null) {
                return false;
            }
            bnl0.m105524M(this.f107715c.mo37915n0(), true);
            this.f107715c.mo37915n0().setTypeface(lyh0.m156283c(3), 1);
        }
        this.f107715c.mo37897i0();
        return true;
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: a */
    public void mo116205a() {
    }
}
