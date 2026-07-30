package p149l;

import androidx.annotation.NonNull;
import com.tantanapp.beatles.p072v2.data.MonitorEvent;
import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public class r1f {

    /* JADX INFO: renamed from: a */
    public static HashMap<String, s1f> f157272a = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public static h3f m177461a(MonitorEvent monitorEvent) {
        s1f s1fVar = f157272a.get(monitorEvent.getFormat());
        return s1fVar != null ? s1fVar.mo104784b(monitorEvent) : hnd.m131888c().mo104784b(monitorEvent);
    }

    /* JADX INFO: renamed from: b */
    public static void m177462b(@NonNull s1f s1fVar) {
        if (f157272a.containsKey(s1fVar.mo104783a())) {
            return;
        }
        f157272a.put(s1fVar.mo104783a(), s1fVar);
    }
}
