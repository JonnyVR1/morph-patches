package p006l;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.card.VSwipeCard;
import com.p000p1.mobile.putong.core.card.VSwipeStack;
import com.p000p1.mobile.putong.core.p004ui.active.VipActiveCard;
import com.p1.mobile.putong.core.data.Active;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.d;
import l.d30;
import l.eyl;
import l.o6j0;
import l.ool0;
import l.t7m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0016\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020&2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010.\u001a\u0004\b/\u00100R\u0016\u00103\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u00102¨\u00064"}, d2 = {"Ll/cfl0;", "Ll/ool0;", "Ll/eyl;", "frag", "Lcom/p1/mobile/putong/core/data/Active;", "active", "<init>", "(Ll/eyl;Lcom/p1/mobile/putong/core/data/Active;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "cardType", "Landroid/view/View;", "d", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/p1/mobile/putong/core/data/VirtualCardType;)Landroid/view/View;", "view", "", "position", "card", "", "e", "(Landroid/view/View;ILcom/p1/mobile/putong/core/data/VirtualCardType;Landroid/view/View;)V", "", "f", "()Z", "Lcom/p1/mobile/putong/core/card/VSwipeCard;", "b", "(Lcom/p1/mobile/putong/core/card/VSwipeCard;)V", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "swipeDirection", "Ll/t7m;", "Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "g", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ll/t7m;)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "c", "(Landroid/view/View;)V", "", "url", "i", "(Ljava/lang/String;)Ljava/lang/String;", "a", "Ll/eyl;", "getFrag", "()Ll/eyl;", "Lcom/p1/mobile/putong/core/data/Active;", "getActive", "()Lcom/p1/mobile/putong/core/data/Active;", "Lcom/p1/mobile/putong/core/ui/active/VipActiveCard;", "Lcom/p1/mobile/putong/core/ui/active/VipActiveCard;", "vipActiveCard", "card_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class cfl0 implements ool0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final eyl frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Active active;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VipActiveCard vipActiveCard;

    public cfl0(@NotNull eyl eylVar, @NotNull Active active) {
        eylVar.getClass();
        active.getClass();
        this.frag = eylVar;
        this.active = active;
    }

    /* JADX INFO: renamed from: h */
    public static void m13420h(cfl0 cfl0Var) {
        cfl0Var.frag.V(SwipeDirection.RIGHT);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public View m13423d(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable VirtualCardType cardType) {
        inflater.getClass();
        View viewInflate = inflater.inflate(i6c0.f14255p, parent, false);
        viewInflate.getClass();
        return viewInflate;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0013  */
    /* JADX INFO: renamed from: e */
    public void m13424e(@Nullable View view, int position, @Nullable VirtualCardType cardType, @Nullable View card) {
        VipActiveCard vipActiveCard;
        VipActiveCard vipActiveCard2 = this.vipActiveCard;
        VipActiveCard vipActiveCard3 = null;
        if (vipActiveCard2 == null) {
            view.getClass();
            vipActiveCard = (VipActiveCard) view;
            this.vipActiveCard = vipActiveCard;
            if (vipActiveCard == null) {
                Intrinsics.r("vipActiveCard");
                vipActiveCard = null;
            }
            vipActiveCard.m7199e(this.frag, this.active, new d30() { // from class: l.bfl0
                public final void call() {
                    cfl0.m13420h(this.f8868a);
                }
            });
        } else {
            if (vipActiveCard2 == null) {
                Intrinsics.r("vipActiveCard");
                vipActiveCard2 = null;
            }
            if (!Intrinsics.d(vipActiveCard2, view)) {
                view.getClass();
                vipActiveCard = (VipActiveCard) view;
                this.vipActiveCard = vipActiveCard;
                if (vipActiveCard == null) {
                    Intrinsics.r("vipActiveCard");
                    vipActiveCard = null;
                }
                vipActiveCard.m7199e(this.frag, this.active, new d30() { // from class: l.bfl0
                    public final void call() {
                        cfl0.m13420h(this.f8868a);
                    }
                });
            }
        }
        if (position == 0) {
            o6j0.h("e_intl_vip_churnback", this.frag.u0(), new o6j0.a[0]);
            VipActiveCard vipActiveCard4 = this.vipActiveCard;
            if (vipActiveCard4 == null) {
                Intrinsics.r("vipActiveCard");
            } else {
                vipActiveCard3 = vipActiveCard4;
            }
            vipActiveCard3.setOnSwipe(false);
            this.frag.O3();
            this.frag.J0();
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m13425f() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007f A[Catch: Exception -> 0x00a1, TRY_LEAVE, TryCatch #0 {Exception -> 0x00a1, blocks: (B:7:0x002d, B:9:0x0037, B:11:0x0047, B:13:0x0056, B:16:0x0066, B:17:0x007f), top: B:28:0x002d }] */
    @NotNull
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult m13426g(@NotNull SwipeDirection swipeDirection, @NotNull t7m card) {
        swipeDirection.getClass();
        card.getClass();
        VipActiveCard vipActiveCard = null;
        if (swipeDirection.getValue() == SwipeDirection.RIGHT.getValue() || swipeDirection.getValue() == SwipeDirection.UP.getValue()) {
            o6j0.c("e_intl_vip_churnback", this.frag.u0(), new o6j0.a[0]);
            try {
                if (!TextUtils.isEmpty(this.active.cardLandPageUrl)) {
                    String str = this.active.cardLandPageUrl;
                    str.getClass();
                    if (d.J(str, "tantan", false, 2, (Object) null)) {
                        String str2 = this.active.cardLandPageUrl;
                        str2.getClass();
                        m13427i(str2);
                        String str3 = this.active.cardLandPageUrl;
                        str3.getClass();
                        j2e0.m17248m(this.frag.q1(), Uri.parse(m13427i(str3)));
                    } else {
                        String str4 = this.active.cardLandPageUrl;
                        str4.getClass();
                        if (d.J(str4, "tantanapp", false, 2, (Object) null)) {
                            String str5 = this.active.cardLandPageUrl;
                            str5.getClass();
                            m13427i(str5);
                            String str6 = this.active.cardLandPageUrl;
                            str6.getClass();
                            j2e0.m17248m(this.frag.q1(), Uri.parse(m13427i(str6)));
                        } else {
                            String str7 = this.active.cardLandPageUrl;
                            str7.getClass();
                            if (d.J(str7, "tantantribe", false, 2, (Object) null)) {
                                String str8 = this.active.cardLandPageUrl;
                                str8.getClass();
                                m13427i(str8);
                                String str9 = this.active.cardLandPageUrl;
                                str9.getClass();
                                j2e0.m17248m(this.frag.q1(), Uri.parse(m13427i(str9)));
                            } else {
                                this.frag.q1().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.active.cardLandPageUrl)));
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        VipActiveCard vipActiveCard2 = this.vipActiveCard;
        if (vipActiveCard2 != null) {
            if (vipActiveCard2 == null) {
                Intrinsics.r("vipActiveCard");
            } else {
                vipActiveCard = vipActiveCard2;
            }
            vipActiveCard.setOnSwipe(true);
        }
        this.frag.r2();
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: i */
    public final String m13427i(String url) {
        if (!d.J(url, "tantan://freeTrialPromotion", false, 2, (Object) null) || StringsKt.P(url, "endTime", false, 2, (Object) null) || !NullChecker.a(CoreModule.f1534c.f3643j0.m2504C4())) {
            return url;
        }
        return url + "?endTime=" + CoreModule.f1534c.f3643j0.m2504C4().endTime;
    }

    /* JADX INFO: renamed from: b */
    public void m13421b(@Nullable VSwipeCard card) {
    }

    /* JADX INFO: renamed from: c */
    public void m13422c(@Nullable View view) {
    }
}
