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
import com.p046p1.mobile.putong.core.p053ui.active.BuzzActiveCard;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0015H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010/\u001a\u0004\b0\u00101R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u00103¨\u00065"}, m87232d2 = {"Ll/dm3;", "Ll/ool0;", "Ll/eyl;", "frag", "Lcom/p1/mobile/putong/core/data/Active;", Active.TYPE, "<init>", "(Ll/eyl;Lcom/p1/mobile/putong/core/data/Active;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "cardType", "Landroid/view/View;", Constants.INAPP_DATA_TAG, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/p1/mobile/putong/core/data/VirtualCardType;)Landroid/view/View;", OMSTemplateModeType.view, "", "position", "card", "", "e", "(Landroid/view/View;ILcom/p1/mobile/putong/core/data/VirtualCardType;Landroid/view/View;)V", "", "f", "()Z", "Lcom/p1/mobile/putong/core/card/VSwipeCard;", "b", "(Lcom/p1/mobile/putong/core/card/VSwipeCard;)V", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "swipeDirection", "Ll/t7m;", "Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "g", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ll/t7m;)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "c", "(Landroid/view/View;)V", RXScreenCaptureService.KEY_INDEX, "()V", "", "j", "()Ljava/lang/String;", "a", "Ll/eyl;", "getFrag", "()Ll/eyl;", "Lcom/p1/mobile/putong/core/data/Active;", "getActive", "()Lcom/p1/mobile/putong/core/data/Active;", "Lcom/p1/mobile/putong/core/ui/active/BuzzActiveCard;", "Lcom/p1/mobile/putong/core/ui/active/BuzzActiveCard;", "buzzActiveCard", "card_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public static void m112432h(dm3 dm3Var) {
        dm3Var.m112433i();
    }

    @Override // p149l.ool0
    @NotNull
    /* JADX INFO: renamed from: d */
    public View mo30011d(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable VirtualCardType cardType) {
        inflater.getClass();
        View viewInflate = inflater.inflate(i6c0.f111714i, parent, false);
        viewInflate.getClass();
        return viewInflate;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    @Override // p149l.ool0
    /* JADX INFO: renamed from: e */
    public void mo30012e(@NotNull View view, int position, @NotNull VirtualCardType cardType, @Nullable View card) {
        BuzzActiveCard buzzActiveCard;
        view.getClass();
        cardType.getClass();
        BuzzActiveCard buzzActiveCard2 = this.buzzActiveCard;
        BuzzActiveCard buzzActiveCard3 = null;
        if (buzzActiveCard2 == null) {
            buzzActiveCard = (BuzzActiveCard) view;
            this.buzzActiveCard = buzzActiveCard;
            if (buzzActiveCard == null) {
                Intrinsics.m87502r("buzzActiveCard");
                buzzActiveCard = null;
            }
            buzzActiveCard.m44217k0(this.frag, this.active, new d30() { // from class: l.cm3
                @Override // p149l.d30
                public final void call() {
                    dm3.m112432h(this.f81508a);
                }
            });
        } else {
            if (buzzActiveCard2 == null) {
                Intrinsics.m87502r("buzzActiveCard");
                buzzActiveCard2 = null;
            }
            if (!Intrinsics.m87488d(buzzActiveCard2, view)) {
                buzzActiveCard = (BuzzActiveCard) view;
                this.buzzActiveCard = buzzActiveCard;
                if (buzzActiveCard == null) {
                    Intrinsics.m87502r("buzzActiveCard");
                    buzzActiveCard = null;
                }
                buzzActiveCard.m44217k0(this.frag, this.active, new d30() { // from class: l.cm3
                    @Override // p149l.d30
                    public final void call() {
                        dm3.m112432h(this.f81508a);
                    }
                });
            }
        }
        if (position == 0) {
            CoreModule.m29935P().m94652b().mo35128w9(m112434j());
            BuzzActiveCard buzzActiveCard4 = this.buzzActiveCard;
            if (buzzActiveCard4 == null) {
                Intrinsics.m87502r("buzzActiveCard");
            } else {
                buzzActiveCard3 = buzzActiveCard4;
            }
            buzzActiveCard3.setOnSwipe(false);
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
    @NotNull
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo30014g(@NotNull SwipeDirection swipeDirection, @NotNull t7m card) {
        swipeDirection.getClass();
        card.getClass();
        BuzzActiveCard buzzActiveCard = this.buzzActiveCard;
        if (buzzActiveCard != null) {
            if (buzzActiveCard == null) {
                Intrinsics.m87502r("buzzActiveCard");
                buzzActiveCard = null;
            }
            buzzActiveCard.setOnSwipe(true);
        }
        this.frag.mo36759r2();
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: i */
    public final void m112433i() {
        CoreModule.m29935P().m94652b().mo35112e6(m112434j(), this.frag.mo36758q1(), false, this.frag);
    }

    /* JADX INFO: renamed from: j */
    public final String m112434j() {
        String strMo35125tj = CoreModule.m29935P().m94652b().mo35125tj();
        String strMo35123ra = CoreModule.m29935P().m94652b().mo35123ra();
        String strMo35103Wh = CoreModule.m29935P().m94652b().mo35103Wh();
        String str = this.active.f20341id;
        str.getClass();
        strMo35125tj.getClass();
        if (C15386d.m93483J(str, strMo35125tj, false, 2, null)) {
            return strMo35125tj;
        }
        String str2 = this.active.f20341id;
        str2.getClass();
        strMo35123ra.getClass();
        if (C15386d.m93483J(str2, strMo35123ra, false, 2, null)) {
            return strMo35123ra;
        }
        strMo35103Wh.getClass();
        return strMo35103Wh;
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
