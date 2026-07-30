package p153l;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.common.collect.ImmutableList;
import com.momo.momortc.MMConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class mtd implements jkj0.InterfaceC17968c {

    /* JADX INFO: renamed from: a */
    public final int f138598a;

    /* JADX INFO: renamed from: b */
    public final List<C1894k> f138599b;

    public mtd(int i) {
        this(i, ImmutableList.m15739of());
    }

    @Override // p153l.jkj0.InterfaceC17968c
    /* JADX INFO: renamed from: a */
    public SparseArray<jkj0> mo145852a() {
        return new SparseArray<>();
    }

    @Override // p153l.jkj0.InterfaceC17968c
    @Nullable
    /* JADX INFO: renamed from: b */
    public jkj0 mo145853b(int i, jkj0.C17967b c17967b) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new yw60(new h710(c17967b.f121414b));
            }
            if (i == 21) {
                return new yw60(new mdm());
            }
            if (i == 27) {
                if (m159986f(4)) {
                    return null;
                }
                return new yw60(new qwk(m159983c(c17967b), m159986f(1), m159986f(8)));
            }
            if (i == 36) {
                return new yw60(new rwk(m159983c(c17967b)));
            }
            if (i == 89) {
                return new yw60(new yfe(c17967b.f121415c));
            }
            if (i != 138) {
                if (i == 172) {
                    return new yw60(new C16211c9(c17967b.f121414b));
                }
                if (i == 257) {
                    return new zee0(new yg60("application/vnd.dvb.ait"));
                }
                if (i == 134) {
                    if (m159986f(16)) {
                        return null;
                    }
                    return new zee0(new yg60("application/x-scte35"));
                }
                if (i != 135) {
                    switch (i) {
                        case 15:
                            if (m159986f(2)) {
                                return null;
                            }
                            return new yw60(new w90(false, c17967b.f121414b));
                        case 16:
                            return new yw60(new owk(m159984d(c17967b)));
                        case 17:
                            if (m159986f(2)) {
                                return null;
                            }
                            return new yw60(new e9r(c17967b.f121414b));
                        default:
                            switch (i) {
                                case 128:
                                    break;
                                case MMConstants.ERR_WATERMARK_READ /* 129 */:
                                    break;
                                case 130:
                                    if (!m159986f(64)) {
                                        return null;
                                    }
                                    break;
                                default:
                                    return null;
                            }
                            break;
                    }
                }
                return new yw60(new C21540y8(c17967b.f121414b));
            }
            return new yw60(new nfe(c17967b.f121414b));
        }
        return new yw60(new nwk(m159984d(c17967b)));
    }

    /* JADX INFO: renamed from: c */
    public final vke0 m159983c(jkj0.C17967b c17967b) {
        return new vke0(m159985e(c17967b));
    }

    /* JADX INFO: renamed from: d */
    public final bek0 m159984d(jkj0.C17967b c17967b) {
        return new bek0(m159985e(c17967b));
    }

    /* JADX INFO: renamed from: e */
    public final List<C1894k> m159985e(jkj0.C17967b c17967b) {
        String str;
        int i;
        if (m159986f(32)) {
            return this.f138599b;
        }
        ig60 ig60Var = new ig60(c17967b.f121416d);
        List<C1894k> arrayList = this.f138599b;
        while (ig60Var.m139811a() > 0) {
            int iM139795H = ig60Var.m139795H();
            int iM139816f = ig60Var.m139816f() + ig60Var.m139795H();
            if (iM139795H == 134) {
                arrayList = new ArrayList<>();
                int iM139795H2 = ig60Var.m139795H() & 31;
                for (int i2 = 0; i2 < iM139795H2; i2++) {
                    String strM139792E = ig60Var.m139792E(3);
                    int iM139795H3 = ig60Var.m139795H();
                    boolean z = (iM139795H3 & 128) != 0;
                    if (z) {
                        i = iM139795H3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bM139795H = (byte) ig60Var.m139795H();
                    ig60Var.m139809V(1);
                    arrayList.add(new C1894k.b().m10400g0(str).m10391X(strM139792E).m10375H(i).m10389V(z ? lc5.m153622b((bM139795H & 64) != 0) : null).m10374G());
                }
            }
            ig60Var.m139808U(iM139816f);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m159986f(int i) {
        return (this.f138598a & i) != 0;
    }

    public mtd() {
        this(0);
    }

    public mtd(int i, List<C1894k> list) {
        this.f138598a = i;
        this.f138599b = list;
    }
}
