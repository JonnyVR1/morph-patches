package p153l;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.data.NewUserMonetizationConfig;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class czd0 extends dyd0<NewUserMonetizationConfig> {
    public czd0(String str, boolean z) {
        super(str, null, z, hxd0.DEFAULT_FILE_NAME);
    }

    @Override // p153l.dyd0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean checkEquals(@NonNull NewUserMonetizationConfig newUserMonetizationConfig, NewUserMonetizationConfig newUserMonetizationConfig2) {
        return newUserMonetizationConfig.equals(newUserMonetizationConfig2);
    }

    @Override // p153l.dyd0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NewUserMonetizationConfig copyed(NewUserMonetizationConfig newUserMonetizationConfig, @NonNull NewUserMonetizationConfig newUserMonetizationConfig2) {
        return newUserMonetizationConfig2.mo225055clone();
    }

    /* JADX INFO: renamed from: c */
    public final NewUserMonetizationConfig m113326c() {
        NewUserMonetizationConfig newUserMonetizationConfigNew_ = NewUserMonetizationConfig.new_();
        newUserMonetizationConfigNew_.hasPaid = false;
        newUserMonetizationConfigNew_.newUserRegisterDay = 1;
        return newUserMonetizationConfigNew_;
    }

    @Override // p153l.hxd0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public NewUserMonetizationConfig retrieveValue() {
        String string = pref().getString(this.f111993id, null);
        if (string == null) {
            return m113326c();
        }
        try {
            return NewUserMonetizationConfig.JSON_ADAPTER.parse(string);
        } catch (IOException e) {
            CrashHelper.m82479c(e);
            return m113326c();
        }
    }

    @Override // p153l.hxd0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public SharedPreferences.Editor saveValue(NewUserMonetizationConfig newUserMonetizationConfig) {
        return pref().edit().putString(this.f111993id, newUserMonetizationConfig.toJson());
    }
}
