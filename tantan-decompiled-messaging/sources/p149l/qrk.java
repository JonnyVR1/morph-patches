package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.data.BLiveGuardboardRecord;
import com.p046p1.mobile.putong.live.livingroom.increment.knight.view.leaderboard.LiveGuardBoardHeaderView;
import com.p046p1.mobile.putong.live.livingroom.increment.knight.view.leaderboard.LiveGuardBoardListItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class qrk extends dac0<BLiveGuardboardRecord> {

    /* JADX INFO: renamed from: c */
    public List<BLiveGuardboardRecord> f155999c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public List<BLiveGuardboardRecord> f156000d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final zqs f156001e;

    /* JADX INFO: renamed from: f */
    public mpw f156002f;

    public qrk(zqs zqsVar) {
        this.f156001e = zqsVar;
    }

    /* JADX INFO: renamed from: G */
    private boolean m176036G(int i) {
        return i == 0;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f156000d.size() + 1;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        zqs zqsVar = this.f156001e;
        return i == 1 ? zqsVar.getAct().inflater().inflate(t6c0.f168225W1, viewGroup, false) : zqsVar.getAct().inflater().inflate(t6c0.f168177S1, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, BLiveGuardboardRecord bLiveGuardboardRecord, int i, int i2) {
        if (i == 1) {
            ((LiveGuardBoardHeaderView) view).m74663i0(this.f156001e, this.f156002f, this.f155999c);
        } else {
            ((LiveGuardBoardListItem) view).m74667j0(this.f156001e, bLiveGuardboardRecord);
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public BLiveGuardboardRecord getItem(int i) {
        if (m176036G(i)) {
            return null;
        }
        return this.f156000d.get(i - 1);
    }

    /* JADX INFO: renamed from: H */
    public void m176039H(mpw mpwVar) {
        this.f156002f = mpwVar;
        ArrayList arrayList = new ArrayList(mpwVar.f135099i);
        List listSubList = arrayList.subList(0, Math.min(arrayList.size(), 3));
        this.f155999c = new ArrayList(listSubList);
        listSubList.clear();
        this.f156000d = arrayList;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return m176036G(i) ? 1 : 2;
    }
}
