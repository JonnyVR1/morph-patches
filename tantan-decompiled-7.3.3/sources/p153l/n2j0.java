package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.sunshine.engine.particle.SceneView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class n2j0 implements qa3 {

    /* JADX INFO: renamed from: a */
    public VImage f139868a;

    /* JADX INFO: renamed from: b */
    public VText f139869b;

    /* JADX INFO: renamed from: c */
    public SceneView f139870c;

    @Override // p153l.qa3
    /* JADX INFO: renamed from: a */
    public void mo147949a(final Act act, ViewGroup viewGroup) {
        m161237g(p9r.m171370a(act), viewGroup);
        bnl0.m105509E0(this.f139869b, new View.OnClickListener() { // from class: l.m2j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b83.m102909k(act);
            }
        });
    }

    @Override // p153l.qa3
    /* JADX INFO: renamed from: b */
    public View mo147950b() {
        return this.f139868a;
    }

    @Override // p153l.qa3
    /* JADX INFO: renamed from: c */
    public void mo147951c(int i) {
        boolean z = i == 1;
        if (NullChecker.m82486a(this.f139868a) && bnl0.m105529O0(this.f139868a) == z) {
            bnl0.m105525M0(this.f139868a, !z);
            bnl0.m105525M0(this.f139869b, z);
            bnl0.m105525M0(this.f139870c, z);
            this.f139870c.m82102e();
            if (z) {
                this.f139870c.m82101d("animations/boost/config.xml", "animations/boost/pic");
                this.f139870c.m82099b(true);
            }
        }
    }

    @Override // p153l.qa3
    /* JADX INFO: renamed from: d */
    public void mo147952d(CharSequence charSequence, int i) {
        this.f139869b.setText(String.format("%sx", charSequence));
    }

    /* JADX INFO: renamed from: g */
    public View m161237g(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return o2j0.m165729b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.qa3
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public SceneView mo147953e() {
        return this.f139870c;
    }
}
