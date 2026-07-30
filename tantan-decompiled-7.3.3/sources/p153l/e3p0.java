package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSweetCpRecommendUser;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item.VoiceSweetUserItemView;

/* JADX INFO: loaded from: classes10.dex */
public class e3p0 extends d3q<VoiceSweetUserItemView> {

    /* JADX INFO: renamed from: a */
    public BLiveVoiceSweetCpRecommendUser f91988a;

    /* JADX INFO: renamed from: b */
    public z20<BLiveVoiceSweetCpRecommendUser, Boolean> f91989b;

    public e3p0(BLiveVoiceSweetCpRecommendUser bLiveVoiceSweetCpRecommendUser, z20<BLiveVoiceSweetCpRecommendUser, Boolean> z20Var) {
        this.f91988a = bLiveVoiceSweetCpRecommendUser;
        this.f91989b = z20Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m119314K(View view) {
        this.f91989b.call(this.f91988a, Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m119315L(View view) {
        this.f91989b.call(this.f91988a, Boolean.TRUE);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo72182m(VoiceSweetUserItemView voiceSweetUserItemView) {
        super.mo72182m(voiceSweetUserItemView);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void mo71749u(VoiceSweetUserItemView voiceSweetUserItemView) {
        super.mo71749u(voiceSweetUserItemView);
        voiceSweetUserItemView.m79773d(this.f91988a);
        if (this.f91989b == null) {
            return;
        }
        bnl0.m105509E0(voiceSweetUserItemView.f54485g, new View.OnClickListener() { // from class: l.c3p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79636a.m119314K(view);
            }
        });
        bnl0.m105509E0(voiceSweetUserItemView.f54479a, new View.OnClickListener() { // from class: l.d3p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84931a.m119315L(view);
            }
        });
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo72183w(VoiceSweetUserItemView voiceSweetUserItemView) {
        super.mo72183w(voiceSweetUserItemView);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198774Ga;
    }
}
