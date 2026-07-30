package p149l;

import android.content.Context;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.mmkv.MMKV;
import com.tencent.mmkv.MMKVHandler;
import com.tencent.mmkv.MMKVLogLevel;
import com.tencent.mmkv.MMKVRecoverStrategic;

/* JADX INFO: loaded from: classes11.dex */
public class zjw {

    /* JADX INFO: renamed from: l.zjw$a */
    public class C21721a implements MMKVHandler {
        @Override // com.tencent.mmkv.MMKVHandler
        public void mmkvLog(MMKVLogLevel mMKVLogLevel, String str, int i, String str2, String str3) {
            int i2 = C21722b.f203485a[mMKVLogLevel.ordinal()];
            if (i2 == 4 || i2 == 5) {
                du2.m113670a("[putong-common][mmkv]", "<" + str + ":" + i + "::" + str2 + "> " + str3);
            }
        }

        @Override // com.tencent.mmkv.MMKVHandler
        public MMKVRecoverStrategic onMMKVCRCCheckFail(String str) {
            CrashHelper.m81296c(new RuntimeException("MMKV onMMKVCRCCheckFail s=" + str));
            return null;
        }

        @Override // com.tencent.mmkv.MMKVHandler
        public MMKVRecoverStrategic onMMKVFileLengthError(String str) {
            CrashHelper.m81296c(new RuntimeException("MMKV onMMKVFileLengthError s=" + str));
            return null;
        }

        @Override // com.tencent.mmkv.MMKVHandler
        public boolean wantLogRedirecting() {
            return true;
        }
    }

    /* JADX INFO: renamed from: l.zjw$b */
    public static /* synthetic */ class C21722b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f203485a;

        static {
            int[] iArr = new int[MMKVLogLevel.values().length];
            f203485a = iArr;
            try {
                iArr[MMKVLogLevel.LevelNone.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f203485a[MMKVLogLevel.LevelDebug.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f203485a[MMKVLogLevel.LevelInfo.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f203485a[MMKVLogLevel.LevelWarning.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f203485a[MMKVLogLevel.LevelError.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m219151a() {
        fpd0.addSpName2MMKVSet("putongPref");
        gpd0.m127347a("putongPref");
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
    public static void m219152b(Context context) {
        if (o460.m162550c().equals(context.getPackageName())) {
            MMKV.registerHandler(new C21721a());
            MMKV.mmkvWithID(fpd0.DEFAULT_FILE_NAME);
            System.currentTimeMillis();
            m219151a();
            System.currentTimeMillis();
        }
    }
}
