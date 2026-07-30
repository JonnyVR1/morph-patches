package com.p046mm.mmfile;

import com.p046mm.mmfile.core.MMLogInfo;

/* JADX INFO: loaded from: classes6.dex */
public interface IMMFile {
    void close();

    void flush();

    void openNewLogFile();

    void restart();

    void setPauseWrite(boolean z);

    void updateCommonInfo(MMLogInfo mMLogInfo);

    void write(String str, String... strArr);
}
