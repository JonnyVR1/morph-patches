package p153l;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzabn;
import com.google.android.gms.internal.ads.zzdl;
import com.google.android.gms.internal.ads.zzgaa;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class cbr0 implements zcr0, nlu0, wbr0 {

    /* JADX INFO: renamed from: n */
    public static final Executor f80840n = new Executor() { // from class: l.h7z0
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
        }
    };

    /* JADX INFO: renamed from: a */
    public final Context f80841a;

    /* JADX INFO: renamed from: b */
    public final upt0 f80842b;

    /* JADX INFO: renamed from: c */
    public final nbr0 f80843c;

    /* JADX INFO: renamed from: d */
    public final xbr0 f80844d;

    /* JADX INFO: renamed from: e */
    public mfv0 f80845e;

    /* JADX INFO: renamed from: f */
    public kbr0 f80846f;

    /* JADX INFO: renamed from: g */
    public usv0 f80847g;

    /* JADX INFO: renamed from: h */
    public p7z0 f80848h;

    /* JADX INFO: renamed from: i */
    public List f80849i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public Pair f80850j;

    /* JADX INFO: renamed from: k */
    public final xcr0 f80851k;

    /* JADX INFO: renamed from: l */
    public final Executor f80852l;

    /* JADX INFO: renamed from: m */
    public int f80853m;

    public /* synthetic */ cbr0(i7z0 i7z0Var, bbr0 bbr0Var) {
        this.f80841a = i7z0Var.f113311a;
        upt0 upt0Var = i7z0Var.f113313c;
        lev0.m153954b(upt0Var);
        this.f80842b = upt0Var;
        nbr0 nbr0Var = i7z0Var.f113314d;
        lev0.m153954b(nbr0Var);
        this.f80843c = nbr0Var;
        this.f80844d = new xbr0(this, nbr0Var);
        this.f80845e = mfv0.f136676a;
        this.f80851k = xcr0.f193399a;
        this.f80852l = f80840n;
        this.f80853m = 0;
    }

    @Override // p153l.zcr0
    /* JADX INFO: renamed from: b */
    public final void mo108654b(sqr0 sqr0Var) throws zzabn {
        wwy0 wwy0VarM117907g;
        int i;
        lev0.m153958f(this.f80853m == 0);
        lev0.m153954b(this.f80849i);
        mfv0 mfv0Var = this.f80845e;
        Looper looperMyLooper = Looper.myLooper();
        lev0.m153954b(looperMyLooper);
        this.f80847g = mfv0Var.mo135184a(looperMyLooper, null);
        wwy0 wwy0Var = sqr0Var.f170263x;
        if (wwy0Var == null || ((i = wwy0Var.f191349c) != 7 && i != 6)) {
            wwy0Var = wwy0.f191338h;
        }
        wwy0 wwy0Var2 = wwy0Var;
        if (wwy0Var2.f191349c == 7) {
            dty0 dty0VarM208357c = wwy0Var2.m208357c();
            dty0VarM208357c.m117904d(6);
            wwy0VarM117907g = dty0VarM208357c.m117907g();
        } else {
            wwy0VarM117907g = wwy0Var2;
        }
        try {
            upt0 upt0Var = this.f80842b;
            Context context = this.f80841a;
            s1z0 s1z0Var = s1z0.f165818a;
            final usv0 usv0Var = this.f80847g;
            Objects.requireNonNull(usv0Var);
            upt0Var.mo166390a(context, wwy0Var2, wwy0VarM117907g, s1z0Var, this, new Executor() { // from class: l.g7z0
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    usv0Var.mo121303g(runnable);
                }
            }, zzgaa.zzl(), 0L);
            Pair pair = this.f80850j;
            if (pair != null) {
                chw0 chw0Var = (chw0) pair.second;
                chw0Var.m109848b();
                chw0Var.m109847a();
            }
            this.f80848h = new p7z0(this.f80841a, this, null);
            Pair pair2 = this.f80850j;
            if (pair2 == null) {
                this.f80849i.getClass();
                throw null;
            }
            chw0 chw0Var2 = (chw0) pair2.second;
            lev0.m153954b(null);
            chw0Var2.m109848b();
            chw0Var2.m109847a();
            throw null;
        } catch (zzdl e) {
            throw new zzabn(e, sqr0Var);
        }
    }

    @Override // p153l.zcr0
    /* JADX INFO: renamed from: c */
    public final void mo108655c(List list) {
        this.f80849i = list;
        if (zzk()) {
            lev0.m153954b(this.f80848h);
            throw null;
        }
    }

    @Override // p153l.zcr0
    /* JADX INFO: renamed from: d */
    public final void mo108656d(long j) {
        lev0.m153954b(this.f80848h);
        throw null;
    }

    @Override // p153l.zcr0
    /* JADX INFO: renamed from: e */
    public final void mo108657e(mfv0 mfv0Var) {
        lev0.m153958f(!zzk());
        this.f80845e = mfv0Var;
    }

    @Override // p153l.zcr0
    /* JADX INFO: renamed from: f */
    public final void mo108658f(kbr0 kbr0Var) {
        this.f80846f = kbr0Var;
    }

    @Override // p153l.zcr0
    /* JADX INFO: renamed from: g */
    public final void mo108659g(Surface surface, chw0 chw0Var) {
        Pair pair = this.f80850j;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((chw0) this.f80850j.second).equals(chw0Var)) {
            return;
        }
        this.f80850j = Pair.create(surface, chw0Var);
        chw0Var.m109848b();
        chw0Var.m109847a();
    }

    @Override // p153l.zcr0
    public final nbr0 zza() {
        return this.f80843c;
    }

    @Override // p153l.zcr0
    public final ycr0 zzb() {
        p7z0 p7z0Var = this.f80848h;
        lev0.m153954b(p7z0Var);
        return p7z0Var;
    }

    @Override // p153l.zcr0
    public final void zzc() {
        chw0 chw0Var = chw0.f81875c;
        chw0Var.m109848b();
        chw0Var.m109847a();
        this.f80850j = null;
    }

    @Override // p153l.zcr0
    public final void zze() {
        if (this.f80853m == 2) {
            return;
        }
        usv0 usv0Var = this.f80847g;
        if (usv0Var != null) {
            usv0Var.mo121298b(null);
        }
        this.f80850j = null;
        this.f80853m = 2;
    }

    @Override // p153l.zcr0
    public final boolean zzk() {
        return this.f80853m == 1;
    }
}
