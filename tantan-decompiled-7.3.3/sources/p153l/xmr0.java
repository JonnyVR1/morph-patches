package p153l;

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
public final class xmr0 implements per0 {

    /* JADX INFO: renamed from: F */
    @Deprecated
    public static final ifr0 f195284F = new ifr0() { // from class: l.jmr0
        @Override // p153l.ifr0
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ per0[] mo99028a(Uri uri, Map map) {
            int i = hfr0.f109341a;
            return new per0[]{new xmr0()};
        }
    };

    /* JADX INFO: renamed from: G */
    public static final byte[] f195285G = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: H */
    public static final sqr0 f195286H;

    /* JADX INFO: renamed from: A */
    public boolean f195287A;

    /* JADX INFO: renamed from: B */
    public ser0 f195288B;

    /* JADX INFO: renamed from: C */
    public sgr0[] f195289C;

    /* JADX INFO: renamed from: D */
    public sgr0[] f195290D;

    /* JADX INFO: renamed from: E */
    public boolean f195291E;

    /* JADX INFO: renamed from: a */
    public final vor0 f195292a;

    /* JADX INFO: renamed from: b */
    public final List f195293b;

    /* JADX INFO: renamed from: c */
    public final SparseArray f195294c;

    /* JADX INFO: renamed from: d */
    public final bgw0 f195295d;

    /* JADX INFO: renamed from: e */
    public final bgw0 f195296e;

    /* JADX INFO: renamed from: f */
    public final bgw0 f195297f;

    /* JADX INFO: renamed from: g */
    public final byte[] f195298g;

    /* JADX INFO: renamed from: h */
    public final bgw0 f195299h;

    /* JADX INFO: renamed from: i */
    public final wir0 f195300i;

    /* JADX INFO: renamed from: j */
    public final bgw0 f195301j;

    /* JADX INFO: renamed from: k */
    public final ArrayDeque f195302k;

    /* JADX INFO: renamed from: l */
    public final ArrayDeque f195303l;

    /* JADX INFO: renamed from: m */
    public int f195304m;

    /* JADX INFO: renamed from: n */
    public int f195305n;

    /* JADX INFO: renamed from: o */
    public long f195306o;

    /* JADX INFO: renamed from: p */
    public int f195307p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public bgw0 f195308q;

    /* JADX INFO: renamed from: r */
    public long f195309r;

    /* JADX INFO: renamed from: s */
    public int f195310s;

    /* JADX INFO: renamed from: t */
    public long f195311t;

    /* JADX INFO: renamed from: u */
    public long f195312u;

    /* JADX INFO: renamed from: v */
    public long f195313v;

    /* JADX INFO: renamed from: w */
    @Nullable
    public wmr0 f195314w;

    /* JADX INFO: renamed from: x */
    public int f195315x;

    /* JADX INFO: renamed from: y */
    public int f195316y;

    /* JADX INFO: renamed from: z */
    public int f195317z;

    static {
        znr0 znr0Var = new znr0();
        znr0Var.m220672w("application/x-emsg");
        f195286H = znr0Var.m220645D();
    }

    public xmr0(vor0 vor0Var, int i, @Nullable nnw0 nnw0Var, @Nullable hnr0 hnr0Var, List list, @Nullable sgr0 sgr0Var) {
        this.f195292a = vor0Var;
        this.f195293b = Collections.unmodifiableList(list);
        this.f195300i = new wir0();
        this.f195301j = new bgw0(16);
        this.f195295d = new bgw0(w3x0.f187180a);
        this.f195296e = new bgw0(5);
        this.f195297f = new bgw0();
        byte[] bArr = new byte[16];
        this.f195298g = bArr;
        this.f195299h = new bgw0(bArr);
        this.f195302k = new ArrayDeque();
        this.f195303l = new ArrayDeque();
        this.f195294c = new SparseArray();
        this.f195312u = -9223372036854775807L;
        this.f195311t = -9223372036854775807L;
        this.f195313v = -9223372036854775807L;
        this.f195288B = ser0.f167641v0;
        this.f195289C = new sgr0[0];
        this.f195290D = new sgr0[0];
    }

    /* JADX INFO: renamed from: a */
    public static int m212063a(int i) throws zzcc {
        if (i >= 0) {
            return i;
        }
        throw zzcc.zza("Unexpected negative value: " + i, null);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0031  */
    @Nullable
    /* JADX INFO: renamed from: b */
    public static zzae m212064b(List list) {
        dnr0 dnr0Var;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ylr0 ylr0Var = (ylr0) list.get(i);
            if (ylr0Var.f205002a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrM104271m = ylr0Var.f200580b.m104271m();
                bgw0 bgw0Var = new bgw0(bArrM104271m);
                if (bgw0Var.m104278t() < 32) {
                    dnr0Var = null;
                } else {
                    bgw0Var.m104269k(0);
                    if (bgw0Var.m104280v() == bgw0Var.m104275q() + 4 && bgw0Var.m104280v() == 1886614376) {
                        int iM220300a = zlr0.m220300a(bgw0Var.m104280v());
                        if (iM220300a > 1) {
                            y4w0.m214278f("PsshAtomUtil", "Unsupported pssh version: " + iM220300a);
                        } else {
                            UUID uuid = new UUID(bgw0Var.m104252I(), bgw0Var.m104252I());
                            if (iM220300a == 1) {
                                bgw0Var.m104270l(bgw0Var.m104248E() * 16);
                            }
                            int iM104248E = bgw0Var.m104248E();
                            if (iM104248E == bgw0Var.m104275q()) {
                                byte[] bArr = new byte[iM104248E];
                                bgw0Var.m104265g(bArr, 0, iM104248E);
                                dnr0Var = new dnr0(uuid, iM220300a, bArr);
                            }
                        }
                        dnr0Var = null;
                    } else {
                        dnr0Var = null;
                    }
                }
                UUID uuid2 = dnr0Var == null ? null : dnr0Var.f89826a;
                if (uuid2 == null) {
                    y4w0.m214278f("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new zzad(uuid2, null, DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4, bArrM104271m));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new zzae(arrayList);
    }

    /* JADX INFO: renamed from: h */
    public static void m212065h(bgw0 bgw0Var, int i, jnr0 jnr0Var) throws zzcc {
        bgw0Var.m104269k(i + 8);
        int iM104280v = bgw0Var.m104280v();
        if ((iM104280v & 1) != 0) {
            throw zzcc.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iM104280v & 2) != 0;
        int iM104248E = bgw0Var.m104248E();
        if (iM104248E == 0) {
            Arrays.fill(jnr0Var.f121895l, 0, jnr0Var.f121888e, false);
            return;
        }
        int i2 = jnr0Var.f121888e;
        if (iM104248E != i2) {
            throw zzcc.zza("Senc sample count " + iM104248E + " is different from fragment sample count" + i2, null);
        }
        Arrays.fill(jnr0Var.f121895l, 0, iM104248E, z);
        jnr0Var.m146284a(bgw0Var.m104275q());
        bgw0 bgw0Var2 = jnr0Var.f121897n;
        bgw0Var.m104265g(bgw0Var2.m104271m(), 0, bgw0Var2.m104278t());
        jnr0Var.f121897n.m104269k(0);
        jnr0Var.f121898o = false;
    }

    /* JADX INFO: renamed from: j */
    public static final imr0 m212066j(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (imr0) sparseArray.valueAt(0);
        }
        imr0 imr0Var = (imr0) sparseArray.get(i);
        imr0Var.getClass();
        return imr0Var;
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: c */
    public final void mo97906c(long j, long j2) {
        int size = this.f195294c.size();
        for (int i = 0; i < size; i++) {
            ((wmr0) this.f195294c.valueAt(i)).m207131i();
        }
        this.f195303l.clear();
        this.f195310s = 0;
        this.f195311t = j2;
        this.f195302k.clear();
        m212067g();
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: d */
    public final boolean mo97907d(qer0 qer0Var) throws IOException {
        return gnr0.m130978a(qer0Var);
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: e */
    public final void mo97908e(ser0 ser0Var) {
        this.f195288B = ser0Var;
        m212067g();
        sgr0[] sgr0VarArr = new sgr0[2];
        this.f195289C = sgr0VarArr;
        int i = 0;
        sgr0[] sgr0VarArr2 = (sgr0[]) mpw0.m159414l(sgr0VarArr, 0);
        this.f195289C = sgr0VarArr2;
        for (sgr0 sgr0Var : sgr0VarArr2) {
            sgr0Var.mo99373d(f195286H);
        }
        this.f195290D = new sgr0[this.f195293b.size()];
        int i2 = 100;
        while (i < this.f195290D.length) {
            int i3 = i2 + 1;
            sgr0 sgr0VarMo101550i = this.f195288B.mo101550i(i2, 3);
            sgr0VarMo101550i.mo99373d((sqr0) this.f195293b.get(i));
            this.f195290D[i] = sgr0VarMo101550i;
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
    @Override // p153l.per0
    /* JADX INFO: renamed from: f */
    public final int mo97909f(qer0 qer0Var, yfr0 yfr0Var) throws IOException {
        int i;
        ?? r9;
        wmr0 wmr0Var;
        char c;
        hnr0 hnr0Var;
        sgr0 sgr0Var;
        long jM207128e;
        int i2;
        byte[] bArrM104271m;
        int i3;
        int i4;
        int i5;
        int iMo99374e;
        int iM104280v;
        boolean z;
        String str;
        inr0 inr0VarM207129f;
        ggr0 ggr0Var;
        int i6;
        vmr0 vmr0Var;
        long j;
        long j2;
        int i7;
        int i8;
        int i9;
        int iM207126c;
        long j3;
        long jM159395H;
        long jM104253J;
        String str2;
        String str3;
        long j4;
        long jM104254K;
        long jM104254K2;
        while (true) {
            int i10 = this.f195304m;
            char c2 = 2;
            i = 1;
            r9 = 0;
            if (i10 == 0) {
                if (this.f195307p == 0) {
                    if (!qer0Var.mo125312b(this.f195301j.m104271m(), 0, 8, true)) {
                        return -1;
                    }
                    this.f195307p = 8;
                    this.f195301j.m104269k(0);
                    this.f195306o = this.f195301j.m104253J();
                    this.f195305n = this.f195301j.m104280v();
                }
                long j5 = this.f195306o;
                if (j5 == 1) {
                    ((fer0) qer0Var).mo125312b(this.f195301j.m104271m(), 8, 8, false);
                    this.f195307p += 8;
                    this.f195306o = this.f195301j.m104254K();
                } else if (j5 == 0) {
                    long jZzd = qer0Var.zzd();
                    if (jZzd == -1) {
                        jZzd = !this.f195302k.isEmpty() ? ((xlr0) this.f195302k.peek()).f195013b : -1L;
                    }
                    if (jZzd != -1) {
                        this.f195306o = (jZzd - qer0Var.zzf()) + ((long) this.f195307p);
                    }
                }
                long j6 = this.f195306o;
                long j7 = this.f195307p;
                if (j6 < j7) {
                    throw zzcc.zzc("Atom size less than header length (unsupported).");
                }
                long jZzf = qer0Var.zzf() - j7;
                int i11 = this.f195305n;
                if ((i11 == 1836019558 || i11 == 1835295092) && !this.f195291E) {
                    this.f195288B.mo101551j(new agr0(this.f195312u, jZzf));
                    this.f195291E = true;
                }
                if (this.f195305n == 1836019558) {
                    int size = this.f195294c.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        jnr0 jnr0Var = ((wmr0) this.f195294c.valueAt(i12)).f189825b;
                        jnr0Var.f121886c = jZzf;
                        jnr0Var.f121885b = jZzf;
                    }
                }
                int i13 = this.f195305n;
                if (i13 == 1835295092) {
                    this.f195314w = null;
                    this.f195309r = jZzf + this.f195306o;
                    this.f195304m = 2;
                } else if (i13 == 1836019574 || i13 == 1953653099 || i13 == 1835297121 || i13 == 1835626086 || i13 == 1937007212 || i13 == 1836019558 || i13 == 1953653094 || i13 == 1836475768 || i13 == 1701082227) {
                    long jZzf2 = (qer0Var.zzf() + this.f195306o) - 8;
                    this.f195302k.push(new xlr0(i13, jZzf2));
                    if (this.f195306o == this.f195307p) {
                        m212068i(jZzf2);
                    } else {
                        m212067g();
                    }
                } else if (i13 == 1751411826 || i13 == 1835296868 || i13 == 1836476516 || i13 == 1936286840 || i13 == 1937011556 || i13 == 1937011827 || i13 == 1668576371 || i13 == 1937011555 || i13 == 1937011578 || i13 == 1937013298 || i13 == 1937007471 || i13 == 1668232756 || i13 == 1937011571 || i13 == 1952867444 || i13 == 1952868452 || i13 == 1953196132 || i13 == 1953654136 || i13 == 1953658222 || i13 == 1886614376 || i13 == 1935763834 || i13 == 1935763823 || i13 == 1936027235 || i13 == 1970628964 || i13 == 1935828848 || i13 == 1936158820 || i13 == 1701606260 || i13 == 1835362404 || i13 == 1701671783) {
                    if (this.f195307p != 8) {
                        throw zzcc.zzc("Leaf atom defines extended atom size (unsupported).");
                    }
                    if (this.f195306o > 2147483647L) {
                        throw zzcc.zzc("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    bgw0 bgw0Var = new bgw0((int) this.f195306o);
                    System.arraycopy(this.f195301j.m104271m(), 0, bgw0Var.m104271m(), 0, 8);
                    this.f195308q = bgw0Var;
                    this.f195304m = 1;
                } else {
                    if (this.f195306o > 2147483647L) {
                        throw zzcc.zzc("Skipping atom with length > 2147483647 (unsupported).");
                    }
                    this.f195308q = null;
                    this.f195304m = 1;
                }
            } else if (i10 != 1) {
                long j8 = Long.MAX_VALUE;
                if (i10 != 2) {
                    wmr0Var = this.f195314w;
                    if (wmr0Var != null) {
                        c = 2;
                        break;
                    }
                    SparseArray sparseArray = this.f195294c;
                    int size2 = sparseArray.size();
                    long j9 = Long.MAX_VALUE;
                    wmr0 wmr0Var2 = null;
                    int i14 = 0;
                    while (i14 < size2) {
                        char c3 = c2;
                        wmr0 wmr0Var3 = (wmr0) sparseArray.valueAt(i14);
                        if ((wmr0Var3.f189835l || wmr0Var3.f189829f != wmr0Var3.f189827d.f127629b) && (!wmr0Var3.f189835l || wmr0Var3.f189831h != wmr0Var3.f189825b.f121887d)) {
                            long jM207127d = wmr0Var3.m207127d();
                            if (jM207127d < j9) {
                                wmr0Var2 = wmr0Var3;
                                j9 = jM207127d;
                            }
                        }
                        i14++;
                        c2 = c3;
                    }
                    c = c2;
                    if (wmr0Var2 != null) {
                        int iM207127d = (int) (wmr0Var2.m207127d() - qer0Var.zzf());
                        if (iM207127d < 0) {
                            y4w0.m214278f("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            iM207127d = 0;
                        }
                        ((fer0) qer0Var).m125319k(iM207127d, false);
                        this.f195314w = wmr0Var2;
                        wmr0Var = wmr0Var2;
                        break;
                    }
                    int iZzf = (int) (this.f195309r - qer0Var.zzf());
                    if (iZzf < 0) {
                        throw zzcc.zza("Offset to end of mdat was negative.", null);
                    }
                    ((fer0) qer0Var).m125319k(iZzf, false);
                    m212067g();
                } else {
                    int size3 = this.f195294c.size();
                    wmr0 wmr0Var4 = null;
                    for (int i15 = 0; i15 < size3; i15++) {
                        jnr0 jnr0Var2 = ((wmr0) this.f195294c.valueAt(i15)).f189825b;
                        if (jnr0Var2.f121898o) {
                            long j10 = jnr0Var2.f121886c;
                            if (j10 < j8) {
                                wmr0Var4 = (wmr0) this.f195294c.valueAt(i15);
                                j8 = j10;
                            }
                        }
                    }
                    if (wmr0Var4 == null) {
                        this.f195304m = 3;
                    } else {
                        int iZzf2 = (int) (j8 - qer0Var.zzf());
                        if (iZzf2 < 0) {
                            throw zzcc.zza("Offset to encryption data was negative.", null);
                        }
                        fer0 fer0Var = (fer0) qer0Var;
                        fer0Var.m125319k(iZzf2, false);
                        jnr0 jnr0Var3 = wmr0Var4.f189825b;
                        bgw0 bgw0Var2 = jnr0Var3.f121897n;
                        fer0Var.mo125312b(bgw0Var2.m104271m(), 0, bgw0Var2.m104278t(), false);
                        jnr0Var3.f121897n.m104269k(0);
                        jnr0Var3.f121898o = false;
                    }
                }
            } else {
                int i16 = ((int) this.f195306o) - this.f195307p;
                bgw0 bgw0Var3 = this.f195308q;
                if (bgw0Var3 != null) {
                    ((fer0) qer0Var).mo125312b(bgw0Var3.m104271m(), 8, i16, false);
                    ylr0 ylr0Var = new ylr0(this.f195305n, bgw0Var3);
                    long jZzf3 = qer0Var.zzf();
                    if (this.f195302k.isEmpty()) {
                        int i17 = ylr0Var.f205002a;
                        if (i17 == 1936286840) {
                            bgw0 bgw0Var4 = ylr0Var.f200580b;
                            bgw0Var4.m104269k(8);
                            int iM220300a = zlr0.m220300a(bgw0Var4.m104280v());
                            bgw0Var4.m104270l(4);
                            long jM104253J2 = bgw0Var4.m104253J();
                            if (iM220300a == 0) {
                                jM104254K = bgw0Var4.m104253J();
                                jM104254K2 = bgw0Var4.m104253J();
                            } else {
                                jM104254K = bgw0Var4.m104254K();
                                jM104254K2 = bgw0Var4.m104254K();
                            }
                            long j11 = jZzf3 + jM104254K2;
                            long j12 = jM104254K;
                            long jM159395H2 = mpw0.m159395H(j12, 1000000L, jM104253J2, RoundingMode.FLOOR);
                            bgw0Var4.m104270l(2);
                            int iM104249F = bgw0Var4.m104249F();
                            int[] iArr = new int[iM104249F];
                            long[] jArr = new long[iM104249F];
                            long[] jArr2 = new long[iM104249F];
                            long[] jArr3 = new long[iM104249F];
                            long jM159395H3 = jM159395H2;
                            int i18 = 0;
                            while (i18 < iM104249F) {
                                int iM104280v2 = bgw0Var4.m104280v();
                                if ((iM104280v2 & Integer.MIN_VALUE) != 0) {
                                    throw zzcc.zza("Unhandled indirect reference", null);
                                }
                                long jM104253J3 = bgw0Var4.m104253J();
                                iArr[i18] = iM104280v2 & Api.BaseClientBuilder.API_PRIORITY_OTHER;
                                jArr[i18] = j11;
                                jArr3[i18] = jM159395H3;
                                j12 += jM104253J3;
                                jM159395H3 = mpw0.m159395H(j12, 1000000L, jM104253J2, RoundingMode.FLOOR);
                                jArr2[i18] = jM159395H3 - jArr3[i18];
                                bgw0Var4.m104270l(4);
                                j11 += (long) iArr[i18];
                                i18++;
                                bgw0Var4 = bgw0Var4;
                                jM159395H2 = jM159395H2;
                            }
                            Pair pairCreate = Pair.create(Long.valueOf(jM159395H2), new der0(iArr, jArr, jArr2, jArr3));
                            this.f195313v = ((Long) pairCreate.first).longValue();
                            this.f195288B.mo101551j((bgr0) pairCreate.second);
                            this.f195291E = true;
                        } else if (i17 == 1701671783) {
                            bgw0 bgw0Var5 = ylr0Var.f200580b;
                            if (this.f195289C.length != 0) {
                                bgw0Var5.m104269k(8);
                                int iM220300a2 = zlr0.m220300a(bgw0Var5.m104280v());
                                if (iM220300a2 == 0) {
                                    String strM104256M = bgw0Var5.m104256M((char) 0);
                                    strM104256M.getClass();
                                    String strM104256M2 = bgw0Var5.m104256M((char) 0);
                                    strM104256M2.getClass();
                                    long jM104253J4 = bgw0Var5.m104253J();
                                    long jM104253J5 = bgw0Var5.m104253J();
                                    RoundingMode roundingMode = RoundingMode.FLOOR;
                                    long jM159395H4 = mpw0.m159395H(jM104253J5, 1000000L, jM104253J4, roundingMode);
                                    long j13 = this.f195313v;
                                    long j14 = j13 != -9223372036854775807L ? j13 + jM159395H4 : -9223372036854775807L;
                                    long jM159395H5 = mpw0.m159395H(bgw0Var5.m104253J(), 1000L, jM104253J4, roundingMode);
                                    long j15 = j14;
                                    j3 = jM159395H4;
                                    jM159395H = j15;
                                    jM104253J = bgw0Var5.m104253J();
                                    str2 = strM104256M;
                                    str3 = strM104256M2;
                                    j4 = jM159395H5;
                                } else if (iM220300a2 != 1) {
                                    y4w0.m214278f("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + iM220300a2);
                                } else {
                                    long jM104253J6 = bgw0Var5.m104253J();
                                    long jM104254K3 = bgw0Var5.m104254K();
                                    RoundingMode roundingMode2 = RoundingMode.FLOOR;
                                    jM159395H = mpw0.m159395H(jM104254K3, 1000000L, jM104253J6, roundingMode2);
                                    long jM159395H6 = mpw0.m159395H(bgw0Var5.m104253J(), 1000L, jM104253J6, roundingMode2);
                                    long jM104253J7 = bgw0Var5.m104253J();
                                    String strM104256M3 = bgw0Var5.m104256M((char) 0);
                                    strM104256M3.getClass();
                                    String strM104256M4 = bgw0Var5.m104256M((char) 0);
                                    strM104256M4.getClass();
                                    jM104253J = jM104253J7;
                                    str2 = strM104256M3;
                                    str3 = strM104256M4;
                                    j4 = jM159395H6;
                                    j3 = -9223372036854775807L;
                                }
                                byte[] bArr = new byte[bgw0Var5.m104275q()];
                                bgw0Var5.m104265g(bArr, 0, bgw0Var5.m104275q());
                                bgw0 bgw0Var6 = new bgw0(this.f195300i.m206597a(new zzaft(str2, str3, j4, jM104253J, bArr)));
                                int iM104275q = bgw0Var6.m104275q();
                                for (sgr0 sgr0Var2 : this.f195289C) {
                                    bgw0Var6.m104269k(0);
                                    sgr0Var2.mo99375f(bgw0Var6, iM104275q);
                                }
                                ArrayDeque arrayDeque = this.f195303l;
                                if (jM159395H == -9223372036854775807L) {
                                    arrayDeque.addLast(new vmr0(j3, true, iM104275q));
                                    this.f195310s += iM104275q;
                                } else if (arrayDeque.isEmpty()) {
                                    for (sgr0 sgr0Var3 : this.f195289C) {
                                        sgr0Var3.mo99372c(jM159395H, 1, iM104275q, 0, null);
                                    }
                                } else {
                                    this.f195303l.addLast(new vmr0(jM159395H, false, iM104275q));
                                    this.f195310s += iM104275q;
                                }
                            }
                        }
                    } else {
                        ((xlr0) this.f195302k.peek()).m211672f(ylr0Var);
                    }
                } else {
                    ((fer0) qer0Var).m125319k(i16, false);
                }
                m212068i(qer0Var.zzf());
            }
        }
        char c4 = 6;
        if (this.f195304m == 3) {
            int iM207125b = wmr0Var.m207125b();
            this.f195315x = iM207125b;
            if (wmr0Var.f189829f < wmr0Var.f189832i) {
                ((fer0) qer0Var).m125319k(iM207125b, false);
                inr0 inr0VarM207129f2 = wmr0Var.m207129f();
                if (inr0VarM207129f2 != null) {
                    bgw0 bgw0Var7 = wmr0Var.f189825b.f121897n;
                    int i19 = inr0VarM207129f2.f115996d;
                    if (i19 != 0) {
                        bgw0Var7.m104270l(i19);
                    }
                    if (wmr0Var.f189825b.m146285b(wmr0Var.f189829f)) {
                        bgw0Var7.m104270l(bgw0Var7.m104249F() * 6);
                    }
                }
                if (!wmr0Var.m207132k()) {
                    this.f195314w = null;
                }
                i6 = 3;
            } else {
                if (wmr0Var.f189827d.f127628a.f110821g == 1) {
                    this.f195315x = iM207125b - 8;
                    ((fer0) qer0Var).m125319k(8, false);
                }
                boolean zEquals = "audio/ac4".equals(wmr0Var.f189827d.f127628a.f110820f.f170251l);
                int i20 = this.f195315x;
                if (zEquals) {
                    this.f195316y = wmr0Var.m207126c(i20, 7);
                    idr0.m139542b(this.f195315x, this.f195299h);
                    wmr0Var.f189824a.mo99375f(this.f195299h, 7);
                    iM207126c = this.f195316y + 7;
                    this.f195316y = iM207126c;
                } else {
                    iM207126c = wmr0Var.m207126c(i20, 0);
                    this.f195316y = iM207126c;
                }
                this.f195315x += iM207126c;
                this.f195304m = 4;
                this.f195317z = 0;
                hnr0Var = wmr0Var.f189827d.f127628a;
                sgr0Var = wmr0Var.f189824a;
                jM207128e = wmr0Var.m207128e();
                i2 = hnr0Var.f110824j;
                if (i2 == 0) {
                    while (true) {
                        i8 = this.f195316y;
                        i9 = this.f195315x;
                        if (i8 < i9) {
                            break;
                        }
                        this.f195316y += sgr0Var.mo99374e(qer0Var, i9 - i8, false);
                    }
                } else {
                    bArrM104271m = this.f195296e.m104271m();
                    bArrM104271m[0] = 0;
                    bArrM104271m[1] = 0;
                    bArrM104271m[c] = 0;
                    i3 = i2 + 1;
                    i4 = 4 - i2;
                    while (this.f195316y < this.f195315x) {
                        i5 = this.f195317z;
                        if (i5 == 0) {
                            ((fer0) qer0Var).mo125312b(bArrM104271m, i4, i3, r9);
                            this.f195296e.m104269k(r9);
                            iM104280v = this.f195296e.m104280v();
                            if (iM104280v > 0) {
                                throw zzcc.zza("Invalid NAL length", null);
                            }
                            this.f195317z = iM104280v - 1;
                            this.f195295d.m104269k(r9);
                            sgr0Var.mo99375f(this.f195295d, 4);
                            sgr0Var.mo99375f(this.f195296e, i);
                            if (this.f195290D.length > 0) {
                                str = hnr0Var.f110820f.f170251l;
                                byte b = bArrM104271m[4];
                                byte[] bArr2 = w3x0.f187180a;
                                if ((YtVideoEncoder.MIME_TYPE.equals(str) || (b & 31) != c4) && !("video/hevc".equals(str) && ((b & 126) >> i) == 39)) {
                                    z = 0;
                                } else {
                                    z = i;
                                }
                            } else {
                                z = 0;
                            }
                            this.f195287A = z;
                            this.f195316y += 5;
                            this.f195315x += i4;
                        } else {
                            if (this.f195287A) {
                                this.f195297f.m104266h(i5);
                                ((fer0) qer0Var).mo125312b(this.f195297f.m104271m(), 0, this.f195317z, false);
                                sgr0Var.mo99375f(this.f195297f, this.f195317z);
                                iMo99374e = this.f195317z;
                                bgw0 bgw0Var8 = this.f195297f;
                                int iM204792b = w3x0.m204792b(bgw0Var8.m104271m(), bgw0Var8.m104278t());
                                this.f195297f.m104269k("video/hevc".equals(hnr0Var.f110820f.f170251l) ? 1 : 0);
                                this.f195297f.m104268j(iM204792b);
                                cer0.m109449a(jM207128e, this.f195297f, this.f195290D);
                            } else {
                                iMo99374e = sgr0Var.mo99374e(qer0Var, i5, false);
                            }
                            this.f195316y += iMo99374e;
                            this.f195317z -= iMo99374e;
                            c4 = 6;
                            i = 1;
                        }
                        r9 = 0;
                    }
                }
                int iM207124a = wmr0Var.m207124a();
                inr0VarM207129f = wmr0Var.m207129f();
                if (inr0VarM207129f != null) {
                    ggr0Var = inr0VarM207129f.f115995c;
                } else {
                    ggr0Var = null;
                }
                sgr0Var.mo99372c(jM207128e, iM207124a, this.f195315x, 0, ggr0Var);
                while (!this.f195303l.isEmpty()) {
                    vmr0Var = (vmr0) this.f195303l.removeFirst();
                    this.f195310s -= vmr0Var.f184752c;
                    j = vmr0Var.f184750a;
                    if (vmr0Var.f184751b) {
                        j += jM207128e;
                    }
                    j2 = j;
                    for (sgr0 sgr0Var4 : this.f195289C) {
                        sgr0Var4.mo99372c(j2, 1, vmr0Var.f184752c, this.f195310s, null);
                    }
                }
                if (!wmr0Var.m207132k()) {
                    this.f195314w = null;
                }
                i6 = 3;
            }
        } else {
            hnr0Var = wmr0Var.f189827d.f127628a;
            sgr0Var = wmr0Var.f189824a;
            jM207128e = wmr0Var.m207128e();
            i2 = hnr0Var.f110824j;
            if (i2 == 0) {
                while (true) {
                    i8 = this.f195316y;
                    i9 = this.f195315x;
                    if (i8 < i9) {
                        break;
                        break;
                    }
                    this.f195316y += sgr0Var.mo99374e(qer0Var, i9 - i8, false);
                }
            } else {
                bArrM104271m = this.f195296e.m104271m();
                bArrM104271m[0] = 0;
                bArrM104271m[1] = 0;
                bArrM104271m[c] = 0;
                i3 = i2 + 1;
                i4 = 4 - i2;
                while (this.f195316y < this.f195315x) {
                    i5 = this.f195317z;
                    if (i5 == 0) {
                        ((fer0) qer0Var).mo125312b(bArrM104271m, i4, i3, r9);
                        this.f195296e.m104269k(r9);
                        iM104280v = this.f195296e.m104280v();
                        if (iM104280v > 0) {
                            throw zzcc.zza("Invalid NAL length", null);
                        }
                        this.f195317z = iM104280v - 1;
                        this.f195295d.m104269k(r9);
                        sgr0Var.mo99375f(this.f195295d, 4);
                        sgr0Var.mo99375f(this.f195296e, i);
                        if (this.f195290D.length > 0) {
                            str = hnr0Var.f110820f.f170251l;
                            byte b2 = bArrM104271m[4];
                            byte[] bArr3 = w3x0.f187180a;
                            if (YtVideoEncoder.MIME_TYPE.equals(str)) {
                                z = 0;
                            } else {
                                z = 0;
                            }
                        } else {
                            z = 0;
                        }
                        this.f195287A = z;
                        this.f195316y += 5;
                        this.f195315x += i4;
                    } else {
                        if (this.f195287A) {
                            this.f195297f.m104266h(i5);
                            ((fer0) qer0Var).mo125312b(this.f195297f.m104271m(), 0, this.f195317z, false);
                            sgr0Var.mo99375f(this.f195297f, this.f195317z);
                            iMo99374e = this.f195317z;
                            bgw0 bgw0Var9 = this.f195297f;
                            int iM204792b2 = w3x0.m204792b(bgw0Var9.m104271m(), bgw0Var9.m104278t());
                            this.f195297f.m104269k("video/hevc".equals(hnr0Var.f110820f.f170251l) ? 1 : 0);
                            this.f195297f.m104268j(iM204792b2);
                            cer0.m109449a(jM207128e, this.f195297f, this.f195290D);
                        } else {
                            iMo99374e = sgr0Var.mo99374e(qer0Var, i5, false);
                        }
                        this.f195316y += iMo99374e;
                        this.f195317z -= iMo99374e;
                        c4 = 6;
                        i = 1;
                    }
                    r9 = 0;
                }
            }
            int iM207124a2 = wmr0Var.m207124a();
            inr0VarM207129f = wmr0Var.m207129f();
            if (inr0VarM207129f != null) {
                ggr0Var = inr0VarM207129f.f115995c;
            } else {
                ggr0Var = null;
            }
            sgr0Var.mo99372c(jM207128e, iM207124a2, this.f195315x, 0, ggr0Var);
            while (!this.f195303l.isEmpty()) {
                vmr0Var = (vmr0) this.f195303l.removeFirst();
                this.f195310s -= vmr0Var.f184752c;
                j = vmr0Var.f184750a;
                if (vmr0Var.f184751b) {
                    j += jM207128e;
                }
                j2 = j;
                while (i7 < r4) {
                    sgr0Var4.mo99372c(j2, 1, vmr0Var.f184752c, this.f195310s, null);
                }
            }
            if (!wmr0Var.m207132k()) {
                this.f195314w = null;
            }
            i6 = 3;
        }
        this.f195304m = i6;
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m212067g() {
        this.f195304m = 0;
        this.f195307p = 0;
    }

    /* JADX INFO: renamed from: i */
    public final void m212068i(long j) throws zzcc {
        SparseArray sparseArray;
        int i;
        int i2;
        int i3;
        int i4;
        byte[] bArr;
        int i5;
        boolean z;
        int i6;
        int iM104280v;
        long[] jArr;
        while (!this.f195302k.isEmpty() && ((xlr0) this.f195302k.peek()).f195013b == j) {
            xlr0 xlr0Var = (xlr0) this.f195302k.pop();
            int i7 = xlr0Var.f205002a;
            int i8 = 12;
            int i9 = 8;
            if (i7 == 1836019574) {
                zzae zzaeVarM212064b = m212064b(xlr0Var.f195014c);
                xlr0 xlr0VarM211669c = xlr0Var.m211669c(1836475768);
                xlr0VarM211669c.getClass();
                SparseArray sparseArray2 = new SparseArray();
                int size = xlr0VarM211669c.f195014c.size();
                long jM104253J = -9223372036854775807L;
                int i10 = 0;
                while (i10 < size) {
                    ylr0 ylr0Var = (ylr0) xlr0VarM211669c.f195014c.get(i10);
                    int i11 = ylr0Var.f205002a;
                    if (i11 == 1953654136) {
                        bgw0 bgw0Var = ylr0Var.f200580b;
                        bgw0Var.m104269k(i8);
                        Pair pairCreate = Pair.create(Integer.valueOf(bgw0Var.m104280v()), new imr0(bgw0Var.m104280v() - 1, bgw0Var.m104280v(), bgw0Var.m104280v(), bgw0Var.m104280v()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (imr0) pairCreate.second);
                    } else if (i11 == 1835362404) {
                        bgw0 bgw0Var2 = ylr0Var.f200580b;
                        bgw0Var2.m104269k(8);
                        jM104253J = zlr0.m220300a(bgw0Var2.m104280v()) == 0 ? bgw0Var2.m104253J() : bgw0Var2.m104254K();
                    }
                    i10++;
                    i8 = 12;
                }
                List listM135972d = hmr0.m135972d(xlr0Var, new rfr0(), jM104253J, zzaeVarM212064b, false, false, new eow0() { // from class: l.kmr0
                    @Override // p153l.eow0
                    public final Object apply(Object obj) {
                        return (hnr0) obj;
                    }
                });
                int size2 = listM135972d.size();
                if (this.f195294c.size() == 0) {
                    for (int i12 = 0; i12 < size2; i12++) {
                        knr0 knr0Var = (knr0) listM135972d.get(i12);
                        hnr0 hnr0Var = knr0Var.f127628a;
                        this.f195294c.put(hnr0Var.f110815a, new wmr0(this.f195288B.mo101550i(i12, hnr0Var.f110816b), knr0Var, m212066j(sparseArray2, hnr0Var.f110815a)));
                        this.f195312u = Math.max(this.f195312u, hnr0Var.f110819e);
                    }
                    this.f195288B.mo101544c();
                } else {
                    lev0.m153958f(this.f195294c.size() == size2);
                    for (int i13 = 0; i13 < size2; i13++) {
                        knr0 knr0Var2 = (knr0) listM135972d.get(i13);
                        hnr0 hnr0Var2 = knr0Var2.f127628a;
                        ((wmr0) this.f195294c.get(hnr0Var2.f110815a)).m207130h(knr0Var2, m212066j(sparseArray2, hnr0Var2.f110815a));
                    }
                }
            } else if (i7 == 1836019558) {
                SparseArray sparseArray3 = this.f195294c;
                byte[] bArr2 = this.f195298g;
                int size3 = xlr0Var.f195015d.size();
                int i14 = 0;
                while (i14 < size3) {
                    xlr0 xlr0Var2 = (xlr0) xlr0Var.f195015d.get(i14);
                    if (xlr0Var2.f205002a == 1953653094) {
                        ylr0 ylr0VarM211670d = xlr0Var2.m211670d(1952868452);
                        ylr0VarM211670d.getClass();
                        bgw0 bgw0Var3 = ylr0VarM211670d.f200580b;
                        bgw0Var3.m104269k(i9);
                        int iM104280v2 = bgw0Var3.m104280v();
                        wmr0 wmr0Var = (wmr0) sparseArray3.get(bgw0Var3.m104280v());
                        if (wmr0Var == null) {
                            wmr0Var = null;
                        } else {
                            if ((iM104280v2 & 1) != 0) {
                                long jM104254K = bgw0Var3.m104254K();
                                jnr0 jnr0Var = wmr0Var.f189825b;
                                jnr0Var.f121885b = jM104254K;
                                jnr0Var.f121886c = jM104254K;
                            }
                            imr0 imr0Var = wmr0Var.f189828e;
                            wmr0Var.f189825b.f121884a = new imr0((iM104280v2 & 2) != 0 ? bgw0Var3.m104280v() - 1 : imr0Var.f115826a, (iM104280v2 & 8) != 0 ? bgw0Var3.m104280v() : imr0Var.f115827b, (iM104280v2 & 16) != 0 ? bgw0Var3.m104280v() : imr0Var.f115828c, (iM104280v2 & 32) != 0 ? bgw0Var3.m104280v() : imr0Var.f115829d);
                        }
                        if (wmr0Var == null) {
                            sparseArray = sparseArray3;
                            i = size3;
                            i2 = i9;
                            i3 = i14;
                        } else {
                            jnr0 jnr0Var2 = wmr0Var.f189825b;
                            long j2 = jnr0Var2.f121899p;
                            boolean z2 = jnr0Var2.f121900q;
                            wmr0Var.m207131i();
                            wmr0Var.f189835l = true;
                            ylr0 ylr0VarM211670d2 = xlr0Var2.m211670d(1952867444);
                            if (ylr0VarM211670d2 != null) {
                                bgw0 bgw0Var4 = ylr0VarM211670d2.f200580b;
                                bgw0Var4.m104269k(i9);
                                jnr0Var2.f121899p = zlr0.m220300a(bgw0Var4.m104280v()) == 1 ? bgw0Var4.m104254K() : bgw0Var4.m104253J();
                                jnr0Var2.f121900q = true;
                            } else {
                                jnr0Var2.f121899p = j2;
                                jnr0Var2.f121900q = z2;
                            }
                            List list = xlr0Var2.f195014c;
                            int size4 = list.size();
                            int i15 = 0;
                            int i16 = 0;
                            int i17 = 0;
                            while (true) {
                                i4 = 1953658222;
                                if (i15 >= size4) {
                                    break;
                                }
                                ylr0 ylr0Var2 = (ylr0) list.get(i15);
                                SparseArray sparseArray4 = sparseArray3;
                                if (ylr0Var2.f205002a == 1953658222) {
                                    bgw0 bgw0Var5 = ylr0Var2.f200580b;
                                    bgw0Var5.m104269k(12);
                                    int iM104248E = bgw0Var5.m104248E();
                                    if (iM104248E > 0) {
                                        i17 += iM104248E;
                                        i16++;
                                    }
                                }
                                i15++;
                                sparseArray3 = sparseArray4;
                            }
                            sparseArray = sparseArray3;
                            wmr0Var.f189831h = 0;
                            wmr0Var.f189830g = 0;
                            wmr0Var.f189829f = 0;
                            jnr0 jnr0Var3 = wmr0Var.f189825b;
                            jnr0Var3.f121887d = i16;
                            jnr0Var3.f121888e = i17;
                            if (jnr0Var3.f121890g.length < i16) {
                                jnr0Var3.f121889f = new long[i16];
                                jnr0Var3.f121890g = new int[i16];
                            }
                            if (jnr0Var3.f121891h.length < i17) {
                                int i18 = (i17 * 125) / 100;
                                jnr0Var3.f121891h = new int[i18];
                                jnr0Var3.f121892i = new long[i18];
                                jnr0Var3.f121893j = new boolean[i18];
                                jnr0Var3.f121895l = new boolean[i18];
                            }
                            int i19 = 0;
                            int i20 = 0;
                            int i21 = 0;
                            while (true) {
                                long j3 = 0;
                                if (i19 >= size4) {
                                    break;
                                }
                                ylr0 ylr0Var3 = (ylr0) list.get(i19);
                                if (ylr0Var3.f205002a == i4) {
                                    int i22 = i20 + 1;
                                    bgw0 bgw0Var6 = ylr0Var3.f200580b;
                                    bgw0Var6.m104269k(8);
                                    int iM104280v3 = bgw0Var6.m104280v();
                                    hnr0 hnr0Var3 = wmr0Var.f189827d.f127628a;
                                    jnr0 jnr0Var4 = wmr0Var.f189825b;
                                    imr0 imr0Var2 = jnr0Var4.f121884a;
                                    int i23 = mpw0.f137957a;
                                    int i24 = i20;
                                    jnr0Var4.f121890g[i24] = bgw0Var6.m104248E();
                                    long[] jArr2 = jnr0Var4.f121889f;
                                    long j4 = jnr0Var4.f121885b;
                                    jArr2[i24] = j4;
                                    if ((iM104280v3 & 1) != 0) {
                                        jArr2[i24] = j4 + ((long) bgw0Var6.m104280v());
                                    }
                                    boolean z3 = (iM104280v3 & 4) != 0;
                                    int iM104280v4 = imr0Var2.f115829d;
                                    if (z3) {
                                        iM104280v4 = bgw0Var6.m104280v();
                                    }
                                    boolean z4 = z3;
                                    int i25 = iM104280v3 & 256;
                                    int i26 = iM104280v3 & 512;
                                    int i27 = iM104280v3 & 1024;
                                    int i28 = iM104280v3 & 2048;
                                    long[] jArr3 = hnr0Var3.f110822h;
                                    if (jArr3 != null) {
                                        i6 = iM104280v4;
                                        if (jArr3.length == 1 && (jArr = hnr0Var3.f110823i) != null) {
                                            long j5 = jArr3[0];
                                            if (j5 == 0 || mpw0.m159395H(j5 + jArr[0], 1000000L, hnr0Var3.f110818d, RoundingMode.FLOOR) >= hnr0Var3.f110819e) {
                                                j3 = hnr0Var3.f110823i[0];
                                            }
                                        }
                                    } else {
                                        i6 = iM104280v4;
                                    }
                                    int[] iArr = jnr0Var4.f121891h;
                                    long[] jArr4 = jnr0Var4.f121892i;
                                    boolean[] zArr = jnr0Var4.f121893j;
                                    int i29 = jnr0Var4.f121890g[i24] + i21;
                                    long j6 = hnr0Var3.f110817c;
                                    long j7 = jnr0Var4.f121899p;
                                    while (i21 < i29) {
                                        int iM104280v5 = i25 != 0 ? bgw0Var6.m104280v() : imr0Var2.f115827b;
                                        m212063a(iM104280v5);
                                        int iM104280v6 = i26 != 0 ? bgw0Var6.m104280v() : imr0Var2.f115828c;
                                        m212063a(iM104280v6);
                                        if (i27 != 0) {
                                            iM104280v = bgw0Var6.m104280v();
                                        } else if (i21 != 0) {
                                            iM104280v = imr0Var2.f115829d;
                                        } else if (z4) {
                                            iM104280v = i6;
                                            i21 = 0;
                                        } else {
                                            i21 = 0;
                                            iM104280v = imr0Var2.f115829d;
                                        }
                                        int i30 = iM104280v;
                                        long jM159395H = mpw0.m159395H((((long) (i28 != 0 ? bgw0Var6.m104280v() : 0)) + j7) - j3, 1000000L, j6, RoundingMode.FLOOR);
                                        jArr4[i21] = jM159395H;
                                        if (!jnr0Var4.f121900q) {
                                            jArr4[i21] = jM159395H + wmr0Var.f189827d.f127635h;
                                        }
                                        iArr[i21] = iM104280v6;
                                        zArr[i21] = 1 == (((i30 >> 16) & 1) ^ 1);
                                        j7 += (long) iM104280v5;
                                        i21++;
                                        i29 = i29;
                                        imr0Var2 = imr0Var2;
                                    }
                                    int i31 = i29;
                                    jnr0Var4.f121899p = j7;
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
                            hnr0 hnr0Var4 = wmr0Var.f189827d.f127628a;
                            imr0 imr0Var3 = jnr0Var2.f121884a;
                            imr0Var3.getClass();
                            inr0 inr0VarM136272a = hnr0Var4.m136272a(imr0Var3.f115826a);
                            ylr0 ylr0VarM211670d3 = xlr0Var2.m211670d(1935763834);
                            if (ylr0VarM211670d3 != null) {
                                inr0VarM136272a.getClass();
                                bgw0 bgw0Var7 = ylr0VarM211670d3.f200580b;
                                bgw0Var7.m104269k(8);
                                if ((bgw0Var7.m104280v() & 1) == 1) {
                                    bgw0Var7.m104270l(8);
                                }
                                int iM104245B = bgw0Var7.m104245B();
                                int iM104248E2 = bgw0Var7.m104248E();
                                int i32 = jnr0Var2.f121888e;
                                if (iM104248E2 > i32) {
                                    throw zzcc.zza("Saiz sample count " + iM104248E2 + " is greater than fragment sample count" + i32, null);
                                }
                                int i33 = inr0VarM136272a.f115996d;
                                if (iM104245B == 0) {
                                    boolean[] zArr2 = jnr0Var2.f121895l;
                                    i5 = 0;
                                    for (int i34 = 0; i34 < iM104248E2; i34++) {
                                        int iM104245B2 = bgw0Var7.m104245B();
                                        i5 += iM104245B2;
                                        zArr2[i34] = iM104245B2 > i33;
                                    }
                                    z = false;
                                } else {
                                    boolean z5 = iM104245B > i33;
                                    i5 = iM104245B * iM104248E2;
                                    z = false;
                                    Arrays.fill(jnr0Var2.f121895l, 0, iM104248E2, z5);
                                }
                                Arrays.fill(jnr0Var2.f121895l, iM104248E2, jnr0Var2.f121888e, z);
                                if (i5 > 0) {
                                    jnr0Var2.m146284a(i5);
                                }
                            }
                            ylr0 ylr0VarM211670d4 = xlr0Var2.m211670d(1935763823);
                            if (ylr0VarM211670d4 != null) {
                                bgw0 bgw0Var8 = ylr0VarM211670d4.f200580b;
                                bgw0Var8.m104269k(8);
                                int iM104280v7 = bgw0Var8.m104280v();
                                if ((iM104280v7 & 1) == 1) {
                                    bgw0Var8.m104270l(8);
                                }
                                int iM104248E3 = bgw0Var8.m104248E();
                                if (iM104248E3 != 1) {
                                    throw zzcc.zza("Unexpected saio entry count: " + iM104248E3, null);
                                }
                                jnr0Var2.f121886c += zlr0.m220300a(iM104280v7) == 0 ? bgw0Var8.m104253J() : bgw0Var8.m104254K();
                            }
                            ylr0 ylr0VarM211670d5 = xlr0Var2.m211670d(1936027235);
                            if (ylr0VarM211670d5 != null) {
                                m212065h(ylr0VarM211670d5.f200580b, 0, jnr0Var2);
                            }
                            String str = inr0VarM136272a != null ? inr0VarM136272a.f115994b : null;
                            bgw0 bgw0Var9 = null;
                            bgw0 bgw0Var10 = null;
                            for (int i35 = 0; i35 < xlr0Var2.f195014c.size(); i35++) {
                                ylr0 ylr0Var4 = (ylr0) xlr0Var2.f195014c.get(i35);
                                bgw0 bgw0Var11 = ylr0Var4.f200580b;
                                int i36 = ylr0Var4.f205002a;
                                if (i36 == 1935828848) {
                                    bgw0Var11.m104269k(12);
                                    if (bgw0Var11.m104280v() == 1936025959) {
                                        bgw0Var9 = bgw0Var11;
                                    }
                                } else if (i36 == 1936158820) {
                                    bgw0Var11.m104269k(12);
                                    if (bgw0Var11.m104280v() == 1936025959) {
                                        bgw0Var10 = bgw0Var11;
                                    }
                                }
                            }
                            if (bgw0Var9 != null && bgw0Var10 != null) {
                                bgw0Var9.m104269k(8);
                                int iM220300a = zlr0.m220300a(bgw0Var9.m104280v());
                                bgw0Var9.m104270l(4);
                                if (iM220300a == 1) {
                                    bgw0Var9.m104270l(4);
                                }
                                if (bgw0Var9.m104280v() != 1) {
                                    throw zzcc.zzc("Entry count in sbgp != 1 (unsupported).");
                                }
                                bgw0Var10.m104269k(8);
                                int iM220300a2 = zlr0.m220300a(bgw0Var10.m104280v());
                                bgw0Var10.m104270l(4);
                                if (iM220300a2 == 1) {
                                    if (bgw0Var10.m104253J() == 0) {
                                        throw zzcc.zzc("Variable length description in sgpd found (unsupported)");
                                    }
                                } else if (iM220300a2 >= 2) {
                                    bgw0Var10.m104270l(4);
                                }
                                if (bgw0Var10.m104253J() != 1) {
                                    throw zzcc.zzc("Entry count in sgpd != 1 (unsupported).");
                                }
                                bgw0Var10.m104270l(1);
                                int iM104245B3 = bgw0Var10.m104245B();
                                int i37 = (iM104245B3 & 240) >> 4;
                                int i38 = iM104245B3 & 15;
                                if (bgw0Var10.m104245B() == 1) {
                                    int iM104245B4 = bgw0Var10.m104245B();
                                    byte[] bArr3 = new byte[16];
                                    bgw0Var10.m104265g(bArr3, 0, 16);
                                    if (iM104245B4 == 0) {
                                        int iM104245B5 = bgw0Var10.m104245B();
                                        byte[] bArr4 = new byte[iM104245B5];
                                        bgw0Var10.m104265g(bArr4, 0, iM104245B5);
                                        bArr = bArr4;
                                    } else {
                                        bArr = null;
                                    }
                                    jnr0Var2.f121894k = true;
                                    jnr0Var2.f121896m = new inr0(true, str, iM104245B4, bArr3, i37, i38, bArr);
                                }
                            }
                            int size5 = xlr0Var2.f195014c.size();
                            for (int i39 = 0; i39 < size5; i39++) {
                                ylr0 ylr0Var5 = (ylr0) xlr0Var2.f195014c.get(i39);
                                if (ylr0Var5.f205002a == 1970628964) {
                                    bgw0 bgw0Var12 = ylr0Var5.f200580b;
                                    bgw0Var12.m104269k(8);
                                    bgw0Var12.m104265g(bArr2, 0, 16);
                                    if (Arrays.equals(bArr2, f195285G)) {
                                        m212065h(bgw0Var12, 16, jnr0Var2);
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
                zzae zzaeVarM212064b2 = m212064b(xlr0Var.f195014c);
                if (zzaeVarM212064b2 != null) {
                    int size6 = this.f195294c.size();
                    for (int i40 = 0; i40 < size6; i40++) {
                        wmr0 wmr0Var2 = (wmr0) this.f195294c.valueAt(i40);
                        hnr0 hnr0Var5 = wmr0Var2.f189827d.f127628a;
                        imr0 imr0Var4 = wmr0Var2.f189825b.f121884a;
                        int i41 = mpw0.f137957a;
                        inr0 inr0VarM136272a2 = hnr0Var5.m136272a(imr0Var4.f115826a);
                        zzae zzaeVarM13591b = zzaeVarM212064b2.m13591b(inr0VarM136272a2 != null ? inr0VarM136272a2.f115994b : null);
                        znr0 znr0VarM187559b = wmr0Var2.f189827d.f127628a.f110820f.m187559b();
                        znr0VarM187559b.m220650e(zzaeVarM13591b);
                        wmr0Var2.f189824a.mo99373d(znr0VarM187559b.m220645D());
                    }
                }
                if (this.f195311t != -9223372036854775807L) {
                    int size7 = this.f195294c.size();
                    for (int i42 = 0; i42 < size7; i42++) {
                        wmr0 wmr0Var3 = (wmr0) this.f195294c.valueAt(i42);
                        long j8 = this.f195311t;
                        int i43 = wmr0Var3.f189829f;
                        while (true) {
                            jnr0 jnr0Var5 = wmr0Var3.f189825b;
                            if (i43 >= jnr0Var5.f121888e || jnr0Var5.f121892i[i43] > j8) {
                                break;
                            }
                            if (jnr0Var5.f121893j[i43]) {
                                wmr0Var3.f189832i = i43;
                            }
                            i43++;
                        }
                    }
                    this.f195311t = -9223372036854775807L;
                }
            } else if (!this.f195302k.isEmpty()) {
                ((xlr0) this.f195302k.peek()).m211671e(xlr0Var);
            }
        }
        m212067g();
    }

    @Deprecated
    public xmr0() {
        this(vor0.f185158a, 32, null, null, zzgaa.zzl(), null);
    }
}
