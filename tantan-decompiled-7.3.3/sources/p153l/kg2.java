package p153l;

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
import com.bumptech.glide.ComponentCallbacks2C1057a;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.RunnableC4884c0;
import com.p051p1.mobile.putong.core.buzz.R$string;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.LoveBuzzPushData;
import com.p051p1.mobile.putong.core.data.StickerBundle;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.BuzzCircleCountdownView;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 Ê\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001SB!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001b\u001a\u00020\u000b2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0003¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000bH\u0002¢\u0006\u0004\b!\u0010\rJ\u001f\u0010&\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'J!\u0010(\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b(\u0010'J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0019\u0010-\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u000bH\u0016¢\u0006\u0004\b/\u0010\rJ\u001b\u00101\u001a\u00020\u000b2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b1\u0010\u0010J\u000f\u00102\u001a\u00020\u000bH\u0016¢\u0006\u0004\b2\u0010\rJ\u000f\u00104\u001a\u000203H&¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0006H&¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u000bH\u0016¢\u0006\u0004\b8\u0010\rJ+\u0010:\u001a\u00020\u000b2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00190\u00182\b\b\u0002\u00109\u001a\u00020\u0014¢\u0006\u0004\b:\u0010;J-\u0010=\u001a\u00020\u000b2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00190\u00182\b\b\u0002\u0010<\u001a\u00020\u0014H\u0016¢\u0006\u0004\b=\u0010;J#\u0010>\u001a\u00020\u00142\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00190\u0018H\u0000¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u000bH\u0016¢\u0006\u0004\b@\u0010\rJ9\u0010F\u001a\u00020\u000b2\b\u0010A\u001a\u0004\u0018\u00010\u00062\u0006\u0010B\u001a\u00020\u001d2\u0006\u0010C\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020\u001d2\u0006\u0010E\u001a\u00020\u001dH\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u000bH\u0016¢\u0006\u0004\bH\u0010\rJ\u000f\u0010I\u001a\u00020\u000bH\u0016¢\u0006\u0004\bI\u0010\rJ\u0019\u0010K\u001a\u00020\u000b2\b\u0010J\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bK\u0010\u0010J\u0011\u0010L\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\bL\u00107J\r\u0010M\u001a\u00020\u000b¢\u0006\u0004\bM\u0010\rJ\u0015\u0010N\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\bN\u0010OJ\u0015\u0010Q\u001a\u00020\u000b2\u0006\u0010P\u001a\u00020\u0006¢\u0006\u0004\bQ\u0010\u0010J\r\u0010R\u001a\u00020\u000b¢\u0006\u0004\bR\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u00107R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bZ\u0010X\u001a\u0004\b[\u00107R\"\u0010c\u001a\u00020\\8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010k\u001a\u00020d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\"\u0010s\u001a\u00020l8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\"\u0010{\u001a\u00020t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\"\u0010\u007f\u001a\u00020l8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b|\u0010n\u001a\u0004\b}\u0010p\"\u0004\b~\u0010rR*\u0010\u0087\u0001\u001a\u00030\u0080\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R*\u0010\u008f\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R*\u0010\u0093\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u008a\u0001\u001a\u0006\b\u0091\u0001\u0010\u008c\u0001\"\u0006\b\u0092\u0001\u0010\u008e\u0001R&\u0010\u0097\u0001\u001a\u00020d8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0094\u0001\u0010f\u001a\u0005\b\u0095\u0001\u0010h\"\u0005\b\u0096\u0001\u0010jR)\u0010\u009a\u0001\u001a\u00030\u0080\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b&\u0010\u0082\u0001\u001a\u0006\b\u0098\u0001\u0010\u0084\u0001\"\u0006\b\u0099\u0001\u0010\u0086\u0001R)\u0010\u009d\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u000f\u0010\u008a\u0001\u001a\u0006\b\u009b\u0001\u0010\u008c\u0001\"\u0006\b\u009c\u0001\u0010\u008e\u0001R*\u0010¡\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u008a\u0001\u001a\u0006\b\u009f\u0001\u0010\u008c\u0001\"\u0006\b \u0001\u0010\u008e\u0001R*\u0010©\u0001\u001a\u00030¢\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R)\u0010¬\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b2\u0010\u008a\u0001\u001a\u0006\bª\u0001\u0010\u008c\u0001\"\u0006\b«\u0001\u0010\u008e\u0001R\u0016\u0010®\u0001\u001a\u00020\u001d8\u0002X\u0082D¢\u0006\u0007\n\u0005\b/\u0010\u00ad\u0001R&\u0010²\u0001\u001a\u0002038\u0004@\u0004X\u0084\u000e¢\u0006\u0015\n\u0004\b-\u00106\u001a\u0005\b¯\u0001\u00105\"\u0006\b°\u0001\u0010±\u0001R\u0018\u0010´\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b³\u0001\u0010XR\u0015\u0010µ\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010XR(\u0010,\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b@\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0005\b¹\u0001\u0010.R5\u0010¾\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b\u001b\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001\"\u0005\b½\u0001\u0010\u001cR \u0010Ã\u0001\u001a\u00030¿\u00018FX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b:\u0010À\u0001\u001a\u0006\bÁ\u0001\u0010Â\u0001R!\u0010Ç\u0001\u001a\u00030Ä\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÅ\u0001\u0010À\u0001\u001a\u0006\b\u00ad\u0001\u0010Æ\u0001R \u0010É\u0001\u001a\u00030Ä\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bN\u0010À\u0001\u001a\u0006\bÈ\u0001\u0010Æ\u0001¨\u0006Ë\u0001"}, m88121d2 = {"Ll/kg2;", "Ll/iam;", "Ll/ah2;", "Lcom/p1/mobile/putong/core/api/c0$c;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "pageType", "modeType", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ljava/lang/String;)V", "", "o0", "()V", "type", "n", "(Ljava/lang/String;)V", "Landroid/view/View;", "preView", "endView", "", "sequent", "i0", "(Landroid/view/View;Landroid/view/View;Z)V", "Ll/pf60;", "", "pair", "w", "(Ll/pf60;)V", "", "lastTime", "l0", "(J)V", "p0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "m", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "inflateView", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "presenter", BLiveStormDanmakuGiftResourceType.f45294s, "(Ll/ah2;)V", "r", "token", "E", "q", "", "M", "()I", "I", "()Ljava/lang/String;", "destroy", "fromInvite", BaseSei.f14624X, "(Ll/pf60;Z)V", StickerBundle.TYPE, "j0", "A", "(Ll/pf60;)Z", ResourceDirection.f39656v, Constants.KEY_KEY, "currentTime", "beginTime", "endTime", "registerTime", "u", "(Ljava/lang/String;JJJJ)V", "f0", "B", "userId", "d0", "H", "k0", BaseSei.f14626Z, "(Ljava/lang/String;)Z", "pId", "h0", "g0", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "b", "Ljava/lang/String;", "getPageType", "c", "K", "Landroidx/constraintlayout/widget/ConstraintLayout;", Constants.INAPP_DATA_TAG, "Landroidx/constraintlayout/widget/ConstraintLayout;", "Z", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_search_root", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_search_root", "Lv/VImage;", "e", "Lv/VImage;", "a0", "()Lv/VImage;", "set_stop_search", "(Lv/VImage;)V", "_stop_search", "Lv/VDraweeView;", "f", "Lv/VDraweeView;", p7f.LATITUDE_SOUTH, "()Lv/VDraweeView;", "set_buzz_search_anim", "(Lv/VDraweeView;)V", "_buzz_search_anim", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzCircleCountdownView;", "g", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzCircleCountdownView;", p7f.GPS_MEASUREMENT_INTERRUPTED, "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzCircleCountdownView;", "set_process_circle", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzCircleCountdownView;)V", "_process_circle", "h", "Y", "set_search_peer_avatar", "_search_peer_avatar", "Lcom/tantan/library/svga/SVGAnimationView;", RXScreenCaptureService.KEY_INDEX, "Lcom/tantan/library/svga/SVGAnimationView;", "Q", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_bundle_anim", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_bundle_anim", "Lv/VText;", "j", "Lv/VText;", "c0", "()Lv/VText;", "set_vb_peer_name", "(Lv/VText;)V", "_vb_peer_name", "k", "b0", "set_vb_peer_info", "_vb_peer_info", BLiveStormDanmakuGiftResourceType.f45292l, "U", "set_peer_region", "_peer_region", p7f.GPS_DIRECTION_TRUE, "set_connect_anim", "_connect_anim", "W", "set_refuse_buzz", "_refuse_buzz", "o", "P", "set_accept_buzz", "_accept_buzz", "Landroid/view/ViewStub;", "p", "Landroid/view/ViewStub;", "R", "()Landroid/view/ViewStub;", "set_buzz_marquee", "(Landroid/view/ViewStub;)V", "_buzz_marquee", "X", "set_search_buzz_desc", "_search_buzz_desc", "J", "DEFAULT_SHOW_STATUS_3_TIME", "L", "setNOT_LIMIT_VALUE", "(I)V", "NOT_LIMIT_VALUE", Constants.KEY_T, "pageId", "MEDIA_BUZZ_SEARCHED_KEY", "Ll/ah2;", "getPresenter$buzz_intlGmsRelease", "()Ll/ah2;", "setPresenter$buzz_intlGmsRelease", "Ll/pf60;", "G", "()Ll/pf60;", "n0", "cacheNotify", "Ll/l4g0;", "Lkotlin/Lazy;", "N", "()Ll/l4g0;", "pageHelper", "Ljava/lang/Runnable;", BaseSei.f14625Y, "()Ljava/lang/Runnable;", "connectRunnable", BloodType.f39576O, "responseRunnable", "Companion", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public abstract class kg2 implements iam<ah2>, RunnableC4884c0.c {

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
    public ah2 presenter;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public pf60<String, Object> cacheNotify;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    public final Lazy pageHelper;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    public final Lazy connectRunnable;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final Lazy responseRunnable;

    public kg2(@NotNull Act act, @NotNull String str, @NotNull String str2) {
        act.getClass();
        str.getClass();
        str2.getClass();
        this.act = act;
        this.pageType = str;
        this.modeType = str2;
        this.DEFAULT_SHOW_STATUS_3_TIME = 1200L;
        this.NOT_LIMIT_VALUE = -1;
        this.pageId = "unknown_p_id";
        this.MEDIA_BUZZ_SEARCHED_KEY = "media_buzz_searched_key" + pzi0.m174454o();
        this.pageHelper = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.ag2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return kg2.m149683e(this.f71078a);
            }
        });
        this.connectRunnable = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.bg2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return kg2.m149687j(this.f76561a);
            }
        });
        this.responseRunnable = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.cg2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return kg2.m149681c(this.f81616a);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public static final void m149677C(kg2 kg2Var) {
        if (k8w.INSTANCE.m148752a(kg2Var.act)) {
            kg2Var.mo99381B();
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m149678F(kg2 kg2Var, String str, int i, Object obj) {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: enterWaitOrConnect");
            return;
        }
        if ((i & 1) != 0) {
            str = null;
        }
        kg2Var.m149695E(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m149680b(kg2 kg2Var, View view) {
        kg2Var.m149724n(kg2Var.pageType);
    }

    /* JADX INFO: renamed from: c */
    public static Runnable m149681c(final kg2 kg2Var) {
        return new Runnable() { // from class: l.ig2
            @Override // java.lang.Runnable
            public final void run() {
                kg2.m149690m0(this.f114730a);
            }
        };
    }

    /* JADX INFO: renamed from: d */
    public static void m149682d(kg2 kg2Var, View view) {
        if (!Intrinsics.m88377d(kg2Var.pageType, "textBuzz")) {
            nbw.INSTANCE.m162267x0(kg2Var.pageType);
        }
        ah2 ah2Var = kg2Var.presenter;
        if (ah2Var != null) {
            ah2Var.m97768W0();
        }
    }

    /* JADX INFO: renamed from: e */
    public static l4g0 m149683e(kg2 kg2Var) {
        return w1e.m204399c(kg2Var.pageId, kg2.class.getName());
    }

    /* JADX INFO: renamed from: e0 */
    public static final Unit m149684e0(kg2 kg2Var) {
        kg2Var.mo99386q();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static Runnable m149687j(final kg2 kg2Var) {
        return new Runnable() { // from class: l.hg2
            @Override // java.lang.Runnable
            public final void run() {
                kg2.m149677C(this.f109364a);
            }
        };
    }

    /* JADX INFO: renamed from: l */
    public static void m149689l(final kg2 kg2Var, View view) {
        String strM149697H = kg2Var.m149697H();
        if (strM149697H != null) {
            nbw.INSTANCE.m162248n(kg2Var.pageType);
            haw.m134240i0(haw.INSTANCE.m134320a(), kg2Var.act, strM149697H, kg2Var.pageType, new Function0() { // from class: l.jg2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return kg2.m149684e0(this.f120667a);
                }
            }, null, 16, null);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static final void m149690m0(kg2 kg2Var) {
        if (k8w.INSTANCE.m148752a(kg2Var.act)) {
            o1j0.m165649w(R$string.f20999u0);
            kg2Var.mo99386q();
        }
    }

    /* JADX INFO: renamed from: o0 */
    private final void m149691o0() {
        CoreModule.f18264c.f20427t1.m32519u(this.MEDIA_BUZZ_SEARCHED_KEY);
        long jM148759h = (((long) k8w.INSTANCE.m148759h(this.pageType)) * 1000) + 99;
        m149709V().m48313e();
        m149709V().m48314f(1.0f, jM148759h);
        m149722l0(jM148759h);
        RunnableC4884c0.a aVar = new RunnableC4884c0.a();
        aVar.m32526g(this.MEDIA_BUZZ_SEARCHED_KEY).m32520a(true).m32525f(jM148759h + pzi0.m174454o()).m32523d(this);
        CoreModule.f18264c.f20427t1.m32516r(aVar);
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m149692p(kg2 kg2Var) {
        m149678F(kg2Var, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m149693y(kg2 kg2Var, pf60 pf60Var, boolean z, int i, Object obj) {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: changeReceiveInvite");
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        kg2Var.m149729x(pf60Var, z);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m149694A(@NotNull pf60<String, Object> pair) {
        pair.getClass();
        Object obj = pair.f152157b;
        LoveBuzzPushData loveBuzzPushData = obj instanceof LoveBuzzPushData ? (LoveBuzzPushData) obj : null;
        return (loveBuzzPushData == null || !loveBuzzPushData.needReact || Intrinsics.m88377d(loveBuzzPushData.biz, "textBuzz")) ? false : true;
    }

    /* JADX INFO: renamed from: B */
    public void mo99381B() {
        ah2 ah2Var;
        xa2.INSTANCE.m209830a("BaseBuzzSearchModel", "connectBuzz");
        m149721k0();
        ah2 ah2Var2 = this.presenter;
        if (ah2Var2 != null) {
            ah2Var2.m97759I0(32);
        }
        k8w k8wVar = k8w.INSTANCE;
        k8wVar.m148761j(m149703P(), m149710W(), m149709V(), m149704Q());
        k8wVar.m148763l(m149711X(), m149707T());
        m149726p0();
        m149711X().setText(R$string.f20982m);
        pf60<String, Object> pf60Var = this.cacheNotify;
        if (pf60Var == null || (ah2Var = this.presenter) == null) {
            return;
        }
        ah2Var.mo97771u0(pf60Var);
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    /* JADX INFO: renamed from: E */
    public final void m149695E(@Nullable String token) {
        xa2 xa2Var = xa2.INSTANCE;
        xa2Var.m209830a("BaseBuzzSearchModel", "enterWaitOrConnect token " + token + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        haw hawVarM134320a = haw.INSTANCE.m134320a();
        if (!NullChecker.m82486a(token)) {
            token = m149697H();
        }
        String strM134268F0 = hawVarM134320a.m134268F0(token);
        xa2Var.m209830a("BaseBuzzSearchModel", "enterWaitOrConnect react " + strM134268F0 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        if (Intrinsics.m88377d(strM134268F0, "accepted")) {
            mo99381B();
        } else {
            mo99384f0();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: G */
    public final pf60<String, Object> m149696G() {
        return this.cacheNotify;
    }

    @Nullable
    /* JADX INFO: renamed from: H */
    public final String m149697H() {
        pf60<String, Object> pf60Var = this.cacheNotify;
        if (pf60Var != null) {
            Object obj = pf60Var.f152157b;
            LoveBuzzPushData loveBuzzPushData = obj instanceof LoveBuzzPushData ? (LoveBuzzPushData) obj : null;
            if (loveBuzzPushData != null) {
                return loveBuzzPushData.channelToken;
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public abstract String mo99382I();

    /* JADX INFO: renamed from: J */
    public final Runnable m149698J() {
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
    public abstract int mo99383M();

    @NotNull
    /* JADX INFO: renamed from: N */
    public final l4g0 m149701N() {
        Object value = this.pageHelper.getValue();
        value.getClass();
        return (l4g0) value;
    }

    /* JADX INFO: renamed from: O */
    public final Runnable m149702O() {
        return (Runnable) this.responseRunnable.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final VText m149703P() {
        VText vText = this._accept_buzz;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_accept_buzz");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final SVGAnimationView m149704Q() {
        SVGAnimationView sVGAnimationView = this._bundle_anim;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m88391r("_bundle_anim");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final ViewStub m149705R() {
        ViewStub viewStub = this._buzz_marquee;
        if (viewStub != null) {
            return viewStub;
        }
        Intrinsics.m88391r("_buzz_marquee");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final VDraweeView m149706S() {
        VDraweeView vDraweeView = this._buzz_search_anim;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_buzz_search_anim");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final SVGAnimationView m149707T() {
        SVGAnimationView sVGAnimationView = this._connect_anim;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m88391r("_connect_anim");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final VImage m149708U() {
        VImage vImage = this._peer_region;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_peer_region");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final BuzzCircleCountdownView m149709V() {
        BuzzCircleCountdownView buzzCircleCountdownView = this._process_circle;
        if (buzzCircleCountdownView != null) {
            return buzzCircleCountdownView;
        }
        Intrinsics.m88391r("_process_circle");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final VText m149710W() {
        VText vText = this._refuse_buzz;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_refuse_buzz");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final VText m149711X() {
        VText vText = this._search_buzz_desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_search_buzz_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final VDraweeView m149712Y() {
        VDraweeView vDraweeView = this._search_peer_avatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_search_peer_avatar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final ConstraintLayout m149713Z() {
        ConstraintLayout constraintLayout = this._search_root;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_search_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final VImage m149714a0() {
        VImage vImage = this._stop_search;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_stop_search");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final VText m149715b0() {
        VText vText = this._vb_peer_info;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_vb_peer_info");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final VText m149716c0() {
        VText vText = this._vb_peer_name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_vb_peer_name");
        return null;
    }

    /* JADX INFO: renamed from: d0 */
    public void m149717d0(@Nullable String userId) {
        xa2.INSTANCE.m209830a("BaseBuzzSearchModel", "handlerBundleSearchResult");
        m149721k0();
        SVGAnimationView.stopAnimation$default(m149704Q(), false, 1, null);
        pf60<String, Object> pf60Var = this.cacheNotify;
        if (pf60Var != null) {
            Object obj = pf60Var.f152157b;
            LoveBuzzPushData loveBuzzPushData = obj instanceof LoveBuzzPushData ? (LoveBuzzPushData) obj : null;
            if (loveBuzzPushData != null) {
                loveBuzzPushData.userId = userId;
            }
            m149729x(pf60Var, false);
        }
        mo99381B();
    }

    @Override // p153l.iam
    public void destroy() {
        m149721k0();
        w1e.m204401e(m149701N());
    }

    /* JADX INFO: renamed from: f0 */
    public void mo99384f0() {
        ah2 ah2Var = this.presenter;
        if (ah2Var != null) {
            ah2Var.m97759I0(16);
        }
        k8w k8wVar = k8w.INSTANCE;
        k8wVar.m148761j(m149703P(), m149710W(), m149709V());
        k8wVar.m148763l(m149711X(), m149707T());
        m149726p0();
        m149711X().setText(R$string.f20943Y0);
        m149721k0();
        int iM148760i = Intrinsics.m88377d(haw.INSTANCE.m134320a().m134268F0(m149697H()), "rejected") ? 3 : k8wVar.m148760i(this.pageType);
        xa2.INSTANCE.m209830a("BaseBuzzSearchModel", "jumpResponse timeOut " + iM148760i);
        l51.m152888H(this.act, m149702O(), ((long) iM148760i) * 1000);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m149718g0() {
        ah2 ah2Var;
        if (!bnl0.m105529O0(m149714a0()) || (ah2Var = this.presenter) == null) {
            return;
        }
        ah2Var.m97768W0();
    }

    /* JADX INFO: renamed from: h0 */
    public final void m149719h0(@NotNull String pId) {
        pId.getClass();
        if (!Intrinsics.m88377d(this.pageId, "unknown_p_id")) {
            w1e.m204401e(m149701N());
        }
        m149701N().m152782q(pId);
        this.pageId = pId;
        w1e.m204402f(m149701N());
    }

    /* JADX INFO: renamed from: i0 */
    public final void m149720i0(View preView, View endView, boolean sequent) {
        Animator animatorM132166l = gt0.m132166l(endView, gt0.f106354i, 0L, 500L, new LinearInterpolator(), 0.0f, 1.2f, 0.8f, 1.0f);
        if (sequent) {
            animatorM132166l = gt0.m132173s(gt0.m132166l(preView, gt0.f106354i, 0L, 300L, null, 1.0f, 0.0f), animatorM132166l);
        }
        animatorM132166l.start();
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m149723m(inflater, parent);
    }

    /* JADX INFO: renamed from: j0 */
    public void mo99385j0(@NotNull pf60<String, Object> pair, boolean bundle) {
        pair.getClass();
        k8w k8wVar = k8w.INSTANCE;
        if (k8wVar.m148752a(this.act)) {
            xa2 xa2Var = xa2.INSTANCE;
            String str = pair.f152156a;
            xa2Var.m209830a("BaseBuzzSearchModel", "receiveInvite, notify " + ((Object) str) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + pair.f152157b + " this " + this);
            if (bundle) {
                m149728w(pair);
            } else {
                m149729x(pair, true);
            }
            this.cacheNotify = pair;
            m149721k0();
            if (!bundle) {
                if (m149694A(pair)) {
                    mo99388v();
                    return;
                } else {
                    l51.m152888H(this.act, m149698J(), this.DEFAULT_SHOW_STATUS_3_TIME);
                    return;
                }
            }
            int iM148760i = k8wVar.m148760i(this.pageType);
            xa2Var.m209830a("BaseBuzzSearchModel", "receiveBundleInvite timeOut " + iM148760i);
            l51.m152888H(this.act, m149702O(), ((long) iM148760i) * 1000);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m149721k0() {
        l51.m152890J(m149698J());
        l51.m152890J(m149702O());
        CoreModule.f18264c.f20427t1.m32519u(this.MEDIA_BUZZ_SEARCHED_KEY);
        m149709V().m48310b();
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: l0 */
    public final void m149722l0(long lastTime) {
        m149703P().setText(k3d0.m148007c(R$string.f20938W) + " (" + (lastTime / 1000) + "s)");
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final View m149723m(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM154058b = lg2.m154058b(this, inflater, parent);
        viewM154058b.getClass();
        return viewM154058b;
    }

    /* JADX INFO: renamed from: n */
    public final void m149724n(String type) {
        String strM149697H = m149697H();
        if (strM149697H != null) {
            haw.m134225Y(haw.INSTANCE.m134320a(), this.act, strM149697H, type, new Function0() { // from class: l.dg2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return kg2.m149692p(this.f88250a);
                }
            }, null, false, 16, null);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m149725n0(@Nullable pf60<String, Object> pf60Var) {
        this.cacheNotify = pf60Var;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m149726p0() {
        if (m149707T().isAnimating()) {
            return;
        }
        SVGALoader.with(getContext()).from(mo99382I()).autoPlay(true).into(m149707T());
    }

    /* JADX INFO: renamed from: q */
    public void mo99386q() {
        xa2.INSTANCE.m209830a("BaseBuzzSearchModel", "backSearchPage ");
        m149721k0();
        k8w k8wVar = k8w.INSTANCE;
        k8wVar.m148761j(m149703P(), m149710W(), m149709V(), m149712Y(), m149715b0(), m149708U(), m149716c0(), m149707T(), m149704Q());
        k8wVar.m148763l(m149706S(), m149714a0(), m149711X());
        m149706S().setScaleX(1.0f);
        m149706S().setScaleY(1.0f);
        m149712Y().setScaleX(0.0f);
        m149712Y().setScaleY(0.0f);
        m149704Q().setScaleX(0.0f);
        m149704Q().setScaleY(0.0f);
        m149711X().setText(R$string.f20962f0);
        this.cacheNotify = null;
        ah2 ah2Var = this.presenter;
        if (ah2Var != null) {
            ah2Var.m97763Q0(0);
        }
        ah2 ah2Var2 = this.presenter;
        if (ah2Var2 != null) {
            ah2Var2.mo97766U0();
        }
    }

    /* JADX INFO: renamed from: r */
    public void mo99387r() {
        bnl0.m105540X(m149714a0(), bnl0.m105511F0() + qa00.f156326m);
        int iM105511F0 = bnl0.m105511F0() + qa00.m175859d(116.0f);
        bnl0.m105540X(m149706S(), iM105511F0);
        bnl0.m105540X(m149712Y(), qa00.f156338y + iM105511F0);
        bnl0.m105540X(m149704Q(), iM105511F0 - qa00.f156330q);
        int iMo99383M = mo99383M();
        if (iMo99383M > 0) {
            m149713Z().setBackgroundResource(iMo99383M);
        }
        bnl0.m105509E0(m149714a0(), new View.OnClickListener() { // from class: l.eg2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kg2.m149682d(this.f93892a, view);
            }
        });
        ComponentCallbacks2C1057a.m5327v(this.act).m156814m().m95642D0("https://auto.tancdn.com/v1/raw/7369bc71-0430-4e3c-87da-f96778ea63be12.gif").m155550e(d4e.f85035c).m95652x0(m149706S());
        bnl0.m105509E0(m149703P(), new View.OnClickListener() { // from class: l.fg2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kg2.m149680b(this.f98880a, view);
            }
        });
        bnl0.m105509E0(m149710W(), new View.OnClickListener() { // from class: l.gg2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kg2.m149689l(this.f103986a, view);
            }
        });
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@Nullable ah2 presenter) {
        this.presenter = presenter;
    }

    @Override // com.p051p1.mobile.putong.core.api.RunnableC4884c0.c
    /* JADX INFO: renamed from: u */
    public void mo32530u(@Nullable String key, long currentTime, long beginTime, long endTime, long registerTime) {
        long j = endTime - currentTime;
        if (TextUtils.equals(key, this.MEDIA_BUZZ_SEARCHED_KEY)) {
            m149722l0(j);
        }
        if (j <= 0) {
            m149724n(this.pageType);
            m149678F(this, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: v */
    public void mo99388v() {
        xa2.INSTANCE.m209830a("BaseBuzzSearchModel", "changeReact");
        m149709V().setAlpha(0.0f);
        k8w.INSTANCE.m148763l(m149703P(), m149710W(), m149709V());
        m149709V().animate().alpha(1.0f).setDuration(900L).setInterpolator(new LinearInterpolator()).start();
        m149691o0();
    }

    /* JADX INFO: renamed from: w */
    public final void m149728w(pf60<String, Object> pair) {
        xa2.INSTANCE.m209830a("BaseBuzzSearchModel", "changeReceiveBundleInvite");
        k8w k8wVar = k8w.INSTANCE;
        k8wVar.m148761j(m149714a0());
        k8wVar.m148763l(m149704Q(), m149711X(), m149707T());
        m149720i0(m149706S(), m149704Q(), true);
        Dialog showingDialog = this.act.getShowingDialog();
        if (showingDialog != null) {
            showingDialog.dismiss();
        }
        m149726p0();
        m149711X().setText(R$string.f20943Y0);
        if (!m149704Q().isAnimating()) {
            SVGAnimationView.stopAnimation$default(m149704Q(), false, 1, null);
        }
        SVGALoader.with(getContext()).from(kq3.INSTANCE.m150808b()).autoPlay(true).into(m149704Q());
    }

    /* JADX INFO: renamed from: x */
    public final void m149729x(@NotNull pf60<String, Object> pair, boolean fromInvite) {
        pair.getClass();
        xa2.INSTANCE.m209830a("BaseBuzzSearchModel", "changeReceiveInvite");
        if (fromInvite) {
            k8w.INSTANCE.m148761j(m149714a0(), m149711X(), m149707T());
        } else {
            k8w.INSTANCE.m148761j(m149706S(), m149714a0(), m149711X(), m149707T());
        }
        k8w.INSTANCE.m148763l(m149712Y(), m149715b0(), m149716c0(), m149708U());
        m149720i0(m149706S(), m149712Y(), fromInvite);
        Dialog showingDialog = this.act.getShowingDialog();
        if (showingDialog != null) {
            showingDialog.dismiss();
        }
        Object obj = pair.f152157b;
        if (obj instanceof LoveBuzzPushData) {
            dkb dkbVar = CoreModule.f18264c.f20381e0;
            String str = ((LoveBuzzPushData) obj).userId;
            if (str == null) {
                str = "";
            }
            User userM116503Pa = dkbVar.m116503Pa(str);
            if (userM116503Pa == null) {
                return;
            }
            if (Intrinsics.m88377d(this.pageType, "memojiBuzz")) {
                uqb0.f180374G.m127115L0(m149712Y(), TEnum.equals(userM116503Pa.gender, "male") ? "https://auto.tancdn.com/v1/raw/ae762df1-9a4b-4d4f-b16f-96f445fed4de12.webp" : "https://auto.tancdn.com/v1/raw/2512c09a-e89c-4999-bc89-40b08a3a5d2f12.webp");
            } else {
                sbw sbwVar = sbw.INSTANCE;
                VDraweeView vDraweeViewM149712Y = m149712Y();
                Picture.ImageUri imageUriProfileSmall = sbwVar.m185345j(userM116503Pa).profileSmall();
                imageUriProfileSmall.getClass();
                sbwVar.m185342g(vDraweeViewM149712Y, imageUriProfileSmall, 0, !Intrinsics.m88377d(this.pageType, "textBuzz"));
            }
            sbw sbwVar2 = sbw.INSTANCE;
            sbwVar2.m185351p(userM116503Pa, m149708U());
            m149716c0().setText(userM116503Pa.name);
            sbwVar2.m185350o(userM116503Pa, m149715b0(), 18.0f, 18.0f);
        }
    }

    /* JADX INFO: renamed from: z */
    public final boolean m149730z(@NotNull String type) {
        type.getClass();
        haw.Companion companion = haw.INSTANCE;
        pf60<String, Object> pf60VarM222761e = companion.m134320a().m134269G0().m222761e();
        if (pf60VarM222761e == null || !Intrinsics.m88377d(pf60VarM222761e.f152156a, "intl.media.lovebuzz.show.notify")) {
            return false;
        }
        Object obj = pf60VarM222761e.f152157b;
        if (!(obj instanceof LoveBuzzPushData)) {
            return false;
        }
        obj.getClass();
        LoveBuzzPushData loveBuzzPushData = (LoveBuzzPushData) obj;
        if (!Intrinsics.m88377d(loveBuzzPushData.biz, type) || !Intrinsics.m88377d(loveBuzzPushData.mode, "passive")) {
            return false;
        }
        if (Intrinsics.m88377d(loveBuzzPushData.subType, StickerBundle.TYPE) && !Intrinsics.m88377d(this.modeType, "passive")) {
            return false;
        }
        if (!Intrinsics.m88377d(companion.m134320a().m134268F0(loveBuzzPushData.channelToken), "rejected")) {
            return true;
        }
        o1j0.m165649w(R$string.f20999u0);
        companion.m134320a().m134269G0().onNext(jyb.m147494Y("intl.text.lovebuzz.close.notify", null));
        return false;
    }

    public /* synthetic */ kg2(Act act, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(act, str, (i & 4) != 0 ? Active.TYPE : str2);
    }
}
