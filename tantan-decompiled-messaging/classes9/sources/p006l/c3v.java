package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.CoreSuggested;
import com.p000p1.mobile.putong.core.card.VSwipeCard;
import com.p000p1.mobile.putong.core.card.VSwipeStack;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.data.PartialListOpt;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p1.mobile.putong.core.newui.home.views.SuperLikeBanner;
import com.p1.mobile.putong.core.newui.home.views.SwipeLikeButton;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.a;
import l.ool0;
import l.t7m;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010$\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J1\u0010)\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020'2\u0006\u0010#\u001a\u00020\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000fH\u0016¢\u0006\u0004\b+\u0010,J\u0019\u0010.\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b.\u0010/J!\u00104\u001a\u0004\u0018\u0001032\u0006\u00101\u001a\u0002002\u0006\u0010\u001b\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u001aH\u0016¢\u0006\u0004\b6\u0010\u001dJ-\u0010:\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00108\u001a\u00020'2\u0006\u00109\u001a\u00020\u000f¢\u0006\u0004\b:\u0010;J\u001f\u0010<\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b<\u0010=R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020B8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010CR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u0010ER\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010ER\u0016\u0010G\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010FR\u0016\u0010I\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010HR\u0016\u0010J\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010HR\u0016\u0010L\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010HR\u0016\u0010M\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010H¨\u0006N"}, d2 = {"Ll/c3v;", "Ll/ool0;", "Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;)V", "", "factor", "Lcom/p1/mobile/putong/core/newui/home/views/SwipeLikeButton;", "likeButton", "dislikeButton", "", "o", "(FLcom/p1/mobile/putong/core/newui/home/views/SwipeLikeButton;Lcom/p1/mobile/putong/core/newui/home/views/SwipeLikeButton;)V", "n", "", "showing", "Lcom/p1/mobile/putong/core/newui/home/views/SuperLikeBanner;", "superLikeView", "m", "(ZLcom/p1/mobile/putong/core/newui/home/views/SuperLikeBanner;)V", "l", "()Lcom/p1/mobile/putong/core/newui/home/views/SwipeLikeButton;", "k", "j", "()Lcom/p1/mobile/putong/core/newui/home/views/SuperLikeBanner;", "Landroid/view/View;", "card", "q", "(Landroid/view/View;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "cardType", "d", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/p1/mobile/putong/core/data/VirtualCardType;)Landroid/view/View;", "view", "", "position", "e", "(Landroid/view/View;ILcom/p1/mobile/putong/core/data/VirtualCardType;Landroid/view/View;)V", "f", "()Z", "Lcom/p1/mobile/putong/core/card/VSwipeCard;", "b", "(Lcom/p1/mobile/putong/core/card/VSwipeCard;)V", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "swipeDirection", "Ll/t7m;", "Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "g", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ll/t7m;)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "c", "horizontal", "animatingOutState", "isAnimateBacking", "p", "(ZFIZ)V", "i", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "a", "Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "root", "Lcom/p1/mobile/putong/core/newui/home/views/SwipeLikeButton;", "Lcom/p1/mobile/putong/core/newui/home/views/SuperLikeBanner;", "superLikeBanner", "Z", "isSwipeLeft", "isSwipeRight", "h", "isSwipeUp", "showingSuperLikeBanner", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    private final SuperLikeBanner m13108j() {
        SuperLikeBanner superLikeBanner = this.superLikeBanner;
        if (superLikeBanner != null) {
            return superLikeBanner;
        }
        Intrinsics.r("superLikeBanner");
        return null;
    }

    /* JADX INFO: renamed from: k */
    private final SwipeLikeButton m13109k() {
        SwipeLikeButton swipeLikeButton = this.dislikeButton;
        if (swipeLikeButton != null) {
            return swipeLikeButton;
        }
        Intrinsics.r("dislikeButton");
        return null;
    }

    /* JADX INFO: renamed from: l */
    private final SwipeLikeButton m13110l() {
        SwipeLikeButton swipeLikeButton = this.likeButton;
        if (swipeLikeButton != null) {
            return swipeLikeButton;
        }
        Intrinsics.r("likeButton");
        return null;
    }

    /* JADX INFO: renamed from: n */
    private final void m13112n(float factor, SwipeLikeButton likeButton, SwipeLikeButton dislikeButton) {
        float fA = a.a(-1.0f, factor * 2.0f);
        likeButton.setVisibility(4);
        dislikeButton.z(-fA);
        dislikeButton.setVisibility(0);
        likeButton.setPressed(false);
        dislikeButton.setPressed(true);
    }

    /* JADX INFO: renamed from: o */
    private final void m13113o(float factor, SwipeLikeButton likeButton, SwipeLikeButton dislikeButton) {
        likeButton.z(a.d(1.0f, factor * 2.0f));
        likeButton.setVisibility(0);
        dislikeButton.setVisibility(4);
        likeButton.setPressed(true);
        dislikeButton.setPressed(false);
    }

    /* JADX INFO: renamed from: q */
    private final void m13114q(View card) {
        if (card instanceof VSwipeCard) {
            final VSwipeCard vSwipeCard = (VSwipeCard) card;
            vSwipeCard.m7089O0(false);
            vSwipeCard.postDelayed(new Runnable() { // from class: l.b3v
                @Override // java.lang.Runnable
                public final void run() {
                    c3v.m13115r(vSwipeCard);
                }
            }, 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final void m13115r(VSwipeCard vSwipeCard) {
        vSwipeCard.m7089O0(true);
    }

    /* JADX INFO: renamed from: c */
    public void m13117c(@NotNull View view) {
        view.getClass();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public View m13118d(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent, @Nullable VirtualCardType cardType) {
        inflater.getClass();
        parent.getClass();
        m13122i(inflater, parent);
        ConstraintLayout constraintLayout = this.root;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.r("root");
        return null;
    }

    /* JADX INFO: renamed from: e */
    public void m13119e(@NotNull View view, int position, @NotNull VirtualCardType cardType, @Nullable View card) {
        view.getClass();
        cardType.getClass();
        if (position == 0) {
            m13114q(card);
            PartialListOpt partialListOpt = (PartialListOpt) CoreModule.f1534c.f3652m0.f3383a0.e();
            if (partialListOpt == null) {
                return;
            }
            List list = partialListOpt.loaded;
            list.getClass();
            if (list.isEmpty() || list.size() <= position) {
                return;
            }
            qib0.f19804b0.f17708c.I6().c(position, view, ((CoreSuggested.UserInfo) list.get(position)).extensionObject);
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m13120f() {
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult m13121g(@NotNull SwipeDirection swipeDirection, @NotNull t7m card) {
        swipeDirection.getClass();
        card.getClass();
        qib0.f19804b0.f17708c.I6().b(swipeDirection.getValue());
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: i */
    public final View m13122i(LayoutInflater inflater, ViewGroup parent) {
        ConstraintLayout constraintLayoutA = qib0.f19804b0.f17708c.I6().a(inflater, parent);
        constraintLayoutA.getClass();
        this.root = constraintLayoutA;
        SwipeLikeButton swipeLikeButton = new SwipeLikeButton(parent.getContext());
        this.likeButton = swipeLikeButton;
        swipeLikeButton.u("https://auto.tancdn.com/v1/raw/a982f15f-30aa-47be-9b7e-50ec88482f5311.so");
        View view = this.likeButton;
        if (view == null) {
            Intrinsics.r("likeButton");
            view = null;
        }
        view.setId(View.generateViewId());
        SwipeLikeButton swipeLikeButton2 = new SwipeLikeButton(parent.getContext());
        this.dislikeButton = swipeLikeButton2;
        swipeLikeButton2.u("https://auto.tancdn.com/v1/raw/da3d1a53-b937-41f8-883c-c16c842ca35e11.so");
        View view2 = this.dislikeButton;
        if (view2 == null) {
            Intrinsics.r("dislikeButton");
            view2 = null;
        }
        view2.setId(View.generateViewId());
        SuperLikeBanner superLikeBanner = new SuperLikeBanner(parent.getContext());
        this.superLikeBanner = superLikeBanner;
        superLikeBanner.h(new int[]{x2c0.f26473Z2, x2c0.f26505a3, x2c0.f26537b3, x2c0.f26569c3, x2c0.f26601d3, x2c0.f26632e3, x2c0.f26664f3, x2c0.f26696g3, x2c0.f26728h3, x2c0.f26760i3, x2c0.f26790j3, x2c0.f26822k3, x2c0.f26854l3, x2c0.f26886m3, x2c0.f26918n3, x2c0.f26950o3}, 20L);
        View view3 = this.superLikeBanner;
        if (view3 == null) {
            Intrinsics.r("superLikeBanner");
            view3 = null;
        }
        view3.setId(View.generateViewId());
        ViewGroup viewGroup = this.root;
        if (viewGroup == null) {
            Intrinsics.r("root");
            viewGroup = null;
        }
        View view4 = this.likeButton;
        if (view4 == null) {
            Intrinsics.r("likeButton");
            view4 = null;
        }
        viewGroup.addView(view4);
        ViewGroup viewGroup2 = this.root;
        if (viewGroup2 == null) {
            Intrinsics.r("root");
            viewGroup2 = null;
        }
        View view5 = this.dislikeButton;
        if (view5 == null) {
            Intrinsics.r("dislikeButton");
            view5 = null;
        }
        viewGroup2.addView(view5);
        ViewGroup viewGroup3 = this.root;
        if (viewGroup3 == null) {
            Intrinsics.r("root");
            viewGroup3 = null;
        }
        View view6 = this.superLikeBanner;
        if (view6 == null) {
            Intrinsics.r("superLikeBanner");
            view6 = null;
        }
        viewGroup3.addView(view6);
        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
        ConstraintLayout constraintLayout = this.root;
        if (constraintLayout == null) {
            Intrinsics.r("root");
            constraintLayout = null;
        }
        aVar.c(constraintLayout);
        View view7 = this.likeButton;
        if (view7 == null) {
            Intrinsics.r("likeButton");
            view7 = null;
        }
        aVar.g(view7.getId(), xdl0.w(100.0f));
        View view8 = this.likeButton;
        if (view8 == null) {
            Intrinsics.r("likeButton");
            view8 = null;
        }
        aVar.j(view8.getId(), xdl0.w(100.0f));
        View view9 = this.likeButton;
        if (view9 == null) {
            Intrinsics.r("likeButton");
            view9 = null;
        }
        aVar.s(view9.getId(), 4);
        View view10 = this.likeButton;
        if (view10 == null) {
            Intrinsics.r("likeButton");
            view10 = null;
        }
        aVar.f(view10.getId(), 6, 0, 6, xdl0.w(16.0f));
        View view11 = this.likeButton;
        if (view11 == null) {
            Intrinsics.r("likeButton");
            view11 = null;
        }
        aVar.f(view11.getId(), 3, 0, 3, xdl0.w(16.0f));
        View view12 = this.dislikeButton;
        if (view12 == null) {
            Intrinsics.r("dislikeButton");
            view12 = null;
        }
        aVar.g(view12.getId(), xdl0.w(100.0f));
        View view13 = this.dislikeButton;
        if (view13 == null) {
            Intrinsics.r("dislikeButton");
            view13 = null;
        }
        aVar.j(view13.getId(), xdl0.w(100.0f));
        View view14 = this.dislikeButton;
        if (view14 == null) {
            Intrinsics.r("dislikeButton");
            view14 = null;
        }
        aVar.s(view14.getId(), 4);
        View view15 = this.dislikeButton;
        if (view15 == null) {
            Intrinsics.r("dislikeButton");
            view15 = null;
        }
        aVar.f(view15.getId(), 7, 0, 7, xdl0.w(16.0f));
        View view16 = this.dislikeButton;
        if (view16 == null) {
            Intrinsics.r("dislikeButton");
            view16 = null;
        }
        aVar.f(view16.getId(), 3, 0, 3, xdl0.w(16.0f));
        View view17 = this.superLikeBanner;
        if (view17 == null) {
            Intrinsics.r("superLikeBanner");
            view17 = null;
        }
        aVar.g(view17.getId(), xdl0.w(300.0f));
        View view18 = this.superLikeBanner;
        if (view18 == null) {
            Intrinsics.r("superLikeBanner");
            view18 = null;
        }
        aVar.j(view18.getId(), xdl0.w(167.0f));
        View view19 = this.superLikeBanner;
        if (view19 == null) {
            Intrinsics.r("superLikeBanner");
            view19 = null;
        }
        aVar.e(view19.getId(), 6, 0, 6);
        View view20 = this.superLikeBanner;
        if (view20 == null) {
            Intrinsics.r("superLikeBanner");
            view20 = null;
        }
        aVar.e(view20.getId(), 7, 0, 7);
        View view21 = this.superLikeBanner;
        if (view21 == null) {
            Intrinsics.r("superLikeBanner");
            view21 = null;
        }
        aVar.f(view21.getId(), 4, 0, 4, xdl0.w(120.0f));
        ConstraintLayout constraintLayout2 = this.root;
        if (constraintLayout2 == null) {
            Intrinsics.r("root");
            constraintLayout2 = null;
        }
        aVar.a(constraintLayout2);
        ConstraintLayout constraintLayout3 = this.root;
        if (constraintLayout3 != null) {
            return constraintLayout3;
        }
        Intrinsics.r("root");
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final void m13123p(boolean horizontal, float factor, int animatingOutState, boolean isAnimateBacking) {
        if (!horizontal) {
            if (IntlCountryCodeController.m21v()) {
                return;
            }
            SwipeLikeButton swipeLikeButtonM13110l = m13110l();
            swipeLikeButtonM13110l.setVisibility(4);
            swipeLikeButtonM13110l.setPressed(false);
            SwipeLikeButton swipeLikeButtonM13109k = m13109k();
            swipeLikeButtonM13109k.setVisibility(4);
            swipeLikeButtonM13109k.setPressed(false);
            if (factor <= 0.0f) {
                m13111m(false, m13108j());
                return;
            }
            if (!isAnimateBacking && animatingOutState == VSwipeCard.f4268F) {
                this.isSwipeLeft = false;
                this.isSwipeRight = false;
                this.isSwipeUp = true;
            } else if (isAnimateBacking) {
                if (this.showingSuperLikeBanner) {
                    m13111m(false, m13108j());
                    return;
                }
                return;
            } else if (this.isSwipeLeft || this.isSwipeRight) {
                return;
            }
            m13111m(true, m13108j());
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
            m13113o(factor, m13110l(), m13109k());
        } else if (factor >= 0.0f || animatingOutState == VSwipeCard.f4270H) {
            SwipeLikeButton swipeLikeButtonM13110l2 = m13110l();
            swipeLikeButtonM13110l2.setVisibility(4);
            swipeLikeButtonM13110l2.setPressed(false);
            SwipeLikeButton swipeLikeButtonM13109k2 = m13109k();
            swipeLikeButtonM13109k2.setVisibility(4);
            swipeLikeButtonM13109k2.setPressed(false);
        } else {
            if (!isAnimateBacking && animatingOutState == VSwipeCard.f4268F) {
                this.isSwipeLeft = true;
                this.isSwipeRight = false;
                this.isSwipeUp = false;
            } else if (this.isSwipeRight || this.isSwipeUp) {
                return;
            }
            m13112n(factor, m13110l(), m13109k());
        }
        m13111m(false, m13108j());
    }

    /* JADX INFO: renamed from: b */
    public void m13116b(@Nullable VSwipeCard card) {
    }

    /* JADX INFO: renamed from: m */
    private final void m13111m(boolean showing, SuperLikeBanner superLikeView) {
    }
}
