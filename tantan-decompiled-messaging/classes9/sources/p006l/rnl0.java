package p006l;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.data.Coupon;
import com.p1.mobile.putong.core.data.Merchandise;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import l.b1c0;
import l.c4g0;
import l.cpk0;
import l.e30;
import l.eqh0;
import l.j760;
import l.jo0;
import l.mkd0;
import l.mqi0;
import l.rxa0;
import l.snl0;
import l.svq;
import l.szd;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.y7c0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;
import v.VImage;
import v.VText;
import v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010*\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010!\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R\"\u0010.\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010!\u001a\u0004\b,\u0010#\"\u0004\b-\u0010%R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006?"}, d2 = {"Ll/rnl0;", "", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "i", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandise", "", "s", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/Merchandise;)V", "Ll/szd;", "dialog", "p", "(Ll/szd;)V", "q", "o", "r", "", "template", "countdown", "", "j", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/CharSequence;", "Lv/VText;", "a", "Lv/VText;", "n", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "b", "m", "set_subtitle", "_subtitle", "c", "k", "set_btn", "_btn", "Lv/VImage;", "d", "Lv/VImage;", "l", "()Lv/VImage;", "set_close", "(Lv/VImage;)V", "_close", "e", "Lcom/p1/mobile/android/app/Act;", "f", "Lcom/p1/mobile/putong/core/data/Merchandise;", "Ll/c4g0;", "g", "Ll/c4g0;", "countDownSub", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class rnl0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VText _subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _btn;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VImage _close;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public Act act;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public Merchandise merchandise;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public c4g0 countDownSub;

    /* JADX INFO: renamed from: a */
    public static Boolean m22866a(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b */
    public static void m22867b(rnl0 rnl0Var, szd szdVar, View view) {
        zvf0.u("e_viptrial_pop", "p_suggest_users_home_view", new j760[]{vwb.Y("button_type", "open")});
        Merchandise merchandise = rnl0Var.merchandise;
        Merchandise merchandise2 = null;
        if (merchandise == null) {
            Intrinsics.r("merchandise");
            merchandise = null;
        }
        Coupon couponForPromotion = merchandise.getCouponForPromotion("trial7DVIP");
        Act act = rnl0Var.act;
        if (act == null) {
            Intrinsics.r("act");
            act = null;
        }
        cpk0.a aVar = new cpk0.a(act);
        Merchandise merchandise3 = rnl0Var.merchandise;
        if (merchandise3 == null) {
            Intrinsics.r("merchandise");
        } else {
            merchandise2 = merchandise3;
        }
        cpk0.a aVarD = aVar.d(merchandise2);
        couponForPromotion.getClass();
        aVarD.b(couponForPromotion).c("p_promotion,viptrial_default").e();
        szdVar.dismiss();
    }

    /* JADX INFO: renamed from: c */
    public static void m22868c(rnl0 rnl0Var, Long l2) {
        rnl0Var.m22883r();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m22869d(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4 || dialogInterface == null) {
            return false;
        }
        dialogInterface.cancel();
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static void m22870e(rnl0 rnl0Var, DialogInterface dialogInterface) {
        rnl0Var.m22882q();
    }

    /* JADX INFO: renamed from: f */
    public static void m22871f(rnl0 rnl0Var, DialogInterface dialogInterface) {
        rnl0Var.m22882q();
        rxa0.z(false);
    }

    /* JADX INFO: renamed from: g */
    public static void m22872g(szd szdVar, View view) {
        zvf0.u("e_viptrial_pop", "p_suggest_users_home_view", new j760[]{vwb.Y("button_type", "close")});
        szdVar.cancel();
    }

    /* JADX INFO: renamed from: h */
    public static Boolean m22873h(rnl0 rnl0Var, Long l2) {
        Merchandise merchandise = rnl0Var.merchandise;
        if (merchandise == null) {
            Intrinsics.r("merchandise");
            merchandise = null;
        }
        return Boolean.valueOf(merchandise.getCouponForPromotion("trial7DVIP").endTime - ((double) mqi0.o()) <= 0.0d);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final View m22874i(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = snl0.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: j */
    public final CharSequence m22875j(String template, String countdown) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(template, Arrays.copyOf(new Object[]{countdown}, 1));
        int iC0 = StringsKt.c0(str, countdown, 0, false, 6, (Object) null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        Typeface typefaceC = eqh0.c(2);
        Act act = this.act;
        if (act == null) {
            Intrinsics.r("act");
            act = null;
        }
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", typefaceC, act.color(b1c0.l), t100.f(13)), iC0, countdown.length() + iC0, 33);
        return spannableStringBuilder;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VText m22876k() {
        VText vText = this._btn;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VImage m22877l() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final VText m22878m() {
        VText vText = this._subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_subtitle");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VText m22879n() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_title");
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final void m22880o(szd dialog) {
        c cVarObserveOn = dialog.duringCreated(c.interval(1L, TimeUnit.SECONDS)).distinctUntilChanged().onBackpressureLatest().observeOn(jo0.a());
        final Function1 function1 = new Function1() { // from class: l.mnl0
            public final Object invoke(Object obj) {
                return rnl0.m22873h(this.f17128a, (Long) obj);
            }
        };
        this.countDownSub = cVarObserveOn.takeUntil(new w9j() { // from class: l.nnl0
            public final Object call(Object obj) {
                return rnl0.m22866a(function1, obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.onl0
            public final void call(Object obj) {
                rnl0.m22868c(this.f18295a, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p */
    public final void m22881p(final szd dialog) {
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        VText vTextM22879n = m22879n();
        Merchandise merchandise = this.merchandise;
        if (merchandise == null) {
            Intrinsics.r("merchandise");
            merchandise = null;
        }
        vTextM22879n.setText(numberInstance.format(merchandise.getFirstCouponPrice()) + "元秒杀7天VIP");
        m22883r();
        xdl0.E0(m22876k(), new View.OnClickListener() { // from class: l.pnl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rnl0.m22867b(this.f19228a, dialog, view);
            }
        });
        xdl0.E0(m22877l(), new View.OnClickListener() { // from class: l.qnl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rnl0.m22872g(dialog, view);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final void m22882q() {
        mkd0.z(this.countDownSub);
    }

    /* JADX INFO: renamed from: r */
    public final void m22883r() {
        Merchandise merchandise = this.merchandise;
        if (merchandise == null) {
            Intrinsics.r("merchandise");
            merchandise = null;
        }
        long jO = (long) (merchandise.getCouponForPromotion("trial7DVIP").endTime - mqi0.o());
        if (jO <= 0) {
            m22878m().setText(m22875j("优惠将于%s后到期", "00:00:00"));
            return;
        }
        if (jO > 86400000) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            m22878m().setText(m22875j("优惠将于%s后到期", String.format(Locale.ENGLISH, "%d天", Arrays.copyOf(new Object[]{Integer.valueOf((int) (jO / 86400000))}, 1))));
        } else {
            int i = (int) (jO / 3600000);
            int i2 = (int) ((jO % 3600000) / 60000);
            int i3 = ((int) (jO % 60000)) / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO;
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            m22878m().setText(m22875j("优惠将于%s后到期", String.format(Locale.ENGLISH, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, 3))));
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m22884s(@NotNull Act act, @NotNull Merchandise merchandise) {
        act.getClass();
        merchandise.getClass();
        this.act = act;
        this.merchandise = merchandise;
        LayoutInflater layoutInflaterInflater = act.inflater();
        layoutInflaterInflater.getClass();
        Dialog dialogZ = act.dialog().P(m22874i(layoutInflaterInflater, null), false).Z(17).B(false).i0(new DialogInterface.OnKeyListener() { // from class: l.jnl0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return rnl0.m22869d(dialogInterface, i, keyEvent);
            }
        }).L(y7c0.i).r(act.color(b1c0.g0)).V(new DialogInterface.OnDismissListener() { // from class: l.knl0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                rnl0.m22871f(this.f15917a, dialogInterface);
            }
        }).A(new DialogInterface.OnCancelListener() { // from class: l.lnl0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                rnl0.m22870e(this.f16533a, dialogInterface);
            }
        }).z();
        dialogZ.getClass();
        m22881p(dialogZ);
        m22880o(dialogZ);
        zvf0.x("e_viptrial_pop", "p_suggest_users_home_view");
        dialogZ.show();
        Window window = dialogZ.getWindow();
        if (window != null) {
            window.setLayout(svq.c(311), -2);
        }
    }
}
