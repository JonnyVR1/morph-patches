package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.visitor.myvisitors.MyVisitorsMenuView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class s220 {
    /* JADX INFO: renamed from: a */
    public static void m182054a(MyVisitorsMenuView myVisitorsMenuView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        myVisitorsMenuView._name = (VText) viewGroup.getChildAt(0);
        myVisitorsMenuView._filter_ic = (VImage) viewGroup.getChildAt(1);
        myVisitorsMenuView._anchor = viewGroup.getChildAt(2);
    }
}
