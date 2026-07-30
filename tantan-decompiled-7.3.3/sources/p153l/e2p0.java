package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.longlink.msg.liveroom.VoiceSweet;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetCpHeadView;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class e2p0 extends LiveMenuDialogHolder<rzo0> {

    /* JADX INFO: renamed from: k */
    public View f91810k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f91811l;

    /* JADX INFO: renamed from: m */
    public VText f91812m;

    /* JADX INFO: renamed from: n */
    public VText f91813n;

    /* JADX INFO: renamed from: o */
    public VText f91814o;

    /* JADX INFO: renamed from: p */
    public VoiceSweetCpHeadView f91815p;

    /* JADX INFO: renamed from: q */
    public View f91816q;

    /* JADX INFO: renamed from: r */
    public VText f91817r;

    /* JADX INFO: renamed from: s */
    public VText f91818s;

    /* JADX INFO: renamed from: t */
    public VText f91819t;

    /* JADX INFO: renamed from: u */
    public VoiceSweet.VoiceCpBindMessage f91820u;

    /* JADX INFO: renamed from: v */
    public kcg0 f91821v;

    public e2p0(Act act, rzo0 rzo0Var, rq2 rq2Var) {
        super(yec0.f199339za, act, rzo0Var, rq2Var);
        m73015B(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m119139O(View view) {
        ((rzo0) this.f48605b).m183811Z3(this.f91820u, false);
        mo73021p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m119140P(View view) {
        ((rzo0) this.f48605b).m183811Z3(this.f91820u, true);
        mo73021p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m119141Q(View view) {
        ((rzo0) this.f48605b).m183814c4(String.valueOf(this.f91820u.getOtherUserId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m119142R(View view) {
        ((rzo0) this.f48605b).m183814c4(String.valueOf(this.f91820u.getUserId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m119143S(View view) {
        ((rzo0) this.f48605b).m183814c4(String.valueOf(this.f91820u.getOtherUserId()));
    }

    /* JADX INFO: renamed from: W */
    private void m119144W() {
        m119148N();
        this.f91821v = C22421c.interval(1L, TimeUnit.SECONDS, Schedulers.m222739io()).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.y1p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197122a.m119149T((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X */
    private void m119145X(int i) {
        this.f91819t.setText(xau.m209911u(R$string.f48000bg, String.valueOf(i)));
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return ((rzo0) this.f48605b).act();
    }

    /* JADX INFO: renamed from: L */
    public final void m119146L(View view) {
        f2p0.m123647a(this, view);
    }

    /* JADX INFO: renamed from: N */
    public final void m119148N() {
        psd0.m173633z(this.f91821v);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m119149T(Long l2) {
        if (l2.longValue() < 30) {
            m119145X((int) (30 - l2.longValue()));
            return;
        }
        m119148N();
        ((rzo0) this.f48605b).m183811Z3(this.f91820u, false);
        mo73021p();
    }

    /* JADX INFO: renamed from: U */
    public final void m119150U(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage, String str) {
        if (!TextUtils.isEmpty(voiceCpBindMessage.getOtherUserAvatar())) {
            izs.m142868s("context_single_room", this.f91811l, voiceCpBindMessage.getOtherUserAvatar());
        }
        if (!TextUtils.isEmpty(voiceCpBindMessage.getOtherUserName())) {
            this.f91812m.setText(xau.m209911u(R$string.f48351rg, voiceCpBindMessage.getOtherUserName()));
        }
        this.f91814o.setText(xau.m209911u(u8n.m195065a() ? R$string.f48088fg : R$string.f48066eg, str));
        if (!TextUtils.isEmpty(voiceCpBindMessage.getHouseName())) {
            this.f91815p.m79675b(null, voiceCpBindMessage.getHouseImage(), "LV." + voiceCpBindMessage.getHouseRank() + voiceCpBindMessage.getHouseName(), voiceCpBindMessage.getUserAvatar(), voiceCpBindMessage.getOtherUserAvatar());
        }
        m119145X(30);
    }

    /* JADX INFO: renamed from: V */
    public void m119151V(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage) {
        String strM203750ub = zrv.m221193k().m203750ub();
        if (voiceCpBindMessage == null || TextUtils.isEmpty(strM203750ub)) {
            return;
        }
        this.f91820u = voiceCpBindMessage;
        m73017E();
        m119150U(voiceCpBindMessage, strM203750ub);
        m119144W();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        super.mo73019m(view);
        m119146L(view);
        bnl0.m105509E0(this.f91817r, new View.OnClickListener() { // from class: l.z1p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f202588a.m119139O(view2);
            }
        });
        bnl0.m105509E0(this.f91818s, new View.OnClickListener() { // from class: l.a2p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f68015a.m119140P(view2);
            }
        });
        bnl0.m105509E0(this.f91811l, new View.OnClickListener() { // from class: l.b2p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f74645a.m119141Q(view2);
            }
        });
        bnl0.m105509E0(this.f91815p.f54382e, new View.OnClickListener() { // from class: l.c2p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f79508a.m119142R(view2);
            }
        });
        bnl0.m105509E0(this.f91815p.f54384g, new View.OnClickListener() { // from class: l.d2p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f84809a.m119143S(view2);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo73024w() {
        super.mo73024w();
        m119148N();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(rzo0 rzo0Var) {
    }
}
