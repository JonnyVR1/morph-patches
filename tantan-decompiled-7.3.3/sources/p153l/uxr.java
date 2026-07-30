package p153l;

import android.view.View;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTracker;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class uxr<V extends View> extends d3q<V> {
    public static final int TOTAL_SPAN_COUNT = 6;
    private final ph4 autoPlayHelper = new ph4(this);
    protected final hk4 cardContext;

    public uxr(hk4 hk4Var) {
        this.cardContext = hk4Var;
    }

    /* JADX INFO: renamed from: H */
    public ph4 m198509H() {
        return this.autoPlayHelper;
    }

    /* JADX INFO: renamed from: K */
    public boolean m198510K(V v2, Object obj) {
        return this.autoPlayHelper.m172317b(v2, obj);
    }

    /* JADX INFO: renamed from: L */
    public void m198511L(LiveCardTrackData liveCardTrackData) {
        LiveCardTracker.trackMc(liveCardTrackData);
    }

    /* JADX INFO: renamed from: N */
    public void m198512N(j80 j80Var, LiveCardTrackData liveCardTrackData) {
        liveCardTrackData.put("is_return_search", j80Var.m143821c() ? "1" : "0");
        liveCardTrackData.put("is_gif", m198509H().m172319d() ? "1" : "0");
        LiveCardTracker.trackMv(liveCardTrackData);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: v */
    public void mo71942v(V v2, @NonNull List<Object> list) {
        super.mo71942v(v2, list);
        if (m198510K(v2, list.get(0))) {
            return;
        }
        mo71749u(v2);
        mo138340I(v2);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: y */
    public void mo113890y(V v2) {
        super.mo113890y(v2);
        this.autoPlayHelper.m172318c(v2);
    }

    /* JADX INFO: renamed from: I */
    public void mo138340I(V v2) {
    }

    /* JADX INFO: renamed from: J */
    public void mo96606J(View view) {
    }
}
