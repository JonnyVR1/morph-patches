package p153l;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class nwo0 extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j */
    public a30<BLiveVoiceCpHouseInfo, Boolean, Boolean> f143987j;

    /* JADX INFO: renamed from: l.nwo0$a */
    public static class C18967a extends RecyclerView.AbstractC0578n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0561a0 c0561a0) {
            if (recyclerView.getChildAdapterPosition(view) != 0) {
                rect.top = 0;
                rect.bottom = 0;
                rect.left = 0;
                rect.right = 0;
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    private List<d3q<?>> m164999e0(List<BLiveVoiceCpHouseInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new gxo0(list.get(i), this.f143987j));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f0 */
    public void m165000f0(List<BLiveVoiceCpHouseInfo> list) {
        m68555a0(m164999e0(list), false);
    }

    /* JADX INFO: renamed from: g0 */
    public void m165001g0(a30<BLiveVoiceCpHouseInfo, Boolean, Boolean> a30Var) {
        this.f143987j = a30Var;
    }
}
