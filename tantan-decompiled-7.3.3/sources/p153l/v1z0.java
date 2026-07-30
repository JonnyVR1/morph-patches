package p153l;

import com.google.android.gms.internal.consent_sdk.zzg;
import com.google.android.ump.ConsentInformation;
import com.p051p1.mobile.putong.live.base.data.BLiveResOperation;
import java.util.HashSet;

/* JADX INFO: loaded from: classes6.dex */
public final class v1z0 {

    /* JADX INFO: renamed from: a */
    public final l3z0 f182036a;

    /* JADX INFO: renamed from: b */
    public final sft0 f182037b;

    /* JADX INFO: renamed from: c */
    public int f182038c = 0;

    /* JADX INFO: renamed from: d */
    public ConsentInformation.PrivacyOptionsRequirementStatus f182039d = ConsentInformation.PrivacyOptionsRequirementStatus.UNKNOWN;

    public v1z0(l3z0 l3z0Var, sft0 sft0Var) {
        this.f182036a = l3z0Var;
        this.f182037b = sft0Var;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b0  */
    /* JADX INFO: renamed from: a */
    public final n6z0 m199090a() throws zzg {
        String str;
        int i = this.f182037b.f167772f;
        this.f182036a.f129921c.m192356f(i == 8);
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 1:
            case 2:
            case 3:
                this.f182038c = 3;
                break;
            case 4:
                this.f182038c = 2;
                break;
            case 5:
                this.f182038c = 1;
                break;
            case 6:
                throw new zzg(1, "Invalid response from server: ".concat(String.valueOf(this.f182037b.f167769c)));
            case 7:
                throw new zzg(3, "Publisher misconfiguration: ".concat(String.valueOf(this.f182037b.f167769c)));
            default:
                throw new zzg(1, "Invalid response from server.");
        }
        sft0 sft0Var = this.f182037b;
        int i3 = sft0Var.f167773g;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        if (i4 == 1) {
            this.f182039d = ConsentInformation.PrivacyOptionsRequirementStatus.REQUIRED;
        } else {
            if (i4 != 2) {
                throw new zzg(1, "Invalid response from server.");
            }
            this.f182039d = ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED;
        }
        String str2 = sft0Var.f167767a;
        eos0 eos0Var = str2 == null ? null : new eos0(sft0Var.f167768b, str2);
        this.f182036a.f129921c.m192358h(new HashSet(sft0Var.f167770d));
        for (jet0 jet0Var : this.f182037b.f167771e) {
            int i5 = jet0Var.f120524b;
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
                l3z0 l3z0Var = this.f182036a;
                l3z0Var.f129919a.m156722b(str, jet0Var.f120523a, l3z0Var.f129920b);
            }
        }
        return new n6z0(this.f182038c, this.f182039d, eos0Var, null);
    }
}
