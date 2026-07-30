package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.Coupon;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.Prices;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
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
import p133rx.C22306c;
import p147v.VImage;
import p147v.VText;
import p147v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0098\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ%\u0010\u0014\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u000eJ\u000f\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u000eJ\u000f\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u000eJ\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u000eJ\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010\u000eJ\u0017\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J\u0019\u00100\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u00010.H\u0014¢\u0006\u0004\b0\u00101J\u0019\u00104\u001a\u00020\f2\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\fH\u0016¢\u0006\u0004\b6\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010V\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010Z\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010A\u001a\u0004\bX\u0010C\"\u0004\bY\u0010ER\"\u0010^\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010Q\u001a\u0004\b\\\u0010S\"\u0004\b]\u0010UR\"\u0010f\u001a\u00020_8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010j\u001a\u00020_8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u0010a\u001a\u0004\bh\u0010c\"\u0004\bi\u0010eR\"\u0010q\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010u\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010I\u001a\u0004\bs\u0010K\"\u0004\bt\u0010MR\"\u0010y\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bv\u0010I\u001a\u0004\bw\u0010K\"\u0004\bx\u0010MR\"\u0010}\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bz\u0010I\u001a\u0004\b{\u0010K\"\u0004\b|\u0010MR$\u0010\u0081\u0001\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\b~\u0010l\u001a\u0004\b\u007f\u0010n\"\u0005\b\u0080\u0001\u0010pR\u0018\u0010\u0085\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001a\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001c\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001c\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0094\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001¨\u0006\u0099\u0001"}, m87232d2 = {"Ll/cpk0;", "Ll/szd;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "from", "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "Lcom/p1/mobile/putong/core/data/Coupon;", "coupon", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lcom/p1/mobile/putong/core/data/Merchandise;Lcom/p1/mobile/putong/core/data/Coupon;)V", "", "d0", "()V", "Z", "", "merchandises", "", "defaultSelect", "f0", "(Ljava/util/List;I)V", "Y", "b0", "g0", "c0", "template", "countdown", "", BloodType.f38728O, "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/CharSequence;", "a0", "skuGroup", "P", "(Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "N", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Ll/d30;", SysnotifListener.ACTION_DISMISS, "e0", "(Ll/d30;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/DialogInterface;", OMSTemplateType.dialog, "onShow", "(Landroid/content/DialogInterface;)V", "onAttachedToWindow", "j", "Lcom/p1/mobile/android/app/Act;", "k", "Ljava/lang/String;", BLiveStormDanmakuGiftResourceType.f44444l, "Lcom/p1/mobile/putong/core/data/Merchandise;", "m", "Lcom/p1/mobile/putong/core/data/Coupon;", "Lv/VImage;", "n", "Lv/VImage;", "Q", "()Lv/VImage;", "set_background", "(Lv/VImage;)V", "_background", "Lv/VText;", "o", "Lv/VText;", "W", "()Lv/VText;", "set_promotion_title", "(Lv/VText;)V", "_promotion_title", "Landroid/widget/LinearLayout;", "p", "Landroid/widget/LinearLayout;", j6f.GPS_MEASUREMENT_INTERRUPTED, "()Landroid/widget/LinearLayout;", "set_privileges", "(Landroid/widget/LinearLayout;)V", "_privileges", "q", "R", "set_close", "_close", "r", "get_pay_method", "set_pay_method", "_pay_method", "Landroid/widget/TextView;", BLiveStormDanmakuGiftResourceType.f44446s, "Landroid/widget/TextView;", "U", "()Landroid/widget/TextView;", "set_pay_method_text", "(Landroid/widget/TextView;)V", "_pay_method_text", Constants.KEY_T, "get_pay_method_promotion", "set_pay_method_promotion", "_pay_method_promotion", "u", "Landroid/view/View;", "get_divider", "()Landroid/view/View;", "set_divider", "(Landroid/view/View;)V", "_divider", ResourceDirection.f38808v, j6f.LATITUDE_SOUTH, "set_countdown", "_countdown", "w", j6f.GPS_DIRECTION_TRUE, "set_get_privilege", "_get_privilege", BaseSei.f13930X, "X", "set_rule", "_rule", BaseSei.f13931Y, "get_get_privilege_divider", "set_get_privilege_divider", "_get_privilege_divider", "Ljava/text/NumberFormat;", BaseSei.f13932Z, "Ljava/text/NumberFormat;", "numberFormat", "Ll/cwf0;", "A", "Ll/cwf0;", "statisticsPageHelper", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "B", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", b2s.C_ZONE, "Ll/d30;", "Ll/hab0;", "D", "Ll/hab0;", "purchaseTrack", "Ll/c4g0;", "E", "Ll/c4g0;", "countDownSub", "a", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class cpk0 extends szd {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final cwf0 statisticsPageHelper;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    public d30 dismiss;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    public hab0 purchaseTrack;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    public c4g0 countDownSub;

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

    /* JADX INFO: renamed from: l.cpk0$a */
    @Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, m87232d2 = {"Ll/cpk0$a;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/core/data/Merchandise;)Ll/cpk0$a;", "Lcom/p1/mobile/putong/core/data/Coupon;", "coupon", "b", "(Lcom/p1/mobile/putong/core/data/Coupon;)Ll/cpk0$a;", "", "from", "c", "(Ljava/lang/String;)Ll/cpk0$a;", "Ll/cpk0;", "a", "()Ll/cpk0;", "", "e", "()V", "Lcom/p1/mobile/android/app/Act;", "Ljava/lang/String;", "Ll/d30;", "Ll/d30;", SysnotifListener.ACTION_DISMISS, "Lcom/p1/mobile/putong/core/data/Merchandise;", "Lcom/p1/mobile/putong/core/data/Coupon;", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C16206a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Act act;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public String from;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public d30 dismiss;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public Merchandise merchandise;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public Coupon coupon;

        public C16206a(@NotNull Act act) {
            act.getClass();
            this.act = act;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final cpk0 m108163a() {
            Act act = this.act;
            String str = this.from;
            Merchandise merchandise = this.merchandise;
            Coupon coupon = null;
            if (merchandise == null) {
                Intrinsics.m87502r(Merchandise.TYPE);
                merchandise = null;
            }
            Coupon coupon2 = this.coupon;
            if (coupon2 == null) {
                Intrinsics.m87502r("coupon");
            } else {
                coupon = coupon2;
            }
            cpk0 cpk0Var = new cpk0(act, str, merchandise, coupon);
            cpk0Var.m108161e0(this.dismiss);
            return cpk0Var;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C16206a m108164b(@NotNull Coupon coupon) {
            coupon.getClass();
            this.coupon = coupon;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final C16206a m108165c(@Nullable String from) {
            this.from = from;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final C16206a m108166d(@NotNull Merchandise merchandise) {
            merchandise.getClass();
            this.merchandise = merchandise;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public final void m108167e() {
            m108163a().show();
        }
    }

    /* JADX INFO: renamed from: l.cpk0$b */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"l/cpk0$b", "Ll/er2;", "", "pageId", "()Ljava/lang/String;", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C16207b extends er2 {
        @Override // p149l.n3m
        public String pageId() {
            return "p_purchase_page";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpk0(@NotNull Act act, @Nullable String str, @NotNull Merchandise merchandise, @NotNull Coupon coupon) {
        super(act, false, y7c0.f196692b);
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
        this.statisticsPageHelper = new cwf0(new C16207b());
        this.purchaseType = PurchaseType.TYPE_GET_VIP;
    }

    /* JADX INFO: renamed from: E */
    public static void m108134E(cpk0 cpk0Var, View view) {
        cpk0Var.m108162g0();
    }

    /* JADX INFO: renamed from: F */
    public static Boolean m108135F(cpk0 cpk0Var, Long l2) {
        return Boolean.valueOf(cpk0Var.coupon.endTime - ((double) mqi0.m155944o()) <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    /* JADX INFO: renamed from: G */
    public static Boolean m108136G(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: H */
    public static boolean m108137H(cpk0 cpk0Var, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (i != 4 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 0) {
            return true;
        }
        cpk0Var.dismiss();
        return true;
    }

    /* JADX INFO: renamed from: I */
    public static void m108138I(cpk0 cpk0Var, View view) {
        cpk0Var.dismiss();
    }

    /* JADX INFO: renamed from: J */
    public static void m108139J(cpk0 cpk0Var, Long l2) {
        cpk0Var.m108147c0();
    }

    /* JADX INFO: renamed from: K */
    public static void m108140K(cpk0 cpk0Var, DialogInterface dialogInterface) {
        cpk0Var.m108145a0();
        d30 d30Var = cpk0Var.dismiss;
        if (d30Var != null) {
            d30Var.call();
        }
        i0e.m133796e(cpk0Var.statisticsPageHelper);
    }

    /* JADX INFO: renamed from: L */
    public static void m108141L(cpk0 cpk0Var, Integer num) {
        cpk0Var.dismiss();
    }

    /* JADX INFO: renamed from: M */
    public static void m108142M(cpk0 cpk0Var, Integer num) {
        cpk0Var.dismiss();
    }

    /* JADX INFO: renamed from: O */
    private final CharSequence m108143O(String template, String countdown) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(template, Arrays.copyOf(new Object[]{countdown}, 1));
        int iC0 = StringsKt.m93436c0(str, countdown, 0, false, 6, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", Typeface.DEFAULT_BOLD, this.act.color(b1c0.f72559l), t100.m186892f(18)), iC0, countdown.length() + iC0, 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: Y */
    private final void m108144Y() {
        m186759y();
        m186758x();
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.yok0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                cpk0.m108140K(this.f199308a, dialogInterface);
            }
        });
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.zok0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return cpk0.m108137H(this.f204130a, dialogInterface, i, keyEvent);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    private final void m108145a0() {
        mkd0.m154992z(this.countDownSub);
        this.countDownSub = null;
    }

    /* JADX INFO: renamed from: b0 */
    private final void m108146b0() {
        String str;
        m108152Q().setImageResource(d3c0.f83867bb);
        ViewGroup.LayoutParams layoutParams = m108153R().getLayoutParams();
        layoutParams.getClass();
        ConstraintLayout.C0220a c0220a = (ConstraintLayout.C0220a) layoutParams;
        ((ViewGroup.MarginLayoutParams) c0220a).topMargin = xdl0.m208331F0() + t100.f167258g;
        m108153R().setLayoutParams(c0220a);
        m108153R().setImageResource(d3c0.f83853ab);
        xdl0.m208329E0(m108153R(), new View.OnClickListener() { // from class: l.tok0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cpk0.m108138I(this.f171381a, view);
            }
        });
        ViewGroup.LayoutParams layoutParams2 = m108158W().getLayoutParams();
        layoutParams2.getClass();
        ConstraintLayout.C0220a c0220a2 = (ConstraintLayout.C0220a) layoutParams2;
        ((ViewGroup.MarginLayoutParams) c0220a2).topMargin = xdl0.m208331F0() + ((ViewGroup.MarginLayoutParams) c0220a2).topMargin;
        m108158W().setLayoutParams(c0220a2);
        m108158W().setText("VIP会员-限时" + this.numberFormat.format(this.merchandise.getFirstCouponPrice()) + "元秒杀7天");
        Iterator<Privilege> it = this.purchaseType.getPrivilegeData(null).iterator();
        it.getClass();
        while (it.hasNext()) {
            wx80 wx80VarMo35013Hm = CoreModule.m29935P().m94656g().mo35013Hm(this.purchaseType, it.next());
            TextView textView = new TextView(this.act);
            textView.setCompoundDrawablesWithIntrinsicBounds(d3c0.f83508B6, 0, 0, 0);
            textView.setCompoundDrawablePadding(svq.m186103c(8));
            textView.setTextColor(Color.parseColor("#CC000000"));
            textView.setGravity(16);
            textView.setText(wx80VarMo35013Hm.m205968t());
            textView.setTextSize(16.0f);
            m108157V().addView(textView, new LinearLayout.LayoutParams(-1, svq.m186103c(32)));
        }
        String str2 = this.numberFormat.format(this.merchandise.getFirstCouponPrice());
        Prices prices = this.merchandise.defaultStockKeepUnit.prices;
        String str3 = "活动规则：\n现在以" + str2 + "元价格购买7天VIP会员, 7天体验结束后以" + prices.currencySymbol + this.numberFormat.format(prices.price) + "/月自动续费，可随时取消";
        SpannableString spannableString = new SpannableString(str3);
        int iC0 = StringsKt.m93436c0(str3, "活动规则：", 0, false, 6, null);
        spannableString.setSpan(new StyleSpan(1), iC0, iC0 + 5, 33);
        m108159X().setText(spannableString);
        VText vTextM108155T = m108155T();
        if (CoreModule.m29935P().m94651a().mo33425U() && CoreModule.m29935P().m94651a().mo33524j3()) {
            str = "免密支付" + this.numberFormat.format(this.merchandise.getFirstCouponPrice()) + "元";
        } else {
            str = "获取特权";
        }
        vTextM108155T.setText(str);
        xdl0.m208329E0(m108155T(), new View.OnClickListener() { // from class: l.uok0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cpk0.m108134E(this.f177514a, view);
            }
        });
        m108156U().setText((CoreModule.m29935P().m94651a().mo33425U() && CoreModule.m29935P().m94651a().mo33524j3()) ? this.act.string(R$string.f27460h) : this.act.string(R$string.f27287R9));
        m108147c0();
    }

    /* JADX INFO: renamed from: c0 */
    private final void m108147c0() {
        long jM155944o = (long) (this.coupon.endTime - mqi0.m155944o());
        if (jM155944o <= 0) {
            m108154S().setText(m108143O("优惠即将结束 %s", "00:00:00"));
            return;
        }
        if (jM155944o > 86400000) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            m108154S().setText(m108143O("优惠 %s 后到期", String.format(Locale.ENGLISH, "%d天", Arrays.copyOf(new Object[]{Integer.valueOf((int) (jM155944o / 86400000))}, 1))));
        } else {
            int i = (int) (jM155944o / 3600000);
            int i2 = (int) ((jM155944o % 3600000) / Constants.ONE_MIN_IN_MILLIS);
            int i3 = ((int) (jM155944o % Constants.ONE_MIN_IN_MILLIS)) / 1000;
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            m108154S().setText(m108143O("优惠即将结束 %s", String.format(Locale.ENGLISH, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, 3))));
        }
    }

    /* JADX INFO: renamed from: d0 */
    private final void m108148d0() {
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
    private final void m108149f0(List<? extends Merchandise> merchandises, int defaultSelect) {
        hab0 hab0Var = this.purchaseTrack;
        if (hab0Var != null) {
            hab0Var.m130101D(merchandises, defaultSelect);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final View m108150N(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM112917b = dpk0.m112917b(this, inflater, parent);
        viewM112917b.getClass();
        return viewM112917b;
    }

    /* JADX INFO: renamed from: P */
    public final void m108151P(String skuGroup) {
        String str = "yes";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseShowFrom", w2b0.m201088b(this.from));
            ProductCategory productCategory = this.purchaseType.productCategory();
            jSONObject.put("productType", productCategory.name());
            jSONObject.put("skuGroup", skuGroup);
            jSONObject.put("default_product", productCategory.toString());
            jSONObject.put("default_duration", "1m");
            jSONObject.put("if_sale", "yes");
            boolean z = true;
            jSONObject.put("if_discount", true);
            jSONObject.put("if_double_tab", false);
            jSONObject.put("function_type", iab0.m135145f(Privilege.vip_unlimited_likes, w2b0.m201088b(this.from)));
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
            jSONObject.put("tooltips_type_ui", "alert_self_definition_business_a");
            jSONObject.put("tooltips_trigger_module", "purchase_button");
            jSONObject.put("tooltips_trigger_page", "anywhere");
            jSONObject.put("tooltips_type", "alert");
            jSONObject.put("tooltips_trigger_reason", FirebaseAnalytics.Event.PURCHASE);
            if (!CoreModule.m29935P().m94651a().mo33425U() || !CoreModule.f17545c.f19591O0.m30088w3()) {
                str = "no";
            }
            jSONObject.put("no_secret_payment", str);
            jSONObject.put("user_secret_staus", str);
            if (CoreModule.m29935P().m94658i().mo158272N()) {
                if (!CoreModule.f17545c.f19639e0.m169464Z7() || CoreModule.f17545c.f19639e0.m169452W7() || CoreModule.f17545c.f19639e0.m169506k8()) {
                    z = false;
                }
                jSONObject.put("is_fakeunreal", z);
            }
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        this.statisticsPageHelper.m109039o(jSONObject);
        i0e.m133797f(this.statisticsPageHelper);
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final VImage m108152Q() {
        VImage vImage = this._background;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_background");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final VImage m108153R() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final VText m108154S() {
        VText vText = this._countdown;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_countdown");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final VText m108155T() {
        VText vText = this._get_privilege;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final TextView m108156U() {
        TextView textView = this._pay_method_text;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_pay_method_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final LinearLayout m108157V() {
        LinearLayout linearLayout = this._privileges;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_privileges");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final VText m108158W() {
        VText vText = this._promotion_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_promotion_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final VText m108159X() {
        VText vText = this._rule;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_rule");
        return null;
    }

    /* JADX INFO: renamed from: Z */
    public final void m108160Z() {
        ProductCategory productCategory = this.merchandise.category;
        productCategory.getClass();
        x5b0 x5b0Var = new x5b0(productCategory, PurchaseTrackPageType.page_discount_trial_vip, this.from);
        this.purchaseTrack = x5b0Var;
        x5b0Var.m130117p("p_purchase_page");
        hab0 hab0Var = this.purchaseTrack;
        if (hab0Var != null) {
            ProductCategory productCategory2 = this.merchandise.category;
            productCategory2.getClass();
            hab0Var.m130122v(productCategory2);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m108161e0(@Nullable d30 dismiss) {
        this.dismiss = dismiss;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m108162g0() {
        String purchaseTrackId;
        boolean z = CoreModule.m29935P().m94651a().mo33425U() && CoreModule.m29935P().m94651a().mo33524j3();
        hab0 hab0Var = this.purchaseTrack;
        if (hab0Var != null) {
            Merchandise merchandise = this.merchandise;
            PayMethod payMethod = PayMethod.get("alipay");
            payMethod.getClass();
            hab0Var.m130123w(merchandise, payMethod, z, z);
        }
        if (this.coupon.endTime - mqi0.m155944o() <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            lsi0.m151595y("优惠券已到期");
            hab0.Companion companion = hab0.INSTANCE;
            hab0 hab0Var2 = this.purchaseTrack;
            purchaseTrackId = hab0Var2 != null ? hab0Var2.getPurchaseTrackId() : null;
            String str = this.merchandise.defaultStockKeepUnit.f20507id;
            str.getClass();
            companion.m130127a(purchaseTrackId, str, "coupon expired");
            return;
        }
        if (!CoreModule.m29935P().m94651a().mo33524j3() && !sd60.m183460k() && !sd60.m183460k()) {
            hab0.Companion companion2 = hab0.INSTANCE;
            hab0 hab0Var3 = this.purchaseTrack;
            purchaseTrackId = hab0Var3 != null ? hab0Var3.getPurchaseTrackId() : null;
            String str2 = this.merchandise.defaultStockKeepUnit.f20507id;
            str2.getClass();
            companion2.m130127a(purchaseTrackId, str2, "alipay not install");
            return;
        }
        rf60 rf60Var = new rf60(this.purchaseType, this.act, "", "");
        hab0 hab0Var4 = this.purchaseTrack;
        if (hab0Var4 != null) {
            rf60Var.m179078C(hab0Var4.getPurchaseTrackId());
        }
        rf60Var.m179101r(this.coupon.couponID);
        boolean zAutoRenewable = this.merchandise.autoRenewable();
        Merchandise merchandise2 = this.merchandise;
        if (zAutoRenewable) {
            rf60Var.m179084I(false, merchandise2.defaultStockKeepUnit.f20507id, new e30() { // from class: l.apk0
                @Override // p149l.e30
                public final void call(Object obj) {
                    cpk0.m108142M(this.f71060a, (Integer) obj);
                }
            });
        } else {
            rf60Var.m179098o(merchandise2.defaultStockKeepUnit.f20507id, false, new e30() { // from class: l.bpk0
                @Override // p149l.e30
                public final void call(Object obj) {
                    cpk0.m108141L(this.f76651a, (Integer) obj);
                }
            });
        }
    }

    @Override // p149l.szd, android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C22306c c22306cObserveOn = duringCreated(C22306c.interval(1L, TimeUnit.SECONDS)).distinctUntilChanged().onBackpressureLatest().observeOn(jo0.m142408a());
        final Function1 function1 = new Function1() { // from class: l.vok0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return cpk0.m108135F(this.f182399a, (Long) obj);
            }
        };
        this.countDownSub = c22306cObserveOn.takeUntil(new w9j() { // from class: l.wok0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return cpk0.m108136G(function1, obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.xok0
            @Override // p149l.e30
            public final void call(Object obj) {
                cpk0.m108139J(this.f193853a, (Long) obj);
            }
        }));
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0074a, p149l.hu0, android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater layoutInflater = this.act.getLayoutInflater();
        layoutInflater.getClass();
        setContentView(m108150N(layoutInflater, null));
        m108148d0();
        m108144Y();
        m108160Z();
        m108146b0();
        m108149f0(CollectionsKt.listOf(this.merchandise), 0);
    }

    @Override // p149l.szd, android.content.DialogInterface.OnShowListener
    public void onShow(@Nullable DialogInterface dialog) {
        super.onShow(dialog);
        String str = this.merchandise.defaultStockKeepUnit.f20507id;
        str.getClass();
        m108151P(str);
    }
}
