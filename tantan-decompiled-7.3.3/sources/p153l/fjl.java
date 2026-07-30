package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardHeaderView;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardMainlandItemView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class fjl extends jic0<BLiveHourLeaderBoardItem> implements ViewTreeObserver.OnGlobalLayoutListener, rft.InterfaceC19833b {

    /* JADX INFO: renamed from: f */
    public final uhl f99345f;

    /* JADX INFO: renamed from: g */
    public final rft f99346g;

    /* JADX INFO: renamed from: h */
    public BLiveHourLeaderBoard f99347h;

    /* JADX INFO: renamed from: c */
    public final List<BLiveHourLeaderBoardItem> f99342c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final List<BLiveHourLeaderBoardItem> f99343d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final List<BLiveHourLeaderBoardItem> f99344e = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final Runnable f99348i = new Runnable() { // from class: l.cjl
        @Override // java.lang.Runnable
        public final void run() {
            this.f82196a.m125812O();
        }
    };

    public fjl(uhl uhlVar) {
        this.f99345f = uhlVar;
        rft rftVar = new rft(true, uhlVar.mo76104C(), new pcj() { // from class: l.djl
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f88869a.m125813P();
            }
        }, 0.5f);
        this.f99346g = rftVar;
        rftVar.m181300s(this);
    }

    /* JADX INFO: renamed from: K */
    private void m125808K() {
        this.f99344e.addAll(this.f99342c);
        BLiveHourLeaderBoardItem bLiveHourLeaderBoardItemNew_ = BLiveHourLeaderBoardItem.new_();
        bLiveHourLeaderBoardItemNew_.isFooter = true;
        this.f99344e.add(bLiveHourLeaderBoardItemNew_);
        this.f99344e.removeAll(this.f99343d);
    }

    /* JADX INFO: renamed from: L */
    private void m125809L() {
        this.f99343d.addAll(this.f99342c.subList(0, Math.min(this.f99342c.size(), 3)));
    }

    /* JADX INFO: renamed from: M */
    private boolean m125810M(int i) {
        return i == getPageCount() - 1;
    }

    /* JADX INFO: renamed from: N */
    private boolean m125811N(int i) {
        return i == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m125812O() {
        m125808K();
        notifyItemRangeChanged(1, this.f99344e.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ Boolean m125813P() {
        return Boolean.valueOf(!jyb.m147479J(this.f99343d));
    }

    /* JADX INFO: renamed from: V */
    private void m125814V(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        afu.m97561j(kfd0.m149385x().m149409r(bLiveHourLeaderBoardItem.liveId).m149398g(bLiveHourLeaderBoardItem.userId).m149412u(bLiveHourLeaderBoardItem.liveState.toString()).m149414w("e_hoursboard").m149404m(String.valueOf(bLiveHourLeaderBoardItem.rank)).m149411t(icr.m139462e(bLiveHourLeaderBoardItem)).m149392a(), this.f99345f.mo76105D());
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f99344e.size() + 1;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f199084g2, viewGroup, false);
        }
        return i == 3 ? LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f199123j2, viewGroup, false) : LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f199149l2, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem, int i, int i2) {
        if (i == 1) {
            ((HourBoardHeaderView) view).m76029r0(this.f99343d, this.f99345f, this.f99347h);
        } else if (i == 2) {
            ((HourBoardMainlandItemView) view).m76039l0(bLiveHourLeaderBoardItem, this.f99345f, this.f99347h);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m125816I() {
        l51.m152890J(this.f99348i);
        this.f99342c.clear();
        this.f99343d.clear();
        this.f99344e.clear();
        notifyDataSetChanged();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public BLiveHourLeaderBoardItem getItem(int i) {
        if (m125811N(i)) {
            return null;
        }
        return this.f99344e.get(i - 1);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m125818Q(Integer num) {
        if (m125811N(num.intValue())) {
            Iterator<BLiveHourLeaderBoardItem> it = this.f99343d.iterator();
            while (it.hasNext()) {
                m125814V(it.next());
            }
        } else {
            if (m125810M(num.intValue())) {
                return;
            }
            m125814V(getItem(num.intValue()));
        }
    }

    /* JADX INFO: renamed from: R */
    public void m125819R() {
        this.f99346g.m181294m();
    }

    /* JADX INFO: renamed from: S */
    public void m125820S(boolean z) {
        if (z) {
            this.f99346g.m181302u();
        }
    }

    /* JADX INFO: renamed from: T */
    public void m125821T(BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        this.f99347h = bLiveHourLeaderBoard;
    }

    /* JADX INFO: renamed from: U */
    public void m125822U(List<BLiveHourLeaderBoardItem> list) {
        this.f99342c.clear();
        this.f99342c.addAll(list);
        m125809L();
        notifyDataSetChanged();
        if (list.isEmpty()) {
            return;
        }
        l51.m152890J(this.f99348i);
        l51.m152889I(this.f99345f.mo76104C(), this.f99348i, 1000L);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (m125811N(i)) {
            return 1;
        }
        return this.f99344e.get(i - 1).isFooter ? 3 : 2;
    }

    @Override // p153l.rft.InterfaceC19833b
    /* JADX INFO: renamed from: m */
    public void mo100705m(List<Integer> list, boolean z) {
        jyb.m147537z(list, new y20() { // from class: l.ejl
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94309a.m125818Q((Integer) obj);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f99346g.m181292k(recyclerView);
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f99346g.m181304w();
        recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f99346g.m181303v();
    }
}
