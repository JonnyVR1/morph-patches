package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.home.views.innerpush.MessageSendPushLayout;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class fxz {
    /* JADX INFO: renamed from: a */
    public static void m123701a(MessageSendPushLayout messageSendPushLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        messageSendPushLayout.f24074a = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        messageSendPushLayout.f24075b = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        messageSendPushLayout.f24076c = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
    }
}
