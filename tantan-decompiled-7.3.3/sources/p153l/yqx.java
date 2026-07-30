package p153l;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class yqx {

    /* JADX INFO: renamed from: a */
    public List<InterfaceC21667a> f201262a;

    /* JADX INFO: renamed from: b */
    public int f201263b;

    /* JADX INFO: renamed from: l.yqx$a */
    public interface InterfaceC21667a {
        /* JADX INFO: renamed from: a */
        void mo142132a(int i, int i2, Bundle bundle);
    }

    /* JADX INFO: renamed from: l.yqx$b */
    public static final class C21668b {
        private static final yqx INSTANCE = new yqx();
    }

    public yqx() {
        this.f201262a = new ArrayList();
        this.f201263b = -1;
    }

    /* JADX INFO: renamed from: b */
    public static yqx m217138b() {
        return C21668b.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public boolean m217139c() {
        return this.f201263b == 0;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m217140d(int i, int i2, Bundle bundle) {
        Iterator<InterfaceC21667a> it = this.f201262a.iterator();
        while (it.hasNext()) {
            it.next().mo142132a(i, i2, bundle);
        }
        this.f201263b = i2;
    }

    /* JADX INFO: renamed from: e */
    public void m217141e(final int i, final int i2, final Bundle bundle) {
        l51.m152887G(new Runnable() { // from class: l.xqx
            @Override // java.lang.Runnable
            public final void run() {
                this.f195863a.m217140d(i, i2, bundle);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public void m217142f(InterfaceC21667a interfaceC21667a) {
        this.f201262a.add(interfaceC21667a);
    }

    /* JADX INFO: renamed from: g */
    public void m217143g(InterfaceC21667a interfaceC21667a) {
        this.f201262a.remove(interfaceC21667a);
    }
}
