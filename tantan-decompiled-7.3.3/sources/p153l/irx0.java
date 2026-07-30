package p153l;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzhl;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes6.dex */
public final class irx0 extends m8x0 {

    /* JADX INFO: renamed from: e */
    @Nullable
    public RandomAccessFile f116608e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Uri f116609f;

    /* JADX INFO: renamed from: g */
    public long f116610g;

    /* JADX INFO: renamed from: h */
    public boolean f116611h;

    public irx0() {
        super(false);
    }

    @Override // p153l.nyy0
    /* JADX INFO: renamed from: a */
    public final int mo12781a(byte[] bArr, int i, int i2) throws zzhl {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f116610g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f116608e;
            int i3 = mpw0.f137957a;
            int i4 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i4 > 0) {
                this.f116610g -= (long) i4;
                zzg(i4);
            }
            return i4;
        } catch (IOException e) {
            throw new zzhl(e, 2000);
        }
    }

    @Override // p153l.fex0
    /* JADX INFO: renamed from: e */
    public final long mo12782e(akx0 akx0Var) throws zzhl {
        Uri uri = akx0Var.f72047a;
        this.f116609f = uri;
        m157522k(akx0Var);
        try {
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f116608e = randomAccessFile;
            try {
                randomAccessFile.seek(akx0Var.f72052f);
                long length = akx0Var.f72053g;
                if (length == -1) {
                    length = this.f116608e.length() - akx0Var.f72052f;
                }
                this.f116610g = length;
                if (length < 0) {
                    throw new zzhl(null, null, 2008);
                }
                this.f116611h = true;
                m157523l(akx0Var);
                return this.f116610g;
            } catch (IOException e) {
                throw new zzhl(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new zzhl(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e2, 1004);
            }
            int i = mpw0.f137957a;
            throw new zzhl(e2, true != arx0.m99804b(e2.getCause()) ? 2005 : 2006);
        } catch (SecurityException e3) {
            throw new zzhl(e3, 2006);
        } catch (RuntimeException e4) {
            throw new zzhl(e4, 2000);
        }
    }

    @Override // p153l.fex0
    @Nullable
    public final Uri zzc() {
        return this.f116609f;
    }

    @Override // p153l.fex0
    public final void zzd() throws zzhl {
        this.f116609f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f116608e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f116608e = null;
                if (this.f116611h) {
                    this.f116611h = false;
                    m157521j();
                }
            } catch (IOException e) {
                throw new zzhl(e, 2000);
            }
        } catch (Throwable th) {
            this.f116608e = null;
            if (this.f116611h) {
                this.f116611h = false;
                m157521j();
            }
            throw th;
        }
    }
}
