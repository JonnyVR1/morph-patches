package p002l;

import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gm0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f11509a;

    /* JADX INFO: renamed from: b */
    public final BLiveCommonViewConfig f11510b;

    public gm0(BLiveEnvelope bLiveEnvelope) {
        this.f11509a = String.valueOf(bLiveEnvelope.data.version);
        this.f11510b = bLiveEnvelope.data.anchorFanbaseMedal;
    }

    /* JADX INFO: renamed from: a */
    public static gm0 m13897a() {
        return new gm0();
    }

    /* JADX INFO: renamed from: b */
    public boolean m13898b() {
        return this.f11509a == null && this.f11510b == null;
    }

    public gm0() {
        this.f11509a = null;
        this.f11510b = null;
    }
}
