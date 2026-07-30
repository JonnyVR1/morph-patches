package p149l;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzgaa;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class z7r0 implements j5r0 {

    /* JADX INFO: renamed from: c */
    public int f202058c;

    /* JADX INFO: renamed from: e */
    public a8r0 f202060e;

    /* JADX INFO: renamed from: h */
    public long f202063h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public c8r0 f202064i;

    /* JADX INFO: renamed from: m */
    public int f202068m;

    /* JADX INFO: renamed from: n */
    public boolean f202069n;

    /* JADX INFO: renamed from: a */
    public final v6w0 f202056a = new v6w0(12);

    /* JADX INFO: renamed from: b */
    public final y7r0 f202057b = new y7r0(null);

    /* JADX INFO: renamed from: d */
    public m5r0 f202059d = new h5r0();

    /* JADX INFO: renamed from: g */
    public c8r0[] f202062g = new c8r0[0];

    /* JADX INFO: renamed from: k */
    public long f202066k = -1;

    /* JADX INFO: renamed from: l */
    public long f202067l = -1;

    /* JADX INFO: renamed from: j */
    public int f202065j = -1;

    /* JADX INFO: renamed from: f */
    public long f202061f = -9223372036854775807L;

    @Nullable
    /* JADX INFO: renamed from: b */
    public final c8r0 m217493b(int i) {
        for (c8r0 c8r0Var : this.f202062g) {
            if (c8r0Var.m105808g(i)) {
                return c8r0Var;
            }
        }
        return null;
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: c */
    public final void mo100820c(long j, long j2) {
        this.f202063h = -1L;
        this.f202064i = null;
        for (c8r0 c8r0Var : this.f202062g) {
            c8r0Var.m105807f(j);
        }
        if (j == 0) {
            this.f202058c = this.f202062g.length != 0 ? 3 : 0;
        } else {
            this.f202058c = 6;
        }
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: d */
    public final boolean mo100821d(k5r0 k5r0Var) throws IOException {
        ((z4r0) k5r0Var).mo140051c(this.f202056a.m197264m(), 0, 12, false);
        this.f202056a.m197262k(0);
        if (this.f202056a.m197275x() != 1179011410) {
            return false;
        }
        this.f202056a.m197263l(4);
        return this.f202056a.m197275x() == 541677121;
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: e */
    public final void mo100822e(m5r0 m5r0Var) {
        this.f202058c = 0;
        this.f202059d = m5r0Var;
        this.f202063h = -1L;
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0300  */
    @Override // p149l.j5r0
    /* JADX INFO: renamed from: f */
    public final int mo100823f(k5r0 k5r0Var, s6r0 s6r0Var) throws IOException {
        boolean z;
        int i;
        int i2;
        c8r0 c8r0Var;
        long j = this.f202063h;
        int i3 = 0;
        if (j != -1) {
            long jZzf = k5r0Var.zzf();
            if (j < jZzf || j > PlaybackStateCompat.ACTION_SET_REPEAT_MODE + jZzf) {
                s6r0Var.f162847a = j;
                z = true;
            } else {
                ((z4r0) k5r0Var).m217119k((int) (j - jZzf), false);
                z = false;
            }
        } else {
            z = false;
        }
        this.f202063h = -1L;
        if (z) {
            return 1;
        }
        int i4 = this.f202058c;
        c8r0 c8r0Var2 = null;
        if (i4 == 0) {
            if (!mo100821d(k5r0Var)) {
                throw zzcc.zza("AVI Header List not found", null);
            }
            ((z4r0) k5r0Var).m217119k(12, false);
            this.f202058c = 1;
            return 0;
        }
        if (i4 == 1) {
            ((z4r0) k5r0Var).mo140050b(this.f202056a.m197264m(), 0, 12, false);
            this.f202056a.m197262k(0);
            y7r0 y7r0Var = this.f202057b;
            v6w0 v6w0Var = this.f202056a;
            y7r0Var.m213318a(v6w0Var);
            int i5 = y7r0Var.f196725a;
            if (i5 != 1414744396) {
                throw zzcc.zza("LIST expected, found: " + i5, null);
            }
            y7r0Var.f196727c = v6w0Var.m197275x();
            y7r0 y7r0Var2 = this.f202057b;
            int i6 = y7r0Var2.f196727c;
            if (i6 == 1819436136) {
                this.f202065j = y7r0Var2.f196726b;
                this.f202058c = 2;
                return 0;
            }
            throw zzcc.zza("hdrl expected, found: " + i6, null);
        }
        if (i4 == 2) {
            int i7 = this.f202065j - 4;
            v6w0 v6w0Var2 = new v6w0(i7);
            ((z4r0) k5r0Var).mo140050b(v6w0Var2.m197264m(), 0, i7, false);
            d8r0 d8r0VarM110338b = d8r0.m110338b(1819436136, v6w0Var2);
            if (d8r0VarM110338b.zza() != 1819436136) {
                throw zzcc.zza("Unexpected header list type " + d8r0VarM110338b.zza(), null);
            }
            a8r0 a8r0Var = (a8r0) d8r0VarM110338b.m110339a(a8r0.class);
            if (a8r0Var == null) {
                throw zzcc.zza("AviHeader not found", null);
            }
            this.f202060e = a8r0Var;
            this.f202061f = ((long) a8r0Var.f68070c) * ((long) a8r0Var.f68068a);
            ArrayList arrayList = new ArrayList();
            zzgaa zzgaaVar = d8r0VarM110338b.f84890a;
            int size = zzgaaVar.size();
            int i8 = 0;
            int i9 = 0;
            while (i8 < size) {
                v7r0 v7r0Var = (v7r0) zzgaaVar.get(i8);
                if (v7r0Var.zza() == 1819440243) {
                    d8r0 d8r0Var = (d8r0) v7r0Var;
                    int i10 = i9 + 1;
                    b8r0 b8r0Var = (b8r0) d8r0Var.m110339a(b8r0.class);
                    e8r0 e8r0Var = (e8r0) d8r0Var.m110339a(e8r0.class);
                    if (b8r0Var == null) {
                        svv0.m186111f("AviExtractor", "Missing Stream Header");
                    } else {
                        if (e8r0Var == null) {
                            svv0.m186111f("AviExtractor", "Missing Stream Format");
                        } else {
                            i = i10;
                            long jM126051H = ggw0.m126051H(b8r0Var.f74156d, ((long) b8r0Var.f74154b) * 1000000, b8r0Var.f74155c, RoundingMode.FLOOR);
                            mhr0 mhr0Var = e8r0Var.f89858a;
                            ter0 ter0VarM154634b = mhr0Var.m154634b();
                            ter0VarM154634b.m188602j(i9);
                            int i11 = b8r0Var.f74157e;
                            if (i11 != 0) {
                                ter0VarM154634b.m188610o(i11);
                            }
                            f8r0 f8r0Var = (f8r0) d8r0Var.m110339a(f8r0.class);
                            if (f8r0Var != null) {
                                ter0VarM154634b.m188608m(f8r0Var.f96399a);
                            }
                            int iM196365b = uys0.m196365b(mhr0Var.f133892l);
                            if (iM196365b == 1) {
                                i2 = iM196365b;
                            } else if (iM196365b == 2) {
                                i2 = 2;
                            } else {
                                c8r0Var = null;
                            }
                            m7r0 m7r0VarMo129454i = this.f202059d.mo129454i(i9, i2);
                            m7r0VarMo129454i.mo134531d(ter0VarM154634b.m188591D());
                            c8r0Var = new c8r0(i9, i2, jM126051H, b8r0Var.f74156d, m7r0VarMo129454i);
                            this.f202061f = jM126051H;
                        }
                        if (c8r0Var != null) {
                            arrayList.add(c8r0Var);
                        }
                        i9 = i;
                    }
                    c8r0Var = c8r0Var2;
                    i = i10;
                    if (c8r0Var != null) {
                        arrayList.add(c8r0Var);
                    }
                    i9 = i;
                }
                i8++;
                c8r0Var2 = null;
                i3 = 0;
            }
            int i12 = i3;
            this.f202062g = (c8r0[]) arrayList.toArray(new c8r0[i12]);
            this.f202059d.mo129453c();
            this.f202058c = 3;
            return i12;
        }
        long j2 = 0;
        if (i4 == 3) {
            long j3 = this.f202066k;
            if (j3 != -1 && k5r0Var.zzf() != j3) {
                this.f202063h = j3;
                return 0;
            }
            ((z4r0) k5r0Var).mo140051c(this.f202056a.m197264m(), 0, 12, false);
            k5r0Var.zzj();
            this.f202056a.m197262k(0);
            this.f202057b.m213318a(this.f202056a);
            v6w0 v6w0Var3 = this.f202056a;
            y7r0 y7r0Var3 = this.f202057b;
            int iM197275x = v6w0Var3.m197275x();
            int i13 = y7r0Var3.f196725a;
            if (i13 == 1179011410) {
                ((z4r0) k5r0Var).m217119k(12, false);
                return 0;
            }
            if (i13 != 1414744396 || iM197275x != 1769369453) {
                this.f202063h = k5r0Var.zzf() + ((long) y7r0Var3.f196726b) + 8;
                return 0;
            }
            long jZzf2 = k5r0Var.zzf();
            this.f202066k = jZzf2;
            long j4 = jZzf2 + ((long) y7r0Var3.f196726b) + 8;
            this.f202067l = j4;
            if (!this.f202069n) {
                a8r0 a8r0Var2 = this.f202060e;
                a8r0Var2.getClass();
                if ((a8r0Var2.f68069b & 16) == 16) {
                    this.f202058c = 4;
                    this.f202063h = j4;
                    return 0;
                }
                this.f202059d.mo129455j(new u6r0(this.f202061f, 0L));
                this.f202069n = true;
            }
            this.f202063h = k5r0Var.zzf() + 12;
            this.f202058c = 6;
            return 0;
        }
        if (i4 == 4) {
            ((z4r0) k5r0Var).mo140050b(this.f202056a.m197264m(), 0, 8, false);
            this.f202056a.m197262k(0);
            v6w0 v6w0Var4 = this.f202056a;
            int iM197275x2 = v6w0Var4.m197275x();
            int iM197275x3 = v6w0Var4.m197275x();
            if (iM197275x2 == 829973609) {
                this.f202058c = 5;
                this.f202068m = iM197275x3;
            } else {
                this.f202063h = k5r0Var.zzf() + ((long) iM197275x3);
            }
            return 0;
        }
        if (i4 == 5) {
            v6w0 v6w0Var5 = new v6w0(this.f202068m);
            ((z4r0) k5r0Var).mo140050b(v6w0Var5.m197264m(), 0, this.f202068m, false);
            if (v6w0Var5.m197268q() >= 16) {
                int iM197270s = v6w0Var5.m197270s();
                v6w0Var5.m197263l(8);
                long jM197275x = v6w0Var5.m197275x();
                long j5 = this.f202066k;
                j2 = jM197275x <= j5 ? j5 + 8 : 0L;
                v6w0Var5.m197262k(iM197270s);
            }
            while (v6w0Var5.m197268q() >= 16) {
                int iM197275x4 = v6w0Var5.m197275x();
                int iM197275x5 = v6w0Var5.m197275x();
                long jM197275x2 = ((long) v6w0Var5.m197275x()) + j2;
                v6w0Var5.m197275x();
                c8r0 c8r0VarM217493b = m217493b(iM197275x4);
                if (c8r0VarM217493b != null) {
                    if ((iM197275x5 & 16) == 16) {
                        c8r0VarM217493b.m105803b(jM197275x2);
                    }
                    c8r0VarM217493b.m105805d();
                }
            }
            for (c8r0 c8r0Var3 : this.f202062g) {
                c8r0Var3.m105804c();
            }
            this.f202069n = true;
            this.f202059d.mo129455j(new w7r0(this, this.f202061f));
            this.f202058c = 6;
            this.f202063h = this.f202066k;
            return 0;
        }
        if (k5r0Var.zzf() >= this.f202067l) {
            return -1;
        }
        c8r0 c8r0Var4 = this.f202064i;
        if (c8r0Var4 != null) {
            if (!c8r0Var4.m105809h(k5r0Var)) {
                return 0;
            }
            this.f202064i = null;
            return 0;
        }
        if ((k5r0Var.zzf() & 1) == 1) {
            ((z4r0) k5r0Var).m217119k(1, false);
        }
        z4r0 z4r0Var = (z4r0) k5r0Var;
        z4r0Var.mo140051c(this.f202056a.m197264m(), 0, 12, false);
        this.f202056a.m197262k(0);
        int iM197275x6 = this.f202056a.m197275x();
        v6w0 v6w0Var6 = this.f202056a;
        if (iM197275x6 == 1414744396) {
            v6w0Var6.m197262k(8);
            z4r0Var.m217119k(this.f202056a.m197275x() != 1769369453 ? 8 : 12, false);
            k5r0Var.zzj();
            return 0;
        }
        int iM197275x7 = v6w0Var6.m197275x();
        if (iM197275x6 == 1263424842) {
            this.f202063h = k5r0Var.zzf() + ((long) iM197275x7) + 8;
            return 0;
        }
        z4r0Var.m217119k(8, false);
        k5r0Var.zzj();
        c8r0 c8r0VarM217493b2 = m217493b(iM197275x6);
        if (c8r0VarM217493b2 == null) {
            this.f202063h = k5r0Var.zzf() + ((long) iM197275x7);
            return 0;
        }
        c8r0VarM217493b2.m105806e(iM197275x7);
        this.f202064i = c8r0VarM217493b2;
        return 0;
    }
}
