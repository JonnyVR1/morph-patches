package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.card.VSwipeCard;
import com.p000p1.mobile.putong.core.card.VSwipeStack;
import com.p000p1.mobile.putong.core.p004ui.active.IntlPartnerActiveCard;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.IntlInsertCardData;
import com.p1.mobile.putong.core.data.SpotLightForceMatchData;
import com.p1.mobile.putong.core.data.SpotLightForceMatchEnvelope;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.e30;
import l.eyl;
import l.jo0;
import l.mgh0;
import l.mkd0;
import l.o6j0;
import l.ool0;
import l.t7m;
import l.vwb;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b$\u0010%J%\u0010'\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020 2\u0006\u0010&\u001a\u00020\u0018¢\u0006\u0004\b'\u0010(J\u001f\u0010,\u001a\u00020\u00152\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)H\u0002¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u00102\u001a\u0004\b3\u00104R\u0016\u00107\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u00106R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u00108¨\u00069"}, d2 = {"Ll/wpo;", "Ll/ool0;", "Ll/eyl;", "frag", "Lcom/p1/mobile/putong/core/data/IntlInsertCardData;", "active", "<init>", "(Ll/eyl;Lcom/p1/mobile/putong/core/data/IntlInsertCardData;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "cardType", "Landroid/view/View;", "d", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/p1/mobile/putong/core/data/VirtualCardType;)Landroid/view/View;", "view", "", "position", "card", "", "e", "(Landroid/view/View;ILcom/p1/mobile/putong/core/data/VirtualCardType;Landroid/view/View;)V", "", "f", "()Z", "Lcom/p1/mobile/putong/core/card/VSwipeCard;", "b", "(Lcom/p1/mobile/putong/core/card/VSwipeCard;)V", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "swipeDirection", "Ll/t7m;", "Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "g", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ll/t7m;)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "c", "(Landroid/view/View;)V", "fromButton", "k", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ll/t7m;Z)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "Lcom/p1/mobile/putong/data/User;", "otherUser", "me", "j", "(Lcom/p1/mobile/putong/data/User;Lcom/p1/mobile/putong/data/User;)V", "a", "Ll/eyl;", "getFrag", "()Ll/eyl;", "Lcom/p1/mobile/putong/core/data/IntlInsertCardData;", "getActive", "()Lcom/p1/mobile/putong/core/data/IntlInsertCardData;", "Lcom/p1/mobile/putong/core/ui/active/IntlPartnerActiveCard;", "Lcom/p1/mobile/putong/core/ui/active/IntlPartnerActiveCard;", "intlPartnerActiveCard", "Lcom/p1/mobile/putong/data/User;", "card_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class wpo implements ool0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final eyl frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final IntlInsertCardData active;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public IntlPartnerActiveCard intlPartnerActiveCard;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public User otherUser;

    public wpo(@NotNull eyl eylVar, @NotNull IntlInsertCardData intlInsertCardData) {
        eylVar.getClass();
        intlInsertCardData.getClass();
        this.frag = eylVar;
        this.active = intlInsertCardData;
        this.otherUser = intlInsertCardData.floatUserCardData.user;
    }

    /* JADX INFO: renamed from: h */
    public static void m26581h(wpo wpoVar, User user, User user2, SpotLightForceMatchEnvelope spotLightForceMatchEnvelope) {
        SpotLightForceMatchData spotLightForceMatchData;
        List list;
        Object obj = null;
        if (spotLightForceMatchEnvelope != null && (spotLightForceMatchData = spotLightForceMatchEnvelope.data) != null && (list = spotLightForceMatchData.relationships) != null && !list.isEmpty()) {
            obj = list.get(0);
        }
        Relationship relationship = (Relationship) obj;
        if (relationship == null || !TEnum.equals(relationship.state, "matched")) {
            return;
        }
        int iM5573zc = CoreModule.m1854P().m11706a().m5573zc(relationship);
        Act actQ1 = wpoVar.frag.q1();
        if (actQ1 != null) {
            if (!user.isFemale()) {
                actQ1.startActivityWithCustomTransition(CoreModule.m1854P().m11706a().m5488n8(actQ1, vwb.f0(new String[]{relationship.id}), iM5573zc, new ArrayList<>(), wpoVar.frag.u0()), CoreModule.m1854P().m11706a().m5449hg(actQ1));
                return;
            }
            CoreModule.m1854P().m11706a().m5544v7(actQ1, user2, iM5573zc, false);
            if (IntlCountryCodeController.m21v()) {
                return;
            }
            mgh0.s();
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m26582i(Throwable th) {
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public View m26585d(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable VirtualCardType cardType) {
        inflater.getClass();
        View viewInflate = inflater.inflate(i6c0.f14249j, parent, false);
        viewInflate.getClass();
        return viewInflate;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX INFO: renamed from: e */
    public void m26586e(@NotNull View view, int position, @NotNull VirtualCardType cardType, @Nullable View card) {
        IntlPartnerActiveCard intlPartnerActiveCard;
        view.getClass();
        cardType.getClass();
        IntlPartnerActiveCard intlPartnerActiveCard2 = this.intlPartnerActiveCard;
        IntlPartnerActiveCard intlPartnerActiveCard3 = null;
        if (intlPartnerActiveCard2 == null) {
            intlPartnerActiveCard = (IntlPartnerActiveCard) view;
            this.intlPartnerActiveCard = intlPartnerActiveCard;
            if (intlPartnerActiveCard == null) {
                Intrinsics.r("intlPartnerActiveCard");
                intlPartnerActiveCard = null;
            }
            intlPartnerActiveCard.m7172g(this.frag, this.active);
        } else {
            if (intlPartnerActiveCard2 == null) {
                Intrinsics.r("intlPartnerActiveCard");
                intlPartnerActiveCard2 = null;
            }
            if (!Intrinsics.d(intlPartnerActiveCard2, view)) {
                intlPartnerActiveCard = (IntlPartnerActiveCard) view;
                this.intlPartnerActiveCard = intlPartnerActiveCard;
                if (intlPartnerActiveCard == null) {
                    Intrinsics.r("intlPartnerActiveCard");
                    intlPartnerActiveCard = null;
                }
                intlPartnerActiveCard.m7172g(this.frag, this.active);
            }
        }
        if (position == 0) {
            o6j0.h("e_intl_iqiyi_activities_card", this.frag.u0(), new o6j0.a[0]);
            IntlPartnerActiveCard intlPartnerActiveCard4 = this.intlPartnerActiveCard;
            if (intlPartnerActiveCard4 == null) {
                Intrinsics.r("intlPartnerActiveCard");
            } else {
                intlPartnerActiveCard3 = intlPartnerActiveCard4;
            }
            intlPartnerActiveCard3.setOnSwipe(false);
            this.frag.O3();
            this.frag.J0();
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m26587f() {
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult m26588g(@NotNull SwipeDirection swipeDirection, @NotNull t7m card) {
        swipeDirection.getClass();
        card.getClass();
        return VSwipeStack.OnCardSwipeResult.back;
    }

    /* JADX INFO: renamed from: j */
    public final void m26589j(final User otherUser, final User me) {
        c cVarObserveOn;
        eyl eylVar = this.frag;
        m89 m89Var = CoreModule.f1534c.f3554F1;
        String str = ((DbObject) otherUser).id;
        str.getClass();
        String str2 = ((DbObject) me).id;
        str2.getClass();
        c cVarZ1 = eylVar.z1(m89Var.m19168c3(str, str2, "iqiyi"));
        if (cVarZ1 == null || (cVarObserveOn = cVarZ1.observeOn(jo0.a())) == null) {
            return;
        }
        cVarObserveOn.subscribe(mkd0.H(new e30() { // from class: l.upo
            public final void call(Object obj) {
                wpo.m26581h(this.f23698a, me, otherUser, (SpotLightForceMatchEnvelope) obj);
            }
        }, new e30() { // from class: l.vpo
            public final void call(Object obj) {
                wpo.m26582i((Throwable) obj);
            }
        }));
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VSwipeStack.OnCardSwipeResult m26590k(@NotNull SwipeDirection swipeDirection, @NotNull t7m card, boolean fromButton) {
        swipeDirection.getClass();
        card.getClass();
        IntlPartnerActiveCard intlPartnerActiveCard = this.intlPartnerActiveCard;
        if (intlPartnerActiveCard != null) {
            if (intlPartnerActiveCard == null) {
                Intrinsics.r("intlPartnerActiveCard");
                intlPartnerActiveCard = null;
            }
            intlPartnerActiveCard.setOnSwipe(true);
        }
        if (swipeDirection == SwipeDirection.UP) {
            return VSwipeStack.OnCardSwipeResult.back;
        }
        if (swipeDirection == SwipeDirection.RIGHT) {
            if (!fromButton && !IntlCountryCodeController.m21v()) {
                o6j0.c("e_intl_iqiyi_activities_card_button", this.frag.u0(), new o6j0.a[0]);
            }
            User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
            if (userM21490p9 != null && NullChecker.a(this.otherUser)) {
                User user = this.otherUser;
                user.getClass();
                m26589j(user, userM21490p9);
            }
        }
        this.frag.r2();
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: b */
    public void m26583b(@Nullable VSwipeCard card) {
    }

    /* JADX INFO: renamed from: c */
    public void m26584c(@Nullable View view) {
    }
}
