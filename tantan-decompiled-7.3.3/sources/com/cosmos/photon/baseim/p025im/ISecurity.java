package com.cosmos.photon.baseim.p025im;

/* JADX INFO: loaded from: classes.dex */
public interface ISecurity {
    byte[] decryptMessage(byte[] bArr) throws Exception;

    byte[] encryptMessage(byte[] bArr) throws Exception;
}
