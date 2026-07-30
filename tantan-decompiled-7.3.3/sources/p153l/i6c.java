package p153l;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface i6c<T> {
    /* JADX INFO: renamed from: a */
    boolean mo8232a();

    /* JADX INFO: renamed from: b */
    Throwable mo8233b();

    /* JADX INFO: renamed from: c */
    float mo8234c();

    boolean close();

    /* JADX INFO: renamed from: d */
    boolean mo8235d();

    /* JADX INFO: renamed from: e */
    boolean mo8236e();

    /* JADX INFO: renamed from: f */
    void mo8237f(s6c<T> s6cVar, Executor executor);

    Map<String, Object> getExtras();

    T getResult();
}
