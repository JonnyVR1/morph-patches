package p153l;

import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.livingroom.voice.motion.VoiceLiveMotionType;

/* JADX INFO: loaded from: classes5.dex */
public class tum0 extends o5o0 {

    /* JADX INFO: renamed from: d */
    public final f8o0 f176199d;

    /* JADX INFO: renamed from: e */
    public i6t f176200e;

    public tum0(VoiceLiveMotionType voiceLiveMotionType, w3o0 w3o0Var, dum dumVar, ram ramVar) {
        super(voiceLiveMotionType, w3o0Var, dumVar);
        this.f176199d = (f8o0) ramVar;
    }

    @Override // p153l.o5o0
    /* JADX INFO: renamed from: e */
    public void mo106726e() {
        super.mo106726e();
        this.f176199d.f97751a.removeAllViews();
        int i = bnl0.f77544e;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 1;
        f8o0 f8o0Var = this.f176199d;
        f8o0Var.f97751a.addView(f8o0Var.f97752b.mo182846g(this.f145096c.f90815a), layoutParams);
        this.f176199d.f97751a.setClipChildren(false);
        this.f176200e = (i6t) m166167d(new s2n0(this.f145096c, this.f176199d.f97752b));
    }

    @Override // p153l.o5o0
    /* JADX INFO: renamed from: f */
    public void mo106727f() {
        super.mo106727f();
        i6t i6tVar = this.f176200e;
        if (i6tVar != null) {
            m166168g(i6tVar);
            this.f176200e = null;
        }
        FrameLayout frameLayout = this.f176199d.f97751a;
        if (frameLayout == null || frameLayout.getChildCount() == 0) {
            return;
        }
        this.f176199d.f97751a.removeAllViews();
    }
}
