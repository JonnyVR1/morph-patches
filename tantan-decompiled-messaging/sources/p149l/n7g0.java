package p149l;

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
public final class n7g0 {

    /* JADX INFO: renamed from: y */
    public static final ThreadPoolExecutor f137505y = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), new nfg0("OkDownload file io"));

    /* JADX INFO: renamed from: f */
    public final int f137511f;

    /* JADX INFO: renamed from: g */
    public final int f137512g;

    /* JADX INFO: renamed from: h */
    public final int f137513h;

    /* JADX INFO: renamed from: i */
    public final tfg0 f137514i;

    /* JADX INFO: renamed from: j */
    public final slg0 f137515j;

    /* JADX INFO: renamed from: k */
    public final w8g0 f137516k;

    /* JADX INFO: renamed from: l */
    public final boolean f137517l;

    /* JADX INFO: renamed from: m */
    public final boolean f137518m;

    /* JADX INFO: renamed from: n */
    public volatile Future f137519n;

    /* JADX INFO: renamed from: o */
    public volatile Thread f137520o;

    /* JADX INFO: renamed from: q */
    public final xng0 f137522q;

    /* JADX INFO: renamed from: r */
    public String f137523r;

    /* JADX INFO: renamed from: s */
    public IOException f137524s;

    /* JADX INFO: renamed from: t */
    public final ArrayList f137525t;

    /* JADX INFO: renamed from: u */
    public ArrayList f137526u;

    /* JADX INFO: renamed from: a */
    public final SparseArray f137506a = new SparseArray();

    /* JADX INFO: renamed from: b */
    public final SparseArray f137507b = new SparseArray();

    /* JADX INFO: renamed from: c */
    public final AtomicLong f137508c = new AtomicLong();

    /* JADX INFO: renamed from: d */
    public final AtomicLong f137509d = new AtomicLong();

    /* JADX INFO: renamed from: e */
    public boolean f137510e = false;

    /* JADX INFO: renamed from: p */
    public final SparseArray f137521p = new SparseArray();

    /* JADX INFO: renamed from: v */
    public final n6g0 f137527v = new n6g0();

    /* JADX INFO: renamed from: w */
    public final n6g0 f137528w = new n6g0();

    /* JADX INFO: renamed from: x */
    public volatile boolean f137529x = true;

    public n7g0(slg0 slg0Var, tfg0 tfg0Var, w8g0 w8g0Var) {
        this.f137515j = slg0Var;
        this.f137511f = slg0Var.f165197i;
        this.f137512g = slg0Var.f165198j;
        this.f137513h = slg0Var.f165199k;
        this.f137514i = tfg0Var;
        this.f137516k = w8g0Var;
        rig0 rig0Var = bog0.m102944a().f76519e;
        this.f137517l = true;
        i9g0 i9g0Var = bog0.m102944a().f76520f;
        rig0 rig0Var2 = bog0.m102944a().f76519e;
        this.f137518m = true;
        this.f137525t = new ArrayList();
        this.f137522q = new xng0(this);
        File fileM184802j = slg0Var.m184802j();
        if (fileM184802j != null) {
            this.f137523r = fileM184802j.getAbsolutePath();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m158127a() {
        int size;
        long j;
        synchronized (this.f137507b) {
            size = this.f137507b.size();
        }
        SparseArray sparseArray = new SparseArray(size);
        int i = 0;
        while (true) {
            j = 0;
            if (i >= size) {
                break;
            }
            try {
                int iKeyAt = this.f137506a.keyAt(i);
                long j2 = ((AtomicLong) this.f137507b.get(iKeyAt)).get();
                if (j2 > 0) {
                    sparseArray.put(iKeyAt, Long.valueOf(j2));
                    ifg0 ifg0Var = (ifg0) ((gbg0) this.f137506a.get(iKeyAt));
                    ifg0Var.f113017c.flush();
                    ifg0Var.f113016b.getFileDescriptor().sync();
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
            this.f137516k.mo98396g(this.f137514i, iKeyAt2, jLongValue);
            j += jLongValue;
            ((AtomicLong) this.f137507b.get(iKeyAt2)).addAndGet(-jLongValue);
            int i3 = this.f137515j.f165190b;
            ((sbg0) this.f137514i.f169981g.get(iKeyAt2)).f163536c.get();
        }
        this.f137508c.addAndGet(-j);
        this.f137509d.set(SystemClock.uptimeMillis());
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m158128b(int i) {
        gbg0 gbg0Var = (gbg0) this.f137506a.get(i);
        if (gbg0Var != null) {
            ifg0 ifg0Var = (ifg0) gbg0Var;
            ifg0Var.f113017c.close();
            ifg0Var.f113018d.close();
            ifg0Var.f113016b.close();
            this.f137506a.remove(i);
            int i2 = this.f137515j.f165190b;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m158129c(int i, boolean z) {
        if (this.f137519n == null || this.f137519n.isDone()) {
            return;
        }
        if (!z) {
            this.f137521p.put(i, Thread.currentThread());
        }
        if (this.f137520o != null) {
            LockSupport.unpark(this.f137520o);
        } else {
            while (this.f137520o == null) {
                LockSupport.parkNanos(25000000L);
            }
            LockSupport.unpark(this.f137520o);
        }
        if (!z) {
            LockSupport.park();
            return;
        }
        LockSupport.unpark(this.f137520o);
        try {
            this.f137519n.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m158130d(n6g0 n6g0Var) {
        n6g0Var.f137401c.clear();
        int size = new HashSet((List) this.f137525t.clone()).size();
        int size2 = this.f137526u.size();
        slg0 slg0Var = this.f137515j;
        if (size != size2) {
            int i = slg0Var.f165190b;
            this.f137526u.size();
            n6g0Var.f137399a = false;
        } else {
            int i2 = slg0Var.f165190b;
            this.f137526u.size();
            n6g0Var.f137399a = true;
        }
        SparseArray sparseArrayClone = this.f137506a.clone();
        int size3 = sparseArrayClone.size();
        for (int i3 = 0; i3 < size3; i3++) {
            int iKeyAt = sparseArrayClone.keyAt(i3);
            if (this.f137525t.contains(Integer.valueOf(iKeyAt)) && !n6g0Var.f137400b.contains(Integer.valueOf(iKeyAt))) {
                n6g0Var.f137400b.add(Integer.valueOf(iKeyAt));
                n6g0Var.f137401c.add(Integer.valueOf(iKeyAt));
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized gbg0 m158131e(int i) {
        Uri uriFromFile;
        try {
            gbg0 gbg0Var = (gbg0) this.f137506a.get(i);
            if (gbg0Var != null) {
                return gbg0Var;
            }
            boolean zEquals = this.f137515j.f165192d.getScheme().equals("file");
            slg0 slg0Var = this.f137515j;
            if (zEquals) {
                File fileM184802j = slg0Var.m184802j();
                if (fileM184802j == null) {
                    throw new FileNotFoundException("Filename is not ready!");
                }
                File file = this.f137515j.f165209u;
                if (!file.exists() && !file.mkdirs()) {
                    throw new IOException("Create parent folder failed!");
                }
                if (fileM184802j.createNewFile()) {
                    fileM184802j.getName();
                }
                uriFromFile = Uri.fromFile(fileM184802j);
            } else {
                uriFromFile = slg0Var.f165192d;
            }
            rig0 rig0Var = bog0.m102944a().f76519e;
            ifg0 ifg0Var = new ifg0(bog0.m102944a().f76522h, uriFromFile, this.f137511f);
            if (this.f137517l) {
                sbg0 sbg0Var = (sbg0) this.f137514i.f169981g.get(i);
                long j = sbg0Var.f163536c.get() + sbg0Var.f163534a;
                if (j > 0) {
                    ifg0Var.f113015a.position(j);
                    int i2 = this.f137515j.f165190b;
                }
            }
            if (this.f137529x) {
                this.f137516k.mo98395f(this.f137515j.f165190b);
            }
            if (!this.f137514i.f169983i && this.f137529x && this.f137518m) {
                long jM188707c = this.f137514i.m188707c();
                if (zEquals) {
                    File fileM184802j2 = this.f137515j.m184802j();
                    long length = jM188707c - fileM184802j2.length();
                    if (length > 0) {
                        long jM175479b = qlg0.m175479b(new StatFs(fileM184802j2.getAbsolutePath()));
                        if (jM175479b < length) {
                            throw new Sudint(length, jM175479b);
                        }
                        ifg0Var.m135922a(jM188707c);
                    }
                } else {
                    ifg0Var.m135922a(jM188707c);
                }
            }
            synchronized (this.f137507b) {
                this.f137506a.put(i, ifg0Var);
                this.f137507b.put(i, new AtomicLong());
            }
            this.f137529x = false;
            return ifg0Var;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m158132f() {
        int i;
        int i2;
        int i3 = this.f137515j.f165190b;
        this.f137520o = Thread.currentThread();
        long jUptimeMillis = this.f137513h;
        m158127a();
        while (true) {
            LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(jUptimeMillis));
            m158130d(this.f137528w);
            n6g0 n6g0Var = this.f137528w;
            if (n6g0Var.f137399a || n6g0Var.f137401c.size() > 0) {
                n6g0 n6g0Var2 = this.f137528w;
                boolean z = n6g0Var2.f137399a;
                Objects.toString(n6g0Var2.f137401c);
                if (this.f137508c.get() > 0) {
                    m158127a();
                }
                ArrayList arrayList = this.f137528w.f137401c;
                int size = arrayList.size();
                i = 0;
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    Integer num = (Integer) obj;
                    Thread thread = (Thread) this.f137521p.get(num.intValue());
                    this.f137521p.remove(num.intValue());
                    if (thread != null) {
                        LockSupport.unpark(thread);
                    }
                }
                if (this.f137528w.f137399a) {
                    break;
                }
            } else {
                if (this.f137508c.get() < this.f137512g) {
                    i2 = this.f137513h;
                } else {
                    jUptimeMillis = ((long) this.f137513h) - (SystemClock.uptimeMillis() - this.f137509d.get());
                    if (jUptimeMillis <= 0) {
                        m158127a();
                        i2 = this.f137513h;
                    }
                }
                jUptimeMillis = i2;
            }
        }
        int size2 = this.f137521p.size();
        while (true) {
            SparseArray sparseArray = this.f137521p;
            if (i >= size2) {
                sparseArray.clear();
                int i5 = this.f137515j.f165190b;
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
    public final void m158133g() throws IOException {
        IOException iOException = this.f137524s;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f137519n == null) {
            synchronized (this.f137522q) {
                try {
                    if (this.f137519n == null) {
                        this.f137519n = f137505y.submit(this.f137522q);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m158134h(int i) {
        this.f137525t.add(Integer.valueOf(i));
        try {
            IOException iOException = this.f137524s;
            if (iOException != null) {
                throw iOException;
            }
            if (this.f137519n != null && !this.f137519n.isDone()) {
                AtomicLong atomicLong = (AtomicLong) this.f137507b.get(i);
                if (atomicLong != null && atomicLong.get() > 0) {
                    m158130d(this.f137527v);
                    m158129c(i, this.f137527v.f137399a);
                }
            } else if (this.f137519n == null) {
                int i2 = this.f137515j.f165190b;
            } else {
                this.f137519n.isDone();
                int i3 = this.f137515j.f165190b;
            }
            m158128b(i);
        } catch (Throwable th) {
            m158128b(i);
            throw th;
        }
    }
}
