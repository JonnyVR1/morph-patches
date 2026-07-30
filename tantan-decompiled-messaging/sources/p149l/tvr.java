package p149l;

import android.view.View;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTracker;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class tvr<V extends View> extends d1q<V> {
    public static final int TOTAL_SPAN_COUNT = 6;
    private final qg4 autoPlayHelper = new qg4(this);
    protected final ij4 cardContext;

    public tvr(ij4 ij4Var) {
        this.cardContext = ij4Var;
    }

    /* JADX INFO: renamed from: H */
    public qg4 m190776H() {
        return this.autoPlayHelper;
    }

    /* JADX INFO: renamed from: K */
    public boolean m190777K(V v2, Object obj) {
        return this.autoPlayHelper.m174380b(v2, obj);
    }

    /* JADX INFO: renamed from: L */
    public void m190778L(LiveCardTrackData liveCardTrackData) {
        LiveCardTracker.trackMc(liveCardTrackData);
    }

    /* JADX INFO: renamed from: N */
    public void m190779N(n80 n80Var, LiveCardTrackData liveCardTrackData) {
        liveCardTrackData.put("is_return_search", n80Var.m158175c() ? "1" : "0");
        liveCardTrackData.put("is_gif", m190776H().m174382d() ? "1" : "0");
        LiveCardTracker.trackMv(liveCardTrackData);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: v */
    public void mo70759v(V v2, @NonNull List<Object> list) {
        super.mo70759v(v2, list);
        if (m190777K(v2, list.get(0))) {
            return;
        }
        mo70566u(v2);
        mo129075I(v2);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: y */
    public void mo109672y(V v2) {
        super.mo109672y(v2);
        this.autoPlayHelper.m174381c(v2);
    }

    /* JADX INFO: renamed from: I */
    public void mo129075I(V v2) {
    }

    /* JADX INFO: renamed from: J */
    public void mo101240J(View view) {
    }
}
