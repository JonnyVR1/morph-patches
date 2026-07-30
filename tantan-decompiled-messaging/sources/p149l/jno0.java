package p149l;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class jno0 extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j */
    public g30<BLiveVoiceCpHouseInfo, Boolean, Boolean> f118873j;

    /* JADX INFO: renamed from: l.jno0$a */
    public static class C17826a extends RecyclerView.AbstractC0576n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0588z c0588z) {
            if (recyclerView.getChildAdapterPosition(view) != 0) {
                rect.top = 0;
                rect.bottom = 0;
                rect.left = 0;
                rect.right = 0;
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    private List<d1q<?>> m142379e0(List<BLiveVoiceCpHouseInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new coo0(list.get(i), this.f118873j));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f0 */
    public void m142380f0(List<BLiveVoiceCpHouseInfo> list) {
        m67372a0(m142379e0(list), false);
    }

    /* JADX INFO: renamed from: g0 */
    public void m142381g0(g30<BLiveVoiceCpHouseInfo, Boolean, Boolean> g30Var) {
        this.f118873j = g30Var;
    }
}
