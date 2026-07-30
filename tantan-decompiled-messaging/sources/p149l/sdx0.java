package p149l;

import android.content.SharedPreferences;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class sdx0 {

    /* JADX INFO: renamed from: a */
    public final String f163914a;

    /* JADX INFO: renamed from: b */
    public final String f163915b;

    /* JADX INFO: renamed from: c */
    public final String f163916c;

    /* JADX INFO: renamed from: d */
    public final long f163917d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ u9x0 f163918e;

    public sdx0(u9x0 u9x0Var, String str, long j) {
        this.f163918e = u9x0Var;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkArgument(j > 0);
        this.f163914a = str + ":start";
        this.f163915b = str + ":count";
        this.f163916c = str + ":value";
        this.f163917d = j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: a */
    public final Pair<String, Long> m183580a() {
        long jAbs;
        this.f163918e.mo15092h();
        this.f163918e.mo15092h();
        long jM183582c = m183582c();
        if (jM183582c == 0) {
            m183583d();
            jAbs = 0;
        } else {
            jAbs = Math.abs(jM183582c - this.f163918e.zzb().currentTimeMillis());
        }
        long j = this.f163917d;
        if (jAbs < j) {
            return null;
        }
        if (jAbs > (j << 1)) {
            m183583d();
            return null;
        }
        String string = this.f163918e.m192692D().getString(this.f163916c, null);
        long j2 = this.f163918e.m192692D().getLong(this.f163915b, 0L);
        m183583d();
        return (string == null || j2 <= 0) ? u9x0.f175513B : new Pair<>(string, Long.valueOf(j2));
    }

    @WorkerThread
    /* JADX INFO: renamed from: b */
    public final void m183581b(String str, long j) {
        this.f163918e.mo15092h();
        if (m183582c() == 0) {
            m183583d();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.f163918e.m192692D().getLong(this.f163915b, 0L);
        u9x0 u9x0Var = this.f163918e;
        if (j2 <= 0) {
            SharedPreferences.Editor editorEdit = u9x0Var.m192692D().edit();
            editorEdit.putString(this.f163916c, str);
            editorEdit.putLong(this.f163915b, 1L);
            editorEdit.apply();
            return;
        }
        long j3 = j2 + 1;
        boolean z = (u9x0Var.mo15089e().m101477Q0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3;
        SharedPreferences.Editor editorEdit2 = this.f163918e.m192692D().edit();
        if (z) {
            editorEdit2.putString(this.f163916c, str);
        }
        editorEdit2.putLong(this.f163915b, j3);
        editorEdit2.apply();
    }

    @WorkerThread
    /* JADX INFO: renamed from: c */
    public final long m183582c() {
        return this.f163918e.m192692D().getLong(this.f163914a, 0L);
    }

    @WorkerThread
    /* JADX INFO: renamed from: d */
    public final void m183583d() {
        this.f163918e.mo15092h();
        long jCurrentTimeMillis = this.f163918e.zzb().currentTimeMillis();
        SharedPreferences.Editor editorEdit = this.f163918e.m192692D().edit();
        editorEdit.remove(this.f163915b);
        editorEdit.remove(this.f163916c);
        editorEdit.putLong(this.f163914a, jCurrentTimeMillis);
        editorEdit.apply();
    }
}
