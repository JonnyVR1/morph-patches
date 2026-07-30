package p149l;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSweetCpInviteRecord;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\fJ\u001b\u0010\u0012\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010!\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\fR\"\u0010$\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010\fR\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R.\u0010=\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u000206058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR(\u0010M\u001a\b\u0012\u0004\u0012\u0002060F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L¨\u0006N"}, m87232d2 = {"Ll/sno0;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/xqo0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/xqo0;)V", "Landroid/view/View;", "parent", "", j6f.LATITUDE_SOUTH, "(Landroid/view/View;)V", OMSTemplateModeType.view, "m", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceSweetCpInviteRecord;", "list", j6f.GPS_MEASUREMENT_INTERRUPTED, "(Ljava/util/List;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "k", "Landroidx/constraintlayout/widget/ConstraintLayout;", "M", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "Y", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "contentGroup", BLiveStormDanmakuGiftResourceType.f44444l, "Landroid/view/View;", "L", "()Landroid/view/View;", "X", "backView", "R", "d0", "spaceView", "Landroidx/recyclerview/widget/RecyclerView;", "n", "Landroidx/recyclerview/widget/RecyclerView;", "Q", "()Landroidx/recyclerview/widget/RecyclerView;", "c0", "(Landroidx/recyclerview/widget/RecyclerView;)V", "recordList", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "o", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "K", "()Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "W", "(Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;)V", "adapter", "Ll/f30;", "", "p", "Ll/f30;", "P", "()Ll/f30;", "b0", "(Ll/f30;)V", "operationAction", "Landroid/widget/LinearLayout;", "q", "Landroid/widget/LinearLayout;", "N", "()Landroid/widget/LinearLayout;", "Z", "(Landroid/widget/LinearLayout;)V", "empty", "Ll/e30;", "r", "Ll/e30;", BloodType.f38728O, "()Ll/e30;", "a0", "(Ll/e30;)V", "openUserCard", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
        super(t6c0.f168054Ha, act, xqo0Var);
        act.getClass();
        xqo0Var.getClass();
    }

    /* JADX INFO: renamed from: G */
    public static void m185166G(sno0 sno0Var, String str, String str2) {
        if (Intrinsics.m87488d(str, "approve")) {
            xqo0 xqo0Var = (xqo0) sno0Var.f47757b;
            str2.getClass();
            xqo0Var.m210587U3(str2);
        } else {
            xqo0 xqo0Var2 = (xqo0) sno0Var.f47757b;
            str2.getClass();
            xqo0Var2.m210589W3(str2);
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m185167H(ArrayList arrayList, sno0 sno0Var, BLiveVoiceSweetCpInviteRecord bLiveVoiceSweetCpInviteRecord) {
        bLiveVoiceSweetCpInviteRecord.getClass();
        arrayList.add(new tno0(bLiveVoiceSweetCpInviteRecord, sno0Var.m185178P(), sno0Var.m185177O()));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2] */
    /* JADX INFO: renamed from: I */
    public static void m185168I(sno0 sno0Var, String str) {
        T t = sno0Var.f47757b;
        u4n0.m191752k(t, ((xqo0) t).m206027E2().m132140j0(), str);
    }

    /* JADX INFO: renamed from: S */
    private final void m185170S(View parent) {
        View viewFindViewById = parent.findViewById(g5c0.f100647B);
        viewFindViewById.getClass();
        m185183X(viewFindViewById);
        View viewFindViewById2 = parent.findViewById(g5c0.f100869Z5);
        viewFindViewById2.getClass();
        m185189d0(viewFindViewById2);
        View viewFindViewById3 = parent.findViewById(g5c0.f100832V4);
        viewFindViewById3.getClass();
        m185188c0((RecyclerView) viewFindViewById3);
        View viewFindViewById4 = parent.findViewById(g5c0.f100675E0);
        viewFindViewById4.getClass();
        m185184Y((ConstraintLayout) viewFindViewById4);
        View viewFindViewById5 = parent.findViewById(g5c0.f101002n1);
        viewFindViewById5.getClass();
        m185185Z((LinearLayout) viewFindViewById5);
        m185182W(new LiveBaseAdapter());
        RecyclerView recyclerViewM185179Q = m185179Q();
        recyclerViewM185179Q.setAdapter(m185173K());
        recyclerViewM185179Q.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        xdl0.m208329E0(m185174L(), new View.OnClickListener() { // from class: l.nno0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sno0.m185171T(this.f139761a, view);
            }
        });
        xdl0.m208329E0(m185180R(), new View.OnClickListener() { // from class: l.ono0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sno0.m185172U(this.f144807a, view);
            }
        });
        m185187b0(new f30() { // from class: l.pno0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                sno0.m185166G(this.f150407a, (String) obj, (String) obj2);
            }
        });
        m185186a0(new e30() { // from class: l.qno0
            @Override // p149l.e30
            public final void call(Object obj) {
                sno0.m185168I(this.f155486a, (String) obj);
            }
        });
        xdl0.m208325C0(m185175M(), (int) (((double) t100.m186889c().heightPixels) * 0.63d));
    }

    /* JADX INFO: renamed from: T */
    public static final void m185171T(sno0 sno0Var, View view) {
        sno0Var.mo71838p();
    }

    /* JADX INFO: renamed from: U */
    public static final void m185172U(sno0 sno0Var, View view) {
        sno0Var.mo71838p();
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final LiveBaseAdapter m185173K() {
        LiveBaseAdapter liveBaseAdapter = this.adapter;
        if (liveBaseAdapter != null) {
            return liveBaseAdapter;
        }
        Intrinsics.m87502r("adapter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final View m185174L() {
        View view = this.backView;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("backView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final ConstraintLayout m185175M() {
        ConstraintLayout constraintLayout = this.contentGroup;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("contentGroup");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final LinearLayout m185176N() {
        LinearLayout linearLayout = this.empty;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final e30<String> m185177O() {
        e30<String> e30Var = this.openUserCard;
        if (e30Var != null) {
            return e30Var;
        }
        Intrinsics.m87502r("openUserCard");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final f30<String, String> m185178P() {
        f30<String, String> f30Var = this.operationAction;
        if (f30Var != null) {
            return f30Var;
        }
        Intrinsics.m87502r("operationAction");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final RecyclerView m185179Q() {
        RecyclerView recyclerView = this.recordList;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.m87502r("recordList");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final View m185180R() {
        View view = this.spaceView;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("spaceView");
        return null;
    }

    /* JADX INFO: renamed from: V */
    public final void m185181V(@NotNull List<? extends BLiveVoiceSweetCpInviteRecord> list) {
        list.getClass();
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(list, new e30() { // from class: l.rno0
            @Override // p149l.e30
            public final void call(Object obj) {
                sno0.m185167H(arrayList, this, (BLiveVoiceSweetCpInviteRecord) obj);
            }
        });
        if (vwb.m200296J(arrayList)) {
            xdl0.m208344M(m185176N(), true);
            xdl0.m208344M(m185179Q(), false);
        } else {
            xdl0.m208344M(m185176N(), false);
            xdl0.m208344M(m185179Q(), true);
            m185173K().m67371Z(arrayList);
            m185173K().notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m185182W(@NotNull LiveBaseAdapter liveBaseAdapter) {
        liveBaseAdapter.getClass();
        this.adapter = liveBaseAdapter;
    }

    /* JADX INFO: renamed from: X */
    public final void m185183X(@NotNull View view) {
        view.getClass();
        this.backView = view;
    }

    /* JADX INFO: renamed from: Y */
    public final void m185184Y(@NotNull ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        this.contentGroup = constraintLayout;
    }

    /* JADX INFO: renamed from: Z */
    public final void m185185Z(@NotNull LinearLayout linearLayout) {
        linearLayout.getClass();
        this.empty = linearLayout;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m185186a0(@NotNull e30<String> e30Var) {
        e30Var.getClass();
        this.openUserCard = e30Var;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m185187b0(@NotNull f30<String, String> f30Var) {
        f30Var.getClass();
        this.operationAction = f30Var;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m185188c0(@NotNull RecyclerView recyclerView) {
        recyclerView.getClass();
        this.recordList = recyclerView;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m185189d0(@NotNull View view) {
        view.getClass();
        this.spaceView = view;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(@NotNull View view) {
        view.getClass();
        super.mo71836m(view);
        m185170S(view);
    }
}
