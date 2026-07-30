package p153l;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzaga;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class w0z0 implements x6z0, zyy0 {

    /* JADX INFO: renamed from: b */
    public final Uri f186741b;

    /* JADX INFO: renamed from: c */
    public final xsx0 f186742c;

    /* JADX INFO: renamed from: d */
    public final q0z0 f186743d;

    /* JADX INFO: renamed from: e */
    public final ser0 f186744e;

    /* JADX INFO: renamed from: f */
    public final bjv0 f186745f;

    /* JADX INFO: renamed from: h */
    public volatile boolean f186747h;

    /* JADX INFO: renamed from: j */
    public long f186749j;

    /* JADX INFO: renamed from: l */
    @Nullable
    public sgr0 f186751l;

    /* JADX INFO: renamed from: m */
    public boolean f186752m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ b1z0 f186753n;

    /* JADX INFO: renamed from: g */
    public final yfr0 f186746g = new yfr0();

    /* JADX INFO: renamed from: i */
    public boolean f186748i = true;

    /* JADX INFO: renamed from: a */
    public final long f186740a = bzy0.m107273a();

    /* JADX INFO: renamed from: k */
    public akx0 f186750k = m204363g(0);

    public w0z0(b1z0 b1z0Var, Uri uri, fex0 fex0Var, q0z0 q0z0Var, ser0 ser0Var, bjv0 bjv0Var) {
        this.f186753n = b1z0Var;
        this.f186741b = uri;
        this.f186742c = new xsx0(fex0Var);
        this.f186743d = q0z0Var;
        this.f186744e = ser0Var;
        this.f186745f = bjv0Var;
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ void m204361f(w0z0 w0z0Var, long j, long j2) {
        w0z0Var.f186746g.f199649a = j;
        w0z0Var.f186749j = j2;
        w0z0Var.f186748i = true;
        w0z0Var.f186752m = false;
    }

    @Override // p153l.zyy0
    /* JADX INFO: renamed from: b */
    public final void mo204362b(bgw0 bgw0Var) {
        long jMax = !this.f186752m ? this.f186749j : Math.max(b1z0.m101522M(this.f186753n, true), this.f186749j);
        int iM104275q = bgw0Var.m104275q();
        sgr0 sgr0Var = this.f186751l;
        sgr0Var.getClass();
        fgr0.m125515b(sgr0Var, bgw0Var, iM104275q);
        sgr0Var.mo99372c(jMax, 1, iM104275q, 0, null);
        this.f186752m = true;
    }

    /* JADX INFO: renamed from: g */
    public final akx0 m204363g(long j) {
        ehx0 ehx0Var = new ehx0();
        ehx0Var.m120876d(this.f186741b);
        ehx0Var.m120875c(j);
        ehx0Var.m120873a(6);
        ehx0Var.m120874b(b1z0.f74407M);
        return ehx0Var.m120877e();
    }

    @Override // p153l.x6z0
    public final void zzg() {
        this.f186747h = true;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x01dc */
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
    @Override // p153l.x6z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh() throws Throwable {
        int i;
        long j;
        boolean z;
        int i2;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean zEquals;
        List list5;
        int i3;
        xsx0 xsx0Var;
        b1z0 b1z0Var;
        nyy0 nyy0Var;
        int iMo174798b;
        q0z0 q0z0Var;
        long jZzb;
        String str4;
        int i4;
        int i5;
        while (!this.f186747h) {
            i = 0;
            try {
                long j2 = this.f186746g.f199649a;
                akx0 akx0VarM204363g = m204363g(j2);
                this.f186750k = akx0VarM204363g;
                long jMo12782e = this.f186742c.mo12782e(akx0VarM204363g);
                if (this.f186747h) {
                    q0z0 q0z0Var2 = this.f186743d;
                    if (q0z0Var2.zzb() != -1) {
                        this.f186746g.f199649a = q0z0Var2.zzb();
                    }
                    igx0.m139963a(this.f186742c);
                    return;
                }
                if (jMo12782e != -1) {
                    jMo12782e += j2;
                    b1z0.m101530q(this.f186753n);
                }
                long j3 = jMo12782e;
                b1z0 b1z0Var2 = this.f186753n;
                Map mapZze = this.f186742c.zze();
                List list6 = (List) mapZze.get("icy-br");
                try {
                    if (list6 != null) {
                        String str5 = (String) list6.get(0);
                        try {
                            i5 = Integer.parseInt(str5) * 1000;
                            if (i5 > 0) {
                                j = -1;
                                z = true;
                                i2 = i5;
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
                                        i4 = Integer.parseInt(str4);
                                        if (i4 > 0) {
                                            z = true;
                                            i3 = i4;
                                        } else {
                                            try {
                                                y4w0.m214278f("IcyHeaders", "Invalid metadata interval: " + str4);
                                                i3 = -1;
                                            } catch (NumberFormatException unused) {
                                                y4w0.m214278f("IcyHeaders", "Invalid metadata interval: ".concat(String.valueOf(str4)));
                                                i3 = i4;
                                            }
                                        }
                                    } catch (NumberFormatException unused2) {
                                        i4 = -1;
                                    }
                                } else {
                                    i3 = -1;
                                }
                                b1z0Var2.f74436p = z ? new zzaga(i2, str, str2, str3, zEquals, i3) : null;
                                xsx0Var = this.f186742c;
                                b1z0Var = this.f186753n;
                                if (b1z0Var.f74436p != null || b1z0Var.f74436p.zzf == -1) {
                                    nyy0Var = xsx0Var;
                                } else {
                                    azy0 azy0Var = new azy0(xsx0Var, b1z0Var.f74436p.zzf, this);
                                    sgr0 sgr0VarM101541P = this.f186753n.m101541P();
                                    this.f186751l = sgr0VarM101541P;
                                    sgr0VarM101541P.mo99373d(b1z0.f74408N);
                                    nyy0Var = azy0Var;
                                }
                                this.f186743d.mo174799c(nyy0Var, this.f186741b, this.f186742c.zze(), j2, j3, this.f186744e);
                                if (this.f186753n.f74436p != null) {
                                    this.f186743d.zzc();
                                }
                                if (this.f186748i) {
                                    this.f186743d.mo174797a(j2, this.f186749j);
                                    this.f186748i = false;
                                }
                                iMo174798b = 0;
                                while (iMo174798b == 0) {
                                    if (!this.f186747h) {
                                        iMo174798b = 0;
                                        break;
                                    }
                                    try {
                                        this.f186745f.m104773a();
                                        iMo174798b = this.f186743d.mo174798b(this.f186746g);
                                        jZzb = this.f186743d.zzb();
                                        if (jZzb > this.f186753n.f74427g + j2) {
                                            this.f186745f.m104775c();
                                            b1z0 b1z0Var3 = this.f186753n;
                                            b1z0Var3.f74433m.post(b1z0Var3.f74432l);
                                            j2 = jZzb;
                                        }
                                    } catch (InterruptedException unused3) {
                                        throw new InterruptedIOException();
                                    }
                                }
                                if (iMo174798b != 1) {
                                    q0z0Var = this.f186743d;
                                    if (q0z0Var.zzb() != j) {
                                        this.f186746g.f199649a = q0z0Var.zzb();
                                    }
                                    i = iMo174798b;
                                }
                                igx0.m139963a(this.f186742c);
                                if (i != 0) {
                                    return;
                                }
                            } else {
                                j = -1;
                                try {
                                    y4w0.m214278f("IcyHeaders", "Invalid bitrate: " + str5);
                                } catch (NumberFormatException unused4) {
                                    y4w0.m214278f("IcyHeaders", "Invalid bitrate header: ".concat(String.valueOf(str5)));
                                    z = false;
                                    i2 = i5;
                                }
                            }
                        } catch (NumberFormatException unused5) {
                            j = -1;
                            i5 = -1;
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
                        i4 = Integer.parseInt(str4);
                        if (i4 > 0) {
                            z = true;
                            i3 = i4;
                        } else {
                            y4w0.m214278f("IcyHeaders", "Invalid metadata interval: " + str4);
                            i3 = -1;
                        }
                    } else {
                        i3 = -1;
                    }
                    b1z0Var2.f74436p = z ? new zzaga(i2, str, str2, str3, zEquals, i3) : null;
                    xsx0Var = this.f186742c;
                    b1z0Var = this.f186753n;
                    if (b1z0Var.f74436p != null) {
                        nyy0Var = xsx0Var;
                    } else {
                        nyy0Var = xsx0Var;
                    }
                    this.f186743d.mo174799c(nyy0Var, this.f186741b, this.f186742c.zze(), j2, j3, this.f186744e);
                    if (this.f186753n.f74436p != null) {
                        this.f186743d.zzc();
                    }
                    if (this.f186748i) {
                        this.f186743d.mo174797a(j2, this.f186749j);
                        this.f186748i = false;
                    }
                    iMo174798b = 0;
                    while (iMo174798b == 0) {
                        if (!this.f186747h) {
                            iMo174798b = 0;
                            break;
                        }
                        this.f186745f.m104773a();
                        iMo174798b = this.f186743d.mo174798b(this.f186746g);
                        jZzb = this.f186743d.zzb();
                        if (jZzb > this.f186753n.f74427g + j2) {
                            this.f186745f.m104775c();
                            b1z0 b1z0Var4 = this.f186753n;
                            b1z0Var4.f74433m.post(b1z0Var4.f74432l);
                            j2 = jZzb;
                        }
                    }
                    if (iMo174798b != 1) {
                        q0z0Var = this.f186743d;
                        if (q0z0Var.zzb() != j) {
                            this.f186746g.f199649a = q0z0Var.zzb();
                        }
                        i = iMo174798b;
                    }
                    igx0.m139963a(this.f186742c);
                    if (i != 0) {
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                }
                z = false;
                i2 = -1;
            } catch (Throwable th2) {
                th = th2;
                j = -1;
            }
        }
        return;
        if (i != 1) {
            q0z0 q0z0Var3 = this.f186743d;
            if (q0z0Var3.zzb() != j) {
                this.f186746g.f199649a = q0z0Var3.zzb();
            }
        }
        igx0.m139963a(this.f186742c);
        throw th;
    }
}
