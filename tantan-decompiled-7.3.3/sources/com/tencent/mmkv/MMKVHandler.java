package com.tencent.mmkv;

/* JADX INFO: loaded from: classes2.dex */
public interface MMKVHandler {
    void mmkvLog(MMKVLogLevel mMKVLogLevel, String str, int i, String str2, String str3);

    MMKVRecoverStrategic onMMKVCRCCheckFail(String str);

    MMKVRecoverStrategic onMMKVFileLengthError(String str);

    boolean wantLogRedirecting();
}
