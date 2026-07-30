package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.ui.messages.ItemHeartbeatNotifyNewUi;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class m4q {
    /* JADX INFO: renamed from: a */
    public static void m7973a(ItemHeartbeatNotifyNewUi itemHeartbeatNotifyNewUi, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        itemHeartbeatNotifyNewUi.a = (FrameLayout) viewGroup.getChildAt(0);
        itemHeartbeatNotifyNewUi.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemHeartbeatNotifyNewUi.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemHeartbeatNotifyNewUi.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemHeartbeatNotifyNewUi.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemHeartbeatNotifyNewUi.f = viewGroup.getChildAt(1);
    }
}
