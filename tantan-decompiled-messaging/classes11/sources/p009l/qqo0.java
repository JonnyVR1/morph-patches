package p009l;

import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item.VoiceSweetHouseItemView;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import l.d1q;
import l.e30;
import l.t6c0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class qqo0 extends d1q<VoiceSweetHouseItemView> {

    /* JADX INFO: renamed from: a */
    public VoiceSweetHouseItemView f19464a;

    /* JADX INFO: renamed from: b */
    public BLiveVoiceCpHouseInfo f19465b;

    /* JADX INFO: renamed from: c */
    public e30<BLiveVoiceCpHouseInfo> f19466c;

    public qqo0(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, e30<BLiveVoiceCpHouseInfo> e30Var) {
        this.f19465b = bLiveVoiceCpHouseInfo;
        this.f19466c = e30Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m21187J(View view) {
        this.f19466c.call(this.f19465b);
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void m21191m(VoiceSweetHouseItemView voiceSweetHouseItemView) {
        super.m(voiceSweetHouseItemView);
        this.f19464a = voiceSweetHouseItemView;
    }

    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void m21193u(VoiceSweetHouseItemView voiceSweetHouseItemView) {
        super.u(voiceSweetHouseItemView);
        voiceSweetHouseItemView.m8785b(this.f19465b);
        if (this.f19466c == null) {
            return;
        }
        xdl0.E0(voiceSweetHouseItemView, new View.OnClickListener() { // from class: l.pqo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18844a.m21187J(view);
            }
        });
    }

    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void m21194w(VoiceSweetHouseItemView voiceSweetHouseItemView) {
        super.w(voiceSweetHouseItemView);
    }

    /* JADX INFO: renamed from: o */
    public int m21192o() {
        return t6c0.ta;
    }
}
