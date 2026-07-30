package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.longlink.msg.liveroom.VoiceSweet;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetCpHeadView;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class ato0 extends LiveMenuDialogHolder<nqo0> {

    /* JADX INFO: renamed from: k */
    public View f71637k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f71638l;

    /* JADX INFO: renamed from: m */
    public VText f71639m;

    /* JADX INFO: renamed from: n */
    public VText f71640n;

    /* JADX INFO: renamed from: o */
    public VText f71641o;

    /* JADX INFO: renamed from: p */
    public VoiceSweetCpHeadView f71642p;

    /* JADX INFO: renamed from: q */
    public View f71643q;

    /* JADX INFO: renamed from: r */
    public VText f71644r;

    /* JADX INFO: renamed from: s */
    public VText f71645s;

    /* JADX INFO: renamed from: t */
    public VText f71646t;

    /* JADX INFO: renamed from: u */
    public VoiceSweet.VoiceCpBindMessage f71647u;

    /* JADX INFO: renamed from: v */
    public c4g0 f71648v;

    public ato0(Act act, nqo0 nqo0Var, aq2 aq2Var) {
        super(t6c0.f168607za, act, nqo0Var, aq2Var);
        m71832B(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m98843O(View view) {
        ((nqo0) this.f47757b).m160658Z3(this.f71647u, false);
        mo71838p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m98844P(View view) {
        ((nqo0) this.f47757b).m160658Z3(this.f71647u, true);
        mo71838p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m98845Q(View view) {
        ((nqo0) this.f47757b).m160661c4(String.valueOf(this.f71647u.getOtherUserId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m98846R(View view) {
        ((nqo0) this.f47757b).m160661c4(String.valueOf(this.f71647u.getUserId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m98847S(View view) {
        ((nqo0) this.f47757b).m160661c4(String.valueOf(this.f71647u.getOtherUserId()));
    }

    /* JADX INFO: renamed from: W */
    private void m98848W() {
        m98852N();
        this.f71648v = C22306c.interval(1L, TimeUnit.SECONDS, Schedulers.m221493io()).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.uso0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177995a.m98853T((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X */
    private void m98849X(int i) {
        this.f71646t.setText(w8u.m202218u(R$string.f47152bg, String.valueOf(i)));
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return ((nqo0) this.f47757b).act();
    }

    /* JADX INFO: renamed from: L */
    public final void m98850L(View view) {
        bto0.m103883a(this, view);
    }

    /* JADX INFO: renamed from: N */
    public final void m98852N() {
        mkd0.m154992z(this.f71648v);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m98853T(Long l2) {
        if (l2.longValue() < 30) {
            m98849X((int) (30 - l2.longValue()));
            return;
        }
        m98852N();
        ((nqo0) this.f47757b).m160658Z3(this.f71647u, false);
        mo71838p();
    }

    /* JADX INFO: renamed from: U */
    public final void m98854U(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage, String str) {
        if (!TextUtils.isEmpty(voiceCpBindMessage.getOtherUserAvatar())) {
            hxs.m133406s("context_single_room", this.f71638l, voiceCpBindMessage.getOtherUserAvatar());
        }
        if (!TextUtils.isEmpty(voiceCpBindMessage.getOtherUserName())) {
            this.f71639m.setText(w8u.m202218u(R$string.f47503rg, voiceCpBindMessage.getOtherUserName()));
        }
        this.f71641o.setText(w8u.m202218u(u6n.m192015a() ? R$string.f47240fg : R$string.f47218eg, str));
        if (!TextUtils.isEmpty(voiceCpBindMessage.getHouseName())) {
            this.f71642p.m78492b(null, voiceCpBindMessage.getHouseImage(), "LV." + voiceCpBindMessage.getHouseRank() + voiceCpBindMessage.getHouseName(), voiceCpBindMessage.getUserAvatar(), voiceCpBindMessage.getOtherUserAvatar());
        }
        m98849X(30);
    }

    /* JADX INFO: renamed from: V */
    public void m98855V(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage) {
        String strM195963ub = ypv.m215672k().m195963ub();
        if (voiceCpBindMessage == null || TextUtils.isEmpty(strM195963ub)) {
            return;
        }
        this.f71647u = voiceCpBindMessage;
        m71834E();
        m98854U(voiceCpBindMessage, strM195963ub);
        m98848W();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        super.mo71836m(view);
        m98850L(view);
        xdl0.m208329E0(this.f71644r, new View.OnClickListener() { // from class: l.vso0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f182861a.m98843O(view2);
            }
        });
        xdl0.m208329E0(this.f71645s, new View.OnClickListener() { // from class: l.wso0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f187956a.m98844P(view2);
            }
        });
        xdl0.m208329E0(this.f71638l, new View.OnClickListener() { // from class: l.xso0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f194295a.m98845Q(view2);
            }
        });
        xdl0.m208329E0(this.f71642p.f53534e, new View.OnClickListener() { // from class: l.yso0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f199799a.m98846R(view2);
            }
        });
        xdl0.m208329E0(this.f71642p.f53536g, new View.OnClickListener() { // from class: l.zso0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f204620a.m98847S(view2);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo71841w() {
        super.mo71841w();
        m98852N();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(nqo0 nqo0Var) {
    }
}
