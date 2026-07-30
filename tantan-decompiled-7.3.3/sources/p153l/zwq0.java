package p153l;

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
public abstract class zwq0 {

    /* JADX INFO: renamed from: l.zwq0$a */
    public static class C21913a extends ywq0 {
        public C21913a() {
            super(1);
        }

        @Override // p153l.ywq0
        /* JADX INFO: renamed from: b */
        public String mo217625b(Context context, String str, List<ltq0> list) {
            if (list == null) {
                return mtq0.m160030f(context, new URL(str));
            }
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            for (ltq0 ltq0Var : list) {
                builderBuildUpon.appendQueryParameter(ltq0Var.mo146917a(), ltq0Var.mo146918b());
            }
            return mtq0.m160030f(context, new URL(builderBuildUpon.toString()));
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m221944a(int i, int i2) {
        return (((i2 + 243) / 1448) * CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA) + 1080 + i + i2;
    }

    /* JADX INFO: renamed from: b */
    public static int m221945b(int i, int i2, int i3) {
        return (((i2 + 200) / 1448) * CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA) + 1011 + i2 + i + i3;
    }

    /* JADX INFO: renamed from: c */
    public static int m221946c(String str) {
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
    public static int m221947d(List<ltq0> list) {
        int length = 0;
        for (ltq0 ltq0Var : list) {
            if (!TextUtils.isEmpty(ltq0Var.mo146917a())) {
                length += ltq0Var.mo146917a().length();
            }
            if (!TextUtils.isEmpty(ltq0Var.mo146918b())) {
                length += ltq0Var.mo146918b().length();
            }
        }
        return length * 2;
    }

    /* JADX INFO: renamed from: e */
    private static int m221948e(ywq0 ywq0Var, String str, List<ltq0> list, String str2) {
        if (ywq0Var.m217624a() == 1) {
            return m221944a(str.length(), m221946c(str2));
        }
        if (ywq0Var.m217624a() != 2) {
            return -1;
        }
        return m221945b(str.length(), m221947d(list), m221946c(str2));
    }

    /* JADX INFO: renamed from: f */
    public static String m221949f(Context context, String str, List<ltq0> list) {
        return m221950g(context, str, list, new C21913a(), true);
    }

    /* JADX WARN: Code duplicated, block: B:74:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public static String m221950g(Context context, String str, List<ltq0> list, ywq0 ywq0Var, boolean z) {
        String str2;
        swq0 swq0VarM213402a;
        IOException iOException;
        String str3;
        String str4;
        if (!mtq0.m160044t(context)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            if (z) {
                swq0VarM213402a = xwq0.m213395a().m213402a(str);
                if (swq0VarM213402a != null) {
                    arrayList = swq0VarM213402a.m188336c(str);
                }
            } else {
                swq0VarM213402a = null;
            }
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
            String str5 = null;
            for (String str6 : arrayList) {
                ArrayList arrayList2 = list != null ? new ArrayList(list) : null;
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    if (!ywq0Var.m217626c(context, str6, arrayList2)) {
                        return str5;
                    }
                    String strMo217625b = ywq0Var.mo217625b(context, str6, arrayList2);
                    try {
                        if (!TextUtils.isEmpty(strMo217625b)) {
                            if (swq0VarM213402a != null) {
                                try {
                                    str2 = null;
                                    str4 = str6;
                                    swq0VarM213402a = swq0VarM213402a;
                                    swq0VarM213402a.m188344k(str4, System.currentTimeMillis() - jCurrentTimeMillis, m221948e(ywq0Var, str6, arrayList2, strMo217625b));
                                } catch (IOException e) {
                                    e = e;
                                    str2 = null;
                                }
                            }
                            return strMo217625b;
                        }
                        str4 = str6;
                        str2 = null;
                        if (swq0VarM213402a != null) {
                            try {
                                str3 = strMo217625b;
                                try {
                                    swq0VarM213402a.m188345l(str4, System.currentTimeMillis() - jCurrentTimeMillis, m221948e(ywq0Var, str4, arrayList2, strMo217625b), null);
                                } catch (IOException e2) {
                                    e = e2;
                                    str6 = str4;
                                    iOException = e;
                                    if (swq0VarM213402a != null) {
                                        try {
                                            swq0VarM213402a.m188345l(str6, System.currentTimeMillis() - jCurrentTimeMillis, m221948e(ywq0Var, str6, arrayList2, str3), iOException);
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
                                str3 = strMo217625b;
                            }
                        } else {
                            str3 = strMo217625b;
                        }
                        str5 = str3;
                        e = e4;
                        str6 = str4;
                        str3 = strMo217625b;
                    } catch (IOException e5) {
                        e = e5;
                        str3 = strMo217625b;
                        str2 = null;
                    }
                    iOException = e;
                } catch (IOException e6) {
                    str2 = null;
                    iOException = e6;
                    str3 = str5;
                }
                if (swq0VarM213402a != null) {
                    swq0VarM213402a.m188345l(str6, System.currentTimeMillis() - jCurrentTimeMillis, m221948e(ywq0Var, str6, arrayList2, str3), iOException);
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
