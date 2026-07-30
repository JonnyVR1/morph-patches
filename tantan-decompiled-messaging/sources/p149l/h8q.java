package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemMessageMomentInspireLeft;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class h8q {
    /* JADX INFO: renamed from: a */
    public static void m129894a(ItemMessageMomentInspireLeft itemMessageMomentInspireLeft, View view) {
        itemMessageMomentInspireLeft.f31222a = (ItemMessageMomentInspireLeft) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemMessageMomentInspireLeft.f31223b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemMessageMomentInspireLeft.f31224c = (LinearLayout) viewGroup.getChildAt(1);
        itemMessageMomentInspireLeft.f31225d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        itemMessageMomentInspireLeft.f31226e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        itemMessageMomentInspireLeft.f31227f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
