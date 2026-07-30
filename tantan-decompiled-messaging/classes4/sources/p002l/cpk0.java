package p002l;

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
import com.p000p1.mobile.putong.core.p001ui.notifications.SysnotifListener;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Coupon;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.Prices;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.PayMethod;
import com.tantanapp.common.utils.CrashHelper;
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
import l.b1c0;
import l.c4g0;
import l.cwf0;
import l.d30;
import l.d3c0;
import l.dpk0;
import l.e30;
import l.er2;
import l.hab0;
import l.i0e;
import l.iab0;
import l.jo0;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.rf60;
import l.sd60;
import l.svq;
import l.szd;
import l.t100;
import l.w2b0;
import l.w9j;
import l.wx80;
import l.x5b0;
import l.xdl0;
import l.y7c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;
import v.VImage;
import v.VText;
import v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0098\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ%\u0010\u0014\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u000eJ\u000f\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u000eJ\u000f\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u000eJ\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u000eJ\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010\u000eJ\u0017\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J\u0019\u00100\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u00010.H\u0014¢\u0006\u0004\b0\u00101J\u0019\u00104\u001a\u00020\f2\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\fH\u0016¢\u0006\u0004\b6\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010V\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010Z\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010A\u001a\u0004\bX\u0010C\"\u0004\bY\u0010ER\"\u0010^\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010Q\u001a\u0004\b\\\u0010S\"\u0004\b]\u0010UR\"\u0010f\u001a\u00020_8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010j\u001a\u00020_8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u0010a\u001a\u0004\bh\u0010c\"\u0004\bi\u0010eR\"\u0010q\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010u\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010I\u001a\u0004\bs\u0010K\"\u0004\bt\u0010MR\"\u0010y\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bv\u0010I\u001a\u0004\bw\u0010K\"\u0004\bx\u0010MR\"\u0010}\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bz\u0010I\u001a\u0004\b{\u0010K\"\u0004\b|\u0010MR$\u0010\u0081\u0001\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\b~\u0010l\u001a\u0004\b\u007f\u0010n\"\u0005\b\u0080\u0001\u0010pR\u0018\u0010\u0085\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001a\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001c\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001c\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0094\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001¨\u0006\u0099\u0001"}, d2 = {"Ll/cpk0;", "Ll/szd;", "Lcom/p1/mobile/android/app/Act;", "act", "", "from", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandise", "Lcom/p1/mobile/putong/core/data/Coupon;", "coupon", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lcom/p1/mobile/putong/core/data/Merchandise;Lcom/p1/mobile/putong/core/data/Coupon;)V", "", "d0", "()V", "Z", "", "merchandises", "", "defaultSelect", "f0", "(Ljava/util/List;I)V", "Y", "b0", "g0", "c0", "template", "countdown", "", "O", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/CharSequence;", "a0", "skuGroup", "P", "(Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "N", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Ll/d30;", SysnotifListener.ACTION_DISMISS, "e0", "(Ll/d30;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/DialogInterface;", "dialog", "onShow", "(Landroid/content/DialogInterface;)V", "onAttachedToWindow", "j", "Lcom/p1/mobile/android/app/Act;", "k", "Ljava/lang/String;", "l", "Lcom/p1/mobile/putong/core/data/Merchandise;", "m", "Lcom/p1/mobile/putong/core/data/Coupon;", "Lv/VImage;", "n", "Lv/VImage;", "Q", "()Lv/VImage;", "set_background", "(Lv/VImage;)V", "_background", "Lv/VText;", "o", "Lv/VText;", "W", "()Lv/VText;", "set_promotion_title", "(Lv/VText;)V", "_promotion_title", "Landroid/widget/LinearLayout;", "p", "Landroid/widget/LinearLayout;", "V", "()Landroid/widget/LinearLayout;", "set_privileges", "(Landroid/widget/LinearLayout;)V", "_privileges", "q", "R", "set_close", "_close", "r", "get_pay_method", "set_pay_method", "_pay_method", "Landroid/widget/TextView;", "s", "Landroid/widget/TextView;", "U", "()Landroid/widget/TextView;", "set_pay_method_text", "(Landroid/widget/TextView;)V", "_pay_method_text", "t", "get_pay_method_promotion", "set_pay_method_promotion", "_pay_method_promotion", "u", "Landroid/view/View;", "get_divider", "()Landroid/view/View;", "set_divider", "(Landroid/view/View;)V", "_divider", "v", "S", "set_countdown", "_countdown", "w", "T", "set_get_privilege", "_get_privilege", "x", "X", "set_rule", "_rule", "y", "get_get_privilege_divider", "set_get_privilege_divider", "_get_privilege_divider", "Ljava/text/NumberFormat;", "z", "Ljava/text/NumberFormat;", "numberFormat", "Ll/cwf0;", "A", "Ll/cwf0;", "statisticsPageHelper", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "B", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "C", "Ll/d30;", "Ll/hab0;", "D", "Ll/hab0;", "purchaseTrack", "Ll/c4g0;", "E", "Ll/c4g0;", "countDownSub", "a", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, d2 = {"Ll/cpk0$a;", "", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandise", "d", "(Lcom/p1/mobile/putong/core/data/Merchandise;)Ll/cpk0$a;", "Lcom/p1/mobile/putong/core/data/Coupon;", "coupon", "b", "(Lcom/p1/mobile/putong/core/data/Coupon;)Ll/cpk0$a;", "", "from", "c", "(Ljava/lang/String;)Ll/cpk0$a;", "Ll/cpk0;", "a", "()Ll/cpk0;", "", "e", "()V", "Lcom/p1/mobile/android/app/Act;", "Ljava/lang/String;", "Ll/d30;", "Ll/d30;", SysnotifListener.ACTION_DISMISS, "Lcom/p1/mobile/putong/core/data/Merchandise;", "Lcom/p1/mobile/putong/core/data/Coupon;", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0518a {

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

        public C0518a(@NotNull Act act) {
            act.getClass();
            this.act = act;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final cpk0 m11301a() {
            Act act = this.act;
            String str = this.from;
            Merchandise merchandise = this.merchandise;
            Coupon coupon = null;
            if (merchandise == null) {
                Intrinsics.r("merchandise");
                merchandise = null;
            }
            Coupon coupon2 = this.coupon;
            if (coupon2 == null) {
                Intrinsics.r("coupon");
            } else {
                coupon = coupon2;
            }
            cpk0 cpk0Var = new cpk0(act, str, merchandise, coupon);
            cpk0Var.m11299e0(this.dismiss);
            return cpk0Var;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C0518a m11302b(@NotNull Coupon coupon) {
            coupon.getClass();
            this.coupon = coupon;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final C0518a m11303c(@Nullable String from) {
            this.from = from;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final C0518a m11304d(@NotNull Merchandise merchandise) {
            merchandise.getClass();
            this.merchandise = merchandise;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public final void m11305e() {
            m11301a().show();
        }
    }

    /* JADX INFO: renamed from: l.cpk0$b */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"l/cpk0$b", "Ll/er2;", "", "pageId", "()Ljava/lang/String;", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0519b extends er2 {
        public String pageId() {
            return "p_purchase_page";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpk0(@NotNull Act act, @Nullable String str, @NotNull Merchandise merchandise, @NotNull Coupon coupon) {
        super(act, false, y7c0.b);
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
        this.statisticsPageHelper = new cwf0(new C0519b());
        this.purchaseType = PurchaseType.TYPE_GET_VIP;
    }

    /* JADX INFO: renamed from: E */
    public static void m11272E(cpk0 cpk0Var, View view) {
        cpk0Var.m11300g0();
    }

    /* JADX INFO: renamed from: F */
    public static Boolean m11273F(cpk0 cpk0Var, Long l2) {
        return Boolean.valueOf(cpk0Var.coupon.endTime - ((double) mqi0.o()) <= 0.0d);
    }

    /* JADX INFO: renamed from: G */
    public static Boolean m11274G(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: H */
    public static boolean m11275H(cpk0 cpk0Var, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (i != 4 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 0) {
            return true;
        }
        cpk0Var.dismiss();
        return true;
    }

    /* JADX INFO: renamed from: I */
    public static void m11276I(cpk0 cpk0Var, View view) {
        cpk0Var.dismiss();
    }

    /* JADX INFO: renamed from: J */
    public static void m11277J(cpk0 cpk0Var, Long l2) {
        cpk0Var.m11285c0();
    }

    /* JADX INFO: renamed from: K */
    public static void m11278K(cpk0 cpk0Var, DialogInterface dialogInterface) {
        cpk0Var.m11283a0();
        d30 d30Var = cpk0Var.dismiss;
        if (d30Var != null) {
            d30Var.call();
        }
        i0e.e(cpk0Var.statisticsPageHelper);
    }

    /* JADX INFO: renamed from: L */
    public static void m11279L(cpk0 cpk0Var, Integer num) {
        cpk0Var.dismiss();
    }

    /* JADX INFO: renamed from: M */
    public static void m11280M(cpk0 cpk0Var, Integer num) {
        cpk0Var.dismiss();
    }

    /* JADX INFO: renamed from: O */
    private final CharSequence m11281O(String template, String countdown) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(template, Arrays.copyOf(new Object[]{countdown}, 1));
        int iC0 = StringsKt.c0(str, countdown, 0, false, 6, (Object) null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", Typeface.DEFAULT_BOLD, this.act.color(b1c0.l), t100.f(18)), iC0, countdown.length() + iC0, 33);
        return spannableStringBuilder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y */
    private final void m11282Y() {
        y();
        x();
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.yok0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                cpk0.m11278K(this.f23005a, dialogInterface);
            }
        });
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.zok0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return cpk0.m11275H(this.f23525a, dialogInterface, i, keyEvent);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    private final void m11283a0() {
        mkd0.z(this.countDownSub);
        this.countDownSub = null;
    }

    /* JADX INFO: renamed from: b0 */
    private final void m11284b0() {
        String str;
        m11290Q().setImageResource(d3c0.bb);
        ConstraintLayout.a layoutParams = m11291R().getLayoutParams();
        layoutParams.getClass();
        ConstraintLayout.a aVar = layoutParams;
        ((ViewGroup.MarginLayoutParams) aVar).topMargin = xdl0.F0() + t100.g;
        m11291R().setLayoutParams(aVar);
        m11291R().setImageResource(d3c0.ab);
        xdl0.E0(m11291R(), new View.OnClickListener() { // from class: l.tok0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cpk0.m11276I(this.f20325a, view);
            }
        });
        ConstraintLayout.a layoutParams2 = m11296W().getLayoutParams();
        layoutParams2.getClass();
        ConstraintLayout.a aVar2 = layoutParams2;
        ((ViewGroup.MarginLayoutParams) aVar2).topMargin = xdl0.F0() + ((ViewGroup.MarginLayoutParams) aVar2).topMargin;
        m11296W().setLayoutParams(aVar2);
        m11296W().setText("VIP会员-限时" + this.numberFormat.format(this.merchandise.getFirstCouponPrice()) + "元秒杀7天");
        Iterator it = this.purchaseType.getPrivilegeData((Gender) null).iterator();
        it.getClass();
        while (it.hasNext()) {
            wx80 wx80VarHm = CoreModule.P().g().Hm(this.purchaseType, (Privilege) it.next());
            TextView textView = new TextView(this.act);
            textView.setCompoundDrawablesWithIntrinsicBounds(d3c0.B6, 0, 0, 0);
            textView.setCompoundDrawablePadding(svq.c(8));
            textView.setTextColor(Color.parseColor("#CC000000"));
            textView.setGravity(16);
            textView.setText(wx80VarHm.t());
            textView.setTextSize(16.0f);
            m11295V().addView(textView, new LinearLayout.LayoutParams(-1, svq.c(32)));
        }
        String str2 = this.numberFormat.format(this.merchandise.getFirstCouponPrice());
        Prices prices = this.merchandise.defaultStockKeepUnit.prices;
        String str3 = "活动规则：\n现在以" + str2 + "元价格购买7天VIP会员, 7天体验结束后以" + prices.currencySymbol + this.numberFormat.format(prices.price) + "/月自动续费，可随时取消";
        SpannableString spannableString = new SpannableString(str3);
        int iC0 = StringsKt.c0(str3, "活动规则：", 0, false, 6, (Object) null);
        spannableString.setSpan(new StyleSpan(1), iC0, iC0 + 5, 33);
        m11297X().setText(spannableString);
        VText vTextM11293T = m11293T();
        if (CoreModule.P().a().U() && CoreModule.P().a().j3()) {
            str = "免密支付" + this.numberFormat.format(this.merchandise.getFirstCouponPrice()) + "元";
        } else {
            str = "获取特权";
        }
        vTextM11293T.setText(str);
        xdl0.E0(m11293T(), new View.OnClickListener() { // from class: l.uok0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cpk0.m11272E(this.f20740a, view);
            }
        });
        m11294U().setText((CoreModule.P().a().U() && CoreModule.P().a().j3()) ? this.act.string(R.string.h) : this.act.string(R.string.R9));
        m11285c0();
    }

    /* JADX INFO: renamed from: c0 */
    private final void m11285c0() {
        long jO = (long) (this.coupon.endTime - mqi0.o());
        if (jO <= 0) {
            m11292S().setText(m11281O("优惠即将结束 %s", "00:00:00"));
        } else if (jO > 86400000) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            m11292S().setText(m11281O("优惠 %s 后到期", String.format(Locale.ENGLISH, "%d天", Arrays.copyOf(new Object[]{Integer.valueOf((int) (jO / 86400000))}, 1))));
        } else {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            m11292S().setText(m11281O("优惠即将结束 %s", String.format(Locale.ENGLISH, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf((int) (jO / 3600000)), Integer.valueOf((int) ((jO % 3600000) / 60000)), Integer.valueOf(((int) (jO % 60000)) / 1000)}, 3))));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d0 */
    private final void m11286d0() {
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(67108864);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.addFlags(Integer.MIN_VALUE);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setStatusBarColor(0);
        }
        PutongAct.setLightStatusBar(getWindow(), 1280);
    }

    /* JADX INFO: renamed from: f0 */
    private final void m11287f0(List<? extends Merchandise> merchandises, int defaultSelect) {
        hab0 hab0Var = this.purchaseTrack;
        if (hab0Var != null) {
            hab0Var.D(merchandises, defaultSelect);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final View m11288N(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = dpk0.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: P */
    public final void m11289P(String skuGroup) {
        String str = "yes";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseShowFrom", w2b0.b(this.from));
            ProductCategory productCategory = this.purchaseType.productCategory();
            jSONObject.put("productType", productCategory.name());
            jSONObject.put("skuGroup", skuGroup);
            jSONObject.put("default_product", productCategory.toString());
            jSONObject.put("default_duration", "1m");
            jSONObject.put("if_sale", "yes");
            boolean z = true;
            jSONObject.put("if_discount", true);
            jSONObject.put("if_double_tab", false);
            jSONObject.put("function_type", iab0.f(Privilege.vip_unlimited_likes, w2b0.b(this.from)));
            jSONObject.put("tooltips_trigger_mode", "active");
            jSONObject.put("tooltips_type_ui", "alert_self_definition_business_a");
            jSONObject.put("tooltips_trigger_module", "purchase_button");
            jSONObject.put("tooltips_trigger_page", "anywhere");
            jSONObject.put("tooltips_type", "alert");
            jSONObject.put("tooltips_trigger_reason", "purchase");
            if (!CoreModule.P().a().U() || !CoreModule.c.O0.w3()) {
                str = "no";
            }
            jSONObject.put("no_secret_payment", str);
            jSONObject.put("user_secret_staus", str);
            if (CoreModule.P().i().N()) {
                if (!CoreModule.c.e0.Z7() || CoreModule.c.e0.W7() || CoreModule.c.e0.k8()) {
                    z = false;
                }
                jSONObject.put("is_fakeunreal", z);
            }
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        this.statisticsPageHelper.o(jSONObject);
        i0e.f(this.statisticsPageHelper);
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final VImage m11290Q() {
        VImage vImage = this._background;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_background");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final VImage m11291R() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final VText m11292S() {
        VText vText = this._countdown;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_countdown");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final VText m11293T() {
        VText vText = this._get_privilege;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final TextView m11294U() {
        TextView textView = this._pay_method_text;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_pay_method_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final LinearLayout m11295V() {
        LinearLayout linearLayout = this._privileges;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("_privileges");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final VText m11296W() {
        VText vText = this._promotion_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_promotion_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final VText m11297X() {
        VText vText = this._rule;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_rule");
        return null;
    }

    /* JADX INFO: renamed from: Z */
    public final void m11298Z() {
        ProductCategory productCategory = this.merchandise.category;
        productCategory.getClass();
        x5b0 x5b0Var = new x5b0(productCategory, PurchaseTrackPageType.page_discount_trial_vip, this.from);
        this.purchaseTrack = x5b0Var;
        x5b0Var.p("p_purchase_page");
        hab0 hab0Var = this.purchaseTrack;
        if (hab0Var != null) {
            ProductCategory productCategory2 = this.merchandise.category;
            productCategory2.getClass();
            hab0Var.v(productCategory2);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m11299e0(@Nullable d30 dismiss) {
        this.dismiss = dismiss;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m11300g0() {
        String strN;
        boolean z = CoreModule.P().a().U() && CoreModule.P().a().j3();
        hab0 hab0Var = this.purchaseTrack;
        if (hab0Var != null) {
            Merchandise merchandise = this.merchandise;
            PayMethod payMethod = PayMethod.get("alipay");
            payMethod.getClass();
            hab0Var.w(merchandise, payMethod, z, z);
        }
        if (this.coupon.endTime - mqi0.o() <= 0.0d) {
            lsi0.y("优惠券已到期");
            hab0.a aVar = hab0.Companion;
            hab0 hab0Var2 = this.purchaseTrack;
            strN = hab0Var2 != null ? hab0Var2.n() : null;
            String str = this.merchandise.defaultStockKeepUnit.id;
            str.getClass();
            aVar.a(strN, str, "coupon expired");
            return;
        }
        if (!CoreModule.P().a().j3() && !sd60.k() && !sd60.k()) {
            hab0.a aVar2 = hab0.Companion;
            hab0 hab0Var3 = this.purchaseTrack;
            strN = hab0Var3 != null ? hab0Var3.n() : null;
            String str2 = this.merchandise.defaultStockKeepUnit.id;
            str2.getClass();
            aVar2.a(strN, str2, "alipay not install");
            return;
        }
        rf60 rf60Var = new rf60(this.purchaseType, this.act, "", "");
        hab0 hab0Var4 = this.purchaseTrack;
        if (hab0Var4 != null) {
            rf60Var.C(hab0Var4.n());
        }
        rf60Var.r(this.coupon.couponID);
        boolean zAutoRenewable = this.merchandise.autoRenewable();
        Merchandise merchandise2 = this.merchandise;
        if (zAutoRenewable) {
            rf60Var.I(false, merchandise2.defaultStockKeepUnit.id, new e30() { // from class: l.apk0
                public final void call(Object obj) {
                    cpk0.m11280M(this.f7849a, (Integer) obj);
                }
            });
        } else {
            rf60Var.o(merchandise2.defaultStockKeepUnit.id, false, new e30() { // from class: l.bpk0
                public final void call(Object obj) {
                    cpk0.m11279L(this.f8304a, (Integer) obj);
                }
            });
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        c cVarObserveOn = duringCreated(c.interval(1L, TimeUnit.SECONDS)).distinctUntilChanged().onBackpressureLatest().observeOn(jo0.a());
        final Function1 function1 = new Function1() { // from class: l.vok0
            public final Object invoke(Object obj) {
                return cpk0.m11273F(this.f21252a, (Long) obj);
            }
        };
        this.countDownSub = cVarObserveOn.takeUntil(new w9j() { // from class: l.wok0
            public final Object call(Object obj) {
                return cpk0.m11274G(function1, obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.xok0
            public final void call(Object obj) {
                cpk0.m11277J(this.f22391a, (Long) obj);
            }
        }));
    }

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super/*androidx.appcompat.app.a*/.onCreate(savedInstanceState);
        LayoutInflater layoutInflater = this.act.getLayoutInflater();
        layoutInflater.getClass();
        setContentView(m11288N(layoutInflater, null));
        m11286d0();
        m11282Y();
        m11298Z();
        m11284b0();
        m11287f0(CollectionsKt.listOf(this.merchandise), 0);
    }

    public void onShow(@Nullable DialogInterface dialog) {
        super.onShow(dialog);
        String str = this.merchandise.defaultStockKeepUnit.id;
        str.getClass();
        m11289P(str);
    }
}
