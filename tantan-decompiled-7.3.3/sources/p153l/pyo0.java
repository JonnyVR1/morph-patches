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
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class pyo0 extends LiveMenuDialogHolder<rzo0> {

    /* JADX INFO: renamed from: k */
    public VText f154676k;

    /* JADX INFO: renamed from: l */
    public VText f154677l;

    /* JADX INFO: renamed from: m */
    public VoiceSweetCpHeadView f154678m;

    /* JADX INFO: renamed from: n */
    public VLinear f154679n;

    /* JADX INFO: renamed from: o */
    public VText f154680o;

    /* JADX INFO: renamed from: p */
    public VoiceSweet.VoiceCpBindMessage f154681p;

    public pyo0(Act act, rzo0 rzo0Var, rq2 rq2Var) {
        super(yec0.f199235ra, act, rzo0Var, rq2Var);
        m73015B(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m174315K(View view) {
        mo73021p();
        ((rzo0) this.f48605b).m183812a4(this.f154681p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m174316L(View view) {
        ((rzo0) this.f48605b).m183814c4(String.valueOf(this.f154681p.getUserId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m174317M(View view) {
        ((rzo0) this.f48605b).m183814c4(String.valueOf(this.f154681p.getOtherUserId()));
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: I */
    public final void m174318I(View view) {
        qyo0.m178715a(this, view);
    }

    /* JADX INFO: renamed from: N */
    public final void m174320N(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage) {
        if (!TextUtils.isEmpty(voiceCpBindMessage.getOtherUserName())) {
            String otherUserName = voiceCpBindMessage.getOtherUserName();
            if (otherUserName.length() > 12) {
                otherUserName = otherUserName.substring(0, 12).concat("...");
            }
            this.f154676k.setText(xau.m209911u(R$string.f47978ag, otherUserName));
        }
        if (TextUtils.isEmpty(voiceCpBindMessage.getHouseName())) {
            return;
        }
        this.f154678m.m79675b(null, voiceCpBindMessage.getHouseImage(), "LV." + voiceCpBindMessage.getHouseRank() + voiceCpBindMessage.getHouseName(), voiceCpBindMessage.getUserAvatar(), voiceCpBindMessage.getOtherUserAvatar());
    }

    /* JADX INFO: renamed from: O */
    public void m174321O(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage) {
        if (voiceCpBindMessage == null) {
            return;
        }
        this.f154681p = voiceCpBindMessage;
        m73017E();
        m174320N(voiceCpBindMessage);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        super.mo73019m(view);
        m174318I(view);
        bnl0.m105509E0(this.f154680o, new View.OnClickListener() { // from class: l.myo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f139422a.m174315K(view2);
            }
        });
        bnl0.m105509E0(this.f154678m.f54382e, new View.OnClickListener() { // from class: l.nyo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f144344a.m174316L(view2);
            }
        });
        bnl0.m105509E0(this.f154678m.f54384g, new View.OnClickListener() { // from class: l.oyo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f149815a.m174317M(view2);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(rzo0 rzo0Var) {
    }
}
