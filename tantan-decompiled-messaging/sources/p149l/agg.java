package p149l;

import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BFansRecallUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class agg extends LiveBaseAdapter {

    /* JADX INFO: renamed from: k */
    public View f69360k;

    /* JADX INFO: renamed from: j */
    public ArrayList<d1q<?>> f69359j = new ArrayList<>();

    /* JADX INFO: renamed from: l */
    public y2m f69361l = new C15610a();

    /* JADX INFO: renamed from: l.agg$a */
    public class C15610a implements y2m {
        public C15610a() {
        }

        @Override // p149l.y2m
        /* JADX INFO: renamed from: a */
        public void mo96309a(ugg uggVar) {
            boolean z;
            Iterator<d1q<?>> it = agg.this.f69359j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                } else if (!((ugg) it.next()).m193559K().isSelected()) {
                    z = false;
                    break;
                }
            }
            if (agg.this.f69360k != null) {
                agg.this.f69360k.setSelected(z);
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final List<d1q<?>> m96304f0(x6s x6sVar, kgg kggVar) {
        this.f69359j.clear();
        for (BFansRecallUser bFansRecallUser : kggVar.m145891b().users) {
            if (bFansRecallUser.following && bFansRecallUser.followed && !bFansRecallUser.isRecalled) {
                ugg uggVar = new ugg(x6sVar, this.f69361l);
                bFansRecallUser.setSelected(true);
                uggVar.m193561O(bFansRecallUser, kggVar.m145890a());
                this.f69359j.add(uggVar);
            }
        }
        return this.f69359j;
    }

    /* JADX INFO: renamed from: g0 */
    public void m96305g0(boolean z) {
        Iterator<d1q<?>> it = this.f69359j.iterator();
        while (it.hasNext()) {
            ((ugg) it.next()).m193559K().setSelected(z);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: h0 */
    public String m96306h0() {
        JSONArray jSONArray = new JSONArray();
        Iterator<d1q<?>> it = this.f69359j.iterator();
        while (it.hasNext()) {
            ugg uggVar = (ugg) it.next();
            if (uggVar.m193559K().isSelected()) {
                jSONArray.add(uggVar.m193559K().userId);
            }
        }
        return jSONArray.toJSONString();
    }

    /* JADX INFO: renamed from: i0 */
    public void m96307i0(View view) {
        this.f69360k = view;
    }

    /* JADX INFO: renamed from: j0 */
    public void m96308j0(x6s x6sVar, kgg kggVar) {
        m67371Z(m96304f0(x6sVar, kggVar));
    }
}
