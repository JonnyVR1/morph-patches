package p149l;

import com.cosmos.mdlog.MDLog;
import com.immomo.mmutil.task.C3804c;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
class qei {

    /* JADX INFO: renamed from: a */
    private ScheduledFuture f154035a;

    /* JADX INFO: renamed from: b */
    private boolean f154036b = false;

    /* JADX INFO: renamed from: l.qei$b */
    public class C19475b extends ax00.AbstractRunnableC15743b<Void, Void, Void> {
        private C19475b() {
        }

        @Override // p149l.ax00.AbstractRunnableC15743b
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Void mo87095f(Void... voidArr) throws Exception {
            if (qei.this.f154036b) {
                MDLog.m7389d("FepPublishManager", "app exit, do nothing");
                return null;
            }
            vei.m198186e().m198194k("polling");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m174206b(boolean z) {
        this.f154036b = z;
    }

    /* JADX INFO: renamed from: c */
    public void m174207c(long j) {
        if (this.f154035a == null) {
            MDLog.m7389d("FepPublishManager", "start polling task interval = " + j + " minutes");
            this.f154035a = C3804c.m18446f(5, new C19475b(), j, j, TimeUnit.MINUTES);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m174208d() {
        if (this.f154035a != null) {
            MDLog.m7389d("FepPublishManager", "stop polling");
            this.f154035a.cancel(true);
        }
    }
}
