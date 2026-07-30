package p009l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetCpHeadView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.longlink.msg.liveroom.VoiceSweet;
import com.p1.mobile.putong.live.livingroom.R;
import com.p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import java.util.concurrent.TimeUnit;
import l.aq2;
import l.bto0;
import l.c4g0;
import l.e30;
import l.ffw;
import l.hxs;
import l.jo0;
import l.mkd0;
import l.t6c0;
import l.u6n;
import l.w8u;
import l.xdl0;
import rx.c;
import rx.schedulers.Schedulers;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ato0 extends LiveMenuDialogHolder<nqo0> {

    /* JADX INFO: renamed from: k */
    public View f9678k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f9679l;

    /* JADX INFO: renamed from: m */
    public VText f9680m;

    /* JADX INFO: renamed from: n */
    public VText f9681n;

    /* JADX INFO: renamed from: o */
    public VText f9682o;

    /* JADX INFO: renamed from: p */
    public VoiceSweetCpHeadView f9683p;

    /* JADX INFO: renamed from: q */
    public View f9684q;

    /* JADX INFO: renamed from: r */
    public VText f9685r;

    /* JADX INFO: renamed from: s */
    public VText f9686s;

    /* JADX INFO: renamed from: t */
    public VText f9687t;

    /* JADX INFO: renamed from: u */
    public VoiceSweet.VoiceCpBindMessage f9688u;

    /* JADX INFO: renamed from: v */
    public c4g0 f9689v;

    public ato0(Act act, nqo0 nqo0Var, aq2 aq2Var) {
        super(t6c0.za, act, nqo0Var, aq2Var);
        B(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m11628O(View view) {
        ((nqo0) ((LiveMenuDialogHolder) this).b).m19038Z3(this.f9688u, false);
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m11629P(View view) {
        ((nqo0) ((LiveMenuDialogHolder) this).b).m19038Z3(this.f9688u, true);
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m11630Q(View view) {
        ((nqo0) ((LiveMenuDialogHolder) this).b).m19041c4(String.valueOf(this.f9688u.getOtherUserId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m11631R(View view) {
        ((nqo0) ((LiveMenuDialogHolder) this).b).m19041c4(String.valueOf(this.f9688u.getUserId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m11632S(View view) {
        ((nqo0) ((LiveMenuDialogHolder) this).b).m19041c4(String.valueOf(this.f9688u.getOtherUserId()));
    }

    /* JADX INFO: renamed from: W */
    private void m11633W() {
        m11638N();
        this.f9689v = c.interval(1L, TimeUnit.SECONDS, Schedulers.io()).onBackpressureLatest().observeOn(jo0.a()).subscribe(ffw.d(new e30() { // from class: l.uso0
            public final void call(Object obj) {
                this.f21326a.m11639T((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X */
    private void m11634X(int i) {
        this.f9687t.setText(w8u.u(R.string.bg, String.valueOf(i)));
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m11635C0() {
        return ((nqo0) ((LiveMenuDialogHolder) this).b).act();
    }

    /* JADX INFO: renamed from: L */
    public final void m11636L(View view) {
        bto0.a(this, view);
    }

    /* JADX INFO: renamed from: N */
    public final void m11638N() {
        mkd0.z(this.f9689v);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m11639T(Long l2) {
        if (l2.longValue() < 30) {
            m11634X((int) (30 - l2.longValue()));
            return;
        }
        m11638N();
        ((nqo0) ((LiveMenuDialogHolder) this).b).m19038Z3(this.f9688u, false);
        p();
    }

    /* JADX INFO: renamed from: U */
    public final void m11640U(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage, String str) {
        if (!TextUtils.isEmpty(voiceCpBindMessage.getOtherUserAvatar())) {
            hxs.s("context_single_room", this.f9679l, voiceCpBindMessage.getOtherUserAvatar());
        }
        if (!TextUtils.isEmpty(voiceCpBindMessage.getOtherUserName())) {
            this.f9680m.setText(w8u.u(R.string.rg, voiceCpBindMessage.getOtherUserName()));
        }
        this.f9682o.setText(w8u.u(u6n.a() ? R.string.fg : R.string.eg, str));
        if (!TextUtils.isEmpty(voiceCpBindMessage.getHouseName())) {
            this.f9683p.m8701b(null, voiceCpBindMessage.getHouseImage(), "LV." + voiceCpBindMessage.getHouseRank() + voiceCpBindMessage.getHouseName(), voiceCpBindMessage.getUserAvatar(), voiceCpBindMessage.getOtherUserAvatar());
        }
        m11634X(30);
    }

    /* JADX INFO: renamed from: V */
    public void m11641V(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage) {
        String strUb = ypv.m25490k().ub();
        if (voiceCpBindMessage == null || TextUtils.isEmpty(strUb)) {
            return;
        }
        this.f9688u = voiceCpBindMessage;
        E();
        m11640U(voiceCpBindMessage, strUb);
        m11633W();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public void m11643m(View view) {
        super.m(view);
        m11636L(view);
        xdl0.E0(this.f9685r, new View.OnClickListener() { // from class: l.vso0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f21770a.m11628O(view2);
            }
        });
        xdl0.E0(this.f9686s, new View.OnClickListener() { // from class: l.wso0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f22303a.m11629P(view2);
            }
        });
        xdl0.E0(this.f9679l, new View.OnClickListener() { // from class: l.xso0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f22711a.m11630Q(view2);
            }
        });
        xdl0.E0(this.f9683p.f7140e, new View.OnClickListener() { // from class: l.yso0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f23223a.m11631R(view2);
            }
        });
        xdl0.E0(this.f9683p.f7142g, new View.OnClickListener() { // from class: l.zso0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f23871a.m11632S(view2);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public void m11645w() {
        super.w();
        m11638N();
    }

    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m11644n(nqo0 nqo0Var) {
    }
}
