package com.p041mm.mmfile;

import com.p041mm.mmfile.core.MMLogInfo;

/* JADX INFO: loaded from: classes7.dex */
public interface IMMFile {
    void close();

    void flush();

    void openNewLogFile();

    void restart();

    void setPauseWrite(boolean z);

    void updateCommonInfo(MMLogInfo mMLogInfo);

    void write(String str, String... strArr);
}
