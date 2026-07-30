package p153l;

import androidx.annotation.NonNull;
import com.tantanapp.beatles.p077v2.data.MonitorEvent;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class w2f {

    /* JADX INFO: renamed from: a */
    public static HashMap<String, x2f> f186896a = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public static m4f m204574a(MonitorEvent monitorEvent) {
        x2f x2fVar = f186896a.get(monitorEvent.getFormat());
        return x2fVar != null ? x2fVar.mo107478b(monitorEvent) : mod.m159258c().mo107478b(monitorEvent);
    }

    /* JADX INFO: renamed from: b */
    public static void m204575b(@NonNull x2f x2fVar) {
        if (f186896a.containsKey(x2fVar.mo107477a())) {
            return;
        }
        f186896a.put(x2fVar.mo107477a(), x2fVar);
    }
}
