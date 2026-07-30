package p009l;

import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item.VoiceSweetCpItemView;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import l.d1q;
import l.g30;
import l.t6c0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class coo0 extends d1q<VoiceSweetCpItemView> {

    /* JADX INFO: renamed from: a */
    public BLiveVoiceCpHouseInfo f10714a;

    /* JADX INFO: renamed from: b */
    public g30<BLiveVoiceCpHouseInfo, Boolean, Boolean> f10715b;

    public coo0(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, g30<BLiveVoiceCpHouseInfo, Boolean, Boolean> g30Var) {
        this.f10714a = bLiveVoiceCpHouseInfo;
        this.f10715b = g30Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m12749N(View view) {
        g30<BLiveVoiceCpHouseInfo, Boolean, Boolean> g30Var = this.f10715b;
        BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo = this.f10714a;
        Boolean bool = Boolean.FALSE;
        g30Var.a(bLiveVoiceCpHouseInfo, bool, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m12750O(View view) {
        g30<BLiveVoiceCpHouseInfo, Boolean, Boolean> g30Var = this.f10715b;
        BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo = this.f10714a;
        Boolean bool = Boolean.TRUE;
        g30Var.a(bLiveVoiceCpHouseInfo, bool, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m12751P(View view) {
        this.f10715b.a(this.f10714a, Boolean.TRUE, Boolean.FALSE);
    }

    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void m12756m(VoiceSweetCpItemView voiceSweetCpItemView) {
        super.m(voiceSweetCpItemView);
    }

    /* JADX INFO: renamed from: L */
    public BLiveVoiceCpHouseInfo m12753L() {
        return this.f10714a;
    }

    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void m12758u(VoiceSweetCpItemView voiceSweetCpItemView) {
        super.u(voiceSweetCpItemView);
        voiceSweetCpItemView.m8781b(this.f10714a);
        if (this.f10715b == null) {
            return;
        }
        xdl0.E0(voiceSweetCpItemView.f7203a, new View.OnClickListener() { // from class: l.zno0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23758a.m12749N(view);
            }
        });
        xdl0.E0(voiceSweetCpItemView.f7205c.f7146b, new View.OnClickListener() { // from class: l.aoo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9590a.m12750O(view);
            }
        });
        xdl0.E0(voiceSweetCpItemView.f7205c.f7148d, new View.OnClickListener() { // from class: l.boo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10221a.m12751P(view);
            }
        });
    }

    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void m12759w(VoiceSweetCpItemView voiceSweetCpItemView) {
        super.w(voiceSweetCpItemView);
    }

    /* JADX INFO: renamed from: o */
    public int m12757o() {
        return t6c0.oa;
    }
}
