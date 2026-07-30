package p153l;

import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.newui.boost.BoostGuidePushLayout;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class q83 {

    /* JADX INFO: renamed from: k */
    public static volatile q83 f156064k;

    /* JADX INFO: renamed from: a */
    public PopupWindow f156065a;

    /* JADX INFO: renamed from: b */
    public boolean f156066b = false;

    /* JADX INFO: renamed from: c */
    public vxd0 f156067c = new vxd0("boost_guide_last_interval_day_" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: d */
    public vxd0 f156068d = new vxd0("boost_guide_interval_day_" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: e */
    public byd0 f156069e = new byd0("boost_guide_show_time_" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: f */
    public boolean f156070f = false;

    /* JADX INFO: renamed from: g */
    public vxd0 f156071g = new vxd0("accelerate_pairing_guide_last_interval_day_" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: h */
    public vxd0 f156072h = new vxd0("accelerate_pairing_guide_interval_day_" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: i */
    public byd0 f156073i = new byd0("accelerate_pairing_push_guide_show_time_" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: j */
    public byd0 f156074j = new byd0("accelerate_pairing_guide_card_show_time_" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: d */
    public static q83 m175748d() {
        if (f156064k == null) {
            synchronized (q83.class) {
                try {
                    if (f156064k == null) {
                        f156064k = new q83();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f156064k;
    }

    /* JADX INFO: renamed from: a */
    public void m175749a() {
        if (!CoreModule.m30933P().m143408e().mo35993wq()) {
            this.f156069e.clear();
            this.f156068d.clear();
            this.f156067c.clear();
        } else {
            this.f156073i.clear();
            this.f156072h.clear();
            this.f156071g.clear();
            ric0.m181581i().accelerate_pairing_new_user_guide_show_time.clear();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m175750b() {
        if (NullChecker.m82486a(this.f156065a) && this.f156065a.isShowing()) {
            this.f156065a.dismiss();
            this.f156065a = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public int m175751c() {
        return 20;
    }

    /* JADX INFO: renamed from: e */
    public void m175752e() {
        if (ric0.m181583m()) {
            this.f156074j.put(Long.valueOf(pzi0.m174453n()));
            CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
            userInfo.virtualCardType = VirtualCardType.BoostGuideCard;
            userInfo.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
            userInfo.preSwipedDirection = SwipeDirection.LEFT;
            CoreModule.f18264c.f20405m0.m32157w6(userInfo, 0);
            return;
        }
        this.f156069e.put(Long.valueOf(pzi0.m174453n()));
        m175762o();
        CoreSuggested.UserInfo userInfo2 = new CoreSuggested.UserInfo();
        userInfo2.virtualCardType = VirtualCardType.BoostGuideCard;
        userInfo2.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo2.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.f18264c.f20405m0.m32157w6(userInfo2, 0);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m175753f() {
        return pzi0.m174454o() >= ric0.m181581i().accelerate_pairing_new_user_guide_show_time.get().longValue() + 86400000;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m175754g() {
        return pzi0.m174454o() >= this.f156074j.get().longValue() + 86400000;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m175755h() {
        return pzi0.m174454o() >= this.f156073i.get().longValue() + TimeUnit.DAYS.toMillis((long) (this.f156072h.get().intValue() + 1));
    }

    /* JADX INFO: renamed from: i */
    public boolean m175756i() {
        return CoreModule.m30933P().m143408e().mo35993wq() && CoreModule.f18264c.f20340Q1.m35742d3() && m175758k();
    }

    /* JADX INFO: renamed from: j */
    public boolean m175757j() {
        return CoreModule.m30933P().m143408e().mo35993wq() && !s7a.m184982k() && CoreModule.f18264c.f20340Q1.m35743e3() && (m175759l() || this.f156070f);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m175758k() {
        return ric0.m181581i().m181588l() && m175753f() && m175754g() && !pzi0.m174439D(this.f156073i.get().longValue());
    }

    /* JADX INFO: renamed from: l */
    public final boolean m175759l() {
        return ric0.m181581i().m181588l() && m175753f() && m175755h() && !pzi0.m174439D(this.f156074j.get().longValue());
    }

    /* JADX INFO: renamed from: m */
    public void m175760m(Act act) {
        boolean zM181583m = ric0.m181583m();
        PopupWindow popupWindow = this.f156065a;
        if (zM181583m) {
            if (popupWindow == null) {
                if (!this.f156070f) {
                    this.f156073i.put(Long.valueOf(pzi0.m174453n()));
                    m175761n();
                }
                this.f156070f = true;
                this.f156065a = new PopupWindow(act.inflater().inflate(kec0.f125704Y, (ViewGroup) null), bnl0.m105592y0() - bnl0.m105587w(16.0f), qa00.m175859d(72.0f), false);
            }
            if (this.f156065a.isShowing()) {
                return;
            }
            this.f156065a.showAtLocation(act.getWindow().getDecorView(), 49, 0, wgx.m206284B(act) + bnl0.m105587w(10.0f));
            ((BoostGuidePushLayout) this.f156065a.getContentView().findViewById(adc0.f69998L6)).m37185e(act);
            return;
        }
        if (popupWindow == null) {
            if (!this.f156066b) {
                this.f156069e.put(Long.valueOf(pzi0.m174453n()));
                m175762o();
            }
            this.f156066b = true;
            this.f156065a = new PopupWindow(act.inflater().inflate(kec0.f125704Y, (ViewGroup) null), bnl0.m105592y0() - bnl0.m105587w(16.0f), qa00.m175859d(72.0f), false);
        }
        if (this.f156065a.isShowing()) {
            return;
        }
        this.f156065a.showAtLocation(act.getWindow().getDecorView(), 49, 0, wgx.m206284B(act) + bnl0.m105587w(10.0f));
        ((BoostGuidePushLayout) this.f156065a.getContentView().findViewById(adc0.f69998L6)).m37185e(act);
    }

    /* JADX INFO: renamed from: n */
    public void m175761n() {
        Integer num = this.f156072h.get();
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            this.f156072h.put(1);
            return;
        }
        int iIntValue2 = iIntValue + this.f156071g.get().intValue();
        this.f156071g.put(num);
        this.f156072h.put(Integer.valueOf(Math.min(iIntValue2, 5)));
    }

    /* JADX INFO: renamed from: o */
    public void m175762o() {
        Integer num = this.f156068d.get();
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            this.f156068d.put(1);
            return;
        }
        int iIntValue2 = iIntValue + this.f156067c.get().intValue();
        this.f156067c.put(num);
        this.f156068d.put(Integer.valueOf(Math.min(iIntValue2, 5)));
    }
}
