package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.newui.home.views.IntlCommercialCardBottomActionLayout;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class c6n {
    /* JADX INFO: renamed from: a */
    public static void m105485a(IntlCommercialCardBottomActionLayout intlCommercialCardBottomActionLayout, View view) {
        intlCommercialCardBottomActionLayout.f23968c = (IntlCommercialCardBottomActionLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        intlCommercialCardBottomActionLayout.f23969d = (VText) viewGroup.getChildAt(0);
        intlCommercialCardBottomActionLayout.f23970e = (VLinear) viewGroup.getChildAt(1);
        intlCommercialCardBottomActionLayout.f23971f = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlCommercialCardBottomActionLayout.f23972g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        intlCommercialCardBottomActionLayout.f23973h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        intlCommercialCardBottomActionLayout.f23974i = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        intlCommercialCardBottomActionLayout.f23975j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }
}
