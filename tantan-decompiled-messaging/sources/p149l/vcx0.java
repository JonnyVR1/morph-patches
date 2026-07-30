package p149l;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class vcx0 {

    /* JADX INFO: renamed from: a */
    public final String f180997a;

    /* JADX INFO: renamed from: b */
    public boolean f180998b;

    /* JADX INFO: renamed from: c */
    public String f180999c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ u9x0 f181000d;

    public vcx0(u9x0 u9x0Var, String str, String str2) {
        this.f181000d = u9x0Var;
        Preconditions.checkNotEmpty(str);
        this.f180997a = str;
    }

    @WorkerThread
    /* JADX INFO: renamed from: a */
    public final String m197913a() {
        if (!this.f180998b) {
            this.f180998b = true;
            this.f180999c = this.f181000d.m192692D().getString(this.f180997a, null);
        }
        return this.f180999c;
    }

    @WorkerThread
    /* JADX INFO: renamed from: b */
    public final void m197914b(String str) {
        SharedPreferences.Editor editorEdit = this.f181000d.m192692D().edit();
        editorEdit.putString(this.f180997a, str);
        editorEdit.apply();
        this.f180999c = str;
    }
}
