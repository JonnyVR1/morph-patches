package p149l;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzhl;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes6.dex */
public final class cix0 extends gzw0 {

    /* JADX INFO: renamed from: e */
    @Nullable
    public RandomAccessFile f81118e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Uri f81119f;

    /* JADX INFO: renamed from: g */
    public long f81120g;

    /* JADX INFO: renamed from: h */
    public boolean f81121h;

    public cix0() {
        super(false);
    }

    @Override // p149l.hpy0
    /* JADX INFO: renamed from: a */
    public final int mo12727a(byte[] bArr, int i, int i2) throws zzhl {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f81120g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f81118e;
            int i3 = ggw0.f102568a;
            int i4 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i4 > 0) {
                this.f81120g -= (long) i4;
                zzg(i4);
            }
            return i4;
        } catch (IOException e) {
            throw new zzhl(e, 2000);
        }
    }

    @Override // p149l.z4x0
    /* JADX INFO: renamed from: e */
    public final long mo12728e(uax0 uax0Var) throws zzhl {
        Uri uri = uax0Var.f175648a;
        this.f81119f = uri;
        m128923k(uax0Var);
        try {
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f81118e = randomAccessFile;
            try {
                randomAccessFile.seek(uax0Var.f175653f);
                long length = uax0Var.f175654g;
                if (length == -1) {
                    length = this.f81118e.length() - uax0Var.f175653f;
                }
                this.f81120g = length;
                if (length < 0) {
                    throw new zzhl(null, null, 2008);
                }
                this.f81121h = true;
                m128924l(uax0Var);
                return this.f81120g;
            } catch (IOException e) {
                throw new zzhl(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new zzhl(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e2, 1004);
            }
            int i = ggw0.f102568a;
            throw new zzhl(e2, true != uhx0.m193803b(e2.getCause()) ? 2005 : 2006);
        } catch (SecurityException e3) {
            throw new zzhl(e3, 2006);
        } catch (RuntimeException e4) {
            throw new zzhl(e4, 2000);
        }
    }

    @Override // p149l.z4x0
    @Nullable
    public final Uri zzc() {
        return this.f81119f;
    }

    @Override // p149l.z4x0
    public final void zzd() throws zzhl {
        this.f81119f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f81118e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f81118e = null;
                if (this.f81121h) {
                    this.f81121h = false;
                    m128922j();
                }
            } catch (IOException e) {
                throw new zzhl(e, 2000);
            }
        } catch (Throwable th) {
            this.f81118e = null;
            if (this.f81121h) {
                this.f81121h = false;
                m128922j();
            }
            throw th;
        }
    }
}
