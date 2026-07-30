package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.data.BLiveUndercoverCurrentPlayer;
import com.p046p1.mobile.putong.live.base.data.BLiveUndercoverGame;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.List;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class smj0 extends mlj0<rmj0> {

    /* JADX INFO: renamed from: d */
    public VRelative f165351d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f165352e;

    /* JADX INFO: renamed from: f */
    public VText f165353f;

    public smj0(VFrame vFrame) {
        super(vFrame);
    }

    @Override // p149l.mlj0
    /* JADX INFO: renamed from: c */
    public void mo112637c() {
        m184969k(this.f134449b);
    }

    @Override // p149l.mlj0
    /* JADX INFO: renamed from: d */
    public int mo112638d() {
        return t6c0.f168434m6;
    }

    @Override // p149l.mlj0
    /* JADX INFO: renamed from: e */
    public int mo112639e() {
        return g5c0.f100682E7;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.mlj0
    /* JADX INFO: renamed from: j */
    public void mo112640j(BLiveUndercoverGame bLiveUndercoverGame, int i, List<BLiveUserMask> list) {
        BLiveUndercoverCurrentPlayer currentPlayer;
        if (bLiveUndercoverGame == null || !TextUtils.equals(bLiveUndercoverGame.status, "questionAnnouncing") || (currentPlayer = bLiveUndercoverGame.getCurrentPlayer(ypv.f199493a.m199309D0())) == null) {
            return;
        }
        wk3.m203643b(this.f165352e, currentPlayer.mask, false);
        this.f165353f.setText(String.format(getContext().getResources().getString(R$string.f46569Ac), currentPlayer.word));
    }

    /* JADX INFO: renamed from: k */
    public final void m184969k(View view) {
        tmj0.m189696a(this, view);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
