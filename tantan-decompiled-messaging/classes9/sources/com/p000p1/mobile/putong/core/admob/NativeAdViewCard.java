package com.p000p1.mobile.putong.core.admob;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.admob.NativeAdViewCard;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import l.c4g0;
import l.e30;
import l.e520;
import l.g6l0;
import l.gjx;
import l.h70;
import l.i520;
import l.irv;
import l.j70;
import l.le7;
import l.mkd0;
import l.o6j0;
import l.rm4;
import l.t100;
import l.u0n;
import l.w70;
import l.xaj0;
import l.xdl0;
import l.z3g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.gak;
import p006l.u4c0;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 b2\u00020\u00012\u00020\u0002:\u0001\u001dB!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0015¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\rH\u0015¢\u0006\u0004\b\u0017\u0010\u000fJ/\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\u00132\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\rH\u0002¢\u0006\u0004\b'\u0010\u000fJ\u0017\u0010*\u001a\u00020\r2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J'\u00101\u001a\u0002002\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u0013H\u0002¢\u0006\u0004\b1\u00102R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u00104R\u0016\u00108\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u00107R\u0016\u0010:\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u00107R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010@\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010=R\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010L\u001a\u00020I8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010N\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bM\u0010CR\u0016\u0010P\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bO\u00107R\u0016\u0010R\u001a\u00020I8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bQ\u0010KR\u0016\u0010U\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\"\u0010[\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010 \"\u0004\bY\u0010ZR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010a\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`¨\u0006c"}, d2 = {"Lcom/p1/mobile/putong/core/admob/NativeAdViewCard;", "Landroid/widget/FrameLayout;", "Ll/rm4;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "frag", "Ll/e30;", "", "action", "q", "(Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;Ll/e30;)V", "onDetachedFromWindow", "", "beginX", "beginY", "currentX", "currentY", "a", "(FFFF)Z", "b", "()Z", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "s", "(Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;)V", "r", "Landroid/graphics/drawable/Drawable;", "drawable", "setAdMobBlurAndGradientDrawable", "(Landroid/graphics/drawable/Drawable;)V", "", "colors", "corner", "top", "Landroid/graphics/drawable/GradientDrawable;", "p", "([IFZ)Landroid/graphics/drawable/GradientDrawable;", "Lcom/google/android/gms/ads/nativead/NativeAdView;", "Lcom/google/android/gms/ads/nativead/NativeAdView;", "adView", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "bottomImage", "c", "adLogo", "Landroid/widget/TextView;", "d", "Landroid/widget/TextView;", "adHeadLine", "e", "adBody", "Landroid/widget/Button;", "f", "Landroid/widget/Button;", "actionButton", "Lcom/google/android/gms/ads/nativead/MediaView;", "g", "Lcom/google/android/gms/ads/nativead/MediaView;", "mediaView", "Landroidx/cardview/widget/CardView;", "h", "Landroidx/cardview/widget/CardView;", "bottomCard", "i", "skipButton", "j", "iv_top_gradient", "k", "adCard", "l", "F", "ratio", "m", "Z", "getOnSwipe", "setOnSwipe", "(Z)V", "onSwipe", "n", "Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "Ll/c4g0;", "o", "Ll/c4g0;", "nativeAdSub", "Companion", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class NativeAdViewCard extends FrameLayout implements rm4 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p */
    @NotNull
    public static String f3127p = "ca-app-pub-6567608331519569/7831936718";

    /* JADX INFO: renamed from: q */
    public static boolean f3128q;

    /* JADX INFO: renamed from: r */
    public static e520 f3129r;

    /* JADX INFO: renamed from: s */
    @Nullable
    public static e30<Boolean> f3130s;

    /* JADX INFO: renamed from: t */
    @NotNull
    public static b<Boolean> f3131t;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public NativeAdView adView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public ImageView bottomImage;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public ImageView adLogo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public TextView adHeadLine;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public TextView adBody;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public Button actionButton;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public MediaView mediaView;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public CardView bottomCard;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public Button skipButton;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public ImageView iv_top_gradient;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public CardView adCard;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public float ratio;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean onSwipe;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public NewNewHomeFrag frag;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public c4g0 nativeAdSub;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.admob.NativeAdViewCard$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\t0\f0\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\u001b\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b!\u0010\u0003\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R0\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b#\u0010$\u0012\u0004\b)\u0010\u0003\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010\u0016¨\u00064"}, d2 = {"Lcom/p1/mobile/putong/core/admob/NativeAdViewCard$a;", "", "<init>", "()V", "", "e", "()Z", "Landroid/content/Context;", "context", "", "appId", "Lrx/c;", "Landroid/util/Pair;", "Ll/e520;", "j", "(Landroid/content/Context;Ljava/lang/String;)Lrx/c;", "Lcom/p1/mobile/android/app/Act;", "act", "", "l", "(Lcom/p1/mobile/android/app/Act;)V", "APP_ID", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "setAPP_ID", "(Ljava/lang/String;)V", "currentNativeAd", "Ll/e520;", "h", "()Ll/e520;", "n", "(Ll/e520;)V", "getCurrentNativeAd$annotations", "Ll/e30;", "clickAction", "Ll/e30;", "g", "()Ll/e30;", "m", "(Ll/e30;)V", "getClickAction$annotations", "Lrx/subjects/b;", "nativeAdNotifyPS", "Lrx/subjects/b;", "i", "()Lrx/subjects/b;", "setNativeAdNotifyPS", "(Lrx/subjects/b;)V", "isLoading", "Z", "TAG", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.admob.NativeAdViewCard$a$a */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"com/p1/mobile/putong/core/admob/NativeAdViewCard$a$a", "Ll/h70;", "Ll/irv;", "loadAdError", "", "x", "(Ll/irv;)V", "onAdClicked", "()V", "D", "B", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends h70 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f3147a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ z3g0<? super Pair<e520, String>> f3148b;

            public a(String str, z3g0<? super Pair<e520, String>> z3g0Var) {
                this.f3147a = str;
                this.f3148b = z3g0Var;
            }

            /* JADX INFO: renamed from: B */
            public void m1916B() {
                super.B();
            }

            /* JADX INFO: renamed from: D */
            public void m1917D() {
                super.D();
            }

            public void onAdClicked() {
                super.onAdClicked();
                o6j0.c("e_intl_ads_card", "p_suggest_users_home_view", new o6j0.a[0]);
                e30<Boolean> e30VarM1909g = NativeAdViewCard.INSTANCE.m1909g();
                if (e30VarM1909g != null) {
                    e30VarM1909g.call(Boolean.TRUE);
                }
            }

            /* JADX INFO: renamed from: x */
            public void m1918x(irv loadAdError) {
                loadAdError.getClass();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String.format(Locale.getDefault(), "domain: %s, code: %d, message: %s", Arrays.copyOf(new Object[]{loadAdError.b(), Integer.valueOf(loadAdError.a()), loadAdError.c()}, 3));
                this.f3148b.onNext(new Pair(null, this.f3147a));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static void m1902a(Pair pair) {
            Companion companion = NativeAdViewCard.INSTANCE;
            if (companion.m1907e() && NullChecker.a(companion.m1910h())) {
                companion.m1910h().a();
            }
            if (NullChecker.a(pair.first)) {
                Object obj = pair.first;
                obj.getClass();
                companion.m1915n((e520) obj);
                Objects.toString(companion.m1910h());
                companion.m1911i().onNext(Boolean.TRUE);
            } else {
                CoreModule.f1534c.f3652m0.m2908A8(VirtualCardType.NativeAdViewCard);
            }
            NativeAdViewCard.f3128q = false;
        }

        /* JADX INFO: renamed from: c */
        public static void m1904c(Throwable th) {
            NativeAdViewCard.f3128q = false;
            CoreModule.f1534c.f3652m0.m2908A8(VirtualCardType.NativeAdViewCard);
        }

        /* JADX INFO: renamed from: d */
        public static void m1905d(Context context, final String str, final z3g0 z3g0Var) {
            j70.a aVar = new j70.a(context, str);
            aVar.b(new e520.c() { // from class: l.t520
                /* JADX INFO: renamed from: a */
                public final void m24467a(e520 e520Var) {
                    NativeAdViewCard.Companion.m1906k(str, z3g0Var, e520Var);
                }
            });
            g6l0 g6l0VarA = new g6l0.a().b(true).a();
            g6l0VarA.getClass();
            i520 i520VarA = new i520.a().c(0).h(g6l0VarA).a();
            i520VarA.getClass();
            j70 j70VarA = aVar.c(new a(str, z3g0Var)).d(i520VarA).a();
            j70VarA.getClass();
            j70VarA.a(new w70.a().e(u0n.g(false)).i());
        }

        /* JADX INFO: renamed from: k */
        public static final void m1906k(String str, z3g0 z3g0Var, e520 e520Var) {
            e520Var.getClass();
            z3g0Var.onNext(new Pair(e520Var, str));
        }

        @JvmStatic
        /* JADX INFO: renamed from: e */
        public final boolean m1907e() {
            return NativeAdViewCard.f3129r != null;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final String m1908f() {
            return NativeAdViewCard.f3127p;
        }

        @Nullable
        /* JADX INFO: renamed from: g */
        public final e30<Boolean> m1909g() {
            return NativeAdViewCard.f3130s;
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final e520 m1910h() {
            e520 e520Var = NativeAdViewCard.f3129r;
            if (e520Var != null) {
                return e520Var;
            }
            Intrinsics.r("currentNativeAd");
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: i */
        public final b<Boolean> m1911i() {
            return NativeAdViewCard.f3131t;
        }

        @JvmStatic
        @SuppressLint({"MissingPermission"})
        @NotNull
        /* JADX INFO: renamed from: j */
        public final c<Pair<e520, String>> m1912j(@NotNull final Context context, @NotNull final String appId) {
            context.getClass();
            appId.getClass();
            c<Pair<e520, String>> cVarCreate = c.create(new c.a() { // from class: l.s520
                public final void call(Object obj) {
                    NativeAdViewCard.Companion.m1905d(context, appId, (z3g0) obj);
                }
            });
            cVarCreate.getClass();
            return cVarCreate;
        }

        @JvmStatic
        /* JADX INFO: renamed from: l */
        public final void m1913l(@NotNull Act act) {
            act.getClass();
            if (NativeAdViewCard.f3128q) {
                return;
            }
            NativeAdViewCard.f3128q = true;
            act.duringCreated(m1912j(act, m1908f())).subscribe(mkd0.H(new e30() { // from class: l.q520
                public final void call(Object obj) {
                    NativeAdViewCard.Companion.m1902a((Pair) obj);
                }
            }, new e30() { // from class: l.r520
                public final void call(Object obj) {
                    NativeAdViewCard.Companion.m1904c((Throwable) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: m */
        public final void m1914m(@Nullable e30<Boolean> e30Var) {
            NativeAdViewCard.f3130s = e30Var;
        }

        /* JADX INFO: renamed from: n */
        public final void m1915n(@NotNull e520 e520Var) {
            e520Var.getClass();
            NativeAdViewCard.f3129r = e520Var;
        }

        public Companion() {
        }
    }

    static {
        b<Boolean> bVarB = b.b();
        bVarB.getClass();
        f3131t = bVarB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdViewCard(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.ratio = 1.0f;
    }

    /* JADX INFO: renamed from: c */
    public static void m1883c(NativeAdViewCard nativeAdViewCard, xaj0 xaj0Var) {
        Bitmap bitmap = (Bitmap) xaj0Var.a;
        ImageView imageView = null;
        if (bitmap != null) {
            ImageView imageView2 = nativeAdViewCard.bottomImage;
            if (imageView2 == null) {
                Intrinsics.r("bottomImage");
                imageView2 = null;
            }
            imageView2.setImageBitmap(bitmap);
        }
        ImageView imageView3 = nativeAdViewCard.iv_top_gradient;
        if (imageView3 == null) {
            Intrinsics.r("iv_top_gradient");
        } else {
            imageView = imageView3;
        }
        Object obj = xaj0Var.c;
        obj.getClass();
        int iIntValue = ((Number) obj).intValue();
        Object obj2 = xaj0Var.b;
        obj2.getClass();
        imageView.setBackground(nativeAdViewCard.m1898p(new int[]{iIntValue, ((Number) obj2).intValue()}, t100.n, true));
    }

    /* JADX INFO: renamed from: d */
    public static void m1884d(Ref.IntRef intRef, NativeAdViewCard nativeAdViewCard) {
        if (intRef.element == 0) {
            NativeAdView nativeAdView = nativeAdViewCard.adView;
            View view = null;
            if (nativeAdView == null) {
                Intrinsics.r("adView");
                nativeAdView = null;
            }
            MediaView mediaView = nativeAdView.getMediaView();
            mediaView.getClass();
            int width = (int) (mediaView.getWidth() / nativeAdViewCard.ratio);
            View view2 = nativeAdViewCard.mediaView;
            if (view2 == null) {
                Intrinsics.r("mediaView");
            } else {
                view = view2;
            }
            xdl0.C0(view, width);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m1885e(Throwable th) {
        gak.m15631c(th);
    }

    /* JADX INFO: renamed from: f */
    public static void m1886f(e30 e30Var, View view) {
        e30Var.call(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: g */
    public static void m1887g(NativeAdViewCard nativeAdViewCard, Ref.IntRef intRef) {
        View view = nativeAdViewCard.mediaView;
        View view2 = null;
        if (view == null) {
            Intrinsics.r("mediaView");
            view = null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
            View view3 = nativeAdViewCard.mediaView;
            if (view3 == null) {
                Intrinsics.r("mediaView");
            } else {
                view2 = view3;
            }
            view2.setLayoutParams(layoutParams);
        }
    }

    @Nullable
    public static final e30<Boolean> getClickAction() {
        return INSTANCE.m1909g();
    }

    @NotNull
    public static final e520 getCurrentNativeAd() {
        return INSTANCE.m1910h();
    }

    /* JADX INFO: renamed from: h */
    public static void m1888h(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static void m1889i(NativeAdViewCard nativeAdViewCard, Boolean bool) {
        if (bool.booleanValue()) {
            nativeAdViewCard.m1900r();
        }
    }

    private final void setAdMobBlurAndGradientDrawable(Drawable drawable) {
        Frag frag = this.frag;
        if (frag == null) {
            Intrinsics.r("frag");
            frag = null;
        }
        frag.duringCreated(u0n.r(drawable, 25, true, "#FFEDE5")).subscribe(mkd0.H(new e30() { // from class: l.j520
            public final void call(Object obj) {
                NativeAdViewCard.m1883c(this.f14999a, (xaj0) obj);
            }
        }, new e30() { // from class: l.k520
            public final void call(Object obj) {
                NativeAdViewCard.m1885e((Throwable) obj);
            }
        }));
    }

    public static final void setClickAction(@Nullable e30<Boolean> e30Var) {
        INSTANCE.m1914m(e30Var);
    }

    public static final void setCurrentNativeAd(@NotNull e520 e520Var) {
        INSTANCE.m1915n(e520Var);
    }

    /* JADX INFO: renamed from: a */
    public boolean m1896a(float beginX, float beginY, float currentX, float currentY) {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public boolean m1897b() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@Nullable MotionEvent ev) {
        try {
            return super.dispatchTouchEvent(ev);
        } catch (NullPointerException e) {
            CrashHelper.c(e);
            return false;
        }
    }

    public final boolean getOnSwipe() {
        return this.onSwipe;
    }

    @Override // android.view.ViewGroup, android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void onDetachedFromWindow() {
        NewNewHomeFrag newNewHomeFrag;
        super.onDetachedFromWindow();
        if (NullChecker.a(this.nativeAdSub)) {
            mkd0.z(this.nativeAdSub);
        }
        if (this.onSwipe || (newNewHomeFrag = this.frag) == null) {
            return;
        }
        if (newNewHomeFrag == null) {
            Intrinsics.r("frag");
            newNewHomeFrag = null;
        }
        newNewHomeFrag.C.n6();
        this.onSwipe = false;
    }

    @Override // android.view.View
    @SuppressLint({"ResourceAsColor"})
    public void onFinishInflate() {
        super.onFinishInflate();
        NativeAdView nativeAdViewFindViewById = findViewById(u4c0.f23193r5);
        nativeAdViewFindViewById.getClass();
        this.adView = nativeAdViewFindViewById;
        View viewFindViewById = findViewById(u4c0.f23313y6);
        viewFindViewById.getClass();
        this.bottomImage = (ImageView) viewFindViewById;
        MediaView mediaViewFindViewById = findViewById(u4c0.f23119n);
        mediaViewFindViewById.getClass();
        this.mediaView = mediaViewFindViewById;
        View viewFindViewById2 = findViewById(u4c0.f23102m);
        viewFindViewById2.getClass();
        this.adLogo = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(u4c0.f23085l);
        viewFindViewById3.getClass();
        this.adHeadLine = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(u4c0.f23001g);
        viewFindViewById4.getClass();
        this.adBody = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(u4c0.f22482B0);
        viewFindViewById5.getClass();
        this.actionButton = (Button) viewFindViewById5;
        CardView cardViewFindViewById = findViewById(u4c0.f23222t0);
        cardViewFindViewById.getClass();
        this.bottomCard = cardViewFindViewById;
        View viewFindViewById6 = findViewById(u4c0.f22516D0);
        viewFindViewById6.getClass();
        this.skipButton = (Button) viewFindViewById6;
        View viewFindViewById7 = findViewById(u4c0.f22488B6);
        viewFindViewById7.getClass();
        this.iv_top_gradient = (ImageView) viewFindViewById7;
        CardView cardViewFindViewById2 = findViewById(u4c0.f23035i);
        cardViewFindViewById2.getClass();
        this.adCard = cardViewFindViewById2;
        Button button = null;
        if (IntlCountryCodeController.m21v()) {
            CardView cardView = this.bottomCard;
            if (cardView == null) {
                Intrinsics.r("bottomCard");
                cardView = null;
            }
            cardView.setRadius(0.0f);
            CardView cardView2 = this.adCard;
            if (cardView2 == null) {
                Intrinsics.r("adCard");
                cardView2 = null;
            }
            cardView2.setRadius(0.0f);
        }
        if (le7.h()) {
            CardView cardView3 = this.bottomCard;
            if (cardView3 == null) {
                Intrinsics.r("bottomCard");
                cardView3 = null;
            }
            int i = t100.o;
            cardView3.setRadius(i);
            CardView cardView4 = this.adCard;
            if (cardView4 == null) {
                Intrinsics.r("adCard");
                cardView4 = null;
            }
            cardView4.setRadius(i);
        }
        Button button2 = this.skipButton;
        if (button2 == null) {
            Intrinsics.r("skipButton");
        } else {
            button = button2;
        }
        xdl0.M(button, true);
    }

    /* JADX INFO: renamed from: p */
    public final GradientDrawable m1898p(int[] colors, float corner, boolean top) {
        GradientDrawable gradientDrawableI = u0n.i(colors);
        if (le7.h()) {
            int i = t100.o;
            gradientDrawableI.setCornerRadii(new float[]{i, i, i, i, i, i, i, i});
        } else if (IntlCountryCodeController.m21v()) {
            gradientDrawableI.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
        } else if (top) {
            gradientDrawableI.setCornerRadii(new float[]{corner, corner, corner, corner, 0.0f, 0.0f, 0.0f, 0.0f});
        } else {
            gradientDrawableI.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, corner, corner, corner, corner});
        }
        gradientDrawableI.getClass();
        return gradientDrawableI;
    }

    /* JADX INFO: renamed from: q */
    public final void m1899q(@NotNull NewNewHomeFrag frag, @NotNull final e30<Boolean> action) {
        frag.getClass();
        action.getClass();
        m1901s(frag);
        this.frag = frag;
        NativeAdView nativeAdView = this.adView;
        Button button = null;
        if (nativeAdView == null) {
            Intrinsics.r("adView");
            nativeAdView = null;
        }
        TextView textView = this.adHeadLine;
        if (textView == null) {
            Intrinsics.r("adHeadLine");
            textView = null;
        }
        nativeAdView.setHeadlineView(textView);
        NativeAdView nativeAdView2 = this.adView;
        if (nativeAdView2 == null) {
            Intrinsics.r("adView");
            nativeAdView2 = null;
        }
        TextView textView2 = this.adBody;
        if (textView2 == null) {
            Intrinsics.r("adBody");
            textView2 = null;
        }
        nativeAdView2.setBodyView(textView2);
        NativeAdView nativeAdView3 = this.adView;
        if (nativeAdView3 == null) {
            Intrinsics.r("adView");
            nativeAdView3 = null;
        }
        Button button2 = this.actionButton;
        if (button2 == null) {
            Intrinsics.r("actionButton");
            button2 = null;
        }
        nativeAdView3.setCallToActionView(button2);
        NativeAdView nativeAdView4 = this.adView;
        if (nativeAdView4 == null) {
            Intrinsics.r("adView");
            nativeAdView4 = null;
        }
        ImageView imageView = this.adLogo;
        if (imageView == null) {
            Intrinsics.r("adLogo");
            imageView = null;
        }
        nativeAdView4.setIconView(imageView);
        NativeAdView nativeAdView5 = this.adView;
        if (nativeAdView5 == null) {
            Intrinsics.r("adView");
            nativeAdView5 = null;
        }
        MediaView mediaView = this.mediaView;
        if (mediaView == null) {
            Intrinsics.r("mediaView");
            mediaView = null;
        }
        nativeAdView5.setMediaView(mediaView);
        Companion companion = INSTANCE;
        if (companion.m1907e() && NullChecker.a(companion.m1910h())) {
            m1900r();
        }
        f3130s = action;
        Button button3 = this.skipButton;
        if (button3 == null) {
            Intrinsics.r("skipButton");
        } else {
            button = button3;
        }
        xdl0.L(button, new View.OnClickListener() { // from class: l.l520
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NativeAdViewCard.m1886f(action, view);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m1900r() {
        Companion companion = INSTANCE;
        NativeAdView nativeAdView = null;
        if (companion.m1907e() && NullChecker.a(companion.m1910h())) {
            boolean zA = NullChecker.a(companion.m1910h().d());
            NativeAdView nativeAdView2 = this.adView;
            if (zA) {
                if (nativeAdView2 == null) {
                    Intrinsics.r("adView");
                    nativeAdView2 = null;
                }
                View headlineView = nativeAdView2.getHeadlineView();
                headlineView.getClass();
                ((TextView) headlineView).setText(companion.m1910h().d());
                NativeAdView nativeAdView3 = this.adView;
                if (nativeAdView3 == null) {
                    Intrinsics.r("adView");
                    nativeAdView3 = null;
                }
                xdl0.M0(nativeAdView3.getHeadlineView(), true);
            } else {
                if (nativeAdView2 == null) {
                    Intrinsics.r("adView");
                    nativeAdView2 = null;
                }
                xdl0.M0(nativeAdView2.getHeadlineView(), false);
            }
            boolean zA2 = NullChecker.a(companion.m1910h().b());
            NativeAdView nativeAdView4 = this.adView;
            if (zA2) {
                if (nativeAdView4 == null) {
                    Intrinsics.r("adView");
                    nativeAdView4 = null;
                }
                View bodyView = nativeAdView4.getBodyView();
                bodyView.getClass();
                ((TextView) bodyView).setText(companion.m1910h().b());
            } else {
                if (nativeAdView4 == null) {
                    Intrinsics.r("adView");
                    nativeAdView4 = null;
                }
                xdl0.M0(nativeAdView4.getBodyView(), false);
            }
            boolean zA3 = NullChecker.a(companion.m1910h().c());
            NativeAdView nativeAdView5 = this.adView;
            if (zA3) {
                if (nativeAdView5 == null) {
                    Intrinsics.r("adView");
                    nativeAdView5 = null;
                }
                xdl0.M0(nativeAdView5.getCallToActionView(), true);
                NativeAdView nativeAdView6 = this.adView;
                if (nativeAdView6 == null) {
                    Intrinsics.r("adView");
                    nativeAdView6 = null;
                }
                View callToActionView = nativeAdView6.getCallToActionView();
                callToActionView.getClass();
                ((TextView) callToActionView).setText(companion.m1910h().c());
            } else {
                if (nativeAdView5 == null) {
                    Intrinsics.r("adView");
                    nativeAdView5 = null;
                }
                xdl0.M0(nativeAdView5.getCallToActionView(), false);
            }
            boolean zA4 = NullChecker.a(companion.m1910h().e());
            NativeAdView nativeAdView7 = this.adView;
            if (zA4) {
                if (nativeAdView7 == null) {
                    Intrinsics.r("adView");
                    nativeAdView7 = null;
                }
                View iconView = nativeAdView7.getIconView();
                iconView.getClass();
                ImageView imageView = (ImageView) iconView;
                e520.b bVarE = companion.m1910h().e();
                imageView.setImageDrawable(bVarE != null ? bVarE.a() : null);
                NativeAdView nativeAdView8 = this.adView;
                if (nativeAdView8 == null) {
                    Intrinsics.r("adView");
                    nativeAdView8 = null;
                }
                xdl0.M0(nativeAdView8.getIconView(), true);
            } else {
                if (nativeAdView7 == null) {
                    Intrinsics.r("adView");
                    nativeAdView7 = null;
                }
                xdl0.M0(nativeAdView7.getIconView(), false);
            }
            gjx gjxVarF = companion.m1910h().f();
            Drawable drawableB = gjxVarF != null ? gjxVarF.b() : null;
            if (drawableB != null) {
                setAdMobBlurAndGradientDrawable(drawableB);
            } else {
                ImageView imageView2 = this.bottomImage;
                if (imageView2 == null) {
                    Intrinsics.r("bottomImage");
                    imageView2 = null;
                }
                imageView2.setBackgroundColor(Color.parseColor("#FFEDE5"));
            }
        }
        gjx gjxVarF2 = companion.m1910h().f();
        this.ratio = ((Float) (gjxVarF2 != null ? Float.valueOf(gjxVarF2.c()) : 1)).floatValue();
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = (int) (getWidth() / this.ratio);
        post(new Runnable() { // from class: l.m520
            @Override // java.lang.Runnable
            public final void run() {
                NativeAdViewCard.m1887g(this.f16799a, intRef);
            }
        });
        NativeAdView nativeAdView9 = this.adView;
        if (nativeAdView9 == null) {
            Intrinsics.r("adView");
            nativeAdView9 = null;
        }
        MediaView mediaView = nativeAdView9.getMediaView();
        if (mediaView != null) {
            mediaView.setMediaContent(companion.m1910h().f());
        }
        NativeAdView nativeAdView10 = this.adView;
        if (nativeAdView10 == null) {
            Intrinsics.r("adView");
            nativeAdView10 = null;
        }
        MediaView mediaView2 = nativeAdView10.getMediaView();
        if (mediaView2 != null) {
            mediaView2.post(new Runnable() { // from class: l.n520
                @Override // java.lang.Runnable
                public final void run() {
                    NativeAdViewCard.m1884d(intRef, this);
                }
            });
        }
        NativeAdView nativeAdView11 = this.adView;
        if (nativeAdView11 == null) {
            Intrinsics.r("adView");
        } else {
            nativeAdView = nativeAdView11;
        }
        nativeAdView.setNativeAd(companion.m1910h());
    }

    /* JADX INFO: renamed from: s */
    public final void m1901s(NewNewHomeFrag frag) {
        if (NullChecker.a(this.nativeAdSub)) {
            mkd0.z(this.nativeAdSub);
        }
        this.nativeAdSub = frag.duringCreated(f3131t).subscribe(mkd0.H(new e30() { // from class: l.o520
            public final void call(Object obj) {
                NativeAdViewCard.m1889i(this.f18018a, (Boolean) obj);
            }
        }, new e30() { // from class: l.p520
            public final void call(Object obj) {
                NativeAdViewCard.m1888h((Throwable) obj);
            }
        }));
    }

    public final void setOnSwipe(boolean z) {
        this.onSwipe = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAdViewCard(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAdViewCard(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}
