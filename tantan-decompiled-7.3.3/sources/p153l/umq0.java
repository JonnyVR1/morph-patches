package p153l;

import com.p051p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class umq0 {

    /* JADX INFO: renamed from: a */
    public static byd0 f179665a = new byd0("year_class_device_tack_timestamp", 0L);

    /* JADX INFO: renamed from: b */
    public static volatile int f179666b = -1;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m196792a() {
        try {
            f179666b = smq0.m186835d(App.f16088e);
            Date date = new Date(f179665a.get().longValue());
            int month = date.getMonth();
            int date2 = date.getDate();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Date date3 = new Date(jCurrentTimeMillis);
            int month2 = date3.getMonth();
            int date4 = date3.getDate();
            if (month == month2 && date2 == date4) {
                return;
            }
            f179665a.put(Long.valueOf(jCurrentTimeMillis));
            q4f q4fVar = new q4f();
            HashMap map = new HashMap();
            q4fVar.f155566d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            q4fVar.f155581s = "e_device_hardware_info";
            map.put("device_ram", Long.valueOf(smq0.m186841j(App.f16088e)));
            map.put("device_cpu_cores", Integer.valueOf(smq0.m186839h()));
            map.put("device_cpu_frequency", Long.valueOf(smq0.m186836e()));
            i4g0.m138516n(q4fVar, map);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            e.toString();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m196793b() {
        l51.m152919y(new Runnable() { // from class: l.tmq0
            @Override // java.lang.Runnable
            public final void run() {
                umq0.m196792a();
            }
        });
    }
}
