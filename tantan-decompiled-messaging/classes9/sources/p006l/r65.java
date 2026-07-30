package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.api.ABManager;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.data.CityCentreConfig;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.Greeting;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.putong.util.launch.LaunchStep;
import com.tantan.library.svga.SVGALoader;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.e30;
import l.jo0;
import l.mkd0;
import l.v930;
import l.vwb;
import l.w9j;
import l.x9j;
import l.y19;
import l.yni;
import l.zpd0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class r65 implements ABManager.InterfaceC0104d {

    /* JADX INFO: renamed from: c */
    public static volatile r65 f20381c;

    /* JADX INFO: renamed from: a */
    public c4g0 f20382a;

    /* JADX INFO: renamed from: b */
    public zpd0 f20383b = new zpd0("city_top_greeting_l_r_t" + CoreModule.m1850H().userId(), 0L);

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m22696f(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Long m22697g(Long l2, TabName tabName) {
        return l2;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m22698h(Long l2) {
    }

    /* JADX INFO: renamed from: i */
    public static int m22699i() {
        int i;
        CityCentreConfig cityCentreConfigI = y19.i();
        if (cityCentreConfigI == null || (i = cityCentreConfigI.city_c_original_price) <= 0) {
            return 50000;
        }
        return i;
    }

    /* JADX INFO: renamed from: l */
    public static r65 m22700l() {
        if (f20381c == null) {
            synchronized (r65.class) {
                try {
                    if (f20381c == null) {
                        f20381c = new r65();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f20381c;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m22701m() {
        return upa.m25326E1();
    }

    /* JADX INFO: renamed from: n */
    public static boolean m22702n(TabName tabName) {
        return tabName == TabName.Me || tabName == TabName.Moment;
    }

    /* JADX INFO: renamed from: p */
    public static void m22703p() {
        LaunchStep launchStep = LaunchStep.CityTopSvga;
        yni.f(new LaunchStep[]{launchStep});
        ArrayList arrayList = new ArrayList();
        CityCentreConfig cityCentreConfigI = y19.i();
        if (cityCentreConfigI != null && !TextUtils.isEmpty(cityCentreConfigI.city_c_card_svga)) {
            arrayList.add(cityCentreConfigI.city_c_card_svga);
        }
        if (!CoreModule.f1534c.f3628e0.m21490p9().isFemale()) {
            qib0.f19782G.m12784r0("https://auto.tancdn.com/v1/images/eyJpZCI6IkpOWkNVM01MQldCV1hPUEVPTDNCQVZVVzIyQ1hSTjE0IiwidyI6ODg1LCJoIjo5MDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4MDcwMzYxMTk0OTQ3Nzk2ODd9.png");
            qib0.f19782G.m12784r0("https://auto.tancdn.com/v1/images/eyJpZCI6IjZMNzY3TlEyUkpTSFZZMkpSVjdSMzVEQjJWWDdBVDE0IiwidyI6ODg1LCJoIjo5MDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NTE1NDk0MTgwMjI4MDIwNn0.png");
            arrayList.add("https://fe-static.tancdn.com/v1/raw/029787bc-0add-4d7e-ae28-84e5468db5fb14.svga");
        }
        arrayList.add("https://auto.tancdn.com/v1/raw/0b683e4e-167d-4efe-970a-e08af1ddbe5314.svga");
        arrayList.add("https://auto.tancdn.com/v1/raw/cec5be75-929f-4965-9aef-85b25bb9c82114.svga");
        arrayList.add("https://auto.tancdn.com/v1/raw/181662f3-c613-408c-8450-51bd3760238714.svga");
        SVGALoader.with(App.e).batchDownload(arrayList);
        yni.d(launchStep);
    }

    /* JADX INFO: renamed from: q */
    public static void m22704q(Envelope envelope) {
        if (m22701m()) {
            List<Greeting> list = envelope.getModuleData(CoreData.class).greetings;
            if (vwb.J(list)) {
                return;
            }
            List list2 = envelope.getModuleData(CoreData.class).unReadUserIds;
            for (Greeting greeting : list) {
                greeting.localIsUnread = !vwb.J(list2) && list2.contains(greeting.id);
            }
        }
    }

    @Override // com.p000p1.mobile.putong.api.ABManager.InterfaceC0104d
    /* JADX INFO: renamed from: a */
    public void mo1299a() {
        boolean zM22701m = m22701m();
        c4g0 c4g0Var = this.f20382a;
        if (!zM22701m) {
            mkd0.z(c4g0Var);
        } else if (c4g0Var == null || c4g0Var.isUnsubscribed()) {
            this.f20382a = c.combineLatest(c.interval(m22705j(), TimeUnit.SECONDS).onBackpressureDrop(), v930.k().filter(new w9j() { // from class: l.k65
                public final Object call(Object obj) {
                    return Boolean.valueOf(r65.m22702n((TabName) obj));
                }
            }), new x9j() { // from class: l.l65
                public final Object call(Object obj, Object obj2) {
                    return r65.m22697g((Long) obj, (TabName) obj2);
                }
            }).filter(new w9j() { // from class: l.m65
                public final Object call(Object obj) {
                    return Boolean.valueOf(Act.isAppVisible() && r65.m22702n(v930.h()));
                }
            }).observeOn(jo0.a()).filter(new w9j() { // from class: l.n65
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.a(CoreModule.f1534c));
                }
            }).doOnNext(new e30() { // from class: l.o65
                public final void call(Object obj) {
                    CoreModule.f1534c.f3639h2.m17665U3();
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.p65
                public final void call(Object obj) {
                    r65.m22698h((Long) obj);
                }
            }, new e30() { // from class: l.q65
                public final void call(Object obj) {
                    r65.m22696f((Throwable) obj);
                }
            }));
        }
    }

    @Override // com.p000p1.mobile.putong.api.ABManager.InterfaceC0104d
    /* JADX INFO: renamed from: b */
    public void mo1300b() {
        mkd0.z(this.f20382a);
        f20381c = null;
    }

    /* JADX INFO: renamed from: j */
    public int m22705j() {
        return RemoteConfig.x().z("city_top_poll_interval", 10);
    }

    /* JADX INFO: renamed from: k */
    public String m22706k(int i) {
        CityCentreConfig cityCentreConfigI = y19.i();
        return (!NullChecker.a(cityCentreConfigI) || TextUtils.isEmpty(cityCentreConfigI.city_c_profile_text)) ? String.format("豪掷%d探币占领城市封面", Integer.valueOf(i)) : String.format(cityCentreConfigI.city_c_profile_text.replaceAll("@", "s"), Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: o */
    public void m22707o() {
        CoreModule.f1534c.f3639h2.m17649E3(true, ((Long) this.f20383b.get()).longValue(), null);
    }
}
