package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.LiveLivingCardDataWrapper;
import com.p051p1.mobile.putong.core.data.PartialListOpt;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.newui.home.views.SuperLikeBanner;
import com.p051p1.mobile.putong.core.newui.home.views.SwipeLikeButton;
import com.p051p1.mobile.putong.data.Live;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ1\u0010 \u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b \u0010!J-\u0010'\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\r2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\r¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0012H\u0002¢\u0006\u0004\b)\u0010\u0003J'\u0010-\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*H\u0002¢\u0006\u0004\b-\u0010.J'\u0010/\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*H\u0002¢\u0006\u0004\b/\u0010.J\u001f\u00103\u001a\u00020\u00122\u0006\u00100\u001a\u00020\r2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020*H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020*H\u0002¢\u0006\u0004\b7\u00106J\u000f\u00108\u001a\u000201H\u0002¢\u0006\u0004\b8\u00109J\u0019\u0010:\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b:\u0010\u001dJ%\u0010>\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b@\u0010\u001dJ\u001f\u0010D\u001a\u00020\u00122\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020AH\u0002¢\u0006\u0004\bD\u0010EJ\u001f\u0010F\u001a\u00020\u00122\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020AH\u0002¢\u0006\u0004\bF\u0010ER\u0016\u0010I\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010L\u001a\u00020J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010KR\u0018\u0010N\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010MR\u0016\u0010O\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010HR\u0016\u0010P\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010HR\u0016\u0010Q\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010HR\u0016\u0010R\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010HR\u0016\u0010T\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010HR\u0016\u0010V\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010H¨\u0006W"}, m88121d2 = {"Ll/m2t;", "Ll/sxl0;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "cardType", "Landroid/view/View;", Constants.INAPP_DATA_TAG, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/p1/mobile/putong/core/data/VirtualCardType;)Landroid/view/View;", "", "f", "()Z", "Lcom/p1/mobile/putong/core/card/VSwipeCard;", "card", "", "b", "(Lcom/p1/mobile/putong/core/card/VSwipeCard;)V", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "swipeDirection", "Ll/jam;", "Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "g", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ll/jam;)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", OMSTemplateModeType.view, "c", "(Landroid/view/View;)V", "", "position", "e", "(Landroid/view/View;ILcom/p1/mobile/putong/core/data/VirtualCardType;Landroid/view/View;)V", "horizontal", "", "factor", "animatingOutState", "isAnimateBacking", "p", "(ZFIZ)V", "u", "Lcom/p1/mobile/putong/core/newui/home/views/SwipeLikeButton;", "likeButton", "dislikeButton", "o", "(FLcom/p1/mobile/putong/core/newui/home/views/SwipeLikeButton;Lcom/p1/mobile/putong/core/newui/home/views/SwipeLikeButton;)V", "n", "showing", "Lcom/p1/mobile/putong/core/newui/home/views/SuperLikeBanner;", "superLikeView", "m", "(ZLcom/p1/mobile/putong/core/newui/home/views/SuperLikeBanner;)V", BLiveStormDanmakuGiftResourceType.f45292l, "()Lcom/p1/mobile/putong/core/newui/home/views/SwipeLikeButton;", "k", "j", "()Lcom/p1/mobile/putong/core/newui/home/views/SuperLikeBanner;", "q", "Lcom/p1/mobile/putong/core/data/PartialListOpt;", "Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;", "suggestedValue", BLiveStormDanmakuGiftResourceType.f45294s, "(ILcom/p1/mobile/putong/core/data/PartialListOpt;)V", Constants.KEY_T, "", "liveId", "anchorId", ResourceDirection.f39656v, "(Ljava/lang/String;Ljava/lang/String;)V", "w", "a", "Z", "viewRenderHasInit", "Ll/t2t;", "Ll/t2t;", "viewRender", "Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;", "userInfo", "isHasSendMV", "isSwipeLeft", "isSwipeRight", "isSwipeUp", "h", "showingSuperLikeBanner", RXScreenCaptureService.KEY_INDEX, "canShowLikeAnim", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class m2t implements sxl0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean viewRenderHasInit;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public t2t viewRender;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public CoreSuggested.UserInfo userInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean isHasSendMV;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean isSwipeLeft;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean isSwipeRight;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean isSwipeUp;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean showingSuperLikeBanner;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean canShowLikeAnim = true;

    /* JADX INFO: renamed from: h */
    public static void m156888h(m2t m2tVar, SuperLikeBanner superLikeBanner) {
        m2tVar.showingSuperLikeBanner = false;
        superLikeBanner.m40205i();
        bnl0.m105525M0(superLikeBanner, false);
    }

    /* JADX INFO: renamed from: r */
    public static final void m156890r(VSwipeCard vSwipeCard) {
        vSwipeCard.m36150O0(true);
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: c */
    public void mo31008c(@NotNull View view) {
        LiveLivingCardDataWrapper liveLivingCardDataWrapper;
        Live currentLive;
        String str;
        view.getClass();
        CoreSuggested.UserInfo userInfo = this.userInfo;
        if (userInfo == null || (liveLivingCardDataWrapper = userInfo.liveLivingCardDataWrapper) == null || (currentLive = liveLivingCardDataWrapper.getCurrentLive()) == null) {
            return;
        }
        if (TextUtils.isEmpty(currentLive.f39615id)) {
            str = "";
        } else {
            str = currentLive.f39615id;
            str.getClass();
        }
        String originUserId = liveLivingCardDataWrapper.getOriginUserId();
        if (str.length() == 0) {
            o1j0.m165651y("直播间不存在");
        } else {
            m156902v(str, originUserId);
            CoreModule.m30934Q().startAudienceLive(view.getContext(), str, "suggest-card", null);
        }
    }

    @Override // p153l.sxl0
    @NotNull
    /* JADX INFO: renamed from: d */
    public View mo31009d(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent, @NotNull VirtualCardType cardType) {
        inflater.getClass();
        cardType.getClass();
        this.canShowLikeAnim = CoreModule.m30934Q().mo68469t7().mo161253a();
        View viewInflate = inflater.inflate(kec0.f126082u6, parent, false);
        viewInflate.getClass();
        return viewInflate;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: e */
    public void mo31010e(@NotNull View view, int position, @NotNull VirtualCardType cardType, @Nullable View card) {
        view.getClass();
        cardType.getClass();
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM222761e = CoreModule.f18264c.f20405m0.f20136a0.m222761e();
        if (partialListOptM222761e == null) {
            return;
        }
        m156898q(card);
        m156899s(position, partialListOptM222761e);
        m156900t(view);
        this.viewRenderHasInit = true;
        CoreSuggested.UserInfo userInfo = this.userInfo;
        if (userInfo != null) {
            t2t t2tVar = this.viewRender;
            if (t2tVar == null) {
                Intrinsics.m88391r("viewRender");
                t2tVar = null;
            }
            t2tVar.m188999n(userInfo);
        }
        f4s.m124038e(true);
        if (position == 0) {
            m156901u();
        }
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: f */
    public boolean mo31011f() {
        return true;
    }

    @Override // p153l.sxl0
    @NotNull
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo31012g(@NotNull SwipeDirection swipeDirection, @NotNull jam card) {
        swipeDirection.getClass();
        card.getClass();
        return VSwipeStack.OnCardSwipeResult.back;
    }

    /* JADX INFO: renamed from: j */
    public final SuperLikeBanner m156891j() {
        t2t t2tVar = this.viewRender;
        if (t2tVar == null) {
            Intrinsics.m88391r("viewRender");
            t2tVar = null;
        }
        return t2tVar.m188993g();
    }

    /* JADX INFO: renamed from: k */
    public final SwipeLikeButton m156892k() {
        t2t t2tVar = this.viewRender;
        if (t2tVar == null) {
            Intrinsics.m88391r("viewRender");
            t2tVar = null;
        }
        return t2tVar.m188991e();
    }

    /* JADX INFO: renamed from: l */
    public final SwipeLikeButton m156893l() {
        t2t t2tVar = this.viewRender;
        if (t2tVar == null) {
            Intrinsics.m88391r("viewRender");
            t2tVar = null;
        }
        return t2tVar.m188992f();
    }

    /* JADX INFO: renamed from: m */
    public final void m156894m(boolean showing, final SuperLikeBanner superLikeView) {
        LiveLivingCardDataWrapper liveLivingCardDataWrapper;
        CoreSuggested.UserInfo userInfo = this.userInfo;
        if (userInfo != null) {
            String originUserId = null;
            if ((userInfo != null ? userInfo.liveLivingCardDataWrapper : null) != null && this.canShowLikeAnim) {
                if (showing) {
                    CoreSuggested coreSuggested = CoreModule.f18264c.f20405m0;
                    if (userInfo != null && (liveLivingCardDataWrapper = userInfo.liveLivingCardDataWrapper) != null) {
                        originUserId = liveLivingCardDataWrapper.getOriginUserId();
                    }
                    if (!coreSuggested.m32023L6(originUserId)) {
                        bnl0.m105525M0(superLikeView, true);
                        if (this.showingSuperLikeBanner) {
                            return;
                        }
                        this.showingSuperLikeBanner = true;
                        superLikeView.m40207k();
                        return;
                    }
                }
                if (this.showingSuperLikeBanner) {
                    superLikeView.m40208l(true, new x20() { // from class: l.k2t
                        @Override // p153l.x20
                        public final void call() {
                            m2t.m156888h(this.f123647a, superLikeView);
                        }
                    });
                } else {
                    superLikeView.m40205i();
                    bnl0.m105525M0(superLikeView, false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m156895n(float factor, SwipeLikeButton likeButton, SwipeLikeButton dislikeButton) {
        float fM88485a = C15274a.m88485a(-1.0f, factor * 2.0f);
        likeButton.setVisibility(4);
        dislikeButton.m40217z(-fM88485a);
        dislikeButton.setVisibility(0);
        likeButton.setPressed(false);
        dislikeButton.setPressed(true);
    }

    /* JADX INFO: renamed from: o */
    public final void m156896o(float factor, SwipeLikeButton likeButton, SwipeLikeButton dislikeButton) {
        likeButton.m40217z(C15274a.m88488d(1.0f, factor * 2.0f));
        likeButton.setVisibility(0);
        dislikeButton.setVisibility(4);
        likeButton.setPressed(true);
        dislikeButton.setPressed(false);
    }

    /* JADX INFO: renamed from: p */
    public final void m156897p(boolean horizontal, float factor, int animatingOutState, boolean isAnimateBacking) {
        if (this.viewRenderHasInit && this.canShowLikeAnim) {
            if (!horizontal) {
                if (IntlCountryCodeController.m29125v()) {
                    return;
                }
                SwipeLikeButton swipeLikeButtonM156893l = m156893l();
                swipeLikeButtonM156893l.setVisibility(4);
                swipeLikeButtonM156893l.setPressed(false);
                SwipeLikeButton swipeLikeButtonM156892k = m156892k();
                swipeLikeButtonM156892k.setVisibility(4);
                swipeLikeButtonM156892k.setPressed(false);
                if (factor <= 0.0f) {
                    m156894m(false, m156891j());
                    return;
                }
                if (!isAnimateBacking && animatingOutState == VSwipeCard.f21021F) {
                    this.isSwipeLeft = false;
                    this.isSwipeRight = false;
                    this.isSwipeUp = true;
                } else if (isAnimateBacking) {
                    if (this.showingSuperLikeBanner) {
                        m156894m(false, m156891j());
                        return;
                    }
                    return;
                } else if (this.isSwipeLeft || this.isSwipeRight) {
                    return;
                }
                m156894m(true, m156891j());
                return;
            }
            if (factor > 0.0f && animatingOutState != VSwipeCard.f21024I) {
                if (!isAnimateBacking && animatingOutState == VSwipeCard.f21021F) {
                    this.isSwipeLeft = false;
                    this.isSwipeRight = true;
                    this.isSwipeUp = false;
                } else if (this.isSwipeLeft || this.isSwipeUp) {
                    return;
                }
                m156896o(factor, m156893l(), m156892k());
            } else if (factor >= 0.0f || animatingOutState == VSwipeCard.f21023H) {
                SwipeLikeButton swipeLikeButtonM156893l2 = m156893l();
                swipeLikeButtonM156893l2.setVisibility(4);
                swipeLikeButtonM156893l2.setPressed(false);
                SwipeLikeButton swipeLikeButtonM156892k2 = m156892k();
                swipeLikeButtonM156892k2.setVisibility(4);
                swipeLikeButtonM156892k2.setPressed(false);
            } else {
                if (!isAnimateBacking && animatingOutState == VSwipeCard.f21021F) {
                    this.isSwipeLeft = true;
                    this.isSwipeRight = false;
                    this.isSwipeUp = false;
                } else if (this.isSwipeRight || this.isSwipeUp) {
                    return;
                }
                m156895n(factor, m156893l(), m156892k());
            }
            m156894m(false, m156891j());
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m156898q(View card) {
        if (card instanceof VSwipeCard) {
            final VSwipeCard vSwipeCard = (VSwipeCard) card;
            vSwipeCard.m36150O0(false);
            vSwipeCard.postDelayed(new Runnable() { // from class: l.l2t
                @Override // java.lang.Runnable
                public final void run() {
                    m2t.m156890r(vSwipeCard);
                }
            }, 1000L);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m156899s(int position, PartialListOpt<CoreSuggested.UserInfo> suggestedValue) {
        List<CoreSuggested.UserInfo> list = suggestedValue.loaded;
        list.getClass();
        if (list.isEmpty() || list.size() <= position) {
            return;
        }
        this.userInfo = list.get(position);
    }

    /* JADX INFO: renamed from: t */
    public final void m156900t(View view) {
        t2t t2tVar = new t2t(view);
        t2tVar.m188996j();
        this.viewRender = t2tVar;
    }

    /* JADX INFO: renamed from: u */
    public final void m156901u() {
        LiveLivingCardDataWrapper liveLivingCardDataWrapper;
        Live currentLive;
        String originUserId;
        LiveLivingCardDataWrapper liveLivingCardDataWrapper2;
        String str;
        if (!this.isHasSendMV) {
            CoreSuggested.UserInfo userInfo = this.userInfo;
            String str2 = "";
            if (userInfo == null || (liveLivingCardDataWrapper2 = userInfo.liveLivingCardDataWrapper) == null) {
                originUserId = "";
            } else {
                Live currentLive2 = liveLivingCardDataWrapper2.getCurrentLive();
                if (currentLive2 != null && (str = currentLive2.f39615id) != null) {
                    str2 = str;
                }
                originUserId = liveLivingCardDataWrapper2.getOriginUserId();
            }
            m156903w(str2, originUserId);
            this.isHasSendMV = true;
        }
        CoreSuggested.UserInfo userInfo2 = this.userInfo;
        if (userInfo2 == null || (liveLivingCardDataWrapper = userInfo2.liveLivingCardDataWrapper) == null || (currentLive = liveLivingCardDataWrapper.getCurrentLive()) == null) {
            return;
        }
        t2t t2tVar = this.viewRender;
        if (t2tVar == null) {
            Intrinsics.m88391r("viewRender");
            t2tVar = null;
        }
        t2tVar.m188997k(currentLive);
    }

    /* JADX INFO: renamed from: v */
    public final void m156902v(String liveId, String anchorId) {
        i4g0.m138523u("e_live_room_enter", "p_suggest_users_home_view", jyb.m147494Y("liveId", liveId), jyb.m147494Y("anchorId", anchorId), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, "NA"), jyb.m147494Y("is_gif", "1"), jyb.m147494Y("live_enter_source", "suggest_users_home_view"), jyb.m147494Y("window_type", "normal"), jyb.m147494Y("module", OMSTemplateModeType.page), jyb.m147494Y("trace_id", ""), jyb.m147494Y("right_recommend_type", ""), jyb.m147494Y("show_label", ""), jyb.m147494Y("live_status", "on"), jyb.m147494Y("liveRecommendCategory", "insert"));
    }

    /* JADX INFO: renamed from: w */
    public final void m156903w(String liveId, String anchorId) {
        i4g0.m138492A("e_live_room_enter", "p_suggest_users_home_view", jyb.m147494Y(FirebaseAnalytics.Param.INDEX, "NA"), jyb.m147494Y("module", OMSTemplateModeType.page), jyb.m147494Y("liveId", liveId), jyb.m147494Y("anchorId", anchorId), jyb.m147494Y("is_gif", "1"), jyb.m147494Y("live_enter_source", "suggest_users_home_view"), jyb.m147494Y("trace_id", ""), jyb.m147494Y("show_label", ""), jyb.m147494Y("liveRecommendCategory", "insert"), jyb.m147494Y("live_status", "on"), jyb.m147494Y("right_recommend_type", ""), jyb.m147494Y("window_type", "normal"));
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: b */
    public void mo31007b(@Nullable VSwipeCard card) {
    }
}
