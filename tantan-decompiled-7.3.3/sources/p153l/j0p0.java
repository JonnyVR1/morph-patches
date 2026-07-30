package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSweetLimitHouse;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item.VoiceSweetLimitHouseItemView;

/* JADX INFO: loaded from: classes10.dex */
public class j0p0 extends d3q<VoiceSweetLimitHouseItemView> {

    /* JADX INFO: renamed from: a */
    public VoiceSweetLimitHouseItemView f117836a;

    /* JADX INFO: renamed from: b */
    public BLiveVoiceSweetLimitHouse f117837b;

    /* JADX INFO: renamed from: c */
    public y20<BLiveVoiceSweetLimitHouse> f117838c;

    public j0p0(BLiveVoiceSweetLimitHouse bLiveVoiceSweetLimitHouse, y20<BLiveVoiceSweetLimitHouse> y20Var) {
        this.f117837b = bLiveVoiceSweetLimitHouse;
        this.f117838c = y20Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m142984J(View view) {
        this.f117838c.call(this.f117837b);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo72182m(VoiceSweetLimitHouseItemView voiceSweetLimitHouseItemView) {
        super.mo72182m(voiceSweetLimitHouseItemView);
        this.f117836a = voiceSweetLimitHouseItemView;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo71749u(VoiceSweetLimitHouseItemView voiceSweetLimitHouseItemView) {
        super.mo71749u(voiceSweetLimitHouseItemView);
        voiceSweetLimitHouseItemView.m79757b(this.f117837b);
        if (this.f117838c == null) {
            return;
        }
        bnl0.m105509E0(voiceSweetLimitHouseItemView.f54457b, new View.OnClickListener() { // from class: l.i0p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112431a.m142984J(view);
            }
        });
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo72183w(VoiceSweetLimitHouseItemView voiceSweetLimitHouseItemView) {
        super.mo72183w(voiceSweetLimitHouseItemView);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f199287va;
    }
}
