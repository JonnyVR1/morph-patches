package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.FemaleVipConfig;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p046p1.mobile.putong.remote_config.RemoteConfigException;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class idi {

    /* JADX INFO: renamed from: e */
    public static idi f112557e;

    /* JADX INFO: renamed from: a */
    public zpd0 f112558a = new zpd0("female_vip_guide_show_time_v2" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public tpd0 f112559b = new tpd0("female_vip_home_card_swipe_count" + CoreModule.m29931H().userId(), 1);

    /* JADX INFO: renamed from: c */
    public zpd0 f112560c = new zpd0("female_vip_home_card_last_swipe_time" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: d */
    public FemaleVipConfig f112561d = null;

    /* JADX INFO: renamed from: c */
    public static idi m135447c() {
        if (f112557e == null) {
            synchronized (idi.class) {
                try {
                    if (f112557e == null) {
                        f112557e = new idi();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f112557e;
    }

    /* JADX INFO: renamed from: k */
    public static void m135448k() {
        f112557e = null;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m135449a() {
        return CoreModule.f17545c.f19598Q1.f20117R.m34749C();
    }

    /* JADX INFO: renamed from: b */
    public final int m135450b() {
        m135452e();
        if (NullChecker.m81303a(this.f112561d)) {
            return this.f112561d.guide_card_swipe_limit_count;
        }
        return 5;
    }

    /* JADX INFO: renamed from: d */
    public void m135451d() {
        this.f112559b.m189988a(1);
        this.f112560c.put(Long.valueOf(mqi0.m155944o()));
    }

    /* JADX INFO: renamed from: e */
    public final void m135452e() {
        if (this.f112561d == null) {
            try {
                this.f112561d = (FemaleVipConfig) RemoteConfig.m79298x().m79333v("female_vip_config", FemaleVipConfig.JSON_ADAPTER);
            } catch (RemoteConfigException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m135453f() {
        if (m135457j()) {
            return;
        }
        m135458l();
    }

    /* JADX INFO: renamed from: g */
    public void m135454g() {
        if (xma.m210039B3()) {
            return;
        }
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.FemaleVipGuideCard;
        userInfo.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.f17545c.f19663m0.m31154w6(userInfo, 0);
        this.f112558a.put(Long.valueOf(mqi0.m155944o()));
    }

    /* JADX INFO: renamed from: h */
    public final int m135455h() {
        m135452e();
        if (NullChecker.m81303a(this.f112561d)) {
            return this.f112561d.guide_card_insert_interval_day;
        }
        return 10;
    }

    /* JADX INFO: renamed from: i */
    public boolean m135456i() {
        m135452e();
        if (NullChecker.m81303a(this.f112561d)) {
            return this.f112561d.guide_card_right_swipe_guide_purchase;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m135457j() {
        return mqi0.m155929D(this.f112560c.get().longValue());
    }

    /* JADX INFO: renamed from: l */
    public final void m135458l() {
        this.f112559b.put(1);
    }

    /* JADX INFO: renamed from: m */
    public void m135459m() {
        this.f112559b.put(1);
        this.f112560c.put(0L);
        this.f112558a.put(0L);
    }

    /* JADX INFO: renamed from: n */
    public boolean m135460n() {
        m135453f();
        if (!m135449a() || this.f112559b.get().intValue() < m135450b()) {
            return false;
        }
        if (!xma.m210056U3() || xma.m210039B3() || this.f112558a.get().longValue() >= xma.m210090q3()) {
            return mqi0.m155927B(m135455h(), this.f112558a.get().longValue());
        }
        return true;
    }
}
