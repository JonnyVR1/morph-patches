package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class cer0 {

    /* JADX INFO: renamed from: a */
    public final boolean f80485a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f80486b;

    /* JADX INFO: renamed from: c */
    public final a7r0 f80487c;

    /* JADX INFO: renamed from: d */
    public final int f80488d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final byte[] f80489e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:26:0x004b, please report this as an issue */
    public cer0(boolean z, @Nullable String str, int i, byte[] bArr, int i2, int i3, @Nullable byte[] bArr2) {
        int i4 = 1;
        f5v0.m119533d((bArr2 == null) ^ (i == 0));
        this.f80485a = z;
        this.f80486b = str;
        this.f80488d = i;
        this.f80489e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals("cbc1")) {
                        svv0.m186111f("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    } else {
                        i4 = 2;
                    }
                    break;
                case 3046671:
                    if (!str.equals("cbcs")) {
                        svv0.m186111f("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    } else {
                        i4 = 2;
                    }
                    break;
                case 3049879:
                    if (!str.equals("cenc")) {
                        svv0.m186111f("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    }
                    break;
                case 3049895:
                    if (!str.equals("cens")) {
                        svv0.m186111f("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    }
                    break;
                default:
                    svv0.m186111f("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    break;
            }
        }
        this.f80487c = new a7r0(i4, bArr, i2, i3);
    }
}
