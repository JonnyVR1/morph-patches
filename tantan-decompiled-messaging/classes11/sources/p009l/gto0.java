package p009l;

import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item.VoiceSweetTaskItemView;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p1.mobile.putong.live.base.data.BLiveVoiceSweetCpTask;
import l.d1q;
import l.f30;
import l.t6c0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class gto0 extends d1q<VoiceSweetTaskItemView> {

    /* JADX INFO: renamed from: a */
    public BLiveVoiceSweetCpTask f13749a;

    /* JADX INFO: renamed from: b */
    public BLiveVoiceCpHouseInfo f13750b;

    /* JADX INFO: renamed from: c */
    public f30<BLiveVoiceSweetCpTask, BLiveVoiceCpHouseInfo> f13751c;

    public gto0(BLiveVoiceSweetCpTask bLiveVoiceSweetCpTask, BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, f30<BLiveVoiceSweetCpTask, BLiveVoiceCpHouseInfo> f30Var) {
        this.f13749a = bLiveVoiceSweetCpTask;
        this.f13750b = bLiveVoiceCpHouseInfo;
        this.f13751c = f30Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m15281J(View view) {
        this.f13751c.call(this.f13749a, this.f13750b);
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void m15285m(VoiceSweetTaskItemView voiceSweetTaskItemView) {
        super.m(voiceSweetTaskItemView);
    }

    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void m15287u(VoiceSweetTaskItemView voiceSweetTaskItemView) {
        super.u(voiceSweetTaskItemView);
        voiceSweetTaskItemView.m8794b(this.f13749a);
        if (this.f13751c == null) {
            return;
        }
        xdl0.E0(voiceSweetTaskItemView.f7227d, new View.OnClickListener() { // from class: l.fto0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13164a.m15281J(view);
            }
        });
    }

    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void m15288w(VoiceSweetTaskItemView voiceSweetTaskItemView) {
        super.w(voiceSweetTaskItemView);
    }

    /* JADX INFO: renamed from: o */
    public int m15286o() {
        return t6c0.Aa;
    }
}
