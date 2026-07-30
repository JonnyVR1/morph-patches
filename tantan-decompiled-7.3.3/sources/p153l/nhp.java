package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.intltribe.view.IntlTribeSlideEmptyCardView;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class nhp {
    /* JADX INFO: renamed from: a */
    public static void m163114a(IntlTribeSlideEmptyCardView intlTribeSlideEmptyCardView, View view) {
        intlTribeSlideEmptyCardView.f25103a = (IntlTribeSlideEmptyCardView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        intlTribeSlideEmptyCardView.f25104b = (VDraweeView) viewGroup.getChildAt(0);
        intlTribeSlideEmptyCardView.f25105c = (VText) viewGroup.getChildAt(1);
        intlTribeSlideEmptyCardView.f25106d = (VButton) viewGroup.getChildAt(2);
        intlTribeSlideEmptyCardView.f25107e = (VButton) viewGroup.getChildAt(3);
    }
}
