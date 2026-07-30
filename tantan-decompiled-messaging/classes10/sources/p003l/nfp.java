package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.intltribe.view.IntlTribeSlideEmptyCardView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class nfp {
    /* JADX INFO: renamed from: a */
    public static void m8328a(IntlTribeSlideEmptyCardView intlTribeSlideEmptyCardView, View view) {
        intlTribeSlideEmptyCardView.a = (IntlTribeSlideEmptyCardView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        intlTribeSlideEmptyCardView.b = viewGroup.getChildAt(0);
        intlTribeSlideEmptyCardView.c = viewGroup.getChildAt(1);
        intlTribeSlideEmptyCardView.d = viewGroup.getChildAt(2);
        intlTribeSlideEmptyCardView.e = viewGroup.getChildAt(3);
    }
}
