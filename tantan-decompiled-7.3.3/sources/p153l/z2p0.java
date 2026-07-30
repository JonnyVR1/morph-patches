package p153l;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.longlink.msg.liveroom.VoiceSweet;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class z2p0 extends LiveBaseAdapter {

    /* JADX INFO: renamed from: l.z2p0$a */
    public static class C21751a extends RecyclerView.AbstractC0578n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0561a0 c0561a0) {
            int iM3361c = c0561a0.m3361c() - 1;
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition != -1 && c0561a0.m3361c() > 3) {
                rect.top = 0;
                rect.bottom = 0;
                if (childAdapterPosition == 0) {
                    rect.left = qa00.m175859d(18.0f);
                    rect.right = 0;
                } else if (childAdapterPosition == iM3361c) {
                    rect.left = 0;
                    rect.right = qa00.m175859d(18.0f);
                } else {
                    rect.right = 0;
                    rect.left = 0;
                }
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    private List<d3q<?>> m218454e0(List<VoiceSweet.VoiceCpHouseReward> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new a3p0(list.get(i)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f0 */
    public void m218455f0(List<VoiceSweet.VoiceCpHouseReward> list) {
        m68555a0(m218454e0(list), false);
    }
}
