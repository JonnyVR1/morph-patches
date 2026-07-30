package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.R$string;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.HasSpotLightData;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.p058ui.active.SpotlightActiveCard;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0019\u0010&\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0002¢\u0006\u0004\b(\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010-\u001a\u0004\b.\u0010/R\u0016\u00102\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u00101¨\u00063"}, m88121d2 = {"Ll/pyf0;", "Ll/sxl0;", "Ll/x0m;", "frag", "Lcom/p1/mobile/putong/core/data/Active;", Active.TYPE, "<init>", "(Ll/x0m;Lcom/p1/mobile/putong/core/data/Active;)V", "", "o", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "cardType", "Landroid/view/View;", Constants.INAPP_DATA_TAG, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/p1/mobile/putong/core/data/VirtualCardType;)Landroid/view/View;", OMSTemplateModeType.view, "", "position", "card", "e", "(Landroid/view/View;ILcom/p1/mobile/putong/core/data/VirtualCardType;Landroid/view/View;)V", "", "f", "()Z", "Lcom/p1/mobile/putong/core/card/VSwipeCard;", "b", "(Lcom/p1/mobile/putong/core/card/VSwipeCard;)V", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "swipeDirection", "Ll/jam;", "Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "g", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ll/jam;)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "c", "(Landroid/view/View;)V", "p", "a", "Ll/x0m;", "getFrag", "()Ll/x0m;", "Lcom/p1/mobile/putong/core/data/Active;", "getActive", "()Lcom/p1/mobile/putong/core/data/Active;", "Lcom/p1/mobile/putong/core/ui/active/SpotlightActiveCard;", "Lcom/p1/mobile/putong/core/ui/active/SpotlightActiveCard;", "spotlightActiveCard", "card_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class pyf0 implements sxl0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final x0m frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Active active;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public SpotlightActiveCard spotlightActiveCard;

    public pyf0(@NotNull x0m x0mVar, @NotNull Active active) {
        x0mVar.getClass();
        active.getClass();
        this.frag = x0mVar;
        this.active = active;
    }

    /* JADX INFO: renamed from: h */
    public static void m174275h(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static void m174276i(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j */
    public static void m174277j(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k */
    public static void m174278k(Throwable th) {
    }

    /* JADX INFO: renamed from: l */
    public static Unit m174279l(pyf0 pyf0Var, List list) {
        if (CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.spotLight)).content.remaining > 0) {
            cza czaVar = CoreModule.f18264c.f20321K0;
            if (czaVar == null || czaVar.f84441R != 1) {
                CoreModule.m30933P().m143405a().mo34413So(pyf0Var.frag);
            } else {
                r1j0.m179420g(pyf0Var.frag.mo37751Y1(R$string.f21013c));
                pyf0Var.frag.mo37749V(SwipeDirection.RIGHT);
            }
        } else {
            r1j0.m179420g(pyf0Var.frag.mo37751Y1(R$string.f21014d));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static Unit m174280m(pyf0 pyf0Var, HasSpotLightData hasSpotLightData) {
        if (hasSpotLightData.success) {
            pyf0Var.m174283p();
        } else {
            r1j0.m179420g(pyf0Var.frag.mo37751Y1(R$string.f21014d));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static void m174281n(pyf0 pyf0Var) {
        pyf0Var.m174282o();
    }

    /* JADX INFO: renamed from: o */
    private final void m174282o() {
        C22421c c22421cObserveOn;
        sfj0.m185596c("e_intl_spotlight_activity_card", this.frag.mo37764u0(), new sfj0.C20032a[0]);
        C22421c c22421cMo37767z1 = this.frag.mo37767z1(CoreModule.f18264c.f20321K0.m113293A3());
        if (c22421cMo37767z1 == null || (c22421cObserveOn = c22421cMo37767z1.observeOn(fo0.m126432a())) == null) {
            return;
        }
        final Function1 function1 = new Function1() { // from class: l.jyf0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return pyf0.m174280m(this.f123138a, (HasSpotLightData) obj);
            }
        };
        c22421cObserveOn.subscribe(new y20() { // from class: l.kyf0
            @Override // p153l.y20
            public final void call(Object obj) {
                pyf0.m174277j(function1, obj);
            }
        }, new y20() { // from class: l.lyf0
            @Override // p153l.y20
            public final void call(Object obj) {
                pyf0.m174275h((Throwable) obj);
            }
        });
    }

    @Override // p153l.sxl0
    @NotNull
    /* JADX INFO: renamed from: d */
    public View mo31009d(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable VirtualCardType cardType) {
        inflater.getClass();
        View viewInflate = inflater.inflate(nec0.f141630o, parent, false);
        viewInflate.getClass();
        return viewInflate;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    @Override // p153l.sxl0
    /* JADX INFO: renamed from: e */
    public void mo31010e(@NotNull View view, int position, @NotNull VirtualCardType cardType, @Nullable View card) {
        SpotlightActiveCard spotlightActiveCard;
        view.getClass();
        cardType.getClass();
        SpotlightActiveCard spotlightActiveCard2 = this.spotlightActiveCard;
        SpotlightActiveCard spotlightActiveCard3 = null;
        if (spotlightActiveCard2 == null) {
            spotlightActiveCard = (SpotlightActiveCard) view;
            this.spotlightActiveCard = spotlightActiveCard;
            if (spotlightActiveCard == null) {
                Intrinsics.m88391r("spotlightActiveCard");
                spotlightActiveCard = null;
            }
            spotlightActiveCard.m45429k0(this.frag, this.active, new x20() { // from class: l.iyf0
                @Override // p153l.x20
                public final void call() {
                    pyf0.m174281n(this.f117573a);
                }
            });
        } else {
            if (spotlightActiveCard2 == null) {
                Intrinsics.m88391r("spotlightActiveCard");
                spotlightActiveCard2 = null;
            }
            if (!Intrinsics.m88377d(spotlightActiveCard2, view)) {
                spotlightActiveCard = (SpotlightActiveCard) view;
                this.spotlightActiveCard = spotlightActiveCard;
                if (spotlightActiveCard == null) {
                    Intrinsics.m88391r("spotlightActiveCard");
                    spotlightActiveCard = null;
                }
                spotlightActiveCard.m45429k0(this.frag, this.active, new x20() { // from class: l.iyf0
                    @Override // p153l.x20
                    public final void call() {
                        pyf0.m174281n(this.f117573a);
                    }
                });
            }
        }
        if (position == 0) {
            SpotlightActiveCard spotlightActiveCard4 = this.spotlightActiveCard;
            if (spotlightActiveCard4 == null) {
                Intrinsics.m88391r("spotlightActiveCard");
            } else {
                spotlightActiveCard3 = spotlightActiveCard4;
            }
            spotlightActiveCard3.setOnSwipe(false);
            sfj0.m185601h("e_intl_spotlight_activity_card", this.frag.mo37764u0(), new sfj0.C20032a[0]);
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
        SpotlightActiveCard spotlightActiveCard = this.spotlightActiveCard;
        if (spotlightActiveCard != null) {
            if (spotlightActiveCard == null) {
                Intrinsics.m88391r("spotlightActiveCard");
                spotlightActiveCard = null;
            }
            spotlightActiveCard.setOnSwipe(true);
        }
        this.frag.mo37762r2();
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: p */
    public final void m174283p() {
        C22421c c22421cObserveOn;
        C22421c c22421cMo37767z1 = this.frag.mo37767z1(CoreModule.f18264c.f20297C0.m146425v4());
        if (c22421cMo37767z1 == null || (c22421cObserveOn = c22421cMo37767z1.observeOn(fo0.m126432a())) == null) {
            return;
        }
        final Function1 function1 = new Function1() { // from class: l.myf0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return pyf0.m174279l(this.f139413a, (List) obj);
            }
        };
        c22421cObserveOn.subscribe(new y20() { // from class: l.nyf0
            @Override // p153l.y20
            public final void call(Object obj) {
                pyf0.m174276i(function1, obj);
            }
        }, new y20() { // from class: l.oyf0
            @Override // p153l.y20
            public final void call(Object obj) {
                pyf0.m174278k((Throwable) obj);
            }
        });
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
