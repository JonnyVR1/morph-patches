package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.settings.NotificationManagerAct;
import l.f6c0;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class mr40 {
    /* JADX INFO: renamed from: a */
    public static void m8215a(NotificationManagerAct notificationManagerAct, View view) {
        notificationManagerAct.c = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        notificationManagerAct.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        notificationManagerAct.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        notificationManagerAct.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        notificationManagerAct.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        notificationManagerAct.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4);
        notificationManagerAct.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5);
        notificationManagerAct.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(6);
        notificationManagerAct.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(7);
        notificationManagerAct.l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(8);
        notificationManagerAct.m = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(8)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m8216b(NotificationManagerAct notificationManagerAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Qe, viewGroup, false);
        m8215a(notificationManagerAct, viewInflate);
        return viewInflate;
    }
}
