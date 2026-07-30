package p153l;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.eclipse.jetty.http.HttpHeaderValues;

/* JADX INFO: loaded from: classes2.dex */
public class p2r0 {

    /* JADX INFO: renamed from: a */
    private static vsq0 f150293a = new vsq0(true);

    /* JADX INFO: renamed from: b */
    private static volatile int f150294b = -1;

    /* JADX INFO: renamed from: c */
    private static long f150295c = System.currentTimeMillis();

    /* JADX INFO: renamed from: d */
    private static final Object f150296d = new Object();

    /* JADX INFO: renamed from: e */
    private static List<C19278b> f150297e = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: f */
    private static String f150298f = "";

    /* JADX INFO: renamed from: g */
    private static csq0 f150299g = null;

    /* JADX INFO: renamed from: l.p2r0$a */
    public static class C19277a extends vsq0.AbstractC20930d {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Context f150300b;

        public C19277a(Context context) {
            this.f150300b = context;
        }

        @Override // p153l.vsq0.AbstractC20930d
        /* JADX INFO: renamed from: b */
        public void mo87758b() {
            ArrayList arrayList;
            synchronized (p2r0.f150296d) {
                arrayList = new ArrayList(p2r0.f150297e);
                p2r0.f150297e.clear();
            }
            p2r0.m170397o(this.f150300b, arrayList);
        }
    }

    /* JADX INFO: renamed from: l.p2r0$b */
    public static class C19278b {

        /* JADX INFO: renamed from: a */
        public String f150301a;

        /* JADX INFO: renamed from: b */
        public long f150302b;

        /* JADX INFO: renamed from: c */
        public int f150303c;

        /* JADX INFO: renamed from: d */
        public int f150304d;

        /* JADX INFO: renamed from: e */
        public String f150305e;

        /* JADX INFO: renamed from: f */
        public long f150306f;

        public C19278b(String str, long j, int i, int i2, String str2, long j2) {
            this.f150301a = str;
            this.f150302b = j;
            this.f150303c = i;
            this.f150304d = i2;
            this.f150305e = str2;
            this.f150306f = j2;
        }

        /* JADX INFO: renamed from: a */
        public boolean m170398a(C19278b c19278b) {
            return TextUtils.equals(c19278b.f150301a, this.f150301a) && TextUtils.equals(c19278b.f150305e, this.f150305e) && c19278b.f150303c == this.f150303c && c19278b.f150304d == this.f150304d && Math.abs(c19278b.f150302b - this.f150302b) <= Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m170383a(Context context) {
        if (f150294b == -1) {
            f150294b = m170396n(context);
        }
        return f150294b;
    }

    /* JADX INFO: renamed from: b */
    public static int m170384b(String str) {
        try {
            return str.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes().length;
        }
    }

    /* JADX INFO: renamed from: c */
    private static long m170385c(int i, long j, boolean z, long j2, boolean z2) {
        if (z && z2) {
            long j3 = f150295c;
            f150295c = j2;
            if (j2 - j3 > HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT && j > 1024) {
                return j * 2;
            }
        }
        return (j * ((long) (i == 0 ? 13 : 11))) / 10;
    }

    /* JADX INFO: renamed from: e */
    private static synchronized String m170387e(Context context) {
        if (TextUtils.isEmpty(f150298f)) {
            return "";
        }
        return f150298f;
    }

    /* JADX INFO: renamed from: g */
    private static csq0 m170389g(Context context) {
        csq0 csq0Var = f150299g;
        if (csq0Var != null) {
            return csq0Var;
        }
        csq0 csq0Var2 = new csq0(context);
        f150299g = csq0Var2;
        return csq0Var2;
    }

    /* JADX INFO: renamed from: h */
    public static void m170390h(Context context) {
        f150294b = m170396n(context);
    }

    /* JADX INFO: renamed from: i */
    private static void m170391i(Context context, String str, long j, boolean z, long j2) {
        int iM170383a;
        boolean zIsEmpty;
        if (context == null || TextUtils.isEmpty(str) || !"com.xiaomi.xmsf".equals(context.getPackageName()) || "com.xiaomi.xmsf".equals(str) || -1 == (iM170383a = m170383a(context))) {
            return;
        }
        synchronized (f150296d) {
            try {
                zIsEmpty = f150297e.isEmpty();
                m170395m(new C19278b(str, j2, iM170383a, z ? 1 : 0, iM170383a == 0 ? m170387e(context) : "", j));
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zIsEmpty) {
            f150293a.m202649f(new C19277a(context), Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m170392j(Context context, String str, long j, boolean z, boolean z2, long j2) {
        m170391i(context, str, m170385c(m170383a(context), j, z, j2, z2), z, j2);
    }

    /* JADX INFO: renamed from: l */
    public static synchronized void m170394l(String str) {
        if (!l4r0.m152835t() && !TextUtils.isEmpty(str)) {
            f150298f = str;
        }
    }

    /* JADX INFO: renamed from: m */
    private static void m170395m(C19278b c19278b) {
        for (C19278b c19278b2 : f150297e) {
            if (c19278b2.m170398a(c19278b)) {
                c19278b2.f150306f += c19278b.f150306f;
                return;
            }
        }
        f150297e.add(c19278b);
    }

    /* JADX INFO: renamed from: n */
    private static int m170396n(Context context) {
        ntq0 ntq0VarM160040p = mtq0.m160040p();
        if (ntq0VarM160040p == null) {
            return -1;
        }
        return ntq0VarM160040p.m164750a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static void m170397o(Context context, List<C19278b> list) {
        try {
            synchronized (csq0.f83481b) {
                try {
                    SQLiteDatabase writableDatabase = m170389g(context).getWritableDatabase();
                    writableDatabase.beginTransaction();
                    try {
                        for (C19278b c19278b : list) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("package_name", c19278b.f150301a);
                            contentValues.put("message_ts", Long.valueOf(c19278b.f150302b));
                            contentValues.put("network_type", Integer.valueOf(c19278b.f150303c));
                            contentValues.put(HttpHeaderValues.BYTES, Long.valueOf(c19278b.f150306f));
                            contentValues.put("rcv", Integer.valueOf(c19278b.f150304d));
                            contentValues.put("imsi", c19278b.f150305e);
                            writableDatabase.insert("traffic", null, contentValues);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            ouq0.m169397q(th3);
        }
    }
}
