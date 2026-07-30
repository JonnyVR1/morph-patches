package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.p058ui.active.SeeActiveCard;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0015H\u0002¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010,\u001a\u0004\b-\u0010.R\u0016\u00101\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u00100¨\u00062"}, m88121d2 = {"Ll/gfe0;", "Ll/sxl0;", "Ll/x0m;", "frag", "Lcom/p1/mobile/putong/core/data/Active;", Active.TYPE, "<init>", "(Ll/x0m;Lcom/p1/mobile/putong/core/data/Active;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "cardType", "Landroid/view/View;", Constants.INAPP_DATA_TAG, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/p1/mobile/putong/core/data/VirtualCardType;)Landroid/view/View;", OMSTemplateModeType.view, "", "position", "card", "", "e", "(Landroid/view/View;ILcom/p1/mobile/putong/core/data/VirtualCardType;Landroid/view/View;)V", "", "f", "()Z", "Lcom/p1/mobile/putong/core/card/VSwipeCard;", "b", "(Lcom/p1/mobile/putong/core/card/VSwipeCard;)V", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "swipeDirection", "Ll/jam;", "Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "g", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ll/jam;)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "c", "(Landroid/view/View;)V", RXScreenCaptureService.KEY_INDEX, "()V", "a", "Ll/x0m;", "getFrag", "()Ll/x0m;", "Lcom/p1/mobile/putong/core/data/Active;", "getActive", "()Lcom/p1/mobile/putong/core/data/Active;", "Lcom/p1/mobile/putong/core/ui/active/SeeActiveCard;", "Lcom/p1/mobile/putong/core/ui/active/SeeActiveCard;", "seeActiveCard", "card_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class gfe0 implements sxl0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final x0m frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Active active;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public SeeActiveCard seeActiveCard;

    public gfe0(@NotNull x0m x0mVar, @NotNull Active active) {
        x0mVar.getClass();
        active.getClass();
        this.frag = x0mVar;
        this.active = active;
    }

    /* JADX INFO: renamed from: h */
    public static void m130053h(gfe0 gfe0Var) {
        gfe0Var.m130054i();
    }

    @Override // p153l.sxl0
    @NotNull
    /* JADX INFO: renamed from: d */
    public View mo31009d(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable VirtualCardType cardType) {
        inflater.getClass();
        View viewInflate = inflater.inflate(nec0.f141628m, parent, false);
        viewInflate.getClass();
        return viewInflate;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    @Override // p153l.sxl0
    /* JADX INFO: renamed from: e */
    public void mo31010e(@NotNull View view, int position, @NotNull VirtualCardType cardType, @Nullable View card) {
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
                Intrinsics.m88391r("seeActiveCard");
                seeActiveCard = null;
            }
            seeActiveCard.m45423f(this.frag, this.active, new x20() { // from class: l.ffe0
                @Override // p153l.x20
                public final void call() {
                    gfe0.m130053h(this.f98763a);
                }
            });
            seeActiveCard2 = this.seeActiveCard;
            if (seeActiveCard2 == null) {
                Intrinsics.m88391r("seeActiveCard");
                seeActiveCard2 = null;
            }
            List<String> list = CoreModule.f18264c.f20429u0.f19976R;
            list.getClass();
            seeActiveCard2.m45422e(list);
        } else {
            if (seeActiveCard3 == null) {
                Intrinsics.m88391r("seeActiveCard");
                seeActiveCard3 = null;
            }
            if (!Intrinsics.m88377d(seeActiveCard3, view)) {
                seeActiveCard = (SeeActiveCard) view;
                this.seeActiveCard = seeActiveCard;
                if (seeActiveCard == null) {
                    Intrinsics.m88391r("seeActiveCard");
                    seeActiveCard = null;
                }
                seeActiveCard.m45423f(this.frag, this.active, new x20() { // from class: l.ffe0
                    @Override // p153l.x20
                    public final void call() {
                        gfe0.m130053h(this.f98763a);
                    }
                });
                seeActiveCard2 = this.seeActiveCard;
                if (seeActiveCard2 == null) {
                    Intrinsics.m88391r("seeActiveCard");
                    seeActiveCard2 = null;
                }
                List<String> list2 = CoreModule.f18264c.f20429u0.f19976R;
                list2.getClass();
                seeActiveCard2.m45422e(list2);
            }
        }
        if (position == 0) {
            SeeActiveCard seeActiveCard5 = this.seeActiveCard;
            if (seeActiveCard5 == null) {
                Intrinsics.m88391r("seeActiveCard");
            } else {
                seeActiveCard4 = seeActiveCard5;
            }
            seeActiveCard4.setOnSwipe(false);
            sfj0.m185601h("e_intl_see_churnback", this.frag.mo37764u0(), new sfj0.C20032a[0]);
            this.frag.mo37745O3();
            this.frag.mo37743J0();
        }
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: f */
    public boolean mo31011f() {
        return false;
    }

    @Override // p153l.sxl0
    @NotNull
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo31012g(@NotNull SwipeDirection swipeDirection, @NotNull jam card) {
        swipeDirection.getClass();
        card.getClass();
        SeeActiveCard seeActiveCard = this.seeActiveCard;
        if (seeActiveCard != null) {
            if (seeActiveCard == null) {
                Intrinsics.m88391r("seeActiveCard");
                seeActiveCard = null;
            }
            seeActiveCard.setOnSwipe(true);
        }
        this.frag.mo37762r2();
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: i */
    public final void m130054i() {
        sfj0.m185596c("e_intl_see_churnback", this.frag.mo37764u0(), new sfj0.C20032a[0]);
        CoreModule.m30933P().m143405a().mo34550mh(this.frag, this.active);
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: b */
    public void mo31007b(@Nullable VSwipeCard card) {
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: c */
    public void mo31008c(@Nullable View view) {
    }
}
