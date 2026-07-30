package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.data.ReflectResponse;
import com.p046p1.mobile.putong.data.ReflectTokenRequestParam;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.VerificationPutongDataEnvelope;
import com.p046p1.mobile.putong.data.VerificationToken;
import com.p046p1.mobile.putong.data.VerificationTokenRequestParam;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class poh0 {

    /* JADX INFO: renamed from: a */
    public final Set<String> f150506a = new HashSet();

    /* JADX INFO: renamed from: b */
    public final HashMap<String, VerificationToken> f150507b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public boolean f150508c = false;

    /* JADX INFO: renamed from: l.poh0$a */
    public class C19303a implements v9j<C22306c<VerificationToken>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f150509a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VerificationTokenRequestParam f150510b;

        public C19303a(String str, VerificationTokenRequestParam verificationTokenRequestParam) {
            this.f150509a = str;
            this.f150510b = verificationTokenRequestParam;
        }

        @Override // p149l.v9j, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22306c<VerificationToken> call() {
            User userMe_ = qib0.f154714c0.me_();
            poh0 poh0Var = poh0.this;
            if (userMe_ == null) {
                return poh0Var.m170581B(this.f150509a, this.f150510b);
            }
            String strM170594w = poh0Var.m170594w(userMe_, this.f150510b, this.f150509a);
            boolean zContainsKey = poh0.this.f150507b.containsKey(strM170594w);
            poh0 poh0Var2 = poh0.this;
            if (!zContainsKey) {
                return poh0Var2.m170581B(this.f150509a, this.f150510b);
            }
            C22306c<VerificationToken> c22306cJust = C22306c.just((VerificationToken) poh0Var2.f150507b.get(strM170594w));
            poh0.this.f150507b.remove(strM170594w);
            return c22306cJust;
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m170560c(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ VerificationToken m170562e(VerificationToken verificationToken, Envelope envelope) {
        ReflectResponse reflectResponse = ((CommonData) envelope.getModuleData(CommonData.class)).raySequences.size() > 0 ? ((CommonData) envelope.getModuleData(CommonData.class)).raySequences.get(0) : null;
        if (NullChecker.m81303a(reflectResponse)) {
            verificationToken.response = reflectResponse;
            return verificationToken;
        }
        RuntimeException runtimeException = new RuntimeException("null provider ray-sequence");
        CrashHelper.m81296c(runtimeException);
        throw runtimeException;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m170565h() {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ VerificationToken m170568k(Envelope envelope) {
        VerificationToken verificationToken = ((CommonData) envelope.getModuleData(CommonData.class)).verificationTokens.get(0);
        if (verificationToken.omitLiveData || !TextUtils.isEmpty(verificationToken.provider)) {
            return verificationToken;
        }
        upk0.m194883a("null provider");
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ VerificationToken m170570m(VerificationPutongDataEnvelope verificationPutongDataEnvelope) {
        VerificationToken verificationToken = verificationPutongDataEnvelope.data.verificationTokens.get(0);
        if (!verificationToken.omitLiveData && TextUtils.isEmpty(verificationToken.provider)) {
            CrashHelper.m81296c(new RuntimeException("null provider"));
        }
        return verificationToken;
    }

    /* JADX INFO: renamed from: A */
    public C22306c<VerificationToken> m170580A(final String str, VerificationTokenRequestParam verificationTokenRequestParam) {
        return C22306c.defer(new C19303a(str, verificationTokenRequestParam)).doOnNext(new e30() { // from class: l.xnh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193686a.m170586G(str, (VerificationToken) obj);
            }
        }).retry(new x9j() { // from class: l.ynh0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return this.f199158a.m170587H(str, (Integer) obj, (Throwable) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public final C22306c<VerificationToken> m170581B(String str, final VerificationTokenRequestParam verificationTokenRequestParam) {
        final String strM208761i = xh5.m208761i("/users/" + str + "/verification-tokens");
        if (this.f150506a.contains(str)) {
            strM208761i = strM208761i + "?code=40003";
        }
        return qib0.f154694I.now("getVerificationToken" + str + verificationTokenRequestParam.hashCode(), ia20.m135117a(new v9j() { // from class: l.aoh0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return xh5.network.auth().m185898q(strM208761i).m185893l(utc0.create(Network.JSON, verificationTokenRequestParam.toJson())).m185883b();
            }
        }), false).map(new w9j() { // from class: l.boh0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return poh0.m170568k((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public final boolean m170582C(String str, Throwable th) {
        if (!(th instanceof TantanException.Client.CoreService)) {
            return false;
        }
        int i = ((TantanException.Client.CoreService) th).code;
        if (i == 40003) {
            this.f150506a.add(str);
            return true;
        }
        if (i != 40005) {
            return false;
        }
        this.f150506a.remove(str);
        return false;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m170584E(String str, VerificationToken verificationToken) {
        this.f150506a.remove(str);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Boolean m170585F(String str, Integer num, Throwable th) {
        return Boolean.valueOf(m170582C(str, th));
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m170586G(String str, VerificationToken verificationToken) {
        this.f150506a.remove(str);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Boolean m170587H(String str, Integer num, Throwable th) {
        return Boolean.valueOf(m170582C(str, th));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0010  */
    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Boolean m170588I(User user, Integer num, Throwable th) {
        boolean z;
        if (m170582C(user.f56011id, th)) {
            z = num.intValue() == 1;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m170589J(String str, VerificationToken verificationToken) {
        this.f150507b.put(str, verificationToken);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ C22306c m170590K(User user, VerificationTokenRequestParam verificationTokenRequestParam) {
        return m170581B(user.f56011id, verificationTokenRequestParam);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m170591L(User user, VerificationToken verificationToken) {
        this.f150506a.remove(user.f56011id);
    }

    /* JADX INFO: renamed from: M */
    public C22306c<Envelope> m170592M(String str, final JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return C22306c.error(new NullPointerException("empty userId"));
        }
        final String strM208761i = xh5.m208761i("/users/" + str + "/verifications/" + str + "?process=new");
        return qib0.f154694I.now("processVerificationResult" + str, ia20.m135121e(new v9j() { // from class: l.wnh0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return xh5.network.auth().m185898q(strM208761i).m185892k(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }).doOnNext(new e30() { // from class: l.goh0
            @Override // p149l.e30
            public final void call(Object obj) {
                qib0.f154714c0.mergeNetworkStateIntoLocalState((Envelope) obj, new d30() { // from class: l.znh0
                    @Override // p149l.d30
                    public final void call() {
                        poh0.m170565h();
                    }
                });
            }
        }).observeOn(jo0.m142408a()));
    }

    /* JADX INFO: renamed from: N */
    public void m170593N(final VerificationTokenRequestParam verificationTokenRequestParam) {
        if (this.f150508c) {
            final User userMe_ = qib0.f154714c0.me_();
            if (NullChecker.m81303a(userMe_)) {
                final String strM170594w = m170594w(userMe_, verificationTokenRequestParam, userMe_.f56011id);
                if (this.f150507b.containsKey(strM170594w)) {
                    return;
                }
                C22306c.defer(new v9j() { // from class: l.hoh0
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return this.f108825a.m170590K(userMe_, verificationTokenRequestParam);
                    }
                }).doOnNext(new e30() { // from class: l.ioh0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f114160a.m170591L(userMe_, (VerificationToken) obj);
                    }
                }).retry(new x9j() { // from class: l.joh0
                    @Override // p149l.x9j
                    public final Object call(Object obj, Object obj2) {
                        return this.f118979a.m170588I(userMe_, (Integer) obj, (Throwable) obj2);
                    }
                }).subscribe(mkd0.m154956H(new e30() { // from class: l.koh0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f124016a.m170589J(strM170594w, (VerificationToken) obj);
                    }
                }, new e30() { // from class: l.loh0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        poh0.m170560c((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final String m170594w(@NonNull User user, VerificationTokenRequestParam verificationTokenRequestParam, String str) {
        return verificationTokenRequestParam.cacheKey() + ogw.m164284e(user.m60124fp().url) + str;
    }

    /* JADX INFO: renamed from: x */
    public C22306c<VerificationToken> m170595x(final String str, final VerificationTokenRequestParam verificationTokenRequestParam) {
        return C22306c.defer(new v9j() { // from class: l.moh0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f134911a.m170583D(str, verificationTokenRequestParam);
            }
        }).doOnNext(new e30() { // from class: l.noh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139847a.m170584E(str, (VerificationToken) obj);
            }
        }).retry(new x9j() { // from class: l.ooh0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return this.f144873a.m170585F(str, (Integer) obj, (Throwable) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final C22306c<VerificationToken> m170583D(String str, final VerificationTokenRequestParam verificationTokenRequestParam) {
        final String strM208754b = xh5.m208754b("/retrieve/verification-tokens");
        if (this.f150506a.contains(str)) {
            strM208754b = strM208754b + "?code=40003";
        }
        return qib0.f154694I.now("getAccountVerificationToken" + str + verificationTokenRequestParam.hashCode(), ia20.m135119c(new v9j() { // from class: l.coh0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return xh5.network.auth().m185898q(strM208754b).m185893l(utc0.create(Network.JSON, verificationTokenRequestParam.toJson())).m185883b();
            }
        }, VerificationPutongDataEnvelope.JSON_ADAPTER), false).map(new w9j() { // from class: l.doh0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return poh0.m170570m((VerificationPutongDataEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public C22306c<VerificationToken> m170597z(String str, final VerificationToken verificationToken, vvf vvfVar) {
        final ReflectTokenRequestParam reflectTokenRequestParam = new ReflectTokenRequestParam();
        reflectTokenRequestParam.appId = "1";
        reflectTokenRequestParam.productId = "1";
        reflectTokenRequestParam.deviceData = vvfVar.f183220b;
        reflectTokenRequestParam.region = LiveRegionTag.oversea;
        final String strM208761i = xh5.m208761i("/users/" + str + "/ray-sequence");
        return qib0.f154694I.now("get-ray-sequence" + str + reflectTokenRequestParam.hashCode(), ia20.m135117a(new v9j() { // from class: l.eoh0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return xh5.network.auth().m185898q(strM208761i).m185893l(utc0.create(Network.JSON, reflectTokenRequestParam.toJson())).m185883b();
            }
        }), false).map(new w9j() { // from class: l.foh0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return poh0.m170562e(verificationToken, (Envelope) obj);
            }
        });
    }
}
