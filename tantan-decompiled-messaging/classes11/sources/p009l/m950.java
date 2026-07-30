package p009l;

import android.text.TextUtils;
import android.util.Pair;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.data.LoadStrategy;
import com.p1.mobile.putong.data.OMSConfigEnvelope;
import com.p1.mobile.putong.data.OMSData;
import com.p1.mobile.putong.data.OMSMetasData;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import l.e30;
import l.fgf0;
import l.hpd0;
import l.ia20;
import l.j760;
import l.mkd0;
import l.qib0;
import l.qiq;
import l.qnd;
import l.rw0;
import l.stc0;
import l.uqd0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.xh5;
import l.zvf0;
import rx.Notification;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class m950 extends xh5 {

    /* JADX INFO: renamed from: a */
    public hpd0 f16771a = new hpd0("haveLoadConfigFromNet_V1" + qib0.c0.userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: b */
    public uqd0 f16772b = new uqd0("haveLoadVersion_V1" + qib0.c0.userId(), "");

    /* JADX INFO: renamed from: c */
    public C1026a f16773c = new C1026a("3.1.0", "oms_data", "_v8");

    /* JADX INFO: renamed from: l.m950$a */
    public static class C1026a extends fgf0<OMSData> {

        /* JADX INFO: renamed from: h */
        public static boolean f16774h;

        /* JADX INFO: renamed from: i */
        public static boolean f16775i;

        /* JADX INFO: renamed from: l.m950$a$a */
        public class a implements v9j<c<OMSData>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f16776a;

            public a(String str) {
                this.f16776a = str;
            }

            /* JADX INFO: renamed from: a */
            public static /* synthetic */ stc0 m18323a(String str, String str2) {
                stc0.a aVarAuth = xh5.network.auth();
                Locale locale = Locale.US;
                if (TextUtils.isEmpty(str)) {
                    str = str2;
                }
                return aVarAuth.q(xh5.i(String.format(locale, "/oms/me/creatives?version=%s&login=%b&reinstallTimestamp=%d&interUser=%b", str, Boolean.valueOf(C1026a.f16775i && C1026a.f16774h), qib0.w.get(), Boolean.TRUE))).f().b();
            }

            /* JADX INFO: renamed from: b */
            public static /* synthetic */ OMSData m18324b(Pair pair) {
                LoadStrategy loadStrategy;
                OMSData oMSDataM16320d = (OMSData) pair.first;
                if (!rw0.b() && !rw0.a()) {
                    oMSDataM16320d = ic50.m16316j().m16320d();
                }
                String str = null;
                OMSData oMSData = NullChecker.a(pair.second) ? (OMSData) pair.second : null;
                List list = NullChecker.a(oMSData) ? oMSData.omsMetas : null;
                C1026a.f16775i = false;
                if (vwb.J(list)) {
                    loadStrategy = null;
                } else {
                    str = ((OMSMetasData) list.get(0)).version;
                    loadStrategy = ((OMSMetasData) list.get(0)).loadStrategy.strategy;
                }
                ic50.m16316j().m16329n().f16771a.put(Boolean.TRUE);
                if (!TextUtils.isEmpty(str)) {
                    ic50.m16316j().m16329n().f16772b.put(str);
                }
                if (TEnum.equals(loadStrategy, "overlap")) {
                    ic50.m16316j().m16334s().onNext(oMSData);
                } else if (NullChecker.a(oMSDataM16320d) && TEnum.equals(loadStrategy, "nochange")) {
                    ic50.m16316j().m16334s().onNext(oMSDataM16320d);
                }
                return TEnum.equals(loadStrategy, "overlap") ? oMSData : oMSDataM16320d;
            }

            /* JADX INFO: renamed from: c */
            public static /* synthetic */ void m18325c(Throwable th) {
            }

            /* JADX INFO: renamed from: e */
            public static /* synthetic */ Pair m18327e(Notification notification) {
                if (notification.j() && NullChecker.a(notification.e()) && (notification.e() instanceof ApiExcep)) {
                    zvf0.B("e_oms_creatives", "", new j760[]{vwb.Y("network_state", "fail")});
                }
                OMSData oMSDataM16320d = (rw0.b() || rw0.a()) ? ic50.m16316j().m16320d() : null;
                if (notification.j() && !((Boolean) ic50.m16316j().m16329n().f16771a.get()).booleanValue()) {
                    try {
                        return Pair.create(oMSDataM16320d, ((OMSConfigEnvelope) OMSConfigEnvelope.JSON_ADAPTER.parse(App.e.getResources().getAssets().open("oms_config"))).data);
                    } catch (IOException e) {
                        CrashHelper.c(e);
                    }
                } else if (notification.k()) {
                    return Pair.create(oMSDataM16320d, (OMSData) notification.f());
                }
                return Pair.create(oMSDataM16320d, null);
            }

            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public c<OMSData> call() {
                final String str = (String) ic50.m16316j().m16329n().f16772b.get();
                final String str2 = this.f16776a;
                return ia20.f(new v9j() { // from class: l.g950
                    public final Object call() {
                        return m950.C1026a.a.m18323a(str, str2);
                    }
                }, OMSConfigEnvelope.JSON_ADAPTER).map(new w9j() { // from class: l.h950
                    public final Object call(Object obj) {
                        return ((OMSConfigEnvelope) obj).data;
                    }
                }).materialize().map(new w9j() { // from class: l.i950
                    public final Object call(Object obj) {
                        return m950.C1026a.a.m18327e((Notification) obj);
                    }
                }).compose(mkd0.C()).filter(new w9j() { // from class: l.j950
                    public final Object call(Object obj) {
                        return Boolean.valueOf(NullChecker.a(((Pair) obj).second));
                    }
                }).map(new w9j() { // from class: l.k950
                    public final Object call(Object obj) {
                        return m950.C1026a.a.m18324b((Pair) obj);
                    }
                }).doOnError(new e30() { // from class: l.l950
                    public final void call(Object obj) {
                        m950.C1026a.a.m18325c((Throwable) obj);
                    }
                });
            }
        }

        public C1026a(String str, String str2, String str3) {
            super("OMSData", new qiq(new qnd(str2, str3, qib0.c0.userId()), -1, OMSData.JSON_ADAPTER, new v9j() { // from class: l.f950
                public final Object call() {
                    return m950.C1026a.m18318B();
                }
            }), new a(str));
        }

        /* JADX INFO: renamed from: B */
        public static /* synthetic */ OMSData m18318B() {
            ic50.m16316j().m16329n().f16772b.clear();
            return OMSData.new_();
        }

        /* JADX INFO: renamed from: F */
        public void m18322F(boolean z) {
            f16775i = true;
            f16774h = z;
            super.z();
        }
    }

    /* JADX INFO: renamed from: z */
    public C1026a m18317z() {
        return this.f16773c;
    }
}
