package p153l;

import android.content.Context;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.Nullable;
import com.p051p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji;
import com.p051p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveMember;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p153l.tcn0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class rs2<V extends tcn0> implements sam<ixm0>, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a */
    public ixm0 f164625a;

    /* JADX INFO: renamed from: c */
    public View f164627c;

    /* JADX INFO: renamed from: d */
    public final Choreographer f164628d = Choreographer.getInstance();

    /* JADX INFO: renamed from: b */
    public final List<V> f164626b = new ArrayList();

    /* JADX INFO: renamed from: e */
    private void m182835e() {
        for (int i = 0; i < this.f164626b.size(); i++) {
            m182845f(i);
        }
    }

    /* JADX INFO: renamed from: i */
    private void m182836i() {
        List<V> listMo134610d = mo134610d();
        if (jyb.m147479J(listMo134610d)) {
            return;
        }
        this.f164626b.clear();
        this.f164626b.addAll(listMo134610d);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.sam
    /* JADX INFO: renamed from: D */
    public void mo182837D(BLiveVoiceCall bLiveVoiceCall) {
        if (bLiveVoiceCall.position < this.f164626b.size()) {
            this.f164626b.get(bLiveVoiceCall.position).mo79135D(bLiveVoiceCall);
        }
    }

    @Override // p153l.sam
    /* JADX INFO: renamed from: N1 */
    public void mo182838N1(BLiveVoiceCall bLiveVoiceCall) {
        if (bLiveVoiceCall.position < this.f164626b.size()) {
            this.f164626b.get(bLiveVoiceCall.position).mo79140a(bLiveVoiceCall);
        }
    }

    @Override // p153l.sam
    /* JADX INFO: renamed from: Q3 */
    public void mo182839Q3(int i, boolean z) {
        if (i < this.f164626b.size()) {
            this.f164626b.get(i).mo79147h(i + 1, z, this.f164625a);
        }
    }

    @Override // p153l.sam
    /* JADX INFO: renamed from: W1 */
    public void mo182840W1(BLiveVoiceCall bLiveVoiceCall, List<VoiceMicEmoji.EmojiPlayResult> list, String str, String str2) {
        this.f164626b.get(bLiveVoiceCall.position).mo79143d(list, str, str2);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ixm0 ixm0Var) {
        this.f164625a = ixm0Var;
        this.f164628d.postFrameCallback(this);
    }

    @Override // p153l.sam
    /* JADX INFO: renamed from: b1 */
    public void mo182842b1(int i, String str) {
        if (i < this.f164626b.size()) {
            this.f164626b.get(i).mo79146g(str);
        }
    }

    /* JADX INFO: renamed from: c */
    public wao0 m182843c(String str) {
        HashMap<String, wao0> mapM142573k4;
        ixm0 ixm0Var = this.f164625a;
        if (ixm0Var == null || (mapM142573k4 = ixm0Var.m142573k4()) == null || !mapM142573k4.containsKey(str)) {
            return null;
        }
        wao0 wao0Var = mapM142573k4.get(str);
        if (wao0Var instanceof wao0) {
            return wao0Var;
        }
        return null;
    }

    @Override // p153l.sam
    /* JADX INFO: renamed from: c1 */
    public void mo182844c1(BLiveVoiceCall bLiveVoiceCall, List<VoiceMicEmoji.EmojiPlayResult> list, String str) {
        this.f164626b.get(bLiveVoiceCall.position).mo79141b(list, str);
    }

    /* JADX INFO: renamed from: d */
    public abstract List<V> mo134610d();

    @Override // p153l.iam
    public void destroy() {
        m182835e();
        setVisible(false);
        this.f164628d.removeFrameCallback(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        ixm0 ixm0Var = this.f164625a;
        if (ixm0Var != null) {
            final rwn0 rwn0Var = (rwn0) ixm0Var.m213810E2();
            jyb.m147537z(rwn0Var.m183411P2().m136877p(), new y20() { // from class: l.qs2
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f159240a.m182847j(rwn0Var, (BLiveVoiceCall) obj);
                }
            });
            this.f164628d.postFrameCallback(this);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m182845f(int i) {
        if (i < this.f164626b.size()) {
            this.f164626b.get(i).mo79145f(i + 1, this.f164625a);
        }
    }

    @Override // p153l.sam
    /* JADX INFO: renamed from: g */
    public View mo182846g(Context context) {
        if (this.f164627c == null) {
            this.f164627c = inflateView(LayoutInflater.from(context), null);
            m182836i();
        }
        return this.f164627c;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m182847j(rwn0 rwn0Var, BLiveVoiceCall bLiveVoiceCall) {
        BLiveUserMask bLiveUserMask;
        int i;
        l6o0 l6o0VarM153068c = l6o0.m153068c(rwn0Var.m183411P2().m136874m(bLiveVoiceCall.user));
        long jM174454o = pzi0.m174454o();
        if (bLiveVoiceCall.position >= this.f164626b.size() || l6o0VarM153068c == null || (bLiveUserMask = l6o0VarM153068c.f130275b) == null) {
            return;
        }
        BLiveAvatarFrameConfig bLiveAvatarFrameConfig = bLiveUserMask.avatarConfig.frameConfig;
        if (bLiveAvatarFrameConfig.changeVoiceNo == 0 || (i = bLiveAvatarFrameConfig.totalSec) == 0) {
            return;
        }
        long j = bLiveAvatarFrameConfig.endMill;
        if (j > jM174454o) {
            this.f164626b.get(bLiveVoiceCall.position).mo79148i((((j - 1000) - jM174454o) / (i * 1000)) * 100.0f);
        }
    }

    @Override // p153l.sam
    /* JADX INFO: renamed from: j2 */
    public void mo182848j2(BLiveVoiceCall bLiveVoiceCall) {
        this.f164626b.get(bLiveVoiceCall.position).mo79149j();
    }

    /* JADX INFO: renamed from: r */
    public void mo154019r() {
        for (int i = 0; i < this.f164626b.size(); i++) {
            m182845f(i);
            this.f164626b.get(i).mo79142c(i, this.f164625a);
        }
    }

    @Override // p153l.sam
    public void setData(hrk0 hrk0Var) {
        List<BLiveVoiceCall> listM136877p = hrk0Var.m136877p();
        if (jyb.m147479J(listM136877p)) {
            return;
        }
        m182835e();
        for (int i = 0; i < listM136877p.size(); i++) {
            mo182850t2(hrk0Var, listM136877p.get(i));
        }
    }

    @Override // p153l.sam
    public void setVisible(boolean z) {
        bnl0.m105525M0(this.f164627c, z);
    }

    @Override // p153l.sam
    /* JADX INFO: renamed from: t */
    public void mo182849t() {
        setVisible(true);
        mo154019r();
    }

    @Override // p153l.sam
    /* JADX INFO: renamed from: t2 */
    public void mo182850t2(hrk0 hrk0Var, BLiveVoiceCall bLiveVoiceCall) {
        nsv<h64> nsvVarM136874m = hrk0Var.m136874m(bLiveVoiceCall.user);
        BLiveMember bLiveMemberM97111G = hrk0Var.m136879r().m97111G(bLiveVoiceCall.user);
        int i = bLiveVoiceCall.position;
        if (i >= 0 && i < this.f164626b.size()) {
            if (nsvVarM136874m != null) {
                this.f164626b.get(bLiveVoiceCall.position).mo79144e(bLiveVoiceCall, bLiveMemberM97111G, nsvVarM136874m, this.f164625a, m182843c(bLiveVoiceCall.user));
            }
        } else {
            fhw.m125605a("[voice][call]", "illegal call,id=" + bLiveVoiceCall.f45333id + ",position:" + bLiveVoiceCall.position);
        }
    }
}
