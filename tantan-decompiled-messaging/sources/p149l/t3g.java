package p149l;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class t3g {

    /* JADX INFO: renamed from: a */
    private final List<Object> f167634a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b */
    private InterfaceC20102a f167635b;

    /* JADX INFO: renamed from: l.t3g$a */
    public interface InterfaceC20102a {
        /* JADX INFO: renamed from: a */
        List<String> mo108516a();

        /* JADX INFO: renamed from: b */
        List<String> mo108517b();
    }

    public t3g(InterfaceC20102a interfaceC20102a) {
        this.f167635b = interfaceC20102a;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC20102a m187114a() {
        return this.f167635b;
    }
}
