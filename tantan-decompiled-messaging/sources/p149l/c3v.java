package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0222a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.card.VSwipeCard;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.PartialListOpt;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p046p1.mobile.putong.core.newui.home.views.SuperLikeBanner;
import com.p046p1.mobile.putong.core.newui.home.views.SwipeLikeButton;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C15167a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010$\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J1\u0010)\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020'2\u0006\u0010#\u001a\u00020\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000fH\u0016¢\u0006\u0004\b+\u0010,J\u0019\u0010.\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b.\u0010/J!\u00104\u001a\u0004\u0018\u0001032\u0006\u00101\u001a\u0002002\u0006\u0010\u001b\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u001aH\u0016¢\u0006\u0004\b6\u0010\u001dJ-\u0010:\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00108\u001a\u00020'2\u0006\u00109\u001a\u00020\u000f¢\u0006\u0004\b:\u0010;J\u001f\u0010<\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b<\u0010=R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020B8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010CR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u0010ER\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010ER\u0016\u0010G\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010FR\u0016\u0010I\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010HR\u0016\u0010J\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010HR\u0016\u0010L\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010HR\u0016\u0010M\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010H¨\u0006N"}, m87232d2 = {"Ll/c3v;", "Ll/ool0;", "Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;)V", "", "factor", "Lcom/p1/mobile/putong/core/newui/home/views/SwipeLikeButton;", "likeButton", "dislikeButton", "", "o", "(FLcom/p1/mobile/putong/core/newui/home/views/SwipeLikeButton;Lcom/p1/mobile/putong/core/newui/home/views/SwipeLikeButton;)V", "n", "", "showing", "Lcom/p1/mobile/putong/core/newui/home/views/SuperLikeBanner;", "superLikeView", "m", "(ZLcom/p1/mobile/putong/core/newui/home/views/SuperLikeBanner;)V", BLiveStormDanmakuGiftResourceType.f44444l, "()Lcom/p1/mobile/putong/core/newui/home/views/SwipeLikeButton;", "k", "j", "()Lcom/p1/mobile/putong/core/newui/home/views/SuperLikeBanner;", "Landroid/view/View;", "card", "q", "(Landroid/view/View;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "cardType", Constants.INAPP_DATA_TAG, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/p1/mobile/putong/core/data/VirtualCardType;)Landroid/view/View;", OMSTemplateModeType.view, "", "position", "e", "(Landroid/view/View;ILcom/p1/mobile/putong/core/data/VirtualCardType;Landroid/view/View;)V", "f", "()Z", "Lcom/p1/mobile/putong/core/card/VSwipeCard;", "b", "(Lcom/p1/mobile/putong/core/card/VSwipeCard;)V", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "swipeDirection", "Ll/t7m;", "Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "g", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ll/t7m;)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "c", "horizontal", "animatingOutState", "isAnimateBacking", "p", "(ZFIZ)V", RXScreenCaptureService.KEY_INDEX, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "a", "Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "root", "Lcom/p1/mobile/putong/core/newui/home/views/SwipeLikeButton;", "Lcom/p1/mobile/putong/core/newui/home/views/SuperLikeBanner;", "superLikeBanner", "Z", "isSwipeLeft", "isSwipeRight", "h", "isSwipeUp", "showingSuperLikeBanner", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class c3v implements ool0 {

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

    public c3v(@NotNull NewNewHomeFrag newNewHomeFrag) {
        newNewHomeFrag.getClass();
        this.frag = newNewHomeFrag;
    }

    /* JADX INFO: renamed from: j */
    private final SuperLikeBanner m105102j() {
        SuperLikeBanner superLikeBanner = this.superLikeBanner;
        if (superLikeBanner != null) {
            return superLikeBanner;
        }
        Intrinsics.m87502r("superLikeBanner");
        return null;
    }

    /* JADX INFO: renamed from: k */
    private final SwipeLikeButton m105103k() {
        SwipeLikeButton swipeLikeButton = this.dislikeButton;
        if (swipeLikeButton != null) {
            return swipeLikeButton;
        }
        Intrinsics.m87502r("dislikeButton");
        return null;
    }

    /* JADX INFO: renamed from: l */
    private final SwipeLikeButton m105104l() {
        SwipeLikeButton swipeLikeButton = this.likeButton;
        if (swipeLikeButton != null) {
            return swipeLikeButton;
        }
        Intrinsics.m87502r("likeButton");
        return null;
    }

    /* JADX INFO: renamed from: n */
    private final void m105106n(float factor, SwipeLikeButton likeButton, SwipeLikeButton dislikeButton) {
        float fM87595a = C15167a.m87595a(-1.0f, factor * 2.0f);
        likeButton.setVisibility(4);
        dislikeButton.m39214z(-fM87595a);
        dislikeButton.setVisibility(0);
        likeButton.setPressed(false);
        dislikeButton.setPressed(true);
    }

    /* JADX INFO: renamed from: o */
    private final void m105107o(float factor, SwipeLikeButton likeButton, SwipeLikeButton dislikeButton) {
        likeButton.m39214z(C15167a.m87598d(1.0f, factor * 2.0f));
        likeButton.setVisibility(0);
        dislikeButton.setVisibility(4);
        likeButton.setPressed(true);
        dislikeButton.setPressed(false);
    }

    /* JADX INFO: renamed from: q */
    private final void m105108q(View card) {
        if (card instanceof VSwipeCard) {
            final VSwipeCard vSwipeCard = (VSwipeCard) card;
            vSwipeCard.m35147O0(false);
            vSwipeCard.postDelayed(new Runnable() { // from class: l.b3v
                @Override // java.lang.Runnable
                public final void run() {
                    c3v.m105109r(vSwipeCard);
                }
            }, 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final void m105109r(VSwipeCard vSwipeCard) {
        vSwipeCard.m35147O0(true);
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: c */
    public void mo30010c(@NotNull View view) {
        view.getClass();
    }

    @Override // p149l.ool0
    @NotNull
    /* JADX INFO: renamed from: d */
    public View mo30011d(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent, @Nullable VirtualCardType cardType) {
        inflater.getClass();
        parent.getClass();
        m105110i(inflater, parent);
        ConstraintLayout constraintLayout = this.root;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("root");
        return null;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: e */
    public void mo30012e(@NotNull View view, int position, @NotNull VirtualCardType cardType, @Nullable View card) {
        view.getClass();
        cardType.getClass();
        if (position == 0) {
            m105108q(card);
            PartialListOpt<CoreSuggested.UserInfo> partialListOptM221515e = CoreModule.f17545c.f19663m0.f19394a0.m221515e();
            if (partialListOptM221515e == null) {
                return;
            }
            List<CoreSuggested.UserInfo> list = partialListOptM221515e.loaded;
            list.getClass();
            if (list.isEmpty() || list.size() <= position) {
                return;
            }
            qib0.f154713b0.f139232c.mo67223I6().mo123342c(position, view, list.get(position).extensionObject);
        }
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: f */
    public boolean mo30013f() {
        return false;
    }

    @Override // p149l.ool0
    @Nullable
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo30014g(@NotNull SwipeDirection swipeDirection, @NotNull t7m card) {
        swipeDirection.getClass();
        card.getClass();
        qib0.f154713b0.f139232c.mo67223I6().mo123341b(swipeDirection.getValue());
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: i */
    public final View m105110i(LayoutInflater inflater, ViewGroup parent) {
        View viewMo123340a = qib0.f154713b0.f139232c.mo67223I6().mo123340a(inflater, parent);
        viewMo123340a.getClass();
        this.root = (ConstraintLayout) viewMo123340a;
        SwipeLikeButton swipeLikeButton = new SwipeLikeButton(parent.getContext());
        this.likeButton = swipeLikeButton;
        swipeLikeButton.m39211u("https://auto.tancdn.com/v1/raw/a982f15f-30aa-47be-9b7e-50ec88482f5311.so");
        SwipeLikeButton swipeLikeButton2 = this.likeButton;
        if (swipeLikeButton2 == null) {
            Intrinsics.m87502r("likeButton");
            swipeLikeButton2 = null;
        }
        swipeLikeButton2.setId(View.generateViewId());
        SwipeLikeButton swipeLikeButton3 = new SwipeLikeButton(parent.getContext());
        this.dislikeButton = swipeLikeButton3;
        swipeLikeButton3.m39211u("https://auto.tancdn.com/v1/raw/da3d1a53-b937-41f8-883c-c16c842ca35e11.so");
        SwipeLikeButton swipeLikeButton4 = this.dislikeButton;
        if (swipeLikeButton4 == null) {
            Intrinsics.m87502r("dislikeButton");
            swipeLikeButton4 = null;
        }
        swipeLikeButton4.setId(View.generateViewId());
        SuperLikeBanner superLikeBanner = new SuperLikeBanner(parent.getContext());
        this.superLikeBanner = superLikeBanner;
        superLikeBanner.m39201h(new int[]{x2c0.f189937Z2, x2c0.f189969a3, x2c0.f190001b3, x2c0.f190033c3, x2c0.f190065d3, x2c0.f190096e3, x2c0.f190128f3, x2c0.f190160g3, x2c0.f190192h3, x2c0.f190224i3, x2c0.f190254j3, x2c0.f190286k3, x2c0.f190318l3, x2c0.f190350m3, x2c0.f190382n3, x2c0.f190414o3}, 20L);
        SuperLikeBanner superLikeBanner2 = this.superLikeBanner;
        if (superLikeBanner2 == null) {
            Intrinsics.m87502r("superLikeBanner");
            superLikeBanner2 = null;
        }
        superLikeBanner2.setId(View.generateViewId());
        ConstraintLayout constraintLayout = this.root;
        if (constraintLayout == null) {
            Intrinsics.m87502r("root");
            constraintLayout = null;
        }
        SwipeLikeButton swipeLikeButton5 = this.likeButton;
        if (swipeLikeButton5 == null) {
            Intrinsics.m87502r("likeButton");
            swipeLikeButton5 = null;
        }
        constraintLayout.addView(swipeLikeButton5);
        ConstraintLayout constraintLayout2 = this.root;
        if (constraintLayout2 == null) {
            Intrinsics.m87502r("root");
            constraintLayout2 = null;
        }
        SwipeLikeButton swipeLikeButton6 = this.dislikeButton;
        if (swipeLikeButton6 == null) {
            Intrinsics.m87502r("dislikeButton");
            swipeLikeButton6 = null;
        }
        constraintLayout2.addView(swipeLikeButton6);
        ConstraintLayout constraintLayout3 = this.root;
        if (constraintLayout3 == null) {
            Intrinsics.m87502r("root");
            constraintLayout3 = null;
        }
        SuperLikeBanner superLikeBanner3 = this.superLikeBanner;
        if (superLikeBanner3 == null) {
            Intrinsics.m87502r("superLikeBanner");
            superLikeBanner3 = null;
        }
        constraintLayout3.addView(superLikeBanner3);
        C0222a c0222a = new C0222a();
        ConstraintLayout constraintLayout4 = this.root;
        if (constraintLayout4 == null) {
            Intrinsics.m87502r("root");
            constraintLayout4 = null;
        }
        c0222a.m1148c(constraintLayout4);
        SwipeLikeButton swipeLikeButton7 = this.likeButton;
        if (swipeLikeButton7 == null) {
            Intrinsics.m87502r("likeButton");
            swipeLikeButton7 = null;
        }
        c0222a.m1152g(swipeLikeButton7.getId(), xdl0.m208407w(100.0f));
        SwipeLikeButton swipeLikeButton8 = this.likeButton;
        if (swipeLikeButton8 == null) {
            Intrinsics.m87502r("likeButton");
            swipeLikeButton8 = null;
        }
        c0222a.m1155j(swipeLikeButton8.getId(), xdl0.m208407w(100.0f));
        SwipeLikeButton swipeLikeButton9 = this.likeButton;
        if (swipeLikeButton9 == null) {
            Intrinsics.m87502r("likeButton");
            swipeLikeButton9 = null;
        }
        c0222a.m1163s(swipeLikeButton9.getId(), 4);
        SwipeLikeButton swipeLikeButton10 = this.likeButton;
        if (swipeLikeButton10 == null) {
            Intrinsics.m87502r("likeButton");
            swipeLikeButton10 = null;
        }
        c0222a.m1151f(swipeLikeButton10.getId(), 6, 0, 6, xdl0.m208407w(16.0f));
        SwipeLikeButton swipeLikeButton11 = this.likeButton;
        if (swipeLikeButton11 == null) {
            Intrinsics.m87502r("likeButton");
            swipeLikeButton11 = null;
        }
        c0222a.m1151f(swipeLikeButton11.getId(), 3, 0, 3, xdl0.m208407w(16.0f));
        SwipeLikeButton swipeLikeButton12 = this.dislikeButton;
        if (swipeLikeButton12 == null) {
            Intrinsics.m87502r("dislikeButton");
            swipeLikeButton12 = null;
        }
        c0222a.m1152g(swipeLikeButton12.getId(), xdl0.m208407w(100.0f));
        SwipeLikeButton swipeLikeButton13 = this.dislikeButton;
        if (swipeLikeButton13 == null) {
            Intrinsics.m87502r("dislikeButton");
            swipeLikeButton13 = null;
        }
        c0222a.m1155j(swipeLikeButton13.getId(), xdl0.m208407w(100.0f));
        SwipeLikeButton swipeLikeButton14 = this.dislikeButton;
        if (swipeLikeButton14 == null) {
            Intrinsics.m87502r("dislikeButton");
            swipeLikeButton14 = null;
        }
        c0222a.m1163s(swipeLikeButton14.getId(), 4);
        SwipeLikeButton swipeLikeButton15 = this.dislikeButton;
        if (swipeLikeButton15 == null) {
            Intrinsics.m87502r("dislikeButton");
            swipeLikeButton15 = null;
        }
        c0222a.m1151f(swipeLikeButton15.getId(), 7, 0, 7, xdl0.m208407w(16.0f));
        SwipeLikeButton swipeLikeButton16 = this.dislikeButton;
        if (swipeLikeButton16 == null) {
            Intrinsics.m87502r("dislikeButton");
            swipeLikeButton16 = null;
        }
        c0222a.m1151f(swipeLikeButton16.getId(), 3, 0, 3, xdl0.m208407w(16.0f));
        SuperLikeBanner superLikeBanner4 = this.superLikeBanner;
        if (superLikeBanner4 == null) {
            Intrinsics.m87502r("superLikeBanner");
            superLikeBanner4 = null;
        }
        c0222a.m1152g(superLikeBanner4.getId(), xdl0.m208407w(300.0f));
        SuperLikeBanner superLikeBanner5 = this.superLikeBanner;
        if (superLikeBanner5 == null) {
            Intrinsics.m87502r("superLikeBanner");
            superLikeBanner5 = null;
        }
        c0222a.m1155j(superLikeBanner5.getId(), xdl0.m208407w(167.0f));
        SuperLikeBanner superLikeBanner6 = this.superLikeBanner;
        if (superLikeBanner6 == null) {
            Intrinsics.m87502r("superLikeBanner");
            superLikeBanner6 = null;
        }
        c0222a.m1150e(superLikeBanner6.getId(), 6, 0, 6);
        SuperLikeBanner superLikeBanner7 = this.superLikeBanner;
        if (superLikeBanner7 == null) {
            Intrinsics.m87502r("superLikeBanner");
            superLikeBanner7 = null;
        }
        c0222a.m1150e(superLikeBanner7.getId(), 7, 0, 7);
        SuperLikeBanner superLikeBanner8 = this.superLikeBanner;
        if (superLikeBanner8 == null) {
            Intrinsics.m87502r("superLikeBanner");
            superLikeBanner8 = null;
        }
        c0222a.m1151f(superLikeBanner8.getId(), 4, 0, 4, xdl0.m208407w(120.0f));
        ConstraintLayout constraintLayout5 = this.root;
        if (constraintLayout5 == null) {
            Intrinsics.m87502r("root");
            constraintLayout5 = null;
        }
        c0222a.m1146a(constraintLayout5);
        ConstraintLayout constraintLayout6 = this.root;
        if (constraintLayout6 != null) {
            return constraintLayout6;
        }
        Intrinsics.m87502r("root");
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final void m105111p(boolean horizontal, float factor, int animatingOutState, boolean isAnimateBacking) {
        if (!horizontal) {
            if (IntlCountryCodeController.m28126v()) {
                return;
            }
            SwipeLikeButton swipeLikeButtonM105104l = m105104l();
            swipeLikeButtonM105104l.setVisibility(4);
            swipeLikeButtonM105104l.setPressed(false);
            SwipeLikeButton swipeLikeButtonM105103k = m105103k();
            swipeLikeButtonM105103k.setVisibility(4);
            swipeLikeButtonM105103k.setPressed(false);
            if (factor <= 0.0f) {
                m105105m(false, m105102j());
                return;
            }
            if (!isAnimateBacking && animatingOutState == VSwipeCard.f20279F) {
                this.isSwipeLeft = false;
                this.isSwipeRight = false;
                this.isSwipeUp = true;
            } else if (isAnimateBacking) {
                if (this.showingSuperLikeBanner) {
                    m105105m(false, m105102j());
                    return;
                }
                return;
            } else if (this.isSwipeLeft || this.isSwipeRight) {
                return;
            }
            m105105m(true, m105102j());
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
            m105107o(factor, m105104l(), m105103k());
        } else if (factor >= 0.0f || animatingOutState == VSwipeCard.f20281H) {
            SwipeLikeButton swipeLikeButtonM105104l2 = m105104l();
            swipeLikeButtonM105104l2.setVisibility(4);
            swipeLikeButtonM105104l2.setPressed(false);
            SwipeLikeButton swipeLikeButtonM105103k2 = m105103k();
            swipeLikeButtonM105103k2.setVisibility(4);
            swipeLikeButtonM105103k2.setPressed(false);
        } else {
            if (!isAnimateBacking && animatingOutState == VSwipeCard.f20279F) {
                this.isSwipeLeft = true;
                this.isSwipeRight = false;
                this.isSwipeUp = false;
            } else if (this.isSwipeRight || this.isSwipeUp) {
                return;
            }
            m105106n(factor, m105104l(), m105103k());
        }
        m105105m(false, m105102j());
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: b */
    public void mo30009b(@Nullable VSwipeCard card) {
    }

    /* JADX INFO: renamed from: m */
    private final void m105105m(boolean showing, SuperLikeBanner superLikeView) {
    }
}
