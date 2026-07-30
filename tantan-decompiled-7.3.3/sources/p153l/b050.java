package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.settings.NotificationManagerAct;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class b050 {
    /* JADX INFO: renamed from: a */
    public static void m101262a(NotificationManagerAct notificationManagerAct, View view) {
        notificationManagerAct.f36687c = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        notificationManagerAct.f36688d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        notificationManagerAct.f36689e = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        notificationManagerAct.f36690f = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        notificationManagerAct.f36691g = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        notificationManagerAct.f36692h = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4);
        notificationManagerAct.f36693i = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5);
        notificationManagerAct.f36694j = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(6);
        notificationManagerAct.f36695k = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(7);
        notificationManagerAct.f36696l = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(8);
        notificationManagerAct.f36697m = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(8)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m101263b(NotificationManagerAct notificationManagerAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125703Xe, viewGroup, false);
        m101262a(notificationManagerAct, viewInflate);
        return viewInflate;
    }
}
