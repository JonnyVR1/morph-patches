package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class xma extends ax6 {

    /* JADX INFO: renamed from: R */
    public C22392a<List<UserPrivilege>> f193540R;

    public xma() {
        this.f193540R = C22392a.m221512b();
        CoreModule.f17553k.f91947j.warmUp(20, 1000);
    }

    /* JADX INFO: renamed from: A3 */
    public static boolean m210037A3() {
        UserPrivilege userPrivilegeM210113w4 = CoreModule.f17545c.f19555C0.m210113w4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.preConfession));
        return NullChecker.m81303a(userPrivilegeM210113w4) && userPrivilegeM210113w4.content.remaining > 0;
    }

    /* JADX INFO: renamed from: A4 */
    public static int m210038A4() {
        UserPrivilege userPrivilegeM210113w4 = CoreModule.f17545c.f19555C0.m210113w4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.visitorHidden));
        if (NullChecker.m81303a(userPrivilegeM210113w4)) {
            return userPrivilegeM210113w4.content.remaining;
        }
        return 0;
    }

    /* JADX INFO: renamed from: B3 */
    public static boolean m210039B3() {
        return !m210054S3(SummarizedPrivilegesId.get("femaleVip"));
    }

    /* JADX INFO: renamed from: C3 */
    public static boolean m210040C3() {
        return !m210054S3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.ultraPremium));
    }

    /* JADX INFO: renamed from: D3 */
    public static boolean m210041D3() {
        return m210100z4() > 0;
    }

    /* JADX INFO: renamed from: E3 */
    public static boolean m210042E3() {
        return !m210054S3(SummarizedPrivilegesId.get("limitedTrialSee"));
    }

    /* JADX INFO: renamed from: F3 */
    public static boolean m210043F3() {
        return !m210054S3(SummarizedPrivilegesId.get("oDiamond"));
    }

    /* JADX INFO: renamed from: G3 */
    public static boolean m210044G3() {
        return (m210054S3(SummarizedPrivilegesId.get("svipPicksMembership")) && m210054S3(SummarizedPrivilegesId.get("picksMembership"))) ? false : true;
    }

    /* JADX INFO: renamed from: H3 */
    public static boolean m210045H3() {
        return !m210054S3(SummarizedPrivilegesId.get("platinum"));
    }

    /* JADX INFO: renamed from: I3 */
    public static boolean m210046I3() {
        return !m210054S3(SummarizedPrivilegesId.get("privateCustom"));
    }

    /* JADX INFO: renamed from: L3 */
    public static boolean m210047L3() {
        if (ura.m195053e().m195057d().mo33841h5() || ura.m195053e().m195057d().mo33697Hg()) {
            return !m210071e4();
        }
        return false;
    }

    /* JADX INFO: renamed from: M3 */
    public static boolean m210048M3() {
        UserPrivilege userPrivilegeM210113w4 = CoreModule.f17545c.f19555C0.m210113w4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.greetNumber));
        return NullChecker.m81303a(userPrivilegeM210113w4) && userPrivilegeM210113w4.content.remaining > 0;
    }

    /* JADX INFO: renamed from: N3 */
    public static boolean m210049N3() {
        return !m210054S3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.supremePartner));
    }

    /* JADX INFO: renamed from: O3 */
    public static boolean m210050O3() {
        return !m210054S3(SummarizedPrivilegesId.get("youthVip"));
    }

    /* JADX INFO: renamed from: P3 */
    public static boolean m210051P3() {
        UserPrivilege userPrivilegeM210113w4 = CoreModule.f17545c.f19555C0.m210113w4(SummarizedPrivilegesId.get("seekPartnerNum"));
        return NullChecker.m81303a(userPrivilegeM210113w4) && userPrivilegeM210113w4.content.remaining > 0;
    }

    /* JADX INFO: renamed from: Q3 */
    public static int m210052Q3() {
        UserPrivilege userPrivilegeM210113w4 = CoreModule.f17545c.f19555C0.m210113w4(SummarizedPrivilegesId.get("instantChat"));
        if (NullChecker.m81303a(userPrivilegeM210113w4)) {
            return userPrivilegeM210113w4.content.remaining;
        }
        return 0;
    }

    /* JADX INFO: renamed from: R3 */
    public static boolean m210053R3() {
        return m210088o3() <= 0;
    }

    /* JADX INFO: renamed from: S3 */
    public static boolean m210054S3(SummarizedPrivilegesId summarizedPrivilegesId) {
        UserPrivilege userPrivilegeM210113w4 = CoreModule.f17545c.f19555C0.m210113w4(summarizedPrivilegesId);
        return userPrivilegeM210113w4 == null || userPrivilegeM210113w4.content.expiredTime < qib0.f154693H.guessedCurrentServerTime();
    }

    /* JADX INFO: renamed from: T3 */
    public static boolean m210055T3(UserPrivilege userPrivilege) {
        return userPrivilege == null || userPrivilege.content.expiredTime < qib0.f154693H.guessedCurrentServerTime();
    }

    /* JADX INFO: renamed from: U3 */
    public static boolean m210056U3() {
        return m210065b4(SummarizedPrivilegesId.get("femaleVip"));
    }

    /* JADX INFO: renamed from: V3 */
    public static boolean m210057V3() {
        return !m210087m4() && m210071e4() && m210059X3() && !m210045H3();
    }

    /* JADX INFO: renamed from: W3 */
    public static boolean m210058W3() {
        return m210054S3(SummarizedPrivilegesId.get("unlimitedSwipes"));
    }

    /* JADX INFO: renamed from: X3 */
    public static boolean m210059X3() {
        return m210054S3(SummarizedPrivilegesId.get("oDiamond"));
    }

    /* JADX INFO: renamed from: Y3 */
    public static boolean m210060Y3() {
        return m210065b4(SummarizedPrivilegesId.get("oDiamond"));
    }

    /* JADX INFO: renamed from: Z3 */
    public static boolean m210061Z3() {
        UserPrivilege userPrivilegeM210113w4 = CoreModule.f17545c.f19555C0.m210113w4(SummarizedPrivilegesId.get("platinum"));
        if (userPrivilegeM210113w4 == null) {
            return false;
        }
        long j = userPrivilegeM210113w4.content.expiredTime;
        return j > 0 && j < qib0.f154693H.guessedCurrentServerTime();
    }

    /* JADX INFO: renamed from: a4 */
    public static boolean m210063a4(PurchaseType purchaseType) {
        SummarizedPrivilegesId summarizedPrivilegesId = SummarizedPrivilegesId.get("unknown_");
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            summarizedPrivilegesId = SummarizedPrivilegesId.get("svip");
        }
        if (TEnum.equals(summarizedPrivilegesId, "unknown_")) {
            return true;
        }
        return m210054S3(summarizedPrivilegesId);
    }

    /* JADX INFO: renamed from: b4 */
    public static boolean m210065b4(SummarizedPrivilegesId summarizedPrivilegesId) {
        UserPrivilege userPrivilegeM210113w4 = CoreModule.f17545c.f19555C0.m210113w4(summarizedPrivilegesId);
        return userPrivilegeM210113w4 != null && userPrivilegeM210113w4.content.expiredTime > 0;
    }

    /* JADX INFO: renamed from: c4 */
    public static boolean m210067c4(UserPrivilege userPrivilege) {
        return userPrivilege != null && userPrivilege.content.expiredTime > 0;
    }

    /* JADX INFO: renamed from: d4 */
    public static boolean m210069d4() {
        return m210054S3(SummarizedPrivilegesId.get("roaming"));
    }

    /* JADX INFO: renamed from: e4 */
    public static boolean m210071e4() {
        return m210054S3(SummarizedPrivilegesId.get("svip"));
    }

    /* JADX INFO: renamed from: f4 */
    public static boolean m210073f4() {
        return m210065b4(SummarizedPrivilegesId.get("svip"));
    }

    /* JADX INFO: renamed from: g4 */
    public static boolean m210075g4() {
        return m210065b4(SummarizedPrivilegesId.get("svipPicksMembership"));
    }

    /* JADX INFO: renamed from: h4 */
    public static boolean m210077h4() {
        return m210054S3(SummarizedPrivilegesId.get("seeWhoLikedMe"));
    }

    /* JADX INFO: renamed from: i4 */
    public static boolean m210079i4() {
        return m210054S3(SummarizedPrivilegesId.get("superLikeMembership"));
    }

    /* JADX INFO: renamed from: j4 */
    public static boolean m210081j4() {
        return m210054S3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.ultraPremium));
    }

    /* JADX INFO: renamed from: k3 */
    public static int m210082k3() {
        UserPrivilege userPrivilegeM210113w4 = CoreModule.f17545c.f19555C0.m210113w4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.aiChatAnalysis));
        if (NullChecker.m81303a(userPrivilegeM210113w4) && NullChecker.m81304b(userPrivilegeM210113w4.content)) {
            return userPrivilegeM210113w4.content.remaining;
        }
        return 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m210083k4() {
        return m210065b4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.ultraPremium));
    }

    /* JADX INFO: renamed from: l3 */
    public static int m210084l3() {
        UserPrivilege userPrivilegeM210113w4 = CoreModule.f17545c.f19555C0.m210113w4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.aiChatAdvice));
        if (NullChecker.m81303a(userPrivilegeM210113w4) && NullChecker.m81304b(userPrivilegeM210113w4.content)) {
            return userPrivilegeM210113w4.content.remaining;
        }
        return 0;
    }

    /* JADX INFO: renamed from: l4 */
    public static boolean m210085l4() {
        return m210054S3(SummarizedPrivilegesId.get("undoMembership"));
    }

    /* JADX INFO: renamed from: m3 */
    public static int m210086m3() {
        UserPrivilege userPrivilegeM210113w4 = CoreModule.f17545c.f19555C0.m210113w4(SummarizedPrivilegesId.get("compliment"));
        if (NullChecker.m81303a(userPrivilegeM210113w4)) {
            return userPrivilegeM210113w4.content.remaining;
        }
        return 0;
    }

    /* JADX INFO: renamed from: m4 */
    public static boolean m210087m4() {
        return m210054S3(SummarizedPrivilegesId.get("vip"));
    }

    /* JADX INFO: renamed from: o3 */
    public static int m210088o3() {
        UserPrivilege userPrivilegeM210113w4 = CoreModule.f17545c.f19555C0.m210113w4(SummarizedPrivilegesId.get("acceleratePairing"));
        if (NullChecker.m81303a(userPrivilegeM210113w4)) {
            return userPrivilegeM210113w4.content.remaining;
        }
        return 0;
    }

    /* JADX INFO: renamed from: p3 */
    public static int m210089p3() {
        UserPrivilege userPrivilegeM210113w4 = CoreModule.f17545c.f19555C0.m210113w4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.suggestTopShow));
        if (NullChecker.m81303a(userPrivilegeM210113w4)) {
            return userPrivilegeM210113w4.content.remaining;
        }
        return 0;
    }

    /* JADX INFO: renamed from: q3 */
    public static long m210090q3() {
        return m210094v3(SummarizedPrivilegesId.get("femaleVip"));
    }

    /* JADX INFO: renamed from: r3 */
    public static int m210091r3() {
        return RemoteConfig.m79298x().m79336z("intl_premium_compliment_count", 3);
    }

    /* JADX INFO: renamed from: s3 */
    public static long m210092s3() {
        return m210094v3(SummarizedPrivilegesId.get("limitedTrialSee"));
    }

    /* JADX INFO: renamed from: t3 */
    public static int m210093t3() {
        int i;
        UserPrivilege userPrivilegeM210113w4 = CoreModule.f17545c.f19555C0.m210113w4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.preConfession));
        if (!NullChecker.m81303a(userPrivilegeM210113w4) || (i = userPrivilegeM210113w4.content.refreshMaxRemaining) <= 0) {
            return 3;
        }
        return i;
    }

    /* JADX INFO: renamed from: v3 */
    public static long m210094v3(SummarizedPrivilegesId summarizedPrivilegesId) {
        UserPrivilege userPrivilegeM210113w4 = CoreModule.f17545c.f19555C0.m210113w4(summarizedPrivilegesId);
        if (userPrivilegeM210113w4 == null) {
            return 0L;
        }
        return userPrivilegeM210113w4.content.expiredTime;
    }

    /* JADX INFO: renamed from: v4 */
    public static int m210095v4() {
        UserPrivilege userPrivilegeM210113w4 = CoreModule.f17545c.f19555C0.m210113w4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.pinChat));
        if (userPrivilegeM210113w4 == null) {
            return 0;
        }
        return userPrivilegeM210113w4.content.remaining;
    }

    /* JADX INFO: renamed from: w3 */
    public static long m210096w3(SummarizedPrivilegesId summarizedPrivilegesId) {
        UserPrivilege userPrivilegeM210113w4 = CoreModule.f17545c.f19555C0.m210113w4(summarizedPrivilegesId);
        if (userPrivilegeM210113w4 == null) {
            return 0L;
        }
        return userPrivilegeM210113w4.content.expiredTime;
    }

    /* JADX INFO: renamed from: y3 */
    public static boolean m210097y3() {
        return !m210054S3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.advancedSearch));
    }

    /* JADX INFO: renamed from: y4 */
    public static boolean m210098y4() {
        if (!m210081j4()) {
            return true;
        }
        if (m210071e4()) {
            return CoreModule.f17545c.f19672p0.m173363k3();
        }
        return false;
    }

    /* JADX INFO: renamed from: z3 */
    public static boolean m210099z3() {
        UserPrivilege userPrivilegeM210113w4 = CoreModule.f17545c.f19555C0.m210113w4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.aiChatCompanion));
        return NullChecker.m81303a(userPrivilegeM210113w4) && userPrivilegeM210113w4.content.remaining > 0;
    }

    /* JADX INFO: renamed from: z4 */
    public static int m210100z4() {
        UserPrivilege userPrivilegeM210113w4 = CoreModule.f17545c.f19555C0.m210113w4(SummarizedPrivilegesId.get("letter"));
        if (NullChecker.m81303a(userPrivilegeM210113w4)) {
            return userPrivilegeM210113w4.content.remaining;
        }
        return 0;
    }

    /* JADX INFO: renamed from: J3 */
    public boolean m210101J3() {
        return (m210054S3(SummarizedPrivilegesId.get("intlReadMessage")) && m210071e4() && !ura.m195053e().m195057d().mo33924t9()) ? false : true;
    }

    /* JADX INFO: renamed from: K3 */
    public boolean m210102K3() {
        return !m210054S3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.revokeUnPair));
    }

    /* JADX INFO: renamed from: n3 */
    public void m210103n3() {
        final List<UserPrivilege> listM221515e = this.f193540R.m221515e();
        if (listM221515e != null) {
            UserPrivilege userPrivilege = (UserPrivilege) vwb.m200346r(listM221515e, new w9j() { // from class: l.vma
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((UserPrivilege) obj).f56011id.equals("letter"));
                }
            });
            if (NullChecker.m81304b(userPrivilege)) {
                userPrivilege.content.remaining--;
                e51.m114742G(new Runnable() { // from class: l.wma
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f187055a.m210104n4(listM221515e);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m210104n4(List list) {
        this.f193540R.onNext(list);
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ Boolean m210105o4(UserPrivilege userPrivilege) {
        if (userPrivilege == null) {
            m210112u4();
        }
        return Boolean.valueOf(userPrivilege != null);
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ List m210106p4(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        if (NullChecker.m81304b(coreData) && NullChecker.m81304b(coreData.summarizedPrivileges)) {
            return coreData.summarizedPrivileges;
        }
        return null;
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ List m210107q4(List list) {
        this.f193540R.onNext(list);
        if (ura.m195053e().m195057d().mo33822f() && ura.m195053e().m195057d().mo33900pb() != m210043F3()) {
            this.f72126Q.f19576J0.m139269V3();
            ura.m195053e().m195057d().mo33945xd(m210043F3());
            return list;
        }
        if (ura.m195053e().m195057d().mo33766Vd() && ura.m195053e().m195057d().mo33696Hf() != m210040C3()) {
            this.f72126Q.f19576J0.m139269V3();
            ura.m195053e().m195057d().mo33863jq(m210040C3());
        }
        return list;
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ C22306c m210108r4(final String str) {
        return new la20(new v9j() { // from class: l.qma
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(str).m185883b();
            }
        }).map(new w9j() { // from class: l.rma
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f160076a.m210106p4((Envelope) obj);
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.sma
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f165335a.m210107q4((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ roj0 m210109s4(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ C22306c m210110t4(final String str) {
        return ia20.m135121e(new v9j() { // from class: l.tma
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(str).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.uma
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f177210a.m210109s4((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public C22306c<UserPrivilege> m210111u3(SummarizedPrivilegesId summarizedPrivilegesId) {
        return CoreModule.f17553k.f91947j.uiGet(summarizedPrivilegesId.toString()).filter(new w9j() { // from class: l.pma
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f150201a.m210105o4((UserPrivilege) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u4 */
    public C22306c<List<UserPrivilege>> m210112u4() {
        final String strM31213J0 = CoreModule.m29932K().mo30835xf() ? C4728a.m31213J0("/summarized-privileges?with=diamond") : C4728a.m31213J0("/summarized-privileges");
        return this.f72126Q.scheduled("privileges_pkg", 0, new v9j() { // from class: l.oma
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f144591a.m210108r4(strM31213J0);
            }
        });
    }

    /* JADX INFO: renamed from: w4 */
    public UserPrivilege m210113w4(SummarizedPrivilegesId summarizedPrivilegesId) {
        return e51.m114739D() ? (UserPrivilege) CoreModule.f17553k.f91947j.queryCache(summarizedPrivilegesId.toString()) : (UserPrivilege) CoreModule.f17553k.f91947j.query(summarizedPrivilegesId.toString());
    }

    /* JADX INFO: renamed from: x3 */
    public C22306c<List<UserPrivilege>> m210114x3() {
        return this.f193540R;
    }

    /* JADX INFO: renamed from: x4 */
    public C22306c<roj0> m210115x4() {
        final String strM31213J0 = CoreModule.m29932K().mo30835xf() ? C4728a.m31213J0("/summarized-privileges?with=diamond") : C4728a.m31213J0("/summarized-privileges");
        return this.f72126Q.scheduled("refreshPrivileges", 0, new v9j() { // from class: l.nma
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f139617a.m210110t4(strM31213J0);
            }
        });
    }

    public xma(C4732c c4732c) {
        super(c4732c);
        this.f193540R = C22392a.m221512b();
    }
}
