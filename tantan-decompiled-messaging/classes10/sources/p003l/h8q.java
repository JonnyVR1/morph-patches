package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.messages.ItemMessageMomentInspireLeft;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class h8q {
    /* JADX INFO: renamed from: a */
    public static void m6933a(ItemMessageMomentInspireLeft itemMessageMomentInspireLeft, View view) {
        itemMessageMomentInspireLeft.a = (ItemMessageMomentInspireLeft) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemMessageMomentInspireLeft.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemMessageMomentInspireLeft.c = (LinearLayout) viewGroup.getChildAt(1);
        itemMessageMomentInspireLeft.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        itemMessageMomentInspireLeft.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        itemMessageMomentInspireLeft.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
