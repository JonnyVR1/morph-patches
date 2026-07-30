package p153l;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSweetCpInviteRecord;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\fJ\u001b\u0010\u0012\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010!\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\fR\"\u0010$\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010\fR\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R.\u0010=\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u000206058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR(\u0010M\u001a\b\u0012\u0004\u0012\u0002060F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L¨\u0006N"}, m88121d2 = {"Ll/wwo0;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/b0p0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/b0p0;)V", "Landroid/view/View;", "parent", "", p7f.LATITUDE_SOUTH, "(Landroid/view/View;)V", OMSTemplateModeType.view, "m", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceSweetCpInviteRecord;", "list", p7f.GPS_MEASUREMENT_INTERRUPTED, "(Ljava/util/List;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "k", "Landroidx/constraintlayout/widget/ConstraintLayout;", "M", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "Y", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "contentGroup", BLiveStormDanmakuGiftResourceType.f45292l, "Landroid/view/View;", "L", "()Landroid/view/View;", "X", "backView", "R", "d0", "spaceView", "Landroidx/recyclerview/widget/RecyclerView;", "n", "Landroidx/recyclerview/widget/RecyclerView;", "Q", "()Landroidx/recyclerview/widget/RecyclerView;", "c0", "(Landroidx/recyclerview/widget/RecyclerView;)V", "recordList", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "o", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "K", "()Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "W", "(Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;)V", "adapter", "Ll/z20;", "", "p", "Ll/z20;", "P", "()Ll/z20;", "b0", "(Ll/z20;)V", "operationAction", "Landroid/widget/LinearLayout;", "q", "Landroid/widget/LinearLayout;", "N", "()Landroid/widget/LinearLayout;", "Z", "(Landroid/widget/LinearLayout;)V", "empty", "Ll/y20;", "r", "Ll/y20;", BloodType.f39576O, "()Ll/y20;", "a0", "(Ll/y20;)V", "openUserCard", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class wwo0 extends LiveMenuDialogHolder<b0p0> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public ConstraintLayout contentGroup;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public View backView;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public View spaceView;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public RecyclerView recordList;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public LiveBaseAdapter adapter;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public z20<String, String> operationAction;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public LinearLayout empty;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public y20<String> openUserCard;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwo0(@NotNull Act act, @NotNull b0p0 b0p0Var) {
        super(yec0.f198786Ha, act, b0p0Var);
        act.getClass();
        b0p0Var.getClass();
    }

    /* JADX INFO: renamed from: G */
    public static void m208265G(wwo0 wwo0Var, String str, String str2) {
        if (Intrinsics.m88377d(str, "approve")) {
            b0p0 b0p0Var = (b0p0) wwo0Var.f48605b;
            str2.getClass();
            b0p0Var.m101333U3(str2);
        } else {
            b0p0 b0p0Var2 = (b0p0) wwo0Var.f48605b;
            str2.getClass();
            b0p0Var2.m101335W3(str2);
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m208266H(ArrayList arrayList, wwo0 wwo0Var, BLiveVoiceSweetCpInviteRecord bLiveVoiceSweetCpInviteRecord) {
        bLiveVoiceSweetCpInviteRecord.getClass();
        arrayList.add(new xwo0(bLiveVoiceSweetCpInviteRecord, wwo0Var.m208277P(), wwo0Var.m208276O()));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.oo2] */
    /* JADX INFO: renamed from: I */
    public static void m208267I(wwo0 wwo0Var, String str) {
        T t = wwo0Var.f48605b;
        ydn0.m215258k(t, ((b0p0) t).m213810E2().m168526j0(), str);
    }

    /* JADX INFO: renamed from: S */
    private final void m208269S(View parent) {
        View viewFindViewById = parent.findViewById(mdc0.f135892B);
        viewFindViewById.getClass();
        m208282X(viewFindViewById);
        View viewFindViewById2 = parent.findViewById(mdc0.f136114Z5);
        viewFindViewById2.getClass();
        m208288d0(viewFindViewById2);
        View viewFindViewById3 = parent.findViewById(mdc0.f136077V4);
        viewFindViewById3.getClass();
        m208287c0((RecyclerView) viewFindViewById3);
        View viewFindViewById4 = parent.findViewById(mdc0.f135920E0);
        viewFindViewById4.getClass();
        m208283Y((ConstraintLayout) viewFindViewById4);
        View viewFindViewById5 = parent.findViewById(mdc0.f136247n1);
        viewFindViewById5.getClass();
        m208284Z((LinearLayout) viewFindViewById5);
        m208281W(new LiveBaseAdapter());
        RecyclerView recyclerViewM208278Q = m208278Q();
        recyclerViewM208278Q.setAdapter(m208272K());
        recyclerViewM208278Q.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        bnl0.m105509E0(m208273L(), new View.OnClickListener() { // from class: l.rwo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wwo0.m208270T(this.f165209a, view);
            }
        });
        bnl0.m105509E0(m208279R(), new View.OnClickListener() { // from class: l.swo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wwo0.m208271U(this.f170984a, view);
            }
        });
        m208286b0(new z20() { // from class: l.two0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                wwo0.m208265G(this.f176414a, (String) obj, (String) obj2);
            }
        });
        m208285a0(new y20() { // from class: l.uwo0
            @Override // p153l.y20
            public final void call(Object obj) {
                wwo0.m208267I(this.f181313a, (String) obj);
            }
        });
        bnl0.m105505C0(m208274M(), (int) (((double) qa00.m175858c().heightPixels) * 0.63d));
    }

    /* JADX INFO: renamed from: T */
    public static final void m208270T(wwo0 wwo0Var, View view) {
        wwo0Var.mo73021p();
    }

    /* JADX INFO: renamed from: U */
    public static final void m208271U(wwo0 wwo0Var, View view) {
        wwo0Var.mo73021p();
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final LiveBaseAdapter m208272K() {
        LiveBaseAdapter liveBaseAdapter = this.adapter;
        if (liveBaseAdapter != null) {
            return liveBaseAdapter;
        }
        Intrinsics.m88391r("adapter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final View m208273L() {
        View view = this.backView;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("backView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final ConstraintLayout m208274M() {
        ConstraintLayout constraintLayout = this.contentGroup;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("contentGroup");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final LinearLayout m208275N() {
        LinearLayout linearLayout = this.empty;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final y20<String> m208276O() {
        y20<String> y20Var = this.openUserCard;
        if (y20Var != null) {
            return y20Var;
        }
        Intrinsics.m88391r("openUserCard");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final z20<String, String> m208277P() {
        z20<String, String> z20Var = this.operationAction;
        if (z20Var != null) {
            return z20Var;
        }
        Intrinsics.m88391r("operationAction");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final RecyclerView m208278Q() {
        RecyclerView recyclerView = this.recordList;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.m88391r("recordList");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final View m208279R() {
        View view = this.spaceView;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("spaceView");
        return null;
    }

    /* JADX INFO: renamed from: V */
    public final void m208280V(@NotNull List<? extends BLiveVoiceSweetCpInviteRecord> list) {
        list.getClass();
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(list, new y20() { // from class: l.vwo0
            @Override // p153l.y20
            public final void call(Object obj) {
                wwo0.m208266H(arrayList, this, (BLiveVoiceSweetCpInviteRecord) obj);
            }
        });
        if (jyb.m147479J(arrayList)) {
            bnl0.m105524M(m208275N(), true);
            bnl0.m105524M(m208278Q(), false);
        } else {
            bnl0.m105524M(m208275N(), false);
            bnl0.m105524M(m208278Q(), true);
            m208272K().m68554Z(arrayList);
            m208272K().notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m208281W(@NotNull LiveBaseAdapter liveBaseAdapter) {
        liveBaseAdapter.getClass();
        this.adapter = liveBaseAdapter;
    }

    /* JADX INFO: renamed from: X */
    public final void m208282X(@NotNull View view) {
        view.getClass();
        this.backView = view;
    }

    /* JADX INFO: renamed from: Y */
    public final void m208283Y(@NotNull ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        this.contentGroup = constraintLayout;
    }

    /* JADX INFO: renamed from: Z */
    public final void m208284Z(@NotNull LinearLayout linearLayout) {
        linearLayout.getClass();
        this.empty = linearLayout;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m208285a0(@NotNull y20<String> y20Var) {
        y20Var.getClass();
        this.openUserCard = y20Var;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m208286b0(@NotNull z20<String, String> z20Var) {
        z20Var.getClass();
        this.operationAction = z20Var;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m208287c0(@NotNull RecyclerView recyclerView) {
        recyclerView.getClass();
        this.recordList = recyclerView;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m208288d0(@NotNull View view) {
        view.getClass();
        this.spaceView = view;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(@NotNull View view) {
        view.getClass();
        super.mo73019m(view);
        m208269S(view);
    }
}
