package p149l;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class x7x0 {

    /* JADX INFO: renamed from: a */
    public final String f191389a;

    /* JADX INFO: renamed from: b */
    public final boolean f191390b;

    /* JADX INFO: renamed from: c */
    public boolean f191391c;

    /* JADX INFO: renamed from: d */
    public boolean f191392d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ u9x0 f191393e;

    public x7x0(u9x0 u9x0Var, String str, boolean z) {
        this.f191393e = u9x0Var;
        Preconditions.checkNotEmpty(str);
        this.f191389a = str;
        this.f191390b = z;
    }

    @WorkerThread
    /* JADX INFO: renamed from: a */
    public final void m207309a(boolean z) {
        SharedPreferences.Editor editorEdit = this.f191393e.m192692D().edit();
        editorEdit.putBoolean(this.f191389a, z);
        editorEdit.apply();
        this.f191392d = z;
    }

    @WorkerThread
    /* JADX INFO: renamed from: b */
    public final boolean m207310b() {
        if (!this.f191391c) {
            this.f191391c = true;
            this.f191392d = this.f191393e.m192692D().getBoolean(this.f191389a, this.f191390b);
        }
        return this.f191392d;
    }
}
