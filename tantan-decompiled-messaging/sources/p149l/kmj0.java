package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.data.BLiveUndercoverGame;
import com.p046p1.mobile.putong.live.base.data.BLiveUndercoverVoteResult;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.List;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class kmj0 extends mlj0<jmj0> {

    /* JADX INFO: renamed from: d */
    public VRelative f123802d;

    /* JADX INFO: renamed from: e */
    public VLinear f123803e;

    /* JADX INFO: renamed from: f */
    public VText f123804f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f123805g;

    /* JADX INFO: renamed from: h */
    public VText f123806h;

    /* JADX INFO: renamed from: i */
    public VLinear f123807i;

    public kmj0(VFrame vFrame) {
        super(vFrame);
    }

    @Override // p149l.mlj0
    /* JADX INFO: renamed from: c */
    public void mo112637c() {
        m146535k(this.f134449b);
    }

    @Override // p149l.mlj0
    /* JADX INFO: renamed from: d */
    public int mo112638d() {
        return t6c0.f168408k6;
    }

    @Override // p149l.mlj0
    /* JADX INFO: renamed from: e */
    public int mo112639e() {
        return g5c0.f100664C7;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.mlj0
    /* JADX INFO: renamed from: j */
    public void mo112640j(BLiveUndercoverGame bLiveUndercoverGame, int i, List<BLiveUserMask> list) {
        BLiveUndercoverVoteResult bLiveUndercoverVoteResult;
        if (bLiveUndercoverGame == null || !TextUtils.equals(bLiveUndercoverGame.status, "votingResult") || (bLiveUndercoverVoteResult = bLiveUndercoverGame.voteResult) == null) {
            return;
        }
        boolean z = bLiveUndercoverVoteResult.isDraw;
        VLinear vLinear = this.f123803e;
        if (z) {
            vLinear.setVisibility(8);
            this.f123807i.setVisibility(0);
            return;
        }
        vLinear.setVisibility(0);
        this.f123807i.setVisibility(8);
        wk3.m203643b(this.f123805g, bLiveUndercoverGame.voteResult.outUserMask, false);
        this.f123804f.setText(bLiveUndercoverGame.voteResult.resultStr);
        if (TextUtils.equals(bLiveUndercoverGame.voteResult.outUserRole, VirtualVoiceMotionType.undercover)) {
            this.f123806h.setText(R$string.f46679Fc);
        } else if (TextUtils.equals(bLiveUndercoverGame.voteResult.outUserRole, "normal")) {
            this.f123806h.setText(R$string.f47653yc);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m146535k(View view) {
        lmj0.m150592a(this, view);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
