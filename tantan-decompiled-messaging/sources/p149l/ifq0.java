package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.youthvip.view.YouthVipLocationView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class ifq0 {
    /* JADX INFO: renamed from: a */
    public static void m135951a(YouthVipLocationView youthVipLocationView, View view) {
        youthVipLocationView._root_view = (YouthVipLocationView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        youthVipLocationView._texture = (VDraweeView) viewGroup.getChildAt(0);
        youthVipLocationView._location_ic = (ImageView) viewGroup.getChildAt(1);
        youthVipLocationView._right_arrow_ic = (ImageView) viewGroup.getChildAt(2);
        youthVipLocationView._location_value = (TextView) viewGroup.getChildAt(3);
        youthVipLocationView._title = (TextView) viewGroup.getChildAt(4);
        youthVipLocationView._subtitle = (TextView) viewGroup.getChildAt(5);
    }
}
