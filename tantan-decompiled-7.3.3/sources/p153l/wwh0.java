package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.p051p1.mobile.putong.data.ReflectResponse;
import com.p051p1.mobile.putong.data.ReflectTokenRequestParam;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.VerificationPutongDataEnvelope;
import com.p051p1.mobile.putong.data.VerificationToken;
import com.p051p1.mobile.putong.data.VerificationTokenRequestParam;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes12.dex */
public class wwh0 {

    /* JADX INFO: renamed from: a */
    public final Set<String> f191279a = new HashSet();

    /* JADX INFO: renamed from: b */
    public final HashMap<String, VerificationToken> f191280b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public boolean f191281c = false;

    /* JADX INFO: renamed from: l.wwh0$a */
    public class C21193a implements pcj<C22421c<VerificationToken>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f191282a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VerificationTokenRequestParam f191283b;

        public C21193a(String str, VerificationTokenRequestParam verificationTokenRequestParam) {
            this.f191282a = str;
            this.f191283b = verificationTokenRequestParam;
        }

        @Override // p153l.pcj, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22421c<VerificationToken> call() {
            User userMe_ = uqb0.f180397c0.me_();
            wwh0 wwh0Var = wwh0.this;
            if (userMe_ == null) {
                return wwh0Var.m208229B(this.f191282a, this.f191283b);
            }
            String strM208242w = wwh0Var.m208242w(userMe_, this.f191283b, this.f191282a);
            boolean zContainsKey = wwh0.this.f191280b.containsKey(strM208242w);
            wwh0 wwh0Var2 = wwh0.this;
            if (!zContainsKey) {
                return wwh0Var2.m208229B(this.f191282a, this.f191283b);
            }
            C22421c<VerificationToken> c22421cJust = C22421c.just((VerificationToken) wwh0Var2.f191280b.get(strM208242w));
            wwh0.this.f191280b.remove(strM208242w);
            return c22421cJust;
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m208208c(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ VerificationToken m208210e(VerificationToken verificationToken, Envelope envelope) {
        ReflectResponse reflectResponse = ((CommonData) envelope.getModuleData(CommonData.class)).raySequences.size() > 0 ? ((CommonData) envelope.getModuleData(CommonData.class)).raySequences.get(0) : null;
        if (NullChecker.m82486a(reflectResponse)) {
            verificationToken.response = reflectResponse;
            return verificationToken;
        }
        RuntimeException runtimeException = new RuntimeException("null provider ray-sequence");
        CrashHelper.m82479c(runtimeException);
        throw runtimeException;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m208213h() {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ VerificationToken m208216k(Envelope envelope) {
        VerificationToken verificationToken = ((CommonData) envelope.getModuleData(CommonData.class)).verificationTokens.get(0);
        if (verificationToken.omitLiveData || !TextUtils.isEmpty(verificationToken.provider)) {
            return verificationToken;
        }
        azk0.m101074a("null provider");
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ VerificationToken m208218m(VerificationPutongDataEnvelope verificationPutongDataEnvelope) {
        VerificationToken verificationToken = verificationPutongDataEnvelope.data.verificationTokens.get(0);
        if (!verificationToken.omitLiveData && TextUtils.isEmpty(verificationToken.provider)) {
            CrashHelper.m82479c(new RuntimeException("null provider"));
        }
        return verificationToken;
    }

    /* JADX INFO: renamed from: A */
    public C22421c<VerificationToken> m208228A(final String str, VerificationTokenRequestParam verificationTokenRequestParam) {
        return C22421c.defer(new C21193a(str, verificationTokenRequestParam)).doOnNext(new y20() { // from class: l.ewh0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96159a.m208234G(str, (VerificationToken) obj);
            }
        }).retry(new rcj() { // from class: l.fwh0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return this.f101165a.m208235H(str, (Integer) obj, (Throwable) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public final C22421c<VerificationToken> m208229B(String str, final VerificationTokenRequestParam verificationTokenRequestParam) {
        final String strM211107i = xi5.m211107i("/users/" + str + "/verification-tokens");
        if (this.f191279a.contains(str)) {
            strM211107i = strM211107i + "?code=40003";
        }
        return uqb0.f180377I.now("getVerificationToken" + str + verificationTokenRequestParam.hashCode(), qi20.m176654a(new pcj() { // from class: l.hwh0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return xi5.network.auth().m209043q(strM211107i).m209038l(z1d0.create(Network.JSON, verificationTokenRequestParam.toJson())).m209028b();
            }
        }), false).map(new qcj() { // from class: l.iwh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return wwh0.m208216k((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public final boolean m208230C(String str, Throwable th) {
        if (!(th instanceof TantanException.Client.CoreService)) {
            return false;
        }
        int i = ((TantanException.Client.CoreService) th).code;
        if (i == 40003) {
            this.f191279a.add(str);
            return true;
        }
        if (i != 40005) {
            return false;
        }
        this.f191279a.remove(str);
        return false;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m208232E(String str, VerificationToken verificationToken) {
        this.f191279a.remove(str);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Boolean m208233F(String str, Integer num, Throwable th) {
        return Boolean.valueOf(m208230C(str, th));
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m208234G(String str, VerificationToken verificationToken) {
        this.f191279a.remove(str);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Boolean m208235H(String str, Integer num, Throwable th) {
        return Boolean.valueOf(m208230C(str, th));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0010  */
    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Boolean m208236I(User user, Integer num, Throwable th) {
        boolean z;
        if (m208230C(user.f56859id, th)) {
            z = num.intValue() == 1;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m208237J(String str, VerificationToken verificationToken) {
        this.f191280b.put(str, verificationToken);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ C22421c m208238K(User user, VerificationTokenRequestParam verificationTokenRequestParam) {
        return m208229B(user.f56859id, verificationTokenRequestParam);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m208239L(User user, VerificationToken verificationToken) {
        this.f191279a.remove(user.f56859id);
    }

    /* JADX INFO: renamed from: M */
    public C22421c<Envelope> m208240M(String str, final JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return C22421c.error(new NullPointerException("empty userId"));
        }
        final String strM211107i = xi5.m211107i("/users/" + str + "/verifications/" + str + "?process=new");
        return uqb0.f180377I.now("processVerificationResult" + str, qi20.m176658e(new pcj() { // from class: l.dwh0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return xi5.network.auth().m209043q(strM211107i).m209037k(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }).doOnNext(new y20() { // from class: l.nwh0
            @Override // p153l.y20
            public final void call(Object obj) {
                uqb0.f180397c0.mergeNetworkStateIntoLocalState((Envelope) obj, new x20() { // from class: l.gwh0
                    @Override // p153l.x20
                    public final void call() {
                        wwh0.m208213h();
                    }
                });
            }
        }).observeOn(fo0.m126432a()));
    }

    /* JADX INFO: renamed from: N */
    public void m208241N(final VerificationTokenRequestParam verificationTokenRequestParam) {
        if (this.f191281c) {
            final User userMe_ = uqb0.f180397c0.me_();
            if (NullChecker.m82486a(userMe_)) {
                final String strM208242w = m208242w(userMe_, verificationTokenRequestParam, userMe_.f56859id);
                if (this.f191280b.containsKey(strM208242w)) {
                    return;
                }
                C22421c.defer(new pcj() { // from class: l.owh0
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return this.f149479a.m208238K(userMe_, verificationTokenRequestParam);
                    }
                }).doOnNext(new y20() { // from class: l.pwh0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f154405a.m208239L(userMe_, (VerificationToken) obj);
                    }
                }).retry(new rcj() { // from class: l.qwh0
                    @Override // p153l.rcj
                    public final Object call(Object obj, Object obj2) {
                        return this.f159889a.m208236I(userMe_, (Integer) obj, (Throwable) obj2);
                    }
                }).subscribe(psd0.m173597H(new y20() { // from class: l.rwh0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f165140a.m208237J(strM208242w, (VerificationToken) obj);
                    }
                }, new y20() { // from class: l.swh0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        wwh0.m208208c((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final String m208242w(@NonNull User user, VerificationTokenRequestParam verificationTokenRequestParam, String str) {
        return verificationTokenRequestParam.cacheKey() + niw.m163315e(user.m61308fp().url) + str;
    }

    /* JADX INFO: renamed from: x */
    public C22421c<VerificationToken> m208243x(final String str, final VerificationTokenRequestParam verificationTokenRequestParam) {
        return C22421c.defer(new pcj() { // from class: l.twh0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f176396a.m208231D(str, verificationTokenRequestParam);
            }
        }).doOnNext(new y20() { // from class: l.uwh0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181279a.m208232E(str, (VerificationToken) obj);
            }
        }).retry(new rcj() { // from class: l.vwh0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return this.f186141a.m208233F(str, (Integer) obj, (Throwable) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final C22421c<VerificationToken> m208231D(String str, final VerificationTokenRequestParam verificationTokenRequestParam) {
        final String strM211100b = xi5.m211100b("/retrieve/verification-tokens");
        if (this.f191279a.contains(str)) {
            strM211100b = strM211100b + "?code=40003";
        }
        return uqb0.f180377I.now("getAccountVerificationToken" + str + verificationTokenRequestParam.hashCode(), qi20.m176656c(new pcj() { // from class: l.jwh0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return xi5.network.auth().m209043q(strM211100b).m209038l(z1d0.create(Network.JSON, verificationTokenRequestParam.toJson())).m209028b();
            }
        }, VerificationPutongDataEnvelope.JSON_ADAPTER), false).map(new qcj() { // from class: l.kwh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return wwh0.m208218m((VerificationPutongDataEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public C22421c<VerificationToken> m208245z(String str, final VerificationToken verificationToken, jxf jxfVar) {
        final ReflectTokenRequestParam reflectTokenRequestParam = new ReflectTokenRequestParam();
        reflectTokenRequestParam.appId = "1";
        reflectTokenRequestParam.productId = "1";
        reflectTokenRequestParam.deviceData = jxfVar.f123024b;
        reflectTokenRequestParam.region = LiveRegionTag.oversea;
        final String strM211107i = xi5.m211107i("/users/" + str + "/ray-sequence");
        return uqb0.f180377I.now("get-ray-sequence" + str + reflectTokenRequestParam.hashCode(), qi20.m176654a(new pcj() { // from class: l.lwh0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return xi5.network.auth().m209043q(strM211107i).m209038l(z1d0.create(Network.JSON, reflectTokenRequestParam.toJson())).m209028b();
            }
        }), false).map(new qcj() { // from class: l.mwh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return wwh0.m208210e(verificationToken, (Envelope) obj);
            }
        });
    }
}
