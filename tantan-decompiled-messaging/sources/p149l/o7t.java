package p149l;

import com.p046p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class o7t {

    /* JADX INFO: renamed from: a */
    public LongLinkAdminMessage.UserWithBgColorSocketNotification f142540a;

    public o7t(LongLinkAdminMessage.UserWithBgColorSocketNotification userWithBgColorSocketNotification) {
        this.f142540a = userWithBgColorSocketNotification;
    }

    /* JADX INFO: renamed from: a */
    public LongLinkAdminMessage.BgStyle m163049a() {
        return this.f142540a.getBgStyle();
    }

    /* JADX INFO: renamed from: b */
    public String m163050b() {
        return this.f142540a.getContent();
    }

    /* JADX INFO: renamed from: c */
    public LongLinkAdminMessage.IconStyle m163051c() {
        return this.f142540a.getIcon();
    }

    /* JADX INFO: renamed from: d */
    public LongLinkAdminMessage.JumpStyle m163052d() {
        return this.f142540a.getJump();
    }

    /* JADX INFO: renamed from: e */
    public boolean m163053e() {
        return this.f142540a.getMoveUp();
    }

    /* JADX INFO: renamed from: f */
    public long m163054f() {
        return this.f142540a.getShowSeconds();
    }

    /* JADX INFO: renamed from: g */
    public String m163055g() {
        return this.f142540a.getType();
    }

    /* JADX INFO: renamed from: h */
    public boolean m163056h() {
        return this.f142540a.hasBgStyle();
    }

    /* JADX INFO: renamed from: i */
    public boolean m163057i() {
        return this.f142540a.hasIcon();
    }

    /* JADX INFO: renamed from: j */
    public boolean m163058j() {
        return this.f142540a.hasJump();
    }

    /* JADX INFO: renamed from: k */
    public boolean m163059k() {
        return this.f142540a.getIsCountdown();
    }

    /* JADX INFO: renamed from: l */
    public boolean m163060l() {
        return this.f142540a.getIsFixed();
    }

    /* JADX INFO: renamed from: m */
    public LiveMessage m163061m() {
        return LiveMessage.create().setNotificationMessage(this);
    }
}
