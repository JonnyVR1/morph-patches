package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSweetLimitHouse;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item.VoiceSweetLimitHouseItemView;

/* JADX INFO: loaded from: classes11.dex */
public class fro0 extends d1q<VoiceSweetLimitHouseItemView> {

    /* JADX INFO: renamed from: a */
    public VoiceSweetLimitHouseItemView f98983a;

    /* JADX INFO: renamed from: b */
    public BLiveVoiceSweetLimitHouse f98984b;

    /* JADX INFO: renamed from: c */
    public e30<BLiveVoiceSweetLimitHouse> f98985c;

    public fro0(BLiveVoiceSweetLimitHouse bLiveVoiceSweetLimitHouse, e30<BLiveVoiceSweetLimitHouse> e30Var) {
        this.f98984b = bLiveVoiceSweetLimitHouse;
        this.f98985c = e30Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m122881J(View view) {
        this.f98985c.call(this.f98984b);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo70999m(VoiceSweetLimitHouseItemView voiceSweetLimitHouseItemView) {
        super.mo70999m(voiceSweetLimitHouseItemView);
        this.f98983a = voiceSweetLimitHouseItemView;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo70566u(VoiceSweetLimitHouseItemView voiceSweetLimitHouseItemView) {
        super.mo70566u(voiceSweetLimitHouseItemView);
        voiceSweetLimitHouseItemView.m78574b(this.f98984b);
        if (this.f98985c == null) {
            return;
        }
        xdl0.m208329E0(voiceSweetLimitHouseItemView.f53609b, new View.OnClickListener() { // from class: l.ero0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92951a.m122881J(view);
            }
        });
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo71000w(VoiceSweetLimitHouseItemView voiceSweetLimitHouseItemView) {
        super.mo71000w(voiceSweetLimitHouseItemView);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168555va;
    }
}
