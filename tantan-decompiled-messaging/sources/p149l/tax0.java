package p149l;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class tax0 {

    /* JADX INFO: renamed from: a */
    public final String f169191a;

    /* JADX INFO: renamed from: b */
    public final long f169192b;

    /* JADX INFO: renamed from: c */
    public boolean f169193c;

    /* JADX INFO: renamed from: d */
    public long f169194d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ u9x0 f169195e;

    public tax0(u9x0 u9x0Var, String str, long j) {
        this.f169195e = u9x0Var;
        Preconditions.checkNotEmpty(str);
        this.f169191a = str;
        this.f169192b = j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: a */
    public final long m187782a() {
        if (!this.f169193c) {
            this.f169193c = true;
            this.f169194d = this.f169195e.m192692D().getLong(this.f169191a, this.f169192b);
        }
        return this.f169194d;
    }

    @WorkerThread
    /* JADX INFO: renamed from: b */
    public final void m187783b(long j) {
        SharedPreferences.Editor editorEdit = this.f169195e.m192692D().edit();
        editorEdit.putLong(this.f169191a, j);
        editorEdit.apply();
        this.f169194d = j;
    }
}
