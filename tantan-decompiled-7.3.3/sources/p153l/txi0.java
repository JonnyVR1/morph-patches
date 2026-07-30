package p153l;

/* JADX INFO: loaded from: classes13.dex */
public class txi0 implements z0j0 {
    @Override // p153l.z0j0
    /* JADX INFO: renamed from: a */
    public nyv mo142978a(nyv nyvVar) {
        Thread threadCurrentThread = Thread.currentThread();
        StackTraceElement[] stackTrace = threadCurrentThread.getStackTrace();
        nyvVar.f144356a.add(threadCurrentThread.getId() + "");
        nyvVar.f144356a.add(threadCurrentThread.getName());
        nyvVar.f144356a.add(stackTrace[6].getFileName());
        nyvVar.f144356a.add(stackTrace[6].getMethodName());
        nyvVar.f144356a.add(stackTrace[6].getLineNumber() + "");
        nyvVar.f144359d = stackTrace[6].getFileName();
        nyvVar.f144360e = stackTrace[6].getMethodName();
        nyvVar.f144361f = stackTrace[6].getLineNumber() + "";
        return nyvVar;
    }
}
