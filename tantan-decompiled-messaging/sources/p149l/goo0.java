package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSweetLimitHouse;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item.VoiceSweetCpLimitItemView;

/* JADX INFO: loaded from: classes11.dex */
public class goo0 extends d1q<VoiceSweetCpLimitItemView> {

    /* JADX INFO: renamed from: a */
    public BLiveVoiceSweetLimitHouse f103698a;

    /* JADX INFO: renamed from: b */
    public e30<BLiveVoiceSweetLimitHouse> f103699b;

    public goo0(BLiveVoiceSweetLimitHouse bLiveVoiceSweetLimitHouse, e30<BLiveVoiceSweetLimitHouse> e30Var) {
        this.f103698a = bLiveVoiceSweetLimitHouse;
        this.f103699b = e30Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m127280J(View view) {
        this.f103699b.call(this.f103698a);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo70999m(VoiceSweetCpLimitItemView voiceSweetCpLimitItemView) {
        super.mo70999m(voiceSweetCpLimitItemView);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo70566u(VoiceSweetCpLimitItemView voiceSweetCpLimitItemView) {
        super.mo70566u(voiceSweetCpLimitItemView);
        voiceSweetCpLimitItemView.m78570b(this.f103698a);
        if (this.f103699b == null) {
            return;
        }
        xdl0.m208329E0(voiceSweetCpLimitItemView.f53600a, new View.OnClickListener() { // from class: l.foo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98594a.m127280J(view);
            }
        });
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo71000w(VoiceSweetCpLimitItemView voiceSweetCpLimitItemView) {
        super.mo71000w(voiceSweetCpLimitItemView);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168477pa;
    }
}
