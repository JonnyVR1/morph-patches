package p153l;

import com.google.android.gms.internal.ads.zzaff;
import com.google.android.gms.internal.ads.zzcc;
import com.tencent.ugc.TXRecordCommon;
import java.util.Collections;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes6.dex */
public final class fir0 extends jir0 {

    /* JADX INFO: renamed from: e */
    public static final int[] f99230e = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: b */
    public boolean f99231b;

    /* JADX INFO: renamed from: c */
    public boolean f99232c;

    /* JADX INFO: renamed from: d */
    public int f99233d;

    public fir0(sgr0 sgr0Var) {
        super(sgr0Var);
    }

    @Override // p153l.jir0
    /* JADX INFO: renamed from: a */
    public final boolean mo125712a(bgw0 bgw0Var) throws zzaff {
        if (this.f99231b) {
            bgw0Var.m104270l(1);
        } else {
            int iM104245B = bgw0Var.m104245B();
            int i = iM104245B >> 4;
            this.f99233d = i;
            if (i == 2) {
                int i2 = f99230e[(iM104245B >> 2) & 3];
                znr0 znr0Var = new znr0();
                znr0Var.m220672w(DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG);
                znr0Var.m220659k0(1);
                znr0Var.m220673x(i2);
                this.f121117a.mo99373d(znr0Var.m220645D());
                this.f99232c = true;
            } else if (i == 7 || i == 8) {
                znr0 znr0Var2 = new znr0();
                znr0Var2.m220672w(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                znr0Var2.m220659k0(1);
                znr0Var2.m220673x(TXRecordCommon.AUDIO_SAMPLERATE_8000);
                this.f121117a.mo99373d(znr0Var2.m220645D());
                this.f99232c = true;
            } else if (i != 10) {
                throw new zzaff("Audio format not supported: " + i);
            }
            this.f99231b = true;
        }
        return true;
    }

    @Override // p153l.jir0
    /* JADX INFO: renamed from: b */
    public final boolean mo125713b(bgw0 bgw0Var, long j) throws zzcc {
        if (this.f99233d == 2) {
            int iM104275q = bgw0Var.m104275q();
            this.f121117a.mo99375f(bgw0Var, iM104275q);
            this.f121117a.mo99372c(j, 1, iM104275q, 0, null);
            return true;
        }
        int iM104245B = bgw0Var.m104245B();
        if (iM104245B != 0 || this.f99232c) {
            if (this.f99233d == 10 && iM104245B != 1) {
                return false;
            }
            int iM104275q2 = bgw0Var.m104275q();
            this.f121117a.mo99375f(bgw0Var, iM104275q2);
            this.f121117a.mo99372c(j, 1, iM104275q2, 0, null);
            return true;
        }
        int iM104275q3 = bgw0Var.m104275q();
        byte[] bArr = new byte[iM104275q3];
        bgw0Var.m104265g(bArr, 0, iM104275q3);
        bdr0 bdr0VarM109234a = cdr0.m109234a(bArr);
        znr0 znr0Var = new znr0();
        znr0Var.m220672w("audio/mp4a-latm");
        znr0Var.m220661l0(bdr0VarM109234a.f76293c);
        znr0Var.m220659k0(bdr0VarM109234a.f76292b);
        znr0Var.m220673x(bdr0VarM109234a.f76291a);
        znr0Var.m220660l(Collections.singletonList(bArr));
        this.f121117a.mo99373d(znr0Var.m220645D());
        this.f99232c = true;
        return false;
    }
}
