package p149l;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface c5c<T> {
    /* JADX INFO: renamed from: a */
    boolean mo8178a();

    /* JADX INFO: renamed from: b */
    Throwable mo8179b();

    /* JADX INFO: renamed from: c */
    float mo8180c();

    boolean close();

    /* JADX INFO: renamed from: d */
    boolean mo8181d();

    /* JADX INFO: renamed from: e */
    boolean mo8182e();

    /* JADX INFO: renamed from: f */
    void mo8183f(m5c<T> m5cVar, Executor executor);

    Map<String, Object> getExtras();

    T getResult();
}
