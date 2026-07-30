package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.card.VSwipeCard;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.LiveLivingCardDataWrapper;
import com.p046p1.mobile.putong.core.data.PartialListOpt;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.newui.home.views.SuperLikeBanner;
import com.p046p1.mobile.putong.core.newui.home.views.SwipeLikeButton;
import com.p046p1.mobile.putong.data.Live;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15167a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ1\u0010 \u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b \u0010!J-\u0010'\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\r2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\r¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0012H\u0002¢\u0006\u0004\b)\u0010\u0003J'\u0010-\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*H\u0002¢\u0006\u0004\b-\u0010.J'\u0010/\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*H\u0002¢\u0006\u0004\b/\u0010.J\u001f\u00103\u001a\u00020\u00122\u0006\u00100\u001a\u00020\r2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020*H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020*H\u0002¢\u0006\u0004\b7\u00106J\u000f\u00108\u001a\u000201H\u0002¢\u0006\u0004\b8\u00109J\u0019\u0010:\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b:\u0010\u001dJ%\u0010>\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b@\u0010\u001dJ\u001f\u0010D\u001a\u00020\u00122\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020AH\u0002¢\u0006\u0004\bD\u0010EJ\u001f\u0010F\u001a\u00020\u00122\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020AH\u0002¢\u0006\u0004\bF\u0010ER\u0016\u0010I\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010L\u001a\u00020J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010KR\u0018\u0010N\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010MR\u0016\u0010O\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010HR\u0016\u0010P\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010HR\u0016\u0010Q\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010HR\u0016\u0010R\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010HR\u0016\u0010T\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010HR\u0016\u0010V\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010H¨\u0006W"}, m87232d2 = {"Ll/l0t;", "Ll/ool0;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "cardType", "Landroid/view/View;", Constants.INAPP_DATA_TAG, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/p1/mobile/putong/core/data/VirtualCardType;)Landroid/view/View;", "", "f", "()Z", "Lcom/p1/mobile/putong/core/card/VSwipeCard;", "card", "", "b", "(Lcom/p1/mobile/putong/core/card/VSwipeCard;)V", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "swipeDirection", "Ll/t7m;", "Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "g", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ll/t7m;)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", OMSTemplateModeType.view, "c", "(Landroid/view/View;)V", "", "position", "e", "(Landroid/view/View;ILcom/p1/mobile/putong/core/data/VirtualCardType;Landroid/view/View;)V", "horizontal", "", "factor", "animatingOutState", "isAnimateBacking", "p", "(ZFIZ)V", "u", "Lcom/p1/mobile/putong/core/newui/home/views/SwipeLikeButton;", "likeButton", "dislikeButton", "o", "(FLcom/p1/mobile/putong/core/newui/home/views/SwipeLikeButton;Lcom/p1/mobile/putong/core/newui/home/views/SwipeLikeButton;)V", "n", "showing", "Lcom/p1/mobile/putong/core/newui/home/views/SuperLikeBanner;", "superLikeView", "m", "(ZLcom/p1/mobile/putong/core/newui/home/views/SuperLikeBanner;)V", BLiveStormDanmakuGiftResourceType.f44444l, "()Lcom/p1/mobile/putong/core/newui/home/views/SwipeLikeButton;", "k", "j", "()Lcom/p1/mobile/putong/core/newui/home/views/SuperLikeBanner;", "q", "Lcom/p1/mobile/putong/core/data/PartialListOpt;", "Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;", "suggestedValue", BLiveStormDanmakuGiftResourceType.f44446s, "(ILcom/p1/mobile/putong/core/data/PartialListOpt;)V", Constants.KEY_T, "", "liveId", "anchorId", ResourceDirection.f38808v, "(Ljava/lang/String;Ljava/lang/String;)V", "w", "a", "Z", "viewRenderHasInit", "Ll/s0t;", "Ll/s0t;", "viewRender", "Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;", "userInfo", "isHasSendMV", "isSwipeLeft", "isSwipeRight", "isSwipeUp", "h", "showingSuperLikeBanner", RXScreenCaptureService.KEY_INDEX, "canShowLikeAnim", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class l0t implements ool0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean viewRenderHasInit;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public s0t viewRender;

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
    public static void m148102h(l0t l0tVar, SuperLikeBanner superLikeBanner) {
        l0tVar.showingSuperLikeBanner = false;
        superLikeBanner.m39202i();
        xdl0.m208345M0(superLikeBanner, false);
    }

    /* JADX INFO: renamed from: r */
    public static final void m148104r(VSwipeCard vSwipeCard) {
        vSwipeCard.m35147O0(true);
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: c */
    public void mo30010c(@NotNull View view) {
        LiveLivingCardDataWrapper liveLivingCardDataWrapper;
        Live currentLive;
        String str;
        view.getClass();
        CoreSuggested.UserInfo userInfo = this.userInfo;
        if (userInfo == null || (liveLivingCardDataWrapper = userInfo.liveLivingCardDataWrapper) == null || (currentLive = liveLivingCardDataWrapper.getCurrentLive()) == null) {
            return;
        }
        if (TextUtils.isEmpty(currentLive.f38767id)) {
            str = "";
        } else {
            str = currentLive.f38767id;
            str.getClass();
        }
        String originUserId = liveLivingCardDataWrapper.getOriginUserId();
        if (str.length() == 0) {
            lsi0.m151595y("直播间不存在");
        } else {
            m148116v(str, originUserId);
            CoreModule.m29936Q().startAudienceLive(view.getContext(), str, "suggest-card", null);
        }
    }

    @Override // p149l.ool0
    @NotNull
    /* JADX INFO: renamed from: d */
    public View mo30011d(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent, @NotNull VirtualCardType cardType) {
        inflater.getClass();
        cardType.getClass();
        this.canShowLikeAnim = CoreModule.m29936Q().mo67286t7().mo152520a();
        View viewInflate = inflater.inflate(f6c0.f96011t6, parent, false);
        viewInflate.getClass();
        return viewInflate;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: e */
    public void mo30012e(@NotNull View view, int position, @NotNull VirtualCardType cardType, @Nullable View card) {
        view.getClass();
        cardType.getClass();
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM221515e = CoreModule.f17545c.f19663m0.f19394a0.m221515e();
        if (partialListOptM221515e == null) {
            return;
        }
        m148112q(card);
        m148113s(position, partialListOptM221515e);
        m148114t(view);
        this.viewRenderHasInit = true;
        CoreSuggested.UserInfo userInfo = this.userInfo;
        if (userInfo != null) {
            s0t s0tVar = this.viewRender;
            if (s0tVar == null) {
                Intrinsics.m87502r("viewRender");
                s0tVar = null;
            }
            s0tVar.m181890n(userInfo);
        }
        e2s.m114524e(true);
        if (position == 0) {
            m148115u();
        }
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: f */
    public boolean mo30013f() {
        return true;
    }

    @Override // p149l.ool0
    @NotNull
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo30014g(@NotNull SwipeDirection swipeDirection, @NotNull t7m card) {
        swipeDirection.getClass();
        card.getClass();
        return VSwipeStack.OnCardSwipeResult.back;
    }

    /* JADX INFO: renamed from: j */
    public final SuperLikeBanner m148105j() {
        s0t s0tVar = this.viewRender;
        if (s0tVar == null) {
            Intrinsics.m87502r("viewRender");
            s0tVar = null;
        }
        return s0tVar.m181884g();
    }

    /* JADX INFO: renamed from: k */
    public final SwipeLikeButton m148106k() {
        s0t s0tVar = this.viewRender;
        if (s0tVar == null) {
            Intrinsics.m87502r("viewRender");
            s0tVar = null;
        }
        return s0tVar.m181882e();
    }

    /* JADX INFO: renamed from: l */
    public final SwipeLikeButton m148107l() {
        s0t s0tVar = this.viewRender;
        if (s0tVar == null) {
            Intrinsics.m87502r("viewRender");
            s0tVar = null;
        }
        return s0tVar.m181883f();
    }

    /* JADX INFO: renamed from: m */
    public final void m148108m(boolean showing, final SuperLikeBanner superLikeView) {
        LiveLivingCardDataWrapper liveLivingCardDataWrapper;
        CoreSuggested.UserInfo userInfo = this.userInfo;
        if (userInfo != null) {
            String originUserId = null;
            if ((userInfo != null ? userInfo.liveLivingCardDataWrapper : null) != null && this.canShowLikeAnim) {
                if (showing) {
                    CoreSuggested coreSuggested = CoreModule.f17545c.f19663m0;
                    if (userInfo != null && (liveLivingCardDataWrapper = userInfo.liveLivingCardDataWrapper) != null) {
                        originUserId = liveLivingCardDataWrapper.getOriginUserId();
                    }
                    if (!coreSuggested.m31020L6(originUserId)) {
                        xdl0.m208345M0(superLikeView, true);
                        if (this.showingSuperLikeBanner) {
                            return;
                        }
                        this.showingSuperLikeBanner = true;
                        superLikeView.m39204k();
                        return;
                    }
                }
                if (this.showingSuperLikeBanner) {
                    superLikeView.m39205l(true, new d30() { // from class: l.j0t
                        @Override // p149l.d30
                        public final void call() {
                            l0t.m148102h(this.f115712a, superLikeView);
                        }
                    });
                } else {
                    superLikeView.m39202i();
                    xdl0.m208345M0(superLikeView, false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m148109n(float factor, SwipeLikeButton likeButton, SwipeLikeButton dislikeButton) {
        float fM87595a = C15167a.m87595a(-1.0f, factor * 2.0f);
        likeButton.setVisibility(4);
        dislikeButton.m39214z(-fM87595a);
        dislikeButton.setVisibility(0);
        likeButton.setPressed(false);
        dislikeButton.setPressed(true);
    }

    /* JADX INFO: renamed from: o */
    public final void m148110o(float factor, SwipeLikeButton likeButton, SwipeLikeButton dislikeButton) {
        likeButton.m39214z(C15167a.m87598d(1.0f, factor * 2.0f));
        likeButton.setVisibility(0);
        dislikeButton.setVisibility(4);
        likeButton.setPressed(true);
        dislikeButton.setPressed(false);
    }

    /* JADX INFO: renamed from: p */
    public final void m148111p(boolean horizontal, float factor, int animatingOutState, boolean isAnimateBacking) {
        if (this.viewRenderHasInit && this.canShowLikeAnim) {
            if (!horizontal) {
                if (IntlCountryCodeController.m28126v()) {
                    return;
                }
                SwipeLikeButton swipeLikeButtonM148107l = m148107l();
                swipeLikeButtonM148107l.setVisibility(4);
                swipeLikeButtonM148107l.setPressed(false);
                SwipeLikeButton swipeLikeButtonM148106k = m148106k();
                swipeLikeButtonM148106k.setVisibility(4);
                swipeLikeButtonM148106k.setPressed(false);
                if (factor <= 0.0f) {
                    m148108m(false, m148105j());
                    return;
                }
                if (!isAnimateBacking && animatingOutState == VSwipeCard.f20279F) {
                    this.isSwipeLeft = false;
                    this.isSwipeRight = false;
                    this.isSwipeUp = true;
                } else if (isAnimateBacking) {
                    if (this.showingSuperLikeBanner) {
                        m148108m(false, m148105j());
                        return;
                    }
                    return;
                } else if (this.isSwipeLeft || this.isSwipeRight) {
                    return;
                }
                m148108m(true, m148105j());
                return;
            }
            if (factor > 0.0f && animatingOutState != VSwipeCard.f20282I) {
                if (!isAnimateBacking && animatingOutState == VSwipeCard.f20279F) {
                    this.isSwipeLeft = false;
                    this.isSwipeRight = true;
                    this.isSwipeUp = false;
                } else if (this.isSwipeLeft || this.isSwipeUp) {
                    return;
                }
                m148110o(factor, m148107l(), m148106k());
            } else if (factor >= 0.0f || animatingOutState == VSwipeCard.f20281H) {
                SwipeLikeButton swipeLikeButtonM148107l2 = m148107l();
                swipeLikeButtonM148107l2.setVisibility(4);
                swipeLikeButtonM148107l2.setPressed(false);
                SwipeLikeButton swipeLikeButtonM148106k2 = m148106k();
                swipeLikeButtonM148106k2.setVisibility(4);
                swipeLikeButtonM148106k2.setPressed(false);
            } else {
                if (!isAnimateBacking && animatingOutState == VSwipeCard.f20279F) {
                    this.isSwipeLeft = true;
                    this.isSwipeRight = false;
                    this.isSwipeUp = false;
                } else if (this.isSwipeRight || this.isSwipeUp) {
                    return;
                }
                m148109n(factor, m148107l(), m148106k());
            }
            m148108m(false, m148105j());
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m148112q(View card) {
        if (card instanceof VSwipeCard) {
            final VSwipeCard vSwipeCard = (VSwipeCard) card;
            vSwipeCard.m35147O0(false);
            vSwipeCard.postDelayed(new Runnable() { // from class: l.k0t
                @Override // java.lang.Runnable
                public final void run() {
                    l0t.m148104r(vSwipeCard);
                }
            }, 1000L);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m148113s(int position, PartialListOpt<CoreSuggested.UserInfo> suggestedValue) {
        List<CoreSuggested.UserInfo> list = suggestedValue.loaded;
        list.getClass();
        if (list.isEmpty() || list.size() <= position) {
            return;
        }
        this.userInfo = list.get(position);
    }

    /* JADX INFO: renamed from: t */
    public final void m148114t(View view) {
        s0t s0tVar = new s0t(view);
        s0tVar.m181887j();
        this.viewRender = s0tVar;
    }

    /* JADX INFO: renamed from: u */
    public final void m148115u() {
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
                if (currentLive2 != null && (str = currentLive2.f38767id) != null) {
                    str2 = str;
                }
                originUserId = liveLivingCardDataWrapper2.getOriginUserId();
            }
            m148117w(str2, originUserId);
            this.isHasSendMV = true;
        }
        CoreSuggested.UserInfo userInfo2 = this.userInfo;
        if (userInfo2 == null || (liveLivingCardDataWrapper = userInfo2.liveLivingCardDataWrapper) == null || (currentLive = liveLivingCardDataWrapper.getCurrentLive()) == null) {
            return;
        }
        s0t s0tVar = this.viewRender;
        if (s0tVar == null) {
            Intrinsics.m87502r("viewRender");
            s0tVar = null;
        }
        s0tVar.m181888k(currentLive);
    }

    /* JADX INFO: renamed from: v */
    public final void m148116v(String liveId, String anchorId) {
        zvf0.m220399u("e_live_room_enter", "p_suggest_users_home_view", vwb.m200311Y("liveId", liveId), vwb.m200311Y("anchorId", anchorId), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, "NA"), vwb.m200311Y("is_gif", "1"), vwb.m200311Y("live_enter_source", "suggest_users_home_view"), vwb.m200311Y("window_type", "normal"), vwb.m200311Y("module", OMSTemplateModeType.page), vwb.m200311Y("trace_id", ""), vwb.m200311Y("right_recommend_type", ""), vwb.m200311Y("show_label", ""), vwb.m200311Y("live_status", "on"), vwb.m200311Y("liveRecommendCategory", "insert"));
    }

    /* JADX INFO: renamed from: w */
    public final void m148117w(String liveId, String anchorId) {
        zvf0.m220368A("e_live_room_enter", "p_suggest_users_home_view", vwb.m200311Y(FirebaseAnalytics.Param.INDEX, "NA"), vwb.m200311Y("module", OMSTemplateModeType.page), vwb.m200311Y("liveId", liveId), vwb.m200311Y("anchorId", anchorId), vwb.m200311Y("is_gif", "1"), vwb.m200311Y("live_enter_source", "suggest_users_home_view"), vwb.m200311Y("trace_id", ""), vwb.m200311Y("show_label", ""), vwb.m200311Y("liveRecommendCategory", "insert"), vwb.m200311Y("live_status", "on"), vwb.m200311Y("right_recommend_type", ""), vwb.m200311Y("window_type", "normal"));
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: b */
    public void mo30009b(@Nullable VSwipeCard card) {
    }
}
