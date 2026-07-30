package p149l;

import android.content.Context;
import android.os.Build;
import com.p046p1.mobile.putong.data.SafetyModeConfig;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.FileFilter;

/* JADX INFO: loaded from: classes11.dex */
public class qod0 {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m175732b(boolean z, String[] strArr, final File file) {
        return !z || vwb.m200347s(strArr, new w9j() { // from class: l.pod0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(file.getName().startsWith((String) obj));
            }
        }) == null;
    }

    /* JADX INFO: renamed from: c */
    public static void m175733c(Context context) {
        try {
            String absolutePath = Build.VERSION.SDK_INT > 24 ? context.getDataDir().getAbsolutePath() : context.getCacheDir().getParent();
            m175734d(new File(context.getFilesDir(), "file_persistent"), new String[0]);
            m175734d(new File(absolutePath, "shared_prefs"), new String[0]);
            m175734d(new File(absolutePath, fpd0.MMKV_DIR), "putongPref", fpd0.DEFAULT_FILE_NAME);
            m175734d(new File(absolutePath, "databases"), "global_exceptions", "core_v2_", "event_tracking");
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m175734d(File file, final String... strArr) {
        if (file != null && file.exists() && file.isDirectory()) {
            final boolean z = NullChecker.m81303a(strArr) && strArr.length > 0;
            File[] fileArrListFiles = file.listFiles(new FileFilter() { // from class: l.nod0
                @Override // java.io.FileFilter
                public final boolean accept(File file2) {
                    return qod0.m175732b(z, strArr, file2);
                }
            });
            if (NullChecker.m81303a(fileArrListFiles)) {
                vwb.m200287A(fileArrListFiles, new e30() { // from class: l.ood0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ((File) obj).delete();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static SafetyModeConfig m175735e() {
        SafetyModeConfig safetyModeConfig;
        try {
            safetyModeConfig = (SafetyModeConfig) RemoteConfig.m79298x().m79333v("SafetyModeConfig", SafetyModeConfig.JSON_ADAPTER);
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
