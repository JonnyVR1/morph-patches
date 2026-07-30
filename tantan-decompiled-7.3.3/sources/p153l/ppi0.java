package p153l;

import android.app.Activity;
import android.net.NetworkInfo;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.UserLiveSettings;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.base.data.BLiveConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveSettings;
import com.p051p1.mobile.putong.live.base.data.BLiveTeenMode;
import com.p051p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p051p1.mobile.putong.live.external.page.teenmode.LiveTeenDialogAct;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class ppi0 {

    /* JADX INFO: renamed from: k */
    public static final TimeZone f153534k = TimeZone.getTimeZone("GMT+8");

    /* JADX INFO: renamed from: l */
    public static volatile ppi0 f153535l = null;

    /* JADX INFO: renamed from: m */
    public static volatile String f153536m = "";

    /* JADX INFO: renamed from: a */
    public BLiveTeenMode f153537a;

    /* JADX INFO: renamed from: b */
    public UserLiveSettings f153538b;

    /* JADX INFO: renamed from: c */
    public kcg0 f153539c;

    /* JADX INFO: renamed from: e */
    public kcg0 f153541e;

    /* JADX INFO: renamed from: g */
    public vxd0 f153543g;

    /* JADX INFO: renamed from: h */
    public byd0 f153544h;

    /* JADX INFO: renamed from: i */
    public jxd0 f153545i;

    /* JADX INFO: renamed from: j */
    public jxd0 f153546j;

    /* JADX INFO: renamed from: d */
    public C22507a<Boolean> f153540d = C22507a.m222758b();

    /* JADX INFO: renamed from: f */
    public wyd0 f153542f = new wyd0("teen_func_show" + mbs.m157870o0(), "");

    public ppi0() {
        String str = "teen_func_enable" + mbs.m157870o0();
        Boolean bool = Boolean.FALSE;
        this.f153545i = new jxd0(str, bool);
        this.f153546j = new jxd0("teen_mode_live_settings_enable_" + mbs.m157870o0(), bool);
        ConnectivityReceiver.m82473m().skip(1).filter(new qcj() { // from class: l.kpi0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).filter(new qcj() { // from class: l.lpi0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ppi0.m173204c((NetworkInfo) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.mpi0
            @Override // p153l.y20
            public final void call(Object obj) {
                ppi0.m173203b((NetworkInfo) obj);
            }
        }));
        if (!yw0.m217558a() && NullChecker.m82486a(tbs.f172989b)) {
            this.f153537a = tbs.f172989b.m203388C5();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m173203b(NetworkInfo networkInfo) {
        vwt vwtVar;
        BLiveSettings bLiveSettingsM203370A3;
        if (!mqr.m159592l() || (vwtVar = tbs.f172989b) == null || (bLiveSettingsM203370A3 = vwtVar.m203370A3()) == null || !mbs.m157858i0()) {
            return;
        }
        m173207l().m173226v(bLiveSettingsM203370A3);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Boolean m173204c(NetworkInfo networkInfo) {
        if (uqb0.f180396b0.f170324a == null) {
            CrashHelper.m82479c(new RuntimeException("TeenModeManager Putong.service.account == null"));
            return Boolean.FALSE;
        }
        boolean z = (uqb0.f180397c0.signedIn_() ? uqb0.f180404j0.f88244b : uqb0.f180404j0.f88248f).m222761e() == null;
        if (z) {
            CrashHelper.m82479c(new RuntimeException("TeenModeManager moduleLoad false"));
        }
        return Boolean.valueOf(!z);
    }

    /* JADX INFO: renamed from: l */
    public static ppi0 m173207l() {
        String strM157870o0 = mbs.m157870o0() == null ? "" : mbs.m157870o0();
        if (f153535l == null) {
            synchronized (ppi0.class) {
                try {
                    if (f153535l == null) {
                        f153536m = strM157870o0;
                        f153535l = new ppi0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (!f153536m.equals(strM157870o0)) {
            synchronized (ppi0.class) {
                try {
                    if (!f153536m.equals(strM157870o0)) {
                        f153536m = strM157870o0;
                        f153535l.m173227w();
                        f153535l = new ppi0();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f153535l;
    }

    /* JADX INFO: renamed from: A */
    public void m173208A(Act act) {
        m173210C(act);
    }

    /* JADX INFO: renamed from: B */
    public void m173209B(Act act) {
        m173210C(act);
    }

    /* JADX INFO: renamed from: C */
    public void m173210C(Act act) {
        act.startActivity(LiveWebViewAct.m70067e2(act, efv.f93849f, LiveWebViewAct.f45694k));
    }

    /* JADX INFO: renamed from: f */
    public boolean m173211f() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public void m173212g(Act act) {
        if (uqb0.f180396b0.f170324a.signedIn_() && mqr.m159592l()) {
            m173217m(act);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m173213h() {
        Iterator<ArrayList<Act.C4450r>> it = Act.globalLifeCycle_().values().iterator();
        while (it.hasNext()) {
            Iterator<Act.C4450r> it2 = it.next().iterator();
            while (it2.hasNext()) {
                Activity activity = it2.next().f16062a.get();
                if (activity != null && tbs.f172993f.m143711m(activity)) {
                    activity.finish();
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m173214i() {
        Iterator<ArrayList<Act.C4450r>> it = Act.globalLifeCycle_().values().iterator();
        while (it.hasNext()) {
            Iterator<Act.C4450r> it2 = it.next().iterator();
            while (it2.hasNext()) {
                Activity activity = it2.next().f16062a.get();
                if (activity != null && (activity instanceof LiveTeenDialogAct)) {
                    activity.finish();
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean m173215j() {
        Iterator<ArrayList<Act.C4450r>> it = Act.globalLifeCycle_().values().iterator();
        while (it.hasNext()) {
            Iterator<Act.C4450r> it2 = it.next().iterator();
            while (it2.hasNext()) {
                Activity activity = it2.next().f16062a.get();
                if (activity != null) {
                    if (activity instanceof LiveTeenDialogAct) {
                        return true;
                    }
                    if ((activity instanceof LiveWebViewAct) && ((LiveWebViewAct) activity).m70070g2() == LiveWebViewAct.f45694k) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public boolean m173216k() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m173217m(Act act) {
        if (act instanceof LiveTeenDialogAct) {
            return true;
        }
        return (act instanceof LiveWebViewAct) && ((LiveWebViewAct) act).m70070g2() == LiveWebViewAct.f45694k;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m173218n(BLiveSettings bLiveSettings, SettingGroups settingGroups) {
        BLiveConfig bLiveConfig;
        if (bLiveSettings == null || (bLiveConfig = bLiveSettings.liveConfig) == null || settingGroups == null) {
            return;
        }
        this.f153537a = bLiveConfig.teenMode;
        UserLiveSettings userLiveSettings = settingGroups.live;
        this.f153538b = userLiveSettings;
        this.f153545i.put(userLiveSettings.teenModeEnable);
        this.f153540d.onNext(this.f153538b.teenModeEnable);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m173219o(Throwable th) {
        this.f153539c = null;
    }

    /* JADX INFO: renamed from: p */
    public void m173220p(boolean z, int i) {
        if (z) {
            if (i == 1) {
                m173223s();
            } else if (i == 2) {
                m173221q();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m173221q() {
        this.f153544h.put(Long.valueOf(System.currentTimeMillis()));
        m173223s();
    }

    /* JADX INFO: renamed from: r */
    public void m173222r(boolean z) {
        m173213h();
        m173214i();
        UserLiveSettings userLiveSettings = this.f153538b;
        if (userLiveSettings == null) {
            psd0.m173633z(this.f153539c);
            this.f153539c = null;
            m173226v(tbs.f172989b.m203370A3());
        } else {
            boolean z2 = userLiveSettings.teenModeEnable.booleanValue() != z;
            this.f153538b.teenModeEnable = Boolean.valueOf(z);
            this.f153545i.put(Boolean.valueOf(z));
            if (!z) {
                psd0.m173633z(this.f153541e);
                this.f153541e = null;
                m173224t();
            }
            if (z2) {
                this.f153540d.onNext(Boolean.valueOf(z));
            }
        }
        Activity activity = Act.foreground_().f16062a != null ? Act.foreground_().f16062a.get() : null;
        if (activity instanceof Act) {
            activity.startActivity(mbs.m157875r(activity, NavigationIntent.get("live")));
        }
    }

    /* JADX INFO: renamed from: s */
    public void m173223s() {
        m173214i();
        vxd0 vxd0Var = this.f153543g;
        if (vxd0Var != null) {
            vxd0Var.put(Integer.valueOf(this.f153537a.accumulation.time));
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m173224t() {
        if (this.f153543g == null || !NullChecker.m82486a(this.f153537a)) {
            return;
        }
        this.f153543g.put(Integer.valueOf(this.f153537a.accumulation.time));
    }

    /* JADX INFO: renamed from: u */
    public void m173225u(int i) {
        String string;
        if (i == 1) {
            string = tbs.f172988a.getString(R$string.f44963J);
        } else if (i != 2) {
            string = i != 3 ? "" : tbs.f172988a.getString(R$string.f45073z0);
        } else {
            string = tbs.f172988a.getString(R$string.f44941A0);
        }
        LiveTeenDialogAct.m71987Y1(string);
    }

    /* JADX INFO: renamed from: v */
    public void m173226v(final BLiveSettings bLiveSettings) {
        BLiveConfig bLiveConfig;
        if (!mqr.m159592l() || mqr.m159588h() || this.f153539c != null || bLiveSettings == null || (bLiveConfig = bLiveSettings.liveConfig) == null) {
            return;
        }
        this.f153546j.put(Boolean.valueOf(bLiveConfig.teenMode.f45302on));
        this.f153539c = mbs.m157881x().subscribe(dhw.m115826e(new y20() { // from class: l.npi0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143103a.m173218n(bLiveSettings, (SettingGroups) obj);
            }
        }, new y20() { // from class: l.opi0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f148461a.m173219o((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w */
    public void m173227w() {
        if (mqr.m159592l()) {
            this.f153537a = null;
            this.f153538b = null;
            psd0.m173633z(this.f153539c);
            this.f153539c = null;
            psd0.m173633z(this.f153541e);
            this.f153541e = null;
        }
    }

    /* JADX INFO: renamed from: x */
    public boolean m173228x() {
        return false;
    }

    /* JADX INFO: renamed from: y */
    public C22421c<Boolean> m173229y() {
        return this.f153540d.asObservable();
    }

    /* JADX INFO: renamed from: z */
    public void m173230z(Act act, int i) {
        act.startActivity(LiveWebViewAct.m70067e2(act, efv.f93850g + i, LiveWebViewAct.f45694k));
    }
}
