package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.RedDotButton;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class asc0 {
    /* JADX INFO: renamed from: a */
    public static void m99897a(RedDotButton redDotButton, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        redDotButton.f49380a = (FrameLayout) viewGroup.getChildAt(0);
        redDotButton.f49381b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        redDotButton.f49382c = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        redDotButton.f49383d = viewGroup.getChildAt(1);
    }
}
