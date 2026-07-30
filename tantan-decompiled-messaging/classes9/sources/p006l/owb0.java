package p006l;

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
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.quickaudio.newquickchat.secondfloor.QuickChatLoftAct;
import com.p000p1.mobile.putong.core.p004ui.quickaudio.newquickchat.secondfloor.item.QuickChatLoftChatItem;
import com.p000p1.mobile.putong.core.p004ui.quickaudio.newquickchat.secondfloor.item.QuickChatPageItem;
import com.p1.mobile.putong.core.data.QuickChatCardInfo;
import com.p1.mobile.putong.core.data.QuickChatType;
import com.p1.mobile.putong.core.data.VideoChatSecondFloorSummary;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchManager;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.random.Random;
import l.ak50;
import l.bt0;
import l.d30;
import l.e30;
import l.f30;
import l.lsi0;
import l.pwb0;
import l.s7m;
import l.svq;
import l.t100;
import l.xdl0;
import l.zvf0;
import l.zz6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VRelative;
import v.VScroll;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\nJ\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\nJ\u000f\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\nJ\u000f\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\nJ\u000f\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\nJ\u000f\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\nJ\u000f\u0010\u001c\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\nJ\u000f\u0010\u001d\u001a\u00020\bH\u0003¢\u0006\u0004\b\u001d\u0010\nJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u0002H\u0016¢\u0006\u0004\b)\u0010*J!\u0010+\u001a\u00020%2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b+\u0010'J\r\u0010,\u001a\u00020\b¢\u0006\u0004\b,\u0010\nJ\u0015\u0010-\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b/\u0010 J\r\u00100\u001a\u00020\b¢\u0006\u0004\b0\u0010\nJ\u0015\u00103\u001a\u00020\b2\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\b¢\u0006\u0004\b5\u0010\nJ\r\u00106\u001a\u00020\b¢\u0006\u0004\b6\u0010\nJ\r\u00108\u001a\u000207¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u000207H\u0016¢\u0006\u0004\b:\u00109J\u000f\u0010;\u001a\u000207H\u0016¢\u0006\u0004\b;\u00109J\u000f\u0010<\u001a\u00020\bH\u0016¢\u0006\u0004\b<\u0010\nJ\u000f\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?J\u0015\u0010B\u001a\u00020\b2\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bB\u0010CJ\u0015\u0010E\u001a\u00020\b2\u0006\u0010D\u001a\u00020\u000e¢\u0006\u0004\bE\u0010FR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010`\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010h\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010l\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010S\u001a\u0004\bj\u0010U\"\u0004\bk\u0010WR\"\u0010t\u001a\u00020m8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\"\u0010|\u001a\u00020u8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R#\u0010\u0080\u0001\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b}\u0010c\u001a\u0004\b~\u0010e\"\u0004\b\u007f\u0010gR*\u0010\u0088\u0001\u001a\u00030\u0081\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R&\u0010\u008c\u0001\u001a\u00020m8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0089\u0001\u0010o\u001a\u0005\b\u008a\u0001\u0010q\"\u0005\b\u008b\u0001\u0010sR&\u0010\u0090\u0001\u001a\u00020m8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008d\u0001\u0010o\u001a\u0005\b\u008e\u0001\u0010q\"\u0005\b\u008f\u0001\u0010sR*\u0010\u0098\u0001\u001a\u00030\u0091\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R&\u0010\u009c\u0001\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0099\u0001\u0010[\u001a\u0005\b\u009a\u0001\u0010]\"\u0005\b\u009b\u0001\u0010_R*\u0010 \u0001\u001a\u00030\u0081\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009d\u0001\u0010\u0083\u0001\u001a\u0006\b\u009e\u0001\u0010\u0085\u0001\"\u0006\b\u009f\u0001\u0010\u0087\u0001R*\u0010¨\u0001\u001a\u00030¡\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R*\u0010¬\u0001\u001a\u00030¡\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b©\u0001\u0010£\u0001\u001a\u0006\bª\u0001\u0010¥\u0001\"\u0006\b«\u0001\u0010§\u0001R%\u0010¯\u0001\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\t\u0010c\u001a\u0005\b\u00ad\u0001\u0010e\"\u0005\b®\u0001\u0010gR&\u0010³\u0001\u001a\u00020m8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b°\u0001\u0010o\u001a\u0005\b±\u0001\u0010q\"\u0005\b²\u0001\u0010sR&\u0010·\u0001\u001a\u00020m8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b´\u0001\u0010o\u001a\u0005\bµ\u0001\u0010q\"\u0005\b¶\u0001\u0010sR*\u0010¿\u0001\u001a\u00030¸\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001\"\u0006\b½\u0001\u0010¾\u0001R%\u0010Â\u0001\u001a\u00020m8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b&\u0010o\u001a\u0005\bÀ\u0001\u0010q\"\u0005\bÁ\u0001\u0010sR&\u0010Æ\u0001\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÃ\u0001\u0010c\u001a\u0005\bÄ\u0001\u0010e\"\u0005\bÅ\u0001\u0010gR)\u0010Í\u0001\u001a\u00030Ç\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u001b\u0010È\u0001\u001a\u0006\bÉ\u0001\u0010Ê\u0001\"\u0006\bË\u0001\u0010Ì\u0001R)\u0010Ð\u0001\u001a\u00030Ç\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b)\u0010È\u0001\u001a\u0006\bÎ\u0001\u0010Ê\u0001\"\u0006\bÏ\u0001\u0010Ì\u0001R)\u0010Ó\u0001\u001a\u00030¸\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b0\u0010º\u0001\u001a\u0006\bÑ\u0001\u0010¼\u0001\"\u0006\bÒ\u0001\u0010¾\u0001R%\u0010Ö\u0001\u001a\u00020m8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\bE\u0010o\u001a\u0005\bÔ\u0001\u0010q\"\u0005\bÕ\u0001\u0010sR)\u0010Ù\u0001\u001a\u00030\u0081\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u000f\u0010\u0083\u0001\u001a\u0006\b×\u0001\u0010\u0085\u0001\"\u0006\bØ\u0001\u0010\u0087\u0001R(\u0010ß\u0001\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b8\u0010Ú\u0001\u001a\u0006\bÛ\u0001\u0010Ü\u0001\"\u0006\bÝ\u0001\u0010Þ\u0001R\u0018\u0010(\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bà\u0001\u0010á\u0001R\u0019\u0010ã\u0001\u001a\u00030â\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bj\u0010»\u0001R\u0019\u0010å\u0001\u001a\u00030ä\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b»\u0001\u0010dR\u0019\u0010è\u0001\u001a\u00030æ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bx\u0010ç\u0001R\u001a\u0010é\u0001\u001a\u00030æ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0001\u0010ç\u0001R#\u0010ë\u0001\u001a\r ê\u0001*\u0005\u0018\u00010æ\u00010æ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bd\u0010ç\u0001R\u0019\u0010ì\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010\u008a\u0001R\u001b\u0010î\u0001\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010í\u0001R%\u0010ñ\u0001\u001a\u000f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0ï\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bL\u0010ð\u0001¨\u0006ò\u0001"}, d2 = {"Ll/owb0;", "Ll/s7m;", "Ll/wvb0;", "", "Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/QuickChatLoftAct;", "act", "<init>", "(Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/QuickChatLoftAct;)V", "", "r", "()V", "f0", "Ll/etb0;", "cardData", "", "B", "(Ll/etb0;)Z", "d0", "data", "", "from", "y0", "(Ll/etb0;Ljava/lang/String;)V", "h0", "k0", "w0", "v0", "x", "g0", "e0", "eid", "s0", "(Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "v", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "y", "(Ll/wvb0;)V", "inflateView", "u0", "o0", "(Ll/etb0;)V", "x0", "z", "Lcom/p1/mobile/putong/core/data/VideoChatSecondFloorSummary;", "videoChatSecondFloorSummary", "r0", "(Lcom/p1/mobile/putong/core/data/VideoChatSecondFloorSummary;)V", "m0", "t0", "Landroid/animation/Animator;", "C", "()Landroid/animation/Animator;", "enterAnimation", "exitAnimation", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Landroid/os/Bundle;", "savedInstanceState", "j0", "(Landroid/os/Bundle;)V", "able", "A", "(Z)V", "a", "Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/QuickChatLoftAct;", "Landroid/widget/FrameLayout;", "b", "Landroid/widget/FrameLayout;", "L", "()Landroid/widget/FrameLayout;", "set_rootView", "(Landroid/widget/FrameLayout;)V", "_rootView", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "get_background", "()Landroid/widget/ImageView;", "set_background", "(Landroid/widget/ImageView;)V", "_background", "Lcom/tantan/library/svga/SVGAnimationView;", "d", "Lcom/tantan/library/svga/SVGAnimationView;", "Q", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_svga_bg", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_svga_bg", "Lv/VLinear;", "e", "Lv/VLinear;", "I", "()Lv/VLinear;", "set_navigation_bar", "(Lv/VLinear;)V", "_navigation_bar", "f", "E", "set_back_btn", "_back_btn", "Lv/VText;", "g", "Lv/VText;", "W", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "Lv/VScroll;", "h", "Lv/VScroll;", "G", "()Lv/VScroll;", "set_content_view", "(Lv/VScroll;)V", "_content_view", "i", "X", "set_top_content", "_top_content", "Lv/VImage;", "j", "Lv/VImage;", "Y", "()Lv/VImage;", "set_top_icon", "(Lv/VImage;)V", "_top_icon", "k", "Z", "set_top_title", "_top_title", "l", "P", "set_sub_title", "_sub_title", "Lv/VFrame;", "m", "Lv/VFrame;", "R", "()Lv/VFrame;", "set_text_chat_view", "(Lv/VFrame;)V", "_text_chat_view", "n", "S", "set_text_chat_view_svg_anim", "_text_chat_view_svg_anim", "o", "V", "set_text_chat_view_wave", "_text_chat_view_wave", "Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/item/QuickChatLoftChatItem;", "p", "Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/item/QuickChatLoftChatItem;", "T", "()Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/item/QuickChatLoftChatItem;", "set_text_chat_view_view1", "(Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/item/QuickChatLoftChatItem;)V", "_text_chat_view_view1", "q", "U", "set_text_chat_view_view2", "_text_chat_view_view2", "J", "set_online_tip_button", "_online_tip_button", "s", "get_quick_text", "set_quick_text", "_quick_text", "t", "K", "set_quick_text_count", "_quick_text_count", "Lv/VRelative;", "u", "Lv/VRelative;", "F", "()Lv/VRelative;", "set_call_content", "(Lv/VRelative;)V", "_call_content", "get_bottom_content_title", "set_bottom_content_title", "_bottom_content_title", "w", "a0", "set_total_layout", "_total_layout", "Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/item/QuickChatPageItem;", "Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/item/QuickChatPageItem;", "c0", "()Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/item/QuickChatPageItem;", "set_total_layout_voice_call_content", "(Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/item/QuickChatPageItem;)V", "_total_layout_voice_call_content", "b0", "set_total_layout_vedio_call_content", "_total_layout_vedio_call_content", "M", "set_single_layout", "_single_layout", "N", "set_single_layout_desc", "_single_layout_desc", "O", "set_single_layout_icon", "_single_layout_icon", "Landroid/view/View;", "H", "()Landroid/view/View;", "set_mask", "(Landroid/view/View;)V", "_mask", "D", "Ll/wvb0;", "", "downY", "", "animationState", "Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator;", "animationUp", "animationDown", "kotlin.jvm.PlatformType", "alphaAnimation", "moveYIntercept", "Ll/etb0;", "currentCardData", "Ll/f30;", "Ll/f30;", "matchImmediatelyAction", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"l/owb0$a", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "(Landroid/animation/Animator;)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1105a extends AnimatorListenerAdapter {
        public C1105a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            animation.getClass();
            xdl0.M0(owb0.this.m20891Y(), true);
            xdl0.M0(owb0.this.m20892Z(), true);
            xdl0.M0(owb0.this.m20882P(), true);
            xdl0.M0(owb0.this.m20884R(), true);
            xdl0.M0(owb0.this.m20876J(), true);
            xdl0.M0(owb0.this.m20872F(), true);
        }
    }

    /* JADX INFO: renamed from: l.owb0$b */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"l/owb0$b", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationRepeat", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1106b implements Animator.AnimatorListener {
        public C1106b() {
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
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"l/owb0$c", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationRepeat", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1107c implements Animator.AnimatorListener {
        public C1107c() {
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
            public final void call(Object obj, Object obj2) {
                owb0.m20854l(this.f12944a, (etb0) obj, ((Boolean) obj2).booleanValue());
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static void m20843a(owb0 owb0Var, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        SVGAnimationView sVGAnimationViewM20883Q = owb0Var.m20883Q();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        sVGAnimationViewM20883Q.setAlpha((((Float) animatedValue).floatValue() * 0.9f) + 0.1f);
        VLinear vLinearM20890X = owb0Var.m20890X();
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        animatedValue2.getClass();
        vLinearM20890X.setAlpha(((Float) animatedValue2).floatValue());
    }

    /* JADX INFO: renamed from: b */
    public static void m20844b(owb0 owb0Var, etb0 etb0Var, Boolean bool) {
        if (ke50.m18101a() && OnlineMatchManager.z().m0()) {
            ak50.Companion.a().H(owb0Var.act, "overheat_protection");
        } else {
            owb0Var.matchImmediatelyAction.call(etb0Var, bool);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m20847e(owb0 owb0Var, View view) {
        owb0Var.act.finish();
    }

    /* JADX INFO: renamed from: f */
    public static void m20848f(owb0 owb0Var, View view) {
        owb0Var.m20906s0("e_voicechat_button");
        if (Network.isConnected(CoreModule.f1533b)) {
            owb0Var.m20916z();
        } else {
            lsi0.i(R$string.f2802p4, true);
        }
    }

    /* JADX INFO: renamed from: g0 */
    private final void m20849g0() {
        xdl0.M(m20875I(), true);
        xdl0.E0(m20871E(), new View.OnClickListener() { // from class: l.hwb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                owb0.m20847e(this.f14108a, view);
            }
        });
        m20889W().setTypeface(Typeface.defaultFromStyle(1));
    }

    /* JADX INFO: renamed from: i0 */
    public static final void m20851i0(owb0 owb0Var, etb0 etb0Var) {
        CoreModule.f1534c.f3559H0.m27536k5();
        wvb0 wvb0Var = owb0Var.presenter;
        if (wvb0Var == null) {
            Intrinsics.r("presenter");
            wvb0Var = null;
        }
        wvb0Var.m26791y0(etb0Var);
    }

    /* JADX INFO: renamed from: j */
    public static void m20852j(owb0 owb0Var, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        SVGAnimationView sVGAnimationViewM20883Q = owb0Var.m20883Q();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        sVGAnimationViewM20883Q.setAlpha((((Float) animatedValue).floatValue() * 0.9f) + 0.1f);
        VLinear vLinearM20890X = owb0Var.m20890X();
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        animatedValue2.getClass();
        vLinearM20890X.setAlpha(((Float) animatedValue2).floatValue());
    }

    /* JADX INFO: renamed from: l */
    public static void m20854l(final owb0 owb0Var, final etb0 etb0Var, boolean z) {
        etb0Var.getClass();
        QuickChatCardInfo quickChatCardInfo = new QuickChatCardInfo();
        quickChatCardInfo.secretKey = etb0Var.getTextCardData().secretKey;
        quickChatCardInfo.userID = etb0Var.getTextCardData().userID;
        quickChatCardInfo.biz = QuickChatType.get(etb0Var.getTextCardData().biz);
        quickChatCardInfo.stage = etb0Var.getTextCardData().stage;
        xzc0.m27718s0(owb0Var.act, quickChatCardInfo, z, true, "", new d30() { // from class: l.mwb0
            public final void call() {
                owb0.m20851i0(this.f17319a, etb0Var);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public static final void m20855l0(owb0 owb0Var, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        VScroll vScrollM20873G = owb0Var.m20873G();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        vScrollM20873G.smoothScrollTo(0, ((Integer) animatedValue).intValue());
    }

    /* JADX INFO: renamed from: m */
    public static void m20856m(owb0 owb0Var, Boolean bool) {
        nvb0.m20213m(owb0Var.act, "voice_quick_chat");
    }

    /* JADX INFO: renamed from: n0 */
    public static final void m20858n0(owb0 owb0Var, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        VScroll vScrollM20873G = owb0Var.m20873G();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        vScrollM20873G.smoothScrollTo(0, ((Integer) animatedValue).intValue());
    }

    /* JADX INFO: renamed from: p */
    public static void m20859p(owb0 owb0Var, Boolean bool) {
        if (ke50.m18101a() && OnlineMatchManager.z().m0()) {
            ak50.Companion.a().H(owb0Var.act, "overheat_protection");
        } else {
            if (nvb0.INSTANCE.m20222r(owb0Var.act)) {
                return;
            }
            nvb0.m20213m(owb0Var.act, "text_quick_chat");
        }
    }

    /* JADX INFO: renamed from: p0 */
    public static final void m20860p0(owb0 owb0Var, etb0 etb0Var) {
        owb0Var.m20906s0("e_quickchat_broadcast");
        if (!Network.isConnected(CoreModule.f1533b)) {
            lsi0.i(R$string.f2802p4, true);
        } else {
            etb0Var.getClass();
            owb0Var.m20915y0(etb0Var, "p_quickchat,quickchat_recommend");
        }
    }

    /* JADX INFO: renamed from: q */
    public static boolean m20861q(owb0 owb0Var, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            owb0Var.downY = motionEvent.getY();
            return false;
        }
        if (action != 2) {
            return false;
        }
        float y = motionEvent.getY() - owb0Var.downY;
        if (Math.abs(y) <= t100.o || owb0Var.moveYIntercept) {
            return true;
        }
        if (y < 0.0f && !owb0Var.animationUp.isRunning()) {
            owb0Var.m20903m0();
            return true;
        }
        if (y <= 0.0f || owb0Var.animationDown.isRunning()) {
            return true;
        }
        owb0Var.m20902k0();
        return true;
    }

    /* JADX INFO: renamed from: q0 */
    public static final void m20862q0(owb0 owb0Var, etb0 etb0Var) {
        owb0Var.m20906s0("e_quickchat_broadcast");
        if (!Network.isConnected(CoreModule.f1533b)) {
            lsi0.i(R$string.f2802p4, true);
        } else {
            etb0Var.getClass();
            owb0Var.m20915y0(etb0Var, "p_quickchat,quickchat_recommend");
        }
    }

    /* JADX INFO: renamed from: r */
    private final void m20863r() {
        m20849g0();
        m20912x();
        m20897e0();
        m20907t0();
        m20896d0();
        m20899h0();
        m20898f0();
        m20908u0();
    }

    /* JADX INFO: renamed from: s */
    public static void m20864s(owb0 owb0Var) {
        owb0Var.m20916z();
    }

    /* JADX INFO: renamed from: u */
    public static void m20865u(owb0 owb0Var, View view) {
        owb0Var.m20906s0("e_quickchat_button");
        if (Network.isConnected(CoreModule.f1533b)) {
            owb0Var.m20913x0("p_quickchat,quickchat_button");
        } else {
            lsi0.i(R$string.f2802p4, true);
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m20867A(boolean able) {
        m20879M().setClickable(able);
        m20876J().setClickable(able);
        m20895c0().m7875h(able);
        m20894b0().m7875h(able);
    }

    /* JADX INFO: renamed from: B */
    public final boolean m20868B(etb0 cardData) {
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
    public final Animator m20869C() {
        AnimatorSet animatorSet = new AnimatorSet();
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(m20891Y(), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.0f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.0f, 1.0f), propertyValuesHolderOfFloat);
        objectAnimatorOfPropertyValuesHolder.setDuration(300L);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new DecelerateInterpolator());
        Property property = View.TRANSLATION_Y;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(m20892Z(), PropertyValuesHolder.ofFloat((Property<?, Float>) property, svq.c(10), 0.0f), propertyValuesHolderOfFloat);
        objectAnimatorOfPropertyValuesHolder2.setDuration(300L);
        objectAnimatorOfPropertyValuesHolder2.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator objectAnimatorOfPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(m20882P(), PropertyValuesHolder.ofFloat((Property<?, Float>) property, svq.c(15), 0.0f), propertyValuesHolderOfFloat);
        objectAnimatorOfPropertyValuesHolder3.setDuration(300L);
        objectAnimatorOfPropertyValuesHolder3.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator objectAnimatorOfPropertyValuesHolder4 = ObjectAnimator.ofPropertyValuesHolder(m20884R(), propertyValuesHolderOfFloat);
        objectAnimatorOfPropertyValuesHolder4.setDuration(300L);
        objectAnimatorOfPropertyValuesHolder4.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator objectAnimatorOfPropertyValuesHolder5 = ObjectAnimator.ofPropertyValuesHolder(m20876J(), propertyValuesHolderOfFloat);
        objectAnimatorOfPropertyValuesHolder5.setDuration(300L);
        objectAnimatorOfPropertyValuesHolder5.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator objectAnimatorOfPropertyValuesHolder6 = ObjectAnimator.ofPropertyValuesHolder(m20872F(), propertyValuesHolderOfFloat);
        objectAnimatorOfPropertyValuesHolder6.setDuration(300L);
        objectAnimatorOfPropertyValuesHolder6.setInterpolator(new DecelerateInterpolator());
        animatorSet.playTogether(objectAnimatorOfPropertyValuesHolder, objectAnimatorOfPropertyValuesHolder2, objectAnimatorOfPropertyValuesHolder3, objectAnimatorOfPropertyValuesHolder4, objectAnimatorOfPropertyValuesHolder5, objectAnimatorOfPropertyValuesHolder6);
        animatorSet.addListener(new C1105a());
        return animatorSet;
    }

    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context m20870C0() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final ImageView m20871E() {
        ImageView imageView = this._back_btn;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.r("_back_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final VRelative m20872F() {
        VRelative vRelative = this._call_content;
        if (vRelative != null) {
            return vRelative;
        }
        Intrinsics.r("_call_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final VScroll m20873G() {
        VScroll vScroll = this._content_view;
        if (vScroll != null) {
            return vScroll;
        }
        Intrinsics.r("_content_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final View m20874H() {
        View view = this._mask;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_mask");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final VLinear m20875I() {
        VLinear vLinear = this._navigation_bar;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_navigation_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final VLinear m20876J() {
        VLinear vLinear = this._online_tip_button;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_online_tip_button");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final VText m20877K() {
        VText vText = this._quick_text_count;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_quick_text_count");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final FrameLayout m20878L() {
        FrameLayout frameLayout = this._rootView;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_rootView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final VRelative m20879M() {
        VRelative vRelative = this._single_layout;
        if (vRelative != null) {
            return vRelative;
        }
        Intrinsics.r("_single_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final VText m20880N() {
        VText vText = this._single_layout_desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_single_layout_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final VImage m20881O() {
        VImage vImage = this._single_layout_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_single_layout_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final VText m20882P() {
        VText vText = this._sub_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_sub_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final SVGAnimationView m20883Q() {
        SVGAnimationView sVGAnimationView = this._svga_bg;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.r("_svga_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final VFrame m20884R() {
        VFrame vFrame = this._text_chat_view;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.r("_text_chat_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final SVGAnimationView m20885S() {
        SVGAnimationView sVGAnimationView = this._text_chat_view_svg_anim;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.r("_text_chat_view_svg_anim");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final QuickChatLoftChatItem m20886T() {
        QuickChatLoftChatItem quickChatLoftChatItem = this._text_chat_view_view1;
        if (quickChatLoftChatItem != null) {
            return quickChatLoftChatItem;
        }
        Intrinsics.r("_text_chat_view_view1");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final QuickChatLoftChatItem m20887U() {
        QuickChatLoftChatItem quickChatLoftChatItem = this._text_chat_view_view2;
        if (quickChatLoftChatItem != null) {
            return quickChatLoftChatItem;
        }
        Intrinsics.r("_text_chat_view_view2");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final VImage m20888V() {
        VImage vImage = this._text_chat_view_wave;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_text_chat_view_wave");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final VText m20889W() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final VLinear m20890X() {
        VLinear vLinear = this._top_content;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_top_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final VImage m20891Y() {
        VImage vImage = this._top_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_top_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final VText m20892Z() {
        VText vText = this._top_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_top_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final VLinear m20893a0() {
        VLinear vLinear = this._total_layout;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_total_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final QuickChatPageItem m20894b0() {
        QuickChatPageItem quickChatPageItem = this._total_layout_vedio_call_content;
        if (quickChatPageItem != null) {
            return quickChatPageItem;
        }
        Intrinsics.r("_total_layout_vedio_call_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final QuickChatPageItem m20895c0() {
        QuickChatPageItem quickChatPageItem = this._total_layout_voice_call_content;
        if (quickChatPageItem != null) {
            return quickChatPageItem;
        }
        Intrinsics.r("_total_layout_voice_call_content");
        return null;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m20896d0() {
        zvf0.x("e_quickchat_button", this.act.pageId());
        VText vTextM20877K = m20877K();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        vTextM20877K.setText(String.format("%s人实时在线", Arrays.copyOf(new Object[]{Integer.valueOf(Random.Default.nextInt(2000, 10000))}, 1)));
        xdl0.E0(m20876J(), new View.OnClickListener() { // from class: l.iwb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                owb0.m20865u(this.f14848a, view);
            }
        });
    }

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
    public final void m20897e0() {
        m20873G().setVerticalScrollBarEnabled(false);
        m20873G().setOnTouchListener(new View.OnTouchListener() { // from class: l.gwb0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return owb0.m20861q(this.f13544a, view, motionEvent);
            }
        });
    }

    @NotNull
    public Animator enterAnimation() {
        View viewM20874H = m20874H();
        Property property = View.ALPHA;
        nvb0 nvb0Var = nvb0.INSTANCE;
        Animator animatorL = bt0.l(viewM20874H, property, nvb0Var.m20220j(), nvb0Var.m20219i(), new AccelerateDecelerateInterpolator(), new float[]{1.0f, 0.0f});
        Animator animatorL2 = bt0.l(m20884R(), property, nvb0Var.m20220j(), nvb0Var.m20219i(), new AccelerateDecelerateInterpolator(), new float[]{0.0f, 1.0f});
        Animator animatorL3 = bt0.l(m20891Y(), bt0.i, nvb0Var.m20220j(), nvb0Var.m20219i(), new AccelerateDecelerateInterpolator(), new float[]{0.0f, 1.0f});
        VText vTextM20892Z = m20892Z();
        Property property2 = View.TRANSLATION_Y;
        Animator animatorZ = bt0.z(new Animator[]{animatorL, animatorL2, animatorL3, bt0.l(vTextM20892Z, property2, nvb0Var.m20220j(), nvb0Var.m20219i(), new AccelerateDecelerateInterpolator(), new float[]{t100.i, 0.0f}), bt0.l(m20882P(), property2, nvb0Var.m20220j(), nvb0Var.m20219i(), new AccelerateDecelerateInterpolator(), new float[]{t100.o, 0.0f}), bt0.l(m20884R(), property2, nvb0Var.m20220j(), nvb0Var.m20219i(), new AccelerateDecelerateInterpolator(), new float[]{t100.t, 0.0f}), bt0.l(m20876J(), property2, nvb0Var.m20220j(), nvb0Var.m20219i(), new AccelerateDecelerateInterpolator(), new float[]{t100.B, 0.0f}), bt0.l(m20872F(), property2, nvb0Var.m20220j(), nvb0Var.m20219i(), new AccelerateDecelerateInterpolator(), new float[]{t100.I, 0.0f})});
        animatorZ.getClass();
        return animatorZ;
    }

    @NotNull
    public Animator exitAnimation() {
        VFrame vFrameM20884R = m20884R();
        Property property = View.ALPHA;
        nvb0 nvb0Var = nvb0.INSTANCE;
        Animator animatorZ = bt0.z(new Animator[]{bt0.l(vFrameM20884R, property, nvb0Var.m20220j(), nvb0Var.m20219i(), new AccelerateDecelerateInterpolator(), new float[]{1.0f, 0.0f}), bt0.l(m20874H(), property, 0L, nvb0Var.m20219i(), new AccelerateDecelerateInterpolator(), new float[]{0.0f, 1.0f}), bt0.l(m20891Y(), bt0.i, 0L, nvb0Var.m20219i(), new AccelerateDecelerateInterpolator(), new float[]{1.0f, 0.0f})});
        animatorZ.getClass();
        return animatorZ;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m20898f0() {
        int iY0 = xdl0.y0();
        if (iY0 > 0) {
            xdl0.C0(m20883Q(), (int) (iY0 * 1.17f));
            int iMin = Math.min(t100.d(375.0f), iY0);
            ViewGroup.LayoutParams layoutParams = m20885S().getLayoutParams();
            layoutParams.getClass();
            layoutParams.height = iMin;
            layoutParams.width = iMin;
            m20885S().setLayoutParams(layoutParams);
            ViewGroup.LayoutParams layoutParams2 = m20888V().getLayoutParams();
            layoutParams2.getClass();
            layoutParams2.width = iMin;
            m20888V().setLayoutParams(layoutParams2);
        }
        SVGALoader.with(this.act).autoPlay(false).repeatCount(-1).from("https://fe-static.tancdn.com/v1/raw/1ecec93e-84b2-4731-a927-90928bb72cb114.svga").into(m20885S());
        SVGALoader.with(this.act).autoPlay(true).repeatCount(1).from("https://fe-static.tancdn.com/v1/raw/a0ef67b0-beed-4cfc-b970-3b321ea7b78f14.svga").into(m20883Q());
        ArrayList arrayList = new ArrayList();
        arrayList.add("https://fe-static.tancdn.com/v1/raw/0893691e-17ee-41df-aa71-5aa971234e1914.svga");
        arrayList.add("https://fe-static.tancdn.com/v1/raw/ce5cb9c2-8213-49a3-a973-5bcbf53408c614.svga");
        arrayList.add("https://fe-static.tancdn.com/v1/raw/689b960b-7560-4a29-a8ae-66e7cc4d1af814.svga");
        arrayList.add("https://fe-static.tancdn.com/v1/raw/794f2428-840d-4d21-923f-d0d5eb87efed14.svga");
        SVGALoader.with(this.act).batchDownload(arrayList);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m20899h0() {
        xdl0.M(m20879M(), true);
        zvf0.x("e_voicechat_button", this.act.pageId());
        VText vTextM20880N = m20880N();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        vTextM20880N.setText(String.format("%s人在线", Arrays.copyOf(new Object[]{Integer.valueOf(Random.Default.nextInt(2000, 10000))}, 1)));
        m20881O().setImageResource(zz6.u0() ? x2c0.f25873Fn : x2c0.f25841En);
        xdl0.E0(m20879M(), new View.OnClickListener() { // from class: l.yvb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                owb0.m20848f(this.f28421a, view);
            }
        });
        xdl0.M(m20893a0(), false);
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        m20909v(inflater, parent);
        m20863r();
        return m20878L();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m20901j0(@NotNull Bundle savedInstanceState) {
        savedInstanceState.getClass();
        xdl0.M0(m20891Y(), true);
        xdl0.M0(m20892Z(), true);
        xdl0.M0(m20882P(), true);
        xdl0.M0(m20884R(), true);
        xdl0.M0(m20876J(), true);
        xdl0.M0(m20872F(), true);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m20902k0() {
        this.moveYIntercept = m20873G().getChildAt(0).getHeight() - m20873G().getHeight() < 0;
        if (this.animationState == 1 || this.animationDown.isRunning() || this.moveYIntercept) {
            return;
        }
        int scrollY = m20873G().getScrollY();
        if (this.animationUp.isRunning()) {
            this.animationUp.end();
            this.alphaAnimation.end();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(scrollY, 0);
        valueAnimatorOfInt.setDuration(nvb0.INSTANCE.m20219i());
        valueAnimatorOfInt.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.nwb0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                owb0.m20855l0(this.f17903a, valueAnimator);
            }
        });
        valueAnimatorOfInt.addListener(new C1106b());
        m20911w0();
        valueAnimatorOfInt.start();
        this.animationDown = valueAnimatorOfInt;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m20903m0() {
        this.moveYIntercept = m20873G().getChildAt(0).getHeight() - m20873G().getHeight() < 0;
        if (this.animationState == 2 || this.animationUp.isRunning() || this.moveYIntercept) {
            return;
        }
        int scrollY = m20873G().getScrollY();
        if (this.animationDown.isRunning()) {
            this.animationDown.end();
            this.alphaAnimation.end();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(scrollY, m20873G().getChildAt(0).getHeight() - m20873G().getHeight());
        valueAnimatorOfInt.setDuration(nvb0.INSTANCE.m20219i());
        valueAnimatorOfInt.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.jwb0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                owb0.m20858n0(this.f15465a, valueAnimator);
            }
        });
        valueAnimatorOfInt.addListener(new C1107c());
        m20910v0();
        valueAnimatorOfInt.start();
        this.animationUp = valueAnimatorOfInt;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m20904o0(@NotNull etb0 cardData) {
        cardData.getClass();
        if (!m20885S().isAnimating()) {
            m20885S().startAnimation();
        }
        if (m20868B(cardData)) {
            return;
        }
        this.currentCardData = cardData;
        if (xdl0.O0(m20886T())) {
            m20887U().m7864q(cardData, new e30() { // from class: l.bwb0
                public final void call(Object obj) {
                    owb0.m20860p0(this.f9134a, (etb0) obj);
                }
            });
            m20886T().m7867t();
        } else {
            m20886T().m7864q(cardData, new e30() { // from class: l.cwb0
                public final void call(Object obj) {
                    owb0.m20862q0(this.f9885a, (etb0) obj);
                }
            });
            m20887U().m7867t();
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m20905r0(@NotNull VideoChatSecondFloorSummary videoChatSecondFloorSummary) {
        videoChatSecondFloorSummary.getClass();
        xdl0.M(m20879M(), false);
        xdl0.M(m20893a0(), true);
        zvf0.x("e_videochat_button", this.act.pageId());
        m20895c0().m7876i(this.act, "voice");
        m20894b0().setVideoData(videoChatSecondFloorSummary);
        m20894b0().m7876i(this.act, "video");
    }

    /* JADX INFO: renamed from: s0 */
    public final void m20906s0(String eid) {
        zvf0.r(eid, this.act.pageId());
    }

    /* JADX INFO: renamed from: t0 */
    public final void m20907t0() {
        String stringExtra = this.act.getIntent().getStringExtra("action");
        if (TextUtils.equals(stringExtra, "videoTips") || TextUtils.equals(stringExtra, "normal")) {
            xdl0.M0(m20891Y(), false);
            xdl0.M0(m20892Z(), false);
            xdl0.M0(m20882P(), false);
            xdl0.M0(m20884R(), false);
            xdl0.M0(m20876J(), false);
            xdl0.M0(m20872F(), false);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m20908u0() {
        if (xdl0.O0(m20886T())) {
            m20887U().m7865r();
            m20886T().m7867t();
        } else {
            m20886T().m7865r();
            m20887U().m7867t();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final View m20909v(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = pwb0.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: v0 */
    public final void m20910v0() {
        float alpha = m20890X().getAlpha();
        if (this.alphaAnimation.isRunning()) {
            this.alphaAnimation.end();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(alpha, 0.0f);
        this.alphaAnimation = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(nvb0.INSTANCE.m20219i());
        this.alphaAnimation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.dwb0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                owb0.m20843a(this.f10623a, valueAnimator);
            }
        });
        this.alphaAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        this.alphaAnimation.start();
    }

    /* JADX INFO: renamed from: w0 */
    public final void m20911w0() {
        float alpha = m20890X().getAlpha();
        if (this.alphaAnimation.isRunning()) {
            this.alphaAnimation.end();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(alpha, 1.0f);
        this.alphaAnimation = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(nvb0.INSTANCE.m20219i());
        this.alphaAnimation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.awb0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                owb0.m20852j(this.f8570a, valueAnimator);
            }
        });
        this.alphaAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        this.alphaAnimation.start();
    }

    /* JADX INFO: renamed from: x */
    public final void m20912x() {
        xdl0.X(m20875I(), xdl0.F0());
        xdl0.X(m20873G(), t100.y + xdl0.F0());
        xdl0.X(m20891Y(), t100.d(68.0f) - xdl0.F0());
    }

    /* JADX INFO: renamed from: x0 */
    public final void m20913x0(@NotNull String from) {
        from.getClass();
        nvb0.INSTANCE.m20217f(this.act, from, new e30() { // from class: l.zvb0
            public final void call(Object obj) {
                owb0.m20859p(this.f28998a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void m20900i1(@NotNull wvb0 presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: y0 */
    public final void m20915y0(final etb0 data, String from) {
        nvb0.INSTANCE.m20217f(this.act, from, new e30() { // from class: l.ewb0
            public final void call(Object obj) {
                owb0.m20844b(this.f11482a, data, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public final void m20916z() {
        if (nvb0.m20210h(this.act, new d30() { // from class: l.kwb0
            public final void call() {
                owb0.m20864s(this.f16022a);
            }
        })) {
            nvb0.INSTANCE.m20218g(this.act, "p_quickchat,voicechat_button", new e30() { // from class: l.lwb0
                public final void call(Object obj) {
                    owb0.m20856m(this.f16686a, (Boolean) obj);
                }
            });
        }
    }
}
