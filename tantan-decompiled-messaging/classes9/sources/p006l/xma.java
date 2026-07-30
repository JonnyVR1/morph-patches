package p006l;

import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.e51;
import l.mkd0;
import l.roj0;
import l.v9j;
import l.vwb;
import l.w9j;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class xma extends ax6 {

    /* JADX INFO: renamed from: R */
    public a<List<UserPrivilege>> f27607R;

    public xma() {
        this.f27607R = a.b();
        CoreModule.f1542k.f11202j.warmUp(20, AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
    }

    /* JADX INFO: renamed from: A3 */
    public static boolean m27345A3() {
        UserPrivilege userPrivilegeM27421w4 = CoreModule.f1534c.f3544C0.m27421w4(SummarizedPrivilegesId.get("preConfession"));
        return NullChecker.a(userPrivilegeM27421w4) && userPrivilegeM27421w4.content.remaining > 0;
    }

    /* JADX INFO: renamed from: A4 */
    public static int m27346A4() {
        UserPrivilege userPrivilegeM27421w4 = CoreModule.f1534c.f3544C0.m27421w4(SummarizedPrivilegesId.get("visitorHidden"));
        if (NullChecker.a(userPrivilegeM27421w4)) {
            return userPrivilegeM27421w4.content.remaining;
        }
        return 0;
    }

    /* JADX INFO: renamed from: B3 */
    public static boolean m27347B3() {
        return !m27362S3(SummarizedPrivilegesId.get("femaleVip"));
    }

    /* JADX INFO: renamed from: C3 */
    public static boolean m27348C3() {
        return !m27362S3(SummarizedPrivilegesId.get("ultraPremium"));
    }

    /* JADX INFO: renamed from: D3 */
    public static boolean m27349D3() {
        return m27408z4() > 0;
    }

    /* JADX INFO: renamed from: E3 */
    public static boolean m27350E3() {
        return !m27362S3(SummarizedPrivilegesId.get("limitedTrialSee"));
    }

    /* JADX INFO: renamed from: F3 */
    public static boolean m27351F3() {
        return !m27362S3(SummarizedPrivilegesId.get("oDiamond"));
    }

    /* JADX INFO: renamed from: G3 */
    public static boolean m27352G3() {
        return (m27362S3(SummarizedPrivilegesId.get("svipPicksMembership")) && m27362S3(SummarizedPrivilegesId.get("picksMembership"))) ? false : true;
    }

    /* JADX INFO: renamed from: H3 */
    public static boolean m27353H3() {
        return !m27362S3(SummarizedPrivilegesId.get("platinum"));
    }

    /* JADX INFO: renamed from: I3 */
    public static boolean m27354I3() {
        return !m27362S3(SummarizedPrivilegesId.get("privateCustom"));
    }

    /* JADX INFO: renamed from: L3 */
    public static boolean m27355L3() {
        if (ura.m25555e().m25559d().m5778h5() || ura.m25555e().m25559d().m5634Hg()) {
            return !m27379e4();
        }
        return false;
    }

    /* JADX INFO: renamed from: M3 */
    public static boolean m27356M3() {
        UserPrivilege userPrivilegeM27421w4 = CoreModule.f1534c.f3544C0.m27421w4(SummarizedPrivilegesId.get("greetNumber"));
        return NullChecker.a(userPrivilegeM27421w4) && userPrivilegeM27421w4.content.remaining > 0;
    }

    /* JADX INFO: renamed from: N3 */
    public static boolean m27357N3() {
        return !m27362S3(SummarizedPrivilegesId.get("supremePartner"));
    }

    /* JADX INFO: renamed from: O3 */
    public static boolean m27358O3() {
        return !m27362S3(SummarizedPrivilegesId.get("youthVip"));
    }

    /* JADX INFO: renamed from: P3 */
    public static boolean m27359P3() {
        UserPrivilege userPrivilegeM27421w4 = CoreModule.f1534c.f3544C0.m27421w4(SummarizedPrivilegesId.get("seekPartnerNum"));
        return NullChecker.a(userPrivilegeM27421w4) && userPrivilegeM27421w4.content.remaining > 0;
    }

    /* JADX INFO: renamed from: Q3 */
    public static int m27360Q3() {
        UserPrivilege userPrivilegeM27421w4 = CoreModule.f1534c.f3544C0.m27421w4(SummarizedPrivilegesId.get("instantChat"));
        if (NullChecker.a(userPrivilegeM27421w4)) {
            return userPrivilegeM27421w4.content.remaining;
        }
        return 0;
    }

    /* JADX INFO: renamed from: R3 */
    public static boolean m27361R3() {
        return m27396o3() <= 0;
    }

    /* JADX INFO: renamed from: S3 */
    public static boolean m27362S3(SummarizedPrivilegesId summarizedPrivilegesId) {
        UserPrivilege userPrivilegeM27421w4 = CoreModule.f1534c.f3544C0.m27421w4(summarizedPrivilegesId);
        return userPrivilegeM27421w4 == null || userPrivilegeM27421w4.content.expiredTime < qib0.f19784H.guessedCurrentServerTime();
    }

    /* JADX INFO: renamed from: T3 */
    public static boolean m27363T3(UserPrivilege userPrivilege) {
        return userPrivilege == null || userPrivilege.content.expiredTime < qib0.f19784H.guessedCurrentServerTime();
    }

    /* JADX INFO: renamed from: U3 */
    public static boolean m27364U3() {
        return m27373b4(SummarizedPrivilegesId.get("femaleVip"));
    }

    /* JADX INFO: renamed from: V3 */
    public static boolean m27365V3() {
        return !m27395m4() && m27379e4() && m27367X3() && !m27353H3();
    }

    /* JADX INFO: renamed from: W3 */
    public static boolean m27366W3() {
        return m27362S3(SummarizedPrivilegesId.get("unlimitedSwipes"));
    }

    /* JADX INFO: renamed from: X3 */
    public static boolean m27367X3() {
        return m27362S3(SummarizedPrivilegesId.get("oDiamond"));
    }

    /* JADX INFO: renamed from: Y3 */
    public static boolean m27368Y3() {
        return m27373b4(SummarizedPrivilegesId.get("oDiamond"));
    }

    /* JADX INFO: renamed from: Z3 */
    public static boolean m27369Z3() {
        UserPrivilege userPrivilegeM27421w4 = CoreModule.f1534c.f3544C0.m27421w4(SummarizedPrivilegesId.get("platinum"));
        if (userPrivilegeM27421w4 == null) {
            return false;
        }
        long j = userPrivilegeM27421w4.content.expiredTime;
        return j > 0 && j < qib0.f19784H.guessedCurrentServerTime();
    }

    /* JADX INFO: renamed from: a4 */
    public static boolean m27371a4(PurchaseType purchaseType) {
        SummarizedPrivilegesId summarizedPrivilegesId = SummarizedPrivilegesId.get("unknown_");
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            summarizedPrivilegesId = SummarizedPrivilegesId.get("svip");
        }
        if (TEnum.equals(summarizedPrivilegesId, "unknown_")) {
            return true;
        }
        return m27362S3(summarizedPrivilegesId);
    }

    /* JADX INFO: renamed from: b4 */
    public static boolean m27373b4(SummarizedPrivilegesId summarizedPrivilegesId) {
        UserPrivilege userPrivilegeM27421w4 = CoreModule.f1534c.f3544C0.m27421w4(summarizedPrivilegesId);
        return userPrivilegeM27421w4 != null && userPrivilegeM27421w4.content.expiredTime > 0;
    }

    /* JADX INFO: renamed from: c4 */
    public static boolean m27375c4(UserPrivilege userPrivilege) {
        return userPrivilege != null && userPrivilege.content.expiredTime > 0;
    }

    /* JADX INFO: renamed from: d4 */
    public static boolean m27377d4() {
        return m27362S3(SummarizedPrivilegesId.get("roaming"));
    }

    /* JADX INFO: renamed from: e4 */
    public static boolean m27379e4() {
        return m27362S3(SummarizedPrivilegesId.get("svip"));
    }

    /* JADX INFO: renamed from: f4 */
    public static boolean m27381f4() {
        return m27373b4(SummarizedPrivilegesId.get("svip"));
    }

    /* JADX INFO: renamed from: g4 */
    public static boolean m27383g4() {
        return m27373b4(SummarizedPrivilegesId.get("svipPicksMembership"));
    }

    /* JADX INFO: renamed from: h4 */
    public static boolean m27385h4() {
        return m27362S3(SummarizedPrivilegesId.get("seeWhoLikedMe"));
    }

    /* JADX INFO: renamed from: i4 */
    public static boolean m27387i4() {
        return m27362S3(SummarizedPrivilegesId.get("superLikeMembership"));
    }

    /* JADX INFO: renamed from: j4 */
    public static boolean m27389j4() {
        return m27362S3(SummarizedPrivilegesId.get("ultraPremium"));
    }

    /* JADX INFO: renamed from: k3 */
    public static int m27390k3() {
        UserPrivilege userPrivilegeM27421w4 = CoreModule.f1534c.f3544C0.m27421w4(SummarizedPrivilegesId.get("aiChatAnalysis"));
        if (NullChecker.a(userPrivilegeM27421w4) && NullChecker.b(userPrivilegeM27421w4.content)) {
            return userPrivilegeM27421w4.content.remaining;
        }
        return 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m27391k4() {
        return m27373b4(SummarizedPrivilegesId.get("ultraPremium"));
    }

    /* JADX INFO: renamed from: l3 */
    public static int m27392l3() {
        UserPrivilege userPrivilegeM27421w4 = CoreModule.f1534c.f3544C0.m27421w4(SummarizedPrivilegesId.get("aiChatAdvice"));
        if (NullChecker.a(userPrivilegeM27421w4) && NullChecker.b(userPrivilegeM27421w4.content)) {
            return userPrivilegeM27421w4.content.remaining;
        }
        return 0;
    }

    /* JADX INFO: renamed from: l4 */
    public static boolean m27393l4() {
        return m27362S3(SummarizedPrivilegesId.get("undoMembership"));
    }

    /* JADX INFO: renamed from: m3 */
    public static int m27394m3() {
        UserPrivilege userPrivilegeM27421w4 = CoreModule.f1534c.f3544C0.m27421w4(SummarizedPrivilegesId.get("compliment"));
        if (NullChecker.a(userPrivilegeM27421w4)) {
            return userPrivilegeM27421w4.content.remaining;
        }
        return 0;
    }

    /* JADX INFO: renamed from: m4 */
    public static boolean m27395m4() {
        return m27362S3(SummarizedPrivilegesId.get("vip"));
    }

    /* JADX INFO: renamed from: o3 */
    public static int m27396o3() {
        UserPrivilege userPrivilegeM27421w4 = CoreModule.f1534c.f3544C0.m27421w4(SummarizedPrivilegesId.get("acceleratePairing"));
        if (NullChecker.a(userPrivilegeM27421w4)) {
            return userPrivilegeM27421w4.content.remaining;
        }
        return 0;
    }

    /* JADX INFO: renamed from: p3 */
    public static int m27397p3() {
        UserPrivilege userPrivilegeM27421w4 = CoreModule.f1534c.f3544C0.m27421w4(SummarizedPrivilegesId.get("suggestTopShow"));
        if (NullChecker.a(userPrivilegeM27421w4)) {
            return userPrivilegeM27421w4.content.remaining;
        }
        return 0;
    }

    /* JADX INFO: renamed from: q3 */
    public static long m27398q3() {
        return m27402v3(SummarizedPrivilegesId.get("femaleVip"));
    }

    /* JADX INFO: renamed from: r3 */
    public static int m27399r3() {
        return RemoteConfig.x().z("intl_premium_compliment_count", 3);
    }

    /* JADX INFO: renamed from: s3 */
    public static long m27400s3() {
        return m27402v3(SummarizedPrivilegesId.get("limitedTrialSee"));
    }

    /* JADX INFO: renamed from: t3 */
    public static int m27401t3() {
        int i;
        UserPrivilege userPrivilegeM27421w4 = CoreModule.f1534c.f3544C0.m27421w4(SummarizedPrivilegesId.get("preConfession"));
        if (!NullChecker.a(userPrivilegeM27421w4) || (i = userPrivilegeM27421w4.content.refreshMaxRemaining) <= 0) {
            return 3;
        }
        return i;
    }

    /* JADX INFO: renamed from: v3 */
    public static long m27402v3(SummarizedPrivilegesId summarizedPrivilegesId) {
        UserPrivilege userPrivilegeM27421w4 = CoreModule.f1534c.f3544C0.m27421w4(summarizedPrivilegesId);
        if (userPrivilegeM27421w4 == null) {
            return 0L;
        }
        return userPrivilegeM27421w4.content.expiredTime;
    }

    /* JADX INFO: renamed from: v4 */
    public static int m27403v4() {
        UserPrivilege userPrivilegeM27421w4 = CoreModule.f1534c.f3544C0.m27421w4(SummarizedPrivilegesId.get("pinChat"));
        if (userPrivilegeM27421w4 == null) {
            return 0;
        }
        return userPrivilegeM27421w4.content.remaining;
    }

    /* JADX INFO: renamed from: w3 */
    public static long m27404w3(SummarizedPrivilegesId summarizedPrivilegesId) {
        UserPrivilege userPrivilegeM27421w4 = CoreModule.f1534c.f3544C0.m27421w4(summarizedPrivilegesId);
        if (userPrivilegeM27421w4 == null) {
            return 0L;
        }
        return userPrivilegeM27421w4.content.expiredTime;
    }

    /* JADX INFO: renamed from: y3 */
    public static boolean m27405y3() {
        return !m27362S3(SummarizedPrivilegesId.get("advancedSearch"));
    }

    /* JADX INFO: renamed from: y4 */
    public static boolean m27406y4() {
        if (!m27389j4()) {
            return true;
        }
        if (m27379e4()) {
            return CoreModule.f1534c.f3661p0.m21967k3();
        }
        return false;
    }

    /* JADX INFO: renamed from: z3 */
    public static boolean m27407z3() {
        UserPrivilege userPrivilegeM27421w4 = CoreModule.f1534c.f3544C0.m27421w4(SummarizedPrivilegesId.get("aiChatCompanion"));
        return NullChecker.a(userPrivilegeM27421w4) && userPrivilegeM27421w4.content.remaining > 0;
    }

    /* JADX INFO: renamed from: z4 */
    public static int m27408z4() {
        UserPrivilege userPrivilegeM27421w4 = CoreModule.f1534c.f3544C0.m27421w4(SummarizedPrivilegesId.get("letter"));
        if (NullChecker.a(userPrivilegeM27421w4)) {
            return userPrivilegeM27421w4.content.remaining;
        }
        return 0;
    }

    /* JADX INFO: renamed from: J3 */
    public boolean m27409J3() {
        return (m27362S3(SummarizedPrivilegesId.get("intlReadMessage")) && m27379e4() && !ura.m25555e().m25559d().m5861t9()) ? false : true;
    }

    /* JADX INFO: renamed from: K3 */
    public boolean m27410K3() {
        return !m27362S3(SummarizedPrivilegesId.get("revokeUnPair"));
    }

    /* JADX INFO: renamed from: n3 */
    public void m27411n3() {
        final List list = (List) this.f27607R.e();
        if (list != null) {
            UserPrivilege userPrivilege = (UserPrivilege) vwb.r(list, new w9j() { // from class: l.vma
                public final Object call(Object obj) {
                    return Boolean.valueOf(((DbObject) ((UserPrivilege) obj)).id.equals("letter"));
                }
            });
            if (NullChecker.b(userPrivilege)) {
                userPrivilege.content.remaining--;
                e51.G(new Runnable() { // from class: l.wma
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f25230a.m27412n4(list);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m27412n4(List list) {
        this.f27607R.onNext(list);
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ Boolean m27413o4(UserPrivilege userPrivilege) {
        if (userPrivilege == null) {
            m27420u4();
        }
        return Boolean.valueOf(userPrivilege != null);
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ List m27414p4(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        CoreData moduleData = envelope.getModuleData(CoreData.class);
        if (NullChecker.b(moduleData) && NullChecker.b(moduleData.summarizedPrivileges)) {
            return moduleData.summarizedPrivileges;
        }
        return null;
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ List m27415q4(List list) {
        this.f27607R.onNext(list);
        if (ura.m25555e().m25559d().m5759f() && ura.m25555e().m25559d().m5837pb() != m27351F3()) {
            this.f8580Q.f3565J0.m17219V3();
            ura.m25555e().m25559d().m5882xd(m27351F3());
            return list;
        }
        if (ura.m25555e().m25559d().m5703Vd() && ura.m25555e().m25559d().m5633Hf() != m27348C3()) {
            this.f8580Q.f3565J0.m17219V3();
            ura.m25555e().m25559d().m5800jq(m27348C3());
        }
        return list;
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ c m27416r4(final String str) {
        return new la20(new v9j() { // from class: l.qma
            public final Object call() {
                return C0154a.f3483P.auth().q(str).b();
            }
        }).map(new w9j() { // from class: l.rma
            public final Object call(Object obj) {
                return this.f20631a.m27414p4((Envelope) obj);
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.sma
            public final Object call(Object obj) {
                return this.f21427a.m27415q4((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ roj0 m27417s4(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        return roj0.a;
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ c m27418t4(final String str) {
        return ia20.m16571e(new v9j() { // from class: l.tma
            public final Object call() {
                return C0154a.f3483P.auth().q(str).f().b();
            }
        }).map(new w9j() { // from class: l.uma
            public final Object call(Object obj) {
                return this.f23640a.m27417s4((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public c<UserPrivilege> m27419u3(SummarizedPrivilegesId summarizedPrivilegesId) {
        return CoreModule.f1542k.f11202j.uiGet(summarizedPrivilegesId.toString()).filter(new w9j() { // from class: l.pma
            public final Object call(Object obj) {
                return this.f19195a.m27413o4((UserPrivilege) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u4 */
    public c<List<UserPrivilege>> m27420u4() {
        final String strM3143J0 = CoreModule.m1851K().xf() ? C0154a.m3143J0("/summarized-privileges?with=diamond") : C0154a.m3143J0("/summarized-privileges");
        return this.f8580Q.scheduled("privileges_pkg", 0, new v9j() { // from class: l.oma
            public final Object call() {
                return this.f18282a.m27416r4(strM3143J0);
            }
        });
    }

    /* JADX INFO: renamed from: w4 */
    public UserPrivilege m27421w4(SummarizedPrivilegesId summarizedPrivilegesId) {
        return e51.D() ? CoreModule.f1542k.f11202j.queryCache(summarizedPrivilegesId.toString()) : CoreModule.f1542k.f11202j.query(summarizedPrivilegesId.toString());
    }

    /* JADX INFO: renamed from: x3 */
    public c<List<UserPrivilege>> m27422x3() {
        return this.f27607R;
    }

    /* JADX INFO: renamed from: x4 */
    public c<roj0> m27423x4() {
        final String strM3143J0 = CoreModule.m1851K().xf() ? C0154a.m3143J0("/summarized-privileges?with=diamond") : C0154a.m3143J0("/summarized-privileges");
        return this.f8580Q.scheduled("refreshPrivileges", 0, new v9j() { // from class: l.nma
            public final Object call() {
                return this.f17746a.m27418t4(strM3143J0);
            }
        });
    }

    public xma(C0158c c0158c) {
        super(c0158c);
        this.f27607R = a.b();
    }
}
