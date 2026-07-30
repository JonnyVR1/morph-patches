package p009l;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p1.mobile.putong.live.base.data.BLiveVoiceSweetCpInviteRecord;
import com.p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.e30;
import l.f30;
import l.g5c0;
import l.t100;
import l.t6c0;
import l.u4n0;
import l.vwb;
import l.x6s;
import l.xdl0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\fJ\u001b\u0010\u0012\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010!\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\fR\"\u0010$\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010\fR\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R.\u0010=\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u000206058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR(\u0010M\u001a\b\u0012\u0004\u0012\u0002060F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L¨\u0006N"}, d2 = {"Ll/sno0;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/xqo0;", "Lcom/p1/mobile/android/app/Act;", "act", "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/xqo0;)V", "Landroid/view/View;", "parent", "", "S", "(Landroid/view/View;)V", "view", "m", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceSweetCpInviteRecord;", "list", "V", "(Ljava/util/List;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "k", "Landroidx/constraintlayout/widget/ConstraintLayout;", "M", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "Y", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "contentGroup", "l", "Landroid/view/View;", "L", "()Landroid/view/View;", "X", "backView", "R", "d0", "spaceView", "Landroidx/recyclerview/widget/RecyclerView;", "n", "Landroidx/recyclerview/widget/RecyclerView;", "Q", "()Landroidx/recyclerview/widget/RecyclerView;", "c0", "(Landroidx/recyclerview/widget/RecyclerView;)V", "recordList", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "o", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "K", "()Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "W", "(Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;)V", "adapter", "Ll/f30;", "", "p", "Ll/f30;", "P", "()Ll/f30;", "b0", "(Ll/f30;)V", "operationAction", "Landroid/widget/LinearLayout;", "q", "Landroid/widget/LinearLayout;", "N", "()Landroid/widget/LinearLayout;", "Z", "(Landroid/widget/LinearLayout;)V", "empty", "Ll/e30;", "r", "Ll/e30;", "O", "()Ll/e30;", "a0", "(Ll/e30;)V", "openUserCard", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class sno0 extends LiveMenuDialogHolder<xqo0> {

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
    public f30<String, String> operationAction;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public LinearLayout empty;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public e30<String> openUserCard;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sno0(@NotNull Act act, @NotNull xqo0 xqo0Var) {
        super(t6c0.Ha, act, xqo0Var);
        act.getClass();
        xqo0Var.getClass();
    }

    /* JADX INFO: renamed from: G */
    public static void m22319G(sno0 sno0Var, String str, String str2) {
        if (Intrinsics.d(str, "approve")) {
            xqo0 xqo0Var = (xqo0) ((LiveMenuDialogHolder) sno0Var).b;
            str2.getClass();
            xqo0Var.m24963U3(str2);
        } else {
            xqo0 xqo0Var2 = (xqo0) ((LiveMenuDialogHolder) sno0Var).b;
            str2.getClass();
            xqo0Var2.m24965W3(str2);
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m22320H(ArrayList arrayList, sno0 sno0Var, BLiveVoiceSweetCpInviteRecord bLiveVoiceSweetCpInviteRecord) {
        bLiveVoiceSweetCpInviteRecord.getClass();
        arrayList.add(new tno0(bLiveVoiceSweetCpInviteRecord, sno0Var.m22331P(), sno0Var.m22330O()));
    }

    /* JADX INFO: renamed from: I */
    public static void m22321I(sno0 sno0Var, String str) {
        x6s x6sVar = ((LiveMenuDialogHolder) sno0Var).b;
        u4n0.k(x6sVar, ((xqo0) x6sVar).E2().j0(), str);
    }

    /* JADX INFO: renamed from: S */
    private final void m22323S(View parent) {
        View viewFindViewById = parent.findViewById(g5c0.B);
        viewFindViewById.getClass();
        m22336X(viewFindViewById);
        View viewFindViewById2 = parent.findViewById(g5c0.Z5);
        viewFindViewById2.getClass();
        m22342d0(viewFindViewById2);
        View viewFindViewById3 = parent.findViewById(g5c0.V4);
        viewFindViewById3.getClass();
        m22341c0((RecyclerView) viewFindViewById3);
        View viewFindViewById4 = parent.findViewById(g5c0.E0);
        viewFindViewById4.getClass();
        m22337Y((ConstraintLayout) viewFindViewById4);
        View viewFindViewById5 = parent.findViewById(g5c0.n1);
        viewFindViewById5.getClass();
        m22338Z((LinearLayout) viewFindViewById5);
        m22335W(new LiveBaseAdapter());
        RecyclerView recyclerViewM22332Q = m22332Q();
        recyclerViewM22332Q.setAdapter(m22326K());
        recyclerViewM22332Q.setLayoutManager(new LinearLayoutManager(C0(), 1, false));
        xdl0.E0(m22327L(), new View.OnClickListener() { // from class: l.nno0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sno0.m22324T(this.f17584a, view);
            }
        });
        xdl0.E0(m22333R(), new View.OnClickListener() { // from class: l.ono0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sno0.m22325U(this.f18186a, view);
            }
        });
        m22340b0(new f30() { // from class: l.pno0
            public final void call(Object obj, Object obj2) {
                sno0.m22319G(this.f18795a, (String) obj, (String) obj2);
            }
        });
        m22339a0(new e30() { // from class: l.qno0
            public final void call(Object obj) {
                sno0.m22321I(this.f19392a, (String) obj);
            }
        });
        xdl0.C0(m22328M(), (int) (((double) t100.c().heightPixels) * 0.63d));
    }

    /* JADX INFO: renamed from: T */
    public static final void m22324T(sno0 sno0Var, View view) {
        sno0Var.p();
    }

    /* JADX INFO: renamed from: U */
    public static final void m22325U(sno0 sno0Var, View view) {
        sno0Var.p();
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final LiveBaseAdapter m22326K() {
        LiveBaseAdapter liveBaseAdapter = this.adapter;
        if (liveBaseAdapter != null) {
            return liveBaseAdapter;
        }
        Intrinsics.r("adapter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final View m22327L() {
        View view = this.backView;
        if (view != null) {
            return view;
        }
        Intrinsics.r("backView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final ConstraintLayout m22328M() {
        ConstraintLayout constraintLayout = this.contentGroup;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.r("contentGroup");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final LinearLayout m22329N() {
        LinearLayout linearLayout = this.empty;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final e30<String> m22330O() {
        e30<String> e30Var = this.openUserCard;
        if (e30Var != null) {
            return e30Var;
        }
        Intrinsics.r("openUserCard");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final f30<String, String> m22331P() {
        f30<String, String> f30Var = this.operationAction;
        if (f30Var != null) {
            return f30Var;
        }
        Intrinsics.r("operationAction");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final RecyclerView m22332Q() {
        RecyclerView recyclerView = this.recordList;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.r("recordList");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final View m22333R() {
        View view = this.spaceView;
        if (view != null) {
            return view;
        }
        Intrinsics.r("spaceView");
        return null;
    }

    /* JADX INFO: renamed from: V */
    public final void m22334V(@NotNull List<? extends BLiveVoiceSweetCpInviteRecord> list) {
        list.getClass();
        final ArrayList arrayList = new ArrayList();
        vwb.z(list, new e30() { // from class: l.rno0
            public final void call(Object obj) {
                sno0.m22320H(arrayList, this, (BLiveVoiceSweetCpInviteRecord) obj);
            }
        });
        if (vwb.J(arrayList)) {
            xdl0.M(m22329N(), true);
            xdl0.M(m22332Q(), false);
        } else {
            xdl0.M(m22329N(), false);
            xdl0.M(m22332Q(), true);
            m22326K().Z(arrayList);
            m22326K().notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m22335W(@NotNull LiveBaseAdapter liveBaseAdapter) {
        liveBaseAdapter.getClass();
        this.adapter = liveBaseAdapter;
    }

    /* JADX INFO: renamed from: X */
    public final void m22336X(@NotNull View view) {
        view.getClass();
        this.backView = view;
    }

    /* JADX INFO: renamed from: Y */
    public final void m22337Y(@NotNull ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        this.contentGroup = constraintLayout;
    }

    /* JADX INFO: renamed from: Z */
    public final void m22338Z(@NotNull LinearLayout linearLayout) {
        linearLayout.getClass();
        this.empty = linearLayout;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m22339a0(@NotNull e30<String> e30Var) {
        e30Var.getClass();
        this.openUserCard = e30Var;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m22340b0(@NotNull f30<String, String> f30Var) {
        f30Var.getClass();
        this.operationAction = f30Var;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m22341c0(@NotNull RecyclerView recyclerView) {
        recyclerView.getClass();
        this.recordList = recyclerView;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m22342d0(@NotNull View view) {
        view.getClass();
        this.spaceView = view;
    }

    /* JADX INFO: renamed from: m */
    public void m22343m(@NotNull View view) {
        view.getClass();
        super.m(view);
        m22323S(view);
    }
}
