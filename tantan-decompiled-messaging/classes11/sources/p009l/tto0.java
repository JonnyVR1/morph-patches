package p009l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.longlink.msg.liveroom.VoiceSweet;
import com.p1.mobile.putong.live.livingroom.R;
import com.p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import l.aq2;
import l.t6c0;
import l.uto0;
import l.w8u;
import l.xdl0;
import v.VImage;
import v.VLinear;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class tto0 extends LiveMenuDialogHolder<nqo0> {

    /* JADX INFO: renamed from: k */
    public View f20864k;

    /* JADX INFO: renamed from: l */
    public VImage f20865l;

    /* JADX INFO: renamed from: m */
    public VLinear f20866m;

    /* JADX INFO: renamed from: n */
    public VText f20867n;

    /* JADX INFO: renamed from: o */
    public VText f20868o;

    /* JADX INFO: renamed from: p */
    public VRecyclerView f20869p;

    /* JADX INFO: renamed from: q */
    public VText f20870q;

    /* JADX INFO: renamed from: r */
    public vto0 f20871r;

    public tto0(Act act, nqo0 nqo0Var, aq2 aq2Var) {
        super(t6c0.Da, act, nqo0Var, aq2Var);
        this.f20871r = new vto0();
        B(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m22663J(View view) {
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m22664K(View view) {
        p();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m22665C0() {
        return null;
    }

    /* JADX INFO: renamed from: H */
    public final void m22666H(View view) {
        uto0.a(this, view);
    }

    /* JADX INFO: renamed from: L */
    public final void m22668L(VoiceSweet.VoiceCpHouseUpgradeMessage voiceCpHouseUpgradeMessage) {
        if (!TextUtils.isEmpty(voiceCpHouseUpgradeMessage.getOtherUserName())) {
            String otherUserName = voiceCpHouseUpgradeMessage.getOtherUserName();
            if (otherUserName.length() > 4) {
                otherUserName = otherUserName.substring(0, 4).concat("...");
            }
            this.f20867n.setText(w8u.u(R.string.hg, otherUserName));
        }
        this.f20868o.setText(w8u.u(R.string.og, Integer.valueOf(voiceCpHouseUpgradeMessage.getHouseRank())));
        if (voiceCpHouseUpgradeMessage.getRewardListList() != null) {
            this.f20871r.m23731f0(voiceCpHouseUpgradeMessage.getRewardListList());
        }
    }

    /* JADX INFO: renamed from: M */
    public void m22669M(VoiceSweet.VoiceCpHouseUpgradeMessage voiceCpHouseUpgradeMessage) {
        if (voiceCpHouseUpgradeMessage == null) {
            return;
        }
        E();
        m22668L(voiceCpHouseUpgradeMessage);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public void m22671m(View view) {
        super.m(view);
        m22666H(view);
        xdl0.E0(this.f20865l, new View.OnClickListener() { // from class: l.rto0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f19980a.m22663J(view2);
            }
        });
        xdl0.E0(this.f20870q, new View.OnClickListener() { // from class: l.sto0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f20470a.m22664K(view2);
            }
        });
        this.f20869p.addItemDecoration(new vto0.C1276a());
        this.f20869p.setLayoutManager(new LinearLayoutManager(((LiveMenuDialogHolder) this).e, 0, false));
        this.f20869p.setAdapter(this.f20871r);
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m22672n(nqo0 nqo0Var) {
    }
}
