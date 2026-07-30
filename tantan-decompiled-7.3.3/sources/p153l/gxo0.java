package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item.VoiceSweetCpItemView;

/* JADX INFO: loaded from: classes10.dex */
public class gxo0 extends d3q<VoiceSweetCpItemView> {

    /* JADX INFO: renamed from: a */
    public BLiveVoiceCpHouseInfo f106966a;

    /* JADX INFO: renamed from: b */
    public a30<BLiveVoiceCpHouseInfo, Boolean, Boolean> f106967b;

    public gxo0(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, a30<BLiveVoiceCpHouseInfo, Boolean, Boolean> a30Var) {
        this.f106966a = bLiveVoiceCpHouseInfo;
        this.f106967b = a30Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m132888N(View view) {
        a30<BLiveVoiceCpHouseInfo, Boolean, Boolean> a30Var = this.f106967b;
        BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo = this.f106966a;
        Boolean bool = Boolean.FALSE;
        a30Var.mo37058a(bLiveVoiceCpHouseInfo, bool, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m132889O(View view) {
        a30<BLiveVoiceCpHouseInfo, Boolean, Boolean> a30Var = this.f106967b;
        BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo = this.f106966a;
        Boolean bool = Boolean.TRUE;
        a30Var.mo37058a(bLiveVoiceCpHouseInfo, bool, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m132890P(View view) {
        this.f106967b.mo37058a(this.f106966a, Boolean.TRUE, Boolean.FALSE);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo72182m(VoiceSweetCpItemView voiceSweetCpItemView) {
        super.mo72182m(voiceSweetCpItemView);
    }

    /* JADX INFO: renamed from: L */
    public BLiveVoiceCpHouseInfo m132892L() {
        return this.f106966a;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo71749u(VoiceSweetCpItemView voiceSweetCpItemView) {
        super.mo71749u(voiceSweetCpItemView);
        voiceSweetCpItemView.m79751b(this.f106966a);
        if (this.f106967b == null) {
            return;
        }
        bnl0.m105509E0(voiceSweetCpItemView.f54445a, new View.OnClickListener() { // from class: l.dxo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f91098a.m132888N(view);
            }
        });
        bnl0.m105509E0(voiceSweetCpItemView.f54447c.f54388b, new View.OnClickListener() { // from class: l.exo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96317a.m132889O(view);
            }
        });
        bnl0.m105509E0(voiceSweetCpItemView.f54447c.f54390d, new View.OnClickListener() { // from class: l.fxo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101282a.m132890P(view);
            }
        });
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void mo72183w(VoiceSweetCpItemView voiceSweetCpItemView) {
        super.mo72183w(voiceSweetCpItemView);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f199196oa;
    }
}
