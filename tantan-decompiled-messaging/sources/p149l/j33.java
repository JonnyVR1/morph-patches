package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.view.diamond.BlackDiamondTagView;
import com.tantan.library.svga.SVGAnimationView;

/* JADX INFO: loaded from: classes10.dex */
public class j33 {
    /* JADX INFO: renamed from: a */
    public static void m139515a(BlackDiamondTagView blackDiamondTagView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        blackDiamondTagView.f38681d = (LinearLayout) viewGroup.getChildAt(0);
        blackDiamondTagView.f38682e = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        blackDiamondTagView.f38683f = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        blackDiamondTagView.f38684g = (SVGAnimationView) viewGroup.getChildAt(1);
        blackDiamondTagView.f38685h = (SVGAnimationView) viewGroup.getChildAt(2);
    }
}
