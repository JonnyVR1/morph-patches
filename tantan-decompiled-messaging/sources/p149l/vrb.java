package p149l;

import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class vrb {

    /* JADX INFO: renamed from: a */
    public static HashMap<String, ArrayList<Float>> f182711a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public static trb f182712b = pt2.m171270d();

    /* JADX INFO: renamed from: l.vrb$a */
    public class C20719a implements grl<yrb> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f182713a;

        public C20719a(String str) {
            this.f182713a = str;
        }

        @Override // p149l.grl
        /* JADX INFO: renamed from: a */
        public void mo81150a(String str) {
            ArrayList arrayList = (ArrayList) vrb.f182711a.get(this.f182713a);
            if (arrayList.size() != 0) {
                vrb.m199654d(this.f182713a, arrayList);
                arrayList.clear();
            }
        }

        @Override // p149l.grl
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo81151b(yrb yrbVar, String str) {
            ArrayList arrayList = (ArrayList) vrb.f182711a.get(this.f182713a);
            float f = yrbVar.f199660a;
            if (f != 0.0f) {
                arrayList.add(Float.valueOf(f));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m199653c(String str) {
        trb trbVar = f182712b;
        if (trbVar == null) {
            return;
        }
        trbVar.mo81135b(str);
    }

    /* JADX INFO: renamed from: d */
    public static void m199654d(String str, List<Float> list) {
        try {
            ArrayList arrayList = new ArrayList(list);
            Iterator it = arrayList.iterator();
            float fFloatValue = 0.0f;
            while (it.hasNext()) {
                fFloatValue += ((Float) it.next()).floatValue();
            }
            float size = fFloatValue / arrayList.size();
            l3f l3fVar = new l3f();
            l3fVar.f125885d = EventNameEnum.SYS_CHECK;
            l3fVar.f125900s = "e_cpu_check";
            l3fVar.f125895n = str;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cpu_rate", size);
            jSONObject.put("device_cpu_cores", ndq0.m159023h());
            jSONObject.put("device_cpu_frequency", ndq0.m159020e());
            jSONObject.put("config_name", pt2.m171272f().configName);
            l3fVar.f125904w = jSONObject;
            zvf0.m220391m(l3fVar);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m199655e(String str) {
        if (f182712b == null) {
            return;
        }
        if (f182711a.get(str) == null) {
            f182711a.put(str, new ArrayList<>());
        }
        f182712b.mo81140h(str, new C20719a(str));
    }
}
