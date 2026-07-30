package p153l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubbleConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupButton;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VRadioButton;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class bne0 extends LiveMenuDialogHolder<une0> {

    /* JADX INFO: renamed from: k */
    public VLinear f77462k;

    /* JADX INFO: renamed from: l */
    public View f77463l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f77464m;

    /* JADX INFO: renamed from: n */
    public VButton f77465n;

    /* JADX INFO: renamed from: o */
    public VText f77466o;

    /* JADX INFO: renamed from: p */
    public VText f77467p;

    /* JADX INFO: renamed from: q */
    public VRadioButton f77468q;

    /* JADX INFO: renamed from: r */
    public kcg0 f77469r;

    /* JADX INFO: renamed from: s */
    public une0 f77470s;

    public bne0(Act act, une0 une0Var) {
        super(yec0.f199230r5, act, une0Var, qag0.m175924e(true));
    }

    /* JADX INFO: renamed from: M */
    private void m105380M() {
        if (NullChecker.m82486a(this.f77470s)) {
            this.f77470s.m196863u4();
        }
        DialogC12774a dialogC12774a = this.f48606c;
        if (dialogC12774a == null || !dialogC12774a.isShowing()) {
            return;
        }
        this.f48606c.dismiss();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f77462k.getContext();
    }

    /* JADX INFO: renamed from: K */
    public final void m105381K(View view) {
        cne0.m111498a(this, view);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m105383N(View view) {
        VRadioButton vRadioButton = this.f77468q;
        vRadioButton.setSelected(!vRadioButton.isSelected());
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m105384O(x20 x20Var, View view) {
        m105380M();
        x20Var.call();
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m105385P(BLiveGiftBubbleConfig bLiveGiftBubbleConfig, View view) {
        if (bLiveGiftBubbleConfig.blackClose) {
            m105380M();
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m105386Q(BLiveGiftBubbleConfig bLiveGiftBubbleConfig, DialogInterface dialogInterface) {
        if (this.f77468q.isSelected()) {
            htd0<civ> htd0Var = htd0.f111524f;
            HashSet<String> hashSet = ((civ) zrv.m221194l(htd0Var)).f82009p.get();
            hashSet.add(bLiveGiftBubbleConfig.type);
            ((civ) zrv.m221194l(htd0Var)).f82009p.put(hashSet);
        }
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m105387R(Long l2) {
        m105380M();
    }

    /* JADX INFO: renamed from: S */
    public final void m105388S(BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        bnl0.m105524M(this.f77468q, bLiveGiftBubbleConfig.remind.show);
        this.f77468q.setSelected(bLiveGiftBubbleConfig.remind.click);
        this.f77468q.setOnClickListener(new View.OnClickListener() { // from class: l.ane0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f72345a.m105383N(view);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public void m105389T(final BLiveGiftBubbleConfig bLiveGiftBubbleConfig, une0 une0Var, final x20 x20Var) {
        this.f77470s = une0Var;
        m73017E();
        this.f77466o.setText(bLiveGiftBubbleConfig.title);
        this.f77467p.setText(bLiveGiftBubbleConfig.content);
        bnl0.m105524M(this.f77465n, !TextUtils.isEmpty(bLiveGiftBubbleConfig.bubbleText));
        if (!TextUtils.isEmpty(bLiveGiftBubbleConfig.bubbleText)) {
            this.f77465n.setText(bLiveGiftBubbleConfig.bubbleText);
        }
        this.f77465n.setOnClickListener(new View.OnClickListener() { // from class: l.wme0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f189792a.m105384O(x20Var, view);
            }
        });
        this.f77463l.setOnClickListener(new View.OnClickListener() { // from class: l.xme0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195078a.m105385P(bLiveGiftBubbleConfig, view);
            }
        });
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.m8322v(bLiveGiftBubbleConfig.isCircle);
        this.f77464m.getHierarchy().m207045H(roundingParams);
        m105388S(bLiveGiftBubbleConfig);
        if (!TextUtils.isEmpty(bLiveGiftBubbleConfig.button.startColor) && !TextUtils.isEmpty(bLiveGiftBubbleConfig.button.endColor)) {
            float fM175859d = qa00.m175859d(14.0f);
            float[] fArr = {fM175859d, fM175859d, fM175859d, fM175859d, fM175859d, fM175859d, fM175859d, fM175859d};
            BLiveGiftBubblePopupButton bLiveGiftBubblePopupButton = bLiveGiftBubbleConfig.button;
            this.f77465n.setBackground(n0k.m161005b(bLiveGiftBubblePopupButton.startColor, bLiveGiftBubblePopupButton.endColor, fArr));
        }
        this.f48606c.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.yme0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f200657a.m105386Q(bLiveGiftBubbleConfig, dialogInterface);
            }
        });
        izs.m142869t("context_single_room", this.f77464m, bLiveGiftBubbleConfig.iconUrl, qa00.f156337x);
        long j = bLiveGiftBubbleConfig.displayRules.displayDuration;
        if (j <= 0) {
            j = 10;
        }
        this.f77469r = C22421c.timer(j, TimeUnit.SECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.zme0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205064a.m105387R((Long) obj);
            }
        }));
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f77470s.act();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public void destroy() {
        psd0.m173633z(this.f77469r);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        m105381K(view);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(une0 une0Var) {
    }
}
