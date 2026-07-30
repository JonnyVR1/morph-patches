package p149l;

import com.cosmos.mdlog.MDLog;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class cgh0 implements v3m {

    /* JADX INFO: renamed from: a */
    private final HashMap<String, Object> f80745a = new HashMap<>();

    @Override // p149l.v3m
    /* JADX INFO: renamed from: a */
    public boolean mo106708a(String str) {
        if (str == null) {
            return false;
        }
        Object objRemove = this.f80745a.remove(str);
        MDLog.m7389d("SYNC-ObjectPool", "removeKeyAndNotify: " + str + " sync obj: " + objRemove);
        if (objRemove == null) {
            return false;
        }
        synchronized (objRemove) {
            objRemove.notifyAll();
        }
        return true;
    }

    @Override // p149l.v3m
    /* JADX INFO: renamed from: b */
    public boolean mo106709b(String str) throws InterruptedException {
        if (str == null) {
            return false;
        }
        Object obj = this.f80745a.get(str);
        MDLog.m7389d("SYNC-ObjectPool", "waitForKey: " + str + " sync obj: " + obj);
        if (obj == null) {
            return false;
        }
        synchronized (obj) {
            obj.wait();
        }
        return true;
    }

    @Override // p149l.v3m
    /* JADX INFO: renamed from: c */
    public void mo106710c(String str) {
        this.f80745a.put(str, new Object());
    }
}
