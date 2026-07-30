package p009l;

import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.eqh0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class el4 extends AbstractC0925h4 {
    public el4(gol golVar, User user, CoreSuggested.UserInfo userInfo) {
        super(golVar, user, userInfo);
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: c */
    public boolean mo13954c() {
        User user = this.f13854a;
        return (user == null || user.isMe()) ? false : true;
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: d */
    public String mo13955d() {
        return "like_you";
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: h */
    public boolean mo13957h() {
        boolean z = false;
        if (!this.f13854a.superLikedMe() && !this.f13854a.letter() && NullChecker.a(this.f13855b) && NullChecker.a(this.f13855b.cardInfos) && !xdl0.O0(this.f13856c.mo899t0()) && ((this.f13856c.m15117o() == null || !xdl0.O0(this.f13856c.m15117o())) && this.f13855b.cardInfos.momentLikedYou)) {
            z = true;
            xdl0.M(this.f13856c.mo899t0(), true);
            this.f13856c.mo899t0().setTypeface(eqh0.c(3), 1);
            this.f13856c.mo899t0().setText(this.f13854a.isFemale() ? "她喜欢了你" : "他喜欢了你");
        }
        return z;
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: a */
    public void mo13953a() {
    }
}
