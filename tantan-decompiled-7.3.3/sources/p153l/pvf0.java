package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.increment.bullet.SpecialSystemBulletView;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VMarqueeText;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class pvf0 {
    /* JADX INFO: renamed from: a */
    public static void m173941a(SpecialSystemBulletView specialSystemBulletView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        specialSystemBulletView.f50311a = (ConstraintLayout) viewGroup.getChildAt(0);
        specialSystemBulletView.f50312b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        specialSystemBulletView.f50313c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        specialSystemBulletView.f50314d = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        specialSystemBulletView.f50315e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        specialSystemBulletView.f50316f = (VMarqueeText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        specialSystemBulletView.f50317g = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        specialSystemBulletView.f50318h = (SVGAnimationView) viewGroup.getChildAt(1);
    }
}
