package p149l;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.beatles.p072v2.data.MonitorStackFrame;
import com.tantanapp.beatles.p072v2.data.MonitorStackTrace;
import com.tantanapp.beatles.p072v2.data.MonitorThread;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class yx00 {

    /* JADX INFO: renamed from: a */
    public final xx00 f200560a;

    /* JADX INFO: renamed from: b */
    public final long f200561b = Looper.getMainLooper().getThread().getId();

    public yx00(xx00 xx00Var) {
        this.f200560a = xx00Var;
    }

    /* JADX INFO: renamed from: a */
    public List<MonitorThread> m216424a(@Nullable List<Long> list) {
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        Thread threadCurrentThread = Thread.currentThread();
        if (allStackTraces.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!allStackTraces.containsKey(threadCurrentThread)) {
            allStackTraces.put(threadCurrentThread, threadCurrentThread.getStackTrace());
        }
        for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
            arrayList.add(m216425b(list != null && list.contains(Long.valueOf(entry.getKey().getId())), entry.getValue(), entry.getKey()));
        }
        return arrayList;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public final MonitorThread m216425b(boolean z, @NonNull StackTraceElement[] stackTraceElementArr, @NonNull Thread thread) {
        List<MonitorStackFrame> listM211441a;
        MonitorThread monitorThread = new MonitorThread();
        monitorThread.setName(thread.getName());
        monitorThread.setId(Long.valueOf(thread.getId()));
        monitorThread.setState(thread.getState().name());
        monitorThread.setCrashed(Boolean.valueOf(z));
        monitorThread.setCurrent(Boolean.valueOf(this.f200561b == thread.getId()));
        if (!z && (listM211441a = this.f200560a.m211441a(stackTraceElementArr)) != null && !listM211441a.isEmpty()) {
            monitorThread.setStacktrace(new MonitorStackTrace(listM211441a));
        }
        return monitorThread;
    }
}
