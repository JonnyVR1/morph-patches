package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.visitor.myvisitors.MyVisitorsEmptyView;
import p151v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class aa20 {
    /* JADX INFO: renamed from: a */
    public static void m96621a(MyVisitorsEmptyView myVisitorsEmptyView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        myVisitorsEmptyView._image = (VImage) viewGroup.getChildAt(0);
        myVisitorsEmptyView._text = (TextView) viewGroup.getChildAt(1);
    }
}
