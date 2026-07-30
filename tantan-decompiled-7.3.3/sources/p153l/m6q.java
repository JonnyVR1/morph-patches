package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemHeartbeatNotifyNewUi;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class m6q {
    /* JADX INFO: renamed from: a */
    public static void m157260a(ItemHeartbeatNotifyNewUi itemHeartbeatNotifyNewUi, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        itemHeartbeatNotifyNewUi.f31860a = (FrameLayout) viewGroup.getChildAt(0);
        itemHeartbeatNotifyNewUi.f31861b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemHeartbeatNotifyNewUi.f31862c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemHeartbeatNotifyNewUi.f31863d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemHeartbeatNotifyNewUi.f31864e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemHeartbeatNotifyNewUi.f31865f = (VText) viewGroup.getChildAt(1);
    }
}
