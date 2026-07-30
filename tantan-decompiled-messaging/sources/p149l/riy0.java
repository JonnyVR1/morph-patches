package p149l;

import android.content.Context;
import android.media.AudioFormat;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class riy0 {

    /* JADX INFO: renamed from: a */
    public Boolean f159613a;

    public riy0(@Nullable Context context) {
    }

    /* JADX INFO: renamed from: a */
    public final zfy0 m179539a(mhr0 mhr0Var, qux0 qux0Var) {
        mhr0Var.getClass();
        qux0Var.getClass();
        int i = ggw0.f102568a;
        if (i < 29 || mhr0Var.f133906z == -1) {
            return zfy0.f202996d;
        }
        if (this.f159613a == null) {
            this.f159613a = Boolean.FALSE;
        }
        String str = mhr0Var.f133892l;
        str.getClass();
        int iM196364a = uys0.m196364a(str, mhr0Var.f133889i);
        if (iM196364a == 0 || i < ggw0.m126079u(iM196364a)) {
            return zfy0.f202996d;
        }
        int iM126080v = ggw0.m126080v(mhr0Var.f133905y);
        if (iM126080v == 0) {
            return zfy0.f202996d;
        }
        try {
            AudioFormat audioFormatM126054K = ggw0.m126054K(mhr0Var.f133906z, iM126080v, iM196364a);
            return i >= 31 ? qiy0.m174924a(audioFormatM126054K, qux0Var.m176664a().f139488a, false) : piy0.m169766a(audioFormatM126054K, qux0Var.m176664a().f139488a, false);
        } catch (IllegalArgumentException unused) {
            return zfy0.f202996d;
        }
    }

    public riy0() {
    }
}
