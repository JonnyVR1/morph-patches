package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.visitor.myvisitors.MyVisitorsEmptyView;
import p147v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class s120 {
    /* JADX INFO: renamed from: a */
    public static void m181916a(MyVisitorsEmptyView myVisitorsEmptyView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        myVisitorsEmptyView._image = (VImage) viewGroup.getChildAt(0);
        myVisitorsEmptyView._text = (TextView) viewGroup.getChildAt(1);
    }
}
