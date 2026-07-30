package p153l;

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
public final class rqg0 {

    /* JADX INFO: renamed from: a */
    public boolean f164478a;

    /* JADX INFO: renamed from: b */
    public boolean f164479b;

    /* JADX INFO: renamed from: c */
    public int f164480c;

    /* JADX INFO: renamed from: d */
    public long f164481d;

    /* JADX INFO: renamed from: e */
    public final aug0 f164482e;

    /* JADX INFO: renamed from: f */
    public final bog0 f164483f;

    public rqg0(aug0 aug0Var, bog0 bog0Var) {
        this.f164482e = aug0Var;
        this.f164483f = bog0Var;
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
    public final void m182621a() throws IOException {
        long j;
        i5d0 i5d0Var;
        Map<String, List<String>> mapM118879l;
        String strM183191a;
        String strM183191a2;
        String strM183191a3;
        boolean z;
        i5d0 i5d0Var2;
        boolean z2;
        long j2;
        boolean z3;
        String str;
        String str2;
        int i;
        aug0 aug0Var;
        bog0 bog0Var;
        boolean z4;
        int iM163816a;
        boolean z5;
        boolean z6;
        String str3;
        Matcher matcher;
        String strGroup;
        byte[] bArrDigest;
        StringBuilder sb;
        int i2;
        int i3;
        rug0 rug0VarM173106a;
        oyg0 oyg0Var;
        Map map;
        x1d0 x1d0Var;
        Map<String, List<String>> mapM118879l2;
        i5d0 i5d0VarExecute;
        aug0 aug0Var2;
        i5d0 i5d0Var3;
        Map<String, List<String>> mapM118879l3;
        String strM183191a4;
        long j3;
        i5d0 i5d0Var4;
        String strM183191a5;
        int iM138673q;
        nmg0 nmg0Var = jwg0.m147162a().f122925g;
        aug0 aug0Var3 = this.f164482e;
        bog0 bog0Var2 = this.f164483f;
        kng0 kng0Var = new kng0(aug0Var3, bog0Var2);
        jwg0.m147162a().f122925g.m163818c(aug0Var3);
        jwg0.m147162a().f122925g.m163817b();
        rug0 rug0VarM173106a2 = jwg0.m147162a().f122922d.m173106a(aug0Var3.f73494c);
        rug0VarM173106a2.m183192b(aug0Var3.f73515x);
        String string = null;
        try {
            if (!ytg0.m217312d(bog0Var2.f77676c)) {
                rug0VarM173106a2.f164919b.m209027a("If-Match", bog0Var2.f77676c);
            }
            rug0VarM173106a2.f164919b.m209027a("Range", "bytes=0-0");
            Map map2 = aug0Var3.f73496e;
            if (map2 != null) {
                ytg0.m217311c(map2, rug0VarM173106a2);
            }
            oyg0 oyg0Var2 = jwg0.m147162a().f122920b.f84561a;
            x1d0 x1d0Var2 = rug0VarM173106a2.f164920c;
            oyg0Var2.m169863f(aug0Var3, x1d0Var2 != null ? x1d0Var2.m209020e().m118879l() : rug0VarM173106a2.f164919b.m209028b().m209020e().m118879l());
            x1d0 x1d0VarM209028b = rug0VarM173106a2.f164919b.m209028b();
            rug0VarM173106a2.f164920c = x1d0VarM209028b;
            i5d0 i5d0VarExecute2 = rug0VarM173106a2.f164918a.mo181341a(x1d0VarM209028b).execute();
            rug0VarM173106a2.f164921d = i5d0VarExecute2;
            i5d0 i5d0VarM138665Q = i5d0VarExecute2.m138665Q();
            aug0Var3.f73514w = (i5d0VarM138665Q != null && rug0VarM173106a2.f164921d.m138661I() && ((iM138673q = i5d0VarM138665Q.m138673q()) == 301 || iM138673q == 302 || iM138673q == 303 || iM138673q == 300 || iM138673q == 307 || iM138673q == 308)) ? rug0VarM173106a2.f164921d.m138668Z().m209026k().toString() : null;
            i5d0 i5d0Var5 = rug0VarM173106a2.f164921d;
            if (i5d0Var5 == null) {
                throw new IOException("Please invoke execute first!");
            }
            kng0Var.f127599f = i5d0Var5.m138673q();
            i5d0 i5d0Var6 = rug0VarM173106a2.f164921d;
            if (i5d0Var6 == null) {
                throw new IOException("Please invoke execute first!");
            }
            kng0Var.f127595b = i5d0Var6.m138673q() == 206 ? true : HttpHeaderValues.BYTES.equals(rug0VarM173106a2.m183191a(HttpHeaders.ACCEPT_RANGES));
            String strM183191a6 = rug0VarM173106a2.m183191a(HttpHeaders.CONTENT_RANGE);
            if (strM183191a6 != null) {
                String[] strArrSplit = strM183191a6.split("/");
                if (strArrSplit.length >= 2) {
                    try {
                        j = Long.parseLong(strArrSplit[1]);
                    } catch (NumberFormatException unused) {
                        j = -1;
                    }
                }
                if (j == -1) {
                    strM183191a5 = rug0VarM173106a2.m183191a(HttpHeaders.TRANSFER_ENCODING);
                    if (strM183191a5 != null) {
                        strM183191a5.equals(HttpHeaderValues.CHUNKED);
                    }
                    j = -1;
                }
                kng0Var.f127596c = j;
                kng0Var.f127597d = rug0VarM173106a2.m183191a("Etag");
                kng0Var.f127598e = kng0.m150521a(rug0VarM173106a2);
                i5d0Var = rug0VarM173106a2.f164921d;
                if (i5d0Var == null) {
                    mapM118879l = null;
                } else {
                    mapM118879l = i5d0Var.m138659F().m118879l();
                }
                if (mapM118879l == null) {
                    mapM118879l = new HashMap<>();
                }
                oyg0Var2.m169865h(kng0Var.f127594a, kng0Var.f127599f, mapM118879l);
                z = kng0Var.f127596c == -1 && ((strM183191a = rug0VarM173106a2.m183191a(HttpHeaders.CONTENT_RANGE)) == null || strM183191a.length() <= 0) && (((strM183191a2 = rug0VarM173106a2.m183191a(HttpHeaders.TRANSFER_ENCODING)) == null || !strM183191a2.equals(HttpHeaderValues.CHUNKED)) && (strM183191a3 = rug0VarM173106a2.m183191a("Content-Length")) != null && strM183191a3.length() > 0);
                rug0VarM173106a2.f164920c = null;
                i5d0Var2 = rug0VarM173106a2.f164921d;
                if (i5d0Var2 != null) {
                    i5d0Var2.close();
                }
                rug0VarM173106a2.f164921d = null;
                if (z) {
                    rug0VarM173106a = jwg0.m147162a().f122922d.m173106a(kng0Var.f127594a.f73494c);
                    rug0VarM173106a.m183192b(kng0Var.f127594a.f73515x);
                    oyg0Var = jwg0.m147162a().f122920b.f84561a;
                    try {
                        rug0VarM173106a.f164919b.m209036j(HttpMethods.HEAD, null);
                        map = kng0Var.f127594a.f73496e;
                        if (map != null) {
                            ytg0.m217311c(map, rug0VarM173106a);
                        }
                        aug0 aug0Var4 = kng0Var.f127594a;
                        x1d0Var = rug0VarM173106a.f164920c;
                        if (x1d0Var != null) {
                            mapM118879l2 = x1d0Var.m209020e().m118879l();
                        } else {
                            mapM118879l2 = rug0VarM173106a.f164919b.m209028b().m209020e().m118879l();
                        }
                        oyg0Var.m169863f(aug0Var4, mapM118879l2);
                        x1d0 x1d0VarM209028b2 = rug0VarM173106a.f164919b.m209028b();
                        rug0VarM173106a.f164920c = x1d0VarM209028b2;
                        i5d0VarExecute = rug0VarM173106a.f164918a.mo181341a(x1d0VarM209028b2).execute();
                        rug0VarM173106a.f164921d = i5d0VarExecute;
                        aug0Var2 = kng0Var.f127594a;
                        if (i5d0VarExecute == null) {
                            throw new IOException("Please invoke execute first!");
                        }
                        int iM138673q2 = i5d0VarExecute.m138673q();
                        i5d0Var3 = rug0VarM173106a.f164921d;
                        if (i5d0Var3 == null) {
                            mapM118879l3 = null;
                        } else {
                            mapM118879l3 = i5d0Var3.m138659F().m118879l();
                        }
                        oyg0Var.m169865h(aug0Var2, iM138673q2, mapM118879l3);
                        strM183191a4 = rug0VarM173106a.m183191a("Content-Length");
                        if (strM183191a4 == null) {
                            j3 = -1;
                        } else {
                            try {
                                j3 = Long.parseLong(strM183191a4);
                            } catch (NumberFormatException unused2) {
                                j3 = -1;
                            }
                        }
                        kng0Var.f127596c = j3;
                        rug0VarM173106a.f164920c = null;
                        i5d0Var4 = rug0VarM173106a.f164921d;
                        if (i5d0Var4 != null) {
                            i5d0Var4.close();
                        }
                        rug0VarM173106a.f164921d = null;
                    } catch (Throwable th) {
                        rug0VarM173106a.f164920c = null;
                        i5d0 i5d0Var7 = rug0VarM173106a.f164921d;
                        if (i5d0Var7 != null) {
                            i5d0Var7.close();
                        }
                        rug0VarM173106a.f164921d = null;
                        throw th;
                    }
                }
                z2 = kng0Var.f127595b;
                j2 = kng0Var.f127596c;
                if (j2 == -1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                str = kng0Var.f127597d;
                str2 = kng0Var.f127598e;
                i = kng0Var.f127599f;
                aug0Var = this.f164482e;
                bog0Var = this.f164483f;
                if (ytg0.m217312d(aug0Var.f73510s.f136848a)) {
                    if (ytg0.m217312d(str2)) {
                        str3 = aug0Var.f73494c;
                        matcher = nmg0.f142704c.matcher(str3);
                        strGroup = null;
                        while (matcher.find()) {
                            strGroup = matcher.group(1);
                        }
                        if (ytg0.m217312d(strGroup)) {
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
                            zpg0.m220844a("Can't find valid filename.");
                            return;
                        }
                        str2 = string;
                    }
                    if (ytg0.m217312d(aug0Var.f73510s.f136848a)) {
                        synchronized (aug0Var) {
                            try {
                                if (ytg0.m217312d(aug0Var.f73510s.f136848a)) {
                                    aug0Var.f73510s.f136848a = str2;
                                    bog0Var.f77679f.f136848a = str2;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                }
                bog0 bog0Var3 = this.f164483f;
                bog0Var3.f77682i = z3;
                bog0Var3.f77676c = str;
                if (jwg0.m147162a().f122919a.m139610i(this.f164482e)) {
                    throw Sudif.f211028Suddo;
                }
                if (this.f164483f.m105681e() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                iM163816a = nmg0.m163816a(i, z4, this.f164483f, str);
                if (iM163816a == 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                this.f164479b = z5;
                this.f164480c = iM163816a;
                this.f164481d = j2;
                this.f164478a = z2;
                if (i == 416 || j2 < 0 || !z5) {
                    if (this.f164483f.m105681e() != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if ((i == 206 && i != 200) || (i == 200 && z6)) {
                        throw new Sudcase(i, this.f164483f.m105681e());
                    }
                    return;
                }
                return;
            }
            j = -1;
            if (j == -1) {
                strM183191a5 = rug0VarM173106a2.m183191a(HttpHeaders.TRANSFER_ENCODING);
                if (strM183191a5 != null) {
                    strM183191a5.equals(HttpHeaderValues.CHUNKED);
                }
                j = -1;
            }
            kng0Var.f127596c = j;
            kng0Var.f127597d = rug0VarM173106a2.m183191a("Etag");
            kng0Var.f127598e = kng0.m150521a(rug0VarM173106a2);
            i5d0Var = rug0VarM173106a2.f164921d;
            if (i5d0Var == null) {
                mapM118879l = null;
            } else {
                mapM118879l = i5d0Var.m138659F().m118879l();
            }
            if (mapM118879l == null) {
                mapM118879l = new HashMap<>();
            }
            oyg0Var2.m169865h(kng0Var.f127594a, kng0Var.f127599f, mapM118879l);
            if (kng0Var.f127596c == -1) {
                rug0VarM173106a2.f164920c = null;
                i5d0Var2 = rug0VarM173106a2.f164921d;
                if (i5d0Var2 != null) {
                    i5d0Var2.close();
                }
                rug0VarM173106a2.f164921d = null;
                if (z) {
                    rug0VarM173106a = jwg0.m147162a().f122922d.m173106a(kng0Var.f127594a.f73494c);
                    rug0VarM173106a.m183192b(kng0Var.f127594a.f73515x);
                    oyg0Var = jwg0.m147162a().f122920b.f84561a;
                    rug0VarM173106a.f164919b.m209036j(HttpMethods.HEAD, null);
                    map = kng0Var.f127594a.f73496e;
                    if (map != null) {
                        ytg0.m217311c(map, rug0VarM173106a);
                    }
                    aug0 aug0Var5 = kng0Var.f127594a;
                    x1d0Var = rug0VarM173106a.f164920c;
                    if (x1d0Var != null) {
                        mapM118879l2 = x1d0Var.m209020e().m118879l();
                    } else {
                        mapM118879l2 = rug0VarM173106a.f164919b.m209028b().m209020e().m118879l();
                    }
                    oyg0Var.m169863f(aug0Var5, mapM118879l2);
                    x1d0 x1d0VarM209028b3 = rug0VarM173106a.f164919b.m209028b();
                    rug0VarM173106a.f164920c = x1d0VarM209028b3;
                    i5d0VarExecute = rug0VarM173106a.f164918a.mo181341a(x1d0VarM209028b3).execute();
                    rug0VarM173106a.f164921d = i5d0VarExecute;
                    aug0Var2 = kng0Var.f127594a;
                    if (i5d0VarExecute == null) {
                        throw new IOException("Please invoke execute first!");
                    }
                    int iM138673q3 = i5d0VarExecute.m138673q();
                    i5d0Var3 = rug0VarM173106a.f164921d;
                    if (i5d0Var3 == null) {
                        mapM118879l3 = null;
                    } else {
                        mapM118879l3 = i5d0Var3.m138659F().m118879l();
                    }
                    oyg0Var.m169865h(aug0Var2, iM138673q3, mapM118879l3);
                    strM183191a4 = rug0VarM173106a.m183191a("Content-Length");
                    if (strM183191a4 == null) {
                        j3 = -1;
                    } else {
                        j3 = Long.parseLong(strM183191a4);
                    }
                    kng0Var.f127596c = j3;
                    rug0VarM173106a.f164920c = null;
                    i5d0Var4 = rug0VarM173106a.f164921d;
                    if (i5d0Var4 != null) {
                        i5d0Var4.close();
                    }
                    rug0VarM173106a.f164921d = null;
                }
                z2 = kng0Var.f127595b;
                j2 = kng0Var.f127596c;
                if (j2 == -1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                str = kng0Var.f127597d;
                str2 = kng0Var.f127598e;
                i = kng0Var.f127599f;
                aug0Var = this.f164482e;
                bog0Var = this.f164483f;
                if (ytg0.m217312d(aug0Var.f73510s.f136848a)) {
                    if (ytg0.m217312d(str2)) {
                        str3 = aug0Var.f73494c;
                        matcher = nmg0.f142704c.matcher(str3);
                        strGroup = null;
                        while (matcher.find()) {
                            strGroup = matcher.group(1);
                        }
                        if (ytg0.m217312d(strGroup)) {
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
                            zpg0.m220844a("Can't find valid filename.");
                            return;
                        }
                        str2 = string;
                    }
                    if (ytg0.m217312d(aug0Var.f73510s.f136848a)) {
                        synchronized (aug0Var) {
                            if (ytg0.m217312d(aug0Var.f73510s.f136848a)) {
                                aug0Var.f73510s.f136848a = str2;
                                bog0Var.f77679f.f136848a = str2;
                            }
                        }
                    }
                }
                bog0 bog0Var4 = this.f164483f;
                bog0Var4.f77682i = z3;
                bog0Var4.f77676c = str;
                if (jwg0.m147162a().f122919a.m139610i(this.f164482e)) {
                    throw Sudif.f211028Suddo;
                }
                if (this.f164483f.m105681e() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                iM163816a = nmg0.m163816a(i, z4, this.f164483f, str);
                if (iM163816a == 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                this.f164479b = z5;
                this.f164480c = iM163816a;
                this.f164481d = j2;
                this.f164478a = z2;
                if (i == 416) {
                }
                if (this.f164483f.m105681e() != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (i == 206) {
                    return;
                } else {
                    return;
                }
                throw new Sudcase(i, this.f164483f.m105681e());
            }
            rug0VarM173106a2.f164920c = null;
            i5d0Var2 = rug0VarM173106a2.f164921d;
            if (i5d0Var2 != null) {
                i5d0Var2.close();
            }
            rug0VarM173106a2.f164921d = null;
            if (z) {
                rug0VarM173106a = jwg0.m147162a().f122922d.m173106a(kng0Var.f127594a.f73494c);
                rug0VarM173106a.m183192b(kng0Var.f127594a.f73515x);
                oyg0Var = jwg0.m147162a().f122920b.f84561a;
                rug0VarM173106a.f164919b.m209036j(HttpMethods.HEAD, null);
                map = kng0Var.f127594a.f73496e;
                if (map != null) {
                    ytg0.m217311c(map, rug0VarM173106a);
                }
                aug0 aug0Var6 = kng0Var.f127594a;
                x1d0Var = rug0VarM173106a.f164920c;
                if (x1d0Var != null) {
                    mapM118879l2 = x1d0Var.m209020e().m118879l();
                } else {
                    mapM118879l2 = rug0VarM173106a.f164919b.m209028b().m209020e().m118879l();
                }
                oyg0Var.m169863f(aug0Var6, mapM118879l2);
                x1d0 x1d0VarM209028b4 = rug0VarM173106a.f164919b.m209028b();
                rug0VarM173106a.f164920c = x1d0VarM209028b4;
                i5d0VarExecute = rug0VarM173106a.f164918a.mo181341a(x1d0VarM209028b4).execute();
                rug0VarM173106a.f164921d = i5d0VarExecute;
                aug0Var2 = kng0Var.f127594a;
                if (i5d0VarExecute == null) {
                    throw new IOException("Please invoke execute first!");
                }
                int iM138673q4 = i5d0VarExecute.m138673q();
                i5d0Var3 = rug0VarM173106a.f164921d;
                if (i5d0Var3 == null) {
                    mapM118879l3 = null;
                } else {
                    mapM118879l3 = i5d0Var3.m138659F().m118879l();
                }
                oyg0Var.m169865h(aug0Var2, iM138673q4, mapM118879l3);
                strM183191a4 = rug0VarM173106a.m183191a("Content-Length");
                if (strM183191a4 == null) {
                    j3 = -1;
                } else {
                    j3 = Long.parseLong(strM183191a4);
                }
                kng0Var.f127596c = j3;
                rug0VarM173106a.f164920c = null;
                i5d0Var4 = rug0VarM173106a.f164921d;
                if (i5d0Var4 != null) {
                    i5d0Var4.close();
                }
                rug0VarM173106a.f164921d = null;
            }
            z2 = kng0Var.f127595b;
            j2 = kng0Var.f127596c;
            if (j2 == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            str = kng0Var.f127597d;
            str2 = kng0Var.f127598e;
            i = kng0Var.f127599f;
            aug0Var = this.f164482e;
            bog0Var = this.f164483f;
            if (ytg0.m217312d(aug0Var.f73510s.f136848a)) {
                if (ytg0.m217312d(str2)) {
                    str3 = aug0Var.f73494c;
                    matcher = nmg0.f142704c.matcher(str3);
                    strGroup = null;
                    while (matcher.find()) {
                        strGroup = matcher.group(1);
                    }
                    if (ytg0.m217312d(strGroup)) {
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
                        zpg0.m220844a("Can't find valid filename.");
                        return;
                    }
                    str2 = string;
                }
                if (ytg0.m217312d(aug0Var.f73510s.f136848a)) {
                    synchronized (aug0Var) {
                        if (ytg0.m217312d(aug0Var.f73510s.f136848a)) {
                            aug0Var.f73510s.f136848a = str2;
                            bog0Var.f77679f.f136848a = str2;
                        }
                    }
                }
            }
            bog0 bog0Var5 = this.f164483f;
            bog0Var5.f77682i = z3;
            bog0Var5.f77676c = str;
            if (jwg0.m147162a().f122919a.m139610i(this.f164482e)) {
                throw Sudif.f211028Suddo;
            }
            if (this.f164483f.m105681e() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            iM163816a = nmg0.m163816a(i, z4, this.f164483f, str);
            if (iM163816a == 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            this.f164479b = z5;
            this.f164480c = iM163816a;
            this.f164481d = j2;
            this.f164478a = z2;
            if (i == 416) {
            }
            if (this.f164483f.m105681e() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (i == 206) {
                return;
            } else {
                return;
            }
            throw new Sudcase(i, this.f164483f.m105681e());
        } catch (Throwable th3) {
            rug0VarM173106a2.f164920c = null;
            i5d0 i5d0Var8 = rug0VarM173106a2.f164921d;
            if (i5d0Var8 != null) {
                i5d0Var8.close();
            }
            rug0VarM173106a2.f164921d = null;
            throw th3;
        }
    }

    public final String toString() {
        return "acceptRange[" + this.f164478a + "] resumable[" + this.f164479b + "] failedCause[" + org0.m168920a(this.f164480c) + "] instanceLength[" + this.f164481d + "] " + super.toString();
    }
}
