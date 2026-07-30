package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzgaa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class vrr0 implements fur0 {

    /* JADX INFO: renamed from: a */
    public final List f185517a;

    public vrr0(int i) {
        this.f185517a = zzgaa.zzl();
    }

    @Override // p153l.fur0
    @Nullable
    /* JADX INFO: renamed from: a */
    public final hur0 mo127540a(int i, eur0 eur0Var) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new atr0(new xsr0(eur0Var.f95951b));
            }
            if (i == 21) {
                return new atr0(new vsr0());
            }
            if (i == 27) {
                return new atr0(new ssr0(m202534b(eur0Var), false, false));
            }
            if (i == 36) {
                return new atr0(new usr0(m202534b(eur0Var)));
            }
            if (i == 89) {
                return new atr0(new xrr0(eur0Var.f95952c));
            }
            if (i == 138) {
                return new atr0(new wrr0(eur0Var.f95951b));
            }
            if (i == 172) {
                return new atr0(new rrr0(eur0Var.f95951b));
            }
            if (i == 257) {
                return new jtr0(new zsr0("application/vnd.dvb.ait"));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i == 134) {
                        return new jtr0(new zsr0("application/x-scte35"));
                    }
                    if (i != 135) {
                        switch (i) {
                            case 15:
                                return new atr0(new urr0(false, eur0Var.f95951b));
                            case 16:
                                return new atr0(new osr0(m202535c(eur0Var)));
                            case 17:
                                return new atr0(new wsr0(eur0Var.f95951b));
                            default:
                                return null;
                        }
                    }
                }
                return new atr0(new orr0(eur0Var.f95951b));
            }
        }
        return new atr0(new lsr0(m202535c(eur0Var)));
    }

    /* JADX INFO: renamed from: b */
    public final ktr0 m202534b(eur0 eur0Var) {
        return new ktr0(m202536d(eur0Var));
    }

    /* JADX INFO: renamed from: c */
    public final jur0 m202535c(eur0 eur0Var) {
        return new jur0(m202536d(eur0Var));
    }

    /* JADX INFO: renamed from: d */
    public final List m202536d(eur0 eur0Var) {
        String str;
        int i;
        List listSingletonList;
        bgw0 bgw0Var = new bgw0(eur0Var.f95953d);
        List arrayList = this.f185517a;
        while (bgw0Var.m104275q() > 0) {
            int iM104245B = bgw0Var.m104245B();
            int iM104277s = bgw0Var.m104277s() + bgw0Var.m104245B();
            if (iM104245B == 134) {
                arrayList = new ArrayList();
                int iM104245B2 = bgw0Var.m104245B() & 31;
                for (int i2 = 0; i2 < iM104245B2; i2++) {
                    String strM104259a = bgw0Var.m104259a(3, cow0.f82931c);
                    int iM104245B3 = bgw0Var.m104245B();
                    boolean z = (iM104245B3 & 128) != 0;
                    if (z) {
                        i = iM104245B3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bM104245B = (byte) bgw0Var.m104245B();
                    bgw0Var.m104270l(1);
                    if (z) {
                        int i3 = bM104245B & 64;
                        byte[] bArr = rgv0.f163050a;
                        listSingletonList = Collections.singletonList(i3 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    znr0 znr0Var = new znr0();
                    znr0Var.m220672w(str);
                    znr0Var.m220663n(strM104259a);
                    znr0Var.m220655i0(i);
                    znr0Var.m220660l(listSingletonList);
                    arrayList.add(znr0Var.m220645D());
                }
            }
            bgw0Var.m104269k(iM104277s);
        }
        return arrayList;
    }

    public vrr0() {
        this(0);
    }

    public vrr0(int i, List list) {
        this.f185517a = list;
    }
}
