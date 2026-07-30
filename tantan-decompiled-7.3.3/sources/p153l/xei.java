package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.FemaleVipConfig;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p051p1.mobile.putong.remote_config.RemoteConfigException;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class xei {

    /* JADX INFO: renamed from: e */
    public static xei f193935e;

    /* JADX INFO: renamed from: a */
    public byd0 f193936a = new byd0("female_vip_guide_show_time_v2" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public vxd0 f193937b = new vxd0("female_vip_home_card_swipe_count" + CoreModule.m30929H().userId(), 1);

    /* JADX INFO: renamed from: c */
    public byd0 f193938c = new byd0("female_vip_home_card_last_swipe_time" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: d */
    public FemaleVipConfig f193939d = null;

    /* JADX INFO: renamed from: c */
    public static xei m210680c() {
        if (f193935e == null) {
            synchronized (xei.class) {
                try {
                    if (f193935e == null) {
                        f193935e = new xei();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f193935e;
    }

    /* JADX INFO: renamed from: k */
    public static void m210681k() {
        f193935e = null;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m210682a() {
        return CoreModule.f18264c.f20340Q1.f20859R.m35752C();
    }

    /* JADX INFO: renamed from: b */
    public final int m210683b() {
        m210685e();
        if (NullChecker.m82486a(this.f193939d)) {
            return this.f193939d.guide_card_swipe_limit_count;
        }
        return 5;
    }

    /* JADX INFO: renamed from: d */
    public void m210684d() {
        this.f193937b.m203841a(1);
        this.f193938c.put(Long.valueOf(pzi0.m174454o()));
    }

    /* JADX INFO: renamed from: e */
    public final void m210685e() {
        if (this.f193939d == null) {
            try {
                this.f193939d = (FemaleVipConfig) RemoteConfig.m80481x().m80516v("female_vip_config", FemaleVipConfig.JSON_ADAPTER);
            } catch (RemoteConfigException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m210686f() {
        if (m210690j()) {
            return;
        }
        m210691l();
    }

    /* JADX INFO: renamed from: g */
    public void m210687g() {
        if (joa.m146353C3()) {
            return;
        }
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.FemaleVipGuideCard;
        userInfo.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.f18264c.f20405m0.m32157w6(userInfo, 0);
        this.f193936a.put(Long.valueOf(pzi0.m174454o()));
    }

    /* JADX INFO: renamed from: h */
    public final int m210688h() {
        m210685e();
        if (NullChecker.m82486a(this.f193939d)) {
            return this.f193939d.guide_card_insert_interval_day;
        }
        return 10;
    }

    /* JADX INFO: renamed from: i */
    public boolean m210689i() {
        m210685e();
        if (NullChecker.m82486a(this.f193939d)) {
            return this.f193939d.guide_card_right_swipe_guide_purchase;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m210690j() {
        return pzi0.m174439D(this.f193938c.get().longValue());
    }

    /* JADX INFO: renamed from: l */
    public final void m210691l() {
        this.f193937b.put(1);
    }

    /* JADX INFO: renamed from: m */
    public void m210692m() {
        this.f193937b.put(1);
        this.f193938c.put(0L);
        this.f193936a.put(0L);
    }

    /* JADX INFO: renamed from: n */
    public boolean m210693n() {
        m210686f();
        if (!m210682a() || this.f193937b.get().intValue() < m210683b()) {
            return false;
        }
        if (!joa.m146370V3() || joa.m146353C3() || this.f193936a.get().longValue() >= joa.m146404q3()) {
            return pzi0.m174437B(m210688h(), this.f193936a.get().longValue());
        }
        return true;
    }
}
