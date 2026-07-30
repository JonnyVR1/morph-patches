package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.data.BLiveUndercoverCurrentPlayer;
import com.p051p1.mobile.putong.live.base.data.BLiveUndercoverGame;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.view.CircularProgressView;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.Iterator;
import java.util.List;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class gwj0 extends d0j0<fwj0> {

    /* JADX INFO: renamed from: i */
    public VRelative f106839i;

    /* JADX INFO: renamed from: j */
    public VText f106840j;

    /* JADX INFO: renamed from: k */
    public VFrame f106841k;

    /* JADX INFO: renamed from: l */
    public CircularProgressView f106842l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f106843m;

    /* JADX INFO: renamed from: n */
    public VText f106844n;

    /* JADX INFO: renamed from: o */
    public VText f106845o;

    /* JADX INFO: renamed from: p */
    public VText f106846p;

    /* JADX INFO: renamed from: q */
    public VText f106847q;

    /* JADX INFO: renamed from: r */
    public String f106848r;

    /* JADX INFO: renamed from: l.gwj0$a */
    public class ViewOnClickListenerC17330a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveUndercoverGame f106849a;

        public ViewOnClickListenerC17330a(BLiveUndercoverGame bLiveUndercoverGame) {
            this.f106849a = bLiveUndercoverGame;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            T t = gwj0.this.f154194c;
            if (t != 0) {
                ((fwj0) t).m127770P3(this.f106849a.f45312id);
            }
        }
    }

    /* JADX INFO: renamed from: l.gwj0$b */
    public class ViewOnClickListenerC17331b implements View.OnClickListener {
        public ViewOnClickListenerC17331b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            T t = gwj0.this.f154194c;
            if (t != 0) {
                cin0.m109906a(((rwn0) ((fwj0) t).m213810E2()).m202191k());
                ydn0.m215261n(gwj0.this.f154194c);
            }
        }
    }

    public gwj0(VFrame vFrame) {
        super(vFrame);
    }

    @Override // p153l.puj0
    /* JADX INFO: renamed from: c */
    public void mo106720c() {
        m132686y(this.f154193b);
    }

    @Override // p153l.puj0
    /* JADX INFO: renamed from: d */
    public int mo106721d() {
        return yec0.f199192o6;
    }

    @Override // p153l.iam
    public void destroy() {
        this.f106848r = "";
        m113404p();
    }

    @Override // p153l.puj0
    /* JADX INFO: renamed from: e */
    public int mo106722e() {
        return mdc0.f135945G7;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.puj0
    /* JADX INFO: renamed from: j */
    public void mo106723j(BLiveUndercoverGame bLiveUndercoverGame, int i, List<BLiveUserMask> list) {
        BLiveUndercoverCurrentPlayer currentSpeaker;
        BLiveUserMask next;
        if (bLiveUndercoverGame == null || !TextUtils.equals(bLiveUndercoverGame.status, "speakingInTurn") || (currentSpeaker = bLiveUndercoverGame.getCurrentSpeaker()) == null) {
            return;
        }
        ql3.m176984b(this.f106843m, currentSpeaker.mask, false);
        BLiveUndercoverCurrentPlayer currentPlayer = bLiveUndercoverGame.getCurrentPlayer(zrv.f205799a.m207631D0());
        Iterator<BLiveUserMask> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!TextUtils.equals(next.userId, zrv.f205799a.m207631D0()));
        if (TextUtils.equals(currentSpeaker.userId, zrv.f205799a.m207631D0())) {
            this.f106844n.setText(R$string.f47593Ic);
            this.f106845o.setVisibility(0);
            this.f106845o.setText(String.format(getContext().getResources().getString(R$string.f47417Ac), currentPlayer.word));
            this.f106846p.setText(R$string.f47571Hc);
            this.f106846p.setVisibility(0);
            this.f106847q.setVisibility(8);
            bnl0.m105540X(this.f106841k, qa00.m175859d(56.0f));
            this.f106846p.setEnabled(true);
            this.f106846p.setOnClickListener(new ViewOnClickListenerC17330a(bLiveUndercoverGame));
        } else if (currentPlayer != null) {
            this.f106844n.setText(String.format(getContext().getResources().getString(R$string.f47505Ec), Integer.valueOf(currentSpeaker.number)));
            this.f106845o.setVisibility(8);
            this.f106846p.setVisibility(8);
            this.f106847q.setVisibility(0);
            bnl0.m105540X(this.f106841k, qa00.m175859d(80.0f));
            this.f106847q.setText(String.format(getContext().getResources().getString(R$string.f47417Ac), currentPlayer.word));
        } else {
            VText vText = this.f106844n;
            if (next != null) {
                vText.setText(String.format(getContext().getResources().getString(R$string.f47505Ec), Integer.valueOf(currentSpeaker.number)));
                this.f106845o.setVisibility(8);
                this.f106846p.setVisibility(8);
                this.f106847q.setVisibility(8);
                bnl0.m105540X(this.f106841k, qa00.m175859d(80.0f));
            } else {
                vText.setText(String.format(getContext().getResources().getString(R$string.f47505Ec), Integer.valueOf(currentSpeaker.number)));
                this.f106845o.setVisibility(8);
                this.f106846p.setVisibility(0);
                this.f106846p.setText(R$string.f47637Kc);
                this.f106847q.setVisibility(8);
                bnl0.m105540X(this.f106841k, qa00.m175859d(56.0f));
                this.f106846p.setEnabled(true);
                this.f106846p.setOnClickListener(new ViewOnClickListenerC17331b());
            }
        }
        if (TextUtils.equals(this.f106848r, currentSpeaker.userId)) {
            return;
        }
        this.f106848r = currentSpeaker.userId;
        m113404p();
        m113409w(bLiveUndercoverGame.remainSeconds, bLiveUndercoverGame.countDownSeconds);
    }

    @Override // p153l.d0j0
    /* JADX INFO: renamed from: v */
    public void mo113408v() {
        T t = this.f154194c;
        if (t != 0) {
            ((fwj0) t).m169312J3().m147074u4();
        }
    }

    @Override // p153l.d0j0
    /* JADX INFO: renamed from: x */
    public void mo106724x() {
        super.mo106724x();
        this.f106840j.setText(m113407u());
        this.f106842l.setProgress(m113405q());
    }

    /* JADX INFO: renamed from: y */
    public final void m132686y(View view) {
        hwj0.m137475a(this, view);
    }
}
