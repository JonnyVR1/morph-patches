package p149l;

import com.google.android.gms.internal.ads.zzaff;
import com.google.android.gms.internal.ads.zzcc;
import com.tencent.ugc.TXRecordCommon;
import java.util.Collections;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes6.dex */
public final class z8r0 extends d9r0 {

    /* JADX INFO: renamed from: e */
    public static final int[] f202196e = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: b */
    public boolean f202197b;

    /* JADX INFO: renamed from: c */
    public boolean f202198c;

    /* JADX INFO: renamed from: d */
    public int f202199d;

    public z8r0(m7r0 m7r0Var) {
        super(m7r0Var);
    }

    @Override // p149l.d9r0
    /* JADX INFO: renamed from: a */
    public final boolean mo105903a(v6w0 v6w0Var) throws zzaff {
        if (this.f202197b) {
            v6w0Var.m197263l(1);
        } else {
            int iM197238B = v6w0Var.m197238B();
            int i = iM197238B >> 4;
            this.f202199d = i;
            if (i == 2) {
                int i2 = f202196e[(iM197238B >> 2) & 3];
                ter0 ter0Var = new ter0();
                ter0Var.m188618w(DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG);
                ter0Var.m188605k0(1);
                ter0Var.m188619x(i2);
                this.f85142a.mo134531d(ter0Var.m188591D());
                this.f202198c = true;
            } else if (i == 7 || i == 8) {
                ter0 ter0Var2 = new ter0();
                ter0Var2.m188618w(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                ter0Var2.m188605k0(1);
                ter0Var2.m188619x(TXRecordCommon.AUDIO_SAMPLERATE_8000);
                this.f85142a.mo134531d(ter0Var2.m188591D());
                this.f202198c = true;
            } else if (i != 10) {
                throw new zzaff("Audio format not supported: " + i);
            }
            this.f202197b = true;
        }
        return true;
    }

    @Override // p149l.d9r0
    /* JADX INFO: renamed from: b */
    public final boolean mo105904b(v6w0 v6w0Var, long j) throws zzcc {
        if (this.f202199d == 2) {
            int iM197268q = v6w0Var.m197268q();
            this.f85142a.mo134533f(v6w0Var, iM197268q);
            this.f85142a.mo134530c(j, 1, iM197268q, 0, null);
            return true;
        }
        int iM197238B = v6w0Var.m197238B();
        if (iM197238B != 0 || this.f202198c) {
            if (this.f202199d == 10 && iM197238B != 1) {
                return false;
            }
            int iM197268q2 = v6w0Var.m197268q();
            this.f85142a.mo134533f(v6w0Var, iM197268q2);
            this.f85142a.mo134530c(j, 1, iM197268q2, 0, null);
            return true;
        }
        int iM197268q3 = v6w0Var.m197268q();
        byte[] bArr = new byte[iM197268q3];
        v6w0Var.m197258g(bArr, 0, iM197268q3);
        v3r0 v3r0VarM201388a = w3r0.m201388a(bArr);
        ter0 ter0Var = new ter0();
        ter0Var.m188618w("audio/mp4a-latm");
        ter0Var.m188607l0(v3r0VarM201388a.f179842c);
        ter0Var.m188605k0(v3r0VarM201388a.f179841b);
        ter0Var.m188619x(v3r0VarM201388a.f179840a);
        ter0Var.m188606l(Collections.singletonList(bArr));
        this.f85142a.mo134531d(ter0Var.m188591D());
        this.f202198c = true;
        return false;
    }
}
