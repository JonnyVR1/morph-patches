package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.p058ui.home.virtualcard.HomeNewBizCardView;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010 \u001a\u00020\u001f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0012\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\"\u0010#R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010'R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010)¨\u0006*"}, m88121d2 = {"Ll/ibl;", "Ll/sxl0;", "Ll/x0m;", "frag", "<init>", "(Ll/x0m;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "cardType", "Landroid/view/View;", Constants.INAPP_DATA_TAG, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/p1/mobile/putong/core/data/VirtualCardType;)Landroid/view/View;", OMSTemplateModeType.view, "", "position", "card", "", "e", "(Landroid/view/View;ILcom/p1/mobile/putong/core/data/VirtualCardType;Landroid/view/View;)V", "", "f", "()Z", "Lcom/p1/mobile/putong/core/card/VSwipeCard;", "b", "(Lcom/p1/mobile/putong/core/card/VSwipeCard;)V", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "swipeDirection", "Ll/jam;", "Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "g", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ll/jam;)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "c", "(Landroid/view/View;)V", "a", "Ll/x0m;", "Lcom/p1/mobile/putong/core/ui/home/virtualcard/HomeNewBizCardView;", "Lcom/p1/mobile/putong/core/ui/home/virtualcard/HomeNewBizCardView;", "cardView", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "card_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ibl implements sxl0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public x0m frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public HomeNewBizCardView cardView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VirtualCardType cardType;

    /* JADX INFO: renamed from: l.ibl$a */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class C17695a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f114233a;

        static {
            int[] iArr = new int[VirtualCardType.values().length];
            try {
                iArr[VirtualCardType.SayHiADCard.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f114233a = iArr;
        }
    }

    public ibl(@NotNull x0m x0mVar) {
        x0mVar.getClass();
        this.frag = x0mVar;
    }

    /* JADX INFO: renamed from: h */
    public static Unit m139384h(ibl iblVar) {
        View viewMo37750V1 = iblVar.frag.mo37750V1();
        if ((viewMo37750V1 instanceof VSwipeCard) || (viewMo37750V1 instanceof jam)) {
            if (!(viewMo37750V1 instanceof jam)) {
                iblVar.frag.mo37749V(SwipeDirection.RIGHT);
            }
            iblVar.frag.mo37749V(SwipeDirection.RIGHT);
        }
        return Unit.INSTANCE;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: b */
    public void mo31007b(@Nullable VSwipeCard card) {
        if (this.cardView != null) {
            i4g0.m138526x("", "p_suggest_users_home_view");
        }
    }

    @Override // p153l.sxl0
    @NotNull
    /* JADX INFO: renamed from: d */
    public View mo31009d(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent, @NotNull VirtualCardType cardType) {
        inflater.getClass();
        parent.getClass();
        cardType.getClass();
        View viewInflate = inflater.inflate(nec0.f141623h, parent, false);
        viewInflate.getClass();
        return viewInflate;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: e */
    public void mo31010e(@NotNull View view, int position, @NotNull VirtualCardType cardType, @Nullable View card) {
        view.getClass();
        cardType.getClass();
        HomeNewBizCardView homeNewBizCardView = (HomeNewBizCardView) view;
        this.cardView = homeNewBizCardView;
        this.cardType = cardType;
        if (homeNewBizCardView == null) {
            Intrinsics.m88391r("cardView");
            homeNewBizCardView = null;
        }
        homeNewBizCardView.m47293f(cardType, this.frag, new Function0() { // from class: l.hbl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ibl.m139384h(this.f108601a);
            }
        });
        this.frag.mo37745O3();
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: f */
    public boolean mo31011f() {
        return true;
    }

    @Override // p153l.sxl0
    @NotNull
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo31012g(@Nullable SwipeDirection swipeDirection, @NotNull jam card) {
        card.getClass();
        VirtualCardType virtualCardType = this.cardType;
        if (virtualCardType == null) {
            Intrinsics.m88391r("cardType");
            virtualCardType = null;
        }
        int i = C17695a.f114233a[virtualCardType.ordinal()];
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: c */
    public void mo31008c(@Nullable View view) {
    }
}
