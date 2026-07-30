package p149l;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class vw2 {

    /* JADX INFO: renamed from: b */
    private static volatile vw2 f183297b;

    /* JADX INFO: renamed from: a */
    private final ArrayList<String> f183298a = new ArrayList<>();

    private vw2() {
    }

    /* JADX INFO: renamed from: b */
    public static vw2 m200277b() {
        if (f183297b == null) {
            synchronized (vw2.class) {
                try {
                    if (f183297b == null) {
                        f183297b = new vw2();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f183297b;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m200278a() {
        this.f183298a.clear();
    }

    /* JADX INFO: renamed from: c */
    public synchronized boolean m200279c() {
        return this.f183298a.isEmpty();
    }

    /* JADX INFO: renamed from: d */
    public synchronized boolean m200280d(String str) {
        return this.f183298a.contains(str);
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m200281e(String str) {
        this.f183298a.add(str);
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m200282f(String str) {
        this.f183298a.remove(str);
    }
}
