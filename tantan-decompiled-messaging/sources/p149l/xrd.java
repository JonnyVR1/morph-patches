package p149l;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.common.collect.ImmutableList;
import com.momo.momortc.MMConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class xrd implements fbj0.InterfaceC16792c {

    /* JADX INFO: renamed from: a */
    public final int f194108a;

    /* JADX INFO: renamed from: b */
    public final List<C1871k> f194109b;

    public xrd(int i) {
        this(i, ImmutableList.m15685of());
    }

    @Override // p149l.fbj0.InterfaceC16792c
    /* JADX INFO: renamed from: a */
    public SparseArray<fbj0> mo120355a() {
        return new SparseArray<>();
    }

    @Override // p149l.fbj0.InterfaceC16792c
    @Nullable
    /* JADX INFO: renamed from: b */
    public fbj0 mo120356b(int i, fbj0.C16791b c16791b) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new so60(new xy00(c16791b.f96726b));
            }
            if (i == 21) {
                return new so60(new wam());
            }
            if (i == 27) {
                if (m210672f(4)) {
                    return null;
                }
                return new so60(new auk(m210669c(c16791b), m210672f(1), m210672f(8)));
            }
            if (i == 36) {
                return new so60(new buk(m210669c(c16791b)));
            }
            if (i == 89) {
                return new so60(new uee(c16791b.f96727c));
            }
            if (i != 138) {
                if (i == 172) {
                    return new so60(new C17247h9(c16791b.f96726b));
                }
                if (i == 257) {
                    return new u6e0(new t860("application/vnd.dvb.ait"));
                }
                if (i == 134) {
                    if (m210672f(16)) {
                        return null;
                    }
                    return new u6e0(new t860("application/x-scte35"));
                }
                if (i != 135) {
                    switch (i) {
                        case 15:
                            if (m210672f(2)) {
                                return null;
                            }
                            return new so60(new aa0(false, c16791b.f96726b));
                        case 16:
                            return new so60(new ytk(m210670d(c16791b)));
                        case 17:
                            if (m210672f(2)) {
                                return null;
                            }
                            return new so60(new d7r(c16791b.f96726b));
                        default:
                            switch (i) {
                                case 128:
                                    break;
                                case MMConstants.ERR_WATERMARK_READ /* 129 */:
                                    break;
                                case 130:
                                    if (!m210672f(64)) {
                                        return null;
                                    }
                                    break;
                                default:
                                    return null;
                            }
                            break;
                    }
                }
                return new so60(new C16314d9(c16791b.f96726b));
            }
            return new so60(new jee(c16791b.f96726b));
        }
        return new so60(new xtk(m210670d(c16791b)));
    }

    /* JADX INFO: renamed from: c */
    public final qce0 m210669c(fbj0.C16791b c16791b) {
        return new qce0(m210671e(c16791b));
    }

    /* JADX INFO: renamed from: d */
    public final v4k0 m210670d(fbj0.C16791b c16791b) {
        return new v4k0(m210671e(c16791b));
    }

    /* JADX INFO: renamed from: e */
    public final List<C1871k> m210671e(fbj0.C16791b c16791b) {
        String str;
        int i;
        if (m210672f(32)) {
            return this.f194109b;
        }
        d860 d860Var = new d860(c16791b.f96728d);
        List<C1871k> arrayList = this.f194109b;
        while (d860Var.m110295a() > 0) {
            int iM110279H = d860Var.m110279H();
            int iM110300f = d860Var.m110300f() + d860Var.m110279H();
            if (iM110279H == 134) {
                arrayList = new ArrayList<>();
                int iM110279H2 = d860Var.m110279H() & 31;
                for (int i2 = 0; i2 < iM110279H2; i2++) {
                    String strM110276E = d860Var.m110276E(3);
                    int iM110279H3 = d860Var.m110279H();
                    boolean z = (iM110279H3 & 128) != 0;
                    if (z) {
                        i = iM110279H3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bM110279H = (byte) d860Var.m110279H();
                    d860Var.m110293V(1);
                    arrayList.add(new C1871k.b().m10346g0(str).m10337X(strM110276E).m10321H(i).m10335V(z ? lb5.m149200b((bM110279H & 64) != 0) : null).m10320G());
                }
            }
            d860Var.m110292U(iM110300f);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m210672f(int i) {
        return (this.f194108a & i) != 0;
    }

    public xrd() {
        this(0);
    }

    public xrd(int i, List<C1871k> list) {
        this.f194108a = i;
        this.f194109b = list;
    }
}
