package p149l;

import android.text.TextUtils;
import android.util.Pair;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.data.LoadStrategy;
import com.p046p1.mobile.putong.data.OMSConfigEnvelope;
import com.p046p1.mobile.putong.data.OMSData;
import com.p046p1.mobile.putong.data.OMSMetasData;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import p133rx.C22306c;
import p133rx.Notification;

/* JADX INFO: loaded from: classes11.dex */
public class m950 extends xh5 {

    /* JADX INFO: renamed from: a */
    public hpd0 f132673a = new hpd0("haveLoadConfigFromNet_V1" + qib0.f154714c0.userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: b */
    public uqd0 f132674b = new uqd0("haveLoadVersion_V1" + qib0.f154714c0.userId(), "");

    /* JADX INFO: renamed from: c */
    public C18421a f132675c = new C18421a(OMSData.OMS_CONFIG_VERSION, OMSData.OMS_DATA, OMSData.OMS_DATA_VERSION);

    /* JADX INFO: renamed from: l.m950$a */
    public static class C18421a extends fgf0<OMSData> {

        /* JADX INFO: renamed from: h */
        public static boolean f132676h;

        /* JADX INFO: renamed from: i */
        public static boolean f132677i;

        /* JADX INFO: renamed from: l.m950$a$a */
        public class a implements v9j<C22306c<OMSData>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f132678a;

            public a(String str) {
                this.f132678a = str;
            }

            /* JADX INFO: renamed from: a */
            public static /* synthetic */ stc0 m153602a(String str, String str2) {
                stc0.C20027a c20027aAuth = xh5.network.auth();
                Locale locale = Locale.US;
                if (TextUtils.isEmpty(str)) {
                    str = str2;
                }
                return c20027aAuth.m185898q(xh5.m208761i(String.format(locale, "/oms/me/creatives?version=%s&login=%b&reinstallTimestamp=%d&interUser=%b", str, Boolean.valueOf(C18421a.f132677i && C18421a.f132676h), qib0.f154738w.get(), Boolean.TRUE))).m185887f().m185883b();
            }

            /* JADX INFO: renamed from: b */
            public static /* synthetic */ OMSData m153603b(Pair pair) {
                LoadStrategy loadStrategy;
                OMSData oMSDataM135331d = (OMSData) pair.first;
                if (!rw0.m181368b() && !rw0.m181367a()) {
                    oMSDataM135331d = ic50.m135327j().m135331d();
                }
                String str = null;
                OMSData oMSData = NullChecker.m81303a(pair.second) ? (OMSData) pair.second : null;
                List<OMSMetasData> list = NullChecker.m81303a(oMSData) ? oMSData.omsMetas : null;
                C18421a.f132677i = false;
                if (vwb.m200296J(list)) {
                    loadStrategy = null;
                } else {
                    str = list.get(0).version;
                    loadStrategy = list.get(0).loadStrategy.strategy;
                }
                ic50.m135327j().m135340n().f132673a.put(Boolean.TRUE);
                if (!TextUtils.isEmpty(str)) {
                    ic50.m135327j().m135340n().f132674b.put(str);
                }
                if (TEnum.equals(loadStrategy, "overlap")) {
                    ic50.m135327j().m135345s().m132487l(oMSData);
                } else if (NullChecker.m81303a(oMSDataM135331d) && TEnum.equals(loadStrategy, LoadStrategy.nochange)) {
                    ic50.m135327j().m135345s().m132487l(oMSDataM135331d);
                }
                return TEnum.equals(loadStrategy, "overlap") ? oMSData : oMSDataM135331d;
            }

            /* JADX INFO: renamed from: c */
            public static /* synthetic */ void m153604c(Throwable th) {
            }

            /* JADX INFO: renamed from: e */
            public static /* synthetic */ Pair m153606e(Notification notification) {
                if (notification.m221299j() && NullChecker.m81303a(notification.m221294e()) && (notification.m221294e() instanceof ApiExcep)) {
                    zvf0.m220369B("e_oms_creatives", "", vwb.m200311Y("network_state", "fail"));
                }
                OMSData oMSDataM135331d = (rw0.m181368b() || rw0.m181367a()) ? ic50.m135327j().m135331d() : null;
                if (notification.m221299j() && !ic50.m135327j().m135340n().f132673a.get().booleanValue()) {
                    try {
                        return Pair.create(oMSDataM135331d, OMSConfigEnvelope.JSON_ADAPTER.parse(App.f15369e.getResources().getAssets().open("oms_config")).data);
                    } catch (IOException e) {
                        CrashHelper.m81296c(e);
                    }
                } else if (notification.m221300k()) {
                    return Pair.create(oMSDataM135331d, (OMSData) notification.m221295f());
                }
                return Pair.create(oMSDataM135331d, null);
            }

            @Override // p149l.v9j, java.util.concurrent.Callable
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public C22306c<OMSData> call() {
                final String str = ic50.m135327j().m135340n().f132674b.get();
                final String str2 = this.f132678a;
                return ia20.m135122f(new v9j() { // from class: l.g950
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return m950.C18421a.a.m153602a(str, str2);
                    }
                }, OMSConfigEnvelope.JSON_ADAPTER).map(new w9j() { // from class: l.h950
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((OMSConfigEnvelope) obj).data;
                    }
                }).materialize().map(new w9j() { // from class: l.i950
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return m950.C18421a.a.m153606e((Notification) obj);
                    }
                }).compose(mkd0.m154951C()).filter(new w9j() { // from class: l.j950
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(NullChecker.m81303a(((Pair) obj).second));
                    }
                }).map(new w9j() { // from class: l.k950
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return m950.C18421a.a.m153603b((Pair) obj);
                    }
                }).doOnError(new e30() { // from class: l.l950
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        m950.C18421a.a.m153604c((Throwable) obj);
                    }
                });
            }
        }

        public C18421a(String str, String str2, String str3) {
            super("OMSData", new qiq(new qnd(str2, str3, qib0.f154714c0.userId()), -1, OMSData.JSON_ADAPTER, new v9j() { // from class: l.f950
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return m950.C18421a.m153597B();
                }
            }), new a(str));
        }

        /* JADX INFO: renamed from: B */
        public static /* synthetic */ OMSData m153597B() {
            ic50.m135327j().m135340n().f132674b.clear();
            return OMSData.new_();
        }

        /* JADX INFO: renamed from: F */
        public void m153601F(boolean z) {
            f132677i = true;
            f132676h = z;
            super.m121236q();
        }
    }

    /* JADX INFO: renamed from: z */
    public C18421a m153596z() {
        return this.f132675c;
    }
}
