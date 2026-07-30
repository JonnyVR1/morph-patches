package p153l;

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
public final class xzg0 extends erg0 implements Comparable {

    /* JADX INFO: renamed from: j */
    public static final ThreadPoolExecutor f196865j = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), new vng0("OkDownload Block"));

    /* JADX INFO: renamed from: b */
    public final aug0 f196866b;

    /* JADX INFO: renamed from: c */
    public final boolean f196867c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f196868d;

    /* JADX INFO: renamed from: e */
    public volatile ixg0 f196869e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f196870f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f196871g;

    /* JADX INFO: renamed from: h */
    public volatile Thread f196872h;

    /* JADX INFO: renamed from: i */
    public final ehg0 f196873i;

    public xzg0(aug0 aug0Var, ehg0 ehg0Var) {
        ArrayList arrayList = new ArrayList();
        super("download call: " + aug0Var.f73493b);
        this.f196866b = aug0Var;
        this.f196867c = true;
        this.f196868d = arrayList;
        this.f196873i = ehg0Var;
    }

    @Override // p153l.erg0
    /* JADX INFO: renamed from: a */
    public final void mo122181a() {
        Exception exc;
        int i;
        int i2;
        boolean z;
        int i3;
        String str;
        this.f196872h = Thread.currentThread();
        jwg0 jwg0VarM147162a = jwg0.m147162a();
        qhg0 qhg0Var = jwg0VarM147162a.f122924f;
        ehg0 ehg0Var = this.f196873i;
        int i4 = this.f196866b.f73493b;
        ehg0Var.mo97629a();
        jwg0.m147162a().f122920b.f84561a.mo169860c(this.f196866b);
        int i5 = 0;
        do {
            if (this.f196866b.f73494c.length() <= 0) {
                this.f196869e = new ntg0(new IOException("unexpected url: " + this.f196866b.f73494c));
                break;
            }
            if (this.f196870f) {
                break;
            }
            try {
                bog0 bog0VarMo97631c = this.f196873i.get(this.f196866b.f73493b);
                if (bog0VarMo97631c == null) {
                    bog0VarMo97631c = this.f196873i.mo97631c(this.f196866b);
                }
                bog0 bog0Var = bog0VarMo97631c;
                this.f196866b.f73497f = bog0Var;
                if (this.f196870f) {
                    break;
                }
                qhg0 qhg0Var2 = jwg0.m147162a().f122924f;
                ixg0 ixg0Var = new ixg0(new vfg0(this.f196866b, bog0Var, this.f196873i));
                this.f196869e = ixg0Var;
                rqg0 rqg0Var = new rqg0(this.f196866b, bog0Var);
                try {
                    rqg0Var.m182621a();
                    aug0 aug0Var = this.f196866b;
                    ixg0Var.f117399a = aug0Var.f73514w;
                    qhg0Var.f157680a.m192668b(aug0Var.m100397j().getAbsolutePath());
                    nmg0 nmg0Var = jwg0.m147162a().f122925g;
                    aug0 aug0Var2 = this.f196866b;
                    long j = rqg0Var.f164481d;
                    if (aug0Var2.f73509r) {
                        agg0 agg0Var = jwg0.m147162a().f122921c;
                        bog0 bog0VarM142801h = agg0Var.f71160b.m142801h(aug0Var2, bog0Var);
                        if (bog0VarM142801h != null) {
                            agg0Var.remove(bog0VarM142801h.f77674a);
                            long jM105681e = bog0VarM142801h.m105681e();
                            nmg0 nmg0Var2 = jwg0.m147162a().f122925g;
                            if (jM105681e > 10240 && (((str = bog0VarM142801h.f77676c) == null || str.equals(bog0Var.f77676c)) && bog0VarM142801h.m105679c() == j && bog0VarM142801h.m105680d() != null && bog0VarM142801h.m105680d().exists())) {
                                bog0Var.f77680g.clear();
                                bog0Var.f77680g.addAll(bog0VarM142801h.f77680g);
                                bog0Var.toString();
                            }
                        }
                    }
                    try {
                        if (rqg0Var.f164479b) {
                            fjg0 fjg0Var = new fjg0(this.f196866b, bog0Var, rqg0Var.f164481d);
                            fjg0Var.m125804a();
                            if (fjg0Var.f99326a) {
                                int i6 = this.f196866b.f73493b;
                                fjg0Var.toString();
                                File fileM100397j = this.f196866b.m100397j();
                                if (fileM100397j != null && fileM100397j.exists() && !fileM100397j.delete()) {
                                    throw new IOException("Delete file failed!");
                                }
                                if (!fjg0Var.f99328c) {
                                    i3 = 1;
                                } else if (!fjg0Var.f99327b) {
                                    i3 = 2;
                                } else {
                                    if (fjg0Var.f99329d) {
                                        throw new IllegalStateException("No cause find with dirty: " + fjg0Var.f99326a);
                                    }
                                    i3 = 3;
                                }
                                m213754f(bog0Var, rqg0Var, i3);
                            } else {
                                oyg0 oyg0Var = jwg0VarM147162a.f122920b.f84561a;
                                aug0 aug0Var3 = this.f196866b;
                                oyg0Var.getClass();
                                int i7 = aug0Var3.f73493b;
                                jwg0.m147162a().getClass();
                                if (aug0Var3.f73505n) {
                                    oyg0Var.f149795a.post(new igg0(aug0Var3, bog0Var));
                                } else {
                                    aug0Var3.f73507p.m181853f(aug0Var3, bog0Var);
                                }
                            }
                        } else {
                            int i8 = this.f196866b.f73493b;
                            rqg0Var.toString();
                            File fileM100397j2 = this.f196866b.m100397j();
                            if (fileM100397j2 != null && fileM100397j2.exists() && !fileM100397j2.delete()) {
                                throw new IOException("Delete file failed!");
                            }
                            int i9 = rqg0Var.f164480c;
                            if (i9 == 0) {
                                throw new IllegalStateException("No cause find with resumable: " + rqg0Var.f164479b);
                            }
                            m213754f(bog0Var, rqg0Var, i9);
                        }
                        int size = bog0Var.f77680g.size();
                        ArrayList arrayList = new ArrayList(bog0Var.f77680g.size());
                        ArrayList arrayList2 = new ArrayList();
                        for (int i10 = 0; i10 < size; i10++) {
                            akg0 akg0Var = (akg0) bog0Var.f77680g.get(i10);
                            if (akg0Var.f72005c.get() != akg0Var.f72004b) {
                                if (akg0Var.f72005c.get() < 0 || akg0Var.f72005c.get() > akg0Var.f72004b) {
                                    akg0Var.toString();
                                    akg0Var.f72005c.set(0L);
                                }
                                jgg0 jgg0Var = new jgg0(i10, this.f196866b, bog0Var, ixg0Var, this.f196873i);
                                arrayList.add(jgg0Var);
                                arrayList2.add(Integer.valueOf(jgg0Var.f120713a));
                            }
                        }
                        if (!this.f196870f) {
                            ixg0Var.m142518a().f183921u = arrayList2;
                            ArrayList arrayList3 = new ArrayList(arrayList.size());
                            try {
                                int size2 = arrayList.size();
                                int i11 = 0;
                                while (i11 < size2) {
                                    Object obj = arrayList.get(i11);
                                    i11++;
                                    arrayList3.add(f196865j.submit((jgg0) obj));
                                }
                                this.f196868d.addAll(arrayList);
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
                                this.f196868d.removeAll(arrayList);
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
                                    this.f196868d.removeAll(arrayList);
                                    throw th2;
                                }
                            }
                        }
                        if (this.f196870f) {
                            break;
                        }
                        if (ixg0Var.f117401c) {
                            int i14 = i5 + 1;
                            if (i5 < 1) {
                                this.f196873i.remove(this.f196866b.f73493b);
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
                        ixg0Var.f117404f = true;
                        ixg0Var.f117407i = e;
                    }
                } catch (Exception e2) {
                    ixg0Var.m142519b(e2);
                }
            } catch (IOException e3) {
                this.f196869e = new ntg0(e3);
            }
        } while (z);
        this.f196871g = true;
        this.f196868d.clear();
        ixg0 ixg0Var2 = this.f196869e;
        if (this.f196870f || ixg0Var2 == null) {
            return;
        }
        if (ixg0Var2.f117403e || ixg0Var2.f117404f || ixg0Var2.f117401c) {
            exc = ixg0Var2.f117407i;
            i = 3;
            i2 = 2;
        } else {
            exc = null;
            if (ixg0Var2.f117405g) {
                i2 = 4;
            } else if (ixg0Var2.f117406h) {
                exc = ixg0Var2.f117407i;
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
                if (!this.f196870f) {
                    this.f196871g = true;
                    this.f196873i.mo97633e(this.f196866b.f73493b, i2);
                    if (i2 == 1) {
                        this.f196873i.mo97632d(this.f196866b.f73493b);
                        qhg0 qhg0Var3 = jwg0.m147162a().f122924f;
                        ixg0Var2.m142518a();
                    }
                    jwg0.m147162a().f122920b.f84561a.m169861d(this.f196866b, i2, exc);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // p153l.erg0
    /* JADX INFO: renamed from: b */
    public final void mo122182b() {
        ArrayList arrayList;
        ieg0 ieg0Var = jwg0.m147162a().f122919a;
        synchronized (ieg0Var) {
            try {
                boolean z = this.f196867c;
                if (ieg0Var.f114582e.contains(this)) {
                    arrayList = ieg0Var.f114582e;
                } else {
                    arrayList = z ? ieg0Var.f114580c : ieg0Var.f114581d;
                }
                if (!arrayList.remove(this)) {
                    throw new AssertionError("Call wasn't in-flight!");
                }
                if (z && this.f196870f) {
                    ieg0Var.f114583f.decrementAndGet();
                }
                if (z) {
                    ieg0Var.m139609h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i = this.f196866b.f73493b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((xzg0) obj).f196866b.f73498g - this.f196866b.f73498g;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX INFO: renamed from: f */
    public final void m213754f(bog0 bog0Var, rqg0 rqg0Var, int i) {
        int iIntValue;
        aug0 aug0Var = this.f196866b;
        long j = rqg0Var.f164481d;
        boolean z = rqg0Var.f164478a;
        nmg0 nmg0Var = jwg0.m147162a().f122925g;
        zqg0 zqg0Var = jwg0.m147162a().f122923e;
        if (z) {
            nmg0 nmg0Var2 = jwg0.m147162a().f122925g;
            Integer num = aug0Var.f73503l;
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
        bog0Var.f77680g.clear();
        long j2 = iIntValue;
        long j3 = j / j2;
        long j4 = 0;
        int i2 = 0;
        long j5 = 0;
        while (i2 < iIntValue) {
            long j6 = j4 + j5;
            long j7 = i2 == 0 ? (j % j2) + j3 : j3;
            bog0Var.f77680g.add(new akg0(j6, j7, 0L));
            i2++;
            j4 = j6;
            j5 = j7;
        }
        jwg0.m147162a().f122920b.f84561a.m169864g(this.f196866b, bog0Var, i);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m213755g() {
        synchronized (this) {
            try {
                if (this.f196870f) {
                    return false;
                }
                if (this.f196871g) {
                    return false;
                }
                this.f196870f = true;
                SystemClock.uptimeMillis();
                jwg0.m147162a().f122919a.m139606e(this);
                ixg0 ixg0Var = this.f196869e;
                if (ixg0Var != null) {
                    ixg0Var.f117402d = true;
                }
                Object[] array = this.f196868d.toArray();
                if (array != null && array.length != 0) {
                    for (Object obj : array) {
                        if (obj instanceof jgg0) {
                            jgg0 jgg0Var = (jgg0) obj;
                            if (!jgg0Var.f120727o.get() && jgg0Var.f120724l != null) {
                                jgg0Var.f120724l.interrupt();
                            }
                        }
                    }
                } else if (this.f196872h != null) {
                    int i = this.f196866b.f73493b;
                    this.f196872h.interrupt();
                }
                if (ixg0Var != null) {
                    vfg0 vfg0VarM142518a = ixg0Var.m142518a();
                    vfg0VarM142518a.getClass();
                    vfg0.f183900y.execute(new czg0(vfg0VarM142518a));
                }
                int i2 = this.f196866b.f73493b;
                SystemClock.uptimeMillis();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
