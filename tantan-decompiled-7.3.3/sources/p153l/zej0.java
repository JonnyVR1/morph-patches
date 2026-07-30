package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class zej0 {

    /* JADX INFO: renamed from: a */
    public final boolean f204030a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f204031b;

    /* JADX INFO: renamed from: c */
    public final qfj0.C19562a f204032c;

    /* JADX INFO: renamed from: d */
    public final int f204033d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final byte[] f204034e;

    public zej0(boolean z, @Nullable String str, int i, byte[] bArr, int i2, int i3, @Nullable byte[] bArr2) {
        w11.m204365a((bArr2 == null) ^ (i == 0));
        this.f204030a = z;
        this.f204031b = str;
        this.f204033d = i;
        this.f204034e = bArr2;
        this.f204032c = new qfj0.C19562a(m219498a(str), bArr, i2, i3);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public static int m219498a(@Nullable String str) {
        if (str == null) {
            return 1;
        }
        byte b = -1;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    b = 0;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    b = 1;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    b = 2;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    b = 3;
                }
                break;
        }
        switch (b) {
            case 0:
            case 1:
                return 2;
            default:
                kyv.m152151i("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
