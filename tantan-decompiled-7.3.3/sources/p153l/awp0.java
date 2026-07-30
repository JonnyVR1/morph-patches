package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.data.BLiveCurrentHourNotices;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardHeaderView;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardMainlandFooter;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainlandnew.WeekBoardMainlandItemView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class awp0 extends jic0<BLiveHourLeaderBoardItem> implements ViewTreeObserver.OnGlobalLayoutListener, rft.InterfaceC19833b {

    /* JADX INFO: renamed from: f */
    public final uhl f73779f;

    /* JADX INFO: renamed from: g */
    public final rft f73780g;

    /* JADX INFO: renamed from: c */
    public final List<BLiveHourLeaderBoardItem> f73776c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final List<BLiveHourLeaderBoardItem> f73777d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final List<BLiveHourLeaderBoardItem> f73778e = new ArrayList();

    /* JADX INFO: renamed from: h */
    public boolean f73781h = true;

    /* JADX INFO: renamed from: i */
    public final Runnable f73782i = new Runnable() { // from class: l.xvp0
        @Override // java.lang.Runnable
        public final void run() {
            this.f196418a.m100694O();
        }
    };

    /* JADX INFO: renamed from: j */
    public List<BLiveCurrentHourNotices> f73783j = new ArrayList();

    public awp0(uhl uhlVar) {
        this.f73779f = uhlVar;
        rft rftVar = new rft(true, uhlVar.mo76104C(), new pcj() { // from class: l.yvp0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f201750a.m100695P();
            }
        }, 0.5f);
        this.f73780g = rftVar;
        rftVar.m181300s(this);
    }

    /* JADX INFO: renamed from: K */
    private void m100690K() {
        this.f73778e.addAll(this.f73776c);
        BLiveHourLeaderBoardItem bLiveHourLeaderBoardItemNew_ = BLiveHourLeaderBoardItem.new_();
        bLiveHourLeaderBoardItemNew_.isFooter = true;
        this.f73778e.add(bLiveHourLeaderBoardItemNew_);
        this.f73778e.removeAll(this.f73777d);
    }

    /* JADX INFO: renamed from: L */
    private void m100691L() {
        this.f73777d.addAll(this.f73776c.subList(0, Math.min(this.f73776c.size(), 3)));
    }

    /* JADX INFO: renamed from: M */
    private boolean m100692M(int i) {
        return i == getPageCount() - 1;
    }

    /* JADX INFO: renamed from: N */
    private boolean m100693N(int i) {
        return i == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m100694O() {
        m100690K();
        notifyItemRangeChanged(1, this.f73778e.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ Boolean m100695P() {
        return Boolean.valueOf(!jyb.m147479J(this.f73777d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m100696Q(Integer num) {
        if (m100693N(num.intValue())) {
            Iterator<BLiveHourLeaderBoardItem> it = this.f73777d.iterator();
            while (it.hasNext()) {
                m100697V(it.next());
            }
        } else {
            if (m100692M(num.intValue())) {
                return;
            }
            m100697V(getItem(num.intValue()));
        }
    }

    /* JADX INFO: renamed from: V */
    private void m100697V(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        afu.m97561j(kfd0.m149385x().m149409r(bLiveHourLeaderBoardItem.liveId).m149398g(bLiveHourLeaderBoardItem.userId).m149412u(bLiveHourLeaderBoardItem.liveState.toString()).m149414w("e_hoursboard").m149404m(String.valueOf(bLiveHourLeaderBoardItem.rank)).m149411t(icr.m139462e(bLiveHourLeaderBoardItem)).m149392a(), this.f73779f.mo76105D());
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f73778e.size() + 1;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f199084g2, viewGroup, false);
        }
        return i == 3 ? LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f199123j2, viewGroup, false) : LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f199301wb, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem, int i, int i2) {
        if (i == 1) {
            ((HourBoardHeaderView) view).m76030s0(this.f73777d, this.f73779f, this.f73783j, this.f73781h);
        } else if (i == 2) {
            ((WeekBoardMainlandItemView) view).m76091n0(bLiveHourLeaderBoardItem, this.f73779f, false);
        } else if (i == 3) {
            ((HourBoardMainlandFooter) view).m76034i0();
        }
    }

    /* JADX INFO: renamed from: I */
    public void m100699I() {
        l51.m152890J(this.f73782i);
        this.f73776c.clear();
        this.f73777d.clear();
        this.f73778e.clear();
        notifyDataSetChanged();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public BLiveHourLeaderBoardItem getItem(int i) {
        if (m100693N(i)) {
            return null;
        }
        return this.f73778e.get(i - 1);
    }

    /* JADX INFO: renamed from: R */
    public void m100701R() {
        this.f73780g.m181294m();
    }

    /* JADX INFO: renamed from: S */
    public void m100702S(boolean z) {
        if (z) {
            this.f73780g.m181302u();
        }
    }

    /* JADX INFO: renamed from: T */
    public void m100703T(List<BLiveCurrentHourNotices> list, boolean z) {
        this.f73783j.clear();
        this.f73783j.addAll(list);
        this.f73781h = z;
    }

    /* JADX INFO: renamed from: U */
    public void m100704U(List<BLiveHourLeaderBoardItem> list) {
        m100699I();
        this.f73776c.clear();
        this.f73776c.addAll(list);
        m100691L();
        notifyDataSetChanged();
        l51.m152890J(this.f73782i);
        l51.m152889I(this.f73779f.mo76104C(), this.f73782i, 1000L);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (m100693N(i)) {
            return 1;
        }
        return this.f73778e.get(i - 1).isFooter ? 3 : 2;
    }

    @Override // p153l.rft.InterfaceC19833b
    /* JADX INFO: renamed from: m */
    public void mo100705m(List<Integer> list, boolean z) {
        jyb.m147537z(list, new y20() { // from class: l.zvp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206273a.m100696Q((Integer) obj);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f73780g.m181292k(recyclerView);
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f73780g.m181304w();
        recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f73780g.m181303v();
    }
}
