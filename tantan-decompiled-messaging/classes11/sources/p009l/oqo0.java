package p009l;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import java.util.ArrayList;
import java.util.List;
import l.d1q;
import l.e30;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class oqo0 extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j */
    public e30<BLiveVoiceCpHouseInfo> f18213j;

    /* JADX INFO: renamed from: l.oqo0$a */
    public static class C1086a extends RecyclerView.n {
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            int iD = t100.d(7.5f);
            rect.set(iD, iD, iD, iD);
        }
    }

    /* JADX INFO: renamed from: e0 */
    private List<d1q<?>> m20010e0(List<BLiveVoiceCpHouseInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new qqo0(list.get(i), this.f18213j));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f0 */
    public void m20011f0(List<BLiveVoiceCpHouseInfo> list) {
        a0(m20010e0(list), false);
    }

    /* JADX INFO: renamed from: g0 */
    public void m20012g0(e30<BLiveVoiceCpHouseInfo> e30Var) {
        this.f18213j = e30Var;
    }
}
