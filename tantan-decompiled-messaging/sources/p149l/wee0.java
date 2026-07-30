package p149l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubbleConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupButton;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VRadioButton;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class wee0 extends LiveMenuDialogHolder<pfe0> {

    /* JADX INFO: renamed from: k */
    public VLinear f185928k;

    /* JADX INFO: renamed from: l */
    public View f185929l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f185930m;

    /* JADX INFO: renamed from: n */
    public VButton f185931n;

    /* JADX INFO: renamed from: o */
    public VText f185932o;

    /* JADX INFO: renamed from: p */
    public VText f185933p;

    /* JADX INFO: renamed from: q */
    public VRadioButton f185934q;

    /* JADX INFO: renamed from: r */
    public c4g0 f185935r;

    /* JADX INFO: renamed from: s */
    public pfe0 f185936s;

    public wee0(Act act, pfe0 pfe0Var) {
        super(t6c0.f168498r5, act, pfe0Var, j2g0.m139458e(true));
    }

    /* JADX INFO: renamed from: M */
    private void m202895M() {
        if (NullChecker.m81303a(this.f185936s)) {
            this.f185936s.m168637u4();
        }
        DialogC12611a dialogC12611a = this.f47758c;
        if (dialogC12611a == null || !dialogC12611a.isShowing()) {
            return;
        }
        this.f47758c.dismiss();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f185928k.getContext();
    }

    /* JADX INFO: renamed from: K */
    public final void m202896K(View view) {
        xee0.m208578a(this, view);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m202898N(View view) {
        VRadioButton vRadioButton = this.f185934q;
        vRadioButton.setSelected(!vRadioButton.isSelected());
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m202899O(d30 d30Var, View view) {
        m202895M();
        d30Var.call();
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m202900P(BLiveGiftBubbleConfig bLiveGiftBubbleConfig, View view) {
        if (bLiveGiftBubbleConfig.blackClose) {
            m202895M();
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m202901Q(BLiveGiftBubbleConfig bLiveGiftBubbleConfig, DialogInterface dialogInterface) {
        if (this.f185934q.isSelected()) {
            fld0<bgv> fld0Var = fld0.f98151f;
            HashSet<String> hashSet = ((bgv) ypv.m215673l(fld0Var)).f75516p.get();
            hashSet.add(bLiveGiftBubbleConfig.type);
            ((bgv) ypv.m215673l(fld0Var)).f75516p.put(hashSet);
        }
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m202902R(Long l2) {
        m202895M();
    }

    /* JADX INFO: renamed from: S */
    public final void m202903S(BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        xdl0.m208344M(this.f185934q, bLiveGiftBubbleConfig.remind.show);
        this.f185934q.setSelected(bLiveGiftBubbleConfig.remind.click);
        this.f185934q.setOnClickListener(new View.OnClickListener() { // from class: l.vee0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181186a.m202898N(view);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public void m202904T(final BLiveGiftBubbleConfig bLiveGiftBubbleConfig, pfe0 pfe0Var, final d30 d30Var) {
        this.f185936s = pfe0Var;
        m71834E();
        this.f185932o.setText(bLiveGiftBubbleConfig.title);
        this.f185933p.setText(bLiveGiftBubbleConfig.content);
        xdl0.m208344M(this.f185931n, !TextUtils.isEmpty(bLiveGiftBubbleConfig.bubbleText));
        if (!TextUtils.isEmpty(bLiveGiftBubbleConfig.bubbleText)) {
            this.f185931n.setText(bLiveGiftBubbleConfig.bubbleText);
        }
        this.f185931n.setOnClickListener(new View.OnClickListener() { // from class: l.ree0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f159050a.m202899O(d30Var, view);
            }
        });
        this.f185929l.setOnClickListener(new View.OnClickListener() { // from class: l.see0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f164000a.m202900P(bLiveGiftBubbleConfig, view);
            }
        });
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.m8268v(bLiveGiftBubbleConfig.isCircle);
        this.f185930m.getHierarchy().m112053H(roundingParams);
        m202903S(bLiveGiftBubbleConfig);
        if (!TextUtils.isEmpty(bLiveGiftBubbleConfig.button.startColor) && !TextUtils.isEmpty(bLiveGiftBubbleConfig.button.endColor)) {
            float fM186890d = t100.m186890d(14.0f);
            float[] fArr = {fM186890d, fM186890d, fM186890d, fM186890d, fM186890d, fM186890d, fM186890d, fM186890d};
            BLiveGiftBubblePopupButton bLiveGiftBubblePopupButton = bLiveGiftBubbleConfig.button;
            this.f185931n.setBackground(xxj.m211501b(bLiveGiftBubblePopupButton.startColor, bLiveGiftBubblePopupButton.endColor, fArr));
        }
        this.f47758c.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.tee0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f169833a.m202901Q(bLiveGiftBubbleConfig, dialogInterface);
            }
        });
        hxs.m133407t("context_single_room", this.f185930m, bLiveGiftBubbleConfig.iconUrl, t100.f167275x);
        long j = bLiveGiftBubbleConfig.displayRules.displayDuration;
        if (j <= 0) {
            j = 10;
        }
        this.f185935r = C22306c.timer(j, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.uee0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176032a.m202902R((Long) obj);
            }
        }));
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f185936s.act();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public void destroy() {
        mkd0.m154992z(this.f185935r);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        m202896K(view);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(pfe0 pfe0Var) {
    }
}
