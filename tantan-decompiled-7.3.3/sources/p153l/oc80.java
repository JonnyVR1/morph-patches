package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.wintimes.PkWinTimesNumView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.wintimes.PkWinTimesResultView;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class oc80 {
    /* JADX INFO: renamed from: a */
    public static void m167141a(PkWinTimesResultView pkWinTimesResultView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pkWinTimesResultView.f52654a = (LinearLayout) viewGroup.getChildAt(0);
        pkWinTimesResultView.f52655b = (PkWinTimesNumView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        pkWinTimesResultView.f52656c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        pkWinTimesResultView.f52657d = (VImage) viewGroup.getChildAt(1);
    }
}
