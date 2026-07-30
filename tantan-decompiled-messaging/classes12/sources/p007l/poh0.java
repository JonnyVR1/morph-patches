package p007l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.data.CommonData;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.LiveRegionTag;
import com.p000p1.mobile.putong.data.ReflectResponse;
import com.p000p1.mobile.putong.data.ReflectTokenRequestParam;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.VerificationPutongDataEnvelope;
import com.p000p1.mobile.putong.data.VerificationToken;
import com.p000p1.mobile.putong.data.VerificationTokenRequestParam;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.api.api.TantanException;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import l.d30;
import l.e30;
import l.ia20;
import l.jo0;
import l.mkd0;
import l.ogw;
import l.qib0;
import l.upk0;
import l.utc0;
import l.v9j;
import l.vvf;
import l.w9j;
import l.x9j;
import l.xh5;
import org.json.JSONObject;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class poh0 {

    /* JADX INFO: renamed from: a */
    public final Set<String> f11934a = new HashSet();

    /* JADX INFO: renamed from: b */
    public final HashMap<String, VerificationToken> f11935b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public boolean f11936c = false;

    /* JADX INFO: renamed from: l.poh0$a */
    public class C2459a implements v9j<c<VerificationToken>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f11937a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VerificationTokenRequestParam f11938b;

        public C2459a(String str, VerificationTokenRequestParam verificationTokenRequestParam) {
            this.f11937a = str;
            this.f11938b = verificationTokenRequestParam;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c<VerificationToken> call() {
            User userMe_ = qib0.c0.me_();
            poh0 poh0Var = poh0.this;
            if (userMe_ == null) {
                return poh0Var.m13179B(this.f11937a, this.f11938b);
            }
            String strM13192w = poh0Var.m13192w(userMe_, this.f11938b, this.f11937a);
            boolean zContainsKey = poh0.this.f11935b.containsKey(strM13192w);
            poh0 poh0Var2 = poh0.this;
            if (!zContainsKey) {
                return poh0Var2.m13179B(this.f11937a, this.f11938b);
            }
            c<VerificationToken> cVarJust = c.just((VerificationToken) poh0Var2.f11935b.get(strM13192w));
            poh0.this.f11935b.remove(strM13192w);
            return cVarJust;
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m13158c(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ VerificationToken m13160e(VerificationToken verificationToken, Envelope envelope) {
        ReflectResponse reflectResponse = ((CommonData) envelope.getModuleData(CommonData.class)).raySequences.size() > 0 ? ((CommonData) envelope.getModuleData(CommonData.class)).raySequences.get(0) : null;
        if (NullChecker.a(reflectResponse)) {
            verificationToken.response = reflectResponse;
            return verificationToken;
        }
        RuntimeException runtimeException = new RuntimeException("null provider ray-sequence");
        CrashHelper.c(runtimeException);
        throw runtimeException;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m13163h() {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ VerificationToken m13166k(Envelope envelope) {
        VerificationToken verificationToken = ((CommonData) envelope.getModuleData(CommonData.class)).verificationTokens.get(0);
        if (verificationToken.omitLiveData || !TextUtils.isEmpty(verificationToken.provider)) {
            return verificationToken;
        }
        upk0.a("null provider");
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ VerificationToken m13168m(VerificationPutongDataEnvelope verificationPutongDataEnvelope) {
        VerificationToken verificationToken = verificationPutongDataEnvelope.data.verificationTokens.get(0);
        if (!verificationToken.omitLiveData && TextUtils.isEmpty(verificationToken.provider)) {
            CrashHelper.c(new RuntimeException("null provider"));
        }
        return verificationToken;
    }

    /* JADX INFO: renamed from: A */
    public c<VerificationToken> m13178A(final String str, VerificationTokenRequestParam verificationTokenRequestParam) {
        return c.defer(new C2459a(str, verificationTokenRequestParam)).doOnNext(new e30() { // from class: l.xnh0
            public final void call(Object obj) {
                this.f15052a.m13184G(str, (VerificationToken) obj);
            }
        }).retry(new x9j() { // from class: l.ynh0
            public final Object call(Object obj, Object obj2) {
                return this.f15479a.m13185H(str, (Integer) obj, (Throwable) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public final c<VerificationToken> m13179B(String str, final VerificationTokenRequestParam verificationTokenRequestParam) {
        final String strI = xh5.i("/users/" + str + "/verification-tokens");
        if (this.f11934a.contains(str)) {
            strI = strI + "?code=40003";
        }
        return qib0.I.now("getVerificationToken" + str + verificationTokenRequestParam.hashCode(), ia20.a(new v9j() { // from class: l.aoh0
            public final Object call() {
                return xh5.network.auth().q(strI).l(utc0.create(Network.JSON, verificationTokenRequestParam.toJson())).b();
            }
        }), false).map(new w9j() { // from class: l.boh0
            public final Object call(Object obj) {
                return poh0.m13166k((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public final boolean m13180C(String str, Throwable th) {
        if (!(th instanceof TantanException.Client.CoreService)) {
            return false;
        }
        int i = ((TantanException.Client.CoreService) th).code;
        if (i == 40003) {
            this.f11934a.add(str);
            return true;
        }
        if (i != 40005) {
            return false;
        }
        this.f11934a.remove(str);
        return false;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m13182E(String str, VerificationToken verificationToken) {
        this.f11934a.remove(str);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Boolean m13183F(String str, Integer num, Throwable th) {
        return Boolean.valueOf(m13180C(str, th));
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m13184G(String str, VerificationToken verificationToken) {
        this.f11934a.remove(str);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Boolean m13185H(String str, Integer num, Throwable th) {
        return Boolean.valueOf(m13180C(str, th));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0010  */
    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Boolean m13186I(User user, Integer num, Throwable th) {
        boolean z;
        if (m13180C(((DbObject) user).id, th)) {
            z = num.intValue() == 1;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m13187J(String str, VerificationToken verificationToken) {
        this.f11935b.put(str, verificationToken);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ c m13188K(User user, VerificationTokenRequestParam verificationTokenRequestParam) {
        return m13179B(((DbObject) user).id, verificationTokenRequestParam);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m13189L(User user, VerificationToken verificationToken) {
        this.f11934a.remove(((DbObject) user).id);
    }

    /* JADX INFO: renamed from: M */
    public c<Envelope> m13190M(String str, final JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return c.error(new NullPointerException("empty userId"));
        }
        final String strI = xh5.i("/users/" + str + "/verifications/" + str + "?process=new");
        return qib0.I.now("processVerificationResult" + str, ia20.e(new v9j() { // from class: l.wnh0
            public final Object call() {
                return xh5.network.auth().q(strI).k(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }).doOnNext(new e30() { // from class: l.goh0
            public final void call(Object obj) {
                qib0.c0.mergeNetworkStateIntoLocalState((Envelope) obj, new d30() { // from class: l.znh0
                    public final void call() {
                        poh0.m13163h();
                    }
                });
            }
        }).observeOn(jo0.a()));
    }

    /* JADX INFO: renamed from: N */
    public void m13191N(final VerificationTokenRequestParam verificationTokenRequestParam) {
        if (this.f11936c) {
            final User userMe_ = qib0.c0.me_();
            if (NullChecker.a(userMe_)) {
                final String strM13192w = m13192w(userMe_, verificationTokenRequestParam, ((DbObject) userMe_).id);
                if (this.f11935b.containsKey(strM13192w)) {
                    return;
                }
                c.defer(new v9j() { // from class: l.hoh0
                    public final Object call() {
                        return this.f8784a.m13188K(userMe_, verificationTokenRequestParam);
                    }
                }).doOnNext(new e30() { // from class: l.ioh0
                    public final void call(Object obj) {
                        this.f9112a.m13189L(userMe_, (VerificationToken) obj);
                    }
                }).retry(new x9j() { // from class: l.joh0
                    public final Object call(Object obj, Object obj2) {
                        return this.f9464a.m13186I(userMe_, (Integer) obj, (Throwable) obj2);
                    }
                }).subscribe(mkd0.H(new e30() { // from class: l.koh0
                    public final void call(Object obj) {
                        this.f9760a.m13187J(strM13192w, (VerificationToken) obj);
                    }
                }, new e30() { // from class: l.loh0
                    public final void call(Object obj) {
                        poh0.m13158c((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final String m13192w(@NonNull User user, VerificationTokenRequestParam verificationTokenRequestParam, String str) {
        return verificationTokenRequestParam.cacheKey() + ogw.e(user.m1042fp().url) + str;
    }

    /* JADX INFO: renamed from: x */
    public c<VerificationToken> m13193x(final String str, final VerificationTokenRequestParam verificationTokenRequestParam) {
        return c.defer(new v9j() { // from class: l.moh0
            public final Object call() {
                return this.f10536a.m13181D(str, verificationTokenRequestParam);
            }
        }).doOnNext(new e30() { // from class: l.noh0
            public final void call(Object obj) {
                this.f10846a.m13182E(str, (VerificationToken) obj);
            }
        }).retry(new x9j() { // from class: l.ooh0
            public final Object call(Object obj, Object obj2) {
                return this.f11548a.m13183F(str, (Integer) obj, (Throwable) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final c<VerificationToken> m13181D(String str, final VerificationTokenRequestParam verificationTokenRequestParam) {
        final String strB = xh5.b("/retrieve/verification-tokens");
        if (this.f11934a.contains(str)) {
            strB = strB + "?code=40003";
        }
        return qib0.I.now("getAccountVerificationToken" + str + verificationTokenRequestParam.hashCode(), ia20.c(new v9j() { // from class: l.coh0
            public final Object call() {
                return xh5.network.auth().q(strB).l(utc0.create(Network.JSON, verificationTokenRequestParam.toJson())).b();
            }
        }, VerificationPutongDataEnvelope.JSON_ADAPTER), false).map(new w9j() { // from class: l.doh0
            public final Object call(Object obj) {
                return poh0.m13168m((VerificationPutongDataEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public c<VerificationToken> m13195z(String str, final VerificationToken verificationToken, vvf vvfVar) {
        final ReflectTokenRequestParam reflectTokenRequestParam = new ReflectTokenRequestParam();
        reflectTokenRequestParam.appId = "1";
        reflectTokenRequestParam.productId = "1";
        reflectTokenRequestParam.deviceData = vvfVar.b;
        reflectTokenRequestParam.region = LiveRegionTag.oversea;
        final String strI = xh5.i("/users/" + str + "/ray-sequence");
        return qib0.I.now("get-ray-sequence" + str + reflectTokenRequestParam.hashCode(), ia20.a(new v9j() { // from class: l.eoh0
            public final Object call() {
                return xh5.network.auth().q(strI).l(utc0.create(Network.JSON, reflectTokenRequestParam.toJson())).b();
            }
        }), false).map(new w9j() { // from class: l.foh0
            public final Object call(Object obj) {
                return poh0.m13160e(verificationToken, (Envelope) obj);
            }
        });
    }
}
