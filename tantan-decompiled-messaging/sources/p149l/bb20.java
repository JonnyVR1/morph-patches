package p149l;

import android.util.Pair;
import com.p046p1.mobile.putong.core.data.ProfileLikeCategoryType;
import com.p046p1.mobile.putong.data.Device;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
class bb20 {

    /* JADX INFO: renamed from: a */
    private static final hyx f74759a = hyx.m133628d("application/json; charset=utf-8");

    /* JADX INFO: renamed from: b */
    private static k850 f74760b;

    /* JADX INFO: renamed from: l.bb20$a */
    public class RunnableC15830a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ xyl f74761a;

        public RunnableC15830a(xyl xylVar) {
            this.f74761a = xylVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                stc0 stc0VarM100943d = bb20.m100943d();
                d2m d2mVar = rh50.f159341d;
                if (d2mVar != null) {
                    stc0VarM100943d = d2mVar.mo109814a(stc0VarM100943d);
                }
                this.f74761a.mo193701a(bb20.f74760b.mo144849a(stc0VarM100943d).execute());
            } catch (Exception unused) {
                this.f74761a.onFail();
            }
        }
    }

    static {
        k850.C17954b c17954bM144885f = new k850.C17954b().m144885f(5L, TimeUnit.SECONDS);
        bsi0.m103717a(c17954bM144885f);
        f74760b = c17954bM144885f.m144882c();
    }

    /* JADX INFO: renamed from: c */
    private static List<Pair<String, String>> m100942c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("app_os", "android"));
        arrayList.add(new Pair("app_name", th50.m188868c().mo180018a()));
        arrayList.add(new Pair("app_version", xyd.m211754b(th50.m188869d())));
        arrayList.add(new Pair("localid", th50.m188868c().mo180021d()));
        arrayList.add(new Pair(Device.MEID, xyd.m211758f(th50.m188869d())));
        arrayList.add(new Pair("imei1", xyd.m211757e(th50.m188869d(), 0)));
        arrayList.add(new Pair("imei2", xyd.m211757e(th50.m188869d(), 1)));
        arrayList.add(new Pair("android_id", xyd.m211753a(th50.m188869d())));
        arrayList.add(new Pair("advertising_id", th50.m188868c().mo180019b()));
        arrayList.add(new Pair("serial_number", xyd.m211759g()));
        arrayList.add(new Pair("nonce", lef0.m149511d()));
        arrayList.add(new Pair("timestamp", rqi0.m180459b(System.currentTimeMillis())));
        arrayList.add(new Pair(ProfileLikeCategoryType.company, xyd.m211755c()));
        arrayList.add(new Pair("resolution", xyd.m211756d(th50.m188869d())));
        arrayList.add(new Pair("third_id", th50.m188868c().mo180020c()));
        arrayList.add(new Pair("device_info", th50.m188868c().getDeviceInfo()));
        arrayList.add(new Pair("last_oneid", fwe0.m123514c()));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static stc0 m100943d() {
        List<Pair<String, String>> listM100942c = m100942c();
        JSONObject jSONObject = new JSONObject();
        try {
            for (Pair<String, String> pair : listM100942c) {
                jSONObject.put((String) pair.first, pair.second);
            }
            jSONObject.put("sign", lef0.m149512e(listM100942c));
        } catch (Exception unused) {
        }
        return new stc0.C20027a().m185898q(th50.f170203c ? "http://deviceid.staging2.p1staff.com/oneid/createid" : "https://deviceid.tantanapp.com/oneid/createid").m185893l(utc0.create(f74759a, jSONObject.toString())).m185883b();
    }

    /* JADX INFO: renamed from: e */
    public static void m100944e(long j, xyl xylVar) {
        oh50.m164325b().m164326a(new RunnableC15830a(xylVar), j);
    }
}
