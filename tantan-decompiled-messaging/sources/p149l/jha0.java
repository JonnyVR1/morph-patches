package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.C8672b;
import com.p046p1.mobile.putong.core.p053ui.profile.views.RingProgressBarView;
import com.p046p1.mobile.putong.core.p053ui.profile.views.SetInfoProgressView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class jha0 {
    /* JADX INFO: renamed from: a */
    public static void m141491a(C8672b c8672b, View view) {
        c8672b.f33429a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c8672b.f33430b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        c8672b.f33431c = (SetInfoProgressView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        c8672b.f33432d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        c8672b.f33433e = (VFrame) viewGroup.getChildAt(1);
        c8672b.f33434f = (RingProgressBarView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        c8672b.f33435g = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        c8672b.f33436h = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        c8672b.f33437i = (FrameLayout) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m141492b(C8672b c8672b, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137389y0, viewGroup, false);
        m141491a(c8672b, viewInflate);
        return viewInflate;
    }
}
