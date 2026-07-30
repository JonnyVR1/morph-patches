package p006l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.CoreSuggested;
import com.p000p1.mobile.putong.core.card.VSwipeCard;
import com.p000p1.mobile.putong.core.card.VSwipeStack;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.data.LiveLivingCardDataWrapper;
import com.p1.mobile.putong.core.data.PartialListOpt;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.core.data.Voice;
import com.p1.mobile.putong.core.data.VoiceLiveTag;
import com.p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p1.mobile.putong.core.newui.home.b;
import com.p1.mobile.putong.core.newui.home.c;
import com.p1.mobile.putong.core.newui.home.views.SuperLikeBanner;
import com.p1.mobile.putong.core.newui.home.views.SwipeLikeButton;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.a;
import l.d30;
import l.j760;
import l.lsi0;
import l.ool0;
import l.t7m;
import l.vwb;
import l.wsf0;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b!\u0010\"J%\u0010(\u001a\u00020\n2\u0006\u0010$\u001a\u00020#2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u0005H\u0002¢\u0006\u0004\b+\u0010\"J+\u00102\u001a\u00020\u00052\u0006\u0010-\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u00010.2\b\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b2\u00103J1\u00104\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u00052\u0006\u0010$\u001a\u00020#2\u0006\u00101\u001a\u0002002\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0015H\u0016¢\u0006\u0004\b6\u00107J\u0019\u00109\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\b9\u0010:J#\u0010?\u001a\u0004\u0018\u00010>2\b\u0010<\u001a\u0004\u0018\u00010;2\u0006\u0010 \u001a\u00020=H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u0005H\u0016¢\u0006\u0004\bA\u0010\"J-\u0010E\u001a\u00020\n2\u0006\u0010B\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010C\u001a\u00020#2\u0006\u0010D\u001a\u00020\u0015¢\u0006\u0004\bE\u0010FJ/\u0010K\u001a\u00020\n2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020G2\u0006\u0010J\u001a\u00020G2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\bK\u0010LJ'\u0010M\u001a\u00020\n2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020G2\u0006\u0010J\u001a\u00020GH\u0002¢\u0006\u0004\bM\u0010NJ\u001f\u0010O\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u00052\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\bO\u0010PR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b9\u0010U\u001a\u0004\bV\u0010WR\u0016\u0010Z\u001a\u00020X8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010YR\u0018\u0010\\\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010[R\u0016\u0010^\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010]R\u0016\u0010_\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010]R\u0016\u0010`\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010]R\u0016\u0010b\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010]R\u0016\u0010d\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010]¨\u0006e"}, d2 = {"Ll/a3v;", "Ll/ool0;", "Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "frag", "Ll/wsf0;", "Landroid/view/View;", "Lcom/p1/mobile/putong/core/newui/home/c;", "stack", "<init>", "(Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;Ll/wsf0;)V", "", "x", "()V", "", "factor", "Lcom/p1/mobile/putong/core/newui/home/views/SwipeLikeButton;", "likeButton", "dislikeButton", "r", "(FLcom/p1/mobile/putong/core/newui/home/views/SwipeLikeButton;Lcom/p1/mobile/putong/core/newui/home/views/SwipeLikeButton;)V", "q", "", "showing", "Lcom/p1/mobile/putong/core/newui/home/views/SuperLikeBanner;", "superLikeView", "p", "(ZLcom/p1/mobile/putong/core/newui/home/views/SuperLikeBanner;)V", "o", "()Lcom/p1/mobile/putong/core/newui/home/views/SwipeLikeButton;", "n", "m", "()Lcom/p1/mobile/putong/core/newui/home/views/SuperLikeBanner;", "card", "t", "(Landroid/view/View;)V", "", "position", "Lcom/p1/mobile/putong/core/data/PartialListOpt;", "Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;", "suggestedValue", "v", "(ILcom/p1/mobile/putong/core/data/PartialListOpt;)V", "view", "w", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "cardType", "d", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/p1/mobile/putong/core/data/VirtualCardType;)Landroid/view/View;", "e", "(Landroid/view/View;ILcom/p1/mobile/putong/core/data/VirtualCardType;Landroid/view/View;)V", "f", "()Z", "Lcom/p1/mobile/putong/core/card/VSwipeCard;", "b", "(Lcom/p1/mobile/putong/core/card/VSwipeCard;)V", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "swipeDirection", "Ll/t7m;", "Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "g", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ll/t7m;)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "c", "horizontal", "animatingOutState", "isAnimateBacking", "s", "(ZFIZ)V", "", "liveId", "anchorId", "labelName", "y", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "z", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "l", "(Landroid/view/View;I)V", "a", "Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "Ll/wsf0;", "getStack", "()Ll/wsf0;", "Ll/k3v;", "Ll/k3v;", "viewRender", "Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;", "userInfo", "Z", "isHasSendMV", "isSwipeLeft", "isSwipeRight", "h", "isSwipeUp", "i", "showingSuperLikeBanner", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class a3v implements ool0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final NewNewHomeFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final wsf0<View, c> stack;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public k3v viewRender;

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

    public a3v(@NotNull NewNewHomeFrag newNewHomeFrag, @NotNull wsf0<View, c> wsf0Var) {
        newNewHomeFrag.getClass();
        wsf0Var.getClass();
        this.frag = newNewHomeFrag;
        this.stack = wsf0Var;
    }

    /* JADX INFO: renamed from: h */
    public static void m11718h(a3v a3vVar, View view) {
        view.getClass();
        a3vVar.m11739l(view, 0);
    }

    /* JADX INFO: renamed from: i */
    public static void m11719i(a3v a3vVar, View view) {
        view.getClass();
        a3vVar.m11739l(view, 1);
    }

    /* JADX INFO: renamed from: k */
    public static void m11721k(a3v a3vVar, SuperLikeBanner superLikeBanner) {
        a3vVar.showingSuperLikeBanner = false;
        superLikeBanner.i();
        xdl0.M0(superLikeBanner, false);
    }

    /* JADX INFO: renamed from: m */
    private final SuperLikeBanner m11722m() {
        k3v k3vVar = this.viewRender;
        if (k3vVar == null) {
            Intrinsics.r("viewRender");
            k3vVar = null;
        }
        return k3vVar.m17928j();
    }

    /* JADX INFO: renamed from: n */
    private final SwipeLikeButton m11723n() {
        k3v k3vVar = this.viewRender;
        if (k3vVar == null) {
            Intrinsics.r("viewRender");
            k3vVar = null;
        }
        return k3vVar.m17925g();
    }

    /* JADX INFO: renamed from: o */
    private final SwipeLikeButton m11724o() {
        k3v k3vVar = this.viewRender;
        if (k3vVar == null) {
            Intrinsics.r("viewRender");
            k3vVar = null;
        }
        return k3vVar.m17927i();
    }

    /* JADX INFO: renamed from: p */
    private final void m11725p(boolean showing, final SuperLikeBanner superLikeView) {
        LiveLivingCardDataWrapper liveLivingCardDataWrapper;
        CoreSuggested.UserInfo userInfo = this.userInfo;
        if (userInfo != null) {
            String originUserId = null;
            if ((userInfo != null ? userInfo.liveLivingCardDataWrapper : null) == null) {
                return;
            }
            if (showing) {
                CoreSuggested coreSuggested = CoreModule.f1534c.f3652m0;
                if (userInfo != null && (liveLivingCardDataWrapper = userInfo.liveLivingCardDataWrapper) != null) {
                    originUserId = liveLivingCardDataWrapper.getOriginUserId();
                }
                if (!coreSuggested.m2950L6(originUserId)) {
                    xdl0.M0(superLikeView, true);
                    if (this.showingSuperLikeBanner) {
                        return;
                    }
                    this.showingSuperLikeBanner = true;
                    superLikeView.k();
                    return;
                }
            }
            if (this.showingSuperLikeBanner) {
                superLikeView.l(true, new d30() { // from class: l.w2v
                    public final void call() {
                        a3v.m11721k(this.f24900a, superLikeView);
                    }
                });
            } else {
                superLikeView.i();
                xdl0.M0(superLikeView, false);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    private final void m11726q(float factor, SwipeLikeButton likeButton, SwipeLikeButton dislikeButton) {
        float fA = a.a(-1.0f, factor * 2.0f);
        likeButton.setVisibility(4);
        dislikeButton.z(-fA);
        dislikeButton.setVisibility(0);
        likeButton.setPressed(false);
        dislikeButton.setPressed(true);
    }

    /* JADX INFO: renamed from: r */
    private final void m11727r(float factor, SwipeLikeButton likeButton, SwipeLikeButton dislikeButton) {
        likeButton.z(a.d(1.0f, factor * 2.0f));
        likeButton.setVisibility(0);
        dislikeButton.setVisibility(4);
        likeButton.setPressed(true);
        dislikeButton.setPressed(false);
    }

    /* JADX INFO: renamed from: t */
    private final void m11728t(View card) {
        if (card instanceof VSwipeCard) {
            final VSwipeCard vSwipeCard = (VSwipeCard) card;
            vSwipeCard.m7089O0(false);
            vSwipeCard.postDelayed(new Runnable() { // from class: l.z2v
                @Override // java.lang.Runnable
                public final void run() {
                    a3v.m11729u(vSwipeCard);
                }
            }, 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final void m11729u(VSwipeCard vSwipeCard) {
        vSwipeCard.m7089O0(true);
    }

    /* JADX INFO: renamed from: v */
    private final void m11730v(int position, PartialListOpt<CoreSuggested.UserInfo> suggestedValue) {
        List list = suggestedValue.loaded;
        list.getClass();
        if (list.isEmpty() || list.size() <= position) {
            return;
        }
        this.userInfo = (CoreSuggested.UserInfo) list.get(position);
    }

    /* JADX INFO: renamed from: w */
    private final void m11731w(View view) {
        k3v k3vVar = new k3v(view, this.stack);
        k3vVar.m17932n();
        this.viewRender = k3vVar;
        xdl0.E0(k3vVar.m17926h(), new View.OnClickListener() { // from class: l.x2v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                a3v.m11719i(this.f27332a, view2);
            }
        });
        k3v k3vVar2 = this.viewRender;
        if (k3vVar2 == null) {
            Intrinsics.r("viewRender");
            k3vVar2 = null;
        }
        xdl0.E0(k3vVar2.m17929k(), new View.OnClickListener() { // from class: l.y2v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                a3v.m11718h(this.f27989a, view2);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    private final void m11732x() {
        String str;
        String originUserId;
        LiveLivingCardDataWrapper liveLivingCardDataWrapper;
        String str2;
        List list;
        Voice currentVoice;
        List list2;
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
            if (currentVoice2 == null || (str2 = currentVoice2.id) == null) {
                str2 = "";
            }
            originUserId = liveLivingCardDataWrapper.getOriginUserId();
            Voice currentVoice3 = liveLivingCardDataWrapper.getCurrentVoice();
            if (currentVoice3 != null && (list = currentVoice3.liveAttributeTags) != null && (!list.isEmpty()) && (currentVoice = liveLivingCardDataWrapper.getCurrentVoice()) != null && (list2 = currentVoice.liveAttributeTags) != null && (voiceLiveTag = (VoiceLiveTag) list2.get(0)) != null && (str3 = voiceLiveTag.text) != null) {
                str4 = str3;
            }
            str = str4;
            str4 = str2;
        }
        m11742z(str4, originUserId, str);
        this.isHasSendMV = true;
    }

    /* JADX INFO: renamed from: c */
    public void m11734c(@NotNull View view) {
        LiveLivingCardDataWrapper liveLivingCardDataWrapper;
        view.getClass();
        b bVar = this.frag.C;
        CoreSuggested.UserInfo userInfo = this.userInfo;
        bVar.F6("home_card", (userInfo == null || (liveLivingCardDataWrapper = userInfo.liveLivingCardDataWrapper) == null) ? null : liveLivingCardDataWrapper.getUser());
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public View m11735d(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable VirtualCardType cardType) {
        inflater.getClass();
        View viewInflate = inflater.inflate(f6c0.f12442u6, parent, false);
        viewInflate.getClass();
        return viewInflate;
    }

    /* JADX INFO: renamed from: e */
    public void m11736e(@NotNull View view, int position, @NotNull VirtualCardType cardType, @Nullable View card) {
        view.getClass();
        cardType.getClass();
        PartialListOpt<CoreSuggested.UserInfo> partialListOpt = (PartialListOpt) CoreModule.f1534c.f3652m0.f3383a0.e();
        if (partialListOpt == null) {
            return;
        }
        m11728t(card);
        m11730v(position, partialListOpt);
        m11731w(view);
        CoreSuggested.UserInfo userInfo = this.userInfo;
        if (userInfo != null) {
            k3v k3vVar = this.viewRender;
            if (k3vVar == null) {
                Intrinsics.r("viewRender");
                k3vVar = null;
            }
            k3vVar.m17934p(userInfo);
        }
        if (position == 0) {
            m11732x();
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m11737f() {
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult m11738g(@Nullable SwipeDirection swipeDirection, @NotNull t7m card) {
        card.getClass();
        return VSwipeStack.OnCardSwipeResult.back;
    }

    /* JADX INFO: renamed from: l */
    public final void m11739l(View view, int position) {
        String str;
        String str2;
        LiveLivingCardDataWrapper liveLivingCardDataWrapper;
        String str3;
        List list;
        Voice currentVoice;
        List list2;
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
            if (TextUtils.isEmpty(currentVoice3 != null ? currentVoice3.id : null) || (currentVoice2 = liveLivingCardDataWrapper.getCurrentVoice()) == null || (str3 = currentVoice2.id) == null) {
                str3 = "";
            }
            String originUserId = liveLivingCardDataWrapper.getOriginUserId();
            Voice currentVoice4 = liveLivingCardDataWrapper.getCurrentVoice();
            if (currentVoice4 != null && (list = currentVoice4.liveAttributeTags) != null && (!list.isEmpty()) && (currentVoice = liveLivingCardDataWrapper.getCurrentVoice()) != null && (list2 = currentVoice.liveAttributeTags) != null && (voiceLiveTag = (VoiceLiveTag) list2.get(0)) != null && (str4 = voiceLiveTag.text) != null) {
                str5 = str4;
            }
            str = str3;
            str2 = originUserId;
        }
        if (str.length() == 0) {
            lsi0.y("语音直播间不存在");
        } else {
            m11741y(str, str2, str5, position);
            CoreModule.m1855Q().M6().p(view.getContext(), str, "suggest-card", str2, (String) null);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m11740s(boolean horizontal, float factor, int animatingOutState, boolean isAnimateBacking) {
        if (!horizontal) {
            if (IntlCountryCodeController.m21v()) {
                return;
            }
            SwipeLikeButton swipeLikeButtonM11724o = m11724o();
            swipeLikeButtonM11724o.setVisibility(4);
            swipeLikeButtonM11724o.setPressed(false);
            SwipeLikeButton swipeLikeButtonM11723n = m11723n();
            swipeLikeButtonM11723n.setVisibility(4);
            swipeLikeButtonM11723n.setPressed(false);
            if (factor <= 0.0f) {
                m11725p(false, m11722m());
                return;
            }
            if (!isAnimateBacking && animatingOutState == VSwipeCard.f4268F) {
                this.isSwipeLeft = false;
                this.isSwipeRight = false;
                this.isSwipeUp = true;
            } else if (isAnimateBacking) {
                if (this.showingSuperLikeBanner) {
                    m11725p(false, m11722m());
                    return;
                }
                return;
            } else if (this.isSwipeLeft || this.isSwipeRight) {
                return;
            }
            m11725p(true, m11722m());
            return;
        }
        if (factor > 0.0f && animatingOutState != VSwipeCard.f4271I) {
            if (!isAnimateBacking && animatingOutState == VSwipeCard.f4268F) {
                this.isSwipeLeft = false;
                this.isSwipeRight = true;
                this.isSwipeUp = false;
            } else if (this.isSwipeLeft || this.isSwipeUp) {
                return;
            }
            m11727r(factor, m11724o(), m11723n());
        } else if (factor >= 0.0f || animatingOutState == VSwipeCard.f4270H) {
            SwipeLikeButton swipeLikeButtonM11724o2 = m11724o();
            swipeLikeButtonM11724o2.setVisibility(4);
            swipeLikeButtonM11724o2.setPressed(false);
            SwipeLikeButton swipeLikeButtonM11723n2 = m11723n();
            swipeLikeButtonM11723n2.setVisibility(4);
            swipeLikeButtonM11723n2.setPressed(false);
        } else {
            if (!isAnimateBacking && animatingOutState == VSwipeCard.f4268F) {
                this.isSwipeLeft = true;
                this.isSwipeRight = false;
                this.isSwipeUp = false;
            } else if (this.isSwipeRight || this.isSwipeUp) {
                return;
            }
            m11726q(factor, m11724o(), m11723n());
        }
        m11725p(false, m11722m());
    }

    /* JADX INFO: renamed from: y */
    public final void m11741y(String liveId, String anchorId, String labelName, int position) {
        zvf0.u("e_live_audio_room_enter", "p_suggest_users_home_view", new j760[]{vwb.Y("index", Integer.valueOf(position)), vwb.Y("liveId", liveId), vwb.Y("anchorId", anchorId), vwb.Y("audio_card_type", "swipe_card"), vwb.Y("audio_room_label", labelName), vwb.Y("audio_room_type", "普通"), vwb.Y("topic_id", "NA"), vwb.Y("audio_tab_id", "NA")});
    }

    /* JADX INFO: renamed from: z */
    public final void m11742z(String liveId, String anchorId, String labelName) {
        zvf0.A("e_live_audio_room_enter", "p_suggest_users_home_view", new j760[]{vwb.Y("index", "NA"), vwb.Y("liveId", liveId), vwb.Y("anchorId", anchorId), vwb.Y("audio_card_type", "swipe_card"), vwb.Y("audio_room_label", labelName), vwb.Y("audio_room_type", "普通"), vwb.Y("topic_id", "NA"), vwb.Y("audio_tab_id", "NA")});
    }

    /* JADX INFO: renamed from: b */
    public void m11733b(@Nullable VSwipeCard card) {
    }
}
