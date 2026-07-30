package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VImage;

/* JADX INFO: loaded from: classes12.dex */
public class rx40 {
    /* JADX INFO: renamed from: a */
    public static void m181469a(ODiamondTagLabel oDiamondTagLabel, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        oDiamondTagLabel.f54164d = (FrameLayout) viewGroup.getChildAt(0);
        oDiamondTagLabel.f54165e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        oDiamondTagLabel.f54166f = (SVGAnimationView) viewGroup.getChildAt(1);
    }
}
