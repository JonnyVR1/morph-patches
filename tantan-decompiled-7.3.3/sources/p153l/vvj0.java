package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.data.BLiveUndercoverCurrentPlayer;
import com.p051p1.mobile.putong.live.base.data.BLiveUndercoverGame;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.List;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class vvj0 extends puj0<uvj0> {

    /* JADX INFO: renamed from: d */
    public VRelative f185939d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f185940e;

    /* JADX INFO: renamed from: f */
    public VText f185941f;

    public vvj0(VFrame vFrame) {
        super(vFrame);
    }

    @Override // p153l.puj0
    /* JADX INFO: renamed from: c */
    public void mo106720c() {
        m203018k(this.f154193b);
    }

    @Override // p153l.puj0
    /* JADX INFO: renamed from: d */
    public int mo106721d() {
        return yec0.f199166m6;
    }

    @Override // p153l.puj0
    /* JADX INFO: renamed from: e */
    public int mo106722e() {
        return mdc0.f135927E7;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.puj0
    /* JADX INFO: renamed from: j */
    public void mo106723j(BLiveUndercoverGame bLiveUndercoverGame, int i, List<BLiveUserMask> list) {
        BLiveUndercoverCurrentPlayer currentPlayer;
        if (bLiveUndercoverGame == null || !TextUtils.equals(bLiveUndercoverGame.status, "questionAnnouncing") || (currentPlayer = bLiveUndercoverGame.getCurrentPlayer(zrv.f205799a.m207631D0())) == null) {
            return;
        }
        ql3.m176984b(this.f185940e, currentPlayer.mask, false);
        this.f185941f.setText(String.format(getContext().getResources().getString(R$string.f47417Ac), currentPlayer.word));
    }

    /* JADX INFO: renamed from: k */
    public final void m203018k(View view) {
        wvj0.m208068a(this, view);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
