package p153l;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzgs;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes6.dex */
public final class rbx0 extends m8x0 {

    /* JADX INFO: renamed from: e */
    public final ContentResolver f162045e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Uri f162046f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public AssetFileDescriptor f162047g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public FileInputStream f162048h;

    /* JADX INFO: renamed from: i */
    public long f162049i;

    /* JADX INFO: renamed from: j */
    public boolean f162050j;

    public rbx0(Context context) {
        super(false);
        this.f162045e = context.getContentResolver();
    }

    @Override // p153l.nyy0
    /* JADX INFO: renamed from: a */
    public final int mo12781a(byte[] bArr, int i, int i2) throws zzgs {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f162049i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new zzgs(e, 2000);
            }
        }
        FileInputStream fileInputStream = this.f162048h;
        int i3 = mpw0.f137957a;
        int i4 = fileInputStream.read(bArr, i, i2);
        if (i4 == -1) {
            return -1;
        }
        long j2 = this.f162049i;
        if (j2 != -1) {
            this.f162049i = j2 - ((long) i4);
        }
        zzg(i4);
        return i4;
    }

    @Override // p153l.fex0
    /* JADX INFO: renamed from: e */
    public final long mo12782e(akx0 akx0Var) throws zzgs {
        int i;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        long jPosition;
        try {
            try {
                Uri uriNormalizeScheme = akx0Var.f72047a.normalizeScheme();
                this.f162046f = uriNormalizeScheme;
                m157522k(akx0Var);
                if ("content".equals(uriNormalizeScheme.getScheme())) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = this.f162045e.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = this.f162045e.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.f162047g = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i = 2000;
                    try {
                        throw new zzgs(new IOException("Could not open file descriptor for: ".concat(String.valueOf(uriNormalizeScheme))), 2000);
                    } catch (IOException e) {
                        e = e;
                        throw new zzgs(e, true != (e instanceof FileNotFoundException) ? i : 2005);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.f162048h = fileInputStream;
                if (length != -1 && akx0Var.f72052f > length) {
                    throw new zzgs(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(akx0Var.f72052f + startOffset) - startOffset;
                if (jSkip != akx0Var.f72052f) {
                    throw new zzgs(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f162049i = -1L;
                        jPosition = -1;
                    } else {
                        jPosition = size - channel.position();
                        this.f162049i = jPosition;
                        if (jPosition < 0) {
                            throw new zzgs(null, 2008);
                        }
                    }
                } else {
                    jPosition = length - jSkip;
                    this.f162049i = jPosition;
                    if (jPosition < 0) {
                        throw new zzgs(null, 2008);
                    }
                }
                long jMin = akx0Var.f72053g;
                if (jMin != -1) {
                    if (jPosition != -1) {
                        jMin = Math.min(jPosition, jMin);
                    }
                    this.f162049i = jMin;
                }
                this.f162050j = true;
                m157523l(akx0Var);
                long j = akx0Var.f72053g;
                return j != -1 ? j : this.f162049i;
            } catch (zzgs e2) {
                throw e2;
            }
        } catch (IOException e3) {
            e = e3;
            i = 2000;
        }
    }

    @Override // p153l.fex0
    @Nullable
    public final Uri zzc() {
        return this.f162046f;
    }

    @Override // p153l.fex0
    public final void zzd() throws zzgs {
        this.f162046f = null;
        try {
            try {
                try {
                    FileInputStream fileInputStream = this.f162048h;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    this.f162048h = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f162047g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.f162047g = null;
                        if (this.f162050j) {
                            this.f162050j = false;
                            m157521j();
                        }
                    } catch (IOException e) {
                        throw new zzgs(e, 2000);
                    }
                } catch (IOException e2) {
                    throw new zzgs(e2, 2000);
                }
            } catch (Throwable th) {
                this.f162048h = null;
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f162047g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f162047g = null;
                    if (this.f162050j) {
                        this.f162050j = false;
                        m157521j();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new zzgs(e3, 2000);
                }
            }
        } catch (Throwable th2) {
            this.f162047g = null;
            if (this.f162050j) {
                this.f162050j = false;
                m157521j();
            }
            throw th2;
        }
    }
}
