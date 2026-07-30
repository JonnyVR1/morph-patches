package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.longlink.msg.liveroom.VoiceSweet;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class tto0 extends LiveMenuDialogHolder<nqo0> {

    /* JADX INFO: renamed from: k */
    public View f172039k;

    /* JADX INFO: renamed from: l */
    public VImage f172040l;

    /* JADX INFO: renamed from: m */
    public VLinear f172041m;

    /* JADX INFO: renamed from: n */
    public VText f172042n;

    /* JADX INFO: renamed from: o */
    public VText f172043o;

    /* JADX INFO: renamed from: p */
    public VRecyclerView f172044p;

    /* JADX INFO: renamed from: q */
    public VText f172045q;

    /* JADX INFO: renamed from: r */
    public vto0 f172046r;

    public tto0(Act act, nqo0 nqo0Var, aq2 aq2Var) {
        super(t6c0.f168006Da, act, nqo0Var, aq2Var);
        this.f172046r = new vto0();
        m71832B(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m190610J(View view) {
        mo71838p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m190611K(View view) {
        mo71838p();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: H */
    public final void m190612H(View view) {
        uto0.m195307a(this, view);
    }

    /* JADX INFO: renamed from: L */
    public final void m190614L(VoiceSweet.VoiceCpHouseUpgradeMessage voiceCpHouseUpgradeMessage) {
        if (!TextUtils.isEmpty(voiceCpHouseUpgradeMessage.getOtherUserName())) {
            String otherUserName = voiceCpHouseUpgradeMessage.getOtherUserName();
            if (otherUserName.length() > 4) {
                otherUserName = otherUserName.substring(0, 4).concat("...");
            }
            this.f172042n.setText(w8u.m202218u(R$string.f47284hg, otherUserName));
        }
        this.f172043o.setText(w8u.m202218u(R$string.f47437og, Integer.valueOf(voiceCpHouseUpgradeMessage.getHouseRank())));
        if (voiceCpHouseUpgradeMessage.getRewardListList() != null) {
            this.f172046r.m200050f0(voiceCpHouseUpgradeMessage.getRewardListList());
        }
    }

    /* JADX INFO: renamed from: M */
    public void m190615M(VoiceSweet.VoiceCpHouseUpgradeMessage voiceCpHouseUpgradeMessage) {
        if (voiceCpHouseUpgradeMessage == null) {
            return;
        }
        m71834E();
        m190614L(voiceCpHouseUpgradeMessage);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        super.mo71836m(view);
        m190612H(view);
        xdl0.m208329E0(this.f172040l, new View.OnClickListener() { // from class: l.rto0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f160981a.m190610J(view2);
            }
        });
        xdl0.m208329E0(this.f172045q, new View.OnClickListener() { // from class: l.sto0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f166378a.m190611K(view2);
            }
        });
        this.f172044p.addItemDecoration(new vto0.C20729a());
        this.f172044p.setLayoutManager(new LinearLayoutManager(this.f47760e, 0, false));
        this.f172044p.setAdapter(this.f172046r);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(nqo0 nqo0Var) {
    }
}
