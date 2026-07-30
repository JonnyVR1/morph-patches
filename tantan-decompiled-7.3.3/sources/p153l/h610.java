package p153l;

import androidx.annotation.Nullable;
import com.tantanapp.beatles.p077v2.data.MonitorStackFrame;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class h610 {
    @Nullable
    /* JADX INFO: renamed from: a */
    public List<MonitorStackFrame> m133677a(@Nullable StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                String className = stackTraceElement.getClassName();
                MonitorStackFrame monitorStackFrame = new MonitorStackFrame();
                monitorStackFrame.setModule(className);
                monitorStackFrame.setFunction(stackTraceElement.getMethodName());
                monitorStackFrame.setFilename(stackTraceElement.getFileName());
                if (stackTraceElement.getLineNumber() >= 0) {
                    monitorStackFrame.setLineno(Integer.valueOf(stackTraceElement.getLineNumber()));
                }
                arrayList.add(monitorStackFrame);
            }
        }
        return arrayList;
    }
}
