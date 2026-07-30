package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.pushbubble.SimplePushBubble;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreJustVerificationCardApi;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.AdvancedSettings;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseDialogConfigTriggerShowType;
import com.p051p1.mobile.putong.core.data.PurchaseDialogConfigs;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.newui.home.justreal.JustRealHeadLayout;
import com.p051p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleLayoutOptNew;
import com.p051p1.mobile.putong.core.newui.home.justreal.JustRealSuccessLayout;
import com.p051p1.mobile.putong.core.newui.home.justreal.JustRealTransAvatarLayout;
import com.p051p1.mobile.putong.core.newui.home.opt.view.ProfileCardStackOpt;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.verification.VerificationCenterAct;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collection;
import java.util.List;
import p137rx.C22421c;
import p151v.VButton;
import p151v.VFrame;
import p151v.VIcon;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class quq {

    /* JADX INFO: renamed from: a */
    public static Runnable f159597a = new RunnableC19669a();

    /* JADX INFO: renamed from: l.quq$a */
    public class RunnableC19669a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            CoreModule.f18264c.f20405m0.m32053S8();
        }
    }

    /* JADX INFO: renamed from: l.quq$b */
    public class C19670b implements y20<CoreJustVerificationCardApi.JustRealStatus> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VIcon f159598a;

        public C19670b(VIcon vIcon) {
            this.f159598a = vIcon;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(CoreJustVerificationCardApi.JustRealStatus justRealStatus) {
            CoreJustVerificationCardApi.JustRealStatus justRealStatusM31245j3 = CoreModule.f18264c.f20446z2.m31245j3();
            if (justRealStatusM31245j3 == CoreJustVerificationCardApi.JustRealStatus.RUNNING || justRealStatusM31245j3 == CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING) {
                this.f159598a.setImageResource(dbc0.f86921dd);
            } else {
                this.f159598a.setImageResource(dbc0.f86888cd);
            }
        }
    }

    /* JADX INFO: renamed from: l.quq$c */
    public class DialogInterfaceOnDismissListenerC19671c implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l4g0 f159599a;

        public DialogInterfaceOnDismissListenerC19671c(l4g0 l4g0Var) {
            this.f159599a = l4g0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            w1e.m204401e(this.f159599a);
        }
    }

    /* JADX INFO: renamed from: l.quq$d */
    public class ViewOnClickListenerC19672d implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f159600a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ jl80 f159601b;

        public ViewOnClickListenerC19672d(Act act, jl80 jl80Var) {
            this.f159600a = act;
            this.f159601b = jl80Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C8927c.m54687x0(this.f159600a, "p_home,verification_card", Privilege.advanced_filter);
            i4g0.m138520r("e_only_show_verified_buy_svip", "p_only_show_verified_ask_popup");
            this.f159601b.dismiss();
        }
    }

    /* JADX INFO: renamed from: l.quq$e */
    public class DialogInterfaceOnDismissListenerC19673e implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l4g0 f159602a;

        public DialogInterfaceOnDismissListenerC19673e(l4g0 l4g0Var) {
            this.f159602a = l4g0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            w1e.m204401e(this.f159602a);
        }
    }

    /* JADX INFO: renamed from: l.quq$f */
    public class C19674f extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ bm5 f159603a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f159604b;

        public C19674f(bm5 bm5Var, Act act) {
            this.f159603a = bm5Var;
            this.f159604b = act;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            this.f159603a.show();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(this.f159604b.getResources().getColor(c9c0.f80342I));
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: l.quq$h */
    public class RunnableC19676h implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jl80 f159605a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f159606b;

        public RunnableC19676h(jl80 jl80Var, Act act) {
            this.f159605a = jl80Var;
            this.f159606b = act;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f159605a.dismiss();
            i4g0.m138520r("e_verify_add_likes_buy_vip", "p_verify_to_like_more_popup");
            if (!spl0.m187387m()) {
                C8927c.m54586J1(this.f159606b, "p_home,verification_card", Privilege.vip_unlimited_likes);
                return;
            }
            PurchaseDialogConfigs purchaseDialogConfigsM31591I4 = CoreModule.f18264c.f20396j0.m31591I4();
            PurchaseDialogConfigTriggerShowType purchaseDialogConfigTriggerShowType = PurchaseDialogConfigTriggerShowType.get("unknown_");
            if (NullChecker.m82486a(purchaseDialogConfigsM31591I4) && NullChecker.m82486a(purchaseDialogConfigsM31591I4.sceneTriggerDialog)) {
                purchaseDialogConfigTriggerShowType = purchaseDialogConfigsM31591I4.sceneTriggerDialog.swipeLimit.showType;
            }
            if (TEnum.equals(purchaseDialogConfigTriggerShowType, "svip")) {
                CoreModule.m30933P().m143405a().mo34568pr(this.f159606b, "p_home,verification_card", Privilege.vip_unlimited_likes);
            } else {
                C8927c.m54586J1(this.f159606b, "p_home,verification_card", Privilege.vip_unlimited_likes);
            }
        }
    }

    /* JADX INFO: renamed from: l.quq$i */
    public class DialogInterfaceOnDismissListenerC19677i implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l4g0 f159607a;

        public DialogInterfaceOnDismissListenerC19677i(l4g0 l4g0Var) {
            this.f159607a = l4g0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            w1e.m204401e(this.f159607a);
        }
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m178166B(Act act, jl80 jl80Var) {
        if (!x5l0.m209400m(act, 1, "verification_center")) {
            hxf.m137587h(act, "verification_center");
        }
        jl80Var.dismiss();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ Boolean m178167C(VerificationCenter verificationCenter) {
        return (NullChecker.m82486a(verificationCenter) && NullChecker.m82486a(verificationCenter.picVerificationInfo) && TEnum.equals(verificationCenter.picVerificationInfo.status, "verified")) ? Boolean.TRUE : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m178168D(Act act, jl80 jl80Var) {
        if (of7.m167422s()) {
            return;
        }
        i4g0.m138520r("e_do_verification", "p_verify_to_like_more_popup");
        if (gra.m131673e()) {
            aw90.m100592w0(act);
        } else {
            act.startActivity(VerificationCenterAct.m57175Z1(act, false, "button"));
        }
        jl80Var.dismiss();
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m178169E(jl80 jl80Var, Act act, View view) {
        i4g0.m138520r("e_start_see_verified_trial", "p_inform_trial_popup");
        jl80Var.dismiss();
        m178180P(act, false);
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ Boolean m178171G(VerificationCenter verificationCenter) {
        return (NullChecker.m82486a(verificationCenter) && NullChecker.m82486a(verificationCenter.picVerificationInfo) && TEnum.equals(verificationCenter.picVerificationInfo.status, "verified")) ? Boolean.TRUE : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: H */
    public static void m178172H(boolean z) {
        if (z && CoreModule.f18264c.f20446z2.m31245j3() == CoreJustVerificationCardApi.JustRealStatus.TRIALING) {
            CoreModule.f18264c.f20446z2.m31261z3(CoreJustVerificationCardApi.JustRealStatus.PRE_START);
        }
    }

    /* JADX INFO: renamed from: I */
    public static boolean m178173I() {
        return gra.m131667c3() && jj40.m145003f() >= 2;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m178174J(dvl dvlVar) {
        return gra.m131667c3() && jj40.m145003f() >= 2 && dvlVar.mo118288e().getVisibility() == 0;
    }

    /* JADX INFO: renamed from: K */
    public static boolean m178175K() {
        return !joa.m146386f4() || CoreModule.f18264c.f20381e0.m116593na().isPicVerificationVerified();
    }

    /* JADX INFO: renamed from: L */
    public static String m178176L() {
        if (!joa.m146373Y3()) {
            return "diamond_valid";
        }
        if (!joa.m146386f4()) {
            return "svip_valid";
        }
        if (dk90.m116230i()) {
            return "vip_valid";
        }
        if (joa.m146374Z3()) {
            return "diamond_invalid";
        }
        if (joa.m146388g4()) {
            return "svip_invalid";
        }
        return (dk90.m116230i() || !CoreModule.f18264c.f20381e0.m116600p9().isVIPUsed()) ? "no_membership" : "vip_invalid";
    }

    /* JADX INFO: renamed from: M */
    public static void m178177M(Act act, VFrame vFrame, dvl dvlVar, ProfileCardStackOpt profileCardStackOpt) {
        final JustRealHeadLayout justRealHeadLayout = (JustRealHeadLayout) LayoutInflater.from(act).inflate((spl0.m187349A() || spl0.m187350B()) ? kec0.f125895j6 : kec0.f125879i6, (ViewGroup) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = qa00.m175859d(54.0f);
        int iM175859d = qa00.m175859d(8.0f);
        layoutParams.rightMargin = iM175859d;
        layoutParams.leftMargin = iM175859d;
        vFrame.addView(justRealHeadLayout, 0, layoutParams);
        if (spl0.m187349A() || spl0.m187350B()) {
            ((JustRealHomeTitleLayoutOptNew) dvlVar.mo118284a().inflate()).m39699o(act);
        } else {
            ((wvl) dvlVar.mo118297n().inflate()).mo39675a(act);
        }
        View frameLayout = new FrameLayout(act);
        frameLayout.setVisibility(8);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(qa00.m175859d(60.0f), qa00.m175859d(50.0f));
        layoutParams2.topMargin = qa00.m175859d(54.0f);
        layoutParams2.rightMargin = qa00.m175859d(20.0f);
        layoutParams2.gravity = 5;
        vFrame.addView(frameLayout, layoutParams2);
        justRealHeadLayout.m39668h(act, frameLayout);
        JustRealTransAvatarLayout justRealTransAvatarLayout = new JustRealTransAvatarLayout(act);
        vFrame.addView(justRealTransAvatarLayout, new FrameLayout.LayoutParams(-1, -1));
        justRealTransAvatarLayout.m39729f(act);
        act.duringCreated(CoreModule.f18264c.f20446z2.m31237F3()).subscribe(psd0.m173596G(new y20() { // from class: l.otq
            @Override // p153l.y20
            public final void call(Object obj) {
                quq.m178205o(justRealHeadLayout, (CoreJustVerificationCardApi.JustRealStatus) obj);
            }
        }));
        act.duringCreated(profileCardStackOpt.m39806D()).subscribe(psd0.m173596G(new y20() { // from class: l.ptq
            @Override // p153l.y20
            public final void call(Object obj) {
                quq.m178210t(justRealHeadLayout, (uxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public static void m178178N(Act act, dvl dvlVar) {
        VIcon vIconMo118287d = dvlVar.mo118287d();
        CoreJustVerificationCardApi.JustRealStatus justRealStatusM31245j3 = CoreModule.f18264c.f20446z2.m31245j3();
        bnl0.m105524M(vIconMo118287d, true);
        if (justRealStatusM31245j3 == CoreJustVerificationCardApi.JustRealStatus.RUNNING || justRealStatusM31245j3 == CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING) {
            vIconMo118287d.setImageResource(dbc0.f86921dd);
        } else {
            vIconMo118287d.setImageResource(dbc0.f86888cd);
        }
        act.duringCreated(CoreModule.f18264c.f20446z2.m31237F3()).subscribe(psd0.m173596G(new C19670b(vIconMo118287d)));
    }

    /* JADX INFO: renamed from: O */
    public static boolean m178179O() {
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        return TEnum.equals(NullChecker.m82486a(verificationCenterM32615k4) ? verificationCenterM32615k4.picVerificationInfo.status : null, "pending");
    }

    /* JADX INFO: renamed from: P */
    public static void m178180P(Act act, boolean z) {
        if (m178175K()) {
            if (CoreModule.f18264c.f20446z2.m31252q3()) {
                return;
            }
            CoreModule.f18264c.f20446z2.m31257v3();
            m178190Z(CoreModule.f18264c.f20446z2.m31245j3().status, z);
            CoreJustVerificationCardApi.JustRealStatus justRealStatusM31245j3 = CoreModule.f18264c.f20446z2.m31245j3();
            CoreJustVerificationCardApi.JustRealStatus justRealStatus = CoreJustVerificationCardApi.JustRealStatus.IDLE;
            if (justRealStatusM31245j3 == justRealStatus || CoreModule.f18264c.f20446z2.m31245j3() == CoreJustVerificationCardApi.JustRealStatus.FINISH) {
                CoreModule.f18264c.f20446z2.m31261z3(CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING);
                return;
            } else {
                CoreModule.f18264c.f20446z2.m31261z3(justRealStatus);
                return;
            }
        }
        CoreJustVerificationCardApi.JustRealStatus justRealStatusM31245j4 = CoreModule.f18264c.f20446z2.m31245j3();
        CoreJustVerificationCardApi.JustRealStatus justRealStatus2 = CoreJustVerificationCardApi.JustRealStatus.IDLE;
        if (justRealStatusM31245j4 != justRealStatus2 && CoreModule.f18264c.f20446z2.m31245j3() != CoreJustVerificationCardApi.JustRealStatus.FINISH) {
            m178190Z(CoreModule.f18264c.f20446z2.m31245j3().status, z);
            boolean z2 = CoreModule.f18264c.f20446z2.m31245j3() == CoreJustVerificationCardApi.JustRealStatus.TRIALING;
            CoreModule.f18264c.f20446z2.m31261z3(justRealStatus2);
            act.removeCallbacks(f159597a);
            act.postDelayed(f159597a, z2 ? 300L : 0L);
            return;
        }
        if (m178179O()) {
            o1j0.m165651y("认证审核中，审核通过后可设置只看认证用户");
            m178190Z("waiting", z);
            return;
        }
        m178190Z(CoreModule.f18264c.f20446z2.m31245j3().status, z);
        if (!CoreModule.f18264c.f20446z2.f19966d0.get().booleanValue()) {
            m178185U(act);
        } else if (CoreModule.f18264c.f20446z2.m31249n3() <= 0) {
            m178184T(act);
        } else {
            CoreModule.f18264c.f20446z2.m31261z3(CoreJustVerificationCardApi.JustRealStatus.PRE_START);
            CoreModule.f18264c.f20405m0.m32053S8();
        }
    }

    /* JADX INFO: renamed from: Q */
    public static void m178181Q(Act act, boolean z) {
        if (m178175K()) {
            if (CoreModule.f18264c.f20446z2.m31252q3()) {
                return;
            }
            CoreModule.f18264c.f20446z2.m31257v3();
            m178190Z(CoreModule.f18264c.f20446z2.m31245j3().status, z);
            CoreJustVerificationCardApi.JustRealStatus justRealStatusM31245j3 = CoreModule.f18264c.f20446z2.m31245j3();
            CoreJustVerificationCardApi.JustRealStatus justRealStatus = CoreJustVerificationCardApi.JustRealStatus.IDLE;
            if (justRealStatusM31245j3 == justRealStatus || CoreModule.f18264c.f20446z2.m31245j3() == CoreJustVerificationCardApi.JustRealStatus.FINISH) {
                CoreModule.f18264c.f20446z2.m31261z3(CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING);
                return;
            } else {
                CoreModule.f18264c.f20446z2.m31261z3(justRealStatus);
                return;
            }
        }
        CoreJustVerificationCardApi.JustRealStatus justRealStatusM31245j4 = CoreModule.f18264c.f20446z2.m31245j3();
        CoreJustVerificationCardApi.JustRealStatus justRealStatus2 = CoreJustVerificationCardApi.JustRealStatus.IDLE;
        if (justRealStatusM31245j4 != justRealStatus2 && CoreModule.f18264c.f20446z2.m31245j3() != CoreJustVerificationCardApi.JustRealStatus.FINISH) {
            m178190Z(CoreModule.f18264c.f20446z2.m31245j3().status, z);
            CoreModule.f18264c.f20446z2.m31261z3(justRealStatus2);
        } else if (m178179O()) {
            o1j0.m165651y("认证审核中，审核通过后可设置只看认证用户");
            m178190Z("waiting", z);
        } else {
            m178190Z(CoreModule.f18264c.f20446z2.m31245j3().status, z);
            m178184T(act);
        }
    }

    /* JADX INFO: renamed from: R */
    public static void m178182R(User user, int i, int i2, float f, float f2, float f3, float f4, float f5) {
        double d = (i / 2) - f;
        double d2 = ((float) (((double) (f5 / 180.0f)) * 3.141592653589793d)) * 1.0f;
        double d3 = (i2 / 2) - f2;
        CoreModule.f18264c.f20446z2.m31233B3(user, (((int) (((Math.cos(d2) * d) - (Math.sin(d2) * d3)) + ((double) f))) - qa00.m175859d(30.0f)) + f3, (((int) (((d * Math.sin(d2)) + (Math.cos(d2) * d3)) + ((double) f2))) - qa00.m175859d(30.0f)) + f4);
    }

    /* JADX INFO: renamed from: S */
    public static void m178183S(final Act act, VText vText, final jl80 jl80Var) {
        final bm5 bm5Var = new bm5(act, 1);
        bm5Var.m104999D(new View.OnClickListener() { // from class: l.huq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                quq.m178212v(act, jl80Var, bm5Var, view);
            }
        });
        String string = act.getResources().getString(R$string.f21465B6);
        String string2 = act.getResources().getString(R$string.f21832t5);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) q8g0.m175796b0(string2, jyb.m147482M(string), act.getResources().getColor(c9c0.f80342I), lyh0.m156283c(3)));
        spannableStringBuilder.setSpan(new C19674f(bm5Var, act), string2.indexOf(string), string2.indexOf(string) + string.length(), 33);
        vText.setText(spannableStringBuilder);
        vText.setMovementMethod(LinkMovementMethod.getInstance());
        vText.setHighlightColor(act.getResources().getColor(c9c0.f80383V1));
    }

    /* JADX INFO: renamed from: T */
    public static void m178184T(final Act act) {
        View viewInflate = p9r.m171370a(act).inflate(kec0.f125409F8, (ViewGroup) null);
        VText vText = (VText) viewInflate.findViewById(adc0.f70593ub);
        VButton vButton = (VButton) viewInflate.findViewById(adc0.f70609va);
        VButton vButton2 = (VButton) viewInflate.findViewById(adc0.f70592ua);
        TextView textView = (TextView) viewInflate.findViewById(adc0.f70575ta);
        textView.setTypeface(Typeface.defaultFromStyle(1));
        ImageView imageView = (ImageView) viewInflate.findViewById(adc0.f69896F6);
        VImage vImage = (VImage) viewInflate.findViewById(adc0.f69806A1);
        if (gra.m131667c3()) {
            imageView.setImageResource(CoreModule.f18264c.f20381e0.m116593na().isFemale() ? dbc0.f87138k2 : dbc0.f87041h2);
        } else if (gra.m131778z()) {
            vButton.setBackgroundResource(dbc0.f86520R);
            imageView.setImageResource(CoreModule.f18264c.f20381e0.m116593na().isFemale() ? dbc0.f86442Oh : dbc0.f86410Nh);
        } else {
            imageView.setImageResource(CoreModule.f18264c.f20381e0.m116593na().isFemale() ? dbc0.f87105j2 : dbc0.f87008g2);
        }
        final CheckBox checkBox = (CheckBox) viewInflate.findViewById(adc0.f70329f1);
        l4g0 l4g0VarM204399c = w1e.m204399c("p_only_show_verified_ask_popup", g6e.class.getName());
        w1e.m204402f(l4g0VarM204399c);
        final jl80 jl80VarM146049r0 = new jl80.C17971a(act).m146023R(viewInflate).m146021P(false).m146018M(false).m146049r0();
        if (gra.m131667c3()) {
            bnl0.m105524M(vButton2, true);
            bnl0.m105524M(vImage, true);
            bnl0.m105524M(textView, false);
            bnl0.m105509E0(vButton2, new ViewOnClickListenerC19672d(act, jl80VarM146049r0));
            i4g0.m138526x("e_only_show_verified_buy_svip", "p_only_show_verified_ask_popup");
            bnl0.m105509E0(vImage, new View.OnClickListener() { // from class: l.ltq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    jl80VarM146049r0.dismiss();
                }
            });
        }
        jl80VarM146049r0.setOnDismissListener(new DialogInterfaceOnDismissListenerC19673e(l4g0VarM204399c));
        m178183S(act, vText, jl80VarM146049r0);
        bnl0.m105509E0(vButton, new View.OnClickListener() { // from class: l.mtq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                quq.m178198h(checkBox, act, jl80VarM146049r0, view);
            }
        });
        bnl0.m105509E0(textView, new View.OnClickListener() { // from class: l.ntq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                quq.m178194d(jl80VarM146049r0, act, view);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public static void m178185U(final Act act) {
        CoreModule.f18264c.f20446z2.f19966d0.put(Boolean.TRUE);
        l4g0 l4g0VarM204399c = w1e.m204399c("p_inform_trial_popup", g6e.class.getName());
        w1e.m204402f(l4g0VarM204399c);
        View viewInflate = p9r.m171370a(act).inflate(kec0.f125392E8, (ViewGroup) null);
        VText vText = (VText) viewInflate.findViewById(adc0.f70643xa);
        VButton vButton = (VButton) viewInflate.findViewById(adc0.f70609va);
        ImageView imageView = (ImageView) viewInflate.findViewById(adc0.f69896F6);
        if (gra.m131778z()) {
            vButton.setBackgroundResource(dbc0.f86520R);
        }
        imageView.setImageResource(CoreModule.f18264c.f20381e0.m116593na().isFemale() ? dbc0.f87074i2 : dbc0.f86975f2);
        TextView textView = (TextView) viewInflate.findViewById(adc0.f70575ta);
        textView.setTypeface(Typeface.defaultFromStyle(1));
        vText.setTypeface(Typeface.defaultFromStyle(1));
        vButton.setTypeface(Typeface.defaultFromStyle(1));
        final jl80 jl80VarM146049r0 = new jl80.C17971a(act).m146023R(viewInflate).m146021P(false).m146018M(false).m146049r0();
        bnl0.m105509E0(vButton, new View.OnClickListener() { // from class: l.jtq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                quq.m178169E(jl80VarM146049r0, act, view);
            }
        });
        bnl0.m105509E0(textView, new View.OnClickListener() { // from class: l.ktq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jl80VarM146049r0.dismiss();
            }
        });
        jl80VarM146049r0.setOnDismissListener(new DialogInterfaceOnDismissListenerC19671c(l4g0VarM204399c));
    }

    /* JADX INFO: renamed from: V */
    public static void m178186V(Act act) {
        List<User> listM31244i3 = CoreModule.f18264c.f20446z2.m31244i3();
        if (jyb.m147479J(listM31244i3)) {
            return;
        }
        JustRealSuccessLayout justRealSuccessLayout = (JustRealSuccessLayout) LayoutInflater.from(act).inflate(kec0.f125845g6, (ViewGroup) null);
        justRealSuccessLayout.m39722b(listM31244i3);
        llb0.m154703c().m154710i(new SimplePushBubble.C4523a(act, justRealSuccessLayout).m22163B(2).m22174y(new RelativeLayout.LayoutParams(-2, qa00.m175859d(60.0f))).m22172w(PlaybackException.ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED).m22175z(CorePopLevel.JUST_REAL_SUCCESS).m22167F(new C19675g()).m22168s());
    }

    /* JADX INFO: renamed from: W */
    public static void m178187W(final Act act) {
        final jl80 jl80VarM146049r0;
        l4g0 l4g0VarM204399c = w1e.m204399c("p_verify_to_like_more_popup", g6e.class.getName());
        w1e.m204402f(l4g0VarM204399c);
        jl80.C17971a c17971aM146018M = new jl80.C17971a(act).m146024S(gra.m131778z() ? dbc0.f86378Mh : dbc0.f86942e2).m146035d0(gra.m131778z() ? dbc0.f86520R : -1).m146021P(false).m146018M(false);
        String str = "审核中";
        if (gra.m131667c3() || gra.m131673e()) {
            int i = NullChecker.m82486a(gra.m131662b3()) ? gra.m131662b3().verified_user_additional_like_count : 10;
            if (!of7.m167422s()) {
                str = bnl0.m105592y0() < qa00.m175859d(375.0f) ? String.format("去认证，右滑+%s次", Integer.valueOf(i)) : String.format("去认证，每天右滑+%s次", Integer.valueOf(i));
            }
            jl80 jl80VarM146049r1 = c17971aM146018M.m146056y0("继续发出更多喜欢").m146051t0(String.format("今天右滑数量已用完，完成真人认证或开通%s，每天发出更多喜欢", spl0.m187387m() ? "会员" : "VIP")).m146033b0(str).m146047p0(true).m146044m0(new Runnable() { // from class: l.nuq
                @Override // java.lang.Runnable
                public final void run() {
                    quq.m178193c(act);
                }
            }).m146041j0(spl0.m187387m() ? "开通会员，无限右滑" : "开通VIP，每天无限右滑").m146049r0();
            jl80VarM146049r1.m145976X(new RunnableC19676h(jl80VarM146049r1, act));
            i4g0.m138526x("e_verify_add_likes_buy_vip", "p_verify_to_like_more_popup");
            jl80VarM146049r0 = jl80VarM146049r1;
        } else {
            jl80VarM146049r0 = c17971aM146018M.m146056y0("认证后，继续发出更多喜欢").m146051t0(String.format("今天右滑数量达到上限，完成真人认证后，每天能多发出%d次喜欢", Integer.valueOf(NullChecker.m82486a(gra.m131658a3()) ? gra.m131658a3().verified_user_additional_like_count : 10))).m146033b0(of7.m167422s() ? "审核中" : "去认证").m146028W("取消").m146049r0();
        }
        jl80VarM146049r0.m145975W(new Runnable() { // from class: l.ouq
            @Override // java.lang.Runnable
            public final void run() {
                quq.m178168D(act, jl80VarM146049r0);
            }
        });
        jl80VarM146049r0.setOnDismissListener(new DialogInterfaceOnDismissListenerC19677i(l4g0VarM204399c));
        jl80VarM146049r0.m145974V(new Runnable() { // from class: l.puq
            @Override // java.lang.Runnable
            public final void run() {
                jl80VarM146049r0.dismiss();
            }
        });
        if ((gra.m131589K1() || gra.m131667c3()) && !of7.m167422s()) {
            vxd0 vxd0Var = CoreModule.f18264c.f20381e0.f89003B5;
            vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
        }
    }

    /* JADX INFO: renamed from: X */
    public static void m178188X(final Act act) {
        if (CoreModule.f18264c.f20446z2.m31245j3() == CoreJustVerificationCardApi.JustRealStatus.TRIALING) {
            CoreModule.f18264c.f20446z2.m31261z3(CoreJustVerificationCardApi.JustRealStatus.PRE_START);
        }
        act.duringCreated(C22421c.combineLatest(CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip")).map(new qcj() { // from class: l.qtq
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!joa.m146369U3((UserPrivilege) obj));
            }
        }).distinctUntilChanged().doOnNext(new y20() { // from class: l.rtq
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20306F0.m118454q3();
            }
        }), CoreModule.f18264c.f20294B0.m32614j4().distinctUntilChanged().map(new qcj() { // from class: l.stq
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return quq.m178200j((VerificationCenter) obj);
            }
        }), new utq()).distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.vtq
            @Override // p153l.y20
            public final void call(Object obj) {
                quq.m178216z(act, (pf60) obj);
            }
        }));
        act.duringCreated(CoreModule.f18264c.f20446z2.f19956T).subscribe(psd0.m173596G(new y20() { // from class: l.wtq
            @Override // p153l.y20
            public final void call(Object obj) {
                l51.m152888H(act, new Runnable() { // from class: l.guq
                    @Override // java.lang.Runnable
                    public final void run() {
                        quq.m178209s();
                    }
                }, 800L);
            }
        }));
        act.duringCreated(CoreModule.f18264c.f20306F0.m118445h3().map(new qcj() { // from class: l.xtq
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((AdvancedSettings) obj).realFace;
            }
        }).distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.ytq
            @Override // p153l.y20
            public final void call(Object obj) {
                quq.m178195e((Boolean) obj);
            }
        }));
        act.duringCreated((C22421c) CoreModule.f18264c.f20294B0.m32614j4().distinctUntilChanged().map(new qcj() { // from class: l.ztq
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return quq.m178171G((VerificationCenter) obj);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.auq
            @Override // p153l.y20
            public final void call(Object obj) {
                quq.m178214x((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y */
    public static void m178189Y(Act act) {
        act.duringCreated(CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip")).map(new qcj() { // from class: l.itq
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!joa.m146369U3((UserPrivilege) obj));
            }
        }).distinctUntilChanged()).subscribe(psd0.m173597H(new y20() { // from class: l.ttq
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20306F0.m118454q3();
            }
        }, new y20() { // from class: l.euq
            @Override // p153l.y20
            public final void call(Object obj) {
                quq.m178191a((Throwable) obj);
            }
        }));
        act.duringCreated(CoreModule.f18264c.f20306F0.m118445h3().map(new qcj() { // from class: l.juq
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((AdvancedSettings) obj).realFace;
            }
        }).distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.kuq
            @Override // p153l.y20
            public final void call(Object obj) {
                quq.m178202l((Boolean) obj);
            }
        }));
        act.duringCreated((C22421c) CoreModule.f18264c.f20294B0.m32614j4().distinctUntilChanged().map(new qcj() { // from class: l.luq
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return quq.m178167C((VerificationCenter) obj);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.muq
            @Override // p153l.y20
            public final void call(Object obj) {
                quq.m178196f((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z */
    public static void m178190Z(String str, boolean z) {
        if (z) {
            i4g0.m138523u("e_only_show_verified_user", "p_suggest_users_home_view", pf60.m172085a("function_status", str), pf60.m172085a("has_verified", CoreModule.f18264c.f20381e0.m116593na().isPicVerificationVerified() ? "1" : "0"), pf60.m172085a("membership_status", m178176L()));
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m178191a(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m178193c(Act act) {
        if (gra.m131560E2()) {
            act.duringCreated(CoreModule.f18264c.f20294B0.m32600U3()).subscribe(psd0.m173597H(new y20() { // from class: l.buq
                @Override // p153l.y20
                public final void call(Object obj) {
                    quq.m178206p((pf60) obj);
                }
            }, new y20() { // from class: l.cuq
                @Override // p153l.y20
                public final void call(Object obj) {
                    quq.m178199i((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m178194d(jl80 jl80Var, Act act, View view) {
        jl80Var.dismiss();
        if (gra.m131560E2()) {
            act.duringCreated(CoreModule.f18264c.f20294B0.m32600U3()).subscribe(psd0.m173597H(new y20() { // from class: l.duq
                @Override // p153l.y20
                public final void call(Object obj) {
                    quq.m178203m((pf60) obj);
                }
            }, new y20() { // from class: l.fuq
                @Override // p153l.y20
                public final void call(Object obj) {
                    quq.m178215y((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m178195e(Boolean bool) {
        if (!m178175K()) {
            if (CoreModule.f18264c.f20446z2.m31245j3() == CoreJustVerificationCardApi.JustRealStatus.RUNNING || CoreModule.f18264c.f20446z2.m31245j3() == CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING) {
                CoreModule.f18264c.f20446z2.m31261z3(CoreJustVerificationCardApi.JustRealStatus.IDLE);
                CoreModule.f18264c.f20405m0.m32022L5();
                return;
            }
            return;
        }
        CoreJustVerificationCardApi.JustRealStatus justRealStatusM31245j3 = CoreModule.f18264c.f20446z2.m31245j3();
        CoreJustVerificationCardApi.JustRealStatus justRealStatus = CoreJustVerificationCardApi.JustRealStatus.RUNNING;
        boolean z = justRealStatusM31245j3 == justRealStatus || CoreModule.f18264c.f20446z2.m31245j3() == CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING;
        if (!bool.booleanValue()) {
            CoreModule.f18264c.f20446z2.m31261z3(CoreJustVerificationCardApi.JustRealStatus.IDLE);
        } else if (CoreModule.f18264c.f20446z2.m31245j3() != CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING) {
            CoreModule.f18264c.f20446z2.m31261z3(justRealStatus);
        }
        if (bool.booleanValue() ^ z) {
            CoreModule.f18264c.f20405m0.m32022L5();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m178196f(Boolean bool) {
        if (bool.booleanValue() || !joa.m146386f4()) {
            return;
        }
        if (CoreModule.f18264c.f20446z2.m31245j3() == CoreJustVerificationCardApi.JustRealStatus.RUNNING || CoreModule.f18264c.f20446z2.m31245j3() == CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING) {
            CoreModule.f18264c.f20446z2.m31257v3();
            CoreModule.f18264c.f20446z2.m31261z3(CoreJustVerificationCardApi.JustRealStatus.IDLE);
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m178198h(CheckBox checkBox, Act act, jl80 jl80Var, View view) {
        i4g0.m138520r("e_do_verification", "p_only_show_verified_ask_popup");
        if (!checkBox.isChecked()) {
            r1j0.m179420g(act.getResources().getString(com.p051p1.mobile.putong.core.R$string.f18345Bs));
            return;
        }
        if (!x5l0.m209400m(act, 1, "verification_center")) {
            hxf.m137587h(act, "verification_center");
        }
        jl80Var.dismiss();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m178199i(Throwable th) {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Boolean m178200j(VerificationCenter verificationCenter) {
        return (NullChecker.m82486a(verificationCenter) && NullChecker.m82486a(verificationCenter.picVerificationInfo) && TEnum.equals(verificationCenter.picVerificationInfo.status, "verified")) ? Boolean.TRUE : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m178202l(Boolean bool) {
        if (!m178175K()) {
            if (CoreModule.f18264c.f20446z2.m31245j3() == CoreJustVerificationCardApi.JustRealStatus.RUNNING || CoreModule.f18264c.f20446z2.m31245j3() == CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING) {
                CoreModule.f18264c.f20446z2.m31261z3(CoreJustVerificationCardApi.JustRealStatus.IDLE);
                CoreModule.f18264c.f20405m0.m32022L5();
                return;
            }
            return;
        }
        CoreJustVerificationCardApi.JustRealStatus justRealStatusM31245j3 = CoreModule.f18264c.f20446z2.m31245j3();
        CoreJustVerificationCardApi.JustRealStatus justRealStatus = CoreJustVerificationCardApi.JustRealStatus.RUNNING;
        boolean z = justRealStatusM31245j3 == justRealStatus || CoreModule.f18264c.f20446z2.m31245j3() == CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING;
        if (!bool.booleanValue()) {
            CoreModule.f18264c.f20446z2.m31261z3(CoreJustVerificationCardApi.JustRealStatus.IDLE);
        } else if (CoreModule.f18264c.f20446z2.m31245j3() != CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING) {
            CoreModule.f18264c.f20446z2.m31261z3(justRealStatus);
        }
        if (bool.booleanValue() ^ z) {
            CoreModule.f18264c.f20405m0.m32022L5();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m178203m(pf60 pf60Var) {
        if (((Integer) pf60Var.f152157b).intValue() <= 0 || jyb.m147479J((Collection) pf60Var.f152156a)) {
            return;
        }
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.QuestionOfNotVerify;
        userInfo.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.f18264c.f20405m0.m32157w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m178205o(JustRealHeadLayout justRealHeadLayout, CoreJustVerificationCardApi.JustRealStatus justRealStatus) {
        if (NullChecker.m82486a(justRealHeadLayout)) {
            if (justRealStatus == CoreJustVerificationCardApi.JustRealStatus.TRIALING) {
                justRealHeadLayout.m39667g(true, true);
            } else {
                justRealHeadLayout.m39667g(false, justRealStatus != CoreJustVerificationCardApi.JustRealStatus.PRE_START);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m178206p(pf60 pf60Var) {
        if (((Integer) pf60Var.f152157b).intValue() <= 0 || jyb.m147479J((Collection) pf60Var.f152156a)) {
            return;
        }
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.QuestionOfNotVerify;
        userInfo.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.f18264c.f20405m0.m32157w6(userInfo, 0);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m178209s() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.FemaleVerificationGuideCard;
        userInfo.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.f18264c.f20405m0.m32157w6(userInfo, 0);
        i4g0.m138526x("e_trial_end_card", "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m178210t(JustRealHeadLayout justRealHeadLayout, uxj0 uxj0Var) {
        if (NullChecker.m82486a(justRealHeadLayout) && !CoreModule.f18264c.f20405m0.m32003G6() && CoreModule.f18264c.f20446z2.m31245j3() == CoreJustVerificationCardApi.JustRealStatus.PRE_START) {
            if (!jyb.m147479J(CoreModule.f18264c.f20446z2.m31247l3()) || spl0.m187349A() || spl0.m187350B()) {
                CoreModule.f18264c.f20446z2.m31261z3(CoreJustVerificationCardApi.JustRealStatus.TRIALING);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m178212v(final Act act, final jl80 jl80Var, bm5 bm5Var, View view) {
        if (NullChecker.m82486a(act)) {
            l51.m152888H(act, new Runnable() { // from class: l.iuq
                @Override // java.lang.Runnable
                public final void run() {
                    quq.m178166B(act, jl80Var);
                }
            }, 200L);
        }
        bm5Var.m176562T();
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m178214x(Boolean bool) {
        if (bool.booleanValue() || m178175K()) {
            return;
        }
        if (CoreModule.f18264c.f20446z2.m31245j3() == CoreJustVerificationCardApi.JustRealStatus.RUNNING || CoreModule.f18264c.f20446z2.m31245j3() == CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING) {
            CoreModule.f18264c.f20446z2.m31261z3(CoreJustVerificationCardApi.JustRealStatus.IDLE);
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m178215y(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m178216z(Act act, pf60 pf60Var) {
        if (((Boolean) pf60Var.f152156a).booleanValue() || ((Boolean) pf60Var.f152157b).booleanValue()) {
            CoreModule.f18264c.f20446z2.m31258w3();
            if (!((Boolean) pf60Var.f152157b).booleanValue()) {
                CoreModule.f18264c.f20446z2.m31244i3();
                CoreModule.f18264c.f20446z2.m31243h3();
                return;
            }
            boolean zM31253r3 = CoreModule.f18264c.f20446z2.m31253r3();
            boolean z = CoreModule.f18264c.f20446z2.m31245j3() == CoreJustVerificationCardApi.JustRealStatus.TRIALING;
            m178186V(act);
            CoreModule.f18264c.f20446z2.m31243h3();
            if (zM31253r3) {
                if (z) {
                    act.postDelayed(f159597a, z ? 300L : 0L);
                } else {
                    CoreModule.f18264c.f20405m0.m32053S8();
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.quq$g */
    public class C19675g implements x20 {
        @Override // p153l.x20
        public void call() {
        }
    }
}
