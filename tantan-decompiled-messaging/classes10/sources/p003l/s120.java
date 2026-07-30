package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.visitor.myvisitors.MyVisitorsEmptyView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class s120 {
    /* JADX INFO: renamed from: a */
    public static void m9202a(MyVisitorsEmptyView myVisitorsEmptyView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        myVisitorsEmptyView.a = viewGroup.getChildAt(0);
        myVisitorsEmptyView.b = (TextView) viewGroup.getChildAt(1);
    }
}
