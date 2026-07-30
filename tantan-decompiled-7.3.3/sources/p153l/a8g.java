package p153l;

import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBaseDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBaseHierarchy;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBaseMedal;

/* JADX INFO: loaded from: classes4.dex */
public class a8g {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final BLiveFanBaseDetail f68918a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final BLiveFanBaseHierarchy f68919b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final BLiveFanBaseMedal f68920c;

    public a8g(BLiveEnvelope bLiveEnvelope, final String str) {
        this.f68918a = (BLiveFanBaseDetail) jyb.m147529r(bLiveEnvelope.data.fanbaseDetails, new qcj() { // from class: l.y7g
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveFanBaseDetail) obj).f45212id.equals(str));
            }
        });
        this.f68919b = (BLiveFanBaseHierarchy) jyb.m147529r(bLiveEnvelope.data.fanbaseHierarchies, new qcj() { // from class: l.z7g
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveFanBaseHierarchy) obj).fanbaseId.equals(str));
            }
        });
        if (jyb.m147479J(bLiveEnvelope.data.fanbaseMedals)) {
            this.f68920c = null;
        } else {
            this.f68920c = bLiveEnvelope.data.fanbaseMedals.get(0);
        }
    }
}
