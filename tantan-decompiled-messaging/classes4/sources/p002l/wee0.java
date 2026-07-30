package p002l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.appcompat.app.a;
import com.facebook.drawee.generic.RoundingParams;
import com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveGiftBubbleConfig;
import com.p1.mobile.putong.live.base.data.BLiveGiftBubblePopupButton;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import l.bgv;
import l.c4g0;
import l.d30;
import l.e30;
import l.ffw;
import l.fld0;
import l.hxs;
import l.jo0;
import l.mkd0;
import l.t100;
import l.xdl0;
import l.ypv;
import rx.c;
import v.VButton;
import v.VDraweeView;
import v.VLinear;
import v.VRadioButton;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wee0 extends LiveMenuDialogHolder<pfe0> {

    /* JADX INFO: renamed from: k */
    public VLinear f21668k;

    /* JADX INFO: renamed from: l */
    public View f21669l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f21670m;

    /* JADX INFO: renamed from: n */
    public VButton f21671n;

    /* JADX INFO: renamed from: o */
    public VText f21672o;

    /* JADX INFO: renamed from: p */
    public VText f21673p;

    /* JADX INFO: renamed from: q */
    public VRadioButton f21674q;

    /* JADX INFO: renamed from: r */
    public c4g0 f21675r;

    /* JADX INFO: renamed from: s */
    public pfe0 f21676s;

    public wee0(Act act, pfe0 pfe0Var) {
        super(t6c0.f19994r5, act, pfe0Var, j2g0.m15579e(true));
    }

    /* JADX INFO: renamed from: M */
    private void m24528M() {
        if (NullChecker.a(this.f21676s)) {
            this.f21676s.m20225u4();
        }
        a aVar = this.f3800c;
        if (aVar == null || !aVar.isShowing()) {
            return;
        }
        this.f3800c.dismiss();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo5210C0() {
        return this.f21668k.getContext();
    }

    /* JADX INFO: renamed from: K */
    public final void m24529K(View view) {
        xee0.m25899a(this, view);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m24531N(View view) {
        VRadioButton vRadioButton = this.f21674q;
        vRadioButton.setSelected(!vRadioButton.isSelected());
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m24532O(d30 d30Var, View view) {
        m24528M();
        d30Var.call();
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m24533P(BLiveGiftBubbleConfig bLiveGiftBubbleConfig, View view) {
        if (bLiveGiftBubbleConfig.blackClose) {
            m24528M();
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m24534Q(BLiveGiftBubbleConfig bLiveGiftBubbleConfig, DialogInterface dialogInterface) {
        if (this.f21674q.isSelected()) {
            fld0 fld0Var = fld0.f;
            HashSet hashSet = (HashSet) ((bgv) ypv.l(fld0Var)).p.get();
            hashSet.add(bLiveGiftBubbleConfig.type);
            ((bgv) ypv.l(fld0Var)).p.put(hashSet);
        }
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m24535R(Long l2) {
        m24528M();
    }

    /* JADX INFO: renamed from: S */
    public final void m24536S(BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        xdl0.M(this.f21674q, bLiveGiftBubbleConfig.remind.show);
        this.f21674q.setSelected(bLiveGiftBubbleConfig.remind.click);
        this.f21674q.setOnClickListener(new View.OnClickListener() { // from class: l.vee0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21097a.m24531N(view);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public void m24537T(final BLiveGiftBubbleConfig bLiveGiftBubbleConfig, pfe0 pfe0Var, final d30 d30Var) {
        this.f21676s = pfe0Var;
        m5211E();
        this.f21672o.setText(bLiveGiftBubbleConfig.title);
        this.f21673p.setText(bLiveGiftBubbleConfig.content);
        xdl0.M(this.f21671n, !TextUtils.isEmpty(bLiveGiftBubbleConfig.bubbleText));
        if (!TextUtils.isEmpty(bLiveGiftBubbleConfig.bubbleText)) {
            this.f21671n.setText(bLiveGiftBubbleConfig.bubbleText);
        }
        this.f21671n.setOnClickListener(new View.OnClickListener() { // from class: l.ree0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18483a.m24532O(d30Var, view);
            }
        });
        this.f21669l.setOnClickListener(new View.OnClickListener() { // from class: l.see0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18952a.m24533P(bLiveGiftBubbleConfig, view);
            }
        });
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.v(bLiveGiftBubbleConfig.isCircle);
        this.f21670m.getHierarchy().H(roundingParams);
        m24536S(bLiveGiftBubbleConfig);
        if (!TextUtils.isEmpty(bLiveGiftBubbleConfig.button.startColor) && !TextUtils.isEmpty(bLiveGiftBubbleConfig.button.endColor)) {
            float fD = t100.d(14.0f);
            float[] fArr = {fD, fD, fD, fD, fD, fD, fD, fD};
            BLiveGiftBubblePopupButton bLiveGiftBubblePopupButton = bLiveGiftBubbleConfig.button;
            this.f21671n.setBackground(xxj.m26165b(bLiveGiftBubblePopupButton.startColor, bLiveGiftBubblePopupButton.endColor, fArr));
        }
        this.f3800c.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.tee0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f20199a.m24534Q(bLiveGiftBubbleConfig, dialogInterface);
            }
        });
        hxs.t("context_single_room", this.f21670m, bLiveGiftBubbleConfig.iconUrl, t100.x);
        long j = bLiveGiftBubbleConfig.displayRules.displayDuration;
        if (j <= 0) {
            j = 10;
        }
        this.f21675r = c.timer(j, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.a()).subscribe(ffw.d(new e30() { // from class: l.uee0
            public final void call(Object obj) {
                this.f20600a.m24535R((Long) obj);
            }
        }));
    }

    @Nullable
    public Act act() {
        return this.f21676s.act();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    public void destroy() {
        mkd0.z(this.f21675r);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo5214m(View view) {
        m24529K(view);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo5212i1(pfe0 pfe0Var) {
    }
}
