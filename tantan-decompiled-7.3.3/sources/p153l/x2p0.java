package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.longlink.msg.liveroom.VoiceSweet;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class x2p0 extends LiveMenuDialogHolder<rzo0> {

    /* JADX INFO: renamed from: k */
    public View f192166k;

    /* JADX INFO: renamed from: l */
    public VImage f192167l;

    /* JADX INFO: renamed from: m */
    public VLinear f192168m;

    /* JADX INFO: renamed from: n */
    public VText f192169n;

    /* JADX INFO: renamed from: o */
    public VText f192170o;

    /* JADX INFO: renamed from: p */
    public VRecyclerView f192171p;

    /* JADX INFO: renamed from: q */
    public VText f192172q;

    /* JADX INFO: renamed from: r */
    public z2p0 f192173r;

    public x2p0(Act act, rzo0 rzo0Var, rq2 rq2Var) {
        super(yec0.f198738Da, act, rzo0Var, rq2Var);
        this.f192173r = new z2p0();
        m73015B(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m209164J(View view) {
        mo73021p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m209165K(View view) {
        mo73021p();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: H */
    public final void m209166H(View view) {
        y2p0.m214091a(this, view);
    }

    /* JADX INFO: renamed from: L */
    public final void m209168L(VoiceSweet.VoiceCpHouseUpgradeMessage voiceCpHouseUpgradeMessage) {
        if (!TextUtils.isEmpty(voiceCpHouseUpgradeMessage.getOtherUserName())) {
            String otherUserName = voiceCpHouseUpgradeMessage.getOtherUserName();
            if (otherUserName.length() > 4) {
                otherUserName = otherUserName.substring(0, 4).concat("...");
            }
            this.f192169n.setText(xau.m209911u(R$string.f48132hg, otherUserName));
        }
        this.f192170o.setText(xau.m209911u(R$string.f48285og, Integer.valueOf(voiceCpHouseUpgradeMessage.getHouseRank())));
        if (voiceCpHouseUpgradeMessage.getRewardListList() != null) {
            this.f192173r.m218455f0(voiceCpHouseUpgradeMessage.getRewardListList());
        }
    }

    /* JADX INFO: renamed from: M */
    public void m209169M(VoiceSweet.VoiceCpHouseUpgradeMessage voiceCpHouseUpgradeMessage) {
        if (voiceCpHouseUpgradeMessage == null) {
            return;
        }
        m73017E();
        m209168L(voiceCpHouseUpgradeMessage);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        super.mo73019m(view);
        m209166H(view);
        bnl0.m105509E0(this.f192167l, new View.OnClickListener() { // from class: l.v2p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f182102a.m209164J(view2);
            }
        });
        bnl0.m105509E0(this.f192172q, new View.OnClickListener() { // from class: l.w2p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f186922a.m209165K(view2);
            }
        });
        this.f192171p.addItemDecoration(new z2p0.C21751a());
        this.f192171p.setLayoutManager(new LinearLayoutManager(this.f48608e, 0, false));
        this.f192171p.setAdapter(this.f192173r);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(rzo0 rzo0Var) {
    }
}
