package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemTagGuide;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class sgq {
    /* JADX INFO: renamed from: a */
    public static void m185827a(ItemTagGuide itemTagGuide, View view) {
        itemTagGuide.f32349a = (ItemTagGuide) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemTagGuide.f32350b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemTagGuide.f32351c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemTagGuide.f32352d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemTagGuide.f32353e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
