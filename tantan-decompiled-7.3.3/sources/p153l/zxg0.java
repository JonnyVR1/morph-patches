package p153l;

/* JADX INFO: loaded from: classes.dex */
public final class zxg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Exception f206460a;

    public zxg0(Exception exc) {
        this.f206460a = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        throw new RuntimeException(this.f206460a);
    }
}
