package p149l;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.data.Surveys;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class r940 {

    /* JADX INFO: renamed from: a */
    public final HashMap<String, Surveys> f158277a = new HashMap<>();

    /* JADX INFO: renamed from: l.r940$a */
    public class C19655a extends bqd0<Surveys> {
        public C19655a(String str, Surveys surveys) {
            super(str, surveys);
        }

        @Override // p149l.bqd0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean checkEquals(@NonNull Surveys surveys, Surveys surveys2) {
            return (surveys == null || surveys2 == null || !TextUtils.equals(surveys.f20512id, surveys2.f20512id)) ? false : true;
        }

        @Override // p149l.bqd0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Surveys copyed(Surveys surveys, @NonNull Surveys surveys2) {
            return surveys2.mo223809clone();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p149l.fpd0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Surveys retrieveValue() {
            String string = pref().getString(this.f98687id, null);
            T t = this.defaultValue;
            return string == null ? (Surveys) t : Surveys.parse(string, (Surveys) t);
        }

        @Override // p149l.fpd0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public SharedPreferences.Editor saveValue(Surveys surveys) {
            return pref().edit().putString(this.f98687id, surveys.toJson());
        }
    }

    /* JADX INFO: renamed from: a */
    public final Surveys m178290a(String str) {
        Surveys surveys = this.f158277a.get(str);
        if (surveys == null) {
            surveys = m178291b("new_survey_item:" + str).get();
            if (surveys != null) {
                this.f158277a.put(str, surveys);
            }
        }
        return surveys;
    }

    /* JADX INFO: renamed from: b */
    public final bqd0<Surveys> m178291b(String str) {
        return new C19655a(str, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m178292c(String str, Surveys surveys) {
        this.f158277a.put(str, surveys);
        m178291b("new_survey_item:" + str).put(surveys);
    }
}
