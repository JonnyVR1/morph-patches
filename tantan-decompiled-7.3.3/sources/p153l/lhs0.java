package p153l;

import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class lhs0 extends mhs0 {

    /* JADX INFO: renamed from: a */
    public final myv0 f132136a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f132137b;

    /* JADX INFO: renamed from: c */
    public final String f132138c;

    public lhs0(myv0 myv0Var, @Nullable String str, String str2) {
        this.f132136a = myv0Var;
        this.f132137b = str;
        this.f132138c = str2;
    }

    @Override // p153l.nhs0
    /* JADX INFO: renamed from: x */
    public final void mo154244x(@Nullable p1m p1mVar) {
        if (p1mVar == null) {
            return;
        }
        this.f132136a.mo98626a((View) h950.m134037P2(p1mVar));
    }

    @Override // p153l.nhs0
    public final String zzb() {
        return this.f132137b;
    }

    @Override // p153l.nhs0
    public final String zzc() {
        return this.f132138c;
    }

    @Override // p153l.nhs0
    public final void zze() {
        this.f132136a.zzb();
    }

    @Override // p153l.nhs0
    public final void zzf() {
        this.f132136a.zzc();
    }
}
