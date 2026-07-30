package p149l;

import com.p046p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class pdq0 {

    /* JADX INFO: renamed from: a */
    public static zpd0 f148320a = new zpd0("year_class_device_tack_timestamp", 0L);

    /* JADX INFO: renamed from: b */
    public static volatile int f148321b = -1;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m168390a() {
        try {
            f148321b = ndq0.m159019d(App.f15369e);
            Date date = new Date(f148320a.get().longValue());
            int month = date.getMonth();
            int date2 = date.getDate();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Date date3 = new Date(jCurrentTimeMillis);
            int month2 = date3.getMonth();
            int date4 = date3.getDate();
            if (month == month2 && date2 == date4) {
                return;
            }
            f148320a.put(Long.valueOf(jCurrentTimeMillis));
            l3f l3fVar = new l3f();
            HashMap map = new HashMap();
            l3fVar.f125885d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            l3fVar.f125900s = "e_device_hardware_info";
            map.put("device_ram", Long.valueOf(ndq0.m159025j(App.f15369e)));
            map.put("device_cpu_cores", Integer.valueOf(ndq0.m159023h()));
            map.put("device_cpu_frequency", Long.valueOf(ndq0.m159020e()));
            zvf0.m220392n(l3fVar, map);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            e.toString();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m168391b() {
        e51.m114774y(new Runnable() { // from class: l.odq0
            @Override // java.lang.Runnable
            public final void run() {
                pdq0.m168390a();
            }
        });
    }
}
