package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import p153l.bmk0;
import p153l.w11;
import p153l.zi2;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class FileDataSource extends zi2 {

    /* JADX INFO: renamed from: e */
    @Nullable
    public RandomAccessFile f9489e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Uri f9490f;

    /* JADX INFO: renamed from: g */
    public long f9491g;

    /* JADX INFO: renamed from: h */
    public boolean f9492h;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.FileDataSource$a */
    @RequiresApi(21)
    public static final class C2062a {
        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static boolean m12133b(@Nullable Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    public FileDataSource() {
        super(false);
    }

    /* JADX INFO: renamed from: u */
    public static RandomAccessFile m12131u(Uri uri) throws FileDataSourceException {
        try {
            return new RandomAccessFile((String) w11.m204369e(uri.getPath()), "r");
        } catch (FileNotFoundException e) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(e, (bmk0.f77313a < 21 || !C2062a.m12133b(e.getCause())) ? 2005 : 2006);
            }
            throw new FileDataSourceException(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e, 1004);
        } catch (SecurityException e2) {
            throw new FileDataSourceException(e2, 2006);
        } catch (RuntimeException e3) {
            throw new FileDataSourceException(e3, 2000);
        }
    }

    @Override // p153l.g6c
    public void close() throws FileDataSourceException {
        this.f9490f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f9489e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f9489e = null;
                if (this.f9492h) {
                    this.f9492h = false;
                    m219719r();
                }
            } catch (IOException e) {
                throw new FileDataSourceException(e, 2000);
            }
        } catch (Throwable th) {
            this.f9489e = null;
            if (this.f9492h) {
                this.f9492h = false;
                m219719r();
            }
            throw th;
        }
    }

    @Override // p153l.g6c
    @Nullable
    /* JADX INFO: renamed from: d */
    public Uri mo11176d() {
        return this.f9490f;
    }

    @Override // p153l.g6c
    /* JADX INFO: renamed from: n */
    public long mo11179n(C2070a c2070a) throws FileDataSourceException {
        Uri uri = c2070a.f9529a;
        this.f9490f = uri;
        m219720s(c2070a);
        RandomAccessFile randomAccessFileM12131u = m12131u(uri);
        this.f9489e = randomAccessFileM12131u;
        try {
            randomAccessFileM12131u.seek(c2070a.f9535g);
            long length = c2070a.f9536h;
            if (length == -1) {
                length = this.f9489e.length() - c2070a.f9535g;
            }
            this.f9491g = length;
            if (length < 0) {
                throw new FileDataSourceException(null, null, 2008);
            }
            this.f9492h = true;
            m219721t(c2070a);
            return this.f9491g;
        } catch (IOException e) {
            throw new FileDataSourceException(e, 2000);
        }
    }

    @Override // p153l.e6c
    public int read(byte[] bArr, int i, int i2) throws FileDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        if (this.f9491g == 0) {
            return -1;
        }
        try {
            int i3 = ((RandomAccessFile) bmk0.m105144j(this.f9489e)).read(bArr, i, (int) Math.min(this.f9491g, i2));
            if (i3 > 0) {
                this.f9491g -= (long) i3;
                m219718q(i3);
            }
            return i3;
        } catch (IOException e) {
            throw new FileDataSourceException(e, 2000);
        }
    }

    public static class FileDataSourceException extends DataSourceException {
        @Deprecated
        public FileDataSourceException(Exception exc) {
            super(exc, 2000);
        }

        @Deprecated
        public FileDataSourceException(String str, IOException iOException) {
            super(str, iOException, 2000);
        }

        public FileDataSourceException(Throwable th, int i) {
            super(th, i);
        }

        public FileDataSourceException(@Nullable String str, @Nullable Throwable th, int i) {
            super(str, th, i);
        }
    }
}
