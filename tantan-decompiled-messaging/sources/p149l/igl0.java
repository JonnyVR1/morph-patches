package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.core.p053ui.result.C8839a;
import p147v.VPager;
import p147v.VPagerCircleIndicator;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class igl0 {
    /* JADX INFO: renamed from: a */
    public static void m136074a(C8839a c8839a, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c8839a.f35688a = (ImageView) viewGroup.getChildAt(0);
        c8839a.f35689b = (VPager) viewGroup.getChildAt(1);
        c8839a.f35690c = (VPagerCircleIndicator) viewGroup.getChildAt(2);
        c8839a.f35691d = (VText) viewGroup.getChildAt(4);
    }
}
