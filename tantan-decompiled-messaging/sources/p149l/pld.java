package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.increment.bullet.DefaultBulletView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VMarqueeText;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class pld {
    /* JADX INFO: renamed from: a */
    public static void m170119a(DefaultBulletView defaultBulletView, View view) {
        defaultBulletView.f49458d = (DefaultBulletView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        defaultBulletView.f49459e = (VDraweeView) viewGroup.getChildAt(0);
        defaultBulletView.f49460f = (VText) viewGroup.getChildAt(1);
        defaultBulletView.f49461g = (VMarqueeText) viewGroup.getChildAt(2);
        defaultBulletView.f49462h = (VImage) viewGroup.getChildAt(3);
    }
}
