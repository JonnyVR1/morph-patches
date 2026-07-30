package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.visitor.myvisitors.MyVisitorsItemView;
import com.p051p1.mobile.putong.p070ui.headframe.HeaderFrameWrapper;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class wa20 {
    /* JADX INFO: renamed from: a */
    public static void m205633a(MyVisitorsItemView myVisitorsItemView, View view) {
        myVisitorsItemView._root = (MyVisitorsItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        myVisitorsItemView._profile = (HeaderFrameWrapper) viewGroup.getChildAt(0);
        myVisitorsItemView._name = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        myVisitorsItemView._desc = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        myVisitorsItemView._action = (TextView) viewGroup.getChildAt(2);
    }
}
