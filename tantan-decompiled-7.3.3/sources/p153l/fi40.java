package p153l;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.data.Surveys;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class fi40 {

    /* JADX INFO: renamed from: a */
    public final HashMap<String, Surveys> f99149a = new HashMap<>();

    /* JADX INFO: renamed from: l.fi40$a */
    public class C16978a extends dyd0<Surveys> {
        public C16978a(String str, Surveys surveys) {
            super(str, surveys);
        }

        @Override // p153l.dyd0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean checkEquals(@NonNull Surveys surveys, Surveys surveys2) {
            return (surveys == null || surveys2 == null || !TextUtils.equals(surveys.f21254id, surveys2.f21254id)) ? false : true;
        }

        @Override // p153l.dyd0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Surveys copyed(Surveys surveys, @NonNull Surveys surveys2) {
            return surveys2.mo225055clone();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p153l.hxd0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Surveys retrieveValue() {
            String string = pref().getString(this.f111993id, null);
            T t = this.defaultValue;
            return string == null ? (Surveys) t : Surveys.parse(string, (Surveys) t);
        }

        @Override // p153l.hxd0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public SharedPreferences.Editor saveValue(Surveys surveys) {
            return pref().edit().putString(this.f111993id, surveys.toJson());
        }
    }

    /* JADX INFO: renamed from: a */
    public final Surveys m125669a(String str) {
        Surveys surveys = this.f99149a.get(str);
        if (surveys == null) {
            surveys = m125670b("new_survey_item:" + str).get();
            if (surveys != null) {
                this.f99149a.put(str, surveys);
            }
        }
        return surveys;
    }

    /* JADX INFO: renamed from: b */
    public final dyd0<Surveys> m125670b(String str) {
        return new C16978a(str, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m125671c(String str, Surveys surveys) {
        this.f99149a.put(str, surveys);
        m125670b("new_survey_item:" + str).put(surveys);
    }
}
