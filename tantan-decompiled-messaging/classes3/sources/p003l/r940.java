package p003l;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.core.data.Surveys;
import java.util.HashMap;
import l.bqd0;
import l.fpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class r940 {

    /* JADX INFO: renamed from: a */
    public final HashMap<String, Surveys> f6806a = new HashMap<>();

    /* JADX INFO: renamed from: l.r940$a */
    public class C0498a extends bqd0<Surveys> {
        public C0498a(String str, Surveys surveys) {
            super(str, surveys);
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean checkEquals(@NonNull Surveys surveys, Surveys surveys2) {
            return (surveys == null || surveys2 == null || !TextUtils.equals(surveys.id, surveys2.id)) ? false : true;
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Surveys copyed(Surveys surveys, @NonNull Surveys surveys2) {
            return surveys2.clone();
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Surveys retrieveValue() {
            String string = pref().getString(((fpd0) this).id, null);
            Object obj = ((fpd0) this).defaultValue;
            return string == null ? (Surveys) obj : Surveys.parse(string, (Surveys) obj);
        }

        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public SharedPreferences.Editor saveValue(Surveys surveys) {
            return pref().edit().putString(((fpd0) this).id, surveys.toJson());
        }
    }

    /* JADX INFO: renamed from: a */
    public final Surveys m7126a(String str) {
        Surveys surveys = this.f6806a.get(str);
        if (surveys == null) {
            surveys = (Surveys) m7127b("new_survey_item:" + str).get();
            if (surveys != null) {
                this.f6806a.put(str, surveys);
            }
        }
        return surveys;
    }

    /* JADX INFO: renamed from: b */
    public final bqd0<Surveys> m7127b(String str) {
        return new C0498a(str, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m7128c(String str, Surveys surveys) {
        this.f6806a.put(str, surveys);
        m7127b("new_survey_item:" + str).put(surveys);
    }
}
