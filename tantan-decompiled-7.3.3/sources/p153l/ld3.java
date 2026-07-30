package p153l;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubbleConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupButton;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VRadioButton;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ld3 {

    /* JADX INFO: renamed from: a */
    public View f131400a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f131401b;

    /* JADX INFO: renamed from: c */
    public VText f131402c;

    /* JADX INFO: renamed from: d */
    public VImage f131403d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f131404e;

    /* JADX INFO: renamed from: f */
    public VButton f131405f;

    /* JADX INFO: renamed from: g */
    public VText f131406g;

    /* JADX INFO: renamed from: h */
    public VText f131407h;

    /* JADX INFO: renamed from: i */
    public VText f131408i;

    /* JADX INFO: renamed from: j */
    public VRadioButton f131409j;

    /* JADX INFO: renamed from: k */
    public kcg0 f131410k;

    /* JADX INFO: renamed from: l */
    public final une0 f131411l;

    /* JADX INFO: renamed from: m */
    public final DialogC12774a f131412m;

    public ld3(une0 une0Var) {
        this.f131411l = une0Var;
        DialogC12774a dialogC12774a = new DialogC12774a(une0Var, yec0.f199289w, qag0.m175924e(true));
        this.f131412m = dialogC12774a;
        dialogC12774a.m72959h0(new y20() { // from class: l.fd3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98317a.m153709i((View) obj);
            }
        });
        dialogC12774a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.gd3
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f103623a.m153711k(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m153709i(View view) {
        md3.m157954a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final void m153710j() {
        if (NullChecker.m82486a(this.f131411l)) {
            this.f131411l.m196863u4();
        }
        DialogC12774a dialogC12774a = this.f131412m;
        if (dialogC12774a == null || !dialogC12774a.isShowing()) {
            return;
        }
        this.f131412m.dismiss();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m153711k(DialogInterface dialogInterface) {
        psd0.m173633z(this.f131410k);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m153712l(View view) {
        VRadioButton vRadioButton = this.f131409j;
        vRadioButton.setSelected(!vRadioButton.isSelected());
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m153713m(BLiveGiftBubbleConfig bLiveGiftBubbleConfig, View view) {
        if (bLiveGiftBubbleConfig.blackClose) {
            m153710j();
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m153714n(BLiveGiftBubbleConfig bLiveGiftBubbleConfig, View view) {
        m153710j();
        this.f131411l.m196861s4(this.f131409j.isSelected(), bLiveGiftBubbleConfig.type, "close");
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m153715o(BLiveGiftBubbleConfig bLiveGiftBubbleConfig, x20 x20Var, View view) {
        m153710j();
        this.f131411l.m196861s4(this.f131409j.isSelected(), bLiveGiftBubbleConfig.type, "");
        x20Var.call();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m153716p(BLiveGiftBubbleConfig bLiveGiftBubbleConfig, DialogInterface dialogInterface) {
        if (this.f131409j.isSelected()) {
            htd0<civ> htd0Var = htd0.f111524f;
            HashSet<String> hashSet = ((civ) zrv.m221194l(htd0Var)).f82009p.get();
            hashSet.add(bLiveGiftBubbleConfig.type);
            ((civ) zrv.m221194l(htd0Var)).f82009p.put(hashSet);
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m153717q(Long l2) {
        m153710j();
    }

    /* JADX INFO: renamed from: r */
    public final void m153718r(BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.m8322v(bLiveGiftBubbleConfig.isCircle);
        this.f131404e.getHierarchy().m207045H(roundingParams);
        boolean zIsEmpty = TextUtils.isEmpty(bLiveGiftBubbleConfig.iconUrl);
        VDraweeView vDraweeView = this.f131404e;
        if (zIsEmpty) {
            bnl0.m105524M(vDraweeView, false);
        } else {
            bnl0.m105524M(vDraweeView, true);
            izs.m142868s("context_single_room", this.f131404e, bLiveGiftBubbleConfig.iconUrl);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m153719s(BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        bnl0.m105524M(this.f131409j, bLiveGiftBubbleConfig.remind.show);
        if (!TextUtils.isEmpty(bLiveGiftBubbleConfig.remind.textColor)) {
            this.f131409j.setTextColor(gc2.m129825d(bLiveGiftBubbleConfig.remind.textColor));
        }
        this.f131409j.setSelected(bLiveGiftBubbleConfig.remind.click);
        this.f131409j.setOnClickListener(new View.OnClickListener() { // from class: l.kd3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f125147a.m153712l(view);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final void m153720t(final BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        this.f131400a.setOnClickListener(new View.OnClickListener() { // from class: l.hd3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108781a.m153713m(bLiveGiftBubbleConfig, view);
            }
        });
        bnl0.m105524M(this.f131403d, bLiveGiftBubbleConfig.showClose && (bLiveGiftBubbleConfig.isTitlePositionMiddle() || bLiveGiftBubbleConfig.isTitlePositionCenter()));
        this.f131403d.setOnClickListener(new View.OnClickListener() { // from class: l.id3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114468a.m153714n(bLiveGiftBubbleConfig, view);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final void m153721u(BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        if (!TextUtils.isEmpty(bLiveGiftBubbleConfig.backgroundColor)) {
            this.f131401b.setBackgroundColor(gc2.m129825d(bLiveGiftBubbleConfig.backgroundColor));
            qnp0.m177260c1(this.f131401b, 0, 0, 0, -qa00.m175859d(24.0f), qa00.m175859d(24.0f));
        }
        if (!TextUtils.isEmpty(bLiveGiftBubbleConfig.contentColor)) {
            this.f131407h.setTextColor(gc2.m129825d(bLiveGiftBubbleConfig.contentColor));
        }
        this.f131407h.setText(bLiveGiftBubbleConfig.content);
    }

    /* JADX INFO: renamed from: v */
    public final void m153722v(final BLiveGiftBubbleConfig bLiveGiftBubbleConfig, final x20 x20Var) {
        bnl0.m105524M(this.f131405f, !TextUtils.isEmpty(bLiveGiftBubbleConfig.bubbleText));
        if (!TextUtils.isEmpty(bLiveGiftBubbleConfig.button.textColor)) {
            this.f131405f.setTextColor(gc2.m129825d(bLiveGiftBubbleConfig.button.textColor));
        }
        this.f131405f.setText(bLiveGiftBubbleConfig.bubbleText);
        this.f131405f.setOnClickListener(new View.OnClickListener() { // from class: l.jd3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120107a.m153715o(bLiveGiftBubbleConfig, x20Var, view);
            }
        });
        if (TextUtils.isEmpty(bLiveGiftBubbleConfig.button.startColor) || TextUtils.isEmpty(bLiveGiftBubbleConfig.button.endColor)) {
            return;
        }
        float fM175859d = qa00.m175859d(14.0f);
        BLiveGiftBubblePopupButton bLiveGiftBubblePopupButton = bLiveGiftBubbleConfig.button;
        this.f131405f.setBackground(n0k.m161005b(bLiveGiftBubblePopupButton.startColor, bLiveGiftBubblePopupButton.endColor, new float[]{fM175859d, fM175859d, fM175859d, fM175859d, fM175859d, fM175859d, fM175859d, fM175859d}));
    }

    /* JADX INFO: renamed from: w */
    public final void m153723w(BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        if (bLiveGiftBubbleConfig.isTitlePositionMiddle()) {
            bnl0.m105524M(this.f131402c, true);
            bnl0.m105524M(this.f131406g, false);
            bnl0.m105524M(this.f131408i, false);
            this.f131407h.setTextColor(-1);
            this.f131402c.setText(bLiveGiftBubbleConfig.title);
            if (TextUtils.isEmpty(bLiveGiftBubbleConfig.header.textColor)) {
                return;
            }
            this.f131402c.setTextColor(gc2.m129825d(bLiveGiftBubbleConfig.header.textColor));
            return;
        }
        boolean zIsTitlePositionCenter = bLiveGiftBubbleConfig.isTitlePositionCenter();
        VText vText = this.f131402c;
        if (!zIsTitlePositionCenter) {
            bnl0.m105524M(vText, false);
            bnl0.m105524M(this.f131406g, true);
            bnl0.m105524M(this.f131408i, false);
            this.f131407h.setTextColor(n3d0.m161277a(n9c0.f140850n1));
            this.f131406g.setText(bLiveGiftBubbleConfig.title);
            if (TextUtils.isEmpty(bLiveGiftBubbleConfig.header.textColor)) {
                return;
            }
            this.f131406g.setTextColor(gc2.m129825d(bLiveGiftBubbleConfig.header.textColor));
            return;
        }
        bnl0.m105524M(vText, true);
        this.f131402c.setText(bLiveGiftBubbleConfig.title);
        bnl0.m105524M(this.f131408i, TextUtils.isEmpty(bLiveGiftBubbleConfig.contentDesc));
        boolean zIsEmpty = TextUtils.isEmpty(bLiveGiftBubbleConfig.contentDesc);
        VText vText2 = this.f131406g;
        if (zIsEmpty) {
            vText2.setText("");
            this.f131407h.setText("");
            this.f131408i.setText(bLiveGiftBubbleConfig.content);
        } else {
            vText2.setText(bLiveGiftBubbleConfig.content);
            this.f131407h.setText(bLiveGiftBubbleConfig.contentDesc);
            this.f131408i.setText("");
        }
        if (TextUtils.isEmpty(bLiveGiftBubbleConfig.header.textColor)) {
            return;
        }
        this.f131402c.setTextColor(gc2.m129825d(bLiveGiftBubbleConfig.header.textColor));
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: x */
    public DialogC12774a m153724x(final BLiveGiftBubbleConfig bLiveGiftBubbleConfig, x20 x20Var) {
        this.f131412m.show();
        this.f131412m.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.dd3
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f87853a.m153716p(bLiveGiftBubbleConfig, dialogInterface);
            }
        });
        m153721u(bLiveGiftBubbleConfig);
        m153720t(bLiveGiftBubbleConfig);
        m153723w(bLiveGiftBubbleConfig);
        m153722v(bLiveGiftBubbleConfig, x20Var);
        m153719s(bLiveGiftBubbleConfig);
        m153718r(bLiveGiftBubbleConfig);
        this.f131411l.m196862t4(this.f131409j.isSelected(), bLiveGiftBubbleConfig.type);
        long j = bLiveGiftBubbleConfig.displayRules.displayDuration;
        if (j <= 0) {
            j = 10;
        }
        this.f131410k = C22421c.timer(j, TimeUnit.SECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.ed3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f93137a.m153717q((Long) obj);
            }
        }));
        return this.f131412m;
    }
}
