package p009l;

import com.p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.Date;
import java.util.HashMap;
import l.e51;
import l.l3f;
import l.zpd0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class pdq0 {

    /* JADX INFO: renamed from: a */
    public static zpd0 f18496a = new zpd0("year_class_device_tack_timestamp", 0L);

    /* JADX INFO: renamed from: b */
    public static volatile int f18497b = -1;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m20155a() {
        try {
            f18497b = ndq0.m18858d(App.e);
            Date date = new Date(((Long) f18496a.get()).longValue());
            int month = date.getMonth();
            int date2 = date.getDate();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Date date3 = new Date(jCurrentTimeMillis);
            int month2 = date3.getMonth();
            int date4 = date3.getDate();
            if (month == month2 && date2 == date4) {
                return;
            }
            f18496a.put(Long.valueOf(jCurrentTimeMillis));
            l3f l3fVar = new l3f();
            HashMap map = new HashMap();
            l3fVar.d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            l3fVar.s = "e_device_hardware_info";
            map.put("device_ram", Long.valueOf(ndq0.m18864j(App.e)));
            map.put("device_cpu_cores", Integer.valueOf(ndq0.m18862h()));
            map.put("device_cpu_frequency", Long.valueOf(ndq0.m18859e()));
            zvf0.n(l3fVar, map);
        } catch (Exception e) {
            CrashHelper.c(e);
            e.toString();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m20156b() {
        e51.y(new Runnable() { // from class: l.odq0
            @Override // java.lang.Runnable
            public final void run() {
                pdq0.m20155a();
            }
        });
    }
}
