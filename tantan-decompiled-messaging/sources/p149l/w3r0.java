package p149l;

import com.google.android.gms.internal.ads.zzcc;
import com.tencent.ugc.TXRecordCommon;

/* JADX INFO: loaded from: classes6.dex */
public final class w3r0 {

    /* JADX INFO: renamed from: a */
    public static final int[] f184432a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, TXRecordCommon.AUDIO_SAMPLERATE_8000, 7350};

    /* JADX INFO: renamed from: b */
    public static final int[] f184433b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: a */
    public static v3r0 m201388a(byte[] bArr) throws zzcc {
        return m201389b(new x5w0(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00af, code lost:
    
        if (r12 != 3) goto L59;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p149l.v3r0 m201389b(p149l.x5w0 r12, boolean r13) throws com.google.android.gms.internal.ads.zzcc {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.w3r0.m201389b(l.x5w0, boolean):l.v3r0");
    }

    /* JADX INFO: renamed from: c */
    public static int m201390c(x5w0 x5w0Var) {
        int iM207150d = x5w0Var.m207150d(5);
        return iM207150d == 31 ? x5w0Var.m207150d(6) + 32 : iM207150d;
    }

    /* JADX INFO: renamed from: d */
    public static int m201391d(x5w0 x5w0Var) throws zzcc {
        int iM207150d = x5w0Var.m207150d(4);
        if (iM207150d == 15) {
            if (x5w0Var.m207147a() >= 24) {
                return x5w0Var.m207150d(24);
            }
            throw zzcc.zza("AAC header insufficient data", null);
        }
        if (iM207150d < 13) {
            return f184432a[iM207150d];
        }
        throw zzcc.zza("AAC header wrong Sampling Frequency Index", null);
    }
}
