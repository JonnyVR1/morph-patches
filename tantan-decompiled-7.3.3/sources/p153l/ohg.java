package p153l;

import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BFansRecallUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ohg extends LiveBaseAdapter {

    /* JADX INFO: renamed from: k */
    public View f147443k;

    /* JADX INFO: renamed from: j */
    public ArrayList<d3q<?>> f147442j = new ArrayList<>();

    /* JADX INFO: renamed from: l */
    public q5m f147444l = new C19133a();

    /* JADX INFO: renamed from: l.ohg$a */
    public class C19133a implements q5m {
        public C19133a() {
        }

        @Override // p153l.q5m
        /* JADX INFO: renamed from: a */
        public void mo167701a(iig iigVar) {
            boolean z;
            Iterator<d3q<?>> it = ohg.this.f147442j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                } else if (!((iig) it.next()).m140067K().isSelected()) {
                    z = false;
                    break;
                }
            }
            if (ohg.this.f147443k != null) {
                ohg.this.f147443k.setSelected(z);
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final List<d3q<?>> m167696f0(y8s y8sVar, yhg yhgVar) {
        this.f147442j.clear();
        for (BFansRecallUser bFansRecallUser : yhgVar.m215960b().users) {
            if (bFansRecallUser.following && bFansRecallUser.followed && !bFansRecallUser.isRecalled) {
                iig iigVar = new iig(y8sVar, this.f147444l);
                bFansRecallUser.setSelected(true);
                iigVar.m140069O(bFansRecallUser, yhgVar.m215959a());
                this.f147442j.add(iigVar);
            }
        }
        return this.f147442j;
    }

    /* JADX INFO: renamed from: g0 */
    public void m167697g0(boolean z) {
        Iterator<d3q<?>> it = this.f147442j.iterator();
        while (it.hasNext()) {
            ((iig) it.next()).m140067K().setSelected(z);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: h0 */
    public String m167698h0() {
        JSONArray jSONArray = new JSONArray();
        Iterator<d3q<?>> it = this.f147442j.iterator();
        while (it.hasNext()) {
            iig iigVar = (iig) it.next();
            if (iigVar.m140067K().isSelected()) {
                jSONArray.add(iigVar.m140067K().userId);
            }
        }
        return jSONArray.toJSONString();
    }

    /* JADX INFO: renamed from: i0 */
    public void m167699i0(View view) {
        this.f147443k = view;
    }

    /* JADX INFO: renamed from: j0 */
    public void m167700j0(y8s y8sVar, yhg yhgVar) {
        m68554Z(m167696f0(y8sVar, yhgVar));
    }
}
