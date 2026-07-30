package p006l;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.appcompat.widget.AppCompatImageView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.CoreSuggested;
import com.p000p1.mobile.putong.core.biz.service.CoreMemberInnerService;
import com.p1.mobile.putong.core.data.LiveLivingCardDataWrapper;
import com.p1.mobile.putong.core.data.Voice;
import com.p1.mobile.putong.core.data.VoiceLiveTag;
import com.p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p1.mobile.putong.core.newui.home.c;
import com.p1.mobile.putong.core.newui.home.views.SuperLikeBanner;
import com.p1.mobile.putong.core.newui.home.views.SwipeLikeButton;
import com.p1.mobile.putong.core.ui.PictureView;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Room;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.bt0;
import l.mep0;
import l.t100;
import l.vwb;
import l.wsf0;
import l.xdl0;
import l.xij0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VButton;
import v.VFrame;
import v.VIcon;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000bJ\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u000bJ\u000f\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u000bJ\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u0014J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u001f\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010,R\u0016\u00100\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010,R\u0016\u00102\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u0010,R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00108\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00105R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010>\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010!R\u0016\u0010?\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010!R\u0016\u0010B\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010AR\"\u0010H\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\n\u0010D\u001a\u0004\b4\u0010E\"\u0004\bF\u0010GR\"\u0010N\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010J\u001a\u0004\b=\u0010K\"\u0004\bL\u0010MR\u0016\u0010Q\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010PR\u0018\u0010T\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010W\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001b\u0010[\u001a\u00020X8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010Y\u001a\u0004\b7\u0010ZR\u001b\u0010\\\u001a\u00020X8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bF\u0010Y\u001a\u0004\b1\u0010ZR\u001b\u0010_\u001a\u00020]8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bL\u0010Y\u001a\u0004\b:\u0010^¨\u0006`"}, d2 = {"Ll/k3v;", "", "Landroid/view/View;", "parentView", "Ll/wsf0;", "Lcom/p1/mobile/putong/core/newui/home/c;", "stack", "<init>", "(Landroid/view/View;Ll/wsf0;)V", "", "n", "()V", "Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;", "userInfo", "p", "(Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;)V", "f", "Lcom/p1/mobile/putong/data/User;", "user", "s", "(Lcom/p1/mobile/putong/data/User;)V", "w", "x", "", "angle", "v", "(F)V", "o", "", "m", "(Lcom/p1/mobile/putong/data/User;)I", "l", "a", "Landroid/view/View;", "b", "Ll/wsf0;", "getStack", "()Ll/wsf0;", "Lcom/p1/mobile/putong/core/ui/PictureView;", "c", "Lcom/p1/mobile/putong/core/ui/PictureView;", "pictureView", "Lv/VText;", "d", "Lv/VText;", "anchorName", "e", "anchorAge", "liveTitle", "g", "liveDesc", "Lv/VIcon;", "h", "Lv/VIcon;", "verificationOutIcon", "i", "verificationInnerIcon", "Lcom/p1/mobile/putong/core/newui/home/NewPictureContainerIndicator;", "j", "Lcom/p1/mobile/putong/core/newui/home/NewPictureContainerIndicator;", "imageIndicator", "k", "actionLeft", "actionRight", "Lv/VImage;", "Lv/VImage;", "vipVIcon", "Lv/VButton;", "Lv/VButton;", "()Lv/VButton;", "t", "(Lv/VButton;)V", "enterButton", "Lv/VFrame;", "Lv/VFrame;", "()Lv/VFrame;", "u", "(Lv/VFrame;)V", "topLabelFrameLayout", "Lcom/tantan/library/svga/SVGAnimationView;", "Lcom/tantan/library/svga/SVGAnimationView;", "liveSVGA", "q", "Lcom/p1/mobile/putong/data/User;", "currentUser", "r", "I", "showPictureIndex", "Lcom/p1/mobile/putong/core/newui/home/views/SwipeLikeButton;", "Lkotlin/Lazy;", "()Lcom/p1/mobile/putong/core/newui/home/views/SwipeLikeButton;", "likeButton", "dislikeButton", "Lcom/p1/mobile/putong/core/newui/home/views/SuperLikeBanner;", "()Lcom/p1/mobile/putong/core/newui/home/views/SuperLikeBanner;", "superLikeBanner", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class k3v {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final View parentView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final wsf0<View, c> stack;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public PictureView pictureView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText anchorName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText anchorAge;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText liveTitle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText liveDesc;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VIcon verificationOutIcon;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VIcon verificationInnerIcon;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public NewPictureContainerIndicator imageIndicator;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public View actionLeft;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public View actionRight;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VImage vipVIcon;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VButton enterButton;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public VFrame topLabelFrameLayout;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public SVGAnimationView liveSVGA;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public User currentUser;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public int showPictureIndex;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final Lazy likeButton;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final Lazy dislikeButton;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final Lazy superLikeBanner;

    public k3v(@NotNull View view, @NotNull wsf0<View, c> wsf0Var) {
        view.getClass();
        wsf0Var.getClass();
        this.parentView = view;
        this.stack = wsf0Var;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.likeButton = LazyKt__LazyJVMKt.a(lazyThreadSafetyMode, new Function0() { // from class: l.f3v
            public final Object invoke() {
                return k3v.m17921e(this.f11603a);
            }
        });
        this.dislikeButton = LazyKt__LazyJVMKt.a(lazyThreadSafetyMode, new Function0() { // from class: l.g3v
            public final Object invoke() {
                return k3v.m17917a(this.f13049a);
            }
        });
        this.superLikeBanner = LazyKt__LazyJVMKt.a(lazyThreadSafetyMode, new Function0() { // from class: l.h3v
            public final Object invoke() {
                return k3v.m17920d(this.f13671a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static SwipeLikeButton m17917a(k3v k3vVar) {
        SwipeLikeButton swipeLikeButtonFindViewById = k3vVar.parentView.findViewById(u4c0.f23026h7);
        swipeLikeButtonFindViewById.u("https://auto.tancdn.com/v1/raw/da3d1a53-b937-41f8-883c-c16c842ca35e11.so");
        return swipeLikeButtonFindViewById;
    }

    /* JADX INFO: renamed from: d */
    public static SuperLikeBanner m17920d(k3v k3vVar) {
        SuperLikeBanner superLikeBannerFindViewById = k3vVar.parentView.findViewById(u4c0.f23059j7);
        superLikeBannerFindViewById.h(new int[]{x2c0.f26473Z2, x2c0.f26505a3, x2c0.f26537b3, x2c0.f26569c3, x2c0.f26601d3, x2c0.f26632e3, x2c0.f26664f3, x2c0.f26696g3, x2c0.f26728h3, x2c0.f26760i3, x2c0.f26790j3, x2c0.f26822k3, x2c0.f26854l3, x2c0.f26886m3, x2c0.f26918n3, x2c0.f26950o3}, 20L);
        return superLikeBannerFindViewById;
    }

    /* JADX INFO: renamed from: e */
    public static SwipeLikeButton m17921e(k3v k3vVar) {
        SwipeLikeButton swipeLikeButtonFindViewById = k3vVar.parentView.findViewById(u4c0.f23043i7);
        swipeLikeButtonFindViewById.u("https://auto.tancdn.com/v1/raw/a982f15f-30aa-47be-9b7e-50ec88482f5311.so");
        return swipeLikeButtonFindViewById;
    }

    /* JADX INFO: renamed from: q */
    public static final void m17922q(k3v k3vVar, View view) {
        k3vVar.m17940x();
    }

    /* JADX INFO: renamed from: r */
    public static final void m17923r(k3v k3vVar, View view) {
        k3vVar.m17939w();
    }

    /* JADX INFO: renamed from: f */
    public final void m17924f() {
        if (xij0.d0()) {
            PictureView pictureView = this.pictureView;
            PictureView pictureView2 = null;
            if (pictureView == null) {
                Intrinsics.r("pictureView");
                pictureView = null;
            }
            if (NullChecker.b(pictureView)) {
                PictureView pictureView3 = this.pictureView;
                if (pictureView3 == null) {
                    Intrinsics.r("pictureView");
                    pictureView3 = null;
                }
                if (pictureView3.G instanceof Video) {
                    PictureView pictureView4 = this.pictureView;
                    if (pictureView4 == null) {
                        Intrinsics.r("pictureView");
                    } else {
                        pictureView2 = pictureView4;
                    }
                    pictureView2.V();
                }
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final SwipeLikeButton m17925g() {
        Object value = this.dislikeButton.getValue();
        value.getClass();
        return (SwipeLikeButton) value;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final VButton m17926h() {
        VButton vButton = this.enterButton;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.r("enterButton");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final SwipeLikeButton m17927i() {
        Object value = this.likeButton.getValue();
        value.getClass();
        return (SwipeLikeButton) value;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final SuperLikeBanner m17928j() {
        Object value = this.superLikeBanner.getValue();
        value.getClass();
        return (SuperLikeBanner) value;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VFrame m17929k() {
        VFrame vFrame = this.topLabelFrameLayout;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.r("topLabelFrameLayout");
        return null;
    }

    @DrawableRes
    /* JADX INFO: renamed from: l */
    public final int m17930l(User user) {
        if (user.isPicVerificationVerified()) {
            return x2c0.f26039L2;
        }
        return 0;
    }

    @DrawableRes
    /* JADX INFO: renamed from: m */
    public final int m17931m(User user) {
        if (user.isPicVerificationVerified()) {
            return x2c0.f26070M2;
        }
        return 0;
    }

    /* JADX INFO: renamed from: n */
    public final void m17932n() {
        mep0.d1(this.parentView, t100.d(20.0f));
        VText vTextFindViewById = this.parentView.findViewById(u4c0.f22549F);
        vTextFindViewById.getClass();
        this.anchorName = vTextFindViewById;
        VText vTextFindViewById2 = this.parentView.findViewById(u4c0.f22532E);
        vTextFindViewById2.getClass();
        this.anchorAge = vTextFindViewById2;
        VText vTextFindViewById3 = this.parentView.findViewById(u4c0.f23195r7);
        vTextFindViewById3.getClass();
        this.liveTitle = vTextFindViewById3;
        VText vTextFindViewById4 = this.parentView.findViewById(u4c0.f23212s7);
        vTextFindViewById4.getClass();
        this.liveDesc = vTextFindViewById4;
        VIcon vIconFindViewById = this.parentView.findViewById(u4c0.f22898Ze);
        vIconFindViewById.getClass();
        this.verificationOutIcon = vIconFindViewById;
        VIcon vIconFindViewById2 = this.parentView.findViewById(u4c0.f22882Ye);
        vIconFindViewById2.getClass();
        this.verificationInnerIcon = vIconFindViewById2;
        View viewFindViewById = this.parentView.findViewById(u4c0.f22502C3);
        viewFindViewById.getClass();
        m17936t((VButton) viewFindViewById);
        SVGAnimationView sVGAnimationViewFindViewById = this.parentView.findViewById(u4c0.f23161p7);
        sVGAnimationViewFindViewById.getClass();
        this.liveSVGA = sVGAnimationViewFindViewById;
        PictureView pictureViewFindViewById = this.parentView.findViewById(u4c0.f22657L5);
        pictureViewFindViewById.getClass();
        this.pictureView = pictureViewFindViewById;
        NewPictureContainerIndicator newPictureContainerIndicatorFindViewById = this.parentView.findViewById(u4c0.f22923b6);
        newPictureContainerIndicatorFindViewById.getClass();
        this.imageIndicator = newPictureContainerIndicatorFindViewById;
        View viewFindViewById2 = this.parentView.findViewById(u4c0.f22933c);
        viewFindViewById2.getClass();
        this.actionLeft = viewFindViewById2;
        View viewFindViewById3 = this.parentView.findViewById(u4c0.f22950d);
        viewFindViewById3.getClass();
        this.actionRight = viewFindViewById3;
        View viewFindViewById4 = this.parentView.findViewById(u4c0.f23243u4);
        viewFindViewById4.getClass();
        m17937u((VFrame) viewFindViewById4);
        VImage vImageFindViewById = this.parentView.findViewById(u4c0.f23220sf);
        vImageFindViewById.getClass();
        this.vipVIcon = vImageFindViewById;
        mep0.d1(m17926h(), t100.d(16.0f));
        View view = this.verificationOutIcon;
        View view2 = null;
        if (view == null) {
            Intrinsics.r("verificationOutIcon");
            view = null;
        }
        xdl0.M(view, false);
        View view3 = this.verificationInnerIcon;
        if (view3 == null) {
            Intrinsics.r("verificationInnerIcon");
        } else {
            view2 = view3;
        }
        xdl0.M(view2, false);
    }

    /* JADX INFO: renamed from: o */
    public final void m17933o(User user) {
        int iM17931m = m17931m(user);
        int iM17930l = m17930l(user);
        AppCompatImageView appCompatImageView = null;
        if (iM17931m == 0 || iM17930l == 0) {
            View view = this.verificationOutIcon;
            if (view == null) {
                Intrinsics.r("verificationOutIcon");
                view = null;
            }
            xdl0.M(view, false);
            AppCompatImageView appCompatImageView2 = this.verificationInnerIcon;
            if (appCompatImageView2 == null) {
                Intrinsics.r("verificationInnerIcon");
            } else {
                appCompatImageView = appCompatImageView2;
            }
            xdl0.M(appCompatImageView, false);
            return;
        }
        View view2 = this.verificationOutIcon;
        if (view2 == null) {
            Intrinsics.r("verificationOutIcon");
            view2 = null;
        }
        xdl0.M(view2, true);
        View view3 = this.verificationInnerIcon;
        if (view3 == null) {
            Intrinsics.r("verificationInnerIcon");
            view3 = null;
        }
        xdl0.M(view3, true);
        AppCompatImageView appCompatImageView3 = this.verificationInnerIcon;
        if (appCompatImageView3 == null) {
            Intrinsics.r("verificationInnerIcon");
            appCompatImageView3 = null;
        }
        appCompatImageView3.setImageResource(iM17930l);
        AppCompatImageView appCompatImageView4 = this.verificationOutIcon;
        if (appCompatImageView4 == null) {
            Intrinsics.r("verificationOutIcon");
        } else {
            appCompatImageView = appCompatImageView4;
        }
        appCompatImageView.setImageResource(iM17931m);
    }

    /* JADX INFO: renamed from: p */
    public final void m17934p(@NotNull CoreSuggested.UserInfo userInfo) {
        User user;
        Room room;
        userInfo.getClass();
        SVGAnimationView sVGAnimationView = this.liveSVGA;
        View view = null;
        if (sVGAnimationView == null) {
            Intrinsics.r("liveSVGA");
            sVGAnimationView = null;
        }
        if (!sVGAnimationView.isAnimating()) {
            Context context = this.parentView.getContext();
            context.getClass();
            SVGALoader.SVGARequestBuilder sVGARequestBuilderFrom = SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/d5238bf5-42b4-400f-b6a2-0b56e9086b1a11.pdf");
            SVGAnimationView sVGAnimationView2 = this.liveSVGA;
            if (sVGAnimationView2 == null) {
                Intrinsics.r("liveSVGA");
                sVGAnimationView2 = null;
            }
            sVGARequestBuilderFrom.into(sVGAnimationView2);
        }
        xdl0.M0(m17927i(), false);
        xdl0.M0(m17925g(), false);
        xdl0.M0(m17928j(), false);
        LiveLivingCardDataWrapper liveLivingCardDataWrapper = userInfo.liveLivingCardDataWrapper;
        if (liveLivingCardDataWrapper == null || (user = liveLivingCardDataWrapper.getUser()) == null) {
            return;
        }
        this.currentUser = user;
        TextView textView = this.anchorName;
        if (textView == null) {
            Intrinsics.r("anchorName");
            textView = null;
        }
        textView.setText(user.name);
        TextView textView2 = this.anchorAge;
        if (textView2 == null) {
            Intrinsics.r("anchorAge");
            textView2 = null;
        }
        textView2.setText(String.valueOf(user.age.intValue()));
        View view2 = this.anchorAge;
        if (view2 == null) {
            Intrinsics.r("anchorAge");
            view2 = null;
        }
        xdl0.M(view2, !user.isHideAgeFromSVip());
        m17933o(user);
        m17935s(user);
        Voice currentVoice = liveLivingCardDataWrapper.getCurrentVoice();
        String str = (currentVoice == null || (room = currentVoice.room) == null) ? null : room.title;
        TextView textView3 = this.liveTitle;
        if (textView3 == null) {
            Intrinsics.r("liveTitle");
            textView3 = null;
        }
        textView3.setText(str);
        Voice currentVoice2 = liveLivingCardDataWrapper.getCurrentVoice();
        if (currentVoice2 != null) {
            List list = currentVoice2.liveAttributeTags;
            list.getClass();
            if (list.isEmpty()) {
                View view3 = this.vipVIcon;
                if (view3 == null) {
                    Intrinsics.r("vipVIcon");
                    view3 = null;
                }
                int visibility = view3.getVisibility();
                View view4 = this.liveDesc;
                if (visibility == 0) {
                    if (view4 == null) {
                        Intrinsics.r("liveDesc");
                        view4 = null;
                    }
                    xdl0.M0(view4, false);
                } else {
                    if (view4 == null) {
                        Intrinsics.r("liveDesc");
                        view4 = null;
                    }
                    xdl0.M(view4, false);
                }
            } else {
                TextView textView4 = this.liveDesc;
                if (textView4 == null) {
                    Intrinsics.r("liveDesc");
                    textView4 = null;
                }
                textView4.setText(((VoiceLiveTag) currentVoice2.liveAttributeTags.get(0)).text);
                View view5 = this.liveDesc;
                if (view5 == null) {
                    Intrinsics.r("liveDesc");
                    view5 = null;
                }
                xdl0.M(view5, true);
            }
        }
        if (!vwb.J(user.pictures) && user.pictures.size() > 0) {
            View view6 = this.imageIndicator;
            if (view6 == null) {
                Intrinsics.r("imageIndicator");
                view6 = null;
            }
            xdl0.M(view6, user.pictures.size() > 1);
            NewPictureContainerIndicator newPictureContainerIndicator = this.imageIndicator;
            if (newPictureContainerIndicator == null) {
                Intrinsics.r("imageIndicator");
                newPictureContainerIndicator = null;
            }
            newPictureContainerIndicator.setIndicatorCount(user.pictures.size());
            NewPictureContainerIndicator newPictureContainerIndicator2 = this.imageIndicator;
            if (newPictureContainerIndicator2 == null) {
                Intrinsics.r("imageIndicator");
                newPictureContainerIndicator2 = null;
            }
            newPictureContainerIndicator2.setSelectedIndex(this.showPictureIndex);
            PictureView pictureView = this.pictureView;
            if (pictureView == null) {
                Intrinsics.r("pictureView");
                pictureView = null;
            }
            pictureView.L(true, false, true, true);
            PictureView pictureView2 = this.pictureView;
            if (pictureView2 == null) {
                Intrinsics.r("pictureView");
                pictureView2 = null;
            }
            pictureView2.X((Media) user.pictures.get(this.showPictureIndex));
            m17924f();
        }
        View view7 = this.actionLeft;
        if (view7 == null) {
            Intrinsics.r("actionLeft");
            view7 = null;
        }
        xdl0.E0(view7, new View.OnClickListener() { // from class: l.i3v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view8) {
                k3v.m17922q(this.f14220a, view8);
            }
        });
        View view8 = this.actionRight;
        if (view8 == null) {
            Intrinsics.r("actionRight");
        } else {
            view = view8;
        }
        xdl0.E0(view, new View.OnClickListener() { // from class: l.j3v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view9) {
                k3v.m17923r(this.f14990a, view9);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final void m17935s(User user) {
        ImageView imageView = null;
        if (user.isMe() && user.isHideIconFromSVipWithMe()) {
            ImageView imageView2 = this.vipVIcon;
            if (imageView2 == null) {
                Intrinsics.r("vipVIcon");
            } else {
                imageView = imageView2;
            }
            xdl0.M(imageView, false);
            return;
        }
        View view = this.vipVIcon;
        if (view == null) {
            Intrinsics.r("vipVIcon");
            view = null;
        }
        xdl0.M(view, true);
        CoreMemberInnerService coreMemberInnerServiceM11709e = CoreModule.m1854P().m11709e();
        ImageView imageView3 = this.vipVIcon;
        if (imageView3 == null) {
            Intrinsics.r("vipVIcon");
        } else {
            imageView = imageView3;
        }
        coreMemberInnerServiceM11709e.m6924ro(user, imageView);
    }

    /* JADX INFO: renamed from: t */
    public final void m17936t(@NotNull VButton vButton) {
        vButton.getClass();
        this.enterButton = vButton;
    }

    /* JADX INFO: renamed from: u */
    public final void m17937u(@NotNull VFrame vFrame) {
        vFrame.getClass();
        this.topLabelFrameLayout = vFrame;
    }

    /* JADX INFO: renamed from: v */
    public final void m17938v(float angle) {
        View viewD = this.stack.d();
        if (viewD != null) {
            viewD.setPivotX(viewD.getWidth() / 2.0f);
            viewD.setPivotY(viewD.getHeight() / 2.0f);
            bt0.n(viewD, View.ROTATION_Y, new float[]{0.0f, angle, 0.0f}).setDuration(200L).start();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m17939w() {
        User user = this.currentUser;
        if (user != null) {
            int size = this.showPictureIndex + 1;
            if (size > user.pictures.size() - 1) {
                size = user.pictures.size() - 1;
            }
            if (this.showPictureIndex == size) {
                m17938v(1.5f);
                return;
            }
            this.showPictureIndex = size;
            PictureView pictureView = this.pictureView;
            NewPictureContainerIndicator newPictureContainerIndicator = null;
            if (pictureView == null) {
                Intrinsics.r("pictureView");
                pictureView = null;
            }
            pictureView.x(true);
            PictureView pictureView2 = this.pictureView;
            if (pictureView2 == null) {
                Intrinsics.r("pictureView");
                pictureView2 = null;
            }
            pictureView2.X((Media) user.pictures.get(this.showPictureIndex));
            NewPictureContainerIndicator newPictureContainerIndicator2 = this.imageIndicator;
            if (newPictureContainerIndicator2 == null) {
                Intrinsics.r("imageIndicator");
            } else {
                newPictureContainerIndicator = newPictureContainerIndicator2;
            }
            newPictureContainerIndicator.b(this.showPictureIndex);
            m17924f();
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m17940x() {
        User user = this.currentUser;
        if (user != null) {
            int i = this.showPictureIndex;
            int i2 = i - 1;
            if (i2 < 0) {
                i2 = 0;
            }
            if (i == i2) {
                m17938v(-1.5f);
                return;
            }
            this.showPictureIndex = i2;
            PictureView pictureView = this.pictureView;
            NewPictureContainerIndicator newPictureContainerIndicator = null;
            if (pictureView == null) {
                Intrinsics.r("pictureView");
                pictureView = null;
            }
            pictureView.x(true);
            PictureView pictureView2 = this.pictureView;
            if (pictureView2 == null) {
                Intrinsics.r("pictureView");
                pictureView2 = null;
            }
            pictureView2.X((Media) user.pictures.get(this.showPictureIndex));
            NewPictureContainerIndicator newPictureContainerIndicator2 = this.imageIndicator;
            if (newPictureContainerIndicator2 == null) {
                Intrinsics.r("imageIndicator");
            } else {
                newPictureContainerIndicator = newPictureContainerIndicator2;
            }
            newPictureContainerIndicator.b(this.showPictureIndex);
            m17924f();
        }
    }
}
