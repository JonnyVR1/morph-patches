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
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class lpo0 extends LiveMenuDialogHolder<nqo0> {

    /* JADX INFO: renamed from: k */
    public VText f129236k;

    /* JADX INFO: renamed from: l */
    public VText f129237l;

    /* JADX INFO: renamed from: m */
    public VoiceSweetCpHeadView f129238m;

    /* JADX INFO: renamed from: n */
    public VLinear f129239n;

    /* JADX INFO: renamed from: o */
    public VText f129240o;

    /* JADX INFO: renamed from: p */
    public VoiceSweet.VoiceCpBindMessage f129241p;

    public lpo0(Act act, nqo0 nqo0Var, aq2 aq2Var) {
        super(t6c0.f168503ra, act, nqo0Var, aq2Var);
        m71832B(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m150891K(View view) {
        mo71838p();
        ((nqo0) this.f47757b).m160659a4(this.f129241p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m150892L(View view) {
        ((nqo0) this.f47757b).m160661c4(String.valueOf(this.f129241p.getUserId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m150893M(View view) {
        ((nqo0) this.f47757b).m160661c4(String.valueOf(this.f129241p.getOtherUserId()));
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: I */
    public final void m150894I(View view) {
        mpo0.m155834a(this, view);
    }

    /* JADX INFO: renamed from: N */
    public final void m150896N(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage) {
        if (!TextUtils.isEmpty(voiceCpBindMessage.getOtherUserName())) {
            String otherUserName = voiceCpBindMessage.getOtherUserName();
            if (otherUserName.length() > 12) {
                otherUserName = otherUserName.substring(0, 12).concat("...");
            }
            this.f129236k.setText(w8u.m202218u(R$string.f47130ag, otherUserName));
        }
        if (TextUtils.isEmpty(voiceCpBindMessage.getHouseName())) {
            return;
        }
        this.f129238m.m78492b(null, voiceCpBindMessage.getHouseImage(), "LV." + voiceCpBindMessage.getHouseRank() + voiceCpBindMessage.getHouseName(), voiceCpBindMessage.getUserAvatar(), voiceCpBindMessage.getOtherUserAvatar());
    }

    /* JADX INFO: renamed from: O */
    public void m150897O(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage) {
        if (voiceCpBindMessage == null) {
            return;
        }
        this.f129241p = voiceCpBindMessage;
        m71834E();
        m150896N(voiceCpBindMessage);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        super.mo71836m(view);
        m150894I(view);
        xdl0.m208329E0(this.f129240o, new View.OnClickListener() { // from class: l.ipo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f114339a.m150891K(view2);
            }
        });
        xdl0.m208329E0(this.f129238m.f53534e, new View.OnClickListener() { // from class: l.jpo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f119215a.m150892L(view2);
            }
        });
        xdl0.m208329E0(this.f129238m.f53536g, new View.OnClickListener() { // from class: l.kpo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f124178a.m150893M(view2);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(nqo0 nqo0Var) {
    }
}
