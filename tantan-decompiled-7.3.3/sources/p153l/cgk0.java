package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.common.chat.notification.UserNotificationItemView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class cgk0 {
    /* JADX INFO: renamed from: a */
    public static void m109710a(UserNotificationItemView userNotificationItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        userNotificationItemView.f49768a = (LinearLayout) viewGroup.getChildAt(0);
        userNotificationItemView.f49769b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        userNotificationItemView.f49770c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        userNotificationItemView.f49771d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        userNotificationItemView.f49772e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        userNotificationItemView.f49773f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        userNotificationItemView.f49774g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        userNotificationItemView.f49775h = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
    }
}
