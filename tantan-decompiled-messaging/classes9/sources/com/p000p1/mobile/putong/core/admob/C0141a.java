package com.p000p1.mobile.putong.core.admob;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.admob.C0141a;
import com.p000p1.mobile.putong.core.card.VSwipeCard;
import com.p000p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p1.mobile.putong.core.newui.home.NewNewProfileCard;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.e30;
import l.o6j0;
import l.ool0;
import l.t7m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.f6c0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.admob.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 -2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0012\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010+¨\u0006."}, d2 = {"Lcom/p1/mobile/putong/core/admob/a;", "Ll/ool0;", "Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "cardType", "Landroid/view/View;", "d", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/p1/mobile/putong/core/data/VirtualCardType;)Landroid/view/View;", "view", "", "position", "card", "", "e", "(Landroid/view/View;ILcom/p1/mobile/putong/core/data/VirtualCardType;Landroid/view/View;)V", "", "f", "()Z", "Lcom/p1/mobile/putong/core/card/VSwipeCard;", "b", "(Lcom/p1/mobile/putong/core/card/VSwipeCard;)V", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "swipeDirection", "Ll/t7m;", "Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "g", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ll/t7m;)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "c", "(Landroid/view/View;)V", "a", "Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "Lcom/p1/mobile/putong/core/admob/NativeAdViewCard;", "Lcom/p1/mobile/putong/core/admob/NativeAdViewCard;", "adViewCard", "Landroid/view/View;", "hostCard", "Companion", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class C0141a implements ool0 {

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
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/p1/mobile/putong/core/admob/a$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "act", "", "a", "(Lcom/p1/mobile/android/app/Act;)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final void m1943a(@NotNull Act act) {
            act.getClass();
            NativeAdViewCard.INSTANCE.m1913l(act);
        }

        public Companion() {
        }
    }

    public C0141a(@NotNull NewNewHomeFrag newNewHomeFrag) {
        newNewHomeFrag.getClass();
        this.frag = newNewHomeFrag;
    }

    /* JADX INFO: renamed from: h */
    public static void m1933h() {
        CoreModule.f1534c.f3652m0.m2908A8(VirtualCardType.NativeAdViewCard);
    }

    /* JADX INFO: renamed from: i */
    public static void m1934i(C0141a c0141a, Boolean bool) {
        c0141a.frag.C.A2().A(bool.booleanValue() ? SwipeDirection.RIGHT : SwipeDirection.LEFT);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m1935j() {
        return true;
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final void m1936k(@NotNull Act act) {
        INSTANCE.m1943a(act);
    }

    /* JADX INFO: renamed from: b */
    public void m1937b(@Nullable VSwipeCard card) {
    }

    /* JADX INFO: renamed from: c */
    public void m1938c(@Nullable View view) {
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public View m1939d(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable VirtualCardType cardType) {
        inflater.getClass();
        View viewInflate = inflater.inflate(f6c0.f12439u3, parent, false);
        viewInflate.getClass();
        return viewInflate;
    }

    /* JADX INFO: renamed from: e */
    public void m1940e(@NotNull View view, int position, @Nullable VirtualCardType cardType, @Nullable View card) {
        view.getClass();
        if (view instanceof NativeAdViewCard) {
            this.adViewCard = (NativeAdViewCard) view;
            NativeAdViewCard nativeAdViewCard = null;
            if (position != 0) {
                if (position <= 2 && !NativeAdViewCard.INSTANCE.m1907e()) {
                    view.post(new Runnable() { // from class: l.v520
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0141a.m1933h();
                        }
                    });
                    return;
                }
                NativeAdViewCard nativeAdViewCard2 = this.adViewCard;
                if (nativeAdViewCard2 == null) {
                    Intrinsics.r("adViewCard");
                } else {
                    nativeAdViewCard = nativeAdViewCard2;
                }
                nativeAdViewCard.m1899q(this.frag, new e30() { // from class: l.w520
                    public final void call(Object obj) {
                        C0141a.m1934i(this.f24978a, (Boolean) obj);
                    }
                });
                return;
            }
            o6j0.h("e_intl_ads_card", this.frag.pageId(), new o6j0.a[0]);
            this.frag.C.P2();
            this.frag.C.R2();
            if (card instanceof NewNewProfileCard) {
                this.hostCard = card;
                ((NewNewProfileCard) card).setCustomClickGesture(new VSwipeCard.InterfaceC0189c() { // from class: l.u520
                    @Override // com.p000p1.mobile.putong.core.card.VSwipeCard.InterfaceC0189c
                    /* JADX INFO: renamed from: a */
                    public final boolean mo7122a() {
                        return C0141a.m1935j();
                    }
                });
            }
            NativeAdViewCard nativeAdViewCard3 = this.adViewCard;
            if (nativeAdViewCard3 == null) {
                Intrinsics.r("adViewCard");
            } else {
                nativeAdViewCard = nativeAdViewCard3;
            }
            nativeAdViewCard.setOnSwipe(false);
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m1941f() {
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult m1942g(@NotNull SwipeDirection swipeDirection, @Nullable t7m card) {
        swipeDirection.getClass();
        NativeAdViewCard.INSTANCE.m1914m(null);
        if (swipeDirection.getValue() == SwipeDirection.RIGHT.getValue() || swipeDirection.getValue() == SwipeDirection.UP.getValue()) {
            o6j0.g("e_intl_ads_card", this.frag.pageId(), new o6j0.a[0]);
        }
        NativeAdViewCard nativeAdViewCard = this.adViewCard;
        if (nativeAdViewCard != null) {
            if (nativeAdViewCard == null) {
                Intrinsics.r("adViewCard");
                nativeAdViewCard = null;
            }
            nativeAdViewCard.setOnSwipe(true);
            NewNewProfileCard newNewProfileCard = this.hostCard;
            if (newNewProfileCard != null && (newNewProfileCard instanceof NewNewProfileCard)) {
                newNewProfileCard.setCustomClickGesture(null);
            }
            this.hostCard = null;
        }
        this.frag.C.n6();
        return VSwipeStack.OnCardSwipeResult.pass;
    }
}
