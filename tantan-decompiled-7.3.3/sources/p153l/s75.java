package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CityCentreConfig;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.Greeting;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p051p1.mobile.putong.util.launch.LaunchStep;
import com.tantan.library.svga.SVGALoader;
import com.tantanapp.common.utils.NullChecker;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class s75 implements ABManager.InterfaceC4829d {

    /* JADX INFO: renamed from: c */
    public static volatile s75 f166644c;

    /* JADX INFO: renamed from: a */
    public kcg0 f166645a;

    /* JADX INFO: renamed from: b */
    public byd0 f166646b = new byd0("city_top_greeting_l_r_t" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m184960f(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Long m184961g(Long l2, TabName tabName) {
        return l2;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m184962h(Long l2) {
    }

    /* JADX INFO: renamed from: i */
    public static int m184963i() {
        int i;
        CityCentreConfig cityCentreConfigM133445i = h39.m133445i();
        return (cityCentreConfigM133445i == null || (i = cityCentreConfigM133445i.city_c_original_price) <= 0) ? SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH : i;
    }

    /* JADX INFO: renamed from: l */
    public static s75 m184964l() {
        if (f166644c == null) {
            synchronized (s75.class) {
                try {
                    if (f166644c == null) {
                        f166644c = new s75();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f166644c;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m184965m() {
        return gra.m131559E1();
    }

    /* JADX INFO: renamed from: n */
    public static boolean m184966n(TabName tabName) {
        return tabName == TabName.Me || tabName == TabName.Moment;
    }

    /* JADX INFO: renamed from: p */
    public static void m184967p() {
        LaunchStep launchStep = LaunchStep.CityTopSvga;
        uqi.m197339f(launchStep);
        ArrayList arrayList = new ArrayList();
        CityCentreConfig cityCentreConfigM133445i = h39.m133445i();
        if (cityCentreConfigM133445i != null && !TextUtils.isEmpty(cityCentreConfigM133445i.city_c_card_svga)) {
            arrayList.add(cityCentreConfigM133445i.city_c_card_svga);
        }
        if (!CoreModule.f18264c.f20381e0.m116600p9().isFemale()) {
            uqb0.f180374G.m127154r0("https://auto.tancdn.com/v1/images/eyJpZCI6IkpOWkNVM01MQldCV1hPUEVPTDNCQVZVVzIyQ1hSTjE0IiwidyI6ODg1LCJoIjo5MDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4MDcwMzYxMTk0OTQ3Nzk2ODd9.png");
            uqb0.f180374G.m127154r0("https://auto.tancdn.com/v1/images/eyJpZCI6IjZMNzY3TlEyUkpTSFZZMkpSVjdSMzVEQjJWWDdBVDE0IiwidyI6ODg1LCJoIjo5MDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NTE1NDk0MTgwMjI4MDIwNn0.png");
            arrayList.add("https://fe-static.tancdn.com/v1/raw/029787bc-0add-4d7e-ae28-84e5468db5fb14.svga");
        }
        arrayList.add("https://auto.tancdn.com/v1/raw/0b683e4e-167d-4efe-970a-e08af1ddbe5314.svga");
        arrayList.add("https://auto.tancdn.com/v1/raw/cec5be75-929f-4965-9aef-85b25bb9c82114.svga");
        arrayList.add("https://auto.tancdn.com/v1/raw/181662f3-c613-408c-8450-51bd3760238714.svga");
        SVGALoader.with(App.f16088e).batchDownload(arrayList);
        uqi.m197337d(launchStep);
    }

    /* JADX INFO: renamed from: q */
    public static void m184968q(Envelope envelope) {
        if (m184965m()) {
            List<Greeting> list = ((CoreData) envelope.getModuleData(CoreData.class)).greetings;
            if (jyb.m147479J(list)) {
                return;
            }
            List<String> list2 = ((CoreData) envelope.getModuleData(CoreData.class)).unReadUserIds;
            for (Greeting greeting : list) {
                greeting.localIsUnread = !jyb.m147479J(list2) && list2.contains(greeting.f21143id);
            }
        }
    }

    @Override // com.p051p1.mobile.putong.api.ABManager.InterfaceC4829d
    /* JADX INFO: renamed from: a */
    public void mo30391a() {
        boolean zM184965m = m184965m();
        kcg0 kcg0Var = this.f166645a;
        if (!zM184965m) {
            psd0.m173633z(kcg0Var);
        } else if (kcg0Var == null || kcg0Var.isUnsubscribed()) {
            this.f166645a = C22421c.combineLatest(C22421c.interval(m184969j(), TimeUnit.SECONDS).onBackpressureDrop(), ji30.m144967k().filter(new qcj() { // from class: l.l75
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(s75.m184966n((TabName) obj));
                }
            }), new rcj() { // from class: l.m75
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return s75.m184961g((Long) obj, (TabName) obj2);
                }
            }).filter(new qcj() { // from class: l.n75
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(Act.isAppVisible() && s75.m184966n(ji30.m144964h()));
                }
            }).observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.o75
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.m82486a(CoreModule.f18264c));
                }
            }).doOnNext(new y20() { // from class: l.p75
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreModule.f18264c.f20392h2.m164090U3();
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.q75
                @Override // p153l.y20
                public final void call(Object obj) {
                    s75.m184962h((Long) obj);
                }
            }, new y20() { // from class: l.r75
                @Override // p153l.y20
                public final void call(Object obj) {
                    s75.m184960f((Throwable) obj);
                }
            }));
        }
    }

    @Override // com.p051p1.mobile.putong.api.ABManager.InterfaceC4829d
    /* JADX INFO: renamed from: b */
    public void mo30392b() {
        psd0.m173633z(this.f166645a);
        f166644c = null;
    }

    /* JADX INFO: renamed from: j */
    public int m184969j() {
        return RemoteConfig.m80481x().m80519z("city_top_poll_interval", 10);
    }

    /* JADX INFO: renamed from: k */
    public String m184970k(int i) {
        CityCentreConfig cityCentreConfigM133445i = h39.m133445i();
        return (!NullChecker.m82486a(cityCentreConfigM133445i) || TextUtils.isEmpty(cityCentreConfigM133445i.city_c_profile_text)) ? String.format("豪掷%d探币占领城市封面", Integer.valueOf(i)) : String.format(cityCentreConfigM133445i.city_c_profile_text.replaceAll("@", BLiveStormDanmakuGiftResourceType.f45294s), Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: o */
    public void m184971o() {
        CoreModule.f18264c.f20392h2.m164074E3(true, this.f166646b.get().longValue(), null);
    }
}
