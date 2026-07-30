package p006l;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.ChatPartners;
import com.p1.mobile.putong.core.data.SurpriseGift;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.b4h0;
import l.d30;
import l.e30;
import l.mkd0;
import l.mqi0;
import l.osi0;
import l.q3h0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class g4h0 {

    /* JADX INFO: renamed from: l.g4h0$a */
    public class C0744a implements e30<SurpriseGift> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b4h0 f13054a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f13055b;

        public C0744a(b4h0 b4h0Var, Act act) {
            this.f13054a = b4h0Var;
            this.f13055b = act;
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void call(final SurpriseGift surpriseGift) {
            if (surpriseGift == null) {
                return;
            }
            b4h0 b4h0Var = this.f13054a;
            if (b4h0Var == null || !b4h0Var.isShowing()) {
                g4h0.m15567b(this.f13055b, surpriseGift);
                return;
            }
            b4h0 b4h0Var2 = this.f13054a;
            final Act act = this.f13055b;
            b4h0Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.e4h0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    g4h0.m15567b(act, surpriseGift);
                }
            });
            b4h0 b4h0Var3 = this.f13054a;
            final Act act2 = this.f13055b;
            b4h0Var3.H(new d30() { // from class: l.f4h0
                public final void call() {
                    g4h0.m15567b(act2, surpriseGift);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.g4h0$b */
    public class C0745b implements e30<Throwable> {
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            CoreModule.f1534c.f3648k2.f24989Y.clear();
            osi0.g("网络异常");
        }
    }

    /* JADX INFO: renamed from: l.g4h0$c */
    public class C0746c implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f13056a;

        public C0746c(Act act) {
            this.f13056a = act;
        }

        public void call() {
            if (TextUtils.isEmpty((CharSequence) CoreModule.f1534c.f3648k2.f24990Z.get())) {
                return;
            }
            NewMainAct newMainAct = this.f13056a;
            if (newMainAct instanceof NewMainAct) {
                g4h0.m15571f(newMainAct);
            }
        }
    }

    /* JADX INFO: renamed from: l.g4h0$d */
    public class DialogInterfaceOnCancelListenerC0747d implements DialogInterface.OnCancelListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f13057a;

        public DialogInterfaceOnCancelListenerC0747d(Act act) {
            this.f13057a = act;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (TextUtils.isEmpty((CharSequence) CoreModule.f1534c.f3648k2.f24990Z.get())) {
                return;
            }
            NewMainAct newMainAct = this.f13057a;
            if (newMainAct instanceof NewMainAct) {
                g4h0.m15571f(newMainAct);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m15566a() {
        CoreModule.f1534c.f3648k2.f24990Z.clear();
        CoreModule.f1534c.f3648k2.f24989Y.clear();
        CoreModule.f1534c.f3648k2.f24991a0.put(Boolean.FALSE);
        CoreModule.f1534c.f3648k2.f24992b0.clear();
        CoreModule.f1534c.f3631f0.m4506Af();
    }

    /* JADX INFO: renamed from: b */
    public static void m15567b(Act act, SurpriseGift surpriseGift) {
        if (surpriseGift == null) {
            return;
        }
        if (TextUtils.equals(surpriseGift.surpriseGiftType, "matchUser")) {
            CoreModule.f1534c.f3648k2.f24990Z.put("matchUser");
            m15570e(act, 0, surpriseGift.matchUserId);
            return;
        }
        if (TextUtils.equals(surpriseGift.surpriseGiftType, "greetingUser")) {
            CoreModule.f1534c.f3648k2.f24990Z.put("greetingUser");
            m15570e(act, 1, surpriseGift.matchUserId);
            return;
        }
        if (TextUtils.equals(surpriseGift.surpriseGiftType, "cardExposure")) {
            CoreModule.f1534c.f3648k2.f24989Y.clear();
            m15570e(act, 3, null);
        } else if (TextUtils.equals(surpriseGift.surpriseGiftType, "boost")) {
            m15570e(act, 2, null);
            CoreModule.f1534c.f3648k2.f24989Y.clear();
            CoreModule.f1534c.f3565J0.m17219V3();
        } else if (TextUtils.equals(surpriseGift.surpriseGiftType, "chatPartners")) {
            CoreModule.f1534c.f3648k2.f24990Z.put("chatPartners");
            m15572g(act, surpriseGift.chatPartners);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m15568c(Act act, b4h0 b4h0Var) {
        act.duringCreated(CoreModule.f1534c.f3648k2.m26222p3()).subscribe(mkd0.H(new C0744a(b4h0Var, act), new C0745b()));
    }

    /* JADX INFO: renamed from: d */
    public static void m15569d() {
        if (TextUtils.isEmpty((CharSequence) CoreModule.f1534c.f3648k2.f24990Z.get())) {
            return;
        }
        CoreModule.f1534c.f3648k2.f24990Z.clear();
        CoreModule.f1534c.f3648k2.f24989Y.clear();
        CoreModule.f1534c.f3648k2.f24991a0.put(Boolean.FALSE);
        CoreModule.f1534c.f3648k2.f24992b0.clear();
        CoreModule.f1534c.f3631f0.m4506Af();
        CoreModule.f1534c.f3648k2.m26223q3();
    }

    /* JADX INFO: renamed from: e */
    public static void m15570e(Act act, int i, String str) {
        q3h0.b bVar = new q3h0.b();
        bVar.a(i);
        if (!TextUtils.isEmpty(str)) {
            User userById = CoreModule.m1851K().getUserById(str);
            if (NullChecker.a(userById)) {
                CoreModule.f1534c.f3648k2.f24992b0.put(userById.fp().profile180().formatted());
            }
            bVar.b(CoreModule.m1851K().getUserById(str));
        }
        bVar.c(act);
    }

    /* JADX INFO: renamed from: f */
    public static void m15571f(NewMainAct newMainAct) {
        if (((Boolean) CoreModule.f1534c.f3648k2.f24991a0.get()).booleanValue()) {
            return;
        }
        newMainAct.Z5().B0();
        CoreModule.f1534c.f3648k2.f24991a0.put(Boolean.TRUE);
        CoreModule.f1534c.f3631f0.m4967lq(mqi0.o());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.app.Dialog, l.puf0] */
    /* JADX INFO: renamed from: g */
    public static void m15572g(Act act, ChatPartners chatPartners) {
        ?? puf0Var = new puf0(act);
        puf0Var.m21732W(chatPartners);
        puf0Var.m21731V(new C0746c(act));
        puf0Var.setOnCancelListener(new DialogInterfaceOnCancelListenerC0747d(act));
    }
}
