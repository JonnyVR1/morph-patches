package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.ABManager;
import com.tantanapp.beatles.p072v2.data.MonitorEvent;
import com.tantanapp.beatles.p072v2.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class qt2 implements m3f {
    @Override // p149l.m3f
    /* JADX INFO: renamed from: a */
    public String mo152849a() {
        try {
            return dyd.m114055a();
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // p149l.m3f
    /* JADX INFO: renamed from: b */
    public HashMap<String, String> mo152850b(MonitorEvent monitorEvent) {
        HashMap<String, String> map = new HashMap<>();
        map.put("isSupport64", dt3.m113531a(App.f15369e) + "");
        map.put("isPlugin", "false");
        map.put("flavor", r11.m177418b());
        if (!TextUtils.isEmpty(r11.m177429n())) {
            map.put("mr_id", r11.m177429n());
        }
        return map;
    }

    @Override // p149l.m3f
    /* JADX INFO: renamed from: c */
    public String mo152851c() {
        return jkb0.m141842l();
    }

    @Override // p149l.m3f
    /* JADX INFO: renamed from: d */
    public String mo152852d() {
        return "release";
    }

    @Override // p149l.m3f
    /* JADX INFO: renamed from: e */
    public String mo152853e() {
        return "prod";
    }

    @Override // p149l.m3f
    /* JADX INFO: renamed from: f */
    public HashMap<String, String> mo152854f(MonitorEvent monitorEvent) {
        return null;
    }

    @Override // p149l.m3f
    /* JADX INFO: renamed from: g */
    public List<String> mo152855g() {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(r11.m177420e())) {
            arrayList.add(r11.m177419d().replace("/", "_") + r11.m177420e());
        }
        return arrayList;
    }

    @Override // p149l.m3f
    public String getChannel() {
        return mr4.f135329a;
    }

    @Override // p149l.m3f
    public User getUserInfo() {
        User user = new User();
        String strUserId = "0";
        try {
            if (NullChecker.m81303a(qib0.f154714c0)) {
                strUserId = qib0.f154714c0.userId();
                String strM29349i = ABManager.m29349i();
                if (!TextUtils.isEmpty(strM29349i)) {
                    user.setAbGroups(m176388h(strM29349i));
                }
            }
        } catch (Exception unused) {
        }
        user.setUserId(strUserId);
        user.setOneId(sh50.m184159d());
        return user;
    }

    /* JADX INFO: renamed from: h */
    public final List<String> m176388h(String str) {
        return Arrays.asList(str.split(Constants.SEPARATOR_COMMA));
    }
}
