package p153l;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class szo0 extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j */
    public y20<BLiveVoiceCpHouseInfo> f171409j;

    /* JADX INFO: renamed from: l.szo0$a */
    public static class C20196a extends RecyclerView.AbstractC0578n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0561a0 c0561a0) {
            int iM175859d = qa00.m175859d(7.5f);
            rect.set(iM175859d, iM175859d, iM175859d, iM175859d);
        }
    }

    /* JADX INFO: renamed from: e0 */
    private List<d3q<?>> m188661e0(List<BLiveVoiceCpHouseInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new uzo0(list.get(i), this.f171409j));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f0 */
    public void m188662f0(List<BLiveVoiceCpHouseInfo> list) {
        m68555a0(m188661e0(list), false);
    }

    /* JADX INFO: renamed from: g0 */
    public void m188663g0(y20<BLiveVoiceCpHouseInfo> y20Var) {
        this.f171409j = y20Var;
    }
}
