package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class o7t {

    /* JADX INFO: renamed from: a */
    public LongLinkAdminMessage.UserWithBgColorSocketNotification f16423a;

    public o7t(LongLinkAdminMessage.UserWithBgColorSocketNotification userWithBgColorSocketNotification) {
        this.f16423a = userWithBgColorSocketNotification;
    }

    /* JADX INFO: renamed from: a */
    public LongLinkAdminMessage.BgStyle m19277a() {
        return this.f16423a.getBgStyle();
    }

    /* JADX INFO: renamed from: b */
    public String m19278b() {
        return this.f16423a.getContent();
    }

    /* JADX INFO: renamed from: c */
    public LongLinkAdminMessage.IconStyle m19279c() {
        return this.f16423a.getIcon();
    }

    /* JADX INFO: renamed from: d */
    public LongLinkAdminMessage.JumpStyle m19280d() {
        return this.f16423a.getJump();
    }

    /* JADX INFO: renamed from: e */
    public boolean m19281e() {
        return this.f16423a.getMoveUp();
    }

    /* JADX INFO: renamed from: f */
    public long m19282f() {
        return this.f16423a.getShowSeconds();
    }

    /* JADX INFO: renamed from: g */
    public String m19283g() {
        return this.f16423a.getType();
    }

    /* JADX INFO: renamed from: h */
    public boolean m19284h() {
        return this.f16423a.hasBgStyle();
    }

    /* JADX INFO: renamed from: i */
    public boolean m19285i() {
        return this.f16423a.hasIcon();
    }

    /* JADX INFO: renamed from: j */
    public boolean m19286j() {
        return this.f16423a.hasJump();
    }

    /* JADX INFO: renamed from: k */
    public boolean m19287k() {
        return this.f16423a.getIsCountdown();
    }

    /* JADX INFO: renamed from: l */
    public boolean m19288l() {
        return this.f16423a.getIsFixed();
    }

    /* JADX INFO: renamed from: m */
    public LiveMessage m19289m() {
        return LiveMessage.create().setNotificationMessage(this);
    }
}
