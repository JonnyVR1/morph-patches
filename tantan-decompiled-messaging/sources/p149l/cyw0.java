package p149l;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzgo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class cyw0 extends gzw0 {

    /* JADX INFO: renamed from: e */
    public final AssetManager f83039e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Uri f83040f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public InputStream f83041g;

    /* JADX INFO: renamed from: h */
    public long f83042h;

    /* JADX INFO: renamed from: i */
    public boolean f83043i;

    public cyw0(Context context) {
        super(false);
        this.f83039e = context.getAssets();
    }

    @Override // p149l.hpy0
    /* JADX INFO: renamed from: a */
    public final int mo12727a(byte[] bArr, int i, int i2) throws zzgo {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f83042h;
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
        InputStream inputStream = this.f83041g;
        int i3 = ggw0.f102568a;
        int i4 = inputStream.read(bArr, i, i2);
        if (i4 == -1) {
            return -1;
        }
        long j2 = this.f83042h;
        if (j2 != -1) {
            this.f83042h = j2 - ((long) i4);
        }
        zzg(i4);
        return i4;
    }

    @Override // p149l.z4x0
    /* JADX INFO: renamed from: e */
    public final long mo12728e(uax0 uax0Var) throws zzgo {
        try {
            Uri uri = uax0Var.f175648a;
            this.f83040f = uri;
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            m128923k(uax0Var);
            InputStream inputStreamOpen = this.f83039e.open(path, 1);
            this.f83041g = inputStreamOpen;
            if (inputStreamOpen.skip(uax0Var.f175653f) < uax0Var.f175653f) {
                throw new zzgo(null, 2008);
            }
            long j = uax0Var.f175654g;
            if (j != -1) {
                this.f83042h = j;
            } else {
                long jAvailable = this.f83041g.available();
                this.f83042h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f83042h = -1L;
                }
            }
            this.f83043i = true;
            m128924l(uax0Var);
            return this.f83042h;
        } catch (zzgo e) {
            throw e;
        } catch (IOException e2) {
            throw new zzgo(e2, true != (e2 instanceof FileNotFoundException) ? 2000 : 2005);
        }
    }

    @Override // p149l.z4x0
    @Nullable
    public final Uri zzc() {
        return this.f83040f;
    }

    @Override // p149l.z4x0
    public final void zzd() throws zzgo {
        this.f83040f = null;
        try {
            try {
                InputStream inputStream = this.f83041g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f83041g = null;
                if (this.f83043i) {
                    this.f83043i = false;
                    m128922j();
                }
            } catch (IOException e) {
                throw new zzgo(e, 2000);
            }
        } catch (Throwable th) {
            this.f83041g = null;
            if (this.f83043i) {
                this.f83043i = false;
                m128922j();
            }
            throw th;
        }
    }
}
