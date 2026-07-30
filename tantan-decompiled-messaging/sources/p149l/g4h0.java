package p149l;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatPartners;
import com.p046p1.mobile.putong.core.data.SurpriseGift;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class g4h0 {

    /* JADX INFO: renamed from: l.g4h0$a */
    public class C16993a implements e30<SurpriseGift> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b4h0 f100567a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f100568b;

        public C16993a(b4h0 b4h0Var, Act act) {
            this.f100567a = b4h0Var;
            this.f100568b = act;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void call(final SurpriseGift surpriseGift) {
            if (surpriseGift == null) {
                return;
            }
            b4h0 b4h0Var = this.f100567a;
            if (b4h0Var == null || !b4h0Var.isShowing()) {
                g4h0.m124370b(this.f100568b, surpriseGift);
                return;
            }
            b4h0 b4h0Var2 = this.f100567a;
            final Act act = this.f100568b;
            b4h0Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.e4h0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    g4h0.m124370b(act, surpriseGift);
                }
            });
            b4h0 b4h0Var3 = this.f100567a;
            final Act act2 = this.f100568b;
            b4h0Var3.m100257H(new d30() { // from class: l.f4h0
                @Override // p149l.d30
                public final void call() {
                    g4h0.m124370b(act2, surpriseGift);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.g4h0$b */
    public class C16994b implements e30<Throwable> {
        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            CoreModule.f17545c.f19659k2.f184663Y.clear();
            osi0.m165783g("网络异常");
        }
    }

    /* JADX INFO: renamed from: l.g4h0$c */
    public class C16995c implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f100569a;

        public C16995c(Act act) {
            this.f100569a = act;
        }

        @Override // p149l.d30
        public void call() {
            if (TextUtils.isEmpty(CoreModule.f17545c.f19659k2.f184664Z.get())) {
                return;
            }
            Act act = this.f100569a;
            if (act instanceof NewMainAct) {
                g4h0.m124374f((NewMainAct) act);
            }
        }
    }

    /* JADX INFO: renamed from: l.g4h0$d */
    public class DialogInterfaceOnCancelListenerC16996d implements DialogInterface.OnCancelListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f100570a;

        public DialogInterfaceOnCancelListenerC16996d(Act act) {
            this.f100570a = act;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (TextUtils.isEmpty(CoreModule.f17545c.f19659k2.f184664Z.get())) {
                return;
            }
            Act act = this.f100570a;
            if (act instanceof NewMainAct) {
                g4h0.m124374f((NewMainAct) act);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m124369a() {
        CoreModule.f17545c.f19659k2.f184664Z.clear();
        CoreModule.f17545c.f19659k2.f184663Y.clear();
        CoreModule.f17545c.f19659k2.f184665a0.put(Boolean.FALSE);
        CoreModule.f17545c.f19659k2.f184666b0.clear();
        CoreModule.f17545c.f19642f0.m32576Af();
    }

    /* JADX INFO: renamed from: b */
    public static void m124370b(Act act, SurpriseGift surpriseGift) {
        if (surpriseGift == null) {
            return;
        }
        if (TextUtils.equals(surpriseGift.surpriseGiftType, "matchUser")) {
            CoreModule.f17545c.f19659k2.f184664Z.put("matchUser");
            m124373e(act, 0, surpriseGift.matchUserId);
            return;
        }
        if (TextUtils.equals(surpriseGift.surpriseGiftType, "greetingUser")) {
            CoreModule.f17545c.f19659k2.f184664Z.put("greetingUser");
            m124373e(act, 1, surpriseGift.matchUserId);
            return;
        }
        if (TextUtils.equals(surpriseGift.surpriseGiftType, "cardExposure")) {
            CoreModule.f17545c.f19659k2.f184663Y.clear();
            m124373e(act, 3, null);
        } else if (TextUtils.equals(surpriseGift.surpriseGiftType, "boost")) {
            m124373e(act, 2, null);
            CoreModule.f17545c.f19659k2.f184663Y.clear();
            CoreModule.f17545c.f19576J0.m139269V3();
        } else if (TextUtils.equals(surpriseGift.surpriseGiftType, "chatPartners")) {
            CoreModule.f17545c.f19659k2.f184664Z.put("chatPartners");
            m124375g(act, surpriseGift.chatPartners);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m124371c(Act act, b4h0 b4h0Var) {
        act.duringCreated(CoreModule.f17545c.f19659k2.m201614p3()).subscribe(mkd0.m154956H(new C16993a(b4h0Var, act), new C16994b()));
    }

    /* JADX INFO: renamed from: d */
    public static void m124372d() {
        if (TextUtils.isEmpty(CoreModule.f17545c.f19659k2.f184664Z.get())) {
            return;
        }
        CoreModule.f17545c.f19659k2.f184664Z.clear();
        CoreModule.f17545c.f19659k2.f184663Y.clear();
        CoreModule.f17545c.f19659k2.f184665a0.put(Boolean.FALSE);
        CoreModule.f17545c.f19659k2.f184666b0.clear();
        CoreModule.f17545c.f19642f0.m32576Af();
        CoreModule.f17545c.f19659k2.m201615q3();
    }

    /* JADX INFO: renamed from: e */
    public static void m124373e(Act act, int i, String str) {
        q3h0.C19423b c19423b = new q3h0.C19423b();
        c19423b.m172864a(i);
        if (!TextUtils.isEmpty(str)) {
            User userById = CoreModule.m29932K().getUserById(str);
            if (NullChecker.m81303a(userById)) {
                CoreModule.f17545c.f19659k2.f184666b0.put(userById.m60124fp().profile180().formatted());
            }
            c19423b.m172865b(CoreModule.m29932K().getUserById(str));
        }
        c19423b.m172866c(act);
    }

    /* JADX INFO: renamed from: f */
    public static void m124374f(NewMainAct newMainAct) {
        if (CoreModule.f17545c.f19659k2.f184665a0.get().booleanValue()) {
            return;
        }
        newMainAct.m39801Z5().m39960B0();
        CoreModule.f17545c.f19659k2.f184665a0.put(Boolean.TRUE);
        CoreModule.f17545c.f19642f0.m33037lq(mqi0.m155944o());
    }

    /* JADX INFO: renamed from: g */
    public static void m124375g(Act act, ChatPartners chatPartners) {
        puf0 puf0Var = new puf0(act);
        puf0Var.m171426W(chatPartners);
        puf0Var.m171425V(new C16995c(act));
        puf0Var.setOnCancelListener(new DialogInterfaceOnCancelListenerC16996d(act));
    }
}
