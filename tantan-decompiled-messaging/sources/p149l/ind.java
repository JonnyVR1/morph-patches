package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.beatles.p072v2.data.MonitorEvent;

/* JADX INFO: loaded from: classes13.dex */
public class ind implements p3f {
    @Override // p149l.p3f
    /* JADX INFO: renamed from: a */
    public void mo137130a(@NonNull MonitorEvent monitorEvent) {
        if (monitorEvent.needSendSync()) {
            w3f.m201297m().m201308r(monitorEvent);
        } else {
            w3f.m201297m().m201307q(monitorEvent);
        }
    }

    @Override // p149l.p3f
    /* JADX INFO: renamed from: b */
    public boolean mo137131b(@NonNull String str) {
        return w3f.m201297m().m201309s(str);
    }

    @Override // p149l.p3f
    /* JADX INFO: renamed from: c */
    public void mo137132c(@NonNull MonitorEvent monitorEvent, @Nullable g4f g4fVar) {
        monitorEvent.addProcessors(w3f.m201297m().m201302k());
        if (g4fVar != null) {
            monitorEvent.addProcessor(g4fVar);
        }
        if (monitorEvent.isNeedLogcatProcessor()) {
            monitorEvent.addProcessor(new rxv(monitorEvent));
        }
        if (monitorEvent.getThrowable() != null) {
            monitorEvent.addProcessor(d5f.m110051c());
        }
    }
}
