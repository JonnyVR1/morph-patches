package com.p069ss.bytertc.engine.handler;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes13.dex */
@SuppressLint({"DefaultLocale"})
public interface IRTCEncryptionHandler {
    byte[] onDecryptData(byte[] bArr);

    byte[] onEncryptData(byte[] bArr);
}
