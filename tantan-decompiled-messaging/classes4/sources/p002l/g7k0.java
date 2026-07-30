package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.common.chat.notification.UserNotificationItemView;
import com.p000p1.mobile.putong.live.livingroom.common.chat.notification.UserNotificationView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class g7k0 {
    /* JADX INFO: renamed from: a */
    public static void m13650a(UserNotificationView userNotificationView, View view) {
        userNotificationView.f4980a = (UserNotificationView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        userNotificationView.f4981b = (UserNotificationItemView) viewGroup.getChildAt(0);
        userNotificationView.f4982c = (UserNotificationItemView) viewGroup.getChildAt(1);
    }
}
