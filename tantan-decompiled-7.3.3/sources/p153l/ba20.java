package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.visitor.myvisitors.MyVisitorsFooterView;
import p151v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class ba20 {
    /* JADX INFO: renamed from: a */
    public static void m103147a(MyVisitorsFooterView myVisitorsFooterView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        myVisitorsFooterView._left = (VImage) viewGroup.getChildAt(0);
        myVisitorsFooterView._text = (TextView) viewGroup.getChildAt(1);
        myVisitorsFooterView._right = (VImage) viewGroup.getChildAt(2);
    }
}
