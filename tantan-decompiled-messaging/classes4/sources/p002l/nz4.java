package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p000p1.mobile.putong.live.livingroom.common.chat.notification.UserNotificationItemView;
import java.util.Objects;
import l.e30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class nz4 extends wg2<UserNotificationItemView> {
    public nz4(LiveMessage liveMessage, nol nolVar) {
        super(liveMessage, nolVar);
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void m19169u(UserNotificationItemView userNotificationItemView) {
        super.u(userNotificationItemView);
        o7t o7tVar = this.f21724a.notificationData;
        final nol nolVar = this.f21725b;
        Objects.requireNonNull(nolVar);
        userNotificationItemView.m6239y(o7tVar, new e30() { // from class: l.mz4
            public final void call(Object obj) {
                nolVar.mo6202i((o7t) obj);
            }
        });
        if (er40.m12679f(this.f21724a)) {
            this.f21725b.mo6198c();
        }
    }

    /* JADX INFO: renamed from: o */
    public int m19168o() {
        return t6c0.f19820e0;
    }
}
