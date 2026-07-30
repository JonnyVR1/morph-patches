package p149l;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.data.Coupon;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p147v.VImage;
import p147v.VText;
import p147v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010*\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010!\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R\"\u0010.\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010!\u001a\u0004\b,\u0010#\"\u0004\b-\u0010%R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006?"}, m87232d2 = {"Ll/rnl0;", "", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", RXScreenCaptureService.KEY_INDEX, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "", BLiveStormDanmakuGiftResourceType.f44446s, "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/Merchandise;)V", "Ll/szd;", OMSTemplateType.dialog, "p", "(Ll/szd;)V", "q", "o", "r", "", "template", "countdown", "", "j", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/CharSequence;", "Lv/VText;", "a", "Lv/VText;", "n", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "b", "m", "set_subtitle", "_subtitle", "c", "k", "set_btn", "_btn", "Lv/VImage;", Constants.INAPP_DATA_TAG, "Lv/VImage;", BLiveStormDanmakuGiftResourceType.f44444l, "()Lv/VImage;", "set_close", "(Lv/VImage;)V", "_close", "e", "Lcom/p1/mobile/android/app/Act;", "f", "Lcom/p1/mobile/putong/core/data/Merchandise;", "Ll/c4g0;", "g", "Ll/c4g0;", "countDownSub", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public static Boolean m180104a(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b */
    public static void m180105b(rnl0 rnl0Var, szd szdVar, View view) {
        zvf0.m220399u("e_viptrial_pop", "p_suggest_users_home_view", vwb.m200311Y("button_type", "open"));
        Merchandise merchandise = rnl0Var.merchandise;
        Merchandise merchandise2 = null;
        if (merchandise == null) {
            Intrinsics.m87502r(Merchandise.TYPE);
            merchandise = null;
        }
        Coupon couponForPromotion = merchandise.getCouponForPromotion(MonetizationPromotionsId.trial7DVIP);
        Act act = rnl0Var.act;
        if (act == null) {
            Intrinsics.m87502r(SocialConstants.PARAM_ACT);
            act = null;
        }
        cpk0.C16206a c16206a = new cpk0.C16206a(act);
        Merchandise merchandise3 = rnl0Var.merchandise;
        if (merchandise3 == null) {
            Intrinsics.m87502r(Merchandise.TYPE);
        } else {
            merchandise2 = merchandise3;
        }
        cpk0.C16206a c16206aM108166d = c16206a.m108166d(merchandise2);
        couponForPromotion.getClass();
        c16206aM108166d.m108164b(couponForPromotion).m108165c("p_promotion,viptrial_default").m108167e();
        szdVar.dismiss();
    }

    /* JADX INFO: renamed from: c */
    public static void m180106c(rnl0 rnl0Var, Long l2) {
        rnl0Var.m180121r();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m180107d(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4 || dialogInterface == null) {
            return false;
        }
        dialogInterface.cancel();
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static void m180108e(rnl0 rnl0Var, DialogInterface dialogInterface) {
        rnl0Var.m180120q();
    }

    /* JADX INFO: renamed from: f */
    public static void m180109f(rnl0 rnl0Var, DialogInterface dialogInterface) {
        rnl0Var.m180120q();
        rxa0.m181505z(false);
    }

    /* JADX INFO: renamed from: g */
    public static void m180110g(szd szdVar, View view) {
        zvf0.m220399u("e_viptrial_pop", "p_suggest_users_home_view", vwb.m200311Y("button_type", "close"));
        szdVar.cancel();
    }

    /* JADX INFO: renamed from: h */
    public static Boolean m180111h(rnl0 rnl0Var, Long l2) {
        Merchandise merchandise = rnl0Var.merchandise;
        if (merchandise == null) {
            Intrinsics.m87502r(Merchandise.TYPE);
            merchandise = null;
        }
        return Boolean.valueOf(merchandise.getCouponForPromotion(MonetizationPromotionsId.trial7DVIP).endTime - ((double) mqi0.m155944o()) <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final View m180112i(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM185069b = snl0.m185069b(this, inflater, parent);
        viewM185069b.getClass();
        return viewM185069b;
    }

    /* JADX INFO: renamed from: j */
    public final CharSequence m180113j(String template, String countdown) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(template, Arrays.copyOf(new Object[]{countdown}, 1));
        int iC0 = StringsKt.m93436c0(str, countdown, 0, false, 6, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        Typeface typefaceM117752c = eqh0.m117752c(2);
        Act act = this.act;
        if (act == null) {
            Intrinsics.m87502r(SocialConstants.PARAM_ACT);
            act = null;
        }
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", typefaceM117752c, act.color(b1c0.f72559l), t100.m186892f(13)), iC0, countdown.length() + iC0, 33);
        return spannableStringBuilder;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VText m180114k() {
        VText vText = this._btn;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VImage m180115l() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final VText m180116m() {
        VText vText = this._subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_subtitle");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VText m180117n() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_title");
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final void m180118o(szd dialog) {
        C22306c c22306cObserveOn = dialog.duringCreated(C22306c.interval(1L, TimeUnit.SECONDS)).distinctUntilChanged().onBackpressureLatest().observeOn(jo0.m142408a());
        final Function1 function1 = new Function1() { // from class: l.mnl0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return rnl0.m180111h(this.f134762a, (Long) obj);
            }
        };
        this.countDownSub = c22306cObserveOn.takeUntil(new w9j() { // from class: l.nnl0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return rnl0.m180104a(function1, obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.onl0
            @Override // p149l.e30
            public final void call(Object obj) {
                rnl0.m180106c(this.f144800a, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p */
    public final void m180119p(final szd dialog) {
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        VText vTextM180117n = m180117n();
        Merchandise merchandise = this.merchandise;
        if (merchandise == null) {
            Intrinsics.m87502r(Merchandise.TYPE);
            merchandise = null;
        }
        vTextM180117n.setText(numberInstance.format(merchandise.getFirstCouponPrice()) + "元秒杀7天VIP");
        m180121r();
        xdl0.m208329E0(m180114k(), new View.OnClickListener() { // from class: l.pnl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rnl0.m180105b(this.f150399a, dialog, view);
            }
        });
        xdl0.m208329E0(m180115l(), new View.OnClickListener() { // from class: l.qnl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rnl0.m180110g(dialog, view);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final void m180120q() {
        mkd0.m154992z(this.countDownSub);
    }

    /* JADX INFO: renamed from: r */
    public final void m180121r() {
        Merchandise merchandise = this.merchandise;
        if (merchandise == null) {
            Intrinsics.m87502r(Merchandise.TYPE);
            merchandise = null;
        }
        long jM155944o = (long) (merchandise.getCouponForPromotion(MonetizationPromotionsId.trial7DVIP).endTime - mqi0.m155944o());
        if (jM155944o <= 0) {
            m180116m().setText(m180113j("优惠将于%s后到期", "00:00:00"));
            return;
        }
        if (jM155944o > 86400000) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            m180116m().setText(m180113j("优惠将于%s后到期", String.format(Locale.ENGLISH, "%d天", Arrays.copyOf(new Object[]{Integer.valueOf((int) (jM155944o / 86400000))}, 1))));
        } else {
            int i = (int) (jM155944o / 3600000);
            int i2 = (int) ((jM155944o % 3600000) / Constants.ONE_MIN_IN_MILLIS);
            int i3 = ((int) (jM155944o % Constants.ONE_MIN_IN_MILLIS)) / 1000;
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            m180116m().setText(m180113j("优惠将于%s后到期", String.format(Locale.ENGLISH, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, 3))));
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m180122s(@NotNull Act act, @NotNull Merchandise merchandise) {
        act.getClass();
        merchandise.getClass();
        this.act = act;
        this.merchandise = merchandise;
        LayoutInflater layoutInflaterInflater = act.inflater();
        layoutInflaterInflater.getClass();
        Dialog dialogM20567z = act.dialog().m20520P(m180112i(layoutInflaterInflater, null), false).m20530Z(17).m20496B(false).m20539i0(new DialogInterface.OnKeyListener() { // from class: l.jnl0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return rnl0.m180107d(dialogInterface, i, keyEvent);
            }
        }).m20516L(y7c0.f196699i).m20551r(act.color(b1c0.f72550g0)).m20526V(new DialogInterface.OnDismissListener() { // from class: l.knl0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                rnl0.m180109f(this.f123893a, dialogInterface);
            }
        }).m20494A(new DialogInterface.OnCancelListener() { // from class: l.lnl0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                rnl0.m180108e(this.f128998a, dialogInterface);
            }
        }).m20567z();
        dialogM20567z.getClass();
        m180119p(dialogM20567z);
        m180118o(dialogM20567z);
        zvf0.m220402x("e_viptrial_pop", "p_suggest_users_home_view");
        dialogM20567z.show();
        Window window = dialogM20567z.getWindow();
        if (window != null) {
            window.setLayout(svq.m186103c(311), -2);
        }
    }
}
