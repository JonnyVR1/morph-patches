package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.messages.ItemWechatNotifyGuideMessage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class zhq {
    /* JADX INFO: renamed from: a */
    public static void m11424a(ItemWechatNotifyGuideMessage itemWechatNotifyGuideMessage, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        itemWechatNotifyGuideMessage.a = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemWechatNotifyGuideMessage.b = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemWechatNotifyGuideMessage.c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
