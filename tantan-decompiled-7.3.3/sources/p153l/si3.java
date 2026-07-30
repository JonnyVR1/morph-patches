package p153l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.increment.bullet.BulletType;
import com.p051p1.mobile.putong.live.livingroom.increment.bullet.DefaultBulletView;
import com.p051p1.mobile.putong.live.livingroom.increment.bullet.SpecialSystemBulletView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class si3 {

    /* JADX INFO: renamed from: a */
    public Map<BulletType, DefaultBulletView> f168789a = new HashMap();

    /* JADX INFO: renamed from: a */
    public DefaultBulletView m186000a(BulletType bulletType, ViewGroup viewGroup) {
        DefaultBulletView defaultBulletView = this.f168789a.get(bulletType);
        if (defaultBulletView != null) {
            return defaultBulletView;
        }
        DefaultBulletView defaultBulletView2 = (DefaultBulletView) LayoutInflater.from(viewGroup.getContext()).inflate(bulletType.getLayoutId(), viewGroup, false);
        this.f168789a.put(bulletType, defaultBulletView2);
        return defaultBulletView2;
    }

    /* JADX INFO: renamed from: b */
    public SpecialSystemBulletView m186001b(ViewGroup viewGroup) {
        return (SpecialSystemBulletView) LayoutInflater.from(viewGroup.getContext()).inflate(BulletType.SPECIAL_BULLET_STYLE.getLayoutId(), viewGroup, false);
    }
}
