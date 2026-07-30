package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.RedDotButton;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class tjc0 {
    /* JADX INFO: renamed from: a */
    public static void m189250a(RedDotButton redDotButton, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        redDotButton.f48532a = (FrameLayout) viewGroup.getChildAt(0);
        redDotButton.f48533b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        redDotButton.f48534c = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        redDotButton.f48535d = viewGroup.getChildAt(1);
    }
}
