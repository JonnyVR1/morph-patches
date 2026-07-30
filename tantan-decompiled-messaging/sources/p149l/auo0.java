package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSweetCpRecommendUser;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item.VoiceSweetUserItemView;

/* JADX INFO: loaded from: classes11.dex */
public class auo0 extends d1q<VoiceSweetUserItemView> {

    /* JADX INFO: renamed from: a */
    public BLiveVoiceSweetCpRecommendUser f71847a;

    /* JADX INFO: renamed from: b */
    public f30<BLiveVoiceSweetCpRecommendUser, Boolean> f71848b;

    public auo0(BLiveVoiceSweetCpRecommendUser bLiveVoiceSweetCpRecommendUser, f30<BLiveVoiceSweetCpRecommendUser, Boolean> f30Var) {
        this.f71847a = bLiveVoiceSweetCpRecommendUser;
        this.f71848b = f30Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m99019K(View view) {
        this.f71848b.call(this.f71847a, Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m99020L(View view) {
        this.f71848b.call(this.f71847a, Boolean.TRUE);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo70999m(VoiceSweetUserItemView voiceSweetUserItemView) {
        super.mo70999m(voiceSweetUserItemView);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void mo70566u(VoiceSweetUserItemView voiceSweetUserItemView) {
        super.mo70566u(voiceSweetUserItemView);
        voiceSweetUserItemView.m78590d(this.f71847a);
        if (this.f71848b == null) {
            return;
        }
        xdl0.m208329E0(voiceSweetUserItemView.f53637g, new View.OnClickListener() { // from class: l.yto0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f200001a.m99019K(view);
            }
        });
        xdl0.m208329E0(voiceSweetUserItemView.f53631a, new View.OnClickListener() { // from class: l.zto0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204746a.m99020L(view);
            }
        });
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo71000w(VoiceSweetUserItemView voiceSweetUserItemView) {
        super.mo71000w(voiceSweetUserItemView);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168042Ga;
    }
}
