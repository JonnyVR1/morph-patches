package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.home.views.CardImproveTheInformationView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class uj4 {
    /* JADX INFO: renamed from: a */
    public static void m9740a(CardImproveTheInformationView cardImproveTheInformationView, View view) {
        cardImproveTheInformationView.a = (CardImproveTheInformationView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cardImproveTheInformationView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cardImproveTheInformationView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        cardImproveTheInformationView.d = viewGroup.getChildAt(1);
    }
}
