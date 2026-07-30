package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceBonusGifts;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCallSummary;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class elk0 implements s7m<hik0> {

    /* JADX INFO: renamed from: a */
    public View f92106a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f92107b;

    /* JADX INFO: renamed from: c */
    public VText f92108c;

    /* JADX INFO: renamed from: d */
    public VText f92109d;

    /* JADX INFO: renamed from: e */
    public VText f92110e;

    /* JADX INFO: renamed from: f */
    public VText f92111f;

    /* JADX INFO: renamed from: g */
    public VText f92112g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f92113h;

    /* JADX INFO: renamed from: i */
    public hik0 f92114i;

    /* JADX INFO: renamed from: j */
    public DialogC12611a f92115j;

    /* JADX INFO: renamed from: f */
    private void m117129f() {
        uep0.m193327n(this.f92115j);
        this.f92107b.stopAnimation(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m117130j(View view) {
        m117129f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m117131k(View view) {
        m117129f();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f92114i.act();
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f92114i.act();
    }

    /* JADX INFO: renamed from: d */
    public View m117132d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return flk0.m122075b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(hik0 hik0Var) {
        this.f92114i = hik0Var;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m117134i(BLiveVoiceCallSummary bLiveVoiceCallSummary, View view) {
        this.f92114i.m131270S3(bLiveVoiceCallSummary.voiceCallId, bLiveVoiceCallSummary.bonusGifts);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public boolean isShowing() {
        return uep0.m193339z(this.f92115j);
    }

    /* JADX INFO: renamed from: l */
    public void m117135l() {
        xdl0.m208344M(this.f92107b, false);
    }

    /* JADX INFO: renamed from: m */
    public void m117136m(final BLiveVoiceCallSummary bLiveVoiceCallSummary) {
        gkh0.m126627j("[voice][call]", "call summary duration " + bLiveVoiceCallSummary.duration);
        this.f92108c.setText(getContext().getString(R$string.f47378m1));
        this.f92109d.setText(qqi0.m175938f("", ((double) bLiveVoiceCallSummary.duration) * 1000.0d));
        this.f92110e.setText(getContext().getString(R$string.f46967T0));
        this.f92111f.setText(bLiveVoiceCallSummary.newFollowCount + "");
        BLiveVoiceBonusGifts bLiveVoiceBonusGifts = bLiveVoiceCallSummary.bonusGifts;
        if (bLiveVoiceBonusGifts == null || vwb.m200296J(bLiveVoiceBonusGifts.giftItems)) {
            xdl0.m208344M(this.f92107b, false);
            return;
        }
        xdl0.m208344M(this.f92107b, true);
        this.f92107b.m68500j("https://auto.tancdn.com/v1/raw/574b190b-2eb2-4226-a8e1-51cded992fe811.so", -1);
        xdl0.m208329E0(this.f92107b, new View.OnClickListener() { // from class: l.dlk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f86827a.m117134i(bLiveVoiceCallSummary, view);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m117137n() {
        if (this.f92115j == null) {
            this.f92115j = new byr(this.f92114i, m117132d(act().inflater(), null));
            this.f92106a.setOnClickListener(new View.OnClickListener() { // from class: l.blk0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f76195a.m117130j(view);
                }
            });
            this.f92112g.setOnClickListener(new View.OnClickListener() { // from class: l.clk0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f81428a.m117131k(view);
                }
            });
        }
        this.f92113h.removeAllViews();
        this.f92115j.show();
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
