package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public class hr90 extends on2<t3m> {
    public hr90(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        return true;
    }

    @Override // p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        View view = new View(viewGroup.getContext());
        if (this.f148058e <= 0) {
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, !m168325w().mo52302m0() ? qa00.f156316c : qa00.f156333t));
            if (m168325w().mo52302m0()) {
                view.setBackgroundResource(dbc0.f86128En);
                return view;
            }
            view.setBackgroundColor(m168325w().act().getResources().getColor(c9c0.f80391Y0));
            return view;
        }
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        View view2 = new View(viewGroup.getContext());
        view2.setLayoutParams(new ViewGroup.LayoutParams(-1, this.f148058e));
        view2.setBackgroundResource(dbc0.f87224mm);
        linearLayout.addView(view2);
        View view3 = new View(viewGroup.getContext());
        view3.setLayoutParams(new ViewGroup.LayoutParams(-1, qa00.f156317d));
        view3.setBackgroundResource(dbc0.f86160Fn);
        linearLayout.addView(view3);
        return linearLayout;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: r */
    public void mo54015r(View view) {
    }
}
