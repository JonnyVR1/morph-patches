package p009l;

import com.p000p1.mobile.putong.remote_config.RemoteConfig;
import com.p000p1.mobile.putong.remote_config.RemoteConfigException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.FemaleVipConfig;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.tantanapp.common.utils.NullChecker;
import l.tpd0;
import l.xma;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class idi {

    /* JADX INFO: renamed from: e */
    public static idi f14495e;

    /* JADX INFO: renamed from: a */
    public zpd0 f14496a = new zpd0("female_vip_guide_show_time_v2" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public tpd0 f14497b = new tpd0("female_vip_home_card_swipe_count" + CoreModule.H().userId(), 1);

    /* JADX INFO: renamed from: c */
    public zpd0 f14498c = new zpd0("female_vip_home_card_last_swipe_time" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: d */
    public FemaleVipConfig f14499d = null;

    /* JADX INFO: renamed from: c */
    public static idi m16341c() {
        if (f14495e == null) {
            synchronized (idi.class) {
                try {
                    if (f14495e == null) {
                        f14495e = new idi();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14495e;
    }

    /* JADX INFO: renamed from: k */
    public static void m16342k() {
        f14495e = null;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m16343a() {
        return CoreModule.c.Q1.R.C();
    }

    /* JADX INFO: renamed from: b */
    public final int m16344b() {
        m16346e();
        if (NullChecker.a(this.f14499d)) {
            return this.f14499d.guide_card_swipe_limit_count;
        }
        return 5;
    }

    /* JADX INFO: renamed from: d */
    public void m16345d() {
        this.f14497b.a(1);
        this.f14498c.put(Long.valueOf(mqi0.m18550o()));
    }

    /* JADX INFO: renamed from: e */
    public final void m16346e() {
        if (this.f14499d == null) {
            try {
                this.f14499d = (FemaleVipConfig) RemoteConfig.m9619x().m9654v("female_vip_config", FemaleVipConfig.JSON_ADAPTER);
            } catch (RemoteConfigException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m16347f() {
        if (m16351j()) {
            return;
        }
        m16352l();
    }

    /* JADX INFO: renamed from: g */
    public void m16348g() {
        if (xma.B3()) {
            return;
        }
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.FemaleVipGuideCard;
        userInfo.id = "VirtualCard";
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.c.m0.w6(userInfo, 0);
        this.f14496a.put(Long.valueOf(mqi0.m18550o()));
    }

    /* JADX INFO: renamed from: h */
    public final int m16349h() {
        m16346e();
        if (NullChecker.a(this.f14499d)) {
            return this.f14499d.guide_card_insert_interval_day;
        }
        return 10;
    }

    /* JADX INFO: renamed from: i */
    public boolean m16350i() {
        m16346e();
        if (NullChecker.a(this.f14499d)) {
            return this.f14499d.guide_card_right_swipe_guide_purchase;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m16351j() {
        return mqi0.m18535D(((Long) this.f14498c.get()).longValue());
    }

    /* JADX INFO: renamed from: l */
    public final void m16352l() {
        this.f14497b.put(1);
    }

    /* JADX INFO: renamed from: m */
    public void m16353m() {
        this.f14497b.put(1);
        this.f14498c.put(0L);
        this.f14496a.put(0L);
    }

    /* JADX INFO: renamed from: n */
    public boolean m16354n() {
        m16347f();
        if (!m16343a() || ((Integer) this.f14497b.get()).intValue() < m16344b()) {
            return false;
        }
        if (!xma.U3() || xma.B3() || ((Long) this.f14496a.get()).longValue() >= xma.q3()) {
            return mqi0.m18533B(m16349h(), ((Long) this.f14496a.get()).longValue());
        }
        return true;
    }
}
