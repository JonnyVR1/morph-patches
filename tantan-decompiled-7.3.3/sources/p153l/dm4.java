package p153l;

import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.ContainerLabelsType;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class dm4 extends AbstractC17382h4 {
    public dm4(rql rqlVar, User user, CoreSuggested.UserInfo userInfo) {
        super(rqlVar, user, userInfo);
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: c */
    public boolean mo116206c() {
        User user = this.f107713a;
        return (user == null || user.isMe()) ? false : true;
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: d */
    public String mo116207d() {
        return ContainerLabelsType.like_you;
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: h */
    public boolean mo116209h() {
        boolean z = false;
        if (!this.f107713a.superLikedMe() && !this.f107713a.letter() && NullChecker.m82486a(this.f107714b) && NullChecker.m82486a(this.f107714b.cardInfos) && !bnl0.m105529O0(this.f107715c.mo37936t0()) && ((this.f107715c.m182643o() == null || !bnl0.m105529O0(this.f107715c.m182643o())) && this.f107714b.cardInfos.momentLikedYou)) {
            z = true;
            bnl0.m105524M(this.f107715c.mo37936t0(), true);
            this.f107715c.mo37936t0().setTypeface(lyh0.m156283c(3), 1);
            this.f107715c.mo37936t0().setText(this.f107713a.isFemale() ? "她喜欢了你" : "他喜欢了你");
        }
        return z;
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: a */
    public void mo116205a() {
    }
}
