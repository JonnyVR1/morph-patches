package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeCard;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.p053ui.active.MinBoostActiveCard;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010*\u001a\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010.¨\u00060"}, m87232d2 = {"Ll/r200;", "Ll/ool0;", "Ll/eyl;", "frag", "Lcom/p1/mobile/putong/core/data/Active;", Active.TYPE, "<init>", "(Ll/eyl;Lcom/p1/mobile/putong/core/data/Active;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "cardType", "Landroid/view/View;", Constants.INAPP_DATA_TAG, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/p1/mobile/putong/core/data/VirtualCardType;)Landroid/view/View;", OMSTemplateModeType.view, "", "position", "card", "", "e", "(Landroid/view/View;ILcom/p1/mobile/putong/core/data/VirtualCardType;Landroid/view/View;)V", "", "f", "()Z", "Lcom/p1/mobile/putong/core/card/VSwipeCard;", "b", "(Lcom/p1/mobile/putong/core/card/VSwipeCard;)V", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "swipeDirection", "Ll/t7m;", "Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "g", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ll/t7m;)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "c", "(Landroid/view/View;)V", "a", "Ll/eyl;", "getFrag", "()Ll/eyl;", "Lcom/p1/mobile/putong/core/data/Active;", "getActive", "()Lcom/p1/mobile/putong/core/data/Active;", "Lcom/p1/mobile/putong/core/ui/active/MinBoostActiveCard;", "Lcom/p1/mobile/putong/core/ui/active/MinBoostActiveCard;", "boostCard", "card_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class r200 implements ool0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final eyl frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Active active;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public MinBoostActiveCard boostCard;

    public r200(@NotNull eyl eylVar, @NotNull Active active) {
        eylVar.getClass();
        active.getClass();
        this.frag = eylVar;
        this.active = active;
    }

    /* JADX INFO: renamed from: h */
    public static void m177557h(r200 r200Var) {
        o6j0.m162859c("e_intl_boost_trial_card", r200Var.frag.mo36761u0(), new o6j0.C18854a[0]);
        CoreModule.m29935P().m94651a().mo33576rd(r200Var.frag);
    }

    @Override // p149l.ool0
    @NotNull
    /* JADX INFO: renamed from: d */
    public View mo30011d(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable VirtualCardType cardType) {
        inflater.getClass();
        View viewInflate = inflater.inflate(i6c0.f111716k, parent, false);
        viewInflate.getClass();
        return viewInflate;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    @Override // p149l.ool0
    /* JADX INFO: renamed from: e */
    public void mo30012e(@NotNull View view, int position, @NotNull VirtualCardType cardType, @Nullable View card) {
        MinBoostActiveCard minBoostActiveCard;
        view.getClass();
        cardType.getClass();
        MinBoostActiveCard minBoostActiveCard2 = this.boostCard;
        MinBoostActiveCard minBoostActiveCard3 = null;
        if (minBoostActiveCard2 == null) {
            minBoostActiveCard = (MinBoostActiveCard) view;
            this.boostCard = minBoostActiveCard;
            if (minBoostActiveCard == null) {
                Intrinsics.m87502r("boostCard");
                minBoostActiveCard = null;
            }
            minBoostActiveCard.m44234d(this.frag, this.active, new d30() { // from class: l.q200
                @Override // p149l.d30
                public final void call() {
                    r200.m177557h(this.f152188a);
                }
            });
        } else {
            if (minBoostActiveCard2 == null) {
                Intrinsics.m87502r("boostCard");
                minBoostActiveCard2 = null;
            }
            if (!Intrinsics.m87488d(minBoostActiveCard2, view)) {
                minBoostActiveCard = (MinBoostActiveCard) view;
                this.boostCard = minBoostActiveCard;
                if (minBoostActiveCard == null) {
                    Intrinsics.m87502r("boostCard");
                    minBoostActiveCard = null;
                }
                minBoostActiveCard.m44234d(this.frag, this.active, new d30() { // from class: l.q200
                    @Override // p149l.d30
                    public final void call() {
                        r200.m177557h(this.f152188a);
                    }
                });
            }
        }
        if (position == 0) {
            MinBoostActiveCard minBoostActiveCard4 = this.boostCard;
            if (minBoostActiveCard4 == null) {
                Intrinsics.m87502r("boostCard");
            } else {
                minBoostActiveCard3 = minBoostActiveCard4;
            }
            minBoostActiveCard3.setOnSwipe(false);
            o6j0.m162864h("e_intl_boost_trial_card", this.frag.mo36761u0(), new o6j0.C18854a[0]);
            this.frag.mo36742O3();
            this.frag.mo36740J0();
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
        MinBoostActiveCard minBoostActiveCard = this.boostCard;
        if (minBoostActiveCard != null) {
            if (minBoostActiveCard == null) {
                Intrinsics.m87502r("boostCard");
                minBoostActiveCard = null;
            }
            minBoostActiveCard.setOnSwipe(true);
        }
        this.frag.mo36759r2();
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: b */
    public void mo30009b(@Nullable VSwipeCard card) {
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: c */
    public void mo30010c(@Nullable View view) {
    }
}
