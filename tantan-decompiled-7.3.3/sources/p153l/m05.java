package p153l;

import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p051p1.mobile.putong.live.livingroom.common.chat.notification.UserNotificationItemView;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class m05 extends dh2<UserNotificationItemView> {
    public m05(LiveMessage liveMessage, yql yqlVar) {
        super(liveMessage, yqlVar);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo71749u(UserNotificationItemView userNotificationItemView) {
        super.mo71749u(userNotificationItemView);
        p9t p9tVar = this.f88411a.notificationData;
        final yql yqlVar = this.f88412b;
        Objects.requireNonNull(yqlVar);
        userNotificationItemView.m73918y(p9tVar, new y20() { // from class: l.l05
            @Override // p153l.y20
            public final void call(Object obj) {
                yqlVar.mo73882i((p9t) obj);
            }
        });
        if (tz40.m193647f(this.f88411a)) {
            this.f88412b.mo73878c();
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f199056e0;
    }
}
