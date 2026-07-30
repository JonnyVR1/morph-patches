package p149l;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.App;
import com.tantanapp.common.utils.NullChecker;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import java.lang.reflect.UndeclaredThrowableException;

/* JADX INFO: loaded from: classes9.dex */
public class ruk {

    /* JADX INFO: renamed from: g */
    public static ruk f161067g;

    /* JADX INFO: renamed from: a */
    public boolean f161068a;

    /* JADX INFO: renamed from: b */
    public String f161069b = App.f15369e.getPackageName();

    /* JADX INFO: renamed from: c */
    public String f161070c;

    /* JADX INFO: renamed from: d */
    public String f161071d;

    /* JADX INFO: renamed from: e */
    public String f161072e;

    /* JADX INFO: renamed from: f */
    public String f161073f;

    public ruk() {
        m180878f();
    }

    /* JADX INFO: renamed from: c */
    public static ruk m180872c() {
        if (f161067g == null) {
            synchronized (ruk.class) {
                try {
                    if (f161067g == null) {
                        f161067g = new ruk();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f161067g;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m180873g() {
        return HardwareEarMonitorUtils.MANUFACTURER_HUAWEI.equals(mr4.f135329a) || "huawei_32".equals(mr4.f135329a) || "huawei_64".equals(mr4.f135329a);
    }

    /* JADX INFO: renamed from: a */
    public String m180874a() {
        return this.f161071d;
    }

    /* JADX INFO: renamed from: b */
    public String m180875b() {
        return this.f161072e;
    }

    /* JADX INFO: renamed from: d */
    public String m180876d() {
        return this.f161070c;
    }

    /* JADX INFO: renamed from: e */
    public String m180877e() {
        return this.f161073f;
    }

    /* JADX INFO: renamed from: f */
    public final void m180878f() {
        if (TextUtils.isEmpty(this.f161069b)) {
            return;
        }
        Uri uri = Uri.parse("content://com.huawei.appmarket.commondata/item/5");
        ContentResolver contentResolver = App.f15369e.getContentResolver();
        if (NullChecker.m81303a(contentResolver)) {
            Cursor cursorQuery = null;
            try {
                cursorQuery = contentResolver.query(uri, null, null, new String[]{this.f161069b}, null);
                if (NullChecker.m81303a(cursorQuery) && cursorQuery.moveToFirst()) {
                    this.f161068a = true;
                    this.f161070c = cursorQuery.getString(0);
                    this.f161071d = cursorQuery.getString(1);
                    this.f161072e = cursorQuery.getString(2);
                    if (cursorQuery.getColumnCount() > 4) {
                        this.f161073f = cursorQuery.getString(4);
                    }
                }
            } catch (SecurityException | UndeclaredThrowableException unused) {
            } finally {
                t95.m187603a(cursorQuery);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m180879h() {
        return this.f161068a;
    }
}
