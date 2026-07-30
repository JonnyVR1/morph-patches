package p149l;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class jps0 extends kos0 {

    /* JADX INFO: renamed from: a */
    public final koj0 f119223a;

    public jps0(koj0 koj0Var) {
        this.f119223a = koj0Var;
    }

    @Override // p149l.los0
    /* JADX INFO: renamed from: J */
    public final boolean mo142526J() {
        return this.f119223a.m146738m();
    }

    @Override // p149l.los0
    /* JADX INFO: renamed from: a */
    public final String mo142527a() {
        return this.f119223a.m146728c();
    }

    @Override // p149l.los0
    /* JADX INFO: renamed from: b */
    public final List mo142528b() {
        List<g520> listM146735j = this.f119223a.m146735j();
        ArrayList arrayList = new ArrayList();
        if (listM146735j != null) {
            for (g520 g520Var : listM146735j) {
                arrayList.add(new zas0(g520Var.mo124434a(), g520Var.mo124436c(), g520Var.mo124435b(), g520Var.mo124438e(), g520Var.mo124437d()));
            }
        }
        return arrayList;
    }

    @Override // p149l.los0
    /* JADX INFO: renamed from: g */
    public final void mo142529g() {
        this.f119223a.m146744s();
    }

    @Override // p149l.los0
    /* JADX INFO: renamed from: k7 */
    public final void mo142530k7(uyl uylVar) {
        this.f119223a.m146742q((View) s050.m181847P2(uylVar));
    }

    @Override // p149l.los0
    /* JADX INFO: renamed from: o1 */
    public final void mo142531o1(uyl uylVar, uyl uylVar2, uyl uylVar3) {
        HashMap map = (HashMap) s050.m181847P2(uylVar2);
        HashMap map2 = (HashMap) s050.m181847P2(uylVar3);
        this.f119223a.mo109529E((View) s050.m181847P2(uylVar), map, map2);
    }

    @Override // p149l.los0
    /* JADX INFO: renamed from: t */
    public final boolean mo142532t() {
        return this.f119223a.m146737l();
    }

    @Override // p149l.los0
    /* JADX INFO: renamed from: y7 */
    public final void mo142533y7(uyl uylVar) {
        this.f119223a.m146720F((View) s050.m181847P2(uylVar));
    }

    @Override // p149l.los0
    public final double zze() {
        if (this.f119223a.m146740o() != null) {
            return this.f119223a.m146740o().doubleValue();
        }
        return -1.0d;
    }

    @Override // p149l.los0
    public final float zzf() {
        return this.f119223a.m146736k();
    }

    @Override // p149l.los0
    public final float zzg() {
        return this.f119223a.m146730e();
    }

    @Override // p149l.los0
    public final float zzh() {
        return this.f119223a.m146731f();
    }

    @Override // p149l.los0
    public final Bundle zzi() {
        return this.f119223a.m146732g();
    }

    @Override // p149l.los0
    @Nullable
    public final fgu0 zzj() {
        if (this.f119223a.m146722H() != null) {
            return this.f119223a.m146722H().m172883b();
        }
        return null;
    }

    @Override // p149l.los0
    @Nullable
    public final nbs0 zzk() {
        return null;
    }

    @Override // p149l.los0
    @Nullable
    public final ubs0 zzl() {
        g520 g520VarM146734i = this.f119223a.m146734i();
        if (g520VarM146734i != null) {
            return new zas0(g520VarM146734i.mo124434a(), g520VarM146734i.mo124436c(), g520VarM146734i.mo124435b(), g520VarM146734i.mo124438e(), g520VarM146734i.mo124437d());
        }
        return null;
    }

    @Override // p149l.los0
    @Nullable
    public final uyl zzm() {
        View viewM146726a = this.f119223a.m146726a();
        if (viewM146726a == null) {
            return null;
        }
        return s050.m181848Y2(viewM146726a);
    }

    @Override // p149l.los0
    @Nullable
    public final uyl zzn() {
        View viewM146721G = this.f119223a.m146721G();
        if (viewM146721G == null) {
            return null;
        }
        return s050.m181848Y2(viewM146721G);
    }

    @Override // p149l.los0
    @Nullable
    public final uyl zzo() {
        Object objM146723I = this.f119223a.m146723I();
        if (objM146723I == null) {
            return null;
        }
        return s050.m181848Y2(objM146723I);
    }

    @Override // p149l.los0
    public final String zzp() {
        return this.f119223a.m146727b();
    }

    @Override // p149l.los0
    public final String zzr() {
        return this.f119223a.m146729d();
    }

    @Override // p149l.los0
    public final String zzs() {
        return this.f119223a.m146733h();
    }

    @Override // p149l.los0
    public final String zzt() {
        return this.f119223a.m146739n();
    }

    @Override // p149l.los0
    public final String zzu() {
        return this.f119223a.m146741p();
    }
}
