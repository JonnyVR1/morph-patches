package p153l;

import com.google.android.gms.internal.measurement.zzs;
import com.google.android.gms.measurement.internal.C2479e;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class zrx0 implements vzy0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2479e f205828a;

    public zrx0(C2479e c2479e) {
        this.f205828a = c2479e;
    }

    @Override // p153l.vzy0
    /* JADX INFO: renamed from: a */
    public final void mo204131a(zzs zzsVar, String str, List<String> list, boolean z, boolean z2) {
        l8x0 l8x0VarM114570z;
        int i = isx0.f116775a[zzsVar.ordinal()];
        if (i == 1) {
            l8x0VarM114570z = this.f205828a.zzj().m114570z();
        } else if (i != 2) {
            if (i != 3) {
                C2479e c2479e = this.f205828a;
                l8x0VarM114570z = i != 4 ? c2479e.zzj().m114561D() : c2479e.zzj().m114562E();
            } else if (z) {
                l8x0VarM114570z = this.f205828a.zzj().m114565H();
            } else {
                C2479e c2479e2 = this.f205828a;
                l8x0VarM114570z = !z2 ? c2479e2.zzj().m114564G() : c2479e2.zzj().m114563F();
            }
        } else if (z) {
            l8x0VarM114570z = this.f205828a.zzj().m114560C();
        } else {
            C2479e c2479e3 = this.f205828a;
            l8x0VarM114570z = !z2 ? c2479e3.zzj().m114559B() : c2479e3.zzj().m114558A();
        }
        int size = list.size();
        if (size == 1) {
            l8x0VarM114570z.m153301b(str, list.get(0));
            return;
        }
        if (size == 2) {
            l8x0VarM114570z.m153302c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            l8x0VarM114570z.m153300a(str);
        } else {
            l8x0VarM114570z.m153303d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
