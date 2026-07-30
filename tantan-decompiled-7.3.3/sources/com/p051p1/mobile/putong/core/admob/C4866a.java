package com.p051p1.mobile.putong.core.admob;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.admob.C4866a;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p051p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.jam;
import p153l.kec0;
import p153l.sfj0;
import p153l.sxl0;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.admob.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 -2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0012\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010+¨\u0006."}, m88121d2 = {"Lcom/p1/mobile/putong/core/admob/a;", "Ll/sxl0;", "Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "cardType", "Landroid/view/View;", Constants.INAPP_DATA_TAG, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/p1/mobile/putong/core/data/VirtualCardType;)Landroid/view/View;", OMSTemplateModeType.view, "", "position", "card", "", "e", "(Landroid/view/View;ILcom/p1/mobile/putong/core/data/VirtualCardType;Landroid/view/View;)V", "", "f", "()Z", "Lcom/p1/mobile/putong/core/card/VSwipeCard;", "b", "(Lcom/p1/mobile/putong/core/card/VSwipeCard;)V", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "swipeDirection", "Ll/jam;", "Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "g", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ll/jam;)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "c", "(Landroid/view/View;)V", "a", "Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "Lcom/p1/mobile/putong/core/admob/NativeAdViewCard;", "Lcom/p1/mobile/putong/core/admob/NativeAdViewCard;", "adViewCard", "Landroid/view/View;", "hostCard", "Companion", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class C4866a implements sxl0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final NewNewHomeFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public NativeAdViewCard adViewCard;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public View hostCard;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.admob.a$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Lcom/p1/mobile/putong/core/admob/a$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "a", "(Lcom/p1/mobile/android/app/Act;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final void m31013a(@NotNull Act act) {
            act.getClass();
            NativeAdViewCard.INSTANCE.m30983l(act);
        }

        public Companion() {
        }
    }

    public C4866a(@NotNull NewNewHomeFrag newNewHomeFrag) {
        newNewHomeFrag.getClass();
        this.frag = newNewHomeFrag;
    }

    /* JADX INFO: renamed from: h */
    public static void m31003h() {
        CoreModule.f18264c.f20405m0.m31981A8(VirtualCardType.NativeAdViewCard);
    }

    /* JADX INFO: renamed from: i */
    public static void m31004i(C4866a c4866a, Boolean bool) {
        c4866a.frag.f22420C.m38128A2().mo39804A(bool.booleanValue() ? SwipeDirection.RIGHT : SwipeDirection.LEFT);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m31005j() {
        return true;
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final void m31006k(@NotNull Act act) {
        INSTANCE.m31013a(act);
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: b */
    public void mo31007b(@Nullable VSwipeCard card) {
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: c */
    public void mo31008c(@Nullable View view) {
    }

    @Override // p153l.sxl0
    @NotNull
    /* JADX INFO: renamed from: d */
    public View mo31009d(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable VirtualCardType cardType) {
        inflater.getClass();
        View viewInflate = inflater.inflate(kec0.f126079u3, parent, false);
        viewInflate.getClass();
        return viewInflate;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: e */
    public void mo31010e(@NotNull View view, int position, @Nullable VirtualCardType cardType, @Nullable View card) {
        view.getClass();
        if (view instanceof NativeAdViewCard) {
            this.adViewCard = (NativeAdViewCard) view;
            NativeAdViewCard nativeAdViewCard = null;
            if (position != 0) {
                if (position <= 2 && !NativeAdViewCard.INSTANCE.m30977e()) {
                    view.post(new Runnable() { // from class: l.de20
                        @Override // java.lang.Runnable
                        public final void run() {
                            C4866a.m31003h();
                        }
                    });
                    return;
                }
                NativeAdViewCard nativeAdViewCard2 = this.adViewCard;
                if (nativeAdViewCard2 == null) {
                    Intrinsics.m88391r("adViewCard");
                } else {
                    nativeAdViewCard = nativeAdViewCard2;
                }
                nativeAdViewCard.m30969q(this.frag, new y20() { // from class: l.ee20
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        C4866a.m31004i(this.f93614a, (Boolean) obj);
                    }
                });
                return;
            }
            sfj0.m185601h("e_intl_ads_card", this.frag.pageId(), new sfj0.C20032a[0]);
            this.frag.f22420C.m38207P2();
            this.frag.f22420C.m38218R2();
            if (card instanceof NewNewProfileCard) {
                this.hostCard = card;
                ((NewNewProfileCard) card).setCustomClickGesture(new VSwipeCard.InterfaceC4914c() { // from class: l.ce20
                    @Override // com.p051p1.mobile.putong.core.card.VSwipeCard.InterfaceC4914c
                    /* JADX INFO: renamed from: a */
                    public final boolean mo36183a() {
                        return C4866a.m31005j();
                    }
                });
            }
            NativeAdViewCard nativeAdViewCard3 = this.adViewCard;
            if (nativeAdViewCard3 == null) {
                Intrinsics.m88391r("adViewCard");
            } else {
                nativeAdViewCard = nativeAdViewCard3;
            }
            nativeAdViewCard.setOnSwipe(false);
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
    public VSwipeStack.OnCardSwipeResult mo31012g(@NotNull SwipeDirection swipeDirection, @Nullable jam card) {
        swipeDirection.getClass();
        NativeAdViewCard.INSTANCE.m30984m(null);
        if (swipeDirection.getValue() == SwipeDirection.RIGHT.getValue() || swipeDirection.getValue() == SwipeDirection.UP.getValue()) {
            sfj0.m185600g("e_intl_ads_card", this.frag.pageId(), new sfj0.C20032a[0]);
        }
        NativeAdViewCard nativeAdViewCard = this.adViewCard;
        if (nativeAdViewCard != null) {
            if (nativeAdViewCard == null) {
                Intrinsics.m88391r("adViewCard");
                nativeAdViewCard = null;
            }
            nativeAdViewCard.setOnSwipe(true);
            View view = this.hostCard;
            if (view != null && (view instanceof NewNewProfileCard)) {
                ((NewNewProfileCard) view).setCustomClickGesture(null);
            }
            this.hostCard = null;
        }
        this.frag.f22420C.m38332n6();
        return VSwipeStack.OnCardSwipeResult.pass;
    }
}
