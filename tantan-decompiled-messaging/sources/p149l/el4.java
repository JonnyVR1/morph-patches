package p149l;

import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.ContainerLabelsType;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class el4 extends AbstractC17222h4 {
    public el4(gol golVar, User user, CoreSuggested.UserInfo userInfo) {
        super(golVar, user, userInfo);
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: c */
    public boolean mo116769c() {
        User user = this.f105774a;
        return (user == null || user.isMe()) ? false : true;
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: d */
    public String mo116770d() {
        return ContainerLabelsType.like_you;
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: h */
    public boolean mo116772h() {
        boolean z = false;
        if (!this.f105774a.superLikedMe() && !this.f105774a.letter() && NullChecker.m81303a(this.f105775b) && NullChecker.m81303a(this.f105775b.cardInfos) && !xdl0.m208349O0(this.f105776c.mo36933t0()) && ((this.f105776c.m127250o() == null || !xdl0.m208349O0(this.f105776c.m127250o())) && this.f105775b.cardInfos.momentLikedYou)) {
            z = true;
            xdl0.m208344M(this.f105776c.mo36933t0(), true);
            this.f105776c.mo36933t0().setTypeface(eqh0.m117752c(3), 1);
            this.f105776c.mo36933t0().setText(this.f105774a.isFemale() ? "她喜欢了你" : "他喜欢了你");
        }
        return z;
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: a */
    public void mo116768a() {
    }
}
