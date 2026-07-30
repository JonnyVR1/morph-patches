package p153l;

import android.support.v4.media.session.PlaybackStateCompat;
import com.p051p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class bqy {

    /* JADX INFO: renamed from: a */
    public static HashMap<String, ArrayList<eqy>> f77959a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public static ypy f77960b = fu2.m127427e();

    /* JADX INFO: renamed from: c */
    public static long f77961c = -1;

    /* JADX INFO: renamed from: l.bqy$a */
    public class C16088a implements utl<eqy> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f77962a;

        public C16088a(String str) {
            this.f77962a = str;
        }

        @Override // p153l.utl
        /* JADX INFO: renamed from: a */
        public void mo82333a(String str) {
            ArrayList arrayList = (ArrayList) bqy.f77959a.get(this.f77962a);
            if (arrayList.size() != 0) {
                bqy.m106021e(this.f77962a, arrayList);
                arrayList.clear();
            }
        }

        @Override // p153l.utl
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo82334b(eqy eqyVar, String str) {
            ((ArrayList) bqy.f77959a.get(this.f77962a)).add(eqyVar);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m106019c(String str) {
        ypy ypyVar = f77960b;
        if (ypyVar == null) {
            return;
        }
        ypyVar.mo82318b(str);
    }

    /* JADX INFO: renamed from: d */
    public static long m106020d() {
        long j = f77961c;
        if (j != -1) {
            return j;
        }
        long jCeil = ((long) Math.ceil((((smq0.m186841j(App.f16088e) * 1.0d) / 1024.0d) / 1024.0d) / 1024.0d)) * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        f77961c = jCeil;
        return jCeil;
    }

    /* JADX INFO: renamed from: e */
    public static void m106021e(String str, List<eqy> list) {
        try {
            ArrayList<eqy> arrayList = new ArrayList(list);
            eqy eqyVar = new eqy();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            for (eqy eqyVar2 : arrayList) {
                i2 += eqyVar2.f95427b;
                i += eqyVar2.f95428c;
                i3 += eqyVar2.f95426a;
            }
            eqyVar.f95428c = i / arrayList.size();
            eqyVar.f95427b = i2 / arrayList.size();
            eqyVar.f95426a = i3 / arrayList.size();
            q4f q4fVar = new q4f();
            q4fVar.f155566d = EventNameEnum.SYS_CHECK;
            q4fVar.f155581s = "e_memory_check";
            q4fVar.f155576n = str;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mem_pss", eqyVar.f95428c);
            jSONObject.put("mem_dalvik", eqyVar.f95427b);
            jSONObject.put("mem_native", eqyVar.f95426a);
            jSONObject.put("config_name", fu2.m127428f().configName);
            jSONObject.put("device_ram", smq0.m186841j(App.f16088e));
            jSONObject.put("device_ram_kb", m106020d());
            q4fVar.f155585w = jSONObject;
            i4g0.m138515m(q4fVar);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m106022f(String str) {
        if (f77960b == null) {
            return;
        }
        if (f77959a.get(str) == null) {
            f77959a.put(str, new ArrayList<>());
        }
        f77960b.mo82323h(str, new C16088a(str));
    }
}
