package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.data.Coupon;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p137rx.C22421c;
import p151v.VImage;
import p151v.VText;
import p151v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010*\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010!\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R\"\u0010.\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010!\u001a\u0004\b,\u0010#\"\u0004\b-\u0010%R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006?"}, m88121d2 = {"Ll/vwl0;", "", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", RXScreenCaptureService.KEY_INDEX, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "", BLiveStormDanmakuGiftResourceType.f45294s, "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/Merchandise;)V", "Ll/g1e;", OMSTemplateType.dialog, "p", "(Ll/g1e;)V", "q", "o", "r", "", "template", "countdown", "", "j", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/CharSequence;", "Lv/VText;", "a", "Lv/VText;", "n", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "b", "m", "set_subtitle", "_subtitle", "c", "k", "set_btn", "_btn", "Lv/VImage;", Constants.INAPP_DATA_TAG, "Lv/VImage;", BLiveStormDanmakuGiftResourceType.f45292l, "()Lv/VImage;", "set_close", "(Lv/VImage;)V", "_close", "e", "Lcom/p1/mobile/android/app/Act;", "f", "Lcom/p1/mobile/putong/core/data/Merchandise;", "Ll/kcg0;", "g", "Ll/kcg0;", "countDownSub", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class vwl0 {

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
    public kcg0 countDownSub;

    /* JADX INFO: renamed from: a */
    public static Boolean m203149a(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b */
    public static void m203150b(vwl0 vwl0Var, g1e g1eVar, View view) {
        i4g0.m138523u("e_viptrial_pop", "p_suggest_users_home_view", jyb.m147494Y("button_type", "open"));
        Merchandise merchandise = vwl0Var.merchandise;
        Merchandise merchandise2 = null;
        if (merchandise == null) {
            Intrinsics.m88391r(Merchandise.TYPE);
            merchandise = null;
        }
        Coupon couponForPromotion = merchandise.getCouponForPromotion(MonetizationPromotionsId.trial7DVIP);
        Act act = vwl0Var.act;
        if (act == null) {
            Intrinsics.m88391r(SocialConstants.PARAM_ACT);
            act = null;
        }
        iyk0.C17829a c17829a = new iyk0.C17829a(act);
        Merchandise merchandise3 = vwl0Var.merchandise;
        if (merchandise3 == null) {
            Intrinsics.m88391r(Merchandise.TYPE);
        } else {
            merchandise2 = merchandise3;
        }
        iyk0.C17829a c17829aM142692d = c17829a.m142692d(merchandise2);
        couponForPromotion.getClass();
        c17829aM142692d.m142690b(couponForPromotion).m142691c("p_promotion,viptrial_default").m142693e();
        g1eVar.dismiss();
    }

    /* JADX INFO: renamed from: c */
    public static void m203151c(vwl0 vwl0Var, Long l2) {
        vwl0Var.m203166r();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m203152d(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4 || dialogInterface == null) {
            return false;
        }
        dialogInterface.cancel();
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static void m203153e(vwl0 vwl0Var, DialogInterface dialogInterface) {
        vwl0Var.m203165q();
    }

    /* JADX INFO: renamed from: f */
    public static void m203154f(vwl0 vwl0Var, DialogInterface dialogInterface) {
        vwl0Var.m203165q();
        v5b0.m199800z(false);
    }

    /* JADX INFO: renamed from: g */
    public static void m203155g(g1e g1eVar, View view) {
        i4g0.m138523u("e_viptrial_pop", "p_suggest_users_home_view", jyb.m147494Y("button_type", "close"));
        g1eVar.cancel();
    }

    /* JADX INFO: renamed from: h */
    public static Boolean m203156h(vwl0 vwl0Var, Long l2) {
        Merchandise merchandise = vwl0Var.merchandise;
        if (merchandise == null) {
            Intrinsics.m88391r(Merchandise.TYPE);
            merchandise = null;
        }
        return Boolean.valueOf(merchandise.getCouponForPromotion(MonetizationPromotionsId.trial7DVIP).endTime - ((double) pzi0.m174454o()) <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final View m203157i(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM208260b = wwl0.m208260b(this, inflater, parent);
        viewM208260b.getClass();
        return viewM208260b;
    }

    /* JADX INFO: renamed from: j */
    public final CharSequence m203158j(String template, String countdown) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(template, Arrays.copyOf(new Object[]{countdown}, 1));
        int iC0 = StringsKt.m94327c0(str, countdown, 0, false, 6, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        Typeface typefaceM156283c = lyh0.m156283c(2);
        Act act = this.act;
        if (act == null) {
            Intrinsics.m88391r(SocialConstants.PARAM_ACT);
            act = null;
        }
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", typefaceM156283c, act.color(h9c0.f108379l), qa00.m175861f(13)), iC0, countdown.length() + iC0, 33);
        return spannableStringBuilder;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VText m203159k() {
        VText vText = this._btn;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VImage m203160l() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final VText m203161m() {
        VText vText = this._subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_subtitle");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VText m203162n() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_title");
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final void m203163o(g1e dialog) {
        C22421c c22421cObserveOn = dialog.duringCreated(C22421c.interval(1L, TimeUnit.SECONDS)).distinctUntilChanged().onBackpressureLatest().observeOn(fo0.m126432a());
        final Function1 function1 = new Function1() { // from class: l.qwl0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return vwl0.m203156h(this.f159946a, (Long) obj);
            }
        };
        this.countDownSub = c22421cObserveOn.takeUntil(new qcj() { // from class: l.rwl0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return vwl0.m203149a(function1, obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.swl0
            @Override // p153l.y20
            public final void call(Object obj) {
                vwl0.m203151c(this.f170981a, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p */
    public final void m203164p(final g1e dialog) {
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        VText vTextM203162n = m203162n();
        Merchandise merchandise = this.merchandise;
        if (merchandise == null) {
            Intrinsics.m88391r(Merchandise.TYPE);
            merchandise = null;
        }
        vTextM203162n.setText(numberInstance.format(merchandise.getFirstCouponPrice()) + "元秒杀7天VIP");
        m203166r();
        bnl0.m105509E0(m203159k(), new View.OnClickListener() { // from class: l.twl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vwl0.m203150b(this.f176404a, dialog, view);
            }
        });
        bnl0.m105509E0(m203160l(), new View.OnClickListener() { // from class: l.uwl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vwl0.m203155g(dialog, view);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final void m203165q() {
        psd0.m173633z(this.countDownSub);
    }

    /* JADX INFO: renamed from: r */
    public final void m203166r() {
        Merchandise merchandise = this.merchandise;
        if (merchandise == null) {
            Intrinsics.m88391r(Merchandise.TYPE);
            merchandise = null;
        }
        long jM174454o = (long) (merchandise.getCouponForPromotion(MonetizationPromotionsId.trial7DVIP).endTime - pzi0.m174454o());
        if (jM174454o <= 0) {
            m203161m().setText(m203158j("优惠将于%s后到期", "00:00:00"));
            return;
        }
        if (jM174454o > 86400000) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            m203161m().setText(m203158j("优惠将于%s后到期", String.format(Locale.ENGLISH, "%d天", Arrays.copyOf(new Object[]{Integer.valueOf((int) (jM174454o / 86400000))}, 1))));
        } else {
            int i = (int) (jM174454o / 3600000);
            int i2 = (int) ((jM174454o % 3600000) / Constants.ONE_MIN_IN_MILLIS);
            int i3 = ((int) (jM174454o % Constants.ONE_MIN_IN_MILLIS)) / 1000;
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            m203161m().setText(m203158j("优惠将于%s后到期", String.format(Locale.ENGLISH, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, 3))));
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m203167s(@NotNull Act act, @NotNull Merchandise merchandise) {
        act.getClass();
        merchandise.getClass();
        this.act = act;
        this.merchandise = merchandise;
        LayoutInflater layoutInflaterInflater = act.inflater();
        layoutInflaterInflater.getClass();
        Dialog dialogM21566z = act.dialog().m21519P(m203157i(layoutInflaterInflater, null), false).m21529Z(17).m21495B(false).m21538i0(new DialogInterface.OnKeyListener() { // from class: l.nwl0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return vwl0.m203152d(dialogInterface, i, keyEvent);
            }
        }).m21515L(dgc0.f88285j).m21550r(act.color(h9c0.f108370g0)).m21525V(new DialogInterface.OnDismissListener() { // from class: l.owl0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                vwl0.m203154f(this.f149543a, dialogInterface);
            }
        }).m21493A(new DialogInterface.OnCancelListener() { // from class: l.pwl0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                vwl0.m203153e(this.f154415a, dialogInterface);
            }
        }).m21566z();
        dialogM21566z.getClass();
        m203164p(dialogM21566z);
        m203163o(dialogM21566z);
        i4g0.m138526x("e_viptrial_pop", "p_suggest_users_home_view");
        dialogM21566z.show();
        Window window = dialogM21566z.getWindow();
        if (window != null) {
            window.setLayout(txq.m193530c(311), -2);
        }
    }
}
