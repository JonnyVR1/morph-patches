package com.p041mm.mmfile;

import com.p041mm.mmfile.core.FileWriteConfig;
import com.p041mm.mmfile.core.IMMFileEventListener;

/* JADX INFO: loaded from: classes7.dex */
public class EventListenerWrapper implements IMMFileEventListener {
    private static final int EVENT_INNER_FILE_FULL = 10000;
    private IMMFileEventListener eventListener;
    private final FileWriteConfig writeConfig;

    public EventListenerWrapper(IMMFileEventListener iMMFileEventListener, FileWriteConfig fileWriteConfig) {
        this.eventListener = iMMFileEventListener;
        this.writeConfig = fileWriteConfig;
    }

    @Override // com.p041mm.mmfile.core.IMMFileEventListener
    public void onEvent(int i, String str) {
        int maxFileCounts;
        if (i == 10000) {
            MMFileUploader.get().forceUploadMMFile(str);
            FileWriteConfig fileWriteConfig = this.writeConfig;
            if (fileWriteConfig != null && (maxFileCounts = fileWriteConfig.getMaxFileCounts()) > 0) {
                MMFileUtil.getFiles(this.writeConfig, SortType.FLASHBACK, -1, maxFileCounts, false, true);
            }
            i = 6;
        }
        IMMFileEventListener iMMFileEventListener = this.eventListener;
        if (iMMFileEventListener != null) {
            iMMFileEventListener.onEvent(i, str);
        }
    }
}
