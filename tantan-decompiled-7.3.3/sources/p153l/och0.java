package p153l;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatPartners;
import com.p051p1.mobile.putong.core.data.SurpriseGift;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class och0 {

    /* JADX INFO: renamed from: l.och0$a */
    public class C19099a implements y20<SurpriseGift> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jch0 f146707a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f146708b;

        public C19099a(jch0 jch0Var, Act act) {
            this.f146707a = jch0Var;
            this.f146708b = act;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void call(final SurpriseGift surpriseGift) {
            if (surpriseGift == null) {
                return;
            }
            jch0 jch0Var = this.f146707a;
            if (jch0Var == null || !jch0Var.isShowing()) {
                och0.m167216b(this.f146708b, surpriseGift);
                return;
            }
            jch0 jch0Var2 = this.f146707a;
            final Act act = this.f146708b;
            jch0Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.mch0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    och0.m167216b(act, surpriseGift);
                }
            });
            jch0 jch0Var3 = this.f146707a;
            final Act act2 = this.f146708b;
            jch0Var3.m144362H(new x20() { // from class: l.nch0
                @Override // p153l.x20
                public final void call() {
                    och0.m167216b(act2, surpriseGift);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.och0$b */
    public class C19100b implements y20<Throwable> {
        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            CoreModule.f18264c.f20401k2.f118666Y.clear();
            r1j0.m179420g("网络异常");
        }
    }

    /* JADX INFO: renamed from: l.och0$c */
    public class C19101c implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f146709a;

        public C19101c(Act act) {
            this.f146709a = act;
        }

        @Override // p153l.x20
        public void call() {
            if (TextUtils.isEmpty(CoreModule.f18264c.f20401k2.f118667Z.get())) {
                return;
            }
            Act act = this.f146709a;
            if (act instanceof NewMainAct) {
                och0.m167220f((NewMainAct) act);
            }
        }
    }

    /* JADX INFO: renamed from: l.och0$d */
    public class DialogInterfaceOnCancelListenerC19102d implements DialogInterface.OnCancelListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f146710a;

        public DialogInterfaceOnCancelListenerC19102d(Act act) {
            this.f146710a = act;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (TextUtils.isEmpty(CoreModule.f18264c.f20401k2.f118667Z.get())) {
                return;
            }
            Act act = this.f146710a;
            if (act instanceof NewMainAct) {
                och0.m167220f((NewMainAct) act);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m167215a() {
        CoreModule.f18264c.f20401k2.f118667Z.clear();
        CoreModule.f18264c.f20401k2.f118666Y.clear();
        CoreModule.f18264c.f20401k2.f118668a0.put(Boolean.FALSE);
        CoreModule.f18264c.f20401k2.f118669b0.clear();
        CoreModule.f18264c.f20384f0.m33579Af();
    }

    /* JADX INFO: renamed from: b */
    public static void m167216b(Act act, SurpriseGift surpriseGift) {
        if (surpriseGift == null) {
            return;
        }
        if (TextUtils.equals(surpriseGift.surpriseGiftType, "matchUser")) {
            CoreModule.f18264c.f20401k2.f118667Z.put("matchUser");
            m167219e(act, 0, surpriseGift.matchUserId);
            return;
        }
        if (TextUtils.equals(surpriseGift.surpriseGiftType, "greetingUser")) {
            CoreModule.f18264c.f20401k2.f118667Z.put("greetingUser");
            m167219e(act, 1, surpriseGift.matchUserId);
            return;
        }
        if (TextUtils.equals(surpriseGift.surpriseGiftType, "cardExposure")) {
            CoreModule.f18264c.f20401k2.f118666Y.clear();
            m167219e(act, 3, null);
        } else if (TextUtils.equals(surpriseGift.surpriseGiftType, "boost")) {
            m167219e(act, 2, null);
            CoreModule.f18264c.f20401k2.f118666Y.clear();
            CoreModule.f18264c.f20318J0.m156781V3();
        } else if (TextUtils.equals(surpriseGift.surpriseGiftType, "chatPartners")) {
            CoreModule.f18264c.f20401k2.f118667Z.put("chatPartners");
            m167221g(act, surpriseGift.chatPartners);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m167217c(Act act, jch0 jch0Var) {
        act.duringCreated(CoreModule.f18264c.f20401k2.m143765p3()).subscribe(psd0.m173597H(new C19099a(jch0Var, act), new C19100b()));
    }

    /* JADX INFO: renamed from: d */
    public static void m167218d() {
        if (TextUtils.isEmpty(CoreModule.f18264c.f20401k2.f118667Z.get())) {
            return;
        }
        CoreModule.f18264c.f20401k2.f118667Z.clear();
        CoreModule.f18264c.f20401k2.f118666Y.clear();
        CoreModule.f18264c.f20401k2.f118668a0.put(Boolean.FALSE);
        CoreModule.f18264c.f20401k2.f118669b0.clear();
        CoreModule.f18264c.f20384f0.m33579Af();
        CoreModule.f18264c.f20401k2.m143766q3();
    }

    /* JADX INFO: renamed from: e */
    public static void m167219e(Act act, int i, String str) {
        ybh0.C21557b c21557b = new ybh0.C21557b();
        c21557b.m215072a(i);
        if (!TextUtils.isEmpty(str)) {
            User userById = CoreModule.m30930K().getUserById(str);
            if (NullChecker.m82486a(userById)) {
                CoreModule.f18264c.f20401k2.f118669b0.put(userById.m61308fp().profile180().formatted());
            }
            c21557b.m215073b(CoreModule.m30930K().getUserById(str));
        }
        c21557b.m215074c(act);
    }

    /* JADX INFO: renamed from: f */
    public static void m167220f(NewMainAct newMainAct) {
        if (CoreModule.f18264c.f20401k2.f118668a0.get().booleanValue()) {
            return;
        }
        newMainAct.m40810d6().m40967B0();
        CoreModule.f18264c.f20401k2.f118668a0.put(Boolean.TRUE);
        CoreModule.f18264c.f20384f0.m34040lq(pzi0.m174454o());
    }

    /* JADX INFO: renamed from: g */
    public static void m167221g(Act act, ChatPartners chatPartners) {
        y2g0 y2g0Var = new y2g0(act);
        y2g0Var.m214075W(chatPartners);
        y2g0Var.m214074V(new C19101c(act));
        y2g0Var.setOnCancelListener(new DialogInterfaceOnCancelListenerC19102d(act));
    }
}
