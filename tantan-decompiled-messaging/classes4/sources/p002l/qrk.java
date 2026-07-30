package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.knight.view.leaderboard.LiveGuardBoardHeaderView;
import com.p000p1.mobile.putong.live.livingroom.increment.knight.view.leaderboard.LiveGuardBoardListItem;
import com.p1.mobile.putong.live.base.data.BLiveGuardboardRecord;
import java.util.ArrayList;
import java.util.List;
import l.dac0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class qrk extends dac0<BLiveGuardboardRecord> {

    /* JADX INFO: renamed from: c */
    public List<BLiveGuardboardRecord> f18194c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public List<BLiveGuardboardRecord> f18195d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final zqs f18196e;

    /* JADX INFO: renamed from: f */
    public mpw f18197f;

    public qrk(zqs zqsVar) {
        this.f18196e = zqsVar;
    }

    /* JADX INFO: renamed from: G */
    private boolean m21532G(int i) {
        return i == 0;
    }

    /* JADX INFO: renamed from: C */
    public int m21534C() {
        return this.f18195d.size() + 1;
    }

    /* JADX INFO: renamed from: D */
    public View m21535D(ViewGroup viewGroup, int i) {
        zqs zqsVar = this.f18196e;
        return i == 1 ? zqsVar.act().inflater().inflate(t6c0.f19721W1, viewGroup, false) : zqsVar.act().inflater().inflate(t6c0.f19673S1, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m21533A(View view, BLiveGuardboardRecord bLiveGuardboardRecord, int i, int i2) {
        if (i == 1) {
            ((LiveGuardBoardHeaderView) view).m8257i0(this.f18196e, this.f18197f, this.f18194c);
        } else {
            ((LiveGuardBoardListItem) view).m8261j0(this.f18196e, bLiveGuardboardRecord);
        }
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public BLiveGuardboardRecord getItem(int i) {
        if (m21532G(i)) {
            return null;
        }
        return this.f18195d.get(i - 1);
    }

    /* JADX INFO: renamed from: H */
    public void m21538H(mpw mpwVar) {
        this.f18197f = mpwVar;
        ArrayList arrayList = new ArrayList(mpwVar.f15527i);
        List listSubList = arrayList.subList(0, Math.min(arrayList.size(), 3));
        this.f18194c = new ArrayList(listSubList);
        listSubList.clear();
        this.f18195d = arrayList;
        notifyDataSetChanged();
    }

    public int getItemViewType(int i) {
        return m21532G(i) ? 1 : 2;
    }
}
