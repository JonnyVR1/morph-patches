package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.view.CoreImEmptyView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class w19 {
    /* JADX INFO: renamed from: a */
    public static void m10428a(CoreImEmptyView coreImEmptyView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        coreImEmptyView.a = (ImageView) viewGroup.getChildAt(0);
        coreImEmptyView.b = (TextView) viewGroup.getChildAt(1);
        coreImEmptyView.c = (LinearLayout) viewGroup.getChildAt(2);
        coreImEmptyView.d = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        coreImEmptyView.e = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        coreImEmptyView.f = (TextView) viewGroup.getChildAt(3);
    }
}
