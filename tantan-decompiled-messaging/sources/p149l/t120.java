package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.visitor.myvisitors.MyVisitorsFooterView;
import p147v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class t120 {
    /* JADX INFO: renamed from: a */
    public static void m186893a(MyVisitorsFooterView myVisitorsFooterView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        myVisitorsFooterView._left = (VImage) viewGroup.getChildAt(0);
        myVisitorsFooterView._text = (TextView) viewGroup.getChildAt(1);
        myVisitorsFooterView._right = (VImage) viewGroup.getChildAt(2);
    }
}
