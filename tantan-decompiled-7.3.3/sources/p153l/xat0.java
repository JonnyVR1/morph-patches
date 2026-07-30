package p153l;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes6.dex */
public final class xat0 {

    /* JADX INFO: renamed from: a */
    public final Clock f193074a;

    /* JADX INFO: renamed from: b */
    public final ibt0 f193075b;

    /* JADX INFO: renamed from: e */
    public final String f193078e;

    /* JADX INFO: renamed from: f */
    public final String f193079f;

    /* JADX INFO: renamed from: d */
    public final Object f193077d = new Object();

    /* JADX INFO: renamed from: g */
    public long f193080g = -1;

    /* JADX INFO: renamed from: h */
    public long f193081h = -1;

    /* JADX INFO: renamed from: i */
    public long f193082i = 0;

    /* JADX INFO: renamed from: j */
    public long f193083j = -1;

    /* JADX INFO: renamed from: k */
    public long f193084k = -1;

    /* JADX INFO: renamed from: c */
    public final LinkedList f193076c = new LinkedList();

    public xat0(Clock clock, ibt0 ibt0Var, String str, String str2) {
        this.f193074a = clock;
        this.f193075b = ibt0Var;
        this.f193078e = str;
        this.f193079f = str2;
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m209886a() {
        Bundle bundle;
        synchronized (this.f193077d) {
            try {
                bundle = new Bundle();
                bundle.putString("seq_num", this.f193078e);
                bundle.putString("slotid", this.f193079f);
                bundle.putBoolean("ismediation", false);
                bundle.putLong("treq", this.f193083j);
                bundle.putLong("tresponse", this.f193084k);
                bundle.putLong("timp", this.f193080g);
                bundle.putLong("tload", this.f193081h);
                bundle.putLong("pcc", this.f193082i);
                bundle.putLong("tfetch", -1L);
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                Iterator it = this.f193076c.iterator();
                while (it.hasNext()) {
                    arrayList.add(((wat0) it.next()).m205682b());
                }
                bundle.putParcelableArrayList("tclick", arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: c */
    public final String m209887c() {
        return this.f193078e;
    }

    /* JADX INFO: renamed from: d */
    public final void m209888d() {
        synchronized (this.f193077d) {
            try {
                if (this.f193084k != -1) {
                    wat0 wat0Var = new wat0(this);
                    wat0Var.m205684d();
                    this.f193076c.add(wat0Var);
                    this.f193082i++;
                    this.f193075b.m139405f();
                    this.f193075b.m139404e(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m209889e() {
        synchronized (this.f193077d) {
            try {
                if (this.f193084k != -1 && !this.f193076c.isEmpty()) {
                    wat0 wat0Var = (wat0) this.f193076c.getLast();
                    if (wat0Var.m205681a() == -1) {
                        wat0Var.m205683c();
                        this.f193075b.m139404e(this);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m209890f() {
        synchronized (this.f193077d) {
            try {
                if (this.f193084k != -1 && this.f193080g == -1) {
                    this.f193080g = this.f193074a.elapsedRealtime();
                    this.f193075b.m139404e(this);
                }
                this.f193075b.m139406g();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m209891g() {
        synchronized (this.f193077d) {
            this.f193075b.m139407h();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m209892h(boolean z) {
        synchronized (this.f193077d) {
            try {
                if (this.f193084k != -1) {
                    this.f193081h = this.f193074a.elapsedRealtime();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m209893i() {
        synchronized (this.f193077d) {
            this.f193075b.m139408i();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m209894j(zzl zzlVar) {
        synchronized (this.f193077d) {
            long jElapsedRealtime = this.f193074a.elapsedRealtime();
            this.f193083j = jElapsedRealtime;
            this.f193075b.m139409j(zzlVar, jElapsedRealtime);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m209895k(long j) {
        synchronized (this.f193077d) {
            try {
                this.f193084k = j;
                if (j != -1) {
                    this.f193075b.m139404e(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
