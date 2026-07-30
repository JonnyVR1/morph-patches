package p002l;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.core.data.IntlRecordNightClub;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import l.bqd0;
import l.fpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class aqd0 extends bqd0<IntlRecordNightClub> {
    public aqd0(String str) {
        super(str, (Object) null);
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean checkEquals(@NonNull IntlRecordNightClub intlRecordNightClub, IntlRecordNightClub intlRecordNightClub2) {
        return intlRecordNightClub.equals(intlRecordNightClub2);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public IntlRecordNightClub copyed(IntlRecordNightClub intlRecordNightClub, @NonNull IntlRecordNightClub intlRecordNightClub2) {
        return intlRecordNightClub2.clone();
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public IntlRecordNightClub retrieveValue() {
        String string = pref().getString(((fpd0) this).id, null);
        IntlRecordNightClub intlRecordNightClub = (IntlRecordNightClub) ((fpd0) this).defaultValue;
        if (NullChecker.a(string)) {
            try {
                intlRecordNightClub = (IntlRecordNightClub) IntlRecordNightClub.JSON_ADAPTER.parse(string);
            } catch (IOException e) {
                CrashHelper.c(e);
            }
        }
        return intlRecordNightClub == null ? IntlRecordNightClub.new_() : intlRecordNightClub;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SharedPreferences.Editor saveValue(IntlRecordNightClub intlRecordNightClub) {
        return pref().edit().putString(((fpd0) this).id, intlRecordNightClub.toJson());
    }
}
