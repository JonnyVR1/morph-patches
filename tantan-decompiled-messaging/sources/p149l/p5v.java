package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.arch.card.carddata.LiveQuickEntryCardData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class p5v extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j */
    public f30<LiveQuickEntryCardData, Integer> f147328j;

    /* JADX INFO: renamed from: k */
    public List<LiveQuickEntryCardData> f147329k = new ArrayList();

    /* JADX INFO: renamed from: f0 */
    private List<d1q<?>> m167516f0() {
        ArrayList arrayList = new ArrayList();
        for (final int i = 0; i < this.f147329k.size(); i++) {
            final LiveQuickEntryCardData liveQuickEntryCardData = this.f147329k.get(i);
            r5v r5vVar = new r5v(liveQuickEntryCardData);
            r5vVar.mo109662A(new View.OnClickListener() { // from class: l.o5v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f141932a.m167517g0(liveQuickEntryCardData, i, view);
                }
            });
            arrayList.add(r5vVar);
        }
        return arrayList;
    }

    @Override // com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter
    /* JADX INFO: renamed from: L */
    public View mo67357L(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(s6c0.f162726Z1, viewGroup, false);
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m167517g0(LiveQuickEntryCardData liveQuickEntryCardData, int i, View view) {
        this.f147328j.call(liveQuickEntryCardData, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: h0 */
    public void m167518h0(List<LiveQuickEntryCardData> list) {
        this.f147329k = list;
        m67371Z(m167516f0());
    }

    /* JADX INFO: renamed from: i0 */
    public void m167519i0(f30<LiveQuickEntryCardData, Integer> f30Var) {
        this.f147328j = f30Var;
    }
}
