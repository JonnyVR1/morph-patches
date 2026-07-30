package p149l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.increment.bullet.BulletType;
import com.p046p1.mobile.putong.live.livingroom.increment.bullet.DefaultBulletView;
import com.p046p1.mobile.putong.live.livingroom.increment.bullet.SpecialSystemBulletView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class ei3 {

    /* JADX INFO: renamed from: a */
    public Map<BulletType, DefaultBulletView> f91543a = new HashMap();

    /* JADX INFO: renamed from: a */
    public DefaultBulletView m116621a(BulletType bulletType, ViewGroup viewGroup) {
        DefaultBulletView defaultBulletView = this.f91543a.get(bulletType);
        if (defaultBulletView != null) {
            return defaultBulletView;
        }
        DefaultBulletView defaultBulletView2 = (DefaultBulletView) LayoutInflater.from(viewGroup.getContext()).inflate(bulletType.getLayoutId(), viewGroup, false);
        this.f91543a.put(bulletType, defaultBulletView2);
        return defaultBulletView2;
    }

    /* JADX INFO: renamed from: b */
    public SpecialSystemBulletView m116622b(ViewGroup viewGroup) {
        return (SpecialSystemBulletView) LayoutInflater.from(viewGroup.getContext()).inflate(BulletType.SPECIAL_BULLET_STYLE.getLayoutId(), viewGroup, false);
    }
}
