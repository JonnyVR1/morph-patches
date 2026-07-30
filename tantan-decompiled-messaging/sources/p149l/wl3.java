package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.boost.view.OverlapCircleView;
import com.p046p1.mobile.putong.core.p053ui.home.BounceButton;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersAct;
import com.sunshine.engine.particle.SceneView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class wl3 implements ba3 {

    /* JADX INFO: renamed from: a */
    public int f186862a = -1;

    /* JADX INFO: renamed from: b */
    public final boolean f186863b;

    /* JADX INFO: renamed from: c */
    public SceneView f186864c;

    /* JADX INFO: renamed from: d */
    public ViewGroup f186865d;

    /* JADX INFO: renamed from: e */
    public BounceButton f186866e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f186867f;

    /* JADX INFO: renamed from: g */
    public OverlapCircleView f186868g;

    /* JADX INFO: renamed from: h */
    public VText f186869h;

    public wl3(boolean z) {
        this.f186863b = z;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m203745f(Act act, View view) {
        z93.m217661d(act instanceof LikersAct);
        m73.m153331k(act);
    }

    @Override // p149l.ba3
    /* JADX INFO: renamed from: a */
    public void mo100885a(@NonNull final Act act, ViewGroup viewGroup) {
        this.f186865d = viewGroup;
        m203746g(o7r.m163037a(act), viewGroup);
        this.f186866e.setBorderOuterCircle(this.f186863b);
        xdl0.m208329E0(this.f186869h, new View.OnClickListener() { // from class: l.vl3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wl3.m203745f(act, view);
            }
        });
    }

    @Override // p149l.ba3
    /* JADX INFO: renamed from: b */
    public View mo100886b() {
        return this.f186866e;
    }

    @Override // p149l.ba3
    /* JADX INFO: renamed from: c */
    public void mo100887c(int i) {
        this.f186862a = i;
        boolean z = i == 1;
        if (NullChecker.m81303a(this.f186866e) && xdl0.m208349O0(this.f186866e) == z) {
            xdl0.m208345M0(this.f186866e, !z);
            xdl0.m208345M0(this.f186869h, z);
            xdl0.m208345M0(this.f186868g, z);
            xdl0.m208345M0(this.f186867f, z);
            m203748i();
        }
    }

    @Override // p149l.ba3
    /* JADX INFO: renamed from: d */
    public void mo100888d(CharSequence charSequence, int i) {
        if (NullChecker.m81303a(this.f186869h)) {
            this.f186869h.setText(String.format("%sx", charSequence));
            this.f186868g.setProgress(i);
        }
    }

    /* JADX INFO: renamed from: g */
    public View m203746g(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xl3.m209841b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.ba3
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public SceneView mo100889e() {
        return this.f186864c;
    }

    /* JADX INFO: renamed from: i */
    public final void m203748i() {
        if (NullChecker.m81303a(this.f186864c)) {
            boolean z = false;
            boolean z2 = this.f186862a == 1;
            SceneView sceneView = this.f186864c;
            if (z2 && xdl0.m208349O0(this.f186865d)) {
                z = true;
            }
            xdl0.m208345M0(sceneView, z);
            this.f186864c.m80919e();
            if (z2) {
                this.f186864c.m80918d("animations/boost/config.xml", "animations/boost/pic");
                this.f186864c.m80916b(true);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m203749j(SceneView sceneView) {
        this.f186864c = sceneView;
        m203748i();
    }
}
