package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import org.jetbrains.annotations.NotNull;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class dna0 extends ah90 {

    /* JADX INFO: renamed from: u */
    public VText f87043u;

    public dna0(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: R */
    public final void m112612R(View view) {
        this.f87043u = (VText) view.findViewById(u4c0.f173928M7);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        m112612R(view);
        m96420Q(this.f87043u, 0);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: k */
    public boolean mo52385k() {
        return false;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        if (ml40.m155115a()) {
            return mo52800O().mo51119m0();
        }
        return false;
    }

    @Override // p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return mo52800O().mo94568H2().inflate(f6c0.f95744da, viewGroup, false);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
    }
}
