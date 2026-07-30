package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.home.card.expanded.view.SuperLikeExpGuideView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ixg0 {
    /* JADX INFO: renamed from: a */
    public static void m7305a(SuperLikeExpGuideView superLikeExpGuideView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        superLikeExpGuideView.a = viewGroup.getChildAt(1);
        superLikeExpGuideView.b = viewGroup.getChildAt(2);
        superLikeExpGuideView.c = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        superLikeExpGuideView.d = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        superLikeExpGuideView.e = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
    }
}
