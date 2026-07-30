package p153l;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationSubChannel;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.LocalPlaceBan;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes12.dex */
public class fcp {

    /* JADX INFO: renamed from: f */
    public static C22507a<Boolean> f98240f = C22507a.m222758b();

    /* JADX INFO: renamed from: g */
    public static boolean f98241g = false;

    /* JADX INFO: renamed from: h */
    public static jxd0 f98242h = new jxd0("see_letter_cover_home_guide_shown", Boolean.FALSE);

    /* JADX INFO: renamed from: a */
    public String f98243a;

    /* JADX INFO: renamed from: b */
    public gcg0 f98244b;

    /* JADX INFO: renamed from: c */
    public mxd0 f98245c;

    /* JADX INFO: renamed from: d */
    public C22507a<uxj0> f98246d;

    /* JADX INFO: renamed from: e */
    public double f98247e;

    /* JADX INFO: renamed from: l.fcp$a */
    public static class C16949a {
        private static final fcp INSTANCE = new fcp();
    }

    public fcp() {
        this.f98243a = "";
        this.f98246d = C22507a.m222759c(uxj0.f181467a);
        this.f98247e = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ vg60 m125018b(vg60 vg60Var, uxj0 uxj0Var) {
        return vg60Var;
    }

    /* JADX INFO: renamed from: g */
    public static void m125021g(Conversation conversation) {
        CoreModule.f18264c.f20384f0.m33812Tf(conversation.otherUser);
    }

    /* JADX INFO: renamed from: i */
    public static fcp m125022i() {
        return C16949a.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m125023j() {
        return joa.m146355E3() || a5i0.m96096G();
    }

    /* JADX INFO: renamed from: k */
    public static boolean m125024k(Conversation conversation) {
        if (NullChecker.m82486a(conversation)) {
            return TextUtils.equals(conversation.f56859id, User.LOCAL_ID_INTL_SEE_LETTER);
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m125025l(Conversation conversation) {
        if (NullChecker.m82486a(conversation) && NullChecker.m82486a(conversation.additional) && NullChecker.m82486a(conversation.additional.oneSide)) {
            return TEnum.equals(conversation.additional.oneSide.subChannel, ConversationSubChannel.intlSvipLetterC);
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m125026m(Conversation conversation) {
        return NullChecker.m82486a(conversation) && m125025l(conversation) && !TextUtils.equals(conversation.additional.oneSide.initiator, CoreModule.m30929H().userId());
    }

    /* JADX INFO: renamed from: n */
    public static boolean m125027n(String str) {
        return m125026m(CoreModule.f18264c.f20384f0.m33859Xe(str));
    }

    /* JADX INFO: renamed from: o */
    public static boolean m125028o(Conversation conversation) {
        return m125025l(conversation) && TextUtils.equals(conversation.convType, "oneSide");
    }

    /* JADX INFO: renamed from: p */
    public static boolean m125029p(String str) {
        return m125028o(CoreModule.f18264c.f20384f0.m33859Xe(str));
    }

    /* JADX INFO: renamed from: t */
    public static void m125030t(Act act, String str, x20 x20Var) {
        if (joa.m146355E3()) {
            x20Var.call();
            return;
        }
        if (rbb0.m180736i() <= 0) {
            CoreModule.m30933P().m143405a().mo34625wr(act, str, Privilege.see_letter_gp);
        } else if (a5i0.m96096G()) {
            x20Var.call();
        } else {
            a5i0.m96169s1(act, str);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m125031w(Envelope envelope) {
        if (!d79.m114685j0() || jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).conversations)) {
            return;
        }
        for (Conversation conversation : ((CoreData) envelope.getModuleData(CoreData.class)).conversations) {
            if (!m125025l(conversation) || !TextUtils.equals(conversation.convType, "oneSide")) {
                conversation.localPlaceBan = LocalPlaceBan.get("none");
            } else if (TextUtils.equals(conversation.additional.oneSide.initiator, CoreModule.m30929H().userId())) {
                conversation.localPlaceBan = LocalPlaceBan.get(LocalPlaceBan.matchList);
            } else {
                conversation.localPlaceBan = LocalPlaceBan.get("both");
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public static String m125032x() {
        return c17.m107528u0() ? "https://auto.tancdn.com/v1/images/eyJpZCI6Ik9HUlRRNlhDUlpQSlo3WUNZNDc1WFhGTURJRE00VzA2IiwidyI6MTMyNCwiaCI6MTE2MCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjQyNTIyOTAyNTU5MDkxMTg3NzN9.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ik9LREtLVUk2U1FYSjZaRFkzVlhGSDVOMlI0UkRRWTA2IiwidyI6MTMyNCwiaCI6MTE2MCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjQyNTIzMDMxMjM0Mjc5NjM2ODl9.png";
    }

    /* JADX INFO: renamed from: y */
    public static boolean m125033y() {
        boolean zM125034z = m125034z();
        f98240f.m137019l(Boolean.valueOf(zM125034z));
        return zM125034z;
    }

    /* JADX INFO: renamed from: z */
    public static boolean m125034z() {
        if (!IntlCountryCodeController.m29125v() && d79.m114685j0()) {
            if (rbb0.m180736i() > 0) {
                return true;
            }
            User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
            if (NullChecker.m82486a(userM116593na) && (tzi0.m193670h(pzi0.m174454o(), (long) userM116593na.createdTime, 1) || nmp.m163837f() || f98241g)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: A */
    public void m125035A(String str) {
        this.f98243a = str;
    }

    /* JADX INFO: renamed from: e */
    public void m125036e() {
        gcg0 gcg0VarM139434a = icg0.m139434a();
        this.f98244b = gcg0VarM139434a;
        gcg0VarM139434a.m129866b(psd0.m173625r(CoreModule.f18264c.f20384f0.m33589Ap(), this.f98246d, new rcj() { // from class: l.bcp
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return fcp.m125018b((vg60) obj, (uxj0) obj2);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.ccp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f80980a.m125041s((vg60) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: f */
    public void m125037f() {
        if (!NullChecker.m82486a(this.f98245c)) {
            this.f98245c = new mxd0("lastClickSetItemTimestamp_" + CoreModule.m30929H().userId(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        }
        this.f98245c.put(Double.valueOf(this.f98247e));
        this.f98246d.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: h */
    public String m125038h() {
        return this.f98243a;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m125039q(vg60 vg60Var) {
        if (!d79.m114685j0()) {
            CoreModule.f18264c.f20384f0.m33631Ef(User.LOCAL_ID_INTL_SEE_LETTER);
            return;
        }
        Conversation conversation = (Conversation) jyb.m147475F(vg60Var.f184001a);
        if (!NullChecker.m82486a(conversation)) {
            CoreModule.f18264c.f20384f0.m33631Ef(User.LOCAL_ID_INTL_SEE_LETTER);
            return;
        }
        f98241g = true;
        Boolean boolM222761e = f98240f.m222761e();
        if (boolM222761e == null || boolM222761e == Boolean.FALSE) {
            m125033y();
        }
        Conversation conversationMo225055clone = conversation.mo225055clone();
        conversationMo225055clone.f56859id = User.LOCAL_ID_INTL_SEE_LETTER;
        conversationMo225055clone.localPlaceBan = LocalPlaceBan.get("none");
        conversationMo225055clone.convType = "conversation_type_see_letter";
        this.f98247e = conversationMo225055clone.latestTime;
        conversationMo225055clone.unreadMessages = CoreModule.f18264c.f20384f0.m34090po();
        CoreModule.f18264c.f20384f0.m34053mq(conversationMo225055clone);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m125040r(final vg60 vg60Var) {
        CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.ecp
            @Override // p153l.x20
            public final void call() {
                this.f93092a.m125039q(vg60Var);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m125041s(final vg60 vg60Var) {
        l51.m152919y(new Runnable() { // from class: l.dcp
            @Override // java.lang.Runnable
            public final void run() {
                this.f87803a.m125040r(vg60Var);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public void m125042u() {
        this.f98243a = "";
    }

    /* JADX INFO: renamed from: v */
    public void m125043v() {
        if (NullChecker.m82486a(this.f98244b)) {
            this.f98244b.unsubscribe();
        }
        this.f98244b = icg0.m139434a();
        f98241g = false;
        this.f98245c = null;
    }
}
