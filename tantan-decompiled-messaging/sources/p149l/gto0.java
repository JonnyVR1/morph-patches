package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSweetCpTask;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item.VoiceSweetTaskItemView;

/* JADX INFO: loaded from: classes11.dex */
public class gto0 extends d1q<VoiceSweetTaskItemView> {

    /* JADX INFO: renamed from: a */
    public BLiveVoiceSweetCpTask f104331a;

    /* JADX INFO: renamed from: b */
    public BLiveVoiceCpHouseInfo f104332b;

    /* JADX INFO: renamed from: c */
    public f30<BLiveVoiceSweetCpTask, BLiveVoiceCpHouseInfo> f104333c;

    public gto0(BLiveVoiceSweetCpTask bLiveVoiceSweetCpTask, BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, f30<BLiveVoiceSweetCpTask, BLiveVoiceCpHouseInfo> f30Var) {
        this.f104331a = bLiveVoiceSweetCpTask;
        this.f104332b = bLiveVoiceCpHouseInfo;
        this.f104333c = f30Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m127994J(View view) {
        this.f104333c.call(this.f104331a, this.f104332b);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo70999m(VoiceSweetTaskItemView voiceSweetTaskItemView) {
        super.mo70999m(voiceSweetTaskItemView);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo70566u(VoiceSweetTaskItemView voiceSweetTaskItemView) {
        super.mo70566u(voiceSweetTaskItemView);
        voiceSweetTaskItemView.m78581b(this.f104331a);
        if (this.f104333c == null) {
            return;
        }
        xdl0.m208329E0(voiceSweetTaskItemView.f53621d, new View.OnClickListener() { // from class: l.fto0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99228a.m127994J(view);
            }
        });
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo71000w(VoiceSweetTaskItemView voiceSweetTaskItemView) {
        super.mo71000w(voiceSweetTaskItemView);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f167970Aa;
    }
}
