package p153l;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.common.base.Optional;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.CoreGrowthSpamEnvelope;
import com.p051p1.mobile.putong.core.data.Explore;
import com.p051p1.mobile.putong.core.data.GrowthBlindBoxInfo;
import com.p051p1.mobile.putong.core.data.GrowthMesInfo;
import com.p051p1.mobile.putong.core.data.GrowthSpamInfo;
import com.p051p1.mobile.putong.core.data.RecallMatch;
import com.p051p1.mobile.putong.core.data.ShareId;
import com.p051p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes9.dex */
public class d19 extends dy6 {

    /* JADX INFO: renamed from: R */
    public C22508b<String> f84654R;

    /* JADX INFO: renamed from: S */
    public C22507a<Optional<GrowthMesInfo>> f84655S;

    /* JADX INFO: renamed from: T */
    public C22507a<Optional<Boolean>> f84656T;

    /* JADX INFO: renamed from: U */
    public dyd0<GrowthBlindBoxInfo> f84657U;

    /* JADX INFO: renamed from: l.d19$a */
    public class C16416a extends dyd0<GrowthBlindBoxInfo> {
        public C16416a(String str, GrowthBlindBoxInfo growthBlindBoxInfo) {
            super(str, growthBlindBoxInfo);
        }

        @Override // p153l.dyd0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean checkEquals(@NonNull GrowthBlindBoxInfo growthBlindBoxInfo, GrowthBlindBoxInfo growthBlindBoxInfo2) {
            return growthBlindBoxInfo.equals(growthBlindBoxInfo2);
        }

        @Override // p153l.dyd0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GrowthBlindBoxInfo copyed(GrowthBlindBoxInfo growthBlindBoxInfo, @NonNull GrowthBlindBoxInfo growthBlindBoxInfo2) {
            return growthBlindBoxInfo2.mo225055clone();
        }

        @Override // p153l.hxd0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public GrowthBlindBoxInfo retrieveValue() {
            String string = pref().getString(this.f111993id, null);
            if (!NullChecker.m82486a(string)) {
                return d19.this.m113534A3();
            }
            try {
                return GrowthBlindBoxInfo.JSON_ADAPTER.parse(string);
            } catch (IOException e) {
                CrashHelper.m82479c(e);
                return d19.this.m113534A3();
            }
        }

        @Override // p153l.hxd0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public SharedPreferences.Editor saveValue(GrowthBlindBoxInfo growthBlindBoxInfo) {
            return pref().edit().putString(this.f111993id, growthBlindBoxInfo.toJson());
        }
    }

    public d19(C4883c c4883c) {
        super(c4883c);
        this.f84654R = C22508b.m222767b();
        this.f84655S = C22507a.m222759c(Optional.absent());
        this.f84656T = C22507a.m222759c(Optional.absent());
        this.f84657U = new C16416a("growth_blindbox_info", GrowthBlindBoxInfo.new_());
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ x1d0 m113519l3(String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", str);
            jSONObject.put("is_exp_field", z);
        } catch (Exception unused) {
        }
        return C4879a.f20236P.auth().m209043q(C4879a.m32271Y("/explore/card/init")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
    }

    /* JADX INFO: renamed from: n3 */
    public static /* synthetic */ x1d0 m113521n3(String str, String str2) {
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
        return C4879a.f20236P.auth().m209043q(C4879a.m32271Y("/internal/userid")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
    }

    /* JADX INFO: renamed from: p3 */
    public static /* synthetic */ x1d0 m113523p3(String str, String str2, boolean z, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("state", str);
            jSONObject.put("type", str2);
            jSONObject.put("is_exp_field", z);
            jSONObject.put("id", str3);
        } catch (Exception unused) {
        }
        return C4879a.f20236P.auth().m209043q(C4879a.m32271Y("/explore/card/swipe")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
    }

    /* JADX INFO: renamed from: r3 */
    public static /* synthetic */ x1d0 m113525r3(String str, String str2) {
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
        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/growth-match/me")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
    }

    /* JADX INFO: renamed from: y3 */
    public static /* synthetic */ x1d0 m113532y3(String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", str);
            jSONObject.put("is_exp_field", z);
        } catch (Exception unused) {
        }
        return C4879a.f20236P.auth().m209043q(C4879a.m32271Y("/explore/card/suggest")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
    }

    /* JADX INFO: renamed from: A3 */
    public final GrowthBlindBoxInfo m113534A3() {
        GrowthBlindBoxInfo growthBlindBoxInfoNew_ = GrowthBlindBoxInfo.new_();
        growthBlindBoxInfoNew_.title = "盲盒派对";
        growthBlindBoxInfoNew_.subTitle = "有趣的灵魂在这里相遇";
        return growthBlindBoxInfoNew_;
    }

    /* JADX INFO: renamed from: B3 */
    public C22421c<Explore> m113535B3(final String str, final boolean z) {
        return scheduled("card_swipe_init", 0, new pcj() { // from class: l.w09
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f186549a.m113543J3(str, z);
            }
        });
    }

    /* JADX INFO: renamed from: C3 */
    public C22421c<Explore> m113536C3(final String str, final String str2, final String str3, final boolean z) {
        return scheduled("card_swipe", -1, new pcj() { // from class: l.b19
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f74336a.m113545L3(str3, str, z, str2);
            }
        });
    }

    /* JADX INFO: renamed from: D3 */
    public GrowthBlindBoxInfo m113537D3() {
        return this.f84657U.get();
    }

    /* JADX INFO: renamed from: E3 */
    public C22421c<Boolean> m113538E3() {
        return this.f91137Q.scheduled("get_is_back_user", 0, new pcj() { // from class: l.p09
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.x09
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/recall/payment_growth/judge")).m209028b();
                    }
                }).map(new qcj() { // from class: l.y09
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).isRecallUser);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: F3 */
    public C22421c<ShareId> m113539F3(final String str, final String str2) {
        return this.f91137Q.scheduled("share_userid_ab", -1, new pcj() { // from class: l.s09
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.u09
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return d19.m113521n3(str, str);
                    }
                });
            }
        }).map(new qcj() { // from class: l.t09
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).shareId;
            }
        });
    }

    /* JADX INFO: renamed from: G3 */
    public C22421c<GrowthSpamInfo> m113540G3() {
        return this.f91137Q.scheduled("get_spam_info", 0, new pcj() { // from class: l.e09
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176656c(new pcj() { // from class: l.z09
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32271Y("/picture_force/pop")).m209028b();
                    }
                }, CoreGrowthSpamEnvelope.JSON_ADAPTER).map(new qcj() { // from class: l.a19
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((CoreGrowthSpamEnvelope) obj).data;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public C22421c<Optional<Boolean>> m113541H3() {
        return this.f84656T.asObservable();
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ Explore m113542I3(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        return ((CoreData) envelope.getModuleData(CoreData.class)).explore;
    }

    /* JADX INFO: renamed from: J3 */
    public final /* synthetic */ C22421c m113543J3(final String str, final boolean z) {
        return qi20.m176658e(new pcj() { // from class: l.o09
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return d19.m113519l3(str, z);
            }
        }).map(new qcj() { // from class: l.q09
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f155034a.m113542I3((Envelope) obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ Explore m113544K3(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        return ((CoreData) envelope.getModuleData(CoreData.class)).explore;
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ C22421c m113545L3(final String str, final String str2, final boolean z, final String str3) {
        return qi20.m176658e(new pcj() { // from class: l.k09
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return d19.m113523p3(str, str2, z, str3);
            }
        }).map(new qcj() { // from class: l.l09
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f129548a.m113544K3((Envelope) obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ Explore m113546M3(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        return ((CoreData) envelope.getModuleData(CoreData.class)).explore;
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ C22421c m113547N3(final String str, final boolean z) {
        return qi20.m176658e(new pcj() { // from class: l.i09
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return d19.m113532y3(str, z);
            }
        }).map(new qcj() { // from class: l.j09
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f117800a.m113546M3((Envelope) obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ Envelope m113548O3(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ uxj0 m113549P3(Envelope envelope) {
        GrowthMesInfo growthMesInfo = ((CoreData) envelope.getModuleData(CoreData.class)).growthMesInfo;
        boolean zM82486a = NullChecker.m82486a(growthMesInfo);
        C22507a<Optional<GrowthMesInfo>> c22507a = this.f84655S;
        if (zM82486a) {
            c22507a.m137019l(Optional.m15467of(growthMesInfo));
        } else {
            c22507a.m137019l(Optional.absent());
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Q3 */
    public final /* synthetic */ C22421c m113550Q3() {
        return qi20.m176658e(new pcj() { // from class: l.f09
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32271Y("/recall/message/tab")).m209028b();
            }
        }).map(new qcj() { // from class: l.g09
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f101619a.m113548O3((Envelope) obj);
            }
        }).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.h09
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f107279a.m113549P3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R3 */
    public C22421c<Explore> m113551R3(final String str, final boolean z) {
        return scheduled("post_explore_cards", 0, new pcj() { // from class: l.c19
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f79378a.m113547N3(str, z);
            }
        });
    }

    /* JADX INFO: renamed from: S3 */
    public C22421c<uxj0> m113552S3(boolean z) {
        if (z) {
            return this.f91137Q.scheduled("refresh_growth_mes_info", 0, new pcj() { // from class: l.v09
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f181843a.m113550Q3();
                }
            });
        }
        this.f84655S.m137019l(Optional.absent());
        return C22421c.just(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: T3 */
    public C22421c<RecallMatch> m113553T3(final String str, final String str2) {
        return this.f91137Q.scheduled("get_match_status", -1, new pcj() { // from class: l.m09
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.r09
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return d19.m113525r3(str, str);
                    }
                });
            }
        }).map(new qcj() { // from class: l.n09
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).recallMatch;
            }
        });
    }
}
