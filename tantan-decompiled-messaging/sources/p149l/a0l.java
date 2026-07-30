package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveHideAvatarEnterConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveRightItem;
import com.p046p1.mobile.putong.live.external.page.setting.hideavatar.view.HideAvatarItemView;

/* JADX INFO: loaded from: classes13.dex */
public class a0l extends x660<HideAvatarItemView> {

    /* JADX INFO: renamed from: a */
    public final BLiveRightItem f67049a;

    /* JADX INFO: renamed from: b */
    public final BLiveHideAvatarEnterConfig f67050b;

    /* JADX INFO: renamed from: c */
    public final int f67051c;

    public a0l(BLiveRightItem bLiveRightItem, BLiveHideAvatarEnterConfig bLiveHideAvatarEnterConfig, int i) {
        this.f67049a = bLiveRightItem;
        this.f67050b = bLiveHideAvatarEnterConfig;
        this.f67051c = i;
    }

    @Override // p149l.x660
    /* JADX INFO: renamed from: b */
    public int mo94433b() {
        return s6c0.f162650A0;
    }

    /* JADX INFO: renamed from: c */
    public void m94434c() {
        this.f67049a.status = "equipped";
    }

    /* JADX INFO: renamed from: d */
    public void m94435d() {
        this.f67049a.status = BLiveRightItem.STATUS_ACTIVATED;
    }

    /* JADX INFO: renamed from: e */
    public BLiveHideAvatarEnterConfig m94436e() {
        return this.f67050b;
    }

    /* JADX INFO: renamed from: f */
    public int m94437f() {
        return this.f67051c;
    }

    /* JADX INFO: renamed from: g */
    public BLiveRightItem m94438g() {
        return this.f67049a;
    }

    /* JADX INFO: renamed from: h */
    public boolean m94439h() {
        return this.f67049a.isActive();
    }

    /* JADX INFO: renamed from: i */
    public boolean m94440i() {
        return this.f67049a.isEquipped();
    }

    /* JADX INFO: renamed from: j */
    public boolean m94441j() {
        return this.f67049a.isGray();
    }

    /* JADX INFO: renamed from: k */
    public boolean m94442k() {
        return this.f67049a.isLocked();
    }
}
