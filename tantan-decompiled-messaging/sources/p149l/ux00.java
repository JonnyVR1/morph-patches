package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.beatles.p072v2.data.MonitorException;
import com.tantanapp.beatles.p072v2.data.MonitorStackFrame;
import com.tantanapp.beatles.p072v2.data.MonitorStackTrace;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class ux00 {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final xx00 f178695a;

    public ux00(@NonNull xx00 xx00Var) {
        this.f178695a = xx00Var;
    }

    /* JADX INFO: renamed from: a */
    public Deque<MonitorException> m196142a(@NonNull Throwable th, @Nullable Thread thread, @Nullable String str) {
        ArrayDeque arrayDeque = new ArrayDeque();
        HashSet hashSet = new HashSet();
        while (th != null && hashSet.add(th)) {
            arrayDeque.addFirst(m196143b(th, thread));
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
    public final MonitorException m196143b(@NonNull Throwable th, @Nullable Thread thread) {
        Package r0 = th.getClass().getPackage();
        String name = th.getClass().getName();
        MonitorException monitorException = new MonitorException();
        String message = th.getMessage();
        if (r0 != null) {
            name = name.replace(r0.getName() + ".", "");
        }
        String name2 = r0 != null ? r0.getName() : null;
        List<MonitorStackFrame> listM211441a = this.f178695a.m211441a(th.getStackTrace());
        if (listM211441a != null && !listM211441a.isEmpty()) {
            monitorException.setStacktrace(new MonitorStackTrace(listM211441a));
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
    public List<MonitorException> m196144c(Throwable th, @Nullable Thread thread, @Nullable String str) {
        return m196145d(m196142a(th, thread, str));
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public final List<MonitorException> m196145d(@NonNull Deque<MonitorException> deque) {
        return new ArrayList(deque);
    }
}
