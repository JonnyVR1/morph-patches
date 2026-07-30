package p153l;

import androidx.annotation.NonNull;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.C2287v;
import com.google.android.gms.internal.ads.zzgyl;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class mjw0 {

    /* JADX INFO: renamed from: a */
    public final C2287v f137176a;

    /* JADX INFO: renamed from: b */
    public final File f137177b;

    /* JADX INFO: renamed from: c */
    public final File f137178c;

    /* JADX INFO: renamed from: d */
    public final File f137179d;

    /* JADX INFO: renamed from: e */
    public byte[] f137180e;

    public mjw0(@NonNull C2287v c2287v, @NonNull File file, @NonNull File file2, @NonNull File file3) {
        this.f137176a = c2287v;
        this.f137177b = file;
        this.f137178c = file3;
        this.f137179d = file2;
    }

    /* JADX INFO: renamed from: a */
    public final C2287v m158642a() {
        return this.f137176a;
    }

    /* JADX INFO: renamed from: b */
    public final File m158643b() {
        return this.f137178c;
    }

    /* JADX INFO: renamed from: c */
    public final File m158644c() {
        return this.f137177b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m158645d(long j) {
        return this.f137176a.m13420M() - (System.currentTimeMillis() / 1000) < 3600;
    }

    /* JADX INFO: renamed from: e */
    public final byte[] m158646e() throws Throwable {
        FileInputStream fileInputStream;
        byte[] bArrZzA;
        FileInputStream fileInputStream2 = null;
        if (this.f137180e == null) {
            try {
                fileInputStream = new FileInputStream(this.f137179d);
                try {
                    ArrayList arrayList = new ArrayList();
                    int iMin = 256;
                    while (true) {
                        byte[] bArr = new byte[iMin];
                        int i = 0;
                        while (i < iMin) {
                            int i2 = fileInputStream.read(bArr, i, iMin - i);
                            if (i2 == -1) {
                                break;
                            }
                            i += i2;
                        }
                        zzgyl zzgylVarZzv = i == 0 ? null : zzgyl.zzv(bArr, 0, i);
                        if (zzgylVarZzv == null) {
                            break;
                        }
                        arrayList.add(zzgylVarZzv);
                        iMin = Math.min(iMin + iMin, 8192);
                    }
                    bArrZzA = zzgyl.zzu(arrayList).zzA();
                    IOUtils.closeQuietly(fileInputStream);
                } catch (IOException unused) {
                    IOUtils.closeQuietly(fileInputStream);
                    bArrZzA = null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    IOUtils.closeQuietly(fileInputStream2);
                    throw th;
                }
            } catch (IOException unused2) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            this.f137180e = bArrZzA;
        }
        byte[] bArr2 = this.f137180e;
        if (bArr2 == null) {
            return null;
        }
        return Arrays.copyOf(bArr2, bArr2.length);
    }
}
