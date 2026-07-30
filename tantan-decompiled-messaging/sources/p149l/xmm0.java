package p149l;

import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.livingroom.voice.motion.VoiceLiveMotionType;

/* JADX INFO: loaded from: classes5.dex */
public class xmm0 extends kwn0 {

    /* JADX INFO: renamed from: d */
    public final bzn0 f193566d;

    /* JADX INFO: renamed from: e */
    public h4t f193567e;

    public xmm0(VoiceLiveMotionType voiceLiveMotionType, sun0 sun0Var, bsm bsmVar, b8m b8mVar) {
        super(voiceLiveMotionType, sun0Var, bsmVar);
        this.f193566d = (bzn0) b8mVar;
    }

    @Override // p149l.kwn0
    /* JADX INFO: renamed from: e */
    public void mo147604e() {
        super.mo147604e();
        this.f193566d.f78047a.removeAllViews();
        int i = xdl0.f192403e;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 1;
        bzn0 bzn0Var = this.f193566d;
        bzn0Var.f78047a.addView(bzn0Var.f78048b.mo103621g(this.f125005c.f77095a), layoutParams);
        this.f193566d.f78047a.setClipChildren(false);
        this.f193567e = (h4t) m147603d(new wtm0(this.f125005c, this.f193566d.f78048b));
    }

    @Override // p149l.kwn0
    /* JADX INFO: renamed from: f */
    public void mo147605f() {
        super.mo147605f();
        h4t h4tVar = this.f193567e;
        if (h4tVar != null) {
            m147606g(h4tVar);
            this.f193567e = null;
        }
        FrameLayout frameLayout = this.f193566d.f78047a;
        if (frameLayout == null || frameLayout.getChildCount() == 0) {
            return;
        }
        this.f193566d.f78047a.removeAllViews();
    }
}
