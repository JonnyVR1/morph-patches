package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class lwg0 {
    /* JADX INFO: renamed from: a */
    public static void m7923a(SuperLikeComboAnimView superLikeComboAnimView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        superLikeComboAnimView.a = viewGroup.getChildAt(0);
        superLikeComboAnimView.b = viewGroup.getChildAt(1);
        superLikeComboAnimView.c = (RelativeLayout) viewGroup.getChildAt(2);
        superLikeComboAnimView.d = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        superLikeComboAnimView.e = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        superLikeComboAnimView.f = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        superLikeComboAnimView.g = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        superLikeComboAnimView.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3)).getChildAt(0);
        superLikeComboAnimView.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3)).getChildAt(1);
        superLikeComboAnimView.j = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        superLikeComboAnimView.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(0);
        superLikeComboAnimView.l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(1);
    }
}
