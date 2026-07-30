package p149l;

import com.google.android.gms.internal.measurement.zzs;
import com.google.android.gms.measurement.internal.C2456e;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class tix0 implements pqy0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2456e f170617a;

    public tix0(C2456e c2456e) {
        this.f170617a = c2456e;
    }

    @Override // p149l.pqy0
    /* JADX INFO: renamed from: a */
    public final void mo170940a(zzs zzsVar, String str, List<String> list, boolean z, boolean z2) {
        fzw0 fzw0VarM211424z;
        int i = cjx0.f81256a[zzsVar.ordinal()];
        if (i == 1) {
            fzw0VarM211424z = this.f170617a.zzj().m211424z();
        } else if (i != 2) {
            if (i != 3) {
                C2456e c2456e = this.f170617a;
                fzw0VarM211424z = i != 4 ? c2456e.zzj().m211415D() : c2456e.zzj().m211416E();
            } else if (z) {
                fzw0VarM211424z = this.f170617a.zzj().m211419H();
            } else {
                C2456e c2456e2 = this.f170617a;
                fzw0VarM211424z = !z2 ? c2456e2.zzj().m211418G() : c2456e2.zzj().m211417F();
            }
        } else if (z) {
            fzw0VarM211424z = this.f170617a.zzj().m211414C();
        } else {
            C2456e c2456e3 = this.f170617a;
            fzw0VarM211424z = !z2 ? c2456e3.zzj().m211413B() : c2456e3.zzj().m211412A();
        }
        int size = list.size();
        if (size == 1) {
            fzw0VarM211424z.m123937b(str, list.get(0));
            return;
        }
        if (size == 2) {
            fzw0VarM211424z.m123938c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            fzw0VarM211424z.m123936a(str);
        } else {
            fzw0VarM211424z.m123939d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
