package p149l;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPics;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
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
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0013\u0010\fJ\u001b\u0010\u0017\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u000eJ\u001d\u0010\u001b\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u0018J5\u0010 \u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e0\u001dj\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e`\u001f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u001aH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, m87232d2 = {"Ll/y2m0;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/e3m0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/e3m0;)V", "Landroid/view/View;", "parentView", "", "N", "(Landroid/view/View;)V", "M", "()V", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", OMSTemplateModeType.view, "m", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceBackGroundPics;", "picList", j6f.GPS_DIRECTION_TRUE, "(Ljava/util/List;)V", BloodType.f38728O, "", j6f.LATITUDE_SOUTH, "bgList", "Ljava/util/ArrayList;", "Ll/d1q;", "Lkotlin/collections/ArrayList;", "K", "(Ljava/util/List;)Ljava/util/ArrayList;", "Ll/xjm0;", "tempPicItemModel", "R", "(Ll/xjm0;)V", "Lv/VRecyclerView;", "k", "Lv/VRecyclerView;", "picRecyclerView", "Landroid/widget/Button;", BLiveStormDanmakuGiftResourceType.f44444l, "Landroid/widget/Button;", "confirmButton", "Ll/xjm0;", "selectedPicItemModel", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "n", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "picAdapter", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class y2m0 extends LiveMenuDialogHolder<e3m0> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VRecyclerView picRecyclerView;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public Button confirmButton;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public xjm0 selectedPicItemModel;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final LiveBaseAdapter picAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2m0(@NotNull Act act, @NotNull e3m0 e3m0Var) {
        super(t6c0.f168050H6, act, e3m0Var);
        act.getClass();
        e3m0Var.getClass();
        this.picAdapter = new LiveBaseAdapter();
    }

    /* JADX INFO: renamed from: H */
    public static Unit m212383H(y2m0 y2m0Var, View view) {
        view.getClass();
        y2m0Var.m212387M();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J */
    public static Unit m212385J(y2m0 y2m0Var, View view) {
        view.getClass();
        if (y2m0Var.selectedPicItemModel == null) {
            lsi0.m151593w(R$string.f47617wk);
            return Unit.INSTANCE;
        }
        y2m0Var.m212392O();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L */
    public static final void m212386L(y2m0 y2m0Var, xjm0 xjm0Var, View view) {
        y2m0Var.m212393R(xjm0Var);
    }

    /* JADX INFO: renamed from: M */
    private final void m212387M() {
        this.selectedPicItemModel = null;
        List<d1q<?>> listM67355J = this.picAdapter.m67355J();
        if (listM67355J != null) {
            listM67355J.clear();
        }
        mo71838p();
    }

    /* JADX INFO: renamed from: N */
    private final void m212388N(View parentView) {
        View viewFindViewById = parentView.findViewById(g5c0.f100701H);
        viewFindViewById.getClass();
        this.picRecyclerView = (VRecyclerView) viewFindViewById;
        View viewFindViewById2 = parentView.findViewById(g5c0.f100639A0);
        viewFindViewById2.getClass();
        this.confirmButton = (Button) viewFindViewById2;
        View viewFindViewById3 = parentView.findViewById(g5c0.f100746M);
        viewFindViewById3.getClass();
        cxq.m109105c(viewFindViewById3, new Function1() { // from class: l.u2m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y2m0.m212383H(this.f173503a, (View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public static final Unit m212389P(y2m0 y2m0Var) {
        y2m0Var.m212387M();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q */
    public static final Unit m212390Q(Throwable th) {
        th.getClass();
        lsi0.m151595y(th.getMessage());
        return Unit.INSTANCE;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        Act act = ((e3m0) this.f47757b).act();
        act.getClass();
        return act;
    }

    /* JADX INFO: renamed from: K */
    public final ArrayList<d1q<?>> m212391K(List<? extends BLiveVoiceBackGroundPics> bgList) {
        ArrayList<d1q<?>> arrayList = new ArrayList<>(bgList.size());
        boolean z = false;
        int i = 0;
        for (Object obj : bgList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics = (BLiveVoiceBackGroundPics) obj;
            final xjm0 xjm0Var = new xjm0(new l3p0(bLiveVoiceBackGroundPics, false, i));
            xjm0Var.mo109662A(new View.OnClickListener() { // from class: l.v2m0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    y2m0.m212386L(this.f179585a, xjm0Var, view);
                }
            });
            arrayList.add(xjm0Var);
            if (bLiveVoiceBackGroundPics.check) {
                xjm0Var.getVoiceVirtualBgPicData().m148406d(true);
                this.selectedPicItemModel = xjm0Var;
                z = true;
            }
            i = i2;
        }
        if (!z && (arrayList.get(0) instanceof xjm0)) {
            d1q<?> d1qVar = arrayList.get(0);
            d1qVar.getClass();
            xjm0 xjm0Var2 = (xjm0) d1qVar;
            xjm0Var2.getVoiceVirtualBgPicData().m148406d(true);
            this.selectedPicItemModel = xjm0Var2;
        }
        arrayList.add(new k3p0());
        return arrayList;
    }

    /* JADX INFO: renamed from: O */
    public final void m212392O() {
        xjm0 xjm0Var = this.selectedPicItemModel;
        if (xjm0Var != null) {
            ((e3m0) this.f47757b).m114622X3(xjm0Var.getVoiceVirtualBgPicData(), new Function0() { // from class: l.w2m0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return y2m0.m212389P(this.f184257a);
                }
            }, new Function1() { // from class: l.x2m0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return y2m0.m212390Q((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m212393R(xjm0 tempPicItemModel) {
        xjm0 xjm0Var = this.selectedPicItemModel;
        if (xjm0Var == null) {
            this.selectedPicItemModel = tempPicItemModel;
            tempPicItemModel.getVoiceVirtualBgPicData().m148406d(true);
            this.picAdapter.m67360O(tempPicItemModel);
        } else {
            if (Intrinsics.m87488d(xjm0Var, tempPicItemModel)) {
                return;
            }
            xjm0 xjm0Var2 = this.selectedPicItemModel;
            if (xjm0Var2 != null) {
                xjm0Var2.getVoiceVirtualBgPicData().m148406d(false);
                this.picAdapter.m67360O(xjm0Var2);
            }
            tempPicItemModel.getVoiceVirtualBgPicData().m148406d(true);
            this.picAdapter.m67360O(tempPicItemModel);
            this.selectedPicItemModel = tempPicItemModel;
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m212394S(List<? extends BLiveVoiceBackGroundPics> picList) {
        VRecyclerView vRecyclerView = this.picRecyclerView;
        if (vRecyclerView == null) {
            Intrinsics.m87502r("picRecyclerView");
            vRecyclerView = null;
        }
        vRecyclerView.setLayoutManager(new GridLayoutManager(vRecyclerView.getContext(), 3));
        vRecyclerView.setAdapter(this.picAdapter);
        LiveBaseAdapter liveBaseAdapter = this.picAdapter;
        liveBaseAdapter.m67371Z(m212391K(picList));
        liveBaseAdapter.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: T */
    public final void m212395T(@NotNull List<BLiveVoiceBackGroundPics> picList) {
        picList.getClass();
        m71834E();
        m212394S(picList);
        Button button = this.confirmButton;
        if (button == null) {
            Intrinsics.m87502r("confirmButton");
            button = null;
        }
        cxq.m109105c(button, new Function1() { // from class: l.t2m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y2m0.m212385J(this.f167519a, (View) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(@NotNull View view) {
        view.getClass();
        super.mo71836m(view);
        m212388N(view);
    }
}
