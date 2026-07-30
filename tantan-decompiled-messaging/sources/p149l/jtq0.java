package p149l;

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
public class jtq0 {

    /* JADX INFO: renamed from: a */
    private static pjq0 f119657a = new pjq0(true);

    /* JADX INFO: renamed from: b */
    private static volatile int f119658b = -1;

    /* JADX INFO: renamed from: c */
    private static long f119659c = System.currentTimeMillis();

    /* JADX INFO: renamed from: d */
    private static final Object f119660d = new Object();

    /* JADX INFO: renamed from: e */
    private static List<C17859b> f119661e = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: f */
    private static String f119662f = "";

    /* JADX INFO: renamed from: g */
    private static xiq0 f119663g = null;

    /* JADX INFO: renamed from: l.jtq0$a */
    public static class C17858a extends pjq0.AbstractC19254d {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Context f119664b;

        public C17858a(Context context) {
            this.f119664b = context;
        }

        @Override // p149l.pjq0.AbstractC19254d
        /* JADX INFO: renamed from: b */
        public void mo86587b() {
            ArrayList arrayList;
            synchronized (jtq0.f119660d) {
                arrayList = new ArrayList(jtq0.f119661e);
                jtq0.f119661e.clear();
            }
            jtq0.m143173o(this.f119664b, arrayList);
        }
    }

    /* JADX INFO: renamed from: l.jtq0$b */
    public static class C17859b {

        /* JADX INFO: renamed from: a */
        public String f119665a;

        /* JADX INFO: renamed from: b */
        public long f119666b;

        /* JADX INFO: renamed from: c */
        public int f119667c;

        /* JADX INFO: renamed from: d */
        public int f119668d;

        /* JADX INFO: renamed from: e */
        public String f119669e;

        /* JADX INFO: renamed from: f */
        public long f119670f;

        public C17859b(String str, long j, int i, int i2, String str2, long j2) {
            this.f119665a = str;
            this.f119666b = j;
            this.f119667c = i;
            this.f119668d = i2;
            this.f119669e = str2;
            this.f119670f = j2;
        }

        /* JADX INFO: renamed from: a */
        public boolean m143174a(C17859b c17859b) {
            return TextUtils.equals(c17859b.f119665a, this.f119665a) && TextUtils.equals(c17859b.f119669e, this.f119669e) && c17859b.f119667c == this.f119667c && c17859b.f119668d == this.f119668d && Math.abs(c17859b.f119666b - this.f119666b) <= Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m143159a(Context context) {
        if (f119658b == -1) {
            f119658b = m143172n(context);
        }
        return f119658b;
    }

    /* JADX INFO: renamed from: b */
    public static int m143160b(String str) {
        try {
            return str.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes().length;
        }
    }

    /* JADX INFO: renamed from: c */
    private static long m143161c(int i, long j, boolean z, long j2, boolean z2) {
        if (z && z2) {
            long j3 = f119659c;
            f119659c = j2;
            if (j2 - j3 > HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT && j > 1024) {
                return j * 2;
            }
        }
        return (j * ((long) (i == 0 ? 13 : 11))) / 10;
    }

    /* JADX INFO: renamed from: e */
    private static synchronized String m143163e(Context context) {
        if (TextUtils.isEmpty(f119662f)) {
            return "";
        }
        return f119662f;
    }

    /* JADX INFO: renamed from: g */
    private static xiq0 m143165g(Context context) {
        xiq0 xiq0Var = f119663g;
        if (xiq0Var != null) {
            return xiq0Var;
        }
        xiq0 xiq0Var2 = new xiq0(context);
        f119663g = xiq0Var2;
        return xiq0Var2;
    }

    /* JADX INFO: renamed from: h */
    public static void m143166h(Context context) {
        f119658b = m143172n(context);
    }

    /* JADX INFO: renamed from: i */
    private static void m143167i(Context context, String str, long j, boolean z, long j2) {
        int iM143159a;
        boolean zIsEmpty;
        if (context == null || TextUtils.isEmpty(str) || !"com.xiaomi.xmsf".equals(context.getPackageName()) || "com.xiaomi.xmsf".equals(str) || -1 == (iM143159a = m143159a(context))) {
            return;
        }
        synchronized (f119660d) {
            try {
                zIsEmpty = f119661e.isEmpty();
                m143171m(new C17859b(str, j2, iM143159a, z ? 1 : 0, iM143159a == 0 ? m143163e(context) : "", j));
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zIsEmpty) {
            f119657a.m169927f(new C17858a(context), Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m143168j(Context context, String str, long j, boolean z, boolean z2, long j2) {
        m143167i(context, str, m143161c(m143159a(context), j, z, j2, z2), z, j2);
    }

    /* JADX INFO: renamed from: l */
    public static synchronized void m143170l(String str) {
        if (!fvq0.m123366t() && !TextUtils.isEmpty(str)) {
            f119662f = str;
        }
    }

    /* JADX INFO: renamed from: m */
    private static void m143171m(C17859b c17859b) {
        for (C17859b c17859b2 : f119661e) {
            if (c17859b2.m143174a(c17859b)) {
                c17859b2.f119670f += c17859b.f119670f;
                return;
            }
        }
        f119661e.add(c17859b);
    }

    /* JADX INFO: renamed from: n */
    private static int m143172n(Context context) {
        hkq0 hkq0VarM126687p = gkq0.m126687p();
        if (hkq0VarM126687p == null) {
            return -1;
        }
        return hkq0VarM126687p.m131578a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static void m143173o(Context context, List<C17859b> list) {
        try {
            synchronized (xiq0.f193149b) {
                try {
                    SQLiteDatabase writableDatabase = m143165g(context).getWritableDatabase();
                    writableDatabase.beginTransaction();
                    try {
                        for (C17859b c17859b : list) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("package_name", c17859b.f119665a);
                            contentValues.put("message_ts", Long.valueOf(c17859b.f119666b));
                            contentValues.put("network_type", Integer.valueOf(c17859b.f119667c));
                            contentValues.put(HttpHeaderValues.BYTES, Long.valueOf(c17859b.f119670f));
                            contentValues.put("rcv", Integer.valueOf(c17859b.f119668d));
                            contentValues.put("imsi", c17859b.f119669e);
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
            ilq0.m137044q(th3);
        }
    }
}
