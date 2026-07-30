package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemHeartbeatNotify;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class n4q {
    /* JADX INFO: renamed from: a */
    public static void m157885a(ItemHeartbeatNotify itemHeartbeatNotify, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        itemHeartbeatNotify.f30999a = (FrameLayout) viewGroup.getChildAt(0);
        itemHeartbeatNotify.f31000b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemHeartbeatNotify.f31001c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemHeartbeatNotify.f31002d = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemHeartbeatNotify.f31003e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        itemHeartbeatNotify.f31004f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        itemHeartbeatNotify.f31005g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        itemHeartbeatNotify.f31006h = (VText) viewGroup.getChildAt(1);
    }
}
