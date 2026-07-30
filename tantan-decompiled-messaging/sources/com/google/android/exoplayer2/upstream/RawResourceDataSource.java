package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import p149l.p11;
import p149l.si2;
import p149l.vck0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class RawResourceDataSource extends si2 {

    /* JADX INFO: renamed from: e */
    public final Resources f9476e;

    /* JADX INFO: renamed from: f */
    public final String f9477f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public Uri f9478g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public AssetFileDescriptor f9479h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public InputStream f9480i;

    /* JADX INFO: renamed from: j */
    public long f9481j;

    /* JADX INFO: renamed from: k */
    public boolean f9482k;

    public RawResourceDataSource(Context context) {
        super(false);
        this.f9476e = context.getResources();
        this.f9477f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // p149l.a5c
    @Nullable
    /* JADX INFO: renamed from: a */
    public Uri mo11121a() {
        return this.f9478g;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // p149l.a5c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() throws com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException {
        /*
            r5 = this;
            r0 = 0
            r5.f9478g = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.InputStream r3 = r5.f9480i     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
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
            r5.f9480i = r0
            android.content.res.AssetFileDescriptor r3 = r5.f9479h     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
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
            r5.f9479h = r0
            boolean r0 = r5.f9482k
            if (r0 == 0) goto L2b
            r5.f9482k = r2
            r5.m184311r()
        L2b:
            return
        L2c:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r4 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.f9479h = r0
            boolean r0 = r5.f9482k
            if (r0 == 0) goto L3d
            r5.f9482k = r2
            r5.m184311r()
        L3d:
            throw r1
        L3e:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r4 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> Le
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.f9480i = r0
            android.content.res.AssetFileDescriptor r4 = r5.f9479h     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
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
            r5.f9479h = r0
            boolean r0 = r5.f9482k
            if (r0 == 0) goto L5d
            r5.f9482k = r2
            r5.m184311r()
        L5d:
            throw r3
        L5e:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r4 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.f9479h = r0
            boolean r0 = r5.f9482k
            if (r0 == 0) goto L6f
            r5.f9482k = r2
            r5.m184311r()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.RawResourceDataSource.close():void");
    }

    @Override // p149l.a5c
    /* JADX INFO: renamed from: n */
    public long mo11125n(C2047a c2047a) throws RawResourceDataSourceException {
        int identifier;
        String str;
        Uri uriNormalizeScheme = c2047a.f9492a.normalizeScheme();
        this.f9478g = uriNormalizeScheme;
        if (TextUtils.equals("rawresource", uriNormalizeScheme.getScheme()) || (TextUtils.equals("android.resource", uriNormalizeScheme.getScheme()) && uriNormalizeScheme.getPathSegments().size() == 1 && ((String) p11.m167011e(uriNormalizeScheme.getLastPathSegment())).matches("\\d+"))) {
            try {
                identifier = Integer.parseInt((String) p11.m167011e(uriNormalizeScheme.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new RawResourceDataSourceException("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only rawresource and android.resource are supported.", null, 1004);
            }
            String strSubstring = (String) p11.m167011e(uriNormalizeScheme.getPath());
            if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            String host = uriNormalizeScheme.getHost();
            if (TextUtils.isEmpty(host)) {
                str = "";
            } else {
                str = host + ":";
            }
            identifier = this.f9476e.getIdentifier(str.concat(strSubstring), "raw", this.f9477f);
            if (identifier == 0) {
                throw new RawResourceDataSourceException("Resource not found.", null, 2005);
            }
        }
        m184312s(c2047a);
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.f9476e.openRawResourceFd(identifier);
            this.f9479h = assetFileDescriptorOpenRawResourceFd;
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new RawResourceDataSourceException("Resource is compressed: " + uriNormalizeScheme, null, 2000);
            }
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenRawResourceFd.getFileDescriptor());
            this.f9480i = fileInputStream;
            if (length != -1) {
                try {
                    if (c2047a.f9498g > length) {
                        throw new RawResourceDataSourceException(null, null, 2008);
                    }
                } catch (RawResourceDataSourceException e) {
                    throw e;
                } catch (IOException e2) {
                    throw new RawResourceDataSourceException(null, e2, 2000);
                }
            }
            long startOffset = assetFileDescriptorOpenRawResourceFd.getStartOffset();
            long jSkip = fileInputStream.skip(c2047a.f9498g + startOffset) - startOffset;
            if (jSkip != c2047a.f9498g) {
                throw new RawResourceDataSourceException(null, null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                if (channel.size() == 0) {
                    this.f9481j = -1L;
                } else {
                    long size = channel.size() - channel.position();
                    this.f9481j = size;
                    if (size < 0) {
                        throw new RawResourceDataSourceException(null, null, 2008);
                    }
                }
            } else {
                long j = length - jSkip;
                this.f9481j = j;
                if (j < 0) {
                    throw new DataSourceException(2008);
                }
            }
            long jMin = c2047a.f9499h;
            if (jMin != -1) {
                long j2 = this.f9481j;
                if (j2 != -1) {
                    jMin = Math.min(j2, jMin);
                }
                this.f9481j = jMin;
            }
            this.f9482k = true;
            m184313t(c2047a);
            long j3 = c2047a.f9499h;
            return j3 != -1 ? j3 : this.f9481j;
        } catch (Resources.NotFoundException e3) {
            throw new RawResourceDataSourceException(null, e3, 2005);
        }
    }

    @Override // p149l.w4c
    public int read(byte[] bArr, int i, int i2) throws RawResourceDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f9481j;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new RawResourceDataSourceException(null, e, 2000);
            }
        }
        int i3 = ((InputStream) vck0.m197866j(this.f9480i)).read(bArr, i, i2);
        long j2 = this.f9481j;
        if (i3 == -1) {
            if (j2 == -1) {
                return -1;
            }
            throw new RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        if (j2 != -1) {
            this.f9481j = j2 - ((long) i3);
        }
        m184310q(i3);
        return i3;
    }

    public static class RawResourceDataSourceException extends DataSourceException {
        @Deprecated
        public RawResourceDataSourceException(String str) {
            super(str, null, 2000);
        }

        @Deprecated
        public RawResourceDataSourceException(Throwable th) {
            super(th, 2000);
        }

        public RawResourceDataSourceException(@Nullable String str, @Nullable Throwable th, int i) {
            super(str, th, i);
        }
    }
}
