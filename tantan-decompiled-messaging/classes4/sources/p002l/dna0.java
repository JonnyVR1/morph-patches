package p002l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import l.f6c0;
import l.mcr;
import l.ml40;
import l.u4c0;
import org.jetbrains.annotations.NotNull;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class dna0 extends ah90 {

    /* JADX INFO: renamed from: u */
    public VText f9362u;

    public dna0(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: R */
    public final void m11977R(View view) {
        this.f9362u = view.findViewById(u4c0.M7);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        m11977R(view);
        m9651Q(this.f9362u, 0);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: k */
    public boolean mo2919k() {
        return false;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        if (ml40.a()) {
            return mo3351O().mo1570m0();
        }
        return false;
    }

    @Override // p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return mo3351O().mo9267H2().inflate(f6c0.da, viewGroup, false);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
    }
}
