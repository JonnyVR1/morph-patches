package p149l;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p046p1.mobile.putong.core.buzz.R$string;
import com.p046p1.mobile.putong.core.data.LoveBuzzData;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.BuzzRegionChooseView;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.LoveBuzzWarnView;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VListCell;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\r\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u0014\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0017\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u001a\u0010\u001bJ;\u0010\u001c\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u001c\u0010\u001bJ%\u0010\u001e\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010 2\u0006\u0010$\u001a\u00020\u000f¢\u0006\u0004\b%\u0010&J%\u0010'\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b'\u0010\u001fJ%\u0010(\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b(\u0010\u001fJ3\u0010)\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b)\u0010*J;\u0010+\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b+\u0010\u0015J\u0017\u0010,\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b.\u0010-J/\u0010/\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b/\u0010\u0018J/\u00100\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b0\u0010\u0018¨\u00061"}, m87232d2 = {"Ll/f6w;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "type", "from", "Lkotlin/Function0;", "", "rechargeSuc", "buySuc", "J", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "L", "()I", "onPositive", "onNegative", "Y", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "onConfirm", "R", "(Lcom/p1/mobile/android/app/Act;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V", "success", "N", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Q", SysnotifListener.ACTION_DISMISS, "X", "(Lcom/p1/mobile/android/app/Act;Lkotlin/jvm/functions/Function0;)V", "Landroid/app/Dialog;", "M", "(Lcom/p1/mobile/android/app/Act;)Landroid/app/Dialog;", OMSTemplateType.dialog, "percent", "e0", "(Landroid/app/Dialog;I)V", "d0", "W", j6f.GPS_MEASUREMENT_INTERRUPTED, "(Lcom/p1/mobile/android/app/Act;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Z", "c0", "(Lcom/p1/mobile/android/app/Act;)V", j6f.LATITUDE_SOUTH, "a0", j6f.GPS_DIRECTION_TRUE, "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class f6w {

    @NotNull
    public static final f6w INSTANCE = new f6w();

    /* JADX INFO: renamed from: A */
    public static void m119640A() {
        p9w.INSTANCE.m167932f0();
    }

    /* JADX INFO: renamed from: B */
    public static void m119641B(String str, Function0 function0) {
        p9w.INSTANCE.m167905D(true, str);
        function0.invoke();
    }

    /* JADX INFO: renamed from: C */
    public static void m119642C(cwf0 cwf0Var, DialogInterface dialogInterface) {
        i0e.m133796e(cwf0Var);
    }

    /* JADX INFO: renamed from: D */
    public static void m119643D(cwf0 cwf0Var, DialogInterface dialogInterface) {
        i0e.m133796e(cwf0Var);
    }

    /* JADX INFO: renamed from: E */
    public static void m119644E(String str) {
        p9w.INSTANCE.m167905D(false, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F */
    public static void m119645F(Ref.ObjectRef objectRef, View view) {
        qhy qhyVar = (qhy) objectRef.element;
        if (qhyVar != null) {
            qhyVar.m174609b();
        }
    }

    /* JADX INFO: renamed from: G */
    public static Unit m119646G(final Act act, final String str, final String str2, final Function0 function0) {
        qa2.INSTANCE.m173681a("IntlLoveBuzzMedia", "showBuzzBusinessDlg rechargeSuc");
        if (m6w.INSTANCE.m153296a(act)) {
            act.progress(R$string.f20210c);
            act.duringCreated(CoreModule.m29932K().mo30835xf() ? CoreModule.f17545c.f19573I0.m140262P3() : CoreModule.f17545c.f19570H0.m210361k5()).timeout(5L, TimeUnit.SECONDS).subscribe(mkd0.m154956H(new e30() { // from class: l.m5w
                @Override // p149l.e30
                public final void call(Object obj) {
                    f6w.m119650O(act, str, str2, function0, (roj0) obj);
                }
            }, new e30() { // from class: l.n5w
                @Override // p149l.e30
                public final void call(Object obj) {
                    f6w.m119651P(act, (Throwable) obj);
                }
            }));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H */
    public static void m119647H(Function0 function0) {
        p9w.INSTANCE.m167955t();
        l6w.INSTANCE.m148780i();
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m119648I(Act act) {
        p9w.INSTANCE.m167933g0();
        if (m6w.INSTANCE.m153296a(act)) {
            act.m66873d2();
        }
    }

    /* JADX INFO: renamed from: K */
    public static final void m119649K(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: O */
    public static final void m119650O(Act act, String str, String str2, Function0 function0, roj0 roj0Var) {
        act.progressDismiss();
        if (l6w.INSTANCE.m148773a(str)) {
            INSTANCE.m119684Q(act, str, str2, function0);
        }
    }

    /* JADX INFO: renamed from: P */
    public static final void m119651P(Act act, Throwable th) {
        act.progressDismiss();
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m119652U(f6w f6wVar, Act act, Function0 function0, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "voiceBuzz";
        }
        f6wVar.m119687T(act, function0, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m119653a(String str, Ref.ObjectRef objectRef, View view) {
        p9w.INSTANCE.m167956t0(str);
        c40 c40Var = (c40) objectRef.element;
        if (c40Var != null) {
            c40Var.m105113b();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m119654b(cwf0 cwf0Var, DialogInterface dialogInterface) {
        i0e.m133796e(cwf0Var);
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m119655b0(f6w f6wVar, Act act, Function0 function0, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "voiceBuzz";
        }
        f6wVar.m119693a0(act, function0, str);
    }

    /* JADX INFO: renamed from: c */
    public static void m119656c(String str, Function0 function0) {
        p9w.INSTANCE.m167942m(str);
        function0.invoke();
    }

    /* JADX INFO: renamed from: d */
    public static void m119657d(Function0 function0) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: e */
    public static void m119658e(cwf0 cwf0Var, DialogInterface dialogInterface) {
        i0e.m133796e(cwf0Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m119659f(String str, Function0 function0) {
        p9w.INSTANCE.m167952r0(str);
        j8w.INSTANCE.m140473a().m140425J0(-1);
        function0.invoke();
    }

    /* JADX INFO: renamed from: h */
    public static void m119661h(String str, Function0 function0) {
        p9w.INSTANCE.m167950q0(str);
        function0.invoke();
    }

    /* JADX INFO: renamed from: i */
    public static void m119662i(cwf0 cwf0Var, DialogInterface dialogInterface) {
        i0e.m133796e(cwf0Var);
    }

    /* JADX INFO: renamed from: j */
    public static void m119663j(cwf0 cwf0Var, DialogInterface dialogInterface) {
        i0e.m133796e(cwf0Var);
    }

    /* JADX INFO: renamed from: k */
    public static void m119664k(CompoundButton compoundButton, boolean z) {
        compoundButton.getClass();
        l6w.INSTANCE.m148781j(z);
    }

    /* JADX INFO: renamed from: l */
    public static void m119665l(LoveBuzzWarnView loveBuzzWarnView, dd80 dd80Var, View view) {
        p9w.INSTANCE.m167903B0();
        loveBuzzWarnView.m47218b();
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: o */
    public static void m119668o(String str) {
        p9w.INSTANCE.m167961w0(false, str);
    }

    /* JADX INFO: renamed from: p */
    public static void m119669p(Act act, final Function0 function0, PurchaseType purchaseType) {
        if (m6w.INSTANCE.m153296a(act)) {
            e51.m114741F(act, new Runnable() { // from class: l.x5w
                @Override // java.lang.Runnable
                public final void run() {
                    f6w.m119649K(function0);
                }
            });
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m119670q(Function0 function0) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: r */
    public static void m119671r(Function0 function0) {
        function0.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public static void m119672s(Act act, Function0 function0, String str, Ref.ObjectRef objectRef, VListCell vListCell, VListCell.C22545a c22545a, int i) {
        INSTANCE.m119685R(act, function0, str);
        c40 c40Var = (c40) objectRef.element;
        if (c40Var != null) {
            c40Var.m105113b();
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m119673t(cwf0 cwf0Var, DialogInterface dialogInterface) {
        i0e.m133796e(cwf0Var);
    }

    /* JADX INFO: renamed from: u */
    public static void m119674u(String str, Function0 function0) {
        p9w.INSTANCE.m167961w0(true, str);
        function0.invoke();
    }

    /* JADX INFO: renamed from: v */
    public static void m119675v(cwf0 cwf0Var, DialogInterface dialogInterface) {
        i0e.m133796e(cwf0Var);
    }

    /* JADX INFO: renamed from: w */
    public static void m119676w(cwf0 cwf0Var, DialogInterface dialogInterface) {
        i0e.m133796e(cwf0Var);
    }

    /* JADX INFO: renamed from: x */
    public static void m119677x(Function0 function0) {
        function0.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public static void m119678y(Ref.ObjectRef objectRef, View view) {
        c40 c40Var = (c40) objectRef.element;
        if (c40Var != null) {
            c40Var.m105113b();
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m119679z(Function0 function0, cwf0 cwf0Var, DialogInterface dialogInterface) {
        function0.invoke();
        i0e.m133796e(cwf0Var);
    }

    /* JADX INFO: renamed from: J */
    public final void m119680J(final Act act, String type, String from, final Function0<Unit> rechargeSuc, Function0<Unit> buySuc) {
        if (m6w.INSTANCE.m153296a(act)) {
            l6w l6wVar = l6w.INSTANCE;
            if (l6wVar.m148773a(type)) {
                m119684Q(act, type, from, buySuc);
            } else {
                CoreModule.f17554l.m94656g().mo35075sm(act, from, l6wVar.m148779h(type), new e30() { // from class: l.j5w
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        f6w.m119669p(act, rechargeSuc, (PurchaseType) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final int m119681L() {
        return CoreModule.m29932K().mo30835xf() ? R$string.f20242n : R$string.f20231j;
    }

    @Nullable
    /* JADX INFO: renamed from: M */
    public final Dialog m119682M(@Nullable Act act) {
        Dialog dialogProgress = null;
        if (!m6w.INSTANCE.m153296a(act)) {
            return null;
        }
        if (act != null) {
            act.progressDismiss();
        }
        if (act != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            dialogProgress = act.progress(String.format("%s %d%%", Arrays.copyOf(new Object[]{hvc0.m133156c(R$string.f20262x), 0}, 2)));
        }
        if (dialogProgress != null) {
            dialogProgress.setCancelable(true);
        }
        if (dialogProgress != null) {
            dialogProgress.setCanceledOnTouchOutside(true);
        }
        return dialogProgress;
    }

    /* JADX INFO: renamed from: N */
    public final void m119683N(@NotNull final Act act, @NotNull final String type, @Nullable String from, @Nullable final Function0<Unit> success) {
        final String str;
        act.getClass();
        type.getClass();
        if (m6w.INSTANCE.m153296a(act)) {
            if (!t49.m187150d()) {
                lsi0.m151593w(R$string.f20226h0);
                return;
            }
            LoveBuzzData loveBuzzDataM140468v0 = j8w.INSTANCE.m140473a().m140468v0();
            boolean z = loveBuzzDataM140468v0 != null ? loveBuzzDataM140468v0.potentialPremium : true;
            if (z) {
                str = from;
            } else {
                str = from + ",low_will";
            }
            if (!xma.m210071e4() || !z) {
                m119680J(act, type, str, new Function0() { // from class: l.d6w
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return f6w.m119646G(act, type, str, success);
                    }
                }, success);
                return;
            }
            CoreBusinessService coreBusinessServiceM94651a = CoreModule.f17554l.m94651a();
            if (TextUtils.isEmpty(from)) {
                from = wek0.f185947a;
            }
            coreBusinessServiceM94651a.mo33572qm(act, from, Privilege.loveBuzz, null);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m119684Q(@Nullable Act act, @NotNull String type, @Nullable String from, @Nullable final Function0<Unit> buySuc) {
        type.getClass();
        if (m6w.INSTANCE.m153296a(act)) {
            l6w l6wVar = l6w.INSTANCE;
            if (l6wVar.m148774c() && l6wVar.m148775d()) {
                if (buySuc != null) {
                    buySuc.invoke();
                    return;
                }
                return;
            }
            int iM148778g = l6wVar.m148778g(type);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String strM133156c = hvc0.m133156c(m119681L());
            strM133156c.getClass();
            SpannableStringBuilder spannableStringBuilderM133846M = i0g0.m133846M(String.format(strM133156c, Arrays.copyOf(new Object[]{Integer.valueOf(iM148778g)}, 1)), 0, Color.parseColor("#FE7E1D"), Typeface.create("sans-serif", 0), t100.f167262k);
            cwf0 cwf0VarM133794c = i0e.m133794c("p_extra_buzz_confirm", com.p046p1.mobile.android.app.Dialog.class.getName());
            cwf0VarM133794c.m109040p(vwb.m200311Y("purchaseShowFrom", w2b0.m201088b(from)));
            CoreModule.f17554l.m94651a().mo33593st(act, hvc0.m133156c(R$string.f20234k), spannableStringBuilderM133846M, hvc0.m133156c(R$string.f20225h), hvc0.m133156c(R$string.f20228i), R$string.f20237l, y2c0.f195550c, y2c0.f195548b, l6wVar.m148775d(), new mkp(t100.f167266o), cwf0VarM133794c, new d30() { // from class: l.k5w
                @Override // p149l.d30
                public final void call() {
                    f6w.m119647H(buySuc);
                }
            }, new CompoundButton.OnCheckedChangeListener() { // from class: l.l5w
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    f6w.m119664k(compoundButton, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m119685R(Act act, final Function0<Unit> onConfirm, final String type) {
        String str;
        if (act == null || !m6w.INSTANCE.m153296a(act)) {
            return;
        }
        if (Intrinsics.m87488d(type, "videoBuzz")) {
            str = "p_buzz_video_report_popup";
        } else {
            str = Intrinsics.m87488d(type, "memojiBuzz") ? "p_buzz_memoji_report_popup" : "p_buzz_voice_calling_report_popup";
        }
        final cwf0 cwf0VarM133794c = i0e.m133794c(str, com.p046p1.mobile.android.app.Dialog.class.getName());
        dd80 dd80VarM110960O = new dd80.C16336a(act).m110995x0(R$string.f20177M0, new Object[0]).m110990s0(R$string.f20175L0, new Object[0]).m110972a0(R$string.f20173K0, new Runnable() { // from class: l.u5w
            @Override // java.lang.Runnable
            public final void run() {
                f6w.m119674u(type, onConfirm);
            }
        }).m110966U(R$string.f20171J0, new Runnable() { // from class: l.v5w
            @Override // java.lang.Runnable
            public final void run() {
                f6w.m119668o(type);
            }
        }).m110961P(true).m110958M(true).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.w5w
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                f6w.m119662i(cwf0VarM133794c, dialogInterface);
            }
        }).m110960O();
        i0e.m133797f(cwf0VarM133794c);
        dd80VarM110960O.show();
    }

    /* JADX INFO: renamed from: S */
    public final void m119686S(@Nullable final Act act) {
        if (act == null || !m6w.INSTANCE.m153296a(act)) {
            return;
        }
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_buzz_im_no_conv_exit_popup", com.p046p1.mobile.android.app.Dialog.class.getName());
        dd80 dd80VarM110960O = new dd80.C16336a(act).m110995x0(R$string.f20258v, new Object[0]).m110990s0(R$string.f20256u, new Object[0]).m110971Z(R$string.f20252s).m110967V(R$string.f20254t, new Object[0]).m110964S(y2c0.f195538S).m110961P(true).m110958M(true).m110960O();
        dd80VarM110960O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.w4w
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                f6w.m119673t(cwf0VarM133794c, dialogInterface);
            }
        });
        dd80VarM110960O.m110915W(new Runnable() { // from class: l.h5w
            @Override // java.lang.Runnable
            public final void run() {
                f6w.m119640A();
            }
        });
        dd80VarM110960O.m110914V(new Runnable() { // from class: l.s5w
            @Override // java.lang.Runnable
            public final void run() {
                f6w.m119648I(act);
            }
        });
        i0e.m133797f(cwf0VarM133794c);
        dd80VarM110960O.show();
    }

    /* JADX INFO: renamed from: T */
    public final void m119687T(@Nullable Act act, @NotNull final Function0<Unit> onConfirm, @NotNull final String type) {
        String str;
        onConfirm.getClass();
        type.getClass();
        if (act == null || !m6w.INSTANCE.m153296a(act)) {
            return;
        }
        if (Intrinsics.m87488d(type, "videoBuzz")) {
            str = "p_buzz_video_exit_popup";
        } else {
            str = Intrinsics.m87488d(type, "memojiBuzz") ? "p_buzz_memoji_exit_popup" : "p_buzz_voice_calling_exit_popup";
        }
        final cwf0 cwf0VarM133794c = i0e.m133794c(str, com.p046p1.mobile.android.app.Dialog.class.getName());
        dd80 dd80VarM110960O = new dd80.C16336a(act).m110995x0(R$string.f20159D0, new Object[0]).m110990s0(R$string.f20157C0, new Object[0]).m110972a0(R$string.f20153A0, new Runnable() { // from class: l.o5w
            @Override // java.lang.Runnable
            public final void run() {
                f6w.m119644E(type);
            }
        }).m110966U(R$string.f20155B0, new Runnable() { // from class: l.p5w
            @Override // java.lang.Runnable
            public final void run() {
                f6w.m119641B(type, onConfirm);
            }
        }).m110961P(true).m110958M(true).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.q5w
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                f6w.m119675v(cwf0VarM133794c, dialogInterface);
            }
        }).m110960O();
        i0e.m133797f(cwf0VarM133794c);
        dd80VarM110960O.show();
    }

    /* JADX INFO: renamed from: V */
    public final void m119688V(@Nullable Act act, @NotNull final Function0<Unit> onPositive, @NotNull final Function0<Unit> onNegative) {
        onPositive.getClass();
        onNegative.getClass();
        if (act == null || !m6w.INSTANCE.m153296a(act)) {
            return;
        }
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_intl_buzz_quit_popup", com.p046p1.mobile.android.app.Dialog.class.getName());
        dd80 dd80VarM110960O = new dd80.C16336a(act).m110995x0(R$string.f20214d0, new Object[0]).m110990s0(R$string.f20211c0, new Object[0]).m110972a0(R$string.f20205a0, new Runnable() { // from class: l.a6w
            @Override // java.lang.Runnable
            public final void run() {
                f6w.m119670q(onPositive);
            }
        }).m110966U(R$string.f20208b0, new Runnable() { // from class: l.b6w
            @Override // java.lang.Runnable
            public final void run() {
                f6w.m119657d(onNegative);
            }
        }).m110961P(false).m110958M(true).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.c6w
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                f6w.m119676w(cwf0VarM133794c, dialogInterface);
            }
        }).m110960O();
        i0e.m133797f(cwf0VarM133794c);
        dd80VarM110960O.show();
    }

    /* JADX INFO: renamed from: W */
    public final void m119689W(@Nullable Act act, @NotNull final Function0<Unit> onPositive) {
        onPositive.getClass();
        if (act == null || !m6w.INSTANCE.m153296a(act)) {
            return;
        }
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_intl_buzz_superheat_popup", com.p046p1.mobile.android.app.Dialog.class.getName());
        dd80 dd80VarM110960O = new dd80.C16336a(act).m110995x0(R$string.f20248q, new Object[0]).m110990s0(R$string.f20246p, new Object[0]).m110972a0(R$string.f20244o, new Runnable() { // from class: l.r5w
            @Override // java.lang.Runnable
            public final void run() {
                f6w.m119671r(onPositive);
            }
        }).m110961P(true).m110958M(true).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.t5w
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                f6w.m119663j(cwf0VarM133794c, dialogInterface);
            }
        }).m110960O();
        i0e.m133797f(cwf0VarM133794c);
        dd80VarM110960O.show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, l.qhy] */
    /* JADX INFO: renamed from: X */
    public final void m119690X(@Nullable Act act, @NotNull final Function0<Unit> dismiss) {
        dismiss.getClass();
        if (act == null || !m6w.INSTANCE.m153296a(act)) {
            return;
        }
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_buzz_area_screening_popup", com.p046p1.mobile.android.app.Dialog.class.getName());
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? M174654N = new qhy.C19502a(act).m174671e0(R$string.f20188S).m174664X(y2c0.f195540U).m174663W(new View.OnClickListener() { // from class: l.d5w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f6w.m119645F(objectRef, view);
            }
        }).m174659S(h6c0.f106026c).m174673g0(new DialogInterface.OnDismissListener() { // from class: l.e5w
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                f6w.m119679z(dismiss, cwf0VarM133794c, dialogInterface);
            }
        }).m174654N();
        objectRef.element = M174654N;
        View viewM174610c = M174654N.m174610c(v4c0.f179894a);
        viewM174610c.getClass();
        ((BuzzRegionChooseView) viewM174610c).m47171c(act, (qhy) objectRef.element);
        i0e.m133797f(cwf0VarM133794c);
        qhy qhyVar = (qhy) objectRef.element;
        if (qhyVar != null) {
            qhyVar.m174614g();
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m119691Y(Act act, final String type, final Function0<Unit> onPositive, final Function0<Unit> onNegative) {
        if (act == null || !m6w.INSTANCE.m153296a(act)) {
            return;
        }
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_buzz_searching_region_nomatch", com.p046p1.mobile.android.app.Dialog.class.getName());
        dd80 dd80VarM110960O = new dd80.C16336a(act).m110995x0(R$string.f20202Z, new Object[0]).m110990s0(R$string.f20198X, new Object[0]).m110972a0(R$string.f20200Y, new Runnable() { // from class: l.f5w
            @Override // java.lang.Runnable
            public final void run() {
                f6w.m119659f(type, onPositive);
            }
        }).m110966U(R$string.f20194V, new Runnable() { // from class: l.g5w
            @Override // java.lang.Runnable
            public final void run() {
                f6w.m119661h(type, onNegative);
            }
        }).m110961P(false).m110958M(true).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.i5w
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                f6w.m119643D(cwf0VarM133794c, dialogInterface);
            }
        }).m110960O();
        i0e.m133797f(cwf0VarM133794c);
        dd80VarM110960O.show();
    }

    /* JADX INFO: renamed from: Z */
    public final void m119692Z(@Nullable Act act, @NotNull final String type, @NotNull final Function0<Unit> onPositive, @NotNull final Function0<Unit> onNegative) {
        type.getClass();
        onPositive.getClass();
        onNegative.getClass();
        if (act == null || !m6w.INSTANCE.m153296a(act)) {
            return;
        }
        boolean z = j8w.INSTANCE.m140473a().m140467u0() == -1;
        if (!Intrinsics.m87488d(type, "textBuzz") && !z) {
            m119691Y(act, type, onNegative, onPositive);
            return;
        }
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_intl_buzz_no_pair_popup", com.p046p1.mobile.android.app.Dialog.class.getName());
        dd80 dd80VarM110960O = new dd80.C16336a(act).m110995x0(R$string.f20162F, new Object[0]).m110990s0(R$string.f20160E, new Object[0]).m110972a0(R$string.f20156C, new Runnable() { // from class: l.e6w
            @Override // java.lang.Runnable
            public final void run() {
                f6w.m119656c(type, onPositive);
            }
        }).m110966U(R$string.f20158D, new Runnable() { // from class: l.x4w
            @Override // java.lang.Runnable
            public final void run() {
                f6w.m119677x(onNegative);
            }
        }).m110961P(false).m110958M(true).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.y4w
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                f6w.m119654b(cwf0VarM133794c, dialogInterface);
            }
        }).m110960O();
        i0e.m133797f(cwf0VarM133794c);
        dd80VarM110960O.show();
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [T, l.c40] */
    /* JADX INFO: renamed from: a0 */
    public final void m119693a0(@Nullable final Act act, @NotNull final Function0<Unit> onConfirm, @NotNull final String type) {
        String str;
        onConfirm.getClass();
        type.getClass();
        if (act == null || !m6w.INSTANCE.m153296a(act)) {
            return;
        }
        if (Intrinsics.m87488d(type, "videoBuzz")) {
            str = "p_buzz_video_report_reason";
        } else {
            str = Intrinsics.m87488d(type, "memojiBuzz") ? "p_buzz_memoji_report_reason" : "p_buzz_voice_calling_report_reason";
        }
        final cwf0 cwf0VarM133794c = i0e.m133794c(str, com.p046p1.mobile.android.app.Dialog.class.getName());
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ArrayList arrayListM200324f0 = vwb.m200324f0(hvc0.m133156c(R$string.f20179N0), hvc0.m133156c(R$string.f20181O0), hvc0.m133156c(R$string.f20183P0), hvc0.m133156c(R$string.f20185Q0), hvc0.m133156c(R$string.f20187R0));
        if (arrayListM200324f0 == null) {
            arrayListM200324f0 = null;
        }
        if (arrayListM200324f0 == null) {
            return;
        }
        ?? M105153F = new c40.C16057b(act).m105156I(act.getResources().getString(R$string.f20204a)).m105168U(new View.OnClickListener() { // from class: l.z4w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f6w.m119678y(objectRef, view);
            }
        }).m105167T(new DialogInterface.OnDismissListener() { // from class: l.a5w
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                f6w.m119658e(cwf0VarM133794c, dialogInterface);
            }
        }).m105164Q(arrayListM200324f0).m105169V(new c40.InterfaceC16059d() { // from class: l.b5w
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                f6w.m119672s(act, onConfirm, type, objectRef, vListCell, c22545a, i);
            }
        }).m105168U(new View.OnClickListener() { // from class: l.c5w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f6w.m119653a(type, objectRef, view);
            }
        }).m105162O(h6c0.f106017B).m105153F();
        objectRef.element = M105153F;
        M105153F.m105117f();
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m119694c0(@Nullable Act act) {
        if (act == null || !m6w.INSTANCE.m153296a(act)) {
            return;
        }
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_buzz_warning", com.p046p1.mobile.android.app.Dialog.class.getName());
        View viewInflate = o7r.m163037a(act).inflate(h6c0.f106047x, (ViewGroup) null);
        final LoveBuzzWarnView loveBuzzWarnView = viewInflate instanceof LoveBuzzWarnView ? (LoveBuzzWarnView) viewInflate : null;
        if (loveBuzzWarnView == null) {
            return;
        }
        final dd80 dd80VarM110960O = new dd80.C16336a(act).m110963R(loveBuzzWarnView).m110961P(false).m110960O();
        loveBuzzWarnView.setClickListener(new View.OnClickListener() { // from class: l.y5w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f6w.m119665l(loveBuzzWarnView, dd80VarM110960O, view);
            }
        });
        dd80VarM110960O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.z5w
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                f6w.m119642C(cwf0VarM133794c, dialogInterface);
            }
        });
        i0e.m133797f(cwf0VarM133794c);
        dd80VarM110960O.show();
    }

    /* JADX INFO: renamed from: d0 */
    public final void m119695d0(@Nullable Act act, @NotNull Function0<Unit> onPositive) {
        onPositive.getClass();
        if (act != null && m6w.INSTANCE.m153296a(act) && t49.m187150d() && xma.m210071e4()) {
            j8w.INSTANCE.m140473a().m140468v0();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m119696e0(@Nullable Dialog dialog, int percent) {
        View decorView;
        if (dialog == null) {
            return;
        }
        Window window = dialog.getWindow();
        View viewFindViewById = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.findViewById(v4c0.f179898e);
        View view = viewFindViewById != null ? viewFindViewById : null;
        if (view != null && (view instanceof TextView)) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            ((TextView) view).setText(String.format("%s %d%%", Arrays.copyOf(new Object[]{hvc0.m133156c(R$string.f20262x), Integer.valueOf(percent)}, 2)));
        }
    }
}
