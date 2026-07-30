package p009l;

import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.p000p1.mobile.putong.core.newui.boost.BoostGuidePushLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import l.f6c0;
import l.g6a;
import l.lac0;
import l.t100;
import l.tpd0;
import l.u4c0;
import l.xdl0;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class b83 {

    /* JADX INFO: renamed from: k */
    public static volatile b83 f9946k;

    /* JADX INFO: renamed from: a */
    public PopupWindow f9947a;

    /* JADX INFO: renamed from: b */
    public boolean f9948b = false;

    /* JADX INFO: renamed from: c */
    public tpd0 f9949c = new tpd0("boost_guide_last_interval_day_" + CoreModule.H().userId(), 0);

    /* JADX INFO: renamed from: d */
    public tpd0 f9950d = new tpd0("boost_guide_interval_day_" + CoreModule.H().userId(), 0);

    /* JADX INFO: renamed from: e */
    public zpd0 f9951e = new zpd0("boost_guide_show_time_" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: f */
    public boolean f9952f = false;

    /* JADX INFO: renamed from: g */
    public tpd0 f9953g = new tpd0("accelerate_pairing_guide_last_interval_day_" + CoreModule.H().userId(), 0);

    /* JADX INFO: renamed from: h */
    public tpd0 f9954h = new tpd0("accelerate_pairing_guide_interval_day_" + CoreModule.H().userId(), 0);

    /* JADX INFO: renamed from: i */
    public zpd0 f9955i = new zpd0("accelerate_pairing_push_guide_show_time_" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: j */
    public zpd0 f9956j = new zpd0("accelerate_pairing_guide_card_show_time_" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: d */
    public static b83 m11899d() {
        if (f9946k == null) {
            synchronized (b83.class) {
                try {
                    if (f9946k == null) {
                        f9946k = new b83();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f9946k;
    }

    /* JADX INFO: renamed from: a */
    public void m11900a() {
        if (!CoreModule.P().e().wq()) {
            this.f9951e.clear();
            this.f9950d.clear();
            this.f9949c.clear();
        } else {
            this.f9955i.clear();
            this.f9954h.clear();
            this.f9953g.clear();
            lac0.i().e.clear();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m11901b() {
        if (NullChecker.a(this.f9947a) && this.f9947a.isShowing()) {
            this.f9947a.dismiss();
            this.f9947a = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public int m11902c() {
        return 20;
    }

    /* JADX INFO: renamed from: e */
    public void m11903e() {
        if (lac0.m()) {
            this.f9956j.put(Long.valueOf(mqi0.m18549n()));
            CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
            userInfo.virtualCardType = VirtualCardType.BoostGuideCard;
            userInfo.id = "VirtualCard";
            userInfo.preSwipedDirection = SwipeDirection.LEFT;
            CoreModule.c.m0.w6(userInfo, 0);
            return;
        }
        this.f9951e.put(Long.valueOf(mqi0.m18549n()));
        m11913o();
        CoreSuggested.UserInfo userInfo2 = new CoreSuggested.UserInfo();
        userInfo2.virtualCardType = VirtualCardType.BoostGuideCard;
        userInfo2.id = "VirtualCard";
        userInfo2.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.c.m0.w6(userInfo2, 0);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m11904f() {
        return mqi0.m18550o() >= ((Long) lac0.i().e.get()).longValue() + 86400000;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m11905g() {
        return mqi0.m18550o() >= ((Long) this.f9956j.get()).longValue() + 86400000;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m11906h() {
        return mqi0.m18550o() >= ((Long) this.f9955i.get()).longValue() + TimeUnit.DAYS.toMillis((long) (((Integer) this.f9954h.get()).intValue() + 1));
    }

    /* JADX INFO: renamed from: i */
    public boolean m11907i() {
        return CoreModule.P().e().wq() && CoreModule.c.Q1.d3() && m11909k();
    }

    /* JADX INFO: renamed from: j */
    public boolean m11908j() {
        return CoreModule.P().e().wq() && !g6a.k() && CoreModule.c.Q1.e3() && (m11910l() || this.f9952f);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m11909k() {
        return lac0.i().l() && m11904f() && m11905g() && !mqi0.m18535D(((Long) this.f9955i.get()).longValue());
    }

    /* JADX INFO: renamed from: l */
    public final boolean m11910l() {
        return lac0.i().l() && m11904f() && m11906h() && !mqi0.m18535D(((Long) this.f9956j.get()).longValue());
    }

    /* JADX INFO: renamed from: m */
    public void m11911m(Act act) {
        boolean zM = lac0.m();
        PopupWindow popupWindow = this.f9947a;
        if (zM) {
            if (popupWindow == null) {
                if (!this.f9952f) {
                    this.f9955i.put(Long.valueOf(mqi0.m18549n()));
                    m11912n();
                }
                this.f9952f = true;
                this.f9947a = new PopupWindow(act.inflater().inflate(f6c0.Y, (ViewGroup) null), xdl0.y0() - xdl0.w(16.0f), t100.d(72.0f), false);
            }
            if (this.f9947a.isShowing()) {
                return;
            }
            this.f9947a.showAtLocation(act.getWindow().getDecorView(), 49, 0, xdx.m24779B(act) + xdl0.w(10.0f));
            ((BoostGuidePushLayout) this.f9947a.getContentView().findViewById(u4c0.J6)).m83e(act);
            return;
        }
        if (popupWindow == null) {
            if (!this.f9948b) {
                this.f9951e.put(Long.valueOf(mqi0.m18549n()));
                m11913o();
            }
            this.f9948b = true;
            this.f9947a = new PopupWindow(act.inflater().inflate(f6c0.Y, (ViewGroup) null), xdl0.y0() - xdl0.w(16.0f), t100.d(72.0f), false);
        }
        if (this.f9947a.isShowing()) {
            return;
        }
        this.f9947a.showAtLocation(act.getWindow().getDecorView(), 49, 0, xdx.m24779B(act) + xdl0.w(10.0f));
        ((BoostGuidePushLayout) this.f9947a.getContentView().findViewById(u4c0.J6)).m83e(act);
    }

    /* JADX INFO: renamed from: n */
    public void m11912n() {
        Integer num = (Integer) this.f9954h.get();
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            this.f9954h.put(1);
            return;
        }
        int iIntValue2 = iIntValue + ((Integer) this.f9953g.get()).intValue();
        this.f9953g.put(num);
        this.f9954h.put(Integer.valueOf(Math.min(iIntValue2, 5)));
    }

    /* JADX INFO: renamed from: o */
    public void m11913o() {
        Integer num = (Integer) this.f9950d.get();
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            this.f9950d.put(1);
            return;
        }
        int iIntValue2 = iIntValue + ((Integer) this.f9949c.get()).intValue();
        this.f9949c.put(num);
        this.f9950d.put(Integer.valueOf(Math.min(iIntValue2, 5)));
    }
}
