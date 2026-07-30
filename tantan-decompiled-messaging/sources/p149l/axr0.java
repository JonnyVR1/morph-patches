package p149l;

import com.google.android.gms.internal.measurement.zzbv;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class axr0 {

    /* JADX INFO: renamed from: a */
    public final List<zzbv> f72232a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final ymr0 m99518a(String str) {
        if (!this.f72232a.contains(nhw0.m159466c(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: " + str);
    }

    /* JADX INFO: renamed from: b */
    public abstract ymr0 mo99519b(String str, a9x0 a9x0Var, List<ymr0> list);
}
