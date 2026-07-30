package p009l;

import android.content.Context;
import android.os.Build;
import com.p000p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.putong.data.SafetyModeConfig;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.FileFilter;
import l.e30;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class qod0 {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m21121b(boolean z, String[] strArr, final File file) {
        return !z || vwb.s(strArr, new w9j() { // from class: l.pod0
            public final Object call(Object obj) {
                return Boolean.valueOf(file.getName().startsWith((String) obj));
            }
        }) == null;
    }

    /* JADX INFO: renamed from: c */
    public static void m21122c(Context context) {
        try {
            String absolutePath = Build.VERSION.SDK_INT > 24 ? context.getDataDir().getAbsolutePath() : context.getCacheDir().getParent();
            m21123d(new File(context.getFilesDir(), "file_persistent"), new String[0]);
            m21123d(new File(absolutePath, "shared_prefs"), new String[0]);
            m21123d(new File(absolutePath, "tantan_save_value_dir"), "putongPref", "preferences");
            m21123d(new File(absolutePath, "databases"), "global_exceptions", "core_v2_", "event_tracking");
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m21123d(File file, final String... strArr) {
        if (file != null && file.exists() && file.isDirectory()) {
            final boolean z = NullChecker.a(strArr) && strArr.length > 0;
            File[] fileArrListFiles = file.listFiles(new FileFilter() { // from class: l.nod0
                @Override // java.io.FileFilter
                public final boolean accept(File file2) {
                    return qod0.m21121b(z, strArr, file2);
                }
            });
            if (NullChecker.a(fileArrListFiles)) {
                vwb.A(fileArrListFiles, new e30() { // from class: l.ood0
                    public final void call(Object obj) {
                        ((File) obj).delete();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static SafetyModeConfig m21124e() {
        SafetyModeConfig safetyModeConfig;
        try {
            safetyModeConfig = (SafetyModeConfig) RemoteConfig.m9619x().m9654v("SafetyModeConfig", SafetyModeConfig.JSON_ADAPTER);
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
