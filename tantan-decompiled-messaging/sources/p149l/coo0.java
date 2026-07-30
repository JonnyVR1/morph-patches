package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item.VoiceSweetCpItemView;

/* JADX INFO: loaded from: classes11.dex */
public class coo0 extends d1q<VoiceSweetCpItemView> {

    /* JADX INFO: renamed from: a */
    public BLiveVoiceCpHouseInfo f81853a;

    /* JADX INFO: renamed from: b */
    public g30<BLiveVoiceCpHouseInfo, Boolean, Boolean> f81854b;

    public coo0(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, g30<BLiveVoiceCpHouseInfo, Boolean, Boolean> g30Var) {
        this.f81853a = bLiveVoiceCpHouseInfo;
        this.f81854b = g30Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m108023N(View view) {
        g30<BLiveVoiceCpHouseInfo, Boolean, Boolean> g30Var = this.f81854b;
        BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo = this.f81853a;
        Boolean bool = Boolean.FALSE;
        g30Var.mo36055a(bLiveVoiceCpHouseInfo, bool, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m108024O(View view) {
        g30<BLiveVoiceCpHouseInfo, Boolean, Boolean> g30Var = this.f81854b;
        BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo = this.f81853a;
        Boolean bool = Boolean.TRUE;
        g30Var.mo36055a(bLiveVoiceCpHouseInfo, bool, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m108025P(View view) {
        this.f81854b.mo36055a(this.f81853a, Boolean.TRUE, Boolean.FALSE);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo70999m(VoiceSweetCpItemView voiceSweetCpItemView) {
        super.mo70999m(voiceSweetCpItemView);
    }

    /* JADX INFO: renamed from: L */
    public BLiveVoiceCpHouseInfo m108027L() {
        return this.f81853a;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo70566u(VoiceSweetCpItemView voiceSweetCpItemView) {
        super.mo70566u(voiceSweetCpItemView);
        voiceSweetCpItemView.m78568b(this.f81853a);
        if (this.f81854b == null) {
            return;
        }
        xdl0.m208329E0(voiceSweetCpItemView.f53597a, new View.OnClickListener() { // from class: l.zno0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203986a.m108023N(view);
            }
        });
        xdl0.m208329E0(voiceSweetCpItemView.f53599c.f53540b, new View.OnClickListener() { // from class: l.aoo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f70880a.m108024O(view);
            }
        });
        xdl0.m208329E0(voiceSweetCpItemView.f53599c.f53542d, new View.OnClickListener() { // from class: l.boo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76537a.m108025P(view);
            }
        });
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void mo71000w(VoiceSweetCpItemView voiceSweetCpItemView) {
        super.mo71000w(voiceSweetCpItemView);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168464oa;
    }
}
