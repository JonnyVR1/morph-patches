package p153l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.QuickChatCardInfo;
import com.p051p1.mobile.putong.core.data.QuickChatType;
import com.p051p1.mobile.putong.core.data.VideoChatSecondFloorSummary;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchManager;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.newquickchat.secondfloor.QuickChatLoftAct;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.newquickchat.secondfloor.item.QuickChatLoftChatItem;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.newquickchat.secondfloor.item.QuickChatPageItem;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VScroll;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\nJ\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\nJ\u000f\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\nJ\u000f\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\nJ\u000f\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\nJ\u000f\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\nJ\u000f\u0010\u001c\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\nJ\u000f\u0010\u001d\u001a\u00020\bH\u0003¢\u0006\u0004\b\u001d\u0010\nJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u0002H\u0016¢\u0006\u0004\b)\u0010*J!\u0010+\u001a\u00020%2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b+\u0010'J\r\u0010,\u001a\u00020\b¢\u0006\u0004\b,\u0010\nJ\u0015\u0010-\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b/\u0010 J\r\u00100\u001a\u00020\b¢\u0006\u0004\b0\u0010\nJ\u0015\u00103\u001a\u00020\b2\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\b¢\u0006\u0004\b5\u0010\nJ\r\u00106\u001a\u00020\b¢\u0006\u0004\b6\u0010\nJ\r\u00108\u001a\u000207¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u000207H\u0016¢\u0006\u0004\b:\u00109J\u000f\u0010;\u001a\u000207H\u0016¢\u0006\u0004\b;\u00109J\u000f\u0010<\u001a\u00020\bH\u0016¢\u0006\u0004\b<\u0010\nJ\u000f\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?J\u0015\u0010B\u001a\u00020\b2\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bB\u0010CJ\u0015\u0010E\u001a\u00020\b2\u0006\u0010D\u001a\u00020\u000e¢\u0006\u0004\bE\u0010FR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010`\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010h\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010l\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010S\u001a\u0004\bj\u0010U\"\u0004\bk\u0010WR\"\u0010t\u001a\u00020m8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\"\u0010|\u001a\u00020u8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R#\u0010\u0080\u0001\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b}\u0010c\u001a\u0004\b~\u0010e\"\u0004\b\u007f\u0010gR*\u0010\u0088\u0001\u001a\u00030\u0081\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R&\u0010\u008c\u0001\u001a\u00020m8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0089\u0001\u0010o\u001a\u0005\b\u008a\u0001\u0010q\"\u0005\b\u008b\u0001\u0010sR&\u0010\u0090\u0001\u001a\u00020m8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008d\u0001\u0010o\u001a\u0005\b\u008e\u0001\u0010q\"\u0005\b\u008f\u0001\u0010sR*\u0010\u0098\u0001\u001a\u00030\u0091\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R&\u0010\u009c\u0001\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0099\u0001\u0010[\u001a\u0005\b\u009a\u0001\u0010]\"\u0005\b\u009b\u0001\u0010_R*\u0010 \u0001\u001a\u00030\u0081\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009d\u0001\u0010\u0083\u0001\u001a\u0006\b\u009e\u0001\u0010\u0085\u0001\"\u0006\b\u009f\u0001\u0010\u0087\u0001R*\u0010¨\u0001\u001a\u00030¡\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R*\u0010¬\u0001\u001a\u00030¡\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b©\u0001\u0010£\u0001\u001a\u0006\bª\u0001\u0010¥\u0001\"\u0006\b«\u0001\u0010§\u0001R%\u0010¯\u0001\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\t\u0010c\u001a\u0005\b\u00ad\u0001\u0010e\"\u0005\b®\u0001\u0010gR&\u0010³\u0001\u001a\u00020m8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b°\u0001\u0010o\u001a\u0005\b±\u0001\u0010q\"\u0005\b²\u0001\u0010sR&\u0010·\u0001\u001a\u00020m8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b´\u0001\u0010o\u001a\u0005\bµ\u0001\u0010q\"\u0005\b¶\u0001\u0010sR*\u0010¿\u0001\u001a\u00030¸\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001\"\u0006\b½\u0001\u0010¾\u0001R%\u0010Â\u0001\u001a\u00020m8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b&\u0010o\u001a\u0005\bÀ\u0001\u0010q\"\u0005\bÁ\u0001\u0010sR&\u0010Æ\u0001\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÃ\u0001\u0010c\u001a\u0005\bÄ\u0001\u0010e\"\u0005\bÅ\u0001\u0010gR)\u0010Í\u0001\u001a\u00030Ç\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u001b\u0010È\u0001\u001a\u0006\bÉ\u0001\u0010Ê\u0001\"\u0006\bË\u0001\u0010Ì\u0001R)\u0010Ð\u0001\u001a\u00030Ç\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b)\u0010È\u0001\u001a\u0006\bÎ\u0001\u0010Ê\u0001\"\u0006\bÏ\u0001\u0010Ì\u0001R)\u0010Ó\u0001\u001a\u00030¸\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b0\u0010º\u0001\u001a\u0006\bÑ\u0001\u0010¼\u0001\"\u0006\bÒ\u0001\u0010¾\u0001R%\u0010Ö\u0001\u001a\u00020m8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\bE\u0010o\u001a\u0005\bÔ\u0001\u0010q\"\u0005\bÕ\u0001\u0010sR)\u0010Ù\u0001\u001a\u00030\u0081\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u000f\u0010\u0083\u0001\u001a\u0006\b×\u0001\u0010\u0085\u0001\"\u0006\bØ\u0001\u0010\u0087\u0001R(\u0010ß\u0001\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b8\u0010Ú\u0001\u001a\u0006\bÛ\u0001\u0010Ü\u0001\"\u0006\bÝ\u0001\u0010Þ\u0001R\u0018\u0010(\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bà\u0001\u0010á\u0001R\u0019\u0010ã\u0001\u001a\u00030â\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bj\u0010»\u0001R\u0019\u0010å\u0001\u001a\u00030ä\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b»\u0001\u0010dR\u0019\u0010è\u0001\u001a\u00030æ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bx\u0010ç\u0001R\u001a\u0010é\u0001\u001a\u00030æ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0001\u0010ç\u0001R#\u0010ë\u0001\u001a\r ê\u0001*\u0005\u0018\u00010æ\u00010æ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bd\u0010ç\u0001R\u0019\u0010ì\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010\u008a\u0001R\u001b\u0010î\u0001\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010í\u0001R%\u0010ñ\u0001\u001a\u000f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0ï\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bL\u0010ð\u0001¨\u0006ò\u0001"}, m88121d2 = {"Ll/s4c0;", "Ll/iam;", "Ll/a4c0;", "", "Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/QuickChatLoftAct;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/QuickChatLoftAct;)V", "", "r", "()V", "f0", "Ll/i1c0;", "cardData", "", "B", "(Ll/i1c0;)Z", "d0", "data", "", "from", "y0", "(Ll/i1c0;Ljava/lang/String;)V", "h0", "k0", "w0", "v0", BaseSei.f14624X, "g0", "e0", "eid", "s0", "(Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", ResourceDirection.f39656v, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", BaseSei.f14625Y, "(Ll/a4c0;)V", "inflateView", "u0", "o0", "(Ll/i1c0;)V", "x0", BaseSei.f14626Z, "Lcom/p1/mobile/putong/core/data/VideoChatSecondFloorSummary;", "videoChatSecondFloorSummary", "r0", "(Lcom/p1/mobile/putong/core/data/VideoChatSecondFloorSummary;)V", "m0", "t0", "Landroid/animation/Animator;", c4s.C_ZONE, "()Landroid/animation/Animator;", "enterAnimation", "exitAnimation", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Landroid/os/Bundle;", "savedInstanceState", "j0", "(Landroid/os/Bundle;)V", "able", "A", "(Z)V", "a", "Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/QuickChatLoftAct;", "Landroid/widget/FrameLayout;", "b", "Landroid/widget/FrameLayout;", "L", "()Landroid/widget/FrameLayout;", "set_rootView", "(Landroid/widget/FrameLayout;)V", "_rootView", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "get_background", "()Landroid/widget/ImageView;", "set_background", "(Landroid/widget/ImageView;)V", "_background", "Lcom/tantan/library/svga/SVGAnimationView;", Constants.INAPP_DATA_TAG, "Lcom/tantan/library/svga/SVGAnimationView;", "Q", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_svga_bg", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_svga_bg", "Lv/VLinear;", "e", "Lv/VLinear;", "I", "()Lv/VLinear;", "set_navigation_bar", "(Lv/VLinear;)V", "_navigation_bar", "f", "E", "set_back_btn", "_back_btn", "Lv/VText;", "g", "Lv/VText;", "W", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "Lv/VScroll;", "h", "Lv/VScroll;", "G", "()Lv/VScroll;", "set_content_view", "(Lv/VScroll;)V", "_content_view", RXScreenCaptureService.KEY_INDEX, "X", "set_top_content", "_top_content", "Lv/VImage;", "j", "Lv/VImage;", "Y", "()Lv/VImage;", "set_top_icon", "(Lv/VImage;)V", "_top_icon", "k", "Z", "set_top_title", "_top_title", BLiveStormDanmakuGiftResourceType.f45292l, "P", "set_sub_title", "_sub_title", "Lv/VFrame;", "m", "Lv/VFrame;", "R", "()Lv/VFrame;", "set_text_chat_view", "(Lv/VFrame;)V", "_text_chat_view", "n", p7f.LATITUDE_SOUTH, "set_text_chat_view_svg_anim", "_text_chat_view_svg_anim", "o", p7f.GPS_MEASUREMENT_INTERRUPTED, "set_text_chat_view_wave", "_text_chat_view_wave", "Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/item/QuickChatLoftChatItem;", "p", "Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/item/QuickChatLoftChatItem;", p7f.GPS_DIRECTION_TRUE, "()Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/item/QuickChatLoftChatItem;", "set_text_chat_view_view1", "(Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/item/QuickChatLoftChatItem;)V", "_text_chat_view_view1", "q", "U", "set_text_chat_view_view2", "_text_chat_view_view2", "J", "set_online_tip_button", "_online_tip_button", BLiveStormDanmakuGiftResourceType.f45294s, "get_quick_text", "set_quick_text", "_quick_text", Constants.KEY_T, "K", "set_quick_text_count", "_quick_text_count", "Lv/VRelative;", "u", "Lv/VRelative;", "F", "()Lv/VRelative;", "set_call_content", "(Lv/VRelative;)V", "_call_content", "get_bottom_content_title", "set_bottom_content_title", "_bottom_content_title", "w", "a0", "set_total_layout", "_total_layout", "Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/item/QuickChatPageItem;", "Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/item/QuickChatPageItem;", "c0", "()Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/item/QuickChatPageItem;", "set_total_layout_voice_call_content", "(Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/item/QuickChatPageItem;)V", "_total_layout_voice_call_content", "b0", "set_total_layout_vedio_call_content", "_total_layout_vedio_call_content", "M", "set_single_layout", "_single_layout", "N", "set_single_layout_desc", "_single_layout_desc", BloodType.f39576O, "set_single_layout_icon", "_single_layout_icon", "Landroid/view/View;", "H", "()Landroid/view/View;", "set_mask", "(Landroid/view/View;)V", "_mask", "D", "Ll/a4c0;", "", "downY", "", "animationState", "Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator;", "animationUp", "animationDown", "kotlin.jvm.PlatformType", "alphaAnimation", "moveYIntercept", "Ll/i1c0;", "currentCardData", "Ll/z20;", "Ll/z20;", "matchImmediatelyAction", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class s4c0 implements iam<a4c0> {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public VText _single_layout_desc;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public VImage _single_layout_icon;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public View _mask;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public a4c0 presenter;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public float downY;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public int animationState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    public ValueAnimator animationUp;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    public ValueAnimator animationDown;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ValueAnimator alphaAnimation;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public boolean moveYIntercept;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @Nullable
    public i1c0 currentCardData;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @NotNull
    public z20<i1c0, Boolean> matchImmediatelyAction;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final QuickChatLoftAct act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public FrameLayout _rootView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public ImageView _background;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public SVGAnimationView _svga_bg;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VLinear _navigation_bar;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public ImageView _back_btn;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VScroll _content_view;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VLinear _top_content;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VImage _top_icon;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VText _top_title;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VText _sub_title;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VFrame _text_chat_view;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public SVGAnimationView _text_chat_view_svg_anim;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public VImage _text_chat_view_wave;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public QuickChatLoftChatItem _text_chat_view_view1;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public QuickChatLoftChatItem _text_chat_view_view2;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public VLinear _online_tip_button;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public VText _quick_text;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public VText _quick_text_count;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public VRelative _call_content;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public VText _bottom_content_title;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public VLinear _total_layout;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public QuickChatPageItem _total_layout_voice_call_content;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public QuickChatPageItem _total_layout_vedio_call_content;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public VRelative _single_layout;

    /* JADX INFO: renamed from: l.s4c0$a */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/s4c0$a", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "(Landroid/animation/Animator;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C19979a extends AnimatorListenerAdapter {
        public C19979a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            animation.getClass();
            bnl0.m105525M0(s4c0.this.m184502Y(), true);
            bnl0.m105525M0(s4c0.this.m184503Z(), true);
            bnl0.m105525M0(s4c0.this.m184493P(), true);
            bnl0.m105525M0(s4c0.this.m184495R(), true);
            bnl0.m105525M0(s4c0.this.m184487J(), true);
            bnl0.m105525M0(s4c0.this.m184483F(), true);
        }
    }

    /* JADX INFO: renamed from: l.s4c0$b */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, m88121d2 = {"l/s4c0$b", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationRepeat", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C19980b implements Animator.AnimatorListener {
        public C19980b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            animation.getClass();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            s4c0.this.animationState = 1;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            animation.getClass();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            animation.getClass();
            s4c0.this.animationState = 0;
        }
    }

    /* JADX INFO: renamed from: l.s4c0$c */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, m88121d2 = {"l/s4c0$c", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationRepeat", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C19981c implements Animator.AnimatorListener {
        public C19981c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            animation.getClass();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            s4c0.this.animationState = 2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            animation.getClass();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            animation.getClass();
            s4c0.this.animationState = 0;
        }
    }

    public s4c0(@NotNull QuickChatLoftAct quickChatLoftAct) {
        quickChatLoftAct.getClass();
        this.act = quickChatLoftAct;
        this.animationState = 1;
        this.animationUp = new ValueAnimator();
        this.animationDown = new ValueAnimator();
        this.alphaAnimation = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.matchImmediatelyAction = new z20() { // from class: l.j4c0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                s4c0.m184466l(this.f118284a, (i1c0) obj, ((Boolean) obj2).booleanValue());
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static void m184455a(s4c0 s4c0Var, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        SVGAnimationView sVGAnimationViewM184494Q = s4c0Var.m184494Q();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        sVGAnimationViewM184494Q.setAlpha((((Float) animatedValue).floatValue() * 0.9f) + 0.1f);
        VLinear vLinearM184501X = s4c0Var.m184501X();
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        animatedValue2.getClass();
        vLinearM184501X.setAlpha(((Float) animatedValue2).floatValue());
    }

    /* JADX INFO: renamed from: b */
    public static void m184456b(s4c0 s4c0Var, i1c0 i1c0Var, Boolean bool) {
        if (rm50.m182040a() && OnlineMatchManager.m51326z().m51364m0()) {
            gs50.INSTANCE.m132001a().m131993H(s4c0Var.act, "overheat_protection");
        } else {
            s4c0Var.matchImmediatelyAction.call(i1c0Var, bool);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m184459e(s4c0 s4c0Var, View view) {
        s4c0Var.act.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: f */
    public static void m184460f(s4c0 s4c0Var, View view) {
        s4c0Var.m184516s0("e_voicechat_button");
        if (Network.isConnected(CoreModule.f18263b)) {
            s4c0Var.m184526z();
        } else {
            o1j0.m165635i(R$string.f19605r4, true);
        }
    }

    /* JADX INFO: renamed from: g0 */
    private final void m184461g0() {
        bnl0.m105524M(m184486I(), true);
        bnl0.m105509E0(m184482E(), new View.OnClickListener() { // from class: l.l4c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s4c0.m184459e(this.f129959a, view);
            }
        });
        m184500W().setTypeface(Typeface.defaultFromStyle(1));
    }

    /* JADX INFO: renamed from: i0 */
    public static final void m184463i0(s4c0 s4c0Var, i1c0 i1c0Var) {
        CoreModule.f18264c.f20312H0.m155449k5();
        a4c0 a4c0Var = s4c0Var.presenter;
        if (a4c0Var == null) {
            Intrinsics.m88391r("presenter");
            a4c0Var = null;
        }
        a4c0Var.m95907y0(i1c0Var);
    }

    /* JADX INFO: renamed from: j */
    public static void m184464j(s4c0 s4c0Var, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        SVGAnimationView sVGAnimationViewM184494Q = s4c0Var.m184494Q();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        sVGAnimationViewM184494Q.setAlpha((((Float) animatedValue).floatValue() * 0.9f) + 0.1f);
        VLinear vLinearM184501X = s4c0Var.m184501X();
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        animatedValue2.getClass();
        vLinearM184501X.setAlpha(((Float) animatedValue2).floatValue());
    }

    /* JADX INFO: renamed from: l */
    public static void m184466l(final s4c0 s4c0Var, final i1c0 i1c0Var, boolean z) {
        i1c0Var.getClass();
        QuickChatCardInfo quickChatCardInfo = new QuickChatCardInfo();
        quickChatCardInfo.secretKey = i1c0Var.getTextCardData().secretKey;
        quickChatCardInfo.userID = i1c0Var.getTextCardData().userID;
        quickChatCardInfo.biz = QuickChatType.get(i1c0Var.getTextCardData().biz);
        quickChatCardInfo.stage = i1c0Var.getTextCardData().stage;
        a8d0.m96435s0(s4c0Var.act, quickChatCardInfo, z, true, "", new x20() { // from class: l.q4c0
            @Override // p153l.x20
            public final void call() {
                s4c0.m184463i0(this.f155557a, i1c0Var);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public static final void m184467l0(s4c0 s4c0Var, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        VScroll vScrollM184484G = s4c0Var.m184484G();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        vScrollM184484G.smoothScrollTo(0, ((Integer) animatedValue).intValue());
    }

    /* JADX INFO: renamed from: m */
    public static void m184468m(s4c0 s4c0Var, Boolean bool) {
        r3c0.m179591m(s4c0Var.act, "voice_quick_chat");
    }

    /* JADX INFO: renamed from: n0 */
    public static final void m184470n0(s4c0 s4c0Var, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        VScroll vScrollM184484G = s4c0Var.m184484G();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        vScrollM184484G.smoothScrollTo(0, ((Integer) animatedValue).intValue());
    }

    /* JADX INFO: renamed from: p */
    public static void m184471p(s4c0 s4c0Var, Boolean bool) {
        if (rm50.m182040a() && OnlineMatchManager.m51326z().m51364m0()) {
            gs50.INSTANCE.m132001a().m131993H(s4c0Var.act, "overheat_protection");
        } else {
            if (r3c0.INSTANCE.m179600r(s4c0Var.act)) {
                return;
            }
            r3c0.m179591m(s4c0Var.act, "text_quick_chat");
        }
    }

    /* JADX INFO: renamed from: p0 */
    public static final void m184472p0(s4c0 s4c0Var, i1c0 i1c0Var) {
        s4c0Var.m184516s0("e_quickchat_broadcast");
        if (!Network.isConnected(CoreModule.f18263b)) {
            o1j0.m165635i(R$string.f19605r4, true);
        } else {
            i1c0Var.getClass();
            s4c0Var.m184525y0(i1c0Var, "p_quickchat,quickchat_recommend");
        }
    }

    /* JADX INFO: renamed from: q */
    public static boolean m184473q(s4c0 s4c0Var, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            s4c0Var.downY = motionEvent.getY();
            return false;
        }
        if (action != 2) {
            return false;
        }
        float y = motionEvent.getY() - s4c0Var.downY;
        if (Math.abs(y) <= qa00.f156328o || s4c0Var.moveYIntercept) {
            return true;
        }
        if (y < 0.0f && !s4c0Var.animationUp.isRunning()) {
            s4c0Var.m184513m0();
            return true;
        }
        if (y <= 0.0f || s4c0Var.animationDown.isRunning()) {
            return true;
        }
        s4c0Var.m184512k0();
        return true;
    }

    /* JADX INFO: renamed from: q0 */
    public static final void m184474q0(s4c0 s4c0Var, i1c0 i1c0Var) {
        s4c0Var.m184516s0("e_quickchat_broadcast");
        if (!Network.isConnected(CoreModule.f18263b)) {
            o1j0.m165635i(R$string.f19605r4, true);
        } else {
            i1c0Var.getClass();
            s4c0Var.m184525y0(i1c0Var, "p_quickchat,quickchat_recommend");
        }
    }

    /* JADX INFO: renamed from: r */
    private final void m184475r() {
        m184461g0();
        m184522x();
        m184508e0();
        m184517t0();
        m184507d0();
        m184510h0();
        m184509f0();
        m184518u0();
    }

    /* JADX INFO: renamed from: s */
    public static void m184476s(s4c0 s4c0Var) {
        s4c0Var.m184526z();
    }

    /* JADX INFO: renamed from: u */
    public static void m184477u(s4c0 s4c0Var, View view) {
        s4c0Var.m184516s0("e_quickchat_button");
        if (Network.isConnected(CoreModule.f18263b)) {
            s4c0Var.m184523x0("p_quickchat,quickchat_button");
        } else {
            o1j0.m165635i(R$string.f19605r4, true);
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m184479A(boolean able) {
        m184490M().setClickable(able);
        m184487J().setClickable(able);
        m184506c0().m55715h(able);
        m184505b0().m55715h(able);
    }

    /* JADX INFO: renamed from: B */
    public final boolean m184480B(i1c0 cardData) {
        if (this.currentCardData == null) {
            return false;
        }
        String str = cardData.getTextCardData().userID;
        i1c0 i1c0Var = this.currentCardData;
        i1c0Var.getClass();
        return TextUtils.equals(str, i1c0Var.getTextCardData().userID);
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final Animator m184481C() {
        AnimatorSet animatorSet = new AnimatorSet();
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(m184502Y(), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.0f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.0f, 1.0f), propertyValuesHolderOfFloat);
        objectAnimatorOfPropertyValuesHolder.setDuration(300L);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new DecelerateInterpolator());
        Property property = View.TRANSLATION_Y;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(m184503Z(), PropertyValuesHolder.ofFloat((Property<?, Float>) property, txq.m193530c(10), 0.0f), propertyValuesHolderOfFloat);
        objectAnimatorOfPropertyValuesHolder2.setDuration(300L);
        objectAnimatorOfPropertyValuesHolder2.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator objectAnimatorOfPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(m184493P(), PropertyValuesHolder.ofFloat((Property<?, Float>) property, txq.m193530c(15), 0.0f), propertyValuesHolderOfFloat);
        objectAnimatorOfPropertyValuesHolder3.setDuration(300L);
        objectAnimatorOfPropertyValuesHolder3.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator objectAnimatorOfPropertyValuesHolder4 = ObjectAnimator.ofPropertyValuesHolder(m184495R(), propertyValuesHolderOfFloat);
        objectAnimatorOfPropertyValuesHolder4.setDuration(300L);
        objectAnimatorOfPropertyValuesHolder4.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator objectAnimatorOfPropertyValuesHolder5 = ObjectAnimator.ofPropertyValuesHolder(m184487J(), propertyValuesHolderOfFloat);
        objectAnimatorOfPropertyValuesHolder5.setDuration(300L);
        objectAnimatorOfPropertyValuesHolder5.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator objectAnimatorOfPropertyValuesHolder6 = ObjectAnimator.ofPropertyValuesHolder(m184483F(), propertyValuesHolderOfFloat);
        objectAnimatorOfPropertyValuesHolder6.setDuration(300L);
        objectAnimatorOfPropertyValuesHolder6.setInterpolator(new DecelerateInterpolator());
        animatorSet.playTogether(objectAnimatorOfPropertyValuesHolder, objectAnimatorOfPropertyValuesHolder2, objectAnimatorOfPropertyValuesHolder3, objectAnimatorOfPropertyValuesHolder4, objectAnimatorOfPropertyValuesHolder5, objectAnimatorOfPropertyValuesHolder6);
        animatorSet.addListener(new C19979a());
        return animatorSet;
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final ImageView m184482E() {
        ImageView imageView = this._back_btn;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m88391r("_back_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final VRelative m184483F() {
        VRelative vRelative = this._call_content;
        if (vRelative != null) {
            return vRelative;
        }
        Intrinsics.m88391r("_call_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final VScroll m184484G() {
        VScroll vScroll = this._content_view;
        if (vScroll != null) {
            return vScroll;
        }
        Intrinsics.m88391r("_content_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final View m184485H() {
        View view = this._mask;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_mask");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final VLinear m184486I() {
        VLinear vLinear = this._navigation_bar;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_navigation_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final VLinear m184487J() {
        VLinear vLinear = this._online_tip_button;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_online_tip_button");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final VText m184488K() {
        VText vText = this._quick_text_count;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_quick_text_count");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final FrameLayout m184489L() {
        FrameLayout frameLayout = this._rootView;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_rootView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final VRelative m184490M() {
        VRelative vRelative = this._single_layout;
        if (vRelative != null) {
            return vRelative;
        }
        Intrinsics.m88391r("_single_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final VText m184491N() {
        VText vText = this._single_layout_desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_single_layout_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final VImage m184492O() {
        VImage vImage = this._single_layout_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_single_layout_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final VText m184493P() {
        VText vText = this._sub_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_sub_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final SVGAnimationView m184494Q() {
        SVGAnimationView sVGAnimationView = this._svga_bg;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m88391r("_svga_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final VFrame m184495R() {
        VFrame vFrame = this._text_chat_view;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m88391r("_text_chat_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final SVGAnimationView m184496S() {
        SVGAnimationView sVGAnimationView = this._text_chat_view_svg_anim;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m88391r("_text_chat_view_svg_anim");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final QuickChatLoftChatItem m184497T() {
        QuickChatLoftChatItem quickChatLoftChatItem = this._text_chat_view_view1;
        if (quickChatLoftChatItem != null) {
            return quickChatLoftChatItem;
        }
        Intrinsics.m88391r("_text_chat_view_view1");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final QuickChatLoftChatItem m184498U() {
        QuickChatLoftChatItem quickChatLoftChatItem = this._text_chat_view_view2;
        if (quickChatLoftChatItem != null) {
            return quickChatLoftChatItem;
        }
        Intrinsics.m88391r("_text_chat_view_view2");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final VImage m184499V() {
        VImage vImage = this._text_chat_view_wave;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_text_chat_view_wave");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final VText m184500W() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final VLinear m184501X() {
        VLinear vLinear = this._top_content;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_top_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final VImage m184502Y() {
        VImage vImage = this._top_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_top_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final VText m184503Z() {
        VText vText = this._top_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_top_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final VLinear m184504a0() {
        VLinear vLinear = this._total_layout;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_total_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final QuickChatPageItem m184505b0() {
        QuickChatPageItem quickChatPageItem = this._total_layout_vedio_call_content;
        if (quickChatPageItem != null) {
            return quickChatPageItem;
        }
        Intrinsics.m88391r("_total_layout_vedio_call_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final QuickChatPageItem m184506c0() {
        QuickChatPageItem quickChatPageItem = this._total_layout_voice_call_content;
        if (quickChatPageItem != null) {
            return quickChatPageItem;
        }
        Intrinsics.m88391r("_total_layout_voice_call_content");
        return null;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m184507d0() {
        i4g0.m138526x("e_quickchat_button", this.act.pageId());
        VText vTextM184488K = m184488K();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        vTextM184488K.setText(String.format("%s人实时在线", Arrays.copyOf(new Object[]{Integer.valueOf(Random.INSTANCE.nextInt(2000, 10000))}, 1)));
        bnl0.m105509E0(m184487J(), new View.OnClickListener() { // from class: l.m4c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s4c0.m184477u(this.f134782a, view);
            }
        });
    }

    @Override // p153l.iam
    public void destroy() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("https://fe-static.tancdn.com/v1/raw/0893691e-17ee-41df-aa71-5aa971234e1914.svga");
        arrayList.add("https://fe-static.tancdn.com/v1/raw/ce5cb9c2-8213-49a3-a973-5bcbf53408c614.svga");
        arrayList.add("https://fe-static.tancdn.com/v1/raw/689b960b-7560-4a29-a8ae-66e7cc4d1af814.svga");
        arrayList.add("https://fe-static.tancdn.com/v1/raw/794f2428-840d-4d21-923f-d0d5eb87efed14.svga");
        SVGALoader.releaseCache(arrayList);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: e0 */
    public final void m184508e0() {
        m184484G().setVerticalScrollBarEnabled(false);
        m184484G().setOnTouchListener(new View.OnTouchListener() { // from class: l.k4c0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return s4c0.m184473q(this.f123880a, view, motionEvent);
            }
        });
    }

    @NotNull
    public Animator enterAnimation() {
        View viewM184485H = m184485H();
        Property property = View.ALPHA;
        r3c0 r3c0Var = r3c0.INSTANCE;
        Animator animatorM132166l = gt0.m132166l(viewM184485H, property, r3c0Var.m179598j(), r3c0Var.m179597i(), new AccelerateDecelerateInterpolator(), 1.0f, 0.0f);
        Animator animatorM132166l2 = gt0.m132166l(m184495R(), property, r3c0Var.m179598j(), r3c0Var.m179597i(), new AccelerateDecelerateInterpolator(), 0.0f, 1.0f);
        Animator animatorM132166l3 = gt0.m132166l(m184502Y(), gt0.f106354i, r3c0Var.m179598j(), r3c0Var.m179597i(), new AccelerateDecelerateInterpolator(), 0.0f, 1.0f);
        VText vTextM184503Z = m184503Z();
        Property property2 = View.TRANSLATION_Y;
        Animator animatorM132180z = gt0.m132180z(animatorM132166l, animatorM132166l2, animatorM132166l3, gt0.m132166l(vTextM184503Z, property2, r3c0Var.m179598j(), r3c0Var.m179597i(), new AccelerateDecelerateInterpolator(), qa00.f156322i, 0.0f), gt0.m132166l(m184493P(), property2, r3c0Var.m179598j(), r3c0Var.m179597i(), new AccelerateDecelerateInterpolator(), qa00.f156328o, 0.0f), gt0.m132166l(m184495R(), property2, r3c0Var.m179598j(), r3c0Var.m179597i(), new AccelerateDecelerateInterpolator(), qa00.f156333t, 0.0f), gt0.m132166l(m184487J(), property2, r3c0Var.m179598j(), r3c0Var.m179597i(), new AccelerateDecelerateInterpolator(), qa00.f156289B, 0.0f), gt0.m132166l(m184483F(), property2, r3c0Var.m179598j(), r3c0Var.m179597i(), new AccelerateDecelerateInterpolator(), qa00.f156296I, 0.0f));
        animatorM132180z.getClass();
        return animatorM132180z;
    }

    @NotNull
    public Animator exitAnimation() {
        VFrame vFrameM184495R = m184495R();
        Property property = View.ALPHA;
        r3c0 r3c0Var = r3c0.INSTANCE;
        Animator animatorM132180z = gt0.m132180z(gt0.m132166l(vFrameM184495R, property, r3c0Var.m179598j(), r3c0Var.m179597i(), new AccelerateDecelerateInterpolator(), 1.0f, 0.0f), gt0.m132166l(m184485H(), property, 0L, r3c0Var.m179597i(), new AccelerateDecelerateInterpolator(), 0.0f, 1.0f), gt0.m132166l(m184502Y(), gt0.f106354i, 0L, r3c0Var.m179597i(), new AccelerateDecelerateInterpolator(), 1.0f, 0.0f));
        animatorM132180z.getClass();
        return animatorM132180z;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m184509f0() {
        int iM105592y0 = bnl0.m105592y0();
        if (iM105592y0 > 0) {
            bnl0.m105505C0(m184494Q(), (int) (iM105592y0 * 1.17f));
            int iMin = Math.min(qa00.m175859d(375.0f), iM105592y0);
            ViewGroup.LayoutParams layoutParams = m184496S().getLayoutParams();
            layoutParams.getClass();
            layoutParams.height = iMin;
            layoutParams.width = iMin;
            m184496S().setLayoutParams(layoutParams);
            ViewGroup.LayoutParams layoutParams2 = m184499V().getLayoutParams();
            layoutParams2.getClass();
            layoutParams2.width = iMin;
            m184499V().setLayoutParams(layoutParams2);
        }
        SVGALoader.with(this.act).autoPlay(false).repeatCount(-1).from("https://fe-static.tancdn.com/v1/raw/1ecec93e-84b2-4731-a927-90928bb72cb114.svga").into(m184496S());
        SVGALoader.with(this.act).autoPlay(true).repeatCount(1).from("https://fe-static.tancdn.com/v1/raw/a0ef67b0-beed-4cfc-b970-3b321ea7b78f14.svga").into(m184494Q());
        ArrayList arrayList = new ArrayList();
        arrayList.add("https://fe-static.tancdn.com/v1/raw/0893691e-17ee-41df-aa71-5aa971234e1914.svga");
        arrayList.add("https://fe-static.tancdn.com/v1/raw/ce5cb9c2-8213-49a3-a973-5bcbf53408c614.svga");
        arrayList.add("https://fe-static.tancdn.com/v1/raw/689b960b-7560-4a29-a8ae-66e7cc4d1af814.svga");
        arrayList.add("https://fe-static.tancdn.com/v1/raw/794f2428-840d-4d21-923f-d0d5eb87efed14.svga");
        SVGALoader.with(this.act).batchDownload(arrayList);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m184510h0() {
        bnl0.m105524M(m184490M(), true);
        i4g0.m138526x("e_voicechat_button", this.act.pageId());
        VText vTextM184491N = m184491N();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        vTextM184491N.setText(String.format("%s人在线", Arrays.copyOf(new Object[]{Integer.valueOf(Random.INSTANCE.nextInt(2000, 10000))}, 1)));
        m184492O().setImageResource(c17.m107528u0() ? dbc0.f87490uo : dbc0.f87457to);
        bnl0.m105509E0(m184490M(), new View.OnClickListener() { // from class: l.c4c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s4c0.m184460f(this.f79689a, view);
            }
        });
        bnl0.m105524M(m184504a0(), false);
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        m184519v(inflater, parent);
        m184475r();
        return m184489L();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m184511j0(@NotNull Bundle savedInstanceState) {
        savedInstanceState.getClass();
        bnl0.m105525M0(m184502Y(), true);
        bnl0.m105525M0(m184503Z(), true);
        bnl0.m105525M0(m184493P(), true);
        bnl0.m105525M0(m184495R(), true);
        bnl0.m105525M0(m184487J(), true);
        bnl0.m105525M0(m184483F(), true);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m184512k0() {
        this.moveYIntercept = m184484G().getChildAt(0).getHeight() - m184484G().getHeight() < 0;
        if (this.animationState == 1 || this.animationDown.isRunning() || this.moveYIntercept) {
            return;
        }
        int scrollY = m184484G().getScrollY();
        if (this.animationUp.isRunning()) {
            this.animationUp.end();
            this.alphaAnimation.end();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(scrollY, 0);
        valueAnimatorOfInt.setDuration(r3c0.INSTANCE.m179597i());
        valueAnimatorOfInt.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.r4c0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                s4c0.m184467l0(this.f161189a, valueAnimator);
            }
        });
        valueAnimatorOfInt.addListener(new C19980b());
        m184521w0();
        valueAnimatorOfInt.start();
        this.animationDown = valueAnimatorOfInt;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m184513m0() {
        this.moveYIntercept = m184484G().getChildAt(0).getHeight() - m184484G().getHeight() < 0;
        if (this.animationState == 2 || this.animationUp.isRunning() || this.moveYIntercept) {
            return;
        }
        int scrollY = m184484G().getScrollY();
        if (this.animationDown.isRunning()) {
            this.animationDown.end();
            this.alphaAnimation.end();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(scrollY, m184484G().getChildAt(0).getHeight() - m184484G().getHeight());
        valueAnimatorOfInt.setDuration(r3c0.INSTANCE.m179597i());
        valueAnimatorOfInt.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.n4c0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                s4c0.m184470n0(this.f140220a, valueAnimator);
            }
        });
        valueAnimatorOfInt.addListener(new C19981c());
        m184520v0();
        valueAnimatorOfInt.start();
        this.animationUp = valueAnimatorOfInt;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m184514o0(@NotNull i1c0 cardData) {
        cardData.getClass();
        if (!m184496S().isAnimating()) {
            m184496S().startAnimation();
        }
        if (m184480B(cardData)) {
            return;
        }
        this.currentCardData = cardData;
        if (bnl0.m105529O0(m184497T())) {
            m184498U().m55704q(cardData, new y20() { // from class: l.f4c0
                @Override // p153l.y20
                public final void call(Object obj) {
                    s4c0.m184472p0(this.f97094a, (i1c0) obj);
                }
            });
            m184497T().m55707t();
        } else {
            m184497T().m55704q(cardData, new y20() { // from class: l.g4c0
                @Override // p153l.y20
                public final void call(Object obj) {
                    s4c0.m184474q0(this.f102167a, (i1c0) obj);
                }
            });
            m184498U().m55707t();
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m184515r0(@NotNull VideoChatSecondFloorSummary videoChatSecondFloorSummary) {
        videoChatSecondFloorSummary.getClass();
        bnl0.m105524M(m184490M(), false);
        bnl0.m105524M(m184504a0(), true);
        i4g0.m138526x("e_videochat_button", this.act.pageId());
        m184506c0().m55716i(this.act, "voice");
        m184505b0().setVideoData(videoChatSecondFloorSummary);
        m184505b0().m55716i(this.act, "video");
    }

    /* JADX INFO: renamed from: s0 */
    public final void m184516s0(String eid) {
        i4g0.m138520r(eid, this.act.pageId());
    }

    /* JADX INFO: renamed from: t0 */
    public final void m184517t0() {
        String stringExtra = this.act.getIntent().getStringExtra("action");
        if (TextUtils.equals(stringExtra, "videoTips") || TextUtils.equals(stringExtra, "normal")) {
            bnl0.m105525M0(m184502Y(), false);
            bnl0.m105525M0(m184503Z(), false);
            bnl0.m105525M0(m184493P(), false);
            bnl0.m105525M0(m184495R(), false);
            bnl0.m105525M0(m184487J(), false);
            bnl0.m105525M0(m184483F(), false);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m184518u0() {
        if (bnl0.m105529O0(m184497T())) {
            m184498U().m55705r();
            m184497T().m55707t();
        } else {
            m184497T().m55705r();
            m184498U().m55707t();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final View m184519v(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM189251b = t4c0.m189251b(this, inflater, parent);
        viewM189251b.getClass();
        return viewM189251b;
    }

    /* JADX INFO: renamed from: v0 */
    public final void m184520v0() {
        float alpha = m184501X().getAlpha();
        if (this.alphaAnimation.isRunning()) {
            this.alphaAnimation.end();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(alpha, 0.0f);
        this.alphaAnimation = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(r3c0.INSTANCE.m179597i());
        this.alphaAnimation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.h4c0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                s4c0.m184455a(this.f107789a, valueAnimator);
            }
        });
        this.alphaAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        this.alphaAnimation.start();
    }

    /* JADX INFO: renamed from: w0 */
    public final void m184521w0() {
        float alpha = m184501X().getAlpha();
        if (this.alphaAnimation.isRunning()) {
            this.alphaAnimation.end();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(alpha, 1.0f);
        this.alphaAnimation = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(r3c0.INSTANCE.m179597i());
        this.alphaAnimation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.e4c0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                s4c0.m184464j(this.f92088a, valueAnimator);
            }
        });
        this.alphaAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        this.alphaAnimation.start();
    }

    /* JADX INFO: renamed from: x */
    public final void m184522x() {
        bnl0.m105540X(m184486I(), bnl0.m105511F0());
        bnl0.m105540X(m184484G(), qa00.f156338y + bnl0.m105511F0());
        bnl0.m105540X(m184502Y(), qa00.m175859d(68.0f) - bnl0.m105511F0());
    }

    /* JADX INFO: renamed from: x0 */
    public final void m184523x0(@NotNull String from) {
        from.getClass();
        r3c0.INSTANCE.m179595f(this.act, from, new y20() { // from class: l.d4c0
            @Override // p153l.y20
            public final void call(Object obj) {
                s4c0.m184471p(this.f85028a, (Boolean) obj);
            }
        });
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull a4c0 presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: y0 */
    public final void m184525y0(final i1c0 data, String from) {
        r3c0.INSTANCE.m179595f(this.act, from, new y20() { // from class: l.i4c0
            @Override // p153l.y20
            public final void call(Object obj) {
                s4c0.m184456b(this.f112886a, data, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public final void m184526z() {
        if (r3c0.m179588h(this.act, new x20() { // from class: l.o4c0
            @Override // p153l.x20
            public final void call() {
                s4c0.m184476s(this.f144956a);
            }
        })) {
            r3c0.INSTANCE.m179596g(this.act, "p_quickchat,voicechat_button", new y20() { // from class: l.p4c0
                @Override // p153l.y20
                public final void call(Object obj) {
                    s4c0.m184468m(this.f150528a, (Boolean) obj);
                }
            });
        }
    }
}
