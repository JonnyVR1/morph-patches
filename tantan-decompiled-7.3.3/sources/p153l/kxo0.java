package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSweetLimitHouse;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item.VoiceSweetCpLimitItemView;

/* JADX INFO: loaded from: classes10.dex */
public class kxo0 extends d3q<VoiceSweetCpLimitItemView> {

    /* JADX INFO: renamed from: a */
    public BLiveVoiceSweetLimitHouse f129219a;

    /* JADX INFO: renamed from: b */
    public y20<BLiveVoiceSweetLimitHouse> f129220b;

    public kxo0(BLiveVoiceSweetLimitHouse bLiveVoiceSweetLimitHouse, y20<BLiveVoiceSweetLimitHouse> y20Var) {
        this.f129219a = bLiveVoiceSweetLimitHouse;
        this.f129220b = y20Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m151843J(View view) {
        this.f129220b.call(this.f129219a);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo72182m(VoiceSweetCpLimitItemView voiceSweetCpLimitItemView) {
        super.mo72182m(voiceSweetCpLimitItemView);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo71749u(VoiceSweetCpLimitItemView voiceSweetCpLimitItemView) {
        super.mo71749u(voiceSweetCpLimitItemView);
        voiceSweetCpLimitItemView.m79753b(this.f129219a);
        if (this.f129220b == null) {
            return;
        }
        bnl0.m105509E0(voiceSweetCpLimitItemView.f54448a, new View.OnClickListener() { // from class: l.jxo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123063a.m151843J(view);
            }
        });
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo72183w(VoiceSweetCpLimitItemView voiceSweetCpLimitItemView) {
        super.mo72183w(voiceSweetCpLimitItemView);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f199209pa;
    }
}
