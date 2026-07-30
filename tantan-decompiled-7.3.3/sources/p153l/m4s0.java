package p153l;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public final class m4s0 extends x5s0 {
    public m4s0(b4s0 b4s0Var, String str, String str2, fzr0 fzr0Var, int i, int i2) {
        super(b4s0Var, "IcH9chIM8pdQBP/eeaIVQOxIkEFtHwPKwBzAXjYRdyw5KOKrZsfN3FYxHItVH2IL", "WQCGmUFTrgSOZ83nswxrNh39wVE6t1Ouq3E0zMLvIMA=", fzr0Var, i, 49);
    }

    @Override // p153l.x5s0
    /* JADX INFO: renamed from: a */
    public final void mo96251a() throws IllegalAccessException, InvocationTargetException {
        this.f192522e.m128294V(3);
        try {
            boolean zBooleanValue = ((Boolean) this.f192523f.invoke(null, this.f192519b.m102517b())).booleanValue();
            fzr0 fzr0Var = this.f192522e;
            int i = 1;
            if (true == zBooleanValue) {
                i = 2;
            }
            fzr0Var.m128294V(i);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
