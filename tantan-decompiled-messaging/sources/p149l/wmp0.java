package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.data.BLiveCurrentHourNotices;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardHeaderView;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardMainlandFooter;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainlandnew.WeekBoardMainlandItemView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class wmp0 extends dac0<BLiveHourLeaderBoardItem> implements ViewTreeObserver.OnGlobalLayoutListener, qdt.InterfaceC19468b {

    /* JADX INFO: renamed from: f */
    public final dfl f187087f;

    /* JADX INFO: renamed from: g */
    public final qdt f187088g;

    /* JADX INFO: renamed from: c */
    public final List<BLiveHourLeaderBoardItem> f187084c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final List<BLiveHourLeaderBoardItem> f187085d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final List<BLiveHourLeaderBoardItem> f187086e = new ArrayList();

    /* JADX INFO: renamed from: h */
    public boolean f187089h = true;

    /* JADX INFO: renamed from: i */
    public final Runnable f187090i = new Runnable() { // from class: l.tmp0
        @Override // java.lang.Runnable
        public final void run() {
            this.f171162a.m204002O();
        }
    };

    /* JADX INFO: renamed from: j */
    public List<BLiveCurrentHourNotices> f187091j = new ArrayList();

    public wmp0(dfl dflVar) {
        this.f187087f = dflVar;
        qdt qdtVar = new qdt(true, dflVar.mo74921C(), new v9j() { // from class: l.ump0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f177291a.m204003P();
            }
        }, 0.5f);
        this.f187088g = qdtVar;
        qdtVar.m174115s(this);
    }

    /* JADX INFO: renamed from: K */
    private void m203998K() {
        this.f187086e.addAll(this.f187084c);
        BLiveHourLeaderBoardItem bLiveHourLeaderBoardItemNew_ = BLiveHourLeaderBoardItem.new_();
        bLiveHourLeaderBoardItemNew_.isFooter = true;
        this.f187086e.add(bLiveHourLeaderBoardItemNew_);
        this.f187086e.removeAll(this.f187085d);
    }

    /* JADX INFO: renamed from: L */
    private void m203999L() {
        this.f187085d.addAll(this.f187084c.subList(0, Math.min(this.f187084c.size(), 3)));
    }

    /* JADX INFO: renamed from: M */
    private boolean m204000M(int i) {
        return i == getPageCount() - 1;
    }

    /* JADX INFO: renamed from: N */
    private boolean m204001N(int i) {
        return i == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m204002O() {
        m203998K();
        notifyItemRangeChanged(1, this.f187086e.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ Boolean m204003P() {
        return Boolean.valueOf(!vwb.m200296J(this.f187085d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m204004Q(Integer num) {
        if (m204001N(num.intValue())) {
            Iterator<BLiveHourLeaderBoardItem> it = this.f187085d.iterator();
            while (it.hasNext()) {
                m204005V(it.next());
            }
        } else {
            if (m204000M(num.intValue())) {
                return;
            }
            m204005V(getItem(num.intValue()));
        }
    }

    /* JADX INFO: renamed from: V */
    private void m204005V(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        zcu.m218095j(h7d0.m129655x().m129679r(bLiveHourLeaderBoardItem.liveId).m129668g(bLiveHourLeaderBoardItem.userId).m129682u(bLiveHourLeaderBoardItem.liveState.toString()).m129684w("e_hoursboard").m129674m(String.valueOf(bLiveHourLeaderBoardItem.rank)).m129681t(gar.m125011e(bLiveHourLeaderBoardItem)).m129662a(), this.f187087f.mo74922D());
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f187086e.size() + 1;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168352g2, viewGroup, false);
        }
        return i == 3 ? LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168391j2, viewGroup, false) : LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168569wb, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem, int i, int i2) {
        if (i == 1) {
            ((HourBoardHeaderView) view).m74847s0(this.f187085d, this.f187087f, this.f187091j, this.f187089h);
        } else if (i == 2) {
            ((WeekBoardMainlandItemView) view).m74908n0(bLiveHourLeaderBoardItem, this.f187087f, false);
        } else if (i == 3) {
            ((HourBoardMainlandFooter) view).m74851i0();
        }
    }

    /* JADX INFO: renamed from: I */
    public void m204007I() {
        e51.m114745J(this.f187090i);
        this.f187084c.clear();
        this.f187085d.clear();
        this.f187086e.clear();
        notifyDataSetChanged();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public BLiveHourLeaderBoardItem getItem(int i) {
        if (m204001N(i)) {
            return null;
        }
        return this.f187086e.get(i - 1);
    }

    /* JADX INFO: renamed from: R */
    public void m204009R() {
        this.f187088g.m174109m();
    }

    /* JADX INFO: renamed from: S */
    public void m204010S(boolean z) {
        if (z) {
            this.f187088g.m174117u();
        }
    }

    /* JADX INFO: renamed from: T */
    public void m204011T(List<BLiveCurrentHourNotices> list, boolean z) {
        this.f187091j.clear();
        this.f187091j.addAll(list);
        this.f187089h = z;
    }

    /* JADX INFO: renamed from: U */
    public void m204012U(List<BLiveHourLeaderBoardItem> list) {
        m204007I();
        this.f187084c.clear();
        this.f187084c.addAll(list);
        m203999L();
        notifyDataSetChanged();
        e51.m114745J(this.f187090i);
        e51.m114744I(this.f187087f.mo74921C(), this.f187090i, 1000L);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (m204001N(i)) {
            return 1;
        }
        return this.f187086e.get(i - 1).isFooter ? 3 : 2;
    }

    @Override // p149l.qdt.InterfaceC19468b
    /* JADX INFO: renamed from: m */
    public void mo102830m(List<Integer> list, boolean z) {
        vwb.m200354z(list, new e30() { // from class: l.vmp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f182138a.m204004Q((Integer) obj);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f187088g.m174107k(recyclerView);
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f187088g.m174119w();
        recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f187088g.m174118v();
    }
}
