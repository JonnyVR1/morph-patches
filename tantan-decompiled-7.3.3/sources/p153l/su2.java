package p153l;

import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.App;
import com.tantanapp.beatles.p077v2.data.MonitorEvent;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.io.File;

/* JADX INFO: loaded from: classes9.dex */
public class su2 extends x3f {

    /* JADX INFO: renamed from: a */
    public static wyd0 f170637a = new wyd0("beatles_update_crash_ver", Constants.TEST_IDENTIFIER);

    /* JADX INFO: renamed from: b */
    public static wyd0 f170638b = new wyd0("beatles_fake_deviceid", "");

    /* JADX INFO: renamed from: c */
    public static wyd0 f170639c = new wyd0("beatles_last_page", "");

    /* JADX INFO: renamed from: d */
    public static final int f170640d = Process.myPid();

    /* JADX INFO: renamed from: c */
    public static void m187982c() {
        String str = f170639c.get();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String[] strArrSplit = str.split("&&");
        if (strArrSplit.length == 2) {
            du2.m118038G(strArrSplit[0]);
            du2.m118037F(strArrSplit[1]);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m187983d() {
        try {
            q4f q4fVar = new q4f();
            q4fVar.f155566d = EventNameEnum.APPCRASH;
            q4fVar.f155581s = "e_crash";
            i4g0.m138515m(q4fVar);
        } catch (Throwable th) {
            CrashHelper.m82479c(th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m187984e(String str) {
        f170639c.put(f170640d + "&&" + str);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String, l.vrf] */
    @Override // p153l.x3f
    @Nullable
    /* JADX INFO: renamed from: a */
    public vrf mo187985a(MonitorEvent monitorEvent) {
        Throwable throwable;
        try {
            if (!TextUtils.equals("crash", monitorEvent.getEventType()) || (throwable = monitorEvent.getThrowable()) == null) {
                return null;
            }
            ?? name = throwable.getClass().getName();
            try {
                if (name.equals(UnsatisfiedLinkError.class.getName())) {
                    vrf vrfVar = new vrf();
                    vrfVar.m202493d("sysProperty", cu3.m112652d() + "");
                    return vrfVar;
                }
                if (!name.equals(ClassNotFoundException.class.getName()) && !name.equals(IllegalAccessError.class.getName())) {
                    return null;
                }
                vrf vrfVar2 = new vrf();
                vrfVar2.m202493d("inst_apk_md5", niw.m163314d(new File(App.f16088e.getPackageResourcePath())));
                vrfVar2.m202493d("latest_channel", ls4.m155671b());
                return vrfVar2;
            } catch (Throwable unused) {
                return name;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    @Override // p153l.x3f
    /* JADX INFO: renamed from: b */
    public boolean mo187986b(MonitorEvent monitorEvent) {
        if (!TextUtils.equals(monitorEvent.getEventType(), "crash")) {
            return false;
        }
        m187983d();
        return false;
    }
}
