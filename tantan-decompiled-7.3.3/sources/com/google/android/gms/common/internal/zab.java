package com.google.android.gms.common.internal;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class zab {
    public final Set zaa;

    public zab(Set set) {
        Preconditions.checkNotNull(set);
        this.zaa = Collections.unmodifiableSet(set);
    }
}
