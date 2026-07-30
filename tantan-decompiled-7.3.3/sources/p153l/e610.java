package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.beatles.p077v2.data.MonitorException;
import com.tantanapp.beatles.p077v2.data.MonitorStackFrame;
import com.tantanapp.beatles.p077v2.data.MonitorStackTrace;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class e610 {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final h610 f92253a;

    public e610(@NonNull h610 h610Var) {
        this.f92253a = h610Var;
    }

    /* JADX INFO: renamed from: a */
    public Deque<MonitorException> m119567a(@NonNull Throwable th, @Nullable Thread thread, @Nullable String str) {
        ArrayDeque arrayDeque = new ArrayDeque();
        HashSet hashSet = new HashSet();
        while (th != null && hashSet.add(th)) {
            arrayDeque.addFirst(m119568b(th, thread));
            th = th.getCause();
        }
        if (arrayDeque.size() > 0 && !TextUtils.isEmpty(str)) {
            ((MonitorException) arrayDeque.getFirst()).setType(str);
            ((MonitorException) arrayDeque.getFirst()).setModule("");
        }
        return arrayDeque;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public final MonitorException m119568b(@NonNull Throwable th, @Nullable Thread thread) {
        Package r0 = th.getClass().getPackage();
        String name = th.getClass().getName();
        MonitorException monitorException = new MonitorException();
        String message = th.getMessage();
        if (r0 != null) {
            name = name.replace(r0.getName() + ".", "");
        }
        String name2 = r0 != null ? r0.getName() : null;
        List<MonitorStackFrame> listM133677a = this.f92253a.m133677a(th.getStackTrace());
        if (listM133677a != null && !listM133677a.isEmpty()) {
            monitorException.setStacktrace(new MonitorStackTrace(listM133677a));
        }
        if (thread != null) {
            monitorException.setThreadId(Long.valueOf(thread.getId()));
            monitorException.setThreadName(thread.getName());
        }
        monitorException.setType(name);
        monitorException.setModule(name2);
        monitorException.setValue(message);
        return monitorException;
    }

    /* JADX INFO: renamed from: c */
    public List<MonitorException> m119569c(Throwable th, @Nullable Thread thread, @Nullable String str) {
        return m119570d(m119567a(th, thread, str));
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public final List<MonitorException> m119570d(@NonNull Deque<MonitorException> deque) {
        return new ArrayList(deque);
    }
}
