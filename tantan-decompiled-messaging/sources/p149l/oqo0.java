package p149l;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class oqo0 extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j */
    public e30<BLiveVoiceCpHouseInfo> f145174j;

    /* JADX INFO: renamed from: l.oqo0$a */
    public static class C19002a extends RecyclerView.AbstractC0576n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0588z c0588z) {
            int iM186890d = t100.m186890d(7.5f);
            rect.set(iM186890d, iM186890d, iM186890d, iM186890d);
        }
    }

    /* JADX INFO: renamed from: e0 */
    private List<d1q<?>> m165473e0(List<BLiveVoiceCpHouseInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new qqo0(list.get(i), this.f145174j));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f0 */
    public void m165474f0(List<BLiveVoiceCpHouseInfo> list) {
        m67372a0(m165473e0(list), false);
    }

    /* JADX INFO: renamed from: g0 */
    public void m165475g0(e30<BLiveVoiceCpHouseInfo> e30Var) {
        this.f145174j = e30Var;
    }
}
