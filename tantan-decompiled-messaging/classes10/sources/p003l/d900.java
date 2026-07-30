package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.quickaudio.recyclerview.item.MomentBubbleItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class d900 {
    /* JADX INFO: renamed from: a */
    public static void m6094a(MomentBubbleItemView momentBubbleItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        momentBubbleItemView.d = viewGroup.getChildAt(0);
        momentBubbleItemView.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        momentBubbleItemView.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        momentBubbleItemView.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        momentBubbleItemView.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        momentBubbleItemView.i = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        momentBubbleItemView.j = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        momentBubbleItemView.k = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        momentBubbleItemView.l = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        momentBubbleItemView.m = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        momentBubbleItemView.n = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        momentBubbleItemView.o = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        momentBubbleItemView.p = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        momentBubbleItemView.q = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        momentBubbleItemView.r = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(2);
        momentBubbleItemView.s = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}
