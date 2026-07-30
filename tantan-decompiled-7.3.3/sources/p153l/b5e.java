package p153l;

import com.facebook.cache.disk.C1610c;
import com.facebook.cache.disk.InterfaceC1609b;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public class b5e implements jii {

    /* JADX INFO: renamed from: a */
    public c5e f75054a;

    public b5e(c5e c5eVar) {
        this.f75054a = c5eVar;
    }

    /* JADX INFO: renamed from: b */
    public static C1610c m102568b(b4e b4eVar, InterfaceC1609b interfaceC1609b) {
        return m102569c(b4eVar, interfaceC1609b, Executors.newSingleThreadExecutor());
    }

    /* JADX INFO: renamed from: c */
    public static C1610c m102569c(b4e b4eVar, InterfaceC1609b interfaceC1609b, Executor executor) {
        return new C1610c(interfaceC1609b, b4eVar.m102422h(), new C1610c.c(b4eVar.m102425k(), b4eVar.m102424j(), b4eVar.m102420f()), b4eVar.m102419e(), b4eVar.m102418d(), b4eVar.m102421g(), executor, b4eVar.m102423i());
    }

    @Override // p153l.jii
    /* JADX INFO: renamed from: a */
    public iii mo102570a(b4e b4eVar) {
        return m102568b(b4eVar, this.f75054a.mo108049a(b4eVar));
    }
}
