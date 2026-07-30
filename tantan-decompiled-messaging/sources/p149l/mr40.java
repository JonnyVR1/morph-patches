package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.settings.NotificationManagerAct;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class mr40 {
    /* JADX INFO: renamed from: a */
    public static void m156017a(NotificationManagerAct notificationManagerAct, View view) {
        notificationManagerAct.f35839c = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        notificationManagerAct.f35840d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        notificationManagerAct.f35841e = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        notificationManagerAct.f35842f = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        notificationManagerAct.f35843g = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        notificationManagerAct.f35844h = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4);
        notificationManagerAct.f35845i = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5);
        notificationManagerAct.f35846j = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(6);
        notificationManagerAct.f35847k = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(7);
        notificationManagerAct.f35848l = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(8);
        notificationManagerAct.f35849m = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(8)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m156018b(NotificationManagerAct notificationManagerAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95537Qe, viewGroup, false);
        m156017a(notificationManagerAct, viewInflate);
        return viewInflate;
    }
}
