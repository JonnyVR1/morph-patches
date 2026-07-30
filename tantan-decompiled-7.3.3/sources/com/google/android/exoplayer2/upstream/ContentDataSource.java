package com.google.android.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import p153l.bmk0;
import p153l.zi2;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ContentDataSource extends zi2 {

    /* JADX INFO: renamed from: e */
    public final ContentResolver f9483e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Uri f9484f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public AssetFileDescriptor f9485g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public FileInputStream f9486h;

    /* JADX INFO: renamed from: i */
    public long f9487i;

    /* JADX INFO: renamed from: j */
    public boolean f9488j;

    public ContentDataSource(Context context) {
        super(false);
        this.f9483e = context.getContentResolver();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // p153l.g6c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void close() throws ContentDataSourceException {
        this.f9484f = null;
        try {
            FileInputStream fileInputStream = this.f9486h;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f9486h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor = this.f9485g;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                    this.f9485g = null;
                    if (this.f9488j) {
                        this.f9488j = false;
                        m219719r();
                    }
                } catch (IOException e) {
                    throw new ContentDataSourceException(e, 2000);
                }
            } catch (Throwable th) {
                this.f9485g = null;
                if (this.f9488j) {
                    this.f9488j = false;
                    m219719r();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new ContentDataSourceException(e2, 2000);
        }
    }

    @Override // p153l.g6c
    @Nullable
    /* JADX INFO: renamed from: d */
    public Uri mo11176d() {
        return this.f9484f;
    }

    @Override // p153l.g6c
    /* JADX INFO: renamed from: n */
    public long mo11179n(C2070a c2070a) throws ContentDataSourceException {
        int i;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                Uri uriNormalizeScheme = c2070a.f9529a.normalizeScheme();
                this.f9484f = uriNormalizeScheme;
                m219720s(c2070a);
                if ("content".equals(uriNormalizeScheme.getScheme())) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = this.f9483e.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = this.f9483e.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.f9485g = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i = 2000;
                    try {
                        throw new ContentDataSourceException(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
                    } catch (IOException e) {
                        e = e;
                        throw new ContentDataSourceException(e, e instanceof FileNotFoundException ? 2005 : i);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.f9486h = fileInputStream;
                if (length != -1 && c2070a.f9535g > length) {
                    throw new ContentDataSourceException(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(c2070a.f9535g + startOffset) - startOffset;
                if (jSkip != c2070a.f9535g) {
                    throw new ContentDataSourceException(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f9487i = -1L;
                    } else {
                        long jPosition = size - channel.position();
                        this.f9487i = jPosition;
                        if (jPosition < 0) {
                            throw new ContentDataSourceException(null, 2008);
                        }
                    }
                } else {
                    long j = length - jSkip;
                    this.f9487i = j;
                    if (j < 0) {
                        throw new ContentDataSourceException(null, 2008);
                    }
                }
                long jMin = c2070a.f9536h;
                if (jMin != -1) {
                    long j2 = this.f9487i;
                    if (j2 != -1) {
                        jMin = Math.min(j2, jMin);
                    }
                    this.f9487i = jMin;
                }
                this.f9488j = true;
                m219721t(c2070a);
                long j3 = c2070a.f9536h;
                return j3 != -1 ? j3 : this.f9487i;
            } catch (IOException e2) {
                e = e2;
                i = 2000;
            }
        } catch (ContentDataSourceException e3) {
            throw e3;
        }
    }

    @Override // p153l.e6c
    public int read(byte[] bArr, int i, int i2) throws ContentDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f9487i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new ContentDataSourceException(e, 2000);
            }
        }
        int i3 = ((FileInputStream) bmk0.m105144j(this.f9486h)).read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        long j2 = this.f9487i;
        if (j2 != -1) {
            this.f9487i = j2 - ((long) i3);
        }
        m219718q(i3);
        return i3;
    }

    public static class ContentDataSourceException extends DataSourceException {
        @Deprecated
        public ContentDataSourceException(IOException iOException) {
            this(iOException, 2000);
        }

        public ContentDataSourceException(@Nullable IOException iOException, int i) {
            super(iOException, i);
        }
    }
}
