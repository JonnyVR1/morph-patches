package com.tencent.connect.auth;

import com.tencent.tauth.IUiListener;
import java.util.HashMap;

/* JADX INFO: renamed from: com.tencent.connect.auth.b */
/* JADX INFO: loaded from: classes12.dex */
public class C13974b {

    /* JADX INFO: renamed from: a */
    public static C13974b f57954a = null;

    /* JADX INFO: renamed from: d */
    static final /* synthetic */ boolean f57955d = true;

    /* JADX INFO: renamed from: e */
    private static int f57956e;

    /* JADX INFO: renamed from: b */
    public HashMap<String, a> f57957b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public final String f57958c = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    /* JADX INFO: renamed from: com.tencent.connect.auth.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public IUiListener f57959a;

        /* JADX INFO: renamed from: b */
        public DialogC13973a f57960b;

        /* JADX INFO: renamed from: c */
        public String f57961c;
    }

    /* JADX INFO: renamed from: b */
    public static int m83246b() {
        int i = f57956e + 1;
        f57956e = i;
        return i;
    }

    /* JADX INFO: renamed from: a */
    public String m83247a(a aVar) {
        int iM83246b = m83246b();
        try {
            this.f57957b.put("" + iM83246b, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return "" + iM83246b;
    }

    /* JADX INFO: renamed from: c */
    public String m83248c() {
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
    public static C13974b m83245a() {
        if (f57954a == null) {
            f57954a = new C13974b();
        }
        return f57954a;
    }
}
