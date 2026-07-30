package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.increment.bullet.SpecialSystemBulletView;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VMarqueeText;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class gnf0 {
    /* JADX INFO: renamed from: a */
    public static void m127137a(SpecialSystemBulletView specialSystemBulletView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        specialSystemBulletView.f49463a = (ConstraintLayout) viewGroup.getChildAt(0);
        specialSystemBulletView.f49464b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        specialSystemBulletView.f49465c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        specialSystemBulletView.f49466d = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        specialSystemBulletView.f49467e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        specialSystemBulletView.f49468f = (VMarqueeText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        specialSystemBulletView.f49469g = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        specialSystemBulletView.f49470h = (SVGAnimationView) viewGroup.getChildAt(1);
    }
}
