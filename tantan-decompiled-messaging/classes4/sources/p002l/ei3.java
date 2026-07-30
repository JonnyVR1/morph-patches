package p002l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.bullet.BulletType;
import com.p000p1.mobile.putong.live.livingroom.increment.bullet.DefaultBulletView;
import com.p000p1.mobile.putong.live.livingroom.increment.bullet.SpecialSystemBulletView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ei3 {

    /* JADX INFO: renamed from: a */
    public Map<BulletType, DefaultBulletView> f9799a = new HashMap();

    /* JADX INFO: renamed from: a */
    public DefaultBulletView m12547a(BulletType bulletType, ViewGroup viewGroup) {
        DefaultBulletView defaultBulletView = this.f9799a.get(bulletType);
        if (defaultBulletView != null) {
            return defaultBulletView;
        }
        DefaultBulletView defaultBulletView2 = (DefaultBulletView) LayoutInflater.from(viewGroup.getContext()).inflate(bulletType.getLayoutId(), viewGroup, false);
        this.f9799a.put(bulletType, defaultBulletView2);
        return defaultBulletView2;
    }

    /* JADX INFO: renamed from: b */
    public SpecialSystemBulletView m12548b(ViewGroup viewGroup) {
        return (SpecialSystemBulletView) LayoutInflater.from(viewGroup.getContext()).inflate(BulletType.SPECIAL_BULLET_STYLE.getLayoutId(), viewGroup, false);
    }
}
