package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item.VoiceSweetHouseItemView;

/* JADX INFO: loaded from: classes10.dex */
public class uzo0 extends d3q<VoiceSweetHouseItemView> {

    /* JADX INFO: renamed from: a */
    public VoiceSweetHouseItemView f181797a;

    /* JADX INFO: renamed from: b */
    public BLiveVoiceCpHouseInfo f181798b;

    /* JADX INFO: renamed from: c */
    public y20<BLiveVoiceCpHouseInfo> f181799c;

    public uzo0(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, y20<BLiveVoiceCpHouseInfo> y20Var) {
        this.f181798b = bLiveVoiceCpHouseInfo;
        this.f181799c = y20Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m198846J(View view) {
        this.f181799c.call(this.f181798b);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo72182m(VoiceSweetHouseItemView voiceSweetHouseItemView) {
        super.mo72182m(voiceSweetHouseItemView);
        this.f181797a = voiceSweetHouseItemView;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo71749u(VoiceSweetHouseItemView voiceSweetHouseItemView) {
        super.mo71749u(voiceSweetHouseItemView);
        voiceSweetHouseItemView.m79755b(this.f181798b);
        if (this.f181799c == null) {
            return;
        }
        bnl0.m105509E0(voiceSweetHouseItemView, new View.OnClickListener() { // from class: l.tzo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176787a.m198846J(view);
            }
        });
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo72183w(VoiceSweetHouseItemView voiceSweetHouseItemView) {
        super.mo72183w(voiceSweetHouseItemView);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f199261ta;
    }
}
