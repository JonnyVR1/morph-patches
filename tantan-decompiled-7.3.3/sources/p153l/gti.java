package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.livingroom.other.floatwindow.FloatView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class gti {
    /* JADX INFO: renamed from: a */
    public static void m132239a(FloatView floatView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        floatView.f52018a = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        floatView.f52019b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        floatView.f52020c = (ViewStub) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        floatView.f52021d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        floatView.f52022e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        floatView.f52023f = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}
