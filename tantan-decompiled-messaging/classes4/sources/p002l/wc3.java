package p002l;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.app.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.C0200a;
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
import l.kvc0;
import l.mep0;
import l.mkd0;
import l.t100;
import l.xdl0;
import l.ypv;
import l.zb2;
import rx.c;
import v.VButton;
import v.VDraweeView;
import v.VImage;
import v.VRadioButton;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wc3 {

    /* JADX INFO: renamed from: a */
    public View f21614a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f21615b;

    /* JADX INFO: renamed from: c */
    public VText f21616c;

    /* JADX INFO: renamed from: d */
    public VImage f21617d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f21618e;

    /* JADX INFO: renamed from: f */
    public VButton f21619f;

    /* JADX INFO: renamed from: g */
    public VText f21620g;

    /* JADX INFO: renamed from: h */
    public VText f21621h;

    /* JADX INFO: renamed from: i */
    public VText f21622i;

    /* JADX INFO: renamed from: j */
    public VRadioButton f21623j;

    /* JADX INFO: renamed from: k */
    public c4g0 f21624k;

    /* JADX INFO: renamed from: l */
    public final pfe0 f21625l;

    /* JADX INFO: renamed from: m */
    public final C0200a f21626m;

    public wc3(pfe0 pfe0Var) {
        this.f21625l = pfe0Var;
        C0200a c0200a = new C0200a(pfe0Var, t6c0.f20053w, j2g0.m15579e(true));
        this.f21626m = c0200a;
        c0200a.m5144h0(new e30() { // from class: l.qc3
            public final void call(Object obj) {
                this.f17897a.m24476i((View) obj);
            }
        });
        c0200a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.rc3
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f18457a.m24478k(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m24476i(View view) {
        xc3.m25826a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final void m24477j() {
        if (NullChecker.a(this.f21625l)) {
            this.f21625l.m20225u4();
        }
        a aVar = this.f21626m;
        if (aVar == null || !aVar.isShowing()) {
            return;
        }
        this.f21626m.dismiss();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m24478k(DialogInterface dialogInterface) {
        mkd0.z(this.f21624k);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m24479l(View view) {
        VRadioButton vRadioButton = this.f21623j;
        vRadioButton.setSelected(!vRadioButton.isSelected());
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m24480m(BLiveGiftBubbleConfig bLiveGiftBubbleConfig, View view) {
        if (bLiveGiftBubbleConfig.blackClose) {
            m24477j();
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m24481n(BLiveGiftBubbleConfig bLiveGiftBubbleConfig, View view) {
        m24477j();
        this.f21625l.m20222s4(this.f21623j.isSelected(), bLiveGiftBubbleConfig.type, "close");
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m24482o(BLiveGiftBubbleConfig bLiveGiftBubbleConfig, d30 d30Var, View view) {
        m24477j();
        this.f21625l.m20222s4(this.f21623j.isSelected(), bLiveGiftBubbleConfig.type, "");
        d30Var.call();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m24483p(BLiveGiftBubbleConfig bLiveGiftBubbleConfig, DialogInterface dialogInterface) {
        if (this.f21623j.isSelected()) {
            fld0 fld0Var = fld0.f;
            HashSet hashSet = (HashSet) ((bgv) ypv.l(fld0Var)).p.get();
            hashSet.add(bLiveGiftBubbleConfig.type);
            ((bgv) ypv.l(fld0Var)).p.put(hashSet);
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m24484q(Long l2) {
        m24477j();
    }

    /* JADX INFO: renamed from: r */
    public final void m24485r(BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.v(bLiveGiftBubbleConfig.isCircle);
        this.f21618e.getHierarchy().H(roundingParams);
        boolean zIsEmpty = TextUtils.isEmpty(bLiveGiftBubbleConfig.iconUrl);
        VDraweeView vDraweeView = this.f21618e;
        if (zIsEmpty) {
            xdl0.M(vDraweeView, false);
        } else {
            xdl0.M(vDraweeView, true);
            hxs.s("context_single_room", this.f21618e, bLiveGiftBubbleConfig.iconUrl);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m24486s(BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        xdl0.M(this.f21623j, bLiveGiftBubbleConfig.remind.show);
        if (!TextUtils.isEmpty(bLiveGiftBubbleConfig.remind.textColor)) {
            this.f21623j.setTextColor(zb2.d(bLiveGiftBubbleConfig.remind.textColor));
        }
        this.f21623j.setSelected(bLiveGiftBubbleConfig.remind.click);
        this.f21623j.setOnClickListener(new View.OnClickListener() { // from class: l.vc3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21066a.m24479l(view);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final void m24487t(final BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        this.f21614a.setOnClickListener(new View.OnClickListener() { // from class: l.sc3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18916a.m24480m(bLiveGiftBubbleConfig, view);
            }
        });
        xdl0.M(this.f21617d, bLiveGiftBubbleConfig.showClose && (bLiveGiftBubbleConfig.isTitlePositionMiddle() || bLiveGiftBubbleConfig.isTitlePositionCenter()));
        this.f21617d.setOnClickListener(new View.OnClickListener() { // from class: l.tc3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20177a.m24481n(bLiveGiftBubbleConfig, view);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final void m24488u(BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        if (!TextUtils.isEmpty(bLiveGiftBubbleConfig.backgroundColor)) {
            this.f21615b.setBackgroundColor(zb2.d(bLiveGiftBubbleConfig.backgroundColor));
            mep0.c1(this.f21615b, 0, 0, 0, -t100.d(24.0f), t100.d(24.0f));
        }
        if (!TextUtils.isEmpty(bLiveGiftBubbleConfig.contentColor)) {
            this.f21621h.setTextColor(zb2.d(bLiveGiftBubbleConfig.contentColor));
        }
        this.f21621h.setText(bLiveGiftBubbleConfig.content);
    }

    /* JADX INFO: renamed from: v */
    public final void m24489v(final BLiveGiftBubbleConfig bLiveGiftBubbleConfig, final d30 d30Var) {
        xdl0.M(this.f21619f, !TextUtils.isEmpty(bLiveGiftBubbleConfig.bubbleText));
        if (!TextUtils.isEmpty(bLiveGiftBubbleConfig.button.textColor)) {
            this.f21619f.setTextColor(zb2.d(bLiveGiftBubbleConfig.button.textColor));
        }
        this.f21619f.setText(bLiveGiftBubbleConfig.bubbleText);
        this.f21619f.setOnClickListener(new View.OnClickListener() { // from class: l.uc3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20580a.m24482o(bLiveGiftBubbleConfig, d30Var, view);
            }
        });
        if (TextUtils.isEmpty(bLiveGiftBubbleConfig.button.startColor) || TextUtils.isEmpty(bLiveGiftBubbleConfig.button.endColor)) {
            return;
        }
        float fD = t100.d(14.0f);
        BLiveGiftBubblePopupButton bLiveGiftBubblePopupButton = bLiveGiftBubbleConfig.button;
        this.f21619f.setBackground(xxj.m26165b(bLiveGiftBubblePopupButton.startColor, bLiveGiftBubblePopupButton.endColor, new float[]{fD, fD, fD, fD, fD, fD, fD, fD}));
    }

    /* JADX INFO: renamed from: w */
    public final void m24490w(BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        if (bLiveGiftBubbleConfig.isTitlePositionMiddle()) {
            xdl0.M(this.f21616c, true);
            xdl0.M(this.f21620g, false);
            xdl0.M(this.f21622i, false);
            this.f21621h.setTextColor(-1);
            this.f21616c.setText(bLiveGiftBubbleConfig.title);
            if (TextUtils.isEmpty(bLiveGiftBubbleConfig.header.textColor)) {
                return;
            }
            this.f21616c.setTextColor(zb2.d(bLiveGiftBubbleConfig.header.textColor));
            return;
        }
        boolean zIsTitlePositionCenter = bLiveGiftBubbleConfig.isTitlePositionCenter();
        VText vText = this.f21616c;
        if (!zIsTitlePositionCenter) {
            xdl0.M(vText, false);
            xdl0.M(this.f21620g, true);
            xdl0.M(this.f21622i, false);
            this.f21621h.setTextColor(kvc0.a(h1c0.f11809n1));
            this.f21620g.setText(bLiveGiftBubbleConfig.title);
            if (TextUtils.isEmpty(bLiveGiftBubbleConfig.header.textColor)) {
                return;
            }
            this.f21620g.setTextColor(zb2.d(bLiveGiftBubbleConfig.header.textColor));
            return;
        }
        xdl0.M(vText, true);
        this.f21616c.setText(bLiveGiftBubbleConfig.title);
        xdl0.M(this.f21622i, TextUtils.isEmpty(bLiveGiftBubbleConfig.contentDesc));
        boolean zIsEmpty = TextUtils.isEmpty(bLiveGiftBubbleConfig.contentDesc);
        VText vText2 = this.f21620g;
        if (zIsEmpty) {
            vText2.setText("");
            this.f21621h.setText("");
            this.f21622i.setText(bLiveGiftBubbleConfig.content);
        } else {
            vText2.setText(bLiveGiftBubbleConfig.content);
            this.f21621h.setText(bLiveGiftBubbleConfig.contentDesc);
            this.f21622i.setText("");
        }
        if (TextUtils.isEmpty(bLiveGiftBubbleConfig.header.textColor)) {
            return;
        }
        this.f21616c.setTextColor(zb2.d(bLiveGiftBubbleConfig.header.textColor));
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: x */
    public C0200a m24491x(final BLiveGiftBubbleConfig bLiveGiftBubbleConfig, d30 d30Var) {
        this.f21626m.show();
        this.f21626m.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.oc3
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f16521a.m24483p(bLiveGiftBubbleConfig, dialogInterface);
            }
        });
        m24488u(bLiveGiftBubbleConfig);
        m24487t(bLiveGiftBubbleConfig);
        m24490w(bLiveGiftBubbleConfig);
        m24489v(bLiveGiftBubbleConfig, d30Var);
        m24486s(bLiveGiftBubbleConfig);
        m24485r(bLiveGiftBubbleConfig);
        this.f21625l.m20224t4(this.f21623j.isSelected(), bLiveGiftBubbleConfig.type);
        long j = bLiveGiftBubbleConfig.displayRules.displayDuration;
        if (j <= 0) {
            j = 10;
        }
        this.f21624k = c.timer(j, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.a()).subscribe(ffw.d(new e30() { // from class: l.pc3
            public final void call(Object obj) {
                this.f17185a.m24484q((Long) obj);
            }
        }));
        return this.f21626m;
    }
}
