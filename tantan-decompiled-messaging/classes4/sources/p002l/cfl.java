package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourBoardListItem;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourHeadersView;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.dac0;
import l.e30;
import l.h7d0;
import l.qdt;
import l.v9j;
import l.vwb;
import l.zcu;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class cfl extends dac0<BLiveHourLeaderBoardItem> implements ViewTreeObserver.OnGlobalLayoutListener, qdt.b {

    /* JADX INFO: renamed from: c */
    public List<BLiveHourLeaderBoardItem> f8648c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public List<BLiveHourLeaderBoardItem> f8649d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final dfl f8650e;

    /* JADX INFO: renamed from: f */
    public final qdt f8651f;

    /* JADX INFO: renamed from: g */
    public BLiveHourLeaderBoard f8652g;

    public cfl(dfl dflVar) {
        this.f8650e = dflVar;
        qdt qdtVar = new qdt(true, dflVar.mo8523C(), new v9j() { // from class: l.bfl
            public final Object call() {
                return this.f8104a.m11016K();
            }
        }, 0.5f);
        this.f8651f = qdtVar;
        qdtVar.s(this);
    }

    /* JADX INFO: renamed from: J */
    private boolean m11009J(int i) {
        return i == 0;
    }

    /* JADX INFO: renamed from: C */
    public int m11011C() {
        return this.f8649d.size() + 2;
    }

    /* JADX INFO: renamed from: D */
    public View m11012D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f19835f2, viewGroup, false);
        }
        return i == 3 ? LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f19822e2, viewGroup, false) : LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f19900k2, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void m11010A(View view, BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem, int i, int i2) {
        if (i == 1) {
            ((HourHeadersView) view).m8406i0(this.f8648c, this.f8650e, this.f8652g);
        } else if (i != 3) {
            ((HourBoardListItem) view).m8372u0(bLiveHourLeaderBoardItem, this.f8650e, this.f8652g);
        }
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public BLiveHourLeaderBoardItem getItem(int i) {
        if (m11009J(i) || m11015I(i)) {
            return null;
        }
        return this.f8649d.get(i - 1);
    }

    /* JADX INFO: renamed from: I */
    public final boolean m11015I(int i) {
        return i == m11011C() - 1;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Boolean m11016K() {
        return Boolean.valueOf(!vwb.J(this.f8648c));
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m11017L(Integer num) {
        if (m11009J(num.intValue())) {
            Iterator<BLiveHourLeaderBoardItem> it = this.f8648c.iterator();
            while (it.hasNext()) {
                m11022Q(it.next());
            }
        } else {
            if (m11015I(num.intValue())) {
                return;
            }
            m11022Q(getItem(num.intValue()));
        }
    }

    /* JADX INFO: renamed from: M */
    public void m11018M() {
        this.f8651f.m();
    }

    /* JADX INFO: renamed from: N */
    public void m11019N(boolean z) {
        if (z) {
            this.f8651f.u();
        }
    }

    /* JADX INFO: renamed from: O */
    public void m11020O(BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        this.f8652g = bLiveHourLeaderBoard;
    }

    /* JADX INFO: renamed from: P */
    public void m11021P(List<BLiveHourLeaderBoardItem> list) {
        List<BLiveHourLeaderBoardItem> listSubList = list.subList(0, Math.min(list.size(), 3));
        this.f8648c = new ArrayList(listSubList);
        listSubList.clear();
        this.f8649d = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: Q */
    public final void m11022Q(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        zcu.j(h7d0.x().r(bLiveHourLeaderBoardItem.liveId).g(bLiveHourLeaderBoardItem.userId).u(bLiveHourLeaderBoardItem.liveState.toString()).w("e_hoursboard").m(String.valueOf(bLiveHourLeaderBoardItem.rank)).t(gar.m13677e(bLiveHourLeaderBoardItem)).a(), this.f8650e.mo8524D());
    }

    public int getItemViewType(int i) {
        if (m11009J(i)) {
            return 1;
        }
        return m11015I(i) ? 3 : 2;
    }

    /* JADX INFO: renamed from: m */
    public void m11023m(List<Integer> list, boolean z) {
        vwb.z(list, new e30() { // from class: l.afl
            public final void call(Object obj) {
                this.f7535a.m11017L((Integer) obj);
            }
        });
    }

    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onAttachedToRecyclerView(recyclerView);
        this.f8651f.k(recyclerView);
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onDetachedFromRecyclerView(recyclerView);
        this.f8651f.w();
        recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f8651f.v();
    }
}
