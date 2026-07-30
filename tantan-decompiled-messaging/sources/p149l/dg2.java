package p149l;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.ComponentCallbacks2C1053a;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.RunnableC4733c0;
import com.p046p1.mobile.putong.core.buzz.R$string;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.LoveBuzzPushData;
import com.p046p1.mobile.putong.core.data.StickerBundle;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.BuzzCircleCountdownView;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 Ê\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001SB!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001b\u001a\u00020\u000b2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0003¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000bH\u0002¢\u0006\u0004\b!\u0010\rJ\u001f\u0010&\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'J!\u0010(\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b(\u0010'J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0019\u0010-\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u000bH\u0016¢\u0006\u0004\b/\u0010\rJ\u001b\u00101\u001a\u00020\u000b2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b1\u0010\u0010J\u000f\u00102\u001a\u00020\u000bH\u0016¢\u0006\u0004\b2\u0010\rJ\u000f\u00104\u001a\u000203H&¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0006H&¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u000bH\u0016¢\u0006\u0004\b8\u0010\rJ+\u0010:\u001a\u00020\u000b2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00190\u00182\b\b\u0002\u00109\u001a\u00020\u0014¢\u0006\u0004\b:\u0010;J-\u0010=\u001a\u00020\u000b2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00190\u00182\b\b\u0002\u0010<\u001a\u00020\u0014H\u0016¢\u0006\u0004\b=\u0010;J#\u0010>\u001a\u00020\u00142\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00190\u0018H\u0000¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u000bH\u0016¢\u0006\u0004\b@\u0010\rJ9\u0010F\u001a\u00020\u000b2\b\u0010A\u001a\u0004\u0018\u00010\u00062\u0006\u0010B\u001a\u00020\u001d2\u0006\u0010C\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020\u001d2\u0006\u0010E\u001a\u00020\u001dH\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u000bH\u0016¢\u0006\u0004\bH\u0010\rJ\u000f\u0010I\u001a\u00020\u000bH\u0016¢\u0006\u0004\bI\u0010\rJ\u0019\u0010K\u001a\u00020\u000b2\b\u0010J\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bK\u0010\u0010J\u0011\u0010L\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\bL\u00107J\r\u0010M\u001a\u00020\u000b¢\u0006\u0004\bM\u0010\rJ\u0015\u0010N\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\bN\u0010OJ\u0015\u0010Q\u001a\u00020\u000b2\u0006\u0010P\u001a\u00020\u0006¢\u0006\u0004\bQ\u0010\u0010J\r\u0010R\u001a\u00020\u000b¢\u0006\u0004\bR\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u00107R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bZ\u0010X\u001a\u0004\b[\u00107R\"\u0010c\u001a\u00020\\8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010k\u001a\u00020d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\"\u0010s\u001a\u00020l8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\"\u0010{\u001a\u00020t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\"\u0010\u007f\u001a\u00020l8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b|\u0010n\u001a\u0004\b}\u0010p\"\u0004\b~\u0010rR*\u0010\u0087\u0001\u001a\u00030\u0080\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R*\u0010\u008f\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R*\u0010\u0093\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u008a\u0001\u001a\u0006\b\u0091\u0001\u0010\u008c\u0001\"\u0006\b\u0092\u0001\u0010\u008e\u0001R&\u0010\u0097\u0001\u001a\u00020d8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0094\u0001\u0010f\u001a\u0005\b\u0095\u0001\u0010h\"\u0005\b\u0096\u0001\u0010jR)\u0010\u009a\u0001\u001a\u00030\u0080\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b&\u0010\u0082\u0001\u001a\u0006\b\u0098\u0001\u0010\u0084\u0001\"\u0006\b\u0099\u0001\u0010\u0086\u0001R)\u0010\u009d\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u000f\u0010\u008a\u0001\u001a\u0006\b\u009b\u0001\u0010\u008c\u0001\"\u0006\b\u009c\u0001\u0010\u008e\u0001R*\u0010¡\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u008a\u0001\u001a\u0006\b\u009f\u0001\u0010\u008c\u0001\"\u0006\b \u0001\u0010\u008e\u0001R*\u0010©\u0001\u001a\u00030¢\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R)\u0010¬\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b2\u0010\u008a\u0001\u001a\u0006\bª\u0001\u0010\u008c\u0001\"\u0006\b«\u0001\u0010\u008e\u0001R\u0016\u0010®\u0001\u001a\u00020\u001d8\u0002X\u0082D¢\u0006\u0007\n\u0005\b/\u0010\u00ad\u0001R&\u0010²\u0001\u001a\u0002038\u0004@\u0004X\u0084\u000e¢\u0006\u0015\n\u0004\b-\u00106\u001a\u0005\b¯\u0001\u00105\"\u0006\b°\u0001\u0010±\u0001R\u0018\u0010´\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b³\u0001\u0010XR\u0015\u0010µ\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010XR(\u0010,\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b@\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0005\b¹\u0001\u0010.R5\u0010¾\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b\u001b\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001\"\u0005\b½\u0001\u0010\u001cR \u0010Ã\u0001\u001a\u00030¿\u00018FX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b:\u0010À\u0001\u001a\u0006\bÁ\u0001\u0010Â\u0001R!\u0010Ç\u0001\u001a\u00030Ä\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÅ\u0001\u0010À\u0001\u001a\u0006\b\u00ad\u0001\u0010Æ\u0001R \u0010É\u0001\u001a\u00030Ä\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bN\u0010À\u0001\u001a\u0006\bÈ\u0001\u0010Æ\u0001¨\u0006Ë\u0001"}, m87232d2 = {"Ll/dg2;", "Ll/s7m;", "Ll/tg2;", "Lcom/p1/mobile/putong/core/api/c0$c;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "pageType", "modeType", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ljava/lang/String;)V", "", "o0", "()V", "type", "n", "(Ljava/lang/String;)V", "Landroid/view/View;", "preView", "endView", "", "sequent", "i0", "(Landroid/view/View;Landroid/view/View;Z)V", "Ll/j760;", "", "pair", "w", "(Ll/j760;)V", "", "lastTime", "l0", "(J)V", "p0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "m", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "inflateView", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "presenter", BLiveStormDanmakuGiftResourceType.f44446s, "(Ll/tg2;)V", "r", "token", "E", "q", "", "M", "()I", "I", "()Ljava/lang/String;", "destroy", "fromInvite", BaseSei.f13930X, "(Ll/j760;Z)V", StickerBundle.TYPE, "j0", "A", "(Ll/j760;)Z", ResourceDirection.f38808v, Constants.KEY_KEY, "currentTime", "beginTime", "endTime", "registerTime", "u", "(Ljava/lang/String;JJJJ)V", "f0", "B", "userId", "d0", "H", "k0", BaseSei.f13932Z, "(Ljava/lang/String;)Z", "pId", "h0", "g0", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "b", "Ljava/lang/String;", "getPageType", "c", "K", "Landroidx/constraintlayout/widget/ConstraintLayout;", Constants.INAPP_DATA_TAG, "Landroidx/constraintlayout/widget/ConstraintLayout;", "Z", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_search_root", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_search_root", "Lv/VImage;", "e", "Lv/VImage;", "a0", "()Lv/VImage;", "set_stop_search", "(Lv/VImage;)V", "_stop_search", "Lv/VDraweeView;", "f", "Lv/VDraweeView;", j6f.LATITUDE_SOUTH, "()Lv/VDraweeView;", "set_buzz_search_anim", "(Lv/VDraweeView;)V", "_buzz_search_anim", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzCircleCountdownView;", "g", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzCircleCountdownView;", j6f.GPS_MEASUREMENT_INTERRUPTED, "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzCircleCountdownView;", "set_process_circle", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzCircleCountdownView;)V", "_process_circle", "h", "Y", "set_search_peer_avatar", "_search_peer_avatar", "Lcom/tantan/library/svga/SVGAnimationView;", RXScreenCaptureService.KEY_INDEX, "Lcom/tantan/library/svga/SVGAnimationView;", "Q", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_bundle_anim", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_bundle_anim", "Lv/VText;", "j", "Lv/VText;", "c0", "()Lv/VText;", "set_vb_peer_name", "(Lv/VText;)V", "_vb_peer_name", "k", "b0", "set_vb_peer_info", "_vb_peer_info", BLiveStormDanmakuGiftResourceType.f44444l, "U", "set_peer_region", "_peer_region", j6f.GPS_DIRECTION_TRUE, "set_connect_anim", "_connect_anim", "W", "set_refuse_buzz", "_refuse_buzz", "o", "P", "set_accept_buzz", "_accept_buzz", "Landroid/view/ViewStub;", "p", "Landroid/view/ViewStub;", "R", "()Landroid/view/ViewStub;", "set_buzz_marquee", "(Landroid/view/ViewStub;)V", "_buzz_marquee", "X", "set_search_buzz_desc", "_search_buzz_desc", "J", "DEFAULT_SHOW_STATUS_3_TIME", "L", "setNOT_LIMIT_VALUE", "(I)V", "NOT_LIMIT_VALUE", Constants.KEY_T, "pageId", "MEDIA_BUZZ_SEARCHED_KEY", "Ll/tg2;", "getPresenter$buzz_intlGmsRelease", "()Ll/tg2;", "setPresenter$buzz_intlGmsRelease", "Ll/j760;", "G", "()Ll/j760;", "n0", "cacheNotify", "Ll/cwf0;", "Lkotlin/Lazy;", "N", "()Ll/cwf0;", "pageHelper", "Ljava/lang/Runnable;", BaseSei.f13931Y, "()Ljava/lang/Runnable;", "connectRunnable", BloodType.f38728O, "responseRunnable", "Companion", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public abstract class dg2 implements s7m<tg2>, RunnableC4733c0.c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String pageType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String modeType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public ConstraintLayout _search_root;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VImage _stop_search;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VDraweeView _buzz_search_anim;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public BuzzCircleCountdownView _process_circle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VDraweeView _search_peer_avatar;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public SVGAnimationView _bundle_anim;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VText _vb_peer_name;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VText _vb_peer_info;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VImage _peer_region;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public SVGAnimationView _connect_anim;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VText _refuse_buzz;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public VText _accept_buzz;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public ViewStub _buzz_marquee;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public VText _search_buzz_desc;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public final long DEFAULT_SHOW_STATUS_3_TIME;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public int NOT_LIMIT_VALUE;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public String pageId;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final String MEDIA_BUZZ_SEARCHED_KEY;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    public tg2 presenter;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public j760<String, Object> cacheNotify;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    public final Lazy pageHelper;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    public final Lazy connectRunnable;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final Lazy responseRunnable;

    public dg2(@NotNull Act act, @NotNull String str, @NotNull String str2) {
        act.getClass();
        str.getClass();
        str2.getClass();
        this.act = act;
        this.pageType = str;
        this.modeType = str2;
        this.DEFAULT_SHOW_STATUS_3_TIME = 1200L;
        this.NOT_LIMIT_VALUE = -1;
        this.pageId = "unknown_p_id";
        this.MEDIA_BUZZ_SEARCHED_KEY = "media_buzz_searched_key" + mqi0.m155944o();
        this.pageHelper = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.tf2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return dg2.m111549e(this.f169936a);
            }
        });
        this.connectRunnable = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.uf2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return dg2.m111553j(this.f176225a);
            }
        });
        this.responseRunnable = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.vf2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return dg2.m111547c(this.f181239a);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public static final void m111543C(dg2 dg2Var) {
        if (m6w.INSTANCE.m153296a(dg2Var.act)) {
            dg2Var.mo111561B();
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m111544F(dg2 dg2Var, String str, int i, Object obj) {
        if (obj != null) {
            qq3.m175877a("Super calls with default arguments not supported in this target, function: enterWaitOrConnect");
            return;
        }
        if ((i & 1) != 0) {
            str = null;
        }
        dg2Var.m111562E(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m111546b(dg2 dg2Var, View view) {
        dg2Var.m111595n(dg2Var.pageType);
    }

    /* JADX INFO: renamed from: c */
    public static Runnable m111547c(final dg2 dg2Var) {
        return new Runnable() { // from class: l.bg2
            @Override // java.lang.Runnable
            public final void run() {
                dg2.m111556m0(this.f75394a);
            }
        };
    }

    /* JADX INFO: renamed from: d */
    public static void m111548d(dg2 dg2Var, View view) {
        if (!Intrinsics.m87488d(dg2Var.pageType, "textBuzz")) {
            p9w.INSTANCE.m167963x0(dg2Var.pageType);
        }
        tg2 tg2Var = dg2Var.presenter;
        if (tg2Var != null) {
            tg2Var.m188794W0();
        }
    }

    /* JADX INFO: renamed from: e */
    public static cwf0 m111549e(dg2 dg2Var) {
        return i0e.m133794c(dg2Var.pageId, dg2.class.getName());
    }

    /* JADX INFO: renamed from: e0 */
    public static final Unit m111550e0(dg2 dg2Var) {
        dg2Var.mo111598q();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static Runnable m111553j(final dg2 dg2Var) {
        return new Runnable() { // from class: l.ag2
            @Override // java.lang.Runnable
            public final void run() {
                dg2.m111543C(this.f69240a);
            }
        };
    }

    /* JADX INFO: renamed from: l */
    public static void m111555l(final dg2 dg2Var, View view) {
        String strM111564H = dg2Var.m111564H();
        if (strM111564H != null) {
            p9w.INSTANCE.m167944n(dg2Var.pageType);
            j8w.m140393i0(j8w.INSTANCE.m140473a(), dg2Var.act, strM111564H, dg2Var.pageType, new Function0() { // from class: l.cg2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return dg2.m111550e0(this.f80691a);
                }
            }, null, 16, null);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static final void m111556m0(dg2 dg2Var) {
        if (m6w.INSTANCE.m153296a(dg2Var.act)) {
            lsi0.m151593w(R$string.f20257u0);
            dg2Var.mo111598q();
        }
    }

    /* JADX INFO: renamed from: o0 */
    private final void m111557o0() {
        CoreModule.f17545c.f19685t1.m31516u(this.MEDIA_BUZZ_SEARCHED_KEY);
        long jM153303h = (((long) m6w.INSTANCE.m153303h(this.pageType)) * 1000) + 99;
        m111578V().m47130e();
        m111578V().m47131f(1.0f, jM153303h);
        m111593l0(jM153303h);
        RunnableC4733c0.a aVar = new RunnableC4733c0.a();
        aVar.m31523g(this.MEDIA_BUZZ_SEARCHED_KEY).m31517a(true).m31522f(jM153303h + mqi0.m155944o()).m31520d(this);
        CoreModule.f17545c.f19685t1.m31513r(aVar);
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m111558p(dg2 dg2Var) {
        m111544F(dg2Var, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m111559y(dg2 dg2Var, j760 j760Var, boolean z, int i, Object obj) {
        if (obj != null) {
            qq3.m175877a("Super calls with default arguments not supported in this target, function: changeReceiveInvite");
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        dg2Var.m111603x(j760Var, z);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m111560A(@NotNull j760<String, Object> pair) {
        pair.getClass();
        Object obj = pair.f116565b;
        LoveBuzzPushData loveBuzzPushData = obj instanceof LoveBuzzPushData ? (LoveBuzzPushData) obj : null;
        return (loveBuzzPushData == null || !loveBuzzPushData.needReact || Intrinsics.m87488d(loveBuzzPushData.biz, "textBuzz")) ? false : true;
    }

    /* JADX INFO: renamed from: B */
    public void mo111561B() {
        tg2 tg2Var;
        qa2.INSTANCE.m173681a("BaseBuzzSearchModel", "connectBuzz");
        m111592k0();
        tg2 tg2Var2 = this.presenter;
        if (tg2Var2 != null) {
            tg2Var2.m188787I0(32);
        }
        m6w m6wVar = m6w.INSTANCE;
        m6wVar.m153305j(m111572P(), m111579W(), m111578V(), m111573Q());
        m6wVar.m153307l(m111580X(), m111576T());
        m111597p0();
        m111580X().setText(R$string.f20240m);
        j760<String, Object> j760Var = this.cacheNotify;
        if (j760Var == null || (tg2Var = this.presenter) == null) {
            return;
        }
        tg2Var.mo136406u0(j760Var);
    }

    @Override // p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    /* JADX INFO: renamed from: E */
    public final void m111562E(@Nullable String token) {
        qa2 qa2Var = qa2.INSTANCE;
        qa2Var.m173681a("BaseBuzzSearchModel", "enterWaitOrConnect token " + token + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        j8w j8wVarM140473a = j8w.INSTANCE.m140473a();
        if (!NullChecker.m81303a(token)) {
            token = m111564H();
        }
        String strM140421F0 = j8wVarM140473a.m140421F0(token);
        qa2Var.m173681a("BaseBuzzSearchModel", "enterWaitOrConnect react " + strM140421F0 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        if (Intrinsics.m87488d(strM140421F0, "accepted")) {
            mo111561B();
        } else {
            mo111587f0();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: G */
    public final j760<String, Object> m111563G() {
        return this.cacheNotify;
    }

    @Nullable
    /* JADX INFO: renamed from: H */
    public final String m111564H() {
        j760<String, Object> j760Var = this.cacheNotify;
        if (j760Var != null) {
            Object obj = j760Var.f116565b;
            LoveBuzzPushData loveBuzzPushData = obj instanceof LoveBuzzPushData ? (LoveBuzzPushData) obj : null;
            if (loveBuzzPushData != null) {
                return loveBuzzPushData.channelToken;
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public abstract String mo111565I();

    /* JADX INFO: renamed from: J */
    public final Runnable m111566J() {
        return (Runnable) this.connectRunnable.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: K, reason: from getter */
    public final String getModeType() {
        return this.modeType;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final int getNOT_LIMIT_VALUE() {
        return this.NOT_LIMIT_VALUE;
    }

    /* JADX INFO: renamed from: M */
    public abstract int mo111569M();

    @NotNull
    /* JADX INFO: renamed from: N */
    public final cwf0 m111570N() {
        Object value = this.pageHelper.getValue();
        value.getClass();
        return (cwf0) value;
    }

    /* JADX INFO: renamed from: O */
    public final Runnable m111571O() {
        return (Runnable) this.responseRunnable.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final VText m111572P() {
        VText vText = this._accept_buzz;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_accept_buzz");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final SVGAnimationView m111573Q() {
        SVGAnimationView sVGAnimationView = this._bundle_anim;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m87502r("_bundle_anim");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final ViewStub m111574R() {
        ViewStub viewStub = this._buzz_marquee;
        if (viewStub != null) {
            return viewStub;
        }
        Intrinsics.m87502r("_buzz_marquee");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final VDraweeView m111575S() {
        VDraweeView vDraweeView = this._buzz_search_anim;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_buzz_search_anim");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final SVGAnimationView m111576T() {
        SVGAnimationView sVGAnimationView = this._connect_anim;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m87502r("_connect_anim");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final VImage m111577U() {
        VImage vImage = this._peer_region;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_peer_region");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final BuzzCircleCountdownView m111578V() {
        BuzzCircleCountdownView buzzCircleCountdownView = this._process_circle;
        if (buzzCircleCountdownView != null) {
            return buzzCircleCountdownView;
        }
        Intrinsics.m87502r("_process_circle");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final VText m111579W() {
        VText vText = this._refuse_buzz;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_refuse_buzz");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final VText m111580X() {
        VText vText = this._search_buzz_desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_search_buzz_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final VDraweeView m111581Y() {
        VDraweeView vDraweeView = this._search_peer_avatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_search_peer_avatar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final ConstraintLayout m111582Z() {
        ConstraintLayout constraintLayout = this._search_root;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_search_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final VImage m111583a0() {
        VImage vImage = this._stop_search;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_stop_search");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final VText m111584b0() {
        VText vText = this._vb_peer_info;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_vb_peer_info");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final VText m111585c0() {
        VText vText = this._vb_peer_name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_vb_peer_name");
        return null;
    }

    /* JADX INFO: renamed from: d0 */
    public void m111586d0(@Nullable String userId) {
        qa2.INSTANCE.m173681a("BaseBuzzSearchModel", "handlerBundleSearchResult");
        m111592k0();
        SVGAnimationView.stopAnimation$default(m111573Q(), false, 1, null);
        j760<String, Object> j760Var = this.cacheNotify;
        if (j760Var != null) {
            Object obj = j760Var.f116565b;
            LoveBuzzPushData loveBuzzPushData = obj instanceof LoveBuzzPushData ? (LoveBuzzPushData) obj : null;
            if (loveBuzzPushData != null) {
                loveBuzzPushData.userId = userId;
            }
            m111603x(j760Var, false);
        }
        mo111561B();
    }

    @Override // p149l.s7m
    public void destroy() {
        m111592k0();
        i0e.m133796e(m111570N());
    }

    /* JADX INFO: renamed from: f0 */
    public void mo111587f0() {
        tg2 tg2Var = this.presenter;
        if (tg2Var != null) {
            tg2Var.m188787I0(16);
        }
        m6w m6wVar = m6w.INSTANCE;
        m6wVar.m153305j(m111572P(), m111579W(), m111578V());
        m6wVar.m153307l(m111580X(), m111576T());
        m111597p0();
        m111580X().setText(R$string.f20201Y0);
        m111592k0();
        int iM153304i = Intrinsics.m87488d(j8w.INSTANCE.m140473a().m140421F0(m111564H()), "rejected") ? 3 : m6wVar.m153304i(this.pageType);
        qa2.INSTANCE.m173681a("BaseBuzzSearchModel", "jumpResponse timeOut " + iM153304i);
        e51.m114743H(this.act, m111571O(), ((long) iM153304i) * 1000);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m111588g0() {
        tg2 tg2Var;
        if (!xdl0.m208349O0(m111583a0()) || (tg2Var = this.presenter) == null) {
            return;
        }
        tg2Var.m188794W0();
    }

    /* JADX INFO: renamed from: h0 */
    public final void m111589h0(@NotNull String pId) {
        pId.getClass();
        if (!Intrinsics.m87488d(this.pageId, "unknown_p_id")) {
            i0e.m133796e(m111570N());
        }
        m111570N().m109041q(pId);
        this.pageId = pId;
        i0e.m133797f(m111570N());
    }

    /* JADX INFO: renamed from: i0 */
    public final void m111590i0(View preView, View endView, boolean sequent) {
        Animator animatorM103739l = bt0.m103739l(endView, bt0.f77162i, 0L, 500L, new LinearInterpolator(), 0.0f, 1.2f, 0.8f, 1.0f);
        if (sequent) {
            animatorM103739l = bt0.m103746s(bt0.m103739l(preView, bt0.f77162i, 0L, 300L, null, 1.0f, 0.0f), animatorM103739l);
        }
        animatorM103739l.start();
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m111594m(inflater, parent);
    }

    /* JADX INFO: renamed from: j0 */
    public void mo111591j0(@NotNull j760<String, Object> pair, boolean bundle) {
        pair.getClass();
        m6w m6wVar = m6w.INSTANCE;
        if (m6wVar.m153296a(this.act)) {
            qa2 qa2Var = qa2.INSTANCE;
            String str = pair.f116564a;
            qa2Var.m173681a("BaseBuzzSearchModel", "receiveInvite, notify " + ((Object) str) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + pair.f116565b + " this " + this);
            if (bundle) {
                m111602w(pair);
            } else {
                m111603x(pair, true);
            }
            this.cacheNotify = pair;
            m111592k0();
            if (!bundle) {
                if (m111560A(pair)) {
                    mo111601v();
                    return;
                } else {
                    e51.m114743H(this.act, m111566J(), this.DEFAULT_SHOW_STATUS_3_TIME);
                    return;
                }
            }
            int iM153304i = m6wVar.m153304i(this.pageType);
            qa2Var.m173681a("BaseBuzzSearchModel", "receiveBundleInvite timeOut " + iM153304i);
            e51.m114743H(this.act, m111571O(), ((long) iM153304i) * 1000);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m111592k0() {
        e51.m114745J(m111566J());
        e51.m114745J(m111571O());
        CoreModule.f17545c.f19685t1.m31516u(this.MEDIA_BUZZ_SEARCHED_KEY);
        m111578V().m47127b();
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: l0 */
    public final void m111593l0(long lastTime) {
        m111572P().setText(hvc0.m133156c(R$string.f20196W) + " (" + (lastTime / 1000) + "s)");
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final View m111594m(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM116117b = eg2.m116117b(this, inflater, parent);
        viewM116117b.getClass();
        return viewM116117b;
    }

    /* JADX INFO: renamed from: n */
    public final void m111595n(String type) {
        String strM111564H = m111564H();
        if (strM111564H != null) {
            j8w.m140378Y(j8w.INSTANCE.m140473a(), this.act, strM111564H, type, new Function0() { // from class: l.wf2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return dg2.m111558p(this.f186004a);
                }
            }, null, false, 16, null);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m111596n0(@Nullable j760<String, Object> j760Var) {
        this.cacheNotify = j760Var;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m111597p0() {
        if (m111576T().isAnimating()) {
            return;
        }
        SVGALoader.with(getContext()).from(mo111565I()).autoPlay(true).into(m111576T());
    }

    /* JADX INFO: renamed from: q */
    public void mo111598q() {
        qa2.INSTANCE.m173681a("BaseBuzzSearchModel", "backSearchPage ");
        m111592k0();
        m6w m6wVar = m6w.INSTANCE;
        m6wVar.m153305j(m111572P(), m111579W(), m111578V(), m111581Y(), m111584b0(), m111577U(), m111585c0(), m111576T(), m111573Q());
        m6wVar.m153307l(m111575S(), m111583a0(), m111580X());
        m111575S().setScaleX(1.0f);
        m111575S().setScaleY(1.0f);
        m111581Y().setScaleX(0.0f);
        m111581Y().setScaleY(0.0f);
        m111573Q().setScaleX(0.0f);
        m111573Q().setScaleY(0.0f);
        m111580X().setText(R$string.f20220f0);
        this.cacheNotify = null;
        tg2 tg2Var = this.presenter;
        if (tg2Var != null) {
            tg2Var.m188791Q0(0);
        }
        tg2 tg2Var2 = this.presenter;
        if (tg2Var2 != null) {
            tg2Var2.mo136403U0();
        }
    }

    /* JADX INFO: renamed from: r */
    public void mo111599r() {
        xdl0.m208360X(m111583a0(), xdl0.m208331F0() + t100.f167264m);
        int iM208331F0 = xdl0.m208331F0() + t100.m186890d(116.0f);
        xdl0.m208360X(m111575S(), iM208331F0);
        xdl0.m208360X(m111581Y(), t100.f167276y + iM208331F0);
        xdl0.m208360X(m111573Q(), iM208331F0 - t100.f167268q);
        int iMo111569M = mo111569M();
        if (iMo111569M > 0) {
            m111582Z().setBackgroundResource(iMo111569M);
        }
        xdl0.m208329E0(m111583a0(), new View.OnClickListener() { // from class: l.xf2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dg2.m111548d(this.f192644a, view);
            }
        });
        ComponentCallbacks2C1053a.m5318w(this.act).m143269m().m199985B0("https://auto.tancdn.com/v1/raw/7369bc71-0430-4e3c-87da-f96778ea63be12.gif").m199423e(p2e.f146847c).m199993w0(m111575S());
        xdl0.m208329E0(m111572P(), new View.OnClickListener() { // from class: l.yf2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dg2.m111546b(this.f197975a, view);
            }
        });
        xdl0.m208329E0(m111579W(), new View.OnClickListener() { // from class: l.zf2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dg2.m111555l(this.f202876a, view);
            }
        });
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@Nullable tg2 presenter) {
        this.presenter = presenter;
    }

    @Override // com.p046p1.mobile.putong.core.api.RunnableC4733c0.c
    /* JADX INFO: renamed from: u */
    public void mo31527u(@Nullable String key, long currentTime, long beginTime, long endTime, long registerTime) {
        long j = endTime - currentTime;
        if (TextUtils.equals(key, this.MEDIA_BUZZ_SEARCHED_KEY)) {
            m111593l0(j);
        }
        if (j <= 0) {
            m111595n(this.pageType);
            m111544F(this, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: v */
    public void mo111601v() {
        qa2.INSTANCE.m173681a("BaseBuzzSearchModel", "changeReact");
        m111578V().setAlpha(0.0f);
        m6w.INSTANCE.m153307l(m111572P(), m111579W(), m111578V());
        m111578V().animate().alpha(1.0f).setDuration(900L).setInterpolator(new LinearInterpolator()).start();
        m111557o0();
    }

    /* JADX INFO: renamed from: w */
    public final void m111602w(j760<String, Object> pair) {
        qa2.INSTANCE.m173681a("BaseBuzzSearchModel", "changeReceiveBundleInvite");
        m6w m6wVar = m6w.INSTANCE;
        m6wVar.m153305j(m111583a0());
        m6wVar.m153307l(m111573Q(), m111580X(), m111576T());
        m111590i0(m111575S(), m111573Q(), true);
        Dialog showingDialog = this.act.getShowingDialog();
        if (showingDialog != null) {
            showingDialog.dismiss();
        }
        m111597p0();
        m111580X().setText(R$string.f20201Y0);
        if (!m111573Q().isAnimating()) {
            SVGAnimationView.stopAnimation$default(m111573Q(), false, 1, null);
        }
        SVGALoader.with(getContext()).from(kp3.INSTANCE.m146812b()).autoPlay(true).into(m111573Q());
    }

    /* JADX INFO: renamed from: x */
    public final void m111603x(@NotNull j760<String, Object> pair, boolean fromInvite) {
        pair.getClass();
        qa2.INSTANCE.m173681a("BaseBuzzSearchModel", "changeReceiveInvite");
        if (fromInvite) {
            m6w.INSTANCE.m153305j(m111583a0(), m111580X(), m111576T());
        } else {
            m6w.INSTANCE.m153305j(m111575S(), m111583a0(), m111580X(), m111576T());
        }
        m6w.INSTANCE.m153307l(m111581Y(), m111584b0(), m111585c0(), m111577U());
        m111590i0(m111575S(), m111581Y(), fromInvite);
        Dialog showingDialog = this.act.getShowingDialog();
        if (showingDialog != null) {
            showingDialog.dismiss();
        }
        Object obj = pair.f116565b;
        if (obj instanceof LoveBuzzPushData) {
            pib pibVar = CoreModule.f17545c.f19639e0;
            String str = ((LoveBuzzPushData) obj).userId;
            if (str == null) {
                str = "";
            }
            User userM169430Pa = pibVar.m169430Pa(str);
            if (userM169430Pa == null) {
                return;
            }
            if (Intrinsics.m87488d(this.pageType, "memojiBuzz")) {
                qib0.f154691G.m102331L0(m111581Y(), TEnum.equals(userM169430Pa.gender, "male") ? "https://auto.tancdn.com/v1/raw/ae762df1-9a4b-4d4f-b16f-96f445fed4de12.webp" : "https://auto.tancdn.com/v1/raw/2512c09a-e89c-4999-bc89-40b08a3a5d2f12.webp");
            } else {
                u9w u9wVar = u9w.INSTANCE;
                VDraweeView vDraweeViewM111581Y = m111581Y();
                Picture.ImageUri imageUriProfileSmall = u9wVar.m192677j(userM169430Pa).profileSmall();
                imageUriProfileSmall.getClass();
                u9wVar.m192674g(vDraweeViewM111581Y, imageUriProfileSmall, 0, !Intrinsics.m87488d(this.pageType, "textBuzz"));
            }
            u9w u9wVar2 = u9w.INSTANCE;
            u9wVar2.m192683p(userM169430Pa, m111577U());
            m111585c0().setText(userM169430Pa.name);
            u9wVar2.m192682o(userM169430Pa, m111584b0(), 18.0f, 18.0f);
        }
    }

    /* JADX INFO: renamed from: z */
    public final boolean m111604z(@NotNull String type) {
        type.getClass();
        j8w.Companion companion = j8w.INSTANCE;
        j760<String, Object> j760VarM221515e = companion.m140473a().m140422G0().m221515e();
        if (j760VarM221515e == null || !Intrinsics.m87488d(j760VarM221515e.f116564a, "intl.media.lovebuzz.show.notify")) {
            return false;
        }
        Object obj = j760VarM221515e.f116565b;
        if (!(obj instanceof LoveBuzzPushData)) {
            return false;
        }
        obj.getClass();
        LoveBuzzPushData loveBuzzPushData = (LoveBuzzPushData) obj;
        if (!Intrinsics.m87488d(loveBuzzPushData.biz, type) || !Intrinsics.m87488d(loveBuzzPushData.mode, "passive")) {
            return false;
        }
        if (Intrinsics.m87488d(loveBuzzPushData.subType, StickerBundle.TYPE) && !Intrinsics.m87488d(this.modeType, "passive")) {
            return false;
        }
        if (!Intrinsics.m87488d(companion.m140473a().m140421F0(loveBuzzPushData.channelToken), "rejected")) {
            return true;
        }
        lsi0.m151593w(R$string.f20257u0);
        companion.m140473a().m140422G0().onNext(vwb.m200311Y("intl.text.lovebuzz.close.notify", null));
        return false;
    }

    public /* synthetic */ dg2(Act act, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(act, str, (i & 4) != 0 ? Active.TYPE : str2);
    }
}
