package p009l;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.newui.home.justreal.JustRealHeadLayout;
import com.p000p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleLayoutOptNew;
import com.p000p1.mobile.putong.core.newui.home.justreal.JustRealSuccessLayout;
import com.p000p1.mobile.putong.core.newui.home.justreal.JustRealTransAvatarLayout;
import com.p000p1.mobile.putong.core.newui.home.opt.view.ProfileCardStackOpt;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.pushbubble.SimplePushBubble;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreJustVerificationCardApi;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.AdvancedSettings;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseDialogConfigTriggerShowType;
import com.p1.mobile.putong.core.data.PurchaseDialogConfigs;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.ui.poplevel.CorePopLevel;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.core.ui.verification.VerificationCenterAct;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collection;
import java.util.List;
import l.cwf0;
import l.d30;
import l.dd80;
import l.e30;
import l.e51;
import l.eqh0;
import l.f6c0;
import l.hdb0;
import l.j760;
import l.ke7;
import l.lsi0;
import l.mkd0;
import l.ogl0;
import l.osi0;
import l.roj0;
import l.rwk0;
import l.s4e;
import l.t100;
import l.tpd0;
import l.tvf;
import l.u4c0;
import l.upa;
import l.vwb;
import l.w0c0;
import l.w9j;
import l.x2c0;
import l.xdl0;
import l.xma;
import l.zb90;
import l.zvf0;
import v.VButton;
import v.VFrame;
import v.VIcon;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class psq {

    /* JADX INFO: renamed from: a */
    public static Runnable f18888a = new RunnableC1122a();

    /* JADX INFO: renamed from: l.psq$a */
    public class RunnableC1122a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            CoreModule.c.m0.S8();
        }
    }

    /* JADX INFO: renamed from: l.psq$b */
    public class C1123b implements e30<CoreJustVerificationCardApi.JustRealStatus> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VIcon f18889a;

        public C1123b(VIcon vIcon) {
            this.f18889a = vIcon;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(CoreJustVerificationCardApi.JustRealStatus justRealStatus) {
            CoreJustVerificationCardApi.JustRealStatus justRealStatusJ3 = CoreModule.c.z2.j3();
            if (justRealStatusJ3 == CoreJustVerificationCardApi.JustRealStatus.RUNNING || justRealStatusJ3 == CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING) {
                this.f18889a.setImageResource(x2c0.cd);
            } else {
                this.f18889a.setImageResource(x2c0.bd);
            }
        }
    }

    /* JADX INFO: renamed from: l.psq$c */
    public class DialogInterfaceOnDismissListenerC1124c implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f18890a;

        public DialogInterfaceOnDismissListenerC1124c(cwf0 cwf0Var) {
            this.f18890a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.m16064e(this.f18890a);
        }
    }

    /* JADX INFO: renamed from: l.psq$d */
    public class ViewOnClickListenerC1125d implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f18891a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ dd80 f18892b;

        public ViewOnClickListenerC1125d(Act act, dd80 dd80Var) {
            this.f18891a = act;
            this.f18892b = dd80Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.x0(this.f18891a, "p_home,verification_card", Privilege.advanced_filter);
            zvf0.r("e_only_show_verified_buy_svip", "p_only_show_verified_ask_popup");
            this.f18892b.dismiss();
        }
    }

    /* JADX INFO: renamed from: l.psq$e */
    public class DialogInterfaceOnDismissListenerC1126e implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f18893a;

        public DialogInterfaceOnDismissListenerC1126e(cwf0 cwf0Var) {
            this.f18893a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.m16064e(this.f18893a);
        }
    }

    /* JADX INFO: renamed from: l.psq$f */
    public class C1127f extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ yk5 f18894a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f18895b;

        public C1127f(yk5 yk5Var, Act act) {
            this.f18894a = yk5Var;
            this.f18895b = act;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            this.f18894a.show();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(this.f18895b.getResources().getColor(w0c0.I));
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: l.psq$h */
    public class RunnableC1129h implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dd80 f18896a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f18897b;

        public RunnableC1129h(dd80 dd80Var, Act act) {
            this.f18896a = dd80Var;
            this.f18897b = act;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18896a.dismiss();
            zvf0.r("e_verify_add_likes_buy_vip", "p_verify_to_like_more_popup");
            if (!ogl0.m()) {
                c.J1(this.f18897b, "p_home,verification_card", Privilege.vip_unlimited_likes);
                return;
            }
            PurchaseDialogConfigs purchaseDialogConfigsI4 = CoreModule.c.j0.I4();
            PurchaseDialogConfigTriggerShowType purchaseDialogConfigTriggerShowType = PurchaseDialogConfigTriggerShowType.get("unknown_");
            if (NullChecker.a(purchaseDialogConfigsI4) && NullChecker.a(purchaseDialogConfigsI4.sceneTriggerDialog)) {
                purchaseDialogConfigTriggerShowType = purchaseDialogConfigsI4.sceneTriggerDialog.swipeLimit.showType;
            }
            if (TEnum.equals(purchaseDialogConfigTriggerShowType, "svip")) {
                CoreModule.P().a().pr(this.f18897b, "p_home,verification_card", Privilege.vip_unlimited_likes);
            } else {
                c.J1(this.f18897b, "p_home,verification_card", Privilege.vip_unlimited_likes);
            }
        }
    }

    /* JADX INFO: renamed from: l.psq$i */
    public class DialogInterfaceOnDismissListenerC1130i implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f18898a;

        public DialogInterfaceOnDismissListenerC1130i(cwf0 cwf0Var) {
            this.f18898a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.m16064e(this.f18898a);
        }
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m20631B(Act act, dd80 dd80Var) {
        if (!rwk0.m(act, 1, "verification_center")) {
            tvf.h(act, "verification_center");
        }
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ Boolean m20632C(VerificationCenter verificationCenter) {
        return (NullChecker.a(verificationCenter) && NullChecker.a(verificationCenter.picVerificationInfo) && TEnum.equals(verificationCenter.picVerificationInfo.status, "verified")) ? Boolean.TRUE : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m20633D(Act act, dd80 dd80Var) {
        if (ke7.s()) {
            return;
        }
        zvf0.r("e_do_verification", "p_verify_to_like_more_popup");
        if (upa.e()) {
            wn90.m24369w0(act);
        } else {
            act.startActivity(VerificationCenterAct.Y1(act, false, "button"));
        }
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m20634E(dd80 dd80Var, Act act, View view) {
        zvf0.r("e_start_see_verified_trial", "p_inform_trial_popup");
        dd80Var.dismiss();
        m20645P(act, false);
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ Boolean m20636G(VerificationCenter verificationCenter) {
        return (NullChecker.a(verificationCenter) && NullChecker.a(verificationCenter.picVerificationInfo) && TEnum.equals(verificationCenter.picVerificationInfo.status, "verified")) ? Boolean.TRUE : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: H */
    public static void m20637H(boolean z) {
        if (z && CoreModule.c.z2.j3() == CoreJustVerificationCardApi.JustRealStatus.TRIALING) {
            CoreModule.c.z2.z3(CoreJustVerificationCardApi.JustRealStatus.PRE_START);
        }
    }

    /* JADX INFO: renamed from: I */
    public static boolean m20638I() {
        return upa.c3() && va40.m23335f() >= 2;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m20639J(qsl qslVar) {
        return upa.c3() && va40.m23335f() >= 2 && qslVar.mo15091e().getVisibility() == 0;
    }

    /* JADX INFO: renamed from: K */
    public static boolean m20640K() {
        return !xma.e4() || CoreModule.c.e0.na().isPicVerificationVerified();
    }

    /* JADX INFO: renamed from: L */
    public static String m20641L() {
        if (!xma.X3()) {
            return "diamond_valid";
        }
        if (!xma.e4()) {
            return "svip_valid";
        }
        if (zb90.i()) {
            return "vip_valid";
        }
        if (xma.Y3()) {
            return "diamond_invalid";
        }
        if (xma.f4()) {
            return "svip_invalid";
        }
        return (zb90.i() || !CoreModule.c.e0.p9().isVIPUsed()) ? "no_membership" : "vip_invalid";
    }

    /* JADX INFO: renamed from: M */
    public static void m20642M(Act act, VFrame vFrame, qsl qslVar, ProfileCardStackOpt profileCardStackOpt) {
        final JustRealHeadLayout justRealHeadLayout = (JustRealHeadLayout) LayoutInflater.from(act).inflate((ogl0.A() || ogl0.B()) ? f6c0.i6 : f6c0.h6, (ViewGroup) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = t100.d(54.0f);
        int iD = t100.d(8.0f);
        layoutParams.rightMargin = iD;
        layoutParams.leftMargin = iD;
        vFrame.addView(justRealHeadLayout, 0, layoutParams);
        if (ogl0.A() || ogl0.B()) {
            ((JustRealHomeTitleLayoutOptNew) qslVar.mo15087a().inflate()).m2682o(act);
        } else {
            ((itl) qslVar.mo15100n().inflate()).mo2658a(act);
        }
        View frameLayout = new FrameLayout(act);
        frameLayout.setVisibility(8);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(t100.d(60.0f), t100.d(50.0f));
        layoutParams2.topMargin = t100.d(54.0f);
        layoutParams2.rightMargin = t100.d(20.0f);
        layoutParams2.gravity = 5;
        vFrame.addView(frameLayout, layoutParams2);
        justRealHeadLayout.m2651h(act, frameLayout);
        JustRealTransAvatarLayout justRealTransAvatarLayout = new JustRealTransAvatarLayout(act);
        vFrame.addView(justRealTransAvatarLayout, new FrameLayout.LayoutParams(-1, -1));
        justRealTransAvatarLayout.m2712f(act);
        act.duringCreated(CoreModule.c.z2.F3()).subscribe(mkd0.G(new e30() { // from class: l.nrq
            public final void call(Object obj) {
                psq.m20670o(justRealHeadLayout, (CoreJustVerificationCardApi.JustRealStatus) obj);
            }
        }));
        act.duringCreated(profileCardStackOpt.m2799D()).subscribe(mkd0.G(new e30() { // from class: l.orq
            public final void call(Object obj) {
                psq.m20675t(justRealHeadLayout, (roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public static void m20643N(Act act, qsl qslVar) {
        VIcon vIconMo15090d = qslVar.mo15090d();
        CoreJustVerificationCardApi.JustRealStatus justRealStatusJ3 = CoreModule.c.z2.j3();
        xdl0.M(vIconMo15090d, true);
        if (justRealStatusJ3 == CoreJustVerificationCardApi.JustRealStatus.RUNNING || justRealStatusJ3 == CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING) {
            vIconMo15090d.setImageResource(x2c0.cd);
        } else {
            vIconMo15090d.setImageResource(x2c0.bd);
        }
        act.duringCreated(CoreModule.c.z2.F3()).subscribe(mkd0.G(new C1123b(vIconMo15090d)));
    }

    /* JADX INFO: renamed from: O */
    public static boolean m20644O() {
        VerificationCenter verificationCenterK4 = CoreModule.c.B0.k4();
        return TEnum.equals(NullChecker.a(verificationCenterK4) ? verificationCenterK4.picVerificationInfo.status : null, "pending");
    }

    /* JADX INFO: renamed from: P */
    public static void m20645P(Act act, boolean z) {
        if (m20640K()) {
            if (CoreModule.c.z2.q3()) {
                return;
            }
            CoreModule.c.z2.v3();
            m20655Z(CoreModule.c.z2.j3().status, z);
            CoreJustVerificationCardApi.JustRealStatus justRealStatusJ3 = CoreModule.c.z2.j3();
            CoreJustVerificationCardApi.JustRealStatus justRealStatus = CoreJustVerificationCardApi.JustRealStatus.IDLE;
            if (justRealStatusJ3 == justRealStatus || CoreModule.c.z2.j3() == CoreJustVerificationCardApi.JustRealStatus.FINISH) {
                CoreModule.c.z2.z3(CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING);
                return;
            } else {
                CoreModule.c.z2.z3(justRealStatus);
                return;
            }
        }
        CoreJustVerificationCardApi.JustRealStatus justRealStatusJ4 = CoreModule.c.z2.j3();
        CoreJustVerificationCardApi.JustRealStatus justRealStatus2 = CoreJustVerificationCardApi.JustRealStatus.IDLE;
        if (justRealStatusJ4 != justRealStatus2 && CoreModule.c.z2.j3() != CoreJustVerificationCardApi.JustRealStatus.FINISH) {
            m20655Z(CoreModule.c.z2.j3().status, z);
            boolean z2 = CoreModule.c.z2.j3() == CoreJustVerificationCardApi.JustRealStatus.TRIALING;
            CoreModule.c.z2.z3(justRealStatus2);
            act.removeCallbacks(f18888a);
            act.postDelayed(f18888a, z2 ? 300L : 0L);
            return;
        }
        if (m20644O()) {
            lsi0.y("认证审核中，审核通过后可设置只看认证用户");
            m20655Z("waiting", z);
            return;
        }
        m20655Z(CoreModule.c.z2.j3().status, z);
        if (!((Boolean) CoreModule.c.z2.d0.get()).booleanValue()) {
            m20650U(act);
        } else if (CoreModule.c.z2.n3() <= 0) {
            m20649T(act);
        } else {
            CoreModule.c.z2.z3(CoreJustVerificationCardApi.JustRealStatus.PRE_START);
            CoreModule.c.m0.S8();
        }
    }

    /* JADX INFO: renamed from: Q */
    public static void m20646Q(Act act, boolean z) {
        if (m20640K()) {
            if (CoreModule.c.z2.q3()) {
                return;
            }
            CoreModule.c.z2.v3();
            m20655Z(CoreModule.c.z2.j3().status, z);
            CoreJustVerificationCardApi.JustRealStatus justRealStatusJ3 = CoreModule.c.z2.j3();
            CoreJustVerificationCardApi.JustRealStatus justRealStatus = CoreJustVerificationCardApi.JustRealStatus.IDLE;
            if (justRealStatusJ3 == justRealStatus || CoreModule.c.z2.j3() == CoreJustVerificationCardApi.JustRealStatus.FINISH) {
                CoreModule.c.z2.z3(CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING);
                return;
            } else {
                CoreModule.c.z2.z3(justRealStatus);
                return;
            }
        }
        CoreJustVerificationCardApi.JustRealStatus justRealStatusJ4 = CoreModule.c.z2.j3();
        CoreJustVerificationCardApi.JustRealStatus justRealStatus2 = CoreJustVerificationCardApi.JustRealStatus.IDLE;
        if (justRealStatusJ4 != justRealStatus2 && CoreModule.c.z2.j3() != CoreJustVerificationCardApi.JustRealStatus.FINISH) {
            m20655Z(CoreModule.c.z2.j3().status, z);
            CoreModule.c.z2.z3(justRealStatus2);
        } else if (m20644O()) {
            lsi0.y("认证审核中，审核通过后可设置只看认证用户");
            m20655Z("waiting", z);
        } else {
            m20655Z(CoreModule.c.z2.j3().status, z);
            m20649T(act);
        }
    }

    /* JADX INFO: renamed from: R */
    public static void m20647R(User user, int i, int i2, float f, float f2, float f3, float f4, float f5) {
        double d = (i / 2) - f;
        double d2 = ((float) (((double) (f5 / 180.0f)) * 3.141592653589793d)) * 1.0f;
        double d3 = (i2 / 2) - f2;
        CoreModule.c.z2.B3(user, (((int) (((Math.cos(d2) * d) - (Math.sin(d2) * d3)) + ((double) f))) - t100.d(30.0f)) + f3, (((int) (((d * Math.sin(d2)) + (Math.cos(d2) * d3)) + ((double) f2))) - t100.d(30.0f)) + f4);
    }

    /* JADX INFO: renamed from: S */
    public static void m20648S(final Act act, VText vText, final dd80 dd80Var) {
        final yk5 yk5Var = new yk5(act, 1);
        yk5Var.m25443D(new View.OnClickListener() { // from class: l.gsq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                psq.m20677v(act, dd80Var, yk5Var, view);
            }
        });
        String string = act.getResources().getString(R.string.B6);
        String string2 = act.getResources().getString(R.string.t5);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) i0g0.m16129b0(string2, vwb.M(string), act.getResources().getColor(w0c0.I), eqh0.c(3)));
        spannableStringBuilder.setSpan(new C1127f(yk5Var, act), string2.indexOf(string), string2.indexOf(string) + string.length(), 33);
        vText.setText(spannableStringBuilder);
        vText.setMovementMethod(LinkMovementMethod.getInstance());
        vText.setHighlightColor(act.getResources().getColor(w0c0.U1));
    }

    /* JADX INFO: renamed from: T */
    public static void m20649T(final Act act) {
        View viewInflate = o7r.m19649a(act).inflate(f6c0.y8, (ViewGroup) null);
        VText vTextFindViewById = viewInflate.findViewById(u4c0.sb);
        VButton vButtonFindViewById = viewInflate.findViewById(u4c0.ta);
        VButton vButtonFindViewById2 = viewInflate.findViewById(u4c0.sa);
        TextView textView = (TextView) viewInflate.findViewById(u4c0.ra);
        textView.setTypeface(Typeface.defaultFromStyle(1));
        ImageView imageView = (ImageView) viewInflate.findViewById(u4c0.D6);
        VImage vImageFindViewById = viewInflate.findViewById(u4c0.A1);
        if (upa.c3()) {
            imageView.setImageResource(CoreModule.c.e0.na().isFemale() ? x2c0.j2 : x2c0.g2);
        } else if (upa.z()) {
            vButtonFindViewById.setBackgroundResource(x2c0.Q);
            imageView.setImageResource(CoreModule.c.e0.na().isFemale() ? x2c0.ah : x2c0.Zg);
        } else {
            imageView.setImageResource(CoreModule.c.e0.na().isFemale() ? x2c0.i2 : x2c0.f2);
        }
        final CheckBox checkBox = (CheckBox) viewInflate.findViewById(u4c0.f1);
        cwf0 cwf0VarM16062c = i0e.m16062c("p_only_show_verified_ask_popup", s4e.class.getName());
        i0e.m16065f(cwf0VarM16062c);
        final dd80 dd80VarR0 = new dd80.a(act).R(viewInflate).P(false).M(false).r0();
        if (upa.c3()) {
            xdl0.M(vButtonFindViewById2, true);
            xdl0.M(vImageFindViewById, true);
            xdl0.M(textView, false);
            xdl0.E0(vButtonFindViewById2, new ViewOnClickListenerC1125d(act, dd80VarR0));
            zvf0.x("e_only_show_verified_buy_svip", "p_only_show_verified_ask_popup");
            xdl0.E0(vImageFindViewById, new View.OnClickListener() { // from class: l.krq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dd80VarR0.dismiss();
                }
            });
        }
        dd80VarR0.setOnDismissListener(new DialogInterfaceOnDismissListenerC1126e(cwf0VarM16062c));
        m20648S(act, vTextFindViewById, dd80VarR0);
        xdl0.E0(vButtonFindViewById, new View.OnClickListener() { // from class: l.lrq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                psq.m20663h(checkBox, act, dd80VarR0, view);
            }
        });
        xdl0.E0(textView, new View.OnClickListener() { // from class: l.mrq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                psq.m20659d(dd80VarR0, act, view);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public static void m20650U(final Act act) {
        CoreModule.c.z2.d0.put(Boolean.TRUE);
        cwf0 cwf0VarM16062c = i0e.m16062c("p_inform_trial_popup", s4e.class.getName());
        i0e.m16065f(cwf0VarM16062c);
        View viewInflate = o7r.m19649a(act).inflate(f6c0.x8, (ViewGroup) null);
        VText vTextFindViewById = viewInflate.findViewById(u4c0.va);
        VButton vButtonFindViewById = viewInflate.findViewById(u4c0.ta);
        ImageView imageView = (ImageView) viewInflate.findViewById(u4c0.D6);
        if (upa.z()) {
            vButtonFindViewById.setBackgroundResource(x2c0.Q);
        }
        imageView.setImageResource(CoreModule.c.e0.na().isFemale() ? x2c0.h2 : x2c0.e2);
        TextView textView = (TextView) viewInflate.findViewById(u4c0.ra);
        textView.setTypeface(Typeface.defaultFromStyle(1));
        vTextFindViewById.setTypeface(Typeface.defaultFromStyle(1));
        vButtonFindViewById.setTypeface(Typeface.defaultFromStyle(1));
        final dd80 dd80VarR0 = new dd80.a(act).R(viewInflate).P(false).M(false).r0();
        xdl0.E0(vButtonFindViewById, new View.OnClickListener() { // from class: l.irq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                psq.m20634E(dd80VarR0, act, view);
            }
        });
        xdl0.E0(textView, new View.OnClickListener() { // from class: l.jrq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dd80VarR0.dismiss();
            }
        });
        dd80VarR0.setOnDismissListener(new DialogInterfaceOnDismissListenerC1124c(cwf0VarM16062c));
    }

    /* JADX INFO: renamed from: V */
    public static void m20651V(Act act) {
        List<User> listI3 = CoreModule.c.z2.i3();
        if (vwb.J(listI3)) {
            return;
        }
        JustRealSuccessLayout justRealSuccessLayout = (JustRealSuccessLayout) LayoutInflater.from(act).inflate(f6c0.f6, (ViewGroup) null);
        justRealSuccessLayout.m2705b(listI3);
        hdb0.c().i(new SimplePushBubble.a(act, justRealSuccessLayout).B(2).y(new RelativeLayout.LayoutParams(-2, t100.d(60.0f))).w(7000).z(CorePopLevel.JUST_REAL_SUCCESS).F(new C1128g()).s());
    }

    /* JADX INFO: renamed from: W */
    public static void m20652W(final Act act) {
        final dd80 dd80VarR0;
        cwf0 cwf0VarM16062c = i0e.m16062c("p_verify_to_like_more_popup", s4e.class.getName());
        i0e.m16065f(cwf0VarM16062c);
        dd80.a aVarM = new dd80.a(act).S(upa.z() ? x2c0.Yg : x2c0.d2).d0(upa.z() ? x2c0.Q : -1).P(false).M(false);
        String str = "审核中";
        if (upa.c3() || upa.e()) {
            int i = NullChecker.a(upa.b3()) ? upa.b3().verified_user_additional_like_count : 10;
            if (!ke7.s()) {
                str = xdl0.y0() < t100.d(375.0f) ? String.format("去认证，右滑+%s次", Integer.valueOf(i)) : String.format("去认证，每天右滑+%s次", Integer.valueOf(i));
            }
            dd80 dd80VarR1 = aVarM.y0("继续发出更多喜欢").t0(String.format("今天右滑数量已用完，完成真人认证或开通%s，每天发出更多喜欢", ogl0.m() ? "会员" : "VIP")).b0(str).p0(true).m0(new Runnable() { // from class: l.msq
                @Override // java.lang.Runnable
                public final void run() {
                    psq.m20658c(act);
                }
            }).j0(ogl0.m() ? "开通会员，无限右滑" : "开通VIP，每天无限右滑").r0();
            dd80VarR1.X(new RunnableC1129h(dd80VarR1, act));
            zvf0.x("e_verify_add_likes_buy_vip", "p_verify_to_like_more_popup");
            dd80VarR0 = dd80VarR1;
        } else {
            dd80VarR0 = aVarM.y0("认证后，继续发出更多喜欢").t0(String.format("今天右滑数量达到上限，完成真人认证后，每天能多发出%d次喜欢", Integer.valueOf(NullChecker.a(upa.a3()) ? upa.a3().verified_user_additional_like_count : 10))).b0(ke7.s() ? "审核中" : "去认证").W("取消").r0();
        }
        dd80VarR0.W(new Runnable() { // from class: l.nsq
            @Override // java.lang.Runnable
            public final void run() {
                psq.m20633D(act, dd80VarR0);
            }
        });
        dd80VarR0.setOnDismissListener(new DialogInterfaceOnDismissListenerC1130i(cwf0VarM16062c));
        dd80VarR0.V(new Runnable() { // from class: l.osq
            @Override // java.lang.Runnable
            public final void run() {
                dd80VarR0.dismiss();
            }
        });
        if ((upa.K1() || upa.c3()) && !ke7.s()) {
            tpd0 tpd0Var = CoreModule.c.e0.B5;
            tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
        }
    }

    /* JADX INFO: renamed from: X */
    public static void m20653X(final Act act) {
        if (CoreModule.c.z2.j3() == CoreJustVerificationCardApi.JustRealStatus.TRIALING) {
            CoreModule.c.z2.z3(CoreJustVerificationCardApi.JustRealStatus.PRE_START);
        }
        act.duringCreated(rx.c.combineLatest(CoreModule.c.C0.u3(SummarizedPrivilegesId.get("svip")).map(new w9j() { // from class: l.prq
            public final Object call(Object obj) {
                return Boolean.valueOf(!xma.T3((UserPrivilege) obj));
            }
        }).distinctUntilChanged().doOnNext(new e30() { // from class: l.qrq
            public final void call(Object obj) {
                CoreModule.c.F0.q3();
            }
        }), CoreModule.c.B0.j4().distinctUntilChanged().map(new w9j() { // from class: l.rrq
            public final Object call(Object obj) {
                return psq.m20665j((VerificationCenter) obj);
            }
        }), new trq()).distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.urq
            public final void call(Object obj) {
                psq.m20681z(act, (j760) obj);
            }
        }));
        act.duringCreated(CoreModule.c.z2.T).subscribe(mkd0.G(new e30() { // from class: l.vrq
            public final void call(Object obj) {
                e51.H(act, new Runnable() { // from class: l.fsq
                    @Override // java.lang.Runnable
                    public final void run() {
                        psq.m20674s();
                    }
                }, 800L);
            }
        }));
        act.duringCreated(CoreModule.c.F0.h3().map(new w9j() { // from class: l.wrq
            public final Object call(Object obj) {
                return ((AdvancedSettings) obj).realFace;
            }
        }).distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.xrq
            public final void call(Object obj) {
                psq.m20660e((Boolean) obj);
            }
        }));
        act.duringCreated(CoreModule.c.B0.j4().distinctUntilChanged().map(new w9j() { // from class: l.yrq
            public final Object call(Object obj) {
                return psq.m20636G((VerificationCenter) obj);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.zrq
            public final void call(Object obj) {
                psq.m20679x((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y */
    public static void m20654Y(Act act) {
        act.duringCreated(CoreModule.c.C0.u3(SummarizedPrivilegesId.get("svip")).map(new w9j() { // from class: l.hrq
            public final Object call(Object obj) {
                return Boolean.valueOf(!xma.T3((UserPrivilege) obj));
            }
        }).distinctUntilChanged()).subscribe(mkd0.H(new e30() { // from class: l.srq
            public final void call(Object obj) {
                CoreModule.c.F0.q3();
            }
        }, new e30() { // from class: l.dsq
            public final void call(Object obj) {
                psq.m20656a((Throwable) obj);
            }
        }));
        act.duringCreated(CoreModule.c.F0.h3().map(new w9j() { // from class: l.isq
            public final Object call(Object obj) {
                return ((AdvancedSettings) obj).realFace;
            }
        }).distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.jsq
            public final void call(Object obj) {
                psq.m20667l((Boolean) obj);
            }
        }));
        act.duringCreated(CoreModule.c.B0.j4().distinctUntilChanged().map(new w9j() { // from class: l.ksq
            public final Object call(Object obj) {
                return psq.m20632C((VerificationCenter) obj);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.lsq
            public final void call(Object obj) {
                psq.m20661f((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z */
    public static void m20655Z(String str, boolean z) {
        if (z) {
            zvf0.u("e_only_show_verified_user", "p_suggest_users_home_view", new j760[]{j760.a("function_status", str), j760.a("has_verified", CoreModule.c.e0.na().isPicVerificationVerified() ? "1" : "0"), j760.a("membership_status", m20641L())});
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m20656a(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m20658c(Act act) {
        if (upa.E2()) {
            act.duringCreated(CoreModule.c.B0.U3()).subscribe(mkd0.H(new e30() { // from class: l.asq
                public final void call(Object obj) {
                    psq.m20671p((j760) obj);
                }
            }, new e30() { // from class: l.bsq
                public final void call(Object obj) {
                    psq.m20664i((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m20659d(dd80 dd80Var, Act act, View view) {
        dd80Var.dismiss();
        if (upa.E2()) {
            act.duringCreated(CoreModule.c.B0.U3()).subscribe(mkd0.H(new e30() { // from class: l.csq
                public final void call(Object obj) {
                    psq.m20668m((j760) obj);
                }
            }, new e30() { // from class: l.esq
                public final void call(Object obj) {
                    psq.m20680y((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m20660e(Boolean bool) {
        if (!m20640K()) {
            if (CoreModule.c.z2.j3() == CoreJustVerificationCardApi.JustRealStatus.RUNNING || CoreModule.c.z2.j3() == CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING) {
                CoreModule.c.z2.z3(CoreJustVerificationCardApi.JustRealStatus.IDLE);
                CoreModule.c.m0.L5();
                return;
            }
            return;
        }
        CoreJustVerificationCardApi.JustRealStatus justRealStatusJ3 = CoreModule.c.z2.j3();
        CoreJustVerificationCardApi.JustRealStatus justRealStatus = CoreJustVerificationCardApi.JustRealStatus.RUNNING;
        boolean z = justRealStatusJ3 == justRealStatus || CoreModule.c.z2.j3() == CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING;
        if (!bool.booleanValue()) {
            CoreModule.c.z2.z3(CoreJustVerificationCardApi.JustRealStatus.IDLE);
        } else if (CoreModule.c.z2.j3() != CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING) {
            CoreModule.c.z2.z3(justRealStatus);
        }
        if (bool.booleanValue() ^ z) {
            CoreModule.c.m0.L5();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m20661f(Boolean bool) {
        if (bool.booleanValue() || !xma.e4()) {
            return;
        }
        if (CoreModule.c.z2.j3() == CoreJustVerificationCardApi.JustRealStatus.RUNNING || CoreModule.c.z2.j3() == CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING) {
            CoreModule.c.z2.v3();
            CoreModule.c.z2.z3(CoreJustVerificationCardApi.JustRealStatus.IDLE);
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m20663h(CheckBox checkBox, Act act, dd80 dd80Var, View view) {
        zvf0.r("e_do_verification", "p_only_show_verified_ask_popup");
        if (!checkBox.isChecked()) {
            osi0.g(act.getResources().getString(com.p1.mobile.putong.core.R.string.fs));
            return;
        }
        if (!rwk0.m(act, 1, "verification_center")) {
            tvf.h(act, "verification_center");
        }
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m20664i(Throwable th) {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Boolean m20665j(VerificationCenter verificationCenter) {
        return (NullChecker.a(verificationCenter) && NullChecker.a(verificationCenter.picVerificationInfo) && TEnum.equals(verificationCenter.picVerificationInfo.status, "verified")) ? Boolean.TRUE : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m20667l(Boolean bool) {
        if (!m20640K()) {
            if (CoreModule.c.z2.j3() == CoreJustVerificationCardApi.JustRealStatus.RUNNING || CoreModule.c.z2.j3() == CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING) {
                CoreModule.c.z2.z3(CoreJustVerificationCardApi.JustRealStatus.IDLE);
                CoreModule.c.m0.L5();
                return;
            }
            return;
        }
        CoreJustVerificationCardApi.JustRealStatus justRealStatusJ3 = CoreModule.c.z2.j3();
        CoreJustVerificationCardApi.JustRealStatus justRealStatus = CoreJustVerificationCardApi.JustRealStatus.RUNNING;
        boolean z = justRealStatusJ3 == justRealStatus || CoreModule.c.z2.j3() == CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING;
        if (!bool.booleanValue()) {
            CoreModule.c.z2.z3(CoreJustVerificationCardApi.JustRealStatus.IDLE);
        } else if (CoreModule.c.z2.j3() != CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING) {
            CoreModule.c.z2.z3(justRealStatus);
        }
        if (bool.booleanValue() ^ z) {
            CoreModule.c.m0.L5();
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m20668m(j760 j760Var) {
        if (((Integer) j760Var.b).intValue() <= 0 || vwb.J((Collection) j760Var.a)) {
            return;
        }
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.QuestionOfNotVerify;
        userInfo.id = "VirtualCard";
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.c.m0.w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m20670o(JustRealHeadLayout justRealHeadLayout, CoreJustVerificationCardApi.JustRealStatus justRealStatus) {
        if (NullChecker.a(justRealHeadLayout)) {
            if (justRealStatus == CoreJustVerificationCardApi.JustRealStatus.TRIALING) {
                justRealHeadLayout.m2650g(true, true);
            } else {
                justRealHeadLayout.m2650g(false, justRealStatus != CoreJustVerificationCardApi.JustRealStatus.PRE_START);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m20671p(j760 j760Var) {
        if (((Integer) j760Var.b).intValue() <= 0 || vwb.J((Collection) j760Var.a)) {
            return;
        }
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.QuestionOfNotVerify;
        userInfo.id = "VirtualCard";
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.c.m0.w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m20674s() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.FemaleVerificationGuideCard;
        userInfo.id = "VirtualCard";
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.c.m0.w6(userInfo, 0);
        zvf0.x("e_trial_end_card", "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m20675t(JustRealHeadLayout justRealHeadLayout, roj0 roj0Var) {
        if (NullChecker.a(justRealHeadLayout) && !CoreModule.c.m0.G6() && CoreModule.c.z2.j3() == CoreJustVerificationCardApi.JustRealStatus.PRE_START) {
            if (!vwb.J(CoreModule.c.z2.l3()) || ogl0.A() || ogl0.B()) {
                CoreModule.c.z2.z3(CoreJustVerificationCardApi.JustRealStatus.TRIALING);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m20677v(final Act act, final dd80 dd80Var, yk5 yk5Var, View view) {
        if (NullChecker.a(act)) {
            e51.H(act, new Runnable() { // from class: l.hsq
                @Override // java.lang.Runnable
                public final void run() {
                    psq.m20631B(act, dd80Var);
                }
            }, 200L);
        }
        yk5Var.dismiss();
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m20679x(Boolean bool) {
        if (bool.booleanValue() || m20640K()) {
            return;
        }
        if (CoreModule.c.z2.j3() == CoreJustVerificationCardApi.JustRealStatus.RUNNING || CoreModule.c.z2.j3() == CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING) {
            CoreModule.c.z2.z3(CoreJustVerificationCardApi.JustRealStatus.IDLE);
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m20680y(Throwable th) {
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m20681z(Act act, j760 j760Var) {
        if (((Boolean) j760Var.a).booleanValue() || ((Boolean) j760Var.b).booleanValue()) {
            CoreModule.c.z2.w3();
            if (!((Boolean) j760Var.b).booleanValue()) {
                CoreModule.c.z2.i3();
                CoreModule.c.z2.h3();
                return;
            }
            boolean zR3 = CoreModule.c.z2.r3();
            boolean z = CoreModule.c.z2.j3() == CoreJustVerificationCardApi.JustRealStatus.TRIALING;
            m20651V(act);
            CoreModule.c.z2.h3();
            if (zR3) {
                if (z) {
                    act.postDelayed(f18888a, z ? 300L : 0L);
                } else {
                    CoreModule.c.m0.S8();
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.psq$g */
    public class C1128g implements d30 {
        public void call() {
        }
    }
}
