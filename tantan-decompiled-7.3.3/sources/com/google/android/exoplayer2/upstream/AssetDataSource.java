package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p153l.bmk0;
import p153l.w11;
import p153l.zi2;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class AssetDataSource extends zi2 {

    /* JADX INFO: renamed from: e */
    public final AssetManager f9478e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Uri f9479f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public InputStream f9480g;

    /* JADX INFO: renamed from: h */
    public long f9481h;

    /* JADX INFO: renamed from: i */
    public boolean f9482i;

    public AssetDataSource(Context context) {
        super(false);
        this.f9478e = context.getAssets();
    }

    @Override // p153l.g6c
    public void close() throws AssetDataSourceException {
        this.f9479f = null;
        try {
            try {
                InputStream inputStream = this.f9480g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f9480g = null;
                if (this.f9482i) {
                    this.f9482i = false;
                    m219719r();
                }
            } catch (IOException e) {
                throw new AssetDataSourceException(e, 2000);
            }
        } catch (Throwable th) {
            this.f9480g = null;
            if (this.f9482i) {
                this.f9482i = false;
                m219719r();
            }
            throw th;
        }
    }

    @Override // p153l.g6c
    @Nullable
    /* JADX INFO: renamed from: d */
    public Uri mo11176d() {
        return this.f9479f;
    }

    @Override // p153l.g6c
    /* JADX INFO: renamed from: n */
    public long mo11179n(C2070a c2070a) throws AssetDataSourceException {
        try {
            Uri uri = c2070a.f9529a;
            this.f9479f = uri;
            String strSubstring = (String) w11.m204369e(uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            m219720s(c2070a);
            InputStream inputStreamOpen = this.f9478e.open(strSubstring, 1);
            this.f9480g = inputStreamOpen;
            if (inputStreamOpen.skip(c2070a.f9535g) < c2070a.f9535g) {
                throw new AssetDataSourceException(null, 2008);
            }
            long j = c2070a.f9536h;
            if (j != -1) {
                this.f9481h = j;
            } else {
                long jAvailable = this.f9480g.available();
                this.f9481h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f9481h = -1L;
                }
            }
            this.f9482i = true;
            m219721t(c2070a);
            return this.f9481h;
        } catch (AssetDataSourceException e) {
            throw e;
        } catch (IOException e2) {
            throw new AssetDataSourceException(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // p153l.e6c
    public int read(byte[] bArr, int i, int i2) throws AssetDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f9481h;
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
        int i3 = ((InputStream) bmk0.m105144j(this.f9480g)).read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        long j2 = this.f9481h;
        if (j2 != -1) {
            this.f9481h = j2 - ((long) i3);
        }
        m219718q(i3);
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
