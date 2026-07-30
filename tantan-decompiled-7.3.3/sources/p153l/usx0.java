package p153l;

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
public final class usx0 extends m8x0 {

    /* JADX INFO: renamed from: e */
    public final Context f180870e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public akx0 f180871f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public AssetFileDescriptor f180872g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public InputStream f180873h;

    /* JADX INFO: renamed from: i */
    public long f180874i;

    /* JADX INFO: renamed from: j */
    public boolean f180875j;

    public usx0(Context context) {
        super(false);
        this.f180870e = context.getApplicationContext();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00db A[Catch: NumberFormatException -> 0x0100, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x0100, blocks: (B:35:0x00d5, B:37:0x00db, B:46:0x00ff), top: B:51:0x00d5 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ff A[Catch: NumberFormatException -> 0x0100, TRY_ENTER, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x0100, blocks: (B:35:0x00d5, B:37:0x00db, B:46:0x00ff), top: B:51:0x00d5 }] */
    /* JADX INFO: renamed from: m */
    public static AssetFileDescriptor m197955m(Context context, akx0 akx0Var) throws zzhv {
        Resources resources;
        String lastPathSegment;
        int identifier;
        Uri uriNormalizeScheme = akx0Var.f72047a.normalizeScheme();
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

    @Override // p153l.nyy0
    /* JADX INFO: renamed from: a */
    public final int mo12781a(byte[] bArr, int i, int i2) throws zzhv {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f180874i;
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
        InputStream inputStream = this.f180873h;
        int i3 = mpw0.f137957a;
        int i4 = inputStream.read(bArr, i, i2);
        long j2 = this.f180874i;
        if (i4 == -1) {
            if (j2 == -1) {
                return -1;
            }
            throw new zzhv("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        if (j2 != -1) {
            this.f180874i = j2 - ((long) i4);
        }
        zzg(i4);
        return i4;
    }

    @Override // p153l.fex0
    /* JADX INFO: renamed from: e */
    public final long mo12782e(akx0 akx0Var) throws zzhv {
        long size;
        this.f180871f = akx0Var;
        m157522k(akx0Var);
        AssetFileDescriptor assetFileDescriptorM197955m = m197955m(this.f180870e, akx0Var);
        this.f180872g = assetFileDescriptorM197955m;
        long length = assetFileDescriptorM197955m.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.f180872g.getFileDescriptor());
        this.f180873h = fileInputStream;
        if (length != -1) {
            try {
                if (akx0Var.f72052f > length) {
                    throw new zzhv(null, null, 2008);
                }
            } catch (zzhv e) {
                throw e;
            } catch (IOException e2) {
                throw new zzhv(null, e2, 2000);
            }
        }
        long startOffset = this.f180872g.getStartOffset();
        long jSkip = fileInputStream.skip(akx0Var.f72052f + startOffset) - startOffset;
        if (jSkip != akx0Var.f72052f) {
            throw new zzhv(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.f180874i = -1L;
                size = -1;
            } else {
                size = channel.size() - channel.position();
                this.f180874i = size;
                if (size < 0) {
                    throw new zzhv(null, null, 2008);
                }
            }
        } else {
            size = length - jSkip;
            this.f180874i = size;
            if (size < 0) {
                throw new zzgx(2008);
            }
        }
        long jMin = akx0Var.f72053g;
        if (jMin != -1) {
            if (size != -1) {
                jMin = Math.min(size, jMin);
            }
            this.f180874i = jMin;
        }
        this.f180875j = true;
        m157523l(akx0Var);
        long j = akx0Var.f72053g;
        return j != -1 ? j : this.f180874i;
    }

    @Override // p153l.fex0
    @Nullable
    public final Uri zzc() {
        akx0 akx0Var = this.f180871f;
        if (akx0Var != null) {
            return akx0Var.f72047a;
        }
        return null;
    }

    @Override // p153l.fex0
    public final void zzd() throws zzhv {
        this.f180871f = null;
        try {
            try {
                try {
                    InputStream inputStream = this.f180873h;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    this.f180873h = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f180872g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.f180872g = null;
                        if (this.f180875j) {
                            this.f180875j = false;
                            m157521j();
                        }
                    } catch (IOException e) {
                        throw new zzhv(null, e, 2000);
                    }
                } catch (IOException e2) {
                    throw new zzhv(null, e2, 2000);
                }
            } catch (Throwable th) {
                this.f180873h = null;
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f180872g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f180872g = null;
                    if (this.f180875j) {
                        this.f180875j = false;
                        m157521j();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new zzhv(null, e3, 2000);
                }
            }
        } catch (Throwable th2) {
            this.f180872g = null;
            if (this.f180875j) {
                this.f180875j = false;
                m157521j();
            }
            throw th2;
        }
    }
}
