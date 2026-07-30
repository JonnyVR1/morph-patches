package p149l;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.data.LikedUserFilterSettings;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class cpd0 extends bqd0<LikedUserFilterSettings> {
    public cpd0(String str, boolean z, String str2) {
        super(str, null, z, str2);
    }

    @Override // p149l.bqd0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean checkEquals(@NonNull LikedUserFilterSettings likedUserFilterSettings, LikedUserFilterSettings likedUserFilterSettings2) {
        return likedUserFilterSettings.equals(likedUserFilterSettings2);
    }

    @Override // p149l.bqd0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LikedUserFilterSettings copyed(LikedUserFilterSettings likedUserFilterSettings, @NonNull LikedUserFilterSettings likedUserFilterSettings2) {
        return likedUserFilterSettings2.mo223809clone();
    }

    @Override // p149l.fpd0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public LikedUserFilterSettings retrieveValue() {
        String string = pref().getString(this.f98687id, null);
        if (string == null) {
            return LikedUserFilterSettings.getDefaultSettings();
        }
        try {
            return LikedUserFilterSettings.JSON_ADAPTER.parse(string);
        } catch (IOException e) {
            CrashHelper.m81296c(e);
            return LikedUserFilterSettings.getDefaultSettings();
        }
    }

    @Override // p149l.fpd0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SharedPreferences.Editor saveValue(LikedUserFilterSettings likedUserFilterSettings) {
        return pref().edit().putString(this.f98687id, likedUserFilterSettings.toJson());
    }
}
