package p002l;

import android.text.TextUtils;
import com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class x6k0 extends bk2<LongLinkAdminMessage.UserWithBgColorSocketNotification, LongLinkAdminMessage.UserWithBgColorSocketNotification> {
    public x6k0(p3g0<LongLinkAdminMessage.UserWithBgColorSocketNotification, LongLinkAdminMessage.UserWithBgColorSocketNotification> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkAdminMessage.UserWithBgColorSocketNotification userWithBgColorSocketNotification, String str) {
        if (TextUtils.isEmpty(userWithBgColorSocketNotification.getContent())) {
            return false;
        }
        return TextUtils.isEmpty(userWithBgColorSocketNotification.getRoomId()) || m24095r(userWithBgColorSocketNotification.getRoomId(), "no_care", "no_care");
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkAdminMessage.UserWithBgColorSocketNotification> mo9244b() {
        return LongLinkAdminMessage.UserWithBgColorSocketNotification.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.notice.userWithBgColorSocketNotification";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkAdminMessage.UserWithBgColorSocketNotification mo9251z(String str, LongLinkAdminMessage.UserWithBgColorSocketNotification userWithBgColorSocketNotification) {
        return userWithBgColorSocketNotification;
    }
}
