package p149l;

import androidx.annotation.NonNull;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.C2264v;
import com.google.android.gms.internal.ads.zzgyl;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class gaw0 {

    /* JADX INFO: renamed from: a */
    public final C2264v f101714a;

    /* JADX INFO: renamed from: b */
    public final File f101715b;

    /* JADX INFO: renamed from: c */
    public final File f101716c;

    /* JADX INFO: renamed from: d */
    public final File f101717d;

    /* JADX INFO: renamed from: e */
    public byte[] f101718e;

    public gaw0(@NonNull C2264v c2264v, @NonNull File file, @NonNull File file2, @NonNull File file3) {
        this.f101714a = c2264v;
        this.f101715b = file;
        this.f101716c = file3;
        this.f101717d = file2;
    }

    /* JADX INFO: renamed from: a */
    public final C2264v m125036a() {
        return this.f101714a;
    }

    /* JADX INFO: renamed from: b */
    public final File m125037b() {
        return this.f101716c;
    }

    /* JADX INFO: renamed from: c */
    public final File m125038c() {
        return this.f101715b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m125039d(long j) {
        return this.f101714a.m13366M() - (System.currentTimeMillis() / 1000) < 3600;
    }

    /* JADX INFO: renamed from: e */
    public final byte[] m125040e() throws Throwable {
        FileInputStream fileInputStream;
        byte[] bArrZzA;
        FileInputStream fileInputStream2 = null;
        if (this.f101718e == null) {
            try {
                fileInputStream = new FileInputStream(this.f101717d);
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
            this.f101718e = bArrZzA;
        }
        byte[] bArr2 = this.f101718e;
        if (bArr2 == null) {
            return null;
        }
        return Arrays.copyOf(bArr2, bArr2.length);
    }
}
