package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public class dj90 extends hn2<a1m> {
    public dj90(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        return true;
    }

    @Override // p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        View view = new View(viewGroup.getContext());
        if (this.f108536e <= 0) {
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, !m131825w().mo51119m0() ? t100.f167254c : t100.f167271t));
            if (m131825w().mo51119m0()) {
                view.setBackgroundResource(x2c0.f189678Qm);
                return view;
            }
            view.setBackgroundColor(m131825w().act().getResources().getColor(w0c0.f183819X0));
            return view;
        }
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        View view2 = new View(viewGroup.getContext());
        view2.setLayoutParams(new ViewGroup.LayoutParams(-1, this.f108536e));
        view2.setBackgroundResource(x2c0.f190752yl);
        linearLayout.addView(view2);
        View view3 = new View(viewGroup.getContext());
        view3.setLayoutParams(new ViewGroup.LayoutParams(-1, t100.f167255d));
        view3.setBackgroundResource(x2c0.f189709Rm);
        linearLayout.addView(view3);
        return linearLayout;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: r */
    public void mo52832r(View view) {
    }
}
