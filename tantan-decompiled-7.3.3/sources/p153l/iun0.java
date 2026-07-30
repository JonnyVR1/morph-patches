package p153l;

import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveDefaultBulletView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveSpecialSystemBulletView;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iun0 {

    /* JADX INFO: renamed from: a */
    public yun0 f116963a;

    /* JADX INFO: renamed from: a */
    public void m142199a(VoiceLiveDefaultBulletView voiceLiveDefaultBulletView) {
        voiceLiveDefaultBulletView.f54064f.setText(mo133662f());
        bnl0.m105525M0(voiceLiveDefaultBulletView.f54064f, true);
        bnl0.m105525M0(voiceLiveDefaultBulletView.f54065g, false);
    }

    /* JADX INFO: renamed from: b */
    public void m142200b(VoiceLiveSpecialSystemBulletView voiceLiveSpecialSystemBulletView) {
        voiceLiveSpecialSystemBulletView.f54071d.setText(mo133662f());
        bnl0.m105525M0(voiceLiveSpecialSystemBulletView.f54071d, true);
        bnl0.m105525M0(voiceLiveSpecialSystemBulletView.f54072e, false);
    }

    /* JADX INFO: renamed from: c */
    public void m142201c(yun0 yun0Var) {
        this.f116963a = yun0Var;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l.oo2] */
    /* JADX INFO: renamed from: d */
    public oo2 m142202d() {
        yun0 yun0Var = this.f116963a;
        if (yun0Var != null) {
            return yun0Var.m213810E2();
        }
        wtq0.m207906a("presenter 为空，必须先绑定 bulletBasePresenter");
        return null;
    }

    /* JADX INFO: renamed from: e */
    public String m142203e() {
        return "bullet content = " + ((Object) mo133662f()) + " userId = " + uqb0.f180396b0.f170324a.userId() + m142204g();
    }

    /* JADX INFO: renamed from: f */
    public abstract CharSequence mo133662f();

    /* JADX INFO: renamed from: g */
    public final String m142204g() {
        oo2 oo2VarM142202d = m142202d();
        if (oo2VarM142202d == null) {
            return " data is null";
        }
        return " state = " + (oo2VarM142202d.m168538n0() != null ? oo2VarM142202d.m168538n0().state.toString() : "current live is null") + " anchorId = " + (oo2VarM142202d.m168532l0() != null ? oo2VarM142202d.m168532l0().f56859id : " null ") + " roomId = " + m142202d().m202194o() + " liveId = " + m142202d().m202191k() + " liveType = " + m142202d().mo118362A0();
    }

    /* JADX INFO: renamed from: h */
    public long mo133663h() {
        return 3000L;
    }

    /* JADX INFO: renamed from: i */
    public boolean m142205i() {
        yun0 yun0Var = this.f116963a;
        return yun0Var != null && yun0Var.m213815L2();
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo133664j();

    /* JADX INFO: renamed from: k */
    public abstract void mo133665k(ViewGroup viewGroup, evn0 evn0Var);

    /* JADX INFO: renamed from: l */
    public void mo133666l() {
    }
}
