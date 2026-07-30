package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CityCentreConfig;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.Greeting;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p046p1.mobile.putong.util.launch.LaunchStep;
import com.tantan.library.svga.SVGALoader;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class r65 implements ABManager.InterfaceC4678d {

    /* JADX INFO: renamed from: c */
    public static volatile r65 f157893c;

    /* JADX INFO: renamed from: a */
    public c4g0 f157894a;

    /* JADX INFO: renamed from: b */
    public zpd0 f157895b = new zpd0("city_top_greeting_l_r_t" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m178030f(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Long m178031g(Long l2, TabName tabName) {
        return l2;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m178032h(Long l2) {
    }

    /* JADX INFO: renamed from: i */
    public static int m178033i() {
        int i;
        CityCentreConfig cityCentreConfigM212174i = y19.m212174i();
        if (cityCentreConfigM212174i == null || (i = cityCentreConfigM212174i.city_c_original_price) <= 0) {
            return 50000;
        }
        return i;
    }

    /* JADX INFO: renamed from: l */
    public static r65 m178034l() {
        if (f157893c == null) {
            synchronized (r65.class) {
                try {
                    if (f157893c == null) {
                        f157893c = new r65();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f157893c;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m178035m() {
        return upa.m194628E1();
    }

    /* JADX INFO: renamed from: n */
    public static boolean m178036n(TabName tabName) {
        return tabName == TabName.Me || tabName == TabName.Moment;
    }

    /* JADX INFO: renamed from: p */
    public static void m178037p() {
        LaunchStep launchStep = LaunchStep.CityTopSvga;
        yni.m215417f(launchStep);
        ArrayList arrayList = new ArrayList();
        CityCentreConfig cityCentreConfigM212174i = y19.m212174i();
        if (cityCentreConfigM212174i != null && !TextUtils.isEmpty(cityCentreConfigM212174i.city_c_card_svga)) {
            arrayList.add(cityCentreConfigM212174i.city_c_card_svga);
        }
        if (!CoreModule.f17545c.f19639e0.m169527p9().isFemale()) {
            qib0.f154691G.m102371r0("https://auto.tancdn.com/v1/images/eyJpZCI6IkpOWkNVM01MQldCV1hPUEVPTDNCQVZVVzIyQ1hSTjE0IiwidyI6ODg1LCJoIjo5MDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4MDcwMzYxMTk0OTQ3Nzk2ODd9.png");
            qib0.f154691G.m102371r0("https://auto.tancdn.com/v1/images/eyJpZCI6IjZMNzY3TlEyUkpTSFZZMkpSVjdSMzVEQjJWWDdBVDE0IiwidyI6ODg1LCJoIjo5MDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NTE1NDk0MTgwMjI4MDIwNn0.png");
            arrayList.add("https://fe-static.tancdn.com/v1/raw/029787bc-0add-4d7e-ae28-84e5468db5fb14.svga");
        }
        arrayList.add("https://auto.tancdn.com/v1/raw/0b683e4e-167d-4efe-970a-e08af1ddbe5314.svga");
        arrayList.add("https://auto.tancdn.com/v1/raw/cec5be75-929f-4965-9aef-85b25bb9c82114.svga");
        arrayList.add("https://auto.tancdn.com/v1/raw/181662f3-c613-408c-8450-51bd3760238714.svga");
        SVGALoader.with(App.f15369e).batchDownload(arrayList);
        yni.m215415d(launchStep);
    }

    /* JADX INFO: renamed from: q */
    public static void m178038q(Envelope envelope) {
        if (m178035m()) {
            List<Greeting> list = ((CoreData) envelope.getModuleData(CoreData.class)).greetings;
            if (vwb.m200296J(list)) {
                return;
            }
            List<String> list2 = ((CoreData) envelope.getModuleData(CoreData.class)).unReadUserIds;
            for (Greeting greeting : list) {
                greeting.localIsUnread = !vwb.m200296J(list2) && list2.contains(greeting.f20401id);
            }
        }
    }

    @Override // com.p046p1.mobile.putong.api.ABManager.InterfaceC4678d
    /* JADX INFO: renamed from: a */
    public void mo29393a() {
        boolean zM178035m = m178035m();
        c4g0 c4g0Var = this.f157894a;
        if (!zM178035m) {
            mkd0.m154992z(c4g0Var);
        } else if (c4g0Var == null || c4g0Var.isUnsubscribed()) {
            this.f157894a = C22306c.combineLatest(C22306c.interval(m178039j(), TimeUnit.SECONDS).onBackpressureDrop(), v930.m197537k().filter(new w9j() { // from class: l.k65
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(r65.m178036n((TabName) obj));
                }
            }), new x9j() { // from class: l.l65
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return r65.m178031g((Long) obj, (TabName) obj2);
                }
            }).filter(new w9j() { // from class: l.m65
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(Act.isAppVisible() && r65.m178036n(v930.m197534h()));
                }
            }).observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.n65
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.m81303a(CoreModule.f17545c));
                }
            }).doOnNext(new e30() { // from class: l.o65
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreModule.f17545c.f19650h2.m142354U3();
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.p65
                @Override // p149l.e30
                public final void call(Object obj) {
                    r65.m178032h((Long) obj);
                }
            }, new e30() { // from class: l.q65
                @Override // p149l.e30
                public final void call(Object obj) {
                    r65.m178030f((Throwable) obj);
                }
            }));
        }
    }

    @Override // com.p046p1.mobile.putong.api.ABManager.InterfaceC4678d
    /* JADX INFO: renamed from: b */
    public void mo29394b() {
        mkd0.m154992z(this.f157894a);
        f157893c = null;
    }

    /* JADX INFO: renamed from: j */
    public int m178039j() {
        return RemoteConfig.m79298x().m79336z("city_top_poll_interval", 10);
    }

    /* JADX INFO: renamed from: k */
    public String m178040k(int i) {
        CityCentreConfig cityCentreConfigM212174i = y19.m212174i();
        return (!NullChecker.m81303a(cityCentreConfigM212174i) || TextUtils.isEmpty(cityCentreConfigM212174i.city_c_profile_text)) ? String.format("豪掷%d探币占领城市封面", Integer.valueOf(i)) : String.format(cityCentreConfigM212174i.city_c_profile_text.replaceAll("@", BLiveStormDanmakuGiftResourceType.f44446s), Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: o */
    public void m178041o() {
        CoreModule.f17545c.f19650h2.m142338E3(true, this.f157895b.get().longValue(), null);
    }
}
