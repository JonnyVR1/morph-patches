package org.spongycastle.math.p135ec.endo;

import org.spongycastle.math.p135ec.ECPointMap;

/* JADX INFO: loaded from: classes3.dex */
public interface ECEndomorphism {
    ECPointMap getPointMap();

    boolean hasEfficientPointMap();
}
