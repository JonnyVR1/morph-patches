package p149l;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class bix {

    /* JADX INFO: renamed from: a */
    public List<InterfaceC15871a> f75843a;

    /* JADX INFO: renamed from: b */
    public int f75844b;

    /* JADX INFO: renamed from: l.bix$a */
    public interface InterfaceC15871a {
        /* JADX INFO: renamed from: a */
        void mo102133a(int i, int i2, Bundle bundle);
    }

    /* JADX INFO: renamed from: l.bix$b */
    public static final class C15872b {
        private static final bix INSTANCE = new bix();
    }

    public bix() {
        this.f75843a = new ArrayList();
        this.f75844b = -1;
    }

    /* JADX INFO: renamed from: b */
    public static bix m102127b() {
        return C15872b.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public boolean m102128c() {
        return this.f75844b == 0;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m102129d(int i, int i2, Bundle bundle) {
        Iterator<InterfaceC15871a> it = this.f75843a.iterator();
        while (it.hasNext()) {
            it.next().mo102133a(i, i2, bundle);
        }
        this.f75844b = i2;
    }

    /* JADX INFO: renamed from: e */
    public void m102130e(final int i, final int i2, final Bundle bundle) {
        e51.m114742G(new Runnable() { // from class: l.aix
            @Override // java.lang.Runnable
            public final void run() {
                this.f70070a.m102129d(i, i2, bundle);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public void m102131f(InterfaceC15871a interfaceC15871a) {
        this.f75843a.add(interfaceC15871a);
    }

    /* JADX INFO: renamed from: g */
    public void m102132g(InterfaceC15871a interfaceC15871a) {
        this.f75843a.remove(interfaceC15871a);
    }
}
