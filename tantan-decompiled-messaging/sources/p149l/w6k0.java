package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.common.chat.notification.UserNotificationItemView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class w6k0 {
    /* JADX INFO: renamed from: a */
    public static void m201884a(UserNotificationItemView userNotificationItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        userNotificationItemView.f48920a = (LinearLayout) viewGroup.getChildAt(0);
        userNotificationItemView.f48921b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        userNotificationItemView.f48922c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        userNotificationItemView.f48923d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        userNotificationItemView.f48924e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        userNotificationItemView.f48925f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        userNotificationItemView.f48926g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        userNotificationItemView.f48927h = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
    }
}
