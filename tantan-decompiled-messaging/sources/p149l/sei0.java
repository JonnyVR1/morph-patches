package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes6.dex */
public class sei0<TResult> {

    /* JADX INFO: renamed from: a */
    public final gsy0 f164018a = new gsy0();

    public sei0(@NonNull hf4 hf4Var) {
        hf4Var.mo130732b(new gly0(this));
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public Task<TResult> m183657a() {
        return this.f164018a;
    }

    /* JADX INFO: renamed from: b */
    public void m183658b(@NonNull Exception exc) {
        this.f164018a.m127859s(exc);
    }

    /* JADX INFO: renamed from: c */
    public void m183659c(@Nullable TResult tresult) {
        this.f164018a.m127860t(tresult);
    }

    /* JADX INFO: renamed from: d */
    public boolean m183660d(@NonNull Exception exc) {
        return this.f164018a.m127862v(exc);
    }

    /* JADX INFO: renamed from: e */
    public boolean m183661e(@Nullable TResult tresult) {
        return this.f164018a.m127863w(tresult);
    }

    public sei0() {
    }
}
