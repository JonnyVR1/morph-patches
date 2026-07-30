package p149l;

import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;

/* JADX INFO: loaded from: classes4.dex */
public class gm0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f103417a;

    /* JADX INFO: renamed from: b */
    public final BLiveCommonViewConfig f103418b;

    public gm0(BLiveEnvelope bLiveEnvelope) {
        this.f103417a = String.valueOf(bLiveEnvelope.data.version);
        this.f103418b = bLiveEnvelope.data.anchorFanbaseMedal;
    }

    /* JADX INFO: renamed from: a */
    public static gm0 m126926a() {
        return new gm0();
    }

    /* JADX INFO: renamed from: b */
    public boolean m126927b() {
        return this.f103417a == null && this.f103418b == null;
    }

    public gm0() {
        this.f103417a = null;
        this.f103418b = null;
    }
}
