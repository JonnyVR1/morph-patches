package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.common.fans.FansView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fhg {
    /* JADX INFO: renamed from: a */
    public static void m13182a(FansView fansView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        fansView.f5024a = viewGroup.getChildAt(0);
        fansView.f5025b = (FrameLayout) viewGroup.getChildAt(1);
        fansView.f5026c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }
}
