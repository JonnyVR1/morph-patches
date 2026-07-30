package p006l;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.p1.mobile.android.app.App;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.UndeclaredThrowableException;
import l.t95;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ruk {

    /* JADX INFO: renamed from: g */
    public static ruk f20743g;

    /* JADX INFO: renamed from: a */
    public boolean f20744a;

    /* JADX INFO: renamed from: b */
    public String f20745b = App.e.getPackageName();

    /* JADX INFO: renamed from: c */
    public String f20746c;

    /* JADX INFO: renamed from: d */
    public String f20747d;

    /* JADX INFO: renamed from: e */
    public String f20748e;

    /* JADX INFO: renamed from: f */
    public String f20749f;

    public ruk() {
        m22957f();
    }

    /* JADX INFO: renamed from: c */
    public static ruk m22951c() {
        if (f20743g == null) {
            synchronized (ruk.class) {
                try {
                    if (f20743g == null) {
                        f20743g = new ruk();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f20743g;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m22952g() {
        return "huawei".equals(mr4.f17192a) || "huawei_32".equals(mr4.f17192a) || "huawei_64".equals(mr4.f17192a);
    }

    /* JADX INFO: renamed from: a */
    public String m22953a() {
        return this.f20747d;
    }

    /* JADX INFO: renamed from: b */
    public String m22954b() {
        return this.f20748e;
    }

    /* JADX INFO: renamed from: d */
    public String m22955d() {
        return this.f20746c;
    }

    /* JADX INFO: renamed from: e */
    public String m22956e() {
        return this.f20749f;
    }

    /* JADX INFO: renamed from: f */
    public final void m22957f() {
        if (TextUtils.isEmpty(this.f20745b)) {
            return;
        }
        Uri uri = Uri.parse("content://com.huawei.appmarket.commondata/item/5");
        ContentResolver contentResolver = App.e.getContentResolver();
        if (NullChecker.a(contentResolver)) {
            Cursor cursorQuery = null;
            try {
                cursorQuery = contentResolver.query(uri, null, null, new String[]{this.f20745b}, null);
                if (NullChecker.a(cursorQuery) && cursorQuery.moveToFirst()) {
                    this.f20744a = true;
                    this.f20746c = cursorQuery.getString(0);
                    this.f20747d = cursorQuery.getString(1);
                    this.f20748e = cursorQuery.getString(2);
                    if (cursorQuery.getColumnCount() > 4) {
                        this.f20749f = cursorQuery.getString(4);
                    }
                }
            } catch (SecurityException | UndeclaredThrowableException unused) {
            } finally {
                t95.a(cursorQuery);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m22958h() {
        return this.f20744a;
    }
}
