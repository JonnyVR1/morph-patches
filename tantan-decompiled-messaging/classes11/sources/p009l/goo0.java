package p009l;

import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item.VoiceSweetCpLimitItemView;
import com.p1.mobile.putong.live.base.data.BLiveVoiceSweetLimitHouse;
import l.d1q;
import l.e30;
import l.t6c0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class goo0 extends d1q<VoiceSweetCpLimitItemView> {

    /* JADX INFO: renamed from: a */
    public BLiveVoiceSweetLimitHouse f13653a;

    /* JADX INFO: renamed from: b */
    public e30<BLiveVoiceSweetLimitHouse> f13654b;

    public goo0(BLiveVoiceSweetLimitHouse bLiveVoiceSweetLimitHouse, e30<BLiveVoiceSweetLimitHouse> e30Var) {
        this.f13653a = bLiveVoiceSweetLimitHouse;
        this.f13654b = e30Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m15121J(View view) {
        this.f13654b.call(this.f13653a);
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void m15125m(VoiceSweetCpLimitItemView voiceSweetCpLimitItemView) {
        super.m(voiceSweetCpLimitItemView);
    }

    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void m15127u(VoiceSweetCpLimitItemView voiceSweetCpLimitItemView) {
        super.u(voiceSweetCpLimitItemView);
        voiceSweetCpLimitItemView.m8783b(this.f13653a);
        if (this.f13654b == null) {
            return;
        }
        xdl0.E0(voiceSweetCpLimitItemView.f7206a, new View.OnClickListener() { // from class: l.foo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13127a.m15121J(view);
            }
        });
    }

    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void m15128w(VoiceSweetCpLimitItemView voiceSweetCpLimitItemView) {
        super.w(voiceSweetCpLimitItemView);
    }

    /* JADX INFO: renamed from: o */
    public int m15126o() {
        return t6c0.pa;
    }
}
