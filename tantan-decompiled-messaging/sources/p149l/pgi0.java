package p149l;

import android.app.Activity;
import android.net.NetworkInfo;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.UserLiveSettings;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.base.data.BLiveConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import com.p046p1.mobile.putong.live.base.data.BLiveTeenMode;
import com.p046p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p046p1.mobile.putong.live.external.page.teenmode.LiveTeenDialogAct;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes13.dex */
public class pgi0 {

    /* JADX INFO: renamed from: k */
    public static final TimeZone f148708k = TimeZone.getTimeZone("GMT+8");

    /* JADX INFO: renamed from: l */
    public static volatile pgi0 f148709l = null;

    /* JADX INFO: renamed from: m */
    public static volatile String f148710m = "";

    /* JADX INFO: renamed from: a */
    public BLiveTeenMode f148711a;

    /* JADX INFO: renamed from: b */
    public UserLiveSettings f148712b;

    /* JADX INFO: renamed from: c */
    public c4g0 f148713c;

    /* JADX INFO: renamed from: e */
    public c4g0 f148715e;

    /* JADX INFO: renamed from: g */
    public tpd0 f148717g;

    /* JADX INFO: renamed from: h */
    public zpd0 f148718h;

    /* JADX INFO: renamed from: i */
    public hpd0 f148719i;

    /* JADX INFO: renamed from: j */
    public hpd0 f148720j;

    /* JADX INFO: renamed from: d */
    public C22392a<Boolean> f148714d = C22392a.m221512b();

    /* JADX INFO: renamed from: f */
    public uqd0 f148716f = new uqd0("teen_func_show" + l9s.m149093o0(), "");

    public pgi0() {
        String str = "teen_func_enable" + l9s.m149093o0();
        Boolean bool = Boolean.FALSE;
        this.f148719i = new hpd0(str, bool);
        this.f148720j = new hpd0("teen_mode_live_settings_enable_" + l9s.m149093o0(), bool);
        ConnectivityReceiver.m81290m().skip(1).filter(new w9j() { // from class: l.kgi0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).filter(new w9j() { // from class: l.lgi0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return pgi0.m168727c((NetworkInfo) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.mgi0
            @Override // p149l.e30
            public final void call(Object obj) {
                pgi0.m168726b((NetworkInfo) obj);
            }
        }));
        if (!rw0.m181367a() && NullChecker.m81303a(s9s.f163228b)) {
            this.f148711a = s9s.f163228b.m195601C5();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m168726b(NetworkInfo networkInfo) {
        uut uutVar;
        BLiveSettings bLiveSettingsM195583A3;
        if (!lor.m150807l() || (uutVar = s9s.f163228b) == null || (bLiveSettingsM195583A3 = uutVar.m195583A3()) == null || !l9s.m149081i0()) {
            return;
        }
        m168730l().m168749v(bLiveSettingsM195583A3);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Boolean m168727c(NetworkInfo networkInfo) {
        if (qib0.f154713b0.f139230a == null) {
            CrashHelper.m81296c(new RuntimeException("TeenModeManager Putong.service.account == null"));
            return Boolean.FALSE;
        }
        boolean z = (qib0.f154714c0.signedIn_() ? qib0.f154721j0.f174908b : qib0.f154721j0.f174912f).m221515e() == null;
        if (z) {
            CrashHelper.m81296c(new RuntimeException("TeenModeManager moduleLoad false"));
        }
        return Boolean.valueOf(!z);
    }

    /* JADX INFO: renamed from: l */
    public static pgi0 m168730l() {
        String strM149093o0 = l9s.m149093o0() == null ? "" : l9s.m149093o0();
        if (f148709l == null) {
            synchronized (pgi0.class) {
                try {
                    if (f148709l == null) {
                        f148710m = strM149093o0;
                        f148709l = new pgi0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (!f148710m.equals(strM149093o0)) {
            synchronized (pgi0.class) {
                try {
                    if (!f148710m.equals(strM149093o0)) {
                        f148710m = strM149093o0;
                        f148709l.m168750w();
                        f148709l = new pgi0();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f148709l;
    }

    /* JADX INFO: renamed from: A */
    public void m168731A(Act act) {
        m168733C(act);
    }

    /* JADX INFO: renamed from: B */
    public void m168732B(Act act) {
        m168733C(act);
    }

    /* JADX INFO: renamed from: C */
    public void m168733C(Act act) {
        act.startActivity(LiveWebViewAct.m68884d2(act, ddv.f85656f, LiveWebViewAct.f44846k));
    }

    /* JADX INFO: renamed from: f */
    public boolean m168734f() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public void m168735g(Act act) {
        if (qib0.f154713b0.f139230a.signedIn_() && lor.m150807l()) {
            m168740m(act);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m168736h() {
        Iterator<ArrayList<Act.C4299r>> it = Act.globalLifeCycle_().values().iterator();
        while (it.hasNext()) {
            Iterator<Act.C4299r> it2 = it.next().iterator();
            while (it2.hasNext()) {
                Activity activity = it2.next().f15343a.get();
                if (activity != null && s9s.f163232f.m134380m(activity)) {
                    activity.finish();
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m168737i() {
        Iterator<ArrayList<Act.C4299r>> it = Act.globalLifeCycle_().values().iterator();
        while (it.hasNext()) {
            Iterator<Act.C4299r> it2 = it.next().iterator();
            while (it2.hasNext()) {
                Activity activity = it2.next().f15343a.get();
                if (activity != null && (activity instanceof LiveTeenDialogAct)) {
                    activity.finish();
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean m168738j() {
        Iterator<ArrayList<Act.C4299r>> it = Act.globalLifeCycle_().values().iterator();
        while (it.hasNext()) {
            Iterator<Act.C4299r> it2 = it.next().iterator();
            while (it2.hasNext()) {
                Activity activity = it2.next().f15343a.get();
                if (activity != null) {
                    if (activity instanceof LiveTeenDialogAct) {
                        return true;
                    }
                    if ((activity instanceof LiveWebViewAct) && ((LiveWebViewAct) activity).m68887e2() == LiveWebViewAct.f44846k) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public boolean m168739k() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m168740m(Act act) {
        if (act instanceof LiveTeenDialogAct) {
            return true;
        }
        return (act instanceof LiveWebViewAct) && ((LiveWebViewAct) act).m68887e2() == LiveWebViewAct.f44846k;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m168741n(BLiveSettings bLiveSettings, SettingGroups settingGroups) {
        BLiveConfig bLiveConfig;
        if (bLiveSettings == null || (bLiveConfig = bLiveSettings.liveConfig) == null || settingGroups == null) {
            return;
        }
        this.f148711a = bLiveConfig.teenMode;
        UserLiveSettings userLiveSettings = settingGroups.live;
        this.f148712b = userLiveSettings;
        this.f148719i.put(userLiveSettings.teenModeEnable);
        this.f148714d.onNext(this.f148712b.teenModeEnable);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m168742o(Throwable th) {
        this.f148713c = null;
    }

    /* JADX INFO: renamed from: p */
    public void m168743p(boolean z, int i) {
        if (z) {
            if (i == 1) {
                m168746s();
            } else if (i == 2) {
                m168744q();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m168744q() {
        this.f148718h.put(Long.valueOf(System.currentTimeMillis()));
        m168746s();
    }

    /* JADX INFO: renamed from: r */
    public void m168745r(boolean z) {
        m168736h();
        m168737i();
        UserLiveSettings userLiveSettings = this.f148712b;
        if (userLiveSettings == null) {
            mkd0.m154992z(this.f148713c);
            this.f148713c = null;
            m168749v(s9s.f163228b.m195583A3());
        } else {
            boolean z2 = userLiveSettings.teenModeEnable.booleanValue() != z;
            this.f148712b.teenModeEnable = Boolean.valueOf(z);
            this.f148719i.put(Boolean.valueOf(z));
            if (!z) {
                mkd0.m154992z(this.f148715e);
                this.f148715e = null;
                m168747t();
            }
            if (z2) {
                this.f148714d.onNext(Boolean.valueOf(z));
            }
        }
        Activity activity = Act.foreground_().f15343a != null ? Act.foreground_().f15343a.get() : null;
        if (activity instanceof Act) {
            activity.startActivity(l9s.m149098r(activity, NavigationIntent.get("live")));
        }
    }

    /* JADX INFO: renamed from: s */
    public void m168746s() {
        m168737i();
        tpd0 tpd0Var = this.f148717g;
        if (tpd0Var != null) {
            tpd0Var.put(Integer.valueOf(this.f148711a.accumulation.time));
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m168747t() {
        if (this.f148717g == null || !NullChecker.m81303a(this.f148711a)) {
            return;
        }
        this.f148717g.put(Integer.valueOf(this.f148711a.accumulation.time));
    }

    /* JADX INFO: renamed from: u */
    public void m168748u(int i) {
        String string;
        if (i == 1) {
            string = s9s.f163227a.getString(R$string.f44115J);
        } else if (i != 2) {
            string = i != 3 ? "" : s9s.f163227a.getString(R$string.f44225z0);
        } else {
            string = s9s.f163227a.getString(R$string.f44093A0);
        }
        LiveTeenDialogAct.m70804X1(string);
    }

    /* JADX INFO: renamed from: v */
    public void m168749v(final BLiveSettings bLiveSettings) {
        BLiveConfig bLiveConfig;
        if (!lor.m150807l() || lor.m150803h() || this.f148713c != null || bLiveSettings == null || (bLiveConfig = bLiveSettings.liveConfig) == null) {
            return;
        }
        this.f148720j.put(Boolean.valueOf(bLiveConfig.teenMode.f44454on));
        this.f148713c = l9s.m149104x().subscribe(ffw.m121194e(new e30() { // from class: l.ngi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138878a.m168741n(bLiveSettings, (SettingGroups) obj);
            }
        }, new e30() { // from class: l.ogi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f143861a.m168742o((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w */
    public void m168750w() {
        if (lor.m150807l()) {
            this.f148711a = null;
            this.f148712b = null;
            mkd0.m154992z(this.f148713c);
            this.f148713c = null;
            mkd0.m154992z(this.f148715e);
            this.f148715e = null;
        }
    }

    /* JADX INFO: renamed from: x */
    public boolean m168751x() {
        return false;
    }

    /* JADX INFO: renamed from: y */
    public C22306c<Boolean> m168752y() {
        return this.f148714d.asObservable();
    }

    /* JADX INFO: renamed from: z */
    public void m168753z(Act act, int i) {
        act.startActivity(LiveWebViewAct.m68884d2(act, ddv.f85657g + i, LiveWebViewAct.f44846k));
    }
}
