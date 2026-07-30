package p149l;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationSubChannel;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.LocalPlaceBan;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class fap {

    /* JADX INFO: renamed from: f */
    public static C22392a<Boolean> f96633f = C22392a.m221512b();

    /* JADX INFO: renamed from: g */
    public static boolean f96634g = false;

    /* JADX INFO: renamed from: h */
    public static hpd0 f96635h = new hpd0("see_letter_cover_home_guide_shown", Boolean.FALSE);

    /* JADX INFO: renamed from: a */
    public String f96636a;

    /* JADX INFO: renamed from: b */
    public z3g0 f96637b;

    /* JADX INFO: renamed from: c */
    public kpd0 f96638c;

    /* JADX INFO: renamed from: d */
    public C22392a<roj0> f96639d;

    /* JADX INFO: renamed from: e */
    public double f96640e;

    /* JADX INFO: renamed from: l.fap$a */
    public static class C16787a {
        private static final fap INSTANCE = new fap();
    }

    public fap() {
        this.f96636a = "";
        this.f96639d = C22392a.m221513c(roj0.f160388a);
        this.f96640e = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ q860 m120251b(q860 q860Var, roj0 roj0Var) {
        return q860Var;
    }

    /* JADX INFO: renamed from: g */
    public static void m120254g(Conversation conversation) {
        CoreModule.f17545c.f19642f0.m32809Tf(conversation.otherUser);
    }

    /* JADX INFO: renamed from: i */
    public static fap m120255i() {
        return C16787a.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m120256j() {
        return xma.m210041D3() || swh0.m186191G();
    }

    /* JADX INFO: renamed from: k */
    public static boolean m120257k(Conversation conversation) {
        if (NullChecker.m81303a(conversation)) {
            return TextUtils.equals(conversation.f56011id, User.LOCAL_ID_INTL_SEE_LETTER);
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m120258l(Conversation conversation) {
        if (NullChecker.m81303a(conversation) && NullChecker.m81303a(conversation.additional) && NullChecker.m81303a(conversation.additional.oneSide)) {
            return TEnum.equals(conversation.additional.oneSide.subChannel, ConversationSubChannel.intlSvipLetterC);
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m120259m(Conversation conversation) {
        return NullChecker.m81303a(conversation) && m120258l(conversation) && !TextUtils.equals(conversation.additional.oneSide.initiator, CoreModule.m29931H().userId());
    }

    /* JADX INFO: renamed from: n */
    public static boolean m120260n(String str) {
        return m120259m(CoreModule.f17545c.f19642f0.m32856Xe(str));
    }

    /* JADX INFO: renamed from: o */
    public static boolean m120261o(Conversation conversation) {
        return m120258l(conversation) && TextUtils.equals(conversation.convType, "oneSide");
    }

    /* JADX INFO: renamed from: p */
    public static boolean m120262p(String str) {
        return m120261o(CoreModule.f17545c.f19642f0.m32856Xe(str));
    }

    /* JADX INFO: renamed from: t */
    public static void m120263t(Act act, String str, d30 d30Var) {
        if (xma.m210041D3()) {
            d30Var.call();
            return;
        }
        if (n3b0.m157734i() <= 0) {
            CoreModule.m29935P().m94651a().mo33622wr(act, str, Privilege.see_letter_gp);
        } else if (swh0.m186191G()) {
            d30Var.call();
        } else {
            swh0.m186264s1(act, str);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m120264w(Envelope envelope) {
        if (!u59.m191827f0() || vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).conversations)) {
            return;
        }
        for (Conversation conversation : ((CoreData) envelope.getModuleData(CoreData.class)).conversations) {
            if (!m120258l(conversation) || !TextUtils.equals(conversation.convType, "oneSide")) {
                conversation.localPlaceBan = LocalPlaceBan.get("none");
            } else if (TextUtils.equals(conversation.additional.oneSide.initiator, CoreModule.m29931H().userId())) {
                conversation.localPlaceBan = LocalPlaceBan.get(LocalPlaceBan.matchList);
            } else {
                conversation.localPlaceBan = LocalPlaceBan.get("both");
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public static String m120265x() {
        return zz6.m221004u0() ? "https://auto.tancdn.com/v1/images/eyJpZCI6Ik9HUlRRNlhDUlpQSlo3WUNZNDc1WFhGTURJRE00VzA2IiwidyI6MTMyNCwiaCI6MTE2MCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjQyNTIyOTAyNTU5MDkxMTg3NzN9.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ik9LREtLVUk2U1FYSjZaRFkzVlhGSDVOMlI0UkRRWTA2IiwidyI6MTMyNCwiaCI6MTE2MCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjQyNTIzMDMxMjM0Mjc5NjM2ODl9.png";
    }

    /* JADX INFO: renamed from: y */
    public static boolean m120266y() {
        boolean zM120267z = m120267z();
        f96633f.m132487l(Boolean.valueOf(zM120267z));
        return zM120267z;
    }

    /* JADX INFO: renamed from: z */
    public static boolean m120267z() {
        if (!IntlCountryCodeController.m28126v() && u59.m191827f0()) {
            if (n3b0.m157734i() > 0) {
                return true;
            }
            User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
            if (NullChecker.m81303a(userM169520na) && (qqi0.m175940h(mqi0.m155944o(), (long) userM169520na.createdTime, 1) || nkp.m159987f() || f96634g)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: A */
    public void m120268A(String str) {
        this.f96636a = str;
    }

    /* JADX INFO: renamed from: e */
    public void m120269e() {
        z3g0 z3g0VarM94917a = a4g0.m94917a();
        this.f96637b = z3g0VarM94917a;
        z3g0VarM94917a.m217046b(mkd0.m154984r(CoreModule.f17545c.f19642f0.m32586Ap(), this.f96639d, new x9j() { // from class: l.bap
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return fap.m120251b((q860) obj, (roj0) obj2);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.cap
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80042a.m120274s((q860) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: f */
    public void m120270f() {
        if (!NullChecker.m81303a(this.f96638c)) {
            this.f96638c = new kpd0("lastClickSetItemTimestamp_" + CoreModule.m29931H().userId(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        }
        this.f96638c.put(Double.valueOf(this.f96640e));
        this.f96639d.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: h */
    public String m120271h() {
        return this.f96636a;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m120272q(q860 q860Var) {
        if (!u59.m191827f0()) {
            CoreModule.f17545c.f19642f0.m32628Ef(User.LOCAL_ID_INTL_SEE_LETTER);
            return;
        }
        Conversation conversation = (Conversation) vwb.m200292F(q860Var.f153135a);
        if (!NullChecker.m81303a(conversation)) {
            CoreModule.f17545c.f19642f0.m32628Ef(User.LOCAL_ID_INTL_SEE_LETTER);
            return;
        }
        f96634g = true;
        Boolean boolM221515e = f96633f.m221515e();
        if (boolM221515e == null || boolM221515e == Boolean.FALSE) {
            m120266y();
        }
        Conversation conversationMo223809clone = conversation.mo223809clone();
        conversationMo223809clone.f56011id = User.LOCAL_ID_INTL_SEE_LETTER;
        conversationMo223809clone.localPlaceBan = LocalPlaceBan.get("none");
        conversationMo223809clone.convType = "conversation_type_see_letter";
        this.f96640e = conversationMo223809clone.latestTime;
        conversationMo223809clone.unreadMessages = CoreModule.f17545c.f19642f0.m33087po();
        CoreModule.f17545c.f19642f0.m33050mq(conversationMo223809clone);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m120273r(final q860 q860Var) {
        CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.eap
            @Override // p149l.d30
            public final void call() {
                this.f90220a.m120272q(q860Var);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m120274s(final q860 q860Var) {
        e51.m114774y(new Runnable() { // from class: l.dap
            @Override // java.lang.Runnable
            public final void run() {
                this.f85251a.m120273r(q860Var);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public void m120275u() {
        this.f96636a = "";
    }

    /* JADX INFO: renamed from: v */
    public void m120276v() {
        if (NullChecker.m81303a(this.f96637b)) {
            this.f96637b.unsubscribe();
        }
        this.f96637b = a4g0.m94917a();
        f96634g = false;
        this.f96638c = null;
    }
}
