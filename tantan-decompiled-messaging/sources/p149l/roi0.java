package p149l;

/* JADX INFO: loaded from: classes13.dex */
public class roi0 implements wri0 {
    @Override // p149l.wri0
    /* JADX INFO: renamed from: a */
    public nwv mo127713a(nwv nwvVar) {
        Thread threadCurrentThread = Thread.currentThread();
        StackTraceElement[] stackTrace = threadCurrentThread.getStackTrace();
        nwvVar.f140977a.add(threadCurrentThread.getId() + "");
        nwvVar.f140977a.add(threadCurrentThread.getName());
        nwvVar.f140977a.add(stackTrace[6].getFileName());
        nwvVar.f140977a.add(stackTrace[6].getMethodName());
        nwvVar.f140977a.add(stackTrace[6].getLineNumber() + "");
        nwvVar.f140980d = stackTrace[6].getFileName();
        nwvVar.f140981e = stackTrace[6].getMethodName();
        nwvVar.f140982f = stackTrace[6].getLineNumber() + "";
        return nwvVar;
    }
}
