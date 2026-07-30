package p153l;

import android.text.TextUtils;
import androidx.annotation.DrawableRes;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class sj50 {

    /* JADX INFO: renamed from: a */
    public HashMap<String, Integer> f168904a = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public boolean m186055a(String str) {
        return this.f168904a.containsKey(str);
    }

    /* JADX INFO: renamed from: b */
    public Integer m186056b(String str) {
        return this.f168904a.get(str);
    }

    /* JADX INFO: renamed from: c */
    public void m186057c(HashMap<String, Integer> map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        this.f168904a.putAll(map);
    }

    /* JADX INFO: renamed from: d */
    public void m186058d(String str, @DrawableRes int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f168904a.put(str, Integer.valueOf(i));
    }
}
