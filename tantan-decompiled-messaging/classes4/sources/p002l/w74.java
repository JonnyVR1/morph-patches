package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallWidgetView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class w74 {
    /* JADX INFO: renamed from: a */
    public static void m24427a(CallWidgetView callWidgetView, View view) {
        callWidgetView.a = (CallWidgetView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        callWidgetView.b = viewGroup.getChildAt(0);
        callWidgetView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        callWidgetView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        callWidgetView.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        callWidgetView.f = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        callWidgetView.g = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
