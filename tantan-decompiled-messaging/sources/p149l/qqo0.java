package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item.VoiceSweetHouseItemView;

/* JADX INFO: loaded from: classes11.dex */
public class qqo0 extends d1q<VoiceSweetHouseItemView> {

    /* JADX INFO: renamed from: a */
    public VoiceSweetHouseItemView f155920a;

    /* JADX INFO: renamed from: b */
    public BLiveVoiceCpHouseInfo f155921b;

    /* JADX INFO: renamed from: c */
    public e30<BLiveVoiceCpHouseInfo> f155922c;

    public qqo0(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, e30<BLiveVoiceCpHouseInfo> e30Var) {
        this.f155921b = bLiveVoiceCpHouseInfo;
        this.f155922c = e30Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m175949J(View view) {
        this.f155922c.call(this.f155921b);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo70999m(VoiceSweetHouseItemView voiceSweetHouseItemView) {
        super.mo70999m(voiceSweetHouseItemView);
        this.f155920a = voiceSweetHouseItemView;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo70566u(VoiceSweetHouseItemView voiceSweetHouseItemView) {
        super.mo70566u(voiceSweetHouseItemView);
        voiceSweetHouseItemView.m78572b(this.f155921b);
        if (this.f155922c == null) {
            return;
        }
        xdl0.m208329E0(voiceSweetHouseItemView, new View.OnClickListener() { // from class: l.pqo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150806a.m175949J(view);
            }
        });
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo71000w(VoiceSweetHouseItemView voiceSweetHouseItemView) {
        super.mo71000w(voiceSweetHouseItemView);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168529ta;
    }
}
