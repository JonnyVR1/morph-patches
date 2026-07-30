package p153l;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.p051p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes10.dex */
public class nti {

    /* JADX INFO: renamed from: a */
    public m2m f143601a;

    /* JADX INFO: renamed from: l.nti$a */
    public static class C18947a {
        private static final nti INSTANCE = new nti();
    }

    public nti() {
        if (ive0.m142293g()) {
            this.f143601a = new mgy();
        } else {
            this.f143601a = new nt0();
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m164729c(Context context) {
        try {
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
            intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            intent.setData(Uri.parse("package:" + context.getPackageName()));
            if (!ive0.m142294h(context, intent)) {
                return false;
            }
            context.startActivity(intent);
            return true;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static nti m164730d() {
        return C18947a.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public boolean m164731a(Context context) {
        if (!m164733e()) {
            return false;
        }
        boolean zMo156866a = this.f143601a.mo156866a(context);
        if (!zMo156866a) {
            try {
                Intent intent = new Intent("android.settings.SETTINGS");
                intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                App.f16088e.startActivity(intent);
                return true;
            } catch (Exception e) {
                CrashHelper.m82479c(e);
                o1j0.m165651y("开启失败，请前往系统设置页打开悬浮窗权限");
            }
        }
        return zMo156866a;
    }

    /* JADX INFO: renamed from: b */
    public boolean m164732b(Context context) {
        return this.f143601a.mo142398b(context);
    }

    /* JADX INFO: renamed from: e */
    public boolean m164733e() {
        return this.f143601a.isSupported();
    }
}
