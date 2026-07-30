package p149l;

import com.p046p1.mobile.putong.feed.data.Frame;
import com.tantanapp.beatles.fpsmonitor.FpsMonitor;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class p1j {

    /* JADX INFO: renamed from: a */
    public static HashMap<String, ArrayList<Integer>> f146684a = new HashMap<>();

    /* JADX INFO: renamed from: l.p1j$a */
    public class C19098a implements grl<r1j> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f146685a;

        public C19098a(String str) {
            this.f146685a = str;
        }

        @Override // p149l.grl
        /* JADX INFO: renamed from: a */
        public void mo81150a(String str) {
            ArrayList arrayList = (ArrayList) p1j.f146684a.get(this.f146685a);
            if (arrayList.size() != 0) {
                p1j.m167070d(this.f146685a, arrayList);
                arrayList.clear();
            }
        }

        @Override // p149l.grl
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo81151b(r1j r1jVar, String str) {
            int i = r1jVar.f157281a;
            ArrayList arrayList = (ArrayList) p1j.f146684a.get(this.f146685a);
            arrayList.add(Integer.valueOf(i));
            if (arrayList.size() == 60) {
                p1j.m167070d(this.f146685a, arrayList);
                arrayList.clear();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m167069c(String str) {
        FpsMonitor.m81131x().mo81135b(str);
    }

    /* JADX INFO: renamed from: d */
    public static void m167070d(String str, List<Integer> list) {
        try {
            ArrayList arrayList = new ArrayList(list);
            l3f l3fVar = new l3f();
            l3fVar.f125885d = EventNameEnum.SYS_CHECK;
            l3fVar.f125900s = "e_MinuteFrame";
            l3fVar.f125895n = str;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Frame.TYPE, arrayList);
            l3fVar.f125904w = jSONObject;
            zvf0.m220391m(l3fVar);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m167071e(String str) {
        if (f146684a.get(str) == null) {
            f146684a.put(str, new ArrayList<>());
        }
        FpsMonitor.m81131x().mo81140h(str, new C19098a(str));
    }
}
