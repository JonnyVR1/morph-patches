package p009l;

import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.data.User;
import l.eqh0;
import l.q8p;
import l.xdl0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class i4n extends AbstractC0925h4 {
    public i4n(gol golVar, User user, CoreSuggested.UserInfo userInfo) {
        super(golVar, user, userInfo);
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: c */
    public boolean mo13954c() {
        User user = this.f13854a;
        return (user == null || user.isMe()) ? false : true;
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: h */
    public boolean mo13957h() {
        String string;
        if (xdl0.O0(this.f13856c.mo873m0())) {
            return false;
        }
        CoreSuggested.UserInfo userInfo = this.f13855b;
        if (!userInfo.hasLikeMeSlideCardTop) {
            return false;
        }
        q8p.a aVar = q8p.Companion;
        if (!aVar.n(userInfo, this.f13854a) && !aVar.m(this.f13855b)) {
            if (this.f13856c.mo876n0() != null) {
                xdl0.M(this.f13856c.mo876n0(), false);
            }
            xdl0.M(this.f13856c.mo899t0(), true);
            this.f13856c.mo899t0().setTypeface(eqh0.c(3), 1);
            VText vTextMo899t0 = this.f13856c.mo899t0();
            if (this.f13854a.isNonBinary()) {
                string = this.f13856c.getCardView().getContext().getString(R.string.zf);
            } else {
                boolean zIsFemale = this.f13854a.isFemale();
                gol golVar = this.f13856c;
                string = zIsFemale ? golVar.getCardView().getContext().getString(R.string.Tc) : golVar.getCardView().getContext().getString(R.string.Sc);
            }
            vTextMo899t0.setText(string);
        } else {
            if (this.f13856c.mo876n0() == null) {
                return false;
            }
            xdl0.M(this.f13856c.mo876n0(), true);
            this.f13856c.mo876n0().setTypeface(eqh0.c(3), 1);
        }
        this.f13856c.mo857i0();
        return true;
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: a */
    public void mo13953a() {
    }
}
