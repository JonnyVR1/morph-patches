package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.newui.messages.MatcheItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class cex {
    /* JADX INFO: renamed from: a */
    public static void m5941a(MatcheItemView matcheItemView, View view) {
        matcheItemView.a = (MatcheItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        matcheItemView.b = (RelativeLayout) viewGroup.getChildAt(0);
        matcheItemView.c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        matcheItemView.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        matcheItemView.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        matcheItemView.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        matcheItemView.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        matcheItemView.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        matcheItemView.i = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        matcheItemView.j = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        matcheItemView.k = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        matcheItemView.l = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}
