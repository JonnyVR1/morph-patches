package p149l;

import com.google.android.gms.internal.consent_sdk.zzg;
import com.google.android.ump.ConsentInformation;
import com.p046p1.mobile.putong.live.base.data.BLiveResOperation;
import java.util.HashSet;

/* JADX INFO: loaded from: classes6.dex */
public final class psy0 {

    /* JADX INFO: renamed from: a */
    public final fuy0 f151079a;

    /* JADX INFO: renamed from: b */
    public final m6t0 f151080b;

    /* JADX INFO: renamed from: c */
    public int f151081c = 0;

    /* JADX INFO: renamed from: d */
    public ConsentInformation.PrivacyOptionsRequirementStatus f151082d = ConsentInformation.PrivacyOptionsRequirementStatus.UNKNOWN;

    public psy0(fuy0 fuy0Var, m6t0 m6t0Var) {
        this.f151079a = fuy0Var;
        this.f151080b = m6t0Var;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b0  */
    /* JADX INFO: renamed from: a */
    public final hxy0 m171255a() throws zzg {
        String str;
        int i = this.f151080b.f131768f;
        this.f151079a.f99370c.m159451f(i == 8);
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 1:
            case 2:
            case 3:
                this.f151081c = 3;
                break;
            case 4:
                this.f151081c = 2;
                break;
            case 5:
                this.f151081c = 1;
                break;
            case 6:
                throw new zzg(1, "Invalid response from server: ".concat(String.valueOf(this.f151080b.f131765c)));
            case 7:
                throw new zzg(3, "Publisher misconfiguration: ".concat(String.valueOf(this.f151080b.f131765c)));
            default:
                throw new zzg(1, "Invalid response from server.");
        }
        m6t0 m6t0Var = this.f151080b;
        int i3 = m6t0Var.f131769g;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        if (i4 == 1) {
            this.f151082d = ConsentInformation.PrivacyOptionsRequirementStatus.REQUIRED;
        } else {
            if (i4 != 2) {
                throw new zzg(1, "Invalid response from server.");
            }
            this.f151082d = ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED;
        }
        String str2 = m6t0Var.f131763a;
        yes0 yes0Var = str2 == null ? null : new yes0(m6t0Var.f131764b, str2);
        this.f151079a.f99370c.m159453h(new HashSet(m6t0Var.f131766d));
        for (d5t0 d5t0Var : this.f151080b.f131767e) {
            int i5 = d5t0Var.f84557b;
            int i6 = i5 - 1;
            if (i5 == 0) {
                throw null;
            }
            if (i6 == 0) {
                str = null;
            } else if (i6 == 1) {
                str = "write";
            } else if (i6 != 2) {
                str = null;
            } else {
                str = BLiveResOperation.clear;
            }
            if (str != null) {
                fuy0 fuy0Var = this.f151079a;
                fuy0Var.f99368a.m127840b(str, d5t0Var.f84556a, fuy0Var.f99369b);
            }
        }
        return new hxy0(this.f151081c, this.f151082d, yes0Var, null);
    }
}
