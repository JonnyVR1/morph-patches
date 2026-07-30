package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage;

/* JADX INFO: loaded from: classes4.dex */
public class x6k0 extends bk2<LongLinkAdminMessage.UserWithBgColorSocketNotification, LongLinkAdminMessage.UserWithBgColorSocketNotification> {
    public x6k0(p3g0<LongLinkAdminMessage.UserWithBgColorSocketNotification, LongLinkAdminMessage.UserWithBgColorSocketNotification> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkAdminMessage.UserWithBgColorSocketNotification userWithBgColorSocketNotification, String str) {
        if (TextUtils.isEmpty(userWithBgColorSocketNotification.getContent())) {
            return false;
        }
        return TextUtils.isEmpty(userWithBgColorSocketNotification.getRoomId()) || m199212r(userWithBgColorSocketNotification.getRoomId(), "no_care", "no_care");
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkAdminMessage.UserWithBgColorSocketNotification> mo94398b() {
        return LongLinkAdminMessage.UserWithBgColorSocketNotification.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.notice.userWithBgColorSocketNotification";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkAdminMessage.UserWithBgColorSocketNotification mo94461z(String str, LongLinkAdminMessage.UserWithBgColorSocketNotification userWithBgColorSocketNotification) {
        return userWithBgColorSocketNotification;
    }
}
