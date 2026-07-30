package p149l;

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
public final class l2x0 extends gzw0 {

    /* JADX INFO: renamed from: e */
    public final ContentResolver f125821e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Uri f125822f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public AssetFileDescriptor f125823g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public FileInputStream f125824h;

    /* JADX INFO: renamed from: i */
    public long f125825i;

    /* JADX INFO: renamed from: j */
    public boolean f125826j;

    public l2x0(Context context) {
        super(false);
        this.f125821e = context.getContentResolver();
    }

    @Override // p149l.hpy0
    /* JADX INFO: renamed from: a */
    public final int mo12727a(byte[] bArr, int i, int i2) throws zzgs {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f125825i;
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
        FileInputStream fileInputStream = this.f125824h;
        int i3 = ggw0.f102568a;
        int i4 = fileInputStream.read(bArr, i, i2);
        if (i4 == -1) {
            return -1;
        }
        long j2 = this.f125825i;
        if (j2 != -1) {
            this.f125825i = j2 - ((long) i4);
        }
        zzg(i4);
        return i4;
    }

    @Override // p149l.z4x0
    /* JADX INFO: renamed from: e */
    public final long mo12728e(uax0 uax0Var) throws zzgs {
        int i;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        long jPosition;
        try {
            try {
                Uri uriNormalizeScheme = uax0Var.f175648a.normalizeScheme();
                this.f125822f = uriNormalizeScheme;
                m128923k(uax0Var);
                if ("content".equals(uriNormalizeScheme.getScheme())) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = this.f125821e.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = this.f125821e.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.f125823g = assetFileDescriptorOpenAssetFileDescriptor;
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
                this.f125824h = fileInputStream;
                if (length != -1 && uax0Var.f175653f > length) {
                    throw new zzgs(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(uax0Var.f175653f + startOffset) - startOffset;
                if (jSkip != uax0Var.f175653f) {
                    throw new zzgs(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f125825i = -1L;
                        jPosition = -1;
                    } else {
                        jPosition = size - channel.position();
                        this.f125825i = jPosition;
                        if (jPosition < 0) {
                            throw new zzgs(null, 2008);
                        }
                    }
                } else {
                    jPosition = length - jSkip;
                    this.f125825i = jPosition;
                    if (jPosition < 0) {
                        throw new zzgs(null, 2008);
                    }
                }
                long jMin = uax0Var.f175654g;
                if (jMin != -1) {
                    if (jPosition != -1) {
                        jMin = Math.min(jPosition, jMin);
                    }
                    this.f125825i = jMin;
                }
                this.f125826j = true;
                m128924l(uax0Var);
                long j = uax0Var.f175654g;
                return j != -1 ? j : this.f125825i;
            } catch (zzgs e2) {
                throw e2;
            }
        } catch (IOException e3) {
            e = e3;
            i = 2000;
        }
    }

    @Override // p149l.z4x0
    @Nullable
    public final Uri zzc() {
        return this.f125822f;
    }

    @Override // p149l.z4x0
    public final void zzd() throws zzgs {
        this.f125822f = null;
        try {
            try {
                try {
                    FileInputStream fileInputStream = this.f125824h;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    this.f125824h = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f125823g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.f125823g = null;
                        if (this.f125826j) {
                            this.f125826j = false;
                            m128922j();
                        }
                    } catch (IOException e) {
                        throw new zzgs(e, 2000);
                    }
                } catch (IOException e2) {
                    throw new zzgs(e2, 2000);
                }
            } catch (Throwable th) {
                this.f125824h = null;
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f125823g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f125823g = null;
                    if (this.f125826j) {
                        this.f125826j = false;
                        m128922j();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new zzgs(e3, 2000);
                }
            }
        } catch (Throwable th2) {
            this.f125823g = null;
            if (this.f125826j) {
                this.f125826j = false;
                m128922j();
            }
            throw th2;
        }
    }
}
