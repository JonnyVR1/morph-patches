package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemHeartbeatNotifyNewUi;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class m4q {
    /* JADX INFO: renamed from: a */
    public static void m153090a(ItemHeartbeatNotifyNewUi itemHeartbeatNotifyNewUi, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        itemHeartbeatNotifyNewUi.f31012a = (FrameLayout) viewGroup.getChildAt(0);
        itemHeartbeatNotifyNewUi.f31013b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemHeartbeatNotifyNewUi.f31014c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemHeartbeatNotifyNewUi.f31015d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemHeartbeatNotifyNewUi.f31016e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemHeartbeatNotifyNewUi.f31017f = (VText) viewGroup.getChildAt(1);
    }
}
