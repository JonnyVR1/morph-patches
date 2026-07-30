package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.home.views.innerpush.MessageSendPushLayout;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class c600 {
    /* JADX INFO: renamed from: a */
    public static void m108088a(MessageSendPushLayout messageSendPushLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        messageSendPushLayout.f24816a = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        messageSendPushLayout.f24817b = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        messageSendPushLayout.f24818c = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
    }
}
