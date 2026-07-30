package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.LiveLivingCardDataWrapper;
import com.p051p1.mobile.putong.core.data.PartialListOpt;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.data.Voice;
import com.p051p1.mobile.putong.core.data.VoiceLiveTag;
import com.p051p1.mobile.putong.core.newui.home.C8094c;
import com.p051p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p051p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC8017b;
import com.p051p1.mobile.putong.core.newui.home.views.SuperLikeBanner;
import com.p051p1.mobile.putong.core.newui.home.views.SwipeLikeButton;
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

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b!\u0010\"J%\u0010(\u001a\u00020\n2\u0006\u0010$\u001a\u00020#2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u0005H\u0002¢\u0006\u0004\b+\u0010\"J+\u00102\u001a\u00020\u00052\u0006\u0010-\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u00010.2\b\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b2\u00103J1\u00104\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u00052\u0006\u0010$\u001a\u00020#2\u0006\u00101\u001a\u0002002\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0015H\u0016¢\u0006\u0004\b6\u00107J\u0019\u00109\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\b9\u0010:J#\u0010?\u001a\u0004\u0018\u00010>2\b\u0010<\u001a\u0004\u0018\u00010;2\u0006\u0010 \u001a\u00020=H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u0005H\u0016¢\u0006\u0004\bA\u0010\"J-\u0010E\u001a\u00020\n2\u0006\u0010B\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010C\u001a\u00020#2\u0006\u0010D\u001a\u00020\u0015¢\u0006\u0004\bE\u0010FJ/\u0010K\u001a\u00020\n2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020G2\u0006\u0010J\u001a\u00020G2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\bK\u0010LJ'\u0010M\u001a\u00020\n2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020G2\u0006\u0010J\u001a\u00020GH\u0002¢\u0006\u0004\bM\u0010NJ\u001f\u0010O\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u00052\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\bO\u0010PR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b9\u0010U\u001a\u0004\bV\u0010WR\u0016\u0010Z\u001a\u00020X8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010YR\u0018\u0010\\\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010[R\u0016\u0010^\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010]R\u0016\u0010_\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010]R\u0016\u0010`\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010]R\u0016\u0010b\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010]R\u0016\u0010d\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010]¨\u0006e"}, m88121d2 = {"Ll/b5v;", "Ll/sxl0;", "Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "frag", "Ll/f1g0;", "Landroid/view/View;", "Lcom/p1/mobile/putong/core/newui/home/c;", "stack", "<init>", "(Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;Ll/f1g0;)V", "", BaseSei.f14624X, "()V", "", "factor", "Lcom/p1/mobile/putong/core/newui/home/views/SwipeLikeButton;", "likeButton", "dislikeButton", "r", "(FLcom/p1/mobile/putong/core/newui/home/views/SwipeLikeButton;Lcom/p1/mobile/putong/core/newui/home/views/SwipeLikeButton;)V", "q", "", "showing", "Lcom/p1/mobile/putong/core/newui/home/views/SuperLikeBanner;", "superLikeView", "p", "(ZLcom/p1/mobile/putong/core/newui/home/views/SuperLikeBanner;)V", "o", "()Lcom/p1/mobile/putong/core/newui/home/views/SwipeLikeButton;", "n", "m", "()Lcom/p1/mobile/putong/core/newui/home/views/SuperLikeBanner;", "card", Constants.KEY_T, "(Landroid/view/View;)V", "", "position", "Lcom/p1/mobile/putong/core/data/PartialListOpt;", "Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;", "suggestedValue", ResourceDirection.f39656v, "(ILcom/p1/mobile/putong/core/data/PartialListOpt;)V", OMSTemplateModeType.view, "w", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "cardType", Constants.INAPP_DATA_TAG, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/p1/mobile/putong/core/data/VirtualCardType;)Landroid/view/View;", "e", "(Landroid/view/View;ILcom/p1/mobile/putong/core/data/VirtualCardType;Landroid/view/View;)V", "f", "()Z", "Lcom/p1/mobile/putong/core/card/VSwipeCard;", "b", "(Lcom/p1/mobile/putong/core/card/VSwipeCard;)V", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "swipeDirection", "Ll/jam;", "Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "g", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ll/jam;)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "c", "horizontal", "animatingOutState", "isAnimateBacking", BLiveStormDanmakuGiftResourceType.f45294s, "(ZFIZ)V", "", "liveId", "anchorId", "labelName", BaseSei.f14625Y, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", BaseSei.f14626Z, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", BLiveStormDanmakuGiftResourceType.f45292l, "(Landroid/view/View;I)V", "a", "Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "Ll/f1g0;", "getStack", "()Ll/f1g0;", "Ll/l5v;", "Ll/l5v;", "viewRender", "Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;", "userInfo", "Z", "isHasSendMV", "isSwipeLeft", "isSwipeRight", "h", "isSwipeUp", RXScreenCaptureService.KEY_INDEX, "showingSuperLikeBanner", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class b5v implements sxl0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final NewNewHomeFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final f1g0<View, C8094c> stack;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public l5v viewRender;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public CoreSuggested.UserInfo userInfo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean isHasSendMV;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean isSwipeLeft;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean isSwipeRight;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean isSwipeUp;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean showingSuperLikeBanner;

    public b5v(@NotNull NewNewHomeFrag newNewHomeFrag, @NotNull f1g0<View, C8094c> f1g0Var) {
        newNewHomeFrag.getClass();
        f1g0Var.getClass();
        this.frag = newNewHomeFrag;
        this.stack = f1g0Var;
    }

    /* JADX INFO: renamed from: h */
    public static void m102629h(b5v b5vVar, View view) {
        view.getClass();
        b5vVar.m102644l(view, 0);
    }

    /* JADX INFO: renamed from: i */
    public static void m102630i(b5v b5vVar, View view) {
        view.getClass();
        b5vVar.m102644l(view, 1);
    }

    /* JADX INFO: renamed from: k */
    public static void m102632k(b5v b5vVar, SuperLikeBanner superLikeBanner) {
        b5vVar.showingSuperLikeBanner = false;
        superLikeBanner.m40205i();
        bnl0.m105525M0(superLikeBanner, false);
    }

    /* JADX INFO: renamed from: m */
    private final SuperLikeBanner m102633m() {
        l5v l5vVar = this.viewRender;
        if (l5vVar == null) {
            Intrinsics.m88391r("viewRender");
            l5vVar = null;
        }
        return l5vVar.m152991j();
    }

    /* JADX INFO: renamed from: n */
    private final SwipeLikeButton m102634n() {
        l5v l5vVar = this.viewRender;
        if (l5vVar == null) {
            Intrinsics.m88391r("viewRender");
            l5vVar = null;
        }
        return l5vVar.m152988g();
    }

    /* JADX INFO: renamed from: o */
    private final SwipeLikeButton m102635o() {
        l5v l5vVar = this.viewRender;
        if (l5vVar == null) {
            Intrinsics.m88391r("viewRender");
            l5vVar = null;
        }
        return l5vVar.m152990i();
    }

    /* JADX INFO: renamed from: p */
    private final void m102636p(boolean showing, final SuperLikeBanner superLikeView) {
        LiveLivingCardDataWrapper liveLivingCardDataWrapper;
        CoreSuggested.UserInfo userInfo = this.userInfo;
        if (userInfo != null) {
            String originUserId = null;
            if ((userInfo != null ? userInfo.liveLivingCardDataWrapper : null) == null) {
                return;
            }
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
                superLikeView.m40208l(true, new x20() { // from class: l.x4v
                    @Override // p153l.x20
                    public final void call() {
                        b5v.m102632k(this.f192432a, superLikeView);
                    }
                });
            } else {
                superLikeView.m40205i();
                bnl0.m105525M0(superLikeView, false);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    private final void m102637q(float factor, SwipeLikeButton likeButton, SwipeLikeButton dislikeButton) {
        float fM88485a = C15274a.m88485a(-1.0f, factor * 2.0f);
        likeButton.setVisibility(4);
        dislikeButton.m40217z(-fM88485a);
        dislikeButton.setVisibility(0);
        likeButton.setPressed(false);
        dislikeButton.setPressed(true);
    }

    /* JADX INFO: renamed from: r */
    private final void m102638r(float factor, SwipeLikeButton likeButton, SwipeLikeButton dislikeButton) {
        likeButton.m40217z(C15274a.m88488d(1.0f, factor * 2.0f));
        likeButton.setVisibility(0);
        dislikeButton.setVisibility(4);
        likeButton.setPressed(true);
        dislikeButton.setPressed(false);
    }

    /* JADX INFO: renamed from: t */
    private final void m102639t(View card) {
        if (card instanceof VSwipeCard) {
            final VSwipeCard vSwipeCard = (VSwipeCard) card;
            vSwipeCard.m36150O0(false);
            vSwipeCard.postDelayed(new Runnable() { // from class: l.a5v
                @Override // java.lang.Runnable
                public final void run() {
                    b5v.m102640u(vSwipeCard);
                }
            }, 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final void m102640u(VSwipeCard vSwipeCard) {
        vSwipeCard.m36150O0(true);
    }

    /* JADX INFO: renamed from: v */
    private final void m102641v(int position, PartialListOpt<CoreSuggested.UserInfo> suggestedValue) {
        List<CoreSuggested.UserInfo> list = suggestedValue.loaded;
        list.getClass();
        if (list.isEmpty() || list.size() <= position) {
            return;
        }
        this.userInfo = list.get(position);
    }

    /* JADX INFO: renamed from: w */
    private final void m102642w(View view) {
        l5v l5vVar = new l5v(view, this.stack);
        l5vVar.m152995n();
        this.viewRender = l5vVar;
        bnl0.m105509E0(l5vVar.m152989h(), new View.OnClickListener() { // from class: l.y4v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                b5v.m102630i(this.f197518a, view2);
            }
        });
        l5v l5vVar2 = this.viewRender;
        if (l5vVar2 == null) {
            Intrinsics.m88391r("viewRender");
            l5vVar2 = null;
        }
        bnl0.m105509E0(l5vVar2.m152992k(), new View.OnClickListener() { // from class: l.z4v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                b5v.m102629h(this.f202983a, view2);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    private final void m102643x() {
        String str;
        String originUserId;
        LiveLivingCardDataWrapper liveLivingCardDataWrapper;
        String str2;
        List<VoiceLiveTag> list;
        Voice currentVoice;
        List<VoiceLiveTag> list2;
        VoiceLiveTag voiceLiveTag;
        String str3;
        if (this.isHasSendMV) {
            return;
        }
        CoreSuggested.UserInfo userInfo = this.userInfo;
        String str4 = "";
        if (userInfo == null || (liveLivingCardDataWrapper = userInfo.liveLivingCardDataWrapper) == null) {
            str = "";
            originUserId = str;
        } else {
            Voice currentVoice2 = liveLivingCardDataWrapper.getCurrentVoice();
            if (currentVoice2 == null || (str2 = currentVoice2.f21273id) == null) {
                str2 = "";
            }
            originUserId = liveLivingCardDataWrapper.getOriginUserId();
            Voice currentVoice3 = liveLivingCardDataWrapper.getCurrentVoice();
            if (currentVoice3 != null && (list = currentVoice3.liveAttributeTags) != null && (!list.isEmpty()) && (currentVoice = liveLivingCardDataWrapper.getCurrentVoice()) != null && (list2 = currentVoice.liveAttributeTags) != null && (voiceLiveTag = list2.get(0)) != null && (str3 = voiceLiveTag.text) != null) {
                str4 = str3;
            }
            str = str4;
            str4 = str2;
        }
        m102647z(str4, originUserId, str);
        this.isHasSendMV = true;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: c */
    public void mo31008c(@NotNull View view) {
        LiveLivingCardDataWrapper liveLivingCardDataWrapper;
        view.getClass();
        ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b = this.frag.f22420C;
        CoreSuggested.UserInfo userInfo = this.userInfo;
        viewTreeObserverOnGlobalLayoutListenerC8017b.m38156F6("home_card", (userInfo == null || (liveLivingCardDataWrapper = userInfo.liveLivingCardDataWrapper) == null) ? null : liveLivingCardDataWrapper.getUser());
    }

    @Override // p153l.sxl0
    @NotNull
    /* JADX INFO: renamed from: d */
    public View mo31009d(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable VirtualCardType cardType) {
        inflater.getClass();
        View viewInflate = inflater.inflate(kec0.f126099v6, parent, false);
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
        m102639t(card);
        m102641v(position, partialListOptM222761e);
        m102642w(view);
        CoreSuggested.UserInfo userInfo = this.userInfo;
        if (userInfo != null) {
            l5v l5vVar = this.viewRender;
            if (l5vVar == null) {
                Intrinsics.m88391r("viewRender");
                l5vVar = null;
            }
            l5vVar.m152997p(userInfo);
        }
        if (position == 0) {
            m102643x();
        }
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: f */
    public boolean mo31011f() {
        return false;
    }

    @Override // p153l.sxl0
    @Nullable
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo31012g(@Nullable SwipeDirection swipeDirection, @NotNull jam card) {
        card.getClass();
        return VSwipeStack.OnCardSwipeResult.back;
    }

    /* JADX INFO: renamed from: l */
    public final void m102644l(View view, int position) {
        String str;
        String str2;
        LiveLivingCardDataWrapper liveLivingCardDataWrapper;
        String str3;
        List<VoiceLiveTag> list;
        Voice currentVoice;
        List<VoiceLiveTag> list2;
        VoiceLiveTag voiceLiveTag;
        String str4;
        Voice currentVoice2;
        CoreSuggested.UserInfo userInfo = this.userInfo;
        String str5 = "";
        if (userInfo == null || (liveLivingCardDataWrapper = userInfo.liveLivingCardDataWrapper) == null) {
            str = "";
            str2 = str;
        } else {
            Voice currentVoice3 = liveLivingCardDataWrapper.getCurrentVoice();
            if (TextUtils.isEmpty(currentVoice3 != null ? currentVoice3.f21273id : null) || (currentVoice2 = liveLivingCardDataWrapper.getCurrentVoice()) == null || (str3 = currentVoice2.f21273id) == null) {
                str3 = "";
            }
            String originUserId = liveLivingCardDataWrapper.getOriginUserId();
            Voice currentVoice4 = liveLivingCardDataWrapper.getCurrentVoice();
            if (currentVoice4 != null && (list = currentVoice4.liveAttributeTags) != null && (!list.isEmpty()) && (currentVoice = liveLivingCardDataWrapper.getCurrentVoice()) != null && (list2 = currentVoice.liveAttributeTags) != null && (voiceLiveTag = list2.get(0)) != null && (str4 = voiceLiveTag.text) != null) {
                str5 = str4;
            }
            str = str3;
            str2 = originUserId;
        }
        if (str.length() == 0) {
            o1j0.m165651y("语音直播间不存在");
        } else {
            m102646y(str, str2, str5, position);
            CoreModule.m30934Q().mo68412M6().mo127345p(view.getContext(), str, "suggest-card", str2, null);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m102645s(boolean horizontal, float factor, int animatingOutState, boolean isAnimateBacking) {
        if (!horizontal) {
            if (IntlCountryCodeController.m29125v()) {
                return;
            }
            SwipeLikeButton swipeLikeButtonM102635o = m102635o();
            swipeLikeButtonM102635o.setVisibility(4);
            swipeLikeButtonM102635o.setPressed(false);
            SwipeLikeButton swipeLikeButtonM102634n = m102634n();
            swipeLikeButtonM102634n.setVisibility(4);
            swipeLikeButtonM102634n.setPressed(false);
            if (factor <= 0.0f) {
                m102636p(false, m102633m());
                return;
            }
            if (!isAnimateBacking && animatingOutState == VSwipeCard.f21021F) {
                this.isSwipeLeft = false;
                this.isSwipeRight = false;
                this.isSwipeUp = true;
            } else if (isAnimateBacking) {
                if (this.showingSuperLikeBanner) {
                    m102636p(false, m102633m());
                    return;
                }
                return;
            } else if (this.isSwipeLeft || this.isSwipeRight) {
                return;
            }
            m102636p(true, m102633m());
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
            m102638r(factor, m102635o(), m102634n());
        } else if (factor >= 0.0f || animatingOutState == VSwipeCard.f21023H) {
            SwipeLikeButton swipeLikeButtonM102635o2 = m102635o();
            swipeLikeButtonM102635o2.setVisibility(4);
            swipeLikeButtonM102635o2.setPressed(false);
            SwipeLikeButton swipeLikeButtonM102634n2 = m102634n();
            swipeLikeButtonM102634n2.setVisibility(4);
            swipeLikeButtonM102634n2.setPressed(false);
        } else {
            if (!isAnimateBacking && animatingOutState == VSwipeCard.f21021F) {
                this.isSwipeLeft = true;
                this.isSwipeRight = false;
                this.isSwipeUp = false;
            } else if (this.isSwipeRight || this.isSwipeUp) {
                return;
            }
            m102637q(factor, m102635o(), m102634n());
        }
        m102636p(false, m102633m());
    }

    /* JADX INFO: renamed from: y */
    public final void m102646y(String liveId, String anchorId, String labelName, int position) {
        i4g0.m138523u("e_live_audio_room_enter", "p_suggest_users_home_view", jyb.m147494Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(position)), jyb.m147494Y("liveId", liveId), jyb.m147494Y("anchorId", anchorId), jyb.m147494Y("audio_card_type", "swipe_card"), jyb.m147494Y("audio_room_label", labelName), jyb.m147494Y("audio_room_type", "普通"), jyb.m147494Y("topic_id", "NA"), jyb.m147494Y("audio_tab_id", "NA"));
    }

    /* JADX INFO: renamed from: z */
    public final void m102647z(String liveId, String anchorId, String labelName) {
        i4g0.m138492A("e_live_audio_room_enter", "p_suggest_users_home_view", jyb.m147494Y(FirebaseAnalytics.Param.INDEX, "NA"), jyb.m147494Y("liveId", liveId), jyb.m147494Y("anchorId", anchorId), jyb.m147494Y("audio_card_type", "swipe_card"), jyb.m147494Y("audio_room_label", labelName), jyb.m147494Y("audio_room_type", "普通"), jyb.m147494Y("topic_id", "NA"), jyb.m147494Y("audio_tab_id", "NA"));
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: b */
    public void mo31007b(@Nullable VSwipeCard card) {
    }
}
