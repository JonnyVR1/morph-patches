package p007l;

import android.text.TextUtils;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import java.util.ArrayList;
import java.util.Random;
import l.vwb;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class mah {

    /* JADX INFO: renamed from: c */
    public static volatile mah f10372c;

    /* JADX INFO: renamed from: a */
    public ArrayList<String> f10373a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public Random f10374b = new Random();

    public mah() {
        m11872d();
    }

    /* JADX INFO: renamed from: b */
    public static mah m11869b() {
        if (f10372c == null) {
            synchronized (mah.class) {
                try {
                    if (f10372c == null) {
                        f10372c = new mah();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f10372c;
    }

    /* JADX INFO: renamed from: a */
    public int m11870a() {
        try {
            String strF = RemoteConfig.x().F("like_relation_fuction");
            if (TextUtils.isEmpty(strF)) {
                return 3;
            }
            return Integer.parseInt(new JSONObject(strF).optJSONObject("likeTabFuction").optString("freeNumbers"));
        } catch (Exception unused) {
            return 3;
        }
    }

    /* JADX INFO: renamed from: c */
    public String m11871c() {
        String str;
        if (vwb.J(this.f10373a)) {
            str = null;
        } else {
            str = this.f10373a.get(this.f10374b.nextInt(this.f10373a.size()));
        }
        return TextUtils.isEmpty(str) ? "谢谢你喜欢我的动态，在干嘛呢呀" : str;
    }

    /* JADX INFO: renamed from: d */
    public final void m11872d() {
        try {
            String strF = RemoteConfig.x().F("like_relation_fuction");
            if (TextUtils.isEmpty(strF)) {
                return;
            }
            JSONArray jSONArray = new JSONObject(strF).optJSONObject("politeGratitude").getJSONArray("polite_gratitude_auto_msg");
            if (vwb.J(this.f10373a) || jSONArray.length() != this.f10373a.size()) {
                this.f10373a.clear();
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.f10373a.add(jSONArray.optString(i));
                }
            }
        } catch (Exception unused) {
        }
    }
}
