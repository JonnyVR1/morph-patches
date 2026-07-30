package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.arch.card.carddata.LiveQuickEntryCardData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class q7v extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j */
    public z20<LiveQuickEntryCardData, Integer> f156004j;

    /* JADX INFO: renamed from: k */
    public List<LiveQuickEntryCardData> f156005k = new ArrayList();

    /* JADX INFO: renamed from: f0 */
    private List<d3q<?>> m175708f0() {
        ArrayList arrayList = new ArrayList();
        for (final int i = 0; i < this.f156005k.size(); i++) {
            final LiveQuickEntryCardData liveQuickEntryCardData = this.f156005k.get(i);
            s7v s7vVar = new s7v(liveQuickEntryCardData);
            s7vVar.mo113881A(new View.OnClickListener() { // from class: l.p7v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f150965a.m175709g0(liveQuickEntryCardData, i, view);
                }
            });
            arrayList.add(s7vVar);
        }
        return arrayList;
    }

    @Override // com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter
    /* JADX INFO: renamed from: L */
    public View mo68540L(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(xec0.f193840Z1, viewGroup, false);
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m175709g0(LiveQuickEntryCardData liveQuickEntryCardData, int i, View view) {
        this.f156004j.call(liveQuickEntryCardData, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: h0 */
    public void m175710h0(List<LiveQuickEntryCardData> list) {
        this.f156005k = list;
        m68554Z(m175708f0());
    }

    /* JADX INFO: renamed from: i0 */
    public void m175711i0(z20<LiveQuickEntryCardData, Integer> z20Var) {
        this.f156004j = z20Var;
    }
}
