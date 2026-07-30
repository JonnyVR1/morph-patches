package p153l;

import android.text.TextUtils;
import android.util.Pair;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.data.LoadStrategy;
import com.p051p1.mobile.putong.data.OMSConfigEnvelope;
import com.p051p1.mobile.putong.data.OMSData;
import com.p051p1.mobile.putong.data.OMSMetasData;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import p137rx.C22421c;
import p137rx.Notification;

/* JADX INFO: loaded from: classes10.dex */
public class th50 extends xi5 {

    /* JADX INFO: renamed from: a */
    public jxd0 f174274a = new jxd0("haveLoadConfigFromNet_V1" + uqb0.f180397c0.userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: b */
    public wyd0 f174275b = new wyd0("haveLoadVersion_V1" + uqb0.f180397c0.userId(), "");

    /* JADX INFO: renamed from: c */
    public C20317a f174276c = new C20317a(OMSData.OMS_CONFIG_VERSION, OMSData.OMS_DATA, OMSData.OMS_DATA_VERSION);

    /* JADX INFO: renamed from: l.th50$a */
    public static class C20317a extends mof0<OMSData> {

        /* JADX INFO: renamed from: h */
        public static boolean f174277h;

        /* JADX INFO: renamed from: i */
        public static boolean f174278i;

        /* JADX INFO: renamed from: l.th50$a$a */
        public class a implements pcj<C22421c<OMSData>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f174279a;

            public a(String str) {
                this.f174279a = str;
            }

            /* JADX INFO: renamed from: a */
            public static /* synthetic */ x1d0 m191226a(String str, String str2) {
                x1d0.C21228a c21228aAuth = xi5.network.auth();
                Locale locale = Locale.US;
                if (TextUtils.isEmpty(str)) {
                    str = str2;
                }
                return c21228aAuth.m209043q(xi5.m211107i(String.format(locale, "/oms/me/creatives?version=%s&login=%b&reinstallTimestamp=%d&interUser=%b", str, Boolean.valueOf(C20317a.f174278i && C20317a.f174277h), uqb0.f180421w.get(), Boolean.TRUE))).m209032f().m209028b();
            }

            /* JADX INFO: renamed from: b */
            public static /* synthetic */ OMSData m191227b(Pair pair) {
                LoadStrategy loadStrategy;
                OMSData oMSDataM172572d = (OMSData) pair.first;
                if (!yw0.m217559b() && !yw0.m217558a()) {
                    oMSDataM172572d = pk50.m172568j().m172572d();
                }
                String str = null;
                OMSData oMSData = NullChecker.m82486a(pair.second) ? (OMSData) pair.second : null;
                List<OMSMetasData> list = NullChecker.m82486a(oMSData) ? oMSData.omsMetas : null;
                C20317a.f174278i = false;
                if (jyb.m147479J(list)) {
                    loadStrategy = null;
                } else {
                    str = list.get(0).version;
                    loadStrategy = list.get(0).loadStrategy.strategy;
                }
                pk50.m172568j().m172581n().f174274a.put(Boolean.TRUE);
                if (!TextUtils.isEmpty(str)) {
                    pk50.m172568j().m172581n().f174275b.put(str);
                }
                if (TEnum.equals(loadStrategy, "overlap")) {
                    pk50.m172568j().m172586s().m137019l(oMSData);
                } else if (NullChecker.m82486a(oMSDataM172572d) && TEnum.equals(loadStrategy, LoadStrategy.nochange)) {
                    pk50.m172568j().m172586s().m137019l(oMSDataM172572d);
                }
                return TEnum.equals(loadStrategy, "overlap") ? oMSData : oMSDataM172572d;
            }

            /* JADX INFO: renamed from: c */
            public static /* synthetic */ void m191228c(Throwable th) {
            }

            /* JADX INFO: renamed from: e */
            public static /* synthetic */ Pair m191230e(Notification notification) {
                if (notification.m222545j() && NullChecker.m82486a(notification.m222540e()) && (notification.m222540e() instanceof ApiExcep)) {
                    i4g0.m138493B("e_oms_creatives", "", jyb.m147494Y("network_state", "fail"));
                }
                OMSData oMSDataM172572d = (yw0.m217559b() || yw0.m217558a()) ? pk50.m172568j().m172572d() : null;
                if (notification.m222545j() && !pk50.m172568j().m172581n().f174274a.get().booleanValue()) {
                    try {
                        return Pair.create(oMSDataM172572d, OMSConfigEnvelope.JSON_ADAPTER.parse(App.f16088e.getResources().getAssets().open("oms_config")).data);
                    } catch (IOException e) {
                        CrashHelper.m82479c(e);
                    }
                } else if (notification.m222546k()) {
                    return Pair.create(oMSDataM172572d, (OMSData) notification.m222541f());
                }
                return Pair.create(oMSDataM172572d, null);
            }

            @Override // p153l.pcj, java.util.concurrent.Callable
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public C22421c<OMSData> call() {
                final String str = pk50.m172568j().m172581n().f174275b.get();
                final String str2 = this.f174279a;
                return qi20.m176659f(new pcj() { // from class: l.nh50
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return th50.C20317a.a.m191226a(str, str2);
                    }
                }, OMSConfigEnvelope.JSON_ADAPTER).map(new qcj() { // from class: l.oh50
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((OMSConfigEnvelope) obj).data;
                    }
                }).materialize().map(new qcj() { // from class: l.ph50
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return th50.C20317a.a.m191230e((Notification) obj);
                    }
                }).compose(psd0.m173592C()).filter(new qcj() { // from class: l.qh50
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(NullChecker.m82486a(((Pair) obj).second));
                    }
                }).map(new qcj() { // from class: l.rh50
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return th50.C20317a.a.m191227b((Pair) obj);
                    }
                }).doOnError(new y20() { // from class: l.sh50
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        th50.C20317a.a.m191228c((Throwable) obj);
                    }
                });
            }
        }

        public C20317a(String str, String str2, String str3) {
            super("OMSData", new pkq(new vod(str2, str3, uqb0.f180397c0.userId()), -1, OMSData.JSON_ADAPTER, new pcj() { // from class: l.mh50
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return th50.C20317a.m191221B();
                }
            }), new a(str));
        }

        /* JADX INFO: renamed from: B */
        public static /* synthetic */ OMSData m191221B() {
            pk50.m172568j().m172581n().f174275b.clear();
            return OMSData.new_();
        }

        /* JADX INFO: renamed from: F */
        public void m191225F(boolean z) {
            f174278i = true;
            f174277h = z;
            super.m159280q();
        }
    }

    /* JADX INFO: renamed from: z */
    public C20317a m191220z() {
        return this.f174276c;
    }
}
