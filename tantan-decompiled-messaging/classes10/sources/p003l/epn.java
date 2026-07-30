package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.ui.intllikedusers.IntlILikeUserItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class epn {
    /* JADX INFO: renamed from: a */
    public static void m6311a(IntlILikeUserItemView intlILikeUserItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlILikeUserItemView.a = (FrameLayout) viewGroup.getChildAt(0);
        intlILikeUserItemView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlILikeUserItemView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        intlILikeUserItemView.d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        intlILikeUserItemView.e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        intlILikeUserItemView.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        intlILikeUserItemView.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        intlILikeUserItemView.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        intlILikeUserItemView.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3);
    }
}
