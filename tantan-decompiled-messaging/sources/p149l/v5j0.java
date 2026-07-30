package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class v5j0 {

    /* JADX INFO: renamed from: a */
    public final boolean f180057a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f180058b;

    /* JADX INFO: renamed from: c */
    public final m6j0.C18401a f180059c;

    /* JADX INFO: renamed from: d */
    public final int f180060d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final byte[] f180061e;

    public v5j0(boolean z, @Nullable String str, int i, byte[] bArr, int i2, int i3, @Nullable byte[] bArr2) {
        p11.m167007a((bArr2 == null) ^ (i == 0));
        this.f180057a = z;
        this.f180058b = str;
        this.f180060d = i;
        this.f180061e = bArr2;
        this.f180059c = new m6j0.C18401a(m197118a(str), bArr, i2, i3);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public static int m197118a(@Nullable String str) {
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
                jwv.m143689i("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
