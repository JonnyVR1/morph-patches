package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.card.VSwipeCard;
import com.p000p1.mobile.putong.core.card.VSwipeStack;
import com.p000p1.mobile.putong.core.p004ui.active.SeeActiveCard;
import com.p1.mobile.putong.core.data.Active;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.d30;
import l.eyl;
import l.o6j0;
import l.ool0;
import l.t7m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0015H\u0002¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010,\u001a\u0004\b-\u0010.R\u0016\u00101\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u00100¨\u00062"}, d2 = {"Ll/b7e0;", "Ll/ool0;", "Ll/eyl;", "frag", "Lcom/p1/mobile/putong/core/data/Active;", "active", "<init>", "(Ll/eyl;Lcom/p1/mobile/putong/core/data/Active;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "cardType", "Landroid/view/View;", "d", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/p1/mobile/putong/core/data/VirtualCardType;)Landroid/view/View;", "view", "", "position", "card", "", "e", "(Landroid/view/View;ILcom/p1/mobile/putong/core/data/VirtualCardType;Landroid/view/View;)V", "", "f", "()Z", "Lcom/p1/mobile/putong/core/card/VSwipeCard;", "b", "(Lcom/p1/mobile/putong/core/card/VSwipeCard;)V", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "swipeDirection", "Ll/t7m;", "Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "g", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ll/t7m;)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "c", "(Landroid/view/View;)V", "i", "()V", "a", "Ll/eyl;", "getFrag", "()Ll/eyl;", "Lcom/p1/mobile/putong/core/data/Active;", "getActive", "()Lcom/p1/mobile/putong/core/data/Active;", "Lcom/p1/mobile/putong/core/ui/active/SeeActiveCard;", "Lcom/p1/mobile/putong/core/ui/active/SeeActiveCard;", "seeActiveCard", "card_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b7e0 implements ool0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final eyl frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Active active;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public SeeActiveCard seeActiveCard;

    public b7e0(@NotNull eyl eylVar, @NotNull Active active) {
        eylVar.getClass();
        active.getClass();
        this.frag = eylVar;
        this.active = active;
    }

    /* JADX INFO: renamed from: h */
    public static void m12570h(b7e0 b7e0Var) {
        b7e0Var.m12577i();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public View m12573d(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable VirtualCardType cardType) {
        inflater.getClass();
        View viewInflate = inflater.inflate(i6c0.f14252m, parent, false);
        viewInflate.getClass();
        return viewInflate;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX INFO: renamed from: e */
    public void m12574e(@NotNull View view, int position, @NotNull VirtualCardType cardType, @Nullable View card) {
        SeeActiveCard seeActiveCard;
        SeeActiveCard seeActiveCard2;
        view.getClass();
        cardType.getClass();
        SeeActiveCard seeActiveCard3 = this.seeActiveCard;
        SeeActiveCard seeActiveCard4 = null;
        if (seeActiveCard3 == null) {
            seeActiveCard = (SeeActiveCard) view;
            this.seeActiveCard = seeActiveCard;
            if (seeActiveCard == null) {
                Intrinsics.r("seeActiveCard");
                seeActiveCard = null;
            }
            seeActiveCard.m7188f(this.frag, this.active, new d30() { // from class: l.a7e0
                public final void call() {
                    b7e0.m12570h(this.f8153a);
                }
            });
            seeActiveCard2 = this.seeActiveCard;
            if (seeActiveCard2 == null) {
                Intrinsics.r("seeActiveCard");
                seeActiveCard2 = null;
            }
            List<String> list = CoreModule.f1534c.f3676u0.f3224R;
            list.getClass();
            seeActiveCard2.m7187e(list);
        } else {
            if (seeActiveCard3 == null) {
                Intrinsics.r("seeActiveCard");
                seeActiveCard3 = null;
            }
            if (!Intrinsics.d(seeActiveCard3, view)) {
                seeActiveCard = (SeeActiveCard) view;
                this.seeActiveCard = seeActiveCard;
                if (seeActiveCard == null) {
                    Intrinsics.r("seeActiveCard");
                    seeActiveCard = null;
                }
                seeActiveCard.m7188f(this.frag, this.active, new d30() { // from class: l.a7e0
                    public final void call() {
                        b7e0.m12570h(this.f8153a);
                    }
                });
                seeActiveCard2 = this.seeActiveCard;
                if (seeActiveCard2 == null) {
                    Intrinsics.r("seeActiveCard");
                    seeActiveCard2 = null;
                }
                List<String> list2 = CoreModule.f1534c.f3676u0.f3224R;
                list2.getClass();
                seeActiveCard2.m7187e(list2);
            }
        }
        if (position == 0) {
            SeeActiveCard seeActiveCard5 = this.seeActiveCard;
            if (seeActiveCard5 == null) {
                Intrinsics.r("seeActiveCard");
            } else {
                seeActiveCard4 = seeActiveCard5;
            }
            seeActiveCard4.setOnSwipe(false);
            o6j0.h("e_intl_see_churnback", this.frag.u0(), new o6j0.a[0]);
            this.frag.O3();
            this.frag.J0();
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m12575f() {
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult m12576g(@NotNull SwipeDirection swipeDirection, @NotNull t7m card) {
        swipeDirection.getClass();
        card.getClass();
        SeeActiveCard seeActiveCard = this.seeActiveCard;
        if (seeActiveCard != null) {
            if (seeActiveCard == null) {
                Intrinsics.r("seeActiveCard");
                seeActiveCard = null;
            }
            seeActiveCard.setOnSwipe(true);
        }
        this.frag.r2();
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: i */
    public final void m12577i() {
        o6j0.c("e_intl_see_churnback", this.frag.u0(), new o6j0.a[0]);
        CoreModule.m1854P().m11706a().m5484mh(this.frag, this.active);
    }

    /* JADX INFO: renamed from: b */
    public void m12571b(@Nullable VSwipeCard card) {
    }

    /* JADX INFO: renamed from: c */
    public void m12572c(@Nullable View view) {
    }
}
