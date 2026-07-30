package p153l;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
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
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u0018\u0010\fJ#\u0010\u001e\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\n¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J%\u0010&\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b&\u0010\u001fJ\u001d\u0010'\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\nH\u0002¢\u0006\u0004\b+\u0010!R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010.R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010=\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010:¨\u0006>"}, m88121d2 = {"Ll/ev5;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/nv5;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/nv5;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "K", "(Landroid/view/View;)V", "I", "(Ll/nv5;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "m", "Ll/nsv;", "Lcom/p1/mobile/putong/data/User;", "livingUser", "Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;", "giftItem", "P", "(Ll/nsv;Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;)V", "J", "()V", "Lv/VImage;", "targetView", "H", "(Lv/VImage;)V", BloodType.f39576O, "L", "(Ll/nsv;)V", "M", "(Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;)V", "N", "Lv/VDraweeView;", "k", "Lv/VDraweeView;", "giftReceiveUserAvatar", BLiveStormDanmakuGiftResourceType.f45292l, "Lv/VImage;", "giftImageBgView", "giftImageAvatar", "Lv/VButton;", "n", "Lv/VButton;", "sendGiftButton", "Lv/VText;", "o", "Lv/VText;", "giftName", "p", "giftCost", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ev5 extends LiveMenuDialogHolder<nv5> {

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
    public ev5(@NotNull Act act, @NotNull nv5 nv5Var) {
        super(yec0.f199134k0, act, nv5Var);
        act.getClass();
        nv5Var.getClass();
    }

    /* JADX INFO: renamed from: F */
    public static Unit m122759F(ev5 ev5Var, View view) {
        view.getClass();
        ((nv5) ev5Var.f48605b).m164862i4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public static Unit m122760G(ev5 ev5Var, View view) {
        view.getClass();
        ev5Var.m122764J();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K */
    private final void m122761K(View view) {
        View viewFindViewById = view.findViewById(mdc0.f136068U4);
        viewFindViewById.getClass();
        this.giftReceiveUserAvatar = (VDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(mdc0.f136160e2);
        viewFindViewById2.getClass();
        this.giftImageAvatar = (VDraweeView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(mdc0.f136170f2);
        viewFindViewById3.getClass();
        this.giftImageBgView = (VImage) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(mdc0.f135979K5);
        viewFindViewById4.getClass();
        this.sendGiftButton = (VButton) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(mdc0.f136239m2);
        viewFindViewById5.getClass();
        this.giftName = (VText) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(mdc0.f136101Y1);
        viewFindViewById6.getClass();
        this.giftCost = (VText) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(mdc0.f135991M);
        viewFindViewById7.getClass();
        czq.m113347c(viewFindViewById7, new Function1() { // from class: l.cv5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ev5.m122760G(this.f83946a, (View) obj);
            }
        });
        qnp0.m177260c1(view.findViewById(mdc0.f135955I), 0, 0, 0, -qa00.m175859d(24.0f), qa00.m175859d(24.0f));
        VButton vButton = this.sendGiftButton;
        if (vButton == null) {
            Intrinsics.m88391r("sendGiftButton");
            vButton = null;
        }
        ynp0.m216936m(vButton, qa00.f156326m);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        Act act = ((nv5) this.f48605b).act();
        act.getClass();
        return act;
    }

    /* JADX INFO: renamed from: H */
    public final void m122762H(VImage targetView) {
        GradientDrawable gradientDrawableM124978h = fc2.m124978h(0);
        gradientDrawableM124978h.setStroke(qa00.m175859d(3.0f), n3d0.m161277a(n9c0.f140877w1));
        gradientDrawableM124978h.setColor(n3d0.m161277a(n9c0.f140794S0));
        targetView.setBackground(gradientDrawableM124978h);
    }

    /* JADX INFO: renamed from: J */
    public final void m122764J() {
        mo73021p();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, l.oo2] */
    /* JADX INFO: renamed from: L */
    public final void m122765L(nsv<User> livingUser) {
        ?? M213810E2 = ((nv5) this.f48605b).m213810E2();
        M213810E2.getClass();
        VDraweeView vDraweeView = null;
        if (M213810E2.mo168489W0()) {
            VDraweeView vDraweeView2 = this.giftReceiveUserAvatar;
            if (vDraweeView2 == null) {
                Intrinsics.m88391r("giftReceiveUserAvatar");
                vDraweeView2 = null;
            }
            ql3.m176987e(vDraweeView2, l6o0.m153068c(livingUser).f130275b, true);
        }
        VDraweeView vDraweeView3 = this.giftReceiveUserAvatar;
        if (vDraweeView3 == null) {
            Intrinsics.m88391r("giftReceiveUserAvatar");
        } else {
            vDraweeView = vDraweeView3;
        }
        izs.m142868s("context_single_room", vDraweeView, l6o0.m153068c(livingUser).f130275b.avatar);
    }

    /* JADX INFO: renamed from: M */
    public final void m122766M(BLiveGiftItem giftItem) {
        VImage vImage = this.giftImageBgView;
        VText vText = null;
        if (vImage == null) {
            Intrinsics.m88391r("giftImageBgView");
            vImage = null;
        }
        m122762H(vImage);
        VDraweeView vDraweeView = this.giftImageAvatar;
        if (vDraweeView == null) {
            Intrinsics.m88391r("giftImageAvatar");
            vDraweeView = null;
        }
        izs.m142868s("context_single_room", vDraweeView, giftItem.url);
        VText vText2 = this.giftName;
        if (vText2 == null) {
            Intrinsics.m88391r("giftName");
            vText2 = null;
        }
        vText2.setText(giftItem.getLocalName());
        VText vText3 = this.giftCost;
        if (vText3 == null) {
            Intrinsics.m88391r("giftCost");
        } else {
            vText = vText3;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String strM209910t = xau.m209910t(R$string.f47777R4);
        strM209910t.getClass();
        vText.setText(String.format(strM209910t, Arrays.copyOf(new Object[]{Long.valueOf(giftItem.purchasePrice)}, 1)));
    }

    /* JADX INFO: renamed from: N */
    public final void m122767N() {
        VButton vButton = this.sendGiftButton;
        if (vButton == null) {
            Intrinsics.m88391r("sendGiftButton");
            vButton = null;
        }
        czq.m113347c(vButton, new Function1() { // from class: l.dv5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ev5.m122759F(this.f90909a, (View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public final void m122768O(nsv<User> livingUser, BLiveGiftItem giftItem) {
        m122767N();
        m122765L(livingUser);
        m122766M(giftItem);
    }

    /* JADX INFO: renamed from: P */
    public final void m122769P(@NotNull nsv<User> livingUser, @NotNull BLiveGiftItem giftItem) {
        livingUser.getClass();
        giftItem.getClass();
        m73017E();
        m122768O(livingUser, giftItem);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @Nullable
    public View inflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        return null;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(@Nullable View view) {
        super.mo73019m(view);
        if (view != null) {
            m122761K(view);
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@Nullable nv5 presenter) {
    }
}
