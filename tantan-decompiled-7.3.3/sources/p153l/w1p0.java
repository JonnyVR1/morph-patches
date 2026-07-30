package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.longlink.msg.liveroom.VoiceSweet;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class w1p0 extends LiveMenuDialogHolder<rzo0> {

    /* JADX INFO: renamed from: k */
    public VImage f186832k;

    /* JADX INFO: renamed from: l */
    public VText f186833l;

    /* JADX INFO: renamed from: m */
    public VText f186834m;

    /* JADX INFO: renamed from: n */
    public VoiceSweet.VoiceCpBindMessage f186835n;

    public w1p0(Act act, rzo0 rzo0Var, rq2 rq2Var) {
        super(yec0.f199326ya, act, rzo0Var, rq2Var);
        m73015B(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m204464J(View view) {
        mo73021p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m204465K(View view) {
        ((rzo0) this.f48605b).m183810Y3(this.f186835n);
        mo73021p();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: H */
    public final void m204466H(View view) {
        x1p0.m209102a(this, view);
    }

    /* JADX INFO: renamed from: L */
    public void m204468L(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage) {
        if (voiceCpBindMessage == null) {
            return;
        }
        this.f186835n = voiceCpBindMessage;
        m73017E();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        super.mo73019m(view);
        m204466H(view);
        bnl0.m105509E0(this.f186832k, new View.OnClickListener() { // from class: l.u1p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f177107a.m204464J(view2);
            }
        });
        bnl0.m105509E0(this.f186834m, new View.OnClickListener() { // from class: l.v1p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f181991a.m204465K(view2);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(rzo0 rzo0Var) {
    }
}
