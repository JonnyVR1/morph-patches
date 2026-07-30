package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeCard;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.IntlInsertCardData;
import com.p046p1.mobile.putong.core.data.SpotLightForceMatchData;
import com.p046p1.mobile.putong.core.data.SpotLightForceMatchEnvelope;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.p053ui.active.IntlPartnerActiveCard;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b$\u0010%J%\u0010'\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020 2\u0006\u0010&\u001a\u00020\u0018¢\u0006\u0004\b'\u0010(J\u001f\u0010,\u001a\u00020\u00152\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)H\u0002¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u00102\u001a\u0004\b3\u00104R\u0016\u00107\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u00106R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u00108¨\u00069"}, m87232d2 = {"Ll/wpo;", "Ll/ool0;", "Ll/eyl;", "frag", "Lcom/p1/mobile/putong/core/data/IntlInsertCardData;", Active.TYPE, "<init>", "(Ll/eyl;Lcom/p1/mobile/putong/core/data/IntlInsertCardData;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "cardType", "Landroid/view/View;", Constants.INAPP_DATA_TAG, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/p1/mobile/putong/core/data/VirtualCardType;)Landroid/view/View;", OMSTemplateModeType.view, "", "position", "card", "", "e", "(Landroid/view/View;ILcom/p1/mobile/putong/core/data/VirtualCardType;Landroid/view/View;)V", "", "f", "()Z", "Lcom/p1/mobile/putong/core/card/VSwipeCard;", "b", "(Lcom/p1/mobile/putong/core/card/VSwipeCard;)V", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "swipeDirection", "Ll/t7m;", "Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "g", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ll/t7m;)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "c", "(Landroid/view/View;)V", "fromButton", "k", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ll/t7m;Z)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "Lcom/p1/mobile/putong/data/User;", "otherUser", "me", "j", "(Lcom/p1/mobile/putong/data/User;Lcom/p1/mobile/putong/data/User;)V", "a", "Ll/eyl;", "getFrag", "()Ll/eyl;", "Lcom/p1/mobile/putong/core/data/IntlInsertCardData;", "getActive", "()Lcom/p1/mobile/putong/core/data/IntlInsertCardData;", "Lcom/p1/mobile/putong/core/ui/active/IntlPartnerActiveCard;", "Lcom/p1/mobile/putong/core/ui/active/IntlPartnerActiveCard;", "intlPartnerActiveCard", "Lcom/p1/mobile/putong/data/User;", "card_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public static void m204929h(wpo wpoVar, User user, User user2, SpotLightForceMatchEnvelope spotLightForceMatchEnvelope) {
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
        int iMo33636zc = CoreModule.m29935P().m94651a().mo33636zc(relationship2);
        Act actMo36758q1 = wpoVar.frag.mo36758q1();
        if (actMo36758q1 != null) {
            if (!user.isFemale()) {
                actMo36758q1.startActivityWithCustomTransition(CoreModule.m29935P().m94651a().mo33551n8(actMo36758q1, vwb.m200324f0(relationship2.f38806id), iMo33636zc, new ArrayList<>(), wpoVar.frag.mo36761u0()), CoreModule.m29935P().m94651a().mo33512hg(actMo36758q1));
                return;
            }
            CoreModule.m29935P().m94651a().mo33607v7(actMo36758q1, user2, iMo33636zc, false);
            if (IntlCountryCodeController.m28126v()) {
                return;
            }
            mgh0.m154563s();
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m204930i(Throwable th) {
    }

    @Override // p149l.ool0
    @NotNull
    /* JADX INFO: renamed from: d */
    public View mo30011d(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable VirtualCardType cardType) {
        inflater.getClass();
        View viewInflate = inflater.inflate(i6c0.f111715j, parent, false);
        viewInflate.getClass();
        return viewInflate;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    @Override // p149l.ool0
    /* JADX INFO: renamed from: e */
    public void mo30012e(@NotNull View view, int position, @NotNull VirtualCardType cardType, @Nullable View card) {
        IntlPartnerActiveCard intlPartnerActiveCard;
        view.getClass();
        cardType.getClass();
        IntlPartnerActiveCard intlPartnerActiveCard2 = this.intlPartnerActiveCard;
        IntlPartnerActiveCard intlPartnerActiveCard3 = null;
        if (intlPartnerActiveCard2 == null) {
            intlPartnerActiveCard = (IntlPartnerActiveCard) view;
            this.intlPartnerActiveCard = intlPartnerActiveCard;
            if (intlPartnerActiveCard == null) {
                Intrinsics.m87502r("intlPartnerActiveCard");
                intlPartnerActiveCard = null;
            }
            intlPartnerActiveCard.m44224g(this.frag, this.active);
        } else {
            if (intlPartnerActiveCard2 == null) {
                Intrinsics.m87502r("intlPartnerActiveCard");
                intlPartnerActiveCard2 = null;
            }
            if (!Intrinsics.m87488d(intlPartnerActiveCard2, view)) {
                intlPartnerActiveCard = (IntlPartnerActiveCard) view;
                this.intlPartnerActiveCard = intlPartnerActiveCard;
                if (intlPartnerActiveCard == null) {
                    Intrinsics.m87502r("intlPartnerActiveCard");
                    intlPartnerActiveCard = null;
                }
                intlPartnerActiveCard.m44224g(this.frag, this.active);
            }
        }
        if (position == 0) {
            o6j0.m162864h("e_intl_iqiyi_activities_card", this.frag.mo36761u0(), new o6j0.C18854a[0]);
            IntlPartnerActiveCard intlPartnerActiveCard4 = this.intlPartnerActiveCard;
            if (intlPartnerActiveCard4 == null) {
                Intrinsics.m87502r("intlPartnerActiveCard");
            } else {
                intlPartnerActiveCard3 = intlPartnerActiveCard4;
            }
            intlPartnerActiveCard3.setOnSwipe(false);
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
        return VSwipeStack.OnCardSwipeResult.back;
    }

    /* JADX INFO: renamed from: j */
    public final void m204931j(final User otherUser, final User me2) {
        C22306c c22306cObserveOn;
        eyl eylVar = this.frag;
        m89 m89Var = CoreModule.f17545c.f19565F1;
        String str = otherUser.f56011id;
        str.getClass();
        String str2 = me2.f56011id;
        str2.getClass();
        C22306c c22306cMo36764z1 = eylVar.mo36764z1(m89Var.m153479c3(str, str2, "iqiyi"));
        if (c22306cMo36764z1 == null || (c22306cObserveOn = c22306cMo36764z1.observeOn(jo0.m142408a())) == null) {
            return;
        }
        c22306cObserveOn.subscribe(mkd0.m154956H(new e30() { // from class: l.upo
            @Override // p149l.e30
            public final void call(Object obj) {
                wpo.m204929h(this.f177648a, me2, otherUser, (SpotLightForceMatchEnvelope) obj);
            }
        }, new e30() { // from class: l.vpo
            @Override // p149l.e30
            public final void call(Object obj) {
                wpo.m204930i((Throwable) obj);
            }
        }));
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VSwipeStack.OnCardSwipeResult m204932k(@NotNull SwipeDirection swipeDirection, @NotNull t7m card, boolean fromButton) {
        swipeDirection.getClass();
        card.getClass();
        IntlPartnerActiveCard intlPartnerActiveCard = this.intlPartnerActiveCard;
        if (intlPartnerActiveCard != null) {
            if (intlPartnerActiveCard == null) {
                Intrinsics.m87502r("intlPartnerActiveCard");
                intlPartnerActiveCard = null;
            }
            intlPartnerActiveCard.setOnSwipe(true);
        }
        if (swipeDirection == SwipeDirection.UP) {
            return VSwipeStack.OnCardSwipeResult.back;
        }
        if (swipeDirection == SwipeDirection.RIGHT) {
            if (!fromButton && !IntlCountryCodeController.m28126v()) {
                o6j0.m162859c("e_intl_iqiyi_activities_card_button", this.frag.mo36761u0(), new o6j0.C18854a[0]);
            }
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            if (userM169527p9 != null && NullChecker.m81303a(this.otherUser)) {
                User user = this.otherUser;
                user.getClass();
                m204931j(user, userM169527p9);
            }
        }
        this.frag.mo36759r2();
        return VSwipeStack.OnCardSwipeResult.pass;
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
