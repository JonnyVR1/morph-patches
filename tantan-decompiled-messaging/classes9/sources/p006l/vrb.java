package p006l;

import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import l.grl;
import l.l3f;
import l.ndq0;
import l.trb;
import l.yrb;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class vrb {

    /* JADX INFO: renamed from: a */
    public static HashMap<String, ArrayList<Float>> f24430a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public static trb f24431b = pt2.m21678d();

    /* JADX INFO: renamed from: l.vrb$a */
    public class C1387a implements grl<yrb> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f24432a;

        public C1387a(String str) {
            this.f24432a = str;
        }

        /* JADX INFO: renamed from: a */
        public void m25860a(String str) {
            ArrayList arrayList = (ArrayList) vrb.f24430a.get(this.f24432a);
            if (arrayList.size() != 0) {
                vrb.m25858d(this.f24432a, arrayList);
                arrayList.clear();
            }
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void m25861b(yrb yrbVar, String str) {
            ArrayList arrayList = (ArrayList) vrb.f24430a.get(this.f24432a);
            float f = yrbVar.a;
            if (f != 0.0f) {
                arrayList.add(Float.valueOf(f));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m25857c(String str) {
        trb trbVar = f24431b;
        if (trbVar == null) {
            return;
        }
        trbVar.b(str);
    }

    /* JADX INFO: renamed from: d */
    public static void m25858d(String str, List<Float> list) {
        try {
            ArrayList arrayList = new ArrayList(list);
            Iterator it = arrayList.iterator();
            float fFloatValue = 0.0f;
            while (it.hasNext()) {
                fFloatValue += ((Float) it.next()).floatValue();
            }
            float size = fFloatValue / arrayList.size();
            l3f l3fVar = new l3f();
            l3fVar.d = EventNameEnum.SYS_CHECK;
            l3fVar.s = "e_cpu_check";
            l3fVar.n = str;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cpu_rate", size);
            jSONObject.put("device_cpu_cores", ndq0.h());
            jSONObject.put("device_cpu_frequency", ndq0.e());
            jSONObject.put("config_name", pt2.m21680f().configName);
            l3fVar.w = jSONObject;
            zvf0.m(l3fVar);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m25859e(String str) {
        if (f24431b == null) {
            return;
        }
        if (f24430a.get(str) == null) {
            f24430a.put(str, new ArrayList<>());
        }
        f24431b.h(str, new C1387a(str));
    }
}
