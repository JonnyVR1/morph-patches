package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public class fj90 extends hn2<a1m> {
    public fj90(@NonNull a1m a1mVar, mcr mcrVar) {
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
        if (this.f108536e <= 0) {
            View view = new View(viewGroup.getContext());
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, t100.f167266o));
            view.setBackgroundResource(x2c0.f189616Om);
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
