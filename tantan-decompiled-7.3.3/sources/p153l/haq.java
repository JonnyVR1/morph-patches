package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemMessageMomentInspireLeft;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class haq {
    /* JADX INFO: renamed from: a */
    public static void m134192a(ItemMessageMomentInspireLeft itemMessageMomentInspireLeft, View view) {
        itemMessageMomentInspireLeft.f32070a = (ItemMessageMomentInspireLeft) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemMessageMomentInspireLeft.f32071b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemMessageMomentInspireLeft.f32072c = (LinearLayout) viewGroup.getChildAt(1);
        itemMessageMomentInspireLeft.f32073d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        itemMessageMomentInspireLeft.f32074e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        itemMessageMomentInspireLeft.f32075f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
