package p153l;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class jcr0 extends mpr0 {
    public jcr0(r4z0 r4z0Var, String str) {
        super(str);
    }

    @Override // p153l.mpr0
    /* JADX INFO: renamed from: d */
    public final ewr0 mo107102d(gix0 gix0Var, List<ewr0> list) {
        return new glr0(Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
    }
}
