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
import p149l.si2;
import p149l.vck0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ContentDataSource extends si2 {

    /* JADX INFO: renamed from: e */
    public final ContentResolver f9446e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Uri f9447f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public AssetFileDescriptor f9448g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public FileInputStream f9449h;

    /* JADX INFO: renamed from: i */
    public long f9450i;

    /* JADX INFO: renamed from: j */
    public boolean f9451j;

    public ContentDataSource(Context context) {
        super(false);
        this.f9446e = context.getContentResolver();
    }

    @Override // p149l.a5c
    @Nullable
    /* JADX INFO: renamed from: a */
    public Uri mo11121a() {
        return this.f9447f;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // p149l.a5c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() throws com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException {
        /*
            r5 = this;
            r0 = 0
            r5.f9447f = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.f9449h     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            if (r3 == 0) goto L12
            r3.close()     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            goto L12
        Le:
            r3 = move-exception
            goto L44
        L10:
            r3 = move-exception
            goto L3e
        L12:
            r5.f9449h = r0
            android.content.res.AssetFileDescriptor r3 = r5.f9448g     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            if (r3 == 0) goto L20
            r3.close()     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            goto L20
        L1c:
            r1 = move-exception
            goto L32
        L1e:
            r3 = move-exception
            goto L2c
        L20:
            r5.f9448g = r0
            boolean r0 = r5.f9451j
            if (r0 == 0) goto L2b
            r5.f9451j = r2
            r5.m184311r()
        L2b:
            return
        L2c:
            com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException r4 = new com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.f9448g = r0
            boolean r0 = r5.f9451j
            if (r0 == 0) goto L3d
            r5.f9451j = r2
            r5.m184311r()
        L3d:
            throw r1
        L3e:
            com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException r4 = new com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> Le
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.f9449h = r0
            android.content.res.AssetFileDescriptor r4 = r5.f9448g     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            if (r4 == 0) goto L52
            r4.close()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            goto L52
        L4e:
            r1 = move-exception
            goto L64
        L50:
            r3 = move-exception
            goto L5e
        L52:
            r5.f9448g = r0
            boolean r0 = r5.f9451j
            if (r0 == 0) goto L5d
            r5.f9451j = r2
            r5.m184311r()
        L5d:
            throw r3
        L5e:
            com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException r4 = new com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.f9448g = r0
            boolean r0 = r5.f9451j
            if (r0 == 0) goto L6f
            r5.f9451j = r2
            r5.m184311r()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.ContentDataSource.close():void");
    }

    @Override // p149l.a5c
    /* JADX INFO: renamed from: n */
    public long mo11125n(C2047a c2047a) throws ContentDataSourceException {
        int i;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                Uri uriNormalizeScheme = c2047a.f9492a.normalizeScheme();
                this.f9447f = uriNormalizeScheme;
                m184312s(c2047a);
                if ("content".equals(uriNormalizeScheme.getScheme())) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = this.f9446e.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = this.f9446e.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.f9448g = assetFileDescriptorOpenAssetFileDescriptor;
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
                this.f9449h = fileInputStream;
                if (length != -1 && c2047a.f9498g > length) {
                    throw new ContentDataSourceException(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(c2047a.f9498g + startOffset) - startOffset;
                if (jSkip != c2047a.f9498g) {
                    throw new ContentDataSourceException(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f9450i = -1L;
                    } else {
                        long jPosition = size - channel.position();
                        this.f9450i = jPosition;
                        if (jPosition < 0) {
                            throw new ContentDataSourceException(null, 2008);
                        }
                    }
                } else {
                    long j = length - jSkip;
                    this.f9450i = j;
                    if (j < 0) {
                        throw new ContentDataSourceException(null, 2008);
                    }
                }
                long jMin = c2047a.f9499h;
                if (jMin != -1) {
                    long j2 = this.f9450i;
                    if (j2 != -1) {
                        jMin = Math.min(j2, jMin);
                    }
                    this.f9450i = jMin;
                }
                this.f9451j = true;
                m184313t(c2047a);
                long j3 = c2047a.f9499h;
                return j3 != -1 ? j3 : this.f9450i;
            } catch (IOException e2) {
                e = e2;
                i = 2000;
            }
        } catch (ContentDataSourceException e3) {
            throw e3;
        }
    }

    @Override // p149l.w4c
    public int read(byte[] bArr, int i, int i2) throws ContentDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f9450i;
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
        int i3 = ((FileInputStream) vck0.m197866j(this.f9449h)).read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        long j2 = this.f9450i;
        if (j2 != -1) {
            this.f9450i = j2 - ((long) i3);
        }
        m184310q(i3);
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
