package p006l;

import com.p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l.bhy;
import l.grl;
import l.hhy;
import l.l3f;
import l.ndq0;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ehy {

    /* JADX INFO: renamed from: a */
    public static HashMap<String, ArrayList<hhy>> f11156a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public static bhy f11157b = pt2.m21679e();

    /* JADX INFO: renamed from: c */
    public static long f11158c = -1;

    /* JADX INFO: renamed from: l.ehy$a */
    public class C0675a implements grl<hhy> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f11159a;

        public C0675a(String str) {
            this.f11159a = str;
        }

        /* JADX INFO: renamed from: a */
        public void m14548a(String str) {
            ArrayList arrayList = (ArrayList) ehy.f11156a.get(this.f11159a);
            if (arrayList.size() != 0) {
                ehy.m14546e(this.f11159a, arrayList);
                arrayList.clear();
            }
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void m14549b(hhy hhyVar, String str) {
            ((ArrayList) ehy.f11156a.get(this.f11159a)).add(hhyVar);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m14544c(String str) {
        bhy bhyVar = f11157b;
        if (bhyVar == null) {
            return;
        }
        bhyVar.b(str);
    }

    /* JADX INFO: renamed from: d */
    public static long m14545d() {
        long j = f11158c;
        if (j != -1) {
            return j;
        }
        long jCeil = ((long) Math.ceil((((ndq0.j(App.e) * 1.0d) / 1024.0d) / 1024.0d) / 1024.0d)) * 1048576;
        f11158c = jCeil;
        return jCeil;
    }

    /* JADX INFO: renamed from: e */
    public static void m14546e(String str, List<hhy> list) {
        try {
            ArrayList<hhy> arrayList = new ArrayList(list);
            hhy hhyVar = new hhy();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            for (hhy hhyVar2 : arrayList) {
                i2 += hhyVar2.b;
                i += hhyVar2.c;
                i3 += hhyVar2.a;
            }
            hhyVar.c = i / arrayList.size();
            hhyVar.b = i2 / arrayList.size();
            hhyVar.a = i3 / arrayList.size();
            l3f l3fVar = new l3f();
            l3fVar.d = EventNameEnum.SYS_CHECK;
            l3fVar.s = "e_memory_check";
            l3fVar.n = str;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mem_pss", hhyVar.c);
            jSONObject.put("mem_dalvik", hhyVar.b);
            jSONObject.put("mem_native", hhyVar.a);
            jSONObject.put("config_name", pt2.m21680f().configName);
            jSONObject.put("device_ram", ndq0.j(App.e));
            jSONObject.put("device_ram_kb", m14545d());
            l3fVar.w = jSONObject;
            zvf0.m(l3fVar);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m14547f(String str) {
        if (f11157b == null) {
            return;
        }
        if (f11156a.get(str) == null) {
            f11156a.put(str, new ArrayList<>());
        }
        f11157b.h(str, new C0675a(str));
    }
}
