package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.view.CoreEmptyView;

/* JADX INFO: loaded from: classes10.dex */
public class zp8 {
    /* JADX INFO: renamed from: a */
    public static void m220822a(CoreEmptyView coreEmptyView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        coreEmptyView.f27735a = (ImageView) viewGroup.getChildAt(0);
        coreEmptyView.f27736b = (TextView) viewGroup.getChildAt(1);
        coreEmptyView.f27737c = (LinearLayout) viewGroup.getChildAt(2);
        coreEmptyView.f27738d = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        coreEmptyView.f27739e = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        coreEmptyView.f27740f = (TextView) viewGroup.getChildAt(3);
    }
}
