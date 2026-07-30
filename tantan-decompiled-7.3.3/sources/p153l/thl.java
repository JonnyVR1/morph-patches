package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourBoardListItem;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourHeadersView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class thl extends jic0<BLiveHourLeaderBoardItem> implements ViewTreeObserver.OnGlobalLayoutListener, rft.InterfaceC19833b {

    /* JADX INFO: renamed from: c */
    public List<BLiveHourLeaderBoardItem> f174388c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public List<BLiveHourLeaderBoardItem> f174389d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final uhl f174390e;

    /* JADX INFO: renamed from: f */
    public final rft f174391f;

    /* JADX INFO: renamed from: g */
    public BLiveHourLeaderBoard f174392g;

    public thl(uhl uhlVar) {
        this.f174390e = uhlVar;
        rft rftVar = new rft(true, uhlVar.mo76104C(), new pcj() { // from class: l.shl
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f168718a.m191271K();
            }
        }, 0.5f);
        this.f174391f = rftVar;
        rftVar.m181300s(this);
    }

    /* JADX INFO: renamed from: J */
    private boolean m191267J(int i) {
        return i == 0;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f174389d.size() + 2;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f199071f2, viewGroup, false);
        }
        return i == 3 ? LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f199058e2, viewGroup, false) : LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f199136k2, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem, int i, int i2) {
        if (i == 1) {
            ((HourHeadersView) view).m75991i0(this.f174388c, this.f174390e, this.f174392g);
        } else if (i != 3) {
            ((HourBoardListItem) view).m75957u0(bLiveHourLeaderBoardItem, this.f174390e, this.f174392g);
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public BLiveHourLeaderBoardItem getItem(int i) {
        if (m191267J(i) || m191270I(i)) {
            return null;
        }
        return this.f174389d.get(i - 1);
    }

    /* JADX INFO: renamed from: I */
    public final boolean m191270I(int i) {
        return i == getPageCount() - 1;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Boolean m191271K() {
        return Boolean.valueOf(!jyb.m147479J(this.f174388c));
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m191272L(Integer num) {
        if (m191267J(num.intValue())) {
            Iterator<BLiveHourLeaderBoardItem> it = this.f174388c.iterator();
            while (it.hasNext()) {
                m191277Q(it.next());
            }
        } else {
            if (m191270I(num.intValue())) {
                return;
            }
            m191277Q(getItem(num.intValue()));
        }
    }

    /* JADX INFO: renamed from: M */
    public void m191273M() {
        this.f174391f.m181294m();
    }

    /* JADX INFO: renamed from: N */
    public void m191274N(boolean z) {
        if (z) {
            this.f174391f.m181302u();
        }
    }

    /* JADX INFO: renamed from: O */
    public void m191275O(BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        this.f174392g = bLiveHourLeaderBoard;
    }

    /* JADX INFO: renamed from: P */
    public void m191276P(List<BLiveHourLeaderBoardItem> list) {
        List<BLiveHourLeaderBoardItem> listSubList = list.subList(0, Math.min(list.size(), 3));
        this.f174388c = new ArrayList(listSubList);
        listSubList.clear();
        this.f174389d = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: Q */
    public final void m191277Q(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        afu.m97561j(kfd0.m149385x().m149409r(bLiveHourLeaderBoardItem.liveId).m149398g(bLiveHourLeaderBoardItem.userId).m149412u(bLiveHourLeaderBoardItem.liveState.toString()).m149414w("e_hoursboard").m149404m(String.valueOf(bLiveHourLeaderBoardItem.rank)).m149411t(icr.m139462e(bLiveHourLeaderBoardItem)).m149392a(), this.f174390e.mo76105D());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (m191267J(i)) {
            return 1;
        }
        return m191270I(i) ? 3 : 2;
    }

    @Override // p153l.rft.InterfaceC19833b
    /* JADX INFO: renamed from: m */
    public void mo100705m(List<Integer> list, boolean z) {
        jyb.m147537z(list, new y20() { // from class: l.rhl
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163182a.m191272L((Integer) obj);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f174391f.m181292k(recyclerView);
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f174391f.m181304w();
        recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f174391f.m181303v();
    }
}
