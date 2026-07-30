package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.intl.visitor.IntlVisitorsItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class cnp {
    /* JADX INFO: renamed from: a */
    public static void m5973a(IntlVisitorsItemView intlVisitorsItemView, View view) {
        intlVisitorsItemView.a = (IntlVisitorsItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        intlVisitorsItemView.b = viewGroup.getChildAt(0);
        intlVisitorsItemView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlVisitorsItemView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        intlVisitorsItemView.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        intlVisitorsItemView.f = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        intlVisitorsItemView.g = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        intlVisitorsItemView.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        intlVisitorsItemView.i = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
