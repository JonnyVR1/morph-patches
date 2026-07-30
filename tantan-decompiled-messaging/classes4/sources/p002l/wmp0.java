package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardHeaderView;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardMainlandFooter;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainlandnew.WeekBoardMainlandItemView;
import com.p1.mobile.putong.live.base.data.BLiveCurrentHourNotices;
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
public class wmp0 extends dac0<BLiveHourLeaderBoardItem> implements ViewTreeObserver.OnGlobalLayoutListener, qdt.b {

    /* JADX INFO: renamed from: f */
    public final dfl f21832f;

    /* JADX INFO: renamed from: g */
    public final qdt f21833g;

    /* JADX INFO: renamed from: c */
    public final List<BLiveHourLeaderBoardItem> f21829c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final List<BLiveHourLeaderBoardItem> f21830d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final List<BLiveHourLeaderBoardItem> f21831e = new ArrayList();

    /* JADX INFO: renamed from: h */
    public boolean f21834h = true;

    /* JADX INFO: renamed from: i */
    public final Runnable f21835i = new Runnable() { // from class: l.tmp0
        @Override // java.lang.Runnable
        public final void run() {
            this.f20307a.m24701O();
        }
    };

    /* JADX INFO: renamed from: j */
    public List<BLiveCurrentHourNotices> f21836j = new ArrayList();

    public wmp0(dfl dflVar) {
        this.f21832f = dflVar;
        qdt qdtVar = new qdt(true, dflVar.mo8523C(), new v9j() { // from class: l.ump0
            public final Object call() {
                return this.f20722a.m24702P();
            }
        }, 0.5f);
        this.f21833g = qdtVar;
        qdtVar.s(this);
    }

    /* JADX INFO: renamed from: K */
    private void m24697K() {
        this.f21831e.addAll(this.f21829c);
        BLiveHourLeaderBoardItem bLiveHourLeaderBoardItemNew_ = BLiveHourLeaderBoardItem.new_();
        bLiveHourLeaderBoardItemNew_.isFooter = true;
        this.f21831e.add(bLiveHourLeaderBoardItemNew_);
        this.f21831e.removeAll(this.f21830d);
    }

    /* JADX INFO: renamed from: L */
    private void m24698L() {
        this.f21830d.addAll(this.f21829c.subList(0, Math.min(this.f21829c.size(), 3)));
    }

    /* JADX INFO: renamed from: M */
    private boolean m24699M(int i) {
        return i == m24706C() - 1;
    }

    /* JADX INFO: renamed from: N */
    private boolean m24700N(int i) {
        return i == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m24701O() {
        m24697K();
        notifyItemRangeChanged(1, this.f21831e.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ Boolean m24702P() {
        return Boolean.valueOf(!vwb.J(this.f21830d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m24703Q(Integer num) {
        if (m24700N(num.intValue())) {
            Iterator<BLiveHourLeaderBoardItem> it = this.f21830d.iterator();
            while (it.hasNext()) {
                m24704V(it.next());
            }
        } else {
            if (m24699M(num.intValue())) {
                return;
            }
            m24704V(getItem(num.intValue()));
        }
    }

    /* JADX INFO: renamed from: V */
    private void m24704V(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        zcu.j(h7d0.x().r(bLiveHourLeaderBoardItem.liveId).g(bLiveHourLeaderBoardItem.userId).u(bLiveHourLeaderBoardItem.liveState.toString()).w("e_hoursboard").m(String.valueOf(bLiveHourLeaderBoardItem.rank)).t(gar.m13677e(bLiveHourLeaderBoardItem)).a(), this.f21832f.mo8524D());
    }

    /* JADX INFO: renamed from: C */
    public int m24706C() {
        return this.f21831e.size() + 1;
    }

    /* JADX INFO: renamed from: D */
    public View m24707D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f19848g2, viewGroup, false);
        }
        return i == 3 ? LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f19887j2, viewGroup, false) : LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f20065wb, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m24705A(View view, BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem, int i, int i2) {
        if (i == 1) {
            ((HourBoardHeaderView) view).m8447s0(this.f21830d, this.f21832f, this.f21836j, this.f21834h);
        } else if (i == 2) {
            ((WeekBoardMainlandItemView) view).m8510n0(bLiveHourLeaderBoardItem, this.f21832f, false);
        } else if (i == 3) {
            ((HourBoardMainlandFooter) view).m8451i0();
        }
    }

    /* JADX INFO: renamed from: I */
    public void m24709I() {
        e51.J(this.f21835i);
        this.f21829c.clear();
        this.f21830d.clear();
        this.f21831e.clear();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public BLiveHourLeaderBoardItem getItem(int i) {
        if (m24700N(i)) {
            return null;
        }
        return this.f21831e.get(i - 1);
    }

    /* JADX INFO: renamed from: R */
    public void m24711R() {
        this.f21833g.m();
    }

    /* JADX INFO: renamed from: S */
    public void m24712S(boolean z) {
        if (z) {
            this.f21833g.u();
        }
    }

    /* JADX INFO: renamed from: T */
    public void m24713T(List<BLiveCurrentHourNotices> list, boolean z) {
        this.f21836j.clear();
        this.f21836j.addAll(list);
        this.f21834h = z;
    }

    /* JADX INFO: renamed from: U */
    public void m24714U(List<BLiveHourLeaderBoardItem> list) {
        m24709I();
        this.f21829c.clear();
        this.f21829c.addAll(list);
        m24698L();
        notifyDataSetChanged();
        e51.J(this.f21835i);
        e51.I(this.f21832f.mo8523C(), this.f21835i, 1000L);
    }

    public int getItemViewType(int i) {
        if (m24700N(i)) {
            return 1;
        }
        return this.f21831e.get(i - 1).isFooter ? 3 : 2;
    }

    /* JADX INFO: renamed from: m */
    public void m24715m(List<Integer> list, boolean z) {
        vwb.z(list, new e30() { // from class: l.vmp0
            public final void call(Object obj) {
                this.f21225a.m24703Q((Integer) obj);
            }
        });
    }

    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onAttachedToRecyclerView(recyclerView);
        this.f21833g.k(recyclerView);
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onDetachedFromRecyclerView(recyclerView);
        this.f21833g.w();
        recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f21833g.v();
    }
}
