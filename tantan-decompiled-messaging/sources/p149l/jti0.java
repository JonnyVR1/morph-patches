package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.sunshine.engine.particle.SceneView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class jti0 implements ba3 {

    /* JADX INFO: renamed from: a */
    public VImage f119609a;

    /* JADX INFO: renamed from: b */
    public VText f119610b;

    /* JADX INFO: renamed from: c */
    public SceneView f119611c;

    @Override // p149l.ba3
    /* JADX INFO: renamed from: a */
    public void mo100885a(final Act act, ViewGroup viewGroup) {
        m143107g(o7r.m163037a(act), viewGroup);
        xdl0.m208329E0(this.f119610b, new View.OnClickListener() { // from class: l.iti0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m73.m153331k(act);
            }
        });
    }

    @Override // p149l.ba3
    /* JADX INFO: renamed from: b */
    public View mo100886b() {
        return this.f119609a;
    }

    @Override // p149l.ba3
    /* JADX INFO: renamed from: c */
    public void mo100887c(int i) {
        boolean z = i == 1;
        if (NullChecker.m81303a(this.f119609a) && xdl0.m208349O0(this.f119609a) == z) {
            xdl0.m208345M0(this.f119609a, !z);
            xdl0.m208345M0(this.f119610b, z);
            xdl0.m208345M0(this.f119611c, z);
            this.f119611c.m80919e();
            if (z) {
                this.f119611c.m80918d("animations/boost/config.xml", "animations/boost/pic");
                this.f119611c.m80916b(true);
            }
        }
    }

    @Override // p149l.ba3
    /* JADX INFO: renamed from: d */
    public void mo100888d(CharSequence charSequence, int i) {
        this.f119610b.setText(String.format("%sx", charSequence));
    }

    /* JADX INFO: renamed from: g */
    public View m143107g(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kti0.m147209b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.ba3
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public SceneView mo100889e() {
        return this.f119611c;
    }
}
