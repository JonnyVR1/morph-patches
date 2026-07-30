package p149l;

import Sudchar.Sudcase;
import Sudchar.Sudif;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.http.HttpMethods;

/* JADX INFO: loaded from: classes.dex */
public final class jig0 {

    /* JADX INFO: renamed from: a */
    public boolean f118097a;

    /* JADX INFO: renamed from: b */
    public boolean f118098b;

    /* JADX INFO: renamed from: c */
    public int f118099c;

    /* JADX INFO: renamed from: d */
    public long f118100d;

    /* JADX INFO: renamed from: e */
    public final slg0 f118101e;

    /* JADX INFO: renamed from: f */
    public final tfg0 f118102f;

    public jig0(slg0 slg0Var, tfg0 tfg0Var) {
        this.f118101e = slg0Var;
        this.f118102f = tfg0Var;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x020a  */
    /* JADX WARN: Code duplicated, block: B:102:0x020c A[Catch: all -> 0x01c7, TryCatch #1 {all -> 0x01c7, blocks: (B:88:0x01b6, B:90:0x01c3, B:93:0x01ca, B:95:0x01d0, B:97:0x01e7, B:99:0x0202, B:103:0x0214, B:107:0x0225, B:106:0x0221, B:102:0x020c, B:112:0x0233, B:113:0x023a, B:96:0x01d9), top: B:205:0x01b6 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x021f  */
    /* JADX WARN: Code duplicated, block: B:110:0x022d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0233 A[Catch: all -> 0x01c7, TRY_ENTER, TryCatch #1 {all -> 0x01c7, blocks: (B:88:0x01b6, B:90:0x01c3, B:93:0x01ca, B:95:0x01d0, B:97:0x01e7, B:99:0x0202, B:103:0x0214, B:107:0x0225, B:106:0x0221, B:102:0x020c, B:112:0x0233, B:113:0x023a, B:96:0x01d9), top: B:205:0x01b6 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x024f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0251  */
    /* JADX WARN: Code duplicated, block: B:125:0x0266  */
    /* JADX WARN: Code duplicated, block: B:127:0x026c  */
    /* JADX WARN: Code duplicated, block: B:130:0x027c A[LOOP:0: B:128:0x0276->B:130:0x027c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:137:0x029b  */
    /* JADX WARN: Code duplicated, block: B:139:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:141:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:144:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:146:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:147:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:151:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:154:0x02e4 A[Catch: all -> 0x02ed, TryCatch #5 {all -> 0x02ed, blocks: (B:152:0x02da, B:154:0x02e4, B:157:0x02ef), top: B:211:0x02da }] */
    /* JADX WARN: Code duplicated, block: B:163:0x0307  */
    /* JADX WARN: Code duplicated, block: B:165:0x0313  */
    /* JADX WARN: Code duplicated, block: B:166:0x0315  */
    /* JADX WARN: Code duplicated, block: B:169:0x031e  */
    /* JADX WARN: Code duplicated, block: B:170:0x0320  */
    /* JADX WARN: Code duplicated, block: B:173:0x032d  */
    /* JADX WARN: Code duplicated, block: B:179:0x033e  */
    /* JADX WARN: Code duplicated, block: B:180:0x0340  */
    /* JADX WARN: Code duplicated, block: B:183:0x0345 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:184:0x0347 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:190:0x0359  */
    /* JADX WARN: Code duplicated, block: B:207:0x0287 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x0221 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x02da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x02b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0119 A[Catch: all -> 0x0047, TRY_ENTER, TryCatch #2 {all -> 0x0047, blocks: (B:3:0x0035, B:5:0x003d, B:8:0x004a, B:10:0x0057, B:11:0x005a, B:13:0x0066, B:15:0x007d, B:17:0x009a, B:19:0x00a2, B:31:0x00be, B:33:0x00ce, B:35:0x00d4, B:37:0x00de, B:41:0x00f5, B:52:0x0119, B:54:0x0121, B:56:0x0127, B:61:0x0147, B:62:0x014c, B:65:0x015a, B:67:0x0162, B:70:0x0169, B:72:0x0171, B:75:0x017a, B:77:0x0182, B:59:0x013d, B:44:0x0103, B:46:0x010c, B:40:0x00e9, B:192:0x035c, B:193:0x0363, B:194:0x0364, B:195:0x036b, B:14:0x006f), top: B:206:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0121 A[Catch: all -> 0x0047, TryCatch #2 {all -> 0x0047, blocks: (B:3:0x0035, B:5:0x003d, B:8:0x004a, B:10:0x0057, B:11:0x005a, B:13:0x0066, B:15:0x007d, B:17:0x009a, B:19:0x00a2, B:31:0x00be, B:33:0x00ce, B:35:0x00d4, B:37:0x00de, B:41:0x00f5, B:52:0x0119, B:54:0x0121, B:56:0x0127, B:61:0x0147, B:62:0x014c, B:65:0x015a, B:67:0x0162, B:70:0x0169, B:72:0x0171, B:75:0x017a, B:77:0x0182, B:59:0x013d, B:44:0x0103, B:46:0x010c, B:40:0x00e9, B:192:0x035c, B:193:0x0363, B:194:0x0364, B:195:0x036b, B:14:0x006f), top: B:206:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x013b  */
    /* JADX WARN: Code duplicated, block: B:59:0x013d A[Catch: all -> 0x0047, TryCatch #2 {all -> 0x0047, blocks: (B:3:0x0035, B:5:0x003d, B:8:0x004a, B:10:0x0057, B:11:0x005a, B:13:0x0066, B:15:0x007d, B:17:0x009a, B:19:0x00a2, B:31:0x00be, B:33:0x00ce, B:35:0x00d4, B:37:0x00de, B:41:0x00f5, B:52:0x0119, B:54:0x0121, B:56:0x0127, B:61:0x0147, B:62:0x014c, B:65:0x015a, B:67:0x0162, B:70:0x0169, B:72:0x0171, B:75:0x017a, B:77:0x0182, B:59:0x013d, B:44:0x0103, B:46:0x010c, B:40:0x00e9, B:192:0x035c, B:193:0x0363, B:194:0x0364, B:195:0x036b, B:14:0x006f), top: B:206:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0147 A[Catch: all -> 0x0047, TryCatch #2 {all -> 0x0047, blocks: (B:3:0x0035, B:5:0x003d, B:8:0x004a, B:10:0x0057, B:11:0x005a, B:13:0x0066, B:15:0x007d, B:17:0x009a, B:19:0x00a2, B:31:0x00be, B:33:0x00ce, B:35:0x00d4, B:37:0x00de, B:41:0x00f5, B:52:0x0119, B:54:0x0121, B:56:0x0127, B:61:0x0147, B:62:0x014c, B:65:0x015a, B:67:0x0162, B:70:0x0169, B:72:0x0171, B:75:0x017a, B:77:0x0182, B:59:0x013d, B:44:0x0103, B:46:0x010c, B:40:0x00e9, B:192:0x035c, B:193:0x0363, B:194:0x0364, B:195:0x036b, B:14:0x006f), top: B:206:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0192  */
    /* JADX WARN: Code duplicated, block: B:87:0x0199  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c3 A[Catch: all -> 0x01c7, TryCatch #1 {all -> 0x01c7, blocks: (B:88:0x01b6, B:90:0x01c3, B:93:0x01ca, B:95:0x01d0, B:97:0x01e7, B:99:0x0202, B:103:0x0214, B:107:0x0225, B:106:0x0221, B:102:0x020c, B:112:0x0233, B:113:0x023a, B:96:0x01d9), top: B:205:0x01b6 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01d0 A[Catch: all -> 0x01c7, TryCatch #1 {all -> 0x01c7, blocks: (B:88:0x01b6, B:90:0x01c3, B:93:0x01ca, B:95:0x01d0, B:97:0x01e7, B:99:0x0202, B:103:0x0214, B:107:0x0225, B:106:0x0221, B:102:0x020c, B:112:0x0233, B:113:0x023a, B:96:0x01d9), top: B:205:0x01b6 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01d9 A[Catch: all -> 0x01c7, TryCatch #1 {all -> 0x01c7, blocks: (B:88:0x01b6, B:90:0x01c3, B:93:0x01ca, B:95:0x01d0, B:97:0x01e7, B:99:0x0202, B:103:0x0214, B:107:0x0225, B:106:0x0221, B:102:0x020c, B:112:0x0233, B:113:0x023a, B:96:0x01d9), top: B:205:0x01b6 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0202 A[Catch: all -> 0x01c7, TryCatch #1 {all -> 0x01c7, blocks: (B:88:0x01b6, B:90:0x01c3, B:93:0x01ca, B:95:0x01d0, B:97:0x01e7, B:99:0x0202, B:103:0x0214, B:107:0x0225, B:106:0x0221, B:102:0x020c, B:112:0x0233, B:113:0x023a, B:96:0x01d9), top: B:205:0x01b6 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:137:0x029b, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public final void m141651a() throws IOException {
        long j;
        exc0 exc0Var;
        Map<String, List<String>> mapM166560l;
        String strM142182a;
        String strM142182a2;
        String strM142182a3;
        boolean z;
        exc0 exc0Var2;
        boolean z2;
        long j2;
        boolean z3;
        String str;
        String str2;
        int i;
        slg0 slg0Var;
        tfg0 tfg0Var;
        boolean z4;
        int iM121038a;
        boolean z5;
        boolean z6;
        String str3;
        Matcher matcher;
        String strGroup;
        byte[] bArrDigest;
        StringBuilder sb;
        int i2;
        int i3;
        jmg0 jmg0VarM130828a;
        gqg0 gqg0Var;
        Map map;
        stc0 stc0Var;
        Map<String, List<String>> mapM166560l2;
        exc0 exc0VarExecute;
        slg0 slg0Var2;
        exc0 exc0Var3;
        Map<String, List<String>> mapM166560l3;
        String strM142182a4;
        long j3;
        exc0 exc0Var4;
        String strM142182a5;
        int iM118609q;
        feg0 feg0Var = bog0.m102944a().f76521g;
        slg0 slg0Var3 = this.f118101e;
        tfg0 tfg0Var2 = this.f118102f;
        cfg0 cfg0Var = new cfg0(slg0Var3, tfg0Var2);
        bog0.m102944a().f76521g.m121040c(slg0Var3);
        bog0.m102944a().f76521g.m121039b();
        jmg0 jmg0VarM130828a2 = bog0.m102944a().f76518d.m130828a(slg0Var3.f165191c);
        jmg0VarM130828a2.m142183b(slg0Var3.f165212x);
        String string = null;
        try {
            if (!qlg0.m175481d(tfg0Var2.f169977c)) {
                jmg0VarM130828a2.f118633b.m185882a("If-Match", tfg0Var2.f169977c);
            }
            jmg0VarM130828a2.f118633b.m185882a("Range", "bytes=0-0");
            Map map2 = slg0Var3.f165193e;
            if (map2 != null) {
                qlg0.m175480c(map2, jmg0VarM130828a2);
            }
            gqg0 gqg0Var2 = bog0.m102944a().f76516b.f182721a;
            stc0 stc0Var2 = jmg0VarM130828a2.f118634c;
            gqg0Var2.m127591f(slg0Var3, stc0Var2 != null ? stc0Var2.m185875e().m166560l() : jmg0VarM130828a2.f118633b.m185883b().m185875e().m166560l());
            stc0 stc0VarM185883b = jmg0VarM130828a2.f118633b.m185883b();
            jmg0VarM130828a2.f118634c = stc0VarM185883b;
            exc0 exc0VarExecute2 = jmg0VarM130828a2.f118632a.mo144849a(stc0VarM185883b).execute();
            jmg0VarM130828a2.f118635d = exc0VarExecute2;
            exc0 exc0VarM118601Q = exc0VarExecute2.m118601Q();
            slg0Var3.f165211w = (exc0VarM118601Q != null && jmg0VarM130828a2.f118635d.m118597I() && ((iM118609q = exc0VarM118601Q.m118609q()) == 301 || iM118609q == 302 || iM118609q == 303 || iM118609q == 300 || iM118609q == 307 || iM118609q == 308)) ? jmg0VarM130828a2.f118635d.m118604Y().m185881k().toString() : null;
            exc0 exc0Var5 = jmg0VarM130828a2.f118635d;
            if (exc0Var5 == null) {
                throw new IOException("Please invoke execute first!");
            }
            cfg0Var.f80623f = exc0Var5.m118609q();
            exc0 exc0Var6 = jmg0VarM130828a2.f118635d;
            if (exc0Var6 == null) {
                throw new IOException("Please invoke execute first!");
            }
            cfg0Var.f80619b = exc0Var6.m118609q() == 206 ? true : HttpHeaderValues.BYTES.equals(jmg0VarM130828a2.m142182a(HttpHeaders.ACCEPT_RANGES));
            String strM142182a6 = jmg0VarM130828a2.m142182a("Content-Range");
            if (strM142182a6 != null) {
                String[] strArrSplit = strM142182a6.split("/");
                if (strArrSplit.length >= 2) {
                    try {
                        j = Long.parseLong(strArrSplit[1]);
                    } catch (NumberFormatException unused) {
                        j = -1;
                    }
                }
                if (j == -1) {
                    strM142182a5 = jmg0VarM130828a2.m142182a(HttpHeaders.TRANSFER_ENCODING);
                    if (strM142182a5 != null) {
                        strM142182a5.equals(HttpHeaderValues.CHUNKED);
                    }
                    j = -1;
                }
                cfg0Var.f80620c = j;
                cfg0Var.f80621d = jmg0VarM130828a2.m142182a("Etag");
                cfg0Var.f80622e = cfg0.m106550a(jmg0VarM130828a2);
                exc0Var = jmg0VarM130828a2.f118635d;
                if (exc0Var == null) {
                    mapM166560l = null;
                } else {
                    mapM166560l = exc0Var.m118595F().m166560l();
                }
                if (mapM166560l == null) {
                    mapM166560l = new HashMap<>();
                }
                gqg0Var2.m127593h(cfg0Var.f80618a, cfg0Var.f80623f, mapM166560l);
                z = cfg0Var.f80620c == -1 && ((strM142182a = jmg0VarM130828a2.m142182a("Content-Range")) == null || strM142182a.length() <= 0) && (((strM142182a2 = jmg0VarM130828a2.m142182a(HttpHeaders.TRANSFER_ENCODING)) == null || !strM142182a2.equals(HttpHeaderValues.CHUNKED)) && (strM142182a3 = jmg0VarM130828a2.m142182a("Content-Length")) != null && strM142182a3.length() > 0);
                jmg0VarM130828a2.f118634c = null;
                exc0Var2 = jmg0VarM130828a2.f118635d;
                if (exc0Var2 != null) {
                    exc0Var2.close();
                }
                jmg0VarM130828a2.f118635d = null;
                if (z) {
                    jmg0VarM130828a = bog0.m102944a().f76518d.m130828a(cfg0Var.f80618a.f165191c);
                    jmg0VarM130828a.m142183b(cfg0Var.f80618a.f165212x);
                    gqg0Var = bog0.m102944a().f76516b.f182721a;
                    try {
                        jmg0VarM130828a.f118633b.m185891j(HttpMethods.HEAD, null);
                        map = cfg0Var.f80618a.f165193e;
                        if (map != null) {
                            qlg0.m175480c(map, jmg0VarM130828a);
                        }
                        slg0 slg0Var4 = cfg0Var.f80618a;
                        stc0Var = jmg0VarM130828a.f118634c;
                        if (stc0Var != null) {
                            mapM166560l2 = stc0Var.m185875e().m166560l();
                        } else {
                            mapM166560l2 = jmg0VarM130828a.f118633b.m185883b().m185875e().m166560l();
                        }
                        gqg0Var.m127591f(slg0Var4, mapM166560l2);
                        stc0 stc0VarM185883b2 = jmg0VarM130828a.f118633b.m185883b();
                        jmg0VarM130828a.f118634c = stc0VarM185883b2;
                        exc0VarExecute = jmg0VarM130828a.f118632a.mo144849a(stc0VarM185883b2).execute();
                        jmg0VarM130828a.f118635d = exc0VarExecute;
                        slg0Var2 = cfg0Var.f80618a;
                        if (exc0VarExecute == null) {
                            throw new IOException("Please invoke execute first!");
                        }
                        int iM118609q2 = exc0VarExecute.m118609q();
                        exc0Var3 = jmg0VarM130828a.f118635d;
                        if (exc0Var3 == null) {
                            mapM166560l3 = null;
                        } else {
                            mapM166560l3 = exc0Var3.m118595F().m166560l();
                        }
                        gqg0Var.m127593h(slg0Var2, iM118609q2, mapM166560l3);
                        strM142182a4 = jmg0VarM130828a.m142182a("Content-Length");
                        if (strM142182a4 == null) {
                            j3 = -1;
                        } else {
                            try {
                                j3 = Long.parseLong(strM142182a4);
                            } catch (NumberFormatException unused2) {
                                j3 = -1;
                            }
                        }
                        cfg0Var.f80620c = j3;
                        jmg0VarM130828a.f118634c = null;
                        exc0Var4 = jmg0VarM130828a.f118635d;
                        if (exc0Var4 != null) {
                            exc0Var4.close();
                        }
                        jmg0VarM130828a.f118635d = null;
                    } catch (Throwable th) {
                        jmg0VarM130828a.f118634c = null;
                        exc0 exc0Var7 = jmg0VarM130828a.f118635d;
                        if (exc0Var7 != null) {
                            exc0Var7.close();
                        }
                        jmg0VarM130828a.f118635d = null;
                        throw th;
                    }
                }
                z2 = cfg0Var.f80619b;
                j2 = cfg0Var.f80620c;
                if (j2 == -1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                str = cfg0Var.f80621d;
                str2 = cfg0Var.f80622e;
                i = cfg0Var.f80623f;
                slg0Var = this.f118101e;
                tfg0Var = this.f118102f;
                if (qlg0.m175481d(slg0Var.f165207s.f90099a)) {
                    if (qlg0.m175481d(str2)) {
                        str3 = slg0Var.f165191c;
                        matcher = feg0.f97129c.matcher(str3);
                        strGroup = null;
                        while (matcher.find()) {
                            strGroup = matcher.group(1);
                        }
                        if (qlg0.m175481d(strGroup)) {
                            try {
                                bArrDigest = MessageDigest.getInstance("MD5").digest(str3.getBytes("UTF-8"));
                            } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused3) {
                                bArrDigest = null;
                            }
                            if (bArrDigest != null) {
                                sb = new StringBuilder(bArrDigest.length * 2);
                                for (byte b : bArrDigest) {
                                    i3 = b & 255;
                                    if (i3 < 16) {
                                        sb.append('0');
                                    }
                                    sb.append(Integer.toHexString(i3));
                                }
                                string = sb.toString();
                            }
                        } else {
                            string = strGroup;
                        }
                        if (string == null) {
                            rhg0.m179353a("Can't find valid filename.");
                            return;
                        }
                        str2 = string;
                    }
                    if (qlg0.m175481d(slg0Var.f165207s.f90099a)) {
                        synchronized (slg0Var) {
                            try {
                                if (qlg0.m175481d(slg0Var.f165207s.f90099a)) {
                                    slg0Var.f165207s.f90099a = str2;
                                    tfg0Var.f169980f.f90099a = str2;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                }
                tfg0 tfg0Var3 = this.f118102f;
                tfg0Var3.f169983i = z3;
                tfg0Var3.f169977c = str;
                if (bog0.m102944a().f76515a.m95135i(this.f118101e)) {
                    throw Sudif.f210106Suddo;
                }
                if (this.f118102f.m188709e() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                iM121038a = feg0.m121038a(i, z4, this.f118102f, str);
                if (iM121038a == 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                this.f118098b = z5;
                this.f118099c = iM121038a;
                this.f118100d = j2;
                this.f118097a = z2;
                if (i == 416 || j2 < 0 || !z5) {
                    if (this.f118102f.m188709e() != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if ((i == 206 && i != 200) || (i == 200 && z6)) {
                        throw new Sudcase(i, this.f118102f.m188709e());
                    }
                    return;
                }
                return;
            }
            j = -1;
            if (j == -1) {
                strM142182a5 = jmg0VarM130828a2.m142182a(HttpHeaders.TRANSFER_ENCODING);
                if (strM142182a5 != null) {
                    strM142182a5.equals(HttpHeaderValues.CHUNKED);
                }
                j = -1;
            }
            cfg0Var.f80620c = j;
            cfg0Var.f80621d = jmg0VarM130828a2.m142182a("Etag");
            cfg0Var.f80622e = cfg0.m106550a(jmg0VarM130828a2);
            exc0Var = jmg0VarM130828a2.f118635d;
            if (exc0Var == null) {
                mapM166560l = null;
            } else {
                mapM166560l = exc0Var.m118595F().m166560l();
            }
            if (mapM166560l == null) {
                mapM166560l = new HashMap<>();
            }
            gqg0Var2.m127593h(cfg0Var.f80618a, cfg0Var.f80623f, mapM166560l);
            if (cfg0Var.f80620c == -1) {
                jmg0VarM130828a2.f118634c = null;
                exc0Var2 = jmg0VarM130828a2.f118635d;
                if (exc0Var2 != null) {
                    exc0Var2.close();
                }
                jmg0VarM130828a2.f118635d = null;
                if (z) {
                    jmg0VarM130828a = bog0.m102944a().f76518d.m130828a(cfg0Var.f80618a.f165191c);
                    jmg0VarM130828a.m142183b(cfg0Var.f80618a.f165212x);
                    gqg0Var = bog0.m102944a().f76516b.f182721a;
                    jmg0VarM130828a.f118633b.m185891j(HttpMethods.HEAD, null);
                    map = cfg0Var.f80618a.f165193e;
                    if (map != null) {
                        qlg0.m175480c(map, jmg0VarM130828a);
                    }
                    slg0 slg0Var5 = cfg0Var.f80618a;
                    stc0Var = jmg0VarM130828a.f118634c;
                    if (stc0Var != null) {
                        mapM166560l2 = stc0Var.m185875e().m166560l();
                    } else {
                        mapM166560l2 = jmg0VarM130828a.f118633b.m185883b().m185875e().m166560l();
                    }
                    gqg0Var.m127591f(slg0Var5, mapM166560l2);
                    stc0 stc0VarM185883b3 = jmg0VarM130828a.f118633b.m185883b();
                    jmg0VarM130828a.f118634c = stc0VarM185883b3;
                    exc0VarExecute = jmg0VarM130828a.f118632a.mo144849a(stc0VarM185883b3).execute();
                    jmg0VarM130828a.f118635d = exc0VarExecute;
                    slg0Var2 = cfg0Var.f80618a;
                    if (exc0VarExecute == null) {
                        throw new IOException("Please invoke execute first!");
                    }
                    int iM118609q3 = exc0VarExecute.m118609q();
                    exc0Var3 = jmg0VarM130828a.f118635d;
                    if (exc0Var3 == null) {
                        mapM166560l3 = null;
                    } else {
                        mapM166560l3 = exc0Var3.m118595F().m166560l();
                    }
                    gqg0Var.m127593h(slg0Var2, iM118609q3, mapM166560l3);
                    strM142182a4 = jmg0VarM130828a.m142182a("Content-Length");
                    if (strM142182a4 == null) {
                        j3 = -1;
                    } else {
                        j3 = Long.parseLong(strM142182a4);
                    }
                    cfg0Var.f80620c = j3;
                    jmg0VarM130828a.f118634c = null;
                    exc0Var4 = jmg0VarM130828a.f118635d;
                    if (exc0Var4 != null) {
                        exc0Var4.close();
                    }
                    jmg0VarM130828a.f118635d = null;
                }
                z2 = cfg0Var.f80619b;
                j2 = cfg0Var.f80620c;
                if (j2 == -1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                str = cfg0Var.f80621d;
                str2 = cfg0Var.f80622e;
                i = cfg0Var.f80623f;
                slg0Var = this.f118101e;
                tfg0Var = this.f118102f;
                if (qlg0.m175481d(slg0Var.f165207s.f90099a)) {
                    if (qlg0.m175481d(str2)) {
                        str3 = slg0Var.f165191c;
                        matcher = feg0.f97129c.matcher(str3);
                        strGroup = null;
                        while (matcher.find()) {
                            strGroup = matcher.group(1);
                        }
                        if (qlg0.m175481d(strGroup)) {
                            bArrDigest = MessageDigest.getInstance("MD5").digest(str3.getBytes("UTF-8"));
                            if (bArrDigest != null) {
                                sb = new StringBuilder(bArrDigest.length * 2);
                                while (i2 < r8) {
                                    i3 = b & 255;
                                    if (i3 < 16) {
                                        sb.append('0');
                                    }
                                    sb.append(Integer.toHexString(i3));
                                }
                                string = sb.toString();
                            }
                        } else {
                            string = strGroup;
                        }
                        if (string == null) {
                            rhg0.m179353a("Can't find valid filename.");
                            return;
                        }
                        str2 = string;
                    }
                    if (qlg0.m175481d(slg0Var.f165207s.f90099a)) {
                        synchronized (slg0Var) {
                            if (qlg0.m175481d(slg0Var.f165207s.f90099a)) {
                                slg0Var.f165207s.f90099a = str2;
                                tfg0Var.f169980f.f90099a = str2;
                            }
                        }
                    }
                }
                tfg0 tfg0Var4 = this.f118102f;
                tfg0Var4.f169983i = z3;
                tfg0Var4.f169977c = str;
                if (bog0.m102944a().f76515a.m95135i(this.f118101e)) {
                    throw Sudif.f210106Suddo;
                }
                if (this.f118102f.m188709e() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                iM121038a = feg0.m121038a(i, z4, this.f118102f, str);
                if (iM121038a == 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                this.f118098b = z5;
                this.f118099c = iM121038a;
                this.f118100d = j2;
                this.f118097a = z2;
                if (i == 416) {
                }
                if (this.f118102f.m188709e() != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (i == 206) {
                    return;
                } else {
                    return;
                }
                throw new Sudcase(i, this.f118102f.m188709e());
            }
            jmg0VarM130828a2.f118634c = null;
            exc0Var2 = jmg0VarM130828a2.f118635d;
            if (exc0Var2 != null) {
                exc0Var2.close();
            }
            jmg0VarM130828a2.f118635d = null;
            if (z) {
                jmg0VarM130828a = bog0.m102944a().f76518d.m130828a(cfg0Var.f80618a.f165191c);
                jmg0VarM130828a.m142183b(cfg0Var.f80618a.f165212x);
                gqg0Var = bog0.m102944a().f76516b.f182721a;
                jmg0VarM130828a.f118633b.m185891j(HttpMethods.HEAD, null);
                map = cfg0Var.f80618a.f165193e;
                if (map != null) {
                    qlg0.m175480c(map, jmg0VarM130828a);
                }
                slg0 slg0Var6 = cfg0Var.f80618a;
                stc0Var = jmg0VarM130828a.f118634c;
                if (stc0Var != null) {
                    mapM166560l2 = stc0Var.m185875e().m166560l();
                } else {
                    mapM166560l2 = jmg0VarM130828a.f118633b.m185883b().m185875e().m166560l();
                }
                gqg0Var.m127591f(slg0Var6, mapM166560l2);
                stc0 stc0VarM185883b4 = jmg0VarM130828a.f118633b.m185883b();
                jmg0VarM130828a.f118634c = stc0VarM185883b4;
                exc0VarExecute = jmg0VarM130828a.f118632a.mo144849a(stc0VarM185883b4).execute();
                jmg0VarM130828a.f118635d = exc0VarExecute;
                slg0Var2 = cfg0Var.f80618a;
                if (exc0VarExecute == null) {
                    throw new IOException("Please invoke execute first!");
                }
                int iM118609q4 = exc0VarExecute.m118609q();
                exc0Var3 = jmg0VarM130828a.f118635d;
                if (exc0Var3 == null) {
                    mapM166560l3 = null;
                } else {
                    mapM166560l3 = exc0Var3.m118595F().m166560l();
                }
                gqg0Var.m127593h(slg0Var2, iM118609q4, mapM166560l3);
                strM142182a4 = jmg0VarM130828a.m142182a("Content-Length");
                if (strM142182a4 == null) {
                    j3 = -1;
                } else {
                    j3 = Long.parseLong(strM142182a4);
                }
                cfg0Var.f80620c = j3;
                jmg0VarM130828a.f118634c = null;
                exc0Var4 = jmg0VarM130828a.f118635d;
                if (exc0Var4 != null) {
                    exc0Var4.close();
                }
                jmg0VarM130828a.f118635d = null;
            }
            z2 = cfg0Var.f80619b;
            j2 = cfg0Var.f80620c;
            if (j2 == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            str = cfg0Var.f80621d;
            str2 = cfg0Var.f80622e;
            i = cfg0Var.f80623f;
            slg0Var = this.f118101e;
            tfg0Var = this.f118102f;
            if (qlg0.m175481d(slg0Var.f165207s.f90099a)) {
                if (qlg0.m175481d(str2)) {
                    str3 = slg0Var.f165191c;
                    matcher = feg0.f97129c.matcher(str3);
                    strGroup = null;
                    while (matcher.find()) {
                        strGroup = matcher.group(1);
                    }
                    if (qlg0.m175481d(strGroup)) {
                        bArrDigest = MessageDigest.getInstance("MD5").digest(str3.getBytes("UTF-8"));
                        if (bArrDigest != null) {
                            sb = new StringBuilder(bArrDigest.length * 2);
                            while (i2 < r8) {
                                i3 = b & 255;
                                if (i3 < 16) {
                                    sb.append('0');
                                }
                                sb.append(Integer.toHexString(i3));
                            }
                            string = sb.toString();
                        }
                    } else {
                        string = strGroup;
                    }
                    if (string == null) {
                        rhg0.m179353a("Can't find valid filename.");
                        return;
                    }
                    str2 = string;
                }
                if (qlg0.m175481d(slg0Var.f165207s.f90099a)) {
                    synchronized (slg0Var) {
                        if (qlg0.m175481d(slg0Var.f165207s.f90099a)) {
                            slg0Var.f165207s.f90099a = str2;
                            tfg0Var.f169980f.f90099a = str2;
                        }
                    }
                }
            }
            tfg0 tfg0Var5 = this.f118102f;
            tfg0Var5.f169983i = z3;
            tfg0Var5.f169977c = str;
            if (bog0.m102944a().f76515a.m95135i(this.f118101e)) {
                throw Sudif.f210106Suddo;
            }
            if (this.f118102f.m188709e() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            iM121038a = feg0.m121038a(i, z4, this.f118102f, str);
            if (iM121038a == 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            this.f118098b = z5;
            this.f118099c = iM121038a;
            this.f118100d = j2;
            this.f118097a = z2;
            if (i == 416) {
            }
            if (this.f118102f.m188709e() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (i == 206) {
                return;
            } else {
                return;
            }
            throw new Sudcase(i, this.f118102f.m188709e());
        } catch (Throwable th3) {
            jmg0VarM130828a2.f118634c = null;
            exc0 exc0Var8 = jmg0VarM130828a2.f118635d;
            if (exc0Var8 != null) {
                exc0Var8.close();
            }
            jmg0VarM130828a2.f118635d = null;
            throw th3;
        }
    }

    public final String toString() {
        return "acceptRange[" + this.f118097a + "] resumable[" + this.f118098b + "] failedCause[" + gjg0.m126497a(this.f118099c) + "] instanceLength[" + this.f118100d + "] " + super.toString();
    }
}
