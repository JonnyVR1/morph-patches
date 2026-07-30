package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p000p1.mobile.putong.core.data.SwipeDirection;
import com.p000p1.mobile.putong.core.data.VirtualCardType;
import com.p000p1.mobile.putong.core.p001ui.home.virtualcard.SuperLikeOrUndoGuideCardView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeCard;
import com.p1.mobile.putong.core.card.VSwipeStack;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l.e51;
import l.eyl;
import l.i6c0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010 \u001a\u00020\u001f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0012\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\"\u0010#R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010'R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010)¨\u0006*"}, d2 = {"Ll/vxg0;", "Ll/ool0;", "Ll/eyl;", "frag", "<init>", "(Ll/eyl;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "cardType", "Landroid/view/View;", "d", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/p1/mobile/putong/core/data/VirtualCardType;)Landroid/view/View;", "view", "", "position", "card", "", "e", "(Landroid/view/View;ILcom/p1/mobile/putong/core/data/VirtualCardType;Landroid/view/View;)V", "", "f", "()Z", "Lcom/p1/mobile/putong/core/card/VSwipeCard;", "b", "(Lcom/p1/mobile/putong/core/card/VSwipeCard;)V", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "swipeDirection", "Ll/t7m;", "Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "g", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ll/t7m;)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "c", "(Landroid/view/View;)V", "a", "Ll/eyl;", "Lcom/p1/mobile/putong/core/ui/home/virtualcard/SuperLikeOrUndoGuideCardView;", "Lcom/p1/mobile/putong/core/ui/home/virtualcard/SuperLikeOrUndoGuideCardView;", "cardView", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "card_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class vxg0 implements ool0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public eyl frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public SuperLikeOrUndoGuideCardView cardView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VirtualCardType cardType;

    /* JADX INFO: renamed from: l.vxg0$a */
    @Metadata(k = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
    public static final /* synthetic */ class C3456a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f8098a;

        static {
            int[] iArr = new int[VirtualCardType.values().length];
            try {
                iArr[VirtualCardType.SuperlikeGuideCard.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VirtualCardType.UndoGuideCard.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f8098a = iArr;
        }
    }

    public vxg0(@NotNull eyl eylVar) {
        eylVar.getClass();
        this.frag = eylVar;
    }

    /* JADX INFO: renamed from: h */
    public static void m10390h(vxg0 vxg0Var) {
        vxg0Var.frag.u1(3000);
    }

    /* JADX INFO: renamed from: i */
    public static Unit m10391i(vxg0 vxg0Var, VirtualCardType virtualCardType) {
        String str;
        View viewV1 = vxg0Var.frag.V1();
        if ((viewV1 instanceof VSwipeCard) || (viewV1 instanceof t7m)) {
            if (!(viewV1 instanceof t7m)) {
                vxg0Var.frag.V(SwipeDirection.RIGHT);
            }
            int i = C3456a.f8098a[virtualCardType.ordinal()];
            if (i != 1) {
                str = i != 2 ? "" : "e_newbieguide_undo";
            } else {
                str = "e_newbieguide_superlike";
            }
            zvf0.r(str, "p_suggest_users_home_view");
            CoreModule.c.m0.c2.add(str);
            vxg0Var.frag.V(SwipeDirection.RIGHT);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static void m10392j(vxg0 vxg0Var) {
        vxg0Var.frag.T1(3000);
        zvf0.x("e_superlike_balance_exposure", "p_suggest_users_home_view");
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: b */
    public void mo5286b(@Nullable VSwipeCard card) {
        String str;
        if (this.cardView != null) {
            VirtualCardType virtualCardType = this.cardType;
            SuperLikeOrUndoGuideCardView superLikeOrUndoGuideCardView = null;
            if (virtualCardType == null) {
                Intrinsics.r("cardType");
                virtualCardType = null;
            }
            int i = C3456a.f8098a[virtualCardType.ordinal()];
            if (i != 1) {
                str = i != 2 ? "" : "e_newbieguide_undo";
            } else {
                str = "e_newbieguide_superlike";
            }
            zvf0.x(str, "p_suggest_users_home_view");
            SuperLikeOrUndoGuideCardView superLikeOrUndoGuideCardView2 = this.cardView;
            if (superLikeOrUndoGuideCardView2 == null) {
                Intrinsics.r("cardView");
            } else {
                superLikeOrUndoGuideCardView = superLikeOrUndoGuideCardView2;
            }
            superLikeOrUndoGuideCardView.m3482j();
        }
    }

    @Override // p003l.ool0
    @NotNull
    /* JADX INFO: renamed from: d */
    public View mo5288d(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent, @NotNull VirtualCardType cardType) {
        inflater.getClass();
        parent.getClass();
        cardType.getClass();
        View viewInflate = inflater.inflate(i6c0.t, parent, false);
        viewInflate.getClass();
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p003l.ool0
    /* JADX INFO: renamed from: e */
    public void mo5289e(@NotNull View view, int position, @NotNull final VirtualCardType cardType, @Nullable View card) {
        view.getClass();
        cardType.getClass();
        SuperLikeOrUndoGuideCardView superLikeOrUndoGuideCardView = (SuperLikeOrUndoGuideCardView) view;
        this.cardView = superLikeOrUndoGuideCardView;
        this.cardType = cardType;
        if (superLikeOrUndoGuideCardView == null) {
            Intrinsics.r("cardView");
            superLikeOrUndoGuideCardView = null;
        }
        superLikeOrUndoGuideCardView.m3479f(cardType, new Function0() { // from class: l.uxg0
            public final Object invoke() {
                return vxg0.m10391i(this.f7838a, cardType);
            }
        });
        this.frag.O3();
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: f */
    public boolean mo5290f() {
        return true;
    }

    @Override // p003l.ool0
    @NotNull
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo5291g(@Nullable SwipeDirection swipeDirection, @NotNull t7m card) {
        card.getClass();
        VirtualCardType virtualCardType = this.cardType;
        if (virtualCardType == null) {
            Intrinsics.r("cardType");
            virtualCardType = null;
        }
        int i = C3456a.f8098a[virtualCardType.ordinal()];
        if (i == 1) {
            e51.H(this.frag.q1(), new Runnable() { // from class: l.sxg0
                @Override // java.lang.Runnable
                public final void run() {
                    vxg0.m10392j(this.f7478a);
                }
            }, 500L);
        } else if (i == 2) {
            e51.H(this.frag.q1(), new Runnable() { // from class: l.txg0
                @Override // java.lang.Runnable
                public final void run() {
                    vxg0.m10390h(this.f7639a);
                }
            }, 500L);
        }
        this.frag.I();
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: c */
    public void mo5287c(@Nullable View view) {
    }
}
