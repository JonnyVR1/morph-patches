package p149l;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.longlink.msg.liveroom.VoiceSweet;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class vto0 extends LiveBaseAdapter {

    /* JADX INFO: renamed from: l.vto0$a */
    public static class C20729a extends RecyclerView.AbstractC0576n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0588z c0588z) {
            int iM3487c = c0588z.m3487c() - 1;
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition != -1 && c0588z.m3487c() > 3) {
                rect.top = 0;
                rect.bottom = 0;
                if (childAdapterPosition == 0) {
                    rect.left = t100.m186890d(18.0f);
                    rect.right = 0;
                } else if (childAdapterPosition == iM3487c) {
                    rect.left = 0;
                    rect.right = t100.m186890d(18.0f);
                } else {
                    rect.right = 0;
                    rect.left = 0;
                }
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    private List<d1q<?>> m200049e0(List<VoiceSweet.VoiceCpHouseReward> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new wto0(list.get(i)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f0 */
    public void m200050f0(List<VoiceSweet.VoiceCpHouseReward> list) {
        m67372a0(m200049e0(list), false);
    }
}
