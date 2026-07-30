package p009l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.android.app.Act;
import com.sunshine.engine.particle.SceneView;
import com.tantanapp.common.utils.NullChecker;
import l.kti0;
import l.m73;
import l.xdl0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class jti0 implements ba3 {

    /* JADX INFO: renamed from: a */
    public VImage f15290a;

    /* JADX INFO: renamed from: b */
    public VText f15291b;

    /* JADX INFO: renamed from: c */
    public SceneView f15292c;

    @Override // p009l.ba3
    /* JADX INFO: renamed from: a */
    public void mo11917a(final Act act, ViewGroup viewGroup) {
        m17191g(o7r.m19649a(act), viewGroup);
        xdl0.E0(this.f15291b, new View.OnClickListener() { // from class: l.iti0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m73.k(act);
            }
        });
    }

    @Override // p009l.ba3
    /* JADX INFO: renamed from: b */
    public View mo11918b() {
        return this.f15290a;
    }

    @Override // p009l.ba3
    /* JADX INFO: renamed from: c */
    public void mo11919c(int i) {
        boolean z = i == 1;
        if (NullChecker.a(this.f15290a) && xdl0.O0(this.f15290a) == z) {
            xdl0.M0(this.f15290a, !z);
            xdl0.M0(this.f15291b, z);
            xdl0.M0(this.f15292c, z);
            this.f15292c.e();
            if (z) {
                this.f15292c.d(new String[]{"animations/boost/config.xml", "animations/boost/pic"});
                this.f15292c.b(true);
            }
        }
    }

    @Override // p009l.ba3
    /* JADX INFO: renamed from: d */
    public void mo11920d(CharSequence charSequence, int i) {
        this.f15291b.setText(String.format("%sx", charSequence));
    }

    /* JADX INFO: renamed from: g */
    public View m17191g(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kti0.b(this, layoutInflater, viewGroup);
    }

    @Override // p009l.ba3
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public SceneView mo11921e() {
        return this.f15292c;
    }
}
