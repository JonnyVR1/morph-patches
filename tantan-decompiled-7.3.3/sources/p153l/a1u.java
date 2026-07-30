package p153l;

import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveSettings;
import com.p051p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import p153l.iam;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a1u<V extends iam> extends mus<V> {

    /* JADX INFO: renamed from: f */
    public ft5 f67847f;

    /* JADX INFO: renamed from: g */
    public int f67848g;

    /* JADX INFO: renamed from: h */
    public boolean f67849h;

    /* JADX INFO: renamed from: i */
    public int f67850i;

    /* JADX INFO: renamed from: j */
    public final int f67851j;

    /* JADX INFO: renamed from: k */
    public BLiveSquareTab f67852k;

    public a1u(ner nerVar, nus nusVar) {
        super(nerVar, nusVar);
        this.f67847f = new ft5();
        this.f67848g = 60;
        this.f67850i = 600;
        this.f67851j = 3000;
        m95555Q2();
    }

    /* JADX INFO: renamed from: P2 */
    public int m95554P2() {
        return this.f67850i;
    }

    /* JADX INFO: renamed from: Q2 */
    public void m95555Q2() {
        BLiveConfig bLiveConfig;
        BLiveSettings bLiveSettingsM203370A3 = tbs.f172989b.m203370A3();
        if (bLiveSettingsM203370A3 == null || (bLiveConfig = bLiveSettingsM203370A3.liveConfig) == null) {
            return;
        }
        int i = bLiveConfig.liveSquareRefreshListInterval;
        if (i > 0) {
            this.f67850i = i;
        }
        if (this.f67848g > 0) {
            this.f67848g = bLiveConfig.liveSquareRefreshStateInterval;
        }
    }

    /* JADX INFO: renamed from: R2 */
    public void mo70293R2(BLiveSuggestLive bLiveSuggestLive, String str, String str2) {
        getAct().startActivity(tbs.f172993f.m143704f(getAct(), AudienceStartData.getBuilder().m68775C(true).m68776D(bLiveSuggestLive.expendToFullLive()).m68787O(str).m68780H("type_normal_live").m68785M(this.f67849h).m68798y(str2).m68794u()));
    }

    /* JADX INFO: renamed from: S2 */
    public void m95556S2(BLiveSquareTab bLiveSquareTab) {
        this.f67852k = bLiveSquareTab;
    }

    /* JADX INFO: renamed from: T2 */
    public String m95557T2() {
        return getClass().getSimpleName();
    }
}
