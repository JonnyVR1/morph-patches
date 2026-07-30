package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class joa extends dy6 {

    /* JADX INFO: renamed from: R */
    public C22507a<List<UserPrivilege>> f121980R;

    public joa() {
        this.f121980R = C22507a.m222758b();
        CoreModule.f18272k.f115542j.warmUp(20, 1000);
    }

    /* JADX INFO: renamed from: A3 */
    public static boolean m146349A3() {
        UserPrivilege userPrivilegeM146426x4 = CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.aiChatCompanion));
        return NullChecker.m82486a(userPrivilegeM146426x4) && userPrivilegeM146426x4.content.remaining > 0;
    }

    /* JADX INFO: renamed from: A4 */
    public static int m146350A4() {
        UserPrivilege userPrivilegeM146426x4 = CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get("letter"));
        if (NullChecker.m82486a(userPrivilegeM146426x4)) {
            return userPrivilegeM146426x4.content.remaining;
        }
        return 0;
    }

    /* JADX INFO: renamed from: B3 */
    public static boolean m146351B3() {
        UserPrivilege userPrivilegeM146426x4 = CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.preConfession));
        return NullChecker.m82486a(userPrivilegeM146426x4) && userPrivilegeM146426x4.content.remaining > 0;
    }

    /* JADX INFO: renamed from: B4 */
    public static int m146352B4() {
        UserPrivilege userPrivilegeM146426x4 = CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.visitorHidden));
        if (NullChecker.m82486a(userPrivilegeM146426x4)) {
            return userPrivilegeM146426x4.content.remaining;
        }
        return 0;
    }

    /* JADX INFO: renamed from: C3 */
    public static boolean m146353C3() {
        return !m146368T3(SummarizedPrivilegesId.get("femaleVip"));
    }

    /* JADX INFO: renamed from: D3 */
    public static boolean m146354D3() {
        return !m146368T3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.ultraPremium));
    }

    /* JADX INFO: renamed from: E3 */
    public static boolean m146355E3() {
        return m146350A4() > 0;
    }

    /* JADX INFO: renamed from: F3 */
    public static boolean m146356F3() {
        return !m146368T3(SummarizedPrivilegesId.get("limitedTrialSee"));
    }

    /* JADX INFO: renamed from: G3 */
    public static boolean m146357G3() {
        return !m146368T3(SummarizedPrivilegesId.get("oDiamond"));
    }

    /* JADX INFO: renamed from: H3 */
    public static boolean m146358H3() {
        return (m146368T3(SummarizedPrivilegesId.get("svipPicksMembership")) && m146368T3(SummarizedPrivilegesId.get("picksMembership"))) ? false : true;
    }

    /* JADX INFO: renamed from: I3 */
    public static boolean m146359I3() {
        return !m146368T3(SummarizedPrivilegesId.get("platinum"));
    }

    /* JADX INFO: renamed from: J3 */
    public static boolean m146360J3() {
        return !m146368T3(SummarizedPrivilegesId.get("privateCustom"));
    }

    /* JADX INFO: renamed from: M3 */
    public static boolean m146361M3() {
        if (gta.m132210e().m132214d().mo34844h5() || gta.m132210e().m132214d().mo34700Hg()) {
            return !m146386f4();
        }
        return false;
    }

    /* JADX INFO: renamed from: N3 */
    public static boolean m146362N3() {
        UserPrivilege userPrivilegeM146426x4 = CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.greetNumber));
        return NullChecker.m82486a(userPrivilegeM146426x4) && userPrivilegeM146426x4.content.remaining > 0;
    }

    /* JADX INFO: renamed from: O3 */
    public static boolean m146363O3() {
        return !m146368T3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.supremePartner));
    }

    /* JADX INFO: renamed from: P3 */
    public static boolean m146364P3() {
        return !m146368T3(SummarizedPrivilegesId.get("youthVip"));
    }

    /* JADX INFO: renamed from: Q3 */
    public static boolean m146365Q3() {
        UserPrivilege userPrivilegeM146426x4 = CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get("seekPartnerNum"));
        return NullChecker.m82486a(userPrivilegeM146426x4) && userPrivilegeM146426x4.content.remaining > 0;
    }

    /* JADX INFO: renamed from: R3 */
    public static int m146366R3() {
        UserPrivilege userPrivilegeM146426x4 = CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get("instantChat"));
        if (NullChecker.m82486a(userPrivilegeM146426x4)) {
            return userPrivilegeM146426x4.content.remaining;
        }
        return 0;
    }

    /* JADX INFO: renamed from: S3 */
    public static boolean m146367S3() {
        return m146402o3() <= 0;
    }

    /* JADX INFO: renamed from: T3 */
    public static boolean m146368T3(SummarizedPrivilegesId summarizedPrivilegesId) {
        UserPrivilege userPrivilegeM146426x4 = CoreModule.f18264c.f20297C0.m146426x4(summarizedPrivilegesId);
        return userPrivilegeM146426x4 == null || userPrivilegeM146426x4.content.expiredTime < uqb0.f180376H.guessedCurrentServerTime();
    }

    /* JADX INFO: renamed from: U3 */
    public static boolean m146369U3(UserPrivilege userPrivilege) {
        return userPrivilege == null || userPrivilege.content.expiredTime < uqb0.f180376H.guessedCurrentServerTime();
    }

    /* JADX INFO: renamed from: V3 */
    public static boolean m146370V3() {
        return m146380c4(SummarizedPrivilegesId.get("femaleVip"));
    }

    /* JADX INFO: renamed from: W3 */
    public static boolean m146371W3() {
        return !m146401n4() && m146386f4() && m146373Y3() && !m146359I3();
    }

    /* JADX INFO: renamed from: X3 */
    public static boolean m146372X3() {
        return m146368T3(SummarizedPrivilegesId.get("unlimitedSwipes"));
    }

    /* JADX INFO: renamed from: Y3 */
    public static boolean m146373Y3() {
        return m146368T3(SummarizedPrivilegesId.get("oDiamond"));
    }

    /* JADX INFO: renamed from: Z3 */
    public static boolean m146374Z3() {
        return m146380c4(SummarizedPrivilegesId.get("oDiamond"));
    }

    /* JADX INFO: renamed from: a4 */
    public static boolean m146376a4() {
        UserPrivilege userPrivilegeM146426x4 = CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get("platinum"));
        if (userPrivilegeM146426x4 == null) {
            return false;
        }
        long j = userPrivilegeM146426x4.content.expiredTime;
        return j > 0 && j < uqb0.f180376H.guessedCurrentServerTime();
    }

    /* JADX INFO: renamed from: b4 */
    public static boolean m146378b4(PurchaseType purchaseType) {
        SummarizedPrivilegesId summarizedPrivilegesId = SummarizedPrivilegesId.get("unknown_");
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            summarizedPrivilegesId = SummarizedPrivilegesId.get("svip");
        }
        if (TEnum.equals(summarizedPrivilegesId, "unknown_")) {
            return true;
        }
        return m146368T3(summarizedPrivilegesId);
    }

    /* JADX INFO: renamed from: c4 */
    public static boolean m146380c4(SummarizedPrivilegesId summarizedPrivilegesId) {
        UserPrivilege userPrivilegeM146426x4 = CoreModule.f18264c.f20297C0.m146426x4(summarizedPrivilegesId);
        return userPrivilegeM146426x4 != null && userPrivilegeM146426x4.content.expiredTime > 0;
    }

    /* JADX INFO: renamed from: d4 */
    public static boolean m146382d4(UserPrivilege userPrivilege) {
        return userPrivilege != null && userPrivilege.content.expiredTime > 0;
    }

    /* JADX INFO: renamed from: e4 */
    public static boolean m146384e4() {
        return m146368T3(SummarizedPrivilegesId.get("roaming"));
    }

    /* JADX INFO: renamed from: f4 */
    public static boolean m146386f4() {
        return m146368T3(SummarizedPrivilegesId.get("svip"));
    }

    /* JADX INFO: renamed from: g4 */
    public static boolean m146388g4() {
        return m146380c4(SummarizedPrivilegesId.get("svip"));
    }

    /* JADX INFO: renamed from: h4 */
    public static boolean m146390h4() {
        return m146380c4(SummarizedPrivilegesId.get("svipPicksMembership"));
    }

    /* JADX INFO: renamed from: i4 */
    public static boolean m146392i4() {
        return m146368T3(SummarizedPrivilegesId.get("seeWhoLikedMe"));
    }

    /* JADX INFO: renamed from: j4 */
    public static boolean m146394j4() {
        return m146368T3(SummarizedPrivilegesId.get("superLikeMembership"));
    }

    /* JADX INFO: renamed from: k3 */
    public static int m146395k3() {
        UserPrivilege userPrivilegeM146426x4 = CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.aiChatAnalysis));
        if (NullChecker.m82486a(userPrivilegeM146426x4) && NullChecker.m82487b(userPrivilegeM146426x4.content)) {
            return userPrivilegeM146426x4.content.remaining;
        }
        return 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m146396k4() {
        return m146368T3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.ultraPremium));
    }

    /* JADX INFO: renamed from: l3 */
    public static int m146397l3() {
        UserPrivilege userPrivilegeM146426x4 = CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.aiChatAdvice));
        if (NullChecker.m82486a(userPrivilegeM146426x4) && NullChecker.m82487b(userPrivilegeM146426x4.content)) {
            return userPrivilegeM146426x4.content.remaining;
        }
        return 0;
    }

    /* JADX INFO: renamed from: l4 */
    public static boolean m146398l4() {
        return m146380c4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.ultraPremium));
    }

    /* JADX INFO: renamed from: m3 */
    public static int m146399m3() {
        UserPrivilege userPrivilegeM146426x4 = CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get("compliment"));
        if (NullChecker.m82486a(userPrivilegeM146426x4)) {
            return userPrivilegeM146426x4.content.remaining;
        }
        return 0;
    }

    /* JADX INFO: renamed from: m4 */
    public static boolean m146400m4() {
        return m146368T3(SummarizedPrivilegesId.get("undoMembership"));
    }

    /* JADX INFO: renamed from: n4 */
    public static boolean m146401n4() {
        return m146368T3(SummarizedPrivilegesId.get("vip"));
    }

    /* JADX INFO: renamed from: o3 */
    public static int m146402o3() {
        UserPrivilege userPrivilegeM146426x4 = CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get("acceleratePairing"));
        if (NullChecker.m82486a(userPrivilegeM146426x4)) {
            return userPrivilegeM146426x4.content.remaining;
        }
        return 0;
    }

    /* JADX INFO: renamed from: p3 */
    public static int m146403p3() {
        UserPrivilege userPrivilegeM146426x4 = CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.suggestTopShow));
        if (NullChecker.m82486a(userPrivilegeM146426x4)) {
            return userPrivilegeM146426x4.content.remaining;
        }
        return 0;
    }

    /* JADX INFO: renamed from: q3 */
    public static long m146404q3() {
        return m146409w3(SummarizedPrivilegesId.get("femaleVip"));
    }

    /* JADX INFO: renamed from: r3 */
    public static int m146405r3() {
        UserPrivilege userPrivilegeM146426x4 = CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get("instantChat"));
        if (NullChecker.m82486a(userPrivilegeM146426x4)) {
            return userPrivilegeM146426x4.content.remaining;
        }
        return 0;
    }

    /* JADX INFO: renamed from: s3 */
    public static int m146406s3() {
        return RemoteConfig.m80481x().m80519z("intl_premium_compliment_count", 3);
    }

    /* JADX INFO: renamed from: t3 */
    public static long m146407t3() {
        return m146409w3(SummarizedPrivilegesId.get("limitedTrialSee"));
    }

    /* JADX INFO: renamed from: u3 */
    public static int m146408u3() {
        int i;
        UserPrivilege userPrivilegeM146426x4 = CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.preConfession));
        if (!NullChecker.m82486a(userPrivilegeM146426x4) || (i = userPrivilegeM146426x4.content.refreshMaxRemaining) <= 0) {
            return 3;
        }
        return i;
    }

    /* JADX INFO: renamed from: w3 */
    public static long m146409w3(SummarizedPrivilegesId summarizedPrivilegesId) {
        UserPrivilege userPrivilegeM146426x4 = CoreModule.f18264c.f20297C0.m146426x4(summarizedPrivilegesId);
        if (userPrivilegeM146426x4 == null) {
            return 0L;
        }
        return userPrivilegeM146426x4.content.expiredTime;
    }

    /* JADX INFO: renamed from: w4 */
    public static int m146410w4() {
        UserPrivilege userPrivilegeM146426x4 = CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.pinChat));
        if (userPrivilegeM146426x4 == null) {
            return 0;
        }
        return userPrivilegeM146426x4.content.remaining;
    }

    /* JADX INFO: renamed from: x3 */
    public static long m146411x3(SummarizedPrivilegesId summarizedPrivilegesId) {
        UserPrivilege userPrivilegeM146426x4 = CoreModule.f18264c.f20297C0.m146426x4(summarizedPrivilegesId);
        if (userPrivilegeM146426x4 == null) {
            return 0L;
        }
        return userPrivilegeM146426x4.content.expiredTime;
    }

    /* JADX INFO: renamed from: z3 */
    public static boolean m146412z3() {
        return !m146368T3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.advancedSearch));
    }

    /* JADX INFO: renamed from: z4 */
    public static boolean m146413z4() {
        if (!m146396k4()) {
            return true;
        }
        if (m146386f4()) {
            return CoreModule.f18264c.f20414p0.m219066k3();
        }
        return false;
    }

    /* JADX INFO: renamed from: K3 */
    public boolean m146414K3() {
        return (m146368T3(SummarizedPrivilegesId.get("intlReadMessage")) && m146386f4() && !gta.m132210e().m132214d().mo34927t9()) ? false : true;
    }

    /* JADX INFO: renamed from: L3 */
    public boolean m146415L3() {
        return !m146368T3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.revokeUnPair));
    }

    /* JADX INFO: renamed from: n3 */
    public void m146416n3() {
        final List<UserPrivilege> listM222761e = this.f121980R.m222761e();
        if (listM222761e != null) {
            UserPrivilege userPrivilege = (UserPrivilege) jyb.m147529r(listM222761e, new qcj() { // from class: l.hoa
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((UserPrivilege) obj).f56859id.equals("letter"));
                }
            });
            if (NullChecker.m82487b(userPrivilege)) {
                userPrivilege.content.remaining--;
                l51.m152887G(new Runnable() { // from class: l.ioa
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f116129a.m146417o4(listM222761e);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m146417o4(List list) {
        this.f121980R.onNext(list);
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ Boolean m146418p4(UserPrivilege userPrivilege) {
        if (userPrivilege == null) {
            m146425v4();
        }
        return Boolean.valueOf(userPrivilege != null);
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ List m146419q4(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        if (NullChecker.m82487b(coreData) && NullChecker.m82487b(coreData.summarizedPrivileges)) {
            return coreData.summarizedPrivileges;
        }
        return null;
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ List m146420r4(List list) {
        this.f121980R.onNext(list);
        if (gta.m132210e().m132214d().mo34825f() && gta.m132210e().m132214d().mo34903pb() != m146357G3()) {
            this.f91137Q.f20318J0.m156781V3();
            gta.m132210e().m132214d().mo34948xd(m146357G3());
            return list;
        }
        if (gta.m132210e().m132214d().mo34769Vd() && gta.m132210e().m132214d().mo34699Hf() != m146354D3()) {
            this.f91137Q.f20318J0.m156781V3();
            gta.m132210e().m132214d().mo34866jq(m146354D3());
        }
        return list;
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ C22421c m146421s4(final String str) {
        return new ti20(new pcj() { // from class: l.coa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(str).m209028b();
            }
        }).map(new qcj() { // from class: l.doa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f89903a.m146419q4((Envelope) obj);
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.eoa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f94922a.m146420r4((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ uxj0 m146422t4(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ C22421c m146423u4(final String str) {
        return qi20.m176658e(new pcj() { // from class: l.foa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(str).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.goa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f105279a.m146422t4((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v3 */
    public C22421c<UserPrivilege> m146424v3(SummarizedPrivilegesId summarizedPrivilegesId) {
        return CoreModule.f18272k.f115542j.uiGet(summarizedPrivilegesId.toString()).filter(new qcj() { // from class: l.boa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f77662a.m146418p4((UserPrivilege) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v4 */
    public C22421c<List<UserPrivilege>> m146425v4() {
        final String strM32216J0 = CoreModule.m30930K().mo31838xf() ? C4879a.m32216J0("/summarized-privileges?with=diamond") : C4879a.m32216J0("/summarized-privileges");
        return this.f91137Q.scheduled("privileges_pkg", 0, new pcj() { // from class: l.aoa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f72435a.m146421s4(strM32216J0);
            }
        });
    }

    /* JADX INFO: renamed from: x4 */
    public UserPrivilege m146426x4(SummarizedPrivilegesId summarizedPrivilegesId) {
        return l51.m152884D() ? (UserPrivilege) CoreModule.f18272k.f115542j.queryCache(summarizedPrivilegesId.toString()) : (UserPrivilege) CoreModule.f18272k.f115542j.query(summarizedPrivilegesId.toString());
    }

    /* JADX INFO: renamed from: y3 */
    public C22421c<List<UserPrivilege>> m146427y3() {
        return this.f121980R;
    }

    /* JADX INFO: renamed from: y4 */
    public C22421c<uxj0> m146428y4() {
        final String strM32216J0 = CoreModule.m30930K().mo31838xf() ? C4879a.m32216J0("/summarized-privileges?with=diamond") : C4879a.m32216J0("/summarized-privileges");
        return this.f91137Q.scheduled("refreshPrivileges", 0, new pcj() { // from class: l.zna
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f205188a.m146423u4(strM32216J0);
            }
        });
    }

    public joa(C4883c c4883c) {
        super(c4883c);
        this.f121980R = C22507a.m222758b();
    }
}
