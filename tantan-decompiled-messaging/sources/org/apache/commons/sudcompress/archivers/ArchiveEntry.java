package org.apache.commons.sudcompress.archivers;

import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public interface ArchiveEntry {
    public static final long SIZE_UNKNOWN = -1;

    Date getLastModifiedDate();

    String getName();

    long getSize();

    boolean isDirectory();
}
