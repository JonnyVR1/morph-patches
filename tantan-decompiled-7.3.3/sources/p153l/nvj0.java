package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.data.BLiveUndercoverGame;
import com.p051p1.mobile.putong.live.base.data.BLiveUndercoverVoteResult;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.List;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class nvj0 extends puj0<mvj0> {

    /* JADX INFO: renamed from: d */
    public VRelative f143805d;

    /* JADX INFO: renamed from: e */
    public VLinear f143806e;

    /* JADX INFO: renamed from: f */
    public VText f143807f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f143808g;

    /* JADX INFO: renamed from: h */
    public VText f143809h;

    /* JADX INFO: renamed from: i */
    public VLinear f143810i;

    public nvj0(VFrame vFrame) {
        super(vFrame);
    }

    @Override // p153l.puj0
    /* JADX INFO: renamed from: c */
    public void mo106720c() {
        m164880k(this.f154193b);
    }

    @Override // p153l.puj0
    /* JADX INFO: renamed from: d */
    public int mo106721d() {
        return yec0.f199140k6;
    }

    @Override // p153l.puj0
    /* JADX INFO: renamed from: e */
    public int mo106722e() {
        return mdc0.f135909C7;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.puj0
    /* JADX INFO: renamed from: j */
    public void mo106723j(BLiveUndercoverGame bLiveUndercoverGame, int i, List<BLiveUserMask> list) {
        BLiveUndercoverVoteResult bLiveUndercoverVoteResult;
        if (bLiveUndercoverGame == null || !TextUtils.equals(bLiveUndercoverGame.status, "votingResult") || (bLiveUndercoverVoteResult = bLiveUndercoverGame.voteResult) == null) {
            return;
        }
        boolean z = bLiveUndercoverVoteResult.isDraw;
        VLinear vLinear = this.f143806e;
        if (z) {
            vLinear.setVisibility(8);
            this.f143810i.setVisibility(0);
            return;
        }
        vLinear.setVisibility(0);
        this.f143810i.setVisibility(8);
        ql3.m176984b(this.f143808g, bLiveUndercoverGame.voteResult.outUserMask, false);
        this.f143807f.setText(bLiveUndercoverGame.voteResult.resultStr);
        if (TextUtils.equals(bLiveUndercoverGame.voteResult.outUserRole, VirtualVoiceMotionType.undercover)) {
            this.f143809h.setText(R$string.f47527Fc);
        } else if (TextUtils.equals(bLiveUndercoverGame.voteResult.outUserRole, "normal")) {
            this.f143809h.setText(R$string.f48501yc);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m164880k(View view) {
        ovj0.m169453a(this, view);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
