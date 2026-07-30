package p006l;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.CoreGrowthSpamEnvelope;
import com.p1.mobile.putong.core.data.Explore;
import com.p1.mobile.putong.core.data.GrowthBlindBoxInfo;
import com.p1.mobile.putong.core.data.GrowthMesInfo;
import com.p1.mobile.putong.core.data.GrowthSpamInfo;
import com.p1.mobile.putong.core.data.RecallMatch;
import com.p1.mobile.putong.core.data.ShareId;
import com.p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import l.bqd0;
import l.fpd0;
import l.jo0;
import l.mkd0;
import l.roj0;
import l.stc0;
import l.utc0;
import l.v9j;
import l.w9j;
import org.json.JSONObject;
import rx.c;
import rx.subjects.a;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class vz8 extends ax6 {

    /* JADX INFO: renamed from: R */
    public b<String> f24551R;

    /* JADX INFO: renamed from: S */
    public a<Optional<GrowthMesInfo>> f24552S;

    /* JADX INFO: renamed from: T */
    public a<Optional<Boolean>> f24553T;

    /* JADX INFO: renamed from: U */
    public bqd0<GrowthBlindBoxInfo> f24554U;

    /* JADX INFO: renamed from: l.vz8$a */
    public class C1394a extends bqd0<GrowthBlindBoxInfo> {
        public C1394a(String str, GrowthBlindBoxInfo growthBlindBoxInfo) {
            super(str, growthBlindBoxInfo);
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean checkEquals(@NonNull GrowthBlindBoxInfo growthBlindBoxInfo, GrowthBlindBoxInfo growthBlindBoxInfo2) {
            return growthBlindBoxInfo.equals(growthBlindBoxInfo2);
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GrowthBlindBoxInfo copyed(GrowthBlindBoxInfo growthBlindBoxInfo, @NonNull GrowthBlindBoxInfo growthBlindBoxInfo2) {
            return growthBlindBoxInfo2.clone();
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public GrowthBlindBoxInfo retrieveValue() {
            String string = pref().getString(((fpd0) this).id, null);
            if (!NullChecker.a(string)) {
                return vz8.this.m26051A3();
            }
            try {
                return (GrowthBlindBoxInfo) GrowthBlindBoxInfo.JSON_ADAPTER.parse(string);
            } catch (IOException e) {
                CrashHelper.c(e);
                return vz8.this.m26051A3();
            }
        }

        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public SharedPreferences.Editor saveValue(GrowthBlindBoxInfo growthBlindBoxInfo) {
            return pref().edit().putString(((fpd0) this).id, growthBlindBoxInfo.toJson());
        }
    }

    public vz8(C0158c c0158c) {
        super(c0158c);
        this.f24551R = b.b();
        this.f24552S = a.c(Optional.absent());
        this.f24553T = a.c(Optional.absent());
        this.f24554U = new C1394a("growth_blindbox_info", GrowthBlindBoxInfo.new_());
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ stc0 m26036l3(String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", str);
            jSONObject.put("is_exp_field", z);
        } catch (Exception unused) {
        }
        return C0154a.f3483P.auth().q(C0154a.m3198Y("/explore/card/init")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
    }

    /* JADX INFO: renamed from: n3 */
    public static /* synthetic */ stc0 m26038n3(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            jSONObject.put("cipherUserId", str);
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            jSONObject.put("cipherMomentId", str2);
        } catch (Exception unused) {
        }
        return C0154a.f3483P.auth().q(C0154a.m3198Y("/internal/userid")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
    }

    /* JADX INFO: renamed from: p3 */
    public static /* synthetic */ stc0 m26040p3(String str, String str2, boolean z, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("state", str);
            jSONObject.put("type", str2);
            jSONObject.put("is_exp_field", z);
            jSONObject.put("id", str3);
        } catch (Exception unused) {
        }
        return C0154a.f3483P.auth().q(C0154a.m3198Y("/explore/card/swipe")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
    }

    /* JADX INFO: renamed from: r3 */
    public static /* synthetic */ stc0 m26042r3(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            jSONObject.put("action", str);
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            jSONObject.put("tracker", str2);
        } catch (Exception unused) {
        }
        return C0154a.f3483P.auth().q(C0154a.m3130G("/growth-match/me")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
    }

    /* JADX INFO: renamed from: y3 */
    public static /* synthetic */ stc0 m26049y3(String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", str);
            jSONObject.put("is_exp_field", z);
        } catch (Exception unused) {
        }
        return C0154a.f3483P.auth().q(C0154a.m3198Y("/explore/card/suggest")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
    }

    /* JADX INFO: renamed from: A3 */
    public final GrowthBlindBoxInfo m26051A3() {
        GrowthBlindBoxInfo growthBlindBoxInfoNew_ = GrowthBlindBoxInfo.new_();
        growthBlindBoxInfoNew_.title = "盲盒派对";
        growthBlindBoxInfoNew_.subTitle = "有趣的灵魂在这里相遇";
        return growthBlindBoxInfoNew_;
    }

    /* JADX INFO: renamed from: B3 */
    public c<Explore> m26052B3(final String str, final boolean z) {
        return scheduled("card_swipe_init", 0, new v9j() { // from class: l.oz8
            public final Object call() {
                return this.f18505a.m26060J3(str, z);
            }
        });
    }

    /* JADX INFO: renamed from: C3 */
    public c<Explore> m26053C3(final String str, final String str2, final String str3, final boolean z) {
        return scheduled("card_swipe", -1, new v9j() { // from class: l.tz8
            public final Object call() {
                return this.f22357a.m26062L3(str3, str, z, str2);
            }
        });
    }

    /* JADX INFO: renamed from: D3 */
    public GrowthBlindBoxInfo m26054D3() {
        return (GrowthBlindBoxInfo) this.f24554U.get();
    }

    /* JADX INFO: renamed from: E3 */
    public c<Boolean> m26055E3() {
        return this.f8580Q.scheduled("get_is_back_user", 0, new v9j() { // from class: l.hz8
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.pz8
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/recall/payment_growth/judge")).b();
                    }
                }).map(new w9j() { // from class: l.qz8
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((Envelope) obj).getModuleData(CoreData.class).isRecallUser);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: F3 */
    public c<ShareId> m26056F3(final String str, final String str2) {
        return this.f8580Q.scheduled("share_userid_ab", -1, new v9j() { // from class: l.kz8
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.mz8
                    public final Object call() {
                        return vz8.m26038n3(str, str);
                    }
                });
            }
        }).map(new w9j() { // from class: l.lz8
            public final Object call(Object obj) {
                return ((Envelope) obj).getModuleData(CoreData.class).shareId;
            }
        });
    }

    /* JADX INFO: renamed from: G3 */
    public c<GrowthSpamInfo> m26057G3() {
        return this.f8580Q.scheduled("get_spam_info", 0, new v9j() { // from class: l.wy8
            public final Object call() {
                return ia20.m16569c(new v9j() { // from class: l.rz8
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3198Y("/picture_force/pop")).b();
                    }
                }, CoreGrowthSpamEnvelope.JSON_ADAPTER).map(new w9j() { // from class: l.sz8
                    public final Object call(Object obj) {
                        return ((CoreGrowthSpamEnvelope) obj).data;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public c<Optional<Boolean>> m26058H3() {
        return this.f24553T.asObservable();
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ Explore m26059I3(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        return envelope.getModuleData(CoreData.class).explore;
    }

    /* JADX INFO: renamed from: J3 */
    public final /* synthetic */ c m26060J3(final String str, final boolean z) {
        return ia20.m16571e(new v9j() { // from class: l.gz8
            public final Object call() {
                return vz8.m26036l3(str, z);
            }
        }).map(new w9j() { // from class: l.iz8
            public final Object call(Object obj) {
                return this.f14885a.m26059I3((Envelope) obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ Explore m26061K3(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        return envelope.getModuleData(CoreData.class).explore;
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ c m26062L3(final String str, final String str2, final boolean z, final String str3) {
        return ia20.m16571e(new v9j() { // from class: l.cz8
            public final Object call() {
                return vz8.m26040p3(str, str2, z, str3);
            }
        }).map(new w9j() { // from class: l.dz8
            public final Object call(Object obj) {
                return this.f10664a.m26061K3((Envelope) obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ Explore m26063M3(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        return envelope.getModuleData(CoreData.class).explore;
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ c m26064N3(final String str, final boolean z) {
        return ia20.m16571e(new v9j() { // from class: l.az8
            public final Object call() {
                return vz8.m26049y3(str, z);
            }
        }).map(new w9j() { // from class: l.bz8
            public final Object call(Object obj) {
                return this.f9235a.m26063M3((Envelope) obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ Envelope m26065O3(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ roj0 m26066P3(Envelope envelope) {
        GrowthMesInfo growthMesInfo = envelope.getModuleData(CoreData.class).growthMesInfo;
        boolean zA = NullChecker.a(growthMesInfo);
        a<Optional<GrowthMesInfo>> aVar = this.f24552S;
        if (zA) {
            aVar.onNext(Optional.of(growthMesInfo));
        } else {
            aVar.onNext(Optional.absent());
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: Q3 */
    public final /* synthetic */ c m26067Q3() {
        return ia20.m16571e(new v9j() { // from class: l.xy8
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3198Y("/recall/message/tab")).b();
            }
        }).map(new w9j() { // from class: l.yy8
            public final Object call(Object obj) {
                return this.f28493a.m26065O3((Envelope) obj);
            }
        }).observeOn(jo0.a()).map(new w9j() { // from class: l.zy8
            public final Object call(Object obj) {
                return this.f29034a.m26066P3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R3 */
    public c<Explore> m26068R3(final String str, final boolean z) {
        return scheduled("post_explore_cards", 0, new v9j() { // from class: l.uz8
            public final Object call() {
                return this.f23824a.m26064N3(str, z);
            }
        });
    }

    /* JADX INFO: renamed from: S3 */
    public c<roj0> m26069S3(boolean z) {
        if (z) {
            return this.f8580Q.scheduled("refresh_growth_mes_info", 0, new v9j() { // from class: l.nz8
                public final Object call() {
                    return this.f17948a.m26067Q3();
                }
            });
        }
        this.f24552S.onNext(Optional.absent());
        return c.just(roj0.a);
    }

    /* JADX INFO: renamed from: T3 */
    public c<RecallMatch> m26070T3(final String str, final String str2) {
        return this.f8580Q.scheduled("get_match_status", -1, new v9j() { // from class: l.ez8
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.jz8
                    public final Object call() {
                        return vz8.m26042r3(str, str);
                    }
                });
            }
        }).map(new w9j() { // from class: l.fz8
            public final Object call(Object obj) {
                return ((Envelope) obj).getModuleData(CoreData.class).recallMatch;
            }
        });
    }
}
