package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage;

/* JADX INFO: loaded from: classes4.dex */
public class dgk0 extends jk2<LongLinkAdminMessage.UserWithBgColorSocketNotification, LongLinkAdminMessage.UserWithBgColorSocketNotification> {
    public dgk0(wbg0<LongLinkAdminMessage.UserWithBgColorSocketNotification, LongLinkAdminMessage.UserWithBgColorSocketNotification> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkAdminMessage.UserWithBgColorSocketNotification userWithBgColorSocketNotification, String str) {
        if (TextUtils.isEmpty(userWithBgColorSocketNotification.getContent())) {
            return false;
        }
        return TextUtils.isEmpty(userWithBgColorSocketNotification.getRoomId()) || m159460r(userWithBgColorSocketNotification.getRoomId(), "no_care", "no_care");
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkAdminMessage.UserWithBgColorSocketNotification> mo95510b() {
        return LongLinkAdminMessage.UserWithBgColorSocketNotification.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.notice.userWithBgColorSocketNotification";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkAdminMessage.UserWithBgColorSocketNotification mo95993z(String str, LongLinkAdminMessage.UserWithBgColorSocketNotification userWithBgColorSocketNotification) {
        return userWithBgColorSocketNotification;
    }
}
