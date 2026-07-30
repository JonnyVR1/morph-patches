package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.card.VSwipeCard;
import com.p000p1.mobile.putong.core.card.VSwipeStack;
import com.p000p1.mobile.putong.core.p004ui.active.BuzzActiveCard;
import com.p1.mobile.putong.core.data.Active;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import l.d30;
import l.eyl;
import l.ool0;
import l.t7m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0015H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010/\u001a\u0004\b0\u00101R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u00103¨\u00065"}, d2 = {"Ll/dm3;", "Ll/ool0;", "Ll/eyl;", "frag", "Lcom/p1/mobile/putong/core/data/Active;", "active", "<init>", "(Ll/eyl;Lcom/p1/mobile/putong/core/data/Active;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "cardType", "Landroid/view/View;", "d", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/p1/mobile/putong/core/data/VirtualCardType;)Landroid/view/View;", "view", "", "position", "card", "", "e", "(Landroid/view/View;ILcom/p1/mobile/putong/core/data/VirtualCardType;Landroid/view/View;)V", "", "f", "()Z", "Lcom/p1/mobile/putong/core/card/VSwipeCard;", "b", "(Lcom/p1/mobile/putong/core/card/VSwipeCard;)V", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "swipeDirection", "Ll/t7m;", "Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "g", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ll/t7m;)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "c", "(Landroid/view/View;)V", "i", "()V", "", "j", "()Ljava/lang/String;", "a", "Ll/eyl;", "getFrag", "()Ll/eyl;", "Lcom/p1/mobile/putong/core/data/Active;", "getActive", "()Lcom/p1/mobile/putong/core/data/Active;", "Lcom/p1/mobile/putong/core/ui/active/BuzzActiveCard;", "Lcom/p1/mobile/putong/core/ui/active/BuzzActiveCard;", "buzzActiveCard", "card_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class dm3 implements ool0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final eyl frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Active active;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public BuzzActiveCard buzzActiveCard;

    public dm3(@NotNull eyl eylVar, @NotNull Active active) {
        eylVar.getClass();
        active.getClass();
        this.frag = eylVar;
        this.active = active;
    }

    /* JADX INFO: renamed from: h */
    public static void m14081h(dm3 dm3Var) {
        dm3Var.m14088i();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public View m14084d(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable VirtualCardType cardType) {
        inflater.getClass();
        View viewInflate = inflater.inflate(i6c0.f14248i, parent, false);
        viewInflate.getClass();
        return viewInflate;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public void m14085e(@NotNull View view, int position, @NotNull VirtualCardType cardType, @Nullable View card) {
        BuzzActiveCard buzzActiveCard;
        view.getClass();
        cardType.getClass();
        BuzzActiveCard buzzActiveCard2 = this.buzzActiveCard;
        BuzzActiveCard buzzActiveCard3 = null;
        if (buzzActiveCard2 == null) {
            buzzActiveCard = (BuzzActiveCard) view;
            this.buzzActiveCard = buzzActiveCard;
            if (buzzActiveCard == null) {
                Intrinsics.r("buzzActiveCard");
                buzzActiveCard = null;
            }
            buzzActiveCard.m7165k0(this.frag, this.active, new d30() { // from class: l.cm3
                public final void call() {
                    dm3.m14081h(this.f9727a);
                }
            });
        } else {
            if (buzzActiveCard2 == null) {
                Intrinsics.r("buzzActiveCard");
                buzzActiveCard2 = null;
            }
            if (!Intrinsics.d(buzzActiveCard2, view)) {
                buzzActiveCard = (BuzzActiveCard) view;
                this.buzzActiveCard = buzzActiveCard;
                if (buzzActiveCard == null) {
                    Intrinsics.r("buzzActiveCard");
                    buzzActiveCard = null;
                }
                buzzActiveCard.m7165k0(this.frag, this.active, new d30() { // from class: l.cm3
                    public final void call() {
                        dm3.m14081h(this.f9727a);
                    }
                });
            }
        }
        if (position == 0) {
            CoreModule.m1854P().m11707b().mo7065w9(m14089j());
            BuzzActiveCard buzzActiveCard4 = this.buzzActiveCard;
            if (buzzActiveCard4 == null) {
                Intrinsics.r("buzzActiveCard");
            } else {
                buzzActiveCard3 = buzzActiveCard4;
            }
            buzzActiveCard3.setOnSwipe(false);
            this.frag.O3();
            this.frag.J0();
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m14086f() {
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult m14087g(@NotNull SwipeDirection swipeDirection, @NotNull t7m card) {
        swipeDirection.getClass();
        card.getClass();
        BuzzActiveCard buzzActiveCard = this.buzzActiveCard;
        if (buzzActiveCard != null) {
            if (buzzActiveCard == null) {
                Intrinsics.r("buzzActiveCard");
                buzzActiveCard = null;
            }
            buzzActiveCard.setOnSwipe(true);
        }
        this.frag.r2();
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: i */
    public final void m14088i() {
        CoreModule.m1854P().m11707b().mo7049e6(m14089j(), this.frag.q1(), false, this.frag);
    }

    /* JADX INFO: renamed from: j */
    public final String m14089j() {
        String strMo7062tj = CoreModule.m1854P().m11707b().mo7062tj();
        String strMo7060ra = CoreModule.m1854P().m11707b().mo7060ra();
        String strMo7040Wh = CoreModule.m1854P().m11707b().mo7040Wh();
        String str = this.active.id;
        str.getClass();
        strMo7062tj.getClass();
        if (d.J(str, strMo7062tj, false, 2, (Object) null)) {
            return strMo7062tj;
        }
        String str2 = this.active.id;
        str2.getClass();
        strMo7060ra.getClass();
        if (d.J(str2, strMo7060ra, false, 2, (Object) null)) {
            return strMo7060ra;
        }
        strMo7040Wh.getClass();
        return strMo7040Wh;
    }

    /* JADX INFO: renamed from: b */
    public void m14082b(@Nullable VSwipeCard card) {
    }

    /* JADX INFO: renamed from: c */
    public void m14083c(@Nullable View view) {
    }
}
