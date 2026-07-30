package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import org.jetbrains.annotations.NotNull;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class hva0 extends ep90 {

    /* JADX INFO: renamed from: u */
    public VText f111747u;

    public hva0(@NonNull @NotNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: renamed from: R */
    public final void m137309R(View view) {
        this.f111747u = (VText) view.findViewById(adc0.f70050O7);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        m137309R(view);
        m121845Q(this.f111747u, 0);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: k */
    public boolean mo53568k() {
        return false;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        if (au40.m100355a()) {
            return mo53983O().mo52302m0();
        }
        return false;
    }

    @Override // p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return mo53983O().mo146493H2().inflate(kec0.f125916ka, viewGroup, false);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
    }
}
