package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceBonusGifts;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCallSummary;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class kuk0 implements iam<nrk0> {

    /* JADX INFO: renamed from: a */
    public View f128876a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f128877b;

    /* JADX INFO: renamed from: c */
    public VText f128878c;

    /* JADX INFO: renamed from: d */
    public VText f128879d;

    /* JADX INFO: renamed from: e */
    public VText f128880e;

    /* JADX INFO: renamed from: f */
    public VText f128881f;

    /* JADX INFO: renamed from: g */
    public VText f128882g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f128883h;

    /* JADX INFO: renamed from: i */
    public nrk0 f128884i;

    /* JADX INFO: renamed from: j */
    public DialogC12774a f128885j;

    /* JADX INFO: renamed from: f */
    private void m151549f() {
        ynp0.m216937n(this.f128885j);
        this.f128877b.stopAnimation(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m151550j(View view) {
        m151549f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m151551k(View view) {
        m151549f();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f128884i.act();
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f128884i.act();
    }

    /* JADX INFO: renamed from: d */
    public View m151552d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return luk0.m155943b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(nrk0 nrk0Var) {
        this.f128884i = nrk0Var;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m151554i(BLiveVoiceCallSummary bLiveVoiceCallSummary, View view) {
        this.f128884i.m164500S3(bLiveVoiceCallSummary.voiceCallId, bLiveVoiceCallSummary.bonusGifts);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public boolean isShowing() {
        return ynp0.m216949z(this.f128885j);
    }

    /* JADX INFO: renamed from: l */
    public void m151555l() {
        bnl0.m105524M(this.f128877b, false);
    }

    /* JADX INFO: renamed from: m */
    public void m151556m(final BLiveVoiceCallSummary bLiveVoiceCallSummary) {
        nsh0.m164608j("[voice][call]", "call summary duration " + bLiveVoiceCallSummary.duration);
        this.f128878c.setText(getContext().getString(R$string.f48226m1));
        this.f128879d.setText(tzi0.m193668f("", ((double) bLiveVoiceCallSummary.duration) * 1000.0d));
        this.f128880e.setText(getContext().getString(R$string.f47815T0));
        this.f128881f.setText(bLiveVoiceCallSummary.newFollowCount + "");
        BLiveVoiceBonusGifts bLiveVoiceBonusGifts = bLiveVoiceCallSummary.bonusGifts;
        if (bLiveVoiceBonusGifts == null || jyb.m147479J(bLiveVoiceBonusGifts.giftItems)) {
            bnl0.m105524M(this.f128877b, false);
            return;
        }
        bnl0.m105524M(this.f128877b, true);
        this.f128877b.m69683j("https://auto.tancdn.com/v1/raw/574b190b-2eb2-4226-a8e1-51cded992fe811.so", -1);
        bnl0.m105509E0(this.f128877b, new View.OnClickListener() { // from class: l.juk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122724a.m151554i(bLiveVoiceCallSummary, view);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m151557n() {
        if (this.f128885j == null) {
            this.f128885j = new c0s(this.f128884i, m151552d(act().inflater(), null));
            this.f128876a.setOnClickListener(new View.OnClickListener() { // from class: l.huk0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f111677a.m151550j(view);
                }
            });
            this.f128882g.setOnClickListener(new View.OnClickListener() { // from class: l.iuk0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f116954a.m151551k(view);
                }
            });
        }
        this.f128883h.removeAllViews();
        this.f128885j.show();
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
