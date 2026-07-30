package p153l;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class bmx0 {

    /* JADX INFO: renamed from: a */
    public final String f77415a;

    /* JADX INFO: renamed from: b */
    public boolean f77416b;

    /* JADX INFO: renamed from: c */
    public String f77417c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ajx0 f77418d;

    public bmx0(ajx0 ajx0Var, String str, String str2) {
        this.f77418d = ajx0Var;
        Preconditions.checkNotEmpty(str);
        this.f77415a = str;
    }

    @WorkerThread
    /* JADX INFO: renamed from: a */
    public final String m105276a() {
        if (!this.f77416b) {
            this.f77416b = true;
            this.f77417c = this.f77418d.m98507D().getString(this.f77415a, null);
        }
        return this.f77417c;
    }

    @WorkerThread
    /* JADX INFO: renamed from: b */
    public final void m105277b(String str) {
        SharedPreferences.Editor editorEdit = this.f77418d.m98507D().edit();
        editorEdit.putString(this.f77415a, str);
        editorEdit.apply();
        this.f77417c = str;
    }
}
