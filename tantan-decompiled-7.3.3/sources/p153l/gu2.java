package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.ABManager;
import com.tantanapp.beatles.p077v2.data.MonitorEvent;
import com.tantanapp.beatles.p077v2.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class gu2 implements r4f {
    @Override // p153l.r4f
    /* JADX INFO: renamed from: a */
    public String mo132264a() {
        try {
            return qzd.m178768a();
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // p153l.r4f
    /* JADX INFO: renamed from: b */
    public HashMap<String, String> mo132265b(MonitorEvent monitorEvent) {
        HashMap<String, String> map = new HashMap<>();
        map.put("isSupport64", cu3.m112649a(App.f16088e) + "");
        map.put("isPlugin", "false");
        map.put("flavor", y11.m213914b());
        if (!TextUtils.isEmpty(y11.m213925n())) {
            map.put("mr_id", y11.m213925n());
        }
        return map;
    }

    @Override // p153l.r4f
    /* JADX INFO: renamed from: c */
    public String mo132266c() {
        return nsb0.m164578l();
    }

    @Override // p153l.r4f
    /* JADX INFO: renamed from: d */
    public String mo132267d() {
        return "release";
    }

    @Override // p153l.r4f
    /* JADX INFO: renamed from: e */
    public String mo132268e() {
        return "prod";
    }

    @Override // p153l.r4f
    /* JADX INFO: renamed from: f */
    public HashMap<String, String> mo132269f(MonitorEvent monitorEvent) {
        return null;
    }

    @Override // p153l.r4f
    /* JADX INFO: renamed from: g */
    public List<String> mo132270g() {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(y11.m213916e())) {
            arrayList.add(y11.m213915d().replace("/", "_") + y11.m213916e());
        }
        return arrayList;
    }

    @Override // p153l.r4f
    public String getChannel() {
        return ls4.f133389a;
    }

    @Override // p153l.r4f
    public User getUserInfo() {
        User user = new User();
        String strUserId = "0";
        try {
            if (NullChecker.m82486a(uqb0.f180397c0)) {
                strUserId = uqb0.f180397c0.userId();
                String strM30347i = ABManager.m30347i();
                if (!TextUtils.isEmpty(strM30347i)) {
                    user.setAbGroups(m132271h(strM30347i));
                }
            }
        } catch (Exception unused) {
        }
        user.setUserId(strUserId);
        user.setOneId(yp50.m217001d());
        return user;
    }

    /* JADX INFO: renamed from: h */
    public final List<String> m132271h(String str) {
        return Arrays.asList(str.split(Constants.SEPARATOR_COMMA));
    }
}
