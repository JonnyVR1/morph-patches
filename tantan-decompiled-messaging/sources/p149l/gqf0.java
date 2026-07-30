package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.R$string;
import com.p046p1.mobile.putong.core.card.VSwipeCard;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.HasSpotLightData;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.p053ui.active.SpotlightActiveCard;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0019\u0010&\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0002¢\u0006\u0004\b(\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010-\u001a\u0004\b.\u0010/R\u0016\u00102\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u00101¨\u00063"}, m87232d2 = {"Ll/gqf0;", "Ll/ool0;", "Ll/eyl;", "frag", "Lcom/p1/mobile/putong/core/data/Active;", Active.TYPE, "<init>", "(Ll/eyl;Lcom/p1/mobile/putong/core/data/Active;)V", "", "o", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "cardType", "Landroid/view/View;", Constants.INAPP_DATA_TAG, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/p1/mobile/putong/core/data/VirtualCardType;)Landroid/view/View;", OMSTemplateModeType.view, "", "position", "card", "e", "(Landroid/view/View;ILcom/p1/mobile/putong/core/data/VirtualCardType;Landroid/view/View;)V", "", "f", "()Z", "Lcom/p1/mobile/putong/core/card/VSwipeCard;", "b", "(Lcom/p1/mobile/putong/core/card/VSwipeCard;)V", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "swipeDirection", "Ll/t7m;", "Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "g", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ll/t7m;)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "c", "(Landroid/view/View;)V", "p", "a", "Ll/eyl;", "getFrag", "()Ll/eyl;", "Lcom/p1/mobile/putong/core/data/Active;", "getActive", "()Lcom/p1/mobile/putong/core/data/Active;", "Lcom/p1/mobile/putong/core/ui/active/SpotlightActiveCard;", "Lcom/p1/mobile/putong/core/ui/active/SpotlightActiveCard;", "spotlightActiveCard", "card_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public static void m127577h(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static void m127578i(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j */
    public static void m127579j(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k */
    public static void m127580k(Throwable th) {
    }

    /* JADX INFO: renamed from: l */
    public static Unit m127581l(gqf0 gqf0Var, List list) {
        if (CoreModule.f17545c.f19555C0.m210113w4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.spotLight)).content.remaining > 0) {
            qxa qxaVar = CoreModule.f17545c.f19579K0;
            if (qxaVar == null || qxaVar.f156825R != 1) {
                CoreModule.m29935P().m94651a().mo33410So(gqf0Var.frag);
            } else {
                osi0.m165783g(gqf0Var.frag.mo36748Y1(R$string.f20271c));
                gqf0Var.frag.mo36746V(SwipeDirection.RIGHT);
            }
        } else {
            osi0.m165783g(gqf0Var.frag.mo36748Y1(R$string.f20272d));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static Unit m127582m(gqf0 gqf0Var, HasSpotLightData hasSpotLightData) {
        if (hasSpotLightData.success) {
            gqf0Var.m127585p();
        } else {
            osi0.m165783g(gqf0Var.frag.mo36748Y1(R$string.f20272d));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static void m127583n(gqf0 gqf0Var) {
        gqf0Var.m127584o();
    }

    /* JADX INFO: renamed from: o */
    private final void m127584o() {
        C22306c c22306cObserveOn;
        o6j0.m162859c("e_intl_spotlight_activity_card", this.frag.mo36761u0(), new o6j0.C18854a[0]);
        C22306c c22306cMo36764z1 = this.frag.mo36764z1(CoreModule.f17545c.f19579K0.m176966A3());
        if (c22306cMo36764z1 == null || (c22306cObserveOn = c22306cMo36764z1.observeOn(jo0.m142408a())) == null) {
            return;
        }
        final Function1 function1 = new Function1() { // from class: l.aqf0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return gqf0.m127582m(this.f71151a, (HasSpotLightData) obj);
            }
        };
        c22306cObserveOn.subscribe(new e30() { // from class: l.bqf0
            @Override // p149l.e30
            public final void call(Object obj) {
                gqf0.m127579j(function1, obj);
            }
        }, new e30() { // from class: l.cqf0
            @Override // p149l.e30
            public final void call(Object obj) {
                gqf0.m127577h((Throwable) obj);
            }
        });
    }

    @Override // p149l.ool0
    @NotNull
    /* JADX INFO: renamed from: d */
    public View mo30011d(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable VirtualCardType cardType) {
        inflater.getClass();
        View viewInflate = inflater.inflate(i6c0.f111720o, parent, false);
        viewInflate.getClass();
        return viewInflate;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    @Override // p149l.ool0
    /* JADX INFO: renamed from: e */
    public void mo30012e(@NotNull View view, int position, @NotNull VirtualCardType cardType, @Nullable View card) {
        SpotlightActiveCard spotlightActiveCard;
        view.getClass();
        cardType.getClass();
        SpotlightActiveCard spotlightActiveCard2 = this.spotlightActiveCard;
        SpotlightActiveCard spotlightActiveCard3 = null;
        if (spotlightActiveCard2 == null) {
            spotlightActiveCard = (SpotlightActiveCard) view;
            this.spotlightActiveCard = spotlightActiveCard;
            if (spotlightActiveCard == null) {
                Intrinsics.m87502r("spotlightActiveCard");
                spotlightActiveCard = null;
            }
            spotlightActiveCard.m44246k0(this.frag, this.active, new d30() { // from class: l.zpf0
                @Override // p149l.d30
                public final void call() {
                    gqf0.m127583n(this.f204246a);
                }
            });
        } else {
            if (spotlightActiveCard2 == null) {
                Intrinsics.m87502r("spotlightActiveCard");
                spotlightActiveCard2 = null;
            }
            if (!Intrinsics.m87488d(spotlightActiveCard2, view)) {
                spotlightActiveCard = (SpotlightActiveCard) view;
                this.spotlightActiveCard = spotlightActiveCard;
                if (spotlightActiveCard == null) {
                    Intrinsics.m87502r("spotlightActiveCard");
                    spotlightActiveCard = null;
                }
                spotlightActiveCard.m44246k0(this.frag, this.active, new d30() { // from class: l.zpf0
                    @Override // p149l.d30
                    public final void call() {
                        gqf0.m127583n(this.f204246a);
                    }
                });
            }
        }
        if (position == 0) {
            SpotlightActiveCard spotlightActiveCard4 = this.spotlightActiveCard;
            if (spotlightActiveCard4 == null) {
                Intrinsics.m87502r("spotlightActiveCard");
            } else {
                spotlightActiveCard3 = spotlightActiveCard4;
            }
            spotlightActiveCard3.setOnSwipe(false);
            o6j0.m162864h("e_intl_spotlight_activity_card", this.frag.mo36761u0(), new o6j0.C18854a[0]);
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
        SpotlightActiveCard spotlightActiveCard = this.spotlightActiveCard;
        if (spotlightActiveCard != null) {
            if (spotlightActiveCard == null) {
                Intrinsics.m87502r("spotlightActiveCard");
                spotlightActiveCard = null;
            }
            spotlightActiveCard.setOnSwipe(true);
        }
        this.frag.mo36759r2();
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: p */
    public final void m127585p() {
        C22306c c22306cObserveOn;
        C22306c c22306cMo36764z1 = this.frag.mo36764z1(CoreModule.f17545c.f19555C0.m210112u4());
        if (c22306cMo36764z1 == null || (c22306cObserveOn = c22306cMo36764z1.observeOn(jo0.m142408a())) == null) {
            return;
        }
        final Function1 function1 = new Function1() { // from class: l.dqf0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return gqf0.m127581l(this.f87411a, (List) obj);
            }
        };
        c22306cObserveOn.subscribe(new e30() { // from class: l.eqf0
            @Override // p149l.e30
            public final void call(Object obj) {
                gqf0.m127578i(function1, obj);
            }
        }, new e30() { // from class: l.fqf0
            @Override // p149l.e30
            public final void call(Object obj) {
                gqf0.m127580k((Throwable) obj);
            }
        });
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
