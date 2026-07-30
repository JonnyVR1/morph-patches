package p153l;

import android.content.Context;
import android.os.Build;
import com.p051p1.mobile.putong.data.SafetyModeConfig;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.FileFilter;

/* JADX INFO: loaded from: classes10.dex */
public class swd0 {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m188274b(boolean z, String[] strArr, final File file) {
        return !z || jyb.m147530s(strArr, new qcj() { // from class: l.rwd0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(file.getName().startsWith((String) obj));
            }
        }) == null;
    }

    /* JADX INFO: renamed from: c */
    public static void m188275c(Context context) {
        try {
            String absolutePath = Build.VERSION.SDK_INT > 24 ? context.getDataDir().getAbsolutePath() : context.getCacheDir().getParent();
            m188276d(new File(context.getFilesDir(), "file_persistent"), new String[0]);
            m188276d(new File(absolutePath, "shared_prefs"), new String[0]);
            m188276d(new File(absolutePath, hxd0.MMKV_DIR), "putongPref", hxd0.DEFAULT_FILE_NAME);
            m188276d(new File(absolutePath, "databases"), "global_exceptions", "core_v2_", "event_tracking");
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m188276d(File file, final String... strArr) {
        if (file != null && file.exists() && file.isDirectory()) {
            final boolean z = NullChecker.m82486a(strArr) && strArr.length > 0;
            File[] fileArrListFiles = file.listFiles(new FileFilter() { // from class: l.pwd0
                @Override // java.io.FileFilter
                public final boolean accept(File file2) {
                    return swd0.m188274b(z, strArr, file2);
                }
            });
            if (NullChecker.m82486a(fileArrListFiles)) {
                jyb.m147470A(fileArrListFiles, new y20() { // from class: l.qwd0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        ((File) obj).delete();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static SafetyModeConfig m188277e() {
        SafetyModeConfig safetyModeConfig;
        try {
            safetyModeConfig = (SafetyModeConfig) RemoteConfig.m80481x().m80516v("SafetyModeConfig", SafetyModeConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            safetyModeConfig = null;
        }
        if (safetyModeConfig != null) {
            return safetyModeConfig;
        }
        SafetyModeConfig safetyModeConfigNew_ = SafetyModeConfig.new_();
        safetyModeConfigNew_.enable = true;
        safetyModeConfigNew_.protectActivity = false;
        safetyModeConfigNew_.protectEvent = false;
        safetyModeConfigNew_.resetAppData = false;
        safetyModeConfigNew_.resetUserData = false;
        return safetyModeConfigNew_;
    }
}
