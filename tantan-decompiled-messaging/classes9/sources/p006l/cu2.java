package p006l;

import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.App;
import com.tantanapp.beatles.v2.data.MonitorEvent;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.io.File;
import l.dt3;
import l.l3f;
import l.nt2;
import l.ogw;
import l.oqf;
import l.s2f;
import l.uqd0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class cu2 extends s2f {

    /* JADX INFO: renamed from: a */
    public static uqd0 f9841a = new uqd0("beatles_update_crash_ver", "0_0");

    /* JADX INFO: renamed from: b */
    public static uqd0 f9842b = new uqd0("beatles_fake_deviceid", "");

    /* JADX INFO: renamed from: c */
    public static uqd0 f9843c = new uqd0("beatles_last_page", "");

    /* JADX INFO: renamed from: d */
    public static final int f9844d = Process.myPid();

    /* JADX INFO: renamed from: c */
    public static void m13640c() {
        String str = (String) f9843c.get();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String[] strArrSplit = str.split("&&");
        if (strArrSplit.length == 2) {
            nt2.G(strArrSplit[0]);
            nt2.F(strArrSplit[1]);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m13641d() {
        try {
            l3f l3fVar = new l3f();
            l3fVar.d = EventNameEnum.APPCRASH;
            l3fVar.s = "e_crash";
            zvf0.m(l3fVar);
        } catch (Throwable th) {
            CrashHelper.c(th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m13642e(String str) {
        f9843c.put(f9844d + "&&" + str);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public oqf m13643a(MonitorEvent monitorEvent) {
        Throwable throwable;
        try {
            if (!TextUtils.equals("crash", monitorEvent.getEventType()) || (throwable = monitorEvent.getThrowable()) == null) {
                return null;
            }
            String name = throwable.getClass().getName();
            try {
                if (name.equals(UnsatisfiedLinkError.class.getName())) {
                    oqf oqfVar = new oqf();
                    oqfVar.d("sysProperty", dt3.d() + "");
                    return oqfVar;
                }
                if (!name.equals(ClassNotFoundException.class.getName()) && !name.equals(IllegalAccessError.class.getName())) {
                    return null;
                }
                oqf oqfVar2 = new oqf();
                oqfVar2.d("inst_apk_md5", ogw.d(new File(App.e.getPackageResourcePath())));
                oqfVar2.d("latest_channel", mr4.m19499b());
                return oqfVar2;
            } catch (Throwable unused) {
                return name;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m13644b(MonitorEvent monitorEvent) {
        if (!TextUtils.equals(monitorEvent.getEventType(), "crash")) {
            return false;
        }
        m13641d();
        return false;
    }
}
