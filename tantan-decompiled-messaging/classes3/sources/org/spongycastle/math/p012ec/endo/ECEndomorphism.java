package org.spongycastle.math.p012ec.endo;

import org.spongycastle.math.p012ec.ECPointMap;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface ECEndomorphism {
    ECPointMap getPointMap();

    boolean hasEfficientPointMap();
}
