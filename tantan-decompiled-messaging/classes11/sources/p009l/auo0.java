package p009l;

import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item.VoiceSweetUserItemView;
import com.p1.mobile.putong.live.base.data.BLiveVoiceSweetCpRecommendUser;
import l.d1q;
import l.f30;
import l.t6c0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class auo0 extends d1q<VoiceSweetUserItemView> {

    /* JADX INFO: renamed from: a */
    public BLiveVoiceSweetCpRecommendUser f9702a;

    /* JADX INFO: renamed from: b */
    public f30<BLiveVoiceSweetCpRecommendUser, Boolean> f9703b;

    public auo0(BLiveVoiceSweetCpRecommendUser bLiveVoiceSweetCpRecommendUser, f30<BLiveVoiceSweetCpRecommendUser, Boolean> f30Var) {
        this.f9702a = bLiveVoiceSweetCpRecommendUser;
        this.f9703b = f30Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m11648K(View view) {
        this.f9703b.call(this.f9702a, Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m11649L(View view) {
        this.f9703b.call(this.f9702a, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void m11653m(VoiceSweetUserItemView voiceSweetUserItemView) {
        super.m(voiceSweetUserItemView);
    }

    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void m11655u(VoiceSweetUserItemView voiceSweetUserItemView) {
        super.u(voiceSweetUserItemView);
        voiceSweetUserItemView.m8803d(this.f9702a);
        if (this.f9703b == null) {
            return;
        }
        xdl0.E0(voiceSweetUserItemView.f7243g, new View.OnClickListener() { // from class: l.yto0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23231a.m11648K(view);
            }
        });
        xdl0.E0(voiceSweetUserItemView.f7237a, new View.OnClickListener() { // from class: l.zto0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23904a.m11649L(view);
            }
        });
    }

    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void m11656w(VoiceSweetUserItemView voiceSweetUserItemView) {
        super.w(voiceSweetUserItemView);
    }

    /* JADX INFO: renamed from: o */
    public int m11654o() {
        return t6c0.Ga;
    }
}
