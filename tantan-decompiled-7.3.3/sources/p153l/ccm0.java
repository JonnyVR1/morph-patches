package p153l;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPics;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0013\u0010\fJ\u001b\u0010\u0017\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u000eJ\u001d\u0010\u001b\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u0018J5\u0010 \u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e0\u001dj\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e`\u001f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u001aH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, m88121d2 = {"Ll/ccm0;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/icm0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/icm0;)V", "Landroid/view/View;", "parentView", "", "N", "(Landroid/view/View;)V", "M", "()V", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", OMSTemplateModeType.view, "m", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceBackGroundPics;", "picList", p7f.GPS_DIRECTION_TRUE, "(Ljava/util/List;)V", BloodType.f39576O, "", p7f.LATITUDE_SOUTH, "bgList", "Ljava/util/ArrayList;", "Ll/d3q;", "Lkotlin/collections/ArrayList;", "K", "(Ljava/util/List;)Ljava/util/ArrayList;", "Ll/btm0;", "tempPicItemModel", "R", "(Ll/btm0;)V", "Lv/VRecyclerView;", "k", "Lv/VRecyclerView;", "picRecyclerView", "Landroid/widget/Button;", BLiveStormDanmakuGiftResourceType.f45292l, "Landroid/widget/Button;", "confirmButton", "Ll/btm0;", "selectedPicItemModel", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "n", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "picAdapter", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ccm0 extends LiveMenuDialogHolder<icm0> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VRecyclerView picRecyclerView;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public Button confirmButton;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public btm0 selectedPicItemModel;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final LiveBaseAdapter picAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccm0(@NotNull Act act, @NotNull icm0 icm0Var) {
        super(yec0.f198782H6, act, icm0Var);
        act.getClass();
        icm0Var.getClass();
        this.picAdapter = new LiveBaseAdapter();
    }

    /* JADX INFO: renamed from: H */
    public static Unit m108715H(ccm0 ccm0Var, View view) {
        view.getClass();
        ccm0Var.m108719M();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J */
    public static Unit m108717J(ccm0 ccm0Var, View view) {
        view.getClass();
        if (ccm0Var.selectedPicItemModel == null) {
            o1j0.m165649w(R$string.f48465wk);
            return Unit.INSTANCE;
        }
        ccm0Var.m108724O();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L */
    public static final void m108718L(ccm0 ccm0Var, btm0 btm0Var, View view) {
        ccm0Var.m108725R(btm0Var);
    }

    /* JADX INFO: renamed from: M */
    private final void m108719M() {
        this.selectedPicItemModel = null;
        List<d3q<?>> listM68538J = this.picAdapter.m68538J();
        if (listM68538J != null) {
            listM68538J.clear();
        }
        mo73021p();
    }

    /* JADX INFO: renamed from: N */
    private final void m108720N(View parentView) {
        View viewFindViewById = parentView.findViewById(mdc0.f135946H);
        viewFindViewById.getClass();
        this.picRecyclerView = (VRecyclerView) viewFindViewById;
        View viewFindViewById2 = parentView.findViewById(mdc0.f135884A0);
        viewFindViewById2.getClass();
        this.confirmButton = (Button) viewFindViewById2;
        View viewFindViewById3 = parentView.findViewById(mdc0.f135991M);
        viewFindViewById3.getClass();
        czq.m113347c(viewFindViewById3, new Function1() { // from class: l.ybm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ccm0.m108715H(this.f198347a, (View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public static final Unit m108721P(ccm0 ccm0Var) {
        ccm0Var.m108719M();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q */
    public static final Unit m108722Q(Throwable th) {
        th.getClass();
        o1j0.m165651y(th.getMessage());
        return Unit.INSTANCE;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        Act act = ((icm0) this.f48605b).act();
        act.getClass();
        return act;
    }

    /* JADX INFO: renamed from: K */
    public final ArrayList<d3q<?>> m108723K(List<? extends BLiveVoiceBackGroundPics> bgList) {
        ArrayList<d3q<?>> arrayList = new ArrayList<>(bgList.size());
        boolean z = false;
        int i = 0;
        for (Object obj : bgList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics = (BLiveVoiceBackGroundPics) obj;
            final btm0 btm0Var = new btm0(new pcp0(bLiveVoiceBackGroundPics, false, i));
            btm0Var.mo113881A(new View.OnClickListener() { // from class: l.zbm0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ccm0.m108718L(this.f203685a, btm0Var, view);
                }
            });
            arrayList.add(btm0Var);
            if (bLiveVoiceBackGroundPics.check) {
                btm0Var.getVoiceVirtualBgPicData().m171699d(true);
                this.selectedPicItemModel = btm0Var;
                z = true;
            }
            i = i2;
        }
        if (!z && (arrayList.get(0) instanceof btm0)) {
            d3q<?> d3qVar = arrayList.get(0);
            d3qVar.getClass();
            btm0 btm0Var2 = (btm0) d3qVar;
            btm0Var2.getVoiceVirtualBgPicData().m171699d(true);
            this.selectedPicItemModel = btm0Var2;
        }
        arrayList.add(new ocp0());
        return arrayList;
    }

    /* JADX INFO: renamed from: O */
    public final void m108724O() {
        btm0 btm0Var = this.selectedPicItemModel;
        if (btm0Var != null) {
            ((icm0) this.f48605b).m139455X3(btm0Var.getVoiceVirtualBgPicData(), new Function0() { // from class: l.acm0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ccm0.m108721P(this.f69723a);
                }
            }, new Function1() { // from class: l.bcm0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ccm0.m108722Q((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m108725R(btm0 tempPicItemModel) {
        btm0 btm0Var = this.selectedPicItemModel;
        if (btm0Var == null) {
            this.selectedPicItemModel = tempPicItemModel;
            tempPicItemModel.getVoiceVirtualBgPicData().m171699d(true);
            this.picAdapter.m68543O(tempPicItemModel);
        } else {
            if (Intrinsics.m88377d(btm0Var, tempPicItemModel)) {
                return;
            }
            btm0 btm0Var2 = this.selectedPicItemModel;
            if (btm0Var2 != null) {
                btm0Var2.getVoiceVirtualBgPicData().m171699d(false);
                this.picAdapter.m68543O(btm0Var2);
            }
            tempPicItemModel.getVoiceVirtualBgPicData().m171699d(true);
            this.picAdapter.m68543O(tempPicItemModel);
            this.selectedPicItemModel = tempPicItemModel;
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m108726S(List<? extends BLiveVoiceBackGroundPics> picList) {
        VRecyclerView vRecyclerView = this.picRecyclerView;
        if (vRecyclerView == null) {
            Intrinsics.m88391r("picRecyclerView");
            vRecyclerView = null;
        }
        vRecyclerView.setLayoutManager(new GridLayoutManager(vRecyclerView.getContext(), 3));
        vRecyclerView.setAdapter(this.picAdapter);
        LiveBaseAdapter liveBaseAdapter = this.picAdapter;
        liveBaseAdapter.m68554Z(m108723K(picList));
        liveBaseAdapter.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: T */
    public final void m108727T(@NotNull List<BLiveVoiceBackGroundPics> picList) {
        picList.getClass();
        m73017E();
        m108726S(picList);
        Button button = this.confirmButton;
        if (button == null) {
            Intrinsics.m88391r("confirmButton");
            button = null;
        }
        czq.m113347c(button, new Function1() { // from class: l.xbm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ccm0.m108717J(this.f193174a, (View) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(@NotNull View view) {
        view.getClass();
        super.mo73019m(view);
        m108720N(view);
    }
}
