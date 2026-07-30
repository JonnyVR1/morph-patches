package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.common.chat.notification.UserNotificationItemView;
import com.p051p1.mobile.putong.live.livingroom.common.chat.notification.UserNotificationView;

/* JADX INFO: loaded from: classes4.dex */
public class mgk0 {
    /* JADX INFO: renamed from: a */
    public static void m158356a(UserNotificationView userNotificationView, View view) {
        userNotificationView.f49786a = (UserNotificationView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        userNotificationView.f49787b = (UserNotificationItemView) viewGroup.getChildAt(0);
        userNotificationView.f49788c = (UserNotificationItemView) viewGroup.getChildAt(1);
    }
}
