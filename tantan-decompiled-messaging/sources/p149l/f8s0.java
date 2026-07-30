package p149l;

import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class f8s0 extends g8s0 {

    /* JADX INFO: renamed from: a */
    public final gpv0 f96401a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f96402b;

    /* JADX INFO: renamed from: c */
    public final String f96403c;

    public f8s0(gpv0 gpv0Var, @Nullable String str, String str2) {
        this.f96401a = gpv0Var;
        this.f96402b = str;
        this.f96403c = str2;
    }

    @Override // p149l.h8s0
    /* JADX INFO: renamed from: x */
    public final void mo120040x(@Nullable uyl uylVar) {
        if (uylVar == null) {
            return;
        }
        this.f96401a.mo125035a((View) s050.m181847P2(uylVar));
    }

    @Override // p149l.h8s0
    public final String zzb() {
        return this.f96402b;
    }

    @Override // p149l.h8s0
    public final String zzc() {
        return this.f96403c;
    }

    @Override // p149l.h8s0
    public final void zze() {
        this.f96401a.zzb();
    }

    @Override // p149l.h8s0
    public final void zzf() {
        this.f96401a.zzc();
    }
}
