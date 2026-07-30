package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.live.livingroom.other.floatwindow.FloatView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kqi {
    /* JADX INFO: renamed from: a */
    public static void m16762a(FloatView floatView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        floatView.f7212a = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        floatView.f7213b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        floatView.f7214c = (ViewStub) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        floatView.f7215d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        floatView.f7216e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        floatView.f7217f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}
