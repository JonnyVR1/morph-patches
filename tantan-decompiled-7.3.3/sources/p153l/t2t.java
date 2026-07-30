package p153l;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.annotation.DrawableRes;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.p053ui.label.CommonLabelView;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.LiveLivingCardDataWrapper;
import com.p051p1.mobile.putong.core.newui.home.livewindow.LiveMediaView;
import com.p051p1.mobile.putong.core.newui.home.views.SuperLikeBanner;
import com.p051p1.mobile.putong.core.newui.home.views.SwipeLikeButton;
import com.p051p1.mobile.putong.data.InAppPromptRecommendInfo;
import com.p051p1.mobile.putong.data.Live;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.RecommendInfo;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p151v.VButton;
import p151v.VIcon;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\u001dR\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010.R\u0016\u00102\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u00101R\u0016\u00103\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0016\u00106\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u00105R\u001b\u0010;\u001a\u0002078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b'\u0010:R\u001b\u0010<\u001a\u0002078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u00109\u001a\u0004\b$\u0010:R\u001b\u0010?\u001a\u00020=8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b*\u0010>¨\u0006@"}, m88121d2 = {"Ll/t2t;", "", "Landroid/view/View;", "parentView", "<init>", "(Landroid/view/View;)V", "", "j", "()V", "Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;", "userInfo", "n", "(Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;)V", "Lcom/p1/mobile/putong/data/Live;", "currentLive", "k", "(Lcom/p1/mobile/putong/data/Live;)V", "Lcom/p1/mobile/putong/data/User;", "user", "m", "(Lcom/p1/mobile/putong/data/User;)V", "", RXScreenCaptureService.KEY_INDEX, "(Lcom/p1/mobile/putong/data/User;)I", "h", "a", "Landroid/view/View;", "Lv/VText;", "b", "Lv/VText;", "anchorName", "c", "anchorAge", Constants.INAPP_DATA_TAG, "liveTitle", "Lv/VIcon;", "e", "Lv/VIcon;", "verificationOutIcon", "f", "verificationInnerIcon", "Lcom/p1/mobile/putong/core/newui/home/livewindow/LiveMediaView;", "g", "Lcom/p1/mobile/putong/core/newui/home/livewindow/LiveMediaView;", "liveMediaView", "Lv/VButton;", "Lv/VButton;", "enterButton", "Lcom/p1/mobile/android/ui/label/CommonLabelView;", "Lcom/p1/mobile/android/ui/label/CommonLabelView;", "labelView", "oldLabelBg", "Lcom/tantan/library/svga/SVGAnimationView;", "Lcom/tantan/library/svga/SVGAnimationView;", "liveSVGA", "Lcom/p1/mobile/putong/core/newui/home/views/SwipeLikeButton;", BLiveStormDanmakuGiftResourceType.f45292l, "Lkotlin/Lazy;", "()Lcom/p1/mobile/putong/core/newui/home/views/SwipeLikeButton;", "likeButton", "dislikeButton", "Lcom/p1/mobile/putong/core/newui/home/views/SuperLikeBanner;", "()Lcom/p1/mobile/putong/core/newui/home/views/SuperLikeBanner;", "superLikeBanner", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class t2t {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final View parentView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VText anchorName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText anchorAge;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText liveTitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VIcon verificationOutIcon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VIcon verificationInnerIcon;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public LiveMediaView liveMediaView;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VButton enterButton;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public CommonLabelView labelView;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public View oldLabelBg;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public SVGAnimationView liveSVGA;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Lazy likeButton;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Lazy dislikeButton;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final Lazy superLikeBanner;

    public t2t(@NotNull View view) {
        view.getClass();
        this.parentView = view;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.likeButton = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.p2t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t2t.m188988c(this.f150309a);
            }
        });
        this.dislikeButton = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.q2t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t2t.m188989d(this.f155390a);
            }
        });
        this.superLikeBanner = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.r2t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t2t.m188986a(this.f160972a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static SuperLikeBanner m188986a(t2t t2tVar) {
        SuperLikeBanner superLikeBanner = (SuperLikeBanner) t2tVar.parentView.findViewById(adc0.f70436l7);
        superLikeBanner.m40204h(new int[]{dbc0.f86812a3, dbc0.f86845b3, dbc0.f86878c3, dbc0.f86911d3, dbc0.f86943e3, dbc0.f86976f3, dbc0.f87009g3, dbc0.f87042h3, dbc0.f87075i3, dbc0.f87106j3, dbc0.f87139k3, dbc0.f87172l3, dbc0.f87205m3, dbc0.f87238n3, dbc0.f87271o3, dbc0.f87304p3}, 20L);
        return superLikeBanner;
    }

    /* JADX INFO: renamed from: c */
    public static SwipeLikeButton m188988c(t2t t2tVar) {
        SwipeLikeButton swipeLikeButton = (SwipeLikeButton) t2tVar.parentView.findViewById(adc0.f70419k7);
        swipeLikeButton.m40214u("https://auto.tancdn.com/v1/raw/a982f15f-30aa-47be-9b7e-50ec88482f5311.so");
        return swipeLikeButton;
    }

    /* JADX INFO: renamed from: d */
    public static SwipeLikeButton m188989d(t2t t2tVar) {
        SwipeLikeButton swipeLikeButton = (SwipeLikeButton) t2tVar.parentView.findViewById(adc0.f70402j7);
        swipeLikeButton.m40214u("https://auto.tancdn.com/v1/raw/da3d1a53-b937-41f8-883c-c16c842ca35e11.so");
        return swipeLikeButton;
    }

    /* JADX INFO: renamed from: l */
    public static final void m188990l(Live live, Ref.LongRef longRef) {
        i4g0.m138495D("e_live_card_wait_duration", "p_suggest_users_home_view", jyb.m147494Y("current_anchorid", live.anchor.f39651id), jyb.m147494Y("current_liveid", live.f39615id), jyb.m147494Y(BLiveOperationTitleShowType.duration, String.valueOf(System.currentTimeMillis() - longRef.element)));
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final SwipeLikeButton m188991e() {
        Object value = this.dislikeButton.getValue();
        value.getClass();
        return (SwipeLikeButton) value;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final SwipeLikeButton m188992f() {
        Object value = this.likeButton.getValue();
        value.getClass();
        return (SwipeLikeButton) value;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final SuperLikeBanner m188993g() {
        Object value = this.superLikeBanner.getValue();
        value.getClass();
        return (SuperLikeBanner) value;
    }

    @DrawableRes
    /* JADX INFO: renamed from: h */
    public final int m188994h(User user) {
        if (user.isPicVerificationVerified()) {
            return gra.m131778z() ? dbc0.f86078D5 : dbc0.f86363M2;
        }
        return 0;
    }

    @DrawableRes
    /* JADX INFO: renamed from: i */
    public final int m188995i(User user) {
        if (user.isPicVerificationVerified()) {
            return gra.m131778z() ? dbc0.f86185Gg : dbc0.f86395N2;
        }
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public final void m188996j() {
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
        View viewFindViewById4 = this.parentView.findViewById(adc0.f70292cf);
        viewFindViewById4.getClass();
        this.verificationOutIcon = (VIcon) viewFindViewById4;
        View viewFindViewById5 = this.parentView.findViewById(adc0.f70275bf);
        viewFindViewById5.getClass();
        this.verificationInnerIcon = (VIcon) viewFindViewById5;
        View viewFindViewById6 = this.parentView.findViewById(adc0.f70487o7);
        viewFindViewById6.getClass();
        this.liveMediaView = (LiveMediaView) viewFindViewById6;
        View viewFindViewById7 = this.parentView.findViewById(adc0.f69876E3);
        viewFindViewById7.getClass();
        this.enterButton = (VButton) viewFindViewById7;
        View viewFindViewById8 = this.parentView.findViewById(adc0.f70538r7);
        viewFindViewById8.getClass();
        this.liveSVGA = (SVGAnimationView) viewFindViewById8;
        View viewFindViewById9 = this.parentView.findViewById(adc0.f69930H6);
        viewFindViewById9.getClass();
        this.labelView = (CommonLabelView) viewFindViewById9;
        View viewFindViewById10 = this.parentView.findViewById(adc0.f70606v7);
        viewFindViewById10.getClass();
        this.oldLabelBg = viewFindViewById10;
        VIcon vIcon = null;
        if (gra.m131778z()) {
            View view = this.oldLabelBg;
            if (view == null) {
                Intrinsics.m88391r("oldLabelBg");
                view = null;
            }
            bnl0.m105524M(view, false);
            SVGAnimationView sVGAnimationView = this.liveSVGA;
            if (sVGAnimationView == null) {
                Intrinsics.m88391r("liveSVGA");
                sVGAnimationView = null;
            }
            bnl0.m105524M(sVGAnimationView, false);
            CommonLabelView commonLabelView = this.labelView;
            if (commonLabelView == null) {
                Intrinsics.m88391r("labelView");
                commonLabelView = null;
            }
            bnl0.m105524M(commonLabelView, true);
            VIcon vIcon2 = this.verificationOutIcon;
            if (vIcon2 == null) {
                Intrinsics.m88391r("verificationOutIcon");
                vIcon2 = null;
            }
            vIcon2.setIconStyle(3);
            VIcon vIcon3 = this.verificationInnerIcon;
            if (vIcon3 == null) {
                Intrinsics.m88391r("verificationInnerIcon");
                vIcon3 = null;
            }
            vIcon3.setIconStyle(3);
        }
        VButton vButton = this.enterButton;
        if (vButton == null) {
            Intrinsics.m88391r("enterButton");
            vButton = null;
        }
        qnp0.m177261d1(vButton, qa00.m175859d(10.0f));
        VIcon vIcon4 = this.verificationOutIcon;
        if (vIcon4 == null) {
            Intrinsics.m88391r("verificationOutIcon");
            vIcon4 = null;
        }
        bnl0.m105524M(vIcon4, false);
        VIcon vIcon5 = this.verificationInnerIcon;
        if (vIcon5 == null) {
            Intrinsics.m88391r("verificationInnerIcon");
        } else {
            vIcon = vIcon5;
        }
        bnl0.m105524M(vIcon, false);
    }

    /* JADX INFO: renamed from: k */
    public final void m188997k(@NotNull final Live currentLive) {
        currentLive.getClass();
        final Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = System.currentTimeMillis();
        Media media = currentLive.videoCapture;
        if (media != null) {
            LiveMediaView liveMediaView = this.liveMediaView;
            if (liveMediaView == null) {
                Intrinsics.m88391r("liveMediaView");
                liveMediaView = null;
            }
            liveMediaView.setVolume(false);
            liveMediaView.m39753k(fyh0.m128089d().m128092e(), Uri.parse(uqb0.m197266d0(media.url)).toString());
            liveMediaView.setLiveMediaListener(new d4t() { // from class: l.s2t
                @Override // p153l.d4t
                public final void onStart() {
                    t2t.m188990l(currentLive, longRef);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m188998m(User user) {
        int iM188995i = m188995i(user);
        int iM188994h = m188994h(user);
        VIcon vIcon = null;
        if (iM188995i == 0 || iM188994h == 0) {
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
        vIcon6.setImageResource(iM188994h);
        VIcon vIcon7 = this.verificationOutIcon;
        if (vIcon7 == null) {
            Intrinsics.m88391r("verificationOutIcon");
        } else {
            vIcon = vIcon7;
        }
        vIcon.setImageResource(iM188995i);
    }

    /* JADX INFO: renamed from: n */
    public final void m188999n(@NotNull CoreSuggested.UserInfo userInfo) {
        User user;
        Media media;
        RecommendInfo recommendInfo;
        InAppPromptRecommendInfo inAppPromptRecommendInfo;
        userInfo.getClass();
        SVGAnimationView sVGAnimationView = this.liveSVGA;
        LiveMediaView liveMediaView = null;
        if (sVGAnimationView == null) {
            Intrinsics.m88391r("liveSVGA");
            sVGAnimationView = null;
        }
        if (!sVGAnimationView.isAnimating()) {
            Context context = this.parentView.getContext();
            context.getClass();
            SVGALoader.SVGARequestBuilder sVGARequestBuilderFrom = SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/eb325015-6212-4af8-b574-1abe591b749913.svga");
            SVGAnimationView sVGAnimationView2 = this.liveSVGA;
            if (sVGAnimationView2 == null) {
                Intrinsics.m88391r("liveSVGA");
                sVGAnimationView2 = null;
            }
            sVGARequestBuilderFrom.into(sVGAnimationView2);
        }
        bnl0.m105525M0(m188992f(), false);
        bnl0.m105525M0(m188991e(), false);
        bnl0.m105525M0(m188993g(), false);
        LiveLivingCardDataWrapper liveLivingCardDataWrapper = userInfo.liveLivingCardDataWrapper;
        if (liveLivingCardDataWrapper == null || (user = liveLivingCardDataWrapper.getUser()) == null) {
            return;
        }
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
        m188998m(user);
        Live currentLive = liveLivingCardDataWrapper.getCurrentLive();
        if (currentLive != null && (recommendInfo = currentLive.recommendInfo) != null && (inAppPromptRecommendInfo = recommendInfo.inAppPrompt) != null) {
            VText vText4 = this.liveTitle;
            if (vText4 == null) {
                Intrinsics.m88391r("liveTitle");
                vText4 = null;
            }
            vText4.setText(inAppPromptRecommendInfo.title);
        }
        LiveMediaView liveMediaView2 = this.liveMediaView;
        if (liveMediaView2 == null) {
            Intrinsics.m88391r("liveMediaView");
        } else {
            liveMediaView = liveMediaView2;
        }
        String str = user.pictures.get(0).cover().url;
        str.getClass();
        Live currentLive2 = liveLivingCardDataWrapper.getCurrentLive();
        if (currentLive2 != null && (media = currentLive2.coverPicUrl) != null) {
            str = media.url;
            str.getClass();
        }
        liveMediaView.m39758p(str, false);
        liveMediaView.m39759q();
    }
}
