package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.increment.bullet.DefaultBulletView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VMarqueeText;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class vmd {
    /* JADX INFO: renamed from: a */
    public static void m201728a(DefaultBulletView defaultBulletView, View view) {
        defaultBulletView.f50306d = (DefaultBulletView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        defaultBulletView.f50307e = (VDraweeView) viewGroup.getChildAt(0);
        defaultBulletView.f50308f = (VText) viewGroup.getChildAt(1);
        defaultBulletView.f50309g = (VMarqueeText) viewGroup.getChildAt(2);
        defaultBulletView.f50310h = (VImage) viewGroup.getChildAt(3);
    }
}
