package p149l;

import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveDefaultBulletView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveSpecialSystemBulletView;

/* JADX INFO: loaded from: classes5.dex */
public abstract class eln0 {

    /* JADX INFO: renamed from: a */
    public uln0 f92131a;

    /* JADX INFO: renamed from: a */
    public void m117143a(VoiceLiveDefaultBulletView voiceLiveDefaultBulletView) {
        voiceLiveDefaultBulletView.f53216f.setText(mo113892f());
        xdl0.m208345M0(voiceLiveDefaultBulletView.f53216f, true);
        xdl0.m208345M0(voiceLiveDefaultBulletView.f53217g, false);
    }

    /* JADX INFO: renamed from: b */
    public void m117144b(VoiceLiveSpecialSystemBulletView voiceLiveSpecialSystemBulletView) {
        voiceLiveSpecialSystemBulletView.f53223d.setText(mo113892f());
        xdl0.m208345M0(voiceLiveSpecialSystemBulletView.f53223d, true);
        xdl0.m208345M0(voiceLiveSpecialSystemBulletView.f53224e, false);
    }

    /* JADX INFO: renamed from: c */
    public void m117145c(uln0 uln0Var) {
        this.f92131a = uln0Var;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2] */
    /* JADX INFO: renamed from: d */
    public ho2 m117146d() {
        uln0 uln0Var = this.f92131a;
        if (uln0Var != null) {
            return uln0Var.m206027E2();
        }
        qkq0.m175383a("presenter 为空，必须先绑定 bulletBasePresenter");
        return null;
    }

    /* JADX INFO: renamed from: e */
    public String m117147e() {
        return "bullet content = " + ((Object) mo113892f()) + " userId = " + qib0.f154713b0.f139230a.userId() + m117148g();
    }

    /* JADX INFO: renamed from: f */
    public abstract CharSequence mo113892f();

    /* JADX INFO: renamed from: g */
    public final String m117148g() {
        ho2 ho2VarM117146d = m117146d();
        if (ho2VarM117146d == null) {
            return " data is null";
        }
        return " state = " + (ho2VarM117146d.m132152n0() != null ? ho2VarM117146d.m132152n0().state.toString() : "current live is null") + " anchorId = " + (ho2VarM117146d.m132146l0() != null ? ho2VarM117146d.m132146l0().f56011id : " null ") + " roomId = " + m117146d().m149818o() + " liveId = " + m117146d().m149814k() + " liveType = " + m117146d().mo132054A0();
    }

    /* JADX INFO: renamed from: h */
    public long mo113893h() {
        return 3000L;
    }

    /* JADX INFO: renamed from: i */
    public boolean m117149i() {
        uln0 uln0Var = this.f92131a;
        return uln0Var != null && uln0Var.m206032L2();
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo113894j();

    /* JADX INFO: renamed from: k */
    public abstract void mo113895k(ViewGroup viewGroup, amn0 amn0Var);

    /* JADX INFO: renamed from: l */
    public void mo113896l() {
    }
}
