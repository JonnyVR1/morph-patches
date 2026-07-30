package p149l;

import android.content.Context;
import com.p069ss.android.ttvecamera.TEVBoostInterface;

/* JADX INFO: loaded from: classes11.dex */
public class xjh0 implements a4m {
    @Override // p149l.a4m
    /* JADX INFO: renamed from: a */
    public void mo94923a() {
        TEVBoostInterface.VBoostCapabilityType vBoostCapabilityType = TEVBoostInterface.VBoostCapabilityType.CPU_FREQ_MIN;
        if (TEVBoostInterface.m80545c(vBoostCapabilityType)) {
            TEVBoostInterface.m80543a(vBoostCapabilityType);
        }
        TEVBoostInterface.VBoostCapabilityType vBoostCapabilityType2 = TEVBoostInterface.VBoostCapabilityType.CPU_FREQ_MAX;
        if (TEVBoostInterface.m80545c(vBoostCapabilityType2)) {
            TEVBoostInterface.m80543a(vBoostCapabilityType2);
        }
    }

    @Override // p149l.a4m
    /* JADX INFO: renamed from: b */
    public void mo94924b(int i) {
        TEVBoostInterface.VBoostCapabilityType vBoostCapabilityType = TEVBoostInterface.VBoostCapabilityType.CPU_FREQ_MIN;
        if (TEVBoostInterface.m80545c(vBoostCapabilityType)) {
            TEVBoostInterface.m80546d(vBoostCapabilityType, 9, i);
        }
        TEVBoostInterface.VBoostCapabilityType vBoostCapabilityType2 = TEVBoostInterface.VBoostCapabilityType.CPU_FREQ_MAX;
        if (TEVBoostInterface.m80545c(vBoostCapabilityType2)) {
            TEVBoostInterface.m80546d(vBoostCapabilityType2, 9, i);
        }
    }

    @Override // p149l.a4m
    public void init(Context context) {
        TEVBoostInterface.m80544b(context);
    }
}
