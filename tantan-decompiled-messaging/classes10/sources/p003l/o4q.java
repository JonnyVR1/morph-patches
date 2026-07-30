package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.ui.messages.ItemHeartbeatSuccessNewUi;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class o4q {
    /* JADX INFO: renamed from: a */
    public static void m8397a(ItemHeartbeatSuccessNewUi itemHeartbeatSuccessNewUi, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        itemHeartbeatSuccessNewUi.a = (FrameLayout) viewGroup.getChildAt(0);
        itemHeartbeatSuccessNewUi.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
