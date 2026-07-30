package p149l;

import android.content.Context;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.Nullable;
import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji;
import com.p046p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveMember;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p149l.p3n0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class bs2<V extends p3n0> implements c8m<eom0>, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a */
    public eom0 f76970a;

    /* JADX INFO: renamed from: c */
    public View f76972c;

    /* JADX INFO: renamed from: d */
    public final Choreographer f76973d = Choreographer.getInstance();

    /* JADX INFO: renamed from: b */
    public final List<V> f76971b = new ArrayList();

    /* JADX INFO: renamed from: e */
    private void m103609e() {
        for (int i = 0; i < this.f76971b.size(); i++) {
            m103620f(i);
        }
    }

    /* JADX INFO: renamed from: i */
    private void m103610i() {
        List<V> listMo103619d = mo103619d();
        if (vwb.m200296J(listMo103619d)) {
            return;
        }
        this.f76971b.clear();
        this.f76971b.addAll(listMo103619d);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.c8m
    /* JADX INFO: renamed from: D */
    public void mo103611D(BLiveVoiceCall bLiveVoiceCall) {
        if (bLiveVoiceCall.position < this.f76971b.size()) {
            this.f76971b.get(bLiveVoiceCall.position).mo77952D(bLiveVoiceCall);
        }
    }

    @Override // p149l.c8m
    /* JADX INFO: renamed from: N1 */
    public void mo103612N1(BLiveVoiceCall bLiveVoiceCall) {
        if (bLiveVoiceCall.position < this.f76971b.size()) {
            this.f76971b.get(bLiveVoiceCall.position).mo77957a(bLiveVoiceCall);
        }
    }

    @Override // p149l.c8m
    /* JADX INFO: renamed from: Q3 */
    public void mo103613Q3(int i, boolean z) {
        if (i < this.f76971b.size()) {
            this.f76971b.get(i).mo77964h(i + 1, z, this.f76970a);
        }
    }

    @Override // p149l.c8m
    /* JADX INFO: renamed from: W1 */
    public void mo103614W1(BLiveVoiceCall bLiveVoiceCall, List<VoiceMicEmoji.EmojiPlayResult> list, String str, String str2) {
        this.f76971b.get(bLiveVoiceCall.position).mo77960d(list, str, str2);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(eom0 eom0Var) {
        this.f76970a = eom0Var;
        this.f76973d.postFrameCallback(this);
    }

    @Override // p149l.c8m
    /* JADX INFO: renamed from: b1 */
    public void mo103616b1(int i, String str) {
        if (i < this.f76971b.size()) {
            this.f76971b.get(i).mo77963g(str);
        }
    }

    /* JADX INFO: renamed from: c */
    public s1o0 m103617c(String str) {
        HashMap<String, s1o0> mapM117404k4;
        eom0 eom0Var = this.f76970a;
        if (eom0Var == null || (mapM117404k4 = eom0Var.m117404k4()) == null || !mapM117404k4.containsKey(str)) {
            return null;
        }
        s1o0 s1o0Var = mapM117404k4.get(str);
        if (s1o0Var instanceof s1o0) {
            return s1o0Var;
        }
        return null;
    }

    @Override // p149l.c8m
    /* JADX INFO: renamed from: c1 */
    public void mo103618c1(BLiveVoiceCall bLiveVoiceCall, List<VoiceMicEmoji.EmojiPlayResult> list, String str) {
        this.f76971b.get(bLiveVoiceCall.position).mo77958b(list, str);
    }

    /* JADX INFO: renamed from: d */
    public abstract List<V> mo103619d();

    @Override // p149l.s7m
    public void destroy() {
        m103609e();
        setVisible(false);
        this.f76973d.removeFrameCallback(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        eom0 eom0Var = this.f76970a;
        if (eom0Var != null) {
            final nnn0 nnn0Var = (nnn0) eom0Var.m206027E2();
            vwb.m200354z(nnn0Var.m160249P2().m102067p(), new e30() { // from class: l.as2
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f71378a.m103622j(nnn0Var, (BLiveVoiceCall) obj);
                }
            });
            this.f76973d.postFrameCallback(this);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m103620f(int i) {
        if (i < this.f76971b.size()) {
            this.f76971b.get(i).mo77962f(i + 1, this.f76970a);
        }
    }

    @Override // p149l.c8m
    /* JADX INFO: renamed from: g */
    public View mo103621g(Context context) {
        if (this.f76972c == null) {
            this.f76972c = inflateView(LayoutInflater.from(context), null);
            m103610i();
        }
        return this.f76972c;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m103622j(nnn0 nnn0Var, BLiveVoiceCall bLiveVoiceCall) {
        BLiveUserMask bLiveUserMask;
        int i;
        hxn0 hxn0VarM133350c = hxn0.m133350c(nnn0Var.m160249P2().m102064m(bLiveVoiceCall.user));
        long jM155944o = mqi0.m155944o();
        if (bLiveVoiceCall.position >= this.f76971b.size() || hxn0VarM133350c == null || (bLiveUserMask = hxn0VarM133350c.f109896b) == null) {
            return;
        }
        BLiveAvatarFrameConfig bLiveAvatarFrameConfig = bLiveUserMask.avatarConfig.frameConfig;
        if (bLiveAvatarFrameConfig.changeVoiceNo == 0 || (i = bLiveAvatarFrameConfig.totalSec) == 0) {
            return;
        }
        long j = bLiveAvatarFrameConfig.endMill;
        if (j > jM155944o) {
            this.f76971b.get(bLiveVoiceCall.position).mo77965i((((j - 1000) - jM155944o) / (i * 1000)) * 100.0f);
        }
    }

    @Override // p149l.c8m
    /* JADX INFO: renamed from: j2 */
    public void mo103623j2(BLiveVoiceCall bLiveVoiceCall) {
        this.f76971b.get(bLiveVoiceCall.position).mo77966j();
    }

    /* JADX INFO: renamed from: r */
    public void mo103624r() {
        for (int i = 0; i < this.f76971b.size(); i++) {
            m103620f(i);
            this.f76971b.get(i).mo77959c(i, this.f76970a);
        }
    }

    @Override // p149l.c8m
    public void setData(bik0 bik0Var) {
        List<BLiveVoiceCall> listM102067p = bik0Var.m102067p();
        if (vwb.m200296J(listM102067p)) {
            return;
        }
        m103609e();
        for (int i = 0; i < listM102067p.size(); i++) {
            mo103626t2(bik0Var, listM102067p.get(i));
        }
    }

    @Override // p149l.c8m
    public void setVisible(boolean z) {
        xdl0.m208345M0(this.f76972c, z);
    }

    @Override // p149l.c8m
    /* JADX INFO: renamed from: t */
    public void mo103625t() {
        setVisible(true);
        mo103624r();
    }

    @Override // p149l.c8m
    /* JADX INFO: renamed from: t2 */
    public void mo103626t2(bik0 bik0Var, BLiveVoiceCall bLiveVoiceCall) {
        mqv<i54> mqvVarM102064m = bik0Var.m102064m(bLiveVoiceCall.user);
        BLiveMember bLiveMemberM201354G = bik0Var.m102069r().m201354G(bLiveVoiceCall.user);
        int i = bLiveVoiceCall.position;
        if (i >= 0 && i < this.f76971b.size()) {
            if (mqvVarM102064m != null) {
                this.f76971b.get(bLiveVoiceCall.position).mo77961e(bLiveVoiceCall, bLiveMemberM201354G, mqvVarM102064m, this.f76970a, m103617c(bLiveVoiceCall.user));
            }
        } else {
            hfw.m130790a("[voice][call]", "illegal call,id=" + bLiveVoiceCall.f44485id + ",position:" + bLiveVoiceCall.position);
        }
    }
}
