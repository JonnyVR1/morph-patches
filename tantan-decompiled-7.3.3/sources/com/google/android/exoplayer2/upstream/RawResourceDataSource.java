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
import p153l.bmk0;
import p153l.w11;
import p153l.zi2;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class RawResourceDataSource extends zi2 {

    /* JADX INFO: renamed from: e */
    public final Resources f9513e;

    /* JADX INFO: renamed from: f */
    public final String f9514f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public Uri f9515g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public AssetFileDescriptor f9516h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public InputStream f9517i;

    /* JADX INFO: renamed from: j */
    public long f9518j;

    /* JADX INFO: renamed from: k */
    public boolean f9519k;

    public RawResourceDataSource(Context context) {
        super(false);
        this.f9513e = context.getResources();
        this.f9514f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // p153l.g6c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void close() throws RawResourceDataSourceException {
        this.f9515g = null;
        try {
            InputStream inputStream = this.f9517i;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f9517i = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor = this.f9516h;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                    this.f9516h = null;
                    if (this.f9519k) {
                        this.f9519k = false;
                        m219719r();
                    }
                } catch (IOException e) {
                    throw new RawResourceDataSourceException(null, e, 2000);
                }
            } catch (Throwable th) {
                this.f9516h = null;
                if (this.f9519k) {
                    this.f9519k = false;
                    m219719r();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new RawResourceDataSourceException(null, e2, 2000);
        }
    }

    @Override // p153l.g6c
    @Nullable
    /* JADX INFO: renamed from: d */
    public Uri mo11176d() {
        return this.f9515g;
    }

    @Override // p153l.g6c
    /* JADX INFO: renamed from: n */
    public long mo11179n(C2070a c2070a) throws RawResourceDataSourceException {
        int identifier;
        String str;
        Uri uriNormalizeScheme = c2070a.f9529a.normalizeScheme();
        this.f9515g = uriNormalizeScheme;
        if (TextUtils.equals("rawresource", uriNormalizeScheme.getScheme()) || (TextUtils.equals("android.resource", uriNormalizeScheme.getScheme()) && uriNormalizeScheme.getPathSegments().size() == 1 && ((String) w11.m204369e(uriNormalizeScheme.getLastPathSegment())).matches("\\d+"))) {
            try {
                identifier = Integer.parseInt((String) w11.m204369e(uriNormalizeScheme.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new RawResourceDataSourceException("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only rawresource and android.resource are supported.", null, 1004);
            }
            String strSubstring = (String) w11.m204369e(uriNormalizeScheme.getPath());
            if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            String host = uriNormalizeScheme.getHost();
            if (TextUtils.isEmpty(host)) {
                str = "";
            } else {
                str = host + ":";
            }
            identifier = this.f9513e.getIdentifier(str.concat(strSubstring), "raw", this.f9514f);
            if (identifier == 0) {
                throw new RawResourceDataSourceException("Resource not found.", null, 2005);
            }
        }
        m219720s(c2070a);
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.f9513e.openRawResourceFd(identifier);
            this.f9516h = assetFileDescriptorOpenRawResourceFd;
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new RawResourceDataSourceException("Resource is compressed: " + uriNormalizeScheme, null, 2000);
            }
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenRawResourceFd.getFileDescriptor());
            this.f9517i = fileInputStream;
            if (length != -1) {
                try {
                    if (c2070a.f9535g > length) {
                        throw new RawResourceDataSourceException(null, null, 2008);
                    }
                } catch (RawResourceDataSourceException e) {
                    throw e;
                } catch (IOException e2) {
                    throw new RawResourceDataSourceException(null, e2, 2000);
                }
            }
            long startOffset = assetFileDescriptorOpenRawResourceFd.getStartOffset();
            long jSkip = fileInputStream.skip(c2070a.f9535g + startOffset) - startOffset;
            if (jSkip != c2070a.f9535g) {
                throw new RawResourceDataSourceException(null, null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                if (channel.size() == 0) {
                    this.f9518j = -1L;
                } else {
                    long size = channel.size() - channel.position();
                    this.f9518j = size;
                    if (size < 0) {
                        throw new RawResourceDataSourceException(null, null, 2008);
                    }
                }
            } else {
                long j = length - jSkip;
                this.f9518j = j;
                if (j < 0) {
                    throw new DataSourceException(2008);
                }
            }
            long jMin = c2070a.f9536h;
            if (jMin != -1) {
                long j2 = this.f9518j;
                if (j2 != -1) {
                    jMin = Math.min(j2, jMin);
                }
                this.f9518j = jMin;
            }
            this.f9519k = true;
            m219721t(c2070a);
            long j3 = c2070a.f9536h;
            return j3 != -1 ? j3 : this.f9518j;
        } catch (Resources.NotFoundException e3) {
            throw new RawResourceDataSourceException(null, e3, 2005);
        }
    }

    @Override // p153l.e6c
    public int read(byte[] bArr, int i, int i2) throws RawResourceDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f9518j;
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
        int i3 = ((InputStream) bmk0.m105144j(this.f9517i)).read(bArr, i, i2);
        long j2 = this.f9518j;
        if (i3 == -1) {
            if (j2 == -1) {
                return -1;
            }
            throw new RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        if (j2 != -1) {
            this.f9518j = j2 - ((long) i3);
        }
        m219718q(i3);
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
