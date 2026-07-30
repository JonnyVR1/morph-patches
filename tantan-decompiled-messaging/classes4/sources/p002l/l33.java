package p002l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import l.mcr;
import l.t100;
import l.w0c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class l33 extends hn2<a1m> {
    public l33(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: k */
    public boolean mo2919k() {
        return false;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        return true;
    }

    @Override // p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        View view = new View(viewGroup.getContext());
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, t100.d(80.0f)));
        view.setBackgroundResource(w0c0.U1);
        return view;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
    }
}
