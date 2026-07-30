package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSweetCpTask;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item.VoiceSweetTaskItemView;

/* JADX INFO: loaded from: classes10.dex */
public class k2p0 extends d3q<VoiceSweetTaskItemView> {

    /* JADX INFO: renamed from: a */
    public BLiveVoiceSweetCpTask f123633a;

    /* JADX INFO: renamed from: b */
    public BLiveVoiceCpHouseInfo f123634b;

    /* JADX INFO: renamed from: c */
    public z20<BLiveVoiceSweetCpTask, BLiveVoiceCpHouseInfo> f123635c;

    public k2p0(BLiveVoiceSweetCpTask bLiveVoiceSweetCpTask, BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, z20<BLiveVoiceSweetCpTask, BLiveVoiceCpHouseInfo> z20Var) {
        this.f123633a = bLiveVoiceSweetCpTask;
        this.f123634b = bLiveVoiceCpHouseInfo;
        this.f123635c = z20Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m147987J(View view) {
        this.f123635c.call(this.f123633a, this.f123634b);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo72182m(VoiceSweetTaskItemView voiceSweetTaskItemView) {
        super.mo72182m(voiceSweetTaskItemView);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo71749u(VoiceSweetTaskItemView voiceSweetTaskItemView) {
        super.mo71749u(voiceSweetTaskItemView);
        voiceSweetTaskItemView.m79764b(this.f123633a);
        if (this.f123635c == null) {
            return;
        }
        bnl0.m105509E0(voiceSweetTaskItemView.f54469d, new View.OnClickListener() { // from class: l.j2p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118077a.m147987J(view);
            }
        });
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo72183w(VoiceSweetTaskItemView voiceSweetTaskItemView) {
        super.mo72183w(voiceSweetTaskItemView);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198702Aa;
    }
}
