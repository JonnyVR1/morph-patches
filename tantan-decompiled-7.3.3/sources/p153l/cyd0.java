package p153l;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.data.IntlRecordNightClub;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class cyd0 extends dyd0<IntlRecordNightClub> {
    public cyd0(String str) {
        super(str, null);
    }

    @Override // p153l.dyd0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean checkEquals(@NonNull IntlRecordNightClub intlRecordNightClub, IntlRecordNightClub intlRecordNightClub2) {
        return intlRecordNightClub.equals(intlRecordNightClub2);
    }

    @Override // p153l.dyd0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public IntlRecordNightClub copyed(IntlRecordNightClub intlRecordNightClub, @NonNull IntlRecordNightClub intlRecordNightClub2) {
        return intlRecordNightClub2.mo225055clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.hxd0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public IntlRecordNightClub retrieveValue() throws IOException {
        String string = pref().getString(this.f111993id, null);
        IntlRecordNightClub intlRecordNightClub = (IntlRecordNightClub) this.defaultValue;
        if (NullChecker.m82486a(string)) {
            try {
                intlRecordNightClub = IntlRecordNightClub.JSON_ADAPTER.parse(string);
            } catch (IOException e) {
                CrashHelper.m82479c(e);
            }
        }
        return intlRecordNightClub == null ? IntlRecordNightClub.new_() : intlRecordNightClub;
    }

    @Override // p153l.hxd0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SharedPreferences.Editor saveValue(IntlRecordNightClub intlRecordNightClub) {
        return pref().edit().putString(this.f111993id, intlRecordNightClub.toJson());
    }
}
