package p009l;

import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.ui.home.VirtualCard;
import com.p1.mobile.putong.data.User;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class rol0 implements mol {

    /* JADX INFO: renamed from: a */
    public CoreSuggested.UserInfo f19930a;

    /* JADX INFO: renamed from: b */
    public VirtualCard f19931b;

    /* JADX INFO: renamed from: c */
    public jj4 f19932c;

    public rol0(CoreSuggested.UserInfo userInfo, VirtualCard virtualCard) {
        this.f19930a = userInfo;
        this.f19931b = virtualCard;
    }

    @Override // p009l.mol
    /* JADX INFO: renamed from: e0 */
    public boolean mo844e0() {
        return false;
    }

    @Override // p009l.mol
    public jj4 getCardDataProxy() {
        if (this.f19932c == null) {
            jj4 jj4Var = new jj4(this.f19931b);
            this.f19932c = jj4Var;
            jj4Var.m17134h(new jj4.C0976a());
        }
        this.f19932c.m17136j(this.f19930a);
        this.f19932c.m17135i(null);
        this.f19932c.m17128b().m17138b();
        return this.f19932c;
    }

    @Override // p009l.mol
    public CoreMomentInfo getMomentInfoProxy() {
        return null;
    }

    @Override // p009l.mol
    public int getShowPictureIndexProxy() {
        return 0;
    }

    @Override // p009l.aol
    public CoreSuggested.UserInfo getUserInfoProxy() {
        return this.f19930a;
    }

    @Override // p009l.mol
    public User getUserProxy() {
        return null;
    }

    @Override // p009l.mol
    /* JADX INFO: renamed from: z */
    public boolean mo917z() {
        return false;
    }

    @Override // p009l.mol
    /* JADX INFO: renamed from: j0 */
    public void mo861j0(SwipeDirection swipeDirection) {
    }
}
