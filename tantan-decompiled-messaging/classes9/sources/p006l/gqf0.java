package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.card.R$string;
import com.p000p1.mobile.putong.core.card.VSwipeCard;
import com.p000p1.mobile.putong.core.card.VSwipeStack;
import com.p000p1.mobile.putong.core.p004ui.active.SpotlightActiveCard;
import com.p1.mobile.putong.core.data.Active;
import com.p1.mobile.putong.core.data.HasSpotLightData;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.d30;
import l.e30;
import l.eyl;
import l.jo0;
import l.o6j0;
import l.ool0;
import l.osi0;
import l.t7m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0019\u0010&\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0002¢\u0006\u0004\b(\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010-\u001a\u0004\b.\u0010/R\u0016\u00102\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u00101¨\u00063"}, d2 = {"Ll/gqf0;", "Ll/ool0;", "Ll/eyl;", "frag", "Lcom/p1/mobile/putong/core/data/Active;", "active", "<init>", "(Ll/eyl;Lcom/p1/mobile/putong/core/data/Active;)V", "", "o", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "cardType", "Landroid/view/View;", "d", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/p1/mobile/putong/core/data/VirtualCardType;)Landroid/view/View;", "view", "", "position", "card", "e", "(Landroid/view/View;ILcom/p1/mobile/putong/core/data/VirtualCardType;Landroid/view/View;)V", "", "f", "()Z", "Lcom/p1/mobile/putong/core/card/VSwipeCard;", "b", "(Lcom/p1/mobile/putong/core/card/VSwipeCard;)V", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "swipeDirection", "Ll/t7m;", "Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "g", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ll/t7m;)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "c", "(Landroid/view/View;)V", "p", "a", "Ll/eyl;", "getFrag", "()Ll/eyl;", "Lcom/p1/mobile/putong/core/data/Active;", "getActive", "()Lcom/p1/mobile/putong/core/data/Active;", "Lcom/p1/mobile/putong/core/ui/active/SpotlightActiveCard;", "Lcom/p1/mobile/putong/core/ui/active/SpotlightActiveCard;", "spotlightActiveCard", "card_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class gqf0 implements ool0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final eyl frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Active active;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public SpotlightActiveCard spotlightActiveCard;

    public gqf0(@NotNull eyl eylVar, @NotNull Active active) {
        eylVar.getClass();
        active.getClass();
        this.frag = eylVar;
        this.active = active;
    }

    /* JADX INFO: renamed from: h */
    public static void m15919h(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static void m15920i(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j */
    public static void m15921j(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k */
    public static void m15922k(Throwable th) {
    }

    /* JADX INFO: renamed from: l */
    public static Unit m15923l(gqf0 gqf0Var, List list) {
        if (CoreModule.f1534c.f3544C0.m27421w4(SummarizedPrivilegesId.get("spotLight")).content.remaining > 0) {
            qxa qxaVar = CoreModule.f1534c.f3568K0;
            if (qxaVar == null || qxaVar.f20129R != 1) {
                CoreModule.m1854P().m11706a().m5347So(gqf0Var.frag);
            } else {
                osi0.g(gqf0Var.frag.Y1(R$string.f4260c));
                gqf0Var.frag.V(SwipeDirection.RIGHT);
            }
        } else {
            osi0.g(gqf0Var.frag.Y1(R$string.f4261d));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static Unit m15924m(gqf0 gqf0Var, HasSpotLightData hasSpotLightData) {
        if (hasSpotLightData.success) {
            gqf0Var.m15933p();
        } else {
            osi0.g(gqf0Var.frag.Y1(R$string.f4261d));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static void m15925n(gqf0 gqf0Var) {
        gqf0Var.m15926o();
    }

    /* JADX INFO: renamed from: o */
    private final void m15926o() {
        c cVarObserveOn;
        o6j0.c("e_intl_spotlight_activity_card", this.frag.u0(), new o6j0.a[0]);
        c cVarZ1 = this.frag.z1(CoreModule.f1534c.f3568K0.m22487A3());
        if (cVarZ1 == null || (cVarObserveOn = cVarZ1.observeOn(jo0.a())) == null) {
            return;
        }
        final Function1 function1 = new Function1() { // from class: l.aqf0
            public final Object invoke(Object obj) {
                return gqf0.m15924m(this.f8446a, (HasSpotLightData) obj);
            }
        };
        cVarObserveOn.subscribe(new e30() { // from class: l.bqf0
            public final void call(Object obj) {
                gqf0.m15921j(function1, obj);
            }
        }, new e30() { // from class: l.cqf0
            public final void call(Object obj) {
                gqf0.m15919h((Throwable) obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public View m15929d(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable VirtualCardType cardType) {
        inflater.getClass();
        View viewInflate = inflater.inflate(i6c0.f14254o, parent, false);
        viewInflate.getClass();
        return viewInflate;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public void m15930e(@NotNull View view, int position, @NotNull VirtualCardType cardType, @Nullable View card) {
        SpotlightActiveCard spotlightActiveCard;
        view.getClass();
        cardType.getClass();
        SpotlightActiveCard spotlightActiveCard2 = this.spotlightActiveCard;
        SpotlightActiveCard spotlightActiveCard3 = null;
        if (spotlightActiveCard2 == null) {
            spotlightActiveCard = (SpotlightActiveCard) view;
            this.spotlightActiveCard = spotlightActiveCard;
            if (spotlightActiveCard == null) {
                Intrinsics.r("spotlightActiveCard");
                spotlightActiveCard = null;
            }
            spotlightActiveCard.m7194k0(this.frag, this.active, new d30() { // from class: l.zpf0
                public final void call() {
                    gqf0.m15925n(this.f28905a);
                }
            });
        } else {
            if (spotlightActiveCard2 == null) {
                Intrinsics.r("spotlightActiveCard");
                spotlightActiveCard2 = null;
            }
            if (!Intrinsics.d(spotlightActiveCard2, view)) {
                spotlightActiveCard = (SpotlightActiveCard) view;
                this.spotlightActiveCard = spotlightActiveCard;
                if (spotlightActiveCard == null) {
                    Intrinsics.r("spotlightActiveCard");
                    spotlightActiveCard = null;
                }
                spotlightActiveCard.m7194k0(this.frag, this.active, new d30() { // from class: l.zpf0
                    public final void call() {
                        gqf0.m15925n(this.f28905a);
                    }
                });
            }
        }
        if (position == 0) {
            SpotlightActiveCard spotlightActiveCard4 = this.spotlightActiveCard;
            if (spotlightActiveCard4 == null) {
                Intrinsics.r("spotlightActiveCard");
            } else {
                spotlightActiveCard3 = spotlightActiveCard4;
            }
            spotlightActiveCard3.setOnSwipe(false);
            o6j0.h("e_intl_spotlight_activity_card", this.frag.u0(), new o6j0.a[0]);
            this.frag.O3();
            this.frag.J0();
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m15931f() {
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult m15932g(@NotNull SwipeDirection swipeDirection, @NotNull t7m card) {
        swipeDirection.getClass();
        card.getClass();
        SpotlightActiveCard spotlightActiveCard = this.spotlightActiveCard;
        if (spotlightActiveCard != null) {
            if (spotlightActiveCard == null) {
                Intrinsics.r("spotlightActiveCard");
                spotlightActiveCard = null;
            }
            spotlightActiveCard.setOnSwipe(true);
        }
        this.frag.r2();
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: p */
    public final void m15933p() {
        c cVarObserveOn;
        c cVarZ1 = this.frag.z1(CoreModule.f1534c.f3544C0.m27420u4());
        if (cVarZ1 == null || (cVarObserveOn = cVarZ1.observeOn(jo0.a())) == null) {
            return;
        }
        final Function1 function1 = new Function1() { // from class: l.dqf0
            public final Object invoke(Object obj) {
                return gqf0.m15923l(this.f10528a, (List) obj);
            }
        };
        cVarObserveOn.subscribe(new e30() { // from class: l.eqf0
            public final void call(Object obj) {
                gqf0.m15920i(function1, obj);
            }
        }, new e30() { // from class: l.fqf0
            public final void call(Object obj) {
                gqf0.m15922k((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public void m15927b(@Nullable VSwipeCard card) {
    }

    /* JADX INFO: renamed from: c */
    public void m15928c(@Nullable View view) {
    }
}
