package p153l;

import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveSettings;
import com.p051p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import p153l.iam;

/* JADX INFO: loaded from: classes9.dex */
public abstract class k2o<V extends iam> extends mus<V> {

    /* JADX INFO: renamed from: f */
    public ft5 f123626f;

    /* JADX INFO: renamed from: g */
    public int f123627g;

    /* JADX INFO: renamed from: h */
    public boolean f123628h;

    /* JADX INFO: renamed from: i */
    public int f123629i;

    /* JADX INFO: renamed from: j */
    public final int f123630j;

    /* JADX INFO: renamed from: k */
    public BLiveSquareTab f123631k;

    public k2o(ner nerVar, nus nusVar) {
        super(nerVar, nusVar);
        this.f123626f = new ft5();
        this.f123627g = 60;
        this.f123629i = 600;
        this.f123630j = 3000;
        m147981Q2();
    }

    /* JADX INFO: renamed from: P2 */
    public int m147980P2() {
        return this.f123629i;
    }

    /* JADX INFO: renamed from: Q2 */
    public void m147981Q2() {
        BLiveConfig bLiveConfig;
        BLiveSettings bLiveSettingsM203370A3 = tbs.f172989b.m203370A3();
        if (bLiveSettingsM203370A3 == null || (bLiveConfig = bLiveSettingsM203370A3.liveConfig) == null) {
            return;
        }
        int i = bLiveConfig.liveSquareRefreshListInterval;
        if (i > 0) {
            this.f123629i = i;
        }
        if (this.f123627g > 0) {
            this.f123627g = bLiveConfig.liveSquareRefreshStateInterval;
        }
    }

    /* JADX INFO: renamed from: R2 */
    public void mo147982R2(BLiveSuggestLive bLiveSuggestLive, String str, String str2, String str3) {
        getAct().startActivity(tbs.f172993f.m143704f(getAct(), AudienceStartData.getBuilder().m68775C(true).m68776D(bLiveSuggestLive.expendToFullLive()).m68787O(str).m68780H("type_normal_live").m68785M(this.f123628h).m68798y(str2).m68794u()));
    }

    /* JADX INFO: renamed from: S2 */
    public void m147983S2(boolean z) {
        this.f123628h = z;
    }

    /* JADX INFO: renamed from: T2 */
    public void m147984T2(BLiveSquareTab bLiveSquareTab) {
        this.f123631k = bLiveSquareTab;
    }

    /* JADX INFO: renamed from: U2 */
    public String m147985U2() {
        return getClass().getSimpleName();
    }
}
