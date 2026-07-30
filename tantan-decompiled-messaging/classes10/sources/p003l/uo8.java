package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.view.CoreEmptyView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class uo8 {
    /* JADX INFO: renamed from: a */
    public static void m9753a(CoreEmptyView coreEmptyView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        coreEmptyView.a = (ImageView) viewGroup.getChildAt(0);
        coreEmptyView.b = (TextView) viewGroup.getChildAt(1);
        coreEmptyView.c = (LinearLayout) viewGroup.getChildAt(2);
        coreEmptyView.d = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        coreEmptyView.e = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        coreEmptyView.f = (TextView) viewGroup.getChildAt(3);
    }
}
