package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.intltribe.view.IntlTribeSlideEmptyCardView;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class nfp {
    /* JADX INFO: renamed from: a */
    public static void m159259a(IntlTribeSlideEmptyCardView intlTribeSlideEmptyCardView, View view) {
        intlTribeSlideEmptyCardView.f24361a = (IntlTribeSlideEmptyCardView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        intlTribeSlideEmptyCardView.f24362b = (VDraweeView) viewGroup.getChildAt(0);
        intlTribeSlideEmptyCardView.f24363c = (VText) viewGroup.getChildAt(1);
        intlTribeSlideEmptyCardView.f24364d = (VButton) viewGroup.getChildAt(2);
        intlTribeSlideEmptyCardView.f24365e = (VButton) viewGroup.getChildAt(3);
    }
}
