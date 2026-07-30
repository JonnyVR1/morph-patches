package p153l;

import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;

/* JADX INFO: loaded from: classes4.dex */
public class cm0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f82501a;

    /* JADX INFO: renamed from: b */
    public final BLiveCommonViewConfig f82502b;

    public cm0(BLiveEnvelope bLiveEnvelope) {
        this.f82501a = String.valueOf(bLiveEnvelope.data.version);
        this.f82502b = bLiveEnvelope.data.anchorFanbaseMedal;
    }

    /* JADX INFO: renamed from: a */
    public static cm0 m111074a() {
        return new cm0();
    }

    /* JADX INFO: renamed from: b */
    public boolean m111075b() {
        return this.f82501a == null && this.f82502b == null;
    }

    public cm0() {
        this.f82501a = null;
        this.f82502b = null;
    }
}
