package p149l;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes6.dex */
public final class r1t0 {

    /* JADX INFO: renamed from: a */
    public final Clock f157330a;

    /* JADX INFO: renamed from: b */
    public final c2t0 f157331b;

    /* JADX INFO: renamed from: e */
    public final String f157334e;

    /* JADX INFO: renamed from: f */
    public final String f157335f;

    /* JADX INFO: renamed from: d */
    public final Object f157333d = new Object();

    /* JADX INFO: renamed from: g */
    public long f157336g = -1;

    /* JADX INFO: renamed from: h */
    public long f157337h = -1;

    /* JADX INFO: renamed from: i */
    public long f157338i = 0;

    /* JADX INFO: renamed from: j */
    public long f157339j = -1;

    /* JADX INFO: renamed from: k */
    public long f157340k = -1;

    /* JADX INFO: renamed from: c */
    public final LinkedList f157332c = new LinkedList();

    public r1t0(Clock clock, c2t0 c2t0Var, String str, String str2) {
        this.f157330a = clock;
        this.f157331b = c2t0Var;
        this.f157334e = str;
        this.f157335f = str2;
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m177546a() {
        Bundle bundle;
        synchronized (this.f157333d) {
            try {
                bundle = new Bundle();
                bundle.putString("seq_num", this.f157334e);
                bundle.putString("slotid", this.f157335f);
                bundle.putBoolean("ismediation", false);
                bundle.putLong("treq", this.f157339j);
                bundle.putLong("tresponse", this.f157340k);
                bundle.putLong("timp", this.f157336g);
                bundle.putLong("tload", this.f157337h);
                bundle.putLong("pcc", this.f157338i);
                bundle.putLong("tfetch", -1L);
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                Iterator it = this.f157332c.iterator();
                while (it.hasNext()) {
                    arrayList.add(((q1t0) it.next()).m172414b());
                }
                bundle.putParcelableArrayList("tclick", arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: c */
    public final String m177547c() {
        return this.f157334e;
    }

    /* JADX INFO: renamed from: d */
    public final void m177548d() {
        synchronized (this.f157333d) {
            try {
                if (this.f157340k != -1) {
                    q1t0 q1t0Var = new q1t0(this);
                    q1t0Var.m172416d();
                    this.f157332c.add(q1t0Var);
                    this.f157338i++;
                    this.f157331b.m104925f();
                    this.f157331b.m104924e(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m177549e() {
        synchronized (this.f157333d) {
            try {
                if (this.f157340k != -1 && !this.f157332c.isEmpty()) {
                    q1t0 q1t0Var = (q1t0) this.f157332c.getLast();
                    if (q1t0Var.m172413a() == -1) {
                        q1t0Var.m172415c();
                        this.f157331b.m104924e(this);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m177550f() {
        synchronized (this.f157333d) {
            try {
                if (this.f157340k != -1 && this.f157336g == -1) {
                    this.f157336g = this.f157330a.elapsedRealtime();
                    this.f157331b.m104924e(this);
                }
                this.f157331b.m104926g();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m177551g() {
        synchronized (this.f157333d) {
            this.f157331b.m104927h();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m177552h(boolean z) {
        synchronized (this.f157333d) {
            try {
                if (this.f157340k != -1) {
                    this.f157337h = this.f157330a.elapsedRealtime();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m177553i() {
        synchronized (this.f157333d) {
            this.f157331b.m104928i();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m177554j(zzl zzlVar) {
        synchronized (this.f157333d) {
            long jElapsedRealtime = this.f157330a.elapsedRealtime();
            this.f157339j = jElapsedRealtime;
            this.f157331b.m104929j(zzlVar, jElapsedRealtime);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m177555k(long j) {
        synchronized (this.f157333d) {
            try {
                this.f157340k = j;
                if (j != -1) {
                    this.f157331b.m104924e(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
