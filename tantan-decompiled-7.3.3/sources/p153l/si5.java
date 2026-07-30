package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.home.views.CommercialCardBottomActionLayout;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class si5 {
    /* JADX INFO: renamed from: a */
    public static void m186002a(CommercialCardBottomActionLayout commercialCardBottomActionLayout, View view) {
        commercialCardBottomActionLayout.f24574c = (CommercialCardBottomActionLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        commercialCardBottomActionLayout.f24575d = (VImage) viewGroup.getChildAt(0);
        commercialCardBottomActionLayout.f24576e = (VLinear) viewGroup.getChildAt(1);
        commercialCardBottomActionLayout.f24577f = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        commercialCardBottomActionLayout.f24578g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
