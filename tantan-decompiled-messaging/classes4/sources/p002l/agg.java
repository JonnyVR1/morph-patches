package p002l;

import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p1.mobile.putong.live.base.data.BFansRecallUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.d1q;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class agg extends LiveBaseAdapter {

    /* JADX INFO: renamed from: k */
    public View f7597k;

    /* JADX INFO: renamed from: j */
    public ArrayList<d1q<?>> f7596j = new ArrayList<>();

    /* JADX INFO: renamed from: l */
    public y2m f7598l = new C0487a();

    /* JADX INFO: renamed from: l.agg$a */
    public class C0487a implements y2m {
        public C0487a() {
        }

        @Override // p002l.y2m
        /* JADX INFO: renamed from: a */
        public void mo9632a(ugg uggVar) {
            boolean z;
            Iterator<d1q<?>> it = agg.this.f7596j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                } else if (!((ugg) it.next()).m23453K().isSelected()) {
                    z = false;
                    break;
                }
            }
            if (agg.this.f7597k != null) {
                agg.this.f7597k.setSelected(z);
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final List<d1q<?>> m9627f0(x6s x6sVar, kgg kggVar) {
        this.f7596j.clear();
        for (BFansRecallUser bFansRecallUser : kggVar.m16617b().users) {
            if (bFansRecallUser.following && bFansRecallUser.followed && !bFansRecallUser.isRecalled) {
                ugg uggVar = new ugg(x6sVar, this.f7598l);
                bFansRecallUser.setSelected(true);
                uggVar.m23455O(bFansRecallUser, kggVar.m16616a());
                this.f7596j.add(uggVar);
            }
        }
        return this.f7596j;
    }

    /* JADX INFO: renamed from: g0 */
    public void m9628g0(boolean z) {
        Iterator<d1q<?>> it = this.f7596j.iterator();
        while (it.hasNext()) {
            ((ugg) it.next()).m23453K().setSelected(z);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: h0 */
    public String m9629h0() {
        JSONArray jSONArray = new JSONArray();
        Iterator<d1q<?>> it = this.f7596j.iterator();
        while (it.hasNext()) {
            ugg uggVar = (ugg) it.next();
            if (uggVar.m23453K().isSelected()) {
                jSONArray.add(uggVar.m23453K().userId);
            }
        }
        return jSONArray.toJSONString();
    }

    /* JADX INFO: renamed from: i0 */
    public void m9630i0(View view) {
        this.f7597k = view;
    }

    /* JADX INFO: renamed from: j0 */
    public void m9631j0(x6s x6sVar, kgg kggVar) {
        Z(m9627f0(x6sVar, kggVar));
    }
}
