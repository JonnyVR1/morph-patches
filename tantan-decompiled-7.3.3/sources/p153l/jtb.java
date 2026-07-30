package p153l;

import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class jtb {

    /* JADX INFO: renamed from: a */
    public static HashMap<String, ArrayList<Float>> f122571a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public static htb f122572b = fu2.m127426d();

    /* JADX INFO: renamed from: l.jtb$a */
    public class C18038a implements utl<mtb> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f122573a;

        public C18038a(String str) {
            this.f122573a = str;
        }

        @Override // p153l.utl
        /* JADX INFO: renamed from: a */
        public void mo82333a(String str) {
            ArrayList arrayList = (ArrayList) jtb.f122571a.get(this.f122573a);
            if (arrayList.size() != 0) {
                jtb.m146898d(this.f122573a, arrayList);
                arrayList.clear();
            }
        }

        @Override // p153l.utl
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo82334b(mtb mtbVar, String str) {
            ArrayList arrayList = (ArrayList) jtb.f122571a.get(this.f122573a);
            float f = mtbVar.f138560a;
            if (f != 0.0f) {
                arrayList.add(Float.valueOf(f));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m146897c(String str) {
        htb htbVar = f122572b;
        if (htbVar == null) {
            return;
        }
        htbVar.mo82318b(str);
    }

    /* JADX INFO: renamed from: d */
    public static void m146898d(String str, List<Float> list) {
        try {
            ArrayList arrayList = new ArrayList(list);
            Iterator it = arrayList.iterator();
            float fFloatValue = 0.0f;
            while (it.hasNext()) {
                fFloatValue += ((Float) it.next()).floatValue();
            }
            float size = fFloatValue / arrayList.size();
            q4f q4fVar = new q4f();
            q4fVar.f155566d = EventNameEnum.SYS_CHECK;
            q4fVar.f155581s = "e_cpu_check";
            q4fVar.f155576n = str;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cpu_rate", size);
            jSONObject.put("device_cpu_cores", smq0.m186839h());
            jSONObject.put("device_cpu_frequency", smq0.m186836e());
            jSONObject.put("config_name", fu2.m127428f().configName);
            q4fVar.f155585w = jSONObject;
            i4g0.m138515m(q4fVar);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m146899e(String str) {
        if (f122572b == null) {
            return;
        }
        if (f122571a.get(str) == null) {
            f122571a.put(str, new ArrayList<>());
        }
        f122572b.mo82323h(str, new C18038a(str));
    }
}
