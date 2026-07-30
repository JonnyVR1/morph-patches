package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardInforLayout;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class zmf {
    /* JADX INFO: renamed from: a */
    public static void m220381a(ExpandedCardInforLayout expandedCardInforLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        expandedCardInforLayout.f23300a = (VLinear) viewGroup.getChildAt(0);
        expandedCardInforLayout.f23301b = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        expandedCardInforLayout.f23302c = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        expandedCardInforLayout.f23303d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
    }
}
