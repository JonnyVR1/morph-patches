package p149l;

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
import com.google.android.exoplayer2.PlaybackException;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.pushbubble.SimplePushBubble;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreJustVerificationCardApi;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.AdvancedSettings;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseDialogConfigTriggerShowType;
import com.p046p1.mobile.putong.core.data.PurchaseDialogConfigs;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.newui.home.justreal.JustRealHeadLayout;
import com.p046p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleLayoutOptNew;
import com.p046p1.mobile.putong.core.newui.home.justreal.JustRealSuccessLayout;
import com.p046p1.mobile.putong.core.newui.home.justreal.JustRealTransAvatarLayout;
import com.p046p1.mobile.putong.core.newui.home.opt.view.ProfileCardStackOpt;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.verification.VerificationCenterAct;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collection;
import java.util.List;
import p133rx.C22306c;
import p147v.VButton;
import p147v.VFrame;
import p147v.VIcon;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class psq {

    /* JADX INFO: renamed from: a */
    public static Runnable f151027a = new RunnableC19323a();

    /* JADX INFO: renamed from: l.psq$a */
    public class RunnableC19323a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            CoreModule.f17545c.f19663m0.m31050S8();
        }
    }

    /* JADX INFO: renamed from: l.psq$b */
    public class C19324b implements e30<CoreJustVerificationCardApi.JustRealStatus> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VIcon f151028a;

        public C19324b(VIcon vIcon) {
            this.f151028a = vIcon;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(CoreJustVerificationCardApi.JustRealStatus justRealStatus) {
            CoreJustVerificationCardApi.JustRealStatus justRealStatusM30247j3 = CoreModule.f17545c.f19704z2.m30247j3();
            if (justRealStatusM30247j3 == CoreJustVerificationCardApi.JustRealStatus.RUNNING || justRealStatusM30247j3 == CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING) {
                this.f151028a.setImageResource(x2c0.f190043cd);
            } else {
                this.f151028a.setImageResource(x2c0.f190011bd);
            }
        }
    }

    /* JADX INFO: renamed from: l.psq$c */
    public class DialogInterfaceOnDismissListenerC19325c implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f151029a;

        public DialogInterfaceOnDismissListenerC19325c(cwf0 cwf0Var) {
            this.f151029a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.m133796e(this.f151029a);
        }
    }

    /* JADX INFO: renamed from: l.psq$d */
    public class ViewOnClickListenerC19326d implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f151030a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ dd80 f151031b;

        public ViewOnClickListenerC19326d(Act act, dd80 dd80Var) {
            this.f151030a = act;
            this.f151031b = dd80Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C8764c.m53504x0(this.f151030a, "p_home,verification_card", Privilege.advanced_filter);
            zvf0.m220396r("e_only_show_verified_buy_svip", "p_only_show_verified_ask_popup");
            this.f151031b.dismiss();
        }
    }

    /* JADX INFO: renamed from: l.psq$e */
    public class DialogInterfaceOnDismissListenerC19327e implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f151032a;

        public DialogInterfaceOnDismissListenerC19327e(cwf0 cwf0Var) {
            this.f151032a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.m133796e(this.f151032a);
        }
    }

    /* JADX INFO: renamed from: l.psq$f */
    public class C19328f extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ yk5 f151033a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f151034b;

        public C19328f(yk5 yk5Var, Act act) {
            this.f151033a = yk5Var;
            this.f151034b = act;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            this.f151033a.show();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(this.f151034b.getResources().getColor(w0c0.f183773I));
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: l.psq$h */
    public class RunnableC19330h implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dd80 f151035a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f151036b;

        public RunnableC19330h(dd80 dd80Var, Act act) {
            this.f151035a = dd80Var;
            this.f151036b = act;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f151035a.dismiss();
            zvf0.m220396r("e_verify_add_likes_buy_vip", "p_verify_to_like_more_popup");
            if (!ogl0.m164260m()) {
                C8764c.m53403J1(this.f151036b, "p_home,verification_card", Privilege.vip_unlimited_likes);
                return;
            }
            PurchaseDialogConfigs purchaseDialogConfigsM30588I4 = CoreModule.f17545c.f19654j0.m30588I4();
            PurchaseDialogConfigTriggerShowType purchaseDialogConfigTriggerShowType = PurchaseDialogConfigTriggerShowType.get("unknown_");
            if (NullChecker.m81303a(purchaseDialogConfigsM30588I4) && NullChecker.m81303a(purchaseDialogConfigsM30588I4.sceneTriggerDialog)) {
                purchaseDialogConfigTriggerShowType = purchaseDialogConfigsM30588I4.sceneTriggerDialog.swipeLimit.showType;
            }
            if (TEnum.equals(purchaseDialogConfigTriggerShowType, "svip")) {
                CoreModule.m29935P().m94651a().mo33565pr(this.f151036b, "p_home,verification_card", Privilege.vip_unlimited_likes);
            } else {
                C8764c.m53403J1(this.f151036b, "p_home,verification_card", Privilege.vip_unlimited_likes);
            }
        }
    }

    /* JADX INFO: renamed from: l.psq$i */
    public class DialogInterfaceOnDismissListenerC19331i implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f151037a;

        public DialogInterfaceOnDismissListenerC19331i(cwf0 cwf0Var) {
            this.f151037a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.m133796e(this.f151037a);
        }
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m171186B(Act act, dd80 dd80Var) {
        if (!rwk0.m181430m(act, 1, "verification_center")) {
            tvf.m190730h(act, "verification_center");
        }
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ Boolean m171187C(VerificationCenter verificationCenter) {
        return (NullChecker.m81303a(verificationCenter) && NullChecker.m81303a(verificationCenter.picVerificationInfo) && TEnum.equals(verificationCenter.picVerificationInfo.status, "verified")) ? Boolean.TRUE : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m171188D(Act act, dd80 dd80Var) {
        if (ke7.m145734s()) {
            return;
        }
        zvf0.m220396r("e_do_verification", "p_verify_to_like_more_popup");
        if (upa.m194742e()) {
            wn90.m204632w0(act);
        } else {
            act.startActivity(VerificationCenterAct.m55992Y1(act, false, "button"));
        }
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m171189E(dd80 dd80Var, Act act, View view) {
        zvf0.m220396r("e_start_see_verified_trial", "p_inform_trial_popup");
        dd80Var.dismiss();
        m171200P(act, false);
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ Boolean m171191G(VerificationCenter verificationCenter) {
        return (NullChecker.m81303a(verificationCenter) && NullChecker.m81303a(verificationCenter.picVerificationInfo) && TEnum.equals(verificationCenter.picVerificationInfo.status, "verified")) ? Boolean.TRUE : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: H */
    public static void m171192H(boolean z) {
        if (z && CoreModule.f17545c.f19704z2.m30247j3() == CoreJustVerificationCardApi.JustRealStatus.TRIALING) {
            CoreModule.f17545c.f19704z2.m30263z3(CoreJustVerificationCardApi.JustRealStatus.PRE_START);
        }
    }

    /* JADX INFO: renamed from: I */
    public static boolean m171193I() {
        return upa.m194736c3() && va40.m197624f() >= 2;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m171194J(qsl qslVar) {
        return upa.m194736c3() && va40.m197624f() >= 2 && qslVar.mo126594e().getVisibility() == 0;
    }

    /* JADX INFO: renamed from: K */
    public static boolean m171195K() {
        return !xma.m210071e4() || CoreModule.f17545c.f19639e0.m169520na().isPicVerificationVerified();
    }

    /* JADX INFO: renamed from: L */
    public static String m171196L() {
        if (!xma.m210059X3()) {
            return "diamond_valid";
        }
        if (!xma.m210071e4()) {
            return "svip_valid";
        }
        if (zb90.m217832i()) {
            return "vip_valid";
        }
        if (xma.m210060Y3()) {
            return "diamond_invalid";
        }
        if (xma.m210073f4()) {
            return "svip_invalid";
        }
        return (zb90.m217832i() || !CoreModule.f17545c.f19639e0.m169527p9().isVIPUsed()) ? "no_membership" : "vip_invalid";
    }

    /* JADX INFO: renamed from: M */
    public static void m171197M(Act act, VFrame vFrame, qsl qslVar, ProfileCardStackOpt profileCardStackOpt) {
        final JustRealHeadLayout justRealHeadLayout = (JustRealHeadLayout) LayoutInflater.from(act).inflate((ogl0.m164222A() || ogl0.m164223B()) ? f6c0.f95825i6 : f6c0.f95808h6, (ViewGroup) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = t100.m186890d(54.0f);
        int iM186890d = t100.m186890d(8.0f);
        layoutParams.rightMargin = iM186890d;
        layoutParams.leftMargin = iM186890d;
        vFrame.addView(justRealHeadLayout, 0, layoutParams);
        if (ogl0.m164222A() || ogl0.m164223B()) {
            ((JustRealHomeTitleLayoutOptNew) qslVar.mo126590a().inflate()).m38696o(act);
        } else {
            ((itl) qslVar.mo126603n().inflate()).mo38672a(act);
        }
        View frameLayout = new FrameLayout(act);
        frameLayout.setVisibility(8);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(t100.m186890d(60.0f), t100.m186890d(50.0f));
        layoutParams2.topMargin = t100.m186890d(54.0f);
        layoutParams2.rightMargin = t100.m186890d(20.0f);
        layoutParams2.gravity = 5;
        vFrame.addView(frameLayout, layoutParams2);
        justRealHeadLayout.m38665h(act, frameLayout);
        JustRealTransAvatarLayout justRealTransAvatarLayout = new JustRealTransAvatarLayout(act);
        vFrame.addView(justRealTransAvatarLayout, new FrameLayout.LayoutParams(-1, -1));
        justRealTransAvatarLayout.m38726f(act);
        act.duringCreated(CoreModule.f17545c.f19704z2.m30239F3()).subscribe(mkd0.m154955G(new e30() { // from class: l.nrq
            @Override // p149l.e30
            public final void call(Object obj) {
                psq.m171225o(justRealHeadLayout, (CoreJustVerificationCardApi.JustRealStatus) obj);
            }
        }));
        act.duringCreated(profileCardStackOpt.m38803D()).subscribe(mkd0.m154955G(new e30() { // from class: l.orq
            @Override // p149l.e30
            public final void call(Object obj) {
                psq.m171230t(justRealHeadLayout, (roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public static void m171198N(Act act, qsl qslVar) {
        VIcon vIconMo126593d = qslVar.mo126593d();
        CoreJustVerificationCardApi.JustRealStatus justRealStatusM30247j3 = CoreModule.f17545c.f19704z2.m30247j3();
        xdl0.m208344M(vIconMo126593d, true);
        if (justRealStatusM30247j3 == CoreJustVerificationCardApi.JustRealStatus.RUNNING || justRealStatusM30247j3 == CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING) {
            vIconMo126593d.setImageResource(x2c0.f190043cd);
        } else {
            vIconMo126593d.setImageResource(x2c0.f190011bd);
        }
        act.duringCreated(CoreModule.f17545c.f19704z2.m30239F3()).subscribe(mkd0.m154955G(new C19324b(vIconMo126593d)));
    }

    /* JADX INFO: renamed from: O */
    public static boolean m171199O() {
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        return TEnum.equals(NullChecker.m81303a(verificationCenterM31612k4) ? verificationCenterM31612k4.picVerificationInfo.status : null, "pending");
    }

    /* JADX INFO: renamed from: P */
    public static void m171200P(Act act, boolean z) {
        if (m171195K()) {
            if (CoreModule.f17545c.f19704z2.m30254q3()) {
                return;
            }
            CoreModule.f17545c.f19704z2.m30259v3();
            m171210Z(CoreModule.f17545c.f19704z2.m30247j3().status, z);
            CoreJustVerificationCardApi.JustRealStatus justRealStatusM30247j3 = CoreModule.f17545c.f19704z2.m30247j3();
            CoreJustVerificationCardApi.JustRealStatus justRealStatus = CoreJustVerificationCardApi.JustRealStatus.IDLE;
            if (justRealStatusM30247j3 == justRealStatus || CoreModule.f17545c.f19704z2.m30247j3() == CoreJustVerificationCardApi.JustRealStatus.FINISH) {
                CoreModule.f17545c.f19704z2.m30263z3(CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING);
                return;
            } else {
                CoreModule.f17545c.f19704z2.m30263z3(justRealStatus);
                return;
            }
        }
        CoreJustVerificationCardApi.JustRealStatus justRealStatusM30247j4 = CoreModule.f17545c.f19704z2.m30247j3();
        CoreJustVerificationCardApi.JustRealStatus justRealStatus2 = CoreJustVerificationCardApi.JustRealStatus.IDLE;
        if (justRealStatusM30247j4 != justRealStatus2 && CoreModule.f17545c.f19704z2.m30247j3() != CoreJustVerificationCardApi.JustRealStatus.FINISH) {
            m171210Z(CoreModule.f17545c.f19704z2.m30247j3().status, z);
            boolean z2 = CoreModule.f17545c.f19704z2.m30247j3() == CoreJustVerificationCardApi.JustRealStatus.TRIALING;
            CoreModule.f17545c.f19704z2.m30263z3(justRealStatus2);
            act.removeCallbacks(f151027a);
            act.postDelayed(f151027a, z2 ? 300L : 0L);
            return;
        }
        if (m171199O()) {
            lsi0.m151595y("认证审核中，审核通过后可设置只看认证用户");
            m171210Z("waiting", z);
            return;
        }
        m171210Z(CoreModule.f17545c.f19704z2.m30247j3().status, z);
        if (!CoreModule.f17545c.f19704z2.f19225d0.get().booleanValue()) {
            m171205U(act);
        } else if (CoreModule.f17545c.f19704z2.m30251n3() <= 0) {
            m171204T(act);
        } else {
            CoreModule.f17545c.f19704z2.m30263z3(CoreJustVerificationCardApi.JustRealStatus.PRE_START);
            CoreModule.f17545c.f19663m0.m31050S8();
        }
    }

    /* JADX INFO: renamed from: Q */
    public static void m171201Q(Act act, boolean z) {
        if (m171195K()) {
            if (CoreModule.f17545c.f19704z2.m30254q3()) {
                return;
            }
            CoreModule.f17545c.f19704z2.m30259v3();
            m171210Z(CoreModule.f17545c.f19704z2.m30247j3().status, z);
            CoreJustVerificationCardApi.JustRealStatus justRealStatusM30247j3 = CoreModule.f17545c.f19704z2.m30247j3();
            CoreJustVerificationCardApi.JustRealStatus justRealStatus = CoreJustVerificationCardApi.JustRealStatus.IDLE;
            if (justRealStatusM30247j3 == justRealStatus || CoreModule.f17545c.f19704z2.m30247j3() == CoreJustVerificationCardApi.JustRealStatus.FINISH) {
                CoreModule.f17545c.f19704z2.m30263z3(CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING);
                return;
            } else {
                CoreModule.f17545c.f19704z2.m30263z3(justRealStatus);
                return;
            }
        }
        CoreJustVerificationCardApi.JustRealStatus justRealStatusM30247j4 = CoreModule.f17545c.f19704z2.m30247j3();
        CoreJustVerificationCardApi.JustRealStatus justRealStatus2 = CoreJustVerificationCardApi.JustRealStatus.IDLE;
        if (justRealStatusM30247j4 != justRealStatus2 && CoreModule.f17545c.f19704z2.m30247j3() != CoreJustVerificationCardApi.JustRealStatus.FINISH) {
            m171210Z(CoreModule.f17545c.f19704z2.m30247j3().status, z);
            CoreModule.f17545c.f19704z2.m30263z3(justRealStatus2);
        } else if (m171199O()) {
            lsi0.m151595y("认证审核中，审核通过后可设置只看认证用户");
            m171210Z("waiting", z);
        } else {
            m171210Z(CoreModule.f17545c.f19704z2.m30247j3().status, z);
            m171204T(act);
        }
    }

    /* JADX INFO: renamed from: R */
    public static void m171202R(User user, int i, int i2, float f, float f2, float f3, float f4, float f5) {
        double d = (i / 2) - f;
        double d2 = ((float) (((double) (f5 / 180.0f)) * 3.141592653589793d)) * 1.0f;
        double d3 = (i2 / 2) - f2;
        CoreModule.f17545c.f19704z2.m30235B3(user, (((int) (((Math.cos(d2) * d) - (Math.sin(d2) * d3)) + ((double) f))) - t100.m186890d(30.0f)) + f3, (((int) (((d * Math.sin(d2)) + (Math.cos(d2) * d3)) + ((double) f2))) - t100.m186890d(30.0f)) + f4);
    }

    /* JADX INFO: renamed from: S */
    public static void m171203S(final Act act, VText vText, final dd80 dd80Var) {
        final yk5 yk5Var = new yk5(act, 1);
        yk5Var.m215118D(new View.OnClickListener() { // from class: l.gsq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                psq.m171232v(act, dd80Var, yk5Var, view);
            }
        });
        String string = act.getResources().getString(R$string.f20723B6);
        String string2 = act.getResources().getString(R$string.f21090t5);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) i0g0.m133861b0(string2, vwb.m200299M(string), act.getResources().getColor(w0c0.f183773I), eqh0.m117752c(3)));
        spannableStringBuilder.setSpan(new C19328f(yk5Var, act), string2.indexOf(string), string2.indexOf(string) + string.length(), 33);
        vText.setText(spannableStringBuilder);
        vText.setMovementMethod(LinkMovementMethod.getInstance());
        vText.setHighlightColor(act.getResources().getColor(w0c0.f183811U1));
    }

    /* JADX INFO: renamed from: T */
    public static void m171204T(final Act act) {
        View viewInflate = o7r.m163037a(act).inflate(f6c0.f96098y8, (ViewGroup) null);
        VText vText = (VText) viewInflate.findViewById(u4c0.f174468sb);
        VButton vButton = (VButton) viewInflate.findViewById(u4c0.f174484ta);
        VButton vButton2 = (VButton) viewInflate.findViewById(u4c0.f174467sa);
        TextView textView = (TextView) viewInflate.findViewById(u4c0.f174450ra);
        textView.setTypeface(Typeface.defaultFromStyle(1));
        ImageView imageView = (ImageView) viewInflate.findViewById(u4c0.f173774D6);
        VImage vImage = (VImage) viewInflate.findViewById(u4c0.f173718A1);
        if (upa.m194736c3()) {
            imageView.setImageResource(CoreModule.f17545c.f19639e0.m169520na().isFemale() ? x2c0.f190253j2 : x2c0.f190159g2);
        } else if (upa.m194847z()) {
            vButton.setBackgroundResource(x2c0.f189655Q);
            imageView.setImageResource(CoreModule.f17545c.f19639e0.m169520na().isFemale() ? x2c0.f189983ah : x2c0.f189951Zg);
        } else {
            imageView.setImageResource(CoreModule.f17545c.f19639e0.m169520na().isFemale() ? x2c0.f190223i2 : x2c0.f190127f2);
        }
        final CheckBox checkBox = (CheckBox) viewInflate.findViewById(u4c0.f174238f1);
        cwf0 cwf0VarM133794c = i0e.m133794c("p_only_show_verified_ask_popup", s4e.class.getName());
        i0e.m133797f(cwf0VarM133794c);
        final dd80 dd80VarM110989r0 = new dd80.C16336a(act).m110963R(viewInflate).m110961P(false).m110958M(false).m110989r0();
        if (upa.m194736c3()) {
            xdl0.m208344M(vButton2, true);
            xdl0.m208344M(vImage, true);
            xdl0.m208344M(textView, false);
            xdl0.m208329E0(vButton2, new ViewOnClickListenerC19326d(act, dd80VarM110989r0));
            zvf0.m220402x("e_only_show_verified_buy_svip", "p_only_show_verified_ask_popup");
            xdl0.m208329E0(vImage, new View.OnClickListener() { // from class: l.krq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dd80VarM110989r0.dismiss();
                }
            });
        }
        dd80VarM110989r0.setOnDismissListener(new DialogInterfaceOnDismissListenerC19327e(cwf0VarM133794c));
        m171203S(act, vText, dd80VarM110989r0);
        xdl0.m208329E0(vButton, new View.OnClickListener() { // from class: l.lrq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                psq.m171218h(checkBox, act, dd80VarM110989r0, view);
            }
        });
        xdl0.m208329E0(textView, new View.OnClickListener() { // from class: l.mrq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                psq.m171214d(dd80VarM110989r0, act, view);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public static void m171205U(final Act act) {
        CoreModule.f17545c.f19704z2.f19225d0.put(Boolean.TRUE);
        cwf0 cwf0VarM133794c = i0e.m133794c("p_inform_trial_popup", s4e.class.getName());
        i0e.m133797f(cwf0VarM133794c);
        View viewInflate = o7r.m163037a(act).inflate(f6c0.f96081x8, (ViewGroup) null);
        VText vText = (VText) viewInflate.findViewById(u4c0.f174518va);
        VButton vButton = (VButton) viewInflate.findViewById(u4c0.f174484ta);
        ImageView imageView = (ImageView) viewInflate.findViewById(u4c0.f173774D6);
        if (upa.m194847z()) {
            vButton.setBackgroundResource(x2c0.f189655Q);
        }
        imageView.setImageResource(CoreModule.f17545c.f19639e0.m169520na().isFemale() ? x2c0.f190191h2 : x2c0.f190095e2);
        TextView textView = (TextView) viewInflate.findViewById(u4c0.f174450ra);
        textView.setTypeface(Typeface.defaultFromStyle(1));
        vText.setTypeface(Typeface.defaultFromStyle(1));
        vButton.setTypeface(Typeface.defaultFromStyle(1));
        final dd80 dd80VarM110989r0 = new dd80.C16336a(act).m110963R(viewInflate).m110961P(false).m110958M(false).m110989r0();
        xdl0.m208329E0(vButton, new View.OnClickListener() { // from class: l.irq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                psq.m171189E(dd80VarM110989r0, act, view);
            }
        });
        xdl0.m208329E0(textView, new View.OnClickListener() { // from class: l.jrq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dd80VarM110989r0.dismiss();
            }
        });
        dd80VarM110989r0.setOnDismissListener(new DialogInterfaceOnDismissListenerC19325c(cwf0VarM133794c));
    }

    /* JADX INFO: renamed from: V */
    public static void m171206V(Act act) {
        List<User> listM30246i3 = CoreModule.f17545c.f19704z2.m30246i3();
        if (vwb.m200296J(listM30246i3)) {
            return;
        }
        JustRealSuccessLayout justRealSuccessLayout = (JustRealSuccessLayout) LayoutInflater.from(act).inflate(f6c0.f95774f6, (ViewGroup) null);
        justRealSuccessLayout.m38719b(listM30246i3);
        hdb0.m130575c().m130582i(new SimplePushBubble.C4372a(act, justRealSuccessLayout).m21164B(2).m21175y(new RelativeLayout.LayoutParams(-2, t100.m186890d(60.0f))).m21173w(PlaybackException.ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED).m21176z(CorePopLevel.JUST_REAL_SUCCESS).m21168F(new C19329g()).m21169s());
    }

    /* JADX INFO: renamed from: W */
    public static void m171207W(final Act act) {
        final dd80 dd80VarM110989r0;
        cwf0 cwf0VarM133794c = i0e.m133794c("p_verify_to_like_more_popup", s4e.class.getName());
        i0e.m133797f(cwf0VarM133794c);
        dd80.C16336a c16336aM110958M = new dd80.C16336a(act).m110964S(upa.m194847z() ? x2c0.f189920Yg : x2c0.f190064d2).m110975d0(upa.m194847z() ? x2c0.f189655Q : -1).m110961P(false).m110958M(false);
        String str = "审核中";
        if (upa.m194736c3() || upa.m194742e()) {
            int i = NullChecker.m81303a(upa.m194731b3()) ? upa.m194731b3().verified_user_additional_like_count : 10;
            if (!ke7.m145734s()) {
                str = xdl0.m208412y0() < t100.m186890d(375.0f) ? String.format("去认证，右滑+%s次", Integer.valueOf(i)) : String.format("去认证，每天右滑+%s次", Integer.valueOf(i));
            }
            dd80 dd80VarM110989r1 = c16336aM110958M.m110996y0("继续发出更多喜欢").m110991t0(String.format("今天右滑数量已用完，完成真人认证或开通%s，每天发出更多喜欢", ogl0.m164260m() ? "会员" : "VIP")).m110973b0(str).m110987p0(true).m110984m0(new Runnable() { // from class: l.msq
                @Override // java.lang.Runnable
                public final void run() {
                    psq.m171213c(act);
                }
            }).m110981j0(ogl0.m164260m() ? "开通会员，无限右滑" : "开通VIP，每天无限右滑").m110989r0();
            dd80VarM110989r1.m110916X(new RunnableC19330h(dd80VarM110989r1, act));
            zvf0.m220402x("e_verify_add_likes_buy_vip", "p_verify_to_like_more_popup");
            dd80VarM110989r0 = dd80VarM110989r1;
        } else {
            dd80VarM110989r0 = c16336aM110958M.m110996y0("认证后，继续发出更多喜欢").m110991t0(String.format("今天右滑数量达到上限，完成真人认证后，每天能多发出%d次喜欢", Integer.valueOf(NullChecker.m81303a(upa.m194727a3()) ? upa.m194727a3().verified_user_additional_like_count : 10))).m110973b0(ke7.m145734s() ? "审核中" : "去认证").m110968W("取消").m110989r0();
        }
        dd80VarM110989r0.m110915W(new Runnable() { // from class: l.nsq
            @Override // java.lang.Runnable
            public final void run() {
                psq.m171188D(act, dd80VarM110989r0);
            }
        });
        dd80VarM110989r0.setOnDismissListener(new DialogInterfaceOnDismissListenerC19331i(cwf0VarM133794c));
        dd80VarM110989r0.m110914V(new Runnable() { // from class: l.osq
            @Override // java.lang.Runnable
            public final void run() {
                dd80VarM110989r0.dismiss();
            }
        });
        if ((upa.m194658K1() || upa.m194736c3()) && !ke7.m145734s()) {
            tpd0 tpd0Var = CoreModule.f17545c.f19639e0.f149146B5;
            tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
        }
    }

    /* JADX INFO: renamed from: X */
    public static void m171208X(final Act act) {
        if (CoreModule.f17545c.f19704z2.m30247j3() == CoreJustVerificationCardApi.JustRealStatus.TRIALING) {
            CoreModule.f17545c.f19704z2.m30263z3(CoreJustVerificationCardApi.JustRealStatus.PRE_START);
        }
        act.duringCreated(C22306c.combineLatest(CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip")).map(new w9j() { // from class: l.prq
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!xma.m210055T3((UserPrivilege) obj));
            }
        }).distinctUntilChanged().doOnNext(new e30() { // from class: l.qrq
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19564F0.m99250q3();
            }
        }), CoreModule.f17545c.f19552B0.m31611j4().distinctUntilChanged().map(new w9j() { // from class: l.rrq
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return psq.m171220j((VerificationCenter) obj);
            }
        }), new trq()).distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.urq
            @Override // p149l.e30
            public final void call(Object obj) {
                psq.m171236z(act, (j760) obj);
            }
        }));
        act.duringCreated(CoreModule.f17545c.f19704z2.f19215T).subscribe(mkd0.m154955G(new e30() { // from class: l.vrq
            @Override // p149l.e30
            public final void call(Object obj) {
                e51.m114743H(act, new Runnable() { // from class: l.fsq
                    @Override // java.lang.Runnable
                    public final void run() {
                        psq.m171229s();
                    }
                }, 800L);
            }
        }));
        act.duringCreated(CoreModule.f17545c.f19564F0.m99241h3().map(new w9j() { // from class: l.wrq
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((AdvancedSettings) obj).realFace;
            }
        }).distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.xrq
            @Override // p149l.e30
            public final void call(Object obj) {
                psq.m171215e((Boolean) obj);
            }
        }));
        act.duringCreated((C22306c) CoreModule.f17545c.f19552B0.m31611j4().distinctUntilChanged().map(new w9j() { // from class: l.yrq
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return psq.m171191G((VerificationCenter) obj);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.zrq
            @Override // p149l.e30
            public final void call(Object obj) {
                psq.m171234x((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y */
    public static void m171209Y(Act act) {
        act.duringCreated(CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip")).map(new w9j() { // from class: l.hrq
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!xma.m210055T3((UserPrivilege) obj));
            }
        }).distinctUntilChanged()).subscribe(mkd0.m154956H(new e30() { // from class: l.srq
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19564F0.m99250q3();
            }
        }, new e30() { // from class: l.dsq
            @Override // p149l.e30
            public final void call(Object obj) {
                psq.m171211a((Throwable) obj);
            }
        }));
        act.duringCreated(CoreModule.f17545c.f19564F0.m99241h3().map(new w9j() { // from class: l.isq
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((AdvancedSettings) obj).realFace;
            }
        }).distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.jsq
            @Override // p149l.e30
            public final void call(Object obj) {
                psq.m171222l((Boolean) obj);
            }
        }));
        act.duringCreated((C22306c) CoreModule.f17545c.f19552B0.m31611j4().distinctUntilChanged().map(new w9j() { // from class: l.ksq
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return psq.m171187C((VerificationCenter) obj);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.lsq
            @Override // p149l.e30
            public final void call(Object obj) {
                psq.m171216f((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z */
    public static void m171210Z(String str, boolean z) {
        if (z) {
            zvf0.m220399u("e_only_show_verified_user", "p_suggest_users_home_view", j760.m140076a("function_status", str), j760.m140076a("has_verified", CoreModule.f17545c.f19639e0.m169520na().isPicVerificationVerified() ? "1" : "0"), j760.m140076a("membership_status", m171196L()));
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m171211a(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m171213c(Act act) {
        if (upa.m194629E2()) {
            act.duringCreated(CoreModule.f17545c.f19552B0.m31597U3()).subscribe(mkd0.m154956H(new e30() { // from class: l.asq
                @Override // p149l.e30
                public final void call(Object obj) {
                    psq.m171226p((j760) obj);
                }
            }, new e30() { // from class: l.bsq
                @Override // p149l.e30
                public final void call(Object obj) {
                    psq.m171219i((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m171214d(dd80 dd80Var, Act act, View view) {
        dd80Var.dismiss();
        if (upa.m194629E2()) {
            act.duringCreated(CoreModule.f17545c.f19552B0.m31597U3()).subscribe(mkd0.m154956H(new e30() { // from class: l.csq
                @Override // p149l.e30
                public final void call(Object obj) {
                    psq.m171223m((j760) obj);
                }
            }, new e30() { // from class: l.esq
                @Override // p149l.e30
                public final void call(Object obj) {
                    psq.m171235y((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m171215e(Boolean bool) {
        if (!m171195K()) {
            if (CoreModule.f17545c.f19704z2.m30247j3() == CoreJustVerificationCardApi.JustRealStatus.RUNNING || CoreModule.f17545c.f19704z2.m30247j3() == CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING) {
                CoreModule.f17545c.f19704z2.m30263z3(CoreJustVerificationCardApi.JustRealStatus.IDLE);
                CoreModule.f17545c.f19663m0.m31019L5();
                return;
            }
            return;
        }
        CoreJustVerificationCardApi.JustRealStatus justRealStatusM30247j3 = CoreModule.f17545c.f19704z2.m30247j3();
        CoreJustVerificationCardApi.JustRealStatus justRealStatus = CoreJustVerificationCardApi.JustRealStatus.RUNNING;
        boolean z = justRealStatusM30247j3 == justRealStatus || CoreModule.f17545c.f19704z2.m30247j3() == CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING;
        if (!bool.booleanValue()) {
            CoreModule.f17545c.f19704z2.m30263z3(CoreJustVerificationCardApi.JustRealStatus.IDLE);
        } else if (CoreModule.f17545c.f19704z2.m30247j3() != CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING) {
            CoreModule.f17545c.f19704z2.m30263z3(justRealStatus);
        }
        if (bool.booleanValue() ^ z) {
            CoreModule.f17545c.f19663m0.m31019L5();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m171216f(Boolean bool) {
        if (bool.booleanValue() || !xma.m210071e4()) {
            return;
        }
        if (CoreModule.f17545c.f19704z2.m30247j3() == CoreJustVerificationCardApi.JustRealStatus.RUNNING || CoreModule.f17545c.f19704z2.m30247j3() == CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING) {
            CoreModule.f17545c.f19704z2.m30259v3();
            CoreModule.f17545c.f19704z2.m30263z3(CoreJustVerificationCardApi.JustRealStatus.IDLE);
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m171218h(CheckBox checkBox, Act act, dd80 dd80Var, View view) {
        zvf0.m220396r("e_do_verification", "p_only_show_verified_ask_popup");
        if (!checkBox.isChecked()) {
            osi0.m165783g(act.getResources().getString(com.p046p1.mobile.putong.core.R$string.f18529fs));
            return;
        }
        if (!rwk0.m181430m(act, 1, "verification_center")) {
            tvf.m190730h(act, "verification_center");
        }
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m171219i(Throwable th) {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Boolean m171220j(VerificationCenter verificationCenter) {
        return (NullChecker.m81303a(verificationCenter) && NullChecker.m81303a(verificationCenter.picVerificationInfo) && TEnum.equals(verificationCenter.picVerificationInfo.status, "verified")) ? Boolean.TRUE : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m171222l(Boolean bool) {
        if (!m171195K()) {
            if (CoreModule.f17545c.f19704z2.m30247j3() == CoreJustVerificationCardApi.JustRealStatus.RUNNING || CoreModule.f17545c.f19704z2.m30247j3() == CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING) {
                CoreModule.f17545c.f19704z2.m30263z3(CoreJustVerificationCardApi.JustRealStatus.IDLE);
                CoreModule.f17545c.f19663m0.m31019L5();
                return;
            }
            return;
        }
        CoreJustVerificationCardApi.JustRealStatus justRealStatusM30247j3 = CoreModule.f17545c.f19704z2.m30247j3();
        CoreJustVerificationCardApi.JustRealStatus justRealStatus = CoreJustVerificationCardApi.JustRealStatus.RUNNING;
        boolean z = justRealStatusM30247j3 == justRealStatus || CoreModule.f17545c.f19704z2.m30247j3() == CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING;
        if (!bool.booleanValue()) {
            CoreModule.f17545c.f19704z2.m30263z3(CoreJustVerificationCardApi.JustRealStatus.IDLE);
        } else if (CoreModule.f17545c.f19704z2.m30247j3() != CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING) {
            CoreModule.f17545c.f19704z2.m30263z3(justRealStatus);
        }
        if (bool.booleanValue() ^ z) {
            CoreModule.f17545c.f19663m0.m31019L5();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m171223m(j760 j760Var) {
        if (((Integer) j760Var.f116565b).intValue() <= 0 || vwb.m200296J((Collection) j760Var.f116564a)) {
            return;
        }
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.QuestionOfNotVerify;
        userInfo.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.f17545c.f19663m0.m31154w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m171225o(JustRealHeadLayout justRealHeadLayout, CoreJustVerificationCardApi.JustRealStatus justRealStatus) {
        if (NullChecker.m81303a(justRealHeadLayout)) {
            if (justRealStatus == CoreJustVerificationCardApi.JustRealStatus.TRIALING) {
                justRealHeadLayout.m38664g(true, true);
            } else {
                justRealHeadLayout.m38664g(false, justRealStatus != CoreJustVerificationCardApi.JustRealStatus.PRE_START);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m171226p(j760 j760Var) {
        if (((Integer) j760Var.f116565b).intValue() <= 0 || vwb.m200296J((Collection) j760Var.f116564a)) {
            return;
        }
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.QuestionOfNotVerify;
        userInfo.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.f17545c.f19663m0.m31154w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m171229s() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.FemaleVerificationGuideCard;
        userInfo.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.f17545c.f19663m0.m31154w6(userInfo, 0);
        zvf0.m220402x("e_trial_end_card", "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m171230t(JustRealHeadLayout justRealHeadLayout, roj0 roj0Var) {
        if (NullChecker.m81303a(justRealHeadLayout) && !CoreModule.f17545c.f19663m0.m31000G6() && CoreModule.f17545c.f19704z2.m30247j3() == CoreJustVerificationCardApi.JustRealStatus.PRE_START) {
            if (!vwb.m200296J(CoreModule.f17545c.f19704z2.m30249l3()) || ogl0.m164222A() || ogl0.m164223B()) {
                CoreModule.f17545c.f19704z2.m30263z3(CoreJustVerificationCardApi.JustRealStatus.TRIALING);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m171232v(final Act act, final dd80 dd80Var, yk5 yk5Var, View view) {
        if (NullChecker.m81303a(act)) {
            e51.m114743H(act, new Runnable() { // from class: l.hsq
                @Override // java.lang.Runnable
                public final void run() {
                    psq.m171186B(act, dd80Var);
                }
            }, 200L);
        }
        yk5Var.m101651T();
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m171234x(Boolean bool) {
        if (bool.booleanValue() || m171195K()) {
            return;
        }
        if (CoreModule.f17545c.f19704z2.m30247j3() == CoreJustVerificationCardApi.JustRealStatus.RUNNING || CoreModule.f17545c.f19704z2.m30247j3() == CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING) {
            CoreModule.f17545c.f19704z2.m30263z3(CoreJustVerificationCardApi.JustRealStatus.IDLE);
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m171235y(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m171236z(Act act, j760 j760Var) {
        if (((Boolean) j760Var.f116564a).booleanValue() || ((Boolean) j760Var.f116565b).booleanValue()) {
            CoreModule.f17545c.f19704z2.m30260w3();
            if (!((Boolean) j760Var.f116565b).booleanValue()) {
                CoreModule.f17545c.f19704z2.m30246i3();
                CoreModule.f17545c.f19704z2.m30245h3();
                return;
            }
            boolean zM30255r3 = CoreModule.f17545c.f19704z2.m30255r3();
            boolean z = CoreModule.f17545c.f19704z2.m30247j3() == CoreJustVerificationCardApi.JustRealStatus.TRIALING;
            m171206V(act);
            CoreModule.f17545c.f19704z2.m30245h3();
            if (zM30255r3) {
                if (z) {
                    act.postDelayed(f151027a, z ? 300L : 0L);
                } else {
                    CoreModule.f17545c.f19663m0.m31050S8();
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.psq$g */
    public class C19329g implements d30 {
        @Override // p149l.d30
        public void call() {
        }
    }
}
