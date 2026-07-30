package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.visitor.myvisitors.MyVisitorsItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class o220 {
    /* JADX INFO: renamed from: a */
    public static void m8386a(MyVisitorsItemView myVisitorsItemView, View view) {
        myVisitorsItemView.a = (MyVisitorsItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        myVisitorsItemView.b = viewGroup.getChildAt(0);
        myVisitorsItemView.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        myVisitorsItemView.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        myVisitorsItemView.e = (TextView) viewGroup.getChildAt(2);
    }
}
