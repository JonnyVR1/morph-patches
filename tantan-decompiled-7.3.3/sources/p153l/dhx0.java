package p153l;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class dhx0 {

    /* JADX INFO: renamed from: a */
    public final String f88561a;

    /* JADX INFO: renamed from: b */
    public final boolean f88562b;

    /* JADX INFO: renamed from: c */
    public boolean f88563c;

    /* JADX INFO: renamed from: d */
    public boolean f88564d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ajx0 f88565e;

    public dhx0(ajx0 ajx0Var, String str, boolean z) {
        this.f88565e = ajx0Var;
        Preconditions.checkNotEmpty(str);
        this.f88561a = str;
        this.f88562b = z;
    }

    @WorkerThread
    /* JADX INFO: renamed from: a */
    public final void m115832a(boolean z) {
        SharedPreferences.Editor editorEdit = this.f88565e.m98507D().edit();
        editorEdit.putBoolean(this.f88561a, z);
        editorEdit.apply();
        this.f88564d = z;
    }

    @WorkerThread
    /* JADX INFO: renamed from: b */
    public final boolean m115833b() {
        if (!this.f88563c) {
            this.f88563c = true;
            this.f88564d = this.f88565e.m98507D().getBoolean(this.f88561a, this.f88562b);
        }
        return this.f88564d;
    }
}
