package p149l;

import android.support.v4.media.session.PlaybackStateCompat;
import com.p046p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class ehy {

    /* JADX INFO: renamed from: a */
    public static HashMap<String, ArrayList<hhy>> f91523a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public static bhy f91524b = pt2.m171271e();

    /* JADX INFO: renamed from: c */
    public static long f91525c = -1;

    /* JADX INFO: renamed from: l.ehy$a */
    public class C16614a implements grl<hhy> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f91526a;

        public C16614a(String str) {
            this.f91526a = str;
        }

        @Override // p149l.grl
        /* JADX INFO: renamed from: a */
        public void mo81150a(String str) {
            ArrayList arrayList = (ArrayList) ehy.f91523a.get(this.f91526a);
            if (arrayList.size() != 0) {
                ehy.m116613e(this.f91526a, arrayList);
                arrayList.clear();
            }
        }

        @Override // p149l.grl
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo81151b(hhy hhyVar, String str) {
            ((ArrayList) ehy.f91523a.get(this.f91526a)).add(hhyVar);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m116611c(String str) {
        bhy bhyVar = f91524b;
        if (bhyVar == null) {
            return;
        }
        bhyVar.mo81135b(str);
    }

    /* JADX INFO: renamed from: d */
    public static long m116612d() {
        long j = f91525c;
        if (j != -1) {
            return j;
        }
        long jCeil = ((long) Math.ceil((((ndq0.m159025j(App.f15369e) * 1.0d) / 1024.0d) / 1024.0d) / 1024.0d)) * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        f91525c = jCeil;
        return jCeil;
    }

    /* JADX INFO: renamed from: e */
    public static void m116613e(String str, List<hhy> list) {
        try {
            ArrayList<hhy> arrayList = new ArrayList(list);
            hhy hhyVar = new hhy();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            for (hhy hhyVar2 : arrayList) {
                i2 += hhyVar2.f107860b;
                i += hhyVar2.f107861c;
                i3 += hhyVar2.f107859a;
            }
            hhyVar.f107861c = i / arrayList.size();
            hhyVar.f107860b = i2 / arrayList.size();
            hhyVar.f107859a = i3 / arrayList.size();
            l3f l3fVar = new l3f();
            l3fVar.f125885d = EventNameEnum.SYS_CHECK;
            l3fVar.f125900s = "e_memory_check";
            l3fVar.f125895n = str;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mem_pss", hhyVar.f107861c);
            jSONObject.put("mem_dalvik", hhyVar.f107860b);
            jSONObject.put("mem_native", hhyVar.f107859a);
            jSONObject.put("config_name", pt2.m171272f().configName);
            jSONObject.put("device_ram", ndq0.m159025j(App.f15369e));
            jSONObject.put("device_ram_kb", m116612d());
            l3fVar.f125904w = jSONObject;
            zvf0.m220391m(l3fVar);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m116614f(String str) {
        if (f91524b == null) {
            return;
        }
        if (f91523a.get(str) == null) {
            f91523a.put(str, new ArrayList<>());
        }
        f91524b.mo81140h(str, new C16614a(str));
    }
}
