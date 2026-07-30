package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardHeaderView;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardMainlandItemView;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.dac0;
import l.e30;
import l.e51;
import l.h7d0;
import l.qdt;
import l.v9j;
import l.vwb;
import l.zcu;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ogl extends dac0<BLiveHourLeaderBoardItem> implements ViewTreeObserver.OnGlobalLayoutListener, qdt.b {

    /* JADX INFO: renamed from: f */
    public final dfl f16583f;

    /* JADX INFO: renamed from: g */
    public final qdt f16584g;

    /* JADX INFO: renamed from: h */
    public BLiveHourLeaderBoard f16585h;

    /* JADX INFO: renamed from: c */
    public final List<BLiveHourLeaderBoardItem> f16580c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final List<BLiveHourLeaderBoardItem> f16581d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final List<BLiveHourLeaderBoardItem> f16582e = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final Runnable f16586i = new Runnable() { // from class: l.lgl
        @Override // java.lang.Runnable
        public final void run() {
            this.f14857a.m19479O();
        }
    };

    public ogl(dfl dflVar) {
        this.f16583f = dflVar;
        qdt qdtVar = new qdt(true, dflVar.mo8523C(), new v9j() { // from class: l.mgl
            public final Object call() {
                return this.f15382a.m19480P();
            }
        }, 0.5f);
        this.f16584g = qdtVar;
        qdtVar.s(this);
    }

    /* JADX INFO: renamed from: K */
    private void m19475K() {
        this.f16582e.addAll(this.f16580c);
        BLiveHourLeaderBoardItem bLiveHourLeaderBoardItemNew_ = BLiveHourLeaderBoardItem.new_();
        bLiveHourLeaderBoardItemNew_.isFooter = true;
        this.f16582e.add(bLiveHourLeaderBoardItemNew_);
        this.f16582e.removeAll(this.f16581d);
    }

    /* JADX INFO: renamed from: L */
    private void m19476L() {
        this.f16581d.addAll(this.f16580c.subList(0, Math.min(this.f16580c.size(), 3)));
    }

    /* JADX INFO: renamed from: M */
    private boolean m19477M(int i) {
        return i == m19483C() - 1;
    }

    /* JADX INFO: renamed from: N */
    private boolean m19478N(int i) {
        return i == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m19479O() {
        m19475K();
        notifyItemRangeChanged(1, this.f16582e.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ Boolean m19480P() {
        return Boolean.valueOf(!vwb.J(this.f16581d));
    }

    /* JADX INFO: renamed from: V */
    private void m19481V(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        zcu.j(h7d0.x().r(bLiveHourLeaderBoardItem.liveId).g(bLiveHourLeaderBoardItem.userId).u(bLiveHourLeaderBoardItem.liveState.toString()).w("e_hoursboard").m(String.valueOf(bLiveHourLeaderBoardItem.rank)).t(gar.m13677e(bLiveHourLeaderBoardItem)).a(), this.f16583f.mo8524D());
    }

    /* JADX INFO: renamed from: C */
    public int m19483C() {
        return this.f16582e.size() + 1;
    }

    /* JADX INFO: renamed from: D */
    public View m19484D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f19848g2, viewGroup, false);
        }
        return i == 3 ? LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f19887j2, viewGroup, false) : LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f19913l2, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m19482A(View view, BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem, int i, int i2) {
        if (i == 1) {
            ((HourBoardHeaderView) view).m8446r0(this.f16581d, this.f16583f, this.f16585h);
        } else if (i == 2) {
            ((HourBoardMainlandItemView) view).m8456l0(bLiveHourLeaderBoardItem, this.f16583f, this.f16585h);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m19486I() {
        e51.J(this.f16586i);
        this.f16580c.clear();
        this.f16581d.clear();
        this.f16582e.clear();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public BLiveHourLeaderBoardItem getItem(int i) {
        if (m19478N(i)) {
            return null;
        }
        return this.f16582e.get(i - 1);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m19488Q(Integer num) {
        if (m19478N(num.intValue())) {
            Iterator<BLiveHourLeaderBoardItem> it = this.f16581d.iterator();
            while (it.hasNext()) {
                m19481V(it.next());
            }
        } else {
            if (m19477M(num.intValue())) {
                return;
            }
            m19481V(getItem(num.intValue()));
        }
    }

    /* JADX INFO: renamed from: R */
    public void m19489R() {
        this.f16584g.m();
    }

    /* JADX INFO: renamed from: S */
    public void m19490S(boolean z) {
        if (z) {
            this.f16584g.u();
        }
    }

    /* JADX INFO: renamed from: T */
    public void m19491T(BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        this.f16585h = bLiveHourLeaderBoard;
    }

    /* JADX INFO: renamed from: U */
    public void m19492U(List<BLiveHourLeaderBoardItem> list) {
        this.f16580c.clear();
        this.f16580c.addAll(list);
        m19476L();
        notifyDataSetChanged();
        if (list.isEmpty()) {
            return;
        }
        e51.J(this.f16586i);
        e51.I(this.f16583f.mo8523C(), this.f16586i, 1000L);
    }

    public int getItemViewType(int i) {
        if (m19478N(i)) {
            return 1;
        }
        return this.f16582e.get(i - 1).isFooter ? 3 : 2;
    }

    /* JADX INFO: renamed from: m */
    public void m19493m(List<Integer> list, boolean z) {
        vwb.z(list, new e30() { // from class: l.ngl
            public final void call(Object obj) {
                this.f16021a.m19488Q((Integer) obj);
            }
        });
    }

    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onAttachedToRecyclerView(recyclerView);
        this.f16584g.k(recyclerView);
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onDetachedFromRecyclerView(recyclerView);
        this.f16584g.w();
        recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f16584g.v();
    }
}
