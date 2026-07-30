package p009l;

import android.content.Context;
import com.p008ss.android.ttvecamera.TEVBoostInterface;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class xjh0 implements a4m {
    @Override // p009l.a4m
    /* JADX INFO: renamed from: a */
    public void mo11189a() {
        TEVBoostInterface.VBoostCapabilityType vBoostCapabilityType = TEVBoostInterface.VBoostCapabilityType.CPU_FREQ_MIN;
        if (TEVBoostInterface.m10896c(vBoostCapabilityType)) {
            TEVBoostInterface.m10894a(vBoostCapabilityType);
        }
        TEVBoostInterface.VBoostCapabilityType vBoostCapabilityType2 = TEVBoostInterface.VBoostCapabilityType.CPU_FREQ_MAX;
        if (TEVBoostInterface.m10896c(vBoostCapabilityType2)) {
            TEVBoostInterface.m10894a(vBoostCapabilityType2);
        }
    }

    @Override // p009l.a4m
    /* JADX INFO: renamed from: b */
    public void mo11190b(int i) {
        TEVBoostInterface.VBoostCapabilityType vBoostCapabilityType = TEVBoostInterface.VBoostCapabilityType.CPU_FREQ_MIN;
        if (TEVBoostInterface.m10896c(vBoostCapabilityType)) {
            TEVBoostInterface.m10897d(vBoostCapabilityType, 9, i);
        }
        TEVBoostInterface.VBoostCapabilityType vBoostCapabilityType2 = TEVBoostInterface.VBoostCapabilityType.CPU_FREQ_MAX;
        if (TEVBoostInterface.m10896c(vBoostCapabilityType2)) {
            TEVBoostInterface.m10897d(vBoostCapabilityType2, 9, i);
        }
    }

    @Override // p009l.a4m
    public void init(Context context) {
        TEVBoostInterface.m10895b(context);
    }
}
