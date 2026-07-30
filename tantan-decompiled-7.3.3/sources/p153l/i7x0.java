package p153l;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzgo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class i7x0 extends m8x0 {

    /* JADX INFO: renamed from: e */
    public final AssetManager f113304e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Uri f113305f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public InputStream f113306g;

    /* JADX INFO: renamed from: h */
    public long f113307h;

    /* JADX INFO: renamed from: i */
    public boolean f113308i;

    public i7x0(Context context) {
        super(false);
        this.f113304e = context.getAssets();
    }

    @Override // p153l.nyy0
    /* JADX INFO: renamed from: a */
    public final int mo12781a(byte[] bArr, int i, int i2) throws zzgo {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f113307h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new zzgo(e, 2000);
            }
        }
        InputStream inputStream = this.f113306g;
        int i3 = mpw0.f137957a;
        int i4 = inputStream.read(bArr, i, i2);
        if (i4 == -1) {
            return -1;
        }
        long j2 = this.f113307h;
        if (j2 != -1) {
            this.f113307h = j2 - ((long) i4);
        }
        zzg(i4);
        return i4;
    }

    @Override // p153l.fex0
    /* JADX INFO: renamed from: e */
    public final long mo12782e(akx0 akx0Var) throws zzgo {
        try {
            Uri uri = akx0Var.f72047a;
            this.f113305f = uri;
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            m157522k(akx0Var);
            InputStream inputStreamOpen = this.f113304e.open(path, 1);
            this.f113306g = inputStreamOpen;
            if (inputStreamOpen.skip(akx0Var.f72052f) < akx0Var.f72052f) {
                throw new zzgo(null, 2008);
            }
            long j = akx0Var.f72053g;
            if (j != -1) {
                this.f113307h = j;
            } else {
                long jAvailable = this.f113306g.available();
                this.f113307h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f113307h = -1L;
                }
            }
            this.f113308i = true;
            m157523l(akx0Var);
            return this.f113307h;
        } catch (zzgo e) {
            throw e;
        } catch (IOException e2) {
            throw new zzgo(e2, true != (e2 instanceof FileNotFoundException) ? 2000 : 2005);
        }
    }

    @Override // p153l.fex0
    @Nullable
    public final Uri zzc() {
        return this.f113305f;
    }

    @Override // p153l.fex0
    public final void zzd() throws zzgo {
        this.f113305f = null;
        try {
            try {
                InputStream inputStream = this.f113306g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f113306g = null;
                if (this.f113308i) {
                    this.f113308i = false;
                    m157521j();
                }
            } catch (IOException e) {
                throw new zzgo(e, 2000);
            }
        } catch (Throwable th) {
            this.f113306g = null;
            if (this.f113308i) {
                this.f113308i = false;
                m157521j();
            }
            throw th;
        }
    }
}
