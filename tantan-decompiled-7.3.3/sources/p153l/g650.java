package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VImage;

/* JADX INFO: loaded from: classes13.dex */
public class g650 {
    /* JADX INFO: renamed from: a */
    public static void m129090a(ODiamondTagLabel oDiamondTagLabel, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        oDiamondTagLabel.f55012d = (FrameLayout) viewGroup.getChildAt(0);
        oDiamondTagLabel.f55013e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        oDiamondTagLabel.f55014f = (SVGAnimationView) viewGroup.getChildAt(1);
    }
}
