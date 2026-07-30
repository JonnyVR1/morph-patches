package p153l;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.beatles.p077v2.data.MonitorStackFrame;
import com.tantanapp.beatles.p077v2.data.MonitorStackTrace;
import com.tantanapp.beatles.p077v2.data.MonitorThread;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class i610 {

    /* JADX INFO: renamed from: a */
    public final h610 f113130a;

    /* JADX INFO: renamed from: b */
    public final long f113131b = Looper.getMainLooper().getThread().getId();

    public i610(h610 h610Var) {
        this.f113130a = h610Var;
    }

    /* JADX INFO: renamed from: a */
    public List<MonitorThread> m138794a(@Nullable List<Long> list) {
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
            arrayList.add(m138795b(list != null && list.contains(Long.valueOf(entry.getKey().getId())), entry.getValue(), entry.getKey()));
        }
        return arrayList;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public final MonitorThread m138795b(boolean z, @NonNull StackTraceElement[] stackTraceElementArr, @NonNull Thread thread) {
        List<MonitorStackFrame> listM133677a;
        MonitorThread monitorThread = new MonitorThread();
        monitorThread.setName(thread.getName());
        monitorThread.setId(Long.valueOf(thread.getId()));
        monitorThread.setState(thread.getState().name());
        monitorThread.setCrashed(Boolean.valueOf(z));
        monitorThread.setCurrent(Boolean.valueOf(this.f113131b == thread.getId()));
        if (!z && (listM133677a = this.f113130a.m133677a(stackTraceElementArr)) != null && !listM133677a.isEmpty()) {
            monitorThread.setStacktrace(new MonitorStackTrace(listM133677a));
        }
        return monitorThread;
    }
}
