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
import p149l.p11;
import p149l.si2;
import p149l.vck0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class FileDataSource extends si2 {

    /* JADX INFO: renamed from: e */
    @Nullable
    public RandomAccessFile f9452e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Uri f9453f;

    /* JADX INFO: renamed from: g */
    public long f9454g;

    /* JADX INFO: renamed from: h */
    public boolean f9455h;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.FileDataSource$a */
    @RequiresApi(21)
    public static final class C2039a {
        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static boolean m12079b(@Nullable Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    public FileDataSource() {
        super(false);
    }

    /* JADX INFO: renamed from: u */
    public static RandomAccessFile m12077u(Uri uri) throws FileDataSourceException {
        try {
            return new RandomAccessFile((String) p11.m167011e(uri.getPath()), "r");
        } catch (FileNotFoundException e) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(e, (vck0.f180948a < 21 || !C2039a.m12079b(e.getCause())) ? 2005 : 2006);
            }
            throw new FileDataSourceException(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e, 1004);
        } catch (SecurityException e2) {
            throw new FileDataSourceException(e2, 2006);
        } catch (RuntimeException e3) {
            throw new FileDataSourceException(e3, 2000);
        }
    }

    @Override // p149l.a5c
    @Nullable
    /* JADX INFO: renamed from: a */
    public Uri mo11121a() {
        return this.f9453f;
    }

    @Override // p149l.a5c
    public void close() throws FileDataSourceException {
        this.f9453f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f9452e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f9452e = null;
                if (this.f9455h) {
                    this.f9455h = false;
                    m184311r();
                }
            } catch (IOException e) {
                throw new FileDataSourceException(e, 2000);
            }
        } catch (Throwable th) {
            this.f9452e = null;
            if (this.f9455h) {
                this.f9455h = false;
                m184311r();
            }
            throw th;
        }
    }

    @Override // p149l.a5c
    /* JADX INFO: renamed from: n */
    public long mo11125n(C2047a c2047a) throws FileDataSourceException {
        Uri uri = c2047a.f9492a;
        this.f9453f = uri;
        m184312s(c2047a);
        RandomAccessFile randomAccessFileM12077u = m12077u(uri);
        this.f9452e = randomAccessFileM12077u;
        try {
            randomAccessFileM12077u.seek(c2047a.f9498g);
            long length = c2047a.f9499h;
            if (length == -1) {
                length = this.f9452e.length() - c2047a.f9498g;
            }
            this.f9454g = length;
            if (length < 0) {
                throw new FileDataSourceException(null, null, 2008);
            }
            this.f9455h = true;
            m184313t(c2047a);
            return this.f9454g;
        } catch (IOException e) {
            throw new FileDataSourceException(e, 2000);
        }
    }

    @Override // p149l.w4c
    public int read(byte[] bArr, int i, int i2) throws FileDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        if (this.f9454g == 0) {
            return -1;
        }
        try {
            int i3 = ((RandomAccessFile) vck0.m197866j(this.f9452e)).read(bArr, i, (int) Math.min(this.f9454g, i2));
            if (i3 > 0) {
                this.f9454g -= (long) i3;
                m184310q(i3);
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
