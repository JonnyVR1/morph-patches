package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardInforLayout;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class tlf {
    /* JADX INFO: renamed from: a */
    public static void m189618a(ExpandedCardInforLayout expandedCardInforLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        expandedCardInforLayout.f22558a = (VLinear) viewGroup.getChildAt(0);
        expandedCardInforLayout.f22559b = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        expandedCardInforLayout.f22560c = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        expandedCardInforLayout.f22561d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
    }
}
