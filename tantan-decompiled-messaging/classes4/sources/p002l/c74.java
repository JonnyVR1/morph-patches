package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallWidgetItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class c74 {
    /* JADX INFO: renamed from: a */
    public static void m10769a(CallWidgetItemView callWidgetItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        callWidgetItemView.a = (FrameLayout) viewGroup.getChildAt(0);
        callWidgetItemView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        callWidgetItemView.c = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        callWidgetItemView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        callWidgetItemView.e = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        callWidgetItemView.f = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        callWidgetItemView.g = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        callWidgetItemView.h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        callWidgetItemView.i = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        callWidgetItemView.j = (TextView) viewGroup.getChildAt(1);
        callWidgetItemView.k = (TextView) viewGroup.getChildAt(2);
    }
}
