package p006l;

import com.tantanapp.beatles.fpsmonitor.FpsMonitor;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l.grl;
import l.l3f;
import l.r1j;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class p1j {

    /* JADX INFO: renamed from: a */
    public static HashMap<String, ArrayList<Integer>> f18553a = new HashMap<>();

    /* JADX INFO: renamed from: l.p1j$a */
    public class C1117a implements grl<r1j> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f18554a;

        public C1117a(String str) {
            this.f18554a = str;
        }

        /* JADX INFO: renamed from: a */
        public void m21012a(String str) {
            ArrayList arrayList = (ArrayList) p1j.f18553a.get(this.f18554a);
            if (arrayList.size() != 0) {
                p1j.m21010d(this.f18554a, arrayList);
                arrayList.clear();
            }
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void m21013b(r1j r1jVar, String str) {
            int i = r1jVar.a;
            ArrayList arrayList = (ArrayList) p1j.f18553a.get(this.f18554a);
            arrayList.add(Integer.valueOf(i));
            if (arrayList.size() == 60) {
                p1j.m21010d(this.f18554a, arrayList);
                arrayList.clear();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m21009c(String str) {
        FpsMonitor.x().b(str);
    }

    /* JADX INFO: renamed from: d */
    public static void m21010d(String str, List<Integer> list) {
        try {
            ArrayList arrayList = new ArrayList(list);
            l3f l3fVar = new l3f();
            l3fVar.d = EventNameEnum.SYS_CHECK;
            l3fVar.s = "e_MinuteFrame";
            l3fVar.n = str;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("frame", arrayList);
            l3fVar.w = jSONObject;
            zvf0.m(l3fVar);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m21011e(String str) {
        if (f18553a.get(str) == null) {
            f18553a.put(str, new ArrayList<>());
        }
        FpsMonitor.x().h(str, new C1117a(str));
    }
}
