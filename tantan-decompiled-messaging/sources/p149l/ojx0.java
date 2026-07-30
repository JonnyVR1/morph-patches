package p149l;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzgx;
import com.google.android.gms.internal.ads.zzhv;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes6.dex */
public final class ojx0 extends gzw0 {

    /* JADX INFO: renamed from: e */
    public final Context f144381e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public uax0 f144382f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public AssetFileDescriptor f144383g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public InputStream f144384h;

    /* JADX INFO: renamed from: i */
    public long f144385i;

    /* JADX INFO: renamed from: j */
    public boolean f144386j;

    public ojx0(Context context) {
        super(false);
        this.f144381e = context.getApplicationContext();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00db A[Catch: NumberFormatException -> 0x0100, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x0100, blocks: (B:35:0x00d5, B:37:0x00db, B:46:0x00ff), top: B:51:0x00d5 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ff A[Catch: NumberFormatException -> 0x0100, TRY_ENTER, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x0100, blocks: (B:35:0x00d5, B:37:0x00db, B:46:0x00ff), top: B:51:0x00d5 }] */
    /* JADX INFO: renamed from: m */
    public static AssetFileDescriptor m164799m(Context context, uax0 uax0Var) throws zzhv {
        Resources resources;
        String lastPathSegment;
        int identifier;
        Uri uriNormalizeScheme = uax0Var.f175648a.normalizeScheme();
        if (TextUtils.equals("rawresource", uriNormalizeScheme.getScheme())) {
            resources = context.getResources();
            try {
                lastPathSegment = uriNormalizeScheme.getLastPathSegment();
                if (lastPathSegment != null) {
                    throw null;
                }
                identifier = Integer.parseInt(lastPathSegment);
            } catch (NumberFormatException unused) {
                throw new zzhv("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (TextUtils.equals("android.resource", uriNormalizeScheme.getScheme()) && uriNormalizeScheme.getPathSegments().size() == 1) {
                String lastPathSegment2 = uriNormalizeScheme.getLastPathSegment();
                lastPathSegment2.getClass();
                if (lastPathSegment2.matches("\\d+")) {
                    resources = context.getResources();
                    lastPathSegment = uriNormalizeScheme.getLastPathSegment();
                    if (lastPathSegment != null) {
                        throw null;
                    }
                    identifier = Integer.parseInt(lastPathSegment);
                }
            }
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new zzhv("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resources = context.getResources();
            } else {
                try {
                    resources = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new zzhv("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            identifier = resources.getIdentifier(packageName + ":" + path, "raw", null);
            if (identifier == 0) {
                throw new zzhv("Resource not found.", null, 2005);
            }
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(identifier);
            if (assetFileDescriptorOpenRawResourceFd != null) {
                return assetFileDescriptorOpenRawResourceFd;
            }
            throw new zzhv("Resource is compressed: ".concat(String.valueOf(uriNormalizeScheme)), null, 2000);
        } catch (Resources.NotFoundException e2) {
            throw new zzhv(null, e2, 2005);
        }
    }

    @Override // p149l.hpy0
    /* JADX INFO: renamed from: a */
    public final int mo12727a(byte[] bArr, int i, int i2) throws zzhv {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f144385i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new zzhv(null, e, 2000);
            }
        }
        InputStream inputStream = this.f144384h;
        int i3 = ggw0.f102568a;
        int i4 = inputStream.read(bArr, i, i2);
        long j2 = this.f144385i;
        if (i4 == -1) {
            if (j2 == -1) {
                return -1;
            }
            throw new zzhv("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        if (j2 != -1) {
            this.f144385i = j2 - ((long) i4);
        }
        zzg(i4);
        return i4;
    }

    @Override // p149l.z4x0
    /* JADX INFO: renamed from: e */
    public final long mo12728e(uax0 uax0Var) throws zzhv {
        long size;
        this.f144382f = uax0Var;
        m128923k(uax0Var);
        AssetFileDescriptor assetFileDescriptorM164799m = m164799m(this.f144381e, uax0Var);
        this.f144383g = assetFileDescriptorM164799m;
        long length = assetFileDescriptorM164799m.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.f144383g.getFileDescriptor());
        this.f144384h = fileInputStream;
        if (length != -1) {
            try {
                if (uax0Var.f175653f > length) {
                    throw new zzhv(null, null, 2008);
                }
            } catch (zzhv e) {
                throw e;
            } catch (IOException e2) {
                throw new zzhv(null, e2, 2000);
            }
        }
        long startOffset = this.f144383g.getStartOffset();
        long jSkip = fileInputStream.skip(uax0Var.f175653f + startOffset) - startOffset;
        if (jSkip != uax0Var.f175653f) {
            throw new zzhv(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.f144385i = -1L;
                size = -1;
            } else {
                size = channel.size() - channel.position();
                this.f144385i = size;
                if (size < 0) {
                    throw new zzhv(null, null, 2008);
                }
            }
        } else {
            size = length - jSkip;
            this.f144385i = size;
            if (size < 0) {
                throw new zzgx(2008);
            }
        }
        long jMin = uax0Var.f175654g;
        if (jMin != -1) {
            if (size != -1) {
                jMin = Math.min(size, jMin);
            }
            this.f144385i = jMin;
        }
        this.f144386j = true;
        m128924l(uax0Var);
        long j = uax0Var.f175654g;
        return j != -1 ? j : this.f144385i;
    }

    @Override // p149l.z4x0
    @Nullable
    public final Uri zzc() {
        uax0 uax0Var = this.f144382f;
        if (uax0Var != null) {
            return uax0Var.f175648a;
        }
        return null;
    }

    @Override // p149l.z4x0
    public final void zzd() throws zzhv {
        this.f144382f = null;
        try {
            try {
                try {
                    InputStream inputStream = this.f144384h;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    this.f144384h = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f144383g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.f144383g = null;
                        if (this.f144386j) {
                            this.f144386j = false;
                            m128922j();
                        }
                    } catch (IOException e) {
                        throw new zzhv(null, e, 2000);
                    }
                } catch (IOException e2) {
                    throw new zzhv(null, e2, 2000);
                }
            } catch (Throwable th) {
                this.f144384h = null;
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f144383g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f144383g = null;
                    if (this.f144386j) {
                        this.f144386j = false;
                        m128922j();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new zzhv(null, e3, 2000);
                }
            }
        } catch (Throwable th2) {
            this.f144383g = null;
            if (this.f144386j) {
                this.f144386j = false;
                m128922j();
            }
            throw th2;
        }
    }
}
