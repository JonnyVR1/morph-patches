package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p051p1.mobile.putong.core.buzz.R$string;
import com.p051p1.mobile.putong.core.data.LoveBuzzData;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.BuzzRegionChooseView;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.LoveBuzzWarnView;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.p051p1.mobile.putong.data.OMSTemplateType;
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
import p151v.VListCell;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\r\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u0014\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0017\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u001a\u0010\u001bJ;\u0010\u001c\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u001c\u0010\u001bJ%\u0010\u001e\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010 2\u0006\u0010$\u001a\u00020\u000f¢\u0006\u0004\b%\u0010&J%\u0010'\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b'\u0010\u001fJ%\u0010(\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b(\u0010\u001fJ3\u0010)\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b)\u0010*J;\u0010+\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b+\u0010\u0015J\u0017\u0010,\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b.\u0010-J/\u0010/\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b/\u0010\u0018J/\u00100\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b0\u0010\u0018¨\u00061"}, m88121d2 = {"Ll/d8w;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "type", "from", "Lkotlin/Function0;", "", "rechargeSuc", "buySuc", "J", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "L", "()I", "onPositive", "onNegative", "Y", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "onConfirm", "R", "(Lcom/p1/mobile/android/app/Act;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V", "success", "N", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Q", SysnotifListener.ACTION_DISMISS, "X", "(Lcom/p1/mobile/android/app/Act;Lkotlin/jvm/functions/Function0;)V", "Landroid/app/Dialog;", "M", "(Lcom/p1/mobile/android/app/Act;)Landroid/app/Dialog;", OMSTemplateType.dialog, "percent", "e0", "(Landroid/app/Dialog;I)V", "d0", "W", p7f.GPS_MEASUREMENT_INTERRUPTED, "(Lcom/p1/mobile/android/app/Act;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Z", "c0", "(Lcom/p1/mobile/android/app/Act;)V", p7f.LATITUDE_SOUTH, "a0", p7f.GPS_DIRECTION_TRUE, "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class d8w {

    @NotNull
    public static final d8w INSTANCE = new d8w();

    /* JADX INFO: renamed from: A */
    public static void m114925A() {
        nbw.INSTANCE.m162236f0();
    }

    /* JADX INFO: renamed from: B */
    public static void m114926B(String str, Function0 function0) {
        nbw.INSTANCE.m162209D(true, str);
        function0.invoke();
    }

    /* JADX INFO: renamed from: C */
    public static void m114927C(l4g0 l4g0Var, DialogInterface dialogInterface) {
        w1e.m204401e(l4g0Var);
    }

    /* JADX INFO: renamed from: D */
    public static void m114928D(l4g0 l4g0Var, DialogInterface dialogInterface) {
        w1e.m204401e(l4g0Var);
    }

    /* JADX INFO: renamed from: E */
    public static void m114929E(String str) {
        nbw.INSTANCE.m162209D(false, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F */
    public static void m114930F(Ref.ObjectRef objectRef, View view) {
        nqy nqyVar = (nqy) objectRef.element;
        if (nqyVar != null) {
            nqyVar.m164362b();
        }
    }

    /* JADX INFO: renamed from: G */
    public static Unit m114931G(final Act act, final String str, final String str2, final Function0 function0) {
        xa2.INSTANCE.m209830a("IntlLoveBuzzMedia", "showBuzzBusinessDlg rechargeSuc");
        if (k8w.INSTANCE.m148752a(act)) {
            act.progress(R$string.f20952c);
            act.duringCreated(CoreModule.m30930K().mo31838xf() ? CoreModule.f18264c.f20315I0.m144059P3() : CoreModule.f18264c.f20312H0.m155449k5()).timeout(5L, TimeUnit.SECONDS).subscribe(psd0.m173597H(new y20() { // from class: l.k7w
                @Override // p153l.y20
                public final void call(Object obj) {
                    d8w.m114935O(act, str, str2, function0, (uxj0) obj);
                }
            }, new y20() { // from class: l.l7w
                @Override // p153l.y20
                public final void call(Object obj) {
                    d8w.m114936P(act, (Throwable) obj);
                }
            }));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H */
    public static void m114932H(Function0 function0) {
        nbw.INSTANCE.m162259t();
        j8w.INSTANCE.m143911i();
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m114933I(Act act) {
        nbw.INSTANCE.m162237g0();
        if (k8w.INSTANCE.m148752a(act)) {
            act.m68056e2();
        }
    }

    /* JADX INFO: renamed from: K */
    public static final void m114934K(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: O */
    public static final void m114935O(Act act, String str, String str2, Function0 function0, uxj0 uxj0Var) {
        act.progressDismiss();
        if (j8w.INSTANCE.m143904a(str)) {
            INSTANCE.m114969Q(act, str, str2, function0);
        }
    }

    /* JADX INFO: renamed from: P */
    public static final void m114936P(Act act, Throwable th) {
        act.progressDismiss();
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m114937U(d8w d8wVar, Act act, Function0 function0, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "voiceBuzz";
        }
        d8wVar.m114972T(act, function0, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m114938a(String str, Ref.ObjectRef objectRef, View view) {
        nbw.INSTANCE.m162260t0(str);
        w30 w30Var = (w30) objectRef.element;
        if (w30Var != null) {
            w30Var.m204614b();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m114939b(l4g0 l4g0Var, DialogInterface dialogInterface) {
        w1e.m204401e(l4g0Var);
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m114940b0(d8w d8wVar, Act act, Function0 function0, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "voiceBuzz";
        }
        d8wVar.m114978a0(act, function0, str);
    }

    /* JADX INFO: renamed from: c */
    public static void m114941c(String str, Function0 function0) {
        nbw.INSTANCE.m162246m(str);
        function0.invoke();
    }

    /* JADX INFO: renamed from: d */
    public static void m114942d(Function0 function0) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: e */
    public static void m114943e(l4g0 l4g0Var, DialogInterface dialogInterface) {
        w1e.m204401e(l4g0Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m114944f(String str, Function0 function0) {
        nbw.INSTANCE.m162256r0(str);
        haw.INSTANCE.m134320a().m134272J0(-1);
        function0.invoke();
    }

    /* JADX INFO: renamed from: h */
    public static void m114946h(String str, Function0 function0) {
        nbw.INSTANCE.m162254q0(str);
        function0.invoke();
    }

    /* JADX INFO: renamed from: i */
    public static void m114947i(l4g0 l4g0Var, DialogInterface dialogInterface) {
        w1e.m204401e(l4g0Var);
    }

    /* JADX INFO: renamed from: j */
    public static void m114948j(l4g0 l4g0Var, DialogInterface dialogInterface) {
        w1e.m204401e(l4g0Var);
    }

    /* JADX INFO: renamed from: k */
    public static void m114949k(CompoundButton compoundButton, boolean z) {
        compoundButton.getClass();
        j8w.INSTANCE.m143912j(z);
    }

    /* JADX INFO: renamed from: l */
    public static void m114950l(LoveBuzzWarnView loveBuzzWarnView, jl80 jl80Var, View view) {
        nbw.INSTANCE.m162207B0();
        loveBuzzWarnView.m48401b();
        jl80Var.dismiss();
    }

    /* JADX INFO: renamed from: o */
    public static void m114953o(String str) {
        nbw.INSTANCE.m162265w0(false, str);
    }

    /* JADX INFO: renamed from: p */
    public static void m114954p(Act act, final Function0 function0, PurchaseType purchaseType) {
        if (k8w.INSTANCE.m148752a(act)) {
            l51.m152886F(act, new Runnable() { // from class: l.v7w
                @Override // java.lang.Runnable
                public final void run() {
                    d8w.m114934K(function0);
                }
            });
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m114955q(Function0 function0) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: r */
    public static void m114956r(Function0 function0) {
        function0.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public static void m114957s(Act act, Function0 function0, String str, Ref.ObjectRef objectRef, VListCell vListCell, VListCell.C22660a c22660a, int i) {
        INSTANCE.m114970R(act, function0, str);
        w30 w30Var = (w30) objectRef.element;
        if (w30Var != null) {
            w30Var.m204614b();
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m114958t(l4g0 l4g0Var, DialogInterface dialogInterface) {
        w1e.m204401e(l4g0Var);
    }

    /* JADX INFO: renamed from: u */
    public static void m114959u(String str, Function0 function0) {
        nbw.INSTANCE.m162265w0(true, str);
        function0.invoke();
    }

    /* JADX INFO: renamed from: v */
    public static void m114960v(l4g0 l4g0Var, DialogInterface dialogInterface) {
        w1e.m204401e(l4g0Var);
    }

    /* JADX INFO: renamed from: w */
    public static void m114961w(l4g0 l4g0Var, DialogInterface dialogInterface) {
        w1e.m204401e(l4g0Var);
    }

    /* JADX INFO: renamed from: x */
    public static void m114962x(Function0 function0) {
        function0.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public static void m114963y(Ref.ObjectRef objectRef, View view) {
        w30 w30Var = (w30) objectRef.element;
        if (w30Var != null) {
            w30Var.m204614b();
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m114964z(Function0 function0, l4g0 l4g0Var, DialogInterface dialogInterface) {
        function0.invoke();
        w1e.m204401e(l4g0Var);
    }

    /* JADX INFO: renamed from: J */
    public final void m114965J(final Act act, String type, String from, final Function0<Unit> rechargeSuc, Function0<Unit> buySuc) {
        if (k8w.INSTANCE.m148752a(act)) {
            j8w j8wVar = j8w.INSTANCE;
            if (j8wVar.m143904a(type)) {
                m114969Q(act, type, from, buySuc);
            } else {
                CoreModule.f18273l.m143410g().mo36078sm(act, from, j8wVar.m143910h(type), new y20() { // from class: l.h7w
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        d8w.m114954p(act, rechargeSuc, (PurchaseType) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final int m114966L() {
        return CoreModule.m30930K().mo31838xf() ? R$string.f20984n : R$string.f20973j;
    }

    @Nullable
    /* JADX INFO: renamed from: M */
    public final Dialog m114967M(@Nullable Act act) {
        Dialog dialogProgress = null;
        if (!k8w.INSTANCE.m148752a(act)) {
            return null;
        }
        if (act != null) {
            act.progressDismiss();
        }
        if (act != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            dialogProgress = act.progress(String.format("%s %d%%", Arrays.copyOf(new Object[]{k3d0.m148007c(R$string.f21004x), 0}, 2)));
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
    public final void m114968N(@NotNull final Act act, @NotNull final String type, @Nullable String from, @Nullable final Function0<Unit> success) {
        final String str;
        act.getClass();
        type.getClass();
        if (k8w.INSTANCE.m148752a(act)) {
            if (!c69.m108118d()) {
                o1j0.m165649w(R$string.f20968h0);
                return;
            }
            LoveBuzzData loveBuzzDataM134315v0 = haw.INSTANCE.m134320a().m134315v0();
            boolean z = loveBuzzDataM134315v0 != null ? loveBuzzDataM134315v0.potentialPremium : true;
            if (z) {
                str = from;
            } else {
                str = from + ",low_will";
            }
            if (!joa.m146386f4() || !z) {
                m114965J(act, type, str, new Function0() { // from class: l.b8w
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return d8w.m114931G(act, type, str, success);
                    }
                }, success);
                return;
            }
            CoreBusinessService coreBusinessServiceM143405a = CoreModule.f18273l.m143405a();
            if (TextUtils.isEmpty(from)) {
                from = cok0.f82895a;
            }
            coreBusinessServiceM143405a.mo34575qm(act, from, Privilege.loveBuzz, null);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m114969Q(@Nullable Act act, @NotNull String type, @Nullable String from, @Nullable final Function0<Unit> buySuc) {
        type.getClass();
        if (k8w.INSTANCE.m148752a(act)) {
            j8w j8wVar = j8w.INSTANCE;
            if (j8wVar.m143905c() && j8wVar.m143906d()) {
                if (buySuc != null) {
                    buySuc.invoke();
                    return;
                }
                return;
            }
            int iM143909g = j8wVar.m143909g(type);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String strM148007c = k3d0.m148007c(m114966L());
            strM148007c.getClass();
            SpannableStringBuilder spannableStringBuilderM175781M = q8g0.m175781M(String.format(strM148007c, Arrays.copyOf(new Object[]{Integer.valueOf(iM143909g)}, 1)), 0, Color.parseColor("#FE7E1D"), Typeface.create("sans-serif", 0), qa00.f156324k);
            l4g0 l4g0VarM204399c = w1e.m204399c("p_extra_buzz_confirm", com.p051p1.mobile.android.app.Dialog.class.getName());
            l4g0VarM204399c.m152781p(jyb.m147494Y("purchaseShowFrom", abb0.m96735b(from)));
            CoreModule.f18273l.m143405a().mo34596st(act, k3d0.m148007c(R$string.f20976k), spannableStringBuilderM175781M, k3d0.m148007c(R$string.f20967h), k3d0.m148007c(R$string.f20970i), R$string.f20979l, ebc0.f92872c, ebc0.f92870b, j8wVar.m143906d(), new mmp(qa00.f156328o), l4g0VarM204399c, new x20() { // from class: l.i7w
                @Override // p153l.x20
                public final void call() {
                    d8w.m114932H(buySuc);
                }
            }, new CompoundButton.OnCheckedChangeListener() { // from class: l.j7w
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    d8w.m114949k(compoundButton, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m114970R(Act act, final Function0<Unit> onConfirm, final String type) {
        String str;
        if (act == null || !k8w.INSTANCE.m148752a(act)) {
            return;
        }
        if (Intrinsics.m88377d(type, "videoBuzz")) {
            str = "p_buzz_video_report_popup";
        } else {
            str = Intrinsics.m88377d(type, "memojiBuzz") ? "p_buzz_memoji_report_popup" : "p_buzz_voice_calling_report_popup";
        }
        final l4g0 l4g0VarM204399c = w1e.m204399c(str, com.p051p1.mobile.android.app.Dialog.class.getName());
        jl80 jl80VarM146020O = new jl80.C17971a(act).m146055x0(R$string.f20919M0, new Object[0]).m146050s0(R$string.f20917L0, new Object[0]).m146032a0(R$string.f20915K0, new Runnable() { // from class: l.s7w
            @Override // java.lang.Runnable
            public final void run() {
                d8w.m114959u(type, onConfirm);
            }
        }).m146026U(R$string.f20913J0, new Runnable() { // from class: l.t7w
            @Override // java.lang.Runnable
            public final void run() {
                d8w.m114953o(type);
            }
        }).m146021P(true).m146018M(true).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.u7w
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                d8w.m114947i(l4g0VarM204399c, dialogInterface);
            }
        }).m146020O();
        w1e.m204402f(l4g0VarM204399c);
        jl80VarM146020O.show();
    }

    /* JADX INFO: renamed from: S */
    public final void m114971S(@Nullable final Act act) {
        if (act == null || !k8w.INSTANCE.m148752a(act)) {
            return;
        }
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_buzz_im_no_conv_exit_popup", com.p051p1.mobile.android.app.Dialog.class.getName());
        jl80 jl80VarM146020O = new jl80.C17971a(act).m146055x0(R$string.f21000v, new Object[0]).m146050s0(R$string.f20998u, new Object[0]).m146031Z(R$string.f20994s).m146027V(R$string.f20996t, new Object[0]).m146024S(ebc0.f92860S).m146021P(true).m146018M(true).m146020O();
        jl80VarM146020O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.u6w
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                d8w.m114958t(l4g0VarM204399c, dialogInterface);
            }
        });
        jl80VarM146020O.m145975W(new Runnable() { // from class: l.f7w
            @Override // java.lang.Runnable
            public final void run() {
                d8w.m114925A();
            }
        });
        jl80VarM146020O.m145974V(new Runnable() { // from class: l.q7w
            @Override // java.lang.Runnable
            public final void run() {
                d8w.m114933I(act);
            }
        });
        w1e.m204402f(l4g0VarM204399c);
        jl80VarM146020O.show();
    }

    /* JADX INFO: renamed from: T */
    public final void m114972T(@Nullable Act act, @NotNull final Function0<Unit> onConfirm, @NotNull final String type) {
        String str;
        onConfirm.getClass();
        type.getClass();
        if (act == null || !k8w.INSTANCE.m148752a(act)) {
            return;
        }
        if (Intrinsics.m88377d(type, "videoBuzz")) {
            str = "p_buzz_video_exit_popup";
        } else {
            str = Intrinsics.m88377d(type, "memojiBuzz") ? "p_buzz_memoji_exit_popup" : "p_buzz_voice_calling_exit_popup";
        }
        final l4g0 l4g0VarM204399c = w1e.m204399c(str, com.p051p1.mobile.android.app.Dialog.class.getName());
        jl80 jl80VarM146020O = new jl80.C17971a(act).m146055x0(R$string.f20901D0, new Object[0]).m146050s0(R$string.f20899C0, new Object[0]).m146032a0(R$string.f20895A0, new Runnable() { // from class: l.m7w
            @Override // java.lang.Runnable
            public final void run() {
                d8w.m114929E(type);
            }
        }).m146026U(R$string.f20897B0, new Runnable() { // from class: l.n7w
            @Override // java.lang.Runnable
            public final void run() {
                d8w.m114926B(type, onConfirm);
            }
        }).m146021P(true).m146018M(true).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.o7w
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                d8w.m114960v(l4g0VarM204399c, dialogInterface);
            }
        }).m146020O();
        w1e.m204402f(l4g0VarM204399c);
        jl80VarM146020O.show();
    }

    /* JADX INFO: renamed from: V */
    public final void m114973V(@Nullable Act act, @NotNull final Function0<Unit> onPositive, @NotNull final Function0<Unit> onNegative) {
        onPositive.getClass();
        onNegative.getClass();
        if (act == null || !k8w.INSTANCE.m148752a(act)) {
            return;
        }
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_intl_buzz_quit_popup", com.p051p1.mobile.android.app.Dialog.class.getName());
        jl80 jl80VarM146020O = new jl80.C17971a(act).m146055x0(R$string.f20956d0, new Object[0]).m146050s0(R$string.f20953c0, new Object[0]).m146032a0(R$string.f20947a0, new Runnable() { // from class: l.y7w
            @Override // java.lang.Runnable
            public final void run() {
                d8w.m114955q(onPositive);
            }
        }).m146026U(R$string.f20950b0, new Runnable() { // from class: l.z7w
            @Override // java.lang.Runnable
            public final void run() {
                d8w.m114942d(onNegative);
            }
        }).m146021P(false).m146018M(true).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.a8w
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                d8w.m114961w(l4g0VarM204399c, dialogInterface);
            }
        }).m146020O();
        w1e.m204402f(l4g0VarM204399c);
        jl80VarM146020O.show();
    }

    /* JADX INFO: renamed from: W */
    public final void m114974W(@Nullable Act act, @NotNull final Function0<Unit> onPositive) {
        onPositive.getClass();
        if (act == null || !k8w.INSTANCE.m148752a(act)) {
            return;
        }
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_intl_buzz_superheat_popup", com.p051p1.mobile.android.app.Dialog.class.getName());
        jl80 jl80VarM146020O = new jl80.C17971a(act).m146055x0(R$string.f20990q, new Object[0]).m146050s0(R$string.f20988p, new Object[0]).m146032a0(R$string.f20986o, new Runnable() { // from class: l.p7w
            @Override // java.lang.Runnable
            public final void run() {
                d8w.m114956r(onPositive);
            }
        }).m146021P(true).m146018M(true).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.r7w
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                d8w.m114948j(l4g0VarM204399c, dialogInterface);
            }
        }).m146020O();
        w1e.m204402f(l4g0VarM204399c);
        jl80VarM146020O.show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, l.nqy] */
    /* JADX INFO: renamed from: X */
    public final void m114975X(@Nullable Act act, @NotNull final Function0<Unit> dismiss) {
        dismiss.getClass();
        if (act == null || !k8w.INSTANCE.m148752a(act)) {
            return;
        }
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_buzz_area_screening_popup", com.p051p1.mobile.android.app.Dialog.class.getName());
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? M164407N = new nqy.C18929a(act).m164424e0(R$string.f20930S).m164417X(ebc0.f92862U).m164416W(new View.OnClickListener() { // from class: l.b7w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d8w.m114930F(objectRef, view);
            }
        }).m164412S(mec0.f136468c).m164426g0(new DialogInterface.OnDismissListener() { // from class: l.c7w
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                d8w.m114964z(dismiss, l4g0VarM204399c, dialogInterface);
            }
        }).m164407N();
        objectRef.element = M164407N;
        View viewM164363c = M164407N.m164363c(bdc0.f76244a);
        viewM164363c.getClass();
        ((BuzzRegionChooseView) viewM164363c).m48354c(act, (nqy) objectRef.element);
        w1e.m204402f(l4g0VarM204399c);
        nqy nqyVar = (nqy) objectRef.element;
        if (nqyVar != null) {
            nqyVar.m164367g();
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m114976Y(Act act, final String type, final Function0<Unit> onPositive, final Function0<Unit> onNegative) {
        if (act == null || !k8w.INSTANCE.m148752a(act)) {
            return;
        }
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_buzz_searching_region_nomatch", com.p051p1.mobile.android.app.Dialog.class.getName());
        jl80 jl80VarM146020O = new jl80.C17971a(act).m146055x0(R$string.f20944Z, new Object[0]).m146050s0(R$string.f20940X, new Object[0]).m146032a0(R$string.f20942Y, new Runnable() { // from class: l.d7w
            @Override // java.lang.Runnable
            public final void run() {
                d8w.m114944f(type, onPositive);
            }
        }).m146026U(R$string.f20936V, new Runnable() { // from class: l.e7w
            @Override // java.lang.Runnable
            public final void run() {
                d8w.m114946h(type, onNegative);
            }
        }).m146021P(false).m146018M(true).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.g7w
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                d8w.m114928D(l4g0VarM204399c, dialogInterface);
            }
        }).m146020O();
        w1e.m204402f(l4g0VarM204399c);
        jl80VarM146020O.show();
    }

    /* JADX INFO: renamed from: Z */
    public final void m114977Z(@Nullable Act act, @NotNull final String type, @NotNull final Function0<Unit> onPositive, @NotNull final Function0<Unit> onNegative) {
        type.getClass();
        onPositive.getClass();
        onNegative.getClass();
        if (act == null || !k8w.INSTANCE.m148752a(act)) {
            return;
        }
        boolean z = haw.INSTANCE.m134320a().m134314u0() == -1;
        if (!Intrinsics.m88377d(type, "textBuzz") && !z) {
            m114976Y(act, type, onNegative, onPositive);
            return;
        }
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_intl_buzz_no_pair_popup", com.p051p1.mobile.android.app.Dialog.class.getName());
        jl80 jl80VarM146020O = new jl80.C17971a(act).m146055x0(R$string.f20904F, new Object[0]).m146050s0(R$string.f20902E, new Object[0]).m146032a0(R$string.f20898C, new Runnable() { // from class: l.c8w
            @Override // java.lang.Runnable
            public final void run() {
                d8w.m114941c(type, onPositive);
            }
        }).m146026U(R$string.f20900D, new Runnable() { // from class: l.v6w
            @Override // java.lang.Runnable
            public final void run() {
                d8w.m114962x(onNegative);
            }
        }).m146021P(false).m146018M(true).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.w6w
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                d8w.m114939b(l4g0VarM204399c, dialogInterface);
            }
        }).m146020O();
        w1e.m204402f(l4g0VarM204399c);
        jl80VarM146020O.show();
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [T, l.w30] */
    /* JADX INFO: renamed from: a0 */
    public final void m114978a0(@Nullable final Act act, @NotNull final Function0<Unit> onConfirm, @NotNull final String type) {
        String str;
        onConfirm.getClass();
        type.getClass();
        if (act == null || !k8w.INSTANCE.m148752a(act)) {
            return;
        }
        if (Intrinsics.m88377d(type, "videoBuzz")) {
            str = "p_buzz_video_report_reason";
        } else {
            str = Intrinsics.m88377d(type, "memojiBuzz") ? "p_buzz_memoji_report_reason" : "p_buzz_voice_calling_report_reason";
        }
        final l4g0 l4g0VarM204399c = w1e.m204399c(str, com.p051p1.mobile.android.app.Dialog.class.getName());
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ArrayList arrayListM147507f0 = jyb.m147507f0(k3d0.m148007c(R$string.f20921N0), k3d0.m148007c(R$string.f20923O0), k3d0.m148007c(R$string.f20925P0), k3d0.m148007c(R$string.f20927Q0), k3d0.m148007c(R$string.f20929R0));
        if (arrayListM147507f0 == null) {
            arrayListM147507f0 = null;
        }
        if (arrayListM147507f0 == null) {
            return;
        }
        ?? M204654F = new w30.C21001b(act).m204657I(act.getResources().getString(R$string.f20946a)).m204669U(new View.OnClickListener() { // from class: l.x6w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d8w.m114963y(objectRef, view);
            }
        }).m204668T(new DialogInterface.OnDismissListener() { // from class: l.y6w
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                d8w.m114943e(l4g0VarM204399c, dialogInterface);
            }
        }).m204665Q(arrayListM147507f0).m204670V(new w30.InterfaceC21003d() { // from class: l.z6w
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                d8w.m114957s(act, onConfirm, type, objectRef, vListCell, c22660a, i);
            }
        }).m204669U(new View.OnClickListener() { // from class: l.a7w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d8w.m114938a(type, objectRef, view);
            }
        }).m204663O(mec0.f136459B).m204654F();
        objectRef.element = M204654F;
        M204654F.m204618f();
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m114979c0(@Nullable Act act) {
        if (act == null || !k8w.INSTANCE.m148752a(act)) {
            return;
        }
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_buzz_warning", com.p051p1.mobile.android.app.Dialog.class.getName());
        View viewInflate = p9r.m171370a(act).inflate(mec0.f136489x, (ViewGroup) null);
        final LoveBuzzWarnView loveBuzzWarnView = viewInflate instanceof LoveBuzzWarnView ? (LoveBuzzWarnView) viewInflate : null;
        if (loveBuzzWarnView == null) {
            return;
        }
        final jl80 jl80VarM146020O = new jl80.C17971a(act).m146023R(loveBuzzWarnView).m146021P(false).m146020O();
        loveBuzzWarnView.setClickListener(new View.OnClickListener() { // from class: l.w7w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d8w.m114950l(loveBuzzWarnView, jl80VarM146020O, view);
            }
        });
        jl80VarM146020O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.x7w
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                d8w.m114927C(l4g0VarM204399c, dialogInterface);
            }
        });
        w1e.m204402f(l4g0VarM204399c);
        jl80VarM146020O.show();
    }

    /* JADX INFO: renamed from: d0 */
    public final void m114980d0(@Nullable Act act, @NotNull Function0<Unit> onPositive) {
        onPositive.getClass();
        if (act != null && k8w.INSTANCE.m148752a(act) && c69.m108118d() && joa.m146386f4()) {
            haw.INSTANCE.m134320a().m134315v0();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m114981e0(@Nullable Dialog dialog, int percent) {
        View decorView;
        if (dialog == null) {
            return;
        }
        Window window = dialog.getWindow();
        View viewFindViewById = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.findViewById(bdc0.f76248e);
        View view = viewFindViewById != null ? viewFindViewById : null;
        if (view != null && (view instanceof TextView)) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            ((TextView) view).setText(String.format("%s %d%%", Arrays.copyOf(new Object[]{k3d0.m148007c(R$string.f21004x), Integer.valueOf(percent)}, 2)));
        }
    }
}
