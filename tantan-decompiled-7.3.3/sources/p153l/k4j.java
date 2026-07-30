package p153l;

import com.p051p1.mobile.putong.feed.data.Frame;
import com.tantanapp.beatles.fpsmonitor.FpsMonitor;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class k4j {

    /* JADX INFO: renamed from: a */
    public static HashMap<String, ArrayList<Integer>> f123891a = new HashMap<>();

    /* JADX INFO: renamed from: l.k4j$a */
    public class C18094a implements utl<m4j> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f123892a;

        public C18094a(String str) {
            this.f123892a = str;
        }

        @Override // p153l.utl
        /* JADX INFO: renamed from: a */
        public void mo82333a(String str) {
            ArrayList arrayList = (ArrayList) k4j.f123891a.get(this.f123892a);
            if (arrayList.size() != 0) {
                k4j.m148248d(this.f123892a, arrayList);
                arrayList.clear();
            }
        }

        @Override // p153l.utl
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo82334b(m4j m4jVar, String str) {
            int i = m4jVar.f134804a;
            ArrayList arrayList = (ArrayList) k4j.f123891a.get(this.f123892a);
            arrayList.add(Integer.valueOf(i));
            if (arrayList.size() == 60) {
                k4j.m148248d(this.f123892a, arrayList);
                arrayList.clear();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m148247c(String str) {
        FpsMonitor.m82314x().mo82318b(str);
    }

    /* JADX INFO: renamed from: d */
    public static void m148248d(String str, List<Integer> list) {
        try {
            ArrayList arrayList = new ArrayList(list);
            q4f q4fVar = new q4f();
            q4fVar.f155566d = EventNameEnum.SYS_CHECK;
            q4fVar.f155581s = "e_MinuteFrame";
            q4fVar.f155576n = str;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Frame.TYPE, arrayList);
            q4fVar.f155585w = jSONObject;
            i4g0.m138515m(q4fVar);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m148249e(String str) {
        if (f123891a.get(str) == null) {
            f123891a.put(str, new ArrayList<>());
        }
        FpsMonitor.m82314x().mo82323h(str, new C18094a(str));
    }
}
