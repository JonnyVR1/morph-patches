package p149l;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.common.base.Optional;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.CoreGrowthSpamEnvelope;
import com.p046p1.mobile.putong.core.data.Explore;
import com.p046p1.mobile.putong.core.data.GrowthBlindBoxInfo;
import com.p046p1.mobile.putong.core.data.GrowthMesInfo;
import com.p046p1.mobile.putong.core.data.GrowthSpamInfo;
import com.p046p1.mobile.putong.core.data.RecallMatch;
import com.p046p1.mobile.putong.core.data.ShareId;
import com.p046p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes9.dex */
public class vz8 extends ax6 {

    /* JADX INFO: renamed from: R */
    public C22393b<String> f183592R;

    /* JADX INFO: renamed from: S */
    public C22392a<Optional<GrowthMesInfo>> f183593S;

    /* JADX INFO: renamed from: T */
    public C22392a<Optional<Boolean>> f183594T;

    /* JADX INFO: renamed from: U */
    public bqd0<GrowthBlindBoxInfo> f183595U;

    /* JADX INFO: renamed from: l.vz8$a */
    public class C20768a extends bqd0<GrowthBlindBoxInfo> {
        public C20768a(String str, GrowthBlindBoxInfo growthBlindBoxInfo) {
            super(str, growthBlindBoxInfo);
        }

        @Override // p149l.bqd0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean checkEquals(@NonNull GrowthBlindBoxInfo growthBlindBoxInfo, GrowthBlindBoxInfo growthBlindBoxInfo2) {
            return growthBlindBoxInfo.equals(growthBlindBoxInfo2);
        }

        @Override // p149l.bqd0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GrowthBlindBoxInfo copyed(GrowthBlindBoxInfo growthBlindBoxInfo, @NonNull GrowthBlindBoxInfo growthBlindBoxInfo2) {
            return growthBlindBoxInfo2.mo223809clone();
        }

        @Override // p149l.fpd0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public GrowthBlindBoxInfo retrieveValue() {
            String string = pref().getString(this.f98687id, null);
            if (!NullChecker.m81303a(string)) {
                return vz8.this.m200710A3();
            }
            try {
                return GrowthBlindBoxInfo.JSON_ADAPTER.parse(string);
            } catch (IOException e) {
                CrashHelper.m81296c(e);
                return vz8.this.m200710A3();
            }
        }

        @Override // p149l.fpd0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public SharedPreferences.Editor saveValue(GrowthBlindBoxInfo growthBlindBoxInfo) {
            return pref().edit().putString(this.f98687id, growthBlindBoxInfo.toJson());
        }
    }

    public vz8(C4732c c4732c) {
        super(c4732c);
        this.f183592R = C22393b.m221521b();
        this.f183593S = C22392a.m221513c(Optional.absent());
        this.f183594T = C22392a.m221513c(Optional.absent());
        this.f183595U = new C20768a("growth_blindbox_info", GrowthBlindBoxInfo.new_());
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ stc0 m200695l3(String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", str);
            jSONObject.put("is_exp_field", z);
        } catch (Exception unused) {
        }
        return C4728a.f19494P.auth().m185898q(C4728a.m31268Y("/explore/card/init")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
    }

    /* JADX INFO: renamed from: n3 */
    public static /* synthetic */ stc0 m200697n3(String str, String str2) {
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
        return C4728a.f19494P.auth().m185898q(C4728a.m31268Y("/internal/userid")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
    }

    /* JADX INFO: renamed from: p3 */
    public static /* synthetic */ stc0 m200699p3(String str, String str2, boolean z, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("state", str);
            jSONObject.put("type", str2);
            jSONObject.put("is_exp_field", z);
            jSONObject.put("id", str3);
        } catch (Exception unused) {
        }
        return C4728a.f19494P.auth().m185898q(C4728a.m31268Y("/explore/card/swipe")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
    }

    /* JADX INFO: renamed from: r3 */
    public static /* synthetic */ stc0 m200701r3(String str, String str2) {
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
        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/growth-match/me")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
    }

    /* JADX INFO: renamed from: y3 */
    public static /* synthetic */ stc0 m200708y3(String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", str);
            jSONObject.put("is_exp_field", z);
        } catch (Exception unused) {
        }
        return C4728a.f19494P.auth().m185898q(C4728a.m31268Y("/explore/card/suggest")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
    }

    /* JADX INFO: renamed from: A3 */
    public final GrowthBlindBoxInfo m200710A3() {
        GrowthBlindBoxInfo growthBlindBoxInfoNew_ = GrowthBlindBoxInfo.new_();
        growthBlindBoxInfoNew_.title = "盲盒派对";
        growthBlindBoxInfoNew_.subTitle = "有趣的灵魂在这里相遇";
        return growthBlindBoxInfoNew_;
    }

    /* JADX INFO: renamed from: B3 */
    public C22306c<Explore> m200711B3(final String str, final boolean z) {
        return scheduled("card_swipe_init", 0, new v9j() { // from class: l.oz8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f146384a.m200719J3(str, z);
            }
        });
    }

    /* JADX INFO: renamed from: C3 */
    public C22306c<Explore> m200712C3(final String str, final String str2, final String str3, final boolean z) {
        return scheduled("card_swipe", -1, new v9j() { // from class: l.tz8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f172689a.m200721L3(str3, str, z, str2);
            }
        });
    }

    /* JADX INFO: renamed from: D3 */
    public GrowthBlindBoxInfo m200713D3() {
        return this.f183595U.get();
    }

    /* JADX INFO: renamed from: E3 */
    public C22306c<Boolean> m200714E3() {
        return this.f72126Q.scheduled("get_is_back_user", 0, new v9j() { // from class: l.hz8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.pz8
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/recall/payment_growth/judge")).m185883b();
                    }
                }).map(new w9j() { // from class: l.qz8
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).isRecallUser);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: F3 */
    public C22306c<ShareId> m200715F3(final String str, final String str2) {
        return this.f72126Q.scheduled("share_userid_ab", -1, new v9j() { // from class: l.kz8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.mz8
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return vz8.m200697n3(str, str);
                    }
                });
            }
        }).map(new w9j() { // from class: l.lz8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).shareId;
            }
        });
    }

    /* JADX INFO: renamed from: G3 */
    public C22306c<GrowthSpamInfo> m200716G3() {
        return this.f72126Q.scheduled("get_spam_info", 0, new v9j() { // from class: l.wy8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135119c(new v9j() { // from class: l.rz8
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31268Y("/picture_force/pop")).m185883b();
                    }
                }, CoreGrowthSpamEnvelope.JSON_ADAPTER).map(new w9j() { // from class: l.sz8
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((CoreGrowthSpamEnvelope) obj).data;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public C22306c<Optional<Boolean>> m200717H3() {
        return this.f183594T.asObservable();
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ Explore m200718I3(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        return ((CoreData) envelope.getModuleData(CoreData.class)).explore;
    }

    /* JADX INFO: renamed from: J3 */
    public final /* synthetic */ C22306c m200719J3(final String str, final boolean z) {
        return ia20.m135121e(new v9j() { // from class: l.gz8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return vz8.m200695l3(str, z);
            }
        }).map(new w9j() { // from class: l.iz8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f115535a.m200718I3((Envelope) obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ Explore m200720K3(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        return ((CoreData) envelope.getModuleData(CoreData.class)).explore;
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ C22306c m200721L3(final String str, final String str2, final boolean z, final String str3) {
        return ia20.m135121e(new v9j() { // from class: l.cz8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return vz8.m200699p3(str, str2, z, str3);
            }
        }).map(new w9j() { // from class: l.dz8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f88460a.m200720K3((Envelope) obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ Explore m200722M3(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        return ((CoreData) envelope.getModuleData(CoreData.class)).explore;
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ C22306c m200723N3(final String str, final boolean z) {
        return ia20.m135121e(new v9j() { // from class: l.az8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return vz8.m200708y3(str, z);
            }
        }).map(new w9j() { // from class: l.bz8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f78008a.m200722M3((Envelope) obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ Envelope m200724O3(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ roj0 m200725P3(Envelope envelope) {
        GrowthMesInfo growthMesInfo = ((CoreData) envelope.getModuleData(CoreData.class)).growthMesInfo;
        boolean zM81303a = NullChecker.m81303a(growthMesInfo);
        C22392a<Optional<GrowthMesInfo>> c22392a = this.f183593S;
        if (zM81303a) {
            c22392a.m132487l(Optional.m15413of(growthMesInfo));
        } else {
            c22392a.m132487l(Optional.absent());
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Q3 */
    public final /* synthetic */ C22306c m200726Q3() {
        return ia20.m135121e(new v9j() { // from class: l.xy8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31268Y("/recall/message/tab")).m185883b();
            }
        }).map(new w9j() { // from class: l.yy8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f200716a.m200724O3((Envelope) obj);
            }
        }).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.zy8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f205668a.m200725P3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R3 */
    public C22306c<Explore> m200727R3(final String str, final boolean z) {
        return scheduled("post_explore_cards", 0, new v9j() { // from class: l.uz8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f178964a.m200723N3(str, z);
            }
        });
    }

    /* JADX INFO: renamed from: S3 */
    public C22306c<roj0> m200728S3(boolean z) {
        if (z) {
            return this.f72126Q.scheduled("refresh_growth_mes_info", 0, new v9j() { // from class: l.nz8
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f141194a.m200726Q3();
                }
            });
        }
        this.f183593S.m132487l(Optional.absent());
        return C22306c.just(roj0.f160388a);
    }

    /* JADX INFO: renamed from: T3 */
    public C22306c<RecallMatch> m200729T3(final String str, final String str2) {
        return this.f72126Q.scheduled("get_match_status", -1, new v9j() { // from class: l.ez8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.jz8
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return vz8.m200701r3(str, str);
                    }
                });
            }
        }).map(new w9j() { // from class: l.fz8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).recallMatch;
            }
        });
    }
}
