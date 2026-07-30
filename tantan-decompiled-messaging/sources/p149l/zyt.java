package p149l;

import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import com.p046p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import p149l.s7m;

/* JADX INFO: loaded from: classes13.dex */
public abstract class zyt<V extends s7m> extends lss<V> {

    /* JADX INFO: renamed from: f */
    public bs5 f205725f;

    /* JADX INFO: renamed from: g */
    public int f205726g;

    /* JADX INFO: renamed from: h */
    public boolean f205727h;

    /* JADX INFO: renamed from: i */
    public int f205728i;

    /* JADX INFO: renamed from: j */
    public final int f205729j;

    /* JADX INFO: renamed from: k */
    public BLiveSquareTab f205730k;

    public zyt(mcr mcrVar, mss mssVar) {
        super(mcrVar, mssVar);
        this.f205725f = new bs5();
        this.f205726g = 60;
        this.f205728i = 600;
        this.f205729j = 3000;
        m220947Q2();
    }

    /* JADX INFO: renamed from: P2 */
    public int m220946P2() {
        return this.f205728i;
    }

    /* JADX INFO: renamed from: Q2 */
    public void m220947Q2() {
        BLiveConfig bLiveConfig;
        BLiveSettings bLiveSettingsM195583A3 = s9s.f163228b.m195583A3();
        if (bLiveSettingsM195583A3 == null || (bLiveConfig = bLiveSettingsM195583A3.liveConfig) == null) {
            return;
        }
        int i = bLiveConfig.liveSquareRefreshListInterval;
        if (i > 0) {
            this.f205728i = i;
        }
        if (this.f205726g > 0) {
            this.f205726g = bLiveConfig.liveSquareRefreshStateInterval;
        }
    }

    /* JADX INFO: renamed from: R2 */
    public void mo69110R2(BLiveSuggestLive bLiveSuggestLive, String str, String str2) {
        getAct().startActivity(s9s.f163232f.m134373f(getAct(), AudienceStartData.getBuilder().m67592C(true).m67593D(bLiveSuggestLive.expendToFullLive()).m67604O(str).m67597H("type_normal_live").m67602M(this.f205727h).m67615y(str2).m67611u()));
    }

    /* JADX INFO: renamed from: S2 */
    public void m220948S2(BLiveSquareTab bLiveSquareTab) {
        this.f205730k = bLiveSquareTab;
    }

    /* JADX INFO: renamed from: T2 */
    public String m220949T2() {
        return getClass().getSimpleName();
    }
}
