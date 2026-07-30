package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.card.VSwipeCard;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.p053ui.home.virtualcard.HomeNewBizCardView;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010 \u001a\u00020\u001f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0012\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\"\u0010#R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010'R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010)¨\u0006*"}, m87232d2 = {"Ll/s8l;", "Ll/ool0;", "Ll/eyl;", "frag", "<init>", "(Ll/eyl;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "cardType", "Landroid/view/View;", Constants.INAPP_DATA_TAG, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/p1/mobile/putong/core/data/VirtualCardType;)Landroid/view/View;", OMSTemplateModeType.view, "", "position", "card", "", "e", "(Landroid/view/View;ILcom/p1/mobile/putong/core/data/VirtualCardType;Landroid/view/View;)V", "", "f", "()Z", "Lcom/p1/mobile/putong/core/card/VSwipeCard;", "b", "(Lcom/p1/mobile/putong/core/card/VSwipeCard;)V", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "swipeDirection", "Ll/t7m;", "Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "g", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ll/t7m;)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "c", "(Landroid/view/View;)V", "a", "Ll/eyl;", "Lcom/p1/mobile/putong/core/ui/home/virtualcard/HomeNewBizCardView;", "Lcom/p1/mobile/putong/core/ui/home/virtualcard/HomeNewBizCardView;", "cardView", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "card_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class s8l implements ool0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public eyl frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public HomeNewBizCardView cardView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VirtualCardType cardType;

    /* JADX INFO: renamed from: l.s8l$a */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class C19872a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f163088a;

        static {
            int[] iArr = new int[VirtualCardType.values().length];
            try {
                iArr[VirtualCardType.SayHiADCard.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f163088a = iArr;
        }
    }

    public s8l(@NotNull eyl eylVar) {
        eylVar.getClass();
        this.frag = eylVar;
    }

    /* JADX INFO: renamed from: h */
    public static Unit m182660h(s8l s8lVar) {
        View viewMo36747V1 = s8lVar.frag.mo36747V1();
        if ((viewMo36747V1 instanceof VSwipeCard) || (viewMo36747V1 instanceof t7m)) {
            if (!(viewMo36747V1 instanceof t7m)) {
                s8lVar.frag.mo36746V(SwipeDirection.RIGHT);
            }
            s8lVar.frag.mo36746V(SwipeDirection.RIGHT);
        }
        return Unit.INSTANCE;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: b */
    public void mo30009b(@Nullable VSwipeCard card) {
        if (this.cardView != null) {
            zvf0.m220402x("", "p_suggest_users_home_view");
        }
    }

    @Override // p149l.ool0
    @NotNull
    /* JADX INFO: renamed from: d */
    public View mo30011d(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent, @NotNull VirtualCardType cardType) {
        inflater.getClass();
        parent.getClass();
        cardType.getClass();
        View viewInflate = inflater.inflate(i6c0.f111713h, parent, false);
        viewInflate.getClass();
        return viewInflate;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: e */
    public void mo30012e(@NotNull View view, int position, @NotNull VirtualCardType cardType, @Nullable View card) {
        view.getClass();
        cardType.getClass();
        HomeNewBizCardView homeNewBizCardView = (HomeNewBizCardView) view;
        this.cardView = homeNewBizCardView;
        this.cardType = cardType;
        if (homeNewBizCardView == null) {
            Intrinsics.m87502r("cardView");
            homeNewBizCardView = null;
        }
        homeNewBizCardView.m46110f(cardType, this.frag, new Function0() { // from class: l.r8l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s8l.m182660h(this.f158238a);
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
        int i = C19872a.f163088a[virtualCardType.ordinal()];
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: c */
    public void mo30010c(@Nullable View view) {
    }
}
