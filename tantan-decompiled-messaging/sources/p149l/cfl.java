package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourBoardListItem;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourHeadersView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class cfl extends dac0<BLiveHourLeaderBoardItem> implements ViewTreeObserver.OnGlobalLayoutListener, qdt.InterfaceC19468b {

    /* JADX INFO: renamed from: c */
    public List<BLiveHourLeaderBoardItem> f80635c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public List<BLiveHourLeaderBoardItem> f80636d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final dfl f80637e;

    /* JADX INFO: renamed from: f */
    public final qdt f80638f;

    /* JADX INFO: renamed from: g */
    public BLiveHourLeaderBoard f80639g;

    public cfl(dfl dflVar) {
        this.f80637e = dflVar;
        qdt qdtVar = new qdt(true, dflVar.mo74921C(), new v9j() { // from class: l.bfl
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f75327a.m106586K();
            }
        }, 0.5f);
        this.f80638f = qdtVar;
        qdtVar.m174115s(this);
    }

    /* JADX INFO: renamed from: J */
    private boolean m106582J(int i) {
        return i == 0;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f80636d.size() + 2;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168339f2, viewGroup, false);
        }
        return i == 3 ? LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168326e2, viewGroup, false) : LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168404k2, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem, int i, int i2) {
        if (i == 1) {
            ((HourHeadersView) view).m74808i0(this.f80635c, this.f80637e, this.f80639g);
        } else if (i != 3) {
            ((HourBoardListItem) view).m74774u0(bLiveHourLeaderBoardItem, this.f80637e, this.f80639g);
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public BLiveHourLeaderBoardItem getItem(int i) {
        if (m106582J(i) || m106585I(i)) {
            return null;
        }
        return this.f80636d.get(i - 1);
    }

    /* JADX INFO: renamed from: I */
    public final boolean m106585I(int i) {
        return i == getPageCount() - 1;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Boolean m106586K() {
        return Boolean.valueOf(!vwb.m200296J(this.f80635c));
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m106587L(Integer num) {
        if (m106582J(num.intValue())) {
            Iterator<BLiveHourLeaderBoardItem> it = this.f80635c.iterator();
            while (it.hasNext()) {
                m106592Q(it.next());
            }
        } else {
            if (m106585I(num.intValue())) {
                return;
            }
            m106592Q(getItem(num.intValue()));
        }
    }

    /* JADX INFO: renamed from: M */
    public void m106588M() {
        this.f80638f.m174109m();
    }

    /* JADX INFO: renamed from: N */
    public void m106589N(boolean z) {
        if (z) {
            this.f80638f.m174117u();
        }
    }

    /* JADX INFO: renamed from: O */
    public void m106590O(BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        this.f80639g = bLiveHourLeaderBoard;
    }

    /* JADX INFO: renamed from: P */
    public void m106591P(List<BLiveHourLeaderBoardItem> list) {
        List<BLiveHourLeaderBoardItem> listSubList = list.subList(0, Math.min(list.size(), 3));
        this.f80635c = new ArrayList(listSubList);
        listSubList.clear();
        this.f80636d = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: Q */
    public final void m106592Q(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        zcu.m218095j(h7d0.m129655x().m129679r(bLiveHourLeaderBoardItem.liveId).m129668g(bLiveHourLeaderBoardItem.userId).m129682u(bLiveHourLeaderBoardItem.liveState.toString()).m129684w("e_hoursboard").m129674m(String.valueOf(bLiveHourLeaderBoardItem.rank)).m129681t(gar.m125011e(bLiveHourLeaderBoardItem)).m129662a(), this.f80637e.mo74922D());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (m106582J(i)) {
            return 1;
        }
        return m106585I(i) ? 3 : 2;
    }

    @Override // p149l.qdt.InterfaceC19468b
    /* JADX INFO: renamed from: m */
    public void mo102830m(List<Integer> list, boolean z) {
        vwb.m200354z(list, new e30() { // from class: l.afl
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f69182a.m106587L((Integer) obj);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f80638f.m174107k(recyclerView);
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f80638f.m174119w();
        recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f80638f.m174118v();
    }
}
