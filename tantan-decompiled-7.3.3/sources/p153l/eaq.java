package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemMessageMMTask;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class eaq {
    /* JADX INFO: renamed from: a */
    public static void m120100a(ItemMessageMMTask itemMessageMMTask, View view) {
        itemMessageMMTask.f32040c = (ItemMessageMMTask) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemMessageMMTask.f32041d = (VLinear) viewGroup.getChildAt(0);
        itemMessageMMTask.f32042e = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemMessageMMTask.f32043f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemMessageMMTask.f32044g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemMessageMMTask.f32045h = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemMessageMMTask.f32046i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
    }
}
