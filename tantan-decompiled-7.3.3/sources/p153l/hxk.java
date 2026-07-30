package p153l;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.App;
import com.tantanapp.common.utils.NullChecker;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import java.lang.reflect.UndeclaredThrowableException;

/* JADX INFO: loaded from: classes9.dex */
public class hxk {

    /* JADX INFO: renamed from: g */
    public static hxk f112015g;

    /* JADX INFO: renamed from: a */
    public boolean f112016a;

    /* JADX INFO: renamed from: b */
    public String f112017b = App.f16088e.getPackageName();

    /* JADX INFO: renamed from: c */
    public String f112018c;

    /* JADX INFO: renamed from: d */
    public String f112019d;

    /* JADX INFO: renamed from: e */
    public String f112020e;

    /* JADX INFO: renamed from: f */
    public String f112021f;

    public hxk() {
        m137628f();
    }

    /* JADX INFO: renamed from: c */
    public static hxk m137622c() {
        if (f112015g == null) {
            synchronized (hxk.class) {
                try {
                    if (f112015g == null) {
                        f112015g = new hxk();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f112015g;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m137623g() {
        return HardwareEarMonitorUtils.MANUFACTURER_HUAWEI.equals(ls4.f133389a) || "huawei_32".equals(ls4.f133389a) || "huawei_64".equals(ls4.f133389a);
    }

    /* JADX INFO: renamed from: a */
    public String m137624a() {
        return this.f112019d;
    }

    /* JADX INFO: renamed from: b */
    public String m137625b() {
        return this.f112020e;
    }

    /* JADX INFO: renamed from: d */
    public String m137626d() {
        return this.f112018c;
    }

    /* JADX INFO: renamed from: e */
    public String m137627e() {
        return this.f112021f;
    }

    /* JADX INFO: renamed from: f */
    public final void m137628f() {
        if (TextUtils.isEmpty(this.f112017b)) {
            return;
        }
        Uri uri = Uri.parse("content://com.huawei.appmarket.commondata/item/5");
        ContentResolver contentResolver = App.f16088e.getContentResolver();
        if (NullChecker.m82486a(contentResolver)) {
            Cursor cursorQuery = null;
            try {
                cursorQuery = contentResolver.query(uri, null, null, new String[]{this.f112017b}, null);
                if (NullChecker.m82486a(cursorQuery) && cursorQuery.moveToFirst()) {
                    this.f112016a = true;
                    this.f112018c = cursorQuery.getString(0);
                    this.f112019d = cursorQuery.getString(1);
                    this.f112020e = cursorQuery.getString(2);
                    if (cursorQuery.getColumnCount() > 4) {
                        this.f112021f = cursorQuery.getString(4);
                    }
                }
            } catch (SecurityException | UndeclaredThrowableException unused) {
            } finally {
                ua5.m195157a(cursorQuery);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m137629h() {
        return this.f112016a;
    }
}
