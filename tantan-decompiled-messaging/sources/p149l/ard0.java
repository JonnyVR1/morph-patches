package p149l;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.data.NewUserMonetizationConfig;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class ard0 extends bqd0<NewUserMonetizationConfig> {
    public ard0(String str, boolean z) {
        super(str, null, z, fpd0.DEFAULT_FILE_NAME);
    }

    @Override // p149l.bqd0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean checkEquals(@NonNull NewUserMonetizationConfig newUserMonetizationConfig, NewUserMonetizationConfig newUserMonetizationConfig2) {
        return newUserMonetizationConfig.equals(newUserMonetizationConfig2);
    }

    @Override // p149l.bqd0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NewUserMonetizationConfig copyed(NewUserMonetizationConfig newUserMonetizationConfig, @NonNull NewUserMonetizationConfig newUserMonetizationConfig2) {
        return newUserMonetizationConfig2.mo223809clone();
    }

    /* JADX INFO: renamed from: c */
    public final NewUserMonetizationConfig m98384c() {
        NewUserMonetizationConfig newUserMonetizationConfigNew_ = NewUserMonetizationConfig.new_();
        newUserMonetizationConfigNew_.hasPaid = false;
        newUserMonetizationConfigNew_.newUserRegisterDay = 1;
        return newUserMonetizationConfigNew_;
    }

    @Override // p149l.fpd0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public NewUserMonetizationConfig retrieveValue() {
        String string = pref().getString(this.f98687id, null);
        if (string == null) {
            return m98384c();
        }
        try {
            return NewUserMonetizationConfig.JSON_ADAPTER.parse(string);
        } catch (IOException e) {
            CrashHelper.m81296c(e);
            return m98384c();
        }
    }

    @Override // p149l.fpd0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public SharedPreferences.Editor saveValue(NewUserMonetizationConfig newUserMonetizationConfig) {
        return pref().edit().putString(this.f98687id, newUserMonetizationConfig.toJson());
    }
}
