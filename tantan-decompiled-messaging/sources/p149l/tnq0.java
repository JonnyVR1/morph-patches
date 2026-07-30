package p149l;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tnq0 {

    /* JADX INFO: renamed from: l.tnq0$a */
    public static class C20217a extends snq0 {
        public C20217a() {
            super(1);
        }

        @Override // p149l.snq0
        /* JADX INFO: renamed from: b */
        public String mo185193b(Context context, String str, List<fkq0> list) {
            if (list == null) {
                return gkq0.m126677f(context, new URL(str));
            }
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            for (fkq0 fkq0Var : list) {
                builderBuildUpon.appendQueryParameter(fkq0Var.mo112271a(), fkq0Var.mo112272b());
            }
            return gkq0.m126677f(context, new URL(builderBuildUpon.toString()));
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m189816a(int i, int i2) {
        return (((i2 + 243) / 1448) * CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA) + 1080 + i + i2;
    }

    /* JADX INFO: renamed from: b */
    public static int m189817b(int i, int i2, int i3) {
        return (((i2 + 200) / 1448) * CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA) + 1011 + i2 + i + i3;
    }

    /* JADX INFO: renamed from: c */
    public static int m189818c(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return str.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m189819d(List<fkq0> list) {
        int length = 0;
        for (fkq0 fkq0Var : list) {
            if (!TextUtils.isEmpty(fkq0Var.mo112271a())) {
                length += fkq0Var.mo112271a().length();
            }
            if (!TextUtils.isEmpty(fkq0Var.mo112272b())) {
                length += fkq0Var.mo112272b().length();
            }
        }
        return length * 2;
    }

    /* JADX INFO: renamed from: e */
    private static int m189820e(snq0 snq0Var, String str, List<fkq0> list, String str2) {
        if (snq0Var.m185192a() == 1) {
            return m189816a(str.length(), m189818c(str2));
        }
        if (snq0Var.m185192a() != 2) {
            return -1;
        }
        return m189817b(str.length(), m189819d(list), m189818c(str2));
    }

    /* JADX INFO: renamed from: f */
    public static String m189821f(Context context, String str, List<fkq0> list) {
        return m189822g(context, str, list, new C20217a(), true);
    }

    /* JADX WARN: Code duplicated, block: B:74:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public static String m189822g(Context context, String str, List<fkq0> list, snq0 snq0Var, boolean z) {
        String str2;
        mnq0 mnq0VarM180133a;
        IOException iOException;
        String str3;
        String str4;
        if (!gkq0.m126691t(context)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            if (z) {
                mnq0VarM180133a = rnq0.m180126a().m180133a(str);
                if (mnq0VarM180133a != null) {
                    arrayList = mnq0VarM180133a.m155536c(str);
                }
            } else {
                mnq0VarM180133a = null;
            }
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
            String str5 = null;
            for (String str6 : arrayList) {
                ArrayList arrayList2 = list != null ? new ArrayList(list) : null;
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    if (!snq0Var.m185194c(context, str6, arrayList2)) {
                        return str5;
                    }
                    String strMo185193b = snq0Var.mo185193b(context, str6, arrayList2);
                    try {
                        if (!TextUtils.isEmpty(strMo185193b)) {
                            if (mnq0VarM180133a != null) {
                                try {
                                    str2 = null;
                                    str4 = str6;
                                    mnq0VarM180133a = mnq0VarM180133a;
                                    mnq0VarM180133a.m155544k(str4, System.currentTimeMillis() - jCurrentTimeMillis, m189820e(snq0Var, str6, arrayList2, strMo185193b));
                                } catch (IOException e) {
                                    e = e;
                                    str2 = null;
                                }
                            }
                            return strMo185193b;
                        }
                        str4 = str6;
                        str2 = null;
                        if (mnq0VarM180133a != null) {
                            try {
                                str3 = strMo185193b;
                                try {
                                    mnq0VarM180133a.m155545l(str4, System.currentTimeMillis() - jCurrentTimeMillis, m189820e(snq0Var, str4, arrayList2, strMo185193b), null);
                                } catch (IOException e2) {
                                    e = e2;
                                    str6 = str4;
                                    iOException = e;
                                    if (mnq0VarM180133a != null) {
                                        try {
                                            mnq0VarM180133a.m155545l(str6, System.currentTimeMillis() - jCurrentTimeMillis, m189820e(snq0Var, str6, arrayList2, str3), iOException);
                                        } catch (MalformedURLException e3) {
                                            e = e3;
                                            e.printStackTrace();
                                            return str2;
                                        }
                                    }
                                    iOException.printStackTrace();
                                }
                            } catch (IOException e4) {
                                e = e4;
                                str6 = str4;
                                str3 = strMo185193b;
                            }
                        } else {
                            str3 = strMo185193b;
                        }
                        str5 = str3;
                        e = e4;
                        str6 = str4;
                        str3 = strMo185193b;
                    } catch (IOException e5) {
                        e = e5;
                        str3 = strMo185193b;
                        str2 = null;
                    }
                    iOException = e;
                } catch (IOException e6) {
                    str2 = null;
                    iOException = e6;
                    str3 = str5;
                }
                if (mnq0VarM180133a != null) {
                    mnq0VarM180133a.m155545l(str6, System.currentTimeMillis() - jCurrentTimeMillis, m189820e(snq0Var, str6, arrayList2, str3), iOException);
                }
                iOException.printStackTrace();
                str5 = str3;
            }
            return str5;
        } catch (MalformedURLException e7) {
            e = e7;
            str2 = null;
        }
    }
}
