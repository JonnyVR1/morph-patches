package p009l;

import android.content.Context;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.mmkv.MMKV;
import com.tencent.mmkv.MMKVHandler;
import com.tencent.mmkv.MMKVLogLevel;
import com.tencent.mmkv.MMKVRecoverStrategic;
import l.du2;
import l.fpd0;
import l.gpd0;
import l.o460;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class zjw {

    /* JADX INFO: renamed from: l.zjw$a */
    public class C1367a implements MMKVHandler {
        public void mmkvLog(MMKVLogLevel mMKVLogLevel, String str, int i, String str2, String str3) {
            int i2 = C1368b.f23714a[mMKVLogLevel.ordinal()];
            if (i2 == 4 || i2 == 5) {
                du2.a("[putong-common][mmkv]", "<" + str + ":" + i + "::" + str2 + "> " + str3);
            }
        }

        public MMKVRecoverStrategic onMMKVCRCCheckFail(String str) {
            CrashHelper.c(new RuntimeException("MMKV onMMKVCRCCheckFail s=" + str));
            return null;
        }

        public MMKVRecoverStrategic onMMKVFileLengthError(String str) {
            CrashHelper.c(new RuntimeException("MMKV onMMKVFileLengthError s=" + str));
            return null;
        }

        public boolean wantLogRedirecting() {
            return true;
        }
    }

    /* JADX INFO: renamed from: l.zjw$b */
    public static /* synthetic */ class C1368b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f23714a;

        static {
            int[] iArr = new int[MMKVLogLevel.values().length];
            f23714a = iArr;
            try {
                iArr[MMKVLogLevel.LevelNone.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23714a[MMKVLogLevel.LevelDebug.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23714a[MMKVLogLevel.LevelInfo.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23714a[MMKVLogLevel.LevelWarning.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23714a[MMKVLogLevel.LevelError.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m25838a() {
        fpd0.addSpName2MMKVSet("putongPref");
        gpd0.a("putongPref");
        fpd0.addSpName2MMKVSet("sp_sticker_click_state");
        fpd0.addSpName2MMKVSet("IS_FIRST_GET_CATEGORY_STATE_SP_NAME");
        fpd0.addSpName2MMKVSet("sp_first_camera_category_state");
        fpd0.addSpName2MMKVSet("click_camera_category_state_sp_name");
        fpd0.addSpName2MMKVSet("MessageCountToday");
        fpd0.addSpName2MMKVSet("tanker_plugin");
        fpd0.addSpName2MMKVSet("filepersistentsp");
        fpd0.addSpName2MMKVSet("account_sp_sticker_max_create_time");
        fpd0.addSpName2MMKVSet("account_sp_sticker_click_state");
        fpd0.addSpName2MMKVSet("account_is_first_get_category_state_sp_name");
        fpd0.addSpName2MMKVSet("account_sp_first_camera_category_state");
        fpd0.addSpName2MMKVSet("account_click_camera_category_state_sp_name");
    }

    /* JADX INFO: renamed from: b */
    public static void m25839b(Context context) {
        if (o460.c().equals(context.getPackageName())) {
            MMKV.registerHandler(new C1367a());
            MMKV.mmkvWithID("preferences");
            System.currentTimeMillis();
            m25838a();
            System.currentTimeMillis();
        }
    }
}
