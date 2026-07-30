package p153l;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.p058ui.active.VipActiveCard;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0016\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020&2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010.\u001a\u0004\b/\u00100R\u0016\u00103\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u00102¨\u00064"}, m88121d2 = {"Ll/gol0;", "Ll/sxl0;", "Ll/x0m;", "frag", "Lcom/p1/mobile/putong/core/data/Active;", Active.TYPE, "<init>", "(Ll/x0m;Lcom/p1/mobile/putong/core/data/Active;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "cardType", "Landroid/view/View;", Constants.INAPP_DATA_TAG, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/p1/mobile/putong/core/data/VirtualCardType;)Landroid/view/View;", OMSTemplateModeType.view, "", "position", "card", "", "e", "(Landroid/view/View;ILcom/p1/mobile/putong/core/data/VirtualCardType;Landroid/view/View;)V", "", "f", "()Z", "Lcom/p1/mobile/putong/core/card/VSwipeCard;", "b", "(Lcom/p1/mobile/putong/core/card/VSwipeCard;)V", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "swipeDirection", "Ll/jam;", "Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "g", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ll/jam;)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "c", "(Landroid/view/View;)V", "", "url", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;)Ljava/lang/String;", "a", "Ll/x0m;", "getFrag", "()Ll/x0m;", "Lcom/p1/mobile/putong/core/data/Active;", "getActive", "()Lcom/p1/mobile/putong/core/data/Active;", "Lcom/p1/mobile/putong/core/ui/active/VipActiveCard;", "Lcom/p1/mobile/putong/core/ui/active/VipActiveCard;", "vipActiveCard", "card_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class gol0 implements sxl0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final x0m frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Active active;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VipActiveCard vipActiveCard;

    public gol0(@NotNull x0m x0mVar, @NotNull Active active) {
        x0mVar.getClass();
        active.getClass();
        this.frag = x0mVar;
        this.active = active;
    }

    /* JADX INFO: renamed from: h */
    public static void m131118h(gol0 gol0Var) {
        gol0Var.frag.mo37749V(SwipeDirection.RIGHT);
    }

    @Override // p153l.sxl0
    @NotNull
    /* JADX INFO: renamed from: d */
    public View mo31009d(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable VirtualCardType cardType) {
        inflater.getClass();
        View viewInflate = inflater.inflate(nec0.f141631p, parent, false);
        viewInflate.getClass();
        return viewInflate;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0013  */
    @Override // p153l.sxl0
    /* JADX INFO: renamed from: e */
    public void mo31010e(@Nullable View view, int position, @Nullable VirtualCardType cardType, @Nullable View card) {
        VipActiveCard vipActiveCard;
        VipActiveCard vipActiveCard2 = this.vipActiveCard;
        VipActiveCard vipActiveCard3 = null;
        if (vipActiveCard2 == null) {
            view.getClass();
            vipActiveCard = (VipActiveCard) view;
            this.vipActiveCard = vipActiveCard;
            if (vipActiveCard == null) {
                Intrinsics.m88391r("vipActiveCard");
                vipActiveCard = null;
            }
            vipActiveCard.m45434e(this.frag, this.active, new x20() { // from class: l.fol0
                @Override // p153l.x20
                public final void call() {
                    gol0.m131118h(this.f100067a);
                }
            });
        } else {
            if (vipActiveCard2 == null) {
                Intrinsics.m88391r("vipActiveCard");
                vipActiveCard2 = null;
            }
            if (!Intrinsics.m88377d(vipActiveCard2, view)) {
                view.getClass();
                vipActiveCard = (VipActiveCard) view;
                this.vipActiveCard = vipActiveCard;
                if (vipActiveCard == null) {
                    Intrinsics.m88391r("vipActiveCard");
                    vipActiveCard = null;
                }
                vipActiveCard.m45434e(this.frag, this.active, new x20() { // from class: l.fol0
                    @Override // p153l.x20
                    public final void call() {
                        gol0.m131118h(this.f100067a);
                    }
                });
            }
        }
        if (position == 0) {
            sfj0.m185601h("e_intl_vip_churnback", this.frag.mo37764u0(), new sfj0.C20032a[0]);
            VipActiveCard vipActiveCard4 = this.vipActiveCard;
            if (vipActiveCard4 == null) {
                Intrinsics.m88391r("vipActiveCard");
            } else {
                vipActiveCard3 = vipActiveCard4;
            }
            vipActiveCard3.setOnSwipe(false);
            this.frag.mo37745O3();
            this.frag.mo37743J0();
        }
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: f */
    public boolean mo31011f() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007f A[Catch: Exception -> 0x00a1, TRY_LEAVE, TryCatch #0 {Exception -> 0x00a1, blocks: (B:7:0x002d, B:9:0x0037, B:11:0x0047, B:13:0x0056, B:16:0x0066, B:17:0x007f), top: B:28:0x002d }] */
    @Override // p153l.sxl0
    @NotNull
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo31012g(@NotNull SwipeDirection swipeDirection, @NotNull jam card) {
        swipeDirection.getClass();
        card.getClass();
        VipActiveCard vipActiveCard = null;
        if (swipeDirection.getValue() == SwipeDirection.RIGHT.getValue() || swipeDirection.getValue() == SwipeDirection.UP.getValue()) {
            sfj0.m185596c("e_intl_vip_churnback", this.frag.mo37764u0(), new sfj0.C20032a[0]);
            try {
                if (!TextUtils.isEmpty(this.active.cardLandPageUrl)) {
                    String str = this.active.cardLandPageUrl;
                    str.getClass();
                    if (C15493d.m94374J(str, "tantan", false, 2, null)) {
                        String str2 = this.active.cardLandPageUrl;
                        str2.getClass();
                        m131119i(str2);
                        String str3 = this.active.cardLandPageUrl;
                        str3.getClass();
                        nae0.m162083m(this.frag.mo37761q1(), Uri.parse(m131119i(str3)));
                    } else {
                        String str4 = this.active.cardLandPageUrl;
                        str4.getClass();
                        if (C15493d.m94374J(str4, "tantanapp", false, 2, null)) {
                            String str5 = this.active.cardLandPageUrl;
                            str5.getClass();
                            m131119i(str5);
                            String str6 = this.active.cardLandPageUrl;
                            str6.getClass();
                            nae0.m162083m(this.frag.mo37761q1(), Uri.parse(m131119i(str6)));
                        } else {
                            String str7 = this.active.cardLandPageUrl;
                            str7.getClass();
                            if (C15493d.m94374J(str7, "tantantribe", false, 2, null)) {
                                String str8 = this.active.cardLandPageUrl;
                                str8.getClass();
                                m131119i(str8);
                                String str9 = this.active.cardLandPageUrl;
                                str9.getClass();
                                nae0.m162083m(this.frag.mo37761q1(), Uri.parse(m131119i(str9)));
                            } else {
                                this.frag.mo37761q1().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.active.cardLandPageUrl)));
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
                Intrinsics.m88391r("vipActiveCard");
            } else {
                vipActiveCard = vipActiveCard2;
            }
            vipActiveCard.setOnSwipe(true);
        }
        this.frag.mo37762r2();
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: i */
    public final String m131119i(String url) {
        if (!C15493d.m94374J(url, "tantan://freeTrialPromotion", false, 2, null) || StringsKt.m94303P(url, "endTime", false, 2, null) || !NullChecker.m82486a(CoreModule.f18264c.f20396j0.m31579C4())) {
            return url;
        }
        return url + "?endTime=" + CoreModule.f18264c.f20396j0.m31579C4().endTime;
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
