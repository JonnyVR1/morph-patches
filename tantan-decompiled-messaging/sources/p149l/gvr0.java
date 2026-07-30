package p149l;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public final class gvr0 extends rwr0 {
    public gvr0(vur0 vur0Var, String str, String str2, zpr0 zpr0Var, int i, int i2) {
        super(vur0Var, "IcH9chIM8pdQBP/eeaIVQOxIkEFtHwPKwBzAXjYRdyw5KOKrZsfN3FYxHItVH2IL", "WQCGmUFTrgSOZ83nswxrNh39wVE6t1Ouq3E0zMLvIMA=", zpr0Var, i, 49);
    }

    @Override // p149l.rwr0
    /* JADX INFO: renamed from: a */
    public final void mo99305a() throws IllegalAccessException, InvocationTargetException {
        this.f161371e.m219759V(3);
        try {
            boolean zBooleanValue = ((Boolean) this.f161372f.invoke(null, this.f161368b.m200101b())).booleanValue();
            zpr0 zpr0Var = this.f161371e;
            int i = 1;
            if (true == zBooleanValue) {
                i = 2;
            }
            zpr0Var.m219759V(i);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
