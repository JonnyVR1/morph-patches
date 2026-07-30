package p153l;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.data.BLiveAssets;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class gwr extends dyd0<BLiveAssets> {
    public gwr(String str) {
        super(str, null, true, hxd0.DEFAULT_FILE_NAME);
    }

    @Override // p153l.dyd0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean checkEquals(@NonNull BLiveAssets bLiveAssets, BLiveAssets bLiveAssets2) {
        return bLiveAssets.equals(bLiveAssets2);
    }

    @Override // p153l.dyd0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public BLiveAssets copyed(BLiveAssets bLiveAssets, @NonNull BLiveAssets bLiveAssets2) {
        return bLiveAssets2.mo225055clone();
    }

    @Override // p153l.hxd0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public BLiveAssets retrieveValue() {
        String string = pref().getString(this.f111993id, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return BLiveAssets.JSON_ADAPTER.parse(string);
        } catch (IOException e) {
            CrashHelper.m82479c(e);
            return null;
        }
    }

    @Override // p153l.hxd0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SharedPreferences.Editor saveValue(BLiveAssets bLiveAssets) {
        return pref().edit().putString(this.f111993id, bLiveAssets.toJson());
    }
}
