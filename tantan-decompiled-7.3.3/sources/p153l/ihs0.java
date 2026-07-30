package p153l;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ihs0 {

    /* JADX INFO: renamed from: a */
    public final Map f115015a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final khs0 f115016b;

    public ihs0(khs0 khs0Var) {
        this.f115016b = khs0Var;
    }

    /* JADX INFO: renamed from: a */
    public final khs0 m140032a() {
        return this.f115016b;
    }

    /* JADX INFO: renamed from: b */
    public final void m140033b(String str, @Nullable hhs0 hhs0Var) {
        this.f115015a.put(str, hhs0Var);
    }

    /* JADX INFO: renamed from: c */
    public final void m140034c(String str, String str2, long j) {
        hhs0 hhs0Var = (hhs0) this.f115015a.get(str2);
        String[] strArr = {str};
        if (hhs0Var != null) {
            this.f115016b.m149822e(hhs0Var, j, strArr);
        }
        this.f115015a.put(str, new hhs0(j, null, null));
    }
}
