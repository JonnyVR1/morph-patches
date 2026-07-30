package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import java.util.ArrayList;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class mah {

    /* JADX INFO: renamed from: c */
    public static volatile mah f132850c;

    /* JADX INFO: renamed from: a */
    public ArrayList<String> f132851a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public Random f132852b = new Random();

    public mah() {
        m153665d();
    }

    /* JADX INFO: renamed from: b */
    public static mah m153662b() {
        if (f132850c == null) {
            synchronized (mah.class) {
                try {
                    if (f132850c == null) {
                        f132850c = new mah();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f132850c;
    }

    /* JADX INFO: renamed from: a */
    public int m153663a() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("like_relation_fuction");
            if (TextUtils.isEmpty(strM79302F)) {
                return 3;
            }
            return Integer.parseInt(new JSONObject(strM79302F).optJSONObject("likeTabFuction").optString("freeNumbers"));
        } catch (Exception unused) {
            return 3;
        }
    }

    /* JADX INFO: renamed from: c */
    public String m153664c() {
        String str;
        if (vwb.m200296J(this.f132851a)) {
            str = null;
        } else {
            str = this.f132851a.get(this.f132852b.nextInt(this.f132851a.size()));
        }
        return TextUtils.isEmpty(str) ? "谢谢你喜欢我的动态，在干嘛呢呀" : str;
    }

    /* JADX INFO: renamed from: d */
    public final void m153665d() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("like_relation_fuction");
            if (TextUtils.isEmpty(strM79302F)) {
                return;
            }
            JSONArray jSONArray = new JSONObject(strM79302F).optJSONObject("politeGratitude").getJSONArray("polite_gratitude_auto_msg");
            if (vwb.m200296J(this.f132851a) || jSONArray.length() != this.f132851a.size()) {
                this.f132851a.clear();
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.f132851a.add(jSONArray.optString(i));
                }
            }
        } catch (Exception unused) {
        }
    }
}
