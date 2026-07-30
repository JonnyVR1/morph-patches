package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.home.views.CommercialCardBottomActionLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class sh5 {
    /* JADX INFO: renamed from: a */
    public static void m9351a(CommercialCardBottomActionLayout commercialCardBottomActionLayout, View view) {
        commercialCardBottomActionLayout.c = (CommercialCardBottomActionLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        commercialCardBottomActionLayout.d = viewGroup.getChildAt(0);
        commercialCardBottomActionLayout.e = viewGroup.getChildAt(1);
        commercialCardBottomActionLayout.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        commercialCardBottomActionLayout.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
