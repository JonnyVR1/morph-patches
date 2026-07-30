package com.p046p1.mobile.putong.core.admob;

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
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.admob.NativeAdViewCard;
import com.p046p1.mobile.putong.core.data.StickStatus;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p046p1.mobile.putong.data.OMSSizeType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p133rx.subjects.C22393b;
import p149l.c4g0;
import p149l.e30;
import p149l.e520;
import p149l.g6l0;
import p149l.gak;
import p149l.gjx;
import p149l.h70;
import p149l.i520;
import p149l.irv;
import p149l.j70;
import p149l.le7;
import p149l.mkd0;
import p149l.o6j0;
import p149l.rm4;
import p149l.t100;
import p149l.u0n;
import p149l.u4c0;
import p149l.w70;
import p149l.xaj0;
import p149l.xdl0;
import p149l.z3g0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 b2\u00020\u00012\u00020\u0002:\u0001\u001dB!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0015¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\rH\u0015¢\u0006\u0004\b\u0017\u0010\u000fJ/\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\u00132\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\rH\u0002¢\u0006\u0004\b'\u0010\u000fJ\u0017\u0010*\u001a\u00020\r2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J'\u00101\u001a\u0002002\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u0013H\u0002¢\u0006\u0004\b1\u00102R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u00104R\u0016\u00108\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u00107R\u0016\u0010:\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u00107R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010@\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010=R\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010L\u001a\u00020I8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010N\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bM\u0010CR\u0016\u0010P\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bO\u00107R\u0016\u0010R\u001a\u00020I8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bQ\u0010KR\u0016\u0010U\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\"\u0010[\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010 \"\u0004\bY\u0010ZR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010a\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`¨\u0006c"}, m87232d2 = {"Lcom/p1/mobile/putong/core/admob/NativeAdViewCard;", "Landroid/widget/FrameLayout;", "Ll/rm4;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "frag", "Ll/e30;", "", "action", "q", "(Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;Ll/e30;)V", "onDetachedFromWindow", "", "beginX", "beginY", "currentX", "currentY", "a", "(FFFF)Z", "b", "()Z", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", BLiveStormDanmakuGiftResourceType.f44446s, "(Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;)V", "r", "Landroid/graphics/drawable/Drawable;", "drawable", "setAdMobBlurAndGradientDrawable", "(Landroid/graphics/drawable/Drawable;)V", "", "colors", "corner", StickStatus.top, "Landroid/graphics/drawable/GradientDrawable;", "p", "([IFZ)Landroid/graphics/drawable/GradientDrawable;", "Lcom/google/android/gms/ads/nativead/NativeAdView;", "Lcom/google/android/gms/ads/nativead/NativeAdView;", "adView", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "bottomImage", "c", "adLogo", "Landroid/widget/TextView;", Constants.INAPP_DATA_TAG, "Landroid/widget/TextView;", "adHeadLine", "e", "adBody", "Landroid/widget/Button;", "f", "Landroid/widget/Button;", "actionButton", "Lcom/google/android/gms/ads/nativead/MediaView;", "g", "Lcom/google/android/gms/ads/nativead/MediaView;", "mediaView", "Landroidx/cardview/widget/CardView;", "h", "Landroidx/cardview/widget/CardView;", "bottomCard", RXScreenCaptureService.KEY_INDEX, "skipButton", "j", "iv_top_gradient", "k", "adCard", BLiveStormDanmakuGiftResourceType.f44444l, "F", OMSSizeType.ratio, "m", "Z", "getOnSwipe", "setOnSwipe", "(Z)V", "onSwipe", "n", "Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "Ll/c4g0;", "o", "Ll/c4g0;", "nativeAdSub", "Companion", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class NativeAdViewCard extends FrameLayout implements rm4 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p */
    @NotNull
    public static String f19138p = "ca-app-pub-6567608331519569/7831936718";

    /* JADX INFO: renamed from: q */
    public static boolean f19139q;

    /* JADX INFO: renamed from: r */
    public static e520 f19140r;

    /* JADX INFO: renamed from: s */
    @Nullable
    public static e30<Boolean> f19141s;

    /* JADX INFO: renamed from: t */
    @NotNull
    public static C22393b<Boolean> f19142t;

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
    @Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\t0\f0\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\u001b\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b!\u0010\u0003\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R0\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b#\u0010$\u0012\u0004\b)\u0010\u0003\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010\u0016¨\u00064"}, m87232d2 = {"Lcom/p1/mobile/putong/core/admob/NativeAdViewCard$a;", "", "<init>", "()V", "", "e", "()Z", "Landroid/content/Context;", "context", "", RemoteConfigConstants.RequestFieldKey.APP_ID, "Lrx/c;", "Landroid/util/Pair;", "Ll/e520;", "j", "(Landroid/content/Context;Ljava/lang/String;)Lrx/c;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", BLiveStormDanmakuGiftResourceType.f44444l, "(Lcom/p1/mobile/android/app/Act;)V", "APP_ID", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "setAPP_ID", "(Ljava/lang/String;)V", "currentNativeAd", "Ll/e520;", "h", "()Ll/e520;", "n", "(Ll/e520;)V", "getCurrentNativeAd$annotations", "Ll/e30;", "clickAction", "Ll/e30;", "g", "()Ll/e30;", "m", "(Ll/e30;)V", "getClickAction$annotations", "Lrx/subjects/b;", "nativeAdNotifyPS", "Lrx/subjects/b;", RXScreenCaptureService.KEY_INDEX, "()Lrx/subjects/b;", "setNativeAdNotifyPS", "(Lrx/subjects/b;)V", "isLoading", "Z", "TAG", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.admob.NativeAdViewCard$a$a */
        @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, m87232d2 = {"com/p1/mobile/putong/core/admob/NativeAdViewCard$a$a", "Ll/h70;", "Ll/irv;", "loadAdError", "", BaseSei.f13930X, "(Ll/irv;)V", "onAdClicked", "()V", "D", "B", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
        public static final class a extends h70 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f19158a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ z3g0<? super Pair<e520, String>> f19159b;

            public a(String str, z3g0<? super Pair<e520, String>> z3g0Var) {
                this.f19158a = str;
                this.f19159b = z3g0Var;
            }

            @Override // p149l.h70
            /* JADX INFO: renamed from: B */
            public void mo29988B() {
                super.mo29988B();
            }

            @Override // p149l.h70
            /* JADX INFO: renamed from: D */
            public void mo29989D() {
                super.mo29989D();
            }

            @Override // p149l.h70
            public void onAdClicked() {
                super.onAdClicked();
                o6j0.m162859c("e_intl_ads_card", "p_suggest_users_home_view", new o6j0.C18854a[0]);
                e30<Boolean> e30VarM29981g = NativeAdViewCard.INSTANCE.m29981g();
                if (e30VarM29981g != null) {
                    e30VarM29981g.call(Boolean.TRUE);
                }
            }

            @Override // p149l.h70
            /* JADX INFO: renamed from: x */
            public void mo29990x(irv loadAdError) {
                loadAdError.getClass();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String.format(Locale.getDefault(), "domain: %s, code: %d, message: %s", Arrays.copyOf(new Object[]{loadAdError.m119704b(), Integer.valueOf(loadAdError.m119703a()), loadAdError.m119705c()}, 3));
                this.f19159b.m132487l(new Pair(null, this.f19158a));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static void m29974a(Pair pair) {
            Companion companion = NativeAdViewCard.INSTANCE;
            if (companion.m29979e() && NullChecker.m81303a(companion.m29982h())) {
                companion.m29982h().mo98603a();
            }
            if (NullChecker.m81303a(pair.first)) {
                Object obj = pair.first;
                obj.getClass();
                companion.m29987n((e520) obj);
                Objects.toString(companion.m29982h());
                companion.m29983i().m132487l(Boolean.TRUE);
            } else {
                CoreModule.f17545c.f19663m0.m30978A8(VirtualCardType.NativeAdViewCard);
            }
            NativeAdViewCard.f19139q = false;
        }

        /* JADX INFO: renamed from: c */
        public static void m29976c(Throwable th) {
            NativeAdViewCard.f19139q = false;
            CoreModule.f17545c.f19663m0.m30978A8(VirtualCardType.NativeAdViewCard);
        }

        /* JADX INFO: renamed from: d */
        public static void m29977d(Context context, final String str, final z3g0 z3g0Var) {
            j70.C17709a c17709a = new j70.C17709a(context, str);
            c17709a.m140068b(new e520.InterfaceC16544c() { // from class: l.t520
                @Override // p149l.e520.InterfaceC16544c
                /* JADX INFO: renamed from: a */
                public final void mo95151a(e520 e520Var) {
                    NativeAdViewCard.Companion.m29978k(str, z3g0Var, e520Var);
                }
            });
            g6l0 g6l0VarM124603a = new g6l0.C17012a().m124604b(true).m124603a();
            g6l0VarM124603a.getClass();
            i520 i520VarM134459a = new i520.C17483a().m134461c(0).m134466h(g6l0VarM124603a).m134459a();
            i520VarM134459a.getClass();
            j70 j70VarM140067a = c17709a.m140069c(new a(str, z3g0Var)).m140070d(i520VarM134459a).m140067a();
            j70VarM140067a.getClass();
            j70VarM140067a.m140064a(new w70.C20817a().m191886e(u0n.m191349g(false)).m201999i());
        }

        /* JADX INFO: renamed from: k */
        public static final void m29978k(String str, z3g0 z3g0Var, e520 e520Var) {
            e520Var.getClass();
            z3g0Var.m132487l(new Pair(e520Var, str));
        }

        @JvmStatic
        /* JADX INFO: renamed from: e */
        public final boolean m29979e() {
            return NativeAdViewCard.f19140r != null;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final String m29980f() {
            return NativeAdViewCard.f19138p;
        }

        @Nullable
        /* JADX INFO: renamed from: g */
        public final e30<Boolean> m29981g() {
            return NativeAdViewCard.f19141s;
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final e520 m29982h() {
            e520 e520Var = NativeAdViewCard.f19140r;
            if (e520Var != null) {
                return e520Var;
            }
            Intrinsics.m87502r("currentNativeAd");
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: i */
        public final C22393b<Boolean> m29983i() {
            return NativeAdViewCard.f19142t;
        }

        @JvmStatic
        @SuppressLint({"MissingPermission"})
        @NotNull
        /* JADX INFO: renamed from: j */
        public final C22306c<Pair<e520, String>> m29984j(@NotNull final Context context, @NotNull final String appId) {
            context.getClass();
            appId.getClass();
            C22306c<Pair<e520, String>> c22306cCreate = C22306c.create(new C22306c.a() { // from class: l.s520
                @Override // p149l.e30
                public final void call(Object obj) {
                    NativeAdViewCard.Companion.m29977d(context, appId, (z3g0) obj);
                }
            });
            c22306cCreate.getClass();
            return c22306cCreate;
        }

        @JvmStatic
        /* JADX INFO: renamed from: l */
        public final void m29985l(@NotNull Act act) {
            act.getClass();
            if (NativeAdViewCard.f19139q) {
                return;
            }
            NativeAdViewCard.f19139q = true;
            act.duringCreated(m29984j(act, m29980f())).subscribe(mkd0.m154956H(new e30() { // from class: l.q520
                @Override // p149l.e30
                public final void call(Object obj) {
                    NativeAdViewCard.Companion.m29974a((Pair) obj);
                }
            }, new e30() { // from class: l.r520
                @Override // p149l.e30
                public final void call(Object obj) {
                    NativeAdViewCard.Companion.m29976c((Throwable) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: m */
        public final void m29986m(@Nullable e30<Boolean> e30Var) {
            NativeAdViewCard.f19141s = e30Var;
        }

        /* JADX INFO: renamed from: n */
        public final void m29987n(@NotNull e520 e520Var) {
            e520Var.getClass();
            NativeAdViewCard.f19140r = e520Var;
        }

        public Companion() {
        }
    }

    static {
        C22393b<Boolean> c22393bM221521b = C22393b.m221521b();
        c22393bM221521b.getClass();
        f19142t = c22393bM221521b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdViewCard(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.ratio = 1.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static void m29955c(NativeAdViewCard nativeAdViewCard, xaj0 xaj0Var) {
        Bitmap bitmap = (Bitmap) xaj0Var.f191751a;
        ImageView imageView = null;
        if (bitmap != null) {
            ImageView imageView2 = nativeAdViewCard.bottomImage;
            if (imageView2 == null) {
                Intrinsics.m87502r("bottomImage");
                imageView2 = null;
            }
            imageView2.setImageBitmap(bitmap);
        }
        ImageView imageView3 = nativeAdViewCard.iv_top_gradient;
        if (imageView3 == null) {
            Intrinsics.m87502r("iv_top_gradient");
        } else {
            imageView = imageView3;
        }
        C c = xaj0Var.f191753c;
        c.getClass();
        int iIntValue = ((Number) c).intValue();
        B b = xaj0Var.f191752b;
        b.getClass();
        imageView.setBackground(nativeAdViewCard.m29970p(new int[]{iIntValue, ((Number) b).intValue()}, t100.f167265n, true));
    }

    /* JADX INFO: renamed from: d */
    public static void m29956d(Ref.IntRef intRef, NativeAdViewCard nativeAdViewCard) {
        if (intRef.element == 0) {
            NativeAdView nativeAdView = nativeAdViewCard.adView;
            MediaView mediaView = null;
            if (nativeAdView == null) {
                Intrinsics.m87502r("adView");
                nativeAdView = null;
            }
            MediaView mediaView2 = nativeAdView.getMediaView();
            mediaView2.getClass();
            int width = (int) (mediaView2.getWidth() / nativeAdViewCard.ratio);
            MediaView mediaView3 = nativeAdViewCard.mediaView;
            if (mediaView3 == null) {
                Intrinsics.m87502r("mediaView");
            } else {
                mediaView = mediaView3;
            }
            xdl0.m208325C0(mediaView, width);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m29957e(Throwable th) {
        gak.m125002c(th);
    }

    /* JADX INFO: renamed from: f */
    public static void m29958f(e30 e30Var, View view) {
        e30Var.call(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: g */
    public static void m29959g(NativeAdViewCard nativeAdViewCard, Ref.IntRef intRef) {
        MediaView mediaView = nativeAdViewCard.mediaView;
        MediaView mediaView2 = null;
        if (mediaView == null) {
            Intrinsics.m87502r("mediaView");
            mediaView = null;
        }
        ViewGroup.LayoutParams layoutParams = mediaView.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
            MediaView mediaView3 = nativeAdViewCard.mediaView;
            if (mediaView3 == null) {
                Intrinsics.m87502r("mediaView");
            } else {
                mediaView2 = mediaView3;
            }
            mediaView2.setLayoutParams(layoutParams);
        }
    }

    @Nullable
    public static final e30<Boolean> getClickAction() {
        return INSTANCE.m29981g();
    }

    @NotNull
    public static final e520 getCurrentNativeAd() {
        return INSTANCE.m29982h();
    }

    /* JADX INFO: renamed from: h */
    public static void m29960h(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static void m29961i(NativeAdViewCard nativeAdViewCard, Boolean bool) {
        if (bool.booleanValue()) {
            nativeAdViewCard.m29972r();
        }
    }

    private final void setAdMobBlurAndGradientDrawable(Drawable drawable) {
        NewNewHomeFrag newNewHomeFrag = this.frag;
        if (newNewHomeFrag == null) {
            Intrinsics.m87502r("frag");
            newNewHomeFrag = null;
        }
        newNewHomeFrag.duringCreated(u0n.m191359r(drawable, 25, true, "#FFEDE5")).subscribe(mkd0.m154956H(new e30() { // from class: l.j520
            @Override // p149l.e30
            public final void call(Object obj) {
                NativeAdViewCard.m29955c(this.f116262a, (xaj0) obj);
            }
        }, new e30() { // from class: l.k520
            @Override // p149l.e30
            public final void call(Object obj) {
                NativeAdViewCard.m29957e((Throwable) obj);
            }
        }));
    }

    public static final void setClickAction(@Nullable e30<Boolean> e30Var) {
        INSTANCE.m29986m(e30Var);
    }

    public static final void setCurrentNativeAd(@NotNull e520 e520Var) {
        INSTANCE.m29987n(e520Var);
    }

    @Override // p149l.rm4
    /* JADX INFO: renamed from: a */
    public boolean mo29968a(float beginX, float beginY, float currentX, float currentY) {
        return false;
    }

    @Override // p149l.rm4
    /* JADX INFO: renamed from: b */
    public boolean mo29969b() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@Nullable MotionEvent ev) {
        try {
            return super.dispatchTouchEvent(ev);
        } catch (NullPointerException e) {
            CrashHelper.m81296c(e);
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
        if (NullChecker.m81303a(this.nativeAdSub)) {
            mkd0.m154992z(this.nativeAdSub);
        }
        if (this.onSwipe || (newNewHomeFrag = this.frag) == null) {
            return;
        }
        if (newNewHomeFrag == null) {
            Intrinsics.m87502r("frag");
            newNewHomeFrag = null;
        }
        newNewHomeFrag.f21678C.m37329n6();
        this.onSwipe = false;
    }

    @Override // android.view.View
    @SuppressLint({"ResourceAsColor"})
    public void onFinishInflate() {
        super.onFinishInflate();
        View viewFindViewById = findViewById(u4c0.f174445r5);
        viewFindViewById.getClass();
        this.adView = (NativeAdView) viewFindViewById;
        View viewFindViewById2 = findViewById(u4c0.f174565y6);
        viewFindViewById2.getClass();
        this.bottomImage = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(u4c0.f174371n);
        viewFindViewById3.getClass();
        this.mediaView = (MediaView) viewFindViewById3;
        View viewFindViewById4 = findViewById(u4c0.f174354m);
        viewFindViewById4.getClass();
        this.adLogo = (ImageView) viewFindViewById4;
        View viewFindViewById5 = findViewById(u4c0.f174337l);
        viewFindViewById5.getClass();
        this.adHeadLine = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(u4c0.f174253g);
        viewFindViewById6.getClass();
        this.adBody = (TextView) viewFindViewById6;
        View viewFindViewById7 = findViewById(u4c0.f173734B0);
        viewFindViewById7.getClass();
        this.actionButton = (Button) viewFindViewById7;
        View viewFindViewById8 = findViewById(u4c0.f174474t0);
        viewFindViewById8.getClass();
        this.bottomCard = (CardView) viewFindViewById8;
        View viewFindViewById9 = findViewById(u4c0.f173768D0);
        viewFindViewById9.getClass();
        this.skipButton = (Button) viewFindViewById9;
        View viewFindViewById10 = findViewById(u4c0.f173740B6);
        viewFindViewById10.getClass();
        this.iv_top_gradient = (ImageView) viewFindViewById10;
        View viewFindViewById11 = findViewById(u4c0.f174287i);
        viewFindViewById11.getClass();
        this.adCard = (CardView) viewFindViewById11;
        Button button = null;
        if (IntlCountryCodeController.m28126v()) {
            CardView cardView = this.bottomCard;
            if (cardView == null) {
                Intrinsics.m87502r("bottomCard");
                cardView = null;
            }
            cardView.setRadius(0.0f);
            CardView cardView2 = this.adCard;
            if (cardView2 == null) {
                Intrinsics.m87502r("adCard");
                cardView2 = null;
            }
            cardView2.setRadius(0.0f);
        }
        if (le7.m149486h()) {
            CardView cardView3 = this.bottomCard;
            if (cardView3 == null) {
                Intrinsics.m87502r("bottomCard");
                cardView3 = null;
            }
            int i = t100.f167266o;
            cardView3.setRadius(i);
            CardView cardView4 = this.adCard;
            if (cardView4 == null) {
                Intrinsics.m87502r("adCard");
                cardView4 = null;
            }
            cardView4.setRadius(i);
        }
        Button button2 = this.skipButton;
        if (button2 == null) {
            Intrinsics.m87502r("skipButton");
        } else {
            button = button2;
        }
        xdl0.m208344M(button, true);
    }

    /* JADX INFO: renamed from: p */
    public final GradientDrawable m29970p(int[] colors, float corner, boolean top) {
        GradientDrawable gradientDrawableM191351i = u0n.m191351i(colors);
        if (le7.m149486h()) {
            int i = t100.f167266o;
            gradientDrawableM191351i.setCornerRadii(new float[]{i, i, i, i, i, i, i, i});
        } else if (IntlCountryCodeController.m28126v()) {
            gradientDrawableM191351i.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
        } else if (top) {
            gradientDrawableM191351i.setCornerRadii(new float[]{corner, corner, corner, corner, 0.0f, 0.0f, 0.0f, 0.0f});
        } else {
            gradientDrawableM191351i.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, corner, corner, corner, corner});
        }
        gradientDrawableM191351i.getClass();
        return gradientDrawableM191351i;
    }

    /* JADX INFO: renamed from: q */
    public final void m29971q(@NotNull NewNewHomeFrag frag, @NotNull final e30<Boolean> action) {
        frag.getClass();
        action.getClass();
        m29973s(frag);
        this.frag = frag;
        NativeAdView nativeAdView = this.adView;
        Button button = null;
        if (nativeAdView == null) {
            Intrinsics.m87502r("adView");
            nativeAdView = null;
        }
        TextView textView = this.adHeadLine;
        if (textView == null) {
            Intrinsics.m87502r("adHeadLine");
            textView = null;
        }
        nativeAdView.setHeadlineView(textView);
        NativeAdView nativeAdView2 = this.adView;
        if (nativeAdView2 == null) {
            Intrinsics.m87502r("adView");
            nativeAdView2 = null;
        }
        TextView textView2 = this.adBody;
        if (textView2 == null) {
            Intrinsics.m87502r("adBody");
            textView2 = null;
        }
        nativeAdView2.setBodyView(textView2);
        NativeAdView nativeAdView3 = this.adView;
        if (nativeAdView3 == null) {
            Intrinsics.m87502r("adView");
            nativeAdView3 = null;
        }
        Button button2 = this.actionButton;
        if (button2 == null) {
            Intrinsics.m87502r("actionButton");
            button2 = null;
        }
        nativeAdView3.setCallToActionView(button2);
        NativeAdView nativeAdView4 = this.adView;
        if (nativeAdView4 == null) {
            Intrinsics.m87502r("adView");
            nativeAdView4 = null;
        }
        ImageView imageView = this.adLogo;
        if (imageView == null) {
            Intrinsics.m87502r("adLogo");
            imageView = null;
        }
        nativeAdView4.setIconView(imageView);
        NativeAdView nativeAdView5 = this.adView;
        if (nativeAdView5 == null) {
            Intrinsics.m87502r("adView");
            nativeAdView5 = null;
        }
        MediaView mediaView = this.mediaView;
        if (mediaView == null) {
            Intrinsics.m87502r("mediaView");
            mediaView = null;
        }
        nativeAdView5.setMediaView(mediaView);
        Companion companion = INSTANCE;
        if (companion.m29979e() && NullChecker.m81303a(companion.m29982h())) {
            m29972r();
        }
        f19141s = action;
        Button button3 = this.skipButton;
        if (button3 == null) {
            Intrinsics.m87502r("skipButton");
        } else {
            button = button3;
        }
        xdl0.m208342L(button, new View.OnClickListener() { // from class: l.l520
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NativeAdViewCard.m29958f(action, view);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m29972r() {
        Companion companion = INSTANCE;
        NativeAdView nativeAdView = null;
        if (companion.m29979e() && NullChecker.m81303a(companion.m29982h())) {
            boolean zM81303a = NullChecker.m81303a(companion.m29982h().mo98606d());
            NativeAdView nativeAdView2 = this.adView;
            if (zM81303a) {
                if (nativeAdView2 == null) {
                    Intrinsics.m87502r("adView");
                    nativeAdView2 = null;
                }
                View headlineView = nativeAdView2.getHeadlineView();
                headlineView.getClass();
                ((TextView) headlineView).setText(companion.m29982h().mo98606d());
                NativeAdView nativeAdView3 = this.adView;
                if (nativeAdView3 == null) {
                    Intrinsics.m87502r("adView");
                    nativeAdView3 = null;
                }
                xdl0.m208345M0(nativeAdView3.getHeadlineView(), true);
            } else {
                if (nativeAdView2 == null) {
                    Intrinsics.m87502r("adView");
                    nativeAdView2 = null;
                }
                xdl0.m208345M0(nativeAdView2.getHeadlineView(), false);
            }
            boolean zM81303a2 = NullChecker.m81303a(companion.m29982h().mo98604b());
            NativeAdView nativeAdView4 = this.adView;
            if (zM81303a2) {
                if (nativeAdView4 == null) {
                    Intrinsics.m87502r("adView");
                    nativeAdView4 = null;
                }
                View bodyView = nativeAdView4.getBodyView();
                bodyView.getClass();
                ((TextView) bodyView).setText(companion.m29982h().mo98604b());
            } else {
                if (nativeAdView4 == null) {
                    Intrinsics.m87502r("adView");
                    nativeAdView4 = null;
                }
                xdl0.m208345M0(nativeAdView4.getBodyView(), false);
            }
            boolean zM81303a3 = NullChecker.m81303a(companion.m29982h().mo98605c());
            NativeAdView nativeAdView5 = this.adView;
            if (zM81303a3) {
                if (nativeAdView5 == null) {
                    Intrinsics.m87502r("adView");
                    nativeAdView5 = null;
                }
                xdl0.m208345M0(nativeAdView5.getCallToActionView(), true);
                NativeAdView nativeAdView6 = this.adView;
                if (nativeAdView6 == null) {
                    Intrinsics.m87502r("adView");
                    nativeAdView6 = null;
                }
                View callToActionView = nativeAdView6.getCallToActionView();
                callToActionView.getClass();
                ((TextView) callToActionView).setText(companion.m29982h().mo98605c());
            } else {
                if (nativeAdView5 == null) {
                    Intrinsics.m87502r("adView");
                    nativeAdView5 = null;
                }
                xdl0.m208345M0(nativeAdView5.getCallToActionView(), false);
            }
            boolean zM81303a4 = NullChecker.m81303a(companion.m29982h().mo98607e());
            NativeAdView nativeAdView7 = this.adView;
            if (zM81303a4) {
                if (nativeAdView7 == null) {
                    Intrinsics.m87502r("adView");
                    nativeAdView7 = null;
                }
                View iconView = nativeAdView7.getIconView();
                iconView.getClass();
                ImageView imageView = (ImageView) iconView;
                e520.AbstractC16543b abstractC16543bMo98607e = companion.m29982h().mo98607e();
                imageView.setImageDrawable(abstractC16543bMo98607e != null ? abstractC16543bMo98607e.mo114778a() : null);
                NativeAdView nativeAdView8 = this.adView;
                if (nativeAdView8 == null) {
                    Intrinsics.m87502r("adView");
                    nativeAdView8 = null;
                }
                xdl0.m208345M0(nativeAdView8.getIconView(), true);
            } else {
                if (nativeAdView7 == null) {
                    Intrinsics.m87502r("adView");
                    nativeAdView7 = null;
                }
                xdl0.m208345M0(nativeAdView7.getIconView(), false);
            }
            gjx gjxVarMo98608f = companion.m29982h().mo98608f();
            Drawable drawableMo120410b = gjxVarMo98608f != null ? gjxVarMo98608f.mo120410b() : null;
            if (drawableMo120410b != null) {
                setAdMobBlurAndGradientDrawable(drawableMo120410b);
            } else {
                ImageView imageView2 = this.bottomImage;
                if (imageView2 == null) {
                    Intrinsics.m87502r("bottomImage");
                    imageView2 = null;
                }
                imageView2.setBackgroundColor(Color.parseColor("#FFEDE5"));
            }
        }
        gjx gjxVarMo98608f2 = companion.m29982h().mo98608f();
        this.ratio = ((Float) (gjxVarMo98608f2 != null ? Float.valueOf(gjxVarMo98608f2.mo120411c()) : 1)).floatValue();
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = (int) (getWidth() / this.ratio);
        post(new Runnable() { // from class: l.m520
            @Override // java.lang.Runnable
            public final void run() {
                NativeAdViewCard.m29959g(this.f131359a, intRef);
            }
        });
        NativeAdView nativeAdView9 = this.adView;
        if (nativeAdView9 == null) {
            Intrinsics.m87502r("adView");
            nativeAdView9 = null;
        }
        MediaView mediaView = nativeAdView9.getMediaView();
        if (mediaView != null) {
            mediaView.setMediaContent(companion.m29982h().mo98608f());
        }
        NativeAdView nativeAdView10 = this.adView;
        if (nativeAdView10 == null) {
            Intrinsics.m87502r("adView");
            nativeAdView10 = null;
        }
        MediaView mediaView2 = nativeAdView10.getMediaView();
        if (mediaView2 != null) {
            mediaView2.post(new Runnable() { // from class: l.n520
                @Override // java.lang.Runnable
                public final void run() {
                    NativeAdViewCard.m29956d(intRef, this);
                }
            });
        }
        NativeAdView nativeAdView11 = this.adView;
        if (nativeAdView11 == null) {
            Intrinsics.m87502r("adView");
        } else {
            nativeAdView = nativeAdView11;
        }
        nativeAdView.setNativeAd(companion.m29982h());
    }

    /* JADX INFO: renamed from: s */
    public final void m29973s(NewNewHomeFrag frag) {
        if (NullChecker.m81303a(this.nativeAdSub)) {
            mkd0.m154992z(this.nativeAdSub);
        }
        this.nativeAdSub = frag.duringCreated(f19142t).subscribe(mkd0.m154956H(new e30() { // from class: l.o520
            @Override // p149l.e30
            public final void call(Object obj) {
                NativeAdViewCard.m29961i(this.f141867a, (Boolean) obj);
            }
        }, new e30() { // from class: l.p520
            @Override // p149l.e30
            public final void call(Object obj) {
                NativeAdViewCard.m29960h((Throwable) obj);
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
