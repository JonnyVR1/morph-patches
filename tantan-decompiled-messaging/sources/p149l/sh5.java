package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.home.views.CommercialCardBottomActionLayout;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class sh5 {
    /* JADX INFO: renamed from: a */
    public static void m184155a(CommercialCardBottomActionLayout commercialCardBottomActionLayout, View view) {
        commercialCardBottomActionLayout.f23832c = (CommercialCardBottomActionLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        commercialCardBottomActionLayout.f23833d = (VImage) viewGroup.getChildAt(0);
        commercialCardBottomActionLayout.f23834e = (VLinear) viewGroup.getChildAt(1);
        commercialCardBottomActionLayout.f23835f = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        commercialCardBottomActionLayout.f23836g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
