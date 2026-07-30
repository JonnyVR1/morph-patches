package com.tencent.connect.auth;

import com.tencent.tauth.IUiListener;
import java.util.HashMap;

/* JADX INFO: renamed from: com.tencent.connect.auth.b */
/* JADX INFO: loaded from: classes13.dex */
public class C13811b {

    /* JADX INFO: renamed from: a */
    public static C13811b f57106a = null;

    /* JADX INFO: renamed from: d */
    static final /* synthetic */ boolean f57107d = true;

    /* JADX INFO: renamed from: e */
    private static int f57108e;

    /* JADX INFO: renamed from: b */
    public HashMap<String, a> f57109b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public final String f57110c = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    /* JADX INFO: renamed from: com.tencent.connect.auth.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public IUiListener f57111a;

        /* JADX INFO: renamed from: b */
        public DialogC13810a f57112b;

        /* JADX INFO: renamed from: c */
        public String f57113c;
    }

    /* JADX INFO: renamed from: b */
    public static int m82063b() {
        int i = f57108e + 1;
        f57108e = i;
        return i;
    }

    /* JADX INFO: renamed from: a */
    public String m82064a(a aVar) {
        int iM82063b = m82063b();
        try {
            this.f57109b.put("" + iM82063b, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return "" + iM82063b;
    }

    /* JADX INFO: renamed from: c */
    public String m82065c() {
        int iCeil = (int) Math.ceil((Math.random() * 20.0d) + 3.0d);
        char[] charArray = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        int length = charArray.length;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iCeil; i++) {
            stringBuffer.append(charArray[(int) (Math.random() * ((double) length))]);
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    public static C13811b m82062a() {
        if (f57106a == null) {
            f57106a = new C13811b();
        }
        return f57106a;
    }
}
