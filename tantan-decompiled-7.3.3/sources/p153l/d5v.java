package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0223a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.PartialListOpt;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p051p1.mobile.putong.core.newui.home.views.SuperLikeBanner;
import com.p051p1.mobile.putong.core.newui.home.views.SwipeLikeButton;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010$\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J1\u0010)\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020'2\u0006\u0010#\u001a\u00020\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000fH\u0016¢\u0006\u0004\b+\u0010,J\u0019\u0010.\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b.\u0010/J!\u00104\u001a\u0004\u0018\u0001032\u0006\u00101\u001a\u0002002\u0006\u0010\u001b\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u001aH\u0016¢\u0006\u0004\b6\u0010\u001dJ-\u0010:\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00108\u001a\u00020'2\u0006\u00109\u001a\u00020\u000f¢\u0006\u0004\b:\u0010;J\u001f\u0010<\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b<\u0010=R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020B8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010CR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u0010ER\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010ER\u0016\u0010G\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010FR\u0016\u0010I\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010HR\u0016\u0010J\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010HR\u0016\u0010L\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010HR\u0016\u0010M\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010H¨\u0006N"}, m88121d2 = {"Ll/d5v;", "Ll/sxl0;", "Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;)V", "", "factor", "Lcom/p1/mobile/putong/core/newui/home/views/SwipeLikeButton;", "likeButton", "dislikeButton", "", "o", "(FLcom/p1/mobile/putong/core/newui/home/views/SwipeLikeButton;Lcom/p1/mobile/putong/core/newui/home/views/SwipeLikeButton;)V", "n", "", "showing", "Lcom/p1/mobile/putong/core/newui/home/views/SuperLikeBanner;", "superLikeView", "m", "(ZLcom/p1/mobile/putong/core/newui/home/views/SuperLikeBanner;)V", BLiveStormDanmakuGiftResourceType.f45292l, "()Lcom/p1/mobile/putong/core/newui/home/views/SwipeLikeButton;", "k", "j", "()Lcom/p1/mobile/putong/core/newui/home/views/SuperLikeBanner;", "Landroid/view/View;", "card", "q", "(Landroid/view/View;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "cardType", Constants.INAPP_DATA_TAG, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/p1/mobile/putong/core/data/VirtualCardType;)Landroid/view/View;", OMSTemplateModeType.view, "", "position", "e", "(Landroid/view/View;ILcom/p1/mobile/putong/core/data/VirtualCardType;Landroid/view/View;)V", "f", "()Z", "Lcom/p1/mobile/putong/core/card/VSwipeCard;", "b", "(Lcom/p1/mobile/putong/core/card/VSwipeCard;)V", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "swipeDirection", "Ll/jam;", "Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "g", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ll/jam;)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "c", "horizontal", "animatingOutState", "isAnimateBacking", "p", "(ZFIZ)V", RXScreenCaptureService.KEY_INDEX, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "a", "Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "root", "Lcom/p1/mobile/putong/core/newui/home/views/SwipeLikeButton;", "Lcom/p1/mobile/putong/core/newui/home/views/SuperLikeBanner;", "superLikeBanner", "Z", "isSwipeLeft", "isSwipeRight", "h", "isSwipeUp", "showingSuperLikeBanner", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class d5v implements sxl0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final NewNewHomeFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public ConstraintLayout root;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public SwipeLikeButton likeButton;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public SwipeLikeButton dislikeButton;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public SuperLikeBanner superLikeBanner;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean isSwipeLeft;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean isSwipeRight;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean isSwipeUp;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean showingSuperLikeBanner;

    public d5v(@NotNull NewNewHomeFrag newNewHomeFrag) {
        newNewHomeFrag.getClass();
        this.frag = newNewHomeFrag;
    }

    /* JADX INFO: renamed from: j */
    private final SuperLikeBanner m114323j() {
        SuperLikeBanner superLikeBanner = this.superLikeBanner;
        if (superLikeBanner != null) {
            return superLikeBanner;
        }
        Intrinsics.m88391r("superLikeBanner");
        return null;
    }

    /* JADX INFO: renamed from: k */
    private final SwipeLikeButton m114324k() {
        SwipeLikeButton swipeLikeButton = this.dislikeButton;
        if (swipeLikeButton != null) {
            return swipeLikeButton;
        }
        Intrinsics.m88391r("dislikeButton");
        return null;
    }

    /* JADX INFO: renamed from: l */
    private final SwipeLikeButton m114325l() {
        SwipeLikeButton swipeLikeButton = this.likeButton;
        if (swipeLikeButton != null) {
            return swipeLikeButton;
        }
        Intrinsics.m88391r("likeButton");
        return null;
    }

    /* JADX INFO: renamed from: n */
    private final void m114327n(float factor, SwipeLikeButton likeButton, SwipeLikeButton dislikeButton) {
        float fM88485a = C15274a.m88485a(-1.0f, factor * 2.0f);
        likeButton.setVisibility(4);
        dislikeButton.m40217z(-fM88485a);
        dislikeButton.setVisibility(0);
        likeButton.setPressed(false);
        dislikeButton.setPressed(true);
    }

    /* JADX INFO: renamed from: o */
    private final void m114328o(float factor, SwipeLikeButton likeButton, SwipeLikeButton dislikeButton) {
        likeButton.m40217z(C15274a.m88488d(1.0f, factor * 2.0f));
        likeButton.setVisibility(0);
        dislikeButton.setVisibility(4);
        likeButton.setPressed(true);
        dislikeButton.setPressed(false);
    }

    /* JADX INFO: renamed from: q */
    private final void m114329q(View card) {
        if (card instanceof VSwipeCard) {
            final VSwipeCard vSwipeCard = (VSwipeCard) card;
            vSwipeCard.m36150O0(false);
            vSwipeCard.postDelayed(new Runnable() { // from class: l.c5v
                @Override // java.lang.Runnable
                public final void run() {
                    d5v.m114330r(vSwipeCard);
                }
            }, 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final void m114330r(VSwipeCard vSwipeCard) {
        vSwipeCard.m36150O0(true);
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: c */
    public void mo31008c(@NotNull View view) {
        view.getClass();
    }

    @Override // p153l.sxl0
    @NotNull
    /* JADX INFO: renamed from: d */
    public View mo31009d(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent, @Nullable VirtualCardType cardType) {
        inflater.getClass();
        parent.getClass();
        m114331i(inflater, parent);
        ConstraintLayout constraintLayout = this.root;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("root");
        return null;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: e */
    public void mo31010e(@NotNull View view, int position, @NotNull VirtualCardType cardType, @Nullable View card) {
        view.getClass();
        cardType.getClass();
        if (position == 0) {
            m114329q(card);
            PartialListOpt<CoreSuggested.UserInfo> partialListOptM222761e = CoreModule.f18264c.f20405m0.f20136a0.m222761e();
            if (partialListOptM222761e == null) {
                return;
            }
            List<CoreSuggested.UserInfo> list = partialListOptM222761e.loaded;
            list.getClass();
            if (list.isEmpty() || list.size() <= position) {
                return;
            }
            uqb0.f180396b0.f170326c.mo68406I6().mo143444c(position, view, list.get(position).extensionObject);
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
    public VSwipeStack.OnCardSwipeResult mo31012g(@NotNull SwipeDirection swipeDirection, @NotNull jam card) {
        swipeDirection.getClass();
        card.getClass();
        uqb0.f180396b0.f170326c.mo68406I6().mo143443b(swipeDirection.getValue());
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: i */
    public final View m114331i(LayoutInflater inflater, ViewGroup parent) {
        View viewMo143442a = uqb0.f180396b0.f170326c.mo68406I6().mo143442a(inflater, parent);
        viewMo143442a.getClass();
        this.root = (ConstraintLayout) viewMo143442a;
        SwipeLikeButton swipeLikeButton = new SwipeLikeButton(parent.getContext());
        this.likeButton = swipeLikeButton;
        swipeLikeButton.m40214u("https://auto.tancdn.com/v1/raw/a982f15f-30aa-47be-9b7e-50ec88482f5311.so");
        SwipeLikeButton swipeLikeButton2 = this.likeButton;
        if (swipeLikeButton2 == null) {
            Intrinsics.m88391r("likeButton");
            swipeLikeButton2 = null;
        }
        swipeLikeButton2.setId(View.generateViewId());
        SwipeLikeButton swipeLikeButton3 = new SwipeLikeButton(parent.getContext());
        this.dislikeButton = swipeLikeButton3;
        swipeLikeButton3.m40214u("https://auto.tancdn.com/v1/raw/da3d1a53-b937-41f8-883c-c16c842ca35e11.so");
        SwipeLikeButton swipeLikeButton4 = this.dislikeButton;
        if (swipeLikeButton4 == null) {
            Intrinsics.m88391r("dislikeButton");
            swipeLikeButton4 = null;
        }
        swipeLikeButton4.setId(View.generateViewId());
        SuperLikeBanner superLikeBanner = new SuperLikeBanner(parent.getContext());
        this.superLikeBanner = superLikeBanner;
        superLikeBanner.m40204h(new int[]{dbc0.f86812a3, dbc0.f86845b3, dbc0.f86878c3, dbc0.f86911d3, dbc0.f86943e3, dbc0.f86976f3, dbc0.f87009g3, dbc0.f87042h3, dbc0.f87075i3, dbc0.f87106j3, dbc0.f87139k3, dbc0.f87172l3, dbc0.f87205m3, dbc0.f87238n3, dbc0.f87271o3, dbc0.f87304p3}, 20L);
        SuperLikeBanner superLikeBanner2 = this.superLikeBanner;
        if (superLikeBanner2 == null) {
            Intrinsics.m88391r("superLikeBanner");
            superLikeBanner2 = null;
        }
        superLikeBanner2.setId(View.generateViewId());
        ConstraintLayout constraintLayout = this.root;
        if (constraintLayout == null) {
            Intrinsics.m88391r("root");
            constraintLayout = null;
        }
        SwipeLikeButton swipeLikeButton5 = this.likeButton;
        if (swipeLikeButton5 == null) {
            Intrinsics.m88391r("likeButton");
            swipeLikeButton5 = null;
        }
        constraintLayout.addView(swipeLikeButton5);
        ConstraintLayout constraintLayout2 = this.root;
        if (constraintLayout2 == null) {
            Intrinsics.m88391r("root");
            constraintLayout2 = null;
        }
        SwipeLikeButton swipeLikeButton6 = this.dislikeButton;
        if (swipeLikeButton6 == null) {
            Intrinsics.m88391r("dislikeButton");
            swipeLikeButton6 = null;
        }
        constraintLayout2.addView(swipeLikeButton6);
        ConstraintLayout constraintLayout3 = this.root;
        if (constraintLayout3 == null) {
            Intrinsics.m88391r("root");
            constraintLayout3 = null;
        }
        SuperLikeBanner superLikeBanner3 = this.superLikeBanner;
        if (superLikeBanner3 == null) {
            Intrinsics.m88391r("superLikeBanner");
            superLikeBanner3 = null;
        }
        constraintLayout3.addView(superLikeBanner3);
        C0223a c0223a = new C0223a();
        ConstraintLayout constraintLayout4 = this.root;
        if (constraintLayout4 == null) {
            Intrinsics.m88391r("root");
            constraintLayout4 = null;
        }
        c0223a.m1149c(constraintLayout4);
        SwipeLikeButton swipeLikeButton7 = this.likeButton;
        if (swipeLikeButton7 == null) {
            Intrinsics.m88391r("likeButton");
            swipeLikeButton7 = null;
        }
        c0223a.m1153g(swipeLikeButton7.getId(), bnl0.m105587w(100.0f));
        SwipeLikeButton swipeLikeButton8 = this.likeButton;
        if (swipeLikeButton8 == null) {
            Intrinsics.m88391r("likeButton");
            swipeLikeButton8 = null;
        }
        c0223a.m1156j(swipeLikeButton8.getId(), bnl0.m105587w(100.0f));
        SwipeLikeButton swipeLikeButton9 = this.likeButton;
        if (swipeLikeButton9 == null) {
            Intrinsics.m88391r("likeButton");
            swipeLikeButton9 = null;
        }
        c0223a.m1164s(swipeLikeButton9.getId(), 4);
        SwipeLikeButton swipeLikeButton10 = this.likeButton;
        if (swipeLikeButton10 == null) {
            Intrinsics.m88391r("likeButton");
            swipeLikeButton10 = null;
        }
        c0223a.m1152f(swipeLikeButton10.getId(), 6, 0, 6, bnl0.m105587w(16.0f));
        SwipeLikeButton swipeLikeButton11 = this.likeButton;
        if (swipeLikeButton11 == null) {
            Intrinsics.m88391r("likeButton");
            swipeLikeButton11 = null;
        }
        c0223a.m1152f(swipeLikeButton11.getId(), 3, 0, 3, bnl0.m105587w(16.0f));
        SwipeLikeButton swipeLikeButton12 = this.dislikeButton;
        if (swipeLikeButton12 == null) {
            Intrinsics.m88391r("dislikeButton");
            swipeLikeButton12 = null;
        }
        c0223a.m1153g(swipeLikeButton12.getId(), bnl0.m105587w(100.0f));
        SwipeLikeButton swipeLikeButton13 = this.dislikeButton;
        if (swipeLikeButton13 == null) {
            Intrinsics.m88391r("dislikeButton");
            swipeLikeButton13 = null;
        }
        c0223a.m1156j(swipeLikeButton13.getId(), bnl0.m105587w(100.0f));
        SwipeLikeButton swipeLikeButton14 = this.dislikeButton;
        if (swipeLikeButton14 == null) {
            Intrinsics.m88391r("dislikeButton");
            swipeLikeButton14 = null;
        }
        c0223a.m1164s(swipeLikeButton14.getId(), 4);
        SwipeLikeButton swipeLikeButton15 = this.dislikeButton;
        if (swipeLikeButton15 == null) {
            Intrinsics.m88391r("dislikeButton");
            swipeLikeButton15 = null;
        }
        c0223a.m1152f(swipeLikeButton15.getId(), 7, 0, 7, bnl0.m105587w(16.0f));
        SwipeLikeButton swipeLikeButton16 = this.dislikeButton;
        if (swipeLikeButton16 == null) {
            Intrinsics.m88391r("dislikeButton");
            swipeLikeButton16 = null;
        }
        c0223a.m1152f(swipeLikeButton16.getId(), 3, 0, 3, bnl0.m105587w(16.0f));
        SuperLikeBanner superLikeBanner4 = this.superLikeBanner;
        if (superLikeBanner4 == null) {
            Intrinsics.m88391r("superLikeBanner");
            superLikeBanner4 = null;
        }
        c0223a.m1153g(superLikeBanner4.getId(), bnl0.m105587w(300.0f));
        SuperLikeBanner superLikeBanner5 = this.superLikeBanner;
        if (superLikeBanner5 == null) {
            Intrinsics.m88391r("superLikeBanner");
            superLikeBanner5 = null;
        }
        c0223a.m1156j(superLikeBanner5.getId(), bnl0.m105587w(167.0f));
        SuperLikeBanner superLikeBanner6 = this.superLikeBanner;
        if (superLikeBanner6 == null) {
            Intrinsics.m88391r("superLikeBanner");
            superLikeBanner6 = null;
        }
        c0223a.m1151e(superLikeBanner6.getId(), 6, 0, 6);
        SuperLikeBanner superLikeBanner7 = this.superLikeBanner;
        if (superLikeBanner7 == null) {
            Intrinsics.m88391r("superLikeBanner");
            superLikeBanner7 = null;
        }
        c0223a.m1151e(superLikeBanner7.getId(), 7, 0, 7);
        SuperLikeBanner superLikeBanner8 = this.superLikeBanner;
        if (superLikeBanner8 == null) {
            Intrinsics.m88391r("superLikeBanner");
            superLikeBanner8 = null;
        }
        c0223a.m1152f(superLikeBanner8.getId(), 4, 0, 4, bnl0.m105587w(120.0f));
        ConstraintLayout constraintLayout5 = this.root;
        if (constraintLayout5 == null) {
            Intrinsics.m88391r("root");
            constraintLayout5 = null;
        }
        c0223a.m1147a(constraintLayout5);
        ConstraintLayout constraintLayout6 = this.root;
        if (constraintLayout6 != null) {
            return constraintLayout6;
        }
        Intrinsics.m88391r("root");
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final void m114332p(boolean horizontal, float factor, int animatingOutState, boolean isAnimateBacking) {
        if (!horizontal) {
            if (IntlCountryCodeController.m29125v()) {
                return;
            }
            SwipeLikeButton swipeLikeButtonM114325l = m114325l();
            swipeLikeButtonM114325l.setVisibility(4);
            swipeLikeButtonM114325l.setPressed(false);
            SwipeLikeButton swipeLikeButtonM114324k = m114324k();
            swipeLikeButtonM114324k.setVisibility(4);
            swipeLikeButtonM114324k.setPressed(false);
            if (factor <= 0.0f) {
                m114326m(false, m114323j());
                return;
            }
            if (!isAnimateBacking && animatingOutState == VSwipeCard.f21021F) {
                this.isSwipeLeft = false;
                this.isSwipeRight = false;
                this.isSwipeUp = true;
            } else if (isAnimateBacking) {
                if (this.showingSuperLikeBanner) {
                    m114326m(false, m114323j());
                    return;
                }
                return;
            } else if (this.isSwipeLeft || this.isSwipeRight) {
                return;
            }
            m114326m(true, m114323j());
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
            m114328o(factor, m114325l(), m114324k());
        } else if (factor >= 0.0f || animatingOutState == VSwipeCard.f21023H) {
            SwipeLikeButton swipeLikeButtonM114325l2 = m114325l();
            swipeLikeButtonM114325l2.setVisibility(4);
            swipeLikeButtonM114325l2.setPressed(false);
            SwipeLikeButton swipeLikeButtonM114324k2 = m114324k();
            swipeLikeButtonM114324k2.setVisibility(4);
            swipeLikeButtonM114324k2.setPressed(false);
        } else {
            if (!isAnimateBacking && animatingOutState == VSwipeCard.f21021F) {
                this.isSwipeLeft = true;
                this.isSwipeRight = false;
                this.isSwipeUp = false;
            } else if (this.isSwipeRight || this.isSwipeUp) {
                return;
            }
            m114327n(factor, m114325l(), m114324k());
        }
        m114326m(false, m114323j());
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: b */
    public void mo31007b(@Nullable VSwipeCard card) {
    }

    /* JADX INFO: renamed from: m */
    private final void m114326m(boolean showing, SuperLikeBanner superLikeView) {
    }
}
