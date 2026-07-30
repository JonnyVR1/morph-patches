package p153l;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class zjx0 {

    /* JADX INFO: renamed from: a */
    public final String f204711a;

    /* JADX INFO: renamed from: b */
    public final long f204712b;

    /* JADX INFO: renamed from: c */
    public boolean f204713c;

    /* JADX INFO: renamed from: d */
    public long f204714d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ajx0 f204715e;

    public zjx0(ajx0 ajx0Var, String str, long j) {
        this.f204715e = ajx0Var;
        Preconditions.checkNotEmpty(str);
        this.f204711a = str;
        this.f204712b = j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: a */
    public final long m219990a() {
        if (!this.f204713c) {
            this.f204713c = true;
            this.f204714d = this.f204715e.m98507D().getLong(this.f204711a, this.f204712b);
        }
        return this.f204714d;
    }

    @WorkerThread
    /* JADX INFO: renamed from: b */
    public final void m219991b(long j) {
        SharedPreferences.Editor editorEdit = this.f204715e.m98507D().edit();
        editorEdit.putLong(this.f204711a, j);
        editorEdit.apply();
        this.f204714d = j;
    }
}
