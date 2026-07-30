package p153l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.Coupon;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.Prices;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.open.SocialConstants;
import io.agora.rtc2.internal.AudioRoutingController;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p151v.VImage;
import p151v.VText;
import p151v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0098\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ%\u0010\u0014\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u000eJ\u000f\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u000eJ\u000f\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u000eJ\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u000eJ\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010\u000eJ\u0017\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J\u0019\u00100\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u00010.H\u0014¢\u0006\u0004\b0\u00101J\u0019\u00104\u001a\u00020\f2\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\fH\u0016¢\u0006\u0004\b6\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010V\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010Z\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010A\u001a\u0004\bX\u0010C\"\u0004\bY\u0010ER\"\u0010^\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010Q\u001a\u0004\b\\\u0010S\"\u0004\b]\u0010UR\"\u0010f\u001a\u00020_8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010j\u001a\u00020_8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u0010a\u001a\u0004\bh\u0010c\"\u0004\bi\u0010eR\"\u0010q\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010u\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010I\u001a\u0004\bs\u0010K\"\u0004\bt\u0010MR\"\u0010y\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bv\u0010I\u001a\u0004\bw\u0010K\"\u0004\bx\u0010MR\"\u0010}\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bz\u0010I\u001a\u0004\b{\u0010K\"\u0004\b|\u0010MR$\u0010\u0081\u0001\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\b~\u0010l\u001a\u0004\b\u007f\u0010n\"\u0005\b\u0080\u0001\u0010pR\u0018\u0010\u0085\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001a\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001c\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001c\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0094\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001¨\u0006\u0099\u0001"}, m88121d2 = {"Ll/iyk0;", "Ll/g1e;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "from", "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "Lcom/p1/mobile/putong/core/data/Coupon;", "coupon", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lcom/p1/mobile/putong/core/data/Merchandise;Lcom/p1/mobile/putong/core/data/Coupon;)V", "", "d0", "()V", "Z", "", "merchandises", "", "defaultSelect", "f0", "(Ljava/util/List;I)V", "Y", "b0", "g0", "c0", "template", "countdown", "", BloodType.f39576O, "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/CharSequence;", "a0", "skuGroup", "P", "(Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "N", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Ll/x20;", SysnotifListener.ACTION_DISMISS, "e0", "(Ll/x20;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/DialogInterface;", OMSTemplateType.dialog, "onShow", "(Landroid/content/DialogInterface;)V", "onAttachedToWindow", "j", "Lcom/p1/mobile/android/app/Act;", "k", "Ljava/lang/String;", BLiveStormDanmakuGiftResourceType.f45292l, "Lcom/p1/mobile/putong/core/data/Merchandise;", "m", "Lcom/p1/mobile/putong/core/data/Coupon;", "Lv/VImage;", "n", "Lv/VImage;", "Q", "()Lv/VImage;", "set_background", "(Lv/VImage;)V", "_background", "Lv/VText;", "o", "Lv/VText;", "W", "()Lv/VText;", "set_promotion_title", "(Lv/VText;)V", "_promotion_title", "Landroid/widget/LinearLayout;", "p", "Landroid/widget/LinearLayout;", p7f.GPS_MEASUREMENT_INTERRUPTED, "()Landroid/widget/LinearLayout;", "set_privileges", "(Landroid/widget/LinearLayout;)V", "_privileges", "q", "R", "set_close", "_close", "r", "get_pay_method", "set_pay_method", "_pay_method", "Landroid/widget/TextView;", BLiveStormDanmakuGiftResourceType.f45294s, "Landroid/widget/TextView;", "U", "()Landroid/widget/TextView;", "set_pay_method_text", "(Landroid/widget/TextView;)V", "_pay_method_text", Constants.KEY_T, "get_pay_method_promotion", "set_pay_method_promotion", "_pay_method_promotion", "u", "Landroid/view/View;", "get_divider", "()Landroid/view/View;", "set_divider", "(Landroid/view/View;)V", "_divider", ResourceDirection.f39656v, p7f.LATITUDE_SOUTH, "set_countdown", "_countdown", "w", p7f.GPS_DIRECTION_TRUE, "set_get_privilege", "_get_privilege", BaseSei.f14624X, "X", "set_rule", "_rule", BaseSei.f14625Y, "get_get_privilege_divider", "set_get_privilege_divider", "_get_privilege_divider", "Ljava/text/NumberFormat;", BaseSei.f14626Z, "Ljava/text/NumberFormat;", "numberFormat", "Ll/l4g0;", "A", "Ll/l4g0;", "statisticsPageHelper", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "B", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", c4s.C_ZONE, "Ll/x20;", "Ll/lib0;", "D", "Ll/lib0;", "purchaseTrack", "Ll/kcg0;", "E", "Ll/kcg0;", "countDownSub", "a", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class iyk0 extends g1e {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final l4g0 statisticsPageHelper;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    public x20 dismiss;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    public lib0 purchaseTrack;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    public kcg0 countDownSub;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public final String from;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Merchandise merchandise;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Coupon coupon;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VImage _background;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public VText _promotion_title;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public LinearLayout _privileges;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public VImage _close;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public LinearLayout _pay_method;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public TextView _pay_method_text;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public TextView _pay_method_promotion;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public View _divider;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public VText _countdown;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public VText _get_privilege;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public VText _rule;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public View _get_privilege_divider;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final NumberFormat numberFormat;

    /* JADX INFO: renamed from: l.iyk0$a */
    @Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, m88121d2 = {"Ll/iyk0$a;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/core/data/Merchandise;)Ll/iyk0$a;", "Lcom/p1/mobile/putong/core/data/Coupon;", "coupon", "b", "(Lcom/p1/mobile/putong/core/data/Coupon;)Ll/iyk0$a;", "", "from", "c", "(Ljava/lang/String;)Ll/iyk0$a;", "Ll/iyk0;", "a", "()Ll/iyk0;", "", "e", "()V", "Lcom/p1/mobile/android/app/Act;", "Ljava/lang/String;", "Ll/x20;", "Ll/x20;", SysnotifListener.ACTION_DISMISS, "Lcom/p1/mobile/putong/core/data/Merchandise;", "Lcom/p1/mobile/putong/core/data/Coupon;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C17829a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Act act;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public String from;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public x20 dismiss;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public Merchandise merchandise;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public Coupon coupon;

        public C17829a(@NotNull Act act) {
            act.getClass();
            this.act = act;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final iyk0 m142689a() {
            Act act = this.act;
            String str = this.from;
            Merchandise merchandise = this.merchandise;
            Coupon coupon = null;
            if (merchandise == null) {
                Intrinsics.m88391r(Merchandise.TYPE);
                merchandise = null;
            }
            Coupon coupon2 = this.coupon;
            if (coupon2 == null) {
                Intrinsics.m88391r("coupon");
            } else {
                coupon = coupon2;
            }
            iyk0 iyk0Var = new iyk0(act, str, merchandise, coupon);
            iyk0Var.m142687e0(this.dismiss);
            return iyk0Var;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C17829a m142690b(@NotNull Coupon coupon) {
            coupon.getClass();
            this.coupon = coupon;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final C17829a m142691c(@Nullable String from) {
            this.from = from;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final C17829a m142692d(@NotNull Merchandise merchandise) {
            merchandise.getClass();
            this.merchandise = merchandise;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public final void m142693e() {
            m142689a().show();
        }
    }

    /* JADX INFO: renamed from: l.iyk0$b */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"l/iyk0$b", "Ll/ur2;", "", "pageId", "()Ljava/lang/String;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C17830b extends ur2 {
        @Override // p153l.e6m
        public String pageId() {
            return "p_purchase_page";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iyk0(@NotNull Act act, @Nullable String str, @NotNull Merchandise merchandise, @NotNull Coupon coupon) {
        super(act, false, dgc0.f88277b);
        act.getClass();
        merchandise.getClass();
        coupon.getClass();
        this.act = act;
        this.from = str;
        this.merchandise = merchandise;
        this.coupon = coupon;
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        this.numberFormat = numberInstance;
        this.statisticsPageHelper = new l4g0(new C17830b());
        this.purchaseType = PurchaseType.TYPE_GET_VIP;
    }

    /* JADX INFO: renamed from: E */
    public static void m142660E(iyk0 iyk0Var, View view) {
        iyk0Var.m142688g0();
    }

    /* JADX INFO: renamed from: F */
    public static Boolean m142661F(iyk0 iyk0Var, Long l2) {
        return Boolean.valueOf(iyk0Var.coupon.endTime - ((double) pzi0.m174454o()) <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    /* JADX INFO: renamed from: G */
    public static Boolean m142662G(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: H */
    public static boolean m142663H(iyk0 iyk0Var, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (i != 4 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 0) {
            return true;
        }
        iyk0Var.dismiss();
        return true;
    }

    /* JADX INFO: renamed from: I */
    public static void m142664I(iyk0 iyk0Var, View view) {
        iyk0Var.dismiss();
    }

    /* JADX INFO: renamed from: J */
    public static void m142665J(iyk0 iyk0Var, Long l2) {
        iyk0Var.m142673c0();
    }

    /* JADX INFO: renamed from: K */
    public static void m142666K(iyk0 iyk0Var, DialogInterface dialogInterface) {
        iyk0Var.m142671a0();
        x20 x20Var = iyk0Var.dismiss;
        if (x20Var != null) {
            x20Var.call();
        }
        w1e.m204401e(iyk0Var.statisticsPageHelper);
    }

    /* JADX INFO: renamed from: L */
    public static void m142667L(iyk0 iyk0Var, Integer num) {
        iyk0Var.dismiss();
    }

    /* JADX INFO: renamed from: M */
    public static void m142668M(iyk0 iyk0Var, Integer num) {
        iyk0Var.dismiss();
    }

    /* JADX INFO: renamed from: O */
    private final CharSequence m142669O(String template, String countdown) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(template, Arrays.copyOf(new Object[]{countdown}, 1));
        int iC0 = StringsKt.m94327c0(str, countdown, 0, false, 6, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", Typeface.DEFAULT_BOLD, this.act.color(h9c0.f108379l), qa00.m175861f(18)), iC0, countdown.length() + iC0, 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: Y */
    private final void m142670Y() {
        m128501y();
        m128500x();
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.eyk0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                iyk0.m142666K(this.f96451a, dialogInterface);
            }
        });
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.fyk0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return iyk0.m142663H(this.f101398a, dialogInterface, i, keyEvent);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    private final void m142671a0() {
        psd0.m173633z(this.countDownSub);
        this.countDownSub = null;
    }

    /* JADX INFO: renamed from: b0 */
    private final void m142672b0() {
        String str;
        m142678Q().setImageResource(jbc0.f119522bb);
        ViewGroup.LayoutParams layoutParams = m142679R().getLayoutParams();
        layoutParams.getClass();
        ConstraintLayout.C0221a c0221a = (ConstraintLayout.C0221a) layoutParams;
        ((ViewGroup.MarginLayoutParams) c0221a).topMargin = bnl0.m105511F0() + qa00.f156320g;
        m142679R().setLayoutParams(c0221a);
        m142679R().setImageResource(jbc0.f119508ab);
        bnl0.m105509E0(m142679R(), new View.OnClickListener() { // from class: l.zxk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                iyk0.m142664I(this.f206472a, view);
            }
        });
        ViewGroup.LayoutParams layoutParams2 = m142684W().getLayoutParams();
        layoutParams2.getClass();
        ConstraintLayout.C0221a c0221a2 = (ConstraintLayout.C0221a) layoutParams2;
        ((ViewGroup.MarginLayoutParams) c0221a2).topMargin = bnl0.m105511F0() + ((ViewGroup.MarginLayoutParams) c0221a2).topMargin;
        m142684W().setLayoutParams(c0221a2);
        m142684W().setText("VIP会员-限时" + this.numberFormat.format(this.merchandise.getFirstCouponPrice()) + "元秒杀7天");
        Iterator<Privilege> it = this.purchaseType.getPrivilegeData(null).iterator();
        it.getClass();
        while (it.hasNext()) {
            a690 a690VarMo36016Hm = CoreModule.m30933P().m143410g().mo36016Hm(this.purchaseType, it.next());
            TextView textView = new TextView(this.act);
            textView.setCompoundDrawablesWithIntrinsicBounds(jbc0.f119163B6, 0, 0, 0);
            textView.setCompoundDrawablePadding(txq.m193530c(8));
            textView.setTextColor(Color.parseColor("#CC000000"));
            textView.setGravity(16);
            textView.setText(a690VarMo36016Hm.m96314t());
            textView.setTextSize(16.0f);
            m142683V().addView(textView, new LinearLayout.LayoutParams(-1, txq.m193530c(32)));
        }
        String str2 = this.numberFormat.format(this.merchandise.getFirstCouponPrice());
        Prices prices = this.merchandise.defaultStockKeepUnit.prices;
        String str3 = "活动规则：\n现在以" + str2 + "元价格购买7天VIP会员, 7天体验结束后以" + prices.currencySymbol + this.numberFormat.format(prices.price) + "/月自动续费，可随时取消";
        SpannableString spannableString = new SpannableString(str3);
        int iC0 = StringsKt.m94327c0(str3, "活动规则：", 0, false, 6, null);
        spannableString.setSpan(new StyleSpan(1), iC0, iC0 + 5, 33);
        m142685X().setText(spannableString);
        VText vTextM142681T = m142681T();
        if (CoreModule.m30933P().m143405a().mo34428U() && CoreModule.m30933P().m143405a().mo34527j3()) {
            str = "免密支付" + this.numberFormat.format(this.merchandise.getFirstCouponPrice()) + "元";
        } else {
            str = "获取特权";
        }
        vTextM142681T.setText(str);
        bnl0.m105509E0(m142681T(), new View.OnClickListener() { // from class: l.ayk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                iyk0.m142660E(this.f73978a, view);
            }
        });
        m142682U().setText((CoreModule.m30933P().m143405a().mo34428U() && CoreModule.m30933P().m143405a().mo34527j3()) ? this.act.string(R$string.f28308h) : this.act.string(R$string.f28135R9));
        m142673c0();
    }

    /* JADX INFO: renamed from: c0 */
    private final void m142673c0() {
        long jM174454o = (long) (this.coupon.endTime - pzi0.m174454o());
        if (jM174454o <= 0) {
            m142680S().setText(m142669O("优惠即将结束 %s", "00:00:00"));
            return;
        }
        if (jM174454o > 86400000) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            m142680S().setText(m142669O("优惠 %s 后到期", String.format(Locale.ENGLISH, "%d天", Arrays.copyOf(new Object[]{Integer.valueOf((int) (jM174454o / 86400000))}, 1))));
        } else {
            int i = (int) (jM174454o / 3600000);
            int i2 = (int) ((jM174454o % 3600000) / Constants.ONE_MIN_IN_MILLIS);
            int i3 = ((int) (jM174454o % Constants.ONE_MIN_IN_MILLIS)) / 1000;
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            m142680S().setText(m142669O("优惠即将结束 %s", String.format(Locale.ENGLISH, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, 3))));
        }
    }

    /* JADX INFO: renamed from: d0 */
    private final void m142674d0() {
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.addFlags(Integer.MIN_VALUE);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setStatusBarColor(0);
        }
        PutongAct.setLightStatusBar(getWindow(), EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
    }

    /* JADX INFO: renamed from: f0 */
    private final void m142675f0(List<? extends Merchandise> merchandises, int defaultSelect) {
        lib0 lib0Var = this.purchaseTrack;
        if (lib0Var != null) {
            lib0Var.m154335D(merchandises, defaultSelect);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final View m142676N(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM147598b = jyk0.m147598b(this, inflater, parent);
        viewM147598b.getClass();
        return viewM147598b;
    }

    /* JADX INFO: renamed from: P */
    public final void m142677P(String skuGroup) {
        String str = "yes";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseShowFrom", abb0.m96735b(this.from));
            ProductCategory productCategory = this.purchaseType.productCategory();
            jSONObject.put("productType", productCategory.name());
            jSONObject.put("skuGroup", skuGroup);
            jSONObject.put("default_product", productCategory.toString());
            jSONObject.put("default_duration", "1m");
            jSONObject.put("if_sale", "yes");
            boolean z = true;
            jSONObject.put("if_discount", true);
            jSONObject.put("if_double_tab", false);
            jSONObject.put("function_type", mib0.m158477f(Privilege.vip_unlimited_likes, abb0.m96735b(this.from)));
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
            jSONObject.put("tooltips_type_ui", "alert_self_definition_business_a");
            jSONObject.put("tooltips_trigger_module", "purchase_button");
            jSONObject.put("tooltips_trigger_page", "anywhere");
            jSONObject.put("tooltips_type", "alert");
            jSONObject.put("tooltips_trigger_reason", FirebaseAnalytics.Event.PURCHASE);
            if (!CoreModule.m30933P().m143405a().mo34428U() || !CoreModule.f18264c.f20333O0.m31086w3()) {
                str = "no";
            }
            jSONObject.put("no_secret_payment", str);
            jSONObject.put("user_secret_staus", str);
            if (CoreModule.m30933P().m143412i().mo180364N()) {
                if (!CoreModule.f18264c.f20381e0.m116537Z7() || CoreModule.f18264c.f20381e0.m116525W7() || CoreModule.f18264c.f20381e0.m116579k8()) {
                    z = false;
                }
                jSONObject.put("is_fakeunreal", z);
            }
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        this.statisticsPageHelper.m152780o(jSONObject);
        w1e.m204402f(this.statisticsPageHelper);
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final VImage m142678Q() {
        VImage vImage = this._background;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_background");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final VImage m142679R() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final VText m142680S() {
        VText vText = this._countdown;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_countdown");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final VText m142681T() {
        VText vText = this._get_privilege;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final TextView m142682U() {
        TextView textView = this._pay_method_text;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_pay_method_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final LinearLayout m142683V() {
        LinearLayout linearLayout = this._privileges;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_privileges");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final VText m142684W() {
        VText vText = this._promotion_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_promotion_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final VText m142685X() {
        VText vText = this._rule;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_rule");
        return null;
    }

    /* JADX INFO: renamed from: Z */
    public final void m142686Z() {
        ProductCategory productCategory = this.merchandise.category;
        productCategory.getClass();
        beb0 beb0Var = new beb0(productCategory, PurchaseTrackPageType.page_discount_trial_vip, this.from);
        this.purchaseTrack = beb0Var;
        beb0Var.m154339p("p_purchase_page");
        lib0 lib0Var = this.purchaseTrack;
        if (lib0Var != null) {
            ProductCategory productCategory2 = this.merchandise.category;
            productCategory2.getClass();
            lib0Var.m154344v(productCategory2);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m142687e0(@Nullable x20 dismiss) {
        this.dismiss = dismiss;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m142688g0() {
        String purchaseTrackId;
        boolean z = CoreModule.m30933P().m143405a().mo34428U() && CoreModule.m30933P().m143405a().mo34527j3();
        lib0 lib0Var = this.purchaseTrack;
        if (lib0Var != null) {
            Merchandise merchandise = this.merchandise;
            PayMethod payMethod = PayMethod.get("alipay");
            payMethod.getClass();
            lib0Var.m154345w(merchandise, payMethod, z, z);
        }
        if (this.coupon.endTime - pzi0.m174454o() <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            o1j0.m165651y("优惠券已到期");
            lib0.Companion companion = lib0.INSTANCE;
            lib0 lib0Var2 = this.purchaseTrack;
            purchaseTrackId = lib0Var2 != null ? lib0Var2.getPurchaseTrackId() : null;
            String str = this.merchandise.defaultStockKeepUnit.f21249id;
            str.getClass();
            companion.m154349a(purchaseTrackId, str, "coupon expired");
            return;
        }
        if (!CoreModule.m30933P().m143405a().mo34527j3() && !xl60.m211506k() && !xl60.m211506k()) {
            lib0.Companion companion2 = lib0.INSTANCE;
            lib0 lib0Var3 = this.purchaseTrack;
            purchaseTrackId = lib0Var3 != null ? lib0Var3.getPurchaseTrackId() : null;
            String str2 = this.merchandise.defaultStockKeepUnit.f21249id;
            str2.getClass();
            companion2.m154349a(purchaseTrackId, str2, "alipay not install");
            return;
        }
        wn60 wn60Var = new wn60(this.purchaseType, this.act, "", "");
        lib0 lib0Var4 = this.purchaseTrack;
        if (lib0Var4 != null) {
            wn60Var.m207144C(lib0Var4.getPurchaseTrackId());
        }
        wn60Var.m207167r(this.coupon.couponID);
        boolean zAutoRenewable = this.merchandise.autoRenewable();
        Merchandise merchandise2 = this.merchandise;
        if (zAutoRenewable) {
            wn60Var.m207150I(false, merchandise2.defaultStockKeepUnit.f21249id, new y20() { // from class: l.gyk0
                @Override // p153l.y20
                public final void call(Object obj) {
                    iyk0.m142668M(this.f107073a, (Integer) obj);
                }
            });
        } else {
            wn60Var.m207164o(merchandise2.defaultStockKeepUnit.f21249id, false, new y20() { // from class: l.hyk0
                @Override // p153l.y20
                public final void call(Object obj) {
                    iyk0.m142667L(this.f112138a, (Integer) obj);
                }
            });
        }
    }

    @Override // p153l.g1e, android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C22421c c22421cObserveOn = duringCreated(C22421c.interval(1L, TimeUnit.SECONDS)).distinctUntilChanged().onBackpressureLatest().observeOn(fo0.m126432a());
        final Function1 function1 = new Function1() { // from class: l.byk0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return iyk0.m142661F(this.f79031a, (Long) obj);
            }
        };
        this.countDownSub = c22421cObserveOn.takeUntil(new qcj() { // from class: l.cyk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return iyk0.m142662G(function1, obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.dyk0
            @Override // p153l.y20
            public final void call(Object obj) {
                iyk0.m142665J(this.f91264a, (Long) obj);
            }
        }));
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0075a, p153l.nu0, android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater layoutInflater = this.act.getLayoutInflater();
        layoutInflater.getClass();
        setContentView(m142676N(layoutInflater, null));
        m142674d0();
        m142670Y();
        m142686Z();
        m142672b0();
        m142675f0(CollectionsKt.listOf(this.merchandise), 0);
    }

    @Override // p153l.g1e, android.content.DialogInterface.OnShowListener
    public void onShow(@Nullable DialogInterface dialog) {
        super.onShow(dialog);
        String str = this.merchandise.defaultStockKeepUnit.f21249id;
        str.getClass();
        m142677P(str);
    }
}
