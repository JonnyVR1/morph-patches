package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.visitor.myvisitors.MyVisitorsFooterView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class t120 {
    /* JADX INFO: renamed from: a */
    public static void m9520a(MyVisitorsFooterView myVisitorsFooterView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        myVisitorsFooterView.c = viewGroup.getChildAt(0);
        myVisitorsFooterView.d = (TextView) viewGroup.getChildAt(1);
        myVisitorsFooterView.e = viewGroup.getChildAt(2);
    }
}
