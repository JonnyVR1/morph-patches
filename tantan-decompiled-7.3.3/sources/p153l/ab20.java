package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.visitor.myvisitors.MyVisitorsMenuView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ab20 {
    /* JADX INFO: renamed from: a */
    public static void m96696a(MyVisitorsMenuView myVisitorsMenuView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        myVisitorsMenuView._name = (VText) viewGroup.getChildAt(0);
        myVisitorsMenuView._filter_ic = (VImage) viewGroup.getChildAt(1);
        myVisitorsMenuView._anchor = viewGroup.getChildAt(2);
    }
}
