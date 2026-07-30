package p153l;

import com.google.android.gms.internal.ads.zzcc;
import com.tencent.ugc.TXRecordCommon;

/* JADX INFO: loaded from: classes6.dex */
public final class cdr0 {

    /* JADX INFO: renamed from: a */
    public static final int[] f81260a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, TXRecordCommon.AUDIO_SAMPLERATE_8000, 7350};

    /* JADX INFO: renamed from: b */
    public static final int[] f81261b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: a */
    public static bdr0 m109234a(byte[] bArr) throws zzcc {
        return m109235b(new dfw0(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00af, code lost:
    
        if (r12 != 3) goto L59;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static bdr0 m109235b(dfw0 dfw0Var, boolean z) throws zzcc {
        int iM109236c = m109236c(dfw0Var);
        int iM109237d = m109237d(dfw0Var);
        int iM115552d = dfw0Var.m115552d(4);
        String str = "mp4a.40." + iM109236c;
        int i = 22;
        if (iM109236c == 5 || iM109236c == 29) {
            iM109237d = m109237d(dfw0Var);
            iM109236c = m109236c(dfw0Var);
            if (iM109236c == 22) {
                iM115552d = dfw0Var.m115552d(4);
            }
        }
        if (z) {
            int i2 = 3;
            if (iM109236c != 1 && iM109236c != 2 && iM109236c != 3 && iM109236c != 4 && iM109236c != 6 && iM109236c != 7 && iM109236c != 17) {
                switch (iM109236c) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw zzcc.zzc("Unsupported audio object type: " + iM109236c);
                }
            }
            if (dfw0Var.m115563o()) {
                y4w0.m214278f("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (dfw0Var.m115563o()) {
                dfw0Var.m115561m(14);
            }
            boolean zM115563o = dfw0Var.m115563o();
            if (iM115552d == 0) {
                l710.m153113a();
                return null;
            }
            if (iM109236c == 6) {
                dfw0Var.m115561m(3);
            } else if (iM109236c == 20) {
                iM109236c = 20;
                dfw0Var.m115561m(3);
            }
            if (zM115563o) {
                if (iM109236c == 22) {
                    dfw0Var.m115561m(16);
                } else {
                    i = iM109236c;
                }
                if (i == 17 || i == 19 || i == 20 || i == 23) {
                    dfw0Var.m115561m(3);
                }
                dfw0Var.m115561m(1);
            }
            switch (iM109236c) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iM115552d2 = dfw0Var.m115552d(2);
                    if (iM115552d2 == 2) {
                        i2 = iM115552d2;
                    }
                    throw zzcc.zzc("Unsupported epConfig: " + i2);
            }
        }
        int i3 = f81261b[iM115552d];
        if (i3 != -1) {
            return new bdr0(iM109237d, i3, str, null);
        }
        throw zzcc.zza(null, null);
    }

    /* JADX INFO: renamed from: c */
    public static int m109236c(dfw0 dfw0Var) {
        int iM115552d = dfw0Var.m115552d(5);
        return iM115552d == 31 ? dfw0Var.m115552d(6) + 32 : iM115552d;
    }

    /* JADX INFO: renamed from: d */
    public static int m109237d(dfw0 dfw0Var) throws zzcc {
        int iM115552d = dfw0Var.m115552d(4);
        if (iM115552d == 15) {
            if (dfw0Var.m115549a() >= 24) {
                return dfw0Var.m115552d(24);
            }
            throw zzcc.zza("AAC header insufficient data", null);
        }
        if (iM115552d < 13) {
            return f81260a[iM115552d];
        }
        throw zzcc.zza("AAC header wrong Sampling Frequency Index", null);
    }
}
