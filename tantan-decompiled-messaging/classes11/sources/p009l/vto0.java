package p009l;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.longlink.msg.liveroom.VoiceSweet;
import com.p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.ArrayList;
import java.util.List;
import l.d1q;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class vto0 extends LiveBaseAdapter {

    /* JADX INFO: renamed from: l.vto0$a */
    public static class C1276a extends RecyclerView.n {
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            int iC = zVar.c() - 1;
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition != -1 && zVar.c() > 3) {
                rect.top = 0;
                rect.bottom = 0;
                if (childAdapterPosition == 0) {
                    rect.left = t100.d(18.0f);
                    rect.right = 0;
                } else if (childAdapterPosition == iC) {
                    rect.left = 0;
                    rect.right = t100.d(18.0f);
                } else {
                    rect.right = 0;
                    rect.left = 0;
                }
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    private List<d1q<?>> m23730e0(List<VoiceSweet.VoiceCpHouseReward> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new wto0(list.get(i)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f0 */
    public void m23731f0(List<VoiceSweet.VoiceCpHouseReward> list) {
        a0(m23730e0(list), false);
    }
}
