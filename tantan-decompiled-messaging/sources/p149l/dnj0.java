package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.data.BLiveUndercoverCurrentPlayer;
import com.p046p1.mobile.putong.live.base.data.BLiveUndercoverGame;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.base.view.CircularProgressView;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.Iterator;
import java.util.List;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class dnj0 extends ari0<cnj0> {

    /* JADX INFO: renamed from: i */
    public VRelative f87068i;

    /* JADX INFO: renamed from: j */
    public VText f87069j;

    /* JADX INFO: renamed from: k */
    public VFrame f87070k;

    /* JADX INFO: renamed from: l */
    public CircularProgressView f87071l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f87072m;

    /* JADX INFO: renamed from: n */
    public VText f87073n;

    /* JADX INFO: renamed from: o */
    public VText f87074o;

    /* JADX INFO: renamed from: p */
    public VText f87075p;

    /* JADX INFO: renamed from: q */
    public VText f87076q;

    /* JADX INFO: renamed from: r */
    public String f87077r;

    /* JADX INFO: renamed from: l.dnj0$a */
    public class ViewOnClickListenerC16415a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveUndercoverGame f87078a;

        public ViewOnClickListenerC16415a(BLiveUndercoverGame bLiveUndercoverGame) {
            this.f87078a = bLiveUndercoverGame;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            T t = dnj0.this.f134450c;
            if (t != 0) {
                ((cnj0) t).m107804P3(this.f87078a.f44464id);
            }
        }
    }

    /* JADX INFO: renamed from: l.dnj0$b */
    public class ViewOnClickListenerC16416b implements View.OnClickListener {
        public ViewOnClickListenerC16416b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            T t = dnj0.this.f134450c;
            if (t != 0) {
                y8n0.m213410a(((nnn0) ((cnj0) t).m206027E2()).m149814k());
                u4n0.m191755n(dnj0.this.f134450c);
            }
        }
    }

    public dnj0(VFrame vFrame) {
        super(vFrame);
    }

    @Override // p149l.mlj0
    /* JADX INFO: renamed from: c */
    public void mo112637c() {
        m112641y(this.f134449b);
    }

    @Override // p149l.mlj0
    /* JADX INFO: renamed from: d */
    public int mo112638d() {
        return t6c0.f168460o6;
    }

    @Override // p149l.s7m
    public void destroy() {
        this.f87077r = "";
        m98403p();
    }

    @Override // p149l.mlj0
    /* JADX INFO: renamed from: e */
    public int mo112639e() {
        return g5c0.f100700G7;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.mlj0
    /* JADX INFO: renamed from: j */
    public void mo112640j(BLiveUndercoverGame bLiveUndercoverGame, int i, List<BLiveUserMask> list) {
        BLiveUndercoverCurrentPlayer currentSpeaker;
        BLiveUserMask next;
        if (bLiveUndercoverGame == null || !TextUtils.equals(bLiveUndercoverGame.status, "speakingInTurn") || (currentSpeaker = bLiveUndercoverGame.getCurrentSpeaker()) == null) {
            return;
        }
        wk3.m203643b(this.f87072m, currentSpeaker.mask, false);
        BLiveUndercoverCurrentPlayer currentPlayer = bLiveUndercoverGame.getCurrentPlayer(ypv.f199493a.m199309D0());
        Iterator<BLiveUserMask> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!TextUtils.equals(next.userId, ypv.f199493a.m199309D0()));
        if (TextUtils.equals(currentSpeaker.userId, ypv.f199493a.m199309D0())) {
            this.f87073n.setText(R$string.f46745Ic);
            this.f87074o.setVisibility(0);
            this.f87074o.setText(String.format(getContext().getResources().getString(R$string.f46569Ac), currentPlayer.word));
            this.f87075p.setText(R$string.f46723Hc);
            this.f87075p.setVisibility(0);
            this.f87076q.setVisibility(8);
            xdl0.m208360X(this.f87070k, t100.m186890d(56.0f));
            this.f87075p.setEnabled(true);
            this.f87075p.setOnClickListener(new ViewOnClickListenerC16415a(bLiveUndercoverGame));
        } else if (currentPlayer != null) {
            this.f87073n.setText(String.format(getContext().getResources().getString(R$string.f46657Ec), Integer.valueOf(currentSpeaker.number)));
            this.f87074o.setVisibility(8);
            this.f87075p.setVisibility(8);
            this.f87076q.setVisibility(0);
            xdl0.m208360X(this.f87070k, t100.m186890d(80.0f));
            this.f87076q.setText(String.format(getContext().getResources().getString(R$string.f46569Ac), currentPlayer.word));
        } else {
            VText vText = this.f87073n;
            if (next != null) {
                vText.setText(String.format(getContext().getResources().getString(R$string.f46657Ec), Integer.valueOf(currentSpeaker.number)));
                this.f87074o.setVisibility(8);
                this.f87075p.setVisibility(8);
                this.f87076q.setVisibility(8);
                xdl0.m208360X(this.f87070k, t100.m186890d(80.0f));
            } else {
                vText.setText(String.format(getContext().getResources().getString(R$string.f46657Ec), Integer.valueOf(currentSpeaker.number)));
                this.f87074o.setVisibility(8);
                this.f87075p.setVisibility(0);
                this.f87075p.setText(R$string.f46789Kc);
                this.f87076q.setVisibility(8);
                xdl0.m208360X(this.f87070k, t100.m186890d(56.0f));
                this.f87075p.setEnabled(true);
                this.f87075p.setOnClickListener(new ViewOnClickListenerC16416b());
            }
        }
        if (TextUtils.equals(this.f87077r, currentSpeaker.userId)) {
            return;
        }
        this.f87077r = currentSpeaker.userId;
        m98403p();
        m98408w(bLiveUndercoverGame.remainSeconds, bLiveUndercoverGame.countDownSeconds);
    }

    @Override // p149l.ari0
    /* JADX INFO: renamed from: v */
    public void mo98407v() {
        T t = this.f134450c;
        if (t != 0) {
            ((cnj0) t).m150494J3().m127020u4();
        }
    }

    @Override // p149l.ari0
    /* JADX INFO: renamed from: x */
    public void mo98409x() {
        super.mo98409x();
        this.f87069j.setText(m98406u());
        this.f87071l.setProgress(m98404q());
    }

    /* JADX INFO: renamed from: y */
    public final void m112641y(View view) {
        enj0.m117279a(this, view);
    }
}
