package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.bullet.DefaultBulletView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class pld {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m20425a(DefaultBulletView defaultBulletView, View view) {
        defaultBulletView.f5500d = (DefaultBulletView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        defaultBulletView.f5501e = viewGroup.getChildAt(0);
        defaultBulletView.f5502f = viewGroup.getChildAt(1);
        defaultBulletView.f5503g = viewGroup.getChildAt(2);
        defaultBulletView.f5504h = viewGroup.getChildAt(3);
    }
}
