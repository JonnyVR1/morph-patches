package p149l;

import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import com.p046p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import p149l.s7m;

/* JADX INFO: loaded from: classes13.dex */
public abstract class k0o<V extends s7m> extends lss<V> {

    /* JADX INFO: renamed from: f */
    public bs5 f120501f;

    /* JADX INFO: renamed from: g */
    public int f120502g;

    /* JADX INFO: renamed from: h */
    public boolean f120503h;

    /* JADX INFO: renamed from: i */
    public int f120504i;

    /* JADX INFO: renamed from: j */
    public final int f120505j;

    /* JADX INFO: renamed from: k */
    public BLiveSquareTab f120506k;

    public k0o(mcr mcrVar, mss mssVar) {
        super(mcrVar, mssVar);
        this.f120501f = new bs5();
        this.f120502g = 60;
        this.f120504i = 600;
        this.f120505j = 3000;
        m144085Q2();
    }

    /* JADX INFO: renamed from: P2 */
    public int m144084P2() {
        return this.f120504i;
    }

    /* JADX INFO: renamed from: Q2 */
    public void m144085Q2() {
        BLiveConfig bLiveConfig;
        BLiveSettings bLiveSettingsM195583A3 = s9s.f163228b.m195583A3();
        if (bLiveSettingsM195583A3 == null || (bLiveConfig = bLiveSettingsM195583A3.liveConfig) == null) {
            return;
        }
        int i = bLiveConfig.liveSquareRefreshListInterval;
        if (i > 0) {
            this.f120504i = i;
        }
        if (this.f120502g > 0) {
            this.f120502g = bLiveConfig.liveSquareRefreshStateInterval;
        }
    }

    /* JADX INFO: renamed from: R2 */
    public void mo144086R2(BLiveSuggestLive bLiveSuggestLive, String str, String str2, String str3) {
        getAct().startActivity(s9s.f163232f.m134373f(getAct(), AudienceStartData.getBuilder().m67592C(true).m67593D(bLiveSuggestLive.expendToFullLive()).m67604O(str).m67597H("type_normal_live").m67602M(this.f120503h).m67615y(str2).m67611u()));
    }

    /* JADX INFO: renamed from: S2 */
    public void m144087S2(boolean z) {
        this.f120503h = z;
    }

    /* JADX INFO: renamed from: T2 */
    public void m144088T2(BLiveSquareTab bLiveSquareTab) {
        this.f120506k = bLiveSquareTab;
    }

    /* JADX INFO: renamed from: U2 */
    public String m144089U2() {
        return getClass().getSimpleName();
    }
}
