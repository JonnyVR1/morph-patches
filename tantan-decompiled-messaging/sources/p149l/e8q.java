package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemMessageMMTask;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class e8q {
    /* JADX INFO: renamed from: a */
    public static void m115277a(ItemMessageMMTask itemMessageMMTask, View view) {
        itemMessageMMTask.f31192c = (ItemMessageMMTask) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemMessageMMTask.f31193d = (VLinear) viewGroup.getChildAt(0);
        itemMessageMMTask.f31194e = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemMessageMMTask.f31195f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemMessageMMTask.f31196g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemMessageMMTask.f31197h = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemMessageMMTask.f31198i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
    }
}
