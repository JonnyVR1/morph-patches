package com.p046p1.mobile.putong.core.admob;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.admob.C4715a;
import com.p046p1.mobile.putong.core.card.VSwipeCard;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p046p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.e30;
import p149l.f6c0;
import p149l.o6j0;
import p149l.ool0;
import p149l.t7m;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.admob.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 -2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0012\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010+¨\u0006."}, m87232d2 = {"Lcom/p1/mobile/putong/core/admob/a;", "Ll/ool0;", "Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "cardType", "Landroid/view/View;", Constants.INAPP_DATA_TAG, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/p1/mobile/putong/core/data/VirtualCardType;)Landroid/view/View;", OMSTemplateModeType.view, "", "position", "card", "", "e", "(Landroid/view/View;ILcom/p1/mobile/putong/core/data/VirtualCardType;Landroid/view/View;)V", "", "f", "()Z", "Lcom/p1/mobile/putong/core/card/VSwipeCard;", "b", "(Lcom/p1/mobile/putong/core/card/VSwipeCard;)V", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "swipeDirection", "Ll/t7m;", "Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "g", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ll/t7m;)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "c", "(Landroid/view/View;)V", "a", "Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "Lcom/p1/mobile/putong/core/admob/NativeAdViewCard;", "Lcom/p1/mobile/putong/core/admob/NativeAdViewCard;", "adViewCard", "Landroid/view/View;", "hostCard", "Companion", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class C4715a implements ool0 {

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
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Lcom/p1/mobile/putong/core/admob/a$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "a", "(Lcom/p1/mobile/android/app/Act;)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final void m30015a(@NotNull Act act) {
            act.getClass();
            NativeAdViewCard.INSTANCE.m29985l(act);
        }

        public Companion() {
        }
    }

    public C4715a(@NotNull NewNewHomeFrag newNewHomeFrag) {
        newNewHomeFrag.getClass();
        this.frag = newNewHomeFrag;
    }

    /* JADX INFO: renamed from: h */
    public static void m30005h() {
        CoreModule.f17545c.f19663m0.m30978A8(VirtualCardType.NativeAdViewCard);
    }

    /* JADX INFO: renamed from: i */
    public static void m30006i(C4715a c4715a, Boolean bool) {
        c4715a.frag.f21678C.m37125A2().mo38801A(bool.booleanValue() ? SwipeDirection.RIGHT : SwipeDirection.LEFT);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m30007j() {
        return true;
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final void m30008k(@NotNull Act act) {
        INSTANCE.m30015a(act);
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: b */
    public void mo30009b(@Nullable VSwipeCard card) {
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: c */
    public void mo30010c(@Nullable View view) {
    }

    @Override // p149l.ool0
    @NotNull
    /* JADX INFO: renamed from: d */
    public View mo30011d(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable VirtualCardType cardType) {
        inflater.getClass();
        View viewInflate = inflater.inflate(f6c0.f96025u3, parent, false);
        viewInflate.getClass();
        return viewInflate;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: e */
    public void mo30012e(@NotNull View view, int position, @Nullable VirtualCardType cardType, @Nullable View card) {
        view.getClass();
        if (view instanceof NativeAdViewCard) {
            this.adViewCard = (NativeAdViewCard) view;
            NativeAdViewCard nativeAdViewCard = null;
            if (position != 0) {
                if (position <= 2 && !NativeAdViewCard.INSTANCE.m29979e()) {
                    view.post(new Runnable() { // from class: l.v520
                        @Override // java.lang.Runnable
                        public final void run() {
                            C4715a.m30005h();
                        }
                    });
                    return;
                }
                NativeAdViewCard nativeAdViewCard2 = this.adViewCard;
                if (nativeAdViewCard2 == null) {
                    Intrinsics.m87502r("adViewCard");
                } else {
                    nativeAdViewCard = nativeAdViewCard2;
                }
                nativeAdViewCard.m29971q(this.frag, new e30() { // from class: l.w520
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        C4715a.m30006i(this.f184639a, (Boolean) obj);
                    }
                });
                return;
            }
            o6j0.m162864h("e_intl_ads_card", this.frag.pageId(), new o6j0.C18854a[0]);
            this.frag.f21678C.m37204P2();
            this.frag.f21678C.m37215R2();
            if (card instanceof NewNewProfileCard) {
                this.hostCard = card;
                ((NewNewProfileCard) card).setCustomClickGesture(new VSwipeCard.InterfaceC4763c() { // from class: l.u520
                    @Override // com.p046p1.mobile.putong.core.card.VSwipeCard.InterfaceC4763c
                    /* JADX INFO: renamed from: a */
                    public final boolean mo35180a() {
                        return C4715a.m30007j();
                    }
                });
            }
            NativeAdViewCard nativeAdViewCard3 = this.adViewCard;
            if (nativeAdViewCard3 == null) {
                Intrinsics.m87502r("adViewCard");
            } else {
                nativeAdViewCard = nativeAdViewCard3;
            }
            nativeAdViewCard.setOnSwipe(false);
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
    public VSwipeStack.OnCardSwipeResult mo30014g(@NotNull SwipeDirection swipeDirection, @Nullable t7m card) {
        swipeDirection.getClass();
        NativeAdViewCard.INSTANCE.m29986m(null);
        if (swipeDirection.getValue() == SwipeDirection.RIGHT.getValue() || swipeDirection.getValue() == SwipeDirection.UP.getValue()) {
            o6j0.m162863g("e_intl_ads_card", this.frag.pageId(), new o6j0.C18854a[0]);
        }
        NativeAdViewCard nativeAdViewCard = this.adViewCard;
        if (nativeAdViewCard != null) {
            if (nativeAdViewCard == null) {
                Intrinsics.m87502r("adViewCard");
                nativeAdViewCard = null;
            }
            nativeAdViewCard.setOnSwipe(true);
            View view = this.hostCard;
            if (view != null && (view instanceof NewNewProfileCard)) {
                ((NewNewProfileCard) view).setCustomClickGesture(null);
            }
            this.hostCard = null;
        }
        this.frag.f21678C.m37329n6();
        return VSwipeStack.OnCardSwipeResult.pass;
    }
}
