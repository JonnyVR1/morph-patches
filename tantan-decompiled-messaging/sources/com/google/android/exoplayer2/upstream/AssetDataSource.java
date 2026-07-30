package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p149l.p11;
import p149l.si2;
import p149l.vck0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class AssetDataSource extends si2 {

    /* JADX INFO: renamed from: e */
    public final AssetManager f9441e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Uri f9442f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public InputStream f9443g;

    /* JADX INFO: renamed from: h */
    public long f9444h;

    /* JADX INFO: renamed from: i */
    public boolean f9445i;

    public AssetDataSource(Context context) {
        super(false);
        this.f9441e = context.getAssets();
    }

    @Override // p149l.a5c
    @Nullable
    /* JADX INFO: renamed from: a */
    public Uri mo11121a() {
        return this.f9442f;
    }

    @Override // p149l.a5c
    public void close() throws AssetDataSourceException {
        this.f9442f = null;
        try {
            try {
                InputStream inputStream = this.f9443g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f9443g = null;
                if (this.f9445i) {
                    this.f9445i = false;
                    m184311r();
                }
            } catch (IOException e) {
                throw new AssetDataSourceException(e, 2000);
            }
        } catch (Throwable th) {
            this.f9443g = null;
            if (this.f9445i) {
                this.f9445i = false;
                m184311r();
            }
            throw th;
        }
    }

    @Override // p149l.a5c
    /* JADX INFO: renamed from: n */
    public long mo11125n(C2047a c2047a) throws AssetDataSourceException {
        try {
            Uri uri = c2047a.f9492a;
            this.f9442f = uri;
            String strSubstring = (String) p11.m167011e(uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            m184312s(c2047a);
            InputStream inputStreamOpen = this.f9441e.open(strSubstring, 1);
            this.f9443g = inputStreamOpen;
            if (inputStreamOpen.skip(c2047a.f9498g) < c2047a.f9498g) {
                throw new AssetDataSourceException(null, 2008);
            }
            long j = c2047a.f9499h;
            if (j != -1) {
                this.f9444h = j;
            } else {
                long jAvailable = this.f9443g.available();
                this.f9444h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f9444h = -1L;
                }
            }
            this.f9445i = true;
            m184313t(c2047a);
            return this.f9444h;
        } catch (AssetDataSourceException e) {
            throw e;
        } catch (IOException e2) {
            throw new AssetDataSourceException(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // p149l.w4c
    public int read(byte[] bArr, int i, int i2) throws AssetDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f9444h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new AssetDataSourceException(e, 2000);
            }
        }
        int i3 = ((InputStream) vck0.m197866j(this.f9443g)).read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        long j2 = this.f9444h;
        if (j2 != -1) {
            this.f9444h = j2 - ((long) i3);
        }
        m184310q(i3);
        return i3;
    }

    public static final class AssetDataSourceException extends DataSourceException {
        @Deprecated
        public AssetDataSourceException(IOException iOException) {
            super(iOException, 2000);
        }

        public AssetDataSourceException(@Nullable Throwable th, int i) {
            super(th, i);
        }
    }
}
