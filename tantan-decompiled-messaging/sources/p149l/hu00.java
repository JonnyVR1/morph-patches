package p149l;

import android.os.Handler;
import android.os.Looper;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes7.dex */
public class hu00 extends Handler {

    /* JADX INFO: renamed from: a */
    protected Set<InterfaceC17393b> f109459a;

    /* JADX INFO: renamed from: b */
    protected Set<InterfaceC17394c> f109460b;

    /* JADX INFO: renamed from: c */
    protected Set<InterfaceC17395d> f109461c;

    /* JADX INFO: renamed from: d */
    protected Set<InterfaceC17393b> f109462d;

    /* JADX INFO: renamed from: e */
    protected Set<InterfaceC17394c> f109463e;

    /* JADX INFO: renamed from: f */
    protected Set<InterfaceC17395d> f109464f;

    /* JADX INFO: renamed from: g */
    boolean f109465g;

    /* JADX INFO: renamed from: h */
    boolean f109466h;

    /* JADX INFO: renamed from: i */
    boolean f109467i;

    /* JADX INFO: renamed from: j */
    private final String f109468j;

    /* JADX INFO: renamed from: l.hu00$a */
    public interface InterfaceC17392a {
        /* JADX INFO: renamed from: g */
        void mo128349g(int i, int i2, int i3, Object obj);
    }

    /* JADX INFO: renamed from: l.hu00$b */
    public interface InterfaceC17393b {
        /* JADX INFO: renamed from: q0 */
        void mo19749q0(int i, int i2, Object obj);

        /* JADX INFO: renamed from: w0 */
        void mo19750w0(int i, int i2, Object obj);
    }

    /* JADX INFO: renamed from: l.hu00$c */
    public interface InterfaceC17394c {
        /* JADX INFO: renamed from: a */
        void mo99216a(int i, int i2, Object obj);
    }

    /* JADX INFO: renamed from: l.hu00$d */
    public interface InterfaceC17395d {
        /* JADX INFO: renamed from: d0 */
        void mo19733d0(Object obj);

        /* JADX INFO: renamed from: j0 */
        void mo19741j0(Object obj);
    }

    public hu00(Looper looper) {
        super(looper);
        this.f109465g = false;
        this.f109466h = false;
        this.f109467i = false;
        this.f109468j = "MomoEventHandler";
        this.f109459a = new CopyOnWriteArraySet();
        this.f109460b = new CopyOnWriteArraySet();
        this.f109461c = new CopyOnWriteArraySet();
        this.f109463e = new CopyOnWriteArraySet();
        this.f109462d = new CopyOnWriteArraySet();
        this.f109464f = new CopyOnWriteArraySet();
    }

    /* JADX INFO: renamed from: a */
    public void m132944a(InterfaceC17393b interfaceC17393b) {
        synchronized (this.f109459a) {
            this.f109459a.add(interfaceC17393b);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m132945b(InterfaceC17394c interfaceC17394c) {
        synchronized (this.f109460b) {
            this.f109460b.add(interfaceC17394c);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m132946c(InterfaceC17395d interfaceC17395d) {
        synchronized (this.f109461c) {
            this.f109461c.add(interfaceC17395d);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m132947d() {
        this.f109465g = true;
    }

    /* JADX INFO: renamed from: e */
    public void m132948e() {
        this.f109466h = true;
    }

    /* JADX INFO: renamed from: f */
    public void m132949f() {
        this.f109467i = true;
    }

    /* JADX INFO: renamed from: g */
    public void m132950g(InterfaceC17393b interfaceC17393b) {
        synchronized (this.f109462d) {
            this.f109462d.add(interfaceC17393b);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m132951h(InterfaceC17394c interfaceC17394c) {
        synchronized (this.f109463e) {
            this.f109463e.add(interfaceC17394c);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m132952i(InterfaceC17395d interfaceC17395d) {
        synchronized (this.f109464f) {
            this.f109464f.add(interfaceC17395d);
        }
    }
}
