package com.p041mm.mmfile;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes7.dex */
@Retention(RetentionPolicy.SOURCE)
public @interface MMFileEvent {
    public static final int EVENT_DISK_FREE_LOW = 5;
    public static final int EVENT_GET_DISK_FREE_ERROR = 4;
    public static final int EVENT_MOVE_OLD_FILE = 3;
    public static final int EVENT_OPEN_MMP_ERROR = 2;
    public static final int EVENT_OPEN_NEW_LOG_FILE = 6;
    public static final int EVENT_OUT_OF_BUFFER = 1;
    public static final int EVENT_WRITE_ERROR = 0;
}
