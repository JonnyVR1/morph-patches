package p149l;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.ads.zzad;
import com.google.android.gms.internal.ads.zzae;
import com.google.android.gms.internal.ads.zzaft;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzgaa;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes6.dex */
public final class rdr0 implements j5r0 {

    /* JADX INFO: renamed from: F */
    @Deprecated
    public static final c6r0 f158967F = new c6r0() { // from class: l.ddr0
        @Override // p149l.c6r0
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ j5r0[] mo95449a(Uri uri, Map map) {
            int i = b6r0.f73876a;
            return new j5r0[]{new rdr0()};
        }
    };

    /* JADX INFO: renamed from: G */
    public static final byte[] f158968G = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: H */
    public static final mhr0 f158969H;

    /* JADX INFO: renamed from: A */
    public boolean f158970A;

    /* JADX INFO: renamed from: B */
    public m5r0 f158971B;

    /* JADX INFO: renamed from: C */
    public m7r0[] f158972C;

    /* JADX INFO: renamed from: D */
    public m7r0[] f158973D;

    /* JADX INFO: renamed from: E */
    public boolean f158974E;

    /* JADX INFO: renamed from: a */
    public final pfr0 f158975a;

    /* JADX INFO: renamed from: b */
    public final List f158976b;

    /* JADX INFO: renamed from: c */
    public final SparseArray f158977c;

    /* JADX INFO: renamed from: d */
    public final v6w0 f158978d;

    /* JADX INFO: renamed from: e */
    public final v6w0 f158979e;

    /* JADX INFO: renamed from: f */
    public final v6w0 f158980f;

    /* JADX INFO: renamed from: g */
    public final byte[] f158981g;

    /* JADX INFO: renamed from: h */
    public final v6w0 f158982h;

    /* JADX INFO: renamed from: i */
    public final q9r0 f158983i;

    /* JADX INFO: renamed from: j */
    public final v6w0 f158984j;

    /* JADX INFO: renamed from: k */
    public final ArrayDeque f158985k;

    /* JADX INFO: renamed from: l */
    public final ArrayDeque f158986l;

    /* JADX INFO: renamed from: m */
    public int f158987m;

    /* JADX INFO: renamed from: n */
    public int f158988n;

    /* JADX INFO: renamed from: o */
    public long f158989o;

    /* JADX INFO: renamed from: p */
    public int f158990p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public v6w0 f158991q;

    /* JADX INFO: renamed from: r */
    public long f158992r;

    /* JADX INFO: renamed from: s */
    public int f158993s;

    /* JADX INFO: renamed from: t */
    public long f158994t;

    /* JADX INFO: renamed from: u */
    public long f158995u;

    /* JADX INFO: renamed from: v */
    public long f158996v;

    /* JADX INFO: renamed from: w */
    @Nullable
    public qdr0 f158997w;

    /* JADX INFO: renamed from: x */
    public int f158998x;

    /* JADX INFO: renamed from: y */
    public int f158999y;

    /* JADX INFO: renamed from: z */
    public int f159000z;

    static {
        ter0 ter0Var = new ter0();
        ter0Var.m188618w("application/x-emsg");
        f158969H = ter0Var.m188591D();
    }

    public rdr0(pfr0 pfr0Var, int i, @Nullable hew0 hew0Var, @Nullable ber0 ber0Var, List list, @Nullable m7r0 m7r0Var) {
        this.f158975a = pfr0Var;
        this.f158976b = Collections.unmodifiableList(list);
        this.f158983i = new q9r0();
        this.f158984j = new v6w0(16);
        this.f158978d = new v6w0(quw0.f156548a);
        this.f158979e = new v6w0(5);
        this.f158980f = new v6w0();
        byte[] bArr = new byte[16];
        this.f158981g = bArr;
        this.f158982h = new v6w0(bArr);
        this.f158985k = new ArrayDeque();
        this.f158986l = new ArrayDeque();
        this.f158977c = new SparseArray();
        this.f158995u = -9223372036854775807L;
        this.f158994t = -9223372036854775807L;
        this.f158996v = -9223372036854775807L;
        this.f158971B = m5r0.f131414v0;
        this.f158972C = new m7r0[0];
        this.f158973D = new m7r0[0];
    }

    /* JADX INFO: renamed from: a */
    public static int m179000a(int i) throws zzcc {
        if (i >= 0) {
            return i;
        }
        throw zzcc.zza("Unexpected negative value: " + i, null);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0031  */
    @Nullable
    /* JADX INFO: renamed from: b */
    public static zzae m179001b(List list) {
        xdr0 xdr0Var;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            scr0 scr0Var = (scr0) list.get(i);
            if (scr0Var.f169472a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrM197264m = scr0Var.f163765b.m197264m();
                v6w0 v6w0Var = new v6w0(bArrM197264m);
                if (v6w0Var.m197271t() < 32) {
                    xdr0Var = null;
                } else {
                    v6w0Var.m197262k(0);
                    if (v6w0Var.m197273v() == v6w0Var.m197268q() + 4 && v6w0Var.m197273v() == 1886614376) {
                        int iM188057a = tcr0.m188057a(v6w0Var.m197273v());
                        if (iM188057a > 1) {
                            svv0.m186111f("PsshAtomUtil", "Unsupported pssh version: " + iM188057a);
                        } else {
                            UUID uuid = new UUID(v6w0Var.m197245I(), v6w0Var.m197245I());
                            if (iM188057a == 1) {
                                v6w0Var.m197263l(v6w0Var.m197241E() * 16);
                            }
                            int iM197241E = v6w0Var.m197241E();
                            if (iM197241E == v6w0Var.m197268q()) {
                                byte[] bArr = new byte[iM197241E];
                                v6w0Var.m197258g(bArr, 0, iM197241E);
                                xdr0Var = new xdr0(uuid, iM188057a, bArr);
                            }
                        }
                        xdr0Var = null;
                    } else {
                        xdr0Var = null;
                    }
                }
                UUID uuid2 = xdr0Var == null ? null : xdr0Var.f192449a;
                if (uuid2 == null) {
                    svv0.m186111f("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new zzad(uuid2, null, DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4, bArrM197264m));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new zzae(arrayList);
    }

    /* JADX INFO: renamed from: h */
    public static void m179002h(v6w0 v6w0Var, int i, der0 der0Var) throws zzcc {
        v6w0Var.m197262k(i + 8);
        int iM197273v = v6w0Var.m197273v();
        if ((iM197273v & 1) != 0) {
            throw zzcc.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iM197273v & 2) != 0;
        int iM197241E = v6w0Var.m197241E();
        if (iM197241E == 0) {
            Arrays.fill(der0Var.f85846l, 0, der0Var.f85839e, false);
            return;
        }
        int i2 = der0Var.f85839e;
        if (iM197241E != i2) {
            throw zzcc.zza("Senc sample count " + iM197241E + " is different from fragment sample count" + i2, null);
        }
        Arrays.fill(der0Var.f85846l, 0, iM197241E, z);
        der0Var.m111390a(v6w0Var.m197268q());
        v6w0 v6w0Var2 = der0Var.f85848n;
        v6w0Var.m197258g(v6w0Var2.m197264m(), 0, v6w0Var2.m197271t());
        der0Var.f85848n.m197262k(0);
        der0Var.f85849o = false;
    }

    /* JADX INFO: renamed from: j */
    public static final cdr0 m179003j(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (cdr0) sparseArray.valueAt(0);
        }
        cdr0 cdr0Var = (cdr0) sparseArray.get(i);
        cdr0Var.getClass();
        return cdr0Var;
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: c */
    public final void mo100820c(long j, long j2) {
        int size = this.f158977c.size();
        for (int i = 0; i < size; i++) {
            ((qdr0) this.f158977c.valueAt(i)).m174095i();
        }
        this.f158986l.clear();
        this.f158993s = 0;
        this.f158994t = j2;
        this.f158985k.clear();
        m179004g();
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: d */
    public final boolean mo100821d(k5r0 k5r0Var) throws IOException {
        return aer0.m96124a(k5r0Var);
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: e */
    public final void mo100822e(m5r0 m5r0Var) {
        this.f158971B = m5r0Var;
        m179004g();
        m7r0[] m7r0VarArr = new m7r0[2];
        this.f158972C = m7r0VarArr;
        int i = 0;
        m7r0[] m7r0VarArr2 = (m7r0[]) ggw0.m126070l(m7r0VarArr, 0);
        this.f158972C = m7r0VarArr2;
        for (m7r0 m7r0Var : m7r0VarArr2) {
            m7r0Var.mo134531d(f158969H);
        }
        this.f158973D = new m7r0[this.f158976b.size()];
        int i2 = 100;
        while (i < this.f158973D.length) {
            int i3 = i2 + 1;
            m7r0 m7r0VarMo129454i = this.f158971B.mo129454i(i2, 3);
            m7r0VarMo129454i.mo134531d((mhr0) this.f158976b.get(i));
            this.f158973D[i] = m7r0VarMo129454i;
            i++;
            i2 = i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0242  */
    /* JADX WARN: Code duplicated, block: B:101:0x0247  */
    /* JADX WARN: Code duplicated, block: B:105:0x025e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0273  */
    /* JADX WARN: Code duplicated, block: B:110:0x027c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0290  */
    /* JADX WARN: Code duplicated, block: B:394:0x0238 A[EDGE_INSN: B:394:0x0238->B:98:0x0238 BREAK  A[LOOP:7: B:65:0x0145->B:67:0x014b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:400:0x01d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0145 A[LOOP:7: B:65:0x0145->B:67:0x014b, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:67:0x014b A[LOOP:7: B:65:0x0145->B:67:0x014b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x0156  */
    /* JADX WARN: Code duplicated, block: B:71:0x016e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0174  */
    /* JADX WARN: Code duplicated, block: B:75:0x0187  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:93:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:96:0x0226  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p149l.j5r0
    /* JADX INFO: renamed from: f */
    public final int mo100823f(k5r0 k5r0Var, s6r0 s6r0Var) throws IOException {
        int i;
        ?? r9;
        qdr0 qdr0Var;
        char c;
        ber0 ber0Var;
        m7r0 m7r0Var;
        long jM174092e;
        int i2;
        byte[] bArrM197264m;
        int i3;
        int i4;
        int i5;
        int iMo134532e;
        int iM197273v;
        boolean z;
        String str;
        cer0 cer0VarM174093f;
        a7r0 a7r0Var;
        int i6;
        pdr0 pdr0Var;
        long j;
        long j2;
        int i7;
        int i8;
        int i9;
        int iM174090c;
        long j3;
        long jM126051H;
        long jM197246J;
        String str2;
        String str3;
        long j4;
        long jM197247K;
        long jM197247K2;
        while (true) {
            int i10 = this.f158987m;
            char c2 = 2;
            i = 1;
            r9 = 0;
            if (i10 == 0) {
                if (this.f158990p == 0) {
                    if (!k5r0Var.mo140050b(this.f158984j.m197264m(), 0, 8, true)) {
                        return -1;
                    }
                    this.f158990p = 8;
                    this.f158984j.m197262k(0);
                    this.f158989o = this.f158984j.m197246J();
                    this.f158988n = this.f158984j.m197273v();
                }
                long j5 = this.f158989o;
                if (j5 == 1) {
                    ((z4r0) k5r0Var).mo140050b(this.f158984j.m197264m(), 8, 8, false);
                    this.f158990p += 8;
                    this.f158989o = this.f158984j.m197247K();
                } else if (j5 == 0) {
                    long jZzd = k5r0Var.zzd();
                    if (jZzd == -1) {
                        jZzd = !this.f158985k.isEmpty() ? ((rcr0) this.f158985k.peek()).f158813b : -1L;
                    }
                    if (jZzd != -1) {
                        this.f158989o = (jZzd - k5r0Var.zzf()) + ((long) this.f158990p);
                    }
                }
                long j6 = this.f158989o;
                long j7 = this.f158990p;
                if (j6 < j7) {
                    throw zzcc.zzc("Atom size less than header length (unsupported).");
                }
                long jZzf = k5r0Var.zzf() - j7;
                int i11 = this.f158988n;
                if ((i11 == 1836019558 || i11 == 1835295092) && !this.f158974E) {
                    this.f158971B.mo129455j(new u6r0(this.f158995u, jZzf));
                    this.f158974E = true;
                }
                if (this.f158988n == 1836019558) {
                    int size = this.f158977c.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        der0 der0Var = ((qdr0) this.f158977c.valueAt(i12)).f153951b;
                        der0Var.f85837c = jZzf;
                        der0Var.f85836b = jZzf;
                    }
                }
                int i13 = this.f158988n;
                if (i13 == 1835295092) {
                    this.f158997w = null;
                    this.f158992r = jZzf + this.f158989o;
                    this.f158987m = 2;
                } else if (i13 == 1836019574 || i13 == 1953653099 || i13 == 1835297121 || i13 == 1835626086 || i13 == 1937007212 || i13 == 1836019558 || i13 == 1953653094 || i13 == 1836475768 || i13 == 1701082227) {
                    long jZzf2 = (k5r0Var.zzf() + this.f158989o) - 8;
                    this.f158985k.push(new rcr0(i13, jZzf2));
                    if (this.f158989o == this.f158990p) {
                        m179005i(jZzf2);
                    } else {
                        m179004g();
                    }
                } else if (i13 == 1751411826 || i13 == 1835296868 || i13 == 1836476516 || i13 == 1936286840 || i13 == 1937011556 || i13 == 1937011827 || i13 == 1668576371 || i13 == 1937011555 || i13 == 1937011578 || i13 == 1937013298 || i13 == 1937007471 || i13 == 1668232756 || i13 == 1937011571 || i13 == 1952867444 || i13 == 1952868452 || i13 == 1953196132 || i13 == 1953654136 || i13 == 1953658222 || i13 == 1886614376 || i13 == 1935763834 || i13 == 1935763823 || i13 == 1936027235 || i13 == 1970628964 || i13 == 1935828848 || i13 == 1936158820 || i13 == 1701606260 || i13 == 1835362404 || i13 == 1701671783) {
                    if (this.f158990p != 8) {
                        throw zzcc.zzc("Leaf atom defines extended atom size (unsupported).");
                    }
                    if (this.f158989o > 2147483647L) {
                        throw zzcc.zzc("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    v6w0 v6w0Var = new v6w0((int) this.f158989o);
                    System.arraycopy(this.f158984j.m197264m(), 0, v6w0Var.m197264m(), 0, 8);
                    this.f158991q = v6w0Var;
                    this.f158987m = 1;
                } else {
                    if (this.f158989o > 2147483647L) {
                        throw zzcc.zzc("Skipping atom with length > 2147483647 (unsupported).");
                    }
                    this.f158991q = null;
                    this.f158987m = 1;
                }
            } else if (i10 != 1) {
                long j8 = Long.MAX_VALUE;
                if (i10 != 2) {
                    qdr0Var = this.f158997w;
                    if (qdr0Var != null) {
                        c = 2;
                        break;
                    }
                    SparseArray sparseArray = this.f158977c;
                    int size2 = sparseArray.size();
                    long j9 = Long.MAX_VALUE;
                    qdr0 qdr0Var2 = null;
                    int i14 = 0;
                    while (i14 < size2) {
                        char c3 = c2;
                        qdr0 qdr0Var3 = (qdr0) sparseArray.valueAt(i14);
                        if ((qdr0Var3.f153961l || qdr0Var3.f153955f != qdr0Var3.f153953d.f90774b) && (!qdr0Var3.f153961l || qdr0Var3.f153957h != qdr0Var3.f153951b.f85838d)) {
                            long jM174091d = qdr0Var3.m174091d();
                            if (jM174091d < j9) {
                                qdr0Var2 = qdr0Var3;
                                j9 = jM174091d;
                            }
                        }
                        i14++;
                        c2 = c3;
                    }
                    c = c2;
                    if (qdr0Var2 != null) {
                        int iM174091d = (int) (qdr0Var2.m174091d() - k5r0Var.zzf());
                        if (iM174091d < 0) {
                            svv0.m186111f("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            iM174091d = 0;
                        }
                        ((z4r0) k5r0Var).m217119k(iM174091d, false);
                        this.f158997w = qdr0Var2;
                        qdr0Var = qdr0Var2;
                        break;
                    }
                    int iZzf = (int) (this.f158992r - k5r0Var.zzf());
                    if (iZzf < 0) {
                        throw zzcc.zza("Offset to end of mdat was negative.", null);
                    }
                    ((z4r0) k5r0Var).m217119k(iZzf, false);
                    m179004g();
                } else {
                    int size3 = this.f158977c.size();
                    qdr0 qdr0Var4 = null;
                    for (int i15 = 0; i15 < size3; i15++) {
                        der0 der0Var2 = ((qdr0) this.f158977c.valueAt(i15)).f153951b;
                        if (der0Var2.f85849o) {
                            long j10 = der0Var2.f85837c;
                            if (j10 < j8) {
                                qdr0Var4 = (qdr0) this.f158977c.valueAt(i15);
                                j8 = j10;
                            }
                        }
                    }
                    if (qdr0Var4 == null) {
                        this.f158987m = 3;
                    } else {
                        int iZzf2 = (int) (j8 - k5r0Var.zzf());
                        if (iZzf2 < 0) {
                            throw zzcc.zza("Offset to encryption data was negative.", null);
                        }
                        z4r0 z4r0Var = (z4r0) k5r0Var;
                        z4r0Var.m217119k(iZzf2, false);
                        der0 der0Var3 = qdr0Var4.f153951b;
                        v6w0 v6w0Var2 = der0Var3.f85848n;
                        z4r0Var.mo140050b(v6w0Var2.m197264m(), 0, v6w0Var2.m197271t(), false);
                        der0Var3.f85848n.m197262k(0);
                        der0Var3.f85849o = false;
                    }
                }
            } else {
                int i16 = ((int) this.f158989o) - this.f158990p;
                v6w0 v6w0Var3 = this.f158991q;
                if (v6w0Var3 != null) {
                    ((z4r0) k5r0Var).mo140050b(v6w0Var3.m197264m(), 8, i16, false);
                    scr0 scr0Var = new scr0(this.f158988n, v6w0Var3);
                    long jZzf3 = k5r0Var.zzf();
                    if (this.f158985k.isEmpty()) {
                        int i17 = scr0Var.f169472a;
                        if (i17 == 1936286840) {
                            v6w0 v6w0Var4 = scr0Var.f163765b;
                            v6w0Var4.m197262k(8);
                            int iM188057a = tcr0.m188057a(v6w0Var4.m197273v());
                            v6w0Var4.m197263l(4);
                            long jM197246J2 = v6w0Var4.m197246J();
                            if (iM188057a == 0) {
                                jM197247K = v6w0Var4.m197246J();
                                jM197247K2 = v6w0Var4.m197246J();
                            } else {
                                jM197247K = v6w0Var4.m197247K();
                                jM197247K2 = v6w0Var4.m197247K();
                            }
                            long j11 = jZzf3 + jM197247K2;
                            long j12 = jM197247K;
                            long jM126051H2 = ggw0.m126051H(j12, 1000000L, jM197246J2, RoundingMode.FLOOR);
                            v6w0Var4.m197263l(2);
                            int iM197242F = v6w0Var4.m197242F();
                            int[] iArr = new int[iM197242F];
                            long[] jArr = new long[iM197242F];
                            long[] jArr2 = new long[iM197242F];
                            long[] jArr3 = new long[iM197242F];
                            long jM126051H3 = jM126051H2;
                            int i18 = 0;
                            while (i18 < iM197242F) {
                                int iM197273v2 = v6w0Var4.m197273v();
                                if ((iM197273v2 & Integer.MIN_VALUE) != 0) {
                                    throw zzcc.zza("Unhandled indirect reference", null);
                                }
                                long jM197246J3 = v6w0Var4.m197246J();
                                iArr[i18] = iM197273v2 & Api.BaseClientBuilder.API_PRIORITY_OTHER;
                                jArr[i18] = j11;
                                jArr3[i18] = jM126051H3;
                                j12 += jM197246J3;
                                jM126051H3 = ggw0.m126051H(j12, 1000000L, jM197246J2, RoundingMode.FLOOR);
                                jArr2[i18] = jM126051H3 - jArr3[i18];
                                v6w0Var4.m197263l(4);
                                j11 += (long) iArr[i18];
                                i18++;
                                v6w0Var4 = v6w0Var4;
                                jM126051H2 = jM126051H2;
                            }
                            Pair pairCreate = Pair.create(Long.valueOf(jM126051H2), new x4r0(iArr, jArr, jArr2, jArr3));
                            this.f158996v = ((Long) pairCreate.first).longValue();
                            this.f158971B.mo129455j((v6r0) pairCreate.second);
                            this.f158974E = true;
                        } else if (i17 == 1701671783) {
                            v6w0 v6w0Var5 = scr0Var.f163765b;
                            if (this.f158972C.length != 0) {
                                v6w0Var5.m197262k(8);
                                int iM188057a2 = tcr0.m188057a(v6w0Var5.m197273v());
                                if (iM188057a2 == 0) {
                                    String strM197249M = v6w0Var5.m197249M((char) 0);
                                    strM197249M.getClass();
                                    String strM197249M2 = v6w0Var5.m197249M((char) 0);
                                    strM197249M2.getClass();
                                    long jM197246J4 = v6w0Var5.m197246J();
                                    long jM197246J5 = v6w0Var5.m197246J();
                                    RoundingMode roundingMode = RoundingMode.FLOOR;
                                    long jM126051H4 = ggw0.m126051H(jM197246J5, 1000000L, jM197246J4, roundingMode);
                                    long j13 = this.f158996v;
                                    long j14 = j13 != -9223372036854775807L ? j13 + jM126051H4 : -9223372036854775807L;
                                    long jM126051H5 = ggw0.m126051H(v6w0Var5.m197246J(), 1000L, jM197246J4, roundingMode);
                                    long j15 = j14;
                                    j3 = jM126051H4;
                                    jM126051H = j15;
                                    jM197246J = v6w0Var5.m197246J();
                                    str2 = strM197249M;
                                    str3 = strM197249M2;
                                    j4 = jM126051H5;
                                } else if (iM188057a2 != 1) {
                                    svv0.m186111f("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + iM188057a2);
                                } else {
                                    long jM197246J6 = v6w0Var5.m197246J();
                                    long jM197247K3 = v6w0Var5.m197247K();
                                    RoundingMode roundingMode2 = RoundingMode.FLOOR;
                                    jM126051H = ggw0.m126051H(jM197247K3, 1000000L, jM197246J6, roundingMode2);
                                    long jM126051H6 = ggw0.m126051H(v6w0Var5.m197246J(), 1000L, jM197246J6, roundingMode2);
                                    long jM197246J7 = v6w0Var5.m197246J();
                                    String strM197249M3 = v6w0Var5.m197249M((char) 0);
                                    strM197249M3.getClass();
                                    String strM197249M4 = v6w0Var5.m197249M((char) 0);
                                    strM197249M4.getClass();
                                    jM197246J = jM197246J7;
                                    str2 = strM197249M3;
                                    str3 = strM197249M4;
                                    j4 = jM126051H6;
                                    j3 = -9223372036854775807L;
                                }
                                byte[] bArr = new byte[v6w0Var5.m197268q()];
                                v6w0Var5.m197258g(bArr, 0, v6w0Var5.m197268q());
                                v6w0 v6w0Var6 = new v6w0(this.f158983i.m173672a(new zzaft(str2, str3, j4, jM197246J, bArr)));
                                int iM197268q = v6w0Var6.m197268q();
                                for (m7r0 m7r0Var2 : this.f158972C) {
                                    v6w0Var6.m197262k(0);
                                    m7r0Var2.mo134533f(v6w0Var6, iM197268q);
                                }
                                ArrayDeque arrayDeque = this.f158986l;
                                if (jM126051H == -9223372036854775807L) {
                                    arrayDeque.addLast(new pdr0(j3, true, iM197268q));
                                    this.f158993s += iM197268q;
                                } else if (arrayDeque.isEmpty()) {
                                    for (m7r0 m7r0Var3 : this.f158972C) {
                                        m7r0Var3.mo134530c(jM126051H, 1, iM197268q, 0, null);
                                    }
                                } else {
                                    this.f158986l.addLast(new pdr0(jM126051H, false, iM197268q));
                                    this.f158993s += iM197268q;
                                }
                            }
                        }
                    } else {
                        ((rcr0) this.f158985k.peek()).m178814f(scr0Var);
                    }
                } else {
                    ((z4r0) k5r0Var).m217119k(i16, false);
                }
                m179005i(k5r0Var.zzf());
            }
        }
        char c4 = 6;
        if (this.f158987m == 3) {
            int iM174089b = qdr0Var.m174089b();
            this.f158998x = iM174089b;
            if (qdr0Var.f153955f < qdr0Var.f153958i) {
                ((z4r0) k5r0Var).m217119k(iM174089b, false);
                cer0 cer0VarM174093f2 = qdr0Var.m174093f();
                if (cer0VarM174093f2 != null) {
                    v6w0 v6w0Var7 = qdr0Var.f153951b.f85848n;
                    int i19 = cer0VarM174093f2.f80488d;
                    if (i19 != 0) {
                        v6w0Var7.m197263l(i19);
                    }
                    if (qdr0Var.f153951b.m111391b(qdr0Var.f153955f)) {
                        v6w0Var7.m197263l(v6w0Var7.m197242F() * 6);
                    }
                }
                if (!qdr0Var.m174096k()) {
                    this.f158997w = null;
                }
                i6 = 3;
            } else {
                if (qdr0Var.f153953d.f90773a.f75231g == 1) {
                    this.f158998x = iM174089b - 8;
                    ((z4r0) k5r0Var).m217119k(8, false);
                }
                boolean zEquals = "audio/ac4".equals(qdr0Var.f153953d.f90773a.f75230f.f133892l);
                int i20 = this.f158998x;
                if (zEquals) {
                    this.f158999y = qdr0Var.m174090c(i20, 7);
                    c4r0.m105240b(this.f158998x, this.f158982h);
                    qdr0Var.f153950a.mo134533f(this.f158982h, 7);
                    iM174090c = this.f158999y + 7;
                    this.f158999y = iM174090c;
                } else {
                    iM174090c = qdr0Var.m174090c(i20, 0);
                    this.f158999y = iM174090c;
                }
                this.f158998x += iM174090c;
                this.f158987m = 4;
                this.f159000z = 0;
                ber0Var = qdr0Var.f153953d.f90773a;
                m7r0Var = qdr0Var.f153950a;
                jM174092e = qdr0Var.m174092e();
                i2 = ber0Var.f75234j;
                if (i2 == 0) {
                    while (true) {
                        i8 = this.f158999y;
                        i9 = this.f158998x;
                        if (i8 < i9) {
                            break;
                        }
                        this.f158999y += m7r0Var.mo134532e(k5r0Var, i9 - i8, false);
                    }
                } else {
                    bArrM197264m = this.f158979e.m197264m();
                    bArrM197264m[0] = 0;
                    bArrM197264m[1] = 0;
                    bArrM197264m[c] = 0;
                    i3 = i2 + 1;
                    i4 = 4 - i2;
                    while (this.f158999y < this.f158998x) {
                        i5 = this.f159000z;
                        if (i5 == 0) {
                            ((z4r0) k5r0Var).mo140050b(bArrM197264m, i4, i3, r9);
                            this.f158979e.m197262k(r9);
                            iM197273v = this.f158979e.m197273v();
                            if (iM197273v > 0) {
                                throw zzcc.zza("Invalid NAL length", null);
                            }
                            this.f159000z = iM197273v - 1;
                            this.f158978d.m197262k(r9);
                            m7r0Var.mo134533f(this.f158978d, 4);
                            m7r0Var.mo134533f(this.f158979e, i);
                            if (this.f158973D.length > 0) {
                                str = ber0Var.f75230f.f133892l;
                                byte b = bArrM197264m[4];
                                byte[] bArr2 = quw0.f156548a;
                                if ((YtVideoEncoder.MIME_TYPE.equals(str) || (b & 31) != c4) && !("video/hevc".equals(str) && ((b & 126) >> i) == 39)) {
                                    z = 0;
                                } else {
                                    z = i;
                                }
                            } else {
                                z = 0;
                            }
                            this.f158970A = z;
                            this.f158999y += 5;
                            this.f158998x += i4;
                        } else {
                            if (this.f158970A) {
                                this.f158980f.m197259h(i5);
                                ((z4r0) k5r0Var).mo140050b(this.f158980f.m197264m(), 0, this.f159000z, false);
                                m7r0Var.mo134533f(this.f158980f, this.f159000z);
                                iMo134532e = this.f159000z;
                                v6w0 v6w0Var8 = this.f158980f;
                                int iM176659b = quw0.m176659b(v6w0Var8.m197264m(), v6w0Var8.m197271t());
                                this.f158980f.m197262k("video/hevc".equals(ber0Var.f75230f.f133892l) ? 1 : 0);
                                this.f158980f.m197261j(iM176659b);
                                w4r0.m201559a(jM174092e, this.f158980f, this.f158973D);
                            } else {
                                iMo134532e = m7r0Var.mo134532e(k5r0Var, i5, false);
                            }
                            this.f158999y += iMo134532e;
                            this.f159000z -= iMo134532e;
                            c4 = 6;
                            i = 1;
                        }
                        r9 = 0;
                    }
                }
                int iM174088a = qdr0Var.m174088a();
                cer0VarM174093f = qdr0Var.m174093f();
                if (cer0VarM174093f != null) {
                    a7r0Var = cer0VarM174093f.f80487c;
                } else {
                    a7r0Var = null;
                }
                m7r0Var.mo134530c(jM174092e, iM174088a, this.f158998x, 0, a7r0Var);
                while (!this.f158986l.isEmpty()) {
                    pdr0Var = (pdr0) this.f158986l.removeFirst();
                    this.f158993s -= pdr0Var.f148324c;
                    j = pdr0Var.f148322a;
                    if (pdr0Var.f148323b) {
                        j += jM174092e;
                    }
                    j2 = j;
                    for (m7r0 m7r0Var4 : this.f158972C) {
                        m7r0Var4.mo134530c(j2, 1, pdr0Var.f148324c, this.f158993s, null);
                    }
                }
                if (!qdr0Var.m174096k()) {
                    this.f158997w = null;
                }
                i6 = 3;
            }
        } else {
            ber0Var = qdr0Var.f153953d.f90773a;
            m7r0Var = qdr0Var.f153950a;
            jM174092e = qdr0Var.m174092e();
            i2 = ber0Var.f75234j;
            if (i2 == 0) {
                while (true) {
                    i8 = this.f158999y;
                    i9 = this.f158998x;
                    if (i8 < i9) {
                        break;
                        break;
                    }
                    this.f158999y += m7r0Var.mo134532e(k5r0Var, i9 - i8, false);
                }
            } else {
                bArrM197264m = this.f158979e.m197264m();
                bArrM197264m[0] = 0;
                bArrM197264m[1] = 0;
                bArrM197264m[c] = 0;
                i3 = i2 + 1;
                i4 = 4 - i2;
                while (this.f158999y < this.f158998x) {
                    i5 = this.f159000z;
                    if (i5 == 0) {
                        ((z4r0) k5r0Var).mo140050b(bArrM197264m, i4, i3, r9);
                        this.f158979e.m197262k(r9);
                        iM197273v = this.f158979e.m197273v();
                        if (iM197273v > 0) {
                            throw zzcc.zza("Invalid NAL length", null);
                        }
                        this.f159000z = iM197273v - 1;
                        this.f158978d.m197262k(r9);
                        m7r0Var.mo134533f(this.f158978d, 4);
                        m7r0Var.mo134533f(this.f158979e, i);
                        if (this.f158973D.length > 0) {
                            str = ber0Var.f75230f.f133892l;
                            byte b2 = bArrM197264m[4];
                            byte[] bArr3 = quw0.f156548a;
                            if (YtVideoEncoder.MIME_TYPE.equals(str)) {
                                z = 0;
                            } else {
                                z = 0;
                            }
                        } else {
                            z = 0;
                        }
                        this.f158970A = z;
                        this.f158999y += 5;
                        this.f158998x += i4;
                    } else {
                        if (this.f158970A) {
                            this.f158980f.m197259h(i5);
                            ((z4r0) k5r0Var).mo140050b(this.f158980f.m197264m(), 0, this.f159000z, false);
                            m7r0Var.mo134533f(this.f158980f, this.f159000z);
                            iMo134532e = this.f159000z;
                            v6w0 v6w0Var9 = this.f158980f;
                            int iM176659b2 = quw0.m176659b(v6w0Var9.m197264m(), v6w0Var9.m197271t());
                            this.f158980f.m197262k("video/hevc".equals(ber0Var.f75230f.f133892l) ? 1 : 0);
                            this.f158980f.m197261j(iM176659b2);
                            w4r0.m201559a(jM174092e, this.f158980f, this.f158973D);
                        } else {
                            iMo134532e = m7r0Var.mo134532e(k5r0Var, i5, false);
                        }
                        this.f158999y += iMo134532e;
                        this.f159000z -= iMo134532e;
                        c4 = 6;
                        i = 1;
                    }
                    r9 = 0;
                }
            }
            int iM174088a2 = qdr0Var.m174088a();
            cer0VarM174093f = qdr0Var.m174093f();
            if (cer0VarM174093f != null) {
                a7r0Var = cer0VarM174093f.f80487c;
            } else {
                a7r0Var = null;
            }
            m7r0Var.mo134530c(jM174092e, iM174088a2, this.f158998x, 0, a7r0Var);
            while (!this.f158986l.isEmpty()) {
                pdr0Var = (pdr0) this.f158986l.removeFirst();
                this.f158993s -= pdr0Var.f148324c;
                j = pdr0Var.f148322a;
                if (pdr0Var.f148323b) {
                    j += jM174092e;
                }
                j2 = j;
                while (i7 < r4) {
                    m7r0Var4.mo134530c(j2, 1, pdr0Var.f148324c, this.f158993s, null);
                }
            }
            if (!qdr0Var.m174096k()) {
                this.f158997w = null;
            }
            i6 = 3;
        }
        this.f158987m = i6;
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m179004g() {
        this.f158987m = 0;
        this.f158990p = 0;
    }

    /* JADX INFO: renamed from: i */
    public final void m179005i(long j) throws zzcc {
        SparseArray sparseArray;
        int i;
        int i2;
        int i3;
        int i4;
        byte[] bArr;
        int i5;
        boolean z;
        int i6;
        int iM197273v;
        long[] jArr;
        while (!this.f158985k.isEmpty() && ((rcr0) this.f158985k.peek()).f158813b == j) {
            rcr0 rcr0Var = (rcr0) this.f158985k.pop();
            int i7 = rcr0Var.f169472a;
            int i8 = 12;
            int i9 = 8;
            if (i7 == 1836019574) {
                zzae zzaeVarM179001b = m179001b(rcr0Var.f158814c);
                rcr0 rcr0VarM178811c = rcr0Var.m178811c(1836475768);
                rcr0VarM178811c.getClass();
                SparseArray sparseArray2 = new SparseArray();
                int size = rcr0VarM178811c.f158814c.size();
                long jM197246J = -9223372036854775807L;
                int i10 = 0;
                while (i10 < size) {
                    scr0 scr0Var = (scr0) rcr0VarM178811c.f158814c.get(i10);
                    int i11 = scr0Var.f169472a;
                    if (i11 == 1953654136) {
                        v6w0 v6w0Var = scr0Var.f163765b;
                        v6w0Var.m197262k(i8);
                        Pair pairCreate = Pair.create(Integer.valueOf(v6w0Var.m197273v()), new cdr0(v6w0Var.m197273v() - 1, v6w0Var.m197273v(), v6w0Var.m197273v(), v6w0Var.m197273v()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (cdr0) pairCreate.second);
                    } else if (i11 == 1835362404) {
                        v6w0 v6w0Var2 = scr0Var.f163765b;
                        v6w0Var2.m197262k(8);
                        jM197246J = tcr0.m188057a(v6w0Var2.m197273v()) == 0 ? v6w0Var2.m197246J() : v6w0Var2.m197247K();
                    }
                    i10++;
                    i8 = 12;
                }
                List listM101213d = bdr0.m101213d(rcr0Var, new l6r0(), jM197246J, zzaeVarM179001b, false, false, new yew0() { // from class: l.edr0
                    @Override // p149l.yew0
                    public final Object apply(Object obj) {
                        return (ber0) obj;
                    }
                });
                int size2 = listM101213d.size();
                if (this.f158977c.size() == 0) {
                    for (int i12 = 0; i12 < size2; i12++) {
                        eer0 eer0Var = (eer0) listM101213d.get(i12);
                        ber0 ber0Var = eer0Var.f90773a;
                        this.f158977c.put(ber0Var.f75225a, new qdr0(this.f158971B.mo129454i(i12, ber0Var.f75226b), eer0Var, m179003j(sparseArray2, ber0Var.f75225a)));
                        this.f158995u = Math.max(this.f158995u, ber0Var.f75229e);
                    }
                    this.f158971B.mo129453c();
                } else {
                    f5v0.m119535f(this.f158977c.size() == size2);
                    for (int i13 = 0; i13 < size2; i13++) {
                        eer0 eer0Var2 = (eer0) listM101213d.get(i13);
                        ber0 ber0Var2 = eer0Var2.f90773a;
                        ((qdr0) this.f158977c.get(ber0Var2.f75225a)).m174094h(eer0Var2, m179003j(sparseArray2, ber0Var2.f75225a));
                    }
                }
            } else if (i7 == 1836019558) {
                SparseArray sparseArray3 = this.f158977c;
                byte[] bArr2 = this.f158981g;
                int size3 = rcr0Var.f158815d.size();
                int i14 = 0;
                while (i14 < size3) {
                    rcr0 rcr0Var2 = (rcr0) rcr0Var.f158815d.get(i14);
                    if (rcr0Var2.f169472a == 1953653094) {
                        scr0 scr0VarM178812d = rcr0Var2.m178812d(1952868452);
                        scr0VarM178812d.getClass();
                        v6w0 v6w0Var3 = scr0VarM178812d.f163765b;
                        v6w0Var3.m197262k(i9);
                        int iM197273v2 = v6w0Var3.m197273v();
                        qdr0 qdr0Var = (qdr0) sparseArray3.get(v6w0Var3.m197273v());
                        if (qdr0Var == null) {
                            qdr0Var = null;
                        } else {
                            if ((iM197273v2 & 1) != 0) {
                                long jM197247K = v6w0Var3.m197247K();
                                der0 der0Var = qdr0Var.f153951b;
                                der0Var.f85836b = jM197247K;
                                der0Var.f85837c = jM197247K;
                            }
                            cdr0 cdr0Var = qdr0Var.f153954e;
                            qdr0Var.f153951b.f85835a = new cdr0((iM197273v2 & 2) != 0 ? v6w0Var3.m197273v() - 1 : cdr0Var.f80401a, (iM197273v2 & 8) != 0 ? v6w0Var3.m197273v() : cdr0Var.f80402b, (iM197273v2 & 16) != 0 ? v6w0Var3.m197273v() : cdr0Var.f80403c, (iM197273v2 & 32) != 0 ? v6w0Var3.m197273v() : cdr0Var.f80404d);
                        }
                        if (qdr0Var == null) {
                            sparseArray = sparseArray3;
                            i = size3;
                            i2 = i9;
                            i3 = i14;
                        } else {
                            der0 der0Var2 = qdr0Var.f153951b;
                            long j2 = der0Var2.f85850p;
                            boolean z2 = der0Var2.f85851q;
                            qdr0Var.m174095i();
                            qdr0Var.f153961l = true;
                            scr0 scr0VarM178812d2 = rcr0Var2.m178812d(1952867444);
                            if (scr0VarM178812d2 != null) {
                                v6w0 v6w0Var4 = scr0VarM178812d2.f163765b;
                                v6w0Var4.m197262k(i9);
                                der0Var2.f85850p = tcr0.m188057a(v6w0Var4.m197273v()) == 1 ? v6w0Var4.m197247K() : v6w0Var4.m197246J();
                                der0Var2.f85851q = true;
                            } else {
                                der0Var2.f85850p = j2;
                                der0Var2.f85851q = z2;
                            }
                            List list = rcr0Var2.f158814c;
                            int size4 = list.size();
                            int i15 = 0;
                            int i16 = 0;
                            int i17 = 0;
                            while (true) {
                                i4 = 1953658222;
                                if (i15 >= size4) {
                                    break;
                                }
                                scr0 scr0Var2 = (scr0) list.get(i15);
                                SparseArray sparseArray4 = sparseArray3;
                                if (scr0Var2.f169472a == 1953658222) {
                                    v6w0 v6w0Var5 = scr0Var2.f163765b;
                                    v6w0Var5.m197262k(12);
                                    int iM197241E = v6w0Var5.m197241E();
                                    if (iM197241E > 0) {
                                        i17 += iM197241E;
                                        i16++;
                                    }
                                }
                                i15++;
                                sparseArray3 = sparseArray4;
                            }
                            sparseArray = sparseArray3;
                            qdr0Var.f153957h = 0;
                            qdr0Var.f153956g = 0;
                            qdr0Var.f153955f = 0;
                            der0 der0Var3 = qdr0Var.f153951b;
                            der0Var3.f85838d = i16;
                            der0Var3.f85839e = i17;
                            if (der0Var3.f85841g.length < i16) {
                                der0Var3.f85840f = new long[i16];
                                der0Var3.f85841g = new int[i16];
                            }
                            if (der0Var3.f85842h.length < i17) {
                                int i18 = (i17 * 125) / 100;
                                der0Var3.f85842h = new int[i18];
                                der0Var3.f85843i = new long[i18];
                                der0Var3.f85844j = new boolean[i18];
                                der0Var3.f85846l = new boolean[i18];
                            }
                            int i19 = 0;
                            int i20 = 0;
                            int i21 = 0;
                            while (true) {
                                long j3 = 0;
                                if (i19 >= size4) {
                                    break;
                                }
                                scr0 scr0Var3 = (scr0) list.get(i19);
                                if (scr0Var3.f169472a == i4) {
                                    int i22 = i20 + 1;
                                    v6w0 v6w0Var6 = scr0Var3.f163765b;
                                    v6w0Var6.m197262k(8);
                                    int iM197273v3 = v6w0Var6.m197273v();
                                    ber0 ber0Var3 = qdr0Var.f153953d.f90773a;
                                    der0 der0Var4 = qdr0Var.f153951b;
                                    cdr0 cdr0Var2 = der0Var4.f85835a;
                                    int i23 = ggw0.f102568a;
                                    int i24 = i20;
                                    der0Var4.f85841g[i24] = v6w0Var6.m197241E();
                                    long[] jArr2 = der0Var4.f85840f;
                                    long j4 = der0Var4.f85836b;
                                    jArr2[i24] = j4;
                                    if ((iM197273v3 & 1) != 0) {
                                        jArr2[i24] = j4 + ((long) v6w0Var6.m197273v());
                                    }
                                    boolean z3 = (iM197273v3 & 4) != 0;
                                    int iM197273v4 = cdr0Var2.f80404d;
                                    if (z3) {
                                        iM197273v4 = v6w0Var6.m197273v();
                                    }
                                    boolean z4 = z3;
                                    int i25 = iM197273v3 & 256;
                                    int i26 = iM197273v3 & 512;
                                    int i27 = iM197273v3 & 1024;
                                    int i28 = iM197273v3 & 2048;
                                    long[] jArr3 = ber0Var3.f75232h;
                                    if (jArr3 != null) {
                                        i6 = iM197273v4;
                                        if (jArr3.length == 1 && (jArr = ber0Var3.f75233i) != null) {
                                            long j5 = jArr3[0];
                                            if (j5 == 0 || ggw0.m126051H(j5 + jArr[0], 1000000L, ber0Var3.f75228d, RoundingMode.FLOOR) >= ber0Var3.f75229e) {
                                                j3 = ber0Var3.f75233i[0];
                                            }
                                        }
                                    } else {
                                        i6 = iM197273v4;
                                    }
                                    int[] iArr = der0Var4.f85842h;
                                    long[] jArr4 = der0Var4.f85843i;
                                    boolean[] zArr = der0Var4.f85844j;
                                    int i29 = der0Var4.f85841g[i24] + i21;
                                    long j6 = ber0Var3.f75227c;
                                    long j7 = der0Var4.f85850p;
                                    while (i21 < i29) {
                                        int iM197273v5 = i25 != 0 ? v6w0Var6.m197273v() : cdr0Var2.f80402b;
                                        m179000a(iM197273v5);
                                        int iM197273v6 = i26 != 0 ? v6w0Var6.m197273v() : cdr0Var2.f80403c;
                                        m179000a(iM197273v6);
                                        if (i27 != 0) {
                                            iM197273v = v6w0Var6.m197273v();
                                        } else if (i21 != 0) {
                                            iM197273v = cdr0Var2.f80404d;
                                        } else if (z4) {
                                            iM197273v = i6;
                                            i21 = 0;
                                        } else {
                                            i21 = 0;
                                            iM197273v = cdr0Var2.f80404d;
                                        }
                                        int i30 = iM197273v;
                                        long jM126051H = ggw0.m126051H((((long) (i28 != 0 ? v6w0Var6.m197273v() : 0)) + j7) - j3, 1000000L, j6, RoundingMode.FLOOR);
                                        jArr4[i21] = jM126051H;
                                        if (!der0Var4.f85851q) {
                                            jArr4[i21] = jM126051H + qdr0Var.f153953d.f90780h;
                                        }
                                        iArr[i21] = iM197273v6;
                                        zArr[i21] = 1 == (((i30 >> 16) & 1) ^ 1);
                                        j7 += (long) iM197273v5;
                                        i21++;
                                        i29 = i29;
                                        cdr0Var2 = cdr0Var2;
                                    }
                                    int i31 = i29;
                                    der0Var4.f85850p = j7;
                                    i20 = i22;
                                    i21 = i31;
                                }
                                i19++;
                                list = list;
                                size3 = size3;
                                i14 = i14;
                                i4 = 1953658222;
                            }
                            i = size3;
                            i3 = i14;
                            ber0 ber0Var4 = qdr0Var.f153953d.f90773a;
                            cdr0 cdr0Var3 = der0Var2.f85835a;
                            cdr0Var3.getClass();
                            cer0 cer0VarM101417a = ber0Var4.m101417a(cdr0Var3.f80401a);
                            scr0 scr0VarM178812d3 = rcr0Var2.m178812d(1935763834);
                            if (scr0VarM178812d3 != null) {
                                cer0VarM101417a.getClass();
                                v6w0 v6w0Var7 = scr0VarM178812d3.f163765b;
                                v6w0Var7.m197262k(8);
                                if ((v6w0Var7.m197273v() & 1) == 1) {
                                    v6w0Var7.m197263l(8);
                                }
                                int iM197238B = v6w0Var7.m197238B();
                                int iM197241E2 = v6w0Var7.m197241E();
                                int i32 = der0Var2.f85839e;
                                if (iM197241E2 > i32) {
                                    throw zzcc.zza("Saiz sample count " + iM197241E2 + " is greater than fragment sample count" + i32, null);
                                }
                                int i33 = cer0VarM101417a.f80488d;
                                if (iM197238B == 0) {
                                    boolean[] zArr2 = der0Var2.f85846l;
                                    i5 = 0;
                                    for (int i34 = 0; i34 < iM197241E2; i34++) {
                                        int iM197238B2 = v6w0Var7.m197238B();
                                        i5 += iM197238B2;
                                        zArr2[i34] = iM197238B2 > i33;
                                    }
                                    z = false;
                                } else {
                                    boolean z5 = iM197238B > i33;
                                    i5 = iM197238B * iM197241E2;
                                    z = false;
                                    Arrays.fill(der0Var2.f85846l, 0, iM197241E2, z5);
                                }
                                Arrays.fill(der0Var2.f85846l, iM197241E2, der0Var2.f85839e, z);
                                if (i5 > 0) {
                                    der0Var2.m111390a(i5);
                                }
                            }
                            scr0 scr0VarM178812d4 = rcr0Var2.m178812d(1935763823);
                            if (scr0VarM178812d4 != null) {
                                v6w0 v6w0Var8 = scr0VarM178812d4.f163765b;
                                v6w0Var8.m197262k(8);
                                int iM197273v7 = v6w0Var8.m197273v();
                                if ((iM197273v7 & 1) == 1) {
                                    v6w0Var8.m197263l(8);
                                }
                                int iM197241E3 = v6w0Var8.m197241E();
                                if (iM197241E3 != 1) {
                                    throw zzcc.zza("Unexpected saio entry count: " + iM197241E3, null);
                                }
                                der0Var2.f85837c += tcr0.m188057a(iM197273v7) == 0 ? v6w0Var8.m197246J() : v6w0Var8.m197247K();
                            }
                            scr0 scr0VarM178812d5 = rcr0Var2.m178812d(1936027235);
                            if (scr0VarM178812d5 != null) {
                                m179002h(scr0VarM178812d5.f163765b, 0, der0Var2);
                            }
                            String str = cer0VarM101417a != null ? cer0VarM101417a.f80486b : null;
                            v6w0 v6w0Var9 = null;
                            v6w0 v6w0Var10 = null;
                            for (int i35 = 0; i35 < rcr0Var2.f158814c.size(); i35++) {
                                scr0 scr0Var4 = (scr0) rcr0Var2.f158814c.get(i35);
                                v6w0 v6w0Var11 = scr0Var4.f163765b;
                                int i36 = scr0Var4.f169472a;
                                if (i36 == 1935828848) {
                                    v6w0Var11.m197262k(12);
                                    if (v6w0Var11.m197273v() == 1936025959) {
                                        v6w0Var9 = v6w0Var11;
                                    }
                                } else if (i36 == 1936158820) {
                                    v6w0Var11.m197262k(12);
                                    if (v6w0Var11.m197273v() == 1936025959) {
                                        v6w0Var10 = v6w0Var11;
                                    }
                                }
                            }
                            if (v6w0Var9 != null && v6w0Var10 != null) {
                                v6w0Var9.m197262k(8);
                                int iM188057a = tcr0.m188057a(v6w0Var9.m197273v());
                                v6w0Var9.m197263l(4);
                                if (iM188057a == 1) {
                                    v6w0Var9.m197263l(4);
                                }
                                if (v6w0Var9.m197273v() != 1) {
                                    throw zzcc.zzc("Entry count in sbgp != 1 (unsupported).");
                                }
                                v6w0Var10.m197262k(8);
                                int iM188057a2 = tcr0.m188057a(v6w0Var10.m197273v());
                                v6w0Var10.m197263l(4);
                                if (iM188057a2 == 1) {
                                    if (v6w0Var10.m197246J() == 0) {
                                        throw zzcc.zzc("Variable length description in sgpd found (unsupported)");
                                    }
                                } else if (iM188057a2 >= 2) {
                                    v6w0Var10.m197263l(4);
                                }
                                if (v6w0Var10.m197246J() != 1) {
                                    throw zzcc.zzc("Entry count in sgpd != 1 (unsupported).");
                                }
                                v6w0Var10.m197263l(1);
                                int iM197238B3 = v6w0Var10.m197238B();
                                int i37 = (iM197238B3 & 240) >> 4;
                                int i38 = iM197238B3 & 15;
                                if (v6w0Var10.m197238B() == 1) {
                                    int iM197238B4 = v6w0Var10.m197238B();
                                    byte[] bArr3 = new byte[16];
                                    v6w0Var10.m197258g(bArr3, 0, 16);
                                    if (iM197238B4 == 0) {
                                        int iM197238B5 = v6w0Var10.m197238B();
                                        byte[] bArr4 = new byte[iM197238B5];
                                        v6w0Var10.m197258g(bArr4, 0, iM197238B5);
                                        bArr = bArr4;
                                    } else {
                                        bArr = null;
                                    }
                                    der0Var2.f85845k = true;
                                    der0Var2.f85847m = new cer0(true, str, iM197238B4, bArr3, i37, i38, bArr);
                                }
                            }
                            int size5 = rcr0Var2.f158814c.size();
                            for (int i39 = 0; i39 < size5; i39++) {
                                scr0 scr0Var5 = (scr0) rcr0Var2.f158814c.get(i39);
                                if (scr0Var5.f169472a == 1970628964) {
                                    v6w0 v6w0Var12 = scr0Var5.f163765b;
                                    v6w0Var12.m197262k(8);
                                    v6w0Var12.m197258g(bArr2, 0, 16);
                                    if (Arrays.equals(bArr2, f158968G)) {
                                        m179002h(v6w0Var12, 16, der0Var2);
                                    }
                                }
                            }
                            i2 = 8;
                        }
                    } else {
                        sparseArray = sparseArray3;
                        i = size3;
                        i2 = i9;
                        i3 = i14;
                    }
                    i14 = i3 + 1;
                    i9 = i2;
                    sparseArray3 = sparseArray;
                    size3 = i;
                }
                zzae zzaeVarM179001b2 = m179001b(rcr0Var.f158814c);
                if (zzaeVarM179001b2 != null) {
                    int size6 = this.f158977c.size();
                    for (int i40 = 0; i40 < size6; i40++) {
                        qdr0 qdr0Var2 = (qdr0) this.f158977c.valueAt(i40);
                        ber0 ber0Var5 = qdr0Var2.f153953d.f90773a;
                        cdr0 cdr0Var4 = qdr0Var2.f153951b.f85835a;
                        int i41 = ggw0.f102568a;
                        cer0 cer0VarM101417a2 = ber0Var5.m101417a(cdr0Var4.f80401a);
                        zzae zzaeVarM13537b = zzaeVarM179001b2.m13537b(cer0VarM101417a2 != null ? cer0VarM101417a2.f80486b : null);
                        ter0 ter0VarM154634b = qdr0Var2.f153953d.f90773a.f75230f.m154634b();
                        ter0VarM154634b.m188596e(zzaeVarM13537b);
                        qdr0Var2.f153950a.mo134531d(ter0VarM154634b.m188591D());
                    }
                }
                if (this.f158994t != -9223372036854775807L) {
                    int size7 = this.f158977c.size();
                    for (int i42 = 0; i42 < size7; i42++) {
                        qdr0 qdr0Var3 = (qdr0) this.f158977c.valueAt(i42);
                        long j8 = this.f158994t;
                        int i43 = qdr0Var3.f153955f;
                        while (true) {
                            der0 der0Var5 = qdr0Var3.f153951b;
                            if (i43 >= der0Var5.f85839e || der0Var5.f85843i[i43] > j8) {
                                break;
                            }
                            if (der0Var5.f85844j[i43]) {
                                qdr0Var3.f153958i = i43;
                            }
                            i43++;
                        }
                    }
                    this.f158994t = -9223372036854775807L;
                }
            } else if (!this.f158985k.isEmpty()) {
                ((rcr0) this.f158985k.peek()).m178813e(rcr0Var);
            }
        }
        m179004g();
    }

    @Deprecated
    public rdr0() {
        this(pfr0.f148583a, 32, null, null, zzgaa.zzl(), null);
    }
}
