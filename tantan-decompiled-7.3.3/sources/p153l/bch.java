package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import java.util.ArrayList;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class bch {

    /* JADX INFO: renamed from: c */
    public static volatile bch f76146c;

    /* JADX INFO: renamed from: a */
    public ArrayList<String> f76147a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public Random f76148b = new Random();

    public bch() {
        m103511d();
    }

    /* JADX INFO: renamed from: b */
    public static bch m103508b() {
        if (f76146c == null) {
            synchronized (bch.class) {
                try {
                    if (f76146c == null) {
                        f76146c = new bch();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f76146c;
    }

    /* JADX INFO: renamed from: a */
    public int m103509a() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("like_relation_fuction");
            if (TextUtils.isEmpty(strM80485F)) {
                return 3;
            }
            return Integer.parseInt(new JSONObject(strM80485F).optJSONObject("likeTabFuction").optString("freeNumbers"));
        } catch (Exception unused) {
            return 3;
        }
    }

    /* JADX INFO: renamed from: c */
    public String m103510c() {
        String str;
        if (jyb.m147479J(this.f76147a)) {
            str = null;
        } else {
            str = this.f76147a.get(this.f76148b.nextInt(this.f76147a.size()));
        }
        return TextUtils.isEmpty(str) ? "谢谢你喜欢我的动态，在干嘛呢呀" : str;
    }

    /* JADX INFO: renamed from: d */
    public final void m103511d() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("like_relation_fuction");
            if (TextUtils.isEmpty(strM80485F)) {
                return;
            }
            JSONArray jSONArray = new JSONObject(strM80485F).optJSONObject("politeGratitude").getJSONArray("polite_gratitude_auto_msg");
            if (jyb.m147479J(this.f76147a) || jSONArray.length() != this.f76147a.size()) {
                this.f76147a.clear();
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.f76147a.add(jSONArray.optString(i));
                }
            }
        } catch (Exception unused) {
        }
    }
}
