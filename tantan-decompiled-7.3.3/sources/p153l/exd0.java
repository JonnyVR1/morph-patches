package p153l;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.data.LikedUserFilterSettings;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class exd0 extends dyd0<LikedUserFilterSettings> {
    public exd0(String str, boolean z, String str2) {
        super(str, null, z, str2);
    }

    @Override // p153l.dyd0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean checkEquals(@NonNull LikedUserFilterSettings likedUserFilterSettings, LikedUserFilterSettings likedUserFilterSettings2) {
        return likedUserFilterSettings.equals(likedUserFilterSettings2);
    }

    @Override // p153l.dyd0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LikedUserFilterSettings copyed(LikedUserFilterSettings likedUserFilterSettings, @NonNull LikedUserFilterSettings likedUserFilterSettings2) {
        return likedUserFilterSettings2.mo225055clone();
    }

    @Override // p153l.hxd0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public LikedUserFilterSettings retrieveValue() {
        String string = pref().getString(this.f111993id, null);
        if (string == null) {
            return LikedUserFilterSettings.getDefaultSettings();
        }
        try {
            return LikedUserFilterSettings.JSON_ADAPTER.parse(string);
        } catch (IOException e) {
            CrashHelper.m82479c(e);
            return LikedUserFilterSettings.getDefaultSettings();
        }
    }

    @Override // p153l.hxd0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SharedPreferences.Editor saveValue(LikedUserFilterSettings likedUserFilterSettings) {
        return pref().edit().putString(this.f111993id, likedUserFilterSettings.toJson());
    }
}
