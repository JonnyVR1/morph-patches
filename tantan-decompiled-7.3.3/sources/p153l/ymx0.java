package p153l;

import android.content.SharedPreferences;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class ymx0 {

    /* JADX INFO: renamed from: a */
    public final String f200722a;

    /* JADX INFO: renamed from: b */
    public final String f200723b;

    /* JADX INFO: renamed from: c */
    public final String f200724c;

    /* JADX INFO: renamed from: d */
    public final long f200725d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ajx0 f200726e;

    public ymx0(ajx0 ajx0Var, String str, long j) {
        this.f200726e = ajx0Var;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkArgument(j > 0);
        this.f200722a = str + ":start";
        this.f200723b = str + ":count";
        this.f200724c = str + ":value";
        this.f200725d = j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: a */
    public final Pair<String, Long> m216741a() {
        long jAbs;
        this.f200726e.mo15146h();
        this.f200726e.mo15146h();
        long jM216743c = m216743c();
        if (jM216743c == 0) {
            m216744d();
            jAbs = 0;
        } else {
            jAbs = Math.abs(jM216743c - this.f200726e.zzb().currentTimeMillis());
        }
        long j = this.f200725d;
        if (jAbs < j) {
            return null;
        }
        if (jAbs > (j << 1)) {
            m216744d();
            return null;
        }
        String string = this.f200726e.m98507D().getString(this.f200724c, null);
        long j2 = this.f200726e.m98507D().getLong(this.f200723b, 0L);
        m216744d();
        return (string == null || j2 <= 0) ? ajx0.f71894B : new Pair<>(string, Long.valueOf(j2));
    }

    @WorkerThread
    /* JADX INFO: renamed from: b */
    public final void m216742b(String str, long j) {
        this.f200726e.mo15146h();
        if (m216743c() == 0) {
            m216744d();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.f200726e.m98507D().getLong(this.f200723b, 0L);
        ajx0 ajx0Var = this.f200726e;
        if (j2 <= 0) {
            SharedPreferences.Editor editorEdit = ajx0Var.m98507D().edit();
            editorEdit.putString(this.f200724c, str);
            editorEdit.putLong(this.f200723b, 1L);
            editorEdit.apply();
            return;
        }
        long j3 = j2 + 1;
        boolean z = (ajx0Var.mo15143e().m136344Q0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3;
        SharedPreferences.Editor editorEdit2 = this.f200726e.m98507D().edit();
        if (z) {
            editorEdit2.putString(this.f200724c, str);
        }
        editorEdit2.putLong(this.f200723b, j3);
        editorEdit2.apply();
    }

    @WorkerThread
    /* JADX INFO: renamed from: c */
    public final long m216743c() {
        return this.f200726e.m98507D().getLong(this.f200722a, 0L);
    }

    @WorkerThread
    /* JADX INFO: renamed from: d */
    public final void m216744d() {
        this.f200726e.mo15146h();
        long jCurrentTimeMillis = this.f200726e.zzb().currentTimeMillis();
        SharedPreferences.Editor editorEdit = this.f200726e.m98507D().edit();
        editorEdit.remove(this.f200723b);
        editorEdit.remove(this.f200724c);
        editorEdit.putLong(this.f200722a, jCurrentTimeMillis);
        editorEdit.apply();
    }
}
