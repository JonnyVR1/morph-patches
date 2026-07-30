package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.livingroom.other.floatwindow.FloatView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class kqi {
    /* JADX INFO: renamed from: a */
    public static void m146946a(FloatView floatView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        floatView.f51170a = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        floatView.f51171b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        floatView.f51172c = (ViewStub) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        floatView.f51173d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        floatView.f51174e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        floatView.f51175f = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}
