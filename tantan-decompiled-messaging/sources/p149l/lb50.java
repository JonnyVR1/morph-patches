package p149l;

import android.text.TextUtils;
import androidx.annotation.DrawableRes;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class lb50 {

    /* JADX INFO: renamed from: a */
    public HashMap<String, Integer> f127276a = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public boolean m149209a(String str) {
        return this.f127276a.containsKey(str);
    }

    /* JADX INFO: renamed from: b */
    public Integer m149210b(String str) {
        return this.f127276a.get(str);
    }

    /* JADX INFO: renamed from: c */
    public void m149211c(HashMap<String, Integer> map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        this.f127276a.putAll(map);
    }

    /* JADX INFO: renamed from: d */
    public void m149212d(String str, @DrawableRes int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f127276a.put(str, Integer.valueOf(i));
    }
}
