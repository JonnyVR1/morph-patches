package p153l;

import android.util.Pair;
import com.p051p1.mobile.putong.core.data.ProfileLikeCategoryType;
import com.p051p1.mobile.putong.data.Device;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
class kj20 {

    /* JADX INFO: renamed from: a */
    private static final e7y f127064a = e7y.m119773d("application/json; charset=utf-8");

    /* JADX INFO: renamed from: b */
    private static rg50 f127065b;

    /* JADX INFO: renamed from: l.kj20$a */
    public class RunnableC18174a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ s1m f127066a;

        public RunnableC18174a(s1m s1mVar) {
            this.f127066a = s1mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                x1d0 x1d0VarM150006d = kj20.m150006d();
                w4m w4mVar = xp50.f195688d;
                if (w4mVar != null) {
                    x1d0VarM150006d = w4mVar.mo204900a(x1d0VarM150006d);
                }
                this.f127066a.mo99413a(kj20.f127065b.mo181341a(x1d0VarM150006d).execute());
            } catch (Exception unused) {
                this.f127066a.onFail();
            }
        }
    }

    static {
        rg50.C19837b c19837bM181368f = new rg50.C19837b().m181368f(5L, TimeUnit.SECONDS);
        e1j0.m118982a(c19837bM181368f);
        f127065b = c19837bM181368f.m181365c();
    }

    /* JADX INFO: renamed from: c */
    private static List<Pair<String, String>> m150005c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("app_os", "android"));
        arrayList.add(new Pair("app_name", zp50.m220814c().mo111807a()));
        arrayList.add(new Pair("app_version", k0e.m147777b(zp50.m220815d())));
        arrayList.add(new Pair("localid", zp50.m220814c().mo111810d()));
        arrayList.add(new Pair(Device.MEID, k0e.m147781f(zp50.m220815d())));
        arrayList.add(new Pair("imei1", k0e.m147780e(zp50.m220815d(), 0)));
        arrayList.add(new Pair("imei2", k0e.m147780e(zp50.m220815d(), 1)));
        arrayList.add(new Pair("android_id", k0e.m147776a(zp50.m220815d())));
        arrayList.add(new Pair("advertising_id", zp50.m220814c().mo111808b()));
        arrayList.add(new Pair("serial_number", k0e.m147782g()));
        arrayList.add(new Pair("nonce", smf0.m186812d()));
        arrayList.add(new Pair("timestamp", uzi0.m198839b(System.currentTimeMillis())));
        arrayList.add(new Pair(ProfileLikeCategoryType.company, k0e.m147778c()));
        arrayList.add(new Pair("resolution", k0e.m147779d(zp50.m220815d())));
        arrayList.add(new Pair("third_id", zp50.m220814c().mo111809c()));
        arrayList.add(new Pair("device_info", zp50.m220814c().getDeviceInfo()));
        arrayList.add(new Pair("last_oneid", m4f0.m157010c()));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static x1d0 m150006d() {
        List<Pair<String, String>> listM150005c = m150005c();
        JSONObject jSONObject = new JSONObject();
        try {
            for (Pair<String, String> pair : listM150005c) {
                jSONObject.put((String) pair.first, pair.second);
            }
            jSONObject.put("sign", smf0.m186813e(listM150005c));
        } catch (Exception unused) {
        }
        return new x1d0.C21228a().m209043q(zp50.f205425c ? "http://deviceid.staging2.p1staff.com/oneid/createid" : "https://deviceid.tantanapp.com/oneid/createid").m209038l(z1d0.create(f127064a, jSONObject.toString())).m209028b();
    }

    /* JADX INFO: renamed from: e */
    public static void m150007e(long j, s1m s1mVar) {
        up50.m197046b().m197047a(new RunnableC18174a(s1mVar), j);
    }
}
