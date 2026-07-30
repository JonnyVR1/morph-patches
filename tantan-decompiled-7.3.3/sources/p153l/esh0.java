package p153l;

import android.content.Context;
import com.p074ss.android.ttvecamera.TEVBoostInterface;

/* JADX INFO: loaded from: classes11.dex */
public class esh0 implements q6m {
    @Override // p153l.q6m
    /* JADX INFO: renamed from: a */
    public void mo122357a() {
        TEVBoostInterface.VBoostCapabilityType vBoostCapabilityType = TEVBoostInterface.VBoostCapabilityType.CPU_FREQ_MIN;
        if (TEVBoostInterface.m81728c(vBoostCapabilityType)) {
            TEVBoostInterface.m81726a(vBoostCapabilityType);
        }
        TEVBoostInterface.VBoostCapabilityType vBoostCapabilityType2 = TEVBoostInterface.VBoostCapabilityType.CPU_FREQ_MAX;
        if (TEVBoostInterface.m81728c(vBoostCapabilityType2)) {
            TEVBoostInterface.m81726a(vBoostCapabilityType2);
        }
    }

    @Override // p153l.q6m
    /* JADX INFO: renamed from: b */
    public void mo122358b(int i) {
        TEVBoostInterface.VBoostCapabilityType vBoostCapabilityType = TEVBoostInterface.VBoostCapabilityType.CPU_FREQ_MIN;
        if (TEVBoostInterface.m81728c(vBoostCapabilityType)) {
            TEVBoostInterface.m81729d(vBoostCapabilityType, 9, i);
        }
        TEVBoostInterface.VBoostCapabilityType vBoostCapabilityType2 = TEVBoostInterface.VBoostCapabilityType.CPU_FREQ_MAX;
        if (TEVBoostInterface.m81728c(vBoostCapabilityType2)) {
            TEVBoostInterface.m81729d(vBoostCapabilityType2, 9, i);
        }
    }

    @Override // p153l.q6m
    public void init(Context context) {
        TEVBoostInterface.m81727b(context);
    }
}
