package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.visitor.VisitorsView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class qam0 {
    /* JADX INFO: renamed from: a */
    public static void m8951a(VisitorsView visitorsView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        visitorsView.a = viewGroup.getChildAt(0);
        visitorsView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        visitorsView.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        visitorsView.d = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        visitorsView.e = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        visitorsView.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        visitorsView.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
    }
}
