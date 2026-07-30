package p153l;

import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.p058ui.home.VirtualCard;
import com.p051p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public class vxl0 implements xql {

    /* JADX INFO: renamed from: a */
    public CoreSuggested.UserInfo f186280a;

    /* JADX INFO: renamed from: b */
    public VirtualCard f186281b;

    /* JADX INFO: renamed from: c */
    public ik4 f186282c;

    public vxl0(CoreSuggested.UserInfo userInfo, VirtualCard virtualCard) {
        this.f186280a = userInfo;
        this.f186281b = virtualCard;
    }

    @Override // p153l.xql
    /* JADX INFO: renamed from: e0 */
    public boolean mo37886e0() {
        return false;
    }

    @Override // p153l.xql
    public ik4 getCardDataProxy() {
        if (this.f186282c == null) {
            ik4 ik4Var = new ik4(this.f186281b);
            this.f186282c = ik4Var;
            ik4Var.m140263h(new ik4.C17729a());
        }
        this.f186282c.m140265j(this.f186280a);
        this.f186282c.m140264i(null);
        this.f186282c.m140257b().m140267b();
        return this.f186282c;
    }

    @Override // p153l.xql
    public CoreMomentInfo getMomentInfoProxy() {
        return null;
    }

    @Override // p153l.xql
    public int getShowPictureIndexProxy() {
        return 0;
    }

    @Override // p153l.lql
    public CoreSuggested.UserInfo getUserInfoProxy() {
        return this.f186280a;
    }

    @Override // p153l.xql
    public User getUserProxy() {
        return null;
    }

    @Override // p153l.xql
    /* JADX INFO: renamed from: z */
    public boolean mo37953z() {
        return false;
    }

    @Override // p153l.xql
    /* JADX INFO: renamed from: j0 */
    public void mo37901j0(SwipeDirection swipeDirection) {
    }
}
