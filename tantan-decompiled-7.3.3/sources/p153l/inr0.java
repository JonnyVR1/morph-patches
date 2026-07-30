package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class inr0 {

    /* JADX INFO: renamed from: a */
    public final boolean f115993a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f115994b;

    /* JADX INFO: renamed from: c */
    public final ggr0 f115995c;

    /* JADX INFO: renamed from: d */
    public final int f115996d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final byte[] f115997e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:26:0x004b, please report this as an issue */
    public inr0(boolean z, @Nullable String str, int i, byte[] bArr, int i2, int i3, @Nullable byte[] bArr2) {
        int i4 = 1;
        lev0.m153956d((bArr2 == null) ^ (i == 0));
        this.f115993a = z;
        this.f115994b = str;
        this.f115996d = i;
        this.f115997e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals("cbc1")) {
                        y4w0.m214278f("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    } else {
                        i4 = 2;
                    }
                    break;
                case 3046671:
                    if (!str.equals("cbcs")) {
                        y4w0.m214278f("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    } else {
                        i4 = 2;
                    }
                    break;
                case 3049879:
                    if (!str.equals("cenc")) {
                        y4w0.m214278f("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    }
                    break;
                case 3049895:
                    if (!str.equals("cens")) {
                        y4w0.m214278f("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    }
                    break;
                default:
                    y4w0.m214278f("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    break;
            }
        }
        this.f115995c = new ggr0(i4, bArr, i2, i3);
    }
}
