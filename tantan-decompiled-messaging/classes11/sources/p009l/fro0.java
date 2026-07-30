package p009l;

import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item.VoiceSweetLimitHouseItemView;
import com.p1.mobile.putong.live.base.data.BLiveVoiceSweetLimitHouse;
import l.d1q;
import l.e30;
import l.t6c0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class fro0 extends d1q<VoiceSweetLimitHouseItemView> {

    /* JADX INFO: renamed from: a */
    public VoiceSweetLimitHouseItemView f13144a;

    /* JADX INFO: renamed from: b */
    public BLiveVoiceSweetLimitHouse f13145b;

    /* JADX INFO: renamed from: c */
    public e30<BLiveVoiceSweetLimitHouse> f13146c;

    public fro0(BLiveVoiceSweetLimitHouse bLiveVoiceSweetLimitHouse, e30<BLiveVoiceSweetLimitHouse> e30Var) {
        this.f13145b = bLiveVoiceSweetLimitHouse;
        this.f13146c = e30Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m14567J(View view) {
        this.f13146c.call(this.f13145b);
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void m14571m(VoiceSweetLimitHouseItemView voiceSweetLimitHouseItemView) {
        super.m(voiceSweetLimitHouseItemView);
        this.f13144a = voiceSweetLimitHouseItemView;
    }

    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void m14573u(VoiceSweetLimitHouseItemView voiceSweetLimitHouseItemView) {
        super.u(voiceSweetLimitHouseItemView);
        voiceSweetLimitHouseItemView.m8787b(this.f13145b);
        if (this.f13146c == null) {
            return;
        }
        xdl0.E0(voiceSweetLimitHouseItemView.f7215b, new View.OnClickListener() { // from class: l.ero0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12674a.m14567J(view);
            }
        });
    }

    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void m14574w(VoiceSweetLimitHouseItemView voiceSweetLimitHouseItemView) {
        super.w(voiceSweetLimitHouseItemView);
    }

    /* JADX INFO: renamed from: o */
    public int m14572o() {
        return t6c0.va;
    }
}
