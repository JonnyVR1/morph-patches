package p003l;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.data.NewUserMonetizationConfig;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import l.bqd0;
import l.fpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ard0 extends bqd0<NewUserMonetizationConfig> {
    public ard0(String str, boolean z) {
        super(str, (Object) null, z, "preferences");
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean checkEquals(@NonNull NewUserMonetizationConfig newUserMonetizationConfig, NewUserMonetizationConfig newUserMonetizationConfig2) {
        return newUserMonetizationConfig.equals(newUserMonetizationConfig2);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NewUserMonetizationConfig copyed(NewUserMonetizationConfig newUserMonetizationConfig, @NonNull NewUserMonetizationConfig newUserMonetizationConfig2) {
        return newUserMonetizationConfig2.m14542clone();
    }

    /* JADX INFO: renamed from: c */
    public final NewUserMonetizationConfig m5514c() {
        NewUserMonetizationConfig newUserMonetizationConfigNew_ = NewUserMonetizationConfig.new_();
        newUserMonetizationConfigNew_.hasPaid = false;
        newUserMonetizationConfigNew_.newUserRegisterDay = 1;
        return newUserMonetizationConfigNew_;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public NewUserMonetizationConfig retrieveValue() {
        String string = pref().getString(((fpd0) this).id, null);
        if (string == null) {
            return m5514c();
        }
        try {
            return (NewUserMonetizationConfig) NewUserMonetizationConfig.JSON_ADAPTER.parse(string);
        } catch (IOException e) {
            CrashHelper.c(e);
            return m5514c();
        }
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public SharedPreferences.Editor saveValue(NewUserMonetizationConfig newUserMonetizationConfig) {
        return pref().edit().putString(((fpd0) this).id, newUserMonetizationConfig.toJson());
    }
}
