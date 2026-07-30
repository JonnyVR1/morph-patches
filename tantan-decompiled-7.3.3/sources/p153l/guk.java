package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.data.BLiveGuardboardRecord;
import com.p051p1.mobile.putong.live.livingroom.increment.knight.view.leaderboard.LiveGuardBoardHeaderView;
import com.p051p1.mobile.putong.live.livingroom.increment.knight.view.leaderboard.LiveGuardBoardListItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class guk extends jic0<BLiveGuardboardRecord> {

    /* JADX INFO: renamed from: c */
    public List<BLiveGuardboardRecord> f106513c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public List<BLiveGuardboardRecord> f106514d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final ats f106515e;

    /* JADX INFO: renamed from: f */
    public lsw f106516f;

    public guk(ats atsVar) {
        this.f106515e = atsVar;
    }

    /* JADX INFO: renamed from: G */
    private boolean m132318G(int i) {
        return i == 0;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f106514d.size() + 1;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        ats atsVar = this.f106515e;
        return i == 1 ? atsVar.getAct().inflater().inflate(yec0.f198957W1, viewGroup, false) : atsVar.getAct().inflater().inflate(yec0.f198909S1, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, BLiveGuardboardRecord bLiveGuardboardRecord, int i, int i2) {
        if (i == 1) {
            ((LiveGuardBoardHeaderView) view).m75846i0(this.f106515e, this.f106516f, this.f106513c);
        } else {
            ((LiveGuardBoardListItem) view).m75850j0(this.f106515e, bLiveGuardboardRecord);
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public BLiveGuardboardRecord getItem(int i) {
        if (m132318G(i)) {
            return null;
        }
        return this.f106514d.get(i - 1);
    }

    /* JADX INFO: renamed from: H */
    public void m132321H(lsw lswVar) {
        this.f106516f = lswVar;
        ArrayList arrayList = new ArrayList(lswVar.f133475i);
        List listSubList = arrayList.subList(0, Math.min(arrayList.size(), 3));
        this.f106513c = new ArrayList(listSubList);
        listSubList.clear();
        this.f106514d = arrayList;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return m132318G(i) ? 1 : 2;
    }
}
