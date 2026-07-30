package p149l;

import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p046p1.mobile.putong.live.livingroom.common.chat.notification.UserNotificationItemView;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class nz4 extends wg2<UserNotificationItemView> {
    public nz4(LiveMessage liveMessage, nol nolVar) {
        super(liveMessage, nolVar);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo70566u(UserNotificationItemView userNotificationItemView) {
        super.mo70566u(userNotificationItemView);
        o7t o7tVar = this.f186132a.notificationData;
        final nol nolVar = this.f186133b;
        Objects.requireNonNull(nolVar);
        userNotificationItemView.m72735y(o7tVar, new e30() { // from class: l.mz4
            @Override // p149l.e30
            public final void call(Object obj) {
                nolVar.mo72699i((o7t) obj);
            }
        });
        if (er40.m117818f(this.f186132a)) {
            this.f186133b.mo72695c();
        }
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168324e0;
    }
}
