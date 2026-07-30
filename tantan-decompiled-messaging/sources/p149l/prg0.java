package p149l;

import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.common.api.Api;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class prg0 extends wig0 implements Comparable {

    /* JADX INFO: renamed from: j */
    public static final ThreadPoolExecutor f150901j = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), new nfg0("OkDownload Block"));

    /* JADX INFO: renamed from: b */
    public final slg0 f150902b;

    /* JADX INFO: renamed from: c */
    public final boolean f150903c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f150904d;

    /* JADX INFO: renamed from: e */
    public volatile apg0 f150905e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f150906f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f150907g;

    /* JADX INFO: renamed from: h */
    public volatile Thread f150908h;

    /* JADX INFO: renamed from: i */
    public final w8g0 f150909i;

    public prg0(slg0 slg0Var, w8g0 w8g0Var) {
        ArrayList arrayList = new ArrayList();
        super("download call: " + slg0Var.f165190b);
        this.f150902b = slg0Var;
        this.f150903c = true;
        this.f150904d = arrayList;
        this.f150909i = w8g0Var;
    }

    @Override // p149l.wig0
    /* JADX INFO: renamed from: a */
    public final void mo171018a() {
        Exception exc;
        int i;
        int i2;
        boolean z;
        int i3;
        String str;
        this.f150908h = Thread.currentThread();
        bog0 bog0VarM102944a = bog0.m102944a();
        i9g0 i9g0Var = bog0VarM102944a.f76520f;
        w8g0 w8g0Var = this.f150909i;
        int i4 = this.f150902b.f165190b;
        w8g0Var.mo98390a();
        bog0.m102944a().f76516b.f182721a.mo127588c(this.f150902b);
        int i5 = 0;
        do {
            if (this.f150902b.f165191c.length() <= 0) {
                this.f150905e = new flg0(new IOException("unexpected url: " + this.f150902b.f165191c));
                break;
            }
            if (this.f150906f) {
                break;
            }
            try {
                tfg0 tfg0VarMo98392c = this.f150909i.get(this.f150902b.f165190b);
                if (tfg0VarMo98392c == null) {
                    tfg0VarMo98392c = this.f150909i.mo98392c(this.f150902b);
                }
                tfg0 tfg0Var = tfg0VarMo98392c;
                this.f150902b.f165194f = tfg0Var;
                if (this.f150906f) {
                    break;
                }
                i9g0 i9g0Var2 = bog0.m102944a().f76520f;
                apg0 apg0Var = new apg0(new n7g0(this.f150902b, tfg0Var, this.f150909i));
                this.f150905e = apg0Var;
                jig0 jig0Var = new jig0(this.f150902b, tfg0Var);
                try {
                    jig0Var.m141651a();
                    slg0 slg0Var = this.f150902b;
                    apg0Var.f71037a = slg0Var.f165211w;
                    i9g0Var.f112218a.m150481b(slg0Var.m184802j().getAbsolutePath());
                    feg0 feg0Var = bog0.m102944a().f76521g;
                    slg0 slg0Var2 = this.f150902b;
                    long j = jig0Var.f118100d;
                    if (slg0Var2.f165206r) {
                        s7g0 s7g0Var = bog0.m102944a().f76517c;
                        tfg0 tfg0VarM98397h = s7g0Var.f162913b.m98397h(slg0Var2, tfg0Var);
                        if (tfg0VarM98397h != null) {
                            s7g0Var.remove(tfg0VarM98397h.f169975a);
                            long jM188709e = tfg0VarM98397h.m188709e();
                            feg0 feg0Var2 = bog0.m102944a().f76521g;
                            if (jM188709e > 10240 && (((str = tfg0VarM98397h.f169977c) == null || str.equals(tfg0Var.f169977c)) && tfg0VarM98397h.m188707c() == j && tfg0VarM98397h.m188708d() != null && tfg0VarM98397h.m188708d().exists())) {
                                tfg0Var.f169981g.clear();
                                tfg0Var.f169981g.addAll(tfg0VarM98397h.f169981g);
                                tfg0Var.toString();
                            }
                        }
                    }
                    try {
                        if (jig0Var.f118098b) {
                            xag0 xag0Var = new xag0(this.f150902b, tfg0Var, jig0Var.f118100d);
                            xag0Var.m207572a();
                            if (xag0Var.f191737a) {
                                int i6 = this.f150902b.f165190b;
                                xag0Var.toString();
                                File fileM184802j = this.f150902b.m184802j();
                                if (fileM184802j != null && fileM184802j.exists() && !fileM184802j.delete()) {
                                    throw new IOException("Delete file failed!");
                                }
                                if (!xag0Var.f191739c) {
                                    i3 = 1;
                                } else if (!xag0Var.f191738b) {
                                    i3 = 2;
                                } else {
                                    if (xag0Var.f191740d) {
                                        throw new IllegalStateException("No cause find with dirty: " + xag0Var.f191737a);
                                    }
                                    i3 = 3;
                                }
                                m171020f(tfg0Var, jig0Var, i3);
                            } else {
                                gqg0 gqg0Var = bog0VarM102944a.f76516b.f182721a;
                                slg0 slg0Var3 = this.f150902b;
                                gqg0Var.getClass();
                                int i7 = slg0Var3.f165190b;
                                bog0.m102944a().getClass();
                                if (slg0Var3.f165202n) {
                                    gqg0Var.f103937a.post(new a8g0(slg0Var3, tfg0Var));
                                } else {
                                    slg0Var3.f165204p.m140921f(slg0Var3, tfg0Var);
                                }
                            }
                        } else {
                            int i8 = this.f150902b.f165190b;
                            jig0Var.toString();
                            File fileM184802j2 = this.f150902b.m184802j();
                            if (fileM184802j2 != null && fileM184802j2.exists() && !fileM184802j2.delete()) {
                                throw new IOException("Delete file failed!");
                            }
                            int i9 = jig0Var.f118099c;
                            if (i9 == 0) {
                                throw new IllegalStateException("No cause find with resumable: " + jig0Var.f118098b);
                            }
                            m171020f(tfg0Var, jig0Var, i9);
                        }
                        int size = tfg0Var.f169981g.size();
                        ArrayList arrayList = new ArrayList(tfg0Var.f169981g.size());
                        ArrayList arrayList2 = new ArrayList();
                        for (int i10 = 0; i10 < size; i10++) {
                            sbg0 sbg0Var = (sbg0) tfg0Var.f169981g.get(i10);
                            if (sbg0Var.f163536c.get() != sbg0Var.f163535b) {
                                if (sbg0Var.f163536c.get() < 0 || sbg0Var.f163536c.get() > sbg0Var.f163535b) {
                                    sbg0Var.toString();
                                    sbg0Var.f163536c.set(0L);
                                }
                                b8g0 b8g0Var = new b8g0(i10, this.f150902b, tfg0Var, apg0Var, this.f150909i);
                                arrayList.add(b8g0Var);
                                arrayList2.add(Integer.valueOf(b8g0Var.f74111a));
                            }
                        }
                        if (!this.f150906f) {
                            apg0Var.m98117a().f137526u = arrayList2;
                            ArrayList arrayList3 = new ArrayList(arrayList.size());
                            try {
                                int size2 = arrayList.size();
                                int i11 = 0;
                                while (i11 < size2) {
                                    Object obj = arrayList.get(i11);
                                    i11++;
                                    arrayList3.add(f150901j.submit((b8g0) obj));
                                }
                                this.f150904d.addAll(arrayList);
                                int size3 = arrayList3.size();
                                int i12 = 0;
                                while (i12 < size3) {
                                    Object obj2 = arrayList3.get(i12);
                                    i12++;
                                    Future future = (Future) obj2;
                                    if (!future.isDone()) {
                                        try {
                                            future.get();
                                        } catch (CancellationException | ExecutionException unused) {
                                        }
                                    }
                                }
                                this.f150904d.removeAll(arrayList);
                            } catch (Throwable th) {
                                try {
                                    int size4 = arrayList3.size();
                                    int i13 = 0;
                                    while (i13 < size4) {
                                        Object obj3 = arrayList3.get(i13);
                                        i13++;
                                        ((Future) obj3).cancel(true);
                                    }
                                    throw th;
                                } catch (Throwable th2) {
                                    this.f150904d.removeAll(arrayList);
                                    throw th2;
                                }
                            }
                        }
                        if (this.f150906f) {
                            break;
                        }
                        if (apg0Var.f71039c) {
                            int i14 = i5 + 1;
                            if (i5 < 1) {
                                this.f150909i.remove(this.f150902b.f165190b);
                                i5 = i14;
                                z = true;
                            } else {
                                i5 = i14;
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                    } catch (IOException e) {
                        apg0Var.f71042f = true;
                        apg0Var.f71045i = e;
                    }
                } catch (Exception e2) {
                    apg0Var.m98118b(e2);
                }
            } catch (IOException e3) {
                this.f150905e = new flg0(e3);
            }
        } while (z);
        this.f150907g = true;
        this.f150904d.clear();
        apg0 apg0Var2 = this.f150905e;
        if (this.f150906f || apg0Var2 == null) {
            return;
        }
        if (apg0Var2.f71041e || apg0Var2.f71042f || apg0Var2.f71039c) {
            exc = apg0Var2.f71045i;
            i = 3;
            i2 = 2;
        } else {
            exc = null;
            if (apg0Var2.f71043g) {
                i2 = 4;
            } else if (apg0Var2.f71044h) {
                exc = apg0Var2.f71045i;
                i2 = 6;
            } else {
                i = 3;
                i2 = 1;
            }
            i = 3;
        }
        if (i2 == i) {
            throw new IllegalAccessError("can't recognize cancelled on here");
        }
        synchronized (this) {
            try {
                if (!this.f150906f) {
                    this.f150907g = true;
                    this.f150909i.mo98394e(this.f150902b.f165190b, i2);
                    if (i2 == 1) {
                        this.f150909i.mo98393d(this.f150902b.f165190b);
                        i9g0 i9g0Var3 = bog0.m102944a().f76520f;
                        apg0Var2.m98117a();
                    }
                    bog0.m102944a().f76516b.f182721a.m127589d(this.f150902b, i2, exc);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // p149l.wig0
    /* JADX INFO: renamed from: b */
    public final void mo171019b() {
        ArrayList arrayList;
        a6g0 a6g0Var = bog0.m102944a().f76515a;
        synchronized (a6g0Var) {
            try {
                boolean z = this.f150903c;
                if (a6g0Var.f67763e.contains(this)) {
                    arrayList = a6g0Var.f67763e;
                } else {
                    arrayList = z ? a6g0Var.f67761c : a6g0Var.f67762d;
                }
                if (!arrayList.remove(this)) {
                    throw new AssertionError("Call wasn't in-flight!");
                }
                if (z && this.f150906f) {
                    a6g0Var.f67764f.decrementAndGet();
                }
                if (z) {
                    a6g0Var.m95134h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i = this.f150902b.f165190b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((prg0) obj).f150902b.f165195g - this.f150902b.f165195g;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX INFO: renamed from: f */
    public final void m171020f(tfg0 tfg0Var, jig0 jig0Var, int i) {
        int iIntValue;
        slg0 slg0Var = this.f150902b;
        long j = jig0Var.f118100d;
        boolean z = jig0Var.f118097a;
        feg0 feg0Var = bog0.m102944a().f76521g;
        rig0 rig0Var = bog0.m102944a().f76519e;
        if (z) {
            feg0 feg0Var2 = bog0.m102944a().f76521g;
            Integer num = slg0Var.f165200l;
            if (num != null) {
                iIntValue = num.intValue();
            } else if (j < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                iIntValue = 1;
            } else if (j < 5242880) {
                iIntValue = 2;
            } else if (j < 52428800) {
                iIntValue = 3;
            } else {
                iIntValue = j < 104857600 ? 4 : 5;
            }
        } else {
            iIntValue = 1;
        }
        tfg0Var.f169981g.clear();
        long j2 = iIntValue;
        long j3 = j / j2;
        long j4 = 0;
        int i2 = 0;
        long j5 = 0;
        while (i2 < iIntValue) {
            long j6 = j4 + j5;
            long j7 = i2 == 0 ? (j % j2) + j3 : j3;
            tfg0Var.f169981g.add(new sbg0(j6, j7, 0L));
            i2++;
            j4 = j6;
            j5 = j7;
        }
        bog0.m102944a().f76516b.f182721a.m127592g(this.f150902b, tfg0Var, i);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m171021g() {
        synchronized (this) {
            try {
                if (this.f150906f) {
                    return false;
                }
                if (this.f150907g) {
                    return false;
                }
                this.f150906f = true;
                SystemClock.uptimeMillis();
                bog0.m102944a().f76515a.m95131e(this);
                apg0 apg0Var = this.f150905e;
                if (apg0Var != null) {
                    apg0Var.f71040d = true;
                }
                Object[] array = this.f150904d.toArray();
                if (array != null && array.length != 0) {
                    for (Object obj : array) {
                        if (obj instanceof b8g0) {
                            b8g0 b8g0Var = (b8g0) obj;
                            if (!b8g0Var.f74125o.get() && b8g0Var.f74122l != null) {
                                b8g0Var.f74122l.interrupt();
                            }
                        }
                    }
                } else if (this.f150908h != null) {
                    int i = this.f150902b.f165190b;
                    this.f150908h.interrupt();
                }
                if (apg0Var != null) {
                    n7g0 n7g0VarM98117a = apg0Var.m98117a();
                    n7g0VarM98117a.getClass();
                    n7g0.f137505y.execute(new uqg0(n7g0VarM98117a));
                }
                int i2 = this.f150902b.f165190b;
                SystemClock.uptimeMillis();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
