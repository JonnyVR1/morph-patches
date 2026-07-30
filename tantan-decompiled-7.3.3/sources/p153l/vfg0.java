package p153l;

import Sudchar.Sudint;
import android.net.Uri;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.gms.common.api.Api;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class vfg0 {

    /* JADX INFO: renamed from: y */
    public static final ThreadPoolExecutor f183900y = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), new vng0("OkDownload file io"));

    /* JADX INFO: renamed from: f */
    public final int f183906f;

    /* JADX INFO: renamed from: g */
    public final int f183907g;

    /* JADX INFO: renamed from: h */
    public final int f183908h;

    /* JADX INFO: renamed from: i */
    public final bog0 f183909i;

    /* JADX INFO: renamed from: j */
    public final aug0 f183910j;

    /* JADX INFO: renamed from: k */
    public final ehg0 f183911k;

    /* JADX INFO: renamed from: l */
    public final boolean f183912l;

    /* JADX INFO: renamed from: m */
    public final boolean f183913m;

    /* JADX INFO: renamed from: n */
    public volatile Future f183914n;

    /* JADX INFO: renamed from: o */
    public volatile Thread f183915o;

    /* JADX INFO: renamed from: q */
    public final fwg0 f183917q;

    /* JADX INFO: renamed from: r */
    public String f183918r;

    /* JADX INFO: renamed from: s */
    public IOException f183919s;

    /* JADX INFO: renamed from: t */
    public final ArrayList f183920t;

    /* JADX INFO: renamed from: u */
    public ArrayList f183921u;

    /* JADX INFO: renamed from: a */
    public final SparseArray f183901a = new SparseArray();

    /* JADX INFO: renamed from: b */
    public final SparseArray f183902b = new SparseArray();

    /* JADX INFO: renamed from: c */
    public final AtomicLong f183903c = new AtomicLong();

    /* JADX INFO: renamed from: d */
    public final AtomicLong f183904d = new AtomicLong();

    /* JADX INFO: renamed from: e */
    public boolean f183905e = false;

    /* JADX INFO: renamed from: p */
    public final SparseArray f183916p = new SparseArray();

    /* JADX INFO: renamed from: v */
    public final veg0 f183922v = new veg0();

    /* JADX INFO: renamed from: w */
    public final veg0 f183923w = new veg0();

    /* JADX INFO: renamed from: x */
    public volatile boolean f183924x = true;

    public vfg0(aug0 aug0Var, bog0 bog0Var, ehg0 ehg0Var) {
        this.f183910j = aug0Var;
        this.f183906f = aug0Var.f73500i;
        this.f183907g = aug0Var.f73501j;
        this.f183908h = aug0Var.f73502k;
        this.f183909i = bog0Var;
        this.f183911k = ehg0Var;
        zqg0 zqg0Var = jwg0.m147162a().f122923e;
        this.f183912l = true;
        qhg0 qhg0Var = jwg0.m147162a().f122924f;
        zqg0 zqg0Var2 = jwg0.m147162a().f122923e;
        this.f183913m = true;
        this.f183920t = new ArrayList();
        this.f183917q = new fwg0(this);
        File fileM100397j = aug0Var.m100397j();
        if (fileM100397j != null) {
            this.f183918r = fileM100397j.getAbsolutePath();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m201117a() {
        int size;
        long j;
        synchronized (this.f183902b) {
            size = this.f183902b.size();
        }
        SparseArray sparseArray = new SparseArray(size);
        int i = 0;
        while (true) {
            j = 0;
            if (i >= size) {
                break;
            }
            try {
                int iKeyAt = this.f183901a.keyAt(i);
                long j2 = ((AtomicLong) this.f183902b.get(iKeyAt)).get();
                if (j2 > 0) {
                    sparseArray.put(iKeyAt, Long.valueOf(j2));
                    qng0 qng0Var = (qng0) ((ojg0) this.f183901a.get(iKeyAt));
                    qng0Var.f158485c.flush();
                    qng0Var.f158484b.getFileDescriptor().sync();
                }
                i++;
            } catch (IOException e) {
                e.toString();
                return;
            }
        }
        int size2 = sparseArray.size();
        for (int i2 = 0; i2 < size2; i2++) {
            int iKeyAt2 = sparseArray.keyAt(i2);
            long jLongValue = ((Long) sparseArray.valueAt(i2)).longValue();
            this.f183911k.mo97635g(this.f183909i, iKeyAt2, jLongValue);
            j += jLongValue;
            ((AtomicLong) this.f183902b.get(iKeyAt2)).addAndGet(-jLongValue);
            int i3 = this.f183910j.f73493b;
            ((akg0) this.f183909i.f77680g.get(iKeyAt2)).f72005c.get();
        }
        this.f183903c.addAndGet(-j);
        this.f183904d.set(SystemClock.uptimeMillis());
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m201118b(int i) {
        ojg0 ojg0Var = (ojg0) this.f183901a.get(i);
        if (ojg0Var != null) {
            qng0 qng0Var = (qng0) ojg0Var;
            qng0Var.f158485c.close();
            qng0Var.f158486d.close();
            qng0Var.f158484b.close();
            this.f183901a.remove(i);
            int i2 = this.f183910j.f73493b;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m201119c(int i, boolean z) {
        if (this.f183914n == null || this.f183914n.isDone()) {
            return;
        }
        if (!z) {
            this.f183916p.put(i, Thread.currentThread());
        }
        if (this.f183915o != null) {
            LockSupport.unpark(this.f183915o);
        } else {
            while (this.f183915o == null) {
                LockSupport.parkNanos(25000000L);
            }
            LockSupport.unpark(this.f183915o);
        }
        if (!z) {
            LockSupport.park();
            return;
        }
        LockSupport.unpark(this.f183915o);
        try {
            this.f183914n.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m201120d(veg0 veg0Var) {
        veg0Var.f183772c.clear();
        int size = new HashSet((List) this.f183920t.clone()).size();
        int size2 = this.f183921u.size();
        aug0 aug0Var = this.f183910j;
        if (size != size2) {
            int i = aug0Var.f73493b;
            this.f183921u.size();
            veg0Var.f183770a = false;
        } else {
            int i2 = aug0Var.f73493b;
            this.f183921u.size();
            veg0Var.f183770a = true;
        }
        SparseArray sparseArrayClone = this.f183901a.clone();
        int size3 = sparseArrayClone.size();
        for (int i3 = 0; i3 < size3; i3++) {
            int iKeyAt = sparseArrayClone.keyAt(i3);
            if (this.f183920t.contains(Integer.valueOf(iKeyAt)) && !veg0Var.f183771b.contains(Integer.valueOf(iKeyAt))) {
                veg0Var.f183771b.add(Integer.valueOf(iKeyAt));
                veg0Var.f183772c.add(Integer.valueOf(iKeyAt));
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized ojg0 m201121e(int i) {
        Uri uriFromFile;
        try {
            ojg0 ojg0Var = (ojg0) this.f183901a.get(i);
            if (ojg0Var != null) {
                return ojg0Var;
            }
            boolean zEquals = this.f183910j.f73495d.getScheme().equals("file");
            aug0 aug0Var = this.f183910j;
            if (zEquals) {
                File fileM100397j = aug0Var.m100397j();
                if (fileM100397j == null) {
                    throw new FileNotFoundException("Filename is not ready!");
                }
                File file = this.f183910j.f73512u;
                if (!file.exists() && !file.mkdirs()) {
                    throw new IOException("Create parent folder failed!");
                }
                if (fileM100397j.createNewFile()) {
                    fileM100397j.getName();
                }
                uriFromFile = Uri.fromFile(fileM100397j);
            } else {
                uriFromFile = aug0Var.f73495d;
            }
            zqg0 zqg0Var = jwg0.m147162a().f122923e;
            qng0 qng0Var = new qng0(jwg0.m147162a().f122926h, uriFromFile, this.f183906f);
            if (this.f183912l) {
                akg0 akg0Var = (akg0) this.f183909i.f77680g.get(i);
                long j = akg0Var.f72005c.get() + akg0Var.f72003a;
                if (j > 0) {
                    qng0Var.f158483a.position(j);
                    int i2 = this.f183910j.f73493b;
                }
            }
            if (this.f183924x) {
                this.f183911k.mo97634f(this.f183910j.f73493b);
            }
            if (!this.f183909i.f77682i && this.f183924x && this.f183913m) {
                long jM105679c = this.f183909i.m105679c();
                if (zEquals) {
                    File fileM100397j2 = this.f183910j.m100397j();
                    long length = jM105679c - fileM100397j2.length();
                    if (length > 0) {
                        long jM217310b = ytg0.m217310b(new StatFs(fileM100397j2.getAbsolutePath()));
                        if (jM217310b < length) {
                            throw new Sudint(length, jM217310b);
                        }
                        qng0Var.m177214a(jM105679c);
                    }
                } else {
                    qng0Var.m177214a(jM105679c);
                }
            }
            synchronized (this.f183902b) {
                this.f183901a.put(i, qng0Var);
                this.f183902b.put(i, new AtomicLong());
            }
            this.f183924x = false;
            return qng0Var;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m201122f() {
        int i;
        int i2;
        int i3 = this.f183910j.f73493b;
        this.f183915o = Thread.currentThread();
        long jUptimeMillis = this.f183908h;
        m201117a();
        while (true) {
            LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(jUptimeMillis));
            m201120d(this.f183923w);
            veg0 veg0Var = this.f183923w;
            if (veg0Var.f183770a || veg0Var.f183772c.size() > 0) {
                veg0 veg0Var2 = this.f183923w;
                boolean z = veg0Var2.f183770a;
                Objects.toString(veg0Var2.f183772c);
                if (this.f183903c.get() > 0) {
                    m201117a();
                }
                ArrayList arrayList = this.f183923w.f183772c;
                int size = arrayList.size();
                i = 0;
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    Integer num = (Integer) obj;
                    Thread thread = (Thread) this.f183916p.get(num.intValue());
                    this.f183916p.remove(num.intValue());
                    if (thread != null) {
                        LockSupport.unpark(thread);
                    }
                }
                if (this.f183923w.f183770a) {
                    break;
                }
            } else {
                if (this.f183903c.get() < this.f183907g) {
                    i2 = this.f183908h;
                } else {
                    jUptimeMillis = ((long) this.f183908h) - (SystemClock.uptimeMillis() - this.f183904d.get());
                    if (jUptimeMillis <= 0) {
                        m201117a();
                        i2 = this.f183908h;
                    }
                }
                jUptimeMillis = i2;
            }
        }
        int size2 = this.f183916p.size();
        while (true) {
            SparseArray sparseArray = this.f183916p;
            if (i >= size2) {
                sparseArray.clear();
                int i5 = this.f183910j.f73493b;
                return;
            } else {
                Thread thread2 = (Thread) sparseArray.valueAt(i);
                if (thread2 != null) {
                    LockSupport.unpark(thread2);
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m201123g() throws IOException {
        IOException iOException = this.f183919s;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f183914n == null) {
            synchronized (this.f183917q) {
                try {
                    if (this.f183914n == null) {
                        this.f183914n = f183900y.submit(this.f183917q);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m201124h(int i) {
        this.f183920t.add(Integer.valueOf(i));
        try {
            IOException iOException = this.f183919s;
            if (iOException != null) {
                throw iOException;
            }
            if (this.f183914n != null && !this.f183914n.isDone()) {
                AtomicLong atomicLong = (AtomicLong) this.f183902b.get(i);
                if (atomicLong != null && atomicLong.get() > 0) {
                    m201120d(this.f183922v);
                    m201119c(i, this.f183922v.f183770a);
                }
            } else if (this.f183914n == null) {
                int i2 = this.f183910j.f73493b;
            } else {
                this.f183914n.isDone();
                int i3 = this.f183910j.f73493b;
            }
            m201118b(i);
        } catch (Throwable th) {
            m201118b(i);
            throw th;
        }
    }
}
