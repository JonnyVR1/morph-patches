package p149l;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzaga;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class qry0 implements rxy0, tpy0 {

    /* JADX INFO: renamed from: b */
    public final Uri f156061b;

    /* JADX INFO: renamed from: c */
    public final rjx0 f156062c;

    /* JADX INFO: renamed from: d */
    public final kry0 f156063d;

    /* JADX INFO: renamed from: e */
    public final m5r0 f156064e;

    /* JADX INFO: renamed from: f */
    public final v9v0 f156065f;

    /* JADX INFO: renamed from: h */
    public volatile boolean f156067h;

    /* JADX INFO: renamed from: j */
    public long f156069j;

    /* JADX INFO: renamed from: l */
    @Nullable
    public m7r0 f156071l;

    /* JADX INFO: renamed from: m */
    public boolean f156072m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ vry0 f156073n;

    /* JADX INFO: renamed from: g */
    public final s6r0 f156066g = new s6r0();

    /* JADX INFO: renamed from: i */
    public boolean f156068i = true;

    /* JADX INFO: renamed from: a */
    public final long f156060a = vpy0.m199391a();

    /* JADX INFO: renamed from: k */
    public uax0 f156070k = m176140g(0);

    public qry0(vry0 vry0Var, Uri uri, z4x0 z4x0Var, kry0 kry0Var, m5r0 m5r0Var, v9v0 v9v0Var) {
        this.f156073n = vry0Var;
        this.f156061b = uri;
        this.f156062c = new rjx0(z4x0Var);
        this.f156063d = kry0Var;
        this.f156064e = m5r0Var;
        this.f156065f = v9v0Var;
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ void m176138f(qry0 qry0Var, long j, long j2) {
        qry0Var.f156066g.f162847a = j;
        qry0Var.f156069j = j2;
        qry0Var.f156068i = true;
        qry0Var.f156072m = false;
    }

    @Override // p149l.tpy0
    /* JADX INFO: renamed from: b */
    public final void mo176139b(v6w0 v6w0Var) {
        long jMax = !this.f156072m ? this.f156069j : Math.max(vry0.m199760M(this.f156073n, true), this.f156069j);
        int iM197268q = v6w0Var.m197268q();
        m7r0 m7r0Var = this.f156071l;
        m7r0Var.getClass();
        z6r0.m217416b(m7r0Var, v6w0Var, iM197268q);
        m7r0Var.mo134530c(jMax, 1, iM197268q, 0, null);
        this.f156072m = true;
    }

    /* JADX INFO: renamed from: g */
    public final uax0 m176140g(long j) {
        y7x0 y7x0Var = new y7x0();
        y7x0Var.m213340d(this.f156061b);
        y7x0Var.m213339c(j);
        y7x0Var.m213337a(6);
        y7x0Var.m213338b(vry0.f182753M);
        return y7x0Var.m213341e();
    }

    @Override // p149l.rxy0
    public final void zzg() {
        this.f156067h = true;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x011d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x01aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x01a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x021e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:? A[LOOP:0: B:3:0x0004->B:128:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x01c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00af A[Catch: all -> 0x008c, TryCatch #7 {all -> 0x008c, blocks: (B:37:0x00a4, B:39:0x00af, B:41:0x00bb, B:43:0x00c5, B:45:0x00d1, B:47:0x00db, B:49:0x00e7, B:51:0x00f1, B:53:0x0103, B:55:0x010d, B:56:0x0113, B:65:0x0141, B:66:0x0148, B:68:0x0155, B:70:0x015d, B:72:0x017a, B:74:0x0191, B:75:0x0196, B:77:0x019a, B:60:0x011d, B:63:0x0133, B:30:0x0074, B:35:0x0092), top: B:123:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c5 A[Catch: all -> 0x008c, TryCatch #7 {all -> 0x008c, blocks: (B:37:0x00a4, B:39:0x00af, B:41:0x00bb, B:43:0x00c5, B:45:0x00d1, B:47:0x00db, B:49:0x00e7, B:51:0x00f1, B:53:0x0103, B:55:0x010d, B:56:0x0113, B:65:0x0141, B:66:0x0148, B:68:0x0155, B:70:0x015d, B:72:0x017a, B:74:0x0191, B:75:0x0196, B:77:0x019a, B:60:0x011d, B:63:0x0133, B:30:0x0074, B:35:0x0092), top: B:123:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:47:0x00db A[Catch: all -> 0x008c, TryCatch #7 {all -> 0x008c, blocks: (B:37:0x00a4, B:39:0x00af, B:41:0x00bb, B:43:0x00c5, B:45:0x00d1, B:47:0x00db, B:49:0x00e7, B:51:0x00f1, B:53:0x0103, B:55:0x010d, B:56:0x0113, B:65:0x0141, B:66:0x0148, B:68:0x0155, B:70:0x015d, B:72:0x017a, B:74:0x0191, B:75:0x0196, B:77:0x019a, B:60:0x011d, B:63:0x0133, B:30:0x0074, B:35:0x0092), top: B:123:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f1 A[Catch: all -> 0x008c, TryCatch #7 {all -> 0x008c, blocks: (B:37:0x00a4, B:39:0x00af, B:41:0x00bb, B:43:0x00c5, B:45:0x00d1, B:47:0x00db, B:49:0x00e7, B:51:0x00f1, B:53:0x0103, B:55:0x010d, B:56:0x0113, B:65:0x0141, B:66:0x0148, B:68:0x0155, B:70:0x015d, B:72:0x017a, B:74:0x0191, B:75:0x0196, B:77:0x019a, B:60:0x011d, B:63:0x0133, B:30:0x0074, B:35:0x0092), top: B:123:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0101  */
    /* JADX WARN: Code duplicated, block: B:55:0x010d A[Catch: all -> 0x008c, TRY_LEAVE, TryCatch #7 {all -> 0x008c, blocks: (B:37:0x00a4, B:39:0x00af, B:41:0x00bb, B:43:0x00c5, B:45:0x00d1, B:47:0x00db, B:49:0x00e7, B:51:0x00f1, B:53:0x0103, B:55:0x010d, B:56:0x0113, B:65:0x0141, B:66:0x0148, B:68:0x0155, B:70:0x015d, B:72:0x017a, B:74:0x0191, B:75:0x0196, B:77:0x019a, B:60:0x011d, B:63:0x0133, B:30:0x0074, B:35:0x0092), top: B:123:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0119  */
    /* JADX WARN: Code duplicated, block: B:61:0x012f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0141 A[Catch: all -> 0x008c, TryCatch #7 {all -> 0x008c, blocks: (B:37:0x00a4, B:39:0x00af, B:41:0x00bb, B:43:0x00c5, B:45:0x00d1, B:47:0x00db, B:49:0x00e7, B:51:0x00f1, B:53:0x0103, B:55:0x010d, B:56:0x0113, B:65:0x0141, B:66:0x0148, B:68:0x0155, B:70:0x015d, B:72:0x017a, B:74:0x0191, B:75:0x0196, B:77:0x019a, B:60:0x011d, B:63:0x0133, B:30:0x0074, B:35:0x0092), top: B:123:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0179  */
    /* JADX WARN: Code duplicated, block: B:74:0x0191 A[Catch: all -> 0x008c, TryCatch #7 {all -> 0x008c, blocks: (B:37:0x00a4, B:39:0x00af, B:41:0x00bb, B:43:0x00c5, B:45:0x00d1, B:47:0x00db, B:49:0x00e7, B:51:0x00f1, B:53:0x0103, B:55:0x010d, B:56:0x0113, B:65:0x0141, B:66:0x0148, B:68:0x0155, B:70:0x015d, B:72:0x017a, B:74:0x0191, B:75:0x0196, B:77:0x019a, B:60:0x011d, B:63:0x0133, B:30:0x0074, B:35:0x0092), top: B:123:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x019a A[Catch: all -> 0x008c, TRY_LEAVE, TryCatch #7 {all -> 0x008c, blocks: (B:37:0x00a4, B:39:0x00af, B:41:0x00bb, B:43:0x00c5, B:45:0x00d1, B:47:0x00db, B:49:0x00e7, B:51:0x00f1, B:53:0x0103, B:55:0x010d, B:56:0x0113, B:65:0x0141, B:66:0x0148, B:68:0x0155, B:70:0x015d, B:72:0x017a, B:74:0x0191, B:75:0x0196, B:77:0x019a, B:60:0x011d, B:63:0x0133, B:30:0x0074, B:35:0x0092), top: B:123:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f3  */
    @Override // p149l.rxy0
    public final void zzh() throws Throwable {
        long j;
        boolean z;
        int i;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean zEquals;
        List list5;
        int i2;
        rjx0 rjx0Var;
        vry0 vry0Var;
        hpy0 hpy0Var;
        int iMo147033b;
        kry0 kry0Var;
        long jZzb;
        String str4;
        int i3;
        int i4;
        while (!this.f156067h) {
            int i5 = 0;
            try {
                long j2 = this.f156066g.f162847a;
                uax0 uax0VarM176140g = m176140g(j2);
                this.f156070k = uax0VarM176140g;
                long jMo12728e = this.f156062c.mo12728e(uax0VarM176140g);
                if (this.f156067h) {
                    kry0 kry0Var2 = this.f156063d;
                    if (kry0Var2.zzb() != -1) {
                        this.f156066g.f162847a = kry0Var2.zzb();
                    }
                    c7x0.m105645a(this.f156062c);
                    return;
                }
                if (jMo12728e != -1) {
                    jMo12728e += j2;
                    vry0.m199768q(this.f156073n);
                }
                long j3 = jMo12728e;
                vry0 vry0Var2 = this.f156073n;
                Map mapZze = this.f156062c.zze();
                List list6 = (List) mapZze.get("icy-br");
                try {
                    if (list6 != null) {
                        String str5 = (String) list6.get(0);
                        try {
                            i4 = Integer.parseInt(str5) * 1000;
                            if (i4 > 0) {
                                j = -1;
                                z = true;
                                i = i4;
                                list = (List) mapZze.get("icy-genre");
                                if (list != null) {
                                    str = (String) list.get(0);
                                    z = true;
                                } else {
                                    str = null;
                                }
                                list2 = (List) mapZze.get("icy-name");
                                if (list2 != null) {
                                    str2 = (String) list2.get(0);
                                    z = true;
                                } else {
                                    str2 = null;
                                }
                                list3 = (List) mapZze.get("icy-url");
                                if (list3 != null) {
                                    str3 = (String) list3.get(0);
                                    z = true;
                                } else {
                                    str3 = null;
                                }
                                list4 = (List) mapZze.get("icy-pub");
                                if (list4 != null) {
                                    zEquals = ((String) list4.get(0)).equals("1");
                                    z = true;
                                } else {
                                    zEquals = false;
                                }
                                list5 = (List) mapZze.get("icy-metaint");
                                if (list5 != null) {
                                    str4 = (String) list5.get(0);
                                    try {
                                        i3 = Integer.parseInt(str4);
                                        if (i3 > 0) {
                                            z = true;
                                            i2 = i3;
                                        } else {
                                            try {
                                                svv0.m186111f("IcyHeaders", "Invalid metadata interval: " + str4);
                                                i2 = -1;
                                            } catch (NumberFormatException unused) {
                                                svv0.m186111f("IcyHeaders", "Invalid metadata interval: ".concat(String.valueOf(str4)));
                                                i2 = i3;
                                            }
                                        }
                                    } catch (NumberFormatException unused2) {
                                        i3 = -1;
                                    }
                                } else {
                                    i2 = -1;
                                }
                                vry0Var2.f182782p = z ? new zzaga(i, str, str2, str3, zEquals, i2) : null;
                                rjx0Var = this.f156062c;
                                vry0Var = this.f156073n;
                                if (vry0Var.f182782p != null || vry0Var.f182782p.zzf == -1) {
                                    hpy0Var = rjx0Var;
                                } else {
                                    upy0 upy0Var = new upy0(rjx0Var, vry0Var.f182782p.zzf, this);
                                    m7r0 m7r0VarM199779P = this.f156073n.m199779P();
                                    this.f156071l = m7r0VarM199779P;
                                    m7r0VarM199779P.mo134531d(vry0.f182754N);
                                    hpy0Var = upy0Var;
                                }
                                this.f156063d.mo147034c(hpy0Var, this.f156061b, this.f156062c.zze(), j2, j3, this.f156064e);
                                if (this.f156073n.f182782p != null) {
                                    this.f156063d.zzc();
                                }
                                if (this.f156068i) {
                                    this.f156063d.mo147032a(j2, this.f156069j);
                                    this.f156068i = false;
                                }
                                iMo147033b = 0;
                                while (iMo147033b == 0) {
                                    try {
                                        if (!this.f156067h) {
                                            iMo147033b = 0;
                                            break;
                                        }
                                        try {
                                            this.f156065f.m197601a();
                                            iMo147033b = this.f156063d.mo147033b(this.f156066g);
                                            jZzb = this.f156063d.zzb();
                                            if (jZzb > this.f156073n.f182773g + j2) {
                                                this.f156065f.m197603c();
                                                vry0 vry0Var3 = this.f156073n;
                                                vry0Var3.f182779m.post(vry0Var3.f182778l);
                                                j2 = jZzb;
                                            }
                                        } catch (InterruptedException unused3) {
                                            throw new InterruptedIOException();
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        i5 = iMo147033b;
                                        if (i5 != 1) {
                                            kry0 kry0Var3 = this.f156063d;
                                            if (kry0Var3.zzb() != j) {
                                                this.f156066g.f162847a = kry0Var3.zzb();
                                            }
                                        }
                                        c7x0.m105645a(this.f156062c);
                                        throw th;
                                    }
                                }
                                if (iMo147033b != 1) {
                                    kry0Var = this.f156063d;
                                    if (kry0Var.zzb() != j) {
                                        this.f156066g.f162847a = kry0Var.zzb();
                                    }
                                    i5 = iMo147033b;
                                }
                                c7x0.m105645a(this.f156062c);
                                if (i5 != 0) {
                                    return;
                                }
                            } else {
                                j = -1;
                                try {
                                    svv0.m186111f("IcyHeaders", "Invalid bitrate: " + str5);
                                } catch (NumberFormatException unused4) {
                                    svv0.m186111f("IcyHeaders", "Invalid bitrate header: ".concat(String.valueOf(str5)));
                                    z = false;
                                    i = i4;
                                }
                            }
                        } catch (NumberFormatException unused5) {
                            j = -1;
                            i4 = -1;
                        }
                    } else {
                        j = -1;
                    }
                    list = (List) mapZze.get("icy-genre");
                    if (list != null) {
                        str = (String) list.get(0);
                        z = true;
                    } else {
                        str = null;
                    }
                    list2 = (List) mapZze.get("icy-name");
                    if (list2 != null) {
                        str2 = (String) list2.get(0);
                        z = true;
                    } else {
                        str2 = null;
                    }
                    list3 = (List) mapZze.get("icy-url");
                    if (list3 != null) {
                        str3 = (String) list3.get(0);
                        z = true;
                    } else {
                        str3 = null;
                    }
                    list4 = (List) mapZze.get("icy-pub");
                    if (list4 != null) {
                        zEquals = ((String) list4.get(0)).equals("1");
                        z = true;
                    } else {
                        zEquals = false;
                    }
                    list5 = (List) mapZze.get("icy-metaint");
                    if (list5 != null) {
                        str4 = (String) list5.get(0);
                        i3 = Integer.parseInt(str4);
                        if (i3 > 0) {
                            z = true;
                            i2 = i3;
                        } else {
                            svv0.m186111f("IcyHeaders", "Invalid metadata interval: " + str4);
                            i2 = -1;
                        }
                    } else {
                        i2 = -1;
                    }
                    vry0Var2.f182782p = z ? new zzaga(i, str, str2, str3, zEquals, i2) : null;
                    rjx0Var = this.f156062c;
                    vry0Var = this.f156073n;
                    if (vry0Var.f182782p != null) {
                        hpy0Var = rjx0Var;
                    } else {
                        hpy0Var = rjx0Var;
                    }
                    this.f156063d.mo147034c(hpy0Var, this.f156061b, this.f156062c.zze(), j2, j3, this.f156064e);
                    if (this.f156073n.f182782p != null) {
                        this.f156063d.zzc();
                    }
                    if (this.f156068i) {
                        this.f156063d.mo147032a(j2, this.f156069j);
                        this.f156068i = false;
                    }
                    iMo147033b = 0;
                    while (iMo147033b == 0) {
                        if (!this.f156067h) {
                            iMo147033b = 0;
                            break;
                        }
                        this.f156065f.m197601a();
                        iMo147033b = this.f156063d.mo147033b(this.f156066g);
                        jZzb = this.f156063d.zzb();
                        if (jZzb > this.f156073n.f182773g + j2) {
                            this.f156065f.m197603c();
                            vry0 vry0Var4 = this.f156073n;
                            vry0Var4.f182779m.post(vry0Var4.f182778l);
                            j2 = jZzb;
                        }
                    }
                    if (iMo147033b != 1) {
                        kry0Var = this.f156063d;
                        if (kry0Var.zzb() != j) {
                            this.f156066g.f162847a = kry0Var.zzb();
                        }
                        i5 = iMo147033b;
                    }
                    c7x0.m105645a(this.f156062c);
                    if (i5 != 0) {
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                z = false;
                i = -1;
            } catch (Throwable th3) {
                th = th3;
                j = -1;
            }
        }
    }
}
