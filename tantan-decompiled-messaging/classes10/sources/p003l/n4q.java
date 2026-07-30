package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.ui.messages.ItemHeartbeatNotify;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class n4q {
    /* JADX INFO: renamed from: a */
    public static void m8311a(ItemHeartbeatNotify itemHeartbeatNotify, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        itemHeartbeatNotify.a = (FrameLayout) viewGroup.getChildAt(0);
        itemHeartbeatNotify.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemHeartbeatNotify.c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemHeartbeatNotify.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemHeartbeatNotify.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        itemHeartbeatNotify.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        itemHeartbeatNotify.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        itemHeartbeatNotify.h = viewGroup.getChildAt(1);
    }
}
