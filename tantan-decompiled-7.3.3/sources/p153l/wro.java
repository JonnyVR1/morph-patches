package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.IntlInsertCardData;
import com.p051p1.mobile.putong.core.data.SpotLightForceMatchData;
import com.p051p1.mobile.putong.core.data.SpotLightForceMatchEnvelope;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.p058ui.active.IntlPartnerActiveCard;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b$\u0010%J%\u0010'\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020 2\u0006\u0010&\u001a\u00020\u0018¢\u0006\u0004\b'\u0010(J\u001f\u0010,\u001a\u00020\u00152\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)H\u0002¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u00102\u001a\u0004\b3\u00104R\u0016\u00107\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u00106R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u00108¨\u00069"}, m88121d2 = {"Ll/wro;", "Ll/sxl0;", "Ll/x0m;", "frag", "Lcom/p1/mobile/putong/core/data/IntlInsertCardData;", Active.TYPE, "<init>", "(Ll/x0m;Lcom/p1/mobile/putong/core/data/IntlInsertCardData;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "cardType", "Landroid/view/View;", Constants.INAPP_DATA_TAG, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/p1/mobile/putong/core/data/VirtualCardType;)Landroid/view/View;", OMSTemplateModeType.view, "", "position", "card", "", "e", "(Landroid/view/View;ILcom/p1/mobile/putong/core/data/VirtualCardType;Landroid/view/View;)V", "", "f", "()Z", "Lcom/p1/mobile/putong/core/card/VSwipeCard;", "b", "(Lcom/p1/mobile/putong/core/card/VSwipeCard;)V", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "swipeDirection", "Ll/jam;", "Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "g", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ll/jam;)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "c", "(Landroid/view/View;)V", "fromButton", "k", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ll/jam;Z)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "Lcom/p1/mobile/putong/data/User;", "otherUser", "me", "j", "(Lcom/p1/mobile/putong/data/User;Lcom/p1/mobile/putong/data/User;)V", "a", "Ll/x0m;", "getFrag", "()Ll/x0m;", "Lcom/p1/mobile/putong/core/data/IntlInsertCardData;", "getActive", "()Lcom/p1/mobile/putong/core/data/IntlInsertCardData;", "Lcom/p1/mobile/putong/core/ui/active/IntlPartnerActiveCard;", "Lcom/p1/mobile/putong/core/ui/active/IntlPartnerActiveCard;", "intlPartnerActiveCard", "Lcom/p1/mobile/putong/data/User;", "card_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class wro implements sxl0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final x0m frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final IntlInsertCardData active;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public IntlPartnerActiveCard intlPartnerActiveCard;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public User otherUser;

    public wro(@NotNull x0m x0mVar, @NotNull IntlInsertCardData intlInsertCardData) {
        x0mVar.getClass();
        intlInsertCardData.getClass();
        this.frag = x0mVar;
        this.active = intlInsertCardData;
        this.otherUser = intlInsertCardData.floatUserCardData.user;
    }

    /* JADX INFO: renamed from: h */
    public static void m207604h(wro wroVar, User user, User user2, SpotLightForceMatchEnvelope spotLightForceMatchEnvelope) {
        SpotLightForceMatchData spotLightForceMatchData;
        List<Relationship> list;
        Relationship relationship = null;
        if (spotLightForceMatchEnvelope != null && (spotLightForceMatchData = spotLightForceMatchEnvelope.data) != null && (list = spotLightForceMatchData.relationships) != null && !list.isEmpty()) {
            relationship = list.get(0);
        }
        Relationship relationship2 = relationship;
        if (relationship2 == null || !TEnum.equals(relationship2.state, "matched")) {
            return;
        }
        int iMo34639zc = CoreModule.m30933P().m143405a().mo34639zc(relationship2);
        Act actMo37761q1 = wroVar.frag.mo37761q1();
        if (actMo37761q1 != null) {
            if (!user.isFemale()) {
                actMo37761q1.startActivityWithCustomTransition(CoreModule.m30933P().m143405a().mo34554n8(actMo37761q1, jyb.m147507f0(relationship2.f39654id), iMo34639zc, new ArrayList<>(), wroVar.frag.mo37764u0()), CoreModule.m30933P().m143405a().mo34515hg(actMo37761q1));
                return;
            }
            CoreModule.m30933P().m143405a().mo34610v7(actMo37761q1, user2, iMo34639zc, false);
            if (IntlCountryCodeController.m29125v()) {
                return;
            }
            toh0.m192059s();
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m207605i(Throwable th) {
    }

    @Override // p153l.sxl0
    @NotNull
    /* JADX INFO: renamed from: d */
    public View mo31009d(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable VirtualCardType cardType) {
        inflater.getClass();
        View viewInflate = inflater.inflate(nec0.f141625j, parent, false);
        viewInflate.getClass();
        return viewInflate;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    @Override // p153l.sxl0
    /* JADX INFO: renamed from: e */
    public void mo31010e(@NotNull View view, int position, @NotNull VirtualCardType cardType, @Nullable View card) {
        IntlPartnerActiveCard intlPartnerActiveCard;
        view.getClass();
        cardType.getClass();
        IntlPartnerActiveCard intlPartnerActiveCard2 = this.intlPartnerActiveCard;
        IntlPartnerActiveCard intlPartnerActiveCard3 = null;
        if (intlPartnerActiveCard2 == null) {
            intlPartnerActiveCard = (IntlPartnerActiveCard) view;
            this.intlPartnerActiveCard = intlPartnerActiveCard;
            if (intlPartnerActiveCard == null) {
                Intrinsics.m88391r("intlPartnerActiveCard");
                intlPartnerActiveCard = null;
            }
            intlPartnerActiveCard.m45407g(this.frag, this.active);
        } else {
            if (intlPartnerActiveCard2 == null) {
                Intrinsics.m88391r("intlPartnerActiveCard");
                intlPartnerActiveCard2 = null;
            }
            if (!Intrinsics.m88377d(intlPartnerActiveCard2, view)) {
                intlPartnerActiveCard = (IntlPartnerActiveCard) view;
                this.intlPartnerActiveCard = intlPartnerActiveCard;
                if (intlPartnerActiveCard == null) {
                    Intrinsics.m88391r("intlPartnerActiveCard");
                    intlPartnerActiveCard = null;
                }
                intlPartnerActiveCard.m45407g(this.frag, this.active);
            }
        }
        if (position == 0) {
            sfj0.m185601h("e_intl_iqiyi_activities_card", this.frag.mo37764u0(), new sfj0.C20032a[0]);
            IntlPartnerActiveCard intlPartnerActiveCard4 = this.intlPartnerActiveCard;
            if (intlPartnerActiveCard4 == null) {
                Intrinsics.m88391r("intlPartnerActiveCard");
            } else {
                intlPartnerActiveCard3 = intlPartnerActiveCard4;
            }
            intlPartnerActiveCard3.setOnSwipe(false);
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
        return VSwipeStack.OnCardSwipeResult.back;
    }

    /* JADX INFO: renamed from: j */
    public final void m207606j(final User otherUser, final User me2) {
        C22421c c22421cObserveOn;
        x0m x0mVar = this.frag;
        v99 v99Var = CoreModule.f18264c.f20307F1;
        String str = otherUser.f56859id;
        str.getClass();
        String str2 = me2.f56859id;
        str2.getClass();
        C22421c c22421cMo37767z1 = x0mVar.mo37767z1(v99Var.m200406c3(str, str2, "iqiyi"));
        if (c22421cMo37767z1 == null || (c22421cObserveOn = c22421cMo37767z1.observeOn(fo0.m126432a())) == null) {
            return;
        }
        c22421cObserveOn.subscribe(psd0.m173597H(new y20() { // from class: l.uro
            @Override // p153l.y20
            public final void call(Object obj) {
                wro.m207604h(this.f180663a, me2, otherUser, (SpotLightForceMatchEnvelope) obj);
            }
        }, new y20() { // from class: l.vro
            @Override // p153l.y20
            public final void call(Object obj) {
                wro.m207605i((Throwable) obj);
            }
        }));
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VSwipeStack.OnCardSwipeResult m207607k(@NotNull SwipeDirection swipeDirection, @NotNull jam card, boolean fromButton) {
        swipeDirection.getClass();
        card.getClass();
        IntlPartnerActiveCard intlPartnerActiveCard = this.intlPartnerActiveCard;
        if (intlPartnerActiveCard != null) {
            if (intlPartnerActiveCard == null) {
                Intrinsics.m88391r("intlPartnerActiveCard");
                intlPartnerActiveCard = null;
            }
            intlPartnerActiveCard.setOnSwipe(true);
        }
        if (swipeDirection == SwipeDirection.UP) {
            return VSwipeStack.OnCardSwipeResult.back;
        }
        if (swipeDirection == SwipeDirection.RIGHT) {
            if (!fromButton && !IntlCountryCodeController.m29125v()) {
                sfj0.m185596c("e_intl_iqiyi_activities_card_button", this.frag.mo37764u0(), new sfj0.C20032a[0]);
            }
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            if (userM116600p9 != null && NullChecker.m82486a(this.otherUser)) {
                User user = this.otherUser;
                user.getClass();
                m207606j(user, userM116600p9);
            }
        }
        this.frag.mo37762r2();
        return VSwipeStack.OnCardSwipeResult.pass;
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
