package p153l;

import android.content.Context;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.mmkv.MMKV;
import com.tencent.mmkv.MMKVHandler;
import com.tencent.mmkv.MMKVLogLevel;
import com.tencent.mmkv.MMKVRecoverStrategic;

/* JADX INFO: loaded from: classes10.dex */
public class ymw {

    /* JADX INFO: renamed from: l.ymw$a */
    public class C21634a implements MMKVHandler {
        @Override // com.tencent.mmkv.MMKVHandler
        public void mmkvLog(MMKVLogLevel mMKVLogLevel, String str, int i, String str2, String str3) {
            int i2 = C21635b.f200720a[mMKVLogLevel.ordinal()];
            if (i2 == 4 || i2 == 5) {
                tu2.m192703a("[putong-common][mmkv]", "<" + str + ":" + i + "::" + str2 + "> " + str3);
            }
        }

        @Override // com.tencent.mmkv.MMKVHandler
        public MMKVRecoverStrategic onMMKVCRCCheckFail(String str) {
            CrashHelper.m82479c(new RuntimeException("MMKV onMMKVCRCCheckFail s=" + str));
            return null;
        }

        @Override // com.tencent.mmkv.MMKVHandler
        public MMKVRecoverStrategic onMMKVFileLengthError(String str) {
            CrashHelper.m82479c(new RuntimeException("MMKV onMMKVFileLengthError s=" + str));
            return null;
        }

        @Override // com.tencent.mmkv.MMKVHandler
        public boolean wantLogRedirecting() {
            return true;
        }
    }

    /* JADX INFO: renamed from: l.ymw$b */
    public static /* synthetic */ class C21635b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f200720a;

        static {
            int[] iArr = new int[MMKVLogLevel.values().length];
            f200720a = iArr;
            try {
                iArr[MMKVLogLevel.LevelNone.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f200720a[MMKVLogLevel.LevelDebug.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f200720a[MMKVLogLevel.LevelInfo.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f200720a[MMKVLogLevel.LevelWarning.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f200720a[MMKVLogLevel.LevelError.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m216738a() {
        hxd0.addSpName2MMKVSet("putongPref");
        ixd0.m142509a("putongPref");
        hxd0.addSpName2MMKVSet("sp_sticker_click_state");
        hxd0.addSpName2MMKVSet("IS_FIRST_GET_CATEGORY_STATE_SP_NAME");
        hxd0.addSpName2MMKVSet("sp_first_camera_category_state");
        hxd0.addSpName2MMKVSet("click_camera_category_state_sp_name");
        hxd0.addSpName2MMKVSet("MessageCountToday");
        hxd0.addSpName2MMKVSet("tanker_plugin");
        hxd0.addSpName2MMKVSet("filepersistentsp");
        hxd0.addSpName2MMKVSet("account_sp_sticker_max_create_time");
        hxd0.addSpName2MMKVSet("account_sp_sticker_click_state");
        hxd0.addSpName2MMKVSet("account_is_first_get_category_state_sp_name");
        hxd0.addSpName2MMKVSet("account_sp_first_camera_category_state");
        hxd0.addSpName2MMKVSet("account_click_camera_category_state_sp_name");
    }

    /* JADX INFO: renamed from: b */
    public static void m216739b(Context context) {
        if (uc60.m195380c().equals(context.getPackageName())) {
            MMKV.registerHandler(new C21634a());
            MMKV.mmkvWithID(hxd0.DEFAULT_FILE_NAME);
            System.currentTimeMillis();
            m216738a();
            System.currentTimeMillis();
        }
    }
}
