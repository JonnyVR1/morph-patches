package org.apache.commons.sudcompress.compressors.gzip;

import p149l.ig3;
import p149l.vdg0;

/* JADX INFO: loaded from: classes2.dex */
public class GzipParameters {
    private String comment;
    private String filename;
    private long modificationTime;
    private int compressionLevel = -1;
    private int operatingSystem = 255;

    public String getComment() {
        return this.comment;
    }

    public int getCompressionLevel() {
        return this.compressionLevel;
    }

    public String getFilename() {
        return this.filename;
    }

    public long getModificationTime() {
        return this.modificationTime;
    }

    public int getOperatingSystem() {
        return this.operatingSystem;
    }

    public void setComment(String str) {
        this.comment = str;
    }

    public void setCompressionLevel(int i) {
        if (i < -1 || i > 9) {
            ig3.m135964a(vdg0.m197997a(i, "Invalid gzip compression level: "));
        } else {
            this.compressionLevel = i;
        }
    }

    public void setFilename(String str) {
        this.filename = str;
    }

    public void setModificationTime(long j) {
        this.modificationTime = j;
    }

    public void setOperatingSystem(int i) {
        this.operatingSystem = i;
    }
}
