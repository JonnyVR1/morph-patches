package p006l;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.core.data.LikedUserFilterSettings;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import l.bqd0;
import l.fpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class cpd0 extends bqd0<LikedUserFilterSettings> {
    public cpd0(String str, boolean z, String str2) {
        super(str, (Object) null, z, str2);
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean checkEquals(@NonNull LikedUserFilterSettings likedUserFilterSettings, LikedUserFilterSettings likedUserFilterSettings2) {
        return likedUserFilterSettings.equals(likedUserFilterSettings2);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LikedUserFilterSettings copyed(LikedUserFilterSettings likedUserFilterSettings, @NonNull LikedUserFilterSettings likedUserFilterSettings2) {
        return likedUserFilterSettings2.clone();
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public LikedUserFilterSettings retrieveValue() {
        String string = pref().getString(((fpd0) this).id, null);
        if (string == null) {
            return LikedUserFilterSettings.getDefaultSettings();
        }
        try {
            return (LikedUserFilterSettings) LikedUserFilterSettings.JSON_ADAPTER.parse(string);
        } catch (IOException e) {
            CrashHelper.c(e);
            return LikedUserFilterSettings.getDefaultSettings();
        }
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SharedPreferences.Editor saveValue(LikedUserFilterSettings likedUserFilterSettings) {
        return pref().edit().putString(((fpd0) this).id, likedUserFilterSettings.toJson());
    }
}
