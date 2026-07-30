package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveHideAvatarEnterConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveRightItem;
import com.p051p1.mobile.putong.live.external.page.setting.hideavatar.view.HideAvatarItemView;

/* JADX INFO: loaded from: classes9.dex */
public class q2l extends df60<HideAvatarItemView> {

    /* JADX INFO: renamed from: a */
    public final BLiveRightItem f155349a;

    /* JADX INFO: renamed from: b */
    public final BLiveHideAvatarEnterConfig f155350b;

    /* JADX INFO: renamed from: c */
    public final int f155351c;

    public q2l(BLiveRightItem bLiveRightItem, BLiveHideAvatarEnterConfig bLiveHideAvatarEnterConfig, int i) {
        this.f155349a = bLiveRightItem;
        this.f155350b = bLiveHideAvatarEnterConfig;
        this.f155351c = i;
    }

    @Override // p153l.df60
    /* JADX INFO: renamed from: b */
    public int mo115506b() {
        return xec0.f193764A0;
    }

    /* JADX INFO: renamed from: c */
    public void m175044c() {
        this.f155349a.status = "equipped";
    }

    /* JADX INFO: renamed from: d */
    public void m175045d() {
        this.f155349a.status = BLiveRightItem.STATUS_ACTIVATED;
    }

    /* JADX INFO: renamed from: e */
    public BLiveHideAvatarEnterConfig m175046e() {
        return this.f155350b;
    }

    /* JADX INFO: renamed from: f */
    public int m175047f() {
        return this.f155351c;
    }

    /* JADX INFO: renamed from: g */
    public BLiveRightItem m175048g() {
        return this.f155349a;
    }

    /* JADX INFO: renamed from: h */
    public boolean m175049h() {
        return this.f155349a.isActive();
    }

    /* JADX INFO: renamed from: i */
    public boolean m175050i() {
        return this.f155349a.isEquipped();
    }

    /* JADX INFO: renamed from: j */
    public boolean m175051j() {
        return this.f155349a.isGray();
    }

    /* JADX INFO: renamed from: k */
    public boolean m175052k() {
        return this.f155349a.isLocked();
    }
}
