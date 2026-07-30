package p153l;

import android.os.Handler;
import android.os.Looper;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes8.dex */
public class q210 extends Handler {

    /* JADX INFO: renamed from: a */
    protected Set<InterfaceC19501b> f155257a;

    /* JADX INFO: renamed from: b */
    protected Set<InterfaceC19502c> f155258b;

    /* JADX INFO: renamed from: c */
    protected Set<InterfaceC19503d> f155259c;

    /* JADX INFO: renamed from: d */
    protected Set<InterfaceC19501b> f155260d;

    /* JADX INFO: renamed from: e */
    protected Set<InterfaceC19502c> f155261e;

    /* JADX INFO: renamed from: f */
    protected Set<InterfaceC19503d> f155262f;

    /* JADX INFO: renamed from: g */
    boolean f155263g;

    /* JADX INFO: renamed from: h */
    boolean f155264h;

    /* JADX INFO: renamed from: i */
    boolean f155265i;

    /* JADX INFO: renamed from: j */
    private final String f155266j;

    /* JADX INFO: renamed from: l.q210$a */
    public interface InterfaceC19500a {
        /* JADX INFO: renamed from: g */
        void mo165950g(int i, int i2, int i3, Object obj);
    }

    /* JADX INFO: renamed from: l.q210$b */
    public interface InterfaceC19501b {
        /* JADX INFO: renamed from: q0 */
        void mo20748q0(int i, int i2, Object obj);

        /* JADX INFO: renamed from: w0 */
        void mo20749w0(int i, int i2, Object obj);
    }

    /* JADX INFO: renamed from: l.q210$c */
    public interface InterfaceC19502c {
        /* JADX INFO: renamed from: a */
        void mo133538a(int i, int i2, Object obj);
    }

    /* JADX INFO: renamed from: l.q210$d */
    public interface InterfaceC19503d {
        /* JADX INFO: renamed from: d0 */
        void mo20732d0(Object obj);

        /* JADX INFO: renamed from: j0 */
        void mo20740j0(Object obj);
    }

    public q210(Looper looper) {
        super(looper);
        this.f155263g = false;
        this.f155264h = false;
        this.f155265i = false;
        this.f155266j = "MomoEventHandler";
        this.f155257a = new CopyOnWriteArraySet();
        this.f155258b = new CopyOnWriteArraySet();
        this.f155259c = new CopyOnWriteArraySet();
        this.f155261e = new CopyOnWriteArraySet();
        this.f155260d = new CopyOnWriteArraySet();
        this.f155262f = new CopyOnWriteArraySet();
    }

    /* JADX INFO: renamed from: a */
    public void m174968a(InterfaceC19501b interfaceC19501b) {
        synchronized (this.f155257a) {
            this.f155257a.add(interfaceC19501b);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m174969b(InterfaceC19502c interfaceC19502c) {
        synchronized (this.f155258b) {
            this.f155258b.add(interfaceC19502c);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m174970c(InterfaceC19503d interfaceC19503d) {
        synchronized (this.f155259c) {
            this.f155259c.add(interfaceC19503d);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m174971d() {
        this.f155263g = true;
    }

    /* JADX INFO: renamed from: e */
    public void m174972e() {
        this.f155264h = true;
    }

    /* JADX INFO: renamed from: f */
    public void m174973f() {
        this.f155265i = true;
    }

    /* JADX INFO: renamed from: g */
    public void m174974g(InterfaceC19501b interfaceC19501b) {
        synchronized (this.f155260d) {
            this.f155260d.add(interfaceC19501b);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m174975h(InterfaceC19502c interfaceC19502c) {
        synchronized (this.f155261e) {
            this.f155261e.add(interfaceC19502c);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m174976i(InterfaceC19503d interfaceC19503d) {
        synchronized (this.f155262f) {
            this.f155262f.add(interfaceC19503d);
        }
    }
}
