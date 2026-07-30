package p149l;

import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.p053ui.home.VirtualCard;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public class rol0 implements mol {

    /* JADX INFO: renamed from: a */
    public CoreSuggested.UserInfo f160394a;

    /* JADX INFO: renamed from: b */
    public VirtualCard f160395b;

    /* JADX INFO: renamed from: c */
    public jj4 f160396c;

    public rol0(CoreSuggested.UserInfo userInfo, VirtualCard virtualCard) {
        this.f160394a = userInfo;
        this.f160395b = virtualCard;
    }

    @Override // p149l.mol
    /* JADX INFO: renamed from: e0 */
    public boolean mo36883e0() {
        return false;
    }

    @Override // p149l.mol
    public jj4 getCardDataProxy() {
        if (this.f160396c == null) {
            jj4 jj4Var = new jj4(this.f160395b);
            this.f160396c = jj4Var;
            jj4Var.m141749h(new jj4.C17798a());
        }
        this.f160396c.m141751j(this.f160394a);
        this.f160396c.m141750i(null);
        this.f160396c.m141743b().m141753b();
        return this.f160396c;
    }

    @Override // p149l.mol
    public CoreMomentInfo getMomentInfoProxy() {
        return null;
    }

    @Override // p149l.mol
    public int getShowPictureIndexProxy() {
        return 0;
    }

    @Override // p149l.aol
    public CoreSuggested.UserInfo getUserInfoProxy() {
        return this.f160394a;
    }

    @Override // p149l.mol
    public User getUserProxy() {
        return null;
    }

    @Override // p149l.mol
    /* JADX INFO: renamed from: z */
    public boolean mo36950z() {
        return false;
    }

    @Override // p149l.mol
    /* JADX INFO: renamed from: j0 */
    public void mo36898j0(SwipeDirection swipeDirection) {
    }
}
