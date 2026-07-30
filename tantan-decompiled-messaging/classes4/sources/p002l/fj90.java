package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import l.mcr;
import l.t100;
import l.x2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fj90 extends hn2<a1m> {
    public fj90(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
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
        if (this.f12127e <= 0) {
            View view = new View(viewGroup.getContext());
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, t100.o));
            view.setBackgroundResource(x2c0.Om);
            return view;
        }
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        View view2 = new View(viewGroup.getContext());
        view2.setLayoutParams(new ViewGroup.LayoutParams(-1, this.f12127e));
        view2.setBackgroundResource(x2c0.yl);
        linearLayout.addView(view2);
        View view3 = new View(viewGroup.getContext());
        view3.setLayoutParams(new ViewGroup.LayoutParams(-1, t100.d));
        view3.setBackgroundResource(x2c0.Rm);
        linearLayout.addView(view3);
        return linearLayout;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: r */
    public void mo3383r(View view) {
    }
}
