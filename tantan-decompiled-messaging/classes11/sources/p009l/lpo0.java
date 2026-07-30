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
import l.aq2;
import l.mpo0;
import l.t6c0;
import l.w8u;
import l.xdl0;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class lpo0 extends LiveMenuDialogHolder<nqo0> {

    /* JADX INFO: renamed from: k */
    public VText f16293k;

    /* JADX INFO: renamed from: l */
    public VText f16294l;

    /* JADX INFO: renamed from: m */
    public VoiceSweetCpHeadView f16295m;

    /* JADX INFO: renamed from: n */
    public VLinear f16296n;

    /* JADX INFO: renamed from: o */
    public VText f16297o;

    /* JADX INFO: renamed from: p */
    public VoiceSweet.VoiceCpBindMessage f16298p;

    public lpo0(Act act, nqo0 nqo0Var, aq2 aq2Var) {
        super(t6c0.ra, act, nqo0Var, aq2Var);
        B(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m17975K(View view) {
        p();
        ((nqo0) ((LiveMenuDialogHolder) this).b).m19039a4(this.f16298p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m17976L(View view) {
        ((nqo0) ((LiveMenuDialogHolder) this).b).m19041c4(String.valueOf(this.f16298p.getUserId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m17977M(View view) {
        ((nqo0) ((LiveMenuDialogHolder) this).b).m19041c4(String.valueOf(this.f16298p.getOtherUserId()));
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m17978C0() {
        return null;
    }

    /* JADX INFO: renamed from: I */
    public final void m17979I(View view) {
        mpo0.a(this, view);
    }

    /* JADX INFO: renamed from: N */
    public final void m17981N(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage) {
        if (!TextUtils.isEmpty(voiceCpBindMessage.getOtherUserName())) {
            String otherUserName = voiceCpBindMessage.getOtherUserName();
            if (otherUserName.length() > 12) {
                otherUserName = otherUserName.substring(0, 12).concat("...");
            }
            this.f16293k.setText(w8u.u(R.string.ag, otherUserName));
        }
        if (TextUtils.isEmpty(voiceCpBindMessage.getHouseName())) {
            return;
        }
        this.f16295m.m8701b(null, voiceCpBindMessage.getHouseImage(), "LV." + voiceCpBindMessage.getHouseRank() + voiceCpBindMessage.getHouseName(), voiceCpBindMessage.getUserAvatar(), voiceCpBindMessage.getOtherUserAvatar());
    }

    /* JADX INFO: renamed from: O */
    public void m17982O(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage) {
        if (voiceCpBindMessage == null) {
            return;
        }
        this.f16298p = voiceCpBindMessage;
        E();
        m17981N(voiceCpBindMessage);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public void m17984m(View view) {
        super.m(view);
        m17979I(view);
        xdl0.E0(this.f16297o, new View.OnClickListener() { // from class: l.ipo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f14766a.m17975K(view2);
            }
        });
        xdl0.E0(this.f16295m.f7140e, new View.OnClickListener() { // from class: l.jpo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f15256a.m17976L(view2);
            }
        });
        xdl0.E0(this.f16295m.f7142g, new View.OnClickListener() { // from class: l.kpo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f15800a.m17977M(view2);
            }
        });
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m17985n(nqo0 nqo0Var) {
    }
}
