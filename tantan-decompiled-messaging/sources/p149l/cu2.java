package p149l;

import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.App;
import com.tantanapp.beatles.p072v2.data.MonitorEvent;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.io.File;

/* JADX INFO: loaded from: classes9.dex */
public class cu2 extends s2f {

    /* JADX INFO: renamed from: a */
    public static uqd0 f82522a = new uqd0("beatles_update_crash_ver", Constants.TEST_IDENTIFIER);

    /* JADX INFO: renamed from: b */
    public static uqd0 f82523b = new uqd0("beatles_fake_deviceid", "");

    /* JADX INFO: renamed from: c */
    public static uqd0 f82524c = new uqd0("beatles_last_page", "");

    /* JADX INFO: renamed from: d */
    public static final int f82525d = Process.myPid();

    /* JADX INFO: renamed from: c */
    public static void m108721c() {
        String str = f82524c.get();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String[] strArrSplit = str.split("&&");
        if (strArrSplit.length == 2) {
            nt2.m160807G(strArrSplit[0]);
            nt2.m160806F(strArrSplit[1]);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m108722d() {
        try {
            l3f l3fVar = new l3f();
            l3fVar.f125885d = EventNameEnum.APPCRASH;
            l3fVar.f125900s = "e_crash";
            zvf0.m220391m(l3fVar);
        } catch (Throwable th) {
            CrashHelper.m81296c(th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m108723e(String str) {
        f82524c.put(f82525d + "&&" + str);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String, l.oqf] */
    @Override // p149l.s2f
    @Nullable
    /* JADX INFO: renamed from: a */
    public oqf mo108724a(MonitorEvent monitorEvent) {
        Throwable throwable;
        try {
            if (!TextUtils.equals("crash", monitorEvent.getEventType()) || (throwable = monitorEvent.getThrowable()) == null) {
                return null;
            }
            ?? name = throwable.getClass().getName();
            try {
                if (name.equals(UnsatisfiedLinkError.class.getName())) {
                    oqf oqfVar = new oqf();
                    oqfVar.m165425d("sysProperty", dt3.m113534d() + "");
                    return oqfVar;
                }
                if (!name.equals(ClassNotFoundException.class.getName()) && !name.equals(IllegalAccessError.class.getName())) {
                    return null;
                }
                oqf oqfVar2 = new oqf();
                oqfVar2.m165425d("inst_apk_md5", ogw.m164283d(new File(App.f15369e.getPackageResourcePath())));
                oqfVar2.m165425d("latest_channel", mr4.m156015b());
                return oqfVar2;
            } catch (Throwable unused) {
                return name;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    @Override // p149l.s2f
    /* JADX INFO: renamed from: b */
    public boolean mo108725b(MonitorEvent monitorEvent) {
        if (!TextUtils.equals(monitorEvent.getEventType(), "crash")) {
            return false;
        }
        m108722d();
        return false;
    }
}
