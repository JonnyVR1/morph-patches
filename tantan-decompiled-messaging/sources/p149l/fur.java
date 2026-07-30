package p149l;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.data.BLiveAssets;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class fur extends bqd0<BLiveAssets> {
    public fur(String str) {
        super(str, null, true, fpd0.DEFAULT_FILE_NAME);
    }

    @Override // p149l.bqd0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean checkEquals(@NonNull BLiveAssets bLiveAssets, BLiveAssets bLiveAssets2) {
        return bLiveAssets.equals(bLiveAssets2);
    }

    @Override // p149l.bqd0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public BLiveAssets copyed(BLiveAssets bLiveAssets, @NonNull BLiveAssets bLiveAssets2) {
        return bLiveAssets2.mo223809clone();
    }

    @Override // p149l.fpd0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public BLiveAssets retrieveValue() {
        String string = pref().getString(this.f98687id, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return BLiveAssets.JSON_ADAPTER.parse(string);
        } catch (IOException e) {
            CrashHelper.m81296c(e);
            return null;
        }
    }

    @Override // p149l.fpd0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SharedPreferences.Editor saveValue(BLiveAssets bLiveAssets) {
        return pref().edit().putString(this.f98687id, bLiveAssets.toJson());
    }
}
