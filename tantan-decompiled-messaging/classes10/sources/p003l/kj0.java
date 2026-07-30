package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.newui.messages.AllPairsItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class kj0 {
    /* JADX INFO: renamed from: a */
    public static void m7602a(AllPairsItemView allPairsItemView, View view) {
        allPairsItemView.a = (AllPairsItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        allPairsItemView.b = viewGroup.getChildAt(0);
        allPairsItemView.c = viewGroup.getChildAt(1);
        allPairsItemView.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        allPairsItemView.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        allPairsItemView.f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        allPairsItemView.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        allPairsItemView.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(2);
        allPairsItemView.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(4);
        allPairsItemView.j = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        allPairsItemView.k = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
