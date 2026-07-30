package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeCard;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.p053ui.home.virtualcard.SuperLikeOrUndoGuideCardView;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010 \u001a\u00020\u001f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0012\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\"\u0010#R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010'R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010)¨\u0006*"}, m87232d2 = {"Ll/vxg0;", "Ll/ool0;", "Ll/eyl;", "frag", "<init>", "(Ll/eyl;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "cardType", "Landroid/view/View;", Constants.INAPP_DATA_TAG, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/p1/mobile/putong/core/data/VirtualCardType;)Landroid/view/View;", OMSTemplateModeType.view, "", "position", "card", "", "e", "(Landroid/view/View;ILcom/p1/mobile/putong/core/data/VirtualCardType;Landroid/view/View;)V", "", "f", "()Z", "Lcom/p1/mobile/putong/core/card/VSwipeCard;", "b", "(Lcom/p1/mobile/putong/core/card/VSwipeCard;)V", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "swipeDirection", "Ll/t7m;", "Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "g", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ll/t7m;)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "c", "(Landroid/view/View;)V", "a", "Ll/eyl;", "Lcom/p1/mobile/putong/core/ui/home/virtualcard/SuperLikeOrUndoGuideCardView;", "Lcom/p1/mobile/putong/core/ui/home/virtualcard/SuperLikeOrUndoGuideCardView;", "cardView", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "card_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class vxg0 implements ool0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public eyl frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public SuperLikeOrUndoGuideCardView cardView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VirtualCardType cardType;

    /* JADX INFO: renamed from: l.vxg0$a */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class C20757a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f183454a;

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
            f183454a = iArr;
        }
    }

    public vxg0(@NotNull eyl eylVar) {
        eylVar.getClass();
        this.frag = eylVar;
    }

    /* JADX INFO: renamed from: h */
    public static void m200558h(vxg0 vxg0Var) {
        vxg0Var.frag.mo36762u1(3000);
    }

    /* JADX INFO: renamed from: i */
    public static Unit m200559i(vxg0 vxg0Var, VirtualCardType virtualCardType) {
        String str;
        View viewMo36747V1 = vxg0Var.frag.mo36747V1();
        if ((viewMo36747V1 instanceof VSwipeCard) || (viewMo36747V1 instanceof t7m)) {
            if (!(viewMo36747V1 instanceof t7m)) {
                vxg0Var.frag.mo36746V(SwipeDirection.RIGHT);
            }
            int i = C20757a.f183454a[virtualCardType.ordinal()];
            if (i != 1) {
                str = i != 2 ? "" : "e_newbieguide_undo";
            } else {
                str = "e_newbieguide_superlike";
            }
            zvf0.m220396r(str, "p_suggest_users_home_view");
            CoreModule.f17545c.f19663m0.f19402c2.add(str);
            vxg0Var.frag.mo36746V(SwipeDirection.RIGHT);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static void m200560j(vxg0 vxg0Var) {
        vxg0Var.frag.mo36743T1(3000);
        zvf0.m220402x("e_superlike_balance_exposure", "p_suggest_users_home_view");
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: b */
    public void mo30009b(@Nullable VSwipeCard card) {
        String str;
        if (this.cardView != null) {
            VirtualCardType virtualCardType = this.cardType;
            SuperLikeOrUndoGuideCardView superLikeOrUndoGuideCardView = null;
            if (virtualCardType == null) {
                Intrinsics.m87502r("cardType");
                virtualCardType = null;
            }
            int i = C20757a.f183454a[virtualCardType.ordinal()];
            if (i != 1) {
                str = i != 2 ? "" : "e_newbieguide_undo";
            } else {
                str = "e_newbieguide_superlike";
            }
            zvf0.m220402x(str, "p_suggest_users_home_view");
            SuperLikeOrUndoGuideCardView superLikeOrUndoGuideCardView2 = this.cardView;
            if (superLikeOrUndoGuideCardView2 == null) {
                Intrinsics.m87502r("cardView");
            } else {
                superLikeOrUndoGuideCardView = superLikeOrUndoGuideCardView2;
            }
            superLikeOrUndoGuideCardView.m46117j();
        }
    }

    @Override // p149l.ool0
    @NotNull
    /* JADX INFO: renamed from: d */
    public View mo30011d(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent, @NotNull VirtualCardType cardType) {
        inflater.getClass();
        parent.getClass();
        cardType.getClass();
        View viewInflate = inflater.inflate(i6c0.f111725t, parent, false);
        viewInflate.getClass();
        return viewInflate;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: e */
    public void mo30012e(@NotNull View view, int position, @NotNull final VirtualCardType cardType, @Nullable View card) {
        view.getClass();
        cardType.getClass();
        SuperLikeOrUndoGuideCardView superLikeOrUndoGuideCardView = (SuperLikeOrUndoGuideCardView) view;
        this.cardView = superLikeOrUndoGuideCardView;
        this.cardType = cardType;
        if (superLikeOrUndoGuideCardView == null) {
            Intrinsics.m87502r("cardView");
            superLikeOrUndoGuideCardView = null;
        }
        superLikeOrUndoGuideCardView.m46114f(cardType, new Function0() { // from class: l.uxg0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return vxg0.m200559i(this.f178737a, cardType);
            }
        });
        this.frag.mo36742O3();
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: f */
    public boolean mo30013f() {
        return true;
    }

    @Override // p149l.ool0
    @NotNull
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo30014g(@Nullable SwipeDirection swipeDirection, @NotNull t7m card) {
        card.getClass();
        VirtualCardType virtualCardType = this.cardType;
        if (virtualCardType == null) {
            Intrinsics.m87502r("cardType");
            virtualCardType = null;
        }
        int i = C20757a.f183454a[virtualCardType.ordinal()];
        if (i == 1) {
            e51.m114743H(this.frag.mo36758q1(), new Runnable() { // from class: l.sxg0
                @Override // java.lang.Runnable
                public final void run() {
                    vxg0.m200560j(this.f166791a);
                }
            }, 500L);
        } else if (i == 2) {
            e51.m114743H(this.frag.mo36758q1(), new Runnable() { // from class: l.txg0
                @Override // java.lang.Runnable
                public final void run() {
                    vxg0.m200558h(this.f172507a);
                }
            }, 500L);
        }
        this.frag.mo36739I();
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: c */
    public void mo30010c(@Nullable View view) {
    }
}
