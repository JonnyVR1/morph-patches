package p009l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.boost.view.OverlapCircleView;
import com.p1.mobile.putong.core.ui.home.BounceButton;
import com.p1.mobile.putong.core.ui.vip.likers.LikersAct;
import com.sunshine.engine.particle.SceneView;
import com.tantanapp.common.utils.NullChecker;
import l.m73;
import l.xdl0;
import l.xl3;
import l.z93;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class wl3 implements ba3 {

    /* JADX INFO: renamed from: a */
    public int f22173a = -1;

    /* JADX INFO: renamed from: b */
    public final boolean f22174b;

    /* JADX INFO: renamed from: c */
    public SceneView f22175c;

    /* JADX INFO: renamed from: d */
    public ViewGroup f22176d;

    /* JADX INFO: renamed from: e */
    public BounceButton f22177e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f22178f;

    /* JADX INFO: renamed from: g */
    public OverlapCircleView f22179g;

    /* JADX INFO: renamed from: h */
    public VText f22180h;

    public wl3(boolean z) {
        this.f22174b = z;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m24314f(Act act, View view) {
        z93.d(act instanceof LikersAct);
        m73.k(act);
    }

    @Override // p009l.ba3
    /* JADX INFO: renamed from: a */
    public void mo11917a(@NonNull final Act act, ViewGroup viewGroup) {
        this.f22176d = viewGroup;
        m24315g(o7r.m19649a(act), viewGroup);
        this.f22177e.setBorderOuterCircle(this.f22174b);
        xdl0.E0(this.f22180h, new View.OnClickListener() { // from class: l.vl3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wl3.m24314f(act, view);
            }
        });
    }

    @Override // p009l.ba3
    /* JADX INFO: renamed from: b */
    public View mo11918b() {
        return this.f22177e;
    }

    @Override // p009l.ba3
    /* JADX INFO: renamed from: c */
    public void mo11919c(int i) {
        this.f22173a = i;
        boolean z = i == 1;
        if (NullChecker.a(this.f22177e) && xdl0.O0(this.f22177e) == z) {
            xdl0.M0(this.f22177e, !z);
            xdl0.M0(this.f22180h, z);
            xdl0.M0(this.f22179g, z);
            xdl0.M0(this.f22178f, z);
            m24317i();
        }
    }

    @Override // p009l.ba3
    /* JADX INFO: renamed from: d */
    public void mo11920d(CharSequence charSequence, int i) {
        if (NullChecker.a(this.f22180h)) {
            this.f22180h.setText(String.format("%sx", charSequence));
            this.f22179g.setProgress(i);
        }
    }

    /* JADX INFO: renamed from: g */
    public View m24315g(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xl3.b(this, layoutInflater, viewGroup);
    }

    @Override // p009l.ba3
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public SceneView mo11921e() {
        return this.f22175c;
    }

    /* JADX INFO: renamed from: i */
    public final void m24317i() {
        if (NullChecker.a(this.f22175c)) {
            boolean z = false;
            boolean z2 = this.f22173a == 1;
            SceneView sceneView = this.f22175c;
            if (z2 && xdl0.O0(this.f22176d)) {
                z = true;
            }
            xdl0.M0(sceneView, z);
            this.f22175c.e();
            if (z2) {
                this.f22175c.d(new String[]{"animations/boost/config.xml", "animations/boost/pic"});
                this.f22175c.b(true);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m24318j(SceneView sceneView) {
        this.f22175c = sceneView;
        m24317i();
    }
}
