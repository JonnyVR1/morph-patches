package com.p051p1.mobile.putong.core.p058ui.superlikeopt.upgrade;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.p058ui.superlikeopt.upgrade.SuperLikeComboAnimView;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15274a;
import kotlinx.coroutines.InterfaceC15593o;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p153l.bnl0;
import p153l.bui;
import p153l.czq;
import p153l.fui;
import p153l.gbc0;
import p153l.gt0;
import p153l.l4k;
import p153l.q4h0;
import p153l.r5e;
import p153l.t4h0;
import p153l.uyp;
import p153l.xh3;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001f\u0010\u001aJ\u000f\u0010 \u001a\u00020\rH\u0014¢\u0006\u0004\b \u0010\u001aJ%\u0010\"\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000bH\u0016¢\u0006\u0004\b$\u0010%J'\u0010'\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b'\u0010#J\u000f\u0010(\u001a\u00020\u0007H\u0016¢\u0006\u0004\b(\u0010)R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00105\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u0010,\u001a\u0004\b3\u0010.\"\u0004\b4\u00100R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010D\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010I\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010%\"\u0004\bH\u0010\u000fR\"\u0010M\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010?\u001a\u0004\bK\u0010A\"\u0004\bL\u0010CR\"\u0010T\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010\\\u001a\u00020U8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010`\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010?\u001a\u0004\b^\u0010A\"\u0004\b_\u0010CR\"\u0010h\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010k\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010?\u001a\u0004\bi\u0010A\"\u0004\bj\u0010CR\"\u0010r\u001a\u00020l8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR$\u0010y\u001a\u0004\u0018\u00010s8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\u0018\u0010z\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010tR\"\u0010\u007f\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u001eR'\u0010\u0084\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u001b\u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u0010)\"\u0006\b\u0082\u0001\u0010\u0083\u0001R$\u0010&\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u0015\u0010{\u001a\u0005\b\u0085\u0001\u0010}\"\u0005\b\u0086\u0001\u0010\u001e¨\u0006\u0087\u0001"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/superlikeopt/upgrade/SuperLikeComboAnimView;", "Landroid/widget/FrameLayout;", "Ll/q4h0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", OMSTemplateModeType.view, "", Constants.INAPP_DATA_TAG, "(Landroid/view/View;)V", "", "needShadow", "isFemale", "k", "(ZZ)V", "q", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", Constants.KEY_T, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "n", "()V", "p", BLiveStormDanmakuGiftResourceType.f45292l, "o", "(Z)V", "m", "onFinishInflate", "send", BLiveStormDanmakuGiftResourceType.f45294s, "(ZZZ)V", "getRenderView", "()Landroid/view/View;", "guideCard", "r", "u", "()I", "Lcom/tantan/library/svga/SVGAnimationView;", "a", "Lcom/tantan/library/svga/SVGAnimationView;", "get_ribbon_svga", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_ribbon_svga", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_ribbon_svga", "b", "get_star_svga", "set_star_svga", "_star_svga", "Landroid/widget/RelativeLayout;", "c", "Landroid/widget/RelativeLayout;", "get_root", "()Landroid/widget/RelativeLayout;", "set_root", "(Landroid/widget/RelativeLayout;)V", "_root", "Lv/VImage;", "Lv/VImage;", "get_shadow", "()Lv/VImage;", "set_shadow", "(Lv/VImage;)V", "_shadow", "e", "Landroid/view/View;", "get_stuff", "set_stuff", "_stuff", "f", "get_receive_superlike_img", "set_receive_superlike_img", "_receive_superlike_img", "g", "Landroid/widget/FrameLayout;", "get_superlike_layout", "()Landroid/widget/FrameLayout;", "set_superlike_layout", "(Landroid/widget/FrameLayout;)V", "_superlike_layout", "Lcom/p1/mobile/putong/core/ui/superlikeopt/upgrade/SuperLikeComboProgressView;", "h", "Lcom/p1/mobile/putong/core/ui/superlikeopt/upgrade/SuperLikeComboProgressView;", "get_superlike_progress", "()Lcom/p1/mobile/putong/core/ui/superlikeopt/upgrade/SuperLikeComboProgressView;", "set_superlike_progress", "(Lcom/p1/mobile/putong/core/ui/superlikeopt/upgrade/SuperLikeComboProgressView;)V", "_superlike_progress", RXScreenCaptureService.KEY_INDEX, "get_superlike_foreground", "set_superlike_foreground", "_superlike_foreground", "Landroid/widget/LinearLayout;", "j", "Landroid/widget/LinearLayout;", "get_star_layout", "()Landroid/widget/LinearLayout;", "set_star_layout", "(Landroid/widget/LinearLayout;)V", "_star_layout", "get_star", "set_star", "_star", "Lcom/p1/mobile/putong/core/ui/superlikeopt/upgrade/ComboNumView;", "Lcom/p1/mobile/putong/core/ui/superlikeopt/upgrade/ComboNumView;", "get_nums", "()Lcom/p1/mobile/putong/core/ui/superlikeopt/upgrade/ComboNumView;", "set_nums", "(Lcom/p1/mobile/putong/core/ui/superlikeopt/upgrade/ComboNumView;)V", "_nums", "Lkotlinx/coroutines/o;", "Lkotlinx/coroutines/o;", "getJob", "()Lkotlinx/coroutines/o;", "setJob", "(Lkotlinx/coroutines/o;)V", "job", "ribbonSvgaJob", "Z", "getBlock", "()Z", "setBlock", "block", "I", "getSuperLikeCount", "setSuperLikeCount", "(I)V", "superLikeCount", "getGuideCard", "setGuideCard", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class SuperLikeComboAnimView extends FrameLayout implements q4h0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public SVGAnimationView _ribbon_svga;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public SVGAnimationView _star_svga;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public RelativeLayout _root;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VImage _shadow;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public View _stuff;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VImage _receive_superlike_img;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public FrameLayout _superlike_layout;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public SuperLikeComboProgressView _superlike_progress;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VImage _superlike_foreground;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public LinearLayout _star_layout;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VImage _star;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public ComboNumView _nums;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public InterfaceC15593o job;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public InterfaceC15593o ribbonSvgaJob;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public boolean block;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public int superLikeCount;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public boolean guideCard;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$a */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C9061a<T> implements bui {
        public static final C9061a<T> INSTANCE = new C9061a<>();

        /* JADX INFO: renamed from: a */
        public final Object m56975a(int i, Continuation<? super Unit> continuation) {
            return Unit.INSTANCE;
        }

        @Override // p153l.bui
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return m56975a(((Number) obj).intValue(), continuation);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$b */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C9067b<T> implements bui {
        public static final C9067b<T> INSTANCE = new C9067b<>();

        @Override // p153l.bui
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(Unit unit, Continuation<? super Unit> continuation) {
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SuperLikeComboAnimView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: b */
    public static void m56955b(SuperLikeComboAnimView superLikeComboAnimView, boolean z) {
        superLikeComboAnimView.get_star_layout().setPivotY(superLikeComboAnimView.get_star_layout().getHeight());
        superLikeComboAnimView.get_star_layout().setPivotX(superLikeComboAnimView.get_star_layout().getWidth() / 2.0f);
        superLikeComboAnimView.get_star_layout().setAlpha(0.0f);
        czq.m113346b(superLikeComboAnimView.get_star_layout(), 1.5f);
        czq.m113346b(superLikeComboAnimView.get_superlike_layout(), 1.75f);
        xh3.m210980d(l4k.INSTANCE, r5e.m179862c(), null, new SuperLikeComboAnimView$animIn$1$1(z, superLikeComboAnimView, null), 2, null);
    }

    /* JADX INFO: renamed from: c */
    public static void m56956c(SuperLikeComboAnimView superLikeComboAnimView, boolean z) {
        superLikeComboAnimView.job = xh3.m210980d(l4k.INSTANCE, r5e.m179862c(), null, new SuperLikeComboAnimView$animIn$2$1(superLikeComboAnimView, z, null), 2, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m56963d(View view) {
        t4h0.m189270a(this, view);
    }

    public final boolean getBlock() {
        return this.block;
    }

    public final boolean getGuideCard() {
        return this.guideCard;
    }

    @Nullable
    public final InterfaceC15593o getJob() {
        return this.job;
    }

    @Override // p153l.q4h0
    @NotNull
    public View getRenderView() {
        return this;
    }

    public final int getSuperLikeCount() {
        return this.superLikeCount;
    }

    @NotNull
    public final ComboNumView get_nums() {
        ComboNumView comboNumView = this._nums;
        if (comboNumView != null) {
            return comboNumView;
        }
        Intrinsics.m88391r("_nums");
        return null;
    }

    @NotNull
    public final VImage get_receive_superlike_img() {
        VImage vImage = this._receive_superlike_img;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_receive_superlike_img");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_ribbon_svga() {
        SVGAnimationView sVGAnimationView = this._ribbon_svga;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m88391r("_ribbon_svga");
        return null;
    }

    @NotNull
    public final RelativeLayout get_root() {
        RelativeLayout relativeLayout = this._root;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.m88391r("_root");
        return null;
    }

    @NotNull
    public final VImage get_shadow() {
        VImage vImage = this._shadow;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_shadow");
        return null;
    }

    @NotNull
    public final VImage get_star() {
        VImage vImage = this._star;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_star");
        return null;
    }

    @NotNull
    public final LinearLayout get_star_layout() {
        LinearLayout linearLayout = this._star_layout;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_star_layout");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_star_svga() {
        SVGAnimationView sVGAnimationView = this._star_svga;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m88391r("_star_svga");
        return null;
    }

    @NotNull
    public final View get_stuff() {
        View view = this._stuff;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_stuff");
        return null;
    }

    @NotNull
    public final VImage get_superlike_foreground() {
        VImage vImage = this._superlike_foreground;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_superlike_foreground");
        return null;
    }

    @NotNull
    public final FrameLayout get_superlike_layout() {
        FrameLayout frameLayout = this._superlike_layout;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_superlike_layout");
        return null;
    }

    @NotNull
    public final SuperLikeComboProgressView get_superlike_progress() {
        SuperLikeComboProgressView superLikeComboProgressView = this._superlike_progress;
        if (superLikeComboProgressView != null) {
            return superLikeComboProgressView;
        }
        Intrinsics.m88391r("_superlike_progress");
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final void m56964k(final boolean needShadow, final boolean isFemale) {
        Animator animatorM132166l = gt0.m132166l(get_star_layout(), FrameLayout.ALPHA, 225L, 240L, null, 0.0f, 1.0f);
        Property property = FrameLayout.SCALE_X;
        Animator animatorM132166l2 = gt0.m132166l(get_star_layout(), property, 225L, 300L, null, 1.5f, 0.84f, 1.2f, 1.0f);
        Property property2 = FrameLayout.SCALE_Y;
        gt0.m132177w(gt0.m132180z(animatorM132166l, animatorM132166l2, gt0.m132166l(get_star_layout(), property2, 225L, 300L, null, 1.5f, 0.84f, 1.2f, 1.0f), gt0.m132166l(get_superlike_layout(), property, 0L, 400L, null, 1.75f, 0.95f, 1.0f), gt0.m132166l(get_superlike_layout(), property2, 0L, 400L, null, 1.75f, 0.95f, 1.0f)), new Runnable() { // from class: l.r4h0
            @Override // java.lang.Runnable
            public final void run() {
                SuperLikeComboAnimView.m56955b(this.f161207a, isFemale);
            }
        }, new Runnable() { // from class: l.s4h0
            @Override // java.lang.Runnable
            public final void run() {
                SuperLikeComboAnimView.m56956c(this.f166238a, needShadow);
            }
        }).start();
    }

    /* JADX INFO: renamed from: l */
    public final void m56965l() {
        get_nums().m56948b(this.superLikeCount);
    }

    /* JADX INFO: renamed from: m */
    public final void m56966m() {
        get_superlike_progress().m56981c(C9073a.INSTANCE.m57008m(this.superLikeCount), this.superLikeCount);
    }

    /* JADX INFO: renamed from: n */
    public final void m56967n() {
        this.ribbonSvgaJob = xh3.m210980d(l4k.INSTANCE, r5e.m179862c(), null, new SuperLikeComboAnimView$doRibbonSvga$1(this, null), 2, null);
    }

    /* JADX INFO: renamed from: o */
    public final void m56968o(boolean needShadow) {
        int i = this.superLikeCount;
        if (i <= 3) {
            get_star().setImageResource(gbc0.f103376p2);
            if (needShadow) {
                get_shadow().setImageResource(gbc0.f103368o2);
                return;
            }
            return;
        }
        if (i <= 6) {
            get_star().setImageResource(gbc0.f103392r2);
            if (needShadow) {
                get_shadow().setImageResource(gbc0.f103384q2);
                return;
            }
            return;
        }
        get_star().setImageResource(gbc0.f103221V2);
        if (needShadow) {
            get_shadow().setImageResource(gbc0.f103214U2);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56963d(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m56969p() {
        String str;
        int i = this.superLikeCount;
        if (i == 4) {
            str = "https://auto.tancdn.com/v1/raw/65504444-da23-46e2-b084-215dc183c96113.pdf";
        } else if (i != 7) {
            str = i % 10 == 0 ? "https://auto.tancdn.com/v1/raw/2b16ff78-b4d6-401f-a849-0f77b98b544d12.pdf" : null;
        } else {
            str = "https://auto.tancdn.com/v1/raw/045e4d97-2b5b-4625-97f4-58d62ee2e22513.pdf";
        }
        if (str != null) {
            Context context = getContext();
            context.getClass();
            SVGALoader.with(context).from(str).autoPlay(true).repeatCount(1).into(get_star_svga());
        }
    }

    /* JADX INFO: renamed from: q */
    public final Object m56970q(boolean z, Continuation<? super Unit> continuation) {
        Object objCollect = fui.m127482f(fui.m127468E(fui.m127474K(fui.m127501y(fui.m127499w(new SuperLikeComboAnimView$numStartChange$2(this, null)), r5e.m179860a()), new SuperLikeComboAnimView$numStartChange$3(this, null)), new SuperLikeComboAnimView$numStartChange$4(this, z, null)), new SuperLikeComboAnimView$numStartChange$5(null)).collect(C9061a.INSTANCE, continuation);
        return objCollect == uyp.m198688e() ? objCollect : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public void m56971r(boolean guideCard, boolean needShadow, boolean isFemale) {
        this.guideCard = guideCard;
        m56972s(needShadow, true, isFemale);
        m56967n();
        m56964k(needShadow, isFemale);
    }

    /* JADX INFO: renamed from: s */
    public final void m56972s(boolean needShadow, boolean send, boolean isFemale) {
        this.block = false;
        this.superLikeCount = 0;
        get_nums().m56949c();
        get_superlike_progress().m56982d();
        get_star().setImageResource(gbc0.f103376p2);
        get_superlike_foreground().setImageResource(C9073a.INSTANCE.m57005j()[0]);
        bnl0.m105524M(get_superlike_layout(), send);
        bnl0.m105524M(get_receive_superlike_img(), !send);
        bnl0.m105524M(get_ribbon_svga(), false);
        if (!needShadow) {
            bnl0.m105524M(get_shadow(), false);
        } else {
            bnl0.m105524M(get_shadow(), true);
            get_shadow().setImageResource(gbc0.f103368o2);
        }
    }

    public final void setBlock(boolean z) {
        this.block = z;
    }

    public final void setGuideCard(boolean z) {
        this.guideCard = z;
    }

    public final void setJob(@Nullable InterfaceC15593o interfaceC15593o) {
        this.job = interfaceC15593o;
    }

    public final void setSuperLikeCount(int i) {
        this.superLikeCount = i;
    }

    public final void set_nums(@NotNull ComboNumView comboNumView) {
        comboNumView.getClass();
        this._nums = comboNumView;
    }

    public final void set_receive_superlike_img(@NotNull VImage vImage) {
        vImage.getClass();
        this._receive_superlike_img = vImage;
    }

    public final void set_ribbon_svga(@NotNull SVGAnimationView sVGAnimationView) {
        sVGAnimationView.getClass();
        this._ribbon_svga = sVGAnimationView;
    }

    public final void set_root(@NotNull RelativeLayout relativeLayout) {
        relativeLayout.getClass();
        this._root = relativeLayout;
    }

    public final void set_shadow(@NotNull VImage vImage) {
        vImage.getClass();
        this._shadow = vImage;
    }

    public final void set_star(@NotNull VImage vImage) {
        vImage.getClass();
        this._star = vImage;
    }

    public final void set_star_layout(@NotNull LinearLayout linearLayout) {
        linearLayout.getClass();
        this._star_layout = linearLayout;
    }

    public final void set_star_svga(@NotNull SVGAnimationView sVGAnimationView) {
        sVGAnimationView.getClass();
        this._star_svga = sVGAnimationView;
    }

    public final void set_stuff(@NotNull View view) {
        view.getClass();
        this._stuff = view;
    }

    public final void set_superlike_foreground(@NotNull VImage vImage) {
        vImage.getClass();
        this._superlike_foreground = vImage;
    }

    public final void set_superlike_layout(@NotNull FrameLayout frameLayout) {
        frameLayout.getClass();
        this._superlike_layout = frameLayout;
    }

    public final void set_superlike_progress(@NotNull SuperLikeComboProgressView superLikeComboProgressView) {
        superLikeComboProgressView.getClass();
        this._superlike_progress = superLikeComboProgressView;
    }

    /* JADX INFO: renamed from: t */
    public final Object m56973t(Continuation<? super Unit> continuation) {
        Object objCollect = fui.m127482f(fui.m127468E(fui.m127501y(fui.m127499w(new SuperLikeComboAnimView$scaleFlow$2(this, null)), r5e.m179860a()), new SuperLikeComboAnimView$scaleFlow$3(this, null)), new SuperLikeComboAnimView$scaleFlow$4(null)).collect(C9067b.INSTANCE, continuation);
        return objCollect == uyp.m198688e() ? objCollect : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public int m56974u() {
        this.block = true;
        get_ribbon_svga().stopAnimation(true);
        get_ribbon_svga().stepToFrame(0.0f, false);
        get_star_svga().stopAnimation(true);
        InterfaceC15593o interfaceC15593o = this.job;
        if (interfaceC15593o != null) {
            JobKt__JobKt.m94512g(interfaceC15593o, null, 1, null);
        }
        InterfaceC15593o interfaceC15593o2 = this.job;
        if (interfaceC15593o2 != null) {
            InterfaceC15593o.a.m95138a(interfaceC15593o2, null, 1, null);
        }
        InterfaceC15593o interfaceC15593o3 = this.ribbonSvgaJob;
        if (interfaceC15593o3 != null) {
            InterfaceC15593o.a.m95138a(interfaceC15593o3, null, 1, null);
        }
        int iM88486b = C15274a.m88486b(1, this.superLikeCount);
        this.superLikeCount = iM88486b;
        return this.guideCard ? C15274a.m88489e(iM88486b, 3) : iM88486b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SuperLikeComboAnimView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SuperLikeComboAnimView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SuperLikeComboAnimView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
