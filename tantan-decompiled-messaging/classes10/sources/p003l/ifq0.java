package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.youthvip.view.YouthVipLocationView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ifq0 {
    /* JADX INFO: renamed from: a */
    public static void m7180a(YouthVipLocationView youthVipLocationView, View view) {
        youthVipLocationView.d = (YouthVipLocationView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        youthVipLocationView.e = viewGroup.getChildAt(0);
        youthVipLocationView.f = (ImageView) viewGroup.getChildAt(1);
        youthVipLocationView.g = (ImageView) viewGroup.getChildAt(2);
        youthVipLocationView.h = (TextView) viewGroup.getChildAt(3);
        youthVipLocationView.i = (TextView) viewGroup.getChildAt(4);
        youthVipLocationView.j = (TextView) viewGroup.getChildAt(5);
    }
}
