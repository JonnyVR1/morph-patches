package p149l;

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
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.QuickChatCardInfo;
import com.p046p1.mobile.putong.core.data.QuickChatType;
import com.p046p1.mobile.putong.core.data.VideoChatSecondFloorSummary;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchManager;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.newquickchat.secondfloor.QuickChatLoftAct;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.newquickchat.secondfloor.item.QuickChatLoftChatItem;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.newquickchat.secondfloor.item.QuickChatPageItem;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VScroll;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\nJ\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\nJ\u000f\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\nJ\u000f\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\nJ\u000f\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\nJ\u000f\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\nJ\u000f\u0010\u001c\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\nJ\u000f\u0010\u001d\u001a\u00020\bH\u0003¢\u0006\u0004\b\u001d\u0010\nJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u0002H\u0016¢\u0006\u0004\b)\u0010*J!\u0010+\u001a\u00020%2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b+\u0010'J\r\u0010,\u001a\u00020\b¢\u0006\u0004\b,\u0010\nJ\u0015\u0010-\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b/\u0010 J\r\u00100\u001a\u00020\b¢\u0006\u0004\b0\u0010\nJ\u0015\u00103\u001a\u00020\b2\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\b¢\u0006\u0004\b5\u0010\nJ\r\u00106\u001a\u00020\b¢\u0006\u0004\b6\u0010\nJ\r\u00108\u001a\u000207¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u000207H\u0016¢\u0006\u0004\b:\u00109J\u000f\u0010;\u001a\u000207H\u0016¢\u0006\u0004\b;\u00109J\u000f\u0010<\u001a\u00020\bH\u0016¢\u0006\u0004\b<\u0010\nJ\u000f\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?J\u0015\u0010B\u001a\u00020\b2\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bB\u0010CJ\u0015\u0010E\u001a\u00020\b2\u0006\u0010D\u001a\u00020\u000e¢\u0006\u0004\bE\u0010FR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010`\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010h\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010l\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010S\u001a\u0004\bj\u0010U\"\u0004\bk\u0010WR\"\u0010t\u001a\u00020m8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\"\u0010|\u001a\u00020u8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R#\u0010\u0080\u0001\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b}\u0010c\u001a\u0004\b~\u0010e\"\u0004\b\u007f\u0010gR*\u0010\u0088\u0001\u001a\u00030\u0081\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R&\u0010\u008c\u0001\u001a\u00020m8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0089\u0001\u0010o\u001a\u0005\b\u008a\u0001\u0010q\"\u0005\b\u008b\u0001\u0010sR&\u0010\u0090\u0001\u001a\u00020m8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008d\u0001\u0010o\u001a\u0005\b\u008e\u0001\u0010q\"\u0005\b\u008f\u0001\u0010sR*\u0010\u0098\u0001\u001a\u00030\u0091\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R&\u0010\u009c\u0001\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0099\u0001\u0010[\u001a\u0005\b\u009a\u0001\u0010]\"\u0005\b\u009b\u0001\u0010_R*\u0010 \u0001\u001a\u00030\u0081\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009d\u0001\u0010\u0083\u0001\u001a\u0006\b\u009e\u0001\u0010\u0085\u0001\"\u0006\b\u009f\u0001\u0010\u0087\u0001R*\u0010¨\u0001\u001a\u00030¡\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R*\u0010¬\u0001\u001a\u00030¡\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b©\u0001\u0010£\u0001\u001a\u0006\bª\u0001\u0010¥\u0001\"\u0006\b«\u0001\u0010§\u0001R%\u0010¯\u0001\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\t\u0010c\u001a\u0005\b\u00ad\u0001\u0010e\"\u0005\b®\u0001\u0010gR&\u0010³\u0001\u001a\u00020m8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b°\u0001\u0010o\u001a\u0005\b±\u0001\u0010q\"\u0005\b²\u0001\u0010sR&\u0010·\u0001\u001a\u00020m8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b´\u0001\u0010o\u001a\u0005\bµ\u0001\u0010q\"\u0005\b¶\u0001\u0010sR*\u0010¿\u0001\u001a\u00030¸\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001\"\u0006\b½\u0001\u0010¾\u0001R%\u0010Â\u0001\u001a\u00020m8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b&\u0010o\u001a\u0005\bÀ\u0001\u0010q\"\u0005\bÁ\u0001\u0010sR&\u0010Æ\u0001\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÃ\u0001\u0010c\u001a\u0005\bÄ\u0001\u0010e\"\u0005\bÅ\u0001\u0010gR)\u0010Í\u0001\u001a\u00030Ç\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u001b\u0010È\u0001\u001a\u0006\bÉ\u0001\u0010Ê\u0001\"\u0006\bË\u0001\u0010Ì\u0001R)\u0010Ð\u0001\u001a\u00030Ç\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b)\u0010È\u0001\u001a\u0006\bÎ\u0001\u0010Ê\u0001\"\u0006\bÏ\u0001\u0010Ì\u0001R)\u0010Ó\u0001\u001a\u00030¸\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b0\u0010º\u0001\u001a\u0006\bÑ\u0001\u0010¼\u0001\"\u0006\bÒ\u0001\u0010¾\u0001R%\u0010Ö\u0001\u001a\u00020m8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\bE\u0010o\u001a\u0005\bÔ\u0001\u0010q\"\u0005\bÕ\u0001\u0010sR)\u0010Ù\u0001\u001a\u00030\u0081\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u000f\u0010\u0083\u0001\u001a\u0006\b×\u0001\u0010\u0085\u0001\"\u0006\bØ\u0001\u0010\u0087\u0001R(\u0010ß\u0001\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b8\u0010Ú\u0001\u001a\u0006\bÛ\u0001\u0010Ü\u0001\"\u0006\bÝ\u0001\u0010Þ\u0001R\u0018\u0010(\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bà\u0001\u0010á\u0001R\u0019\u0010ã\u0001\u001a\u00030â\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bj\u0010»\u0001R\u0019\u0010å\u0001\u001a\u00030ä\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b»\u0001\u0010dR\u0019\u0010è\u0001\u001a\u00030æ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bx\u0010ç\u0001R\u001a\u0010é\u0001\u001a\u00030æ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0001\u0010ç\u0001R#\u0010ë\u0001\u001a\r ê\u0001*\u0005\u0018\u00010æ\u00010æ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bd\u0010ç\u0001R\u0019\u0010ì\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010\u008a\u0001R\u001b\u0010î\u0001\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010í\u0001R%\u0010ñ\u0001\u001a\u000f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0ï\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bL\u0010ð\u0001¨\u0006ò\u0001"}, m87232d2 = {"Ll/owb0;", "Ll/s7m;", "Ll/wvb0;", "", "Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/QuickChatLoftAct;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/QuickChatLoftAct;)V", "", "r", "()V", "f0", "Ll/etb0;", "cardData", "", "B", "(Ll/etb0;)Z", "d0", "data", "", "from", "y0", "(Ll/etb0;Ljava/lang/String;)V", "h0", "k0", "w0", "v0", BaseSei.f13930X, "g0", "e0", "eid", "s0", "(Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", ResourceDirection.f38808v, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", BaseSei.f13931Y, "(Ll/wvb0;)V", "inflateView", "u0", "o0", "(Ll/etb0;)V", "x0", BaseSei.f13932Z, "Lcom/p1/mobile/putong/core/data/VideoChatSecondFloorSummary;", "videoChatSecondFloorSummary", "r0", "(Lcom/p1/mobile/putong/core/data/VideoChatSecondFloorSummary;)V", "m0", "t0", "Landroid/animation/Animator;", b2s.C_ZONE, "()Landroid/animation/Animator;", "enterAnimation", "exitAnimation", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Landroid/os/Bundle;", "savedInstanceState", "j0", "(Landroid/os/Bundle;)V", "able", "A", "(Z)V", "a", "Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/QuickChatLoftAct;", "Landroid/widget/FrameLayout;", "b", "Landroid/widget/FrameLayout;", "L", "()Landroid/widget/FrameLayout;", "set_rootView", "(Landroid/widget/FrameLayout;)V", "_rootView", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "get_background", "()Landroid/widget/ImageView;", "set_background", "(Landroid/widget/ImageView;)V", "_background", "Lcom/tantan/library/svga/SVGAnimationView;", Constants.INAPP_DATA_TAG, "Lcom/tantan/library/svga/SVGAnimationView;", "Q", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_svga_bg", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_svga_bg", "Lv/VLinear;", "e", "Lv/VLinear;", "I", "()Lv/VLinear;", "set_navigation_bar", "(Lv/VLinear;)V", "_navigation_bar", "f", "E", "set_back_btn", "_back_btn", "Lv/VText;", "g", "Lv/VText;", "W", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "Lv/VScroll;", "h", "Lv/VScroll;", "G", "()Lv/VScroll;", "set_content_view", "(Lv/VScroll;)V", "_content_view", RXScreenCaptureService.KEY_INDEX, "X", "set_top_content", "_top_content", "Lv/VImage;", "j", "Lv/VImage;", "Y", "()Lv/VImage;", "set_top_icon", "(Lv/VImage;)V", "_top_icon", "k", "Z", "set_top_title", "_top_title", BLiveStormDanmakuGiftResourceType.f44444l, "P", "set_sub_title", "_sub_title", "Lv/VFrame;", "m", "Lv/VFrame;", "R", "()Lv/VFrame;", "set_text_chat_view", "(Lv/VFrame;)V", "_text_chat_view", "n", j6f.LATITUDE_SOUTH, "set_text_chat_view_svg_anim", "_text_chat_view_svg_anim", "o", j6f.GPS_MEASUREMENT_INTERRUPTED, "set_text_chat_view_wave", "_text_chat_view_wave", "Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/item/QuickChatLoftChatItem;", "p", "Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/item/QuickChatLoftChatItem;", j6f.GPS_DIRECTION_TRUE, "()Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/item/QuickChatLoftChatItem;", "set_text_chat_view_view1", "(Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/item/QuickChatLoftChatItem;)V", "_text_chat_view_view1", "q", "U", "set_text_chat_view_view2", "_text_chat_view_view2", "J", "set_online_tip_button", "_online_tip_button", BLiveStormDanmakuGiftResourceType.f44446s, "get_quick_text", "set_quick_text", "_quick_text", Constants.KEY_T, "K", "set_quick_text_count", "_quick_text_count", "Lv/VRelative;", "u", "Lv/VRelative;", "F", "()Lv/VRelative;", "set_call_content", "(Lv/VRelative;)V", "_call_content", "get_bottom_content_title", "set_bottom_content_title", "_bottom_content_title", "w", "a0", "set_total_layout", "_total_layout", "Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/item/QuickChatPageItem;", "Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/item/QuickChatPageItem;", "c0", "()Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/item/QuickChatPageItem;", "set_total_layout_voice_call_content", "(Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/item/QuickChatPageItem;)V", "_total_layout_voice_call_content", "b0", "set_total_layout_vedio_call_content", "_total_layout_vedio_call_content", "M", "set_single_layout", "_single_layout", "N", "set_single_layout_desc", "_single_layout_desc", BloodType.f38728O, "set_single_layout_icon", "_single_layout_icon", "Landroid/view/View;", "H", "()Landroid/view/View;", "set_mask", "(Landroid/view/View;)V", "_mask", "D", "Ll/wvb0;", "", "downY", "", "animationState", "Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator;", "animationUp", "animationDown", "kotlin.jvm.PlatformType", "alphaAnimation", "moveYIntercept", "Ll/etb0;", "currentCardData", "Ll/f30;", "Ll/f30;", "matchImmediatelyAction", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class owb0 implements s7m<wvb0> {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public VText _single_layout_desc;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public VImage _single_layout_icon;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public View _mask;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public wvb0 presenter;

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
    public etb0 currentCardData;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @NotNull
    public f30<etb0, Boolean> matchImmediatelyAction;

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

    /* JADX INFO: renamed from: l.owb0$a */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"l/owb0$a", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "(Landroid/animation/Animator;)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C19060a extends AnimatorListenerAdapter {
        public C19060a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            animation.getClass();
            xdl0.m208345M0(owb0.this.m166362Y(), true);
            xdl0.m208345M0(owb0.this.m166363Z(), true);
            xdl0.m208345M0(owb0.this.m166353P(), true);
            xdl0.m208345M0(owb0.this.m166355R(), true);
            xdl0.m208345M0(owb0.this.m166347J(), true);
            xdl0.m208345M0(owb0.this.m166343F(), true);
        }
    }

    /* JADX INFO: renamed from: l.owb0$b */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, m87232d2 = {"l/owb0$b", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationRepeat", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C19061b implements Animator.AnimatorListener {
        public C19061b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            animation.getClass();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            owb0.this.animationState = 1;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            animation.getClass();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            animation.getClass();
            owb0.this.animationState = 0;
        }
    }

    /* JADX INFO: renamed from: l.owb0$c */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, m87232d2 = {"l/owb0$c", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationRepeat", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C19062c implements Animator.AnimatorListener {
        public C19062c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            animation.getClass();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            owb0.this.animationState = 2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            animation.getClass();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            animation.getClass();
            owb0.this.animationState = 0;
        }
    }

    public owb0(@NotNull QuickChatLoftAct quickChatLoftAct) {
        quickChatLoftAct.getClass();
        this.act = quickChatLoftAct;
        this.animationState = 1;
        this.animationUp = new ValueAnimator();
        this.animationDown = new ValueAnimator();
        this.alphaAnimation = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.matchImmediatelyAction = new f30() { // from class: l.fwb0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                owb0.m166326l(this.f99637a, (etb0) obj, ((Boolean) obj2).booleanValue());
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static void m166315a(owb0 owb0Var, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        SVGAnimationView sVGAnimationViewM166354Q = owb0Var.m166354Q();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        sVGAnimationViewM166354Q.setAlpha((((Float) animatedValue).floatValue() * 0.9f) + 0.1f);
        VLinear vLinearM166361X = owb0Var.m166361X();
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        animatedValue2.getClass();
        vLinearM166361X.setAlpha(((Float) animatedValue2).floatValue());
    }

    /* JADX INFO: renamed from: b */
    public static void m166316b(owb0 owb0Var, etb0 etb0Var, Boolean bool) {
        if (ke50.m145714a() && OnlineMatchManager.m50143z().m50181m0()) {
            ak50.INSTANCE.m97144a().m97136H(owb0Var.act, "overheat_protection");
        } else {
            owb0Var.matchImmediatelyAction.call(etb0Var, bool);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m166319e(owb0 owb0Var, View view) {
        owb0Var.act.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: f */
    public static void m166320f(owb0 owb0Var, View view) {
        owb0Var.m166376s0("e_voicechat_button");
        if (Network.isConnected(CoreModule.f17544b)) {
            owb0Var.m166386z();
        } else {
            lsi0.m151579i(R$string.f18813p4, true);
        }
    }

    /* JADX INFO: renamed from: g0 */
    private final void m166321g0() {
        xdl0.m208344M(m166346I(), true);
        xdl0.m208329E0(m166342E(), new View.OnClickListener() { // from class: l.hwb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                owb0.m166319e(this.f109749a, view);
            }
        });
        m166360W().setTypeface(Typeface.defaultFromStyle(1));
    }

    /* JADX INFO: renamed from: i0 */
    public static final void m166323i0(owb0 owb0Var, etb0 etb0Var) {
        CoreModule.f17545c.f19570H0.m210361k5();
        wvb0 wvb0Var = owb0Var.presenter;
        if (wvb0Var == null) {
            Intrinsics.m87502r("presenter");
            wvb0Var = null;
        }
        wvb0Var.m205741y0(etb0Var);
    }

    /* JADX INFO: renamed from: j */
    public static void m166324j(owb0 owb0Var, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        SVGAnimationView sVGAnimationViewM166354Q = owb0Var.m166354Q();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        sVGAnimationViewM166354Q.setAlpha((((Float) animatedValue).floatValue() * 0.9f) + 0.1f);
        VLinear vLinearM166361X = owb0Var.m166361X();
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        animatedValue2.getClass();
        vLinearM166361X.setAlpha(((Float) animatedValue2).floatValue());
    }

    /* JADX INFO: renamed from: l */
    public static void m166326l(final owb0 owb0Var, final etb0 etb0Var, boolean z) {
        etb0Var.getClass();
        QuickChatCardInfo quickChatCardInfo = new QuickChatCardInfo();
        quickChatCardInfo.secretKey = etb0Var.getTextCardData().secretKey;
        quickChatCardInfo.userID = etb0Var.getTextCardData().userID;
        quickChatCardInfo.biz = QuickChatType.get(etb0Var.getTextCardData().biz);
        quickChatCardInfo.stage = etb0Var.getTextCardData().stage;
        xzc0.m211972s0(owb0Var.act, quickChatCardInfo, z, true, "", new d30() { // from class: l.mwb0
            @Override // p149l.d30
            public final void call() {
                owb0.m166323i0(this.f136038a, etb0Var);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public static final void m166327l0(owb0 owb0Var, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        VScroll vScrollM166344G = owb0Var.m166344G();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        vScrollM166344G.smoothScrollTo(0, ((Integer) animatedValue).intValue());
    }

    /* JADX INFO: renamed from: m */
    public static void m166328m(owb0 owb0Var, Boolean bool) {
        nvb0.m161582m(owb0Var.act, "voice_quick_chat");
    }

    /* JADX INFO: renamed from: n0 */
    public static final void m166330n0(owb0 owb0Var, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        VScroll vScrollM166344G = owb0Var.m166344G();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        vScrollM166344G.smoothScrollTo(0, ((Integer) animatedValue).intValue());
    }

    /* JADX INFO: renamed from: p */
    public static void m166331p(owb0 owb0Var, Boolean bool) {
        if (ke50.m145714a() && OnlineMatchManager.m50143z().m50181m0()) {
            ak50.INSTANCE.m97144a().m97136H(owb0Var.act, "overheat_protection");
        } else {
            if (nvb0.INSTANCE.m161591r(owb0Var.act)) {
                return;
            }
            nvb0.m161582m(owb0Var.act, "text_quick_chat");
        }
    }

    /* JADX INFO: renamed from: p0 */
    public static final void m166332p0(owb0 owb0Var, etb0 etb0Var) {
        owb0Var.m166376s0("e_quickchat_broadcast");
        if (!Network.isConnected(CoreModule.f17544b)) {
            lsi0.m151579i(R$string.f18813p4, true);
        } else {
            etb0Var.getClass();
            owb0Var.m166385y0(etb0Var, "p_quickchat,quickchat_recommend");
        }
    }

    /* JADX INFO: renamed from: q */
    public static boolean m166333q(owb0 owb0Var, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            owb0Var.downY = motionEvent.getY();
            return false;
        }
        if (action != 2) {
            return false;
        }
        float y = motionEvent.getY() - owb0Var.downY;
        if (Math.abs(y) <= t100.f167266o || owb0Var.moveYIntercept) {
            return true;
        }
        if (y < 0.0f && !owb0Var.animationUp.isRunning()) {
            owb0Var.m166373m0();
            return true;
        }
        if (y <= 0.0f || owb0Var.animationDown.isRunning()) {
            return true;
        }
        owb0Var.m166372k0();
        return true;
    }

    /* JADX INFO: renamed from: q0 */
    public static final void m166334q0(owb0 owb0Var, etb0 etb0Var) {
        owb0Var.m166376s0("e_quickchat_broadcast");
        if (!Network.isConnected(CoreModule.f17544b)) {
            lsi0.m151579i(R$string.f18813p4, true);
        } else {
            etb0Var.getClass();
            owb0Var.m166385y0(etb0Var, "p_quickchat,quickchat_recommend");
        }
    }

    /* JADX INFO: renamed from: r */
    private final void m166335r() {
        m166321g0();
        m166382x();
        m166368e0();
        m166377t0();
        m166367d0();
        m166370h0();
        m166369f0();
        m166378u0();
    }

    /* JADX INFO: renamed from: s */
    public static void m166336s(owb0 owb0Var) {
        owb0Var.m166386z();
    }

    /* JADX INFO: renamed from: u */
    public static void m166337u(owb0 owb0Var, View view) {
        owb0Var.m166376s0("e_quickchat_button");
        if (Network.isConnected(CoreModule.f17544b)) {
            owb0Var.m166383x0("p_quickchat,quickchat_button");
        } else {
            lsi0.m151579i(R$string.f18813p4, true);
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m166339A(boolean able) {
        m166350M().setClickable(able);
        m166347J().setClickable(able);
        m166366c0().m54532h(able);
        m166365b0().m54532h(able);
    }

    /* JADX INFO: renamed from: B */
    public final boolean m166340B(etb0 cardData) {
        if (this.currentCardData == null) {
            return false;
        }
        String str = cardData.getTextCardData().userID;
        etb0 etb0Var = this.currentCardData;
        etb0Var.getClass();
        return TextUtils.equals(str, etb0Var.getTextCardData().userID);
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final Animator m166341C() {
        AnimatorSet animatorSet = new AnimatorSet();
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(m166362Y(), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.0f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.0f, 1.0f), propertyValuesHolderOfFloat);
        objectAnimatorOfPropertyValuesHolder.setDuration(300L);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new DecelerateInterpolator());
        Property property = View.TRANSLATION_Y;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(m166363Z(), PropertyValuesHolder.ofFloat((Property<?, Float>) property, svq.m186103c(10), 0.0f), propertyValuesHolderOfFloat);
        objectAnimatorOfPropertyValuesHolder2.setDuration(300L);
        objectAnimatorOfPropertyValuesHolder2.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator objectAnimatorOfPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(m166353P(), PropertyValuesHolder.ofFloat((Property<?, Float>) property, svq.m186103c(15), 0.0f), propertyValuesHolderOfFloat);
        objectAnimatorOfPropertyValuesHolder3.setDuration(300L);
        objectAnimatorOfPropertyValuesHolder3.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator objectAnimatorOfPropertyValuesHolder4 = ObjectAnimator.ofPropertyValuesHolder(m166355R(), propertyValuesHolderOfFloat);
        objectAnimatorOfPropertyValuesHolder4.setDuration(300L);
        objectAnimatorOfPropertyValuesHolder4.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator objectAnimatorOfPropertyValuesHolder5 = ObjectAnimator.ofPropertyValuesHolder(m166347J(), propertyValuesHolderOfFloat);
        objectAnimatorOfPropertyValuesHolder5.setDuration(300L);
        objectAnimatorOfPropertyValuesHolder5.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator objectAnimatorOfPropertyValuesHolder6 = ObjectAnimator.ofPropertyValuesHolder(m166343F(), propertyValuesHolderOfFloat);
        objectAnimatorOfPropertyValuesHolder6.setDuration(300L);
        objectAnimatorOfPropertyValuesHolder6.setInterpolator(new DecelerateInterpolator());
        animatorSet.playTogether(objectAnimatorOfPropertyValuesHolder, objectAnimatorOfPropertyValuesHolder2, objectAnimatorOfPropertyValuesHolder3, objectAnimatorOfPropertyValuesHolder4, objectAnimatorOfPropertyValuesHolder5, objectAnimatorOfPropertyValuesHolder6);
        animatorSet.addListener(new C19060a());
        return animatorSet;
    }

    @Override // p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final ImageView m166342E() {
        ImageView imageView = this._back_btn;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_back_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final VRelative m166343F() {
        VRelative vRelative = this._call_content;
        if (vRelative != null) {
            return vRelative;
        }
        Intrinsics.m87502r("_call_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final VScroll m166344G() {
        VScroll vScroll = this._content_view;
        if (vScroll != null) {
            return vScroll;
        }
        Intrinsics.m87502r("_content_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final View m166345H() {
        View view = this._mask;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_mask");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final VLinear m166346I() {
        VLinear vLinear = this._navigation_bar;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_navigation_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final VLinear m166347J() {
        VLinear vLinear = this._online_tip_button;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_online_tip_button");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final VText m166348K() {
        VText vText = this._quick_text_count;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_quick_text_count");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final FrameLayout m166349L() {
        FrameLayout frameLayout = this._rootView;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_rootView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final VRelative m166350M() {
        VRelative vRelative = this._single_layout;
        if (vRelative != null) {
            return vRelative;
        }
        Intrinsics.m87502r("_single_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final VText m166351N() {
        VText vText = this._single_layout_desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_single_layout_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final VImage m166352O() {
        VImage vImage = this._single_layout_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_single_layout_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final VText m166353P() {
        VText vText = this._sub_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_sub_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final SVGAnimationView m166354Q() {
        SVGAnimationView sVGAnimationView = this._svga_bg;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m87502r("_svga_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final VFrame m166355R() {
        VFrame vFrame = this._text_chat_view;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m87502r("_text_chat_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final SVGAnimationView m166356S() {
        SVGAnimationView sVGAnimationView = this._text_chat_view_svg_anim;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m87502r("_text_chat_view_svg_anim");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final QuickChatLoftChatItem m166357T() {
        QuickChatLoftChatItem quickChatLoftChatItem = this._text_chat_view_view1;
        if (quickChatLoftChatItem != null) {
            return quickChatLoftChatItem;
        }
        Intrinsics.m87502r("_text_chat_view_view1");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final QuickChatLoftChatItem m166358U() {
        QuickChatLoftChatItem quickChatLoftChatItem = this._text_chat_view_view2;
        if (quickChatLoftChatItem != null) {
            return quickChatLoftChatItem;
        }
        Intrinsics.m87502r("_text_chat_view_view2");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final VImage m166359V() {
        VImage vImage = this._text_chat_view_wave;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_text_chat_view_wave");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final VText m166360W() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final VLinear m166361X() {
        VLinear vLinear = this._top_content;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_top_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final VImage m166362Y() {
        VImage vImage = this._top_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_top_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final VText m166363Z() {
        VText vText = this._top_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_top_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final VLinear m166364a0() {
        VLinear vLinear = this._total_layout;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_total_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final QuickChatPageItem m166365b0() {
        QuickChatPageItem quickChatPageItem = this._total_layout_vedio_call_content;
        if (quickChatPageItem != null) {
            return quickChatPageItem;
        }
        Intrinsics.m87502r("_total_layout_vedio_call_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final QuickChatPageItem m166366c0() {
        QuickChatPageItem quickChatPageItem = this._total_layout_voice_call_content;
        if (quickChatPageItem != null) {
            return quickChatPageItem;
        }
        Intrinsics.m87502r("_total_layout_voice_call_content");
        return null;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m166367d0() {
        zvf0.m220402x("e_quickchat_button", this.act.pageId());
        VText vTextM166348K = m166348K();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        vTextM166348K.setText(String.format("%s人实时在线", Arrays.copyOf(new Object[]{Integer.valueOf(Random.INSTANCE.nextInt(2000, 10000))}, 1)));
        xdl0.m208329E0(m166347J(), new View.OnClickListener() { // from class: l.iwb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                owb0.m166337u(this.f115257a, view);
            }
        });
    }

    @Override // p149l.s7m
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
    public final void m166368e0() {
        m166344G().setVerticalScrollBarEnabled(false);
        m166344G().setOnTouchListener(new View.OnTouchListener() { // from class: l.gwb0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return owb0.m166333q(this.f104692a, view, motionEvent);
            }
        });
    }

    @NotNull
    public Animator enterAnimation() {
        View viewM166345H = m166345H();
        Property property = View.ALPHA;
        nvb0 nvb0Var = nvb0.INSTANCE;
        Animator animatorM103739l = bt0.m103739l(viewM166345H, property, nvb0Var.m161589j(), nvb0Var.m161588i(), new AccelerateDecelerateInterpolator(), 1.0f, 0.0f);
        Animator animatorM103739l2 = bt0.m103739l(m166355R(), property, nvb0Var.m161589j(), nvb0Var.m161588i(), new AccelerateDecelerateInterpolator(), 0.0f, 1.0f);
        Animator animatorM103739l3 = bt0.m103739l(m166362Y(), bt0.f77162i, nvb0Var.m161589j(), nvb0Var.m161588i(), new AccelerateDecelerateInterpolator(), 0.0f, 1.0f);
        VText vTextM166363Z = m166363Z();
        Property property2 = View.TRANSLATION_Y;
        Animator animatorM103753z = bt0.m103753z(animatorM103739l, animatorM103739l2, animatorM103739l3, bt0.m103739l(vTextM166363Z, property2, nvb0Var.m161589j(), nvb0Var.m161588i(), new AccelerateDecelerateInterpolator(), t100.f167260i, 0.0f), bt0.m103739l(m166353P(), property2, nvb0Var.m161589j(), nvb0Var.m161588i(), new AccelerateDecelerateInterpolator(), t100.f167266o, 0.0f), bt0.m103739l(m166355R(), property2, nvb0Var.m161589j(), nvb0Var.m161588i(), new AccelerateDecelerateInterpolator(), t100.f167271t, 0.0f), bt0.m103739l(m166347J(), property2, nvb0Var.m161589j(), nvb0Var.m161588i(), new AccelerateDecelerateInterpolator(), t100.f167227B, 0.0f), bt0.m103739l(m166343F(), property2, nvb0Var.m161589j(), nvb0Var.m161588i(), new AccelerateDecelerateInterpolator(), t100.f167234I, 0.0f));
        animatorM103753z.getClass();
        return animatorM103753z;
    }

    @NotNull
    public Animator exitAnimation() {
        VFrame vFrameM166355R = m166355R();
        Property property = View.ALPHA;
        nvb0 nvb0Var = nvb0.INSTANCE;
        Animator animatorM103753z = bt0.m103753z(bt0.m103739l(vFrameM166355R, property, nvb0Var.m161589j(), nvb0Var.m161588i(), new AccelerateDecelerateInterpolator(), 1.0f, 0.0f), bt0.m103739l(m166345H(), property, 0L, nvb0Var.m161588i(), new AccelerateDecelerateInterpolator(), 0.0f, 1.0f), bt0.m103739l(m166362Y(), bt0.f77162i, 0L, nvb0Var.m161588i(), new AccelerateDecelerateInterpolator(), 1.0f, 0.0f));
        animatorM103753z.getClass();
        return animatorM103753z;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m166369f0() {
        int iM208412y0 = xdl0.m208412y0();
        if (iM208412y0 > 0) {
            xdl0.m208325C0(m166354Q(), (int) (iM208412y0 * 1.17f));
            int iMin = Math.min(t100.m186890d(375.0f), iM208412y0);
            ViewGroup.LayoutParams layoutParams = m166356S().getLayoutParams();
            layoutParams.getClass();
            layoutParams.height = iMin;
            layoutParams.width = iMin;
            m166356S().setLayoutParams(layoutParams);
            ViewGroup.LayoutParams layoutParams2 = m166359V().getLayoutParams();
            layoutParams2.getClass();
            layoutParams2.width = iMin;
            m166359V().setLayoutParams(layoutParams2);
        }
        SVGALoader.with(this.act).autoPlay(false).repeatCount(-1).from("https://fe-static.tancdn.com/v1/raw/1ecec93e-84b2-4731-a927-90928bb72cb114.svga").into(m166356S());
        SVGALoader.with(this.act).autoPlay(true).repeatCount(1).from("https://fe-static.tancdn.com/v1/raw/a0ef67b0-beed-4cfc-b970-3b321ea7b78f14.svga").into(m166354Q());
        ArrayList arrayList = new ArrayList();
        arrayList.add("https://fe-static.tancdn.com/v1/raw/0893691e-17ee-41df-aa71-5aa971234e1914.svga");
        arrayList.add("https://fe-static.tancdn.com/v1/raw/ce5cb9c2-8213-49a3-a973-5bcbf53408c614.svga");
        arrayList.add("https://fe-static.tancdn.com/v1/raw/689b960b-7560-4a29-a8ae-66e7cc4d1af814.svga");
        arrayList.add("https://fe-static.tancdn.com/v1/raw/794f2428-840d-4d21-923f-d0d5eb87efed14.svga");
        SVGALoader.with(this.act).batchDownload(arrayList);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m166370h0() {
        xdl0.m208344M(m166350M(), true);
        zvf0.m220402x("e_voicechat_button", this.act.pageId());
        VText vTextM166351N = m166351N();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        vTextM166351N.setText(String.format("%s人在线", Arrays.copyOf(new Object[]{Integer.valueOf(Random.INSTANCE.nextInt(2000, 10000))}, 1)));
        m166352O().setImageResource(zz6.m221004u0() ? x2c0.f189337Fn : x2c0.f189305En);
        xdl0.m208329E0(m166350M(), new View.OnClickListener() { // from class: l.yvb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                owb0.m166320f(this.f200245a, view);
            }
        });
        xdl0.m208344M(m166364a0(), false);
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        m166379v(inflater, parent);
        m166335r();
        return m166349L();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m166371j0(@NotNull Bundle savedInstanceState) {
        savedInstanceState.getClass();
        xdl0.m208345M0(m166362Y(), true);
        xdl0.m208345M0(m166363Z(), true);
        xdl0.m208345M0(m166353P(), true);
        xdl0.m208345M0(m166355R(), true);
        xdl0.m208345M0(m166347J(), true);
        xdl0.m208345M0(m166343F(), true);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m166372k0() {
        this.moveYIntercept = m166344G().getChildAt(0).getHeight() - m166344G().getHeight() < 0;
        if (this.animationState == 1 || this.animationDown.isRunning() || this.moveYIntercept) {
            return;
        }
        int scrollY = m166344G().getScrollY();
        if (this.animationUp.isRunning()) {
            this.animationUp.end();
            this.alphaAnimation.end();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(scrollY, 0);
        valueAnimatorOfInt.setDuration(nvb0.INSTANCE.m161588i());
        valueAnimatorOfInt.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.nwb0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                owb0.m166327l0(this.f140936a, valueAnimator);
            }
        });
        valueAnimatorOfInt.addListener(new C19061b());
        m166381w0();
        valueAnimatorOfInt.start();
        this.animationDown = valueAnimatorOfInt;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m166373m0() {
        this.moveYIntercept = m166344G().getChildAt(0).getHeight() - m166344G().getHeight() < 0;
        if (this.animationState == 2 || this.animationUp.isRunning() || this.moveYIntercept) {
            return;
        }
        int scrollY = m166344G().getScrollY();
        if (this.animationDown.isRunning()) {
            this.animationDown.end();
            this.alphaAnimation.end();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(scrollY, m166344G().getChildAt(0).getHeight() - m166344G().getHeight());
        valueAnimatorOfInt.setDuration(nvb0.INSTANCE.m161588i());
        valueAnimatorOfInt.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.jwb0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                owb0.m166330n0(this.f120073a, valueAnimator);
            }
        });
        valueAnimatorOfInt.addListener(new C19062c());
        m166380v0();
        valueAnimatorOfInt.start();
        this.animationUp = valueAnimatorOfInt;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m166374o0(@NotNull etb0 cardData) {
        cardData.getClass();
        if (!m166356S().isAnimating()) {
            m166356S().startAnimation();
        }
        if (m166340B(cardData)) {
            return;
        }
        this.currentCardData = cardData;
        if (xdl0.m208349O0(m166357T())) {
            m166358U().m54521q(cardData, new e30() { // from class: l.bwb0
                @Override // p149l.e30
                public final void call(Object obj) {
                    owb0.m166332p0(this.f77605a, (etb0) obj);
                }
            });
            m166357T().m54524t();
        } else {
            m166357T().m54521q(cardData, new e30() { // from class: l.cwb0
                @Override // p149l.e30
                public final void call(Object obj) {
                    owb0.m166334q0(this.f82774a, (etb0) obj);
                }
            });
            m166358U().m54524t();
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m166375r0(@NotNull VideoChatSecondFloorSummary videoChatSecondFloorSummary) {
        videoChatSecondFloorSummary.getClass();
        xdl0.m208344M(m166350M(), false);
        xdl0.m208344M(m166364a0(), true);
        zvf0.m220402x("e_videochat_button", this.act.pageId());
        m166366c0().m54533i(this.act, "voice");
        m166365b0().setVideoData(videoChatSecondFloorSummary);
        m166365b0().m54533i(this.act, "video");
    }

    /* JADX INFO: renamed from: s0 */
    public final void m166376s0(String eid) {
        zvf0.m220396r(eid, this.act.pageId());
    }

    /* JADX INFO: renamed from: t0 */
    public final void m166377t0() {
        String stringExtra = this.act.getIntent().getStringExtra("action");
        if (TextUtils.equals(stringExtra, "videoTips") || TextUtils.equals(stringExtra, "normal")) {
            xdl0.m208345M0(m166362Y(), false);
            xdl0.m208345M0(m166363Z(), false);
            xdl0.m208345M0(m166353P(), false);
            xdl0.m208345M0(m166355R(), false);
            xdl0.m208345M0(m166347J(), false);
            xdl0.m208345M0(m166343F(), false);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m166378u0() {
        if (xdl0.m208349O0(m166357T())) {
            m166358U().m54522r();
            m166357T().m54524t();
        } else {
            m166357T().m54522r();
            m166358U().m54524t();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final View m166379v(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM171710b = pwb0.m171710b(this, inflater, parent);
        viewM171710b.getClass();
        return viewM171710b;
    }

    /* JADX INFO: renamed from: v0 */
    public final void m166380v0() {
        float alpha = m166361X().getAlpha();
        if (this.alphaAnimation.isRunning()) {
            this.alphaAnimation.end();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(alpha, 0.0f);
        this.alphaAnimation = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(nvb0.INSTANCE.m161588i());
        this.alphaAnimation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.dwb0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                owb0.m166315a(this.f88161a, valueAnimator);
            }
        });
        this.alphaAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        this.alphaAnimation.start();
    }

    /* JADX INFO: renamed from: w0 */
    public final void m166381w0() {
        float alpha = m166361X().getAlpha();
        if (this.alphaAnimation.isRunning()) {
            this.alphaAnimation.end();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(alpha, 1.0f);
        this.alphaAnimation = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(nvb0.INSTANCE.m161588i());
        this.alphaAnimation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.awb0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                owb0.m166324j(this.f72028a, valueAnimator);
            }
        });
        this.alphaAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        this.alphaAnimation.start();
    }

    /* JADX INFO: renamed from: x */
    public final void m166382x() {
        xdl0.m208360X(m166346I(), xdl0.m208331F0());
        xdl0.m208360X(m166344G(), t100.f167276y + xdl0.m208331F0());
        xdl0.m208360X(m166362Y(), t100.m186890d(68.0f) - xdl0.m208331F0());
    }

    /* JADX INFO: renamed from: x0 */
    public final void m166383x0(@NotNull String from) {
        from.getClass();
        nvb0.INSTANCE.m161586f(this.act, from, new e30() { // from class: l.zvb0
            @Override // p149l.e30
            public final void call(Object obj) {
                owb0.m166331p(this.f204991a, (Boolean) obj);
            }
        });
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@NotNull wvb0 presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: y0 */
    public final void m166385y0(final etb0 data, String from) {
        nvb0.INSTANCE.m161586f(this.act, from, new e30() { // from class: l.ewb0
            @Override // p149l.e30
            public final void call(Object obj) {
                owb0.m166316b(this.f93483a, data, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public final void m166386z() {
        if (nvb0.m161579h(this.act, new d30() { // from class: l.kwb0
            @Override // p149l.d30
            public final void call() {
                owb0.m166336s(this.f124967a);
            }
        })) {
            nvb0.INSTANCE.m161587g(this.act, "p_quickchat,voicechat_button", new e30() { // from class: l.lwb0
                @Override // p149l.e30
                public final void call(Object obj) {
                    owb0.m166328m(this.f130258a, (Boolean) obj);
                }
            });
        }
    }
}
