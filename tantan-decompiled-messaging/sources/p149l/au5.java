package p149l;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.tencent.open.SocialConstants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u0018\u0010\fJ#\u0010\u001e\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\n¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J%\u0010&\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b&\u0010\u001fJ\u001d\u0010'\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\nH\u0002¢\u0006\u0004\b+\u0010!R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010.R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010=\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010:¨\u0006>"}, m87232d2 = {"Ll/au5;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/ju5;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/ju5;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "K", "(Landroid/view/View;)V", "I", "(Ll/ju5;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "m", "Ll/mqv;", "Lcom/p1/mobile/putong/data/User;", "livingUser", "Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;", "giftItem", "P", "(Ll/mqv;Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;)V", "J", "()V", "Lv/VImage;", "targetView", "H", "(Lv/VImage;)V", BloodType.f38728O, "L", "(Ll/mqv;)V", "M", "(Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;)V", "N", "Lv/VDraweeView;", "k", "Lv/VDraweeView;", "giftReceiveUserAvatar", BLiveStormDanmakuGiftResourceType.f44444l, "Lv/VImage;", "giftImageBgView", "giftImageAvatar", "Lv/VButton;", "n", "Lv/VButton;", "sendGiftButton", "Lv/VText;", "o", "Lv/VText;", "giftName", "p", "giftCost", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class au5 extends LiveMenuDialogHolder<ju5> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VDraweeView giftReceiveUserAvatar;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VImage giftImageBgView;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VDraweeView giftImageAvatar;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VButton sendGiftButton;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public VText giftName;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public VText giftCost;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au5(@NotNull Act act, @NotNull ju5 ju5Var) {
        super(t6c0.f168402k0, act, ju5Var);
        act.getClass();
        ju5Var.getClass();
    }

    /* JADX INFO: renamed from: F */
    public static Unit m98948F(au5 au5Var, View view) {
        view.getClass();
        ((ju5) au5Var.f47757b).m143241i4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public static Unit m98949G(au5 au5Var, View view) {
        view.getClass();
        au5Var.m98953J();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K */
    private final void m98950K(View view) {
        View viewFindViewById = view.findViewById(g5c0.f100823U4);
        viewFindViewById.getClass();
        this.giftReceiveUserAvatar = (VDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(g5c0.f100915e2);
        viewFindViewById2.getClass();
        this.giftImageAvatar = (VDraweeView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(g5c0.f100925f2);
        viewFindViewById3.getClass();
        this.giftImageBgView = (VImage) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(g5c0.f100734K5);
        viewFindViewById4.getClass();
        this.sendGiftButton = (VButton) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(g5c0.f100994m2);
        viewFindViewById5.getClass();
        this.giftName = (VText) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(g5c0.f100856Y1);
        viewFindViewById6.getClass();
        this.giftCost = (VText) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(g5c0.f100746M);
        viewFindViewById7.getClass();
        cxq.m109105c(viewFindViewById7, new Function1() { // from class: l.yt5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return au5.m98949G(this.f199888a, (View) obj);
            }
        });
        mep0.m154301c1(view.findViewById(g5c0.f100710I), 0, 0, 0, -t100.m186890d(24.0f), t100.m186890d(24.0f));
        VButton vButton = this.sendGiftButton;
        if (vButton == null) {
            Intrinsics.m87502r("sendGiftButton");
            vButton = null;
        }
        uep0.m193326m(vButton, t100.f167264m);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        Act act = ((ju5) this.f47757b).act();
        act.getClass();
        return act;
    }

    /* JADX INFO: renamed from: H */
    public final void m98951H(VImage targetView) {
        GradientDrawable gradientDrawableM213883h = yb2.m213883h(0);
        gradientDrawableM213883h.setStroke(t100.m186890d(3.0f), kvc0.m147352a(h1c0.f105416w1));
        gradientDrawableM213883h.setColor(kvc0.m147352a(h1c0.f105333S0));
        targetView.setBackground(gradientDrawableM213883h);
    }

    /* JADX INFO: renamed from: J */
    public final void m98953J() {
        mo71838p();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, l.ho2] */
    /* JADX INFO: renamed from: L */
    public final void m98954L(mqv<User> livingUser) {
        ?? M206027E2 = ((ju5) this.f47757b).m206027E2();
        M206027E2.getClass();
        VDraweeView vDraweeView = null;
        if (M206027E2.mo132103W0()) {
            VDraweeView vDraweeView2 = this.giftReceiveUserAvatar;
            if (vDraweeView2 == null) {
                Intrinsics.m87502r("giftReceiveUserAvatar");
                vDraweeView2 = null;
            }
            wk3.m203646e(vDraweeView2, hxn0.m133350c(livingUser).f109896b, true);
        }
        VDraweeView vDraweeView3 = this.giftReceiveUserAvatar;
        if (vDraweeView3 == null) {
            Intrinsics.m87502r("giftReceiveUserAvatar");
        } else {
            vDraweeView = vDraweeView3;
        }
        hxs.m133406s("context_single_room", vDraweeView, hxn0.m133350c(livingUser).f109896b.avatar);
    }

    /* JADX INFO: renamed from: M */
    public final void m98955M(BLiveGiftItem giftItem) {
        VImage vImage = this.giftImageBgView;
        VText vText = null;
        if (vImage == null) {
            Intrinsics.m87502r("giftImageBgView");
            vImage = null;
        }
        m98951H(vImage);
        VDraweeView vDraweeView = this.giftImageAvatar;
        if (vDraweeView == null) {
            Intrinsics.m87502r("giftImageAvatar");
            vDraweeView = null;
        }
        hxs.m133406s("context_single_room", vDraweeView, giftItem.url);
        VText vText2 = this.giftName;
        if (vText2 == null) {
            Intrinsics.m87502r("giftName");
            vText2 = null;
        }
        vText2.setText(giftItem.getLocalName());
        VText vText3 = this.giftCost;
        if (vText3 == null) {
            Intrinsics.m87502r("giftCost");
        } else {
            vText = vText3;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String strM202217t = w8u.m202217t(R$string.f46929R4);
        strM202217t.getClass();
        vText.setText(String.format(strM202217t, Arrays.copyOf(new Object[]{Long.valueOf(giftItem.purchasePrice)}, 1)));
    }

    /* JADX INFO: renamed from: N */
    public final void m98956N() {
        VButton vButton = this.sendGiftButton;
        if (vButton == null) {
            Intrinsics.m87502r("sendGiftButton");
            vButton = null;
        }
        cxq.m109105c(vButton, new Function1() { // from class: l.zt5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return au5.m98948F(this.f204691a, (View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public final void m98957O(mqv<User> livingUser, BLiveGiftItem giftItem) {
        m98956N();
        m98954L(livingUser);
        m98955M(giftItem);
    }

    /* JADX INFO: renamed from: P */
    public final void m98958P(@NotNull mqv<User> livingUser, @NotNull BLiveGiftItem giftItem) {
        livingUser.getClass();
        giftItem.getClass();
        m71834E();
        m98957O(livingUser, giftItem);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @Nullable
    public View inflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        return null;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(@Nullable View view) {
        super.mo71836m(view);
        if (view != null) {
            m98950K(view);
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@Nullable ju5 presenter) {
    }
}
