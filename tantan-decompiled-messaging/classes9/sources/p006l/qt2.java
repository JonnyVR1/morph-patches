package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.api.ABManager;
import com.p1.mobile.android.app.App;
import com.tantanapp.beatles.v2.data.MonitorEvent;
import com.tantanapp.beatles.v2.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import l.dt3;
import l.dyd;
import l.m3f;
import l.r11;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class qt2 implements m3f {
    /* JADX INFO: renamed from: a */
    public String m22370a() {
        try {
            return dyd.a();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public HashMap<String, String> m22371b(MonitorEvent monitorEvent) {
        HashMap<String, String> map = new HashMap<>();
        map.put("isSupport64", dt3.a(App.e) + "");
        map.put("isPlugin", "false");
        map.put("flavor", r11.b());
        if (!TextUtils.isEmpty(r11.n())) {
            map.put("mr_id", r11.n());
        }
        return map;
    }

    /* JADX INFO: renamed from: c */
    public String m22372c() {
        return jkb0.m17503l();
    }

    /* JADX INFO: renamed from: d */
    public String m22373d() {
        return "release";
    }

    /* JADX INFO: renamed from: e */
    public String m22374e() {
        return "prod";
    }

    /* JADX INFO: renamed from: f */
    public HashMap<String, String> m22375f(MonitorEvent monitorEvent) {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public List<String> m22376g() {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(r11.e())) {
            arrayList.add(r11.d().replace("/", "_") + r11.e());
        }
        return arrayList;
    }

    public String getChannel() {
        return mr4.f17192a;
    }

    public User getUserInfo() {
        User user = new User();
        String strUserId = "0";
        try {
            if (NullChecker.a(qib0.f19805c0)) {
                strUserId = qib0.f19805c0.userId();
                String strM1255i = ABManager.m1255i();
                if (!TextUtils.isEmpty(strM1255i)) {
                    user.setAbGroups(m22377h(strM1255i));
                }
            }
        } catch (Exception unused) {
        }
        user.setUserId(strUserId);
        user.setOneId(sh50.m23745d());
        return user;
    }

    /* JADX INFO: renamed from: h */
    public final List<String> m22377h(String str) {
        return Arrays.asList(str.split(","));
    }
}
