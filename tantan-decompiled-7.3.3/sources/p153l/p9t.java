package p153l;

import com.p051p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class p9t {

    /* JADX INFO: renamed from: a */
    public LongLinkAdminMessage.UserWithBgColorSocketNotification f151183a;

    public p9t(LongLinkAdminMessage.UserWithBgColorSocketNotification userWithBgColorSocketNotification) {
        this.f151183a = userWithBgColorSocketNotification;
    }

    /* JADX INFO: renamed from: a */
    public LongLinkAdminMessage.BgStyle m171378a() {
        return this.f151183a.getBgStyle();
    }

    /* JADX INFO: renamed from: b */
    public String m171379b() {
        return this.f151183a.getContent();
    }

    /* JADX INFO: renamed from: c */
    public LongLinkAdminMessage.IconStyle m171380c() {
        return this.f151183a.getIcon();
    }

    /* JADX INFO: renamed from: d */
    public LongLinkAdminMessage.JumpStyle m171381d() {
        return this.f151183a.getJump();
    }

    /* JADX INFO: renamed from: e */
    public boolean m171382e() {
        return this.f151183a.getMoveUp();
    }

    /* JADX INFO: renamed from: f */
    public long m171383f() {
        return this.f151183a.getShowSeconds();
    }

    /* JADX INFO: renamed from: g */
    public String m171384g() {
        return this.f151183a.getType();
    }

    /* JADX INFO: renamed from: h */
    public boolean m171385h() {
        return this.f151183a.hasBgStyle();
    }

    /* JADX INFO: renamed from: i */
    public boolean m171386i() {
        return this.f151183a.hasIcon();
    }

    /* JADX INFO: renamed from: j */
    public boolean m171387j() {
        return this.f151183a.hasJump();
    }

    /* JADX INFO: renamed from: k */
    public boolean m171388k() {
        return this.f151183a.getIsCountdown();
    }

    /* JADX INFO: renamed from: l */
    public boolean m171389l() {
        return this.f151183a.getIsFixed();
    }

    /* JADX INFO: renamed from: m */
    public LiveMessage m171390m() {
        return LiveMessage.create().setNotificationMessage(this);
    }
}
