package p153l;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class h5g {

    /* JADX INFO: renamed from: a */
    private final List<Object> f107940a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b */
    private InterfaceC17403a f107941b;

    /* JADX INFO: renamed from: l.h5g$a */
    public interface InterfaceC17403a {
        /* JADX INFO: renamed from: a */
        List<String> mo122675a();

        /* JADX INFO: renamed from: b */
        List<String> mo122676b();
    }

    public h5g(InterfaceC17403a interfaceC17403a) {
        this.f107941b = interfaceC17403a;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC17403a m133657a() {
        return this.f107941b;
    }
}
