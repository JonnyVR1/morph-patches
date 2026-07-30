package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.visitor.myvisitors.MyVisitorsMenuView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class s220 {
    /* JADX INFO: renamed from: a */
    public static void m9212a(MyVisitorsMenuView myVisitorsMenuView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        myVisitorsMenuView.a = viewGroup.getChildAt(0);
        myVisitorsMenuView.b = viewGroup.getChildAt(1);
        myVisitorsMenuView.c = viewGroup.getChildAt(2);
    }
}
