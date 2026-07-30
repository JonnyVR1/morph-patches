package p009l;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import java.util.ArrayList;
import java.util.List;
import l.d1q;
import l.g30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class jno0 extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j */
    public g30<BLiveVoiceCpHouseInfo, Boolean, Boolean> f15241j;

    /* JADX INFO: renamed from: l.jno0$a */
    public static class C0978a extends RecyclerView.n {
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            if (recyclerView.getChildAdapterPosition(view) != 0) {
                rect.top = 0;
                rect.bottom = 0;
                rect.left = 0;
                rect.right = 0;
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    private List<d1q<?>> m17176e0(List<BLiveVoiceCpHouseInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new coo0(list.get(i), this.f15241j));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f0 */
    public void m17177f0(List<BLiveVoiceCpHouseInfo> list) {
        a0(m17176e0(list), false);
    }

    /* JADX INFO: renamed from: g0 */
    public void m17178g0(g30<BLiveVoiceCpHouseInfo, Boolean, Boolean> g30Var) {
        this.f15241j = g30Var;
    }
}
