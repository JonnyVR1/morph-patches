package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.newui.messages.AllPairsItemView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class gj0 {
    /* JADX INFO: renamed from: a */
    public static void m130401a(AllPairsItemView allPairsItemView, View view) {
        allPairsItemView.f25326a = (AllPairsItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        allPairsItemView.f25327b = (VDraweeView) viewGroup.getChildAt(0);
        allPairsItemView.f25328c = (ConstraintLayout) viewGroup.getChildAt(1);
        allPairsItemView.f25329d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        allPairsItemView.f25330e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        allPairsItemView.f25331f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        allPairsItemView.f25332g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        allPairsItemView.f25333h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(2);
        allPairsItemView.f25334i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(4);
        allPairsItemView.f25335j = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        allPairsItemView.f25336k = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
