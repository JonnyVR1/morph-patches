package org.spongycastle.crypto;

import org.spongycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes3.dex */
public interface KeyEncoder {
    byte[] getEncoded(AsymmetricKeyParameter asymmetricKeyParameter);
}
