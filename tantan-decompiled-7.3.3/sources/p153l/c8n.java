package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.newui.home.views.IntlCommercialCardBottomActionLayout;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class c8n {
    /* JADX INFO: renamed from: a */
    public static void m108372a(IntlCommercialCardBottomActionLayout intlCommercialCardBottomActionLayout, View view) {
        intlCommercialCardBottomActionLayout.f24710c = (IntlCommercialCardBottomActionLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        intlCommercialCardBottomActionLayout.f24711d = (VText) viewGroup.getChildAt(0);
        intlCommercialCardBottomActionLayout.f24712e = (VLinear) viewGroup.getChildAt(1);
        intlCommercialCardBottomActionLayout.f24713f = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlCommercialCardBottomActionLayout.f24714g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        intlCommercialCardBottomActionLayout.f24715h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        intlCommercialCardBottomActionLayout.f24716i = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        intlCommercialCardBottomActionLayout.f24717j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }
}
