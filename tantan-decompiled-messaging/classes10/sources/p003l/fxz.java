package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.home.views.innerpush.MessageSendPushLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class fxz {
    /* JADX INFO: renamed from: a */
    public static void m6530a(MessageSendPushLayout messageSendPushLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        messageSendPushLayout.a = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        messageSendPushLayout.b = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        messageSendPushLayout.c = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
    }
}
