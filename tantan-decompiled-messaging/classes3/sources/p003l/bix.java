package p003l;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.e51;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class bix {

    /* JADX INFO: renamed from: a */
    public List<InterfaceC0171a> f2399a;

    /* JADX INFO: renamed from: b */
    public int f2400b;

    /* JADX INFO: renamed from: l.bix$a */
    public interface InterfaceC0171a {
        /* JADX INFO: renamed from: a */
        void m2959a(int i, int i2, Bundle bundle);
    }

    /* JADX INFO: renamed from: l.bix$b */
    public static final class C0172b {
        private static final bix INSTANCE = new bix();
    }

    public bix() {
        this.f2399a = new ArrayList();
        this.f2400b = -1;
    }

    /* JADX INFO: renamed from: b */
    public static bix m2953b() {
        return C0172b.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public boolean m2954c() {
        return this.f2400b == 0;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m2955d(int i, int i2, Bundle bundle) {
        Iterator<InterfaceC0171a> it = this.f2399a.iterator();
        while (it.hasNext()) {
            it.next().m2959a(i, i2, bundle);
        }
        this.f2400b = i2;
    }

    /* JADX INFO: renamed from: e */
    public void m2956e(final int i, final int i2, final Bundle bundle) {
        e51.G(new Runnable() { // from class: l.aix
            @Override // java.lang.Runnable
            public final void run() {
                this.f2218a.m2955d(i, i2, bundle);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public void m2957f(InterfaceC0171a interfaceC0171a) {
        this.f2399a.add(interfaceC0171a);
    }

    /* JADX INFO: renamed from: g */
    public void m2958g(InterfaceC0171a interfaceC0171a) {
        this.f2399a.remove(interfaceC0171a);
    }
}
