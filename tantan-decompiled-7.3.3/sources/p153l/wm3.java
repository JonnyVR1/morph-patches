package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.boost.view.OverlapCircleView;
import com.p051p1.mobile.putong.core.p058ui.home.BounceButton;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersAct;
import com.sunshine.engine.particle.SceneView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class wm3 implements qa3 {

    /* JADX INFO: renamed from: a */
    public int f189763a = -1;

    /* JADX INFO: renamed from: b */
    public final boolean f189764b;

    /* JADX INFO: renamed from: c */
    public SceneView f189765c;

    /* JADX INFO: renamed from: d */
    public ViewGroup f189766d;

    /* JADX INFO: renamed from: e */
    public BounceButton f189767e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f189768f;

    /* JADX INFO: renamed from: g */
    public OverlapCircleView f189769g;

    /* JADX INFO: renamed from: h */
    public VText f189770h;

    public wm3(boolean z) {
        this.f189764b = z;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m207085f(Act act, View view) {
        oa3.m166822d(act instanceof LikersAct);
        b83.m102909k(act);
    }

    @Override // p153l.qa3
    /* JADX INFO: renamed from: a */
    public void mo147949a(@NonNull final Act act, ViewGroup viewGroup) {
        this.f189766d = viewGroup;
        m207086g(p9r.m171370a(act), viewGroup);
        this.f189767e.setBorderOuterCircle(this.f189764b);
        bnl0.m105509E0(this.f189770h, new View.OnClickListener() { // from class: l.vm3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wm3.m207085f(act, view);
            }
        });
    }

    @Override // p153l.qa3
    /* JADX INFO: renamed from: b */
    public View mo147950b() {
        return this.f189767e;
    }

    @Override // p153l.qa3
    /* JADX INFO: renamed from: c */
    public void mo147951c(int i) {
        this.f189763a = i;
        boolean z = i == 1;
        if (NullChecker.m82486a(this.f189767e) && bnl0.m105529O0(this.f189767e) == z) {
            bnl0.m105525M0(this.f189767e, !z);
            bnl0.m105525M0(this.f189770h, z);
            bnl0.m105525M0(this.f189769g, z);
            bnl0.m105525M0(this.f189768f, z);
            m207088i();
        }
    }

    @Override // p153l.qa3
    /* JADX INFO: renamed from: d */
    public void mo147952d(CharSequence charSequence, int i) {
        if (NullChecker.m82486a(this.f189770h)) {
            this.f189770h.setText(String.format("%sx", charSequence));
            this.f189769g.setProgress(i);
        }
    }

    /* JADX INFO: renamed from: g */
    public View m207086g(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xm3.m211715b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.qa3
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public SceneView mo147953e() {
        return this.f189765c;
    }

    /* JADX INFO: renamed from: i */
    public final void m207088i() {
        if (NullChecker.m82486a(this.f189765c)) {
            boolean z = false;
            boolean z2 = this.f189763a == 1;
            SceneView sceneView = this.f189765c;
            if (z2 && bnl0.m105529O0(this.f189766d)) {
                z = true;
            }
            bnl0.m105525M0(sceneView, z);
            this.f189765c.m82102e();
            if (z2) {
                this.f189765c.m82101d("animations/boost/config.xml", "animations/boost/pic");
                this.f189765c.m82099b(true);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m207089j(SceneView sceneView) {
        this.f189765c = sceneView;
        m207088i();
    }
}
