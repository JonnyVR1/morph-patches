package p009l;

import android.text.TextUtils;
import androidx.annotation.DrawableRes;
import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class lb50 {

    /* JADX INFO: renamed from: a */
    public HashMap<String, Integer> f16040a = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public boolean m17782a(String str) {
        return this.f16040a.containsKey(str);
    }

    /* JADX INFO: renamed from: b */
    public Integer m17783b(String str) {
        return this.f16040a.get(str);
    }

    /* JADX INFO: renamed from: c */
    public void m17784c(HashMap<String, Integer> map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        this.f16040a.putAll(map);
    }

    /* JADX INFO: renamed from: d */
    public void m17785d(String str, @DrawableRes int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f16040a.put(str, Integer.valueOf(i));
    }
}
