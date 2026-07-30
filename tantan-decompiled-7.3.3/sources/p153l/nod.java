package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.beatles.p077v2.data.MonitorEvent;

/* JADX INFO: loaded from: classes11.dex */
public class nod implements u4f {
    @Override // p153l.u4f
    /* JADX INFO: renamed from: a */
    public void mo164112a(@NonNull MonitorEvent monitorEvent) {
        if (monitorEvent.needSendSync()) {
            a5f.m96060m().m96071r(monitorEvent);
        } else {
            a5f.m96060m().m96070q(monitorEvent);
        }
    }

    @Override // p153l.u4f
    /* JADX INFO: renamed from: b */
    public boolean mo164113b(@NonNull String str) {
        return a5f.m96060m().m96072s(str);
    }

    @Override // p153l.u4f
    /* JADX INFO: renamed from: c */
    public void mo164114c(@NonNull MonitorEvent monitorEvent, @Nullable k5f k5fVar) {
        monitorEvent.addProcessors(a5f.m96060m().m96065k());
        if (k5fVar != null) {
            monitorEvent.addProcessor(k5fVar);
        }
        if (monitorEvent.isNeedLogcatProcessor()) {
            monitorEvent.addProcessor(new ozv(monitorEvent));
        }
        if (monitorEvent.getThrowable() != null) {
            monitorEvent.addProcessor(h6f.m133696c());
        }
    }
}
