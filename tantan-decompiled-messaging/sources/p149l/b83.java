package p149l;

import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.newui.boost.BoostGuidePushLayout;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class b83 {

    /* JADX INFO: renamed from: k */
    public static volatile b83 f74035k;

    /* JADX INFO: renamed from: a */
    public PopupWindow f74036a;

    /* JADX INFO: renamed from: b */
    public boolean f74037b = false;

    /* JADX INFO: renamed from: c */
    public tpd0 f74038c = new tpd0("boost_guide_last_interval_day_" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: d */
    public tpd0 f74039d = new tpd0("boost_guide_interval_day_" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: e */
    public zpd0 f74040e = new zpd0("boost_guide_show_time_" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: f */
    public boolean f74041f = false;

    /* JADX INFO: renamed from: g */
    public tpd0 f74042g = new tpd0("accelerate_pairing_guide_last_interval_day_" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: h */
    public tpd0 f74043h = new tpd0("accelerate_pairing_guide_interval_day_" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: i */
    public zpd0 f74044i = new zpd0("accelerate_pairing_push_guide_show_time_" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: j */
    public zpd0 f74045j = new zpd0("accelerate_pairing_guide_card_show_time_" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: d */
    public static b83 m100710d() {
        if (f74035k == null) {
            synchronized (b83.class) {
                try {
                    if (f74035k == null) {
                        f74035k = new b83();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f74035k;
    }

    /* JADX INFO: renamed from: a */
    public void m100711a() {
        if (!CoreModule.m29935P().m94654e().mo34990wq()) {
            this.f74040e.clear();
            this.f74039d.clear();
            this.f74038c.clear();
        } else {
            this.f74044i.clear();
            this.f74043h.clear();
            this.f74042g.clear();
            lac0.m149134i().accelerate_pairing_new_user_guide_show_time.clear();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m100712b() {
        if (NullChecker.m81303a(this.f74036a) && this.f74036a.isShowing()) {
            this.f74036a.dismiss();
            this.f74036a = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public int m100713c() {
        return 20;
    }

    /* JADX INFO: renamed from: e */
    public void m100714e() {
        if (lac0.m149136m()) {
            this.f74045j.put(Long.valueOf(mqi0.m155943n()));
            CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
            userInfo.virtualCardType = VirtualCardType.BoostGuideCard;
            userInfo.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
            userInfo.preSwipedDirection = SwipeDirection.LEFT;
            CoreModule.f17545c.f19663m0.m31154w6(userInfo, 0);
            return;
        }
        this.f74040e.put(Long.valueOf(mqi0.m155943n()));
        m100724o();
        CoreSuggested.UserInfo userInfo2 = new CoreSuggested.UserInfo();
        userInfo2.virtualCardType = VirtualCardType.BoostGuideCard;
        userInfo2.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo2.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.f17545c.f19663m0.m31154w6(userInfo2, 0);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m100715f() {
        return mqi0.m155944o() >= lac0.m149134i().accelerate_pairing_new_user_guide_show_time.get().longValue() + 86400000;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m100716g() {
        return mqi0.m155944o() >= this.f74045j.get().longValue() + 86400000;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m100717h() {
        return mqi0.m155944o() >= this.f74044i.get().longValue() + TimeUnit.DAYS.toMillis((long) (this.f74043h.get().intValue() + 1));
    }

    /* JADX INFO: renamed from: i */
    public boolean m100718i() {
        return CoreModule.m29935P().m94654e().mo34990wq() && CoreModule.f17545c.f19598Q1.m34739d3() && m100720k();
    }

    /* JADX INFO: renamed from: j */
    public boolean m100719j() {
        return CoreModule.m29935P().m94654e().mo34990wq() && !g6a.m124562k() && CoreModule.f17545c.f19598Q1.m34740e3() && (m100721l() || this.f74041f);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m100720k() {
        return lac0.m149134i().m149141l() && m100715f() && m100716g() && !mqi0.m155929D(this.f74044i.get().longValue());
    }

    /* JADX INFO: renamed from: l */
    public final boolean m100721l() {
        return lac0.m149134i().m149141l() && m100715f() && m100717h() && !mqi0.m155929D(this.f74045j.get().longValue());
    }

    /* JADX INFO: renamed from: m */
    public void m100722m(Act act) {
        boolean zM149136m = lac0.m149136m();
        PopupWindow popupWindow = this.f74036a;
        if (zM149136m) {
            if (popupWindow == null) {
                if (!this.f74041f) {
                    this.f74044i.put(Long.valueOf(mqi0.m155943n()));
                    m100723n();
                }
                this.f74041f = true;
                this.f74036a = new PopupWindow(act.inflater().inflate(f6c0.f95650Y, (ViewGroup) null), xdl0.m208412y0() - xdl0.m208407w(16.0f), t100.m186890d(72.0f), false);
            }
            if (this.f74036a.isShowing()) {
                return;
            }
            this.f74036a.showAtLocation(act.getWindow().getDecorView(), 49, 0, xdx.m208434B(act) + xdl0.m208407w(10.0f));
            ((BoostGuidePushLayout) this.f74036a.getContentView().findViewById(u4c0.f173876J6)).m36182e(act);
            return;
        }
        if (popupWindow == null) {
            if (!this.f74037b) {
                this.f74040e.put(Long.valueOf(mqi0.m155943n()));
                m100724o();
            }
            this.f74037b = true;
            this.f74036a = new PopupWindow(act.inflater().inflate(f6c0.f95650Y, (ViewGroup) null), xdl0.m208412y0() - xdl0.m208407w(16.0f), t100.m186890d(72.0f), false);
        }
        if (this.f74036a.isShowing()) {
            return;
        }
        this.f74036a.showAtLocation(act.getWindow().getDecorView(), 49, 0, xdx.m208434B(act) + xdl0.m208407w(10.0f));
        ((BoostGuidePushLayout) this.f74036a.getContentView().findViewById(u4c0.f173876J6)).m36182e(act);
    }

    /* JADX INFO: renamed from: n */
    public void m100723n() {
        Integer num = this.f74043h.get();
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            this.f74043h.put(1);
            return;
        }
        int iIntValue2 = iIntValue + this.f74042g.get().intValue();
        this.f74042g.put(num);
        this.f74043h.put(Integer.valueOf(Math.min(iIntValue2, 5)));
    }

    /* JADX INFO: renamed from: o */
    public void m100724o() {
        Integer num = this.f74039d.get();
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            this.f74039d.put(1);
            return;
        }
        int iIntValue2 = iIntValue + this.f74038c.get().intValue();
        this.f74038c.put(num);
        this.f74039d.put(Integer.valueOf(Math.min(iIntValue2, 5)));
    }
}
