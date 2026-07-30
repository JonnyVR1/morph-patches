package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardHeaderView;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardMainlandItemView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ogl extends dac0<BLiveHourLeaderBoardItem> implements ViewTreeObserver.OnGlobalLayoutListener, qdt.InterfaceC19468b {

    /* JADX INFO: renamed from: f */
    public final dfl f143874f;

    /* JADX INFO: renamed from: g */
    public final qdt f143875g;

    /* JADX INFO: renamed from: h */
    public BLiveHourLeaderBoard f143876h;

    /* JADX INFO: renamed from: c */
    public final List<BLiveHourLeaderBoardItem> f143871c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final List<BLiveHourLeaderBoardItem> f143872d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final List<BLiveHourLeaderBoardItem> f143873e = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final Runnable f143877i = new Runnable() { // from class: l.lgl
        @Override // java.lang.Runnable
        public final void run() {
            this.f128001a.m164211O();
        }
    };

    public ogl(dfl dflVar) {
        this.f143874f = dflVar;
        qdt qdtVar = new qdt(true, dflVar.mo74921C(), new v9j() { // from class: l.mgl
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f133701a.m164212P();
            }
        }, 0.5f);
        this.f143875g = qdtVar;
        qdtVar.m174115s(this);
    }

    /* JADX INFO: renamed from: K */
    private void m164207K() {
        this.f143873e.addAll(this.f143871c);
        BLiveHourLeaderBoardItem bLiveHourLeaderBoardItemNew_ = BLiveHourLeaderBoardItem.new_();
        bLiveHourLeaderBoardItemNew_.isFooter = true;
        this.f143873e.add(bLiveHourLeaderBoardItemNew_);
        this.f143873e.removeAll(this.f143872d);
    }

    /* JADX INFO: renamed from: L */
    private void m164208L() {
        this.f143872d.addAll(this.f143871c.subList(0, Math.min(this.f143871c.size(), 3)));
    }

    /* JADX INFO: renamed from: M */
    private boolean m164209M(int i) {
        return i == getPageCount() - 1;
    }

    /* JADX INFO: renamed from: N */
    private boolean m164210N(int i) {
        return i == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m164211O() {
        m164207K();
        notifyItemRangeChanged(1, this.f143873e.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ Boolean m164212P() {
        return Boolean.valueOf(!vwb.m200296J(this.f143872d));
    }

    /* JADX INFO: renamed from: V */
    private void m164213V(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        zcu.m218095j(h7d0.m129655x().m129679r(bLiveHourLeaderBoardItem.liveId).m129668g(bLiveHourLeaderBoardItem.userId).m129682u(bLiveHourLeaderBoardItem.liveState.toString()).m129684w("e_hoursboard").m129674m(String.valueOf(bLiveHourLeaderBoardItem.rank)).m129681t(gar.m125011e(bLiveHourLeaderBoardItem)).m129662a(), this.f143874f.mo74922D());
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f143873e.size() + 1;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168352g2, viewGroup, false);
        }
        return i == 3 ? LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168391j2, viewGroup, false) : LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168417l2, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem, int i, int i2) {
        if (i == 1) {
            ((HourBoardHeaderView) view).m74846r0(this.f143872d, this.f143874f, this.f143876h);
        } else if (i == 2) {
            ((HourBoardMainlandItemView) view).m74856l0(bLiveHourLeaderBoardItem, this.f143874f, this.f143876h);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m164215I() {
        e51.m114745J(this.f143877i);
        this.f143871c.clear();
        this.f143872d.clear();
        this.f143873e.clear();
        notifyDataSetChanged();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public BLiveHourLeaderBoardItem getItem(int i) {
        if (m164210N(i)) {
            return null;
        }
        return this.f143873e.get(i - 1);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m164217Q(Integer num) {
        if (m164210N(num.intValue())) {
            Iterator<BLiveHourLeaderBoardItem> it = this.f143872d.iterator();
            while (it.hasNext()) {
                m164213V(it.next());
            }
        } else {
            if (m164209M(num.intValue())) {
                return;
            }
            m164213V(getItem(num.intValue()));
        }
    }

    /* JADX INFO: renamed from: R */
    public void m164218R() {
        this.f143875g.m174109m();
    }

    /* JADX INFO: renamed from: S */
    public void m164219S(boolean z) {
        if (z) {
            this.f143875g.m174117u();
        }
    }

    /* JADX INFO: renamed from: T */
    public void m164220T(BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        this.f143876h = bLiveHourLeaderBoard;
    }

    /* JADX INFO: renamed from: U */
    public void m164221U(List<BLiveHourLeaderBoardItem> list) {
        this.f143871c.clear();
        this.f143871c.addAll(list);
        m164208L();
        notifyDataSetChanged();
        if (list.isEmpty()) {
            return;
        }
        e51.m114745J(this.f143877i);
        e51.m114744I(this.f143874f.mo74921C(), this.f143877i, 1000L);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (m164210N(i)) {
            return 1;
        }
        return this.f143873e.get(i - 1).isFooter ? 3 : 2;
    }

    @Override // p149l.qdt.InterfaceC19468b
    /* JADX INFO: renamed from: m */
    public void mo102830m(List<Integer> list, boolean z) {
        vwb.m200354z(list, new e30() { // from class: l.ngl
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138883a.m164217Q((Integer) obj);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f143875g.m174107k(recyclerView);
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f143875g.m174119w();
        recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f143875g.m174118v();
    }
}
