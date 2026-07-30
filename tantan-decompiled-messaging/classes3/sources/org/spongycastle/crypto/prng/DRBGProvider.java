package org.spongycastle.crypto.prng;

import org.spongycastle.crypto.prng.drbg.SP80090DRBG;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
interface DRBGProvider {
    SP80090DRBG get(EntropySource entropySource);
}
