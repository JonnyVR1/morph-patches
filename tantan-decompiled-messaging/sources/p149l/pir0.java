package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzgaa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class pir0 implements zkr0 {

    /* JADX INFO: renamed from: a */
    public final List f149679a;

    public pir0(int i) {
        this.f149679a = zzgaa.zzl();
    }

    @Override // p149l.zkr0
    @Nullable
    /* JADX INFO: renamed from: a */
    public final blr0 mo169758a(int i, ykr0 ykr0Var) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new ujr0(new rjr0(ykr0Var.f198827b));
            }
            if (i == 21) {
                return new ujr0(new pjr0());
            }
            if (i == 27) {
                return new ujr0(new mjr0(m169759b(ykr0Var), false, false));
            }
            if (i == 36) {
                return new ujr0(new ojr0(m169759b(ykr0Var)));
            }
            if (i == 89) {
                return new ujr0(new rir0(ykr0Var.f198828c));
            }
            if (i == 138) {
                return new ujr0(new qir0(ykr0Var.f198827b));
            }
            if (i == 172) {
                return new ujr0(new lir0(ykr0Var.f198827b));
            }
            if (i == 257) {
                return new dkr0(new tjr0("application/vnd.dvb.ait"));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i == 134) {
                        return new dkr0(new tjr0("application/x-scte35"));
                    }
                    if (i != 135) {
                        switch (i) {
                            case 15:
                                return new ujr0(new oir0(false, ykr0Var.f198827b));
                            case 16:
                                return new ujr0(new ijr0(m169760c(ykr0Var)));
                            case 17:
                                return new ujr0(new qjr0(ykr0Var.f198827b));
                            default:
                                return null;
                        }
                    }
                }
                return new ujr0(new iir0(ykr0Var.f198827b));
            }
        }
        return new ujr0(new fjr0(m169760c(ykr0Var)));
    }

    /* JADX INFO: renamed from: b */
    public final ekr0 m169759b(ykr0 ykr0Var) {
        return new ekr0(m169761d(ykr0Var));
    }

    /* JADX INFO: renamed from: c */
    public final dlr0 m169760c(ykr0 ykr0Var) {
        return new dlr0(m169761d(ykr0Var));
    }

    /* JADX INFO: renamed from: d */
    public final List m169761d(ykr0 ykr0Var) {
        String str;
        int i;
        List listSingletonList;
        v6w0 v6w0Var = new v6w0(ykr0Var.f198829d);
        List arrayList = this.f149679a;
        while (v6w0Var.m197268q() > 0) {
            int iM197238B = v6w0Var.m197238B();
            int iM197270s = v6w0Var.m197270s() + v6w0Var.m197238B();
            if (iM197238B == 134) {
                arrayList = new ArrayList();
                int iM197238B2 = v6w0Var.m197238B() & 31;
                for (int i2 = 0; i2 < iM197238B2; i2++) {
                    String strM197252a = v6w0Var.m197252a(3, wew0.f185990c);
                    int iM197238B3 = v6w0Var.m197238B();
                    boolean z = (iM197238B3 & 128) != 0;
                    if (z) {
                        i = iM197238B3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bM197238B = (byte) v6w0Var.m197238B();
                    v6w0Var.m197263l(1);
                    if (z) {
                        int i3 = bM197238B & 64;
                        byte[] bArr = l7v0.f126751a;
                        listSingletonList = Collections.singletonList(i3 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    ter0 ter0Var = new ter0();
                    ter0Var.m188618w(str);
                    ter0Var.m188609n(strM197252a);
                    ter0Var.m188601i0(i);
                    ter0Var.m188606l(listSingletonList);
                    arrayList.add(ter0Var.m188591D());
                }
            }
            v6w0Var.m197262k(iM197270s);
        }
        return arrayList;
    }

    public pir0() {
        this(0);
    }

    public pir0(int i, List list) {
        this.f149679a = list;
    }
}
