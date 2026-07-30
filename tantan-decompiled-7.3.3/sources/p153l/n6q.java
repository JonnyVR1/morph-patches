package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemHeartbeatNotify;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class n6q {
    /* JADX INFO: renamed from: a */
    public static void m161796a(ItemHeartbeatNotify itemHeartbeatNotify, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        itemHeartbeatNotify.f31847a = (FrameLayout) viewGroup.getChildAt(0);
        itemHeartbeatNotify.f31848b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemHeartbeatNotify.f31849c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemHeartbeatNotify.f31850d = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemHeartbeatNotify.f31851e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        itemHeartbeatNotify.f31852f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        itemHeartbeatNotify.f31853g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        itemHeartbeatNotify.f31854h = (VText) viewGroup.getChildAt(1);
    }
}
