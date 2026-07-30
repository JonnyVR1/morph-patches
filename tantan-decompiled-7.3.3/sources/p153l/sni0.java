package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes6.dex */
public class sni0<TResult> {

    /* JADX INFO: renamed from: a */
    public final m1z0 f169695a = new m1z0();

    public sni0(@NonNull gg4 gg4Var) {
        gg4Var.mo130139b(new muy0(this));
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public Task<TResult> m186939a() {
        return this.f169695a;
    }

    /* JADX INFO: renamed from: b */
    public void m186940b(@NonNull Exception exc) {
        this.f169695a.m156729s(exc);
    }

    /* JADX INFO: renamed from: c */
    public void m186941c(@Nullable TResult tresult) {
        this.f169695a.m156730t(tresult);
    }

    /* JADX INFO: renamed from: d */
    public boolean m186942d(@NonNull Exception exc) {
        return this.f169695a.m156732v(exc);
    }

    /* JADX INFO: renamed from: e */
    public boolean m186943e(@Nullable TResult tresult) {
        return this.f169695a.m156733w(tresult);
    }

    public sni0() {
    }
}
