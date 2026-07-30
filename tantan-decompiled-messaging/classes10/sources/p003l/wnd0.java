package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.result.SVipContentItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class wnd0 {
    /* JADX INFO: renamed from: a */
    public static void m10531a(SVipContentItemView sVipContentItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        sVipContentItemView.a = (FrameLayout) viewGroup.getChildAt(0);
        sVipContentItemView.b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        sVipContentItemView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        sVipContentItemView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        sVipContentItemView.e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        sVipContentItemView.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        sVipContentItemView.g = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        sVipContentItemView.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        sVipContentItemView.i = (FrameLayout) viewGroup.getChildAt(2);
        sVipContentItemView.j = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        sVipContentItemView.k = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        sVipContentItemView.l = viewGroup.getChildAt(3);
    }
}
