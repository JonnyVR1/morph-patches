package p149l;

import com.p046p1.mobile.putong.core.data.NotificationStatus;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class qvr0 implements ymr0 {
    @Override // p149l.ymr0
    /* JADX INFO: renamed from: c */
    public final ymr0 mo95833c(String str, a9x0 a9x0Var, List<ymr0> list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof qvr0;
    }

    @Override // p149l.ymr0
    public final ymr0 zzc() {
        return ymr0.f199051w0;
    }

    @Override // p149l.ymr0
    public final Boolean zzd() {
        return Boolean.FALSE;
    }

    @Override // p149l.ymr0
    public final Double zze() {
        return Double.valueOf(Double.NaN);
    }

    @Override // p149l.ymr0
    public final String zzf() {
        return NotificationStatus.undefined;
    }

    @Override // p149l.ymr0
    public final Iterator<ymr0> zzh() {
        return null;
    }
}
