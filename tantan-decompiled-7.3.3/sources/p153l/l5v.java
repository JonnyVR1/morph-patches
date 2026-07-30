package p153l;

import android.content.Context;
import android.view.View;
import androidx.annotation.DrawableRes;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.biz.service.CoreMemberInnerService;
import com.p051p1.mobile.putong.core.data.LiveLivingCardDataWrapper;
import com.p051p1.mobile.putong.core.data.Voice;
import com.p051p1.mobile.putong.core.data.VoiceLiveTag;
import com.p051p1.mobile.putong.core.newui.home.C8094c;
import com.p051p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p051p1.mobile.putong.core.newui.home.views.SuperLikeBanner;
import com.p051p1.mobile.putong.core.newui.home.views.SwipeLikeButton;
import com.p051p1.mobile.putong.core.p058ui.PictureView;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.Room;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VButton;
import p151v.VFrame;
import p151v.VIcon;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000bJ\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u000bJ\u000f\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u000bJ\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u0014J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u001f\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010,R\u0016\u00100\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010,R\u0016\u00102\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u0010,R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00108\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00105R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010>\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010!R\u0016\u0010?\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010!R\u0016\u0010B\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010AR\"\u0010H\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\n\u0010D\u001a\u0004\b4\u0010E\"\u0004\bF\u0010GR\"\u0010N\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010J\u001a\u0004\b=\u0010K\"\u0004\bL\u0010MR\u0016\u0010Q\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010PR\u0018\u0010T\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010W\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001b\u0010[\u001a\u00020X8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010Y\u001a\u0004\b7\u0010ZR\u001b\u0010\\\u001a\u00020X8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bF\u0010Y\u001a\u0004\b1\u0010ZR\u001b\u0010_\u001a\u00020]8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bL\u0010Y\u001a\u0004\b:\u0010^¨\u0006`"}, m88121d2 = {"Ll/l5v;", "", "Landroid/view/View;", "parentView", "Ll/f1g0;", "Lcom/p1/mobile/putong/core/newui/home/c;", "stack", "<init>", "(Landroid/view/View;Ll/f1g0;)V", "", "n", "()V", "Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;", "userInfo", "p", "(Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;)V", "f", "Lcom/p1/mobile/putong/data/User;", "user", BLiveStormDanmakuGiftResourceType.f45294s, "(Lcom/p1/mobile/putong/data/User;)V", "w", BaseSei.f14624X, "", "angle", ResourceDirection.f39656v, "(F)V", "o", "", "m", "(Lcom/p1/mobile/putong/data/User;)I", BLiveStormDanmakuGiftResourceType.f45292l, "a", "Landroid/view/View;", "b", "Ll/f1g0;", "getStack", "()Ll/f1g0;", "Lcom/p1/mobile/putong/core/ui/PictureView;", "c", "Lcom/p1/mobile/putong/core/ui/PictureView;", "pictureView", "Lv/VText;", Constants.INAPP_DATA_TAG, "Lv/VText;", "anchorName", "e", "anchorAge", "liveTitle", "g", "liveDesc", "Lv/VIcon;", "h", "Lv/VIcon;", "verificationOutIcon", RXScreenCaptureService.KEY_INDEX, "verificationInnerIcon", "Lcom/p1/mobile/putong/core/newui/home/NewPictureContainerIndicator;", "j", "Lcom/p1/mobile/putong/core/newui/home/NewPictureContainerIndicator;", "imageIndicator", "k", "actionLeft", "actionRight", "Lv/VImage;", "Lv/VImage;", "vipVIcon", "Lv/VButton;", "Lv/VButton;", "()Lv/VButton;", Constants.KEY_T, "(Lv/VButton;)V", "enterButton", "Lv/VFrame;", "Lv/VFrame;", "()Lv/VFrame;", "u", "(Lv/VFrame;)V", "topLabelFrameLayout", "Lcom/tantan/library/svga/SVGAnimationView;", "Lcom/tantan/library/svga/SVGAnimationView;", "liveSVGA", "q", "Lcom/p1/mobile/putong/data/User;", "currentUser", "r", "I", "showPictureIndex", "Lcom/p1/mobile/putong/core/newui/home/views/SwipeLikeButton;", "Lkotlin/Lazy;", "()Lcom/p1/mobile/putong/core/newui/home/views/SwipeLikeButton;", "likeButton", "dislikeButton", "Lcom/p1/mobile/putong/core/newui/home/views/SuperLikeBanner;", "()Lcom/p1/mobile/putong/core/newui/home/views/SuperLikeBanner;", "superLikeBanner", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class l5v {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final View parentView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final f1g0<View, C8094c> stack;

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

    public l5v(@NotNull View view, @NotNull f1g0<View, C8094c> f1g0Var) {
        view.getClass();
        f1g0Var.getClass();
        this.parentView = view;
        this.stack = f1g0Var;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.likeButton = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.g5v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l5v.m152984e(this.f102361a);
            }
        });
        this.dislikeButton = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.h5v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l5v.m152980a(this.f107979a);
            }
        });
        this.superLikeBanner = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.i5v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l5v.m152983d(this.f113099a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static SwipeLikeButton m152980a(l5v l5vVar) {
        SwipeLikeButton swipeLikeButton = (SwipeLikeButton) l5vVar.parentView.findViewById(adc0.f70402j7);
        swipeLikeButton.m40214u("https://auto.tancdn.com/v1/raw/da3d1a53-b937-41f8-883c-c16c842ca35e11.so");
        return swipeLikeButton;
    }

    /* JADX INFO: renamed from: d */
    public static SuperLikeBanner m152983d(l5v l5vVar) {
        SuperLikeBanner superLikeBanner = (SuperLikeBanner) l5vVar.parentView.findViewById(adc0.f70436l7);
        superLikeBanner.m40204h(new int[]{dbc0.f86812a3, dbc0.f86845b3, dbc0.f86878c3, dbc0.f86911d3, dbc0.f86943e3, dbc0.f86976f3, dbc0.f87009g3, dbc0.f87042h3, dbc0.f87075i3, dbc0.f87106j3, dbc0.f87139k3, dbc0.f87172l3, dbc0.f87205m3, dbc0.f87238n3, dbc0.f87271o3, dbc0.f87304p3}, 20L);
        return superLikeBanner;
    }

    /* JADX INFO: renamed from: e */
    public static SwipeLikeButton m152984e(l5v l5vVar) {
        SwipeLikeButton swipeLikeButton = (SwipeLikeButton) l5vVar.parentView.findViewById(adc0.f70419k7);
        swipeLikeButton.m40214u("https://auto.tancdn.com/v1/raw/a982f15f-30aa-47be-9b7e-50ec88482f5311.so");
        return swipeLikeButton;
    }

    /* JADX INFO: renamed from: q */
    public static final void m152985q(l5v l5vVar, View view) {
        l5vVar.m153003x();
    }

    /* JADX INFO: renamed from: r */
    public static final void m152986r(l5v l5vVar, View view) {
        l5vVar.m153002w();
    }

    /* JADX INFO: renamed from: f */
    public final void m152987f() {
        if (asj0.m99935d0()) {
            PictureView pictureView = this.pictureView;
            PictureView pictureView2 = null;
            if (pictureView == null) {
                Intrinsics.m88391r("pictureView");
                pictureView = null;
            }
            if (NullChecker.m82487b(pictureView)) {
                PictureView pictureView3 = this.pictureView;
                if (pictureView3 == null) {
                    Intrinsics.m88391r("pictureView");
                    pictureView3 = null;
                }
                if (pictureView3.f28888G instanceof Video) {
                    PictureView pictureView4 = this.pictureView;
                    if (pictureView4 == null) {
                        Intrinsics.m88391r("pictureView");
                    } else {
                        pictureView2 = pictureView4;
                    }
                    pictureView2.m45174V();
                }
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final SwipeLikeButton m152988g() {
        Object value = this.dislikeButton.getValue();
        value.getClass();
        return (SwipeLikeButton) value;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final VButton m152989h() {
        VButton vButton = this.enterButton;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("enterButton");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final SwipeLikeButton m152990i() {
        Object value = this.likeButton.getValue();
        value.getClass();
        return (SwipeLikeButton) value;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final SuperLikeBanner m152991j() {
        Object value = this.superLikeBanner.getValue();
        value.getClass();
        return (SuperLikeBanner) value;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VFrame m152992k() {
        VFrame vFrame = this.topLabelFrameLayout;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m88391r("topLabelFrameLayout");
        return null;
    }

    @DrawableRes
    /* JADX INFO: renamed from: l */
    public final int m152993l(User user) {
        if (user.isPicVerificationVerified()) {
            return dbc0.f86363M2;
        }
        return 0;
    }

    @DrawableRes
    /* JADX INFO: renamed from: m */
    public final int m152994m(User user) {
        if (user.isPicVerificationVerified()) {
            return dbc0.f86395N2;
        }
        return 0;
    }

    /* JADX INFO: renamed from: n */
    public final void m152995n() {
        qnp0.m177261d1(this.parentView, qa00.m175859d(20.0f));
        View viewFindViewById = this.parentView.findViewById(adc0.f69889F);
        viewFindViewById.getClass();
        this.anchorName = (VText) viewFindViewById;
        View viewFindViewById2 = this.parentView.findViewById(adc0.f69872E);
        viewFindViewById2.getClass();
        this.anchorAge = (VText) viewFindViewById2;
        View viewFindViewById3 = this.parentView.findViewById(adc0.f70572t7);
        viewFindViewById3.getClass();
        this.liveTitle = (VText) viewFindViewById3;
        View viewFindViewById4 = this.parentView.findViewById(adc0.f70589u7);
        viewFindViewById4.getClass();
        this.liveDesc = (VText) viewFindViewById4;
        View viewFindViewById5 = this.parentView.findViewById(adc0.f70292cf);
        viewFindViewById5.getClass();
        this.verificationOutIcon = (VIcon) viewFindViewById5;
        View viewFindViewById6 = this.parentView.findViewById(adc0.f70275bf);
        viewFindViewById6.getClass();
        this.verificationInnerIcon = (VIcon) viewFindViewById6;
        View viewFindViewById7 = this.parentView.findViewById(adc0.f69876E3);
        viewFindViewById7.getClass();
        m152999t((VButton) viewFindViewById7);
        View viewFindViewById8 = this.parentView.findViewById(adc0.f70538r7);
        viewFindViewById8.getClass();
        this.liveSVGA = (SVGAnimationView) viewFindViewById8;
        View viewFindViewById9 = this.parentView.findViewById(adc0.f70031N5);
        viewFindViewById9.getClass();
        this.pictureView = (PictureView) viewFindViewById9;
        View viewFindViewById10 = this.parentView.findViewById(adc0.f70300d6);
        viewFindViewById10.getClass();
        this.imageIndicator = (NewPictureContainerIndicator) viewFindViewById10;
        View viewFindViewById11 = this.parentView.findViewById(adc0.f70276c);
        viewFindViewById11.getClass();
        this.actionLeft = viewFindViewById11;
        View viewFindViewById12 = this.parentView.findViewById(adc0.f70293d);
        viewFindViewById12.getClass();
        this.actionRight = viewFindViewById12;
        View viewFindViewById13 = this.parentView.findViewById(adc0.f70620w4);
        viewFindViewById13.getClass();
        m153000u((VFrame) viewFindViewById13);
        View viewFindViewById14 = this.parentView.findViewById(adc0.f70614vf);
        viewFindViewById14.getClass();
        this.vipVIcon = (VImage) viewFindViewById14;
        qnp0.m177261d1(m152989h(), qa00.m175859d(16.0f));
        VIcon vIcon = this.verificationOutIcon;
        VIcon vIcon2 = null;
        if (vIcon == null) {
            Intrinsics.m88391r("verificationOutIcon");
            vIcon = null;
        }
        bnl0.m105524M(vIcon, false);
        VIcon vIcon3 = this.verificationInnerIcon;
        if (vIcon3 == null) {
            Intrinsics.m88391r("verificationInnerIcon");
        } else {
            vIcon2 = vIcon3;
        }
        bnl0.m105524M(vIcon2, false);
    }

    /* JADX INFO: renamed from: o */
    public final void m152996o(User user) {
        int iM152994m = m152994m(user);
        int iM152993l = m152993l(user);
        VIcon vIcon = null;
        if (iM152994m == 0 || iM152993l == 0) {
            VIcon vIcon2 = this.verificationOutIcon;
            if (vIcon2 == null) {
                Intrinsics.m88391r("verificationOutIcon");
                vIcon2 = null;
            }
            bnl0.m105524M(vIcon2, false);
            VIcon vIcon3 = this.verificationInnerIcon;
            if (vIcon3 == null) {
                Intrinsics.m88391r("verificationInnerIcon");
            } else {
                vIcon = vIcon3;
            }
            bnl0.m105524M(vIcon, false);
            return;
        }
        VIcon vIcon4 = this.verificationOutIcon;
        if (vIcon4 == null) {
            Intrinsics.m88391r("verificationOutIcon");
            vIcon4 = null;
        }
        bnl0.m105524M(vIcon4, true);
        VIcon vIcon5 = this.verificationInnerIcon;
        if (vIcon5 == null) {
            Intrinsics.m88391r("verificationInnerIcon");
            vIcon5 = null;
        }
        bnl0.m105524M(vIcon5, true);
        VIcon vIcon6 = this.verificationInnerIcon;
        if (vIcon6 == null) {
            Intrinsics.m88391r("verificationInnerIcon");
            vIcon6 = null;
        }
        vIcon6.setImageResource(iM152993l);
        VIcon vIcon7 = this.verificationOutIcon;
        if (vIcon7 == null) {
            Intrinsics.m88391r("verificationOutIcon");
        } else {
            vIcon = vIcon7;
        }
        vIcon.setImageResource(iM152994m);
    }

    /* JADX INFO: renamed from: p */
    public final void m152997p(@NotNull CoreSuggested.UserInfo userInfo) {
        User user;
        Room room;
        userInfo.getClass();
        SVGAnimationView sVGAnimationView = this.liveSVGA;
        View view = null;
        if (sVGAnimationView == null) {
            Intrinsics.m88391r("liveSVGA");
            sVGAnimationView = null;
        }
        if (!sVGAnimationView.isAnimating()) {
            Context context = this.parentView.getContext();
            context.getClass();
            SVGALoader.SVGARequestBuilder sVGARequestBuilderFrom = SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/d5238bf5-42b4-400f-b6a2-0b56e9086b1a11.pdf");
            SVGAnimationView sVGAnimationView2 = this.liveSVGA;
            if (sVGAnimationView2 == null) {
                Intrinsics.m88391r("liveSVGA");
                sVGAnimationView2 = null;
            }
            sVGARequestBuilderFrom.into(sVGAnimationView2);
        }
        bnl0.m105525M0(m152990i(), false);
        bnl0.m105525M0(m152988g(), false);
        bnl0.m105525M0(m152991j(), false);
        LiveLivingCardDataWrapper liveLivingCardDataWrapper = userInfo.liveLivingCardDataWrapper;
        if (liveLivingCardDataWrapper == null || (user = liveLivingCardDataWrapper.getUser()) == null) {
            return;
        }
        this.currentUser = user;
        VText vText = this.anchorName;
        if (vText == null) {
            Intrinsics.m88391r("anchorName");
            vText = null;
        }
        vText.setText(user.name);
        VText vText2 = this.anchorAge;
        if (vText2 == null) {
            Intrinsics.m88391r("anchorAge");
            vText2 = null;
        }
        vText2.setText(String.valueOf(user.age.intValue()));
        VText vText3 = this.anchorAge;
        if (vText3 == null) {
            Intrinsics.m88391r("anchorAge");
            vText3 = null;
        }
        bnl0.m105524M(vText3, !user.isHideAgeFromSVip());
        m152996o(user);
        m152998s(user);
        Voice currentVoice = liveLivingCardDataWrapper.getCurrentVoice();
        String str = (currentVoice == null || (room = currentVoice.room) == null) ? null : room.title;
        VText vText4 = this.liveTitle;
        if (vText4 == null) {
            Intrinsics.m88391r("liveTitle");
            vText4 = null;
        }
        vText4.setText(str);
        Voice currentVoice2 = liveLivingCardDataWrapper.getCurrentVoice();
        if (currentVoice2 != null) {
            List<VoiceLiveTag> list = currentVoice2.liveAttributeTags;
            list.getClass();
            if (list.isEmpty()) {
                VImage vImage = this.vipVIcon;
                if (vImage == null) {
                    Intrinsics.m88391r("vipVIcon");
                    vImage = null;
                }
                int visibility = vImage.getVisibility();
                VText vText5 = this.liveDesc;
                if (visibility == 0) {
                    if (vText5 == null) {
                        Intrinsics.m88391r("liveDesc");
                        vText5 = null;
                    }
                    bnl0.m105525M0(vText5, false);
                } else {
                    if (vText5 == null) {
                        Intrinsics.m88391r("liveDesc");
                        vText5 = null;
                    }
                    bnl0.m105524M(vText5, false);
                }
            } else {
                VText vText6 = this.liveDesc;
                if (vText6 == null) {
                    Intrinsics.m88391r("liveDesc");
                    vText6 = null;
                }
                vText6.setText(currentVoice2.liveAttributeTags.get(0).text);
                VText vText7 = this.liveDesc;
                if (vText7 == null) {
                    Intrinsics.m88391r("liveDesc");
                    vText7 = null;
                }
                bnl0.m105524M(vText7, true);
            }
        }
        if (!jyb.m147479J(user.pictures) && user.pictures.size() > 0) {
            NewPictureContainerIndicator newPictureContainerIndicator = this.imageIndicator;
            if (newPictureContainerIndicator == null) {
                Intrinsics.m88391r("imageIndicator");
                newPictureContainerIndicator = null;
            }
            bnl0.m105524M(newPictureContainerIndicator, user.pictures.size() > 1);
            NewPictureContainerIndicator newPictureContainerIndicator2 = this.imageIndicator;
            if (newPictureContainerIndicator2 == null) {
                Intrinsics.m88391r("imageIndicator");
                newPictureContainerIndicator2 = null;
            }
            newPictureContainerIndicator2.setIndicatorCount(user.pictures.size());
            NewPictureContainerIndicator newPictureContainerIndicator3 = this.imageIndicator;
            if (newPictureContainerIndicator3 == null) {
                Intrinsics.m88391r("imageIndicator");
                newPictureContainerIndicator3 = null;
            }
            newPictureContainerIndicator3.setSelectedIndex(this.showPictureIndex);
            PictureView pictureView = this.pictureView;
            if (pictureView == null) {
                Intrinsics.m88391r("pictureView");
                pictureView = null;
            }
            pictureView.m45167L(true, false, true, true);
            PictureView pictureView2 = this.pictureView;
            if (pictureView2 == null) {
                Intrinsics.m88391r("pictureView");
                pictureView2 = null;
            }
            pictureView2.m45176X(user.pictures.get(this.showPictureIndex));
            m152987f();
        }
        View view2 = this.actionLeft;
        if (view2 == null) {
            Intrinsics.m88391r("actionLeft");
            view2 = null;
        }
        bnl0.m105509E0(view2, new View.OnClickListener() { // from class: l.j5v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                l5v.m152985q(this.f118501a, view3);
            }
        });
        View view3 = this.actionRight;
        if (view3 == null) {
            Intrinsics.m88391r("actionRight");
        } else {
            view = view3;
        }
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.k5v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                l5v.m152986r(this.f124129a, view4);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final void m152998s(User user) {
        VImage vImage = null;
        if (user.isMe() && user.isHideIconFromSVipWithMe()) {
            VImage vImage2 = this.vipVIcon;
            if (vImage2 == null) {
                Intrinsics.m88391r("vipVIcon");
            } else {
                vImage = vImage2;
            }
            bnl0.m105524M(vImage, false);
            return;
        }
        VImage vImage3 = this.vipVIcon;
        if (vImage3 == null) {
            Intrinsics.m88391r("vipVIcon");
            vImage3 = null;
        }
        bnl0.m105524M(vImage3, true);
        CoreMemberInnerService coreMemberInnerServiceM143408e = CoreModule.m30933P().m143408e();
        VImage vImage4 = this.vipVIcon;
        if (vImage4 == null) {
            Intrinsics.m88391r("vipVIcon");
        } else {
            vImage = vImage4;
        }
        coreMemberInnerServiceM143408e.mo35990ro(user, vImage);
    }

    /* JADX INFO: renamed from: t */
    public final void m152999t(@NotNull VButton vButton) {
        vButton.getClass();
        this.enterButton = vButton;
    }

    /* JADX INFO: renamed from: u */
    public final void m153000u(@NotNull VFrame vFrame) {
        vFrame.getClass();
        this.topLabelFrameLayout = vFrame;
    }

    /* JADX INFO: renamed from: v */
    public final void m153001v(float angle) {
        View viewMo39812d = this.stack.mo39812d();
        if (viewMo39812d != null) {
            viewMo39812d.setPivotX(viewMo39812d.getWidth() / 2.0f);
            viewMo39812d.setPivotY(viewMo39812d.getHeight() / 2.0f);
            gt0.m132168n(viewMo39812d, View.ROTATION_Y, 0.0f, angle, 0.0f).setDuration(200L).start();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m153002w() {
        User user = this.currentUser;
        if (user != null) {
            int size = this.showPictureIndex + 1;
            if (size > user.pictures.size() - 1) {
                size = user.pictures.size() - 1;
            }
            if (this.showPictureIndex == size) {
                m153001v(1.5f);
                return;
            }
            this.showPictureIndex = size;
            PictureView pictureView = this.pictureView;
            NewPictureContainerIndicator newPictureContainerIndicator = null;
            if (pictureView == null) {
                Intrinsics.m88391r("pictureView");
                pictureView = null;
            }
            pictureView.m45194x(true);
            PictureView pictureView2 = this.pictureView;
            if (pictureView2 == null) {
                Intrinsics.m88391r("pictureView");
                pictureView2 = null;
            }
            pictureView2.m45176X(user.pictures.get(this.showPictureIndex));
            NewPictureContainerIndicator newPictureContainerIndicator2 = this.imageIndicator;
            if (newPictureContainerIndicator2 == null) {
                Intrinsics.m88391r("imageIndicator");
            } else {
                newPictureContainerIndicator = newPictureContainerIndicator2;
            }
            newPictureContainerIndicator.m37958b(this.showPictureIndex);
            m152987f();
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m153003x() {
        User user = this.currentUser;
        if (user != null) {
            int i = this.showPictureIndex;
            int i2 = i - 1;
            if (i2 < 0) {
                i2 = 0;
            }
            if (i == i2) {
                m153001v(-1.5f);
                return;
            }
            this.showPictureIndex = i2;
            PictureView pictureView = this.pictureView;
            NewPictureContainerIndicator newPictureContainerIndicator = null;
            if (pictureView == null) {
                Intrinsics.m88391r("pictureView");
                pictureView = null;
            }
            pictureView.m45194x(true);
            PictureView pictureView2 = this.pictureView;
            if (pictureView2 == null) {
                Intrinsics.m88391r("pictureView");
                pictureView2 = null;
            }
            pictureView2.m45176X(user.pictures.get(this.showPictureIndex));
            NewPictureContainerIndicator newPictureContainerIndicator2 = this.imageIndicator;
            if (newPictureContainerIndicator2 == null) {
                Intrinsics.m88391r("imageIndicator");
            } else {
                newPictureContainerIndicator = newPictureContainerIndicator2;
            }
            newPictureContainerIndicator.m37958b(this.showPictureIndex);
            m152987f();
        }
    }
}
