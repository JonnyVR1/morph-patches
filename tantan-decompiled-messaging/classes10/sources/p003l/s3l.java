package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class s3l {
    /* JADX INFO: renamed from: a */
    public static void m9215a(HomeCardExpandedNewUiButtons homeCardExpandedNewUiButtons, View view) {
        homeCardExpandedNewUiButtons.a = (HomeCardExpandedNewUiButtons) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homeCardExpandedNewUiButtons.b = viewGroup.getChildAt(0);
        homeCardExpandedNewUiButtons.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        homeCardExpandedNewUiButtons.d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        homeCardExpandedNewUiButtons.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        homeCardExpandedNewUiButtons.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        homeCardExpandedNewUiButtons.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        homeCardExpandedNewUiButtons.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        homeCardExpandedNewUiButtons.i = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        homeCardExpandedNewUiButtons.j = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        homeCardExpandedNewUiButtons.k = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        homeCardExpandedNewUiButtons.l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        homeCardExpandedNewUiButtons.m = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        homeCardExpandedNewUiButtons.n = viewGroup.getChildAt(1);
    }
}
