package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.view.diamond.BlackDiamondTagView;
import com.tantan.library.svga.SVGAnimationView;

/* JADX INFO: loaded from: classes10.dex */
public class z33 {
    /* JADX INFO: renamed from: a */
    public static void m218467a(BlackDiamondTagView blackDiamondTagView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        blackDiamondTagView.f39529d = (LinearLayout) viewGroup.getChildAt(0);
        blackDiamondTagView.f39530e = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        blackDiamondTagView.f39531f = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        blackDiamondTagView.f39532g = (SVGAnimationView) viewGroup.getChildAt(1);
        blackDiamondTagView.f39533h = (SVGAnimationView) viewGroup.getChildAt(2);
    }
}
